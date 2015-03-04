package controleur;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import metier.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

import vue.AddMatchParticipants;
import vue.AddShowParticipants;
import vue.AddStudent;

public class MainControler implements ActionListener{

	public static final String ACTION_ADD_STUDENT ="ADD";
	public static final String ACTION_ADD_SHOW_PARTICIPANT = "ADDWO";
	public static final String ACTION_GO_HOMEPAGE = "GOM";
	public static final String GO_SHOW = "GOS";
	public static final String ADD_SHOW = "ADDSHOW";
	public static final String ADD_MATCH = "ADDM";
	public static final String CLOSE="BYE BYE";
	public static final String ACTION_ADD_MATCH_PARTICIPANTS = "ADDMP";
	public static final String GO_MATCH = "GOM";
	
	private JPanel view;
	private AddMatchParticipants m;
	private AddShowParticipants s;
	private AddStudent t;
	private ArrayList<Dancer> dancers;
	private ArrayList<TennisPlayer> tennisPlayers;
	Show show;
	Match match;
	
	
	public MainControler() {
		// TODO Auto-generated constructor stub
		show=null;
		dancers = new ArrayList<Dancer>();
		tennisPlayers = new ArrayList<TennisPlayer>();
		Robot.getInstance().setSpeciality("Satan Miracle Special Ultra Super Mega Backhand !!!!");
		Robot.getInstance().setSurname("ROBOT");
		tennisPlayers.add(Robot.getInstance());
		
		// DOIS-JE CREER LE ROBOT ??
	}
	
	public void setView (JPanel panel)
	{
		view = panel;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		String[] splittedParts;
		if (event.getActionCommand() == ACTION_ADD_STUDENT)
		{
			
			t = (AddStudent) view;
			String studentInfo = t.getInfo(";");
			splittedParts = studentInfo.split(";");
			String name = splittedParts[0],surname = splittedParts[1],nickname = splittedParts[2],speciality = splittedParts[4];
			int age = Integer.parseInt( splittedParts[3]);
			//System.out.println(name + " " + surname + " " + nickname + " " + speciality + " " + age);
			if(speciality.equals("Dance"))
				dancers.add(new Dancer(name,surname,"BABEDOSA ACADEMY",age,"",nickname));
			else
			{
				TennisPlayer tp = new TennisPlayer(name,surname,"BABEDOSA ACADEMY",age,nickname,"Tennis");
				tp.setPoints(0);
				tennisPlayers.add(tp);
			}
			t.StudentAdded();
		}
		else if(event.getActionCommand() == GO_MATCH) 
		{
			JFrame frame = AddStudent.getFrame();
			frame.getContentPane().removeAll();
			m = new AddMatchParticipants(this);
			frame.getContentPane().add(m);
			for(int i = 0 ; i < tennisPlayers.size() ; i++)
				m.addIntoComboBoxes(tennisPlayers.get(i).getSurname());
			
		}
		else if (event.getActionCommand()== GO_SHOW)
		{
			JFrame frame = AddStudent.getFrame();
			frame.getContentPane().removeAll();
			s = new AddShowParticipants(this);
			frame.getContentPane().add(s);
			for ( int i = 0 ; i < dancers.size() ; i++)
				s.addIntoComboBox(dancers.get(i).getSurname());
			
		}
		else if (event.getActionCommand() ==ADD_SHOW)
		{
			String showInfo = s.getShowInfo(";");
			splittedParts = showInfo.split(";");
			show = new Show(splittedParts[0], splittedParts[1]);
			s.ShowSaved();
				
		}
		else if (event.getActionCommand() == ADD_MATCH)
		{
			DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
			match = new Match(Calendar.getInstance().getTime());
			m.MatchSaved();
		}
		else if (event.getActionCommand() == ACTION_ADD_SHOW_PARTICIPANT)
		{
			boolean found = false;
			int j = 0;
			String surname = s.getParticipant();

			do
			{
				found = (dancers.get(j).getSurname() == surname );
				j++;
			}
			while (!found && j < dancers.size());
			if(show!=null)
			{
				show.getDancers().add(dancers.get(j-1));
				s.DancerAdded(true);
			}
			else
				s.DancerAdded(false);
		}
		else if (event.getActionCommand() == ACTION_ADD_MATCH_PARTICIPANTS)
		{
			TennisPlayer tp1,tp2;
			boolean p1found = false , p2found = false;
			String info = m.getMatchInfo(";");
			String p1 = info.split(";")[0], p2 = info.split(";")[1];
			
			int j = 0;
			do
			{
				p1found = (tennisPlayers.get(j).getSurname() ==p1);
				j++;
			}
			while(j < tennisPlayers.size() && !p1found);
			tp1 = tennisPlayers.get(j-1);
			j = 0;
			
			do
			{
				p2found = (tennisPlayers.get(j).getSurname() ==p2);
				j++;
			}
			while(j < tennisPlayers.size() && !p2found);
			tp2 = tennisPlayers.get(j-1);
			if(match.CheckPoints(tp1, tp2))
			{
				m.PlayersAdded(true);
				if(p1 == "ROBOT" || p2 == "ROBOT")
					System.out.println(Robot.getInstance().getSpeciality());
			}
				
			else
				m.PlayersAdded(false);
		}
		else // close
		{
			 AddStudent.getFrame().setVisible(false);
			 AddStudent.getFrame().dispose();
		}
	}
}
		

package vue;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controleur.MainControler;

public class AddStudent extends JPanel{

	private JButton submit,goShow,goMatch;
	protected static JFrame GlobalFrame;
	private JLabel lblFirstName,lblName,lblNickname,lblAge,lblSpe,lblInfo;
	private JTextField firstName,name,nickname,age,spe;
	private JComboBox sports;
	
	
	
	public AddStudent(MainControler c)
	{
		
		c.setView(this);
		lblFirstName = new JLabel ("First name : ");
		lblName = new JLabel("Name : ");
		lblNickname = new JLabel("Nickname: ");
		lblAge = new JLabel ("Age :");
		lblSpe = new JLabel ("Speciality :");
		lblInfo = new JLabel();
		firstName = new JTextField(40);
		name = new JTextField(40);
		nickname = new JTextField(40);
		age = new JTextField(40);
		spe = new JTextField(40);
		name.setText("Safin");
		firstName.setText("Marat");
		age.setText("17");
		nickname.setText("The Ancient");
		sports = new JComboBox();
		submit = new JButton("Register");
		goMatch = new JButton("Create Match");
		goShow = new JButton("Create Show");
		goShow.addActionListener(c);
		goShow.setActionCommand(c.GO_SHOW);
		goShow.setVisible(false);
		goMatch.addActionListener(c);
		goMatch.setActionCommand(c.GO_MATCH);
		goMatch.setVisible(false);
		sports.addItem("Dance");
		sports.addItem("Tennis");
		add(lblName);
		add(name);
		add(lblFirstName);
		add(firstName);
		add(lblNickname);
		add(nickname);
		add(lblAge);
		add(age);
		add(lblSpe);
		add(sports);
		add(submit);
		add(lblInfo);
		add(goShow);
		add(goMatch);
		/*menu = new JButton("menu");
		menu.addActionListener(controler);
		menu.setActionCommand(controler.ACTION_GO_HOMEPAGE);
		add(menu);
		menu.setVisible(false);*/
		
		lblInfo.setVisible(false);
		GlobalFrame = new JFrame("BABEDOSA ACADEMY");
		GlobalFrame.add(this);
		//GlobalFrame.pack();
		GlobalFrame.setVisible(true);
		GlobalFrame.setResizable(true);
		GlobalFrame.setSize (480,430); //(largeur,hauteur)
		GlobalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GlobalFrame.repaint();
		submit.addActionListener(c);
		submit.setActionCommand(c.ACTION_ADD_STUDENT);
	}
	
	public static void main(String [] args)
	{
		
		
		MainControler controler = new MainControler();
		AddStudent main = new AddStudent(controler);
	}
	public String getInfo(String delimiter)
	{
		return name.getText() + delimiter + firstName.getText()+ delimiter+ nickname.getText()+delimiter + age.getText()+ delimiter+ (String)sports.getSelectedItem();
		
	}
	public void StudentAdded()
	{
		lblInfo.setText(nickname.getText() + " has been registered");
		lblInfo.setForeground(Color.GREEN);
		lblInfo.setVisible(true);
		if(sports.getSelectedItem().toString() == "Dance") 
			goShow.setVisible(true);
		else
			goMatch.setVisible(true);
		
	}
	public static JFrame getFrame()
	{
		return GlobalFrame;
	}
}



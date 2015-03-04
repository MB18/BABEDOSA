package vue;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controleur.MainControler;

public class AddMatch extends JPanel {

	private JLabel lblDate,lblInfo;
	private JTextField date;
	private JButton addMatch, addPlayers,exit;
	private JLabel lblNickname1,lblNickname2;
	private JComboBox player1, player2;
	
	
	
	
	public AddMatch(MainControler c) 
	{
		
		c.setView(this);
		lblDate = new JLabel ("Enter Date ( dd-mm-yyyy) ");
		lblNickname1 = new JLabel("Player 1: ");
		lblNickname2 = new JLabel("PLayer 2: ");
		lblInfo = new JLabel();
		date = new JTextField(20);
		player1 = new JComboBox();
		player2 = new JComboBox();
		addMatch = new JButton("Save Match");
		addPlayers = new JButton("Add Players");
		exit = new JButton("LEAVE");
		add(lblDate);
		add(date);
		add(addMatch);
		add(lblNickname1);
		add(player1);
		add(lblNickname2);
		add(player2);
		add(addPlayers);
		add(lblInfo);
		add(exit);
		lblNickname1.setVisible(false);
		lblNickname2.setVisible(false);
		addPlayers.setVisible(false);
		player1.setVisible(false);
		player2.setVisible(false);
		lblInfo.setVisible(false);
		addMatch.addActionListener(c);
		addMatch.setActionCommand(c.ADD_MATCH);
		addPlayers.addActionListener(c);
		addPlayers.setActionCommand(c.ACTION_ADD_MATCH_PARTICIPANTS);
		exit.addActionListener(c);
		exit.setActionCommand(c.CLOSE);
		AddStudent.GlobalFrame.add(this);
		AddStudent.GlobalFrame.setVisible(true);
		AddStudent.GlobalFrame.setResizable(false);
		AddStudent.GlobalFrame.pack();
		AddStudent.GlobalFrame.setSize (400,230); //(largeur,hauteur)
		AddStudent.GlobalFrame.repaint();	

	}
	
	public void MatchSaved()
	{
		lblInfo.setText("The match has been registered");
		lblInfo.setForeground(Color.GREEN);
		lblInfo.setVisible(true);
		lblNickname1.setVisible(true);
		lblNickname2.setVisible(true);
		player1.setVisible(true);
		player2.setVisible(true);
		addPlayers.setVisible(true);
		addMatch.setVisible(false);
	}
	
	public void PlayersAdded(boolean ok)
	{
		//System.out.println("players add " + (ok?"yes":"no"));
		lblInfo.setVisible(true);
		if(ok)
		{
			lblInfo.setText((String)player1.getSelectedItem() + " and " + (String)player2.getSelectedItem()  + " has been registerd for this match");
			lblInfo.setForeground(Color.GREEN);
			addPlayers.setVisible(false);
			
			player1.removeItem(player1.getSelectedIndex());
			player2.removeItem(player2.getSelectedIndex());
		}
		else
		{
			lblInfo.setText(" We can not accept this match");
			lblInfo.setForeground(Color.RED);
		}
	}
	
	public String getMatchInfo(String delimiter)
	{
		return player1.getSelectedItem().toString() + delimiter + player2.getSelectedItem().toString();
	}
	
	public void addIntoComboBoxes(String item)
	{
		player1.addItem(item);
		player2.addItem(item);
	}		
	public String getDate()
	{
		return date.getText();
	}

}





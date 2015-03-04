package vue;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controleur.MainControler;

public class AddShow extends JPanel {

	private MainControler controler;
	private JLabel lblName, lblPlace,lblInfo;
	private JTextField name,place;
	private JButton addShow, addDancer,exit;
	private JLabel lblNickname;
	private JComboBox nicknames;
	
	
	
	
	public AddShow(MainControler c) 
	{
		
		c.setView(this);
		lblName = new JLabel ("Enter Show Name : ");
		lblPlace = new JLabel("Enter Show Location : ");
		lblNickname = new JLabel("Dancers to Add: ");
		lblInfo = new JLabel();
		name = new JTextField(20);
		place = new JTextField(20);
		nicknames = new JComboBox();
		addShow = new JButton("Save show");
		addDancer = new JButton("Add Dancer");
		exit = new JButton("LEAVE");
		add(lblName);
		add(name);
		add(lblPlace);
		add(place);
		
		add(addShow);
		add(lblInfo);
		add(lblNickname);
		add(nicknames);
		add(addDancer);
		add(exit);
		lblNickname.setVisible(false);
		lblInfo.setVisible(false);
		addShow.addActionListener(c);
		addShow.setActionCommand(c.ADD_SHOW);
		addDancer.addActionListener(c);
		addDancer.setActionCommand(c.ACTION_ADD_SHOW_PARTICIPANT);
		exit.addActionListener(c);
		exit.setActionCommand(c.CLOSE);
		nicknames.setVisible(false);
		addDancer.setVisible(false);
		AddStudent.GlobalFrame.add(this);
		AddStudent.GlobalFrame.setVisible(true);
		AddStudent.GlobalFrame.setResizable(false);
		AddStudent.GlobalFrame.pack();
		AddStudent.GlobalFrame.setSize (280,430); //(largeur,hauteur)
		AddStudent.GlobalFrame.repaint();	
		controler = c;

	}
	
	public void ShowSaved()
	{
		lblInfo.setText(name.getText() + " has been registered");
		lblInfo.setForeground(Color.RED);
		lblInfo.setVisible(true);
		lblNickname.setVisible(true);
		nicknames.setVisible(true);
		addDancer.setVisible(true);
		addShow.setVisible(true);
	}
	
	public void DancerAdded(boolean ok)
	{
		if(ok)
		{
			lblInfo.setText((String)nicknames.getSelectedItem() + " has been added to this show");
			lblInfo.setForeground(Color.GREEN);
			nicknames.removeItemAt(nicknames.getSelectedIndex());
		}
		else
		{
			lblInfo.setText((String)nicknames.getSelectedItem() + " has not been added to this show");
			lblInfo.setForeground(Color.RED);
		}
	}
	
	public String getShowInfo(String delimiter)
	{
		return name.getText() + delimiter + place.getText();
	}
	
	public void addIntoComboBox(String item)
	{
		nicknames.addItem(item);
	}		
	public String getParticipant()
	{
		return (String) nicknames.getSelectedItem();
	}

}


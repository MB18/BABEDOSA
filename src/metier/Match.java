package metier;

import java.util.Date;

public class Match {

	private Date date;
	private String winner;
	private Tournament tournament;
	private TennisPlayer player1;
	private TennisPlayer player2;

	
	
	public Match(Date d, TennisPlayer player1, TennisPlayer player2, Tournament t){
		if (CheckPoints(player1,player2)) {
			date = d; 
			tournament = t;
			player1 = player1;
			player2 = player2;
			winner = null;
		}
		else 
		{
			System.out.println("No match possible");
		}
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getWinner() {
		return winner;
	}
	public void setWinner(String winner) {
		this.winner = winner;
	}
	public Tournament getTournament() {
		return tournament;
	}
	public void setTournament(Tournament tournament) {
		this.tournament = tournament;
	}
	public TennisPlayer getPlayer1() {
		return player1;
	}
	public void setPlayer1(TennisPlayer player1) {
		this.player1 = player1;
	}
	public TennisPlayer getPlayer2() {
		return player2;
	}
	public void setPlayer2(TennisPlayer player2) {
		this.player2 = player2;
	}
	
	// method to add a winner for the Match
	public void BeWinner(TennisPlayer player){
		winner = player.getName();

	}
	//A  VERIFIER 
	/*
    public boolean CheckPoints(TennisPlayer t1, TennisPlayer t2){	
        if ((player1.getPoints() > player2.getPoints()) & (player2.getPoints()/player1.getPoints() <= 1/3))
            	return false;  
 
        else if ((player1.getPoints() < player2.getPoints()) & (player1.getPoints()/player2.getPoints() <= 1/3))
            	return false;
        else 
        	return true;  
    }*/
	
	  public boolean CheckPoints(TennisPlayer t1, TennisPlayer t2){	
	        if (t1.getPoints()/t2.getPoints() <= 1/3)
	            	return false;  
	        else 
	        	return true;  
	    }
	
}

package metier;

import java.util.Date;

public class Match {

	private Date date;
	private String winner;
	private Tournament tournament;
	private TennisPlayer player1;
	private TennisPlayer player2;

	private static final double RATIO_MAX = (double)2/3;
	
	public Match(Date d, TennisPlayer player1, TennisPlayer player2, Tournament t){
		if (CheckPoints(player1,player2)) {
			date = d; 
			tournament = t;
			this.player1 = player1;
			this.player2 = player2;
			winner = null;
		}
		else 
		{
			System.out.println("No match possible");
		}
	}
	public Match (Date d)
	{
		date = d;
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
	
	// method to set a winner 
	public void BeWinner(TennisPlayer player){
		winner = player.getName();

	}
	  public boolean CheckPoints(TennisPlayer t1, TennisPlayer t2){	
		  double p1 = (double) t1.getPoints(), p2 = (double)t2.getPoints();
		 
		 return (p1>p2? ( (p2/p1 >= RATIO_MAX) ? true : false) : ( ( (p2>p1) ? (  ((p1/p2) >= RATIO_MAX) ? true : false ) : true) ) );
		  
		  

		}
		 
	      
	
}

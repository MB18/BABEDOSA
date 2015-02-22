package metier;

import java.util.ArrayList;


public class Tournament {

	private String name;
	private String country;
	private String winner;
	private int bonus;
	private ArrayList<TennisPlayer> participants;
	private ArrayList<Match> fixtures;
	
	public Tournament(String n, String c, int b){
		name = n; 
		country = c; 
		setBonus(b);
		winner = null;
		participants = new ArrayList<TennisPlayer>();
		fixtures = new ArrayList<Match>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getWinner() {
		return winner;
	}
	public void setWinner(String winner) {
		this.winner = winner;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public ArrayList<TennisPlayer> getParticipants()
	{
		return participants;
	}
	
	public void setParticipants(ArrayList<TennisPlayer> participants) {
		this.participants = participants;
	}

	public void setFixtures(ArrayList<Match> list)
	{
		fixtures = list;
	}
	public ArrayList<Match> getFixtures()
	{
		return fixtures;
	}
	
	// method to add a winner for the tournament
	public void BeWinner(TennisPlayer player){
		player.setPoints(player.getPoints() + bonus );
		winner = player.getName();
	}
	
	   public boolean TournamentParticipation(TennisPlayer tennisPlayer){
	    	
	    	if (tennisPlayer.getPoints()<=2*this.getBonus()){
	    		System.out.println("Inscription impossible : the player " + tennisPlayer.getName() +" has not enough points to participate");
	    		return false;
	    	}
	    	else
	    	{
	    		this.getParticipants().add(tennisPlayer);
	    		System.out.println("Inscription possible : the player " + tennisPlayer.getName() + " has enough points to participate");
	    		return true; 
	    	} 
	    }
}

package metier;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Battle {
	
	private Date date, dateformate;
	private String place;
	private Team team1;
	private Team team2;
	private String winner;
	
	public Battle(Date d, String p, Team t1, Team t2){
		date = d;
		place = p;
		team1 = t1;
		team2 = t2;
		winner = null;
	}	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}



	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Team getTeam1() {
		return team1;
	}

	public void setTeam1(Team team1) {
		this.team1 = team1;
	}

	public Team getTeam2() {
		return team2;
	}

	public void setTeam2(Team team2) {
		this.team2 = team2;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	// method to add a winner for the battle ???
	public void WinBattle(Team team){
		winner = team.getName();
	}

}

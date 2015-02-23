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
	
public boolean CheckBattle(Team team1, Team team2){
		
		int nbDancersTeam1 = team1.getDancers().size();
		int nbDancersTeam2 = team2.getDancers().size();
		int[] inspection = {0,0,0};
		
		if(nbDancersTeam1<4 || nbDancersTeam1 >10){
			System.out.println("Error : Team1 must have between 4 and 10 dancers");
			inspection[1]=1;
		}

		if(nbDancersTeam2<4 || nbDancersTeam2 >10){
			System.out.println("Error : Team2 must have between 4 and 10 dancers");
			inspection[1]=1;
		}
		
		if(nbDancersTeam1-nbDancersTeam2 > 2 || nbDancersTeam1-nbDancersTeam2 < -2){
			System.out.println("Error : The teams must have at most a difference of 2 dancers");
			inspection[1]=1;
		}
		
		for (int i = 0; i<3; i++){
			if (inspection[i]==1){
				return false;
			}
		}
		
		return true;
	}

}

package metier;


public class Tournament {

	private String name;
	private String country;
	private String winner;
	private int bonus;
	
	public Tournament(String n, String c, int b){
		name = n; 
		country = c; 
		setBonus(b);
		winner = null;
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
	
	// method to add a winner for the tournament
	public void BeWinner(TennisPlayer player){
		player.setPoints(player.getPoints() + bonus );
		winner = player.getName();
	}
}

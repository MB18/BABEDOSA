package metier;

import java.util.ArrayList;

public class Team {

	private String name;
	private Academy academy;
	private ArrayList<Dancer> dancers;
	

	public Team( String n, Academy a){
		name = n; 
		academy = a;
		dancers = new ArrayList<Dancer>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Academy getAcademy() {
		return academy;
	}
	public void setAcademy(Academy academy) {
		this.academy = academy;
	}
	public ArrayList<Dancer> getDancers() {
		return dancers;
	}
	public void setDancers(ArrayList<Dancer> dancers) {
		this.dancers = dancers;
	}

	//Method to add one dancer to a team
	public void DanceInTeam(Dancer dancer){
		dancers.add(dancer);
	}
}

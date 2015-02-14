package metier;

import java.util.ArrayList;

public class Show {

	private String name;
	private String place;
	private ArrayList<Dancer> dancers;
	
	public Show(String n, String p){
		setName(n); 
		place = p;
		dancers = new ArrayList<Dancer>();
	}
	
	public ArrayList<Dancer> getDancers() {
		return dancers;
	}
	public void setDancers(ArrayList<Dancer> dancers) {
		this.dancers = dancers;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

package metier;


public class TennisPlayer extends Person {
	
	private int points;
	
	public TennisPlayer(String n, String fn, String a, int ag, String sp, String s){
		super (n, fn, a, ag, sp, s);
		points = 0;
	}
	
	public TennisPlayer(String n, String fn, String a, int ag, String sp, String s, int p){
		super(n, fn, a, ag, sp, s);
		points = p;		
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
    public int WinOver(TennisPlayer p)
    {
        if (this.points > p.points)
            this.setPoints(this.getPoints() + (this.getPoints() - p.getPoints()));
        else
            this.setPoints(this.getPoints() + (p.getPoints() - this.getPoints()));
            
        return this.points;
    }
	
}

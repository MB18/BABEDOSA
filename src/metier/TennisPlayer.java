package metier;


public class TennisPlayer extends Person {
	
	protected int points;
	
	public TennisPlayer(){
		super();
	}
	
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
		int pthis = this.getPoints();
		int pp= p.getPoints();
		
    	if (this.points > p.points){
            this.setPoints(pthis + (pthis - pp));
            p.setPoints(pp - (pthis - pp));
        } else {
            this.setPoints(pthis + (pp - pthis));
            p.setPoints(pthis - (pp - pthis));
        }
        return this.points;
    }
	
}

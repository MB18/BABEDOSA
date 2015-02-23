package metier;
import java.util.Date;

public class Dancer extends Person {

	private String typeDance;
	private int timeOfwarmUp;
	private String salutations;
	private String msgToLeave;
	public boolean ready;
	public Date d = new Date(0);

	
	public Dancer(String name, String firstName, String academy, int age, String speciality, String surname){
		super (name, firstName, academy, age, surname, speciality);
		timeOfwarmUp = 1000;
		salutations = "Hello";
		msgToLeave = "Thank you !";
		ready = false;
	}
	
	public Dancer(String name, String firstName, String academy, int age, String speciality, String surname, String type, int wu, String greetings, String msg){
		super (name, firstName, academy, age, surname, speciality);
		typeDance = type;
		timeOfwarmUp = wu;
		salutations = greetings;
		msgToLeave = msg;
		ready = false;
	}
	
	public String getTypeDance() {
		return typeDance;
	}
	public void setTypeDance(String typeDance) {
		this.typeDance = typeDance;
	}
	public int getTimeOfwarmUp() {
		return timeOfwarmUp;
	}
	public void setTimeOfwarmUp(int timeOfwarmUp) {
		this.timeOfwarmUp = timeOfwarmUp;
	}
	public String getSalutations() {
		return salutations;
	}
	public void setSalutations(String salutations) {
		this.salutations = salutations;
	}
	public String getMsgToLeave() {
		return msgToLeave;
	}
	public void setMsgToLeave(String msgToLeave) {
		this.msgToLeave = msgToLeave;
	}
	public boolean isReady() {
		return ready;
	}

	public void setReady(boolean ready) {
		this.ready = ready;
	}

	public void Proceedings(){
		Salutation();
		WarmUp();
		MsgtoLeave();		
	}
	
    public void Salutation(){
    	System.out.println(salutations);
    }
    
	
	//fonctionnalit� : temps que le temps �coul� est < timeofwarmup c pas bon
	public void WarmUp()
    {
	    Date date = new Date();
	    long timeDepart = date.getTime(), timeFin;
	    System.out.println("Ready for ya ?!?");
	    do
	    {
	    	
	    	date = new Date();
	    	timeFin = date.getTime(); 
	    	//System.out.print("warming up in progress ");
	    	ready = false;
	    }
	    while( (timeFin - timeDepart) < timeOfwarmUp) ;
	    ready = true;
	    System.out.println("Bring it on !");
    }
	
	public void MsgtoLeave(){
		System.out.println(msgToLeave);
	}	
	/*
	public static void main(String [] args)
	{
				System.out.println(d);
	}*/
	
	public boolean CheckWarmUpTime(){
		if(this.getTimeOfwarmUp()<15){
			System.out.println("Error : It is required to warm up more than 15 secondes");
			return false;
		}
		else
			return true;
	}
}

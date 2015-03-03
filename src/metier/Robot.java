package metier;

public class Robot extends TennisPlayer{
	private static Robot instance;
	private int id;
	
	public Robot(String n, String fn, String a, int ag, String sp, String s, int p) {
		super(n, fn, a, ag, sp, s, p);
		id = 1;
	}
	
	public Robot(){
		super();
		id = 1;
	}

	
	public static synchronized Robot getInstance(){
		if (instance == null)
			instance = new Robot();
		
		return instance;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static void setInstance(Robot instance) {
		Robot.instance = instance;
	}

	public void loadPlayer (TennisPlayer tp){
		this.name = tp.getName();
		this.firstName = tp.getFirstName();
		this.surname = tp.getSurname();
		this.age = tp.getAge();
		this.academy = tp.getAcademy();
		this.speciality = tp.getSpeciality();
	}
	
	public void present(){
		System.out.println("I am robot numer " + this.getId() + " and I can play as " + this.firstName);
	}
}

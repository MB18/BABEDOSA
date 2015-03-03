package metier;

public class Person {
	
	protected String name;
	protected String firstName;
	protected String academy;
	protected int age;
	protected String speciality;
	protected String surname;
	
	public Person(){}
	
	public Person(String n, String fn, String a, int ag, String s, String sp){
		name = n; 
		firstName = fn;
		academy = a;
		age = ag;
		surname = s;
		speciality = sp;
	}
	
	public String getAcademy() {
		return academy;
	}
	public void setAcademy(String name2) {
		this.academy = name2;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

}


package javaCamp;

public class Instructor {
	
	public Instructor() {
		
	}
	
	public Instructor(int instructoId,String firstName,String lastName){
		this.instructorId=instructorId;
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	int instructorId;
	String firstName;
	String lastName;

}
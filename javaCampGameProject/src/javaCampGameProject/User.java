package javaCampGameProject;

public class User {
	private int userId;
	private String firstName;
	private String lastName;
	private int birthOfDate;
	private String nationalityNumber;
	
	public User(int userId, String firstName, String lastName, int birthOfDate, String nationalityNumber) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfDate = birthOfDate;
		this.nationalityNumber = nationalityNumber;
	}

	public int getId() {
		return userId;
	}

	public void setId(int id) {
		this.userId = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthOfDate() {
		return birthOfDate;
	}

	public void setBirthOfDate(int birthOfDate) {
		this.birthOfDate = birthOfDate;
	}

	public String getNationalityNumber() {
		return nationalityNumber;
	}

	public void setNationalityNumber(String nationalityNumber) {
		this.nationalityNumber = nationalityNumber;
	}
	

}

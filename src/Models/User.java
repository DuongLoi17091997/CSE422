package Models;

public class User {
	String lastName;
	String firstName;
	String fullName;
	String userName;
	String password;
	String gender;
	String dateOfBirth;
	
	public User(String lastName, String firstName, String fullName, String userName, String password, String gender,
			String dateOfBirth) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.fullName = fullName;
		this.userName = userName;
		this.password = password;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
	}
	
}

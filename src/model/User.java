package model;

//Type your code here
/**Create a class called User inside the model package with the following arguments*
2.**
6.*Generate appropriate getters and setters.*
7.*Generate a 4-argument constructor in the User class.*
*/
public class User{
	String name;
	String email;
	String dob;
	String gender;
	public User(String name, String email, String dob, String gender) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
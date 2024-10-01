package JavaLesson7Activities;

import java.util.Arrays;

class Passenger {
	public String name;
	public char gender;
	public String nationality;
	public String dateOfBirth;
	public String[] passport;
	
	// Lesson 7 Activity 1
//	public Passenger(String name, char gender, String nationality, String dateOfBirth, String[] passport) {
//		this.name = name;
//		this.gender = gender;
//		this.nationality = nationality;
//		this.dateOfBirth = dateOfBirth;
//		this.passport = passport;
//	}
	
	// Lesson 7 Activity 2
	public Passenger(String name, char gender, String nationality, String dateOfBirth) {
		this.name = name;
		this.gender = gender;
		this.nationality = nationality;
		this.dateOfBirth = dateOfBirth;
		
		System.out.println(this.toString());
	}
	
	public Passenger(String name, char gender, String nationality, String dateOfBirth, long pwdIDNumber) {
		this(name, gender, nationality, dateOfBirth);
		System.out.println("PWD ID No.: " + pwdIDNumber);
	}
	//
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String getNationality() {
		return nationality;
	}
	
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String[] getPassport() {
		return passport;
	}
	
	public void setPassport(String[] passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "\nName: " + name + 
			   "\nGender: " + gender + 
			   "\nNationality: " + nationality + 
			   "\nDate Of Birth: " + dateOfBirth;
	}
}

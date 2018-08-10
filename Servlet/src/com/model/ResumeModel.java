package com.model;

public class ResumeModel {
	private String FirstName;
	private String LastName;
	private String Gender;
	private String HighestQualification;
	private String Hobbies[];
	private String DateOfBirth;
	private String Address;
	private String skills[];
	private String email;
	private String website;
	private String Contact;
	private String Description;

	public ResumeModel() {
		super();
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getHighestQualification() {
		return HighestQualification;
	}

	public void setHighestQualification(String highestQualification) {
		HighestQualification = highestQualification;
	}

	public String[] getHobbies() {
		return Hobbies;
	}

	public void setHobbies(String[] hobbies) {
		Hobbies = hobbies;
	}

	public String getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getContact() {
		return Contact;
	}

	public void setContact(String string) {
		Contact = string;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
}

package com.ey.day6q1;

import java.time.LocalDate;
import java.util.Date;

public class Contact {
	String firstname;
	String middlename;
	String lastname;
	LocalDate dob;
	String gender;
	String number;
	public Contact(String firstname, String middlename, String lastname, LocalDate dob, String gender, String number) {
		super();
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.dob = dob;
		this.gender = gender;
		this.number = number;
	}
	@Override
	public String toString() {
		return "Contact [firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname + ", dob="
				+ dob + ", gender=" + gender + ", number=" + number + "]";
	}
}

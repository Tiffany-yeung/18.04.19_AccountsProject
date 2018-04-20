package com.qa.accounts.AccountProject;

public class Account {
    	
	private String firstName;
	private String lastName;
	private int accountNo;
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public Account (String firstName, String lastName, int accountNo) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNo = accountNo;
	}
	
	public String toString() {
		return "First Name: " + firstName + ". Last Name: " + lastName 
				+ ". Account Number: " + accountNo;
	}
	
}

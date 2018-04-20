package com.qa.accounts.AccountProject;

import java.util.HashMap;

import com.qa.accounts.AccountProject.Account;

public class Service {

	private int keyNumber = 1;
	//private variables are only private for other classes
	//to refer to this variable again, use this.keyNumber

	public int getKeyNumber() {
		return keyNumber;
	}

	public void setKeyNumber(int keyNumber) {
		this.keyNumber = keyNumber;
	}

	private HashMap<Integer, Account> bankData = new HashMap<Integer, Account>();

	public HashMap<Integer, Account> getBankData() {
		return bankData;
	}

	public void setBankData(HashMap<Integer, Account> bankData) {
		this.bankData = bankData;
	}

	public void addAccount(Account account) {

		if (bankData.containsKey(account.getAccountNo())) {
			System.out.println("Account already exists.");
		} else {
			bankData.put(keyNumber, account);
			keyNumber++;
		}
	}

	public void removeAccount(int removeKeyNumber) {
		boolean keyExists = bankData.containsKey(removeKeyNumber);
		if (keyExists) {
			bankData.remove(removeKeyNumber);
		}
	}

	public HashMap<Integer, Account> getAccountMap() {
		return bankData;
	}
	
	public Account getAccountByKey(int keyNumberToCheck) {
		//System.out.println(bankData.get(keyNumberToCheck));
		return bankData.get(keyNumberToCheck);
	}
	
	public int getCountOfSameFirstNames (String firstNameOfAccount) {
		int count = 0;
		for (Account eachAccount : bankData.values()) {
			if (eachAccount.getFirstName().equals(firstNameOfAccount)) {
				count++;
				//System.out.println(bankData.get(keyCount));
			}
		}
		return count;
	}
	
//	public int getNumberOfAccountWithFirstName(String firstNameOfAccount) {
//		return (int) bankData.values().stream()
//				.filter(eachAccount -> eachAccount.getFirstName().equals(firstNameOfAccount)).count();
//	}
	
}
package com.qa.accounts.AccountProject;

import com.qa.accounts.AccountProject.Account;
import com.qa.accounts.AccountProject.Service;

import java.util.Scanner;
//import com.google.gson.*;

public class Main {

	private static Scanner userInput;

	public static void main(String[] args) {

		userInput = new Scanner(System.in);
		
		Service service = new Service();
		Account Tiffany = new Account("Tiffany", "Yeung", 11111);
		Account WrongTiffany = new Account("Tiffany", "Young", 22222);
		Account Rachel = new Account("Rachel", "OConnell", 33333);
		Account Sukhi = new Account("Sukhi", "Dhadwar", 44444);
		Account WrongTiffany2 = new Account("Tiffany", "Yueng", 55555);
		
		service.addAccount(Tiffany);
		service.addAccount(WrongTiffany);
		service.addAccount(Rachel);
		service.addAccount(Sukhi);
		service.addAccount(WrongTiffany2);
		System.out.println("Accounts added to map:");
		System.out.println(service.getAccountByKey(1));
		System.out.println(service.getAccountByKey(2));
		System.out.println(service.getAccountByKey(3));
		System.out.println(service.getAccountByKey(4));
		System.out.println(service.getAccountByKey(5));
		
		//System.out.println(service.getBankData().get(1));
	
		System.out.println("Please search for a first name:");
		String firstNameInput = userInput.next();
		System.out.println("Number of accounts with first name '" + firstNameInput 
		+ "': " + service.getCountOfSameFirstNames(firstNameInput));
		
//		System.out.println("");
//		System.out.println("GSON:");
//		Gson gson = new Gson();
//		String json = gson.toJson(service.getBankData());
//		System.out.println(json);
	}
}

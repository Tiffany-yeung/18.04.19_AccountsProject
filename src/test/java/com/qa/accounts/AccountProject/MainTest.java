package com.qa.accounts.AccountProject;
import static org.junit.Assert.*;
import org.junit.Test;

//import com.google.gson.Gson;
import com.qa.accounts.AccountProject.Account;
import com.qa.accounts.AccountProject.Service;

public class MainTest {
	
		Service service = new Service();
		
	@Test
	public void addAccountTest() {
		Account Tiffany = new Account("Tiffany", "Yeung", 001);
		service.addAccount(Tiffany);
		Integer expected = 1;
		Integer actual = service.getBankData().size();
		assertEquals(expected,actual);
	}
	
	@Test
	public void addTwoSameAccountNumbersTest() {
		Account Tiffany = new Account("Tiffany", "Yeung", 001);
		Account Rachel = new Account("Rachel", "O Connell", 001);
		service.addAccount(Tiffany);
		service.addAccount(Rachel);
		Integer expected = 1;
		Integer actual = service.getBankData().size();
		assertEquals(expected,actual);
	}
	
	@Test
	public void addTwoDifferentAccountNumbersTest() {
		Account Tiffany = new Account("Tiffany", "Yeung", 001);
		Account Rachel = new Account("Rachel", "O Connell", 002);
		service.addAccount(Tiffany);
		service.addAccount(Rachel);
		Integer expected = 2;
		Integer actual = service.getBankData().size();
		assertEquals(expected,actual);
	}
	
	@Test
	public void countAccountsTest() {
		Account Tiffany = new Account("Tiffany", "Yeung", 11111);
		Account Tiffany2 = new Account("Tiffany", "Young", 22222);
		Account Tiffany3 = new Account("Tiffany", "Yueng", 33333);
		service.addAccount(Tiffany);
		service.addAccount(Tiffany2);
		service.addAccount(Tiffany3);
		service.removeAccount(1);
		Integer expected = 2;
		Integer actual = service.getCountOfSameFirstNames("Tiffany");
		assertEquals(expected,actual);
	}
	
	@Test
	public void emptyCountAccountsTest() {
		Integer expected = 0;
		Integer actual = service.getCountOfSameFirstNames("Tiffany");
		assertEquals(expected,actual);
	}
	
	//System.out.println("GSON:");
	//Gson gson = new Gson();
	//String json = gson.toJson(service.getBankData());
	//System.out.println(json);
	
}

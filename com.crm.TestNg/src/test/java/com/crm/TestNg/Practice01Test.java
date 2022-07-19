package com.crm.TestNg;

import org.testng.annotations.Test;

public class Practice01Test {
	@Test
	public void Test01() {
		String url = System.getProperty("url");
		String browser = System.getProperty("browser");
		System.out.println("From Test_01");
		System.out.println("url======"+url);
		System.out.println("browser======"+browser);
		
		
	}
	@Test
	public void Test2(){
		String username = System.getProperty("un");
		String password = System.getProperty("pwd");
		System.out.println("username======"+username);
		System.out.println("password======"+password);
		System.out.println("From Test_02");
	}
	@Test
	public void Test02() {
		String place = System.getProperty("Place");
		String nationality = System.getProperty("Nationality");
		System.out.println("place======="+place);
		System.out.println("nationality========"+nationality);
		System.out.println("From Test_03");
	}
	@Test
	public void Test03() {
		System.out.println("From Test_04");
	}
}

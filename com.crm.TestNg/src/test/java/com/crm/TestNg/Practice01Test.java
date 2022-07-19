package com.crm.TestNg;

import org.testng.annotations.Test;

public class Practice01Test {
	@Test
	public void Test01() {
		String url = System.getProperty("url");
		String browser = System.getProperty("browser");
		System.out.println("url======"+url);
		System.out.println("browser======"+browser);
		System.out.println("From Test_01");
	}
	@Test
	public void Test02(){
		String username = System.getProperty("un");
		String password = System.getProperty("pwd");
		System.out.println("username======"+username);
		System.out.println("password======"+password);
		System.out.println("From Test_02");
	}
	@Test
	public void Test03() {
		String place = System.getProperty("place");
		String nationality = System.getProperty("nationality");
		System.out.println("place======="+place);
		System.out.println("nationality========"+nationality);
		System.out.println("From Test_03");
	}
	@Test
	public void Test04() {
		String cast = System.getProperty("cast");
		String religion =System.getProperty("religion");
		System.out.println("cast===="+cast);
		System.out.println("religion==="+religion);
		System.out.println("From Test_04");
	}
}

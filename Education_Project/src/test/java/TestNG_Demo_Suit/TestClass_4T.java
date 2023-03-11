package TestNG_Demo_Suit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass_4T {

	@BeforeSuite
	public void beforeSuit() {
		System.out.println("@beforeSuit - TestClass_4T");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest - TestClass_4T");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass - TestClass_4T");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod - TestClass_4T");
	}
	
	@Test
	public void test_A() {
		System.out.println("TestA- TestClass_4T");
	}
	
	@Test
	public void test_B() {
		System.out.println("TestB- TestClass_4T");
	}
	
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod- TestClass_4T");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass - TestClass_4T");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("@AfterTest - TestClass_4T");
	}
	

	@AfterSuite
	public void AfterSuit() {
		System.out.println("@AfterSuit - TestClass_4T");
	}

	
}

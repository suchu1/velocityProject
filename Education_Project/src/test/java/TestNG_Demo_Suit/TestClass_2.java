package TestNG_Demo_Suit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass_2 {
	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass - TestClass_2");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod - TestClass_2");
	}
	
	@Test(priority = 1)
	public void test1() {
		System.out.println("Test- TestClass_2A");
	}
	
	@Test
	public void test2() {
		System.out.println("Test- TestClass_2B");
	}
	
	@Test (priority = 3)
	public void test3() {
		System.out.println("Test- TestClass_2C");
	}
	
	@Test
	public void test4() {
		System.out.println("Test- TestClass_2D");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod- TestClass_2");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}


}

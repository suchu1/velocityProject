package testNGKeyword;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Keywords {

	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}
	
	@Test(priority = 3)
	public void test1() {
		System.out.println("Test");	
	}
	
	@Test(timeOut = 3000) 
	public void test2() throws InterruptedException {
		System.out.println("Test2");
		Thread.sleep(4000);
		System.out.println("hello");
 }
	
	@Test(priority = 1)
	public void test3() {
		System.out.println("Test3"); 
	}
	
	@Test(priority = 2)
	public void test4() {
		System.out.println("Test4");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	@Test(priority = 2, invocationCount = -3)
	public void test3() {
		System.out.println("Test3"); 
	}
*/	
	
	
	
	
	
	
	
}

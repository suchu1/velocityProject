package TestNG_Demo_Suit;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass_1 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass - TestClass_1");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod - TestClass_1");
	}
	
	@Test
	public void test_A() {
		System.out.println("TestA- TestClass_1");
		String actualTitle = "suchitsalavi";
		String expectedTitle = "suchitsalvi";
		//Assert.assertEquals(actualTitle, expectedTitle);
		//Assert.assertNotEquals(actualTitle, expectedTitle, "title is wrong");
		boolean result =actualTitle.equals(expectedTitle);
		if(result == false)
		{
			Assert.fail();
		}
		
	}
		
		/*	if (result ==true) { 
			System.out.println("test case pass");
		}
		else {
			Assert.fail();
		}
		
		
	}
	
		@Test
	public void test_B() {
		System.out.println("TestB- TestClass_1");
		String actualTitle = "suchitsalvi";
		String expectedTitle = "suchitsalvi";
	//	Assert.assertEquals(actualTitle, expectedTitle, "title is wrong");
		boolean result =actualTitle.equals(expectedTitle);
		Assert.assertFalse(result); 
	}
	
	@Test
	public void test_C() {
		System.out.println("TestC- TestClass_1");
	}
	
	@Test
	public void test_D() {
		System.out.println("TestD- TestClass_1");
	}*/
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod- TestClass_1");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

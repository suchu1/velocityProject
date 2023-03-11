package TestNG_Demo_Suit;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertexample {

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
		System.out.println("TestA- TestClass_A");
		String actualTitle = "suchitsalvi";
		String expectedTitle = "suchitsalvi687545";
	
	SoftAssert soft = new SoftAssert();
	soft.assertEquals(actualTitle, expectedTitle,"suchitsalvi687545");
	
	soft.assertAll();
	}
	
	@Test
	public void test_B() {
		System.out.println("TestA- TestClass_B");
		String actualTitle = "suchitsalvi";
		String expectedTitle = "suchitsalvi69565";
	
	SoftAssert soft = new SoftAssert();
	soft.assertEquals(actualTitle, expectedTitle,"suchitsalvi69565");
	
	soft.assertAll();
	
	
	
	
	}

	
}

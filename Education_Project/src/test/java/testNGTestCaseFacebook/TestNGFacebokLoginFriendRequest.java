package testNGTestCaseFacebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomFacebookModule.FunctionsOfFacebook;
import pomFacebookModule.LoginOrSignUpPage;

public class TestNGFacebokLoginFriendRequest {
	
	//here I want to add the allow block code and check once the url and title
	private WebDriver driverTest ;
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BeforeClass");
		System.setProperty("webdriver.chrome.driver", "C:\\SUCHIT FOLDER\\VELOCITY\\chromedriver_win32\\chromedriver.exe");
		driverTest = new ChromeDriver ();
		driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driverTest.manage().window().maximize();
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
		driverTest.get("https://www.facebook.com/");
		LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage (driverTest);
		loginOrSignUpPage.sendUserName("suchit");
		loginOrSignUpPage.sendPassword("suchit123");
		loginOrSignUpPage.clickOnLoginButton();
	}
	
	@Test
	public void test() {
		System.out.println("Test");
		String url = driverTest.getCurrentUrl();
		String title = driverTest.getTitle();
		
		String expectedurl =("https://www.facebook.com/");
		String expectedTitle =("Log in to Facebook");
		
		if(url.equals("https://www.facebook.com/"));
		if (title.equals("Log in to Facebook"));
		
		if(url.equals(expectedurl)&& title.equals(expectedTitle))
		{
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case failed");
		}
		
	}
	/*@Test
	public void test2() {
		System.out.println("Test");
		FunctionsOfFacebook functionsOfFacebook = new FunctionsOfFacebook (driverTest) ;
		functionsOfFacebook.clickOnSearchButton("suchit salvi");
		functionsOfFacebook.clickOnSearchForResult();
		functionsOfFacebook.clickOnAddFriend();
		
		String url = driverTest.getCurrentUrl();
		String title = driverTest.getTitle();
		
		String expectedurl =("https://www.facebook.com/search/top?q=suchit%20salvi");
		String expectedTitle =("(1) suchit salvi - Search Results | Facebook");
		
		if(url.equals("https://www.facebook.com/search/top?q=suchit%20salvi"));
		if (title.equals("(1) suchit salvi - Search Results | Facebook"));
		
		if(url.equals(expectedurl)&& title.equals(expectedTitle))
		{
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case failed");
		}
		
		
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
		FunctionsOfFacebook functionsOfFacebook = new FunctionsOfFacebook (driverTest);
		functionsOfFacebook.clickOnMyprofile();
		functionsOfFacebook.clickOnlogout();
	
	}
	*/
	@AfterMethod
	public void afterMethod() {
		driverTest.navigate().refresh();
	}
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
		driverTest.close();
	}


}

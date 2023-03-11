package allCrossBrowserCodes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.Browser;
import pomFacebookModule.FunctionsOfFacebook;
import pomFacebookModule.LoginOrSignUpPage;

public class TestNGFacebokLoginFriendRequest extends Browser {
	//here I want to add the allow block code and check once the url and title
private WebDriver driverTest ;
private LoginOrSignUpPage loginOrSignUpPage ;
private FunctionsOfFacebook functionsOfFacebook ;
		
		@Parameters 
		@BeforeTest
		public void launchBrowser(String browser) {
			 System.out.println("BeforeTest");
			 if(browser.equals("Chrome")) {
					driverTest = OpenChromeBrowser();
				}
				 
				if(browser.equals("Firefox")) {
					driverTest=	OpenFirefoxBrowser();
				}
				 
				/* if(browser.equals("Opera")) {
					 System.setProperty("webdriver.gecko.driver", "C:\\SUCHIT FOLDER\\VELOCITY\\geckodriver-v0.32.2-win-aarch64");
					 driverTest = new OperaDriver () ;
				 }*/
					
				driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driverTest.manage().window().maximize();
		}
		
		@BeforeClass
		public void createPomObject() {
			loginOrSignUpPage = new LoginOrSignUpPage (driverTest);
			functionsOfFacebook = new FunctionsOfFacebook (driverTest) ;
			
		}
		
		@BeforeMethod
		public void beforeMethod() {
		System.out.println("BeforeMethod");
		driverTest.get("https://www.facebook.com/");
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
			driverTest.close();
		}
		@AfterClass
		public void afterClass() {
			System.out.println("AfterClass");
			driverTest.quit();
		}
		
		@AfterTest
		public void closeBrowser() {
			loginOrSignUpPage = null ;
			functionsOfFacebook = null ;
			driverTest = null ;
			System.gc();
			
		}
}

package testNGTestCaseFacebook;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomFacebookModule.CookiesPolicyPage;
import pomFacebookModule.FunctionsOfFacebook;
import pomFacebookModule.LoginOrSignUpPage;
import pomFacebookModule.PrivacyDetailsPage;
import pomFacebookModule.SignUpPage;
import pomFacebookModule.TermDetailsPage;

public class TermLinkVerificationTestNG {
 private WebDriver driverTest ;
 
	@BeforeClass
			public void launchBrowser() {
			System.out.println("BeforeClass");
			System.setProperty("webdriver.chrome.driver", "C:\\SUCHIT FOLDER\\VELOCITY\\chromedriver_win32\\chromedriver.exe");
			driverTest = new ChromeDriver ();
			driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driverTest.manage().window().maximize();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
		driverTest.get("https://www.facebook.com/");
		LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage (driverTest);
		loginOrSignUpPage.openSignUpPage();
	}
	
	@Test
	public void test() {
		System.out.println("Test");
		SignUpPage signUpPage = new SignUpPage (driverTest);
		signUpPage.clickOnTermsButtonLink();
		
		ArrayList<String> abc = new ArrayList<String> (driverTest.getWindowHandles());
		driverTest.switchTo().window(abc.get(1));
		TermDetailsPage termDetailsPage = new TermDetailsPage(driverTest);
		termDetailsPage.serviceWeProvideButton();
		
		String title = driverTest.getTitle();
		String url = driverTest.getCurrentUrl();
		System.out.println(title);
		System.out.println(url);
		
		 String Expectedtitle = ("Facebook") ;
		 String Expectedurl = ("https://www.facebook.com/legal/terms/update") ;
		 
		 if(title.equals(Expectedtitle) && url.equals(Expectedurl)) {
			 System.out.println("test case pass");
		 }
		 else {
			 System.out.println("test case failed");
		 }
	}
	@Test	 
   public void test2() {
				System.out.println("Test2");
				SignUpPage signUpPage = new SignUpPage (driverTest);
				signUpPage.clickOnPrivacyPolicyLink();
				
				ArrayList<String> abc = new ArrayList<String> (driverTest.getWindowHandles());
				driverTest.switchTo().window(abc.get(1));
				
				PrivacyDetailsPage privacyDetailsPage = new PrivacyDetailsPage (driverTest);
				privacyDetailsPage.clickOnprivacyPolicy();
				
				String title = driverTest.getTitle();
				String url = driverTest.getCurrentUrl();
				System.out.println(title);
				System.out.println(url);
				
				 String Expectedtitle = ("Meta Privacy Policy – How Meta collects and uses user data | Privacy Centre | Manage your privacy on Facebook, Instagram and Messenger | Facebook Privacy") ;
				 String Expectedurl = ("https://www.facebook.com/privacy/policy") ;
				 
				 if(title.equals(Expectedtitle) && url.equals(Expectedurl)) {
					 System.out.println("test case pass");
				 }
				 else {
					 System.out.println("test case failed");
				 }
   }
	@Test
   public void test3() {
		System.out.println("Test3");
		SignUpPage signUpPage = new SignUpPage (driverTest);
		signUpPage.clickOnCookiesPolicyLink();
		
		ArrayList<String> abc = new ArrayList<String> (driverTest.getWindowHandles());
		driverTest.switchTo().window(abc.get(1));
		
		CookiesPolicyPage cookiesPolicyPage = new CookiesPolicyPage(driverTest);
		cookiesPolicyPage.clickOnPrivacyPolicy();
		String title = driverTest.getTitle();
		String url = driverTest.getCurrentUrl();
		System.out.println(title);
		System.out.println(url);
		
		 String Expectedtitle = ("Meta Cookies Policy | Privacy Centre | Manage your privacy on Facebook, Instagram and Messenger | Facebook Privacy") ;
		 String Expectedurl = ("https://www.facebook.com/privacy/policies/cookies/?entry_point=cookie_policy_redirect&entry=0") ;
		 
		 if(title.equals(Expectedtitle) && url.equals(Expectedurl)) {
			 System.out.println("test case pass");
		 }
		 else {
			 System.out.println("test case failed");
		 }
}		 
	/* public void test3() {   //filling the form
						System.out.println("Test");
						SignUpPage signUpPage = new SignUpPage (driverTest);
						signUpPage.enterFirstName("suchit");
						signUpPage.enterSurName("sandhu");
						signUpPage.enterMobNum("8208017392");
						signUpPage.enterPassword("sfdsd12e");
						signUpPage.selectDateOfBirth("6");
						signUpPage.selectBirthMonth("Sep");
						signUpPage.selectBirthYear("1996");
						signUpPage.selectGender();
						signUpPage.clickOnSignUpButton();
						
						String title = driverTest.getTitle();
						String url = driverTest.getCurrentUrl();
						System.out.println(title);
						System.out.println(url);
						
						 String Expectedtitle = ("Facebook – log in or sign up") ;
						 String Expectedurl = ("https://www.facebook.com/") ;
						 
						 if(title.equals(Expectedtitle) && url.equals(Expectedurl)) {
							 System.out.println("test case pass");
						 }
						 else {
							 System.out.println("test case failed");
						 }
				 */
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
		driverTest.close();
		ArrayList<String> closetab = new ArrayList<String> (driverTest.getWindowHandles());
		driverTest.switchTo().window(closetab.get(0));
		
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
		driverTest.quit();
		
	}
	
	
	
	
}

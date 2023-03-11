package allCrossBrowserCodes;

import java.util.ArrayList;
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

import pomFacebookModule.CookiesPolicyPage;
import pomFacebookModule.LoginOrSignUpPage;
import pomFacebookModule.PrivacyDetailsPage;
import pomFacebookModule.SignUpPage;
import pomFacebookModule.TermDetailsPage;

public class Demo {
	 private WebDriver driverTest ;
	 private LoginOrSignUpPage loginOrSignUpPage ;
	 private SignUpPage signUpPage ;
	 private TermDetailsPage termDetailsPage ;
	 private PrivacyDetailsPage privacyDetailsPage ;
	 private CookiesPolicyPage cookiesPolicyPage ;
	
	 @Parameters("CrossBrowser")
	 @BeforeTest
	 public void launchBrowser(String browser) {
		 System.out.println("BeforeTest");
		 
		 if(browser.equals("Chrome")) {
			 System.setProperty("webdriver.chrome.driver", "C:\\SUCHIT FOLDER\\VELOCITY\\chromedriver_win32\\chromedriver.exe");
			 driverTest = new ChromeDriver ();
		 }
		 
		 if(browser.equals("Firefox")) {
			 System.setProperty("webdriver.gecko.driver", "C:\\SUCHIT FOLDER\\VELOCITY\\geckodriver-v0.32.2-win-aarch64");
			 driverTest = new FirefoxDriver () ;
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
			signUpPage = new SignUpPage (driverTest);
			termDetailsPage = new TermDetailsPage(driverTest);
			privacyDetailsPage = new PrivacyDetailsPage (driverTest);
			cookiesPolicyPage = new CookiesPolicyPage(driverTest);
			
		}
		
		
		@BeforeMethod
		public void beforeMethod() {
			System.out.println("BeforeMethod");
			driverTest.get("https://www.facebook.com/");
		 //   loginOrSignUpPage = new LoginOrSignUpPage (driverTest);//dont need to write this line
			loginOrSignUpPage.openSignUpPage();
		}
		
		@Test
		 public void test4() {   //filling the form
							System.out.println("Test");
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
					 
		 }
		
		@Test
		public void test1() {
			System.out.println("Test");
			signUpPage.clickOnTermsButtonLink();
			
			ArrayList<String> abc = new ArrayList<String> (driverTest.getWindowHandles());
			driverTest.switchTo().window(abc.get(1));
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
					signUpPage.clickOnPrivacyPolicyLink();
					
					ArrayList<String> abc = new ArrayList<String> (driverTest.getWindowHandles());
					driverTest.switchTo().window(abc.get(1));
					
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
			signUpPage.clickOnCookiesPolicyLink();
			
			ArrayList<String> abc = new ArrayList<String> (driverTest.getWindowHandles());
			driverTest.switchTo().window(abc.get(1));
			
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
			driverTest.navigate().refresh();
			driverTest.quit();
		}
			
		@AfterTest
	    public void closeBrowser() {
			loginOrSignUpPage = null;
			signUpPage = null;
			termDetailsPage = null;
			privacyDetailsPage = null;
			cookiesPolicyPage = null;
			driverTest = null ;
		    System.gc();
				
		}
		
	
		

}

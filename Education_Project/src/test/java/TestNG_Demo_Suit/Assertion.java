package TestNG_Demo_Suit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import paytmPomModule.OnlineRechargeAndPlans;
import paytmPomModule.PaytmHomePage;

public class Assertion {
	private WebDriver driverTest;
	private PaytmHomePage PaytmHomePage ;
	private OnlineRechargeAndPlans onlineRechargeAndPlans ;
	
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
		PaytmHomePage = new PaytmHomePage(driverTest);
		onlineRechargeAndPlans = new OnlineRechargeAndPlans (driverTest);
		
		}
	
		@BeforeMethod
		public void beforeClass() {
			System.out.println("@BeforeClass");
			driverTest.get("https://paytm.com/");
			PaytmHomePage.clickOnprepaidMobilerecharge();
		}
		
		@Test
		public void test() {
			System.out.println("Test");
			onlineRechargeAndPlans.enterMobileNum("8208017392");
			onlineRechargeAndPlans.enterAmount("149");
		}
		
		
		@Test
		public void test2() {
			System.out.println("Test2");
			onlineRechargeAndPlans.enterMobileNum("8208017392");
			onlineRechargeAndPlans.ClickOnJioPhonePlan();
			onlineRechargeAndPlans.ClickOnJioPhonePlanAmount();
		}
		
		@AfterMethod
		public void afterMethod() {
			System.out.println("AfterMethod");
			onlineRechargeAndPlans.proceedsrechargeButt();
				
				String title = driverTest.getTitle();
				 String url = driverTest.getCurrentUrl();
				 System.out.println(title);
				 System.out.println(url);
				 
		//		 String Expectedtitle = ("Online Recharge - Online Mobile Recharge & Prepaid Recharge Plans") ;
		//		 String Expectedurl = ("https://paytm.com/recharge") ;
				 
				 Assert.assertEquals(title, "Online Recharge - Online Mobile Recharge & Prepaid Recharge Plans");
				 Assert.assertEquals(url, "https://paytm.com/recharge");
				 
				 
				 
				 
				 
				 
				 /*if(title.equals(Expectedtitle) ) {
					 System.out.println("test case pass");
				 }
				 else {
					 System.out.println("test case failed");
				 }
				 if(url.equals(Expectedurl)) {
					 System.out.println("test case pass"); 
				 }
				 else {
					 System.out.println("test case failed");
				 }*/
		}
			
		
		@AfterClass
		public void afterClass() {
			System.out.println("AfterClass");
			driverTest.close();
		}
		@AfterTest
		public void afterTest () {
			PaytmHomePage = null ;
			onlineRechargeAndPlans = null ;
			driverTest = null ;
			System.gc();
		}

}

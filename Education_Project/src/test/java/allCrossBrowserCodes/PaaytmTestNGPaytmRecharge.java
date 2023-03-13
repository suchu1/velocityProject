package allCrossBrowserCodes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base.Browser;
import paytmPomModule.OnlineRechargeAndPlans;
import paytmPomModule.PaytmHomePage;

public class PaaytmTestNGPaytmRecharge extends Browser {
	private WebDriver driverTest;
	private PaytmHomePage PaytmHomePage ;
	private OnlineRechargeAndPlans onlineRechargeAndPlans ;
	private static ExtentHtmlReporter reporter ;
	
	//@Parameters("CrossBrowser")
	@BeforeTest
	public void launchBrowser() {    //String browser
		reporter = new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		System.out.println("BeforeTest");
		String browser = "Chrome";
		
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
			onlineRechargeAndPlans.enterMobileNum("9405733605");
			onlineRechargeAndPlans.enterAmount("599");
		
		}
		
		
		@Test
		public void test2() {
			System.out.println("Test2");
			onlineRechargeAndPlans.enterMobileNum("9405733605");
			onlineRechargeAndPlans.ClickOnDatapack();
			onlineRechargeAndPlans.ClickOnDataAmount();
		}
		
		@AfterMethod
		public void afterMethod() {
			System.out.println("AfterMethod");
			onlineRechargeAndPlans.proceedsrechargeButt();
				
				String title = driverTest.getTitle();
				 String url = driverTest.getCurrentUrl();
				 System.out.println(title);
				 System.out.println(url);
				 
				 String Expectedtitle = ("Online Recharge - Online Mobile Recharge & Prepaid Recharge Plans") ;
				 String Expectedurl = ("https://paytm.com/recharge") ;
				 
				 Assert.assertEquals(title, Expectedtitle, "title is incorrect");
				 Assert.assertEquals(url, Expectedurl, "url is wrong");
//				boolean result = title.equals(Expectedtitle)&& url.equals(Expectedurl) ;
//				if(result ==false) {
//					Assert.fail();
//				}
				
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

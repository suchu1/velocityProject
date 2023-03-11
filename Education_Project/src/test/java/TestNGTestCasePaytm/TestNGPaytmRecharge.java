package TestNGTestCasePaytm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import paytmPomModule.OnlineRechargeAndPlans;
import paytmPomModule.PaytmHomePage;

public class TestNGPaytmRecharge {
 WebDriver driverTest;
	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass");
		System.setProperty("webdriver.chrome.driver", "C:\\SUCHIT FOLDER\\VELOCITY\\chromedriver_win32\\chromedriver.exe");
		driverTest = new ChromeDriver ();
		driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
		driverTest.get("https://paytm.com/");
		PaytmHomePage PaytmHomePage = new PaytmHomePage (driverTest);
		PaytmHomePage.clickOnprepaidMobilerecharge();
	}
	
	@Test
	public void test() {
		System.out.println("Test");
		OnlineRechargeAndPlans onlineRechargeAndPlans = new OnlineRechargeAndPlans (driverTest);
		onlineRechargeAndPlans.enterMobileNum("8208017392");
		onlineRechargeAndPlans.enterAmount("149");
	}
	
	@Test
	public void test2() {
		System.out.println("Test2");
		OnlineRechargeAndPlans onlineRechargeAndPlans = new OnlineRechargeAndPlans (driverTest);
		onlineRechargeAndPlans.enterMobileNum("8208017392");
		onlineRechargeAndPlans.ClickOnJioPhonePlan();
		onlineRechargeAndPlans.ClickOnJioPhonePlanAmount();
	}
	
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
		OnlineRechargeAndPlans onlineRechargeAndPlans = new OnlineRechargeAndPlans(driverTest);
		onlineRechargeAndPlans.proceedsrechargeButt();
		
		String title = driverTest.getTitle();
		 String url = driverTest.getCurrentUrl();
		 System.out.println(title);
		 System.out.println(url);
		 
		 String Expectedtitle = ("Online Recharge - Online Mobile Recharge & Prepaid Recharge Plans") ;
		 String Expectedurl = ("https://paytm.com/recharge") ;
		 
		 if(title.equals(Expectedtitle) && url.equals(Expectedurl)) {
			 System.out.println("test case pass");
		 }
		 else {
			 System.out.println("test case failed");
		 }
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
		driverTest.navigate().back();
		driverTest.close();
		
	}
	
	

}

package AmazoneTestCases;

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

import amazonePomModule.HomePageHeader;
import amazonePomModule.LaptopDetaiils;
import amazonePomModule.LaptopsOptions;
import amazonePomModule.MobileOptions;
import amazonePomModule.MobilePage;
import paytmPomModule.OnlineRechargeAndPlans;
import paytmPomModule.PaytmHomePage;

public class CrossBrowserAmazone {

	private WebDriver driverTest;
	private HomePageHeader homePageHeader ;
	private LaptopsOptions laptopsOptions ;
	private LaptopDetaiils laptopDetaiils ;
	private MobileOptions mobileOptions ;
	private MobilePage mobilePage ;
	
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
			homePageHeader = new HomePageHeader (driverTest) ;
			mobileOptions = new MobileOptions(driverTest);
			mobilePage = new MobilePage (driverTest) ;
			laptopsOptions = new LaptopsOptions(driverTest);
			laptopDetaiils = new LaptopDetaiils (driverTest);
		}
	
		@BeforeMethod
		public void beforeClass() {
			System.out.println("@BeforeClass");
			driverTest.get("https://www.amazon.in/");
		}
		
		@Test
		public void test() {
			System.out.println("Test");
			homePageHeader.clickonSearch("laptops under 40000");
			homePageHeader.clickonSearchButton();
			laptopsOptions.clickOnFirstLaptop();
			laptopsOptions.clickOnwindowShift();
			ArrayList<String> windowchange = new ArrayList<String> (driverTest.getWindowHandles());
			driverTest.switchTo().window(windowchange.get(1));
			laptopDetaiils.clickOnCart();
			laptopDetaiils.clickOnCheckOut();
			driverTest.close();
			driverTest.switchTo().window(windowchange.get(0));
		}
		
		
		@Test
		public void test2() {
			homePageHeader.clickonSearch("real me 9 pro");
			homePageHeader.clickonSearchButton();
			mobileOptions.clickOnRealMePro();
			ArrayList<String> windowchange = new ArrayList<String> (driverTest.getWindowHandles());
			driverTest.switchTo().window(windowchange.get(1));
			mobilePage.clickOnaddToWishList();
			driverTest.close();
			driverTest.switchTo().window(windowchange.get(0));
			
			
		}
		
		@AfterMethod
		public void afterMethod() {
			System.out.println("AfterMethod");
			driverTest.navigate().back();
			String title = driverTest.getTitle();
			String Url = driverTest.getCurrentUrl();
			
			System.out.println(title);
			System.out.println(Url);
			
			String ExpectedTitle = ("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
			String ExpectedUrl = ("https://www.amazon.in/");
			
			if(title.equals(ExpectedTitle)&& Url.equals(ExpectedUrl)) {
				System.out.println("test case pass");
			}
			else {
				System.out.println("test case failed");
			}
			
		}
			
		
		@AfterClass
		public void afterClass() {
			System.out.println("AfterClass");
			driverTest.close();
			driverTest.quit ();
		}
		@AfterTest
		public void afterTest () {
			homePageHeader = null;
			mobileOptions = null;
			mobilePage = null;
			laptopsOptions = null;
			laptopDetaiils = null;
			driverTest = null ;
		}
	
	
	
	
}

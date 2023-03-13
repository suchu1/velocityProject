package allCrossBrowserCodes;

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
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base.Browser;
import paytmPomModule.FlightTicketDetailsPage;
import paytmPomModule.MumbaiToDelhiBookFlight;
import paytmPomModule.PaytmHomePage;

public class PaytmBookFlight extends Browser {
 private WebDriver driverTest ;
 private PaytmHomePage paytmHomePage;
 private FlightTicketDetailsPage flightTicketDetailsPage ;
 private MumbaiToDelhiBookFlight mumbaiToDelhiBookFlight ;
 private static ExtentHtmlReporter reporter ;
 
    @Parameters("CrossBrowser")
    @BeforeTest
    public void launchBrowser (String browser) {  
    	reporter = new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
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
    	paytmHomePage = new PaytmHomePage (driverTest);
    	flightTicketDetailsPage = new FlightTicketDetailsPage(driverTest);
    	mumbaiToDelhiBookFlight = new MumbaiToDelhiBookFlight(driverTest);
    	
    }
    
   
	@BeforeMethod
	public void beforeClass() {
		System.out.println("@BeforeMethod");
			driverTest.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driverTest.manage().window().maximize();
			driverTest.get("https://paytm.com/");
			paytmHomePage.clickOnPaytmForConsumer();
			paytmHomePage.clickOnTicketBooking();
			paytmHomePage.clickOnflightTicket();
	}
	
	@Test
	public void test() {
		System.out.println("Test");
		
		flightTicketDetailsPage.clickOnroundTrip();
		flightTicketDetailsPage.clickOnsearchBarFrom();
		flightTicketDetailsPage.clickflightFromMum();
		flightTicketDetailsPage.clicksearchBarto();
		flightTicketDetailsPage.clickflightToDel();
		
		flightTicketDetailsPage.clickOnFlightDateBar();
		flightTicketDetailsPage.clickOnFlightDate();

		flightTicketDetailsPage.clickOnSearchBarReturnJourney();
		flightTicketDetailsPage.clickOnReturnJourneyDate();
		flightTicketDetailsPage.clickOnSelecteClass();
		flightTicketDetailsPage.clickOnAddChild();
		flightTicketDetailsPage.clickOnAddInfants();
		flightTicketDetailsPage.showAvailableFlights();
		
		
		mumbaiToDelhiBookFlight.selectMumToDelFlight();
		mumbaiToDelhiBookFlight.selectDelToMumFlight();
		mumbaiToDelhiBookFlight.clickOnbookButton();
		
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
		
		String url = driverTest.getCurrentUrl();
		String title = driverTest.getTitle();
		
		System.out.println(url);
		System.out.println(title);
		
	    String ExtectedTitle =("Mumbai to Delhi Flights - Book Cheap Air Tickets from Mumbai to Delhi @ Paytm");
	    String Expectedurl =("https://tickets.paytm.com/flights/flightSearch/BOM-Mumbai/DEL-Delhi/1/2/1/E/2023-03-30/2023-04-06");
		
	    SoftAssert soft = new SoftAssert();
	    soft.assertEquals(title, ExtectedTitle, "title is wrong");
	    soft.assertEquals(url, Expectedurl, "url is wrong");
	    soft.assertAll();
	    
//		boolean result = url.equals(Expectedurl) && title.equals(ExtectedTitle);
//		if(result ==false) {
//			Assert.fail();
//		}
		
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
		
		driverTest.close() ;
	}
	
	@AfterTest
	public void afterTest() {
		paytmHomePage = null ;
		flightTicketDetailsPage = null ;
		mumbaiToDelhiBookFlight = null ;
		driverTest =null ;
		System.gc();
	}

}

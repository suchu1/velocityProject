package TestNGTestCasePaytm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import paytmPomModule.FlightTicketDetailsPage;
import paytmPomModule.MumbaiToDelhiBookFlight;
import paytmPomModule.PaytmHomePage;

public class BookFlight {
WebDriver driverTest ;
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass");
		
		System.setProperty("webdriver.chrome.driver", "C:\\SUCHIT FOLDER\\VELOCITY\\chromedriver_win32\\chromedriver.exe");
		    driverTest = new ChromeDriver ();
			driverTest.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driverTest.manage().window().maximize();
			driverTest.get("https://paytm.com/");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
		
		driverTest.get("https://paytm.com/");
		PaytmHomePage PaytmHomePage = new PaytmHomePage (driverTest);
		PaytmHomePage.clickOnPaytmForConsumer();
		PaytmHomePage.clickOnTicketBooking();
		PaytmHomePage.clickOnflightTicket();
	}
	
	@Test
	public void test() {
		System.out.println("Test");
		
		FlightTicketDetailsPage flightTicketDetailsPage = new FlightTicketDetailsPage(driverTest);
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
		
		MumbaiToDelhiBookFlight mumbaiToDelhiBookFlight = new MumbaiToDelhiBookFlight(driverTest);
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
		
		if(url.equals(Expectedurl)&& title.equals(ExtectedTitle)) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case failed");
		}
		
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
		
		driverTest.close() ;
	}
	
	
	
}

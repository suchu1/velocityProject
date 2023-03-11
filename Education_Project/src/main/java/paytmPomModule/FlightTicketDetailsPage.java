package paytmPomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightTicketDetailsPage {
	@FindBy (xpath="//label[@for=\"roundTrip\"]")
	private WebElement roundTrip; 
	
	@FindBy (xpath="(//input[@type=\"text\"])[1]")
	private WebElement searchBarFrom;
	
	@FindBy (xpath="(//div[@class=\"_1WIP\"])[1]")
	private WebElement flightFromMum;
	
	@FindBy (xpath="(//input[@type=\"text\"])[2]")
	private WebElement searchBarto; 
	
	@FindBy (xpath="//span[text() = 'Delhi']")
	private WebElement flighToDel;
	
	@FindBy (xpath="//input[@name=\"Departure-Date\"]")
	private WebElement flightDateBar;
	
	@FindBy (xpath="(//div[text() = '30'])[1]")
	private WebElement SelectFlightDate;
	
	@FindBy (xpath="//input[@name='Return-Date']")
	private WebElement searchBarReturnJourney;
	
	@FindBy (xpath="(//div[text() = '6'])[2]")
	private WebElement returnJourneyDate;
	
	@FindBy (xpath="(//input[@id=\"text-box\"])[3]")
	private WebElement SelecteClass;
	
	@FindBy (xpath="(//div[@class=\"olTz _3wE8\"])[1]")
	private WebElement addAdult;
	
	@FindBy (xpath="(//div[@class=\"olTz _3wE8\"])[2]")
	private WebElement addChild;
	
	@FindBy (xpath="(//div[@class=\"olTz _3wE8\"])[3]")
	private WebElement addInfants;
	
	@FindBy (xpath="//button[text() = 'Search']")
	private WebElement searchButton;
	
	//constructor
	public FlightTicketDetailsPage (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//method
	public void clickOnroundTrip() {
		roundTrip.click();
	}
	
	public void clickOnsearchBarFrom() {
		searchBarFrom.click();
		searchBarFrom.sendKeys("mumbai");
	}
	
	public void clickflightFromMum() {
		flightFromMum.click();
	}
	
	public void clicksearchBarto() {
		searchBarto.click();
		searchBarto.sendKeys("delhi");
	}
	
	public void clickflightToDel() {
		flighToDel.click();
	}
	
	public void clickOnFlightDateBar() {
		flightDateBar.click();
	}
	
	public void clickOnFlightDate() {
		SelectFlightDate.click();
	}
	
	public void clickOnSearchBarReturnJourney() {
		searchBarReturnJourney.click();
		searchBarReturnJourney.click();
	}
	
	public void clickOnReturnJourneyDate() {
		returnJourneyDate.click();
	}
	
	public void clickOnSelecteClass() {
		SelecteClass.click();
	}
	
	public void clickOnAddChild() {
		addChild.click();
		addChild.click();
	}
	
	public void clickOnAddInfants() {
		addInfants.click();
	}
	
	public void showAvailableFlights() {
		searchButton.click();
	}
	
	
}

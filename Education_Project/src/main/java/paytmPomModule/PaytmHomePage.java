package paytmPomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaytmHomePage {
	private Actions act ;
	private WebDriver driver;
	
	@FindBy (xpath="//a[text() = 'Paytm for Consumer']")
	private WebElement paytmForConsumer;
	
	@FindBy (xpath="//a[text() = 'Ticket booking']")
	private WebElement ticketBooking;
	
	@FindBy (xpath="//a[text() = 'Flight Tickets']")
	private WebElement flightTicket; // by using mouse action
	
	@FindBy (xpath="(//div[@class=\"_2EGQY\"])[5]")
	private WebElement buyInssurance;
	
	@FindBy (xpath="(//div[text() = 'Recharge'])[1]")
	private WebElement prepaidMobilerecharge;

	
	
	//constructor
	public PaytmHomePage (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver =driver ;
		act= new Actions(driver);
	}
	
	//methods
	public void clickOnPaytmForConsumer() {
		paytmForConsumer.click();
	}
	
	public void clickOnTicketBooking() {
		act.moveToElement(ticketBooking).click().build().perform();
		
	}
	
	public void clickOnflightTicket() {
		
		act.moveToElement(flightTicket).click().build().perform();
	}
	
	public void openBuyInsurancePage() {
		buyInssurance.click();
	}
	
	public void clickOnprepaidMobilerecharge() {
		prepaidMobilerecharge.click();
	}
	

}

package paytmPomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightTicket_ConfirmPage {
	@FindBy (xpath="//button[text() = 'Continue']")
	private WebElement continueButton;//switch window
	
	//constructor
	public FlightTicket_ConfirmPage (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//method
	public void clickcontinueButton() {
		continueButton.click();
	}

}





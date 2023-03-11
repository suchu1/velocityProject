package pomFacebookModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrivacyDetailsPage {
	WebDriver driver ;
	private Actions act;

	
	@FindBy (xpath = "(//span[text() = 'Privacy Policy'])[1]")
	private WebElement privacyPolicy;
	
	
	public PrivacyDetailsPage (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		act = new Actions(driver);
	}
	public void clickOnprivacyPolicy() {
		privacyPolicy.click();
	}
}

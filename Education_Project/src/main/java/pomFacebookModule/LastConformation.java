package pomFacebookModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LastConformation {
	private WebDriver driver;
	private Actions act ;

	@FindBy (xpath = "//span[text() = 'Continue']")
	private WebElement lcontinue ;
	
	public LastConformation (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		act = new Actions(driver);
	}
	
	//methods
	public void ClickOncontinue() {
		lcontinue.click();
	}
}

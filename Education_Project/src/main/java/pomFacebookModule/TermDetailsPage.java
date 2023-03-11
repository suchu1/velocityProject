package pomFacebookModule;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TermDetailsPage {
	WebDriver driver ;
	private Actions act;

	
	@FindBy (xpath = "//a[text() = ' 1. The services we provide ']")
	private WebElement serviceWeProvide;
	
	
	public TermDetailsPage (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		act = new Actions(driver);
	}
	public void serviceWeProvideButton() {
		serviceWeProvide.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	



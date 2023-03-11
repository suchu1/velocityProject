package amazonePomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileOptions {

	@FindBy (xpath="//span[text() = 'realme 9 Pro 5G (Midnight Black, 6GB RAM, 128GB Storage)']")
	private WebElement realMePro;
	
	

	
	//constructor
	public MobileOptions (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//methods
	public void clickOnRealMePro() {
		realMePro.click();
	}
	
}

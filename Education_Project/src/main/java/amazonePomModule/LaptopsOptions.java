package amazonePomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaptopsOptions {
	
	@FindBy (xpath="(//div[@class=\"sg-col-inner\"])[4]")
	private WebElement firstLaptop;

	@FindBy (xpath="(//div[@class=\"sg-col-inner\"])[5]")
	private WebElement windowShift;

	
	//constructor
	public LaptopsOptions (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//methods
	public void clickOnFirstLaptop() {
	firstLaptop.click();
	}
	
	public void clickOnwindowShift() {
	windowShift.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

package paytmPomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TypesOfInsurances {
	
	@FindBy (xpath="(//div[contains(@class, \"homebnr__itemT\")])[4]")
	private WebElement healthInsurance; 
	
	@FindBy (xpath="//img[@alt='Paytm Term Insurance']")
	private WebElement termInsurance; 
	
	public TypesOfInsurances (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnhealthInsurance() {
		healthInsurance.click();;
	}
	
	public void clickOnTermInsurance() {
		termInsurance.click();
	}
	
	
	
}

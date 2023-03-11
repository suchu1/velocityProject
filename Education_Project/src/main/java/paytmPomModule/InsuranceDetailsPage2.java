package paytmPomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsuranceDetailsPage2 {
	
	@FindBy (xpath="//input[@id=\"ageTextBox\"]")
	private WebElement age;
	
	@FindBy (xpath="//input[@id=\"pincode\"]")
	private WebElement pincode;
	
	@FindBy (xpath="//button[text() = 'Get quotes']")
	private WebElement getQuotesButton;
	
	//constructor
	public InsuranceDetailsPage2 (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	
	public void clickOnAge(String agenum) {
		age.click();
		age.sendKeys(agenum);
		
	}
	
	public void clickOnPincode(String pcode ) {
		
		pincode.click();
		pincode.sendKeys(pcode);
	}
	
	public void clickOnGetQuotesButton() {
		getQuotesButton.click();
		
		
		
	}
	
	
	
	
	

}

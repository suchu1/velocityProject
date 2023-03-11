package amazonePomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAccountPage {

	@FindBy (xpath = "//input[@type=\"text\"]")
	private WebElement firLasName;
	
	@FindBy (xpath = "//input[@id=\"ap_phone_number\"]")
	private WebElement phoneNum; 
	
	@FindBy (xpath = "//input[@type=\"password\"]")
	private WebElement password ; 
	
	@FindBy (xpath = "//input[@id='continue']")
	private WebElement continueButton ; 
	
	public CreateNewAccountPage (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//methods
	
	public void enterFirLasName(String Fname) {
		firLasName.click();
		firLasName.sendKeys(Fname);
	}
	
	public void enterPhoneNum(String phoNum) {
		phoneNum.click();
		phoneNum.sendKeys(phoNum);
	}
	
	public void enterPassword(String mail) {
		password.click();
		password.sendKeys(mail);
	}
	
	public void clickOnContinueButton() {
		continueButton.click();
		
	}
	
	
	
	
	
	
	
	
	
}

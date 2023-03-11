package amazonePomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazoneRegistrationForm {
	
	@FindBy (xpath = "//input[@type='text']")
	private WebElement firstName; 

	@FindBy (xpath = "//input[@autocomplete='tel']")
//	@FindBy (xpath = "//input[@autocomplete='tel']11111111")
	private WebElement phoneNum; 
	
	@FindBy (xpath = "//input[@type='email']")
	private WebElement email;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement password; 
	
	@FindBy (xpath = "//input[@id='continue']")
	private WebElement continueButton; 
	
	
	
	public AmazoneRegistrationForm (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//methods
	
	public void enterFirstName(String Fname) {
		firstName.click();
		firstName.sendKeys(Fname);
	}
	
	public void enterPhoneNum(String phoNum) {
		phoneNum.click();
		phoneNum.sendKeys(phoNum);
	}
	
	public void enterEmail(String mail) {
		email.click();
		email.sendKeys(mail);
	}
	
	public void enterPassword(String pass) {
		password.click();
		password.sendKeys(pass);
	}
	
	public void clickOnContinueButton() {
		continueButton.click();
	}
}

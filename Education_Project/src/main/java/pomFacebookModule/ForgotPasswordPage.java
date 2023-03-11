package pomFacebookModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
	
	@FindBy (xpath = "//table//tr[1]//td[2]//div")
	private WebElement forgotMessage ;
	
	@FindBy (xpath = "//input[@ id='identify_email']")
	private WebElement emailOrMobileNum ;
	
	@FindBy (xpath = "//button[@id='did_submit']")
	private WebElement searchButton ;
	
	@FindBy (xpath = "//a[text() = 'Cancel']")
	private WebElement cancelButton ;
	
	@FindBy (xpath = "(//input [@ name='email'])[1]")
	private WebElement headerEmail ;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement headerPassword ;
	
	@FindBy (xpath = "(//span[text() = 'Log in'])[2]")
	private WebElement headerLogin ;
	
	@FindBy (xpath = "//a[text() = 'Forgotten account?']")
	private WebElement headerForgottenAccount ;              //here switching window is happening.
	
	public ForgotPasswordPage (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//methods
	
	public String getTextMethod() {
		String text = forgotMessage.getText();
		System.out.println(text);
		return text ;
	}
	
	public void enterEmailOrMobileNum(String email) {
		emailOrMobileNum.click();
		emailOrMobileNum.sendKeys(email);
	}
	
	public void clickOnSearchButton() {
		searchButton.click();
	}
	
	public void clickOnCancelButton() {
		cancelButton.click();
	}
	
	public void clickOnHeaderEmail() {
		headerEmail.click();
		headerEmail.sendKeys("suchitsalvi@gmail.com");
	}
	
	public void clickOnHeaderPassword() {
		headerPassword.click();
		headerPassword.sendKeys("suchit@123");
	}
	
	public void clickOnHeaderLogin() {
		headerLogin.click();
	}
	
	public void clickOnheaderForgottenAccount() {
		headerForgottenAccount.click();
	}
	
	
	
	
	
	
	

}

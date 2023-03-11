package pomFacebookModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignUpPage {
	@FindBy (xpath = "//input[@id='email']")
	private WebElement userName;
	
	@FindBy (xpath = "//input[@id='pass']")
	private WebElement password;
	
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement loginButton;
	
	@FindBy (xpath = "//a[text() = 'Forgotten password?']")
	private WebElement forgotPasswordLink;
	
	@FindBy (xpath = "//a[text() = 'Create new account']")
	private WebElement createNewAcc;
	
	@FindBy (xpath = "//a[text() = 'Create a Page']")
	private WebElement CreateNewPage;
	
	//constructor
	public LoginOrSignUpPage (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	public void sendUserName(String user) {
        userName.sendKeys(user);
	}	
	
	
	public void sendPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	public void clickOnForgotpasswordLink() {
		forgotPasswordLink.click();
	}
	
	public void openSignUpPage() {            // public void clickOnCreateNewAccount()
		createNewAcc.click();
	}
	
	public void clickOnCreateNewPageLink() {
		CreateNewPage.click();
	}
	
	
	

}

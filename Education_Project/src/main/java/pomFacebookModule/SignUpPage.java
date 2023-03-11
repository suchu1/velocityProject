package pomFacebookModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
	
	private WebDriver driver;
	private Actions act ;
	
	@FindBy (xpath = "//input[@name='firstname']")
	private WebElement firsName;
	
	@FindBy (xpath = "//input[@name='lastname']")
	private WebElement surName;
	
	@FindBy (xpath = "//input[@name='reg_email__']")
	private WebElement mobileNum;
	
	@FindBy (xpath = "//input[@autocomplete='new-password']")
	private WebElement password;
	
	@FindBy (xpath = "//select[@id='day']")
	private WebElement birthDate;
	
	@FindBy (xpath = "//select[@id='month']")
	private WebElement birthMonth;
	
	@FindBy (xpath = "//select[@id='year']")
	private WebElement birthYear;
	
	@FindBy (xpath = "//label[text() = 'Male']")
	private WebElement radioButtonMale;
	
	@FindBy (xpath = "//label[text() = 'Female']")
	private WebElement radioButtonFemale;
	
	@FindBy (xpath = "(//a[text()= 'Terms'])[2]")
	private WebElement terms;
	
	@FindBy (xpath = "(//a[text()= 'Privacy Policy'])[2]")
	private WebElement privacyPolicy;
	
	@FindBy (xpath = "//a[text()= 'Cookies Policy']")
	private WebElement cookiesPolicy;
	
	@FindBy (xpath = "(//button[text() = 'Sign Up'])[1]")
	private WebElement signUpButton;
	
	
	
	
	//a[text() = ' 1. The services we provide ']
	
	
	
	//constructor
	public SignUpPage (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		act = new Actions(driver);
	}
	
	//methods
	public void enterFirstName(String fName) {
		firsName.click();
		firsName.sendKeys(fName);
		
	}
	
	public void enterSurName(String sName) {
		surName.sendKeys(sName);
	}
	
	
	public void enterMobNum(String MobNum) {
		mobileNum.sendKeys(MobNum);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void selectGender() {
		radioButtonMale.click();
	}
	
	public void selectDateOfBirth(String name) {
	    Select s = new Select (birthDate);
		s.selectByVisibleText("6");
	}
	
	public void selectBirthMonth(String month) {
	    Select s = new Select (birthMonth);
		s.selectByVisibleText("Sep");
	}
	
	public void selectBirthYear(String year) {
	    Select s = new Select (birthYear);
		s.selectByVisibleText("1998");
	}
	
	public void clickOnTermsButtonLink() {
		terms.click();
	}
	
	public void clickOnPrivacyPolicyLink() {
		privacyPolicy.click();
	}
	
	public void clickOnCookiesPolicyLink() {
		cookiesPolicy.click();
	}
	
	public void clickOnSignUpButton() {
		signUpButton.click();
	}
	
	
	
	
	
	
	
}
	




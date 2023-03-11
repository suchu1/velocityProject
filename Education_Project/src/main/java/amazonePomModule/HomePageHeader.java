package amazonePomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageHeader {
	private Actions act ;
	private WebDriver  driver ;
	@FindBy (xpath = "//input[@type='text']")
	private WebElement search;     
	
	@FindBy (xpath = "//input[@type='submit']")
	private WebElement searchbutton; 

	@FindBy (xpath = "(//a[@tabindex=\"0\"])[3]")
	private WebElement signIn;     
	
	@FindBy (xpath = "(//span[text() = 'Sign in'])[1]")
	private WebElement signInpage;  
	
	@FindBy (xpath = "(//a[text() ='Start here.'])[1]")
	private WebElement startHere; 
	
	@FindBy (xpath = "//a[contains(@data-csa-c-content-id, 'nav_cs_gb')]")
	private WebElement todaysDeals; 
	
	
	public HomePageHeader (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver =driver;
		act = new Actions(driver);
	}
	
	//methods
	
	public void clickonSearch(String Name) {
		search.click();
		search.sendKeys(Name);
	}
	
	public void clickonSearchButton() {
		searchbutton.click();	
	}
	
	public void MoveTosignIn() {
		act.moveToElement(signIn);
	}
	
	public void clickonSignInPage() {
		signInpage.click();
		act.moveToElement(signInpage).click().build().perform();
	}
	
	public void clickonStartHere() {
		startHere.click();
   }
	
	public void clickonTodaysDeals() {
		todaysDeals.click();
   }
	
	
	
	
	
	
	
	
	
	
	
	
	
}

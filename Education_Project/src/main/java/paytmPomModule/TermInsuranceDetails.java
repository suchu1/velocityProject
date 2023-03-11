package paytmPomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TermInsuranceDetails {
	@FindBy (xpath = "//label[@for='dob-day']")
	private WebElement date ;
	
	@FindBy (xpath = "//label[text() = 'MM']")
	private WebElement month ;
	
	@FindBy (xpath = "//label[text() = 'YYYY']")
	private WebElement year ;
	
	@FindBy (xpath = "//span[text() = 'Male']")
	private WebElement gender ;
	
	@FindBy (xpath = "//input[@id='annual_income']")
	private WebElement incomeDropdown ;
	
	@FindBy (xpath = "//li[@data-test='₹ 2.5-3 Lakhs']")
	private WebElement Selectincome ;
	
	@FindBy (xpath = "//button[text() = 'Proceed']")
	private WebElement proceedbutton ;
	 
	public TermInsuranceDetails (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterDate() {
		date.click();
		date.sendKeys("06");
	}
	
	public void enterMonth() {
		month.click();
		month.sendKeys("08");
	}
	
	public void enterYear() {
		year.click();
		year.sendKeys("1996");
	}
	
	public void clickOnGender(){
		gender.click();
	}
		
	public void clickOnIncomeDropDown() {
		incomeDropdown.click();
	}
	
	public void clickOnIncome() {
		Selectincome.click();
	}
	
	public void clickOnProceedbutton() {
		proceedbutton.click();
	}
	
			
		
	}
	
	
	
	
	
	
	
	
	
	


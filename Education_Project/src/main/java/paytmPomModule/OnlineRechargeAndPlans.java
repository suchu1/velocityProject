package paytmPomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OnlineRechargeAndPlans {
	private WebDriver driver ;    
	private Actions act ;

	
	@FindBy (xpath="//label[text() = 'Prepaid']")
	private WebElement prepaid; 
	
	@FindBy (xpath="//label[text() = 'Postpaid']")
	private WebElement postpaid;
	
	@FindBy (xpath="(//input[@autocomplete=\"new-password\"])[1]")
	private WebElement mobileNum; 
	
	@FindBy (xpath="(//input[@type=\"text\"])[1]")
	private WebElement operator; 
	
	@FindBy (xpath="(//input[@autocomplete=\"new-password\"])[2]")
	private WebElement amount; 
	
	@FindBy (xpath="//button[text() = 'Proceed to Recharge']")
	private WebElement proceedsRecharge; 
	
	@FindBy (xpath="//div[text() = 'Data Add on']")
	private WebElement dataAddonPlan;
	
	// MOUSE ACTIONS
	@FindBy (xpath="//button[text() = 'Rs. 15']")
	private WebElement dataAddonAmount; // MOUSE ACTION
	
	@FindBy (xpath="//div[text() = 'Smart Phone']")
	private WebElement smartphonePlan;
	
	@FindBy (xpath="//button[text() = 'Rs. 719']")
	private WebElement smartPhoneAmount;
	
	@FindBy (xpath="//div[text() = 'JioPhone']")
	private WebElement jioPhonePlan;
	
	@FindBy (xpath="//button[text() = 'Rs. 86']")
	private WebElement jioPhonePlanAmount;
	
	@FindBy (xpath="//div[text() = 'Cricket Packs']")
	private WebElement cricketPacksPlan;
	
	@FindBy (xpath="//button[text() = 'Rs. 25']")
	private WebElement cricketPacksAmount;
	
	@FindBy (xpath="//div[text ()=\"2G/3G/4G Data\"]")
	private WebElement datapack;
	
	@FindBy (xpath="//button[text() = 'Rs. 401']")
	private WebElement dataAmount;
	
	
	
	//constructor
	public OnlineRechargeAndPlans (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver = driver ;
		act= new Actions (driver);
	}
	
	//methods
	public void clickOnPrepaid() { 
		prepaid.click();    //
	}
	
	public void clickOnPostpaid() {
		WebDriverWait wait = new WebDriverWait (driver, 3);
		wait.until( ExpectedConditions.visibilityOf(postpaid));
		postpaid.click();    //IwasAppliedTheExplicitWait
	}
	
	public void enterMobileNum(String Mob) {
		mobileNum.click(); 
		mobileNum.sendKeys(Mob);
	}
	
	public void clickOnOperator() {
		operator.click(); 
	}
	
	public void enterAmount(String rechargeamount) {
		amount.click(); 
		amount.sendKeys(rechargeamount);
	}
	
	public void proceedsrechargeButt() {
		proceedsRecharge.click(); 
	}

	// MOUSE ACTIONS
	public void ClickOnDataAddon() {
		dataAddonPlan.click(); 
	}
	
	public void ClickOnDataAddonAmount() {
		act.moveToElement(dataAddonAmount).click().build().perform();
	}
	
	public void ClickOnSmartphonePlan() {
		act.moveToElement(smartphonePlan).click().build().perform();
	}
	
	public void ClickOnsmartPhoneAmount() {
		act.moveToElement(smartPhoneAmount).click().build().perform();
	}
	
	public void ClickOnJioPhonePlan() {
		act.moveToElement(jioPhonePlan).click().build().perform();
	}
	
	public void ClickOnJioPhonePlanAmount() {
		act.moveToElement(jioPhonePlanAmount).click().build().perform();

	}
	
	public void ClickOnCricketPacksPlan() { 
		act.moveToElement(cricketPacksPlan).click().build().perform();

	}
	
	public void ClickOnCricketPacksAmount() {
		act.moveToElement(cricketPacksAmount).click().build().perform();
		
	}

	public void ClickOnDatapack() {
		act.moveToElement(datapack).click().build().perform();
		
	}
	
	public void ClickOnDataAmount() {
		act.moveToElement(dataAmount).click().build().perform();
		
	}
	
}

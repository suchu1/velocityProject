package paytmPomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MumbaiToDelhiBookFlight {
	WebDriver driver ;

	@FindBy (xpath="(//div[@class=\'Gsik row top-xs\'])[4]")
	private WebElement MumToDelFlight; //explicit wait
	
	@FindBy (xpath="(//div[text() = '06:30'])[2]")
	private WebElement DelToMumFlight;
	
	@FindBy (xpath="//button[text() = 'Book ']")
	private WebElement bookButton;
	
	//constructor
	public MumbaiToDelhiBookFlight (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver = driver ;
	}
	
	//method
	
	public void selectMumToDelFlight() {
		WebDriverWait Wait = new WebDriverWait(driver,3);
		Wait.until(ExpectedConditions.visibilityOf(MumToDelFlight));
		MumToDelFlight.click();
	}
	
	public void selectDelToMumFlight() {
		DelToMumFlight.click();
	}
	
	public void clickOnbookButton() {
		bookButton.click();
	}
	
	
}

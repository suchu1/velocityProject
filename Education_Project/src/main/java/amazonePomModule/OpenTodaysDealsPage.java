package amazonePomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenTodaysDealsPage {

	@FindBy (xpath="//span[text() ='₹500 to ₹1,000']")
	private WebElement filter;
	
	@FindBy (xpath="(//div[contains(@class, '_yh4IHtuaWk')])[1]")
	private WebElement firstProduct;
	
	//constructor
	public OpenTodaysDealsPage (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//methods
	public void applyFilter() {
		filter.click();
	}
	
	public void clickOnFirstProduct() {
		firstProduct.click();
	}
	
	
}

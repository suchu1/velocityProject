package amazonePomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaptopDetaiils {
	@FindBy (xpath="//input[@id='add-to-cart-button']")
	private WebElement cart;

	@FindBy (xpath="(//input[@class=\"a-button-input\"])[38]")
	private WebElement checkOut;
	
	//constructor
	public LaptopDetaiils (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//methods
	public void clickOnCart() {
		cart.click();
	}
	
	public void clickOnCheckOut() {
		checkOut.click();
	}
	

}

package amazonePomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilePage {
	
	@FindBy (xpath="//a[@title='Add to Wish List']")
	private WebElement addTowishlist;

	
	//constructor
	public MobilePage (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//methods
	public void clickOnaddToWishList() {
		addTowishlist.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

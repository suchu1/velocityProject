package amazonePomModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstOfferDetails {

	@FindBy (xpath="(//div[@class='a-section octopus-dlp-image-shield'])[1]")
	private WebElement firstOfferProduct;
	
	@FindBy (xpath="//input[@id='add-to-cart-button']")
	private WebElement addToCartButton;
	
	@FindBy (xpath="//span[@id='attachSiNoCoverage']")
	private WebElement skipButton;
	
	@FindBy (xpath="//input[@value='Proceed to checkout']")
	private WebElement proceedsToBuy;
	
	
	
	
	//constructor
	public FirstOfferDetails (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//methods
	public void clickOnaddToCartButton() {
		addToCartButton.click();
	}
	
	public void clickOnFirstOfferProduct() {
		firstOfferProduct.click();
	}
	
	public void clickOnSkipButton() {
		skipButton.click();
	}
	
	//new page
	
	public void clickOnProceedsToBuy() {
		proceedsToBuy.click();
	}
	
	
	
	
	
}

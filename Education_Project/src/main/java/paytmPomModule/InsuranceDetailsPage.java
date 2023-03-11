package paytmPomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsuranceDetailsPage {
	
	@FindBy (xpath="//span[@class='app-dialog__close']")
	private WebElement cancelPopUpWindow; 
	
	@FindBy (xpath="//span[text() = 'Male']")
	private WebElement selectGender;
	
	@FindBy (xpath="(//img[@class=\"app-img__tag is-loaded\"])[1]")
	private WebElement selectImage;
	
	@FindBy (xpath="//button[contains(@class,\"btn btn--b\")]")
	private WebElement proceedButton;
	
	//constructor
	
	public InsuranceDetailsPage (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	
	public void clickOnCancelPopUpWindow() {
		cancelPopUpWindow.click();
	}
	
	public void clickOnSelectGender() {
		selectGender.click();
	}
	
	public void selectGenderImage() {
		selectImage.click();
	}

	public void clickOnProceedButton() {
		proceedButton.click();
	}

}

package pomFacebookModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FunctionsOfFacebook {
	@FindBy (xpath = "(//div[@class='x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z'])[1]")
	private WebElement myprofile ;
	
	@FindBy (xpath = "//span[text() = 'Log Out']")
	private WebElement logout ;
	
	@FindBy (xpath = "//input[@placeholder='Search Facebook']")
	private WebElement searchButton ;
	
	@FindBy (xpath = "//span[text() = 'Search for ']")
	private WebElement searchForResult ;
	
	@FindBy (xpath = "(//span[text() = 'Add friend'])[1]")
	private WebElement addFriend ;
	
	@FindBy (xpath = "(//span[@class='x10l6tqk x11f4b5y x1v4kod4'])[1]")
	private WebElement randomButton ;
	
	
	
	public FunctionsOfFacebook (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnMyprofile() {
		myprofile.click();
	}
	
	public void clickOnlogout() {
		logout.click();
	}
	
	public void clickOnSearchButton(String name) {
		searchButton.click();
		searchButton.sendKeys(name);
	}
	
	public void clickOnSearchForResult() {
		searchForResult.click();
	}
	
	public void clickOnAddFriend() {
		addFriend.click();
	}
	
	public void clickOnRandomButton() {
		randomButton.click();
	}
	

}

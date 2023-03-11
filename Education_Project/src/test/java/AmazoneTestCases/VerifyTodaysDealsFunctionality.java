package AmazoneTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import amazonePomModule.FirstOfferDetails;
import amazonePomModule.HomePageHeader;
import amazonePomModule.OpenTodaysDealsPage;

public class VerifyTodaysDealsFunctionality {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\SUCHIT FOLDER\\VELOCITY\\chromedriver_win32\\chromedriver.exe");
		
        WebDriver driverTest = new ChromeDriver ();
	    driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		driverTest.get("https://www.amazon.in/");
	
		HomePageHeader homePageHeader = new HomePageHeader(driverTest);
		homePageHeader.clickonTodaysDeals();
		
		OpenTodaysDealsPage openTodaysDealsPage = new OpenTodaysDealsPage(driverTest);
		openTodaysDealsPage.applyFilter();
		openTodaysDealsPage.clickOnFirstProduct();
		
		FirstOfferDetails firstOfferDetails = new FirstOfferDetails (driverTest);
		firstOfferDetails.clickOnFirstOfferProduct();
		firstOfferDetails.clickOnaddToCartButton();
	     //change it to explicit wait
		//firstOfferDetails.clickOnSkipButton();
		firstOfferDetails.clickOnProceedsToBuy();
		driverTest.close();
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}

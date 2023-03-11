package AmazoneTestCases;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import amazonePomModule.HomePageHeader;
import amazonePomModule.LaptopDetaiils;
import amazonePomModule.LaptopsOptions;

public class VerifyAddToCartFunctionality {
private WebDriver driver ;
public static void main(String[] args) {
	
        System.setProperty("webdriver.chrome.driver", "C:\\SUCHIT FOLDER\\VELOCITY\\chromedriver_win32\\chromedriver.exe");
		
        WebDriver driverTest = new ChromeDriver ();
	    driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		driverTest.get("https://www.amazon.in/");
		
		HomePageHeader homePageHeader = new HomePageHeader (driverTest) ;
		homePageHeader.clickonSearch("laptops under 40000");
		homePageHeader.clickonSearchButton();
		
		LaptopsOptions laptopsOptions = new LaptopsOptions(driverTest);
		laptopsOptions.clickOnFirstLaptop();
		laptopsOptions.clickOnwindowShift();
		
		ArrayList<String> windowchange = new ArrayList<String> (driverTest.getWindowHandles());
		driverTest.switchTo().window(windowchange.get(1));
		
		LaptopDetaiils laptopDetaiils = new LaptopDetaiils (driverTest);
		laptopDetaiils.clickOnCart();
		laptopDetaiils.clickOnCheckOut();
		
		driverTest.close();
		driverTest.switchTo().window(windowchange.get(0));
		
		driverTest.navigate().back();
		String title = driverTest.getTitle();
		String Url = driverTest.getCurrentUrl();
		
		System.out.println(title);
		System.out.println(Url);
		
		String ExpectedTitle = ("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		String ExpectedUrl = ("https://www.amazon.in/");
		
		if(title.equals(ExpectedTitle)&& Url.equals(ExpectedUrl)) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case failed");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

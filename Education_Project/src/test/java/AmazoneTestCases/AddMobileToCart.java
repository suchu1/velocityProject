package AmazoneTestCases;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import amazonePomModule.HomePageHeader;
import amazonePomModule.MobileOptions;
import amazonePomModule.MobilePage;
import utils.Utility;

public class AddMobileToCart {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\SUCHIT FOLDER\\VELOCITY\\chromedriver_win32\\chromedriver.exe");
			
	        WebDriver driverTest = new ChromeDriver ();
		    driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driverTest.manage().window().maximize();
			driverTest.get("https://www.amazon.in/");
			
			HomePageHeader homePageHeader = new HomePageHeader (driverTest) ;
		    //String username = Utility.getDataFromExcel("test dadta", 1, 0);
		    homePageHeader.clickonSearch("real me 9 pro");
			homePageHeader.clickonSearchButton();
			
			MobileOptions mobileOptions = new MobileOptions(driverTest);
			mobileOptions.clickOnRealMePro();
			
			ArrayList<String> windowchange = new ArrayList<String> (driverTest.getWindowHandles());
			driverTest.switchTo().window(windowchange.get(1));
			
			MobilePage mobilePage = new MobilePage (driverTest) ;
			mobilePage.clickOnaddToWishList();
			
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

package paytmTestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import paytmPomModule.PaytmHomePage;
import paytmPomModule.TermInsuranceDetails;
import paytmPomModule.TypesOfInsurances;

public class VerifyTermLifeInsuranceFunctionality {
	
public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\SUCHIT FOLDER\\VELOCITY\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driverTest = new ChromeDriver ();
		driverTest.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		driverTest.get("https://paytm.com/");
		
		PaytmHomePage paytmHomePage = new PaytmHomePage(driverTest);
		paytmHomePage.openBuyInsurancePage();
		
		TypesOfInsurances typesOfInsurances = new TypesOfInsurances (driverTest);
		typesOfInsurances.clickOnTermInsurance();
		
		TermInsuranceDetails termInsuranceDetails =new TermInsuranceDetails(driverTest) ;
	/*	termInsuranceDetails.enterDate();
		termInsuranceDetails.enterMonth();
		termInsuranceDetails.enterYear();*/
		termInsuranceDetails.clickOnGender();
		termInsuranceDetails.clickOnIncomeDropDown();
		termInsuranceDetails.clickOnIncome();
		termInsuranceDetails.clickOnProceedbutton();
		
		
		String title = driverTest.getTitle();
		String url = driverTest.getCurrentUrl();
		System.out.println(title);
		System.out.println(url);
		
		String Expectedtitle = ("Insurance");
		String Expectedurl = ("https://paytminsurance.co.in/life-product/term/pre-quote?utm_source=paytminsurance_website&utm_medium=content_pages&utm_campaign=home_screen");
		
		if(title.equals(Expectedtitle) && url.equals(Expectedurl)) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case failed");
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}

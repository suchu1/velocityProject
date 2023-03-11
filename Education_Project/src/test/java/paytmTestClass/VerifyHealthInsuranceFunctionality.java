package paytmTestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import paytmPomModule.InsuranceDetailsPage;
import paytmPomModule.InsuranceDetailsPage2;
import paytmPomModule.PaytmHomePage;
import paytmPomModule.TypesOfInsurances;

public class VerifyHealthInsuranceFunctionality {
public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\SUCHIT FOLDER\\VELOCITY\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driverTest = new ChromeDriver ();
		driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		driverTest.get("https://paytm.com/");
		
		PaytmHomePage paytmHomePage = new PaytmHomePage(driverTest);
		paytmHomePage.openBuyInsurancePage();
		
		TypesOfInsurances typesOfInsurances = new TypesOfInsurances (driverTest);
		typesOfInsurances.clickOnhealthInsurance();
		
		InsuranceDetailsPage insuranceDetailsPage = new InsuranceDetailsPage(driverTest);
		insuranceDetailsPage.clickOnCancelPopUpWindow();
		insuranceDetailsPage.clickOnSelectGender();
		insuranceDetailsPage.selectGenderImage();
		insuranceDetailsPage.clickOnProceedButton();
		
		InsuranceDetailsPage2 insuranceDetailsPage2 = new InsuranceDetailsPage2 (driverTest);
		insuranceDetailsPage2.clickOnAge("24");
		insuranceDetailsPage2.clickOnPincode("415639");
		insuranceDetailsPage2.clickOnGetQuotesButton();
		
		String title = driverTest.getTitle();
		String url = driverTest.getCurrentUrl();
		System.out.println(title);
		System.out.println(url);
		
		String Expectedtitle = ("Insurance");
		String Expectedurl = ("https://paytminsurance.co.in/health-product/general/member-info");
		
		if(title.equals(Expectedtitle) && url.equals(Expectedurl)) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case failed");
		}
		
		
		
}
}

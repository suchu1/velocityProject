package TestNGTestCasePaytm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import paytmPomModule.InsuranceDetailsPage;
import paytmPomModule.InsuranceDetailsPage2;
import paytmPomModule.PaytmHomePage;
import paytmPomModule.TermInsuranceDetails;
import paytmPomModule.TypesOfInsurances;

public class BuyInsuranceLifeAndTerm {
	WebDriver driverTest ;
	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass");
		System.setProperty("webdriver.chrome.driver", "C:\\SUCHIT FOLDER\\VELOCITY\\chromedriver_win32\\chromedriver.exe");
		 driverTest = new ChromeDriver ();
		driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
		driverTest.get("https://paytm.com/");
		PaytmHomePage paytmHomePage = new PaytmHomePage (driverTest);
		paytmHomePage.openBuyInsurancePage();
	}
	
	@Test
	public void test1() {
		System.out.println("Test");
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
		
		@Test
		public void test2() {
			System.out.println("Test");
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
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
		
		driverTest.navigate().back();
		driverTest.navigate().back();	
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
		driverTest.close();
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

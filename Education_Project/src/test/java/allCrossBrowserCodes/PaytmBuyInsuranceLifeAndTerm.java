package allCrossBrowserCodes;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base.Browser;
import paytmPomModule.InsuranceDetailsPage;
import paytmPomModule.InsuranceDetailsPage2;
import paytmPomModule.PaytmHomePage;
import paytmPomModule.TermInsuranceDetails;
import paytmPomModule.TypesOfInsurances;

public class PaytmBuyInsuranceLifeAndTerm extends Browser {
	private WebDriver driverTest ;
	private PaytmHomePage paytmHomePage ;
	private TypesOfInsurances typesOfInsurances ;
	private InsuranceDetailsPage insuranceDetailsPage ;
	private InsuranceDetailsPage2 insuranceDetailsPage2 ;
	private TermInsuranceDetails termInsuranceDetails ;
	String testID ;
	private static ExtentHtmlReporter reporter ;
	
	@Parameters("CrossBrowser")
	@BeforeTest
	//here I have put the thread.sleep i need to change that by using the explicit wait
	public void launchBrowser(String browser){     //String browser
		reporter = new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		System.out.println("@BeforeTest"); //"@BeforeTest"
		//String browser = "Chrome";
		
		if(browser.equals("Chrome")) {
			driverTest = OpenChromeBrowser();
		}
		 
		if(browser.equals("Firefox")) {
			driverTest=	OpenFirefoxBrowser();
		}
		 
		/* if(browser.equals("Opera")) {
			 System.setProperty("webdriver.gecko.driver", "C:\\SUCHIT FOLDER\\VELOCITY\\geckodriver-v0.32.2-win-aarch64");
			 driverTest = new OperaDriver () ;
		 }*/
			
		driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		}
	
	@BeforeClass
	 
	public void createPomObject() {
		paytmHomePage = new PaytmHomePage (driverTest);
		typesOfInsurances = new TypesOfInsurances (driverTest);
		insuranceDetailsPage = new InsuranceDetailsPage(driverTest);
		insuranceDetailsPage2 = new InsuranceDetailsPage2 (driverTest);
        termInsuranceDetails = new TermInsuranceDetails(driverTest);
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod");
		driverTest.get("https://paytm.com/");
		paytmHomePage.openBuyInsurancePage();
	}
	
	@Test
	public void test1() {
		System.out.println("Test");
		testID = "T101";
		typesOfInsurances.clickOnhealthInsurance();
		
		insuranceDetailsPage.clickOnCancelPopUpWindow();
		insuranceDetailsPage.clickOnSelectGender();
		insuranceDetailsPage.selectGenderImage();
		insuranceDetailsPage.clickOnProceedButton();
		
		insuranceDetailsPage2.clickOnAge("24");
		insuranceDetailsPage2.clickOnPincode("415639");
		insuranceDetailsPage2.clickOnGetQuotesButton();
		
		String title = driverTest.getTitle();
		String url = driverTest.getCurrentUrl();
		System.out.println(title);
		System.out.println(url);
		
		String Expectedtitle = ("Insurance");
		String Expectedurl = ("https://paytminsurance.co.in/health-product/general/member-info");
		
	   Assert.assertEquals(title, Expectedtitle, "title is wrong");
	   Assert.assertEquals(url, Expectedurl, "wrong url");
	}
		
		@Test
		public void test2() throws InterruptedException {
			System.out.println("Test");
			testID = "T102";
			typesOfInsurances.clickOnTermInsurance();
			
			
		/*	termInsuranceDetails.enterDate();
			termInsuranceDetails.enterMonth();
			termInsuranceDetails.enterYear();*/
			termInsuranceDetails.clickOnGender();
			termInsuranceDetails.clickOnIncomeDropDown();
			termInsuranceDetails.clickOnIncome();
			Thread.sleep(2000);
			termInsuranceDetails.clickOnProceedbutton();
			
			String title = driverTest.getTitle();
			String url = driverTest.getCurrentUrl();
			System.out.println(title);
			System.out.println(url);
			
			String Expectedtitle = ("Insurance");
			String Expectedurl = ("https://paytminsurance.co.in/life-product/term/pre-quote?utm_source=paytminsurance_website&utm_medium=content_pages&utm_campaign=home_screen");
			
			Assert.assertEquals(title, Expectedtitle, "title is unvarified");
			Assert.assertEquals(url, Expectedurl, "url is wrong");
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) {  
		System.out.println("AfterMethod");
		if(ITestResult.FAILURE==result.getStatus()) {
			
		}
		
		driverTest.navigate().back();
		driverTest.navigate().back();	
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
		driverTest.close();
	}
		
	@AfterTest
	public void afterTest() {
		
		paytmHomePage = null ;
		typesOfInsurances = null ;
		insuranceDetailsPage =null ;
		insuranceDetailsPage2 = null ;
		driverTest = null ;
		System.gc();
	}
		
		
	


	
	
	
	

	
	
	
	
	
	
	
	
	
}







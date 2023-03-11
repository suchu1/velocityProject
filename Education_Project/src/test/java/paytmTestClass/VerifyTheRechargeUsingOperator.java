package paytmTestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import paytmPomModule.OnlineRechargeAndPlans;
import paytmPomModule.PaytmHomePage;

public class VerifyTheRechargeUsingOperator {
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\SUCHIT FOLDER\\VELOCITY\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driverTest = new ChromeDriver ();
		driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		driverTest.get("https://paytm.com/");
		
		
		PaytmHomePage PaytmHomePage = new PaytmHomePage(driverTest);
		PaytmHomePage.clickOnprepaidMobilerecharge();
		
		OnlineRechargeAndPlans onlineRechargeAndPlans = new OnlineRechargeAndPlans(driverTest);
		//onlineRechargeAndPlans.clickOnPostpaid();
		
		onlineRechargeAndPlans.enterMobileNum("9405733605");
		onlineRechargeAndPlans.ClickOnDatapack();
		
		//onlineRechargeAndPlans.ClickOnJioPhonePlanAmount();
		
		onlineRechargeAndPlans.ClickOnDataAmount();
		onlineRechargeAndPlans.proceedsrechargeButt();
		String title = driverTest.getTitle();
		 String url = driverTest.getCurrentUrl();
		 System.out.println(title);
		 System.out.println(url);
		 
		 String Expectedtitle = ("Online Recharge - Online Mobile Recharge & Prepaid Recharge Plans") ;
		 String Expectedurl = ("https://paytm.com/recharge") ;
		 
		 if(title.equals(Expectedtitle) && url.equals(Expectedurl)) {
			 System.out.println("test case pass");
		 }
		 else {
			 System.out.println("test case failed");
		 }
		

}
}
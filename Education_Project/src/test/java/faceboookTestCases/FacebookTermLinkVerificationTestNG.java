package faceboookTestCases;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomFacebookModule.LoginOrSignUpPage;
import pomFacebookModule.SignUpPage;
import pomFacebookModule.TermDetailsPage;

public class FacebookTermLinkVerificationTestNG {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SUCHIT FOLDER\\VELOCITY\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driverTest = new ChromeDriver ();
		driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		driverTest.get("https://www.facebook.com/");
		
		LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driverTest);
		loginOrSignUpPage.openSignUpPage();

		SignUpPage signUpPage = new SignUpPage (driverTest);
		signUpPage.clickOnTermsButtonLink();
		
		ArrayList<String> abc = new ArrayList<String> (driverTest.getWindowHandles());
		driverTest.switchTo().window(abc.get(1));
		TermDetailsPage termDetailsPage = new TermDetailsPage(driverTest);
		termDetailsPage.serviceWeProvideButton();
		
		String title = driverTest.getTitle();
		String url = driverTest.getCurrentUrl();
		System.out.println(title);
		System.out.println(url);
		
		 String Expectedtitle = ("Facebook") ;
		 String Expectedurl = ("https://www.facebook.com/legal/terms/update") ;
		 
		 if(title.equals(Expectedtitle) && url.equals(Expectedurl)) {
			 System.out.println("test case pass");
		 }
		 else {
			 System.out.println("test case failed");
		 }
	
		 driverTest.close();
		
		
	
	
	
	
	
	
}
	
	
}

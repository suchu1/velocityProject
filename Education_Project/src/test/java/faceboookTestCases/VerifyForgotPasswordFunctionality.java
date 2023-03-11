package faceboookTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomFacebookModule.ForgotPasswordPage;
import pomFacebookModule.LoginOrSignUpPage;

public class VerifyForgotPasswordFunctionality {
	public static void main(String[] args) {
		
	//step 1	
        System.setProperty("webdriver.chrome.driver", "C:\\SUCHIT FOLDER\\VELOCITY\\chromedriver_win32\\chromedriver.exe");
	                           
		WebDriver driverTest = new ChromeDriver ();
		driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		driverTest.get("https://www.facebook.com/");
		
	//step 2
		LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage (driverTest);
		loginOrSignUpPage.clickOnForgotpasswordLink();
		
	//step 3
		
		ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(driverTest);
		String msg = forgotPasswordPage.getTextMethod();	
		if (msg.equals("Please enter your email address or mobile number to search for your account."))
		{
			System.out.println("msg is validated");
		}
		else
		{
			System.out.println("msg is wrong");
		}
	    
	//step 4
	    
		forgotPasswordPage.enterEmailOrMobileNum("suchit@123");
	
	//step 5

		forgotPasswordPage.clickOnSearchButton();
		//actual result
		String title = driverTest.getTitle();
		String url = driverTest.getCurrentUrl();
	
		String ExpectedTitle =("Forgotten Password | Can't Log In | Facebook");
		String ExpectedUrl =("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
	 
		if(title.equals("Forgotten Password | Can't Log In | Facebook"));
	    if(url.equals("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0")); 
	
		if(title.equals(ExpectedTitle)&& url.equals(ExpectedUrl)) {
			System.out.println("test pass");
		}
		else 
		{
			System.out.println("test fail");
		}
		
}
}
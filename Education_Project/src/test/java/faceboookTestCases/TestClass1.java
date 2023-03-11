package faceboookTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomFacebookModule.LoginOrSignUpPage;

public class TestClass1 {
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\SUCHIT FOLDER\\VELOCITY\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driverTest = new ChromeDriver ();
		driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		driverTest.get("https://www.facebook.com/");
		
		LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driverTest) ; 
		
		/*	loginOrSignUpPage.sendUserName();
		loginOrSignUpPage.sendPassword();
		loginOrSignUpPage.clickOnLoginButton();
	loginOrSignUpPage.clickOnForgotpasswordLink();
		loginOrSignUpPage.openSignUpPage();
		loginOrSignUpPage.clickOnCreateNewPageLink();*/
		
		
	}

}

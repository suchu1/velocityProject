package faceboookTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomFacebookModule.FunctionsOfFacebook;
import pomFacebookModule.LoginOrSignUpPage;

public class VerifyLoginFunctionality {
	 public static void main(String[] args) {
		//step 1	
	        System.setProperty("webdriver.chrome.driver", "C:\\SUCHIT FOLDER\\VELOCITY\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driverTest = new ChromeDriver ();
			driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driverTest.manage().window().maximize();
			driverTest.get("https://www.facebook.com/");
			
		//STEP 2 - enter the username and password.
			LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage (driverTest);
			loginOrSignUpPage.sendUserName("8208017392");
			loginOrSignUpPage.sendPassword("suchit@1234");
			
		//step 3 - click on login button
			loginOrSignUpPage.clickOnLoginButton();
			
		
		//step 4 - 	get the url and title
			String url = driverTest.getCurrentUrl();
			String title = driverTest.getTitle();
			System.out.println(url);
			System.out.println(title);
			
			String expectedurl =("https://www.facebook.com/");
			String expectedTitle =("Facebook");
			
			if(url.equals("https://www.facebook.com/"));
			if (title.equals("Facebook"));
			
			if(url.equals(expectedurl)&& title.equals(expectedTitle))
			{
				System.out.println("test case pass");
			}
			else {
				System.out.println("test case failed");
			}
			
			FunctionsOfFacebook functionsOfFacebook = new FunctionsOfFacebook (driverTest);
			//functionsOfFacebook.clickOnRandomButton();
			functionsOfFacebook.clickOnMyprofile();
			functionsOfFacebook.clickOnlogout();
		
			
			
}
}
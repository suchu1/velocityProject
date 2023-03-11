package faceboookTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pomFacebookModule.LastConformation;
import pomFacebookModule.LoginOrSignUpPage;
import pomFacebookModule.SignUpPage;

public class VerifySignUpPage {
	 public static void main(String[] args) {
			//step 1	
		      //  System.setProperty("webdriver.chrome.driver", "C:\\SUCHIT FOLDER\\VELOCITY\\chromedriver_win32\\chromedriver.exe");
		 System.setProperty("webdriver.gecko.driver", "C:\\SUCHIT FOLDER\\VELOCITY\\geckodriver-v0.32.2-win-aarch64");
				//WebDriver driverTest = new ChromeDriver ();
		 WebDriver driverTest = new FirefoxDriver ();
				driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driverTest.manage().window().maximize();
				driverTest.get("https://www.facebook.com/");
				
				LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driverTest);
				loginOrSignUpPage.openSignUpPage();

				SignUpPage signUpPage = new SignUpPage (driverTest);
				signUpPage.enterFirstName("Suchit");
				signUpPage.enterSurName("salvi");
				signUpPage.enterMobNum("8208017392");
				signUpPage.enterPassword("suchi12@");
				signUpPage.selectDateOfBirth("name");
				signUpPage.selectBirthMonth("month");
				signUpPage.selectBirthYear("year");
				signUpPage.selectGender();
				signUpPage.clickOnSignUpButton();
				LastConformation lastConformation = new LastConformation(driverTest);
				lastConformation.ClickOncontinue();
				String title = driverTest.getTitle();
				System.out.println(title);
				String url = driverTest.getCurrentUrl();
				System.out.println(url);
				
				String ExpectedTitle = ("Facebook");
				String ExpectedUrl = ("https://www.facebook.com/checkpoint/1501092823525282/?next=https%3A%2F%2Fwww.facebook.com%2F");
				
				if(title.equals("Facebook"));
			    if(url.equals("https://www.facebook.com/checkpoint/1501092823525282/?next=https%3A%2F%2Fwww.facebook.com%2F")); 
				
				if(title.equals(ExpectedTitle)&& url.equals(ExpectedUrl)) {
					System.out.println("test pass");
				}
				else {
					System.out.println("test fail");
				}
				
	
	
	
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			/*	if(title.equals("ExpectedTitle") && url.equals("ExpectedUrl"))
				{
					System.out.println("test case pass");
				}
				else
				{
					System.out.println("test case failed");
				}
	
	*/
	
	 }
}

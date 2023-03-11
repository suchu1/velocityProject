package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Browser {
	public static WebDriver OpenChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\SUCHIT FOLDER\\VELOCITY\\chromedriver_win32\\chromedriver.exe");
		WebDriver driverTest = new ChromeDriver();
		return driverTest ;
	}
	
	public static WebDriver OpenFirefoxBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\SUCHIT FOLDER\\VELOCITY\\geckodriver-v0.32.2-win-aarch64.exe");
		WebDriver driverTest = new FirefoxDriver () ;
		return driverTest ;
	}
	
//	public static void OpenOperaBrowser() {
//		 System.setProperty("webdriver.gecko.driver", "C:\\SUCHIT FOLDER\\VELOCITY\\geckodriver-v0.32.2-win-aarch64");
//		WebDriver driverTest = new OperaDriver () ;
//	}
//	
//	public static void OpenChromeBrowser() {
//		System.setProperty("webdriver.chrome.driver", "C:\\SUCHIT FOLDER\\VELOCITY\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driverTest = new ChromeDriver();
//	}
}


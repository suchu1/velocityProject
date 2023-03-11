package pomFacebookModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClassNotification {
	public static WebDriver openChrome() {
		
        System.setProperty("webdriver.chrome.driver", "C:\\SUCHIT FOLDER\\VELOCITY\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver ();
        return driver;
        
        public static WebDriver openEdge()
        {
        System.setProperty("webdriver.edge.driver", "C:\\SUCHIT FOLDER\\VELOCITY\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new EdgeDriver ();
        return driver;
        }
        
        
   
        
        
	}

}

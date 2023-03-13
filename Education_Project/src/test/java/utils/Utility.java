package utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
		//2 methods
		//screenshot code
		//excel sheet code
	//both are public and static
	
	
	
	//file path ("src/test/resources/dataFiles/dataFetch.xlsx")
	
	public void captureScreeenshot() throws IOException {
		TakesScreenshot driver = new ChromeDriver();
		//code
		TakesScreenshot t = (TakesScreenshot) driver ; 
		File src = t.getScreenshotAs(OutputType.FILE);
		String timestamp = "date";
		String i = "screenshot";
		File dest = new File("C:\\SUCHIT FOLDER\\VELOCITY\\scrrenshots\\test_"+ i +" "+ timestamp +".jpeg");
		FileHandler.copy(src, dest);
		
		//path for the screenshot--> test-output\failedScreenshot\imageName.jpg
	}
	
	
	
	
	
	
	
	
	
	
}

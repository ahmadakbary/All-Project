package Basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class screenshot {

	public static void main(String[] args) throws IOException {
WebDriver driver;


		
		System.getProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.walmart.com");	

		//takeScreenShot(driver, "firstpicture");
		
		takeScreenShot(driver, "mypicture");
			}
	
		public static void takeScreenShot(WebDriver driver, String fileName) throws IOException {
			String path=".\\ScreenShots\\";
			File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File(path+fileName+".png"));
	}

}

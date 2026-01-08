package piit.RRegression;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.xml.crypto.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class W6Asertion {
	WebDriver driver;
  @Test
  public void f() throws IOException {
	  
	  WebElement button=driver.findElement(By.id("loginbutton"));
	  boolean bt = button.isDisplayed();
			  System.out.println(bt);
			  if (bt=true) {
				  button.click();	 	
  }else {
	  System.out.println("this is not displaying");  	
  }
File Captureofshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(Captureofshots, new File("C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Photos\\screenshots.jpg"));
screenshotspage();
  }
  @Parameters ({"browser","url"})
  @BeforeClass		  
  public void browser(String browser, String url) throws InterruptedException, IOException {
		if (browser.equalsIgnoreCase("chrome")) {
			String mycurrentproject=System.getProperty("user.dir"); 
			System.out.println(mycurrentproject);
			System.setProperty("webdriver.chrome.driver",mycurrentproject+"\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			Thread.sleep(7000);
								
		} else if (browser.equalsIgnoreCase("Firefox")) {	
			String mycurrentproject=System.getProperty("user.dir");
			System.out.println(mycurrentproject);
			System.setProperty("webdriver.gecko.driver",mycurrentproject+"\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();		
		} else {
			System.out.println("Wrong browser name");		
		}
  }
  @AfterClass
  public void afterClass() throws IOException {
  }  
  public void screenshotspage() throws IOException {  
	String mycurrentproject=System.getProperty("user.dir");
	  Date dt=new Date();	 
      String ut=dt.toString().replace(" ", "_").replace(":", "_")+".jpg";
      File Captureofshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(Captureofshots, new File(mycurrentproject+"\\Photos//pic.jpg" +ut));    
  }

}

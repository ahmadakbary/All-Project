package w7Shared;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;

public class Comons {
	public WebDriver driver;


	//@Test
	
  public void f() {
	 
	  
  }
  
  @Parameters ({"browser","url"})
  @BeforeClass
  public void browser(String browser, String url) {
	  if (browser.equalsIgnoreCase("Chrome")) {
		  String mylocalCdrive=System.getProperty("user.dir");
				  System.out.println(mylocalCdrive);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		
	  }else if (browser.equalsIgnoreCase("Firefoxe")) {
		  String mylocalCdrive=System.getProperty("user.dir");
		  System.out.println(mylocalCdrive);
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Drivers\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.get(url);
		  driver.navigate().refresh();
		  driver.manage().window().maximize();
	  } else {
		  System.out.println("this is not my right broser");
	  }
  }

  @AfterClass
  public void afterClass() {
	  
  }
public void takescreenshots() throws IOException {
	
	String mycdrive=System.getProperty("user.dir");
	System.out.println(mycdrive);
	Date time=new Date();
	File Myscriptspicture=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(Myscriptspicture, new File ("C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Picture"));
	
	
	
	
	
	
	
	
	
	
	
	
}
}

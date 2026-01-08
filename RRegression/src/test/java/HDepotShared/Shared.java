package HDepotShared;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class Shared {
	public WebDriver driver;
  @Test										
  public void f() {
	  									                               //HomeDepot Project
	 driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);  
  }
  @Parameters ({"browser","url"})
  @BeforeClass
   public void browser (String browser, String url) throws IOException {
	  if (browser.equalsIgnoreCase("Chrome")) {
		  String localdrive=System.getProperty("user.dir");
		  System.out.println(localdrive);
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get(url);
		  driver.navigate().refresh();
		  driver.manage().window().maximize();  
	  }else if (browser.equalsIgnoreCase("Firefox")) {
		  String mylocaldrive=System.getProperty("user.dir");
		  System.out.println(mylocaldrive);
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.get(url);
		  driver.navigate().refresh();
		  driver.manage().window().maximize();
	  }else {
		  System.out.println("try again later");
	  }	  
  }

  @AfterClass
  public void afterClass() throws InterruptedException, IOException {
	  screenshots();
	  Thread.sleep(6000);
	  //driver.close();
  } 
	 public void screenshots() throws IOException {
			
		 String mylocaldrive=System.getProperty("user.dir");
	     System.out.println(mylocaldrive);
         Date time=new Date();
         System.out.println(time);
	     String st=time.toString().replace(" ", "-").replace(":", "-")+".jpg";
         File screenshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     FileHandler.copy(screenshots, new File(mylocaldrive+ "\\Picture\\"+st));	
	     
	   
	  }
}

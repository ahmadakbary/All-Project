package annotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Annotation extends creatingBrowser{
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  WebElement button=driver.findElement(By.id("u_0_b"));
	  boolean True = button.isDisplayed();
	  System.out.println(True);
	  
	  		if(True==true) {
		  button.click();
	  			}else {
		  System.out.println("this is not displaying");
		  
	  }
  } 
  @Parameters ({"browser","url"})
  @BeforeClass
  public void browser(String browser, String url) throws InterruptedException {
			if (browser.equalsIgnoreCase("Chrome")) {
	    String mylocaldriver=System.getProperty("user.dir");
		System.out.println(mylocaldriver);
		System.setProperty("webdriver.Chrome.driver", mylocaldriver+ "\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Thread.sleep(5000);
			} else if (browser.equalsIgnoreCase("Firefox"))	{
		String mydriver= System.getProperty("user.dir");
		System.out.println(mydriver);
		System.setProperty("webdriver.gecko.driver",mydriver+ "\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		Thread.sleep(5000);
		driver.get(url);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		
  }else {
	System.out.println("please try again");
  }
  }
  @AfterClass
  public void afterClass() throws IOException {
	  takepicute();
	  driver.close();
  }

 public void takepicute() throws IOException {
	 
	 String pcdrivers=System.getProperty("user.dir");
		Date dt =new Date();
		System.out.println(dt);
		String ak=dt.toString().replace(" ", "_").replace(":", "_")+".jpg";
		File screenshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshots, new File("C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Photos" +ak));
			 
 }
}











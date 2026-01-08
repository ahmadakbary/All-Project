package piit.RRegression;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
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
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class ScreenShots {
 WebDriver driver;
	@Test
 	
	public void f() {
		
		WebElement button=driver.findElement(By.id("loginbutton"));
		boolean ak=button.isDisplayed();
		System.out.println(ak);
		
		if (ak==true) {
			button.click();
				
		}	
		
  }
	@Parameters({"browser","url"})
	@BeforeClass
  public void beforeMethod() {
 
  }
  public void browser (String browser, String url) {
	  if (browser.equalsIgnoreCase("Chrome")) {
		  
		 String mylocaldriver=System.getProperty("user.dir");
		  System.out.println(mylocaldriver);
		  System.setProperty("webdriver.Chrome.driver", mylocaldriver+ "\\Driver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get(url);
		  driver.manage().window().maximize();
		  driver.navigate().refresh();
		  
	  }else if (browser.equalsIgnoreCase("Firefox")) {
		  String printmydriver=System.getProperty("user.dir");
		  System.out.println(printmydriver);
		  System.setProperty("Webdriver.gecko.driver", printmydriver + "\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.get(url);
		  driver.manage().window().maximize();
		  driver.navigate().refresh();
		  
	  }else {
		  System.out.println("sorry wrong browser");
		
	  }
  }
  @AfterMethod
  public void afterMethod() {
  }
public void takepicture() throws IOException {
	
	String pcdrivers=System.getProperty("user.dir");
	Date dt =new Date();
	System.out.println(dt);
	String ak=dt.toString().replace(" ", "_").replace(":", "_")+".jpg";
	File screenshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(screenshots, new File(pcdrivers+ " \\Photos\\"+ak));
}
}







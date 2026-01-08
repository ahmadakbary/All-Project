package w6;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import net.bytebuddy.utility.privilege.GetSystemPropertyAction;

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
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Asertion {
	WebDriver driver;
@Test
  public void f() throws IOException {  
 WebElement button=driver.findElement(By.id("loginbutton"));
 boolean verification = button.isDisplayed();
	 System.out.println(verification);
	 if (verification == true) {
		 button.click(); 		
		 screenshotspage();
	 }else {
		 System.out.println("this is not displaying");
		 
		 
		 
		 
		 
	 }	  
  }
  @Parameters ({"browser","url"})
  @BeforeClass
  public void browser( String browser, String url) {
	  
	  if (browser.equalsIgnoreCase("Chrome")) {
		  String mylocaldrive=System.getProperty("user.dir");
			System.out.println(mylocaldrive);
		  System.setProperty("webdriver.chrome.driver",mylocaldrive+ "\\Drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get(url);
		  driver.navigate().refresh();
		  driver.manage().window().maximize();
		  
	  }else if(browser.equalsIgnoreCase("Firefox")) {
		  String mylocaldrive=System.getProperty("user.dir");
		 System.out.println(mylocaldrive);
		 System.setProperty("webdriver.gecko.driver", mylocaldrive+ "\\Drivers\\geckodriver.exe");
		 driver=new FirefoxDriver();
		 driver.get(url);
		 driver.navigate().refresh();
		 driver.manage().window().maximize();
		 
	  }else {
		  System.out.println("this is wrong browser");	
		 
	  }
  }

  @AfterClass 
  public void afterClass() {
	    }
 public void screenshotspage() throws IOException {
	 
	String mylocalCdrive=System.getProperty("user.dir");
	System.out.println(mylocalCdrive);
	Date dt=new Date();
	 String ut=dt.toString().replace(" ", "-").replace(":",  "-")+".jpg";
	 File Captureofshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(Captureofshots, new File(mylocalCdrive+ "\\Picture\\"+ut));
	 
	 			  
}
}

















package w6;
import org.testng.annotations.Test;

import w6pages.Forgot;
import w6pages.Home;

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
import org.testng.annotations.AfterClass;

public class Continue {
	WebDriver driver;
  @Test
  public void f() {
	  Home obj=new Home (driver);
	  obj.email();
	  obj.psswdfield();
	  obj.loginbutton();	  
  } 
  @Test
  public void Forgot2() {
  		Home obj=new Home(driver);
  		obj.forgotlink();
  		Forgot fr=new Forgot(driver);
  		fr.button2();				
  } 		
  @Parameters ({"browser", "url"})
  @BeforeClass
  public void browser (String browser, String url) {
   
  if (browser.equalsIgnoreCase("Chrome")) {
String localcdrive=System.getProperty("user.dir");
System.out.println(localcdrive);
System.setProperty("webdriver.chrome.driver",localcdrive+ "\\Drivers\\chromedriver.exe");
driver=new ChromeDriver();
driver.get(url);
driver.navigate().refresh();
driver.manage().window().maximize();
	  
  } else if ( browser.equalsIgnoreCase("Firefox")) {
String localcdrive=System.getProperty("user.dir");
System.out.println(localcdrive);
System.setProperty("webdriver.gecko.driver",localcdrive+  "\\Drivers\\geckodriver.exe");
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
	public void takepicture() throws IOException {
		
	     String mylocaldrive=System.getProperty("user.dir");
	     System.out.println(mylocaldrive);
         Date time=new Date();
	     String st=time.toString().replace(" ", "-").replace(":", "-")+".jpg";
        File screenshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     FileHandler.copy(screenshots, new File(mylocaldrive+ "\\Picture\\"+st));
	
	  
  }

}

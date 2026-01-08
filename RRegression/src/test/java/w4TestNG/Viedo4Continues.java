package w4TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Viedo4Continues {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	browser("Chrome", "Url");
	   
WebElement Gender=driver.findElement(By.xpath("//*[@name='birthday_month']"));
Select Male=new Select(Gender);
Thread.sleep(5000);
Male.selectByVisibleText("May");
 Male.selectByValue("5"); 
  }
  @Parameters ({"browser","url"})    
  @BeforeClass
  public void beforeClass() {    
  }
	  public void browser( String browser, String Url) {  
		  if (browser.equalsIgnoreCase("chrome")) {
 String mylocalCdrive=System.getProperty("user.dir");
 System.out.println(mylocalCdrive);
System.setProperty("webdriver.chrome.driver",mylocalCdrive+"\\Drivers\\chromedriver.exe");
 driver=new ChromeDriver();
 driver.navigate().to("https://www.facebook.com");
 driver.navigate().refresh();
 driver.manage().window().maximize();
 
	  }else if (browser.equalsIgnoreCase("Firefox")){   
 String mylocaCdrive=System.getProperty("dir.user");
System.setProperty("webdriver.gecko.driver", mylocaCdrive+ " \\Drivers\\geckodriver.exe");
 driver=new FirefoxDriver();
 driver.navigate().to("https://www.facebook.com");
 driver.navigate().refresh();
 driver.manage().window().maximize();	  
	  }else {
		  System.out.println("this is wrong broswer");
	  }  
  }
  @AfterClass
  public void afterClass() {  
	   //  driver.close();
	  //driver.quit();
  }

}

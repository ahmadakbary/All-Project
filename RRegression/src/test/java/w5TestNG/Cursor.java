package w5TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class Cursor {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {	  
Actions obj=new Actions(driver);
WebElement signup=driver.findElement(By.id("nav-link-accountList"));
obj.moveToElement(signup).build().perform(); 
Thread.sleep(6000);
WebElement orders=driver.findElement(By.xpath("//span[text()='Your Orders']"));
obj.moveToElement(orders).click().build().perform();

  }
  @Parameters ({"browser","url"}) 
  @BeforeClass   
    public void browser( String browser, String url) {  
   		  if (browser.equalsIgnoreCase("chrome")) {
   String mylocalCdrive=System.getProperty("user.dir");
   System.out.println(mylocalCdrive);
  System.setProperty("webdriver.chrome.driver",mylocalCdrive+"\\Drivers\\chromedriver.exe");
  driver=new ChromeDriver();
  driver.navigate().to(url);
  driver.navigate().refresh();
  driver.manage().window().maximize();
   
  	  }else if (browser.equalsIgnoreCase("Firefox")){   
   String mylocaCdrive=System.getProperty("dir.user");
   System.out.println(mylocaCdrive);
  System.setProperty("webdriver.gecko.driver", mylocaCdrive+ " \\Drivers\\geckodriver.exe");
  driver=new FirefoxDriver();
  driver.navigate().to(url);
  driver.navigate().refresh();
  driver.manage().window().maximize();	  
  	  }else {
  		  System.out.println("this is wrong broswer");
  	  }  
    }

  @AfterClass
  public void afterClass() {
  }

}

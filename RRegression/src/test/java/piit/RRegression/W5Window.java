package piit.RRegression;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class W5Window {
	WebDriver driver; 
  @Test
  public void f() throws InterruptedException {
	  
	  Actions newwindow=new Actions(driver);
	  WebElement Shift=driver.findElement(By.linkText("Forgot account?"));
	  newwindow.keyDown(Shift, Keys.LEFT_SHIFT).click().build().perform();
	  String currentwindowhand=driver.getWindowHandle();
	//  System.out.println(currentwindowhand);
	  ArrayList<String> transfer=new ArrayList<String>(driver.getWindowHandles());
	  System.out.println(transfer.size());
	  for (String windows:transfer) {
	  		if (windows.equalsIgnoreCase(currentwindowhand)) {
	  			System.out.println("this is current window");
	  			Thread.sleep(5000);
	  		}else {
	  			driver.switchTo().window(windows);
	  			Thread.sleep(6000);
	  			driver.findElement(By.id("identify_email")).sendKeys("asbehrooz@yahoo.com");
	  			driver.close();
	  		}	
	  }
  }
  @Parameters ({"browser","url"})
  @BeforeClass		  
  public void browser(String browser, String url) throws InterruptedException {
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
  public void afterClass() {
	  driver.close();
  }

}

package piit.RRegression;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;

   public class W6Pause {
	WebDriver driver;
   @Test
   public void f() throws IOException {
	  
		  driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
	  
	 Actions newwindow=new Actions(driver);
	 WebElement Shift=driver.findElement(By.linkText("Forgot account?"));
	 newwindow.keyDown(Shift, Keys.LEFT_SHIFT).click().build().perform();
	 String currentwindowhand=driver.getWindowHandle();
     //System.out.println(currentwindowhand);
     ArrayList<String> transfer=new ArrayList<String>(driver.getWindowHandles());
	 System.out.println(transfer.size());
	for (String windows:transfer) {
	  if (windows.equalsIgnoreCase(currentwindowhand)) {
	  	System.out.println("this is current window");	
	 }else {
	  driver.switchTo().window(windows);
	  driver.findElement(By.id("identify_email")).sendKeys("asbehrooz@yahoo.com");
	  			
File Captureofshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(Captureofshots, new File("C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Photos\\pictures.jpg"));
	  		
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
  public void afterclass() {
	 	  
  }

}

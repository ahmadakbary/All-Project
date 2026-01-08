package w5TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;
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
import org.testng.annotations.AfterClass;

public class Window {
	WebDriver driver;
  @Test
  public void f() throws IOException {
Actions obj=new Actions (driver);
WebElement shift=driver.findElement(By.linkText("Forgot account?"));
obj.keyDown(shift, Keys.LEFT_SHIFT).click().build().perform();	  
String Currentwindowhand=driver.getWindowHandle();
System.out.println(Currentwindowhand);
ArrayList<String> transfer=new ArrayList<String>(driver.getWindowHandles());
System.out.println(transfer.size());

for (String windows:transfer) {
if(windows.equalsIgnoreCase(Currentwindowhand)) {
	System.out.println("this is current window");
}else {
	
	screenshots();
	driver.switchTo().window(windows);
	driver.findElement(By.id("identify_email")).sendKeys("Ahmad");
	
}	
  }
  }
  
  @Parameters({"browser","url"})
  @BeforeClass
 public void browser(String browser, String url) {
	 if (browser.equalsIgnoreCase("Chrome")){
		String Mylocaldriver=System.getProperty("user.dir");
		System.out.println(Mylocaldriver);
		 System.setProperty("webdriver.chrome.driver",Mylocaldriver+ "\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(url);
		 driver.navigate().refresh();
		 driver.manage().window().maximize();
		 
	 }else if (browser.equalsIgnoreCase("Firefox")) {
		String Mylocaldriver=System.getProperty("user.dir");
		System.out.println(Mylocaldriver);
		 System.setProperty("webdriver.gecko.driver",Mylocaldriver+ "\\Drivers\\geckodriver.exe");
		 driver=new FirefoxDriver();
		 driver.get(url);
		 driver.navigate().refresh();
		 driver.manage().window().maximize();		 
	 }else {
		 System.out.println("wrong browser or url");	 
	 }
 }
  @AfterClass
  public void afterClass() {
  }
public void screenshots() throws IOException {
String mylocalcdrive=System.getProperty("user.dir");
System.out.println(mylocalcdrive);
Date time=new Date();
String s=time.toString().replace(" ", "-").replace(":", "-")+".jpg";
File takepicture=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(takepicture, new File(mylocalcdrive+ "\\Picture\\" +s));
		  
		  
		  
	  
  }

}

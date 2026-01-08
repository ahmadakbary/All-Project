package ExpediaShared;

import org.testng.annotations.Test;
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

public class Shared {
	public WebDriver driver;
	@Test 			//Expedia Project
	
  public void f() {
  }
@Parameters ({"browser","url"})
@BeforeClass
 public void browser (String browser, String url) {
	 if (browser.equalsIgnoreCase("Chrome")) {
		 String mylocaldrive=System.getProperty("user.dir");
		 //System.out.println(mylocaldrive);
		 System.setProperty("webdriver.chrome.driver", mylocaldrive+ "\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(url);
		 driver.navigate().refresh();
		 driver.manage().window().maximize();
		 		 
	 }else if (browser.equalsIgnoreCase("Firefox")) {
		 String mylocaldrive=System.getProperty("user.dir");
		 System.out.println(mylocaldrive);
		 System.setProperty("webdriver.gecko.driver", mylocaldrive+ "\\Drivers\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.get(url);
		 driver.navigate().refresh();
		 driver.manage().window().maximize();
		 
	 }else {
		 System.out.println("sir try again later");		
	 }
 }
  @AfterClass
  public void afterClass() throws IOException, InterruptedException {
	  screenshots();
	  Thread.sleep(6000);
	  //driver.quit();	  
  }
  public void screenshots() throws IOException {
	  String mylocaldriver=System.getProperty("user.dir");
	  System.out.println(mylocaldriver);
	  Date time=new Date();
	  String St=time.toString().replace(" ", "-").replace(":", "-")+".jpg";
	  File takepic=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(takepic, new File(mylocaldriver+"\\Picture"+St));
  }

}










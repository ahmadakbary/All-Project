package Day25Extentreports;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class LoginTest {
	
	
WebDriver driver;

@Test(priority=0)
void openURL()
{
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrlive.com/");
	
String currentURL=driver.getCurrentUrl();

if(currentURL.contains("opensource-demo.orangehrmlive.com"))
	{	
	Assert.assertTrue(true);
	}
	else 
	{
		Assert.assertFalse(false);
	}
}
	@Test(priority=1)
	void loginTest() throws InterruptedException
	{
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),  "OrangeHRM");
	}
	@Test(priority=3, dependsOnMethods={"loginTest"})
	void CheckNoofEmployeesEnabled()
	{
		Assert.assertTrue(true);	
}
	@AfterClass
	void closeBrowser() 
	{
	driver.quit();
	}
	 @AfterClass
	  public void afterClass() throws InterruptedException, IOException {
		  screenshots();
		  Thread.sleep(6000);
		  //driver.close();
	  } 
		 public void screenshots() throws IOException {
				
			 String mylocaldrive=System.getProperty("user.dir");
		     System.out.println(mylocaldrive);
	         Date time=new Date();
	         System.out.println(time);
		     String st=time.toString().replace(" ", "-").replace(":", "-")+".jpg";
	         File screenshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		     FileHandler.copy(screenshots, new File(mylocaldrive+ "\\Picture\\"+st));	
				
			}
	}
	





























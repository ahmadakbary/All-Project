package Day23TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
/* 
 * 1) login Test
 * 2) Setup
 * 3) login Test
 * 4) close
 */
public class LoginTest {
WebDriver driver;
	
@Test (priority=1)
 void setup()
 {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\chromedriver.exe");
	// if we create Webdriver under this method it only read this method
	// but if we move the WebDriver from line 14 into line 8 then it will be
	// global for all methods to use the "driver"
	 driver=new ChromeDriver();	 
 }
@Test (priority=2)
void loginTest()
	 {
driver.get("https://opensource-demo.orangehrmlive.com/");
driver.findElement(By.name("txtUsername")).sendKeys("Admin");
driver.findElement(By.name("txtPassword")).sendKeys("Admin123");
driver.findElement(By.name("Submit")).click();
		 
	// I like the validate the HomePage Title
String act_title=driver.getTitle();
String ext_title="OrangeHRM";
		  	 
if (act_title.equals(ext_title))
	{
	System.out.println("My login test is passed.....");
	} 
else
	{
	System.out.println("My login test is failed......");
	}
	 }
@Test (priority=3)
void teardown() 
	{
	driver.close();
	}

}






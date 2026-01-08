package piit.RRegression;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class W4Signing<loveme> {
	WebDriver loveme;
  @Test
  public void f() throws InterruptedException {
	 
	  WebElement drop=loveme.findElement(By.xpath("//*[@name='birthday_month']"));
		Select ui=new Select(drop);
		ui.selectByIndex(8);
		Thread.sleep(4000);
		ui.selectByValue("10");
		Thread.sleep(5000);
		ui.selectByVisibleText("Jan");
  
  }
  @Parameters ({"browser","url"})
  @BeforeClass		
  
  public void browser(String browser, String url) throws InterruptedException {
		if (browser.equalsIgnoreCase("chrome")) {
			String mycurrentproject=System.getProperty("user.dir"); 
			System.out.println(mycurrentproject);
			System.setProperty("webdriver.chrome.driver",mycurrentproject+"\\Drivers\\chromedriver.exe");
			loveme=new ChromeDriver();
			loveme.get(url);
			loveme.manage().window().maximize();
			Thread.sleep(3000);
						
		} else if (browser.equalsIgnoreCase("Firefox")) {	
			String mycurrentproject=System.getProperty("user.dir");
			System.out.println(mycurrentproject);
			System.setProperty("webdriver.gecko.driver",mycurrentproject+"\\Drivers\\geckodriver.exe");
			loveme=new FirefoxDriver();
			loveme.get(url);
			loveme.manage().window().maximize();	
		} else {
			System.out.println("Wrong browser name");
			
		}
	}
  @AfterClass
  public void afterClass() {
  
		}
}




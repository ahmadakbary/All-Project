package piit.RRegression;

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

public class W5Action {
	WebDriver driver;
@Test

  public void f() throws InterruptedException {
	  Actions obj=new Actions(driver);
	
	 /* WebElement signinoptionamazon=driver.findElement(By.xpath("//*[text()='Account & Lists']"));
	   Thread.sleep(5000);
	  obj.moveToElement(signinoptionamazon).build().perform();*/
	  
	
	 driver.switchTo().frame(0);
	 WebElement dragable=driver.findElement(By.id("draggable"));
	 WebElement dropable=driver.findElement(By.id("droppable"));
	 obj.dragAndDrop(dragable, dropable).build().perform();
	 driver.switchTo().parentFrame();
	 driver.findElement(By.linkText("Slider")).click();
	 driver.switchTo().frame(0);
	 WebElement slider=driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
	  obj.dragAndDropBy(slider, 400, 0).build().perform();
	  driver.close();
	  
	  
	 
	  
	  
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
  @BeforeClass
  public void beforeClass() {  
	  
  }
  @AfterClass
  public void afterClass() {
  }

}

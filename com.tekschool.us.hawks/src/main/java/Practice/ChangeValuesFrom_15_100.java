package Practice;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class ChangeValuesFrom_15_100 {
static WebDriver driver;
public static void main(String[] args) {
browsers("chrome", "http://tek-school.com/retail/index.php?route=product/category&path=18");
		
WebElement ShowValues=driver.findElement(By.xpath("//select[@id='input-limit']"));	
Select drop=new Select(ShowValues);

	//drop.selectByIndex(100);
	//drop.selectByValue("100");
	drop.selectByVisibleText("25");
}
public static void browsers(String browser, String url	) {	
if(browser.equalsIgnoreCase("chrome")) {
	String UserPath=System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", UserPath+ ".\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.navigate().refresh();
	driver.get(url);
	System.out.println("WebPage is "+driver.getTitle());
}else if(browser.equalsIgnoreCase("firefox")) {
		
	String UserPath=System.getProperty("user.dir");
	System.setProperty("webdriver.gecko.driver", UserPath+ ".\\Drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.navigate().refresh();
	driver.get(url);
	System.out.println("WebPage is "+driver.getTitle());
			
} if(browser.equalsIgnoreCase("InternetExplorer")) {
	String UserPath=System.getProperty("user.dir");
	System.setProperty("webdriver.ie.driver", UserPath+ ".\\Drivers\\IEDriverServer.exe");
	driver=new InternetExplorerDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.navigate().refresh();
	driver.get(url);
	System.out.println("WebPage is "+driver.getTitle());
	} else {
	System.out.println("Plz try different browser");
	
	
	}	
}
public static void screenshotspage() throws IOException {  
	String mycurrentproject=System.getProperty("user.dir");
	  Date dt=new Date();	 
      String ut=dt.toString().replace(" ", "_").replace(":", "_")+".jpg";
      File Captureofshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(Captureofshots, new File(mycurrentproject+"\\Photos\\" +ut));
	}
}

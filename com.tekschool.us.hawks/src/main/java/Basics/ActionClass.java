package Basics;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	static WebDriver driver;
	

public static void main(String[] args) {
	
	
System.getProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://tek-school.com/retail");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
System.out.println("WebPage is "+driver.getTitle());
		
	Actions MoveCursor=new Actions (driver);	
WebElement Desktop=driver.findElement(By.xpath("//a[text()='Desktops']"));
MoveCursor.moveToElement(Desktop).build().perform();
MoveCursor.doubleClick(Desktop).build().perform();
MoveCursor.contextClick().build().perform();
	
driver.navigate().to("https://jqueryui.com/resources/demos/droppable/default.html");

WebElement src=driver.findElement(By.id("draggable"));
WebElement trg=driver.findElement(By.id("droppable"));
MoveCursor.dragAndDrop(src, trg).build().perform();

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
						
} else if(browser.equalsIgnoreCase("InternetExplorer")) {
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
			}

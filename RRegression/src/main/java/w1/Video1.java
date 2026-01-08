package w1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Video1 {
public static WebDriver driver;			
	public static void main(String[] args) throws InterruptedException {
 
System.setProperty("webdriver.chrome.driver", "C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\chromedriver.exe");
driver=new ChromeDriver();
	driver.navigate().to("https://www.google.com");
	driver.get("https://www.amazon.com");
	driver.navigate().refresh();
	driver.navigate().back();
	driver.navigate().forward();
		

	System.setProperty("webdriver.gecko.driver","C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.navigate().to("https://www.homedepot.com");
	driver.navigate().refresh();	
	driver.get("https://www.facebook.com");
	driver.navigate().back();
	driver.navigate().refresh();
	driver.get("https://www.hotmail.com");
	driver.close();
		
	}

}

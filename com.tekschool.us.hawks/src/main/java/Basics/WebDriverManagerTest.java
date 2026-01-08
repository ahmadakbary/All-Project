package Basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class WebDriverManagerTest {
public static void main(String[] args) {
		
WebDriver driver;
		
	String browserName="chrome";
	switch (browserName) {
	case "chrome":
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://tekschool.us/");
	break;
			
	case "firefox":
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	driver.get("https://www.amazon.com");
	break;
		
	case "edge":
	WebDriverManager.edgedriver();
	driver=new EdgeDriver();
	driver.get("https://www.walmart.com");
		
	default:
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
		}
		
	}
}

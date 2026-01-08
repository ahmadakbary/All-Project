package HDepot;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HDept_MainClass {
	
	public static WebDriver driver;
	public static Properties props;
	
	
	public void readFiles() throws IOException {
		props= new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\asbeh\\eclipse-workspace\\HomeDepot\\src\\main\\java\\config\\propfile.properties");
		props.load(file);
		
	
	}
	
	public static WebDriver intializeBrowser() {
		String browserName= props.getProperty("browser");
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\asbeh\\eclipse-workspace\\HomeDepot\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			}
		else if (browserName.equals("firefox")){
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\asbeh\\eclipse-workspace\\HomeDepot\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		
		driver.get(props.getProperty("url"));
		return driver;
		}
		
	
	}
	
	
	
	
	
	
	



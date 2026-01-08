package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	
	public static WebDriver driver;
	public static Properties properties;
	public static Logger logger;
	private static String propertyPath=".\\src\\test\\resources\\input\\property.properties";
	private static String log4JPath=".\\src\\test\\resources\\input\\log4J.properties";
	
	public base () {
		
		try {
			BufferedReader reader=new BufferedReader(new FileReader(propertyPath));
			properties=new Properties();
			properties.load(reader);
			reader.close();			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		logger=logger.getLogger("logger_File");
		PropertyConfigurator.configure(log4JPath);
		
	}
	public static String getBrowserName() {
		String browserName = properties.getProperty("browser");
		return browserName;
		
		
	}
	public static String getUrl() {
		String url=properties.getProperty("url");
		return url;
		
	}
	public static void openBrowser() {
		driver.get(getUrl());
	}
	public static void tearDown() {
		driver.close();
		driver.quit();
		
	}
	public static void selectBrowser() {
		String browsers = getBrowserName();
		
		if (browsers.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		} else if(browsers.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		} else if (browsers.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		} else {
			System.out.println("please check ur browsers");
		
	}
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
}
}
























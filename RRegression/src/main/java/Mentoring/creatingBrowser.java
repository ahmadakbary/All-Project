package Mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class creatingBrowser {
	
public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		
		
		
		
		
		
		
		
		
		

browser("Firefox","https://www.walmart.com");
	}	
		public static void browser(String browser, String url) throws InterruptedException {
			if (browser.equalsIgnoreCase("Chrome")) {
		
		String Mylocaldriver=System.getProperty("user.dir");
		System.out.println(" this is my driver path directories" +Mylocaldriver);
		System.setProperty("webdriver.Chrome.driver", Mylocaldriver + "\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(6000);
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.close();
		}else if( browser.equalsIgnoreCase("Firefox"))	{
			
		String mydrivers=System.getProperty("user.dir");
		System.out.println("this is my drivers"+ mydrivers);
		System.setProperty("webdriver.gecko.driver", mydrivers + "\\Driver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(url);
		Thread.sleep(5000);
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.close();
		
		}else{
			System.out.println("Sorry i am not your correct browser try later");
		}
		
	
	}

}

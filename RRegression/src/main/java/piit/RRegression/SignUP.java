package piit.RRegression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SignUP {
public static WebDriver driver;
	
public static void main(String[] args) throws InterruptedException {
		browser("Chrome", "https://www.walmart.com");
				
	WebElement emailfield = driver.findElement(By.id("email"));
	emailfield.sendKeys("asakbary@yahoo.com");	
		
}
		public static void browser(String browser, String url) throws InterruptedException {
			if (browser.equalsIgnoreCase("Chrome")) {
		String mylocaldriver=System.getProperty("user.dir");
		System.out.println(mylocaldriver);
		System.setProperty("webdriver.Chrome.driver", mylocaldriver+ "\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		}else if (browser.equalsIgnoreCase("Firefox")) {
			
		String mydriver= System.getProperty("user.dir");
		System.out.println(mydriver);
		System.setProperty("webdriver.gecko.driver",mydriver+ "\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		Thread.sleep(5000);
		driver.get("https://www.homedepot.com");
		driver.navigate().refresh();
		driver.manage().window().maximize();
	
	}else {
		System.out.println("sorry wrong browser");
	
		
	}
}
}
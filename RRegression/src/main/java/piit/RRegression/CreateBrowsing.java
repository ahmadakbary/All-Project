package piit.RRegression;


import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateBrowsing {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		browser("Chrome","https://www.facebook.com");
		
		
		WebElement searchfield=driver.findElement(By.id("email"));
		searchfield.sendKeys("askbary@yahoo.com");
		
		WebElement passwordField=driver.findElement(By.id("pass"));
		passwordField.sendKeys("222222");
		WebElement loginbutton = driver.findElement(By.name("login"));
		loginbutton.click();
		Thread.sleep(5000);
		WebElement phonefield= driver.findElement(By.name("email"));
		phonefield.sendKeys("asbehrooz@yahoo.com");
		Thread.sleep(6000);
		WebElement passfield = driver.findElement(By.id("pass"));
		passfield.sendKeys("545343434");
		WebElement fortgotpass = driver.findElement(By.partialLinkText("Forgot Password?"));
		fortgotpass.click();
		
		
		
		
		
		
		
		
	}
	public static void browser(String browser, String url) throws InterruptedException {
		if (browser.equalsIgnoreCase("Chrome")) {
				
		String mylocaldriver=System.getProperty("user.dir");
		System.out.println(mylocaldriver);
		System.setProperty("webdriver.Chrome.driver",mylocaldriver + " \\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Thread.sleep(6000);
		driver.navigate().to(url);
		Thread.sleep(5000);
				
	} else if(browser.equalsIgnoreCase("Firefoxe")) {
		
		String mydriver = System.getProperty("user.dir");
		System.out.println("(if you transfer your project this is the path) " +mydriver);
		System.setProperty("webdriver.gecko.driver", mydriver + "\\Driver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.navigate().back();
		driver.close();
		
	}else {
		System.out.println("sorry I am not your correct browser check your BROWSER NAME.");
	
			
	}
		
	}
}

	



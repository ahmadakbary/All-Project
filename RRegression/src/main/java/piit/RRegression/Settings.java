package piit.RRegression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Settings {
	
public static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
browser("chrome","https://www.facebook.com");
	
WebElement namefield= driver.findElement(By.id("u_0_m"));
	namefield.click();
	namefield.sendKeys("ahmad");
	driver.findElement(By.id("u_0_o")).sendKeys("Handsome");
	driver.findElement(By.id("u_0_r")).sendKeys("571344XXXX");
	Thread.sleep(4000);
	WebElement PasswordIDF=driver.findElement(By.id("password_step_input"));
	PasswordIDF.sendKeys("DoNotLook");
	Thread.sleep(4000);
	WebElement forgotpassword=driver.findElement(By.linkText("Forgot account?"));
	Thread.sleep(4000);
	forgotpassword.click();
	driver.navigate().back();
	Thread.sleep(4000);
	WebElement gentlmentsection=driver.findElement(By.id("u_0_7"));
	gentlmentsection.click();
	Thread.sleep(4000);
	WebElement webpagelink=driver.findElement(By.partialLinkText("Forgot"));
	webpagelink.click();
	
	//namefield.clear();
	}
public static void browser(String browser, String url) throws InterruptedException {
	if (browser.equalsIgnoreCase("chrome")) {
		String mycurrentproject=System.getProperty("user.dir"); 
		System.out.println(mycurrentproject);
		System.setProperty("webdriver.chrome.driver",mycurrentproject+"\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
					
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
}
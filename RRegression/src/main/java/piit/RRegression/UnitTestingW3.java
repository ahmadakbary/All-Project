package piit.RRegression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UnitTestingW3 {

	static WebDriver loveme;
	
	public static void main(String[] args) throws InterruptedException {
		browser ("chrome","https://www.facebook.com");
		
		//WebElement loginbutton=loveme.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td/label/input"));
		//loginbutton.click();
		
	WebElement firstname =	loveme.findElement(By.xpath("//input[@name='email']"));
	firstname.sendKeys("AHMAD");
Thread.sleep(4000);
	WebElement LNPassword =	loveme.findElement(By.xpath("//input[@name='pass']"));
	LNPassword.sendKeys("SHEKAIB");
	WebElement Login = loveme.findElement(By.id("u_0_b"));
	Login.click();
	WebElement longme = loveme.findElement(By.xpath("//input[@type='submit']"));
	WebElement Gender=loveme.findElement(By.xpath("(//*[@name='sex'])[1]"));
	Gender.click();
	
		
		//WebElement Login=loveme.findElement(By.xpath("//input@[type='submit']"));
	}
		public static void browser(String browser, String url) throws InterruptedException {
			if (browser.equalsIgnoreCase("chrome")) {
				String mycurrentproject=System.getProperty("user.dir"); 
				System.out.println(mycurrentproject);
				System.setProperty("webdriver.chrome.driver",mycurrentproject+"\\Drivers\\chromedriver.exe");
				loveme=new ChromeDriver();
				loveme.get(url);
				loveme.manage().window().maximize();
				Thread.sleep(3000);	
						
			} else if (browser.equalsIgnoreCase("Firefox")) {	
				String mycurrentproject=System.getProperty("user.dir");
				System.out.println(mycurrentproject);
				System.setProperty("webdriver.gecko.driver",mycurrentproject+"\\Drivers\\geckodriver.exe");
				loveme=new FirefoxDriver();
				loveme.get(url);
				loveme.manage().window().maximize();
				
			} else {
				System.out.println("thi is not our browser name");
		
		
	}
		}
}

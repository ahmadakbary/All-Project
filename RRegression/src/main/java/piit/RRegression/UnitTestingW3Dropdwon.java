package piit.RRegression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class UnitTestingW3Dropdwon {
static WebDriver apple;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		browser("chrome", "https://www.facebook.com");
		WebElement drop=apple.findElement(By.xpath("//*[@name='birthday_month']"));
		Select ui=new Select(drop);
		ui.selectByIndex(8);
		Thread.sleep(4000);
		ui.selectByValue("10");
		Thread.sleep(5000);
		ui.selectByVisibleText("Jan");
		
		
		WebElement day=apple.findElement(By.xpath("//*[@name='birhtday_day']"));
		Select days=new Select(day);
		ui.selectByIndex(8);
		Thread.sleep(4000);
		//ui.selectByValue(10);
		Thread.sleep(5000);
		ui.selectByVisibleText("14");
		
		
		apple.findElement(By.id("day"));
		
	}

	public static void browser(String browser, String url) throws InterruptedException {
		if (browser.equalsIgnoreCase("chrome")) {
			String mycurrentproject=System.getProperty("user.dir"); 
			System.out.println(mycurrentproject);
			System.setProperty("webdriver.chrome.driver",mycurrentproject+"\\Drivers\\chromedriver.exe");
			apple=new ChromeDriver();
			apple.get(url);
			apple.manage().window().maximize();
			Thread.sleep(3000);	
					
		} else if (browser.equalsIgnoreCase("Firefox")) {	
			String mycurrentproject=System.getProperty("user.dir");
			System.out.println(mycurrentproject);
			System.setProperty("webdriver.gecko.driver",mycurrentproject+"\\Drivers\\geckodriver.exe");
			apple=new FirefoxDriver();
			apple.get(url);
			apple.manage().window().maximize();	
		} else {
			System.out.println("this is not our browser name");
		}
	
	}
	
}

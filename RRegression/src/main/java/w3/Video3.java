package w3;

import java.security.acl.LastOwnerException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

public class Video3 {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

browser("Chrome", "https://www.facebook.com");	

WebElement emailfield=driver.findElement(By.xpath("//input[@name='email']"));	   
WebElement passfield=driver.findElement(By.id("pass"));
Thread.sleep(6000);
WebElement login=driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td/label/input)"));
WebElement login2p=driver.findElement(By.xpath("//button[@type='submit']"));
        
			login2p.click();
            emailfield.sendKeys("ali@yahoo.com");
            Thread.sleep(5000);
		    passfield.sendKeys("Omar4545");
		    login.click();
		     driver.navigate().back();
		
		    WebElement fbutton=driver.findElement(By.xpath("(//*[@name='sex'][1])"));	  
		    fbutton.click();
		  			
	}
	
public static void browser(String browser, String url) {
	if(browser.equalsIgnoreCase("chrome")) {
		String mylocalCDrive=System.getProperty("user.dir");
		System.out.println(mylocalCDrive);
		System.setProperty("webdriver.chrome.driver", mylocalCDrive+"\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to(url);
		driver.navigate().refresh();
		
	}else if (browser.equalsIgnoreCase("Firefox")) {
		String mylocalCDrive=System.getProperty("user.dir");
		System.out.println(mylocalCDrive);
		System.setProperty("webdriver.gecko.driver", mylocalCDrive+"\\Driver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(url);
		driver.navigate().refresh();
	}else {
		System.out.println("wrong webbrowser");
}
		
	}

}

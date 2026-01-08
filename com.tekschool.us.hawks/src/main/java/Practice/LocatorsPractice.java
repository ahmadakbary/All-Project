package Practice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {
public static void main(String[] args) throws InterruptedException {	
	System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
	System.out.println("webpage is "+driver.getTitle());		
	
WebElement Email=driver.findElement(By.xpath("//input[@name='email']"));
WebElement Pass=driver.findElement(By.xpath("//input[@name='pass']"));
WebElement Login=driver.findElement(By.xpath("//button[@name='login']"));
	
	if(Email.isDisplayed()==true) {
		Email.sendKeys("asbehrooz@yahoo.com");
		Thread.sleep(5000);
		Email.clear();
		Email.sendKeys("akbary@gamil.com");
		Pass.sendKeys("jjjjjjjj");
		boolean loginCheck=Login.isEnabled();
		System.out.println(loginCheck);
		Login.click();	
	}else {
		driver.close();
	}
	
}
	}




package Basics;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class locators {
	public static void main(String[] args) {
			
System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
driver.get("https://canvas.instructure.com/login/canvas");
System.out.println("webpage is "+driver.getTitle());

WebElement Email=driver.findElement(By.xpath("//input[@id='pseudonym_session_unique_id']"));
Email.sendKeys("ahmad.akbary008@gmail.com");
		
WebElement Pass=driver.findElement(By.xpath("//input[@name='pseudonym_session[password]']"));
Pass.sendKeys("Ahmad1919");

WebElement Login=driver.findElement(By.xpath("//button[contains(text(),'Log In')]"));
Login.click();
		
WebElement window=driver.findElement(By.xpath("//*[@id=\"___reactour\"]/div[4]/div/div/div/span[1]/span/button"));
window.click();
		

		
		
		
		
		
		
		
		
		
		
	}
	
}

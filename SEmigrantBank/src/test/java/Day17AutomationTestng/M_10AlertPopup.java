package Day17AutomationTestng;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class M_10AlertPopup {
	public static void main(String[] args) {
	
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/");
			
		WebElement search = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']"));
		search.click();
			
				
				Alert alert = driver.switchTo().alert();
		        System.out.println("Message displayed on Alert window is --> "+alert.getText());
		        alert.accept();
		        
		        //Assert.assertTrue(alert.getText().contains("Please select start place"));
				//driver.switchTo().alert().dismiss();

	}

}

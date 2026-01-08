package Day20;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperations {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");
driver.manage().window().maximize();
driver.navigate().refresh();
			
		// Log in process
driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("admin");
driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
			
WebElement Admin=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
WebElement mgnt=driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]"));
WebElement users=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"));
	
	        // MouseHover action
Actions act=new Actions (driver);
	//act.moveToElement(Admin).moveToElement(mgnt).moveToElement(users).click().build().perform();
	
WebElement Directory=driver.findElement(By.xpath("//*[@id=\"menu_directory_viewDirectory\"]/b"));
act.moveToElement(Directory).click().build().perform();
	
	
	}

}

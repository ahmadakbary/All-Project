package Basics;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDragDrop {
public static void main(String[] args) {
	WebDriver driver;
System.getProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
System.out.println("WebPage is "+driver.getTitle());
	
	Actions MoveCursor=new Actions (driver);	
WebElement src=driver.findElement(By.id("draggable"));
WebElement trg=driver.findElement(By.id("droppable"));
MoveCursor.dragAndDrop(src, trg).build().perform();
	
	
	
	}

}

package Day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragAndDrop {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");//webpage is working
driver.manage().window().maximize();
driver.navigate().refresh();
	
	Actions act=new Actions (driver);
	
WebElement src=driver.findElement(By.id("box6"));
WebElement copenhegen=driver.findElement(By.id("box4"));
WebElement trg=driver.findElement(By.id("box106"));
WebElement Denmark=driver.findElement(By.id("box104"));
	
act.dragAndDrop(src, trg).build().perform(); // drag & drop operation
act.dragAndDrop(copenhegen, Denmark).build().perform(); // drag & drop operation

	}

}

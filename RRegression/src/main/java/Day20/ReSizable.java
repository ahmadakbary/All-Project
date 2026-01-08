package Day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ReSizable {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\asbeh\\\\eclipse-workspace\\\\Ahmad-QAEnginer\\\\Drivers\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://jqueryui.com/resizable/");
driver.manage().window().maximize();
driver.navigate().refresh();
	
Actions act=new Actions(driver);
	
driver.switchTo().frame(0);
Thread.sleep(5000);
WebElement resize=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));

	//Resizing Elements
act.moveToElement(resize).dragAndDropBy(resize, 40, 50).build().perform();
	
	
	}
}







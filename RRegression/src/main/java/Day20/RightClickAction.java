package Day20;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.htm1"); //webpage is not working
driver.manage().window().maximize();
driver.navigate().refresh();

WebElement button=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));

		//Right click operation ContextClick does the click operation on button
Actions obj=new Actions (driver);
obj.contextClick(button).build().perform(); //Right click operation

driver.findElement(By.xpath("/html/body//ul/li[3]/span")).click();
Thread.sleep(5000);

		// Alert is a class we have to imported for alert windows
Alert al=driver.switchTo().alert();
System.out.println(al.getText());
al.accept(); //accept will close the alert box


	}

}

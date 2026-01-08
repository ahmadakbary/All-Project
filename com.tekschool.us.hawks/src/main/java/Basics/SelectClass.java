package Basics;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SelectClass {
public static void main(String[] args) {
	WebDriver driver;
	
System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
driver.get("http://tek-school.com/retail/index.php?route=product/category&path=20");
driver.navigate().refresh();
System.out.println("WebPage is "+driver.getTitle());
	

WebElement SortBy=driver.findElement(By.xpath("//select[@id='input-sort']"));	
	Select drop=new Select(SortBy);
//drop.selectByVisibleText("Rating (Highest)");
//drop.selectByIndex(3);
//drop.selectByValue("");
	
	
	
	

	}

}

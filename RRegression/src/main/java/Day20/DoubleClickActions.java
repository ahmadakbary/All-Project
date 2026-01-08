package Day20;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
public class DoubleClickActions {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://api.jquery.com/dblclick/"); //Web page is working
driver.manage().window().maximize();
driver.navigate().refresh();
			
	Actions act=new Actions(driver);
	
driver.switchTo().frame(0); // switch to frame.
WebElement ele=driver.findElement(By.xpath("/html/body/div"));	
for (int i=1; i<20; i++) { //for loop help us repeat the double clicks 20times
act.doubleClick(ele).build().perform();//this command perform the double click actions.
Thread.sleep(3000);
			
	}
	}
}

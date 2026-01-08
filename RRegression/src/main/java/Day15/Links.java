package Day15;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
driver.navigate().refresh();
driver.manage().window().maximize();

			//action linkText 
driver.findElement(By.linkText("Software Testing Tutorials")).click(); // this open the link 
driver.navigate().back(); // navigate().back go back to periouse page.

Thread.sleep(6000);

			//Particial LinkText
driver.findElement(By.partialLinkText("Software Testing")).click();
driver.navigate().back();
driver.navigate().forward(); // this command forward to the next page

	}

}

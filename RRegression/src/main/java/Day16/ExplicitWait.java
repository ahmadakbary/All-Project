package Day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

		// this is Explicit wait declaration
 WebDriverWait mywait = new WebDriverWait(driver,10000);

driver.get("");
driver.manage().window().maximize();
driver.navigate().refresh();

                // Login, how to used explicit wait on user name 

WebElement username=mywait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
username.sendKeys("ahmad");

WebElement password=mywait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
password.sendKeys("ahmad");

driver.findElement(By.name("login")).click();

WebElement radiobutton=mywait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[value=oneway")));
radiobutton.click();





	}

}

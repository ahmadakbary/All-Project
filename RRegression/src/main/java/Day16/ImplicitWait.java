package Day16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.get("");
driver.manage().window().maximize();
driver.navigate().refresh();

// longin steps
driver.findElement(By.name("name")).sendKeys("ahmad");
driver.findElement(By.name("password")).sendKeys("asb");
driver.findElement(By.name("signin")).click();

Thread.sleep(5000);

driver.findElement(By.name("user")).sendKeys("ahmad");
driver.findElement(By.name("password")).sendKeys("shekaib");
driver.findElement(By.name("login")).click();

//if you automate the airline roundtrip and one way roundtrip is always by selected by default and if you want to 
//select one way then you inspect and use sccslector write the ("input[value=oneway]") when you copy and past it 
//always shows like ["\value=oneway\] remove the quatations and forward slashesh.

driver.findElement(By.cssSelector("input[value=oneway]")).click();

		
	}

}

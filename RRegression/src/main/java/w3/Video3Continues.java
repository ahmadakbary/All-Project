package w3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Video3Continues {
public static WebDriver driver;
	
	public static void main(String[] args) {
browser("firefox", "https://www.homedepot.com");

WebElement months=driver.findElement(By.xpath("//*[@name='birthday_month']"));
Select Month=new Select(months);
Month.selectByIndex(5);
Month.selectByValue("3");
Month.selectByVisibleText("Jan");

WebElement Days=driver.findElement(By.xpath("//*[@name='birthday_day']"));
Select Day=new Select(Days);
Day.selectByIndex(15);
Day.selectByValue("3");
Day.selectByVisibleText("15");

WebElement Years=driver.findElement(By.xpath("//*[@name='birthday_year']"));	
Select Year=new Select(Years);
Year.selectByVisibleText("1988");


	}		
public static void browser(String browser, String url) {
	if (browser.equalsIgnoreCase("Chrome")) {
		//String MyCDrive=System.getProperty("user.dir");
		//System.out.println(MyCDrive);
System.setProperty("webdriver.chrome.driver","C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.navigate().refresh();
			
} else if (browser.equalsIgnoreCase("Firefox")) {
	   // String MyCDrive=System.getProperty("user.dir");
	    //System.out.println(MyCDrive);
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);
 		driver.navigate().refresh();	
}else {
	System.out.println("thi is the wrong browser");
}
			}
	}	








							
							
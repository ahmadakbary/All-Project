package Basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
public static void main(String[] args) {
			WebDriver driver;
	
System.getProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://xndev.com/display-image/");	
	
WebElement UploadFile=driver.findElement(By.xpath("//input[@type='file']"));
UploadFile.sendKeys("C:\\Users\\asbeh\\eclipse-workspace\\com.tekschool.us.hawks\\ScreenShots\\Pic-001.png");
}
}
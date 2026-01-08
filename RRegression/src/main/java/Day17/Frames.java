package Day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index");
driver.manage().window().maximize();
driver.navigate().refresh();
driver.getCurrentUrl();
		
//if we have three frames and we want to test it will not run because webelement can't go directly
// we have to use the switch statement we have three approach to switch the frame.
		
		// Frame1
driver.switchTo().frame("packageListFrame");
driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		// this code will take you back to frame1 and then it goes to frame2
driver.switchTo().defaultContent(); 
		
		// Frame2
driver.switchTo().frame("packageFrame");
driver.findElement(By.linkText("WebDriver")).click();
		
		// this code will take you back to frame1 and then it goes back to frame3
		
driver.switchTo().defaultContent();
		// Frame3
driver.switchTo().frame("classFrame");
driver.findElement(By.linkText("/html/body/div[1]/ul/li[7]")).click();
		
	
		

	}

}

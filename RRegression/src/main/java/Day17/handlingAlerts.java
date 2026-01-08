package Day17;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingAlerts {

	public static void main(String[] args) throws InterruptedException {
	
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://testautomationpractice.blogspot.com/");
driver.navigate().refresh();
driver.manage().window().maximize();
	
// Round-1: Verification OK button functionality

driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button")).click();
		
// allert or popup or not an element and we can not inspect any popup or allert element
//whenever when you see an alert window you have to use the switchTo().alert();
				
Thread.sleep(6000);
Alert alertwindow=driver.switchTo().alert();
alertwindow.accept(); //close alert window by using OK!
		
String act_text=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		
if(act_text.equals("Your pressed OK!")) {
	System.out.println("Test passed with OK button...");	
}
else {
	System.out.println("Test failed with OK button....");
	
}
// Round-2: Verification OK button functionality. just remove the Alert and String because 
// we have used once in the first method.also change the OK buttons to Cancel buttons

driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button")).click();
			
// alert or popup or not an element and we can not inspect any popup or allert element 
// whenever when you see an alert window you have to use the switchTo().alert();
					
Thread.sleep(6000);
alertwindow=driver.switchTo().alert();
alertwindow.dismiss(); //close alert window by using cancel button by using dismiss!
			
act_text=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
			
if(act_text.equals("You Pressed Cancel!")) {
System.out.println("Test passed with Cancel button...");	
	}
else { 
System.out.println("Test failed with Cancel button....");
	}
}	
	}






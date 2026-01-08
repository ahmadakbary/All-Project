package w2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

public class Video2 {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {	
browser("Chrome","https://www.facebook.com");	

WebElement firstnamefield=driver.findElement(By.id("u_0_m"));
 		   firstnamefield.sendKeys("ahmad");
 		   Thread.sleep(5000);
 		   driver.findElement(By.name("lastname")).sendKeys("Shekaib");
 		   
WebElement forgotaccount=driver.findElement(By.linkText("Forgot account?"));
 		   forgotaccount.click();
 		   	Thread.sleep(3000);
 		   	driver.navigate().back();
 		   	
WebElement cellphonefield=driver.findElement(By.id("u_0_r"));
 			cellphonefield.sendKeys("XXX-XXX-XXXX");
 			
WebElement passwordfield=driver.findElement(By.id("password_step_input"));
 	passwordfield.sendKeys("xxx-xxx-xxxxxx");
    		Thread.sleep(4000);
WebElement maleselector=driver.findElement(By.id("u_0_7"));
 	maleselector.click();
 	
WebElement signupbutton=driver.findElement(By.id("u_0_13"));
 	signupbutton.click();
 			 	
 	//WebElement partialtext=driver.findElement(By.partialLinkText("Forgot"));
 	//partialtext.click();
		
	}
public static void browser(String browser,String url) throws InterruptedException {
if (browser.equalsIgnoreCase("Chrome")) {
	String MyCdrive=System.getProperty("user.dir");
	System.out.println(MyCdrive);
System.setProperty("webdriver.chrome.driver", MyCdrive+"\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	Thread.sleep(5000);
	driver.get(url);
	driver.navigate().refresh();
			
} else if (browser.equalsIgnoreCase("Firefox")) {
	String MyCdrive=System.getProperty("user.dir");
	System.out.println(MyCdrive);
	System.setProperty("webdriver.gecko.driver", MyCdrive+"\\Driver\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get(url);
	driver.navigate().refresh();
}else {
	System.out.println("Wrong broswer name");
		
}
			
}	
}
		
	


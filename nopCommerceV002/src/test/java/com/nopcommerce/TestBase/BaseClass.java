package com.nopcommerce.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
public WebDriver driver;
	
@BeforeClass
public void setup() {
	
String mylocaldrive=System.getProperty("user.dir");
System.setProperty("webdriver.chrome.driver",mylocaldrive + "\\Drivers\\chromedriver.exe");
driver=new ChromeDriver();	
System.out.println(driver.getTitle());
}





@AfterClass
public void tearDown(){
driver.quit();
	}
}

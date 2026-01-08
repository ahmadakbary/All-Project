package com.nopcommerce.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
public WebDriver driver;

	@BeforeClass
	public void setup() {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\asbeh\\eclipse-workspace\\FrameWork\\Driver\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
System.out.println(driver.getTitle());
	
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
}
}
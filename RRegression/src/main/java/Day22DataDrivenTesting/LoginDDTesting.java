package Day22DataDrivenTesting;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDDTesting {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com");//Web is not working
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		String path="C://Selenium Drivers/login1.xlsx";
		int rows=XLUtils.getRowCount(path, "Sheet1");
		
		for (int i=1; i<=rows; i++)
			
		{
		String username=XLUtils.getCellData(path, "Sheet1", i, 0);
		String password=XLUtils.getCellData(path, "Sheet1", i, 1);	
		
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		
		String title=driver.getTitle();
		
		driver.findElement(By.linkText("Home")).click();
		
		
		
		
		
		if (title.equals("Find a Flight: Mercury Tours: "))
		{
			System.out.println("login is passed");
			XLUtils.setCellData(path, "Sheet1",i, 2, "Test Passed");
		}
		else
		{
			System.out.println("Login is failed");
			XLUtils.setCellData(path, "Sheet1", i, 2, "Test failed");
}
}
	}
}
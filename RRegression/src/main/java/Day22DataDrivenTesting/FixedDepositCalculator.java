package Day22DataDrivenTesting;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FixedDepositCalculator {

public static void main(String[] args) throws IOException, InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
driver.manage().window().maximize();
driver.navigate().refresh();
			
String path = "C://Selenium Drivers/Calculation.xlsx";
int rowcount=XLUtils.getRowCount(path, "Sheet1");
	for (int i=1; i<=rowcount; i++)
	{
String price=XLUtils.getCellData(path, "Sheet1" ,i, 0);
String RateofInterest=XLUtils.getCellData(path, "Sheet1" ,i, 1);
String PeriodYear=XLUtils.getCellData(path, "Sheet1" ,i, 2);
String Frequency=XLUtils.getCellData(path, "Sheet1" ,i, 3);
		
	// becuase we are going to test the expected of Maturity Values we should
	// pass it double as below.
double Expected_MValue=Double.parseDouble(XLUtils.getCellData(path, "Sheet1" ,i, 4));

	//Passing values to the application
driver.findElement(By.id("principal")).sendKeys(price);
driver.findElement(By.id("interest")).sendKeys(RateofInterest);
driver.findElement(By.id("tenure")).sendKeys(PeriodYear);

	//this column has dropdown therefore we should use Select class
Select drp=new Select(driver.findElement(By.id("tenurePeriod")));
drp.selectByVisibleText("year(s)");

Select frequencydrp=new Select(driver.findElement(By.id("frequency")));
frequencydrp.selectByVisibleText(Frequency);

driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img")).click();

	//Capture actual maturity value from application

String actual_mvalue=driver.findElement(By.xpath("//*[@id=\"resp_matval\"]/strong")).getText();

if (Expected_MValue==Double.parseDouble(actual_mvalue))
	{
	System.out.println("Test is passed with" +i+ "Row");
	}
else 
	{
System.out.println("Test is failed with" +i+ "Row");
	}
driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[2]/img")).click();
		
	Thread.sleep(5000);
}
}
}







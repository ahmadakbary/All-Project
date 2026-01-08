package Day25Parameterization;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
public class DataProviderExample {
	WebDriver driver;
		
@BeforeClass
void setup()
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\chromedriver.exe");
driver=new ChromeDriver();
	}
// how we should know the connections between dataprovider and the test case
// we need to dataProvider at the test case which is line 29
	
// the uname and pwd we want to run this multiple times with different uname & pwd
// the uname pwd are provided at the line 44 by data provider the advantage of data
// providers.

@Test(dataProvider="users")
void loginTest(String uname, String pwd)
	{
driver.get("http://newtours.demoaut.com");// web is not preforming
driver.findElement(By.name("userName"));
driver.findElement(By.name("password"));
driver.findElement(By.name("login"));
		
String act_title=driver.getTitle();
String exp_title="FInd a Flight: Mercury Tours:";	
	Assert.assertEquals(act_title, exp_title);	
	}
@DataProvider (name="users")
String [][]loginData()
	{
String data [][] = {{"mercury","mercury"},{"mer","mer"},{"mercury1","mer1"}};
return data;
	}
}





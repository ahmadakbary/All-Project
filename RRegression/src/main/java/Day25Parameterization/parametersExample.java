package Day25Parameterization;
import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametersExample {
	WebDriver driver;	
	
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br) throws InterruptedException
	{
		// Launching the test with three browser		
if (br.equals ("chrome"))
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	}
else if (br.equals("fireFox"))
	{
	System.setProperty("webdriver.gecko.driver","C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	}

else if (br.equals("ie"))
	{
	System.setProperty("webdriver.ie.driver", "C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\EIE11_EN-US_MCM_WIN764.EXE");
	driver = new InternetExplorerDriver(); // Fail
	driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	}
	@Test (priority=1)
	void logoTest()
	{
		// validate logo presence
	WebElement logo=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
	Assert.assertTrue(logo.isDisplayed());	
	}
	@Test (priority=2)
	void homePageTitleTest()
	{
		//Title of the home page, line 43 is emphasizing the title of the page.
	String tittle=driver.getTitle();
	Assert.assertEquals(tittle, "OrangeHRM");
		
	}
	@AfterClass
	void tearDown()
	{
		//close browser
		driver.quit();
	}

}

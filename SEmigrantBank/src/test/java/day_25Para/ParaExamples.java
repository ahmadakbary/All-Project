package day_25Para;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParaExamples {
static WebDriver driver;	





	@Test (priority=1)
	public static void logoTest() {
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		Assert.assertTrue(logo.isDisplayed());
	}
		//Validation logo presence
	@Test (priority=2)	
	public static void homePageTitleTest() {
		String tittle=driver.getTitle();
		Assert.assertEquals(tittle, "OrangeHRM");
			
	}
	@Parameters ({"browser","url"})
	@BeforeClass
	public static void browser(String browser, String url) {
	if (browser.equalsIgnoreCase("chrome")) {
		String UserDirectoryPath=System.getProperty("user.dir");
		System.out.println(UserDirectoryPath);
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		
		} else if (browser.equalsIgnoreCase("Firefox")){
		String UserDirectoryPath=System.getProperty("user.dir");
		System.out.println(UserDirectoryPath);
		System.setProperty("webdriver.gecko.driver",".\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(url);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		
		}else if(browser.equalsIgnoreCase("InternetExplorerDriver")){
		String UserDirectoryPath=System.getProperty("user.dir");
		System.out.println(UserDirectoryPath);
		System.setProperty("webdriver.ie.driver",".\\drivers\\IEDriverServer.exe");
		driver=new InternetExplorerDriver(); // Fail
		driver.get(url);
		driver.navigate().refresh();
		driver.manage().window().maximize();	
		
		}else {
		System.out.println("try the correct browser");	
	}
	}
	@AfterClass
		public static void aftermthod() {
			driver.close();
			driver.quit();			
		}
		public static void Screenshots() throws IOException {
		String UserDirectoryPath=System.getProperty("user.dir");
		System.out.println(UserDirectoryPath);
		Date dt=new Date();
		String st=dt.toString().replace(" ","-").replace(":","-")+".jpg";
		File takepic=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(takepic, new File(UserDirectoryPath+"\\Picture"+st));		
		}
		
			
		}
		
		
		
		
			
		

		






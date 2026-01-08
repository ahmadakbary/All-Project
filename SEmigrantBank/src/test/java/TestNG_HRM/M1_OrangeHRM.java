package TestNG_HRM;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class M1_OrangeHRM {
public static WebDriver driver;
public static void main(String[] args) throws InterruptedException, IOException {	
	SetUpBrowsers("chrome", "https://opensource-demo.orangehrmlive.com/");


		
	WebElement userName = driver.findElement(By.cssSelector("input#txtUsername"));
	WebElement password = driver.findElement(By.cssSelector("input#txtPassword"));
	//WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
	//WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
	WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
	
		userName.clear();
		password.clear();
		
		System.out.println(userName.isDisplayed());
		System.out.println(password.isDisplayed());
	
		
		userName.sendKeys("Admin");
		password.sendKeys("admin123");
		loginBtn.click();
	
	
	String actualTitle = driver.getTitle();
	String expectedTitle = "OrangeHRM";
//	if (actualTitle.equals("OrangeHRM")) {
//		System.out.println("login test passed");
//	}else {
//		System.out.println("login test failed");
//	}
	
	Assert.assertEquals(actualTitle, expectedTitle);
	
	//one way verification for login and page Title
	String GetCurrentUrl = driver.getCurrentUrl();
	String currrentUrl = "https://opensource-demo.orangehrmlive.com/";
	TakeScreenshots(driver, "pic-001");
	
	//second way verification
	if (actualTitle.contains(expectedTitle)) {
		System.out.println("login test is passed successfully");
	}else {
		System.out.println("login test is failed successfully");
		
		
		
	}
}

	public static void SetUpBrowsers(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		driver.navigate().refresh();
	//	System.out.println(driver.getTitle());
	//	System.out.println(driver.getCurrentUrl());	
	} else if(browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get(url);
		driver.get(url);
		driver.navigate().refresh();
	//	System.out.println(driver.getTitle());
	//	System.out.println(driver.getCurrentUrl());		
	} else if (browser.equalsIgnoreCase("ie")) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\asbeh\\eclipse-workspace\\Ahmad_Akbary_teladoc_challenge\\drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		driver.navigate().refresh();
	//	System.out.println(driver.getTitle());
	//	System.out.println(driver.getCurrentUrl());
	}else {
		System.out.println("please try the corrct browser");
		
		
	}
	}
		public static void TakeScreenshots(WebDriver driver, String fileName) throws IOException {	
			String  path = ".\\screenShotFolder\\";
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File(path+fileName+".png"));
		
		
	}
		
	}
		
	











package Day14_AutomationTesting;
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
public class M2_GetCommandsAndConditionalCommands {
	public static WebDriver driver;
public static void main(String[] args) {
	SetUpBrowsers("chrome", "http://demo.automationtesting.in/Register.html");
	
/* Get commands
 * getUrl();
 * getTitle();
 * getCurrent();
 * getPageSource(); 
 * 
 * And Conditional Commands
 */
	
	String PageTile = driver.getTitle();
	String TitleIs = "Register";
		if (TitleIs.equals("Register")) {
			System.out.println("Resgister page exist in web");
		}else {
			System.out.println("Register page not exist in web");
		}
			
	String GetUrl = driver.getCurrentUrl();
	String CurrentUrl = "http://demo.automationtesting.in/Register.html";
		if (CurrentUrl.equals("http://demo.automationtesting.in/Register.html")) {
			System.out.println("Test is passed");
		}else {
			System.out.println("Test is failed");
		}
		
		System.out.println(PageTile);
		System.out.println(GetUrl);
		
		WebElement fName= driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input"));
		fName.clear();
		fName.sendKeys("Ahmad");
		System.out.println("firstName diplayed..\t" +fName.isDisplayed());
		System.out.println("firstName enabled..\t"  +fName.isEnabled());
				
		WebElement LName= driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input"));
		LName.clear();
		LName.sendKeys("Omar");
		System.out.println("lastName diplayed..\t" +LName.isDisplayed());
		System.out.println("lastName enabled..\t"  +LName.isEnabled());
				
		WebElement address = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea"));
		address.clear();
		address.sendKeys("2323 autobone Trail dr, Aldie VA");
		
		WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
		Email.clear();
		boolean EmailCheck = Email.isEnabled();
		Email.sendKeys("akbary@yahoo.com");
		
		WebElement phone = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[4]/div/input"));
		boolean phoneField = phone.isDisplayed();
		phone.sendKeys("703-000-1122");
		
		WebElement GenderMale = driver.findElement(By.xpath("//input[@value='Male']"));
		System.out.println("Gender seelcted..\t" +GenderMale.isDisplayed());
		System.out.println("Gender enabled..\t"  +GenderMale.isEnabled());
		System.out.println("Gender seelcted BEFORE CLICK..\t" +GenderMale.isSelected());
		GenderMale.click();
		System.out.println("Gender seelcted AFTER CLICK..\t"  +GenderMale.isSelected());
		
		WebElement Cricket = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		Cricket.click();
		
		WebElement movies = driver.findElement(By.xpath("//input[@id='checkbox2']"));
		movies.click();
		
		if (movies.isSelected()) {
			Assert.assertTrue(true);
			System.out.println("Movies selected");
		}else {
			Assert.assertTrue(false);
			System.out.println("Movies not selected");
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
	driver.navigate().refresh();
//	System.out.println(driver.getTitle());
//	System.out.println(driver.getCurrentUrl());		
} else if (browser.equalsIgnoreCase("InternetExplorer")) {
	System.setProperty("webdriver.ie.driver", ".\\drivers\\IEDriverServer.exe");
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
		String  path = ".\\ScreeShots\\";
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(path+fileName+".png"));
	}
}
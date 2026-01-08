package Day14_AutomationTesting;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import cucumber.api.cli.Main;
public class M5_DynamicDropdowns {
	public static WebDriver driver;
	public static void main(String[] args) {
		SetUpBrowsers("chrome", "http://demo.automationtesting.in/Register.html");
		
	driver.findElement(By.xpath("//*[@id=\"msdd\"]")).click();
	
	
	List<WebElement>langs = driver.findElements(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[1]/a"));
	System.out.println(langs.size());
	
	for (WebElement e:langs) {
		System.out.println(e.getText());
	
		langs.get(0).click();
		langs.get(2).click();
		langs.get(3).click();
	

		
		
		
		
		
		
		
		
		
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
		
//			System.out.println(driver.getTitle());
//			System.out.println(driver.getCurrentUrl());	
		} else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.get(url);
			driver.navigate().refresh();
//			System.out.println(driver.getTitle());
//			System.out.println(driver.getCurrentUrl());		
		} else if (browser.equalsIgnoreCase("InternetExplorer")) {
			System.setProperty("webdriver.ie.driver", ".\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(url);
			driver.navigate().refresh();
//			System.out.println(driver.getTitle());
//			System.out.println(driver.getCurrentUrl());
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
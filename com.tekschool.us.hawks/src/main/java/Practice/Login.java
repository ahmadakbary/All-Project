package Practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

public class Login {
	static WebDriver driver;
	
public static void main(String[] args) {		
browser("InterNetExplorer", "https://www.walmart.com");

}	
	public static void browser(String browser, String url) {
	if (browser.equalsIgnoreCase("Chrome")) {
		String UserPath=System.getProperty("user.dir");
		System.out.println(UserPath);
		System.setProperty("webdriver.chrome.driver", UserPath+ ".\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		System.out.println("Webpage is "+driver.getTitle());
		driver.close();
		
	}else if (browser.equalsIgnoreCase("firefox")) {
		String UserPath=System.getProperty("user.dir");
		System.out.println(UserPath);
		System.setProperty("webdriver.gecko.driver", UserPath+ ".\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		System.out.println("WebPage is "+driver.getTitle());
		driver.close();
		
	}else if(browser.equalsIgnoreCase("InternetExplorer")) {
		String UserPath=System.getProperty("user.dir");
		System.out.println(UserPath);
		System.setProperty("webdriver.ie.driver","C:\\Users\\asbeh\\eclipse-workspace\\SeleniumLecture\\Drivers\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		System.out.println("WebPage is "+driver.getTitle());
		
	}else {
		System.out.println("try the correct browser");
	}
}
}

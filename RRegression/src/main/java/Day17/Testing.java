package Day17;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testing {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
			
System.setProperty("webdriver.chrome.driver","C:\\Users\\asbeh\\eclipse-workspace\\Ahmad-QAEnginer\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	
		driver.navigate().to("https://www.google.com");
		driver.get("https://www.amazon.com");
		Thread.sleep(7000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().forward();
		driver.get("https://www.homedepot.com");
		driver.close();
		
		
System.setProperty("webdriver.gecko.driver", "C:\\Users\\asbeh\\eclipse-workspace\\Ahmad-QAEnginer\\Drivers\\geckodriver.exe");
	driver=new FirefoxDriver();	
		
	driver.navigate().to("https://www.google.com");
		driver.get("https://www.amazon.com");
		Thread.sleep(7000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().forward();
		driver.get("https://www.homedepot.com");
		driver.close();
		
		
		

}
}
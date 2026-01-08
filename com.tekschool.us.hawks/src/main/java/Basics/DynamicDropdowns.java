package Basics;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropdowns {
	public static WebDriver driver;
public static void main(String[] args) throws InterruptedException, IOException {
	browsers("chrome", "https://www.aa.com/");
	
WebElement From=driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport']"));
From.clear();
Thread.sleep(4000);
From.sendKeys("Washington");
		
List<WebElement> Departs=driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));	
	for (WebElement departure: Departs) {		
		if (departure.getText().contains("BWI")) {	
			departure.click();
			break;
}
}
WebElement TO=driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
	TO.clear();
	TO.sendKeys("Frankfurt");
		
List <WebElement> Arrival=driver.findElements(By.xpath("//ul[@id='ui-id-2']/li/a"));
	for (WebElement arrive: Arrival) {
		if(arrive.getText().equals(Arrival)) {
			arrive.click();
			break;
	}
	}					
WebElement NumberOfPassenger=driver.findElement(By.xpath("//select[@id='flightSearchForm.adultOrSeniorPassengerCount']"));
Select NoOfPassenger=new Select(NumberOfPassenger);
//NoOfPassenger.selectByIndex(7);
NoOfPassenger.selectByValue("1");
		
		
WebElement departureDate=driver.findElement(By.id("aa-leavingOn"));
JavaScriptExecutor.selectDateByHJS(departureDate, "10/25/2020", driver);

WebElement ReturnDate=driver.findElement(By.id("aa-returningFrom"));
JavaScriptExecutor.selectDateByHJS(ReturnDate, "10/29/2021", driver);
		
WebElement SearchBtn=driver.findElement(By.id("flightSearchForm.button.reSubmit"));
//SearchBtn.click();


		
		
		
		

	
}
public static void browsers(String browser, String url	) {	
	if(browser.equalsIgnoreCase("chrome")) {
	String UserPath=System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", UserPath+ ".\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.navigate().refresh();
	driver.get(url);
	System.out.println("WebPage is "+driver.getTitle());
		
}else if(browser.equalsIgnoreCase("firefox")) {					
	String UserPath=System.getProperty("user.dir");
	System.setProperty("webdriver.gecko.driver", UserPath+ ".\\Drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.navigate().refresh();
	driver.get(url);
	System.out.println("WebPage is "+driver.getTitle());
						
} else if(browser.equalsIgnoreCase("InternetExplorer")) {
	String UserPath=System.getProperty("user.dir");
	System.setProperty("webdriver.ie.driver", UserPath+ ".\\Drivers\\IEDriverServer.exe");
	driver=new InternetExplorerDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.navigate().refresh();
	driver.get(url);
	System.out.println("WebPage is "+driver.getTitle());
	} else {
	System.out.println("Plz try different browser");				
				}		
				}
			}

package Basics;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AlertsWindowHandling {
	static WebDriver driver;
public static void main(String[] args) {
	browsers("chrome", "https://ksrtc.in/oprs-web/");
		
WebElement CrmWindow=driver.findElement(By.xpath("//p[text()='CRM']"));
	CrmWindow.click();
	
//switch from Pwindow to Cwindow use windowHandles & return is Set.		
	Set<String>Whandles=driver.getWindowHandles();
	
//use iterator collection to iterate through set
	Iterator<String> itr=Whandles.iterator();
		
//catch parent window handler id in a String
	String PWindow=itr.next();
	String CWindow=itr.next();
	
	System.out.println("P-WindowHandles S-ID "+PWindow);
	System.out.println("C-WindowHandles S-ID "+CWindow);
		
//Switched from PWindow to Cwindow using switch method
	driver.switchTo().window(CWindow);
	System.out.println("This is Child window ID "+driver.getTitle());
			
	//driver.close will close the child window
	driver.close();
	//this code switch the window from child to parent	
		driver.switchTo().window(PWindow);
		System.out.println("take us back to parent window"+driver.getTitle());
		
	WebElement SearchBtn=driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']"));
	SearchBtn.click();
		
	System.out.println("Message from popup alert-------->" +driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();	
		
	String userName="admin";
	String password="admin";
//http://userName:password@the-internet.herokuapp.com/basic_auth	
	String url="http://"+userName+":"+password+"@"+"the-internet.herokuapp.com/basic_auth";
	System.out.println(url);
		
		
		
		
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
						
} if(browser.equalsIgnoreCase("InternetExplorer")) {
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

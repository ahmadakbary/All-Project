package Practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassPracticeFive {
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
 browser("chrome", "http://tek-school.com/retail/");		

	/*
	 * Create a class in practice package and name it ClassPracticeFive
	 * -Open test environment and move mouse over laptops & Notebooks
	 * -double click on show all laptops & notbooks element
	 * sort by price (low> high) or short by dropdowns
	 * navigate to https://ksrtc.in/oprs-web/ and click on app store element
	 * then switch driver to child window and print title and close the window
	 * switch back to parent and click on search for bus option
	 */
	
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
		public static void browser(String browser, String url) throws InterruptedException {
		if (browser.equalsIgnoreCase("Chrome")) {
			String UserPath=System.getProperty("user.dir");
			System.out.println(UserPath);
			System.setProperty("webdriver.chrome.driver",UserPath+ ".\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.navigate().refresh();
			System.out.println("Webpage is "+driver.getTitle());
			Thread.sleep(4000);
		//	driver.close();
			
		}else if (browser.equalsIgnoreCase("firefox")) {
			String UserPath=System.getProperty("user.dir");
			System.out.println(UserPath);
			System.setProperty("webdriver.gecko.driver", UserPath+ ".\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.navigate().refresh();
			System.out.println("WebPage is "+driver.getTitle());
			//driver.close();
			
		}else if(browser.equalsIgnoreCase("InternetExplorer")) {
			String UserPath=System.getProperty("user.dir");
			System.out.println(UserPath);
			System.setProperty("webdriver.ie.driver","C:\\Users\\asbeh\\eclipse-workspace\\SeleniumLecture\\Drivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.navigate().refresh();
			System.out.println("WebPage is "+driver.getTitle());
			
		}else {
			System.out.println("try the correct browser");
		}
	}
	}

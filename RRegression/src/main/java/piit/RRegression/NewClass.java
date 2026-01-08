package piit.RRegression;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewClass {
public static WebDriver driver;

public static void main(String[] args) throws InterruptedException {
	
browser("Chrome","https://www.homedepot.com");

	}
	public static void browser(String browser, String url) throws InterruptedException {
		if (browser.equalsIgnoreCase("Chrome")) {
			
	String myDirectories=System.getProperty("user.dir");	
	System.out.println(myDirectories);
	System.setProperty("webdriver.Chrome.driver",myDirectories+ " \\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to(url);
    driver.manage().window().maximize();
    Thread.sleep(5000);
    driver.get(url);
    driver.navigate().refresh();
    Thread.sleep(6000);
    driver.manage().window().maximize();
    Thread.sleep(6000);
    driver.navigate().back();
    driver.navigate().forward();
    driver.close();
	
		} else if( browser.equalsIgnoreCase("Firefox")) {
	String MyDirectories=System.getProperty("user.dir");
	System.out.println(MyDirectories);
	System.setProperty("webdriver.gecko.driver", MyDirectories+ "\\Driver\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.navigate().to(url);
	Thread.sleep(6000);
	driver.navigate().refresh();
	driver.manage().window().maximize();
	driver.get(url);
	driver.navigate().refresh();
	Thread.sleep(6000);
	driver.manage().window().maximize();
	Thread.sleep(6000);
	driver.navigate().back();
	driver.close();

	
		} else {
			System.out.println("try again later");
		
		}
	}
	}


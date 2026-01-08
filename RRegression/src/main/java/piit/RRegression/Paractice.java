package piit.RRegression;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Paractice {

public static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
			
browser("Firefox", "https://www.walmart.com");
	
	}	
	public static void browser(String browser, String url) throws InterruptedException {
		if (browser.equalsIgnoreCase("Chrome")) {
			
	
	String MylocalDriver=System.getProperty("user.dir");
	System.out.println(MylocalDriver);
	System.setProperty("webdriver.Chrome.driver",MylocalDriver+ "\\\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	Thread.sleep(6000);
	driver.get(url);
	driver.manage().window().maximize();
	driver.navigate().refresh();
	Thread.sleep(5000);
	driver.navigate().to(url);
	driver.navigate().refresh();
	Thread.sleep(5000);
	driver.manage().window().maximize();
	driver.navigate().back();
	Thread.sleep(5000);
	driver.close();
		
	 }else if (browser.equalsIgnoreCase("Firefox")) {
		
	String mydriver=System.getProperty("user.dir");
	System.out.println(mydriver);
	System.setProperty("webdriver.gecko.driver",mydriver+ "\\Driver\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get(url);
	Thread.sleep(5000);
	driver.manage().window().maximize();
	driver.navigate().refresh();
	Thread.sleep(5000);
	driver.manage().window().maximize();	
	driver.navigate().refresh();
	driver.navigate().back();
	Thread.sleep(5000);
	driver.close();
	}else {
		System.out.println("Sorry the brower you entered not reachable");
	}

	}

}

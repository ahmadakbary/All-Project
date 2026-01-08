package Basics;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class RegisterTest {
	public static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	browsers("chrome", "http://tek-school.com/retail");
		
		
	WebElement MyAccount=driver.findElement(By.xpath("//span[contains(text(),'My Account')]"));
	System.out.println("Status of MyAccount "+MyAccount.isDisplayed());
	MyAccount.click();
	
	WebElement Register=driver.findElement(By.linkText("Register"));
	Register.click();
		
	WebElement FName=driver.findElement(By.xpath("//input[@id='input-firstname']"));
	System.out.println("Status of FName "+FName.isDisplayed());
	WebElement LName=driver.findElement(By.xpath("//input[@id='input-lastname']"));
	System.out.println("Status of LName "+LName.isDisplayed());
	WebElement Email=driver.findElement(By.xpath("//input[@id='input-email']"));
	WebElement Telephone=driver.findElement(By.xpath("//input[@id='input-telephone']"));		
	WebElement Password=driver.findElement(By.xpath("//input[@id='input-password']"));
	WebElement ConfirmPass=driver.findElement(By.xpath("//input[@id='input-confirm']"));
	
	WebElement Yesbutton=driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input"));
	WebElement Nobutton=driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input"));
	WebElement Privacy=driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]"));
	
	WebElement ContinueButton=driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
		
	FName.sendKeys("Ahmad");
	LName.sendKeys("Jamal");
	Email.sendKeys("jj2011@yahoo.com");
	Telephone.sendKeys("123-524-2145");
	Password.sendKeys("12345");
	ConfirmPass.sendKeys("12345");
	
	if (!Yesbutton.isSelected()) {
		Yesbutton.click();
	}
	if (Privacy.isDisplayed()) {
		Privacy.click();
	}
	
	Thread.sleep(5000);
	ContinueButton.click();
	
	WebElement ConfirmationMessages=driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']"));

	String Success=ConfirmationMessages.getText();
	String expectedMessages="Your Account Has Been Created!";
	
	if (Success.equals(expectedMessages)) {
		System.out.println("Register Test Passed");
	}else {
		System.out.println("Register test Failed");
	
	}	
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




















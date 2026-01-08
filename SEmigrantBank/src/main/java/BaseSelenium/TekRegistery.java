package BaseSelenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TekRegistery {
	
	public static WebDriver driver;
public static void main(String[] args) {
	TekRegistery obj = new TekRegistery();
	obj.SetupBrowser("firefox", "http://tek-school.com/retail");
	
	
	driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();

	WebElement firstName = driver.findElement(By.xpath("//input[@id='input-firstname']"));
	WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
	WebElement Email = driver.findElement(By.xpath("//input[@id='input-email']"));
	WebElement Telephone = driver.findElement(By.xpath("//input[@id='input-telephone']"));
	WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
	WebElement passwordConfirm = driver.findElement(By.xpath("//input[@name='confirm']"));
	WebElement YesButton = driver.findElement(By.xpath("//input[@value='1' and @name='newsletter']"));
	WebElement NoButton = driver.findElement(By.xpath("//input[@value='0']"));		
	//WebElement Privacy = driver.findElement(By.xpath("//input[@type='checkbox']"));
	WebElement ContinueButton = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
	
	System.out.println("firstName is displayed " + firstName.isDisplayed());
	System.out.println("firstName is enabled " +firstName.isEnabled());
	
	System.out.println("LastName  is displayed " +lastName.isDisplayed());
	System.out.println("lastName enabled "+ lastName.isEnabled());
	
	firstName.sendKeys("A");
	lastName.sendKeys("B");
	Email.sendKeys("aweiofe@yahoo.com");
	Telephone.sendKeys("571-000-0000");
	password.sendKeys("asdf");
	passwordConfirm.sendKeys("asdf");
	

	
	
	if (YesButton.isSelected()) {
		YesButton.click();
	}
	ContinueButton.click();
	
	
	WebElement ConfirmationMessage = driver.findElement(By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]"));
	String success = ConfirmationMessage.getText();
	String expectedMessage = "Your Account Has Been Created!";
	
	if (success.equals("Your Account Has Been Created!")) {
		System.out.println("Registration is passed");
	
}else {
	System.out.println("Registration failed");
}
	
}
	public void SetupBrowser(String browser, String url){
	if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();	
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		System.out.println("Webpage name is  "+driver.getTitle());
		driver.close();
	} else if(browser.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		System.out.println("webpage name is  "+driver.getTitle());	
	}else {
		System.out.println("Wrong browser");	
	}
		
	}

}










package TestNG_HRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Login {
static WebDriver driver;
	
	
	
	@Test (priority=1)
	public static void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asbeh\\eclipse-workspace\\Ahmad-QAEnginer\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();		  
		 }
	@Test (priority=2)
	public static void loginTest(){
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.findElement(By.name("txtUsername")).sendKeys("Admin");
			driver.findElement(By.name("txtPassword")).sendKeys("Admin123");
			driver.findElement(By.name("Submit")).click();
					 
		// validate the HomePage Title
		String act_title=driver.getTitle();//Capture title of the page
		String ext_title="OrangeHRM";
				  	 
	if (act_title.equals(ext_title)){
			System.out.println("My login test is passed.....");
			} else{
			System.out.println("My login test is failed......");
			}
			}
		@Test (priority=3)
	public static void teardown() 
			{
			driver.close();
			}

}
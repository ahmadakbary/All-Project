package Day19;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {
public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");
driver.manage().window().maximize();
driver.getCurrentUrl();
driver.navigate().refresh();
		
		//Action1 Login Regular Process
driver.findElement(By.name("txtUsername")).sendKeys("admin");
driver.findElement(By.name("txtPassword")).sendKeys("admin123");
driver.findElement(By.id("btnLogin")).click();
		
		/*Action1 Login Store element Precess
WebElement username=driver.findElement(By.name("txtUsername"));
WebElement password=driver.findElement(By.name("txtPassword"));
WebElement loginbtn=driver.findElement(By.id("btnLogin"));
username.sendKeys("admin");
password.sendKeys("admin123");
loginbtn.click();*/		
	
		//Admin--> Usermanagment--> User
driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();

Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]")).click();
driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]")).click();
	
		// we need find out how many employees are enabled and disabled?
		// Count number of rows. size the number of rows
		
/*int rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();

		// the count counting the number of enabled 
int count=0;

		// the for loop count all the enabled and disabled rows in the table
for (int i=1; i<=rows; i++) {			
			
String status=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[5]")).getText();

 	if (status.equals("Enabled")) {
 		count++;
 }
}
System.out.println("Total number of users:" +rows);
System.out.println("Number of users Enabled:" +count);
System.out.println("Number of users Disabled:" +(rows-count));*/
		
		}
	

}






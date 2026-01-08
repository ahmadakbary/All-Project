package Day21;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFilesFromChromeBrowsers {
	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.Chrome.driver","C:\\Users\\asbeh\\eclipse-workspace\\Ahmad-QAEnginer\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://demo.automationtesting.in/FileDownload.html");
driver.manage().window().maximize();
driver.navigate().refresh();
					
		//How to download Text File from Chrome Browser	
driver.findElement(By.id("textbox")).sendKeys("Testing my browsers..");
driver.findElement(By.id("createTxt")).click();
driver.findElement(By.id("link-to-download")).click();
Thread.sleep(5000);
		
boolean status=isFileExist("C://Users/asbeh/Downloads/info.txt");
		
if(status==true)
{
System.out.println("pdf downloaded successfully.....");
	}
else 
	{
System.out.println("pdf NOT downloaded successfully.....");
	}

	}   // we have to create one more methods
public static boolean isFileExist(String location) {
		
File f=new File(location);
		
if (f.exists()) 
	{
	return true;
	}
	else
	{
	return false;
	}
	}

}

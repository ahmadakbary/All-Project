package Day21;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFilesFromFireFoxBrowsers {
	public static void main(String[] args) throws InterruptedException {
	
	// so before you download files and PDF files from Firefox you have create 
	// browser profile settings, this below FirefoxProfile is an object we need to
	// create the object of the class before system.setproperty syntaxes.
FirefoxProfile profile=new FirefoxProfile();
profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plain,application/pdf");
profile.setPreference("browser.download.manager.showWhenStarting", false);
profile.setPreference("pdfjs.disabled",  true);// only for pdf file
	
FirefoxOptions option=new FirefoxOptions();
option.setProfile(profile);
	
	// End code
		
System.setProperty("webdriver.gecko.driver","C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\geckodriver.exe");
WebDriver driver=new FirefoxDriver(option);
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
			// how to Download PDF files from Chrome browser
driver.findElement(By.id("pdfbox")).sendKeys("testing....");
driver.findElement(By.id("createPdf")).click();
driver.findElement(By.id("pdf-link-to-download")).click();
				
		Thread.sleep(5000);
				
status=isFileExist("C://Users/asbeh/Downloads/info.pdf");
						
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

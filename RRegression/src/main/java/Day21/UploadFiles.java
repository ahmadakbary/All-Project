package Day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class UploadFiles {
	public static void main(String[] args) throws InterruptedException, FindFailed {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");//webopened but sccripts didn't pass
driver.manage().window().maximize();
driver.navigate().refresh();
		
		// Login & Upload Process
driver.findElement(By.name("txtUsername")).sendKeys("Admin");
driver.findElement(By.name("txtPassword")).sendKeys("admin123");
driver.findElement(By.name("Submit")).click();
			
driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b")).click();
driver.findElement(By.xpath("//*[@id=\"menu_pim_addEmployee\"]")).click();
		
		// Direct Approach to upload files. this cod will not work for every applicatoins 
		//driver.findElement(By.id("photofile")).sendKeys("C://Users\\asbeh/OneDrive/Pictures/Saved Pictures.jpg");
			
driver.findElement(By.id("photfile")).click();
		
	String path="C:\\SikuliXAPI";
	
Pattern fileInputTextBox=new Pattern(path+ "filetxtbox.png");
Pattern openButton =new Pattern (path + "openbtn.png");
		
Screen s=new Screen();
	s.wait(fileInputTextBox, 5);
	s.type(fileInputTextBox, path + "profilepic.jpg");
	s.click(openButton);
		
		
		
}
}
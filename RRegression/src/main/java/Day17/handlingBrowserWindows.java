package Day17;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingBrowserWindows {

	public static void main(String[] args){
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://demo.automationtesting.in/Windows.html");
driver.manage().window().maximize();
driver.navigate().refresh();

// How to capture the handle values of the single page? it's driver.getwindowhandle();
// this give the current window browser. if we use the handles window first we should
// command the first single window handle

//String handlevalue=driver.getWindowHandle();
//System.out.println(handlevalue);

driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
Set<String> handlesvalues=driver.getWindowHandles();

// to get both handlevalues we should use inhance for loop

for (String h:handlesvalues) {
	//System.out.println(h);

// to switch many three window browsers then we can use this below link.

	String title=driver.switchTo().window(h).getTitle();
	if (title.equals("Sakinalium | Home")) {
		driver.findElement(By.xpath("//*@id=\"container\"]/header/div/div/div[2]/u1/li[4]/a"));
		driver.close();
// if you want to close just uncommand line 38 and driver.close
// interview questions how you can close your browser in window? 
	// we can close the browsers by windowhandles &windowhandles
	}
	
}
	}
	

}

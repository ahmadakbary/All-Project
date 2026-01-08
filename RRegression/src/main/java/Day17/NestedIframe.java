package Day17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe {

	public static void main(String[] args) {
	
	// No actions has been taken here.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/frames.html");
		driver.manage().window().maximize();
		driver.navigate().refresh();

		//switch to browsr windows
		// how to close specific browser 
		
		
		
		
		
		
		
		
		
		
	}

}

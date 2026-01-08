package Day15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberOfLinks {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.homedepot.com");
driver.manage().window().maximize();
driver.navigate().refresh();

	// find out how many links present in the webpage

List <WebElement> links=driver.findElements(By.tagName("a"));
System.out.println("this shows how many links on a webpage" + links.size());

			// NOW I WANT TO CAPTURE THE TEXT ELEMENT in console.

 for (WebElement link:links) {
	 	System.out.println(link.getText());
 }

	}

}

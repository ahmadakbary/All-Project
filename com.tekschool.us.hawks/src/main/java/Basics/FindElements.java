package Basics;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FindElements {
public static void main(String[] args) {
WebDriver driver;
		
System.getProperty("webdriver.chrome.driver","");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://tek-school.com/retail");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
System.out.println("WebPage is "+driver.getTitle());
	
//to find all link & print herf attribute value	below is the code
List <WebElement>WebLinks=driver.findElements(By.tagName("a"));
System.out.println("Total of Webpages are "+WebLinks.size());	

//if you want to print all the attributes of herf than below codes
	for(WebElement links: WebLinks) {
	System.out.println(links.getAttribute("href"));
		}
	driver.close();
	
	
	}

}

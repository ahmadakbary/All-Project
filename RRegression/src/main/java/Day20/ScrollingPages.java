package Day20;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPages {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
driver.manage().window().maximize();
driver.navigate().refresh();

JavascriptExecutor js=(JavascriptExecutor)driver;
Thread.sleep(5000);
	
	//Approach1 - scroll down the page on pixel no
js.executeScript("window.scrollBy(0,2000)","");

	//Approach2 - scroll till we found the certain element
WebElement flag=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/table[1]/tbody/tr[86]/td[1]/img"));
js.executeScript("arguments[0].scrollIntoView();",flag);

	//Approach3 -  Navigate to starting position
js.executeScript("window.scrollBy(0,document.body.scrollHeight)");	

Thread.sleep(5000);
	//Navigate to starting position
js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");

	}
}

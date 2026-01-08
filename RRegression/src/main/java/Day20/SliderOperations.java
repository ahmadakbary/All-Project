package Day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderOperations {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://jqueryui.com/slider/");// web page is working fine
driver.manage().window().maximize();
driver.navigate().refresh();

	Actions act=new Actions(driver);
driver.switchTo().frame(0);
WebElement slider=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
act.moveToElement(slider).dragAndDropBy(slider, 500, 0).build().perform();





	}

}

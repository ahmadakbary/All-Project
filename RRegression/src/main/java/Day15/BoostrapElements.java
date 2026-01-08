package Day15;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BoostrapElements {

	public static void main(String[] args) throws InterruptedException { // DAY15
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://demo.automationtesting.in/Register.html");
driver.manage().window().maximize();
driver.navigate().refresh();
		
		
		//Multi Select Drop down
		//Searchable dropdown
		//Links
		//Navigational commands
		
/*driver.findElement(By.xpath("//*[@id=\"msdd\"]")).click();
List <WebElement> langs=driver.findElements(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li/a"));
System.out.println(langs.size()); //Count options from dropdown
		
// how to print all the langauges in consol? we should use inhance method 
for (WebElement e: langs) {
System.out.println(e.getText()); // e.getText prints you all the langauges from the langauges list.
					
// Select langauges from dropdown. every options have some index number which starts from zero
	langs.get(0).click(); // capture the elements from langauges dropdown and click on it
	langs.get(5).click(); 
	langs.get(3).click();*/
	
	Thread.sleep(6000);
	
					//Skills - HTML Drop down	
Select drp=new Select(driver.findElement(By.xpath("//*[@id=\"Skills\"]")));
drp.selectByVisibleText("CSS");
					
					// Country - HTML Drop down
Select countrydrp=new Select(driver.findElement(By.xpath("//*[@id=\"countries\"]")));
countrydrp.selectByVisibleText("Algeria");
			
					// Searchable drop down we need three actions select the elements, sendkeys 
					// to element which is "Demark" and ENTER the element.
	//action 1 
driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
			
	//action 2
driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Denmark");
			
	//action 3
driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.RETURN);
	
			
}			
	}	
	
	



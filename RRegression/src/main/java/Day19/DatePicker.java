package Day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

		// Expected values
String month="January 2021";
String date="25";
		
driver.get("http://www.phptravels.net/");
driver.manage().window().maximize();
driver.navigate().refresh();

		// click on check in flight dates
driver.findElement(By.xpath("//*[@id=\"checkin\"]")).click();
		
while(true) {
String text=driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[1]/nav/div[2]")).getText();
		
		if (text.equals(month)) {		
		break;
	}
		else {
				// Right click on arrow Calendar
driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[1]/nav/div[3]/svg/path")).click(); 
		}
}
		// Select Date from the Calendar when you travel, this syantax is very important to select the dates.
		// it's [contains(text)(),"+date+")] it always come at the end of the xpath.
driver.findElement(By.xpath("/html/body/div[10]/dov[1]/table/tbody/tr/td[contains(text(),"+date+")]")).click();

	}
}

















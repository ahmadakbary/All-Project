package Day19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableWithPagination {
public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
driver.manage().window().maximize();
driver.navigate().refresh();
	
	//how to manage different links on pagination
WebElement paging_Element=driver.findElement(By.xpath("//*[@id='myPager']"));

	//if there is more link you can just pick the tagname like "a" for the "findElements"
	//we have to store it in List<WebElement>
List<WebElement>sub_links=paging_Element.findElements(By.tagName("a"));

	//in sysout we have to find how many links we have in the webpage.
System.out.println("Number of sub links present on pager: " +sub_links.size());

	// the reason we have this if condition because sometimes therefore different 
	// rows and column in the different links therefore we have create if condition here. 
	// for condition is line 36 "clicking on sub links on pager

if (sub_links.size()>0){

	for (int i=1; i<sub_links.size()-1;i++) {
		
	// it shows the continues link process on the web page it dose the next steps when you have
	// like page 1 2 & 3 
		driver.findElement(By.xpath("//a[contains(text(),"+i+")]")).click();
			
int rows=driver.findElements(By.xpath("//tbody[@id='myTable']/tr")).size();
int cols=driver.findElements(By.xpath("//table[@class='table table-hover']/thead/tr/th")).size();
		
 for (int r=1; r<=rows; r++) {   //Incrementing rows in a table
for (int c=1; c<=cols; c++) {   //Incrementing columns in a table
			
	//this xpath shows the number of rows and columns dynamically.
String value=driver.findElement(By.xpath("//*[@id='myTable']/tr["+r+"]/td["+c+"]")).getText();
System.out.print(value+ " "); //just removed ln from sys & add +sign and "" to print all the tables
		}
System.out.println();           // just add one more sysout to print all the table accordingly. 
	    }
	}
}
else {
System.out.println("There are no Sub Links on the pager.....");
		
}
	}
	}
	
	
	
	
	
	


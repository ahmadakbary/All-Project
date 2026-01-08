package Day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_HTML {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://testautomationpractice.blogspot.com/");
driver.navigate().refresh();
driver.manage().window().maximize();
	
	/*WebTable/HTML Table
to test the webtable first we have know how many rows in the table, and rows tables are webelements
	1)	Count how many rows
	2)	Count how many columns
	3)	Retrieve the specific row/column data
	4)	Retrieve all the data from table
	5)	Print book names whose author is Mukesh (Condition based retrieval of data)*/

	// Action1 - Count how many rows in the table
int rows= driver.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr")).size();
System.out.println("Number of rows present in a table "+rows);
	
	// Action2 - Count how many columns in the table
int cols= driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th")).size();
System.out.println("Number of columns present in a table: " +cols);
	
	
	// Action3 - Extracting specific value from a table
String value=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[7]/td[1]")).getText();
System.out.println(value);
	
	// Read all the rows & columns from a table 
	// we have to write for loop for incrementing one rows and one for columns
	
/*System.out.println("Book Name"+"      "+"Author"+"      "+"Subject"+"        "+"Price");	
for (int r=2;r<=rows; r++) {          // represents the rows 7  2
	
for (int c=1; c<=cols;c++ ) {     // represent the columns 4  1
	
//if you want to print all the rows and columns just remove ln from sysout and add plus sign after
// vlaues and add some space as well example line 51

value=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td["+c+"]")).getText();
System.out.println(value);
//System.out.println(value+       );*/

System.out.println();

for (int r=2; r<=rows; r++) {
String author_name= driver.findElement(By.xpath("//table[@name='BookTable']/table/tr["+r+"]/td[2]")).getText();
//System.out.println(author_name);
	
if (author_name.equals("Mukesh")) {
String book_name= driver.findElement(By.xpath("//table[@name='BookTable']/table/tr["+r+"]/td[1]")).getText();
String price_name = driver.findElement(By.xpath("//table[@name='BookTable']/table/tr["+r+"]/td[4]")).getText();
System.out.println(book_name+"        "+author_name+"        "+price_name);
}
		
	
	}
}
}
























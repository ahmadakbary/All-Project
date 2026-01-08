package Day14;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetCommands {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://demo.automationtesting.in/Register.html");
driver.manage().window().maximize();
driver.navigate().refresh();
	
	//get commands
       // ---------------------------		
	//get(URL) open URL of applications.
	//GetTtile(); print you the page title
	//getCurretnUrl(); print you the current URL page
	//getPageSource(); print you the the whole DOME Structrures of the page
				
String PageTitle = driver.getTitle();
System.out.println(" the title of the page is " +PageTitle);
String WebpageCurrentRUL=driver. getCurrentUrl();
System.out.println(driver.getCurrentUrl());
driver.getPageSource();
	//	System.out.println(driver.getPageSource());
		
		
		//Inputbox/text box
	//	---------------------------
	//1) Verify textbox display or not "Command" (isDisplay();
	//2) Is it enabled or not "Command" (isEnabled();
	//3) IsSelected(); "Command" isSelected();
	//3) Provide values or it means write text on it. send keys "book"
	//4) Clear the existing values.
		
		
	/*	Conditional Commands
    ------------------------------------
		1) isDisplayed();
		2) isEnabled();
		3) isSelected(); --> radion button and Checkedboxes
		
these three commnad are provided by webdriver we want to make sure the commands are either true or flse it aways returne boolean values
	*/
	/*Notes
	when you create your xpath if its in double quation like " book" you have to put slash infront of it other otherwise you will get an error
	or you can only write one slash like 'book' then you can't get error. every option is a webelement*/
		
	 //	There are different methods to do the actions
	
WebElement FirstName=driver.findElement(By.xpath("//*[@id= \"basicBootstrapForm\"]/div[1]/div[1]/input"));
WebElement LastName=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
WebElement Address=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
WebElement emailaddress=driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
WebElement Telephone=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
		
Thread.sleep(5000);
FirstName.sendKeys("ahmad");
LastName.sendKeys("Shekaib");
Address.sendKeys("United States");
emailaddress.sendKeys("asbehooz@yahho.com");
Telephone.sendKeys("xxx-xxxx-xxxxxx");
		
System.out.println("Disply the status of FirstName testbox" +FirstName.isDisplayed());
System.out.println("Disply the status of FirstName testbox" +FirstName.isEnabled());
Thread.sleep(6000);

		//FirstName.clear();

		/*Radio buttons/check boxes
		---------------------------
		1) Dispalyed or not()
		2) Enabled or not ()
		3) Selected or not-IsSelected()
		4) Selected radio button/Check box -click()*/
		
WebElement MaleGender=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));	
System.out.println("make sure the male gender is displayed" +MaleGender.isDisplayed());
System.out.println("make sure the make genger is enabled " +MaleGender.isEnabled());
System.out.println("make sure the male gender is selected" + MaleGender.isSelected());
		MaleGender.click();
		
		
		// how to capture the check boxes
		 
WebElement Cricket=driver.findElement(By.id("checkbox1"));
		
System.out.println("make sure the cricket box is displayed "+ Cricket.isDisplayed());
System.out.println("make sure the cricket box is enabled "+ Cricket.isEnabled());
System.out.println("make sure the cricket box is selected "+ Cricket.isSelected());
Cricket.click();
System.out.println("select the box after selections  "+Cricket.isSelected());
		
Thread.sleep(6000);
WebElement Movies=driver.findElement(By.id("checkbox2"));
System.out.println("make sure the Movies box is displayed "+ Movies.isDisplayed());
System.out.println("make sure the Movies box is enabled "+ Movies.isEnabled());
System.out.println("make sure the Movies box is selected "+ Movies.isSelected());
Movies.click();
System.out.println("select the box after selections  "+Movies.isSelected());
		
Thread.sleep(6000);
WebElement Hoki=driver.findElement(By.id("checkbox3"));
System.out.println("make sure the Hoki box is displayed "+ Hoki.isDisplayed());
System.out.println("make sure the Hoki box is enabled "+Hoki.isEnabled());
System.out.println("make sure the Hoki box is selected "+ Hoki.isSelected());
Hoki.click();
System.out.println("select the box after selections  "+Hoki.isSelected());
		
		
	
		
		//DropDown Elements/Combo box/Selected box
		// there is special class is for this drop donw
		//-----------------------------------
				
		// count how many options present in dropdowns options
		// Capture all the options from drop down
		// Select and options from dropdown
		
		
		
		// count how many options present in dropdowns options
	   
WebElement skills_drop = driver.findElement(By.id("Skills"));

Select Skills_dropdown = new Select (skills_drop);
int NumberOfOptions=Skills_dropdown.getOptions().size();
System.out.println("number of options availble in dropdown "+NumberOfOptions);
	    
		// Capture all the options from drop down
	    // List is called an arrayList in java in arraylist we can store multiple arraylist. we have to import the List. every option is an webelement 
	    //and option contains many different "WebElements are not normal data types they are different kind of objects and we can use for options
	    // Storing single webelement inside a variable --->WebElement
	    // Storing multiple Webelements inside the varibale ---> List<WebElement>
	   
List<WebElement> options= Skills_dropdown.getOptions();
	for (WebElement e:options) {
		System.out.println(e.getText());
		    
		    
			// Select an options from dropdown
		    // we have three option to select options from dropdown
		    // select by value
		    // select by visible
		    // selelct by index
		    
		    
//Skills_dropdown.selectByVisibleText("Certifications");
Skills_dropdown.selectByValue("Backup Management");
//Skills_dropdown.selectByIndex(15);




//DAY15

//Multi select dropdown

		driver.findElement(By.xpath("//*[@id=\"msdd\"]")).click();
		List<WebElement> langauges= driver.findElements(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li/a"));
		System.out.println(langauges.size());
		

		
		
	}	
}
	}





















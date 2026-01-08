package Day17;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithInputBox {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://demo.automationtesting.in/Alerts.html");
driver.manage().window().maximize();
driver.navigate().refresh();
		
driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();

Alert alert=driver.switchTo().alert(); 

Thread.sleep(6000);
System.out.println("messsages displayed on alert window is----- "+ alert.getText());
alert.sendKeys("Ahmad akbary"); // this provide text value in side inputbox 
alert.accept();          // this command close the ALERT

				//Capturing Text

String act_text=driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();

if (act_text.contains("Ahmad akbary")){
	System.out.println("test is passed");
}
else {
	System.out.println("test is failed");
}
}
}
	
	
	
	
	
	
	
	
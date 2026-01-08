package w6pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgot {
WebDriver driver;
	
	
	@FindBy (id = "did_submit")
	WebElement forgot;
	
	public Forgot(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void button2() {
		forgot.click();
	}
	}
	
	
	

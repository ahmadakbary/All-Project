package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class W6forgot {
	WebDriver driver;
	
	@FindBy(name ="did_submit")
	WebElement forgot;
	
	public  W6forgot(WebDriver driver) {
		this.driver=driver;
				PageFactory.initElements(driver, this);
	
	}
public void button2() {
	forgot.click();
}
}
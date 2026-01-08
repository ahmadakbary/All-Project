package Expedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {											//Expedia Project
	public WebDriver driver;
	
	@FindBy (className = "//span[contains(text(),'Flights')][1]")
	WebElement Flightbutton;
		
    //@FindBy (className = "uitk-tab-text")
	//WebElement Package;
	
	public HomePage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
		
	public void Flights() {
		Flightbutton.click();
	}
	
		
	
}

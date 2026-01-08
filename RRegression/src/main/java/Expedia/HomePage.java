package Expedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {											//Expedia Project
	public WebDriver driver;
	
	@FindBy (xpath = "//span[@class='uitk-tab-text'][contains(text(),'Flights')]")
	WebElement Flightbutton;
		
    @FindBy (xpath = "//div[@id='location-field-leg1-origin-menu']//button[@class='uitk-faux-input']")
    WebElement LeavingFrom;
    
    @FindBy (xpath = "//div[@id='location-field-leg1-destination-menu']//button[@class='uitk-faux-input']")
    WebElement FlyingTo;
    
    @FindBy (id = "d1-btn")
    WebElement Departing;
    
   @FindBy (xpath  = "//td[@class='uitk-new-date-picker-day-number end endSelected']//button[@class='uitk-new-date-picker-day selected edge'")
   WebElement Returing;
    
    
	
	public HomePage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
		
	public void Flights() {
		Flightbutton.click();
	}
	public void LeavingFromInput() {
		LeavingFrom.sendKeys(" Dulles International AIrport");	
	}
	public void Goingto () {
		FlyingTo.sendKeys(" NYC");
		
	}
	public void DepartingDate() {
		Departing.click();
	}
	public void ReturningDate() {
		Returing.click();
	}
	
		
	
}

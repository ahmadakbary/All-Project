package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TestPageObject extends Base{
	
	public TestPageObject(){
		PageFactory.initElements(driver, this);
		
		
	}		
	@FindBy(xpath = "//input[@name='search']")
	private WebElement Searchfield;
	
	@FindBy(xpath = "//button[@type='button' and @class='btn btn-default btn-lg']")
	private WebElement searchbtn;
	
	@FindBy(xpath = "//img[@title='iPhone']")
	private WebElement iPhoneImage;
	
	public void enterValuesForSearchField(String value) {
		Searchfield.sendKeys("value");
		
	}
	public void clickOnSearchButton() {
		searchbtn.click();
		
		
	}
	public boolean IsIphoneDispalyed() {
		if (iPhoneImage.isDisplayed())
			
			return true;
		else
			return false;
						
}
}

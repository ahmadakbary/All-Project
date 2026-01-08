package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.BaseClassTablets;

public class POMTablets extends BaseClassTablets {
	
	public POMTablets()	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//*[@id=\"menu\"]/div[2]/ul/li[4]/a")
	private WebElement ClickOnTablets;
	
	@FindBy (xpath = "//*[@id=\"content\"]/div[2]/div/div/div[2]/div[1]/h4/a")
	private WebElement SamsumgGalaxyTop10;
	
	@FindBy (xpath = "//a[contains(text(),'Reviews')]")
	private WebElement ClickOnReviews;
	
	@FindBy (xpath = "//*[@id='input-name']")
	private WebElement YourFirstName;
	
	@FindBy (xpath = "//textarea[@id='input-review']")
	private WebElement InputReivew;
	
		
	public void Tablets()	{
		ClickOnTablets.click();
	}

	public void SamsungGalaxy() {
		SamsumgGalaxyTop10.click();
	}
	public void Reviewsbtn() {
		ClickOnReviews.click();
	}
	public void firstNameField() {
		YourFirstName.sendKeys("Ahmad");
	}
	public void ReviewField() {
		InputReivew.sendKeys("The item I purchased was not the expected item. Wrong it is shipped..... ");
	}
}

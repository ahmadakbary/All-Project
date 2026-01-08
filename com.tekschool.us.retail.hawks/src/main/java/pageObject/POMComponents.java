package pageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.BaseClassComponents;

public class POMComponents extends BaseClassComponents{
	
	public POMComponents()	{
		PageFactory.initElements(driver, this);	
		}
	
@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]")
private WebElement clickComponent ;

@FindBy(linkText ="Monitors")
private WebElement clickOnMonitors;

@FindBy(xpath = "//*[@id=\"content\"]/div[3]/div[1]/div/div[1]/a/img")
private WebElement ClickOnAppleCinamma ;

@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div/div[1]/a/img")
private WebElement clickOniPhone ;

@FindBy(xpath = "//a[contains(text(),'Reviews (0)')]")
private WebElement clickOnReviews;

@FindBy(id = "input-review")
private WebElement inputComments;

@FindBy(xpath = "input-name")
private WebElement YourName;

@FindBy(xpath = "//*[@id='input-review']")
private WebElement YourReview;



public void clickOn_Component()	{
	clickComponent.click();	
}
public void ClickOn_Monitors()	{
	clickOnMonitors.click();

}
public void clickOn_Apple()	{
	ClickOnAppleCinamma.click();
}
public void clickOn_iPhone()	{
		clickOniPhone.click();	
		
}	
public void clickOnReviews()	{
			clickOnReviews.click();
			
}			
public void InputReviews()	{
			inputComments.click();
			
}
public void Your_Name() {
			YourName.sendKeys("John");
	
}
public void Your_Review() {
	YourReview.sendKeys("I like to buy the iPhone but like to get more details");
}
}

		
//http://tek-school.com/retail/index.php?route=product/product&product_id=40








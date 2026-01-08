package pageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.BaseClassDesktops;

public class POMDesktops extends BaseClassDesktops{

	public POMDesktops() {
		PageFactory.initElements(driver, this);
	}
	
		
	@FindBy(linkText = "Desktops")
	private WebElement clickDestop;
	
	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement ShowAllDesktop;
		
	@FindBy(xpath = "//a[contains(text(),'Cameras (2)')]")
	private WebElement clickOnCamra2;
	
	@FindBy(xpath = "//*[contains(text(),'Canon EOS 5D')]")
	private WebElement clickOnCanonEOS5D;
	
	@FindBy (xpath = "//*[contains(text(),'Contact Us')]")
	private WebElement ContactUsBtn;
	
	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement YourName;
	
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement InputYourEmail;
	
	@FindBy(xpath = "//*[@id='input-enquiry']")
	private WebElement inputComments;
	
	@FindBy(xpath = "//input[@value='Submit']")
	private WebElement SubmitBtn;	
	
	
	
	public void Desktopbutton() {
		clickOnCamra2.click();
		
	}
	public void showAlldesktop()	{
		ShowAllDesktop.click();
		
	}
	public void Camera2() {
		clickOnCamra2.click();
	}
	public void CanaoEOS5D() {
		clickOnCanonEOS5D.click();
	}
	public void CustomerService() {
		ContactUsBtn.click();
	}
	public void InputYourName()	{
		YourName.sendKeys("John");
	}
	public void Inputemail() {
		InputYourEmail.sendKeys("tek_school@yahoo.co");
	
	}
	public void CommentsIngquery() {
		inputComments.sendKeys("tekSchool change your life");
		
	}
	public void SubmitL() {
		SubmitBtn.click();
		
	}
}
	



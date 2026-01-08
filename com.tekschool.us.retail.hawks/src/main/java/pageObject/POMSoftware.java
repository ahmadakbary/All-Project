package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.BaseClassSoftware;

public class POMSoftware extends BaseClassSoftware{
	
	public POMSoftware() {
		PageFactory.initElements(driver, this);
	}
		
	@FindBy (xpath = "//a[contains(text(),'Software')]")
	private WebElement clickOnSoftware;
	
	@FindBy (xpath = "//a[contains(text(),'Order History')]")
	private WebElement WishList;
	
	@FindBy (xpath = "//*[@id=\"account-forgotten\"]/ul/li[3]/a")
	private WebElement ForgotPassword;
	
	@FindBy (xpath = "//*[@id='input-email']")
	private WebElement InputeEmail;
	
	@FindBy (xpath = "//input[@value='Continue']")
	private WebElement ContinueBtn;
	
	
	public void softWare() {
		clickOnSoftware.click();
	}
	public void wishListOption()	{
		WishList.click();
	}
	public void forgotpasswordOption() {
		ForgotPassword.click();
	}
	public void EmailField() {
		InputeEmail.sendKeys("SDET@yahoo.com");
	}
	public void ContinueButton() {
		ContinueBtn.click();
	}

}

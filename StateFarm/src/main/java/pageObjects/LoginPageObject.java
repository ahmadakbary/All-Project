package pageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Base;

public class LoginPageObject extends Base{
	
	public LoginPageObject() {
		PageFactory.initElements(driver, this);
				
	}
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccount;
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;
	
	@FindBy (id="input-email")
	private WebElement email;
	
	@FindBy (id="input-password")
	private WebElement password;
	
	@FindBy (xpath = "//input[@value='Login']")
	private WebElement loginBtn;
	
	@FindBy (xpath = "//h2[contains(text(),'My Account')]")
	private WebElement myAccountText;

	
	
	public void clickOnMyAccount() {
		myAccount.click();
	}
	public void clickOnLogin() {
	login.click();
	
	}
	public void EnterEmailAndPassword(String emailValue, String passwordvalue) {
		email.clear();
		password.clear();
		email.sendKeys(emailValue);
		password.sendKeys(passwordvalue);
				
	}
	public void clickOnLoginButton() {
		loginBtn.click();
	}
	public boolean myAccountTextIsPresent()	{
		if (myAccountText.isDisplayed()) 
			return true;
		else
			return false;
				
		}
	
}

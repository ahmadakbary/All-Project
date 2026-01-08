package pageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LoginPageObject extends Base{
	
public LoginPageObject() {
PageFactory.initElements(driver, this);	 
 }

	 @FindBy(xpath = "//span[contains(text(),'My Account')]")
	 private WebElement myAccount;
 
 	 @FindBy(xpath = "//a[text()='Login']")
 	 private WebElement login;
 	 	 
 	 @FindBy(xpath = "//*[@id='input-email']")
 	 private WebElement email;
 	 
 	 @FindBy(xpath = "//*[@id='input-password']")
 	 private WebElement password;
 	 
 	 @FindBy(xpath = "//*[@value='Login']")
 	 private WebElement loginbtn;
 	 	 
 	@FindBy(xpath = "//h2[text()='My Account'")
 	 private WebElement MyAccountText;
  	
 	
	public void clickOnMyAccount() {
		myAccount.click();
		
	}
	public void clickOnLogin() {
		login.click();
		
	}
	public void EnterEmailAndPassword(String Email, String Password) {
		email.sendKeys("");
		password.sendKeys("");
		
	}
	public void clikOnU_PBtn() {
		loginbtn.click();

	}
	public boolean MyAccountTextPresent() {
		if (MyAccountText.isDisplayed()) 
				return true;
			else  
				return false;
		}
	}


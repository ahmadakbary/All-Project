package pageObjects;

import javax.annotation.Resource.AuthenticationType;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.base;

public class HotelHomePageObject extends base {
	
	
	public HotelHomePageObject () {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy (xpath = "//span[contains(text(),'Sign in')]")
	private  WebElement signIn;
	
	
	@FindBy (xpath = "//*[@id='email']")
	private WebElement email;
	
	@FindBy (xpath = "//h1[contains(text(),'Authentication')]")
	private WebElement authentication;
	
	

	public void clickSignIn() {
		signIn.click();	
	
	}
	public boolean isEmailPresent() {
		if(email.isDisplayed())
			return true;
		else 
			return false;
		
	}
	public boolean isAuthenticationDisplayed() {
		if (authentication.isDisplayed())
			return true;
		else
			return false;
	}

	}


	
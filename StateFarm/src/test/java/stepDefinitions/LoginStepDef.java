package stepDefinitions;
import org.junit.Assert;

import Base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.LoginPageObject;

public class LoginStepDef extends Base {

	LoginPageObject loginPage = new LoginPageObject();
	
	@Given ("^user is on Retail website$")
	public void user_is_on_retail_website() {
	String actualPageTitle = driver.getTitle();
	String expectedPageTitle = "TEK SCHOOL";
	Assert.assertEquals(expectedPageTitle, actualPageTitle);
		
	}
	@When ("^user click on Myaccount$")
	public void user_click_on_Myaccount() {
		loginPage.clickOnMyAccount();
		logger.info("User clicked on MyAccount");
	
	}
	@And ("^user click on Login option$")
	public void user_click_on_Login_option() {
	loginPage.clickOnLogin();
		
	}
	@And ("^user enter userName '(.+) and password '(.+)'$")
	public void user_enter_userName_and_password(String uName, String pass) {
		loginPage.EnterEmailAndPassword(uName, pass);
	
	}
	@And("^user click on Login button$")
	public void user_click_on_Login_Button() {
		loginPage.clickOnLoginButton();
		
	}
	@Then ("^user should be logged in to Myaccount dashboard$")
	public void user_should_be_logged_in_to_Myaccount_dashborad() {
	Assert.assertTrue(loginPage.myAccountTextIsPresent());
		
	
	
}
}
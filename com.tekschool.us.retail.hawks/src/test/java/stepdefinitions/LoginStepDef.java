package stepdefinitions;

import java.io.IOException;


import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import pageObject.LoginPageObject;
import utilities.UtilityClass;

public class LoginStepDef extends Base {
	
	LoginPageObject pom=new LoginPageObject();
	
	@Given ("^user is on Retail website$")
	public void user_is_on_Retail_website() {
	String actualPagetittle=driver.getTitle();
	String expectedPageTittle="TEK SCHOOL";
	Assert.assertEquals(actualPagetittle, expectedPageTittle);
	logger.info("Actual title is matching with expected title");
	
		
	}
	@When ("^user click on Myaccount$")
	public void user_click_on_Myaccount() {
	pom.clickOnMyAccount();
	logger.info("user clicked on my account");
	
	}
	@And ("^user click on Login option$")
	public void user_click_on_Login_option() throws IOException {
	pom.clickOnLogin();
	logger.info("user clicked on login");
	UtilityClass.takeScreenShot();
		
	}
	@And ("^user enter userName '(.+) '(.+)'$")
	public void userName_and_password(String uName, String pass) throws IOException {
	pom.EnterEmailAndPassword(uName,pass);
	logger.info("user Enter " +uName+ " and password" +pass);
	UtilityClass.takeScreenShot();
	
	}
	@And ("^user_ click on login button$")
	public void user_click_on_login_button() {
		pom.clikOnU_PBtn();
		logger.info("user cliked on logger button");
	}
	@Then ("^user should be logged in to Myaccount dashboard$")
	public void user_should_be_logged_in_to_Myaccount_dashboard() throws IOException {
		Assert.assertTrue(pom.MyAccountTextPresent());
		logger.info("user is logged in to MyAccount Dashboard");
		UtilityClass.takeScreenShot();
	}

	

}

package stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pageObject.POMRegister;
import utilities.UtilityClass;

public class RegisterStepDefinitions extends Base{
	
	POMRegister Register=new POMRegister();

	
	//@Given ("user is on Retail website")
	//public void user_is_on_Retail_website() {
		
		
	//}
	//@When ("user click on Myaccount")
	//public void user_click_on_Myaccount() {
		
		
	@And ("user click on Register")
	public void user_click_on_Register(){
	Register.ClickOnMyAccount();
	logger.info("user click on Register");
	UtilityClass.takeScreenShot();
		
	}	
	@And ("user fill registration form with below information")
	public void user_fill_registration_form_with_below_information(DataTable dataTable) throws IOException{
		List<Map<String,String>> info = dataTable.asMaps(String.class, String.class);
		Register.FirstNameField(info.get(0).get("firstName"));
		Register.LastNameField(info.get(0).get("lastName"));
		Register.EmailField(info.get(0).get("email"));
		Register.TelephoneField(info.get(0).get("telephone"));
		Register.PasswordField(info.get(0).get("password"));
		Register.PasswordConfirmeField(info.get(0).get("passwordConfirm"));
		Register.Subscriptions(info.get(0).get("Subscribe"));
		logger.info("user entered personal information" +info.toString());
		UtilityClass.takeScreenShot();
		
		
	}		
	@And ("user agree to privacy and policy")
	public void user_agree_to_privacy_and_policy(){
		Register.clickOnPrivacy();
		logger.info("user clicked on privacy and policy checkbox");
		UtilityClass.takeScreenShot();
		
		
	}
	@And ("user click on continue button")
	public void user_click_on_continue_button()	{
		Register.clickOnContinueButton();
		logger.info("user clicked on continue button");
		
	}	
	@Then ("user should see successful message 'Your Account has Been Created'")
	public void user_should_see_successful_message(String string) {
		Assert.assertEquals(string, Register.getSuccessMessage());
		logger.info("user account was created successfully");
		UtilityClass.takeScreenShot();
		
	}

}

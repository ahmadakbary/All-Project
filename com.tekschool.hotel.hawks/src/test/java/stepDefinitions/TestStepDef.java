package stepDefinitions;
import org.junit.Assert;

import core.base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.HotelHomePageObject;

public class TestStepDef extends base {

	
	
	
	HotelHomePageObject  HotelHomePage=new  HotelHomePageObject();
	
	@Given("user is on hotel website")
	public void user_is_on_hotel_website() {
		String actualTitle=driver.getTitle();
		String expectedTitle=properties.getProperty("title");
		Assert.assertEquals(expectedTitle, actualTitle);
		logger.info(actualTitle + " is equal to "+ expectedTitle);
		   
	}
	@When("user click on singIn button")
	public void user_click_on_sing_in_button() {
		HotelHomePage.clickSignIn();
		logger.info("user clicked on SignIn");

	}
	@Then("user should see signIn page")
	public void user_should_see_sign_in_page() {
		Assert.assertTrue(HotelHomePage.isAuthenticationDisplayed());
		Assert.assertTrue(HotelHomePage.isEmailPresent());
		logger.info("sign is page is dispalyed");
		
	   
	}

}

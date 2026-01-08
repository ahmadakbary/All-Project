package stepdefinitions;
import org.junit.Assert;
import core.Base;
import io.cucumber.java.en.*;

import pageObject.TestPageObject;
public class TestStepDef extends Base{
	
	TestPageObject pom=new TestPageObject();
	
	
	@When  ("User search for 'iphone'")
	public void User_search_for(String string) {
	pom.enterValuesForSearchField(string);
	pom.clickOnSearchButton();
		
	}
	@Then ("iphone should be displayed")
	public void iphone_should_diplayed() {
		pom.clickOnSearchButton();
		
		Assert.assertTrue(pom.IsIphoneDispalyed());
		
	}

}

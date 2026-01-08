package stepdefinitions;

import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

 public class initializer extends Base {
	
	@Before
	public void beforeHooks(Scenario scenario) {
		logger.info("Scenario " +scenario.getName()+ "Started");
		browser();
		openBrowser();
	}
	
	@After
	public void afterHooks(Scenario scenario) {
		teardown();
		logger.info("Scenario " +scenario.getName()+ " " +scenario.getStatus());
		
	}


}

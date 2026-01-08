package stepDefinitions;

import java.util.logging.Logger;
import core.base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class initializer extends base{

	
	@Before
	public void beforeHooks(Scenario scenario) {
		logger.info(scenario.getName()+ "Started");
		scenario.log(scenario.getName()+ "Started");
		selectBrowser();
		openBrowser();
	}
	@After
	public void afterHooks(Scenario scenario) {
		logger.info(scenario.getName()+ "finished");
		tearDown();
		logger.info(scenario.getName()+ " " +scenario.getStatus());
		scenario.log(scenario.getName()+ " " +scenario.getStatus());
		
		
	}
}

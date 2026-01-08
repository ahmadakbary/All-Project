package stepDefinitions;

import Base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Initializer  extends Base{
	
	
	
	@Before
	public void beforHooks(Scenario scenario) {
		browser();
		openBrowser();
	}
	@After
	public void afterHooks(Scenario scenario) {
		
	}

}

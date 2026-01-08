package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features="classpath:features",
			glue="stepdefinitions",
			tags="@RegisterTest",
			dryRun=false,
			monochrome=true,
			plugin="pretty",
			publish=true		
)
public class RegisterTestRunner {
	
	
	
	
	
			
			
			
			
			

}

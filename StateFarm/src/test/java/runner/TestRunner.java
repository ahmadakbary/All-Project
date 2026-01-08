package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
		
		
//feature tell cucumber where all feature files are located
//glue tells cucumber where all stepDef classes are located
//tags we will run one scenario, or multiple scenario, or entire feature
//dryRun check if there are any missing steps in StepDefinition class for each  scenario steops in feature files
//monochrome will make console readable
//strict will mark console failed if there are any pending steps
//plugin will be used for generating a readable
			features = "classpath:features",
			glue     = "stepDefinitions",
			tags     = "@smokeTest",
			dryRun   = false, 
			monochrome = true,
			strict 	 = true,
			plugin = {"pretty","html:test-output","json:json_output","junit:junit_xml"},
			publish = true
		
				)

public class TestRunner {

}

package runner;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.CucumberReportingConfig;

@RunWith (Cucumber.class)
@CucumberOptions (		
			features="classpath:features",
			glue="stepdefinitions",
			tags="@EendtoEndTesting",
			dryRun=false,
			monochrome=true,
			strict=true,
			plugin= {"pretty",
					 "html:target/site/cucumber-pretty",
					 "json:target/cucumber.jason"},			
			publish=true)
 public class TestRunner {
	
	//this method help us to invoke the cucumber reporting once the execution is over.
	//AfterClass annotations help us from Junit and this will run after AfterHooks from initializer class.
	@AfterClass
	public static void generateReport() {
		CucumberReportingConfig.reportConfig();
	}
	
	
	}
	


package utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import core.base;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;
import net.masterthought.cucumber.json.support.Status;
import net.masterthought.cucumber.presentation.PresentationMode;

public class CucumberReporting extends base {

	public static void reportConfig() {
		File reportOutputDirectory = new File("target");
		
		List<String> jsonFiles = new ArrayList<>();
		jsonFiles.add("target\\cucumber.json");
		

		String buildNumber = properties.getProperty("buildVerions");
		String projectName = properties.getProperty("projectName");

		Configuration configuration = new Configuration(reportOutputDirectory, projectName);
	
		configuration.addPresentationModes(PresentationMode.RUN_WITH_JENKINS);
	
		configuration.setNotFailingStatuses(Collections.singleton(Status.SKIPPED));
		configuration.setBuildNumber(buildNumber);
		
		configuration.addClassifications("Platform", properties.getProperty("platform"));
		configuration.addClassifications("Browser", getBrowserName());
		configuration.addClassifications("Branch", properties.getProperty("branch"));
		configuration.addClassifications("Environment", properties.getProperty("environment"));

		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		Reportable result = reportBuilder.generateReports();
		
}
}
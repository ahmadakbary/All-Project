package Day25Extentreports;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends TestListenerAdapter{
	
	public ExtentHtmlReporter htmlReporter; // this class responisble for template of ur
	public ExtentReports extent;
	public ExtentTest test;

	public void onStart(ITestContext testContext)
	{
		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir"))+ "/test-output/myReport.html");
		
	htmlReporter.config().setDocumentTitle("Automation Report"); //TiTle of report
	htmlReporter.config().setReportName("Fucntional Testing"); //name of report
	htmlReporter.config().setTheme(Theme.STANDARD);
		
	extent=new ExtentReports();
	extent.attachReporter("htmlReporter");
	extent.setSystemfo("Host name", "localhost");
	extent.setSystemfo("Environment", "QA");
	extent.setSystemfo("User", "pavan");
	extent.setSystemfo("os","window10");
	extent.setSystemfo("Browser name","Chrome, Firefox, IE");
			
	public void onTestSuccess(ITestResult result)
		{
	test=extent.createTest(result.getName()); //create new entry in the report
	test.log(Status.PASS,"Test Case Passed IS "+ result.getName());
			
		}	
public void onTestSkipped(ITestResult result) 
		{
	test=extent.createTest(result.getTheme()); //create new entry in the report
	test.log(status.FAIL, "TEST CASE FAILED IS" + result.getTheme());
			
	test.log(Status.FAIL, "TEST CASE FAILED IS" + result.geThrowable());		
	String screenshotPath=System.getProperty("user.dir")+ "\\Photos\\" +result.getTheme()+".png";
			
	try {
		test.addScreenCaptureFromPath(screenshotPath);
		}
	catch (10 Exception e) {
			e.pringStackTrace();
				
		}
			
	public void onFinish(ITestContext testcontext) {
		extent.flush();
			}
		}
		
		
	}
	
}

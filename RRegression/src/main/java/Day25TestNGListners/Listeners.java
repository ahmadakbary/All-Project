package Day25TestNGListners;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
public class Listeners extends TestListenerAdapter {
	
public void onTestStart(ITestResult rs)
	{
		System.out.println("on test start......");
	}
public void onTestSuccess(ITestResult rs)
	{
		System.out.println("onTestSuccess......");
	}
public void onTestFailure(ITestResult rs)
	{
		System.out.println("onTestFailure......");
	}
public void onTestSkipped(ITestResult rs)
	{
		System.out.println("onTestSkipped......");
	}
}

package W7listener;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Itest implements ITestListener{
public WebDriver driver;
	
public void onTestSuccess(ITestResult result) {
String mycurrentproject=System.getProperty("user.dir");
 Date dt=new Date();	 
String ut=dt.toString().replace(" ", "_").replace(":", "_")+".jpg";
File Captureofshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
try {
FileHandler.copy(Captureofshots, new File(mycurrentproject+"\\Photos\\Passed\\" +ut));
} catch (IOException e) {
		e.printStackTrace();
	}    	
	}
public void onTestFailure(ITestResult result) {	
String mycurrentproject=System.getProperty("user.dir");
Date dt=new Date();	 
String ut=dt.toString().replace(" ", "_").replace(":", "_")+".jpg";
File Captureofshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
try {
FileHandler.copy(Captureofshots, new File(mycurrentproject+"\\Photos\\Failed\\" +ut));
} catch (IOException e) {
		e.printStackTrace();
	}    
		
	}

}

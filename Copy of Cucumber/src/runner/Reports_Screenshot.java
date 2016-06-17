package runner;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import stepDefinition.GlueCode;

public class Reports_Screenshot implements ITestListener {
	

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		captureScreenshot(result);
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	captureScreenshot(result);

}
	
	public void captureScreenshot(ITestResult result)
	{
		try {
			TakesScreenshot ts=(TakesScreenshot)GlueCode.driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			String destination="./Screenshots/Success/"+result.getName()+".jpg";
			File dest=new File(destination);
			FileUtils.copyFile(src,dest);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

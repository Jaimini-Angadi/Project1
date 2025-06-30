package genericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenersImplementation implements ITestListener{
	SeleniumUtility sUtil=new SeleniumUtility();
	JavaUtility jUtil=new JavaUtility();
	String dateTimeStamp=jUtil.getCalendarDetails("dd-MM-YYYY hh-mm-ss");
	

	@Override
	public void onTestStart(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+" -on Test start executed");
		Reporter.log(methodName+" -on Test start executed");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+" -on Test success executed");
		Reporter.log(methodName+" -on Test success executed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+" -on Test Failure executed");
		Reporter.log(methodName+" -on Test failure executed");
		String screenshotName=methodName+"-"+dateTimeStamp;
		try {
			sUtil.takesScreenshot(BaseClass.sDriver,screenshotName);
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+" -on Test Skipped executed");
		Reporter.log(methodName+" -on Test skipped executed");

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("on start Executed");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On Finish Executed");
	}
	

}

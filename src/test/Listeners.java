package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


//ITestListener (interface for TestNG listeners)
//to auto-add all the unimplemented methods in the interface:
//right click "Listeners" class java file > source > Override/Implement metods
public class Listeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		ITestListener.super.onTestSuccess(result);
		System.out.println("PASSED! - Listeners");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ITestListener.super.onTestFailure(result);
		//screenshot if UI is failed
		//response and logs if API is failed
		System.out.println("FAILED! - Listeners: " + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		ITestListener.super.onFinish(context);
	}
	
	

}



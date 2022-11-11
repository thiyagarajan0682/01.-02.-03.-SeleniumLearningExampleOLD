package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersExample implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test is going to be executed");
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is passed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test is failed");
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test is skipped");
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test failed but the result is with in pass percentage");
	}
	
	public void onStart(ITestContext context) {
		System.out.println("Before everything");
	}
	
	public void onFinish(ITestContext context) {
		System.out.println("After everything");
	}
}

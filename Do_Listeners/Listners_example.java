package Do_Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners_example implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test case has been failed test"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("The test case has been Skipped"+result.getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("The test case has been Started"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("The test case has jhbhbghbeen Successed"+result.getName());
	}

}

package fileUtilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerIMP  implements ITestListener  {

	public void onTestStart(ITestResult result) {
		System.out.println("testcases started and testcase details are "+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("testcases success and testcase details are "+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("testcases failed and testcase details are "+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("testcases skipped and testcase details are "+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	}

	public void onStart(ITestContext context) {
	}

	public void onFinish(ITestContext context) {
	}
	
	

}

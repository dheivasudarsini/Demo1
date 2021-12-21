package listenerDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.crm.vtiger.objectRepository.BaseClass;

public class Listener extends BaseClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailure(ITestResult result) {
		
		// TODO Auto-generated method stub
		try {
			//wb.takeScreenshot(BaseClass.swd,result.getName());
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	}
	
	
		
	
	

}

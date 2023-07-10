package genericlibraries;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class listenerImplimentation implements ITestListener {
	ExtentSparkReporter reporter=new ExtentSparkReporter("./reports/suite.html");
	ExtentReports report=new ExtentReports();
	public static ExtentTest logger;
	
	
	
	@Override
	public void onStart(ITestContext context) {
		report.attachReporter(reporter);
		
	}
	@Override
	public void onTestStart(ITestResult result) {
		logger=report.createTest(result.getMethod().getMethodName());
		
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		logger.log(Status.PASS, "this test is passed"+result.getMethod().getMethodName());
		
		
	}
	@Override
	public void onTestFailure(ITestResult result) {
		logger.log(Status.FAIL, "this test is fail"+result.getMethod().getMethodName());
		
		try {
			logger.addScreenCaptureFromPath(screenshotutility.takescreenshot(result.getMethod().getMethodName()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		logger.log(Status.SKIP,"this test is skiped"+result.getMethod().getMethodName() );
		try {
			logger.addScreenCaptureFromPath(screenshotutility.takescreenshot(result.getMethod().getMethodName()));
		} catch (Exception e) {
			e.printStackTrace();
		}
}
	
	@Override
	public void onFinish(ITestContext context) {
		report.flush();
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	}
	
			
	



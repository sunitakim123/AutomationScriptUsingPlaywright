package com;

import java.util.Date;
import org.testng.*;
import com.aventstack.extentreports.ExtentReports;
import com.microsoft.playwright.Playwright;
import com.aventstack.extentreports.*;

import Resource.BaseTest;
import Resource.ExtentReporterNG;

public class Listeners extends BaseTest implements ITestListener{
	ExtentTest test;
	ExtentReports extent = ExtentReporterNG.getReportObject();
	ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) {
		 test = extent.createTest(result.getMethod().getMethodName());
		 extentTest.set(test);
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Passed");

	}

	public void onTestFailure(ITestResult result) {


	    extentTest.get().fail(result.getThrowable());
	   // extentTest.get().addScreenCaptureFromPath(takeScreenshot())
	    String testMethodName = result.getMethod().getMethodName();
	   // MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot(testMethodName)).build();
		try {
			extentTest.get().addScreenCaptureFromPath(takeScreenshot(testMethodName), result.getMethod().getMethodName());
			//getscreenShotPath(testMethodName, driver);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	private Date getTime(long endMillis) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getScreenShotPath(String testMethodName, Playwright playwright) {
		// TODO Auto-generated method stub
		return null;
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		extent.flush(); 

	}

}






package Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenEx1 implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("TC execution started");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("TC execution Success");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("TC execution failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("TC execution skipped");
	}
	

}

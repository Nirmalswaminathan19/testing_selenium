package testing3;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Day_Listeners implements ITestListener{
  @Test
  public void f() {
  }

@Override
public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("test started:" + result.getName());
	
}

@Override
public void onTestSuccess(ITestResult result) {
	
	System.out.println("test success:" + result.getName());
	
}

@Override
public void onTestFailure(ITestResult result) {

	System.out.println("test failed:" + result.getName());
	
}

@Override
public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	
}

@Override
public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	
}
}

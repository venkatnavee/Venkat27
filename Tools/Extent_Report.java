package Tools;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_Report {
	@Test
	public void Test_rep()
	{
		ExtentReports rep= new ExtentReports("./Reports/newrp.html", false);
		ExtentTest test = rep.startTest("TC1");
		test.log(LogStatus.PASS, "TestCase Passed");
		test.log(LogStatus.FAIL, "TestCase Failed");
		test.log(LogStatus.SKIP, "TestCase Skipped");
		rep.endTest(test);
		rep.flush();
		
	}

}

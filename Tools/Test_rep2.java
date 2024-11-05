package Tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Test_rep2 {
	public WebDriver driver;
	@Test
	public void Treport()
	{
		ExtentReports  rep= new ExtentReports("./Reports/rep1.html", false);
		ExtentTest test = rep.startTest("Facebook Test excution");
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		driver=new ChromeDriver();
		test.log(LogStatus.INFO, "TestCase Execution Started");
		driver.get("https://www.facebook.com");
		test.log(LogStatus.PASS, "Navigated to Facebook site");
		driver.findElement(By.id("email")).sendKeys("venkatnavee");
		test.log(LogStatus.PASS, "Entered the Username");
		driver.findElement(By.name("pass")).sendKeys("Venkat@27");
		test.log(LogStatus.PASS, "Eneterd the Password");
		driver.close();
		test.log(LogStatus.PASS, "Browser closed");
		rep.endTest(test);
		rep.flush();
		
		
		ExtentTest test1 = rep.startTest("FB test execution");
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		driver=new ChromeDriver();
		test1.log(LogStatus.INFO, "TestCase Execution Started");
		driver.get("https://www.facebook.com");
		test1.log(LogStatus.FAIL, "not able to Navigated to Facebook site");
		driver.findElement(By.id("email")).sendKeys("venkatnavee");
		test1.log(LogStatus.FAIL, "not able yo enter the username");
		driver.findElement(By.name("pass")).sendKeys("Venkat@27");
		test1.log(LogStatus.FAIL, "Not able to Enter the Password");
		driver.close();
		test1.log(LogStatus.FAIL, "Browser not closed");
		rep.endTest(test1);
		rep.flush();
	}

}

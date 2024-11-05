package Generic;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utils.FetchProperty;

public class G implements GenInter{
	public WebDriver driver;
	@BeforeMethod
	public void OpenAplln() throws FileNotFoundException, IOException
	{
		System.setProperty(key1, val1);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(FetchProperty.fetchProperty());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void CloseAppln(ITestResult res) throws IOException 
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			GenScreen.get_photo(driver);
		}
		driver.close();
	}

}

package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPro {
	@Test(dataProvider = "createData")
	public void test1(String Un, String Pwd)
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(Un);
		driver.findElement(By.name("pass")).sendKeys(Pwd);
	}
	@DataProvider(name="createData")
	public Object[][] createData12(){
		return new Object[][] {
			{"Venkat" , "Nkva27"},
			{"Anusha" , "Vnka18"},
		};
}
}

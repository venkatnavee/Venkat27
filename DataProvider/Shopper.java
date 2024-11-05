package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Shopper {
	@Test(dataProvider = "createData")
	public void SignUp(String fname,String lname,String email)
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com/signup");
		driver.manage().window().maximize();
		driver.findElement(By.id("First Name")).sendKeys(fname);
		driver.findElement(By.name("Last Name")).sendKeys(lname);
		driver.findElement(By.name("Email Address")).sendKeys(email);
	}
	@DataProvider(name="createData")
	public Object[][] createData12(){
		return new Object[][] {
			{"Venkat","raj","venkat27@gmail.com"},
			{"Anusha","venkat","anuvenkat@gmail.com"},
		};
	}

}

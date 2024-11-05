	package Runner;
	import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
	public class  FLIP
	{

		public static void main(String[] args) throws InterruptedException, IOException 
		{
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("redmi");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[.='REDMI 12 (Moonstone Silver, 128 GB)']")).click();
			Thread.sleep(2000);
			WebElement ele = driver.findElement(By.xpath("//button[@type='button']"));
			TakesScreenshot s=(TakesScreenshot)driver;
			File src = s.getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\HP\\OneDrive\\Desktop\\ADV\\ss3.jpeg");
			FileHandler.copy(src, dest);
		}
	}



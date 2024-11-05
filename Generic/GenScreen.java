package Generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class GenScreen {
	public static void get_photo(WebDriver driver) throws IOException
	{
		String photo = "C:\\Users\\HP\\OneDrive\\Desktop\\ADV";
		Date d=new Date();
		String d1 = d.toString();
		String d2 = d1.replace(":", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File(photo+d2+".jpeg");
		FileHandler.copy(src, dst);
	}

}

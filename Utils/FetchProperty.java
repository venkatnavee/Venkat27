package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class FetchProperty {
	@Test
	public static String fetchProperty() throws FileNotFoundException, IOException
	{
		Properties p=new Properties();
		p.load(new FileInputStream("./software/url.properties"));
		String val = p.getProperty("baseURL");
		return val;
	}

}

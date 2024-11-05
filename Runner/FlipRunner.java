package Runner;

import java.util.ArrayList;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic.Flipcart;
import POM.FlipcartPOM;

public class FlipRunner extends Flipcart {
	@Test(dataProvider = "createData")
	public void runner(String Phone) throws InterruptedException
	{
		FlipcartPOM fp=new FlipcartPOM(driver);
		fp.Search(Phone);
		fp.Button();
		fp.select16();
		Set<String> allwh = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(allwh);
		String ch = al.get(1);
		driver.switchTo().window(ch);
		Thread.sleep(6000);
		fp.Purchase();
		}
	@DataProvider(name="createData")
	public Object[][] createData12(){
		return new Object[][] {
			{"Iphone16" },
			{"Iphone16"}
		};
	}
	}

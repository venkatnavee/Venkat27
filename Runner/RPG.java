package Runner;

import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.G;
import POM.PomScript;

public class RPG extends G{
	@Test
	public void Run()
	{
		PomScript p=new PomScript(driver);
		p.Uname("venkat");
		Assert.fail();
		p.Pass("Navee");
		p.LoginBtn();
		
	}
}

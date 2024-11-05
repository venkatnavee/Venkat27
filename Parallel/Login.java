package Parallel;

import org.testng.annotations.Test;

public class Login {
	@Test(groups = {"SmokeTC" , "Regression"})
	public void TC01()
	{
		System.out.println("This is TC01 of Login(SmokeTC)");
	}
	
	@Test(groups = {"SmokeTC" , "Regression"})
	public void TC04()
	{
		System.out.println("This is TC04 of Login(SmokeTC)");
	}
	
	@Test(groups = {"FunctionalTestCase"})
	public void TC02()
	{
		System.out.println("This is TC02 of Login(FunctionalTestCase)");
	}
	
	@Test
	public void TC03()
	{
		System.out.println("This is TC03 of Login");
	}


}

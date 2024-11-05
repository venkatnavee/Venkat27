package Parallel;

import org.testng.annotations.Test;
@Test (groups = {"tcs"})
public class SignUp {
	@Test(groups = {"SmokeTC" , "Regression"})
	public void TC01()
	{
		System.out.println("This is TC01 of signup(SmokeTC)");
	}
	
	@Test(groups = {"SmokeTC" , "Regression"})
	public void TC04()
	{
		System.out.println("This is TC04 of signup(SmokeTC)");
	}
	
	@Test(groups = {"SmokeTC"})
	public void TC02()
	{
		System.out.println("This is TC02 of signup(SmokeTC)");
	}
	
	@Test
	public void TC03()
	{
		System.out.println("This is TC03 of Signup");
	}

}

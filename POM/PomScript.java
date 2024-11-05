package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;

public class PomScript extends BasePage{
	@FindBy(id="email")
	private WebElement Uname;
	@FindBy (name="pass")
	private WebElement Pass;
	@FindBy (name ="login")
	private WebElement LoginBtn;
	
	public PomScript(WebDriver driver)
	{
		super(driver);
	}
	
	public void Uname(String user)
	{
		Uname.sendKeys(user);
	}
	
	public void Pass(String pwd)
	{
		Pass.sendKeys(pwd);
	}
	
	public void LoginBtn()
	{
		LoginBtn.click();
	}
}

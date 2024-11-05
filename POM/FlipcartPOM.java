package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipcartPOM {
	@FindBy(xpath="//input[@class='Pke_EE']")
	private WebElement Search;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Button;
	@FindBy(xpath="//div[.='Apple iPhone 16 (Black, 128 GB)']")
	private WebElement clickI16;
	@FindBy (xpath="//button[@type='button']")
	private WebElement Buynow;
	@FindBy (xpath="//button[text()='Add to cart']")
	private WebElement Cart;
	
	
	public FlipcartPOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Search(String data)
	{
		Search.sendKeys(data);
	}
	public void Button() 
	{
		Button.click();
	}
	public void select16()
	{
		clickI16.click();
	}
	public void Purchase()
	{
		Buynow.click();
	}
	public void ADDCart()
	{
		Cart.click();
	}

}

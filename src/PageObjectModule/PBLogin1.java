package PageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLogin1 
{
	@FindBy(xpath="") private WebElement Signin;
	
	public PBLogin1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickOnPBLogin1()
	{
		Signin.click();
	}
}

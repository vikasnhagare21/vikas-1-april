package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB11LoginPage1 
{
	@FindBy(xpath="//a[text()='Sign in']") private WebElement Signin;
	
	public PB11LoginPage1 (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickOnSigninbtn()
	{
		Signin.click();
	}
}

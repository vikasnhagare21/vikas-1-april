package POM2_DDF_TestNG_Base_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB12LoginPage1 
{
	@FindBy(xpath="//a[text()='Sign in']")private WebElement Signin;
	public PB12LoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickSigninBtnPB12LoginPage1()
	{
		Signin.click();
	}
}

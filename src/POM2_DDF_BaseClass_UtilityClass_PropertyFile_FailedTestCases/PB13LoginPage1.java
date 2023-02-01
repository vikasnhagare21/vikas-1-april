package POM2_DDF_BaseClass_UtilityClass_PropertyFile_FailedTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB13LoginPage1 
{
	@FindBy(xpath="//a[text()='Sign in']")private WebElement Signin;
	public PB13LoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickPB13LoginPage1()
	{
		Signin.click();
	}
}

package POM2_DDF_BaseClass_UtilityClass_PropertyFile_FailedTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB13LoginWithPwdPage3 
{
	@FindBy(xpath="//input[@name='password']")private WebElement pass;
	@FindBy(xpath="//span[text()='Sign in']")private WebElement Signin1;
	public PB13LoginWithPwdPage3(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void inpPB13LoginWithPwdPage3(String v)
	{
		pass.sendKeys(v);
	}
	public void clickPB13LoginWithPwdPage3()
	{
		Signin1.click();
	}
}

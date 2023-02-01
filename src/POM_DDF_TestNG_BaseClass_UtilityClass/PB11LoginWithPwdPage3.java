package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB11LoginWithPwdPage3 
{
	@FindBy(xpath="//label[text()='Password']")private WebElement pass;
	@FindBy(xpath="//span[text()='Sign in']")private WebElement Signin1;
	public PB11LoginWithPwdPage3(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void inpPB11LoginWithPwdPage3(String string)
	{
		pass.sendKeys(string);
	}
	public void clickPB11LoginWithPwdPage3()
	{
		Signin1.click();
	}
}

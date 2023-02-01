package POM2_DDF_TestNG_Base_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB12LoginWithPwdPage3
{
	@FindBy(xpath="//input[@type='password']")private WebElement pass;
	@FindBy(xpath="//span[text()='Sign in']")private WebElement Signin1;
	public PB12LoginWithPwdPage3(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void inpPB12LoginWithPwdPage3(String St)
	{
		pass.sendKeys(St);
	}
	public void clickPB12LoginWithPwdPage3()
	{
		Signin1.click();
	}
}

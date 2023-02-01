package POm_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginWithMobNum 
{
	@FindBy(xpath="(//input[@type='number'])[2]")private WebElement MobNum;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]")private WebElement SignInWithPwd;

	public PBLoginWithMobNum(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void EnterMobileNum(String string)
	{
		MobNum.sendKeys(string);
	}
	public void clickOnSignInWithPwd()
	{
		SignInWithPwd.click();
	}

	

	

}

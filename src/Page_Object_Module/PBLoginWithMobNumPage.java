package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginWithMobNumPage 
{
	@FindBy(xpath="(//input[@type='number'])[2]")private WebElement mobNum;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]") private WebElement loginWithPwd;
	public PBLoginWithMobNumPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void enterMobNum()
	{
		mobNum.sendKeys("7020500587");
	}
	public void clickOnloginPwdBtn()
	{
		loginWithPwd.click();
	}

}

package PageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginWithPwd1 
{
	@FindBy(xpath="")private WebElement pass;
	@FindBy(xpath="")private WebElement Signin1;
	public PBLoginWithPwd1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void enterPBLoginWithPwd1()
	{
		pass.sendKeys();
	}
	public void clickPBLoginWithPwd1()
	{
		Signin1.click();
	}
}

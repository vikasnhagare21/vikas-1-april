package POm_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginWithPwd 
{
	@FindBy(xpath="//input[@type='password']") private WebElement pwd;
	@FindBy(xpath="//span[text()='Sign in']")private WebElement SignIn;
	
	public PBLoginWithPwd(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	

	public void inpPBLoginWithPwd(String s)
	{
		pwd.sendKeys(s);
	}
	public void clickPBLoginWithPwdbtn()
	{
		SignIn.click();
	}

	
	
}

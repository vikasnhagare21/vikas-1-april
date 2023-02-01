package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginWithPwdPage 
{
	@FindBy(xpath="//input[@type='password']") private WebElement pwd;
	@FindBy(xpath="//span[text()='Sign in']") private WebElement signIN;
	
	public PBLoginWithPwdPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void enterPWD()
	{
		pwd.sendKeys("Viman@22");
	}
	public void clickOnSignBtn()
	{
		signIN.click();
	}
}

package PageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginWithMobMun1 
{
	@FindBy(xpath="(//input[@type='number'])[2]")private WebElement mobnum;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]")private WebElement pwd;
	
	public PBLoginWithMobMun1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void inpPBLoginWithMobMun1()
	{
		mobnum.sendKeys();
	}
	public void enterPBLoginWithMobMun1()
	{
		pwd.click();
	}
}

package POM2_DDF_BaseClass_UtilityClass_PropertyFile_FailedTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB13LoginWithMobNumPage2
{
	@FindBy(xpath="(//input[@type='number'])[2]")private WebElement mob;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]")private WebElement pwd;
	public PB13LoginWithMobNumPage2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void inpPB13LoginWithMobNumPage2(String s)
	{
		mob.sendKeys(s);
	}
	public void clickPB13LoginWithMobNumPage2()
	{
		pwd.click();
	}
}

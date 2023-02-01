package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB11LoginWithMobNumPage2 
{
	@FindBy(xpath="(//input[@type='number'])[2]")private WebElement MobNum;
	@FindBy(xpath="")private WebElement pwd;
	public PB11LoginWithMobNumPage2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void inpPB11LoginWithMobNumPage2(String string)
	{
		MobNum.sendKeys(string);
	}
	public void clickPB11LoginWithMobNumPage2()
	{
		pwd.click();
	}
	
}

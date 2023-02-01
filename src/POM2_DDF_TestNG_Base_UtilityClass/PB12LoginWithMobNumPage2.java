package POM2_DDF_TestNG_Base_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB12LoginWithMobNumPage2 
{
	@FindBy(xpath="(//input[@type='number'])[2]")private WebElement mobnum;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]")private WebElement pwd;
	public PB12LoginWithMobNumPage2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void inpPB12LoginWithMobNumPage2(String S)
	{
		mobnum.sendKeys(S);
	}
	public void clickPB12LoginWithMobNumPage2()
	{
		pwd.click();
	}
	
}

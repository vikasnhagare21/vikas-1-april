package POM2_DDF_BaseClass_UtilityClass_PropertyFile_FailedTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB13HomePage4
{
	@FindBy(xpath="//div[text()='My Account']")private WebElement Myacc;
	@FindBy(xpath="//span[text()=' My profile ']")private WebElement Myprof;
	WebDriver driver1;
	public PB13HomePage4(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		driver1=driver;
	}
	public void hoverPB13HomePage4()
	{
		Actions act=new Actions(driver1);
		act.moveToElement(Myacc).perform();
	}
	public void clickPB13HomePage4()
	{
		Myprof.click();
	}
}

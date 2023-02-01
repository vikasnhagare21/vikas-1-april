package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB11HomePage4
{
	@FindBy(xpath="//div[text()='My Account']")private WebElement MyAcc;
	@FindBy(xpath="//span[text()=' My profile ']")private WebElement MyPro;
	WebDriver driver1;
	public PB11HomePage4(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		driver1 = driver;
	}
	public void hoverPB11HomePage4()
	{
		Actions act=new Actions(driver1);
		act.moveToElement(MyAcc).perform();
	}
	public void clickPB11HomePage4()
	{
		MyPro.click();
	}
	
}

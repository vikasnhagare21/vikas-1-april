package POM2_DDF_TestNG_Base_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB12HomePage4
{
	@FindBy(xpath="//div[text()='My Account']") private WebElement MyAcc;
	@FindBy(xpath="//span[text()=' My profile ']") private WebElement MyPro;
	WebDriver driver1;
	public PB12HomePage4(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		driver1=driver;
	}
	public void hoverPB12HomePage4()
	{
		Actions act=new Actions(driver1);
		act.moveToElement(MyAcc).perform();
	}
	public void clickPB12HomePage4()
	{
		MyPro.click();
	}
}

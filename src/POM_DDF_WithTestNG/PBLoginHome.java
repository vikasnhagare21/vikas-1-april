package POM_DDF_WithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginHome 
{
	@FindBy(xpath="//div[text()='My Account']") private WebElement Myacc;
	@FindBy(xpath="//span[text()=' My profile ']") private WebElement Myprofile;
	WebDriver driver1;
	public PBLoginHome(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		driver1=driver;
	}



	public void hoverPBLoginHomeMyacc()
	{
		Actions act=new Actions(driver1);
		act.moveToElement(Myacc).perform();
	}
	public void clickOnPBLoginHomeMyprofile()
	{
		Myprofile.click();
	}
}

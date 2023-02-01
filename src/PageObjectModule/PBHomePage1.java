package PageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBHomePage1
{
	@FindBy(xpath="")private WebElement Myacc;
	@FindBy(xpath="")private WebElement MyProfile;
	public PBHomePage1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void movePBHomePage1()
	{
		
	}
}

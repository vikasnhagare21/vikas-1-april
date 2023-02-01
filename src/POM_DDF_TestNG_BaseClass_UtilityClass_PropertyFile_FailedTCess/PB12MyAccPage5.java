package POM_DDF_TestNG_BaseClass_UtilityClass_PropertyFile_FailedTCess;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB12MyAccPage5
{
	@FindBy(xpath="//input[@name='personName']")private WebElement fullName;
	WebDriver driver1;
	public PB12MyAccPage5(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		driver1=driver;
	}
	public void SwitchWindowPB12MyAccPage5()
	{
		Set<String> allIds = driver1.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(allIds);
		driver1.switchTo().window(al.get(1));
		
	}
	public String getPersonNamePB12MyAccPage5()
	{
		String actPN = fullName.getAttribute("value");
		return actPN;
	}
}

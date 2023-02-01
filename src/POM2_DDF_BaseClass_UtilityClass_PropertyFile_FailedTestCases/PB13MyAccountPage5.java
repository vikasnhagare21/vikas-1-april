package POM2_DDF_BaseClass_UtilityClass_PropertyFile_FailedTestCases;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB13MyAccountPage5 
{
	@FindBy(xpath="//input[@name='personName']")private WebElement fullName;
	WebDriver driver1;
	public PB13MyAccountPage5(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		driver1=driver;
	}
	public void switchWindowPB13MyAccountPage5()
	{
		Set<String> allIds = driver1.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(allIds);
		driver1.switchTo().window(al.get(1));
	}
	public String getPersonNamePB13MyAccountPage5()
	{
		String act = fullName.getAttribute("value");
		return act;
	}
}


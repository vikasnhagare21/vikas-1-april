package Page_Object_Module;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyAccPage 
{
	@FindBy(xpath="//input[@name='personName']") private WebElement fullName;
	WebDriver driver1;
	
	public PBMyAccPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1 =driver;
	}
	public void switchToChildWindow()
	{
		Set<String> allIds = driver1.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(allIds);
		driver1.switchTo().window(al.get(1));
	}
	
	public void verifyPN()
	{
		String actPN= fullName.getAttribute("value");
		String expPN= "Viman July";
		
		if(actPN.equals(expPN))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}

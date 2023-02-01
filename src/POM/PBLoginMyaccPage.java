package POM;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginMyaccPage
{
	@FindBy(xpath="//input[@name='personName']")private WebElement fullname;
	WebDriver driver1;
	public PBLoginMyaccPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		driver1=driver;
	}
	
	public void SwitchWindow()
	{
		Set<String> allIds = driver1.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(allIds);
		driver1.switchTo().window(al.get(1));
	}
	
	public String getprofileName(String s)
	{
		
		String actPN = fullname.getAttribute("value");
		return actPN;
		
//		if(actPN.equals(expPN))
//		{
//			System.out.println("Test case Pass");
//		}
//		else
//		{
//			System.out.println("Test case fail");
//		}
		
	}

	

	

	

	

	
}

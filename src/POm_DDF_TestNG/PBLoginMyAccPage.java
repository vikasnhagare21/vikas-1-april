package POm_DDF_TestNG;



	import java.util.ArrayList;
	import java.util.Set;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class PBLoginMyAccPage 
	{
	@FindBy(xpath="//input[@name='personName']") private WebElement fullname;
	WebDriver driver1;
	public PBLoginMyAccPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void swithcWindow()
	{
		Set<String> allIds = driver1.getWindowHandles();
		ArrayList<String> al= new ArrayList<String>(allIds);
		driver1.switchTo().window(al.get(1));
	}
	public String getPBMyAccPageProfileName()
	{
		String actPN=fullname.getAttribute("value");
		return actPN;
	}
//	public void verifyName() 
//	{
//		String actPN = fullname.getAttribute("value");
//		String expPN = "Viman July";
//		if(actPN.equals(expPN))
//		{
//			System.out.println("Test Script Pass");
//		}
//		else
//		{
//			System.out.println("Test Script Fail");
//		}
//		
//	}
}

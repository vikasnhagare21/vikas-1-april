package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example444_TestNGAnnotations
{
	@BeforeClass
	public void OpenBrowser()
	{
		Reporter.log("---Open Browser---",true);
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("---login into App---",true);
	}
	@Test
	public void TC1()
	{
		Reporter.log("---running TC1---",true);
	}
	@Test
	public void TC2()
	{
		Reporter.log("---running TC2---",true);
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("---logout from App---",true);
	}
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("Close the Browser");
	}
}

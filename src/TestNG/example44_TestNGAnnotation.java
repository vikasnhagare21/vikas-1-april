package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example44_TestNGAnnotation 
{
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("---Open Browser---",true);
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("---Login into App---",true);
	}
	@Test
	public void verifyName()
	{
		Reporter.log("---Verify Name---",true);
	}
	@Test
	public void VerifyName1()
	{
		Reporter.log("---Verify Name1---",true);
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("---Logout from App---",true);
	}
	@AfterClass
	public void CloseBrowser()
	{
		Reporter.log("---Close the Browser---",true);
	}
}

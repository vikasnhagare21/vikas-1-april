package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example4_TestNGAnnotations 
{
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("---open browser---",true);
	}
	@BeforeMethod
	public void loginToApp()
	{
		Reporter.log("---Login to app---",true);
	}
	@Test
	public void verifyProfileName2()
	{
		Reporter.log("running verifyProfileName2 test case",true);
	}
	@Test
	public void verifyProfileName1()
	{
		Reporter.log("running verifyProfileName1 test case",true);
	}
	@AfterMethod
	public void logoutFromApp()
	{
		Reporter.log("---logout from app---",true);
	}
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("---closes browser---",true);
	}
	
}

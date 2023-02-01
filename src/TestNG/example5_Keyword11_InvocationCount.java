package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_Keyword11_InvocationCount 
{
	@Test(invocationCount =2)
	public void verifyName1()
	{
		Reporter.log("--Verify Name1---",true);
	}
	@Test(invocationCount=3)
	public void verifyName2()
	{
		Reporter.log("---Verify Name2---",true);
	}
	@Test(invocationCount=1)
	public void VerifyName3()
	{
		Reporter.log("---Verify Name3---",true);
	}
}

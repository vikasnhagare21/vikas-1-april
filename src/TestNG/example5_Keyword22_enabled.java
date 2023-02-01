package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_Keyword22_enabled 
{
	@Test(enabled=false)
	public void TC1()
	{
		Reporter.log("---running TC1---",true);
	}
	@Test(enabled=true)
	public void TC2()
	{
		Reporter.log("---running TC2---",true);
	}
	
}

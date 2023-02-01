package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example33_EmailableReport 
{
	@Test
	public void TC1()
	{
		Reporter.log("running test case 1---",true);
	}
	@Test
	public void TC2()
	{
		Reporter.log("running test case 2",true);
	}
	@Test
	public void TC3()
	{
		Reporter.log("running test case 3",true);
	}
}

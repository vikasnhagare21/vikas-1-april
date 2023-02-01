package MockTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods 
{
	@Test(dependsOnMethods= {"TC3"})
	public void TC1()
	{
		Reporter.log("---Running TC1---",true);
	}
	@Test
	public void TC2()
	{
		Reporter.log("---Running TC2---",true);
	}
	@Test(dependsOnMethods= {"TC2"})
	public void TC3()
	{
		Reporter.log("---Running TC3---",true);
	}
}

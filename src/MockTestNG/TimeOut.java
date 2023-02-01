package MockTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut 
{
	@Test(timeOut=2000)
	public void TC1() throws InterruptedException
	{	
		Thread.sleep(1000);
		Reporter.log("---Running TC1---",true);
	}
	@Test
	public void TC2()
	{
		Reporter.log("---Running TC2---",true);
	}
	@Test
	public void TC3()
	{
		Reporter.log("---Running TC3---",true);
	}
}

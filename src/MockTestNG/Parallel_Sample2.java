package MockTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Parallel_Sample2 
{
	@Test(groups="login")
	public void TC4()
	{
		Reporter.log("---Running TC4---",true);
	}
	@Test(groups="claims")
	public void TC5()
	{
		Reporter.log("---Running TC5---",true);
	}
	@Test(groups="support")
	public void TC6()
	{
		Reporter.log("---Running TC6---",true);
	}
}

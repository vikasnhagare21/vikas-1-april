package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example333_Emailable_reporter 
{
	@Test
	public void Tc1()
	{
		Reporter.log("--running m1 successfully--",true);
	}
	@Test
	public void TC2()
	{
		Reporter.log("--running m2 successfully--",true);
	}
	
}

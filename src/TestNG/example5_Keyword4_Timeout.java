package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_Keyword4_Timeout 
{
	@Test(timeOut=5000)
	public void TC3() throws InterruptedException
	{
		Thread.sleep(6000);
		Reporter.log("---running TC3---",true);
	}
}

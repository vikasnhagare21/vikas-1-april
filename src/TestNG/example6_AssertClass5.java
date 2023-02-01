package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;


public class example6_AssertClass5 
{
	@Test
	public void TC()
	{
		boolean actResult=false;
		Assert.assertTrue(actResult, "Failed1-act result is false");
		
		String actResult1="Hi";
		String expResult1="Hello";
		Assert.assertEquals(actResult1, expResult1,"Failed2-both results are different:");
		
	}
}

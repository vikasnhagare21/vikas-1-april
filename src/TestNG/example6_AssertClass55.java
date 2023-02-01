package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example6_AssertClass55 
{
	@Test
	public void TC()
	{
		boolean actResult=false;
		Assert.assertTrue(actResult, "Failed actResult is false");
		
		String actResult1="Hi";
		String expResult1="Hello";
		Assert.assertEquals(expResult1, actResult1, "Failed actResult is Hi");
	}
}

package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example6_AssertClass1_assertEquals
{
	@Test
	public void assertEquals()
	{
		String actResult="Hi";
		String expResult="Hi";
		Assert.assertEquals(actResult, expResult,"Failed-both results are different");
		
	}
}

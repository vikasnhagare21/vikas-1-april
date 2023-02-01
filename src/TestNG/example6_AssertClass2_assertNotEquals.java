package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example6_AssertClass2_assertNotEquals
{
	@Test
	public void assertClass2_assertNotEquals()
	{
		String actResult="Hi";
		String expResult="Hi";
		Assert.assertNotEquals(actResult,expResult,"Failed-both results are same");
	}
}

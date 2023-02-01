package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;


public class example6_AssertClass3_assertTrue
{
	@Test
	public void assertTrue()
	{
		boolean actResult=false;
		Assert.assertTrue(actResult, "Failed actResult is false:");
	}
}

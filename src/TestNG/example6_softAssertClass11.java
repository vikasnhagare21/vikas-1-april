package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class example6_softAssertClass11
{
	@Test
	public void TC()
	{
		
		SoftAssert soft=new SoftAssert();
		boolean actResult=true;
		soft.assertFalse(actResult, "Failed actResult is True");
		
		String actResult1="Hi";
		String expResult1="Hello";
		soft.assertEquals(expResult1, actResult1, "Failed actResult is Hi");
		soft.assertAll();
	}
}

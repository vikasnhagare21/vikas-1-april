package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class example6_softAssertClass111 
{
	@Test
	public void TC()
	{
		SoftAssert soft=new SoftAssert();
		boolean actResult = true;
		soft.assertTrue(actResult, "Passed, The actResult is True");
		
		String actResult1="Hello";
		String expResult1="Hello";
		soft.assertEquals(expResult1,actResult1,"Passed actResult1 is Hello");
		soft.assertAll();
	}
}

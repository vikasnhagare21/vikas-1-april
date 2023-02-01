package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class example6_softAssertClass1 
{
	@Test
	public void TC()
	{
		SoftAssert soft=new SoftAssert();
		boolean actResult=false;
		soft.assertTrue(actResult, "Failed1-actResult is false");
		
		String actResult1="Hi";
		String expResult1="Hello";
		soft.assertEquals(actResult1,expResult1,"Failed2-both result are different");
		soft.assertAll();
	}
	
}

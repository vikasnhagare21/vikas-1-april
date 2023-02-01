package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class example6_softAssertClass2 
{
	@Test
	public void TC1()
	{
		SoftAssert soft=new SoftAssert();
		boolean actResult=true;
		soft.assertFalse(actResult, "Failed actResult is true");
		
		String actResult1="vikas";
		String expResult1="vilas";
		soft.assertEquals(expResult1, actResult1, "Failed actResult1 is vikas");
	}
}

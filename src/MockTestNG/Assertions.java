package MockTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions 
{
	@Test
	public void TC1()
	{	
		SoftAssert s=new SoftAssert();
		String s1="vikas";
		String s2="vikky";
		boolean s3=true;
		s.assertTrue(s3,"Failed:Becauese s3 is true");
		s.assertEquals(s1,s2,"Failed:because both Strings are different");
		s.assertAll();
	}
}

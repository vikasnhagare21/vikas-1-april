package MockTestNG;


	import org.testng.Reporter;
	import org.testng.annotations.Test;

	public class Group1
	{
		@Test(groups="login")
		public void TC1()
		{
			Reporter.log("---Running TC1---",true);
		}
		@Test(groups="claims")
		public void TC2()
		{
			Reporter.log("---Running TC2---",true);
		}
		@Test(groups="support")
		public void TC3()
		{
			Reporter.log("---Running TC3---",true);
		}
	}



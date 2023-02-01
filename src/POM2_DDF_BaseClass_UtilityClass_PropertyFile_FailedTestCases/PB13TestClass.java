package POM2_DDF_BaseClass_UtilityClass_PropertyFile_FailedTestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PB13TestClass extends BaseClass2
{
	PB13LoginPage1 login;
	PB13LoginWithMobNumPage2 mob;
	PB13LoginWithPwdPage3 pwd;
	PB13HomePage4 home;
	PB13MyAccountPage5 myAcc;
	int TCID;
	@BeforeClass
	public void OpenBrowser() throws IOException
	{
		initializeBrowser();
		login=new PB13LoginPage1(driver);
		mob=new PB13LoginWithMobNumPage2(driver);
		pwd=new PB13LoginWithPwdPage3(driver);
		home=new PB13HomePage4(driver);
		myAcc=new PB13MyAccountPage5(driver);
		
	}
	@BeforeMethod
	public void LoginToApp() throws IOException
	{
		
		login.clickPB13LoginPage1();
		mob.inpPB13LoginWithMobNumPage2(UtilityClass.readPFData("mobNum"));
		mob.clickPB13LoginWithMobNumPage2();
		pwd.inpPB13LoginWithPwdPage3(UtilityClass.readPFData("pwd"));
		pwd.clickPB13LoginWithPwdPage3();
		
		
		
	}
	@Test
	public void VerifyName() throws EncryptedDocumentException, IOException, InterruptedException
	{
		TCID=111;
		Thread.sleep(3000);
		home.hoverPB13HomePage4();
		home.clickPB13HomePage4();
		myAcc.switchWindowPB13MyAccountPage5();
		String actPN = myAcc.getPersonNamePB13MyAccountPage5();
		String expPN = UtilityClass.getTD(0, 1);
		Assert.assertEquals(actPN, expPN,"Failed: both results are different");
		
		
	}
	@AfterMethod
	public void LogoutFromApp(ITestResult s1) throws IOException
	{
		
		if(s1.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.Capturess(driver, TCID);
		}
	
		
	}
	@AfterClass
	public void CloseBrowser() throws InterruptedException
	{		
		Thread.sleep(3000);
		driver.quit();
		
	}
}

package POM_DDF_TestNG_BaseClass_UtilityClass_PropertyFile_FailedTCess;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_DDF_TestNG_BaseClass_UtilityClass.UtilityClass;

public class PB12TestClass extends BaseClass
{
	PB12LoginPage1 Login;
	PB12LoginWithMobNumPage2 mob;
	PB12LoginWithPwdPage3 pwd;
	PB12HomePage4 home;
	PB12MyAccPage5 myacc;
	int TCID;
	@BeforeClass
	public void OpenBrowser() throws IOException
	{
		initializeBrowser();
		Login=new PB12LoginPage1(driver);
		mob=new PB12LoginWithMobNumPage2(driver);
		pwd=new PB12LoginWithPwdPage3(driver);
		home=new PB12HomePage4(driver);
		myacc=new PB12MyAccPage5(driver);
	}
	@BeforeMethod
	public void LoginToApp() throws EncryptedDocumentException, IOException
	{
		Login.clickSigninBtnPB12LoginPage1();
		mob.inpPB12LoginWithMobNumPage2(Utility_Class.readPFData("mobNum"));
		mob.clickPB12LoginWithMobNumPage2();
		pwd.inpPB12LoginWithPwdPage3(Utility_Class.readPFData("pwd"));
		pwd.clickPB12LoginWithPwdPage3();
		
	}
	@Test
	public void VerifyName() throws InterruptedException, EncryptedDocumentException, IOException
	{
		TCID=104;
		Thread.sleep(3000);
		home.hoverPB12HomePage4();
		home.clickPB12HomePage4();
		myacc.SwitchWindowPB12MyAccPage5();
		String actPN = myacc.getPersonNamePB12MyAccPage5();
		String expPN = Utility_Class.getTD(0, 2);
		Assert.assertEquals(actPN, expPN, "Failed: both results are diff:");
	}
	@AfterMethod
	public void LogoutFromApp(ITestResult s1) throws IOException
	{
		if(s1.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.captureSS(driver, TCID);
		}
		
	}
	@AfterClass
	public void CloseBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}

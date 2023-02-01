package POM2_DDF_TestNG_Base_UtilityClass;

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
	@BeforeClass
	public void OpenBrowser()
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
		mob.inpPB12LoginWithMobNumPage2(Utility_Class.getTD(0, 0));
		mob.clickPB12LoginWithMobNumPage2();
		pwd.inpPB12LoginWithPwdPage3(Utility_Class.getTD(0, 1));
		pwd.clickPB12LoginWithPwdPage3();
		
	}
	@Test
	public void VerifyName() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Thread.sleep(3000);
		home.hoverPB12HomePage4();
		home.clickPB12HomePage4();
		myacc.SwitchWindowPB12MyAccPage5();
		String actPN = myacc.getPersonNamePB12MyAccPage5();
		String expPN = Utility_Class.getTD(0, 1);
		Assert.assertEquals(actPN, expPN, "Failed: both results are diff:");
	}
	@AfterMethod
	public void LogoutFromApp() throws IOException
	{
		
		
	}
	@AfterClass
	public void CloseBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}

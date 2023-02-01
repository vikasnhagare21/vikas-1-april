package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PB11LoginTest extends BaseClass
{	
	PB11LoginPage1 login;
	PB11LoginWithMobNumPage2 mobNum;
	PB11LoginWithPwdPage3 pwd;
	PB11HomePage4 home;
	PB11MyAccPage5 myAcc;
	@BeforeClass
	public void OpenBrowser()
	{
		initializeBrowser();
		login=new PB11LoginPage1(driver);
		mobNum=new PB11LoginWithMobNumPage2(driver);
		pwd= new PB11LoginWithPwdPage3(driver);
		home=new PB11HomePage4(driver);
		myAcc=new PB11MyAccPage5(driver);
		
	}
	@BeforeMethod
	public void LoginToApp() throws EncryptedDocumentException, IOException
	{
		login.clickOnSigninbtn();
		mobNum.inpPB11LoginWithMobNumPage2(UtilityClass.getTD(0, 0));
		mobNum.clickPB11LoginWithMobNumPage2();
		pwd.inpPB11LoginWithPwdPage3(UtilityClass.getTD(0, 1));
		pwd.clickPB11LoginWithPwdPage3();
		
		
	}
	@Test
	public void verifyname() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Thread.sleep(3000);
		home.hoverPB11HomePage4();
		home.clickPB11HomePage4();
		myAcc.SwitchPB11MyAccPage5();
		String actPN = myAcc.getPersonNamePB11MyAccPage5();
		String expPN = UtilityClass.getTD(0, 2);
		Assert.assertEquals(actPN, expPN,"Failed:both results are diff:");
		
		
	}
	@AfterMethod
	public void LogoutFromApp()
	{
		
	}
	@AfterClass
	public void CloseBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}

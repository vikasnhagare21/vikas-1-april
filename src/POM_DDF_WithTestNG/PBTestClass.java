package POM_DDF_WithTestNG;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.PBLoginHome;
import POM.PBLoginMyaccPage;
import POM.PBLoginPage;
import POM.PBLoginWithMobNum;
import POM.PBLoginWithPwd;

public class PBTestClass
{	
	PBLoginPage login;
	PBLoginWithMobNum mobNum;
	PBLoginWithPwd pwd;
	PBLoginHome home;
	PBLoginMyaccPage myAcc;
	Sheet sh;
	WebDriver driver;
	
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\excel sheet for selenium use.xlsx");
		sh=WorkbookFactory.create(file).getSheet("Sheet2");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 login=new PBLoginPage(driver);
		 mobNum=new PBLoginWithMobNum(driver);
		 pwd=new PBLoginWithPwd(driver);
		 home=new PBLoginHome(driver);
		 myAcc= new PBLoginMyaccPage(driver);
		
	}
	@BeforeMethod
	public void LoginToApp() throws InterruptedException
	{
		login.clickPBLoginPageSignin();
		mobNum.EnterMobileNum(sh.getRow(0).getCell(0).getStringCellValue());
		mobNum.clickOnSignInWithPwd();
		Thread.sleep(3000);
		
		pwd.inpPBLoginWithPwd(sh.getRow(0).getCell(1).getStringCellValue());
		pwd.clickPBLoginWithPwdbtn();

	}
	@Test
	public void VerifyProfileName() throws InterruptedException
	{
		Thread.sleep(3000);
		home.hoverPBLoginHomeMyacc();
		home.clickOnPBLoginHomeMyprofile();
		myAcc.SwitchWindow();
		String actPN=myAcc.getprofileName();
		String expPN=sh.getRow(0).getCell(2).getStringCellValue();
		Assert.assertEquals(actPN, expPN,"Failed:both results are diff:");
	}
	@AfterMethod
	public void LogoutfroApp()
	{
		
	}
	@AfterClass
	public void CloseBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}

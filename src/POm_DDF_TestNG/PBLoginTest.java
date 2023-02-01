package POm_DDF_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

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


public class PBLoginTest 
{
	int a;
	PBLoginPage login;
	PBLoginWithMobNum mobNum;
	PBLoginWithPwd pwd;
	PBLoginHome home;
	PBLoginMyaccPage myAcc;
	Sheet sh;
	WebDriver driver;
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\excel sheet for selenium use.xlsx");
		sh=WorkbookFactory.create(file).getSheet("Sheet1");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 login=new PBLoginPage(driver);
		 mobNum=new PBLoginWithMobNum(driver);
		 home=new PBLoginHome(driver);
		 myAcc= new PBLoginMyaccPage(driver);
		 a=10;
	}
	@BeforeMethod
	public void loginToApp() throws InterruptedException
	{
		System.out.println(a);
		login.clickPBLoginPageSignin();
		mobNum.EnterMobileNum(sh.getRow(0).getCell(0).getStringCellValue());
		mobNum.clickOnSignInWithPwd();
		
		pwd.inpPBLoginWithPwd(sh.getRow(0).getCell(1).getStringCellValue());
		pwd.clickPBLoginWithPwdbtn();
		}
	@Test
	public void verifyProfileName() throws InterruptedException
	{
		Thread.sleep(3000);
		home.hoverPBLoginHomeMyacc();
		home.clickOnPBLoginHomeMyprofile();
		myAcc.SwitchWindow();
		String actPN=myAcc.verifyname();
		String expPN=sh.getRow(0).getCell(2).getStringCellValue();
		Assert.assertEquals(actPN, expPN,"Failed:both results are diff:");
	}
	@AfterMethod
	public void logoutFromApp()
	{
		
	}
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
}

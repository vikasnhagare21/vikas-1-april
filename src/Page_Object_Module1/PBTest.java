package Page_Object_Module1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page_Object_Module.PBLoginWithMobNumPage;

public class PBTest 
{
	public static void main(String[] args) throws InterruptedException 
	{
//		System.setProperty("webdriver.chrome.driver","D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		PBLoginPage login=new PBLoginPage(driver);
		login.clickOnSignInbtn();
		Thread.sleep(2000);
		
		PBLoginWithMobNumPage mobNum=new PBLoginWithMobNumPage(driver);
		mobNum.enterMobNum();
		mobNum.clickOnloginPwdBtn();
		Thread.sleep(2000);

		
		PBLoginWithPwd pwd=new PBLoginWithPwd(driver);
		pwd.enterPwd();
		pwd.clickOnSignIn();
		Thread.sleep(2000);
		
		PBHomePage home=new PBHomePage(driver);
		home.OpenMyaccOption();
		home.clickOnMyProfile();
		Thread.sleep(2000);

		
		PBLoginMyAccPage Myacc= new PBLoginMyAccPage(driver);
		Myacc.swithcWindow();
		Myacc.verifyName();
		
	}
}

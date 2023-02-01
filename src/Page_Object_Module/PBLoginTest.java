package Page_Object_Module;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest 
{
	public static void main(String[] args) throws InterruptedException 
	{
//		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 PBLoginPage login=new PBLoginPage(driver);
		 login.clickOnSignInBtn();
		 
		 PBLoginWithMobNumPage mobNum=new PBLoginWithMobNumPage(driver);
		 mobNum.enterMobNum();
		 mobNum.clickOnloginPwdBtn();
		 Thread.sleep(2000);
		 
		 PBLoginWithPwdPage pwd=new PBLoginWithPwdPage(driver);
		 pwd.enterPWD();
		 pwd.clickOnSignBtn();
		 
		 PBHomePage home = new PBHomePage(driver);
		  home.openMyAccOption();
		  home.clickOnMyProfile();
		  
		  PBMyAccPage myAcc= new PBMyAccPage(driver);
		  myAcc.switchToChildWindow();
		  myAcc.verifyPN();
		  
		  Thread.sleep(5000);
		  driver.quit();
		 
		 
	}
}

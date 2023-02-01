package POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest1
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream file=new FileInputStream("D:\\excel sheet for selenium use.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.policybazaar.com/");
		
		driver.manage().window().maximize();
		
		PBLoginPage login=new PBLoginPage(driver);
		login.clickPBLoginPageSignin();
		
		PBLoginWithMobNum mobnum=new PBLoginWithMobNum(driver);
		String mob = sh.getRow(0).getCell(0).getStringCellValue();
		mobnum.EnterMobileNum(mob);
		mobnum.clickOnSignInWithPwd();
		
		PBLoginWithPwd pass=new PBLoginWithPwd(driver);
		String pwd = sh.getRow(0).getCell(1).getStringCellValue();
		pass.inpPBLoginWithPwd(pwd);
		pass.clickPBLoginWithPwdbtn();
		Thread.sleep(2000);
		
		PBLoginHome home=new PBLoginHome(driver);
		home.hoverPBLoginHomeMyacc();
		home.clickOnPBLoginHomeMyprofile();
		
		PBLoginMyaccPage acc=new PBLoginMyaccPage(driver);
		acc.SwitchWindow();
		String PN = sh.getRow(0).getCell(2).getStringCellValue();
		acc.verifyname(PN);
		Thread.sleep(3000);
		driver.quit();
				
		
	}
}

package POM_DDF_TestNG_BaseClass_UtilityClass_PropertyFile_FailedTCess;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	WebDriver driver;
	public void initializeBrowser() throws IOException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Utility_Class.readPFData("url"));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
}

package POM2_DDF_BaseClass_UtilityClass_PropertyFile_FailedTestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass2 
{	WebDriver driver;
	public void initializeBrowser() throws IOException
	{
		driver=new ChromeDriver();
		driver.get(UtilityClass.readPFData("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
}

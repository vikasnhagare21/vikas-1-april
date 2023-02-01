package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class example11_MultipleBrowserTesting4
{
	
	@Parameters("BrowserName")
	@Test
	public void OpenApp(String BrowserName) throws InterruptedException
	{
		WebDriver driver=null;
		if(BrowserName.equals("Chrome"))
		{
			
			driver=new ChromeDriver();
		}
		else if(BrowserName.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
	
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
	}
}

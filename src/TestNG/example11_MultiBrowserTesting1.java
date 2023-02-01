package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class example11_MultiBrowserTesting1
{
	@Parameters("BrowserName")
	@Test
	public void OpenApp(String BrowserName) throws InterruptedException
	{
		WebDriver driver=null;
		if(BrowserName.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (BrowserName.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if (BrowserName.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "");
			driver=new EdgeDriver();
		}
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.quit();
	}
}

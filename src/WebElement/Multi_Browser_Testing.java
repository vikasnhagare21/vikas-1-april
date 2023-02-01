package WebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multi_Browser_Testing 
{
	
	@Parameters("BrowserName")
	@Test
	public void Open_Browser(String BrowserName) throws InterruptedException
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
		else if (BrowserName.equals("Edge"))
		{
			driver=new EdgeDriver();
		}
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.quit();
		
	}
}

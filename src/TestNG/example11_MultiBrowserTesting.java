package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class example11_MultiBrowserTesting 
{
	@Parameters("BrowserName")
	@Test
	public void OpenApp(String BrowserName) throws InterruptedException 
	{
		WebDriver driver =null;
		
		if(BrowserName.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (BrowserName.equals("firefox"))
		{
//			System.setProperty("C:\\Users\\DELL\\OneDrive\\Desktop\\geckodriver-v0.32.0-win64\\geckodriver.exe", BrowserName);
			driver=new FirefoxDriver();
		}
		else if (BrowserName.equals("Edge"))
		{
			driver=new EdgeDriver();
		}
		driver.get("http://www.facebook.com/");
		Thread.sleep(5000);
		driver.quit();
	}
}

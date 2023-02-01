package _Scroll_;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_Scroll_UP_Down 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,10000)");
	}
}

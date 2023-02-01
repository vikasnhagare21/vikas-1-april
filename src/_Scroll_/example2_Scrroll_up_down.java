package _Scroll_;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_Scrroll_up_down 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,10000)");
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-10000)");
		
	}
}

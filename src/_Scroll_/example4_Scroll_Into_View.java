package _Scroll_;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_Scroll_Into_View 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement view = driver.findElement(By.xpath("//a[text()='Create ad']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",view);

//		((JavascriptExecutor)driver).executeScript("argument[0]scrollIntoView();",view);
//		((JavascriptExecutor)driver).executeScript("argument[0]scrollIntoView();", view);
//		((JavascriptExecutor)driver).executeScript("argument[0]scrollIntoView();", view);
	}
}

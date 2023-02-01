
package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice3 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.get("https://www.facebook.com/");
	
	//driver.close();
	//driver.quit();
//	 String title = driver.getTitle();
//	 System.out.println(title);
	// System.out.println(driver.getTitle());
//	String url = driver.getCurrentUrl();
//	System.out.println(url);
//	System.out.println(driver.getCurrentUrl());
	driver.navigate().to("https://www.youtube.com/");
//	Options s1 = driver.manage();
//	Window s2 = s1.window();
//	s2.maximize();
//	driver.manage().window().maximize();
//	Options s1 = driver.manage();
//	Window s2 = s1.window();
//	s2.minimize();
//	driver.manage().window().minimize();
	driver.findElement(By.xpath("//button[@name='login']")).click();
	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	driver.findElement(By.xpath("//a[contains(@data-testid,'-registration')]")).click();
	
	
	 
}
}

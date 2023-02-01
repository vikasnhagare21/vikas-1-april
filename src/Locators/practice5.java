package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice5 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/login/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abcd");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("xyzabxx");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}
}

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice4 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[contains(@class,'_6lti')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("abcd");
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("xyz");
}
}

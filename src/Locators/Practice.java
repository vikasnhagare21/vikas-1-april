package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	//driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
//	driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]")).sendKeys("abcd");
//	driver.findElement(By.xpath("//input[contains(@class,'_55r1 ')]")).sendKeys("xyz");
	//driver.findElement(By.xpath("//a[contains(text(),'ssword')]")).click();
	//driver.findElement(By.xpath("//a[contains(text(),'ate ')]")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abcd");
}
}

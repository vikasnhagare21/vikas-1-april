package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//driver.findElement(By.xpath("//a[@id='u_0_0_1t']")).click();
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("nagesh");
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
	driver.findElement(By.xpath("//button[contains(@class,'y6 _4jy')]")).click();
	driver.findElement(By.xpath("//button[contains(text(),'in')]")).click();
}
}

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_xpathAttribute
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vikasnhagare21@gmail.com");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("ilanos");
	driver.findElement(By.xpath("//button[@name='login']")).click();
}
}

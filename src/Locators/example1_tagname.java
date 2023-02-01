package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_tagname
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/DELL/OneDrive/Documents/a.html");
	driver.findElement(By.tagName("input")).sendKeys("abc");
	driver.findElement(By.id("1234")).sendKeys("xyz");
	driver.findElement(By.className("abc123")).sendKeys("xyz");
}
}

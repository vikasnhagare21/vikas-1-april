package Locators;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice6
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd");
		driver.findElement(By.xpath("(//input[contains(@class,' _55r1')])[2]")).sendKeys("xyz");
//		driver.findElement(By.xpath("//button[text()='Log in']")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'New')]")).click();
//		driver.findElement(By.tagName("input")).sendKeys("ABACD");
	}
}

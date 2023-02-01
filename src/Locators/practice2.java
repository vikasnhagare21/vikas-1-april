package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("ramayan");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[contains(@id,'search-icon')]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@aria-label='Clear search query']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("mahabharat");
	driver.findElement(By.xpath("//button[contains(@id,'search-icon')]")).click();
}
}

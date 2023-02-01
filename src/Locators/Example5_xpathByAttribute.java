package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5_xpathByAttribute
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("ramayan");
	driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']")).click();
	
}

}

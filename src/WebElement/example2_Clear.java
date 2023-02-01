package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_Clear
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name='email']")).clear();
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("xyz");
		
		WebElement UN=driver.findElement(By.xpath("//input[@name='email']"));
		
		UN.sendKeys("abc");
		
		Thread.sleep(2000);
		
		UN.clear();
		
		Thread.sleep(2000);

		UN.sendKeys("xyz");

	}
	
}

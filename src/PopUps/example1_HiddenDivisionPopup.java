package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_HiddenDivisionPopup
{
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("abcd");
			
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("xyz");
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		}
}

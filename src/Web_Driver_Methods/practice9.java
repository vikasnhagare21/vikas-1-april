package Web_Driver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice9
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.youtube.com/");
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("ramayan");
	driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	driver.findElement(By.xpath("//div[@class='yt-spec-touch-feedback-shape__fill']")).click();
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("mahabharat");
	driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	
}
}

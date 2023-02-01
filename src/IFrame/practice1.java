package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
//		driver.switchTo().frame("iframeResult");  //by framename
//		driver.switchTo().frame(1);  //by frame Index
//		driver.switchTo().frame("iframeResult"); //by frameid
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		
		driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
//		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
	}
}

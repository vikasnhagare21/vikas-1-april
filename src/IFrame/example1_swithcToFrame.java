package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_swithcToFrame
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
//		driver.switchTo().frame("iframeResult");  // String FrameName
		//driver.switchTo().frame("iframeResult")	;	//string frameID
	//	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));//frame WebElement
		//driver.switchTo().frame(2); //frameindex
		driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
		
	}
}

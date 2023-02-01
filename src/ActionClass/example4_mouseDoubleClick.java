package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example4_mouseDoubleClick 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement doubleClickele = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		Actions act=new Actions(driver);
//		act.moveToElement(doubleClickele).perform();
//		act.doubleClick().perform();
//		act.moveToElement(doubleClickele).doubleClick().build().perform();
		act.doubleClick(doubleClickele).perform();
	}
}

package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example3_mouseLeftClick 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement ele = driver.findElement(By.xpath("//a[text()='Insurance Project']"));
		Actions act=new Actions(driver);
//		act.moveToElement(ele).perform();
//		act.click().perform();
//		act.moveToElement(ele).click().build().perform();
		act.click(ele).perform();
		
		
	}
}

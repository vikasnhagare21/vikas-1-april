package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example3_selectAllCheckboxes 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/OneDrive/Documents/vikas.html");
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		Actions act=new Actions(driver);
		for(WebElement s1:checkbox)
		{
			s1.click();
			Thread.sleep(500);
		}
	}
}

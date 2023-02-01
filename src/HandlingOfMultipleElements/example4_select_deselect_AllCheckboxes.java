package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example4_select_deselect_AllCheckboxes 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/OneDrive/Documents/vikas.html");
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		Actions act=new Actions(driver);
		for(WebElement s1:checkboxes)
		{
			s1.click();
			Thread.sleep(500);
		}
		for(int i=checkboxes.size()-1;i>=0;i--)
		{
			checkboxes.get(i).click();
			Thread.sleep(500);
		}
	}
}

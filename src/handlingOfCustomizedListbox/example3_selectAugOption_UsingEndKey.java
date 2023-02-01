package handlingOfCustomizedListbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example3_selectAugOption_UsingEndKey
{
	public static void main(String[] args) throws InterruptedException
	{
//		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Actions act=new Actions(driver);
		act.click(month).perform();
		act.sendKeys(Keys.END).perform();
		Thread.sleep(2000);
		for(int i=0;i<=4;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
		}
		act.sendKeys(Keys.ENTER).perform();
	}
}

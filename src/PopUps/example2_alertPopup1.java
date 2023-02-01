package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_alertPopup1
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("101");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		Thread.sleep(1000);
//		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
	}
}

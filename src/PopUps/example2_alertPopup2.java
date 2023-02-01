package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_alertPopup2
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Alert alt = driver.switchTo().alert();
		String text = alt.getText();
		System.out.println(text);
//		alt.dismiss();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		alt.accept();
		alt.accept();
	}
}

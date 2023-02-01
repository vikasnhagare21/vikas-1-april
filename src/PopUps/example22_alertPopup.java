package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example22_alertPopup
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("101");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
//		al.dismiss();
		al.accept();
		Thread.sleep(3000);
		al.accept();
		
	}
}

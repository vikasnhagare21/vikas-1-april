package ActionClass;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example1_HandlingOfDropdown 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement moreEle = driver.findElement(By.xpath("//div[text()='More']"));
		Actions act=new Actions(driver);
		
		act.moveToElement(moreEle).perform();
		driver.findElement(By.xpath("//div[text()='Advertise']")).click();
		
		
	}
}

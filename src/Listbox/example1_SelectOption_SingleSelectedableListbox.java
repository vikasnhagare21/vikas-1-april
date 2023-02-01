package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example1_SelectOption_SingleSelectedableListbox 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(7000);
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select(month);
		s.selectByVisibleText("Jan");
		s.selectByValue("2");
		s.selectByIndex(3);
		
	}
}

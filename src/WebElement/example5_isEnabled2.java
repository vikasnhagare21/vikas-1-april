package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example5_isEnabled2 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	boolean result=driver.findElement(By.xpath("//a[text()='Create New Account']")).isEnabled();
	System.out.println(result);
	
	if(result==true)
	{
		System.out.println("element enabled");
	}
	else
	{
		System.out.println("element disabled");
	}
}
}

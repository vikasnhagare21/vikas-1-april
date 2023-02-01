package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6_isDisplayed2 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	boolean result=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed();
	System.out.println(result);
	if(result==true)
	{
		System.out.println("element is found");
	}
	else
	{
		System.out.println("element not found");
	}
	
}
}

package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example11_NormalTestClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		Thread.sleep(3000);
		driver.close();
	}
}

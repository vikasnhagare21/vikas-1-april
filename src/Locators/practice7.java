package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice7 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.iciciprulife.com/term-insurance-plans/iprotect-smart-term-insurance-calculator.html?UID=1426");
		boolean ab = driver.findElement(By.xpath("//label[@for='t2']")).isSelected();
	System.out.println(ab);
//		if(ab==true)
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[text()='Go']")).click();
		
	}
}

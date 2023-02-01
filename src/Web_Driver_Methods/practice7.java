package Web_Driver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice7
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
//	String title = driver.getTitle();
//	System.out.println(title);
	//System.out.println(driver.getTitle());
//	String url = driver.getCurrentUrl();
//	System.out.println(url);
//	System.out.println(driver.getCurrentUrl());
//	 Options s1 = driver.manage();
//	Window s2 = s1.window();
//	s2.maximize();
//	driver.manage().window().maximize();
//	Options s3 = driver.manage();
//	Window s4 = s3.window();
//	s4.minimize();
	driver.manage().window().minimize();
//	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vikasnhagare21@gmail.com");
//	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ilanos");
//	driver.findElement(By.xpath("//button[@value='1']")).click();
//	
	


	
}
}

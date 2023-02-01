package Web_Driver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.nykaa.com/");
	//driver.get("https://sellglobal.ebay.in/");
	//Thread.sleep(3000);
	//driver.close();
	
	//driver.quit();
	//String title = driver.getTitle();
	//System.out.println(title);
	
	//String url = driver.getCurrentUrl();
	//System.out.println(url);
	System.out.println(driver.getCurrentUrl());
}
}

package Web_Driver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice4 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.get("https://www.facebook.com/");
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.navigate().to("https://www.youtube.com/");
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
	
	//Options s1=driver.manage();
	//Window s2 = s1.window();
	//s2.maximize();
	//driver.manage().window().maximize();
	
	//Options s1 = driver.manage();
	//Window s2 = s1.window();
	//s2.minimize();
	
	//driver.manage().window().minimize();
	
	//Thread.sleep(3000);
	//driver.navigate().to("https://www.youtube.com/");
	
	
	
	//System.out.println(driver.getCurrentUrl());
	
	//String s2=driver.getCurrentUrl();
	//System.out.println(s2);
	
	//System.out.println(driver.getTitle());
	
	//String s1=driver.getTitle();
	//System.out.println(s1);
	
	//Thread.sleep(2000);
	//driver.close();
	//driver.quit();
	
}
}

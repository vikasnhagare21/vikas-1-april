package Web_Driver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice3
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.get("https://www.nykaa.com/");
	
	driver.navigate().to("https://www.nykaa.com/");
	Thread.sleep(3000);
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
	
	//driver.manage().window().minimize();
	
	 //Options s1 = driver.manage();
	 //Window s2=s1.window();
	 //s2.minimize();
	
	//driver.manage().window().maximize();
	
	// Options s1 = driver.manage();
	 //Window s2 = s1.window();
	//s2.maximize();
	
	
	//String s2=driver.getCurrentUrl();
	//System.out.println(s2);
	//System.out.println(driver.getTitle());
	// String s1 = driver.getTitle();
	 //System.out.println(s1);
	
	//Thread.sleep(3000);
	//driver.quit();
	//driver.close();
}
}

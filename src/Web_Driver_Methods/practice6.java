package Web_Driver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice6
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.get("https://www.facebook.com/");
//	String title =driver.getTitle();
//	System.out.println(title);
	//System.out.println(driver.getTitle());
//	 String url = driver.getCurrentUrl();
//	 System.out.println(url);
	
	driver.navigate().to("https://www.facebook.com/");
//	Thread.sleep(3000);
//	driver.navigate().to("https://www.amazon.com/");
//	Thread.sleep(3000);
//	driver.navigate().back();
//	Thread.sleep(3000);
//	driver.navigate().forward();
//	Thread.sleep(3000);
//	driver.navigate().refresh();

//	Options s1 = driver.manage();
//	Window s2 = s1.window();
//	s2.maximize();
	 driver.manage().window().maximize();
	 Options s1 = driver.manage();
	  Window s2 = s1.window();
	  s2.maximize();
	  Thread.sleep(3000);
	 Options s3 = driver.manage();
	 Window s4 = s3.window();
	 s4.minimize();
	 
	
	
}
}

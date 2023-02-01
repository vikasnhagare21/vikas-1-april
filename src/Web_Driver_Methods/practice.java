package Web_Driver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	//driver.get("https://www.youtube.com/");
	driver.get("https://www.facebook.com/");
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
	//String title=driver.getTitle();
	//System.out.println(title);
	
	//System.out.println(driver.getTitle());
	
	//driver.quit();
	
	//Thread.sleep(4000);
	//driver.close();
}
}

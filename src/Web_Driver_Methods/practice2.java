package Web_Driver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	//String title = driver.getTitle();
	//System.out.println(title);
	//System.out.println(driver.getTitle());
	//Thread.sleep(5000);
	//driver.close();
	//driver.quit();
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
}
}

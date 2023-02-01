package Web_Driver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_get
{
public static void main(String[] args)
{
System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium1\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
}
}

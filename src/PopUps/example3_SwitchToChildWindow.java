package PopUps;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_SwitchToChildWindow
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://skpatro.github.io/demo/links/");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		Set<String> allIds = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(allIds);
//		String childWindowID = al.get(1);
		driver.switchTo().window(al.get(1));
		
		driver.findElement(By.xpath("//span[text()='Training']")).click();
	}
}

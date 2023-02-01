package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_getSizeOfAllLinksFromFacebookWebpage
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		int size = driver.findElements(By.xpath("//a")).size();
		System.out.println(size);
	
//		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
//		int size = allLinks.size();
//		System.out.println(size);
	}
}

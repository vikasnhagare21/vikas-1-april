package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_getRoeSizeInATable
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/OneDrive/Documents/webTable.html");
//		int rowSize = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr")).size();
//		System.out.println(rowSize);
		
		List<WebElement> allrows = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr"));
		int rowsize = allrows.size();
		System.out.println(rowsize);
	}
}

package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3__getRowSizeInATable 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/OneDrive/Documents/webTable.html");
		int rowsize = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr")).size();
			System.out.println(rowsize);

			int colsize = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr[2]/td")).size();
			System.out.println(colsize);
	
			String text = driver.findElement(By.xpath("//table[@id='1234']/tbody/tr[2]/td[2]")).getText();
			System.out.println(text);
	}
}

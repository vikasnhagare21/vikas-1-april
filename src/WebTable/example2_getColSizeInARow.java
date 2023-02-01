package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_getColSizeInARow
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/OneDrive/Documents/webTable.html");
//		int rowSize = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr")).size();
//		System.out.println(rowSize);
		
		List<WebElement> allCols = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr[2]/td"));
		int Colsize = allCols.size();
		System.out.println(Colsize);
		for(WebElement s1:allCols)
		{
			System.out.println(s1.getText());
			
		}
		String text = driver.findElement(By.xpath("//table[@id='1234']/tbody/tr[2]/td[2]")).getText();
		System.out.println(text);
	}
}

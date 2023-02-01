package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice 
{
	public static void main(String[] args) throws InterruptedException 
	{
//		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s = new Select(month);
//		s.selectByValue("3");
//		s.selectByValue("2");
//		s.selectByIndex(0);
		s.selectByVisibleText("May");
		WebElement option = s.getFirstSelectedOption();
		String may = option.getText();
		System.out.println(may);
		Thread.sleep(3000);
		System.out.println("----------------");
		List<WebElement> AllOption = s.getOptions();
		for(WebElement s1:AllOption)
		{
			System.out.println(s1.getText());
		}
		
		
	}
}

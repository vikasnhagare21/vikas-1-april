package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example_SelectOption_multiSelectable 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("C:/Users/DELL/OneDrive/Documents/v.html");
		WebElement SelectCountry = driver.findElement(By.xpath("//select[@id='1234']"));
		Select s=new Select(SelectCountry);
		s.selectByIndex(3);
		s.selectByVisibleText("India");
	s.selectByVisibleText("Pakistan");
//	 AllOption = s.getSelectedOption();
//	for(WebElement s1:AllOption)
//	{
//		System.out.println(s1.getText());
//	}
	WebElement d = s.getFirstSelectedOption();
	System.out.println(d.getText());

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//	Thread.sleep(3000);
//		s.deselectAll();
//		s.deselectByVisibleText("England");
		
		
//		List<WebElement> sf = s.getAllSelectedOptions();
//		List<WebElement> AllOption = s.getOptions();
//		int size = AllOption.size();
//		System.out.println(size);
//		for(WebElement s1:AllOption)
//		{
//			System.out.println(s1.getText());
//		}
		
	
		
	}
}

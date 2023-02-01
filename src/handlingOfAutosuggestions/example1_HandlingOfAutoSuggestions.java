package handlingOfAutosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_HandlingOfAutoSuggestions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium1\\chromedriver_win32.zip\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("redmi");
		
		Thread.sleep(1000);
		
		String expText="redmi 10";
		
		List<WebElement> allOptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		for(WebElement s1:allOptions)
		{
			String actText =s1.getText();
			if(actText.equals(expText))
			{
				s1.click();
				
				break;
			}
		}
	}
}

package handlingOfAutosuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Durations;

public class example2_handlingOfAutosuggestions 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("redmi");
		String extText = "redmi 10 prime";
		List<WebElement> all = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		for(WebElement s1:all)
		{
			String actText = s1.getText();
			if(actText.equals(extText))
			{
				s1.click();
				break;
			}
		}
	
	
	}
}

package handlingOfAutosuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_Autosuggestions 
{ 
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("redmi");
		Thread.sleep(3000);
		List<WebElement> allOptions = driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]/li"));
		String exp = "redmi note 12 pro";
		for(WebElement s1:allOptions)
		{
			String act = s1.getText();
			if(act.equals(exp))
			{
				
				s1.click();
				break;
			}
		}
	}

}

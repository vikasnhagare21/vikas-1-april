package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_of_Autosuggetions 
{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("redmi");
		Thread.sleep(3000);
		List<WebElement> allOptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		String exp = "redmi note 10";
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

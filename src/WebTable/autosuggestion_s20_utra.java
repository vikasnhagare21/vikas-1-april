package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestion_s20_utra 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("s22 utra");
		Thread.sleep(3000);
		List<WebElement> alloption = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		String exp = "s22 note ultra";
		for(WebElement s1:alloption)
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

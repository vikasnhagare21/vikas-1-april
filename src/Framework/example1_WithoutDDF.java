package Framework;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example1_WithoutDDF 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32.zip\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("7020500587");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Viman@22");
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		Thread.sleep(3000);
		WebElement myacc = driver.findElement(By.xpath("//div[text()='My Account']"));
		Actions act=new Actions(driver);
		act.moveToElement(myacc).perform();
		
		driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
		Set<String> allIds = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(allIds);
		driver.switchTo().window(al.get(1));
		String actPN = driver.findElement(By.xpath("//input[@name='personName']")).getAttribute("value");
		String expPN="Viman July";
		
		if(actPN.equals(expPN))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		Thread.sleep(3000);
		driver.quit();
		
	}
}

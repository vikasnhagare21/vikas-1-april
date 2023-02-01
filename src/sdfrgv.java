import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sdfrgv
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.iciciprulife.com/");
		driver.findElement( By.xpath("//a[text()='Go']")).click(); // xpath by attribute 
		Thread.sleep(5000);
	    driver.findElement(By.xpath("(//input[@type='tel'])[2]")).sendKeys("7709061758"); //xpath by index for mobile number 
	}

}


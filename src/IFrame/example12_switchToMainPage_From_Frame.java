package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example12_switchToMainPage_From_Frame
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[contains(text(),'me to display')]")).click();
	}
}

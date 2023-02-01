package Web_Driver_Methods;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class practice10 {
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.iciciprulife.com/");
			driver.findElement( By.xpath("//a[@class='hp-select-btn']")).click(); // xpath by attribute 
			Thread.sleep(3000);
		    driver.findElement(By.xpath("(//span[@class='hd-txt'])[4]")).sendKeys("9823170773"); //xpath by index for mobile number 
			

	}
	
}


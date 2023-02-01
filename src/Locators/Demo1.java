package Locators;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Demo1 
	{
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			
			
			  driver.get("https://www.youtube.com/");
		        
		        Thread.sleep(4000);
		        
		        driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("mahabharat");
		        
		        Thread.sleep(4000);
		        
		        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		        
		        Thread.sleep(4000);
		        
		        driver.findElement(By.xpath("//button[@aria-label='Clear search query']")).click();
		        
		        Thread.sleep(4000);
		        
		        driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("ramayan");
		        
		        Thread.sleep(4000);
		        
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		        
		        Thread.sleep(4000);
		   
		        
		        
		}
		
		
}


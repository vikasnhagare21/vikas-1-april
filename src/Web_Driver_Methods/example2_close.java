package Web_Driver_Methods;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class example2_close
	{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		driver.get("https://www.facebook.com/");
	
		Thread.sleep(3000);
		driver.close();
		
	}
	}

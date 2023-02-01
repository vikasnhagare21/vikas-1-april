package Web_Driver_Methods;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class example5_getCurrentURL
	{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
	//	String url = driver.getCurrentUrl();
		//System.out.println(url);
		
		System.out.println(driver.getCurrentUrl());
	}
	}





package Web_Driver_Methods;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class example4_getTitle
	{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
	//	String title=driver.getTitle();
		//System.out.println(title);
		
		System.out.println(driver.getTitle());
	}
	}




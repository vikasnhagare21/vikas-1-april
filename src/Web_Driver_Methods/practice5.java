package Web_Driver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice5
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com/");
	//	try {
		//	Thread.sleep(3000);
	//	} catch (InterruptedException e) {
			// TODO Auto-generated catch block
	//		e.printStackTrace();
	//	}
		//driver.close();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.nykaa.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();


		

		
//		 Options s1 = driver.manage();
//		Window s2=s1.window();
//		s2.maximize();
	//	driver.manage().window().maximize();
		
		
		
	}
}

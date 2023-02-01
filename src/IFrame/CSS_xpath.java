package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_xpath
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input.inputtext[name=email]")).sendKeys("xyz");
		driver.findElement(By.className("_9npi")).sendKeys("pqr");
		
		driver.findElement(By.cssSelector("._6lt")).click();
		
		d
//		Thread.sleep(3000);
//		driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();
		
		
//		 Use of CSS xpath
//		# for Id  tagname# id value/#idvalue
//		. for class tagname.classvalue/.classvalue/
//		class with attribute tagname.classvalue[attributename=attributevalue]/.classvalue[attributename=attributevalue]
	}
}

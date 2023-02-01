package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example2_WithDDF 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\excel sheet for selenium use.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		String mobno = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys(mobno);
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		String pwd = sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
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
		String expPN = sh.getRow(0).getCell(2).getStringCellValue();
		
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

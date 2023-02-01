package POM2_DDF_TestNG_Base_UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_Class 
{
//	This method is use to capture screenshot on webPage.
//	need to pass 2 inputs: 1.webDriver object 2.TCID
//	Author Name:@Sanjay
	public static void captureSS(WebDriver driver,int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Automation\\selenium\\ScreenShot\\TestCaseID"+TCID+".jpg");
		FileHandler.copy(src,dest);
	}
//	This method is use to get Test Data from excel Sheet.
//	need to pass 2 inputs: 1.Rowindex 2.Cellindex. 
//	Author Name:@Sanjay
	public static String getTD(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\excel sheet for selenium use.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;
	}
//	This method is use to get Test Data from excel Sheet.
//	need to pass 3 inputs: 1.rowIndex 2.cellIndex 3.SheetName.
//	Author Name:@Vikas
	public static String getTD(int rowIndex,int cellIndex,String SheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\excel sheet for selenium use.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("SheetName");
		String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;
		
		
		
		
	}
	
}

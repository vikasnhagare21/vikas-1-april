package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
//	This method is use to caapture screenshot on webpage
//	need to pass 2 inputs:1.webdriver object 2.TCID
//	Author Name:@Vikas
	public static void captureSS(WebDriver driver,int TCID) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Automation\\selenium\\ScreenShot//"+TCID+".jpg");
		FileHandler.copy(src, dest);
	}
//	This method is use to get test data from excel sheet
//	need to pass 2 inputs:1.RowIndex 2.CellIndex
//	Author Name:@Vikas
	public static String getTD(int RowIndex,int CellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\excel sheet for selenium use.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = sh.getRow(CellIndex).getCell(CellIndex).getStringCellValue();
		return value;
	}
//	This method is use to get test data from excel sheet
//	need to pass 2 inputs:1.RowIndex 2.CellIndex 3.sheetName
//	Author Name:@Vikas
	public static String getTD(int RowIndex,int CellIndex,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\excel sheet for selenium use.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet(sheetName);
		String value = sh.getRow(CellIndex).getCell(CellIndex).getStringCellValue();
		return value;
	}
	
	
	
	
	
	
	
	

}

package POM2_DDF_BaseClass_UtilityClass_PropertyFile_FailedTestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	public static String readPFData(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\selenium\\PropertyFile.properties");
		Properties p=new Properties();
		p.load(file);
		String value = p.getProperty(key);
		return value;
	}
	public static String getTD(int RowIndex,int CellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\selenium\\TestData\\excel sheet for selenium use.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = sh.getRow(RowIndex).getCell(CellIndex).getStringCellValue();
		return value;
	}
	public static String getTD(int RowIndex,int CellIndex, String SheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\selenium\\TestData\\excel sheet for selenium use.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet(SheetName);
		String value = sh.getRow(RowIndex).getCell(CellIndex).getStringCellValue();
		return value;
	}
	
	public static void Capturess(WebDriver driver, int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\DELL\\eclipse-workspace\\selenium\\ScreenShot\\TestCase"+TCID+".jpg");
		FileHandler.copy(src, dest);
	}
	
}

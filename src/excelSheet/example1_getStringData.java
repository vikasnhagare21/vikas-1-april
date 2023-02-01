package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example1_getStringData
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\excel.xlsx");
		Workbook s1=WorkbookFactory.create(file);
		Sheet s2 = s1.getSheet("Sheet1");
		Row s3 = s2.getRow(0);
		Cell s4 = s3.getCell(0);
		String value = s4.getStringCellValue();
		System.out.println(value);
	}
}

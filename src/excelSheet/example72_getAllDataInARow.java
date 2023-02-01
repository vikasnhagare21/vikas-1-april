package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example72_getAllDataInARow 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\excel.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		int lastCellIndex = sh.getRow(2).getLastCellNum()-1;
		for(int i=0;i<=lastCellIndex;i++)
		{
			String value = sh.getRow(2).getCell(i).getStringCellValue();
			System.out.print(value);
		}
	}
}

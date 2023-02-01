package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example81_getAllDataInACell 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("D:\\excel.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		int lastRowNum = sh.getLastRowNum();
		for(int i=0;i<=lastRowNum;i++)
		{
			String value = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
		}
	}
}

package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example75_getAllDataInARow
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream file=new FileInputStream("D:\\excel.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		int LastCellIndex = sh.getRow(0).getLastCellNum()-1;
		for(int i=0;i<=LastCellIndex;i++)
		{
			String value = sh.getRow(0).getCell(i).getStringCellValue();
			System.out.print(value+" ");
		}
	}
}

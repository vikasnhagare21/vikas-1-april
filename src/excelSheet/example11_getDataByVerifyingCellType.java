package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example11_getDataByVerifyingCellType 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("D:\\excel.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		Cell cellInfo = sh.getRow(0).getCell(1);
		CellType s1 = cellInfo.getCellType();
		if(s1==CellType.STRING)
		{
			String value = cellInfo.getStringCellValue();
			System.out.println(value);
		}
		else if(s1==CellType.NUMERIC)
		{
			double value = cellInfo.getNumericCellValue();
			System.out.println(value);
		}
		else if(s1==CellType.BOOLEAN)
		{
			boolean value = cellInfo.getBooleanCellValue();
			System.out.println(value);
		}
			
	}
}

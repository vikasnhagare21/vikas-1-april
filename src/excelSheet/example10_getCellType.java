package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example10_getCellType
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream file =new FileInputStream("D:\\excel.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		CellType s1 = sh.getRow(0).getCell(2).getCellType();
		System.out.println(s1);
	}
}

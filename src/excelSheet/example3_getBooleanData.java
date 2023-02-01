package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example3_getBooleanData 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("D:\\excel.xlsx");
		boolean value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(4).getBooleanCellValue();
		System.out.println(value);
	}
}

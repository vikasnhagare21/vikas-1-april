package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example5_getColSizeInARow 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("D:\\excel.xlsx");
		short colSize = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getLastCellNum();
		System.out.println(colSize);
	}
}

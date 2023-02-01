package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example9999_getallDataInASheet
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream file=new FileInputStream("D:\\excel.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	//	for()
	}
}

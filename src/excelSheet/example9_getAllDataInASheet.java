package excelSheet;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example9_getAllDataInASheet 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream file=new FileInputStream("D:\\excel.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		int lastRowNum = sh.getLastRowNum();
		for(int i=0;i<=lastRowNum;i++)
		{
			int lastCellIndex = sh.getRow(i).getLastCellNum()-1;
			for(int j=0;j<=lastCellIndex;j++)
			{
				String value = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}
	}
}

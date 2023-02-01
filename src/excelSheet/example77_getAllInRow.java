package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example77_getAllInRow 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream file=new FileInputStream("D:\\excel.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		int lastCellIndex = sh.getRow(0).getLastCellNum()-1;
		for(int i=0;i<=lastCellIndex;i++)
		{
			Cell CellInfo = sh.getRow(0).getCell(i);
			CellType s1 = CellInfo.getCellType();
			if(s1==CellType.STRING)
			{
				System.out.println(CellInfo.getStringCellValue()+" ");
			}
			else if(s1==CellType.NUMERIC)
			{
				System.out.println(CellInfo.getNumericCellValue()+" ");
			}
			else if(s1==CellType.BOOLEAN)
			{
				System.out.println(CellInfo.getBooleanCellValue()+" ");
			}
		}
	}
}

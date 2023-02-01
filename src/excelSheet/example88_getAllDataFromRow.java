package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example88_getAllDataFromRow
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
				String value = CellInfo.getStringCellValue();
				System.out.print(value+" ");
			}
			else if(s1==CellType.NUMERIC)
			{
				double value = CellInfo.getNumericCellValue();
				System.out.print(value+" ");
			}
			else if(s1==CellType.BOOLEAN)
			{
				boolean value = CellInfo.getBooleanCellValue();
				System.out.print(value+" ");
			}
			System.out.println("----------------");
			int lastCellIndex1 = sh.getRow(1).getLastCellNum()-1;
			for(int j=0;j<=lastCellIndex1;j++)
			{
				 Cell CellInfo1 = sh.getRow(0).getCell(j);
				CellType s11 = CellInfo1.getCellType();
				if(s11==CellType.STRING)
				{
					String value = CellInfo.getStringCellValue();
					System.out.print(value+" ");
				}
				else if(s11==CellType.NUMERIC)
				{
					double value = CellInfo.getNumericCellValue();
					System.out.print(value+" ");
				}
				else if(s11==CellType.BOOLEAN)
				{
					boolean value = CellInfo.getBooleanCellValue();
					System.out.print(value+" ");
				}
				

			
		}
	}
	}
}
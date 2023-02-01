package excelSheet;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetAllDataFromExel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	    FileInputStream file=new FileInputStream("D:\\excel.xlsx");
	    
	    Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");

	    int LastRowIndex = sh.getLastRowNum();

	    for(int i=0;i<=LastRowIndex;i++)
	    {
	    	int LastCellIndex = sh.getRow(i).getLastCellNum()-1;
	    	
	    	for(int j=0;j<=LastCellIndex;j++)
	    	{
	    		Cell CellInfo = sh.getRow(i).getCell(j);
	    		CellType s1 = CellInfo.getCellType();
	    		if(s1==CellType.STRING)
	    		{
	    			String value = CellInfo.getStringCellValue();
	    			System.out.print(value+" ");
	    		}
	    		else if (s1==CellType.NUMERIC)
	    		{
	    			double value = CellInfo.getNumericCellValue();
	    			System.out.print(value+" ");
				}
	    		else if (s1==CellType.BOOLEAN)
	    		{
	    			boolean value = CellInfo.getBooleanCellValue();
	    			System.out.print(value+" ");
				}
	    		
	    	}
	    	System.out.println();
	    	
	    }
	}

}

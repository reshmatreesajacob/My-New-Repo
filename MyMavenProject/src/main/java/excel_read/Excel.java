package excel_read;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel 
{
	XSSFSheet sh;
	
	public Excel() throws IOException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\RESHMA\\Desktop\\Reshma\\Excel\\Excel_file.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(f);
		sh=wb.getSheet("Course");
	}
	
	public String readData(int i ,int j)
	{
		Row r=sh.getRow(i);
		Cell c=r.getCell(j);
		int celltype=c.getCellType(); //0-numeric,1-String
		switch(celltype)
		{
		case Cell.CELL_TYPE_NUMERIC:
		  {
			  double d= c.getNumericCellValue();
			  return String.valueOf(d);
		  }
		case Cell.CELL_TYPE_STRING:
		  {
			return c.getStringCellValue();
		  }
		}
		return null;
	}

}

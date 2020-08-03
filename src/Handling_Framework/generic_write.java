package Handling_Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class generic_write 
{
	public static void writedata(int row,String data) throws Exception
	{
		FileInputStream fis=new FileInputStream("./Excel/DataDrivenTesting.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row r = sh.createRow(row);
		Cell c = r.createCell(0);
		c.setCellValue(data);
		//permission
		FileOutputStream fos=new FileOutputStream("./Excel/DataDrivenTesting.xlsx");
		wb.write(fos);
	}
}

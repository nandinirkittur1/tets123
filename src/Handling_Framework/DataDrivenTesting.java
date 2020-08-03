package Handling_Framework;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenTesting 
{
	public static void main(String [] args) throws Exception
	{
		//1-Specify the path of the excel sheet (./Excel/data.xlsx)		
		FileInputStream fis=new FileInputStream("./Excel/DataDrivenTesting.xlsx");
		//2 - Open the Excel file(Spread sheet /Workbook)
		Workbook wb= WorkbookFactory.create(fis);
		//3-go to sheet (Sheet name - sheet1)
		Sheet sh = wb.getSheet("Sheet1");
		//4- go to row(0)
		Row r=sh.getRow(0);
		//5- go to cell(0)
		Cell c=r.getCell(0);
		//6- fetch the data from the cell (String data)
		//String data=c.getStringCellValue();
		//System.out.println(data);
		//all type of data
		String data=c.toString();
		System.out.println(data);
		//convert string to integer
		//int n=Integer.parseInt(d);
		//System.out.println(n);
	}
}

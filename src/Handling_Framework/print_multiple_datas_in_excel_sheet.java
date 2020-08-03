package Handling_Framework;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class print_multiple_datas_in_excel_sheet 
{
	public static void main(String [] args) throws Exception
	{
		//1-Specify the path of the excel sheet (./Excel/data.xlsx)		
		FileInputStream fis=new FileInputStream("./Excel/DataDrivenTesting.xlsx");
		//2 - Open the Excel file(Spread sheet /Workbook)
		Workbook wb= WorkbookFactory.create(fis);
		//3-go to sheet (Sheet name - sheet1)
		Sheet sh = wb.getSheet("Sheet1");
		//row count
		int row=sh.getLastRowNum();
		//System.out.println(row);//row count
		
		for(int i=0;i<=row;i++)
		{
			//4- go to row(0)
			Row r=sh.getRow(i);
			short cell = r.getLastCellNum();
			System.out.println(cell);
			for (int j=0;j<cell;j++)
			{
				//5- go to cell(0)
				Cell c=r.getCell(j);
				//all type of data
				String data=c.toString();
				System.out.print(data);
			}
			System.out.println();
		}
		
		
		
	}
}

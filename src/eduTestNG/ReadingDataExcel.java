package eduTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	FileInputStream file = new FileInputStream("E:\\Selenium_1\\Selenium Project\\LoginData.xlsx");
	
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	
	int rows = sheet.getLastRowNum();
	
	int columns = sheet.getRow(1).getLastCellNum();
	
	System.out.println("No. of rows are  " +rows);	//4 rows
	
	System.out.println("No. of columns are  " +columns);	//2 columns
	
	for(int i = 1; i <= rows; i++)
	{
		XSSFRow row = sheet.getRow(i);
				
		for(int j = 0; j < columns; j++)
		{
			XSSFCell cell = row.getCell(j);
			
			String cellValue = cell.getStringCellValue();
			
			System.out.print(cellValue +"  ");
		}
		
		System.out.println();
	}
	
	
		
		
		
	}

}

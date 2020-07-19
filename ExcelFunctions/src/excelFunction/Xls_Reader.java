package excelFunction;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader {

	//Path is common throughout the function
	
	public String getCellData(String path,String sheetname ,int rowNum, int colNum) throws IOException 
	{
		
FileInputStream file= new FileInputStream(path);
		
		XSSFWorkbook wb= new XSSFWorkbook(file); //Workbook		
		
		XSSFSheet sheet=wb.getSheet(sheetname); //Sheet
				
		int rows=sheet.getPhysicalNumberOfRows();
		System.out.println(rows);
		
		XSSFRow row=sheet.getRow(rowNum);		
		
		int cols=row.getLastCellNum();
		System.out.println(cols);
		
		XSSFCell cell=row.getCell(colNum);
		
		String data=cell.getStringCellValue();
		
		return data;
	    
	}
}

package SE_44_FC_POI_API;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcelSheetXLSX {

	public static void main(String[] args) throws IOException   {
		
		String filepath="src/test/java//SE_44_FC_POI_API//ExcelXLSX.xlsx";
		
		File excelfile=new File(filepath);
		
		FileInputStream fis=new FileInputStream(excelfile);
		
		Workbook workbook;   //Workbook is a interface and HSSFworkbook and XSSFworkbook are child-class of workbook
		
		if (filepath.endsWith(".xls"))
		{
			workbook=new HSSFWorkbook(fis);
		}else 
		{
			 workbook=new XSSFWorkbook(fis);
		}
		
		Sheet sheet=workbook.getSheetAt(0);
		Row row=sheet.getRow(0);
		Cell cell=row.getCell(0);
		String cellvalue=cell.getStringCellValue();
		
		System.out.println(cellvalue);
		
		workbook.close();
		
		/*
		HSSFWorkbook workbook=new HSSFWorkbook(fis);
		
		HSSFSheet sheet=workbook.getSheetAt(0);
		
		HSSFRow row=sheet.getRow(3);
		
		HSSFCell cell=row.getCell(2);
		
		String cellvalue=cell.getStringCellValue();
		
		System.out.println(cellvalue);
		*/
	}
}

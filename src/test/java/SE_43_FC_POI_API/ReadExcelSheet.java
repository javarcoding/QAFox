package SE_43_FC_POI_API;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcelSheet {

	public static void main(String[] args) throws IOException {
		
		File file=new File("src/test/java//SE_43_FC_POI_API//ExcelXLS.xls");
		
		FileInputStream fis=new FileInputStream(file);
		
		HSSFWorkbook workbook=new HSSFWorkbook(fis);
		
		HSSFSheet sheet=workbook.getSheetAt(0);
		
		HSSFRow row=sheet.getRow(3);
		
		HSSFCell cell=row.getCell(2);
		
		String cellvalue=cell.getStringCellValue();
		
		System.out.println(cellvalue);
		
	}
}

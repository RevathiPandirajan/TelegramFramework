package FileUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class ExcelUtility {
	public static String getCellData() throws Exception	{
		FileInputStream fis=new FileInputStream("./src/test/resources/Products.xlsx");
		 Workbook book=WorkbookFactory.create(fis);
		 Sheet sheet=book.getSheet("register");
		 Row row = sheet.getRow(5);
		 Cell cell = row.getcell(0);
		 String value =cell.getStringCellValue();
		 System.out.println(value);
		 return value;
	
		 
	}
 public static void main(String[] args) throws Exception {
	getCellData();
}
}

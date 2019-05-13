package week5day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook input = new XSSFWorkbook("./data/loading.xlsx");
		
		//open sheet
		XSSFSheet sheet = input.getSheetAt(0);
		
		//last used row count
		int lastRowNum = sheet.getLastRowNum();
		
		//last used Column count
		int num = sheet.getRow(0).getLastCellNum();
		
		
		
		for (int i = 1; i <= lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			
			for (int k = 0; k < num; k++) {
				XSSFCell cell = row.getCell(k);
				
				String stringCellValue = cell.getStringCellValue();
				
				System.out.println(stringCellValue);
			}
		}
		
		

	}

}

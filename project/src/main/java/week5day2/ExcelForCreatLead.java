package week5day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelForCreatLead {

	//Array declaration
	public String[][] ExcelForCreat(String loading) throws IOException {
		
		XSSFWorkbook input = new XSSFWorkbook("./data/loading.xlsx");
		
		XSSFSheet sheet = input.getSheetAt(0);
	
		
		int row = sheet.getLastRowNum();
		
		int cell = sheet.getRow(0).getLastCellNum();
		
		
		//adding row for array declaration
		String[][] data = new String[row][cell];
		
		for (int i = 1 ; i <= row; i++) {
			XSSFRow rowout = sheet.getRow(i);
			
			for (int j = 0; j < cell; j++) {
				XSSFCell cellout = rowout.getCell(j);
				
				/*String value = cellout.getStringCellValue();
				System.out.println(value);*/
				
				//declaring output as array
				data[i-1][j]= cellout.getStringCellValue();
			}
			
			
		}
		
		//return value
		return data;
		
	
		

	}

}

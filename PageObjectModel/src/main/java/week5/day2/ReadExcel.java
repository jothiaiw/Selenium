package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public String[][] readExcel(String fileName) throws IOException {
		//open workbook
		XSSFWorkbook wB = new XSSFWorkbook("./data/"+fileName+".xlsx");
		//open sheet
		XSSFSheet sheet = wB.getSheet("Sheet1");
		//last used row count
		int rowCount = sheet.getLastRowNum();
		//last used Column count
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[rowCount][columnCount];		
		//for rows
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			//for column
			for (int j = 0; j < columnCount; j++) {
				//go to cell
				XSSFCell cell = row.getCell(j);
				//read data from cell in string
				data[i-1][j]=cell.getStringCellValue();
			}
		}
		return data;
	}
	
}









/*String name = "";
				switch(cell.getCellType()) {
				case STRING:   name = cell.getStringCellValue();
				break;
				case NUMERIC:   name = ""+(int)cell.getNumericCellValue();
				break;
				case BLANK:   name = "";
				break;
				}		*/		
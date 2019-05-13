package testNGLearning;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelInput {

	public String[][] exinput() throws IOException{
		
	XSSFWorkbook inp = new XSSFWorkbook("./data/Input.xlsx");
	
	XSSFSheet sheetinput = inp.getSheetAt(0);
	
	int row = sheetinput.getLastRowNum();
	
	int col = sheetinput.getRow(0).getLastCellNum();
	
	String[][] edata = new String[row][col];
	
	
	for(int i=1; i <= col; i++)
		
	{
		
   XSSFRow inrow = sheetinput.getRow(i);
   
   
   for (int j=i-1; j < col; j++)
	   
   {
   XSSFCell incell = inrow.getCell(j);

   edata[i-1][j]= incell.getStringCellValue();
   
   }
   
	}
	
	return edata;
}	
	
}



package dataProvider;


import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Dpmainfunction {

	@DataProvider
	public String[][] exinput() throws IOException {
		
		XSSFWorkbook ename = new XSSFWorkbook("./data/Input.xlsx");
		
        XSSFSheet sname = ename.getSheetAt(0);
        
        int row = sname.getLastRowNum();
        int col = sname.getRow(0).getLastCellNum();
        
        String[][] exdata = new String[row][col];
         
       for (int i = 1; i <= row; i++) {
		
    	   XSSFRow erow = sname.getRow(i);
    	   
    	   
    	   for (int j = 0; j < col; j++) {
    		   
    		   XSSFCell ecell =erow.getCell(j);
    		   
    		   exdata[i-1][j] = ecell.getStringCellValue();
    		  
    		
		}
	}
	return exdata;
	
        
}
}
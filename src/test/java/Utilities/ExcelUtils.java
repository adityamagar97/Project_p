package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelUtils {
    
	
	
	
    @DataProvider(name = "loginData")
    public static Object[][] getData() throws IOException {

    	DataFormatter df = new DataFormatter();
    	FileInputStream file = new FileInputStream("/Users/adityamagar/Desktop/TNS /sheetingg.xlsx");
    	XSSFWorkbook workbook = new XSSFWorkbook(file);
    	XSSFSheet sheet = workbook.getSheet("Adi");

    	int getrow = sheet.getLastRowNum();
    	int getcol = sheet.getRow(0).getLastCellNum();
    	//array of object initialisation 
    	Object obj[][] = new Object[getrow][getcol];	
    	for(int i=0;i<getrow;i++) {
    		
    		XSSFRow rows = sheet.getRow(i+1); 
    		
    		
    		for(int j=0;j<getcol;j++) {
    		
    			XSSFCell cello = rows.getCell(j);
    			obj[i][j] = df.formatCellValue(cello);
    			
    		}
    	}
    	return obj;
    	
    
    	}
    
}
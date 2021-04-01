package com.Mcd.qa.TestCases;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {
	
	public static void main(String[] args) throws Exception {
		

	

	
	FileInputStream fis = new FileInputStream("C:\\Users\\vpkumar\\Desktop\\praveen.xlsx");
	Workbook wb = new XSSFWorkbook(fis);
	Sheet sh = wb.getSheet("Sheet1");
	int rowCount = sh.getLastRowNum()- sh.getFirstRowNum();
	    for (int i = 0; i < rowCount+1; i++) {
	        Row row = sh.getRow(i);
	       // System.out.println(row);
	     //   for (int j = 0; j <=0; j++) {
	         String prodid = row.getCell(i).getStringCellValue();

	         
	         FileOutputStream fos = new FileOutputStream("C:\\Users\\vpkumar\\Desktop\\kumar.xlsx");
	         Cell cell = row.createCell(i);
	         cell.setCellValue(prodid);
	         wb.write(fos);
	         
	        }

	    
} 


}











	
	
	
	
	
	



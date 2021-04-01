package com.McD.qa.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xlsreaderpraveen {

	
	public static void main(String arg[]) throws IOException{

	File src = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\McD\\qa\\TestData\\generalenquire.xls");
	FileInputStream fis = new FileInputStream(src);	
	 XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet Sheet= wb.getSheetAt(0);
	/*String data=Sheet.getRow(0).getCell(0).getStringCellValue();
	System.out.println(data);*/
	
	int rowcount=Sheet.getLastRowNum();
	System.out.println("row count-->"+rowcount);
	
	for(int i=0; i<rowcount; i++) {
		
		String dat1= Sheet.getRow(i).getCell(0).getStringCellValue();
		System.out.println("data--->w"+dat1);
		
		
	}
	 
}
		
		
	




}

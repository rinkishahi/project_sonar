package com.McD.qa.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import com.McD.qa.Pages.Basepage;


public class TestUtil {
	
	XSSFWorkbook wb;
	XSSFSheet Sheet;
	File src=null;

	
	public   TestUtil(String exceptath) {
		
		try {
			 src = new File(exceptath);
			 FileInputStream fis = new FileInputStream(src);	
			
			 wb = new XSSFWorkbook(fis);
			 Sheet= wb.getSheetAt(0);
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
	
	public String getData(int sheetnum, int row, int colum) {
		
		Sheet=wb.getSheetAt(sheetnum);
		String data=Sheet.getRow(row).getCell(colum).getStringCellValue();
		return data;
		
	}

	public void getCellpass(int sheetnum, int row, int colum) throws IOException {
		FileOutputStream fos= new FileOutputStream(src);
	   Sheet=wb.getSheetAt(sheetnum);
	   Sheet.getRow(row).createCell(colum).setCellValue("PASS");
		
	    	wb.write(fos);
	    	fos.flush();
	}
	public void getcellfail(int sheetnum, int row, int colum) throws IOException {
		FileOutputStream fos= new FileOutputStream(src);
	   Sheet=wb.getSheetAt(sheetnum);
	   Sheet.getRow(row).createCell(colum).setCellValue("FAIL");
		
	    	wb.write(fos);
	    	fos.flush();
	}
	
	
public static void main(String[] args) throws IOException {
	
	

	}
	
	

}

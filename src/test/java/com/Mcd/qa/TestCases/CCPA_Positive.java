package com.Mcd.qa.TestCases;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.McD.qa.Base.BaseTest;
import com.McD.qa.Extentreport.Extentreport;
import com.McD.qa.Pages.Basepage;
import com.McD.qa.Pages.CCPA_Rights_Center_Page;
import com.McD.qa.Utility.TestUtil;

public class CCPA_Positive extends BaseTest{
	
	String excelpath=System.getProperty("user.dir");
    TestUtil Excelreader= new TestUtil(excelpath+ "/src/main/java/com/McD/qa/TestData/CCPA_Rights_Center.xls");
   
   	
   
   	@Test(priority=1)
   	public void Open_URL_CCPA() throws Exception {
    	CCPA_Rights_Center_Page page= new CCPA_Rights_Center_Page(driver);
   			 test=extent.createTest("Open_URL_CCPA");
   			    
   		
   			    	driver.get(Basepage.readProperty("urlccpa"));
   			    	
   			    	
   			    	
   			    	driver.findElement(By.xpath("//html/body/div[1]/div[1]/div/button")).click();
   			    	
   			    	driver.findElement(By.xpath("//html/body/header/nav/div[2]/div/div[2]/div[1]/ul/li[3]/a")).click();
   			    	
   			    	
   			    	
   			    	
   			    	
   			    	
   			    	
   			    	/*Alert alert = driver.switchTo().alert(); 
   			     String alertMessage= driver.switchTo().alert().getText();
   			     System.out.println(alertMessage);
   			    	alert.accept();*/
   			    	//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
   			    	//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
   			   //Switch to current selected tab's content.
   			 //  driver.switchTo().defaultContent();
   			    	driver.findElement(By.xpath("//*[@id='ccpaFname']")).sendKeys("Praveen");
   			    	driver.findElement(By.xpath("//*[@id='ccpaLname']")).sendKeys("kumar");
   			    	driver.findElement(By.xpath("//*[@id='ccpaEmail']")).sendKeys("prawinvangala@gmail.com");
   			    	driver.findElement(By.xpath("//*[@id='ccpaConfirmEmail']")).sendKeys("prawinvangala@gmail.com");
   			    	driver.findElement(By.xpath("//*[@id='ccpaStateSelectDesktop']")).click();
   			    	driver.findElement(By.xpath("//*[@id='ccpa-personalinfo-state-1']")).click();
   			    	driver.findElement(By.xpath("//*[@id='reqPermission']/div[2]/div[1]/label/span[2]")).click();
   			    	driver.findElement(By.xpath("//*[@id='ccpaSubmit']")).click();
   					
   					
   			    
   			    
   			    
   			    
   			    
    		}		
	
	
	
	
	
	

}

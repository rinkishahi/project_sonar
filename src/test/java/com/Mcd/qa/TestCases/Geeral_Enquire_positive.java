package com.Mcd.qa.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.Test;

import com.McD.qa.Base.BaseTest;
import com.McD.qa.Pages.Basepage;
import com.McD.qa.Pages.General_Inqure_Page;
import com.McD.qa.Utility.TestUtil;

public class Geeral_Enquire_positive extends BaseTest {
	General_Inqure_Page page= new General_Inqure_Page(driver);
	String excelptha=System.getProperty("user.dir");
	TestUtil Excelreader= new TestUtil(excelptha+ "/src/main/java/com/McD/qa/TestData/generalenquire.xls"); 
	
	
	@Test(priority=1)
	public void Open_URL_positive() throws Exception {
		General_Inqure_Page page= new General_Inqure_Page(driver);	
			 test=extent.createTest("Open_URL_positive");
			 driver.get(Basepage.readProperty("urlG"));	 
			 test.pass("TC:1 URL IS OPENED");
// CLICK ON 'PLEASE SELECT ANY ONE OPTION'		 
			driver.findElement(By.xpath("//*[@id='select-option']")).click();
			 driver.findElement(By.xpath("//*[@id='issuetype-catdd-1']")).click();
			 driver.findElement(By.xpath("//*[@id='enter_comments']")).sendKeys("commets");
			 driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys("praveen");
			 driver.findElement(By.xpath("//*[@id='last_name']")).sendKeys("kumar");
			 driver.findElement(By.xpath("//*[@id='address']")).sendKeys("kurnool");
			 driver.findElement(By.xpath("//*[@id='apt_suit']")).sendKeys("suite");
			 driver.findElement(By.xpath("//*[@id='city']")).sendKeys("tangatur");
			 driver.findElement(By.xpath("//*[@id='state']")).click();
			 driver.findElement(By.xpath("//*[@id='personalinfo-state-0']")).click();
			 driver.findElement(By.xpath("//*[@id='zip']")).sendKeys("12345");
			 driver.findElement(By.xpath("//*[@id='email']")).sendKeys("v-praveen.kumar@capgemini.com");
			 driver.findElement(By.xpath("//*[@id='confirm_email']")).sendKeys("v-praveen.kumar@capgemini.com");
			 driver.findElement(By.xpath("//*[@id='phone_number']")).sendKeys("(924) 792-1500");
			 driver.findElement(By.xpath("//*[@id='submit_form']")).click();
			 test.pass("TC:2 submit button is working fine");
			 driver.close();
	}

	
	
	

}

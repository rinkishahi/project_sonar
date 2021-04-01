/*package com.Mcd.qa.TestCases;

import java.io.IOException;
import org.testng.annotations.Test;

import com.McD.qa.Base.BaseTest;
import com.McD.qa.Extentreport.Extentreport;
import com.McD.qa.Pages.Basepage;
import com.McD.qa.Pages.General_Inqure_Page;
import com.McD.qa.Utility.TestUtil;



public class Genaral_enquire  extends BaseTest{

	TestUtil genr= new TestUtil(System.getProperty("user.dir")+"\\src\\main\\java\\com\\McD\\qa\\TestData\\generalenquire.xls");
	@Test(priority=1)
	public void generalEnquirey() throws Exception  { 
		 test=extent.createTest("generalEnquirey");
	    try {
			driver.get(Basepage.readProperty("url"));
			test.pass("url is  opened");
	    }catch (Exception e) {
	    	test.fail("url is not opened");
		}

	}
	 @Test(priority=2)
	public void Genaral_havlabel() throws Exception{
		 test=extent.createTest("Genaral_havlabel");
		 General_Inqure_Page page= new General_Inqure_Page(driver);
		String generalhead=  page.getgeneralinquirylabel();
    	String generalexcel=	genr.getData(0, 1, 1);
		System.out.println(generalexcel);
		if(generalhead.equals(generalexcel))
		{
			test.pass("Lable of general_Inquire is displayed");
		}else {
			test.fail(" Lable of general_Inquire is not displayed");
			test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Genaral_enquire"))+ "Genaral enquire label is not display");
			System.out.println("Lable of general_Inquire is displayed---fail");
		}
		
	}

	 @Test(priority=3)
	public void pickdifftopick() {
		 test=extent.createTest("pickdifftopick");
		 General_Inqure_Page page= new General_Inqure_Page(driver);
		String lPDT=page.labepickdiftopic();
		if(lPDT.equals("Pick a different topic")) {
			test.pass("Pick Defferent topic Label is displayed");
		}else {
			test.fail("Pick Defferent topic Label is displayed");
		}
	//click on dropdown of pick diftopic
		page.clicktopick();
		test.pass("user able to click dropdown of different topic");
		page.seletUSFAQs();
		test.pass("user able to select dropdown of different topic");
		page.gobutton();
		driver.navigate().back();
	}
	 
 // FIRST NAME 	 
	 @Test(priority=4)
	 public void  first_name() throws IOException {
		 test=extent.createTest("first_name");
		 General_Inqure_Page page= new General_Inqure_Page(driver);
	// enter positive values only
		 try {
		 String fname=genr.getData(0, 2, 1);
		 page.firstnameM(fname);
		 test.pass("user able to enter value in firstname textbox");
		 genr.getCellpass(0, 2, 4);
		 }catch (Exception e) {
			genr.getcellfail(0, 2, 4);
			test.fail("user not able to enter value in firstname textbox");
		}
	//enter more than 25 characters 	
		 try {
		 page.fnameclear();
		 String fname1=genr.getData(0, 3, 1);
		 page.firstnameM(fname1);
		 genr.getCellpass(0, 3, 4);
		 test.pass("user not able to enter more than 25 characters in firstname textbox");
		// test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "firstName"))+ "user not able to enter more than 25 characters in firstname textbox");
		
		
		 String finamevalue1= page.finamevalue();
		System.out.println("agter enter first name values---"+finamevalue1);
		 if(fname1.equals(finamevalue1)) {
			 genr.getcellfail(0, 3, 4);
		 }else {
			 genr.getCellpass(0, 3, 4); 
		 }
		 }catch (Exception e) {
			 genr.getcellfail(0, 3, 4);
			 test.fail("user able to enter more than 25 characters in firstname textbox");
		}
// enter numerical 	 
		 try {
			 page.fnameclear();
			 String fname2=genr.getData(0, 4, 1);
			 page.firstnameM(fname2);
			 genr.getcellfail(0, 4, 4);
			 test.fail("user able to enter numerical value in firstname textbox");
			 }catch (Exception e) {
				 genr.getCellpass(0, 4, 4);
				 test.pass("user not able to enter numerical value in firstname textbox");
			}
		 
 
	//click on submit and catch error message
		
			 page.fnameclear();
			 try {
			 page.submitGEQ(); //click submit button
			 test.pass("Submit button is working fine and enable");
			 }catch (Exception e) {
				 test.fail("Submit button is not working fine and enable");
			}
			 try {
				 page.scrollto(); //scroll down or up
		String finameeror1=page.firstnameerror();
		test.pass("FIRST NAME FUNCTION ERROR MESSAGE---"+finameeror1);
		String exfinamerror2=genr.getData(0, 5, 1);
		if(finameeror1.equals(exfinamerror2)) {
			genr.getCellpass(0, 5, 4);
			test.pass("FIRST NAME FUNCTION ERROR MESSAGE is diplayed");
		}else {
			genr.getcellfail(0, 5, 4);
			test.fail("FIRST NAME FUNCTION ERROR MESSAGE is diplayed");
		}
		 }catch (Exception e) {
			 genr.getcellfail(0, 5, 4);
			 test.fail("FIRST NAME FUNCTION ERROR MESSAGE");
		}
		 
	 }


}
*/
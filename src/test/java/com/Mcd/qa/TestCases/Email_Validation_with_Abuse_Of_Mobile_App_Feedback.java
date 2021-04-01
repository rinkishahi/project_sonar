package com.Mcd.qa.TestCases;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.McD.qa.Base.BaseTest;
import com.McD.qa.Extentreport.Extentreport;
import com.McD.qa.Pages.Basepage;
import com.McD.qa.Pages.Email_Validation_With_Abuse_Of_Mobile_App_Feedback_Page;
import com.McD.qa.Utility.TestUtil;

public class Email_Validation_with_Abuse_Of_Mobile_App_Feedback extends BaseTest {

	String excelpath = System.getProperty("user.dir");
	TestUtil Excelreader = new TestUtil(
			excelpath + "/src/main/java/com/McD/qa/TestData/Email_validation_Mobile_App_feedback.xls");

	@Test(priority = 1)
	public void Open_URL_Email_Validation_GI() throws Exception {
		FileInputStream fis = new FileInputStream(
				excelpath + "\\src\\main\\java\\com\\McD\\qa\\TestData\\Email_validation_Mobile_App_feedback.xls");
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rowCount = sh.getLastRowNum() - sh.getFirstRowNum();
		for (int i = 1; i < rowCount + 1; i++) {
			Row row = sh.getRow(i);
			for (int j = 0; j <= 0; j++) {
				String MAKeyword = row.getCell(j).getStringCellValue();
				Thread.sleep(1000);
				Email_Validation_With_Abuse_Of_Mobile_App_Feedback_Page page = new Email_Validation_With_Abuse_Of_Mobile_App_Feedback_Page(
						driver);
				test = extent.createTest("Open_URL_Email_Validation_GI");
				try {
					driver.get(Basepage.readProperty("urlB"));
					driver.navigate().refresh();
					String gettitle = page.generallgetpagetitlemethod();
					String gettitleexcel = Excelreader.getData(0, 1, 1);
					if (gettitle.equals(gettitleexcel)) {
						test.pass("TC:1 URL OF MOBILE APP FEEDBACK IS OPENED");
					} else {
						test.fail("TC:1 URL OF MOBILE APP FEEDBACK IS NOT OPENED");
						test.fail(test
								.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
										"Email_Validation_with_Abuse_Of_Mobile_App_Feedback"))
								+ "URL OF MOBILE APP FEEDBACK IS NOT OPENED");
						extent.flush();
						driver.close();
						throw new SkipException("Skipping - ");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				Thread.sleep(4000);
				try {
                driver.findElement(By.xpath("//html/body/div[1]/div[1]/div/button")).click();
				}catch (Exception e) {
					
				}
				// mobile device type DROP DOWN
				try {
					String mobiledevicetypdropdownvalhead = page.mobiledevicetypeclickable();
					String mobiledevicetypdropdownvalexcel = Excelreader.getData(0, 2, 1);
					if (mobiledevicetypdropdownvalhead.equals(mobiledevicetypdropdownvalexcel)) {
						test.pass("TC:2 MOBILE DEVICE TYPE DROP DOWN IS WORKING");
					} else {
						test.fail("TC:2  MOBILE DEVICE TYPE DROP DOWN IS NOT WORKING");
						test.fail(test
								.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
										"Email_Validation_with_Abuse_Of_Mobile_App_Feedback"))
								+ "MOBILE DEVICE TYPE DROP DOWN IS NOT WORKING");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// mobile operation system clickable
				try {
					String mobileoperationsytemdropdownvalhead = page.googleandroiddropdownvaluemethod();
					String mobileoperationsytemdropdownvalexcel = Excelreader.getData(0, 3, 1);
					if (mobileoperationsytemdropdownvalhead.equals(mobileoperationsytemdropdownvalexcel)) {
						test.pass("TC:3 MOBILE OPERATION SYSTEM DROP DOWN IS WORKING");
					} else {
						test.fail("TC:3  MOBILE OPERATION SYSTEM DROP DOWN IS NOT WORKING");
						test.fail(test
								.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
										"Email_Validation_with_Abuse_Of_Mobile_App_Feedback"))
								+ "MOBILE OPERATION SYSTEM DROP DOWN IS NOT WORKING");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// send character and numerical
				try {
					String mobileappversioncharnumaeriexcel = Excelreader.getData(0, 4, 1);
					String mobileversendedvalhead = page.mobileversionsendmethod(mobileappversioncharnumaeriexcel);
					if (mobileversendedvalhead.equals(mobileappversioncharnumaeriexcel)) {
						test.pass("TC:4 USER SHOULD  BE SEND NUMERICAL AND CHARACTER ON MOBILE APP VERSION");

					} else {
						test.fail("TC:4 USER SHOULD  BE SEND NUMERICAL AND CHARACTER ON MOBILE APP VERSION");
						test.fail(test
								.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
										"Email_Validation_with_Abuse_Of_Mobile_App_Feedback"))
								+ "USER SHOULD  BE SEND NUMERICAL AND CHARACTER ON MOBILE APP VERSION");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// Enter your comments
				try {
					page.commentspecialchaructermethod(MAKeyword);
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// CHARACTERS VALUES IN FIRST NAME FUNCTION
				try {
					String firstnamesendvalexcel = Excelreader.getData(0, 5, 1);
					String sendedvalhead = page.finameEnteredvalue(firstnamesendvalexcel);
					if (sendedvalhead.equals(firstnamesendvalexcel)) {
						test.pass("TC:5  USE SHOULD  BE SEND CHARACTERS  IN FIRSTNAME TEXTBOX");
					} else {
						test.fail("TC:5  USE SHOULD BE SEND CHARACTERS IN FIRSTNAME TEXTBOX");
						test.fail(test
								.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
										"Email_Validation_with_Abuse_Of_Mobile_App_Feedback"))
								+ "USE SHOULD  BE SEND CHARACTERS IN FIRSTNAME TEXTBOX");
					}
				} catch (Exception e) {

					test.fail("Error:" + e.getMessage());
				}
				// CHARACTERS IN LAST NAME FUNCTION

				try {
					String LNSPECIALCHARACTER = Excelreader.getData(0, 6, 1);
					String LAscvalue = page.lastnameenterdvalue(LNSPECIALCHARACTER);
					if (LAscvalue.equals(LNSPECIALCHARACTER)) {
						test.pass("TC:6 USER SHOULD BE SEND CHARACTERS IN LASTNAME TEXTBOX");
					} else {
						test.fail("TC:6 USER SHOULD BE SEND CHARACTERS IN LASTNAME TEXTBOX");
						test.fail(test
								.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
										"Email_Validation_with_Abuse_Of_Mobile_App_Feedback"))
								+ "USER SHOULD  BE SEND CHARACTERS IN LASTNAME TEXTBOX");
					}
				} catch (Exception e) {

					test.fail("Error:" + e.getMessage());
				}
		// SEND WITH MAIL FORMAT
				try {
					String emailsendid = Excelreader.getData(0, 7, 1);
					String emailvlue = page.emailenteredvalue(emailsendid);
					if (emailvlue.equals(emailsendid)) {
						test.pass("TC:7  USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");

					} else {
						test.fail("TC:7 USER SHOULD SEND MAIL FORMAT IN MAIL TEXTBOX");
						test.fail(test
								.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
										"Email_Validation_with_Abuse_Of_Mobile_App_Feedback"))
								+ "USER SHOULD SEND MAIL FORMAT IN MAIL TEXTBOX");
					}

				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// send DIFFERENT IDS IN mail AND CONFIRM
				try {
					String confirmmailsend = Excelreader.getData(0, 8, 1);
					String conmailsendvalue = page.confirmmailenteredvalue(confirmmailsend);
					if (conmailsendvalue.equals(confirmmailsend)) {
						test.pass("TC:8  USER SHOULD SEND MAIL IN CONFIRM MAIL TEXTBOX");
					} else {
						test.fail("TC:8 USER SHOULD SEND MAIL IN CONFIRM MAIL TEXTBOX");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Email_Validation_with_Abuse_Of_Mobile_App_Feedback"))
								+ "USER SHOULD SEND MAIL IN CONFIRM MAIL TEXTBOX");
					}

				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}			
		// ENTER 10 NUMERICAL
				try {
					String phonecharacterhead = Excelreader.getData(0, 9, 1);
					String phonenumCenteredval = page.phonenumberenteredvalue(phonecharacterhead);
					if (phonenumCenteredval.equals(phonecharacterhead)) {
						test.pass("TC:9 USER SHOULD  SEND 10 NUMERICAL IN PHONE NUMBER TEXTBOX ");
					} else {
						test.fail("TC:9 USER SHOULD  SEND 10 NUMERICAL IN PHONE NUMBER TEXTBOX ");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Email_Validation_with_Abuse_Of_Mobile_App_Feedback"))
								+ "USER SHOULD SEND 10 NUMERICAL IN PHONE NUMBER TEXTBOX ");
					}

				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}		
				String gettitle1 = page.sumitmethod();
				String gettitleexcel1 = Excelreader.getData(0, 10, 1);
				if (gettitle1.equals(gettitleexcel1)) {
					test.pass("TC:10 SUBMITED IS SUCCESSFUL");
				} else {
					test.fail("TC:10 SUBMITED IS SUCCESSFUL");
					test.fail(test.addScreenCaptureFromPath(
							Extentreport.getScreenshot(driver, "Email_Validation_with_Abuse_Of_Mobile_App_Feedback"))
							+ "SUBMITED IS SUCCESSFUL");
				}
				/*driver.close();
				Thread.sleep(1000);
				driver = new ChromeDriver();
				Thread.sleep(1000);
				driver.manage().window().maximize();*/
			}
		}

	}

}

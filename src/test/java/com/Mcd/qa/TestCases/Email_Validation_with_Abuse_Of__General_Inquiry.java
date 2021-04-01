package com.Mcd.qa.TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

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
import com.McD.qa.Pages.Email_Validation_With_Abuse_Of_General_Inquiry_Page;
import com.McD.qa.Utility.TestUtil;

public class Email_Validation_with_Abuse_Of__General_Inquiry extends BaseTest {

	String excelpath = System.getProperty("user.dir");
	TestUtil Excelreader = new TestUtil(
			excelpath + "/src/main/java/com/McD/qa/TestData/Email_validation_General_Inquiry.xls");

	@Test(priority = 1)
	public void Open_URL_Email_Validation_GI() throws Exception {
		FileInputStream fis = new FileInputStream(
				excelpath + "\\src\\main\\java\\com\\McD\\qa\\TestData\\Email_validation_General_Inquiry.xls");
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rowCount = sh.getLastRowNum() - sh.getFirstRowNum();
		for (int i = 1; i < rowCount + 1; i++) {
			Row row = sh.getRow(i);
			for (int j = 0; j <= 0; j++) {
				String prodid = row.getCell(j).getStringCellValue();
				Thread.sleep(1000);
				Email_Validation_With_Abuse_Of_General_Inquiry_Page page = new Email_Validation_With_Abuse_Of_General_Inquiry_Page(
						driver);
				test = extent.createTest("Open_URL_Email_Validation_GI");

				try {
					driver.get(Basepage.readProperty("urlG"));
					driver.navigate().refresh();
					String gettitle = page.generallgetpagetitlemethod();
					String gettitleexcel = Excelreader.getData(0, 1, 1);
					if (gettitle.equals(gettitleexcel)) {
						test.pass("TC:1 URL OF GENERAL INQUIRY IS OPENED");
					} else {
						test.fail("TC:1 URL OF GENERAL INQUIRY IS NOT OPENED");
						test.fail(test.addScreenCaptureFromPath(
								Extentreport.getScreenshot(driver, "Email_Validation_with_Abuse_Of__General_Inquiry"))
								+ "URL OF GENERAL INQUIRY IS NOT OPENED");
						extent.flush();
						driver.close();
						throw new SkipException("Skipping - ");

					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());

				}
                 Thread.sleep(4000);
                 try {
                 //driver.findElement(By.xpath("//html/body/div[1]/div[1]/div/button")).click();
                 driver.findElement(By.xpath("//*[@id='onetrust-close-btn-container']/button")).click();

                 }catch (Exception e) {
					
				}
				
				
				for (int k = 2; k <= 2; k++) {
					String options = row.getCell(k).getStringCellValue();
					driver.findElement(By.xpath("//*[@name='about']")).click();
					//driver.findElement(By.xpath("//li[contains(text(),'" + options + "')]")).click();
					driver.findElement(By.xpath("//*[@name='about']/option[2]")).click();

				}

				// Enter your comments
				try {
					page.commentspecialchaructermethod(prodid);
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// CHARACTER of first name
				try {
					String FNCHARACTER = Excelreader.getData(0, 2, 1);
					String valc = page.finameEnteredvalue(FNCHARACTER);
					if (valc.equals(FNCHARACTER)) {
						test.pass("TC: CHARACTERS VALUE IS ENTERED IN FIRSTNAME TEXTBOX");
					} else {
						test.fail("TC:  CHARACTERS VALUE IS NOT ENTERED IN FIRSTNAME TEXTBOX");
						test.fail(test.addScreenCaptureFromPath(
								Extentreport.getScreenshot(driver, "Email_Validation_with_Abuse_Of__General_Inquiry"))
								+ "CHARACTERS VALUE IS NOT ENTERED IN FIRSTNAME TEXTBOX");
					}
				} catch (Exception e) {

					test.fail("Error:" + e.getMessage());
				}

				// CHARACTER of last name
				try {
					String LNcharacter = Excelreader.getData(0, 3, 1);
					String LAcvalue = page.lastnameenterdvalue(LNcharacter);
					if (LAcvalue.equals(LNcharacter)) {
						test.pass("TC: CHARACTERS VALUE IS ENTERED IN LASTNAME TEXTBOX");
					} else {
						test.fail("TC: CHARACTERS VALUE IS NOT ENTERED IN LASTNAME TEXTBOX ");
						test.fail(test.addScreenCaptureFromPath(
								Extentreport.getScreenshot(driver, "Email_Validation_with_Abuse_Of__General_Inquiry"))
								+ "CHARACTERS VALUE IS NOT ENTERED IN LASTNAME TEXTBOX");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// characters of addresss
				try {
					String addresscharactershead = Excelreader.getData(0, 4, 1);
					String addCvalue = page.addresssendedvaluemethod(addresscharactershead);
					if (addCvalue.equals(addresscharactershead)) {
						test.pass("TC: CHARACTERS VALUE IS ENTERED IN ADDRESS TEXTBOX");
					} else {
						test.fail("TC: CHARACTERS VALUE IS NOT ENTERED IN ADDRESS TEXTBOX");
						test.fail(test.addScreenCaptureFromPath(
								Extentreport.getScreenshot(driver, "Email_Validation_with_Abuse_Of__General_Inquiry"))
								+ "CHARACTERS VALUE IS NOT ENTERED IN ADDRESS TEXTBOX");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// characters and numerical of apisuite function
				try {
					String apisuitecharandnumari = Excelreader.getData(0, 5, 1);
					String suitesh = page.aptsuitsendedvaluemethod(apisuitecharandnumari);
					if (suitesh.equals(apisuitecharandnumari)) {
						test.pass("TC: CHARACTERS AND NUMERICAL ABLE TO ENTERED IN APT/SUITE TEXTBOX");
					} else {
						test.fail("TC: CHARACTERS AND NUMERICAL NOT ABLE TO ENTERED IN APT/SUITE TEXTBOX");
						test.fail(test.addScreenCaptureFromPath(
								Extentreport.getScreenshot(driver, "Email_Validation_with_Abuse_Of__General_Inquiry"))
								+ "CHARACTERS AND NUMERICAL NOT ABLE TO ENTERED IN APT/SUITE TEXTBOX");
					}

				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}

				// CHARACTERS city
				try {
					String citycharecter = Excelreader.getData(0, 6, 1);
					String cityCenteredvalue = page.citysendedvaluemethod(citycharecter);
					if (cityCenteredvalue.equals(citycharecter)) {
						test.pass("TC: CHARACTER VALUE IS ENTERED IN CITY TEXTBOX");
					} else {
						test.fail("TC: CHARACTER VALUE NOT ABLE TO ENTERED IN CITY TEXTBOX");
						test.fail(test.addScreenCaptureFromPath(
								Extentreport.getScreenshot(driver, "Email_Validation_with_Abuse_Of__General_Inquiry"))
								+ "CHARACTER VALUE NOT ABLE TO ENTERED IN CITY TEXTBOX");
					}

				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// select drop down values of state function
				try {

					String stateselectedvaluehead = page.stateselectedvaluemethod();
					String stateselectedvalueexcel = Excelreader.getData(0, 6, 1);
					if (stateselectedvaluehead.equals(stateselectedvalueexcel)) {
						test.pass("TC: USER SHOULD BE SELECT DROP DOWN VALUE ON STATE FUNCTION");
					} else {
						test.fail("TC: USER SHOULD BE SELECT DROP DOWN VALUE ON STATE FUNCTION");
						test.fail(test.addScreenCaptureFromPath(
								Extentreport.getScreenshot(driver, "Email_Validation_with_Abuse_Of__General_Inquiry"))
								+ "USER SHOULD BE SELECT DROP DOWN VALUE ON STATE FUNCTION");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// enter numerical of zip function
				try {
					String zipnumerical = Excelreader.getData(0, 7, 1);
					String zipnenterdvalue = page.zipsendedvaluemethod(zipnumerical);
					if (zipnenterdvalue.equals(zipnumerical)) {
						test.pass("TC:  USER SHOULD BE SEND 5 NUMBERS ONLY ON ZIP FUNCTION");
					} else {
						test.fail("TC:  USER SHOULD BE SEND 5 NUMBERS ONLY ON ZIP FUNCTION");
						test.fail(test.addScreenCaptureFromPath(
								Extentreport.getScreenshot(driver, "Email_Validation_with_Abuse_Of__General_Inquiry"))
								+ "USER SHOULD BE SEND 5 NUMBERS ONLY ON ZIP FUNCTION");
					}

				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}

				// enter mail format on email
				try {
					String emailsendid = Excelreader.getData(0, 8, 1);
					String emailvlue = page.mailsendmethod(emailsendid);
					if (emailvlue.equals(emailsendid)) {
						test.pass("TC: USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
					} else {
						test.fail("TC: USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
						test.fail(test.addScreenCaptureFromPath(
								Extentreport.getScreenshot(driver, "Email_Validation_with_Abuse_Of__General_Inquiry"))
								+ "USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// enter mail FORMAT on confirm mail
				try {
					String confirmmailsend = Excelreader.getData(0, 9, 1);
					String conmailsendvalue = page.confirmmailsendidmethod(confirmmailsend);
					if (conmailsendvalue.equals(confirmmailsend)) {
						test.pass("TC:  MAIL ID IS SEND IN CONFIRM MAIL TEXTBOX");
					} else {
						test.fail("TC: MAIL ID IS NOT SEND IN CONFIRM MAIL TEXTBOX");
						test.fail(test.addScreenCaptureFromPath(
								Extentreport.getScreenshot(driver, "Email_Validation_with_Abuse_Of__General_Inquiry"))
								+ "MAIL ID IS NOT SEND IN CONFIRM MAIL TEXTBOX");
					}

				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// send numerical in phone number function
				try {
					String phonenumaricalhead = Excelreader.getData(0, 10, 1);
					String phonenumenteredval = page.phonenumbersendedvaluemethod(phonenumaricalhead);
					if (phonenumenteredval.equals(phonenumaricalhead)) {
						test.pass("TC: USER SHOUND BE SEND NUMERICAL VALUE IN PHONE NUMBER TEXTBOX");
					} else {
						test.fail("TC: USER SHOUND BE SEND NUMERICAL VALUE IN PHONE NUMBER TEXTBOX");
						test.fail(test.addScreenCaptureFromPath(
								Extentreport.getScreenshot(driver, "Email_Validation_with_Abuse_Of__General_Inquiry"))
								+ "NUMERICAL VALUE IS NOT ENTERED IN PHONE NUMBER TEXTBOX");
					}

				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}

				driver.findElement(By.xpath("//*[@id='submit_form_rf']")).click();
				String gettitle1 = page.generallgetpagetitlemethod();
				String gettitleexcel1 = Excelreader.getData(0, 11, 1);
				if (gettitle1.equals(gettitleexcel1)) {
					test.pass("TC:1 SUBMITED IS SUCCESSFUL");
				} else {
					test.fail("TC:1 SUBMITED IS SUCCESSFUL");
					test.fail(test.addScreenCaptureFromPath(
							Extentreport.getScreenshot(driver, "Email_Validation_with_Abuse_Of__General_Inquiry"))
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

package com.Mcd.qa.TestCases;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.McD.qa.Base.BaseTest;
import com.McD.qa.Extentreport.Extentreport;
import com.McD.qa.Pages.Basepage;
import com.McD.qa.Pages.Franchising_Form_page;
import com.McD.qa.Utility.TestUtil;

public class Franchising_Form extends BaseTest {
	String excelpath = System.getProperty("user.dir");
	TestUtil Excelreader = new TestUtil(excelpath + "/src/main/java/com/McD/qa/TestData/Franchising_Form.xls");

	@Test(priority = 1)
	public void Open_urlF() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Open_URLF");

		try {
			driver.get(Basepage.readProperty("urlF"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");
			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "URL IS NOT OPENED");
				extent.flush();
				driver.close();
				throw new SkipException("Skipping - ");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
			extent.flush();
			driver.close();
			throw new SkipException("Skipping - ");

		}
	}

	@Test(priority = 2)
	public void Franchise_Form_Label() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Franchise_Form_Label");
		// U.S Franchise form label
		try {
			String franchisseresetfocuslabelhead = page.franchisseresetfocuslabelmethod();
			String franchisseresetfocuslabelexcel = Excelreader.getData(0, 2, 5);
			if (franchisseresetfocuslabelhead.equals(franchisseresetfocuslabelexcel)) {
				test.pass("TC:3 VERIFY LABEL ' U.S FRANCHISE FORM ' IS DISPLAYED");

			} else {
				test.fail("TC:3 VERIFY LABEL ' U.S FRANCHISE FORM ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "VERIFY LABEL ' U.S FRANCHISE FORM ' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// LOOKING TO START A McDONALD..... label
		try {
			String lookingstartlabelhead = page.lookingstartlabelmethod();
			String lookingstartlabelexcel = Excelreader.getData(0, 3, 5);
			if (lookingstartlabelhead.equals(lookingstartlabelexcel)) {
				test.pass("TC:4 VERIFY LABEL ' LOOKING TO START A McDONALD..... ' IS DISPLAYED");

			} else {
				test.fail("TC:4 VERIFY LABEL ' LOOKING TO START A McDONALD..... ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "VERIFY LABEL ' LOOKING TO START A McDONALD..... ' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// INDICATE A REQUIRED FIELD label
		try {
			String indicatearequiredfieldlabelhead = page.indicatearequiredfieldlabelmethod();
			String indicatearequiredfieldlabelexcel = Excelreader.getData(0, 4, 5);
			if (indicatearequiredfieldlabelhead.equals(indicatearequiredfieldlabelexcel)) {
				test.pass("TC:7 VERIFY LABEL ' INDICATE A REQUIRED FIELD ' IS DISPLAYED");

			} else {
				test.fail("TC:7 VERIFY LABEL ' INDICATE A REQUIRED FIELD ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "VERIFY LABEL ' INDICATE A REQUIRED FIELD ' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// TESS US ABOUT YOURSELT label
		try {
			String tellusaboutyourselflabelhead = page.tellusaboutyourselflabelmethod();
			String tellusaboutyourselflabelexcel = Excelreader.getData(0, 5, 5);
			if (tellusaboutyourselflabelhead.equals(tellusaboutyourselflabelexcel)) {
				test.pass("TC:8 VERIFY LABEL ' TESS US ABOUT YOURSELT ' IS DISPLAYED");

			} else {
				test.fail("TC:8 VERIFY LABEL ' TESS US ABOUT YOURSELT ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "VERIFY LABEL ' TESS US ABOUT YOURSELT ' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 3)
	public void First_NameF() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("First_NameF");
		// label of first name
		try {
			String firstnamelabehead = page.firstnamelabelmethod();
			String firstnamelabelexcel = Excelreader.getData(0, 6, 5);
			if (firstnamelabehead.equals(firstnamelabelexcel)) {
				test.pass("TC:9 THE TEXT '*FIRST NAME' IS DISPLAYED");
			} else {
				test.fail("TC:9 THE TEXT '*FIRST NAME' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE TEXT '*FIRST NAME' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// after click first name label
		try {
			String firstnamelabehead = page.firstnamelabelmethod1();
			String firstnamelabelexcel = Excelreader.getData(0, 6, 5);
			if (firstnamelabehead.equals(firstnamelabelexcel)) {
				test.pass("TC:9 THE TEXT '*FIRST NAME' IS ROLLED UP IN THE SAME PAGE");
			} else {
				test.fail("TC:9 THE TEXT '*FIRST NAME' IS NOT ROLLED UP IN THE SAME PAGE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE TEXT '*FIRST NAME' IS NOT ROLLED UP IN THE SAME PAGE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// SPECIAL CHARACTERS on first name fucntion
		try {
			String firstnamesendvalexcel = Excelreader.getData(0, 7, 5);
			String sendedvalhead = page.firstnamesendedvaluemethod(firstnamesendvalexcel);
			if (!sendedvalhead.equals(firstnamesendvalexcel)) {
				test.pass("TC:9  USE SHOULD NOT BE SEND SPECIAL CHARACTERS IN FIRSTNAME FUNCTION");
			} else {
				test.fail("TC:9  USE SHOULD NOT BE SEND SPECIAL CHARACTERS IN FIRSTNAME FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USE SHOULD NOT BE SEND SPECIAL CHARACTERS IN FIRSTNAME TEXTBOX");
			}
		} catch (Exception e) {

			test.fail("Error:" + e.getMessage());
		}
		// NUMARICAL VALUES IN FIRST NAME FUNCTION
		try {
			String firstnamesendvalexcel = Excelreader.getData(0, 8, 5);
			String sendedvalhead = page.firstnamesendedvaluemethod(firstnamesendvalexcel);
			if (!sendedvalhead.equals(firstnamesendvalexcel)) {
				test.pass("TC:9  USE SHOULD NOT BE SEND NUMARICAL VALUE IN FIRSTNAME FUNCTION");
			} else {
				test.fail("TC:9  USE SHOULD NOT BE SEND NUMARICAL VALUE IN FIRSTNAME FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USE SHOULD NOT BE SEND NUMARICAL VALUE IN FIRSTNAME FUNCTION");
			}
		} catch (Exception e) {

			test.fail("Error:" + e.getMessage());
		}
		// CHARACTERS VALUES IN FIRST NAME FUNCTION
		try {
			String firstnamesendvalexcel = Excelreader.getData(0, 9, 5);
			String sendedvalhead = page.firstnamesendedvaluemethod(firstnamesendvalexcel);
			if (sendedvalhead.equals(firstnamesendvalexcel)) {
				test.pass("TC:9  USE SHOULD  BE SEND CHARACTERS  IN FIRSTNAME FUNCTION");
			} else {
				test.fail("TC:9  USE SHOULD BE SEND CHARACTERS IN FIRSTNAME FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USE SHOULD  BE SEND CHARACTERS IN FIRSTNAME FUNCTION");
			}
		} catch (Exception e) {

			test.fail("Error:" + e.getMessage());
		}

		// MORE THAN 25 CHARACTERS IN FIRST NAME FUNCTION
		try {
			String firstnamesendvalexcel = Excelreader.getData(0, 10, 5);
			String sendedvalhead = page.firstnamesendedvaluemethod(firstnamesendvalexcel);
			if (!sendedvalhead.equals(firstnamesendvalexcel)) {
				test.pass("TC:9  USE SHOULD NOT BE SEND MORE THAN 25 CHARACTERS  IN FIRSTNAME FUNCTION");
			} else {
				test.fail("TC:9  USE SHOULD NOT BE SEND MORE THAN 25 CHARACTERS IN FIRSTNAME FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USE SHOULD  NOT BE SEND MORE THAN 25 CHARACTERS IN FIRSTNAME FUNCTION");
			}
		} catch (Exception e) {

			test.fail("Error:" + e.getMessage());
		}

		// ERROR MESSAGE OF FIRST NAME
		try {
			String finameerorhead1 = page.firstnameerror();
			String finamerrorexcel2 = Excelreader.getData(0, 11, 5);
			if (finameerorhead1.equals(finamerrorexcel2)) {
				test.pass("TC:9 'ERROR MESSAGE DISPLAYED' -->" + "'" + finameerorhead1 + "'");
			} else {
				test.fail("TC:9 FIRST NAME FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "FIRST NAME FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 4)
	public void Last_NameF() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Last_NameF");

		// LAST NAME LABEL
		try {
			String LNlabelhead = page.lastnamelabelmethod();
			String LNlabelexcel = Excelreader.getData(0, 12, 5);
			if (LNlabelhead.equals(LNlabelexcel)) {
				test.pass("TC:10 THE LABEL 'LAST NAME' IS DISPLAYED");
			} else {
				test.fail("TC:10 THE LABEL 'LAST NAME' IS NOT DISPLAYED ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'LAST NAME' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// CLICK AND ROLLED UP THE LAST NAME LABEL

		try {
			String LNlabelhead = page.lastnamelabelmethod1();
			String LNlabelexcel = Excelreader.getData(0, 12, 5);
			if (LNlabelhead.equals(LNlabelexcel)) {
				test.pass("TC:10 THE LABEL 'LAST NAME' IS ROLLED UP  ON LAST NAME FUNCTION");
			} else {
				test.fail("TC:10 THE LABEL 'LAST NAME' IS NOT ROLLED UP ON LAST NAME FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'LAST NAME' IS NOT ROLLED UP ON LAST NAME FUNCTION");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// SPECIAL CHARACTERS
		try {
			String LNSPECIALCHARACTER = Excelreader.getData(0, 13, 5);
			String LAscvalue = page.LNsendvaluemethod(LNSPECIALCHARACTER);
			if (!LAscvalue.equals(LNSPECIALCHARACTER)) {
				test.pass("TC:10 USER SHOULD NOT BE SEND SPECIAL CHARACTERS IN LASTNAME FUNCTION");
			} else {
				test.fail("TC:10 USER SHOULD NOT BE SEND SPECIAL CHARACTERS IN LASTNAME FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD NOT BE SEND SPECIAL CHARACTERS IN LASTNAME FUNCTION");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// NUMARICAL IN LAST NAME FUNCTION

		try {
			String LNSPECIALCHARACTER = Excelreader.getData(0, 14, 5);
			String LAscvalue = page.LNsendvaluemethod(LNSPECIALCHARACTER);
			if (!LAscvalue.equals(LNSPECIALCHARACTER)) {
				test.pass("TC:10 USER SHOULD NOT BE SEND NUMARICAL IN LASTNAME FUNCTION");
			} else {
				test.fail("TC:10 USER SHOULD NOT BE SEND NUMARICAL IN LASTNAME FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD NOT BE SEND NUMARICAL IN LASTNAME FUNCTION");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// CHARACTERS IN LAST NAME FUNCTION
		try {
			String LNSPECIALCHARACTER = Excelreader.getData(0, 15, 5);
			String LAscvalue = page.LNsendvaluemethod(LNSPECIALCHARACTER);
			if (LAscvalue.equals(LNSPECIALCHARACTER)) {
				test.pass("TC:10 USER SHOULD BE SEND CHARACTERS IN LASTNAME FUNCTION");
			} else {
				test.fail("TC:10 USER SHOULD BE SEND CHARACTERS IN LASTNAME FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD  BE SEND CHARACTERS IN LASTNAME FUNCTION");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// MORE THAN 25 CHARACTER IN LAST NAME FUNCTION
		try {
			String LNSPECIALCHARACTER = Excelreader.getData(0, 16, 5);
			String LAscvalue = page.LNsendvaluemethod(LNSPECIALCHARACTER);
			if (!LAscvalue.equals(LNSPECIALCHARACTER)) {
				test.pass("TC:10 USER SHOULD NOT SEND MORE THAN 25 CHARACTERS IN LASTNAME FUNCTION");
			} else {
				test.fail("TC:10 USER SHOULD NOT SEND MORE THAN 25 CHARACTERS IN LASTNAME FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD NOT BE SEND MORE THAN 25 CHARACTERS IN LASTNAME FUNCTION");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// LAST NAME ERROR MESSAGE
		try {
			String LNerrormess = page.lastnameerrormesmethod();
			String LNerrormesexcel = Excelreader.getData(0, 17, 5);
			if (LNerrormess.equals(LNerrormesexcel)) {
				test.pass("TC:10 LAST NAME FUNCTION'ERROR MESSAGE DISPLAYED' -->" + "'" + LNerrormess + "'");
			} else {
				test.fail("TC:10 LAST NAME FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "LAST NAME FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 5)
	public void PhoneF() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("PhoneF");
		// phone number label
		try {
			String phonenumberlabelhead = page.phonenumberlabelmethod();
			String phonenumberlabelexcel = Excelreader.getData(0, 18, 5);
			if (phonenumberlabelhead.equals(phonenumberlabelexcel)) {
				test.pass("TC:11 THE LABEL 'PHONE NUMBER' IS DISPLAYED ");
			} else {
				test.fail("TC:11 THE LABEL 'PHONE NUMBER' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'PHONE NUMBER' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK ON phone number AND LABEL IS ROLLED UP OR NOT
		try {
			String phonenumberlabelhead = page.phonenumberlabelmethod1();
			String phonenumberlabelexcel = Excelreader.getData(0, 18, 5);
			if (phonenumberlabelhead.equals(phonenumberlabelexcel)) {
				test.pass("TC:11 THE LABEL 'PHONE NUMBER' IS ROLLED UP AFTER CLICK ON PHONE NUMBER FUNCTION");
			} else {
				test.fail("TC:11 THE LABEL 'PHONE NUMBER' IS NOT ROLLED UP AFTER CLICK ON PHONE NUMBER FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'PHONE NUMBER' IS NOT ROLLED UP AFTER CLICK ON PHONE NUMBER FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// characters
		try {
			String phonecharacterhead = Excelreader.getData(0, 19, 5);
			String phonenumCenteredval = page.phonenumbersendmethod(phonecharacterhead);
			if (!phonenumCenteredval.equals(phonecharacterhead)) {
				test.pass("TC:11 USER SHOULD NOT SEND CHARACTER IN PHONE NUMBER FUNCTION ");
			} else {
				test.fail("TC:11 USER SHOULD NOT SEND CHARACTER IN PHONE NUMBER FUNCTION ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD NOT SEND CHARACTER IN PHONE NUMBER FUNCTION ");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// SPECIAL CHARECTER
		try {
			String phonecharacterhead = Excelreader.getData(0, 20, 5);
			String phonenumCenteredval = page.phonenumbersendmethod(phonecharacterhead);
			if (!phonenumCenteredval.equals(phonecharacterhead)) {
				test.pass("TC:11 USER SHOULD NOT SEND SPECIAL CHARACTER IN PHONE NUMBER FUNCTION ");
			} else {
				test.fail("TC:11 USER SHOULD NOT SEND SPECIAL CHARACTER IN PHONE NUMBER FUNCTION ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD NOT SEND SPECIAL CHARACTER IN PHONE NUMBER TEXTBOX ");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// more than 10 numerical
		try {
			String phonecharacterhead = Excelreader.getData(0, 22, 5);
			String phonenumCenteredval = page.phonenumbersendmethod(phonecharacterhead);
			if (!phonenumCenteredval.equals(phonecharacterhead)) {
				test.pass("TC:11 USER SHOULD NOT SEND MORE THAN 10 NUMERICAL IN PHONE NUMBER FUNCTION ");
			} else {
				test.fail("TC:11 USER SHOULD NOT SEND MORE THAN 10 NUMERICAL IN PHONE NUMBER FUNCTION ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD NOT SEND MORE THAN 10 IN PHONE NUMBER FUNCTION ");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ENTER 10 NUMERICAL
		try {
			String phonecharacterhead = Excelreader.getData(0, 23, 5);
			String phonenumCenteredval = page.phonenumbersendmethod(phonecharacterhead);
			if (phonenumCenteredval.equals(phonecharacterhead)) {
				test.pass("TC:11 USER SHOULD  SEND 10 NUMERICAL IN PHONE NUMBER FUNCTION ");
			} else {
				test.fail("TC:11 USER SHOULD  SEND 10 NUMERICAL IN PHONE NUMBER FUNCTION ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD SEND 10 NUMERICAL IN PHONE NUMBER FUNCTION ");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// LESS THAN 10 NUMERICAL
		try {
			String phonecharacterhead = Excelreader.getData(0, 21, 5);
			String phonenumbererrormessagehead = page.phonenumbererrormessagemethod(phonecharacterhead);
			String phonenumbererrormessageexcel = Excelreader.getData(0, 24, 5);
			if (phonenumbererrormessagehead.equals(phonenumbererrormessageexcel)) {
				test.pass("TC:11 AFTER LESS THAN 10 NUMERICAL  'ERROR MESSAGE DISPLAYED' -->" + "'"
						+ phonenumbererrormessagehead + "'");
			} else {
				test.fail("TC:11 PHONE NUMBER FUNCTION ERROR MESSAGE IS NOT DISPLAYED AFTER LESS THAN 10 NUMERICAL ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "PHONE NUMBER FUNCTION ERROR MESSAGE IS NOT DISPLAYED AFTER LESS THAN 10 NUMERICAL");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE
		try {
			String phonenumbererrormessagehead = page.phonenumbererrormessagemethod1();
			String phonenumbererrormessageexcel = Excelreader.getData(0, 24, 5);
			if (phonenumbererrormessagehead.equals(phonenumbererrormessageexcel)) {
				test.pass("TC:11 PHONE NUMBER 'ERROR MESSAGE DISPLAYED' -->" + "'" + phonenumbererrormessagehead + "'");
			} else {
				test.fail("TC:11 PHONE NUMBER FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "PHONE NUMBER FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 6)
	public void Email_AddressF() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Email_AddressF");

		// label of mail
		try {
			String emaillabelhead = page.emaillabelmethod();
			String emaillabelexcel = Excelreader.getData(0, 25, 5);
			if (emaillabelhead.equals(emaillabelexcel)) {
				test.pass("TC:12 THE LABEL 'EMAIL' IS DISPLAYED ");
			} else {
				test.fail("TC:12 THE LABEL 'EMAIL' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'EMAIL' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK ON mail AND LABEL IS ROLLED UP OR NOT
		try {
			String emaillabelhead = page.emaillabelmethod1();
			String emaillabelexcel = Excelreader.getData(0, 25, 5);
			if (emaillabelhead.equals(emaillabelexcel)) {
				test.pass("TC:12 THE LABEL 'EMAIL' IS ROLLED UP AFTER CLICK ON EMAIL FUNCTION");
			} else {
				test.fail("TC:12 THE LABEL 'EMAIL' IS NOT ROLLED UP AFTER CLICK ON EMAIL FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'EMAIL' IS NOT ROLLED UP AFTER CLICK ON EMAIL FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// WITH OUT .COM FORMAT
		try {
			String emailsendid = Excelreader.getData(0, 26, 5);
			String emailvlue = page.mailsendmethod(emailsendid);
			if (emailvlue.equals(emailsendid)) {
				test.pass("TC:12  USER ABEL TO SEND MAIL WITH OUR FORMAT(.COM) IN MAIL TEXTBOX");
				String mailerrormessagehead = page.emailerrormessagemethod();
				String mailerrormessageexcel = Excelreader.getData(0, 29, 5);
				if (mailerrormessagehead.equals(mailerrormessageexcel)) {
					test.pass("TC:12 WITH OUR FORMAT(.COM) 'ERROR MESSAGE DISPLAYED' -->" + "'" + mailerrormessagehead
							+ "'");
				} else {
					test.fail("TC:12  WITH OUR FORMAT(.COM) MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "WITH OUR FORMAT(.COM) MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				}
			} else {
				test.fail("TC:12 USER ABEL TO SEND MAIL WITH OUR FORMAT(.COM) IN MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER ABEL TO SEND MAIL WITH OUR FORMAT(.COM) IN MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// WITH OUT @GAMIL

		try {
			String emailsendid = Excelreader.getData(0, 27, 5);
			String emailvlue = page.mailsendmethod(emailsendid);
			if (emailvlue.equals(emailsendid)) {
				test.pass("TC:12  USER ABEL TO SEND MAIL WITH OUR FORMAT(@GAMIL) IN MAIL TEXTBOX");
				String mailerrormessagehead = page.emailerrormessagemethod();
				String mailerrormessageexcel = Excelreader.getData(0, 29, 5);
				if (mailerrormessagehead.equals(mailerrormessageexcel)) {
					test.pass("TC:12 WITH OUR FORMAT(@GAMIL) 'ERROR MESSAGE DISPLAYED' -->" + "'" + mailerrormessagehead
							+ "'");
				} else {
					test.fail("TC:12  WITH OUR FORMAT(@GAMIL) MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "WITH OUR FORMAT(@GAMIL) MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				}
			} else {
				test.fail("TC:12 USER ABEL TO SEND MAIL WITH OUR FORMAT(@GAMIL) IN MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER ABEL TO SEND MAIL WITH OUR FORMAT(@GAMIL) IN MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// SEND WITH MAIL FORMAT

		try {
			String emailsendid = Excelreader.getData(0, 28, 5);
			String emailvlue = page.mailsendmethod(emailsendid);
			if (emailvlue.equals(emailsendid)) {
				test.pass("TC:12  USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
				String mailerrormessagehead = page.emailerrormessagemethod();
				String mailerrormessageexcel = Excelreader.getData(0, 29, 5);
				if (!mailerrormessagehead.equals(mailerrormessageexcel)) {
					test.pass("TC:12 WITH FORMAT 'ERROR MESSAGE IS NOT DISPLAYED'");
				} else {
					test.fail("TC:12  WITH FORMAT MAIL FUNCTION ERROR MESSAGE  DISPLAYED--->" + "'"
							+ mailerrormessagehead + "'");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "WITH FORMAT MAIL FUNCTION ERROR MESSAGE  DISPLAYED");
				}
			} else {
				test.fail("TC:12 USER SHOULD SEND MAIL WITH FORMAT IN MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD SEND MAIL WITH FORMAT IN MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE
		try {
			String mailerrormessagehead = page.emailerrormessagemethod1();
			String mailerrormessageexcel = Excelreader.getData(0, 29, 5);
			if (mailerrormessagehead.equals(mailerrormessageexcel)) {
				test.pass("TC:12 'ERROR MESSAGE DISPLAYED' -->" + "'" + mailerrormessagehead + "'");
			} else {
				test.fail("TC:12  MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 7)
	public void Address_USonlyF() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Address_USonlyF");
		// ADDRESS(US ONLY)
		try {
			String addresslabelhead = page.addresslabelmethod();
			String addresslabelexcel = Excelreader.getData(0, 30, 5);
			if (addresslabelhead.equals(addresslabelexcel)) {
				test.pass("TC:13 THE LABEL 'ADDRESS(US ONLY)' IS DISPLAYED");
			} else {
				test.fail("TC:13 THE LABEL 'ADDRESS(US ONLY)' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'ADDRESS(US ONLY)' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// CLICK ON ADDRESS(US ONLY) AND CHECK LABES rolled up or not
		try {
			String addresslabelhead = page.addresslabelmethod1();
			String addresslabelexcel = Excelreader.getData(0, 30, 5);
			if (addresslabelhead.equals(addresslabelexcel)) {
				test.pass("TC:13 THE LABEL 'ADDRESS(US ONLY)' IS ROLLED UP AFTE CLICK ON ADDRESS FUNCTION");
			} else {
				test.fail("TC:13 THE LABEL 'ADDRESS(US ONLY)' IS NOT ROLLED UP AFTE CLICK ON ADDRESS FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'ADDRESS(US ONLY)' IS NOT ROLLED UP AFTE CLICK ON ADDRESS TEXT");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// special characters
		try {
			String addressspecharacterhead = Excelreader.getData(0, 31, 5);
			String adsccnvalue = page.addresssendedvaluemethod(addressspecharacterhead);
			if (!adsccnvalue.equals(addressspecharacterhead)) {
				test.pass("TC:13 USER SHOULD NOT SEND SPECIAL CHARACTERS IN ADDRESS FUNCTION");
			} else {
				test.fail("TC:13 USER SHOULD NOT SEND SPECIAL CHARACTERS IN ADDRESS FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD NOT SEND SPECIAL CHARACTERS IN ADDRESS FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// NUMARICAL AND CHARACTERS SEND IN ADDRESS US(ONLY)
		try {
			String addressspecharacterhead = Excelreader.getData(0, 32, 5);
			String adsccnvalue = page.addresssendedvaluemethod(addressspecharacterhead);
			if (adsccnvalue.equals(addressspecharacterhead)) {
				test.pass("TC:13 USER SHOULD  SEND NUMARICAL AND CHARACTERS IN ADDRESS FUNCTION");
			} else {
				test.fail("TC:13 USER SHOULD SEND NUMARICAL AND CHARACTERS IN ADDRESS FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD  SEND NUMARICAL AND CHARACTERS IN ADDRESS FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// MORE THAN 40 CHARACTERS IN ADDRESS US

		try {
			String addressspecharacterhead = Excelreader.getData(0, 33, 5);
			String adsccnvalue = page.addresssendedvaluemethod(addressspecharacterhead);
			if (!adsccnvalue.equals(addressspecharacterhead)) {
				test.pass("TC:13 USER SHOULD NOT SEND MORE THAN 40 NUMARICAL AND CHARACTERS IN ADDRESS FUNCTION");
			} else {
				test.fail("TC:13 USER SHOULD NOT SEND MORE THAN 40 NUMARICAL AND CHARACTERS IN ADDRESS FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD NOT SEND MORE THAN 40 NUMARICAL AND CHARACTERS IN ADDRESS FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE OF ADDRESSS US(ONLY)
		try {
			String addresserrormessage = page.addresserrormessagemethod();
			String addresserrormessexcel = Excelreader.getData(0, 34, 5);
			if (addresserrormessage.equals(addresserrormessexcel)) {
				test.pass("TC:13 ADDRESS(US ONLY) FUNCTION 'ERROR MESSAGE DISPLAYED' -->" + "'" + addresserrormessage
						+ "'");
			} else {
				test.fail("TC:13 ADDRESS(US ONLY) FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "ADDRESS(US ONLY) FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 8)
	public void CityF() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("CityF");
		// label of citys
		try {
			String citylabelhead = page.citylabelmethod();
			String citylabelexcel = Excelreader.getData(0, 35, 5);
			if (citylabelhead.equals(citylabelexcel)) {
				test.pass("TC:14 THE LABEL 'CITY' IS DISPLAYED ");
			} else {
				test.fail("TC:14 THE LABEL 'CITY' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'CITY' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// after click on city text and rolled up label

		try {
			String citylabelhead = page.citylabelmethod1();
			String citylabelexcel = Excelreader.getData(0, 35, 5);
			if (citylabelhead.equals(citylabelexcel)) {
				test.pass("TC:14 THE LABEL 'CITY' IS ROLLED UP AFTER CLICK ON CLITY FUNCTION ");
			} else {
				test.fail("TC:14 THE LABEL 'CITY' IS NOT ROLLED UP AFTER CLICK ON CLITY FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'CITY' IS NOT ROLLED UP AFTER CLICK ON CLITY FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// special characters
		try {
			String cityspecialcharcters = Excelreader.getData(0, 36, 5);
			String citySCenteredvalue = page.citysendedvaluemethod(cityspecialcharcters);
			if (!citySCenteredvalue.equals(cityspecialcharcters)) {
				test.pass("TC:14 USER SHOULD NOT SEND SPECIAL CHARACTERS IN CITY FUNCTION");
			} else {
				test.fail("TC:14 USER SHOULD NOT SEND SPECIAL CHARACTERS IN CITY FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD NOT SEND SPECIAL CHARACTERS IN CITY FUNCTION");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// numerical
		try {
			String citynumaricalexcel = Excelreader.getData(0, 37, 5);
			String citySCenteredvalue = page.citysendedvaluemethod(citynumaricalexcel);
			if (!citySCenteredvalue.equals(citynumaricalexcel)) {
				test.pass("TC:14 USER SHOULD NOT SEND NUMERICAL IN CITY FUNCTION");
			} else {
				test.fail("TC:14 USER SHOULD NOT SEND NUMERICAL IN CITY FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD NOT SEND NUMERICAL IN CITY FUNCTION");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// CHARACTERS
		try {
			String citycharactersexcel = Excelreader.getData(0, 38, 5);
			String citySCenteredvalue = page.citysendedvaluemethod(citycharactersexcel);
			if (citySCenteredvalue.equals(citycharactersexcel)) {
				test.pass("TC:14 USER SHOULD  SEND CHARACTERS IN CITY FUNCTION");
			} else {
				test.fail("TC:14 USER SHOULD SEND CHARACTERS IN CITY FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD SEND CHARACTERS IN CITY FUNCTION");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// MORE THAN 20 CHARACTERS

		try {
			String citymorethan30excel = Excelreader.getData(0, 39, 5);
			String citySCenteredvalue = page.citysendedvaluemethod(citymorethan30excel);
			if (!citySCenteredvalue.equals(citymorethan30excel)) {
				test.pass("TC:14 USER SHOULD  SEND MORE THAN 30 CHARACTERS IN CITY FUNCTION");
			} else {
				test.fail("TC:14 USER SHOULD SEND MORE THAN 30 CHARACTERS IN CITY FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD SEND MORE THAN 30 CHARACTERS IN CITY FUNCTION");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// error message of city

		try {
			String cityerrormessagehead = page.cityerromessagemethod();
			String cityerrormessageexcel = Excelreader.getData(0, 40, 5);
			if (cityerrormessagehead.equals(cityerrormessageexcel)) {
				test.pass("TC:14  CITY 'ERROR MESSAGE DISPLAYED' -->" + "'" + cityerrormessagehead + "'");
			} else {
				test.fail("TC:14  CITY FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "CITY FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 9)
	public void StateF() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("StateF");

		// label of State
		try {
			String statelabelhead = page.statelabelmethod();
			String staelabelexcel = Excelreader.getData(0, 41, 5);
			if (statelabelhead.equals(staelabelexcel)) {
				test.pass("TC:15 THE LABEL 'STATE' IS DISPLAYED ");
			} else {
				test.fail("TC:15 THE LABEL 'STATE' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'STATE' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK ON STATE AND LABEL IS ROLLED UP OR NOT
		try {
			String statelabelhead = page.statelabelmethod1();
			String staelabelexcel = Excelreader.getData(0, 41, 5);
			if (statelabelhead.equals(staelabelexcel)) {
				test.pass("TC:15 THE LABEL 'STATE' IS ROLLED UP AFTER CLICK ON STATE FUNCTION ");
				// select drop down values of state function
				String statedropdownvaluehead = page.stateselecteddropdownvalmethod();
				String statedropdownvalueEXCEL = Excelreader.getData(0, 43, 5);
				if (statedropdownvaluehead.equals(statedropdownvalueEXCEL)) {
					test.pass("TC:15 USER SHOULD BE SELECTED STATE DROP DOWN VALUE");
				} else {
					test.fail("TC:15 USER SHOULD BE SELECTED STATE DROP DOWN VALUE");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "USER SHOULD BE SELECTED STATE DROP DOWN VALUE");
				}
			} else {
				test.fail("TC:15 THE LABEL 'STATE' IS ROLLED UP AFTER CLICK ON STATE FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'STATE' IS ROLLED UP AFTER CLICK ON STATE FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// click on submit and catch error message of state
		try {
			String stateerrormessahead = page.stateerrormessagemethod();
			String stateerrormessexcel = Excelreader.getData(0, 42, 5);
			if (stateerrormessahead.equals(stateerrormessexcel)) {
				test.pass("TC:15 STATE 'ERROR MESSAGE DISPLAYED' -->" + "'" + stateerrormessahead + "'");
			} else {
				test.fail("TC:15 STATE FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "STATE FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 10)
	public void ZipF() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("ZipF");
		// label of Zip
		try {
			String ziplabelhead = page.ziplabelmethod();
			String ziplabelexcel = Excelreader.getData(0, 44, 5);
			if (ziplabelhead.equals(ziplabelexcel)) {
				test.pass("TC:16 THE LABEL 'ZIP' IS DISPLAYED ");
			} else {
				test.fail("TC:16 THE LABEL 'ZIP' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'ZIP' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK ON zip AND LABEL IS ROLLED UP OR NOT
		try {
			String ziplabelhead = page.ziplabelmethod1();
			String ziplabelexcel = Excelreader.getData(0, 44, 5);
			if (ziplabelhead.equals(ziplabelexcel)) {
				test.pass("TC:16 THE LABEL 'ZIP' IS ROLLED UP AFTER CLICK ON ZIP FUNCTION");
			} else {
				test.fail("TC:16 THE LABEL 'ZIP' IS NOT ROLLED UP AFTER CLICK ON ZIP FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'ZIP' IS NOT ROLLED UP AFTER CLICK ON ZIP FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// CHARACTER
		try {
			String zipsendedvaluesexcel = Excelreader.getData(0, 45, 5);
			String zipsendedvalueshead = page.zipsendedvaluermethod(zipsendedvaluesexcel);
			if (!zipsendedvalueshead.equals(zipsendedvaluesexcel)) {
				test.pass("TC:16 USER SHOULD NOT ENTERD CHARACTERS IN ZIP TEXTBOX");
			} else {

				test.fail("TC:16 USER SHOULD BE ENTERD CHARACTERS IN ZIP TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE ENTERD CHARACTERS IN ZIP TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// SPECIAL CHARACTERS
		try {
			String zipsendedvaluesexcel = Excelreader.getData(0, 46, 5);
			String zipsendedvalueshead = page.zipsendedvaluermethod(zipsendedvaluesexcel);
			if (!zipsendedvalueshead.equals(zipsendedvaluesexcel)) {
				test.pass("TC:16 USER SHOULD NOT ENTERD SPECIAL CHARACTERS IN ZIP TEXTBOX");
			} else {

				test.fail("TC:16 USER SHOULD BE ENTERD SPECIAL CHARACTERS IN ZIP TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE ENTERD SPECIAL CHARACTERS IN ZIP TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// NUMERICAL
		try {
			String zipsendedvaluesexcel = Excelreader.getData(0, 47, 5);
			String zipsendedvalueshead = page.zipsendedvaluermethod(zipsendedvaluesexcel);
			if (zipsendedvalueshead.equals(zipsendedvaluesexcel)) {
				test.pass("TC:16 USER SHOULD ENTERD NUMERICAL IN ZIP TEXTBOX");
			} else {

				test.fail("TC:16 USER SHOULD ENTERD NUMERICAL IN ZIP TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD ENTERD NUMERICAL IN ZIP TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// MORE THAN 5 NUMERICAL
		try {
			String zipsendedvaluesexcel = Excelreader.getData(0, 48, 5);
			String zipsendedvalueshead = page.zipsendedvaluermethod(zipsendedvaluesexcel);
			if (!zipsendedvalueshead.equals(zipsendedvaluesexcel)) {
				test.pass("TC:16 USER SHOULD NOT ENTERD MORE THAN 5 NUMERICAL IN ZIP TEXTBOX");
			} else {

				test.fail("TC:16 USER SHOULD BE ENTERD MORE THAN 5 NUMERICAL IN ZIP TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE ENTERD MORE THAN 5 NUMERICAL IN ZIP TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// LESS THAN 5 NUMERICAL
		try {
			String zipsendedvaluesexcel = Excelreader.getData(0, 49, 5);
			String zipsendedvalueshead = page.zipsendedvaluermethod(zipsendedvaluesexcel);
			if (zipsendedvalueshead.equals(zipsendedvaluesexcel)) {
				test.pass("TC:16 USER SHOULD BE ENTERD LESS THAN 5 NUMERICAL IN ZIP TEXTBOX");
			} else {

				test.fail("TC:16 USER SHOULD BE ENTERD LESS THAN 5 NUMERICAL IN ZIP TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE ENTERD LESS THAN 5 NUMERICAL IN ZIP TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// ERROR MESSAGE
		try {
			String ziperrormessagehead = page.ziperrormessagemethod();
			String ziperrormessageexcel = Excelreader.getData(0, 50, 5);
			if (ziperrormessagehead.equals(ziperrormessageexcel)) {
				test.pass("TC:16 'ERROR MESSAGE DISPLAYED' -->" + "'" + ziperrormessagehead + "'");
			} else {
				test.fail("TC:16 ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "ERROR MESSAGE IS NOT DISPLAYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 11)
	public void Legal_InformationF() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Legal_InformationF");

		// Legal information
		try {
			String legalinformationlabelhead = page.legalinformationlabelmethod();
			String legalinformationlabelexcel = Excelreader.getData(0, 51, 5);
			if (legalinformationlabelhead.equals(legalinformationlabelexcel)) {
				test.pass("TC:16 THE LABEL 'LEGAL INFORMATION ' IS DISPLAYED ");
			} else {
				test.fail("TC:16 THE LABEL 'LEGAL INFORMATION' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'LEGAL INFORMATION' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// have you ever been convicted
		try {
			String haveyoubeeneverlabelhead = page.haveyoubeeneverlabelmethod();
			String haveyoubeeneverlabelexcel = Excelreader.getData(0, 52, 5);
			if (haveyoubeeneverlabelhead.equals(haveyoubeeneverlabelexcel)) {
				test.pass("TC:17 THE LABEL 'HAVE YOU EVER BEEN CONVICTED...... ' IS DISPLAYED ");
			} else {
				test.fail("TC:17 THE LABEL 'HAVE YOU EVER BEEN CONVICTED......' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'HAVE YOU EVER BEEN CONVICTED......' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK have you ever been convicted
		try {
			String haveyoubeeneverlabelhead = page.haveyoubeeneverlabelmethod1();
			String haveyoubeeneverlabelexcel = Excelreader.getData(0, 52, 5);
			if (haveyoubeeneverlabelhead.equals(haveyoubeeneverlabelexcel)) {
				test.pass("TC:17 THE LABEL 'HAVE YOU EVER BEEN CONVICTED...... ' IS ROLLED UP");
			} else {
				test.fail("TC:17 THE LABEL 'HAVE YOU EVER BEEN CONVICTED......' IS ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'HAVE YOU EVER BEEN CONVICTED......' IS ROLLED UP");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send CHARECTERS AND SPECIAL CHARECTER AND NUMARICAL
		try {
			String haveyoubeeneversendedvalueexcel = Excelreader.getData(0, 53, 5);
			String haveyoubeeneversendedvaluehead = page
					.haveyoubeeneversendedvaluemethod(haveyoubeeneversendedvalueexcel);
			if (haveyoubeeneversendedvaluehead.equals(haveyoubeeneversendedvalueexcel)) {
				test.pass(
						"TC:17 USER SHOULD BE ENTERD CHARECTERS, SPECEAL CHARECTERS, NUMERICAL AND SPACE ALSO IN HAVE YOU EVER BEEN.. FUNCTION");
			} else {

				test.fail(
						"TC:17 USER SHOULD BE ENTERD CHARACTERS, SPECEAL CHARECTERS, NUMERICAL AND SPACE ALSO IN HAVE YOU EVER BEEN.. FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE ENTERD CHARACTERS, SPECEAL CHARECTERS, NUMERICAL AND SPACE ALSO IN HAVE YOU EVER BEEN.. FUNCTION");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// MORE THAN 512
		try {
			String haveyoubeeneversendedvalueexcel = Excelreader.getData(0, 54, 5);
			String haveyoubeeneversendedvaluehead = page
					.haveyoubeeneversendedvaluemethod(haveyoubeeneversendedvalueexcel);
			if (haveyoubeeneversendedvaluehead.equals(haveyoubeeneversendedvalueexcel)) {
				test.pass(
						"TC:17 USER SHOULD NOT ENTERD MORE THAN 512 CHARECTERS, SPECEAL CHARECTERS, NUMERICAL AND SPACE ALSO IN HAVE YOU EVER BEEN.. FUNCTION");
				// ERROR MESSAGE
				String haveyoubeenevererrormessagehead = page.haveyoubeenevererrormessagemethod1();
				String haveyoubeenevererrormessageexcel = Excelreader.getData(0, 55, 5);
				if (haveyoubeenevererrormessagehead.equals(haveyoubeenevererrormessageexcel)) {
					test.pass(
							"TC:17 AFTER ENTER MORE THAN 512 HAVE YOU EVER BEEN CONVICTED...'ERROR MESSAGE DISPLAYED' -->"
									+ "'" + haveyoubeenevererrormessagehead + "'");
				} else {
					test.fail(
							"TC:17 AFTER ENTER MORE THAN 512HAVE YOU EVER BEEN CONVICTED... ERROR MESSAGE IS NOT DISPLAYED");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
							+ "ERROR MESSAGE IS NOT DISPLAYED");
				}
			} else {
				test.fail(
						"TC:17 USER SHOULD NOT ENTERD MORE THAN 512 CHARACTERS, SPECEAL CHARECTERS, NUMERICAL AND SPACE ALSO IN HAVE YOU EVER BEEN.. FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULDNOT ENTERD MORE THAN 512 CHARACTERS, SPECEAL CHARECTERS, NUMERICAL AND SPACE ALSO IN HAVE YOU EVER BEEN.. FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE

		try {
			String haveyoubeenevererrormessagehead = page.haveyoubeenevererrormessagemethod();
			String haveyoubeenevererrormessageexcel = Excelreader.getData(0, 55, 6);
			if (haveyoubeenevererrormessagehead.equals(haveyoubeenevererrormessageexcel)) {
				test.pass("TC:17 HAVE YOU EVER BEEN CONVICTED...'ERROR MESSAGE DISPLAYED' -->" + "'"
						+ haveyoubeenevererrormessagehead + "'");
			} else {
				test.fail("TC:17 HAVE YOU EVER BEEN CONVICTED... ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "ERROR MESSAGE IS NOT DISPLAYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 12)
	public void Have_you_or_your_spouse_everF() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Have_you_or_your_spouse_everF");
		// *Have you or your spouse ever....label
		try {
			String haveyouoryourspouselabelhead = page.haveyouoryourspouselabelmethod();
			String haveyouoryourspouselabelexcel = Excelreader.getData(0, 56, 5);
			if (haveyouoryourspouselabelhead.equals(haveyouoryourspouselabelexcel)) {
				test.pass("TC:18 THE LABEL 'HAVE YOU OR YOUR S POUSE EVER...... ' IS DISPLAYED ");
			} else {
				test.fail("TC:17 THE LABEL 'HAVE YOU OR YOUR S POUSE EVER......' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'HAVE YOU OR YOUR S POUSE EVER......' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK Have you or your spouse ever....label
		try {
			String haveyouoryourspouselabelhead = page.haveyouoryourspouselabelmethod1();
			String haveyouoryourspouselabelexcel = Excelreader.getData(0, 56, 5);
			if (haveyouoryourspouselabelhead.equals(haveyouoryourspouselabelexcel)) {
				test.pass("TC:18 THE LABEL 'HAVE YOU OR YOUR S POUSE EVER...... ' IS DISPLAYED ");
			} else {
				test.fail("TC:18 THE LABEL 'HAVE YOU OR YOUR S POUSE EVER......' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'HAVE YOU OR YOUR S POUSE EVER......' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send CHARECTERS AND SPECIAL CHARECTER AND NUMARICAL
		try {
			String haveyouoryourspousesendedvalueexcel = Excelreader.getData(0, 57, 5);
			String haveyouoryourspousesendedvaluehead = page
					.haveyouoryourspousesendedvaluemethod(haveyouoryourspousesendedvalueexcel);
			if (haveyouoryourspousesendedvaluehead.equals(haveyouoryourspousesendedvalueexcel)) {
				test.pass(
						"TC:18 USER SHOULD BE ENTERD CHARECTERS, SPECEAL CHARECTERS, NUMERICAL AND SPACE ALSO IN HAVE YOU OR YOUR.. FUNCTION");
			} else {

				test.fail(
						"TC:18 USER SHOULD BE ENTERD CHARACTERS, SPECEAL CHARECTERS, NUMERICAL AND SPACE ALSO IN HAVE YOU OR YOUR.. FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE ENTERD CHARACTERS, SPECEAL CHARECTERS, NUMERICAL AND SPACE ALSO IN HAVE YOU OR YOUR.. FUNCTION");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send more than 512
		try {
			String haveyouoryourspousesendedvalueexcel = Excelreader.getData(0, 58, 5);
			String haveyouoryourspousesendedvaluehead = page
					.haveyouoryourspousesendedvaluemethod(haveyouoryourspousesendedvalueexcel);
			if (haveyouoryourspousesendedvaluehead.equals(haveyouoryourspousesendedvalueexcel)) {
				test.pass(
						"TC:18 USER SHOULD NOT ENTERD MORE THAN 512 CHARECTERS, SPECEAL CHARECTERS, NUMERICAL AND SPACE ALSO IN HAVE YOU OR YOUR.. FUNCTION");
				// MORE THAN 512 ERROR MESSAGE
				String haveyouoryourspouseerrormessagehead = page.haveyouoryourspouseerrormessagemethod1();
				String haveyouoryourspouseerrormessageexcel = Excelreader.getData(0, 59, 5);
				if (haveyouoryourspouseerrormessagehead.equals(haveyouoryourspouseerrormessageexcel)) {
					test.pass("TC:18 AFTER ENTER MORE THAN 512 HAVE YOU OR YOUR SPOUSE...'ERROR MESSAGE DISPLAYED' -->"
							+ "'" + haveyouoryourspouseerrormessagehead + "'");
				} else {
					test.fail(
							"TC:18 AFTER ENTER MORE THAN 512 HAVE YOU OR YOUR SPOUSE... ERROR MESSAGE IS NOT DISPLAYED");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
							+ "ERROR MESSAGE IS NOT DISPLAYED");
				}
			} else {

				test.fail(
						"TC:18 USER SHOULD NOT ENTERD MORE THAN 512 CHARACTERS, SPECEAL CHARECTERS, NUMERICAL AND SPACE ALSO IN HAVE YOU OR YOUR.. FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD NOT ENTERD MORE THAN 512 CHARACTERS, SPECEAL CHARECTERS, NUMERICAL AND SPACE ALSO IN HAVE YOU OR YOUR.. FUNCTION");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE
		try {
			String haveyouoryourspouseerrormessagehead = page.haveyouoryourspouseerrormessagemethod();
			String haveyouoryourspouseerrormessageexcel = Excelreader.getData(0, 59, 6);
			if (haveyouoryourspouseerrormessagehead.equals(haveyouoryourspouseerrormessageexcel)) {
				test.pass("TC:18 HAVE YOU OR YOUR SPOUSE...'ERROR MESSAGE DISPLAYED' -->" + "'"
						+ haveyouoryourspouseerrormessagehead + "'");
			} else {
				test.fail("TC:18 HAVE YOU OR YOUR SPOUSE... ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "ERROR MESSAGE IS NOT DISPLAYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 13)
	public void Are_you_US_Cityzen() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Are_you_US_Cityzen");
		
	/*	try {
			driver.get(Basepage.readProperty("urlF"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equalsIgnoreCase(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");
			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "URL IS NOT OPENED");
				extent.flush();
				driver.close();
				throw new SkipException("Skipping - ");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
			extent.flush();
			driver.close();
			throw new SkipException("Skipping - ");

		}*/


		// Are you a US citizen label
		try {
			String areyouauscitizenlabelhead = page.areyouauscitizenlabelmethod();
			String areyouauscitizenlabelexcel = Excelreader.getData(0, 60, 5);
			if (areyouauscitizenlabelhead.equals(areyouauscitizenlabelexcel)) {
				test.pass("TC:19 THE LABEL 'ARE YOU A US CITIZEN..... ' IS DISPLAYED ");
			} else {
				test.fail("TC:19 THE LABEL 'ARE YOU A US CITIZEN..... ' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'ARE YOU A US CITIZEN..... ' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// yes label
		try {
			String yesradiobuttonlabelhead = page.yesradiobuttonlabelmethod();
			String yesradiobuttonlabelexcel = Excelreader.getData(0, 61, 5);
			if (yesradiobuttonlabelhead.equals(yesradiobuttonlabelexcel)) {
				test.pass("TC:19 VERIFY LABEL 'YES RADIO BUTTON LABEL ' IS DISPLAYED");

			} else {
				test.fail("TC:19 VERIFY LABEL 'YES RADIO BUTTON LABEL' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "VERIFY LABEL 'YES RADIO BUTTON LABEL' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// NO label

		try {
			String noradiobuttonlabelhead = page.noradiobuttonlabelmethod();
			String noradiobuttonlabelexcel = Excelreader.getData(0, 62, 5);
			if (noradiobuttonlabelhead.equals(noradiobuttonlabelexcel)) {
				test.pass("TC:19 VERIFY LABEL 'NO RADIO BUTTON LABEL ' IS DISPLAYED");

			} else {
				test.fail("TC:19 VERIFY LABEL 'NO RADIO BUTTON LABEL' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "VERIFY LABEL 'NO RADIO BUTTON LABEL' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// yes radio button
		try {
			String yesadiobuttonbydefaultselectedhead = page.yesadiobuttonbydefaultselectedmethod();
			if (!yesadiobuttonbydefaultselectedhead.equals("true")) {
				test.pass("TC:19 YES RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
			} else {
				test.fail("TC:19 YES RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "YES RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// No radio button
		try {
			String noadiobuttonbydefaultselectedhead = page.noradiobuttonbydefaultselectedmethod();
			if (!noadiobuttonbydefaultselectedhead.equals("true")) {
				test.pass("TC:19 NO RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
			} else {
				test.fail("TC:19 NO RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "NO RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}

		// after click yes radio button
		try {
			String yesadiobuttonbydefaultselectedhead = page.yesadiobuttonbydefaultselectedmethod1();
			if (yesadiobuttonbydefaultselectedhead.equals("true")) {
				test.pass("TC:19 YES RADIO BUTTON SHOULD BE CLICKABLE");
			} else {
				test.fail("TC:19 YES RADIO BUTTON SHOULD  BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "YES RADIO BUTTON SHOULD BE CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// After click No radio button
		try {
			String noadiobuttonbydefaultselectedhead = page.noradiobuttonbydefaultselectedmethod1();
			if (noadiobuttonbydefaultselectedhead.equals("true")) {
				test.pass("TC:19 NO RADIO BUTTON SHOULD BE CLICKABLE");
				// yes radio button
				String yesadiobuttonbydefaultselectedhead = page.yesadiobuttonbydefaultselectedmethod();
				if (!yesadiobuttonbydefaultselectedhead.equals("true")) {
					test.pass("TC:19 USER SHOULD NOT SELECT BOTH YES AND NO RADIO BUTTON");
				} else {
					test.fail("TC:19 USER SHOULD NOT SELECT BOTH YES AND NO RADIO BUTTON");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "USER SHOULD NOT SELECT BOTH YES AND NO RADIO BUTTON");
				}
			} else {
				test.fail("TC:19 NO RADIO BUTTON SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "NO RADIO BUTTON SHOULD BE CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE
		try {
			String errormessageareyouausmethodhead = page.errormessageareyouausmethod();
			String errormessageareyouausmethodexcel = Excelreader.getData(0, 63, 5);
			if (errormessageareyouausmethodhead.equals(errormessageareyouausmethodexcel)) {
				test.pass("TC:19 ARE YOU A US CIRIZEN...'ERROR MESSAGE DISPLAYED' -->" + "'"
						+ errormessageareyouausmethodhead + "'");
			} else {
				test.fail("TC:19 ARE YOU A US CIRIZEN.... ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "ERROR MESSAGE IS NOT DISPLAYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 14)
	public void Are_You_Fluent_In_Another_Language() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Are_You_Fluent_In_Another_Language");
		
		/*try {
			driver.get(Basepage.readProperty("urlF"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equalsIgnoreCase(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");
			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "URL IS NOT OPENED");
				extent.flush();
				driver.close();
				throw new SkipException("Skipping - ");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
			extent.flush();
			driver.close();
			throw new SkipException("Skipping - ");

		}
*/
		// *Are you fluent in another language?
		try {
			String areyouflouentinanotherlanglabelhead = page.areyouflouentinanotherlanglabelmethod();
			String areyouflouentinanotherlanglabelexcel = Excelreader.getData(0, 64, 5);
			if (areyouflouentinanotherlanglabelhead.equals(areyouflouentinanotherlanglabelexcel)) {
				test.pass("TC:20 THE LABEL 'ARE YOU FLUENT IN ANOTHER..... ' IS DISPLAYED ");
			} else {
				test.fail("TC:20 THE LABEL 'ARE YOU FLUENT IN ANOTHER..... ' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'ARE YOU FLUENT IN ANOTHER..... ' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// yes label
		try {
			String yesradiobuttonlanguagelabelhead = page.yesradiobuttonlanguagelabelmethod();
			String yesradiobuttonlanguagelabelexcel = Excelreader.getData(0, 65, 5);
			if (yesradiobuttonlanguagelabelhead.equals(yesradiobuttonlanguagelabelexcel)) {
				test.pass("TC:20 VERIFY LABEL 'YES RADIO BUTTON LABEL ' IS DISPLAYED");

			} else {
				test.fail("TC:20 VERIFY LABEL 'YES RADIO BUTTON LABEL' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "VERIFY LABEL 'YES RADIO BUTTON LABEL' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// NO label
		try {
			String noradiobuttonlanguagelabelhead = page.noradiobuttonlanguagelabelmethod();
			String noradiobuttonlanguagelabelexcel = Excelreader.getData(0, 66, 5);
			if (noradiobuttonlanguagelabelhead.equals(noradiobuttonlanguagelabelexcel)) {
				test.pass("TC:20 VERIFY LABEL 'NO RADIO BUTTON LABEL ' IS DISPLAYED");

			} else {
				test.fail("TC:20 VERIFY LABEL 'NO RADIO BUTTON LABEL' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "VERIFY LABEL 'NO RADIO BUTTON LABEL' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// yes radio button
		try {
			String yesradiodefaultbuttonlanguagehead = page.yesradiodefaultbuttonlanguagemethod();
			if (!yesradiodefaultbuttonlanguagehead.equals("true")) {
				test.pass("TC:20 YES RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");

			} else {
				test.fail("TC:20 YES RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "YES RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// No radio button
		try {
			String noradiodefaultbuttonlanguagehead = page.noradiodefaultbuttonlanguagemethod();
			if (!noradiodefaultbuttonlanguagehead.equals("true")) {
				test.pass("TC:20 NO RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
			} else {
				test.fail("TC:20 NO RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "NO RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}

		// After click yes radio button
		try {
			String yesradiodefaultbuttonlanguagehead = page.yesradiodefaultbuttonlanguagemethod1();
			if (yesradiodefaultbuttonlanguagehead.equals("true")) {
				test.pass("TC:20 YES RADIO BUTTON SHOULD BE CLICKABLE ");
				// if YES WHICH LANGUAGE LABEL
				String ifyeslanguagelabelhead = page.ifyeslanguagelabelmethod();
				String ifyeslanguagelabelexcel = Excelreader.getData(0, 68, 5);
				if (ifyeslanguagelabelhead.equals(ifyeslanguagelabelexcel)) {
					test.pass("TC:21 VERIFY LABEL 'IF YES, WHICH LANGUAGE ' IS DISPLAYED");

				} else {
					test.fail("TC:21 VERIFY LABEL 'IF YES, WHICH LANGUAGE' IS NOT DISPLAYED");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "VERIFY LABEL 'IF YES, WHICH LANGUAGE' IS NOT DISPLAYED");
				}
				// AFTER CLICK if YES WHICH LANGUAGE LABEL
				String ifyeslanguagelabelhead1 = page.ifyeslanguagelabelmethod1();
				String ifyeslanguagelabelexcel1 = Excelreader.getData(0, 68, 5);
				if (ifyeslanguagelabelhead1.equals(ifyeslanguagelabelexcel1)) {
					test.pass("TC:21 VERIFY LABEL 'IF YES, WHICH LANGUAGE ' IS DISPLAYED");

				} else {
					test.fail("TC:21 VERIFY LABEL 'IF YES, WHICH LANGUAGE' IS NOT DISPLAYED");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "VERIFY LABEL 'IF YES, WHICH LANGUAGE' IS NOT DISPLAYED");
				}
				// send numerical, characters, special characters and space
				try {
					String ifyeslanguagesendvalueexcel = Excelreader.getData(0, 69, 5);
					String ifyeslanguagesendvaluehead = page.ifyeslanguagesendvaluemethod(ifyeslanguagesendvalueexcel);
					if (ifyeslanguagesendvaluehead.equals(ifyeslanguagesendvalueexcel)) {
						test.pass(
								"TC:21 USER SHOULD BE ENTERD CHARECTERS, SPECEAL CHARECTERS, NUMERICAL AND SPACE ALSO IN 'IF YES, WHICH LANGUAGE FUNCTION'");
					} else {

						test.fail(
								"TC:21 USER SHOULD BE ENTERD CHARACTERS, SPECEAL CHARECTERS, NUMERICAL AND SPACE ALSO IN 'IF YES, WHICH LANGUAGE FUNCTION'");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
								+ "USER SHOULD BE ENTERD CHARACTERS, SPECEAL CHARECTERS, NUMERICAL AND SPACE ALSO IN 'IF YES, WHICH LANGUAGE FUNCTION'");
					}

				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// send more than 120 numerical, characters, special characters and space
				try {
					String ifyeslanguagesendvalueexcel = Excelreader.getData(0, 70, 5);
					String ifyeslanguagesendvaluehead = page.ifyeslanguagesendvaluemethod(ifyeslanguagesendvalueexcel);
					if (ifyeslanguagesendvaluehead.equals(ifyeslanguagesendvalueexcel)) {
						test.pass(
								"TC:21 USER SHOULD NOT ENTERD MORE THAN 120 CHARECTERS, SPECEAL CHARECTERS, NUMERICAL AND SPACE ALSO IN 'IF YES, WHICH LANGUAGE FUNCTION'");
					} else {

						test.fail(
								"TC:21 USER SHOULD NOT ENTERD MORE THAN 120 CHARACTERS, SPECEAL CHARECTERS, NUMERICAL AND SPACE ALSO IN 'IF YES, WHICH LANGUAGE FUNCTION'");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
								+ "USER SHOULD NOT ENTERD MORE THAN 120 CHARACTERS, SPECEAL CHARECTERS, NUMERICAL AND SPACE ALSO IN 'IF YES, WHICH LANGUAGE FUNCTION'");
					}

				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
			} else {
				test.fail("TC:20 YES RADIO BUTTON SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "YES RADIO BUTTON SHOULD BE CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}

		// after click No radio button
		try {
			String noradiodefaultbuttonlanguagehead = page.noradiodefaultbuttonlanguagemethod1();
			if (noradiodefaultbuttonlanguagehead.equals("true")) {
				test.pass("TC:20 NO RADIO BUTTON SHOULD BE CLICKABLE");
				// yes radio button
				String yesradiodefaultbuttonlanguagehead = page.yesradiodefaultbuttonlanguagemethod();
				if (!yesradiodefaultbuttonlanguagehead.equals("true")) {
					test.pass("TC:20 USER SHOULD NOT SELECT BOTH YES AND NO RADIO BUTTON");
				} else {
					test.fail("TC:20 USER SHOULD NOT SELECT BOTH YES AND NO RADIO BUTTON");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "USER SHOULD NOT SELECT BOTH YES AND NO RADIO BUTTON");
				}
			} else {
				test.fail("TC:20 NO RADIO BUTTON SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "NO RADIO BUTTON SHOULD BE CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE
		try {
			String errormessageareyoufluentanotherlanguagehead = page.errormessageareyoufluentanotherlanguagemethod();
			String errormessageareyoufluentanotherlanguageexcel = Excelreader.getData(0, 67, 5);
			if (errormessageareyoufluentanotherlanguagehead.equals(errormessageareyoufluentanotherlanguageexcel)) {
				test.pass("TC:20 ARE YOU FLUENT A ANOTHER LANGUAGE...'ERROR MESSAGE DISPLAYED' -->" + "'"
						+ errormessageareyoufluentanotherlanguagehead + "'");
			} else {
				test.fail("TC:20 ARE YOU FLUENT A ANOTHER LANGUAGE.... ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "ERROR MESSAGE IS NOT DISPLAYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}
	
	@Test(priority = 15)
	public void Demographic_Information() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Demographic_Information");
		
		// Demographic Information
				try {
					String demographicinformationhead = page.demographicinformationmethod();
					String demographicinformationexcel = Excelreader.getData(0, 195, 5);
					if (demographicinformationhead.equals(demographicinformationexcel)) {
						test.pass("TC:22 THE LABEL 'Demographic Information ' IS DISPLAYED ");
					} else {
						test.fail("TC:22 THE LABEL 'Demographic Information ' IS DISPLAYED");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
								+ "THE LABEL 'Demographic Information ' IS DISPLAYED");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// Gender
				try {
					String genderlabelhead = page.genderlabelmethod();
					String genderlabelexcel = Excelreader.getData(0, 196, 5);
					if (genderlabelhead.equals(genderlabelexcel)) {
						test.pass("TC:23 THE LABEL 'GENDER ' IS DISPLAYED ");
					} else {
						test.fail("TC:23 THE LABEL 'GENDER  ' IS DISPLAYED");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
								+ "THE LABEL 'Demographic Information ' IS DISPLAYED");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// after click Gender
				try {
					String genderlabelhead = page.genderlabelmethod1();
					String genderlabelexcel = Excelreader.getData(0, 196, 5);
					if (genderlabelhead.equals(genderlabelexcel)) {
						test.pass("TC:23 THE LABEL 'GENDER ' IS ROLLED UP ");
					} else {
						test.fail("TC:23 THE LABEL 'GENDER ' IS ROLLED UP");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
								+ "THE LABEL 'Demographic Information ' IS ROLLED UP");
					}
					// select drop down value
					String genderdropdownvaluehead = page.genderdropdownvaluemethod();
					String genderdropdownvalueexcel = Excelreader.getData(0, 197, 5);
					if (genderdropdownvaluehead.equals(genderdropdownvalueexcel)) {
						test.pass("TC:23 USER SHOULD BE SELECT DROP DOWN VALUE ON 'GENDER' FUNCTION");
					} else {
						test.fail("TC:23 USER SHOULD BE SELECT DROP DOWN VALUE ON 'GENDER' FUNCTION");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
								+ "USER SHOULD BE SELECT DROP DOWN VALUE ON GENDER FUNCTION");
					}

				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				
				// Race/Ethnicity
				try {
					String racelabelhead = page.racelabelmethod();
					String racelabelexcel = Excelreader.getData(0, 198, 5);
					if (racelabelhead.equals(racelabelexcel)) {
						test.pass("TC:23 THE LABEL 'RACE/ETHNICITY ' IS DISPLAYED ");
					} else {
						test.fail("TC:23 THE LABEL 'RACE/ETHNICITY  ' IS DISPLAYED");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
								+ "THE LABEL 'Demographic Information ' IS DISPLAYED");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				
				// after click on Race/Ethnicity
				try {
					String racelabelhead = page.racelabelmethod1();
					String racelabelexcel = Excelreader.getData(0, 198, 5);
					if (racelabelhead.equals(racelabelexcel)) {
						test.pass("TC:23 THE LABEL 'RACE/ETHNICITY ' IS ROLLED UP ");
					} else {
						test.fail("TC:23 THE LABEL 'RACE/ETHNICITY ' IS ROLLED UP");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
								+ "THE LABEL 'Demographic Information ' IS ROLLED UP");
					}
					// select drop down value
					String racedropdownvaluehead = page.racedropdownvaluemethod();
					String racedropdownvalueexcel = Excelreader.getData(0, 199, 5);
					if (racedropdownvaluehead.equals(racedropdownvalueexcel)) {
						test.pass("TC:23 USER SHOULD BE SELECT DROP DOWN VALUE ON 'RACE/ETHNICITY' FUNCTION");
					} else {
						test.fail("TC:23 USER SHOULD BE SELECT DROP DOWN VALUE ON 'RACE/ETHNICITY' FUNCTION");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
								+ "USER SHOULD BE SELECT DROP DOWN VALUE ON GENDER FUNCTION");
					}

				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
	}

	@Test(priority = 16)
	public void Education_Occupation() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Education_Occupation");

		// Education & Occupation
		try {
			String edducationoccupationhead = page.edducationoccupationmethod();
			String edducationoccupationexcel = Excelreader.getData(0, 71, 5);
			if (edducationoccupationhead.equals(edducationoccupationexcel)) {
				test.pass("TC:22 THE LABEL 'EDUCATION & OCCUPATION ' IS DISPLAYED ");
			} else {
				test.fail("TC:22 THE LABEL 'EDUCATION & OCCUPATION ' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'EDUCATION & OCCUPATION ' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// *Last year of schooling completed
		try {
			String lastyearofschoolinglabelhead = page.lastyearofschoolinglabelmethod();
			String lastyearofschoolinglabelexcel = Excelreader.getData(0, 72, 5);
			if (lastyearofschoolinglabelhead.equals(lastyearofschoolinglabelexcel)) {
				test.pass("TC:23 THE LABEL 'LAST YEAR OF SCHOOLING COMPLETED ' IS DISPLAYED ");
			} else {
				test.fail("TC:23 THE LABEL 'LAST YEAR OF SCHOOLING COMPLETED ' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'EDUCATION & OCCUPATION ' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// after click *Last year of schooling completed
		try {
			String lastyearofschoolinglabelhead = page.lastyearofschoolinglabelmethod1();
			String lastyearofschoolinglabelexcel = Excelreader.getData(0, 72, 5);
			if (lastyearofschoolinglabelhead.equals(lastyearofschoolinglabelexcel)) {
				test.pass("TC:23 THE LABEL 'LAST YEAR OF SCHOOLING COMPLETED ' IS ROLLED UP ");
			} else {
				test.fail("TC:23 THE LABEL 'LAST YEAR OF SCHOOLING COMPLETED ' IS ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'EDUCATION & OCCUPATION ' IS ROLLED UP");
			}
			// select drop down value
			String lastyearofschoolingdropdownvaluehead = page.lastyearofschoolingdropdownvaluemethod();
			String lastyearofschoolingdropdownvalueexcel = Excelreader.getData(0, 73, 5);
			if (lastyearofschoolingdropdownvaluehead.equals(lastyearofschoolingdropdownvalueexcel)) {
				test.pass("TC:23 USER SHOULD BE SELECT DROP DOWN VALUE ON 'LAST YEAT OF SCHOOLING COMPLETED' FUNCTION");
			} else {
				test.fail("TC:23 USER SHOULD BE SELECT DROP DOWN VALUE ON 'LAST YEAT OF SCHOOLING COMPLETED' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SELECT DROP DOWN VALUE ON LAST YEAT OF SCHOOLING COMPLETED FUNCTION");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// Name of college and/or postgraduate school
		try {
			String nameofcollegeandlabelhead = page.nameofcollegeandlabelmethod();
			String nameofcollegeandlabelexcel = Excelreader.getData(0, 74, 5);
			if (nameofcollegeandlabelhead.equals(nameofcollegeandlabelexcel)) {
				test.pass("TC:24 THE LABEL 'NAME OF COLLAGE AND/OR POSTGRADUATE SCHOOL' IS DISPLAYED ");
			} else {
				test.fail("TC:24 THE LABEL 'NAME OF COLLAGE AND/OR POSTGRADUATE SCHOOL ' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'NAME OF COLLAGE AND/OR POSTGRADUATE SCHOOL ' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// after click Name of college and/or postgraduate school
		try {
			String nameofcollegeandlabelhead = page.nameofcollegeandlabelmethod1();
			String nameofcollegeandlabelexcel = Excelreader.getData(0, 74, 5);
			if (nameofcollegeandlabelhead.equals(nameofcollegeandlabelexcel)) {
				test.pass("TC:24 THE LABEL 'NAME OF COLLAGE AND/OR POSTGRADUATE SCHOOL' IS ROLLED UP ");
			} else {
				test.fail("TC:24 THE LABEL 'NAME OF COLLAGE AND/OR POSTGRADUATE SCHOOL ' IS ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'NAME OF COLLAGE AND/OR POSTGRADUATE SCHOOL ' IS ROLLED UP");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send numerical and special character
		try {
			String nameofcollegeorpostgraduateexcel = Excelreader.getData(0, 75, 5);
			String nameofcollegeorpostgraduatehead = page
					.nameofcollegeorpostgraduatemethod(nameofcollegeorpostgraduateexcel);
			if (nameofcollegeorpostgraduatehead.equals(nameofcollegeorpostgraduateexcel)) {
				test.pass("TC:24 USER SHOULD BE SEND ALL CHARACTERS IN 'NAME OF COLLEGE OR POSTGRADUATE' FUNCTION");
			} else {
				test.fail("TC:24 USER SHOULD BE SEND ALL CHARACTERS IN 'NAME OF COLLEGE OR POSTGRADUATE' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND ALL CHARACTERS IN 'NAME OF COLLEGE OR POSTGRADUATE' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send MORE THAN 20 numerical and special character
		try {
			String nameofcollegeorpostgraduateexcel = Excelreader.getData(0, 76, 5);
			String nameofcollegeorpostgraduatehead = page
					.nameofcollegeorpostgraduatemethod(nameofcollegeorpostgraduateexcel);
			if (!nameofcollegeorpostgraduatehead.equals(nameofcollegeorpostgraduateexcel)) {
				test.pass(
						"TC:24 USER SHOULD NOT SEND MORE THAN 20 ALL CHARACTERS IN 'NAME OF COLLEGE OR POSTGRADUATE' FUNCTION");
			} else {
				test.fail(
						"TC:24 USER SHOULDNOT SEND MORE THAN 20 ALL CHARACTERS IN 'NAME OF COLLEGE OR POSTGRADUATE' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD NOT SEND MORE THAN 20 ALL CHARACTERS IN 'NAME OF COLLEGE OR POSTGRADUATE' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE
		try {
			String errormessagelastyearhead = page.errormessagelastyearmethod();
			String errormessagelastyearexcel = Excelreader.getData(0, 77, 5);
			if (errormessagelastyearhead.equals(errormessagelastyearexcel)) {
				test.pass("TC:23 LAST YEAR OF SCHOOLING COMPLETED 'ERROR MESSAGE DISPLAYED' -->" + "'"
						+ errormessagelastyearhead + "'");
			} else {
				test.fail("TC:23LAST YEAR OF SCHOOLING COMPLETED.... ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "LAST YEAR OF SCHOOLING COMPLETED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 17)
	public void Degree_OccupationalField() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Degree_OccupationalField");
		// Degree
		try {
			String degreelabelhead = page.degreelabelmethod();
			String degreelabelexcel = Excelreader.getData(0, 78, 5);
			if (degreelabelhead.equals(degreelabelexcel)) {
				test.pass("TC:25 THE LABEL 'DEGREE ' IS DISPLAYED ");
			} else {
				test.fail("TC:25 THE LABEL 'DEGREE' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'DEGREE ' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// after click Degree
		try {
			String degreelabelhead = page.degreelabelmethod1();
			String degreelabelexcel = Excelreader.getData(0, 78, 5);
			if (degreelabelhead.equals(degreelabelexcel)) {
				test.pass("TC:25 THE LABEL 'DEGREE ' IS ROLLED UP ");
			} else {
				test.fail("TC:25 THE LABEL 'DEGREE' IS NOT ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'DEGREE ' IS NOT ROLLED UP");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send numerical and special character in degree
		try {
			String degreesendedvaluexcel = Excelreader.getData(0, 79, 5);
			String degreesendedvaluhead = page.degreesendedvalumethod(degreesendedvaluexcel);
			if (degreesendedvaluhead.equals(degreesendedvaluexcel)) {
				test.pass("TC:25 USER SHOULD BE SEND ALL CHARACTERS IN 'DEGREE ' FUNCTION");
			} else {
				test.fail("TC:25 USER SHOULD BE SEND ALL CHARACTERS IN 'DEGREE' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND ALL CHARACTERS IN 'DEGREE' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send MORE THAN 30 numerical and special character
		try {
			String degreesendedvaluexcel = Excelreader.getData(0, 80, 5);
			String degreesendedvaluhead = page.degreesendedvalumethod(degreesendedvaluexcel);
			if (!degreesendedvaluhead.equals(degreesendedvaluexcel)) {
				test.pass("TC:25 USER SHOULD NOT SEND MORET THAN 30 ALL CHARACTERS IN 'DEGREE ' FUNCTION");
			} else {
				test.fail("TC:25 USER SHOULD NOT SEND MORET THAN 30 ALL CHARACTERS IN 'DEGREE' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD NOT SEND MORET THAN 30 ALL CHARACTERS IN 'DEGREE' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// occupationAL
		try {
			String occupationallabelhead = page.occupationallabelmethod();
			String occupationallabelexcel = Excelreader.getData(0, 81, 5);
			if (occupationallabelhead.equals(occupationallabelexcel)) {
				test.pass("TC:26 THE LABEL 'OCCUPATIONAL FIELD ' IS DISPLAYED ");
			} else {
				test.fail("TC:26 THE LABEL 'OCCUPATIONAL FIELD' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'OCCUPATIONAL FIELD ' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK occupation
		try {
			String occupationallabelhead = page.occupationallabelmethod1();
			String occupationallabelexcel = Excelreader.getData(0, 81, 5);
			if (occupationallabelhead.equals(occupationallabelexcel)) {
				test.pass("TC:26 THE LABEL 'OCCUPATIONAL FIELD ' IS ROLLED UP ");
			} else {
				test.fail("TC:26 THE LABEL 'OCCUPATIONAL FIELD' IS NOT ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'OCCUPATIONAL FIELD ' IS NOT ROLLED UP");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send numerical and special character in occupation
		try {
			String occupationsendedvalueexcel = Excelreader.getData(0, 82, 5);
			String occupationsendedvaluehead = page.occupationsendedvaluemethod(occupationsendedvalueexcel);
			if (occupationsendedvaluehead.equals(occupationsendedvalueexcel)) {
				test.pass("TC:26 USER SHOULD BE SEND ALL CHARACTERS IN 'OCCUPATIONAL FIELD ' FUNCTION");
			} else {
				test.fail("TC:26 USER SHOULD BE SEND ALL CHARACTERS IN 'OCCUPATIONAL FIELD' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND ALL CHARACTERS IN 'OCCUPATIONAL FIELD' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send more than 30 numerical and special character in occupation
		try {
			String occupationsendedvalueexcel = Excelreader.getData(0, 83, 5);
			String occupationsendedvaluehead = page.occupationsendedvaluemethod(occupationsendedvalueexcel);
			if (!occupationsendedvaluehead.equals(occupationsendedvalueexcel)) {
				test.pass("TC:26 USER SHOULD NOT SEND MORE THAN 30 ALL CHARACTERS IN 'OCCUPATIONAL FIELD ' FUNCTION");
			} else {
				test.fail("TC:26 USER SHOULD NOT SEND MORE THAN 30 ALL CHARACTERS IN 'OCCUPATIONAL FIELD' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD NOT SEND MORE THAN 30 ALL CHARACTERS IN 'OCCUPATIONAL FIELD' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE
		try {
			String errormessageoccupationalhead = page.errormessageoccupationalmethod();
			String errormessageoccupationalexcel = Excelreader.getData(0, 84, 5);
			if (errormessageoccupationalhead.equals(errormessageoccupationalexcel)) {
				test.pass("TC:26 OCCUPATIONAL FIELD 'ERROR MESSAGE DISPLAYED' -->" + "'" + errormessageoccupationalhead
						+ "'");
			} else {
				test.fail("TC:26 'OCCUPATIONAL FIELD' ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "OCCUPATIONAL FIELD ERROR MESSAGE IS NOT DISPLAYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 18)
	public void Position_Held() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Position_Held");

		// *Position Held
		try {
			String positionheldlabelhead = page.positionheldlabelmethod();
			String positionheldlabelexcel = Excelreader.getData(0, 85, 5);
			if (positionheldlabelhead.equals(positionheldlabelexcel)) {
				test.pass("TC:27 THE LABEL 'POSITION HELP ' IS DISPLAYED ");
			} else {
				test.fail("TC:27 THE LABEL 'POSITION HELP' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'POSITION HELP ' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK *Position Held
		try {
			String positionheldlabelhead = page.positionheldlabelmethod1();
			String positionheldlabelexcel = Excelreader.getData(0, 85, 5);
			if (positionheldlabelhead.equals(positionheldlabelexcel)) {
				test.pass("TC:27 THE LABEL 'POSITION HELP ' IS ROLLED UP ");
			} else {
				test.fail("TC:27 THE LABEL 'POSITION HELP' IS NOT ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'POSITION HELP ' IS NOT ROLLED UP");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send numerical and special character in POSITION HELP
		try {
			String positionheldsendedvalueexcel = Excelreader.getData(0, 86, 5);
			String positionheldsendedvaluehead = page.positionheldsendedvaluemethod(positionheldsendedvalueexcel);
			if (positionheldsendedvaluehead.equals(positionheldsendedvalueexcel)) {
				test.pass("TC:27 USER SHOULD BE SEND  ALL CHARACTERS IN 'POSITION HELP ' FUNCTION");
			} else {
				test.fail("TC:27 USER SHOULD BE SEND  ALL CHARACTERS IN 'POSITION HELP' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND ALL CHARACTERS IN 'POSITION HELP' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send MORE THAN 30 CHARACTERS
		try {
			String positionheldsendedvalueexcel = Excelreader.getData(0, 87, 5);
			String positionheldsendedvaluehead = page.positionheldsendedvaluemethod(positionheldsendedvalueexcel);
			if (!positionheldsendedvaluehead.equals(positionheldsendedvalueexcel)) {
				test.pass("TC:27 USER SHOULD NOT SEND MORE THAN 30  ALL CHARACTERS IN 'POSITION HELD ' FUNCTION");
			} else {
				test.fail("TC:27 USER SHOULD NOT SEND MORE THAN 30  ALL CHARACTERS IN 'POSITION HELD' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD NOT SEND MORE THAN 30 ALL CHARACTERS IN 'POSITION HELP' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// ERROR MESSAGE
		try {
			String positionhelderrormessagehead = page.positionhelderrormessagemethod();
			String positionhelderrormessageexcel = Excelreader.getData(0, 88, 5);
			if (positionhelderrormessagehead.equals(positionhelderrormessageexcel)) {
				test.pass(
						"TC:27 POSITION HELD 'ERROR MESSAGE DISPLAYED' -->" + "'" + positionhelderrormessagehead + "'");
			} else {
				test.fail("TC:27 'POSITION HELD' ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "POSITION HELD ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 19)
	public void Company_Name() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Company_Name");

		// *Company Name
		try {
			String companynamelabelhead = page.companynamelabelmethod();
			String companynamelabelexcel = Excelreader.getData(0, 89, 5);
			if (companynamelabelhead.equals(companynamelabelexcel)) {
				test.pass("TC:28 THE LABEL 'COMPANY NAME ' IS DISPLAYED ");
			} else {
				test.fail("TC:28 THE LABEL 'COMPANY NAME' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'COMPANY NAME ' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// after click *Company Name
		try {
			String companynamelabelhead = page.companynamelabelmethod1();
			String companynamelabelexcel = Excelreader.getData(0, 89, 5);
			if (companynamelabelhead.equals(companynamelabelexcel)) {
				test.pass("TC:28 THE LABEL 'COMPANY NAME ' IS ROLLED UP ");
			} else {
				test.fail("TC:28 THE LABEL 'COMPANY NAME' IS NOT ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'COMPANY NAME ' IS NOT ROLLED UP");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send numerical and special character in company name
		try {
			String companynamesendedvalueexcel = Excelreader.getData(0, 90, 5);
			String companynamesendedvaluehead = page.companynamesendedvaluemethod(companynamesendedvalueexcel);
			if (companynamesendedvaluehead.equals(companynamesendedvalueexcel)) {
				test.pass("TC:28 USER SHOULD BE SEND  ALL CHARACTERS IN 'COMPANY NAME ' FUNCTION");
			} else {
				test.fail("TC:28 USER SHOULD BE SEND  ALL CHARACTERS IN 'COMPANY NAME' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND  ALL CHARACTERS IN 'COMPANY NAME' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send more than 50 all numerical and special character in company name
		try {
			String companynamesendedvalueexcel = Excelreader.getData(0, 91, 5);
			String companynamesendedvaluehead = page.companynamesendedvaluemethod(companynamesendedvalueexcel);
			if (!companynamesendedvaluehead.equals(companynamesendedvalueexcel)) {
				test.pass("TC:28 USER SHOULD NOT SEND  MORE THAN 50 ALL CHARACTERS IN 'COMPANY NAME ' FUNCTION");
			} else {
				test.fail("TC:28 USER SHOULD NOT SEND  MORE THAN 50 ALL CHARACTERS IN 'COMPANY NAME' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD NOT SEND  MORE THAN 50 ALL CHARACTERS IN 'COMPANY NAME' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE
		try {
			String companynameerrormessagehead = page.companynameerrormessage();
			String companynameerrormessageexcel = Excelreader.getData(0, 92, 5);
			if (companynameerrormessagehead.equals(companynameerrormessageexcel)) {
				test.pass("TC:28 COMPANY NAME 'ERROR MESSAGE DISPLAYED' -->" + "'" + companynameerrormessagehead + "'");
			} else {
				test.fail("TC:28 'COMPANY NAME' ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "COMPANY NAME ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 20)
	public void Describe_Duties_Number_Of_Employees() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Describe_Duties_Number_Of_Employees");

		// Describe duties, number of employees supervised and responsibilities (0/512
		// characters)
		try {
			String describedutiesnumberoflabelhead = page.describedutiesnumberoflabelmethod();
			String describedutiesnumberoflabelexcel = Excelreader.getData(0, 93, 5);
			if (describedutiesnumberoflabelhead.equals(describedutiesnumberoflabelexcel)) {
				test.pass("TC:29 THE LABEL 'DESCRIBE DETIES, NUMBER OF EMPLOYEES.... ' IS DISPLAYED ");
			} else {
				test.fail("TC:29 THE LABEL 'DESCRIBE DETIES, NUMBER OF EMPLOYEES....' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'DESCRIBE DETIES, NUMBER OF EMPLOYEES....' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// after click Describe duties, number of employees supervised and
		// responsibilities (0/512 characters)
		try {
			String describedutiesnumberoflabelhead = page.describedutiesnumberoflabelmethod1();
			String describedutiesnumberoflabelexcel = Excelreader.getData(0, 93, 5);
			if (describedutiesnumberoflabelhead.equals(describedutiesnumberoflabelexcel)) {
				test.pass("TC:29 THE LABEL 'DESCRIBE DETIES, NUMBER OF EMPLOYEES.... ' IS ROLLED UP ");
			} else {
				test.fail("TC:29 THE LABEL 'DESCRIBE DETIES, NUMBER OF EMPLOYEES....' IS NOT ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'DESCRIBE DETIES, NUMBER OF EMPLOYEES....' IS NOT ROLLED UP");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send numerical and special character in describe deties, number of employee
		try {
			String describedutiesnumbersendedexcel = Excelreader.getData(0, 94, 5);
			String describedutiesnumbersendedhead = page
					.describedutiesnumbersendedmethod(describedutiesnumbersendedexcel);
			if (describedutiesnumbersendedhead.equals(describedutiesnumbersendedexcel)) {
				test.pass(
						"TC:29 USER SHOULD BE SEND  ALL CHARACTERS IN 'DESCRIBE DETIES, NUMBER OF EMPLOYEES.... ' FUNCTION");
			} else {
				test.fail(
						"TC:29 USER SHOULD BE SEND  ALL CHARACTERS IN 'DESCRIBE DETIES, NUMBER OF EMPLOYEES....' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND ALL CHARACTERS IN 'DESCRIBE DETIES, NUMBER OF EMPLOYEES....' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send more than 512 numerical and special character in describe deties, number
		// of employee
		try {
			String describedutiesnumbersendedexcel = Excelreader.getData(0, 95, 5);
			String describedutiesnumbersendedhead = page
					.describedutiesnumbersendedmethod(describedutiesnumbersendedexcel);
			if (describedutiesnumbersendedhead.equals(describedutiesnumbersendedexcel)) {
				test.pass(
						"TC:29 USER SHOULD BE SEND MORE THAN 512 ALL CHARACTERS IN 'DESCRIBE DETIES, NUMBER OF EMPLOYEES.... ' FUNCTION");
				//
				String describedutiesnumberoferrormessagehead = page.describedutiesnumberoferrormessagemethod();
				String describedutiesnumberoferrormessageexcel = Excelreader.getData(0, 96, 5);
				if (describedutiesnumberoferrormessagehead.equals(describedutiesnumberoferrormessageexcel)) {
					test.pass("TC:29 COMPANY NAME 'ERROR MESSAGE DISPLAYED' -->" + "'"
							+ describedutiesnumberoferrormessagehead + "'");
				} else {
					test.fail("TC:29 'COMPANY NAME' ERROR MESSAGE IS NOT DISPLAYED");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "COMPANY NAME ERROR MESSAGE IS NOT DISPLAYED");
				}
			} else {
				test.fail(
						"TC:29 USER SHOULD BE SEND MORE THAN 512 ALL CHARACTERS IN 'DESCRIBE DETIES, NUMBER OF EMPLOYEES....' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD NOT SEND MORE THAN 30 ALL CHARACTERS IN 'DESCRIBE DETIES, NUMBER OF EMPLOYEES....' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE
		try {
			String describedutiesnumberoferrormessagehead = page.describedutiesnumberoferrormessagemethod1();
			String describedutiesnumberoferrormessageexcel = Excelreader.getData(0, 96, 6);
			if (describedutiesnumberoferrormessagehead.equals(describedutiesnumberoferrormessageexcel)) {
				test.pass("TC:29 DESCRIBE DETIES, NUMBER OF EMPLOYEES.. 'ERROR MESSAGE DISPLAYED' -->" + "'"
						+ describedutiesnumberoferrormessagehead + "'");
			} else {
				test.fail("TC:29 'DESCRIBE DETIES, NUMBER OF EMPLOYEES..' ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "DESCRIBE DETIES, NUMBER OF EMPLOYEES.. ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 21)
	public void Business_Or_Franchise_Information() { //
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Business_Or_Franchise_Information");

		// Business or Franchise information
		try {
			String businessorfranchisehead = page.businessorfranchisemethod();
			String businessorfranchiseexcel = Excelreader.getData(0, 97, 5);
			if (businessorfranchisehead.equals(businessorfranchiseexcel)) {
				test.pass("TC:30 THE LABEL 'BUSINESS OR FRANCHISE INFORMATION ' IS DISPLAYED ");
			} else {
				test.fail("TC:30 THE LABEL 'BUSINESS OR FRANCHISE INFORMATION' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'BUSINESS OR FRANCHISE INFORMATION' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// *Have you ever owned your own business or franchise? (0/512 characters)
		try {
			String haveyoueverownedyourownlabelhead = page.haveyoueverownedyourownlabelmethod();
			String haveyoueverownedyourownlabelexcel = Excelreader.getData(0, 98, 5);
			if (haveyoueverownedyourownlabelhead.equals(haveyoueverownedyourownlabelexcel)) {
				test.pass("TC:31 THE LABEL 'HAVE YOU EVER OWNED YOUR OWN BUSINESS... ' IS DISPLAYED ");
			} else {
				test.fail("TC:31 THE LABEL 'HAVE YOU EVER OWNED YOUR OWN BUSINESS...' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'HAVE YOU EVER OWNED YOUR OWN BUSINESS...' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// after click *Have you ever owned your own business or franchise? (0/512
		// characters)
		try {
			String haveyoueverownedyourownlabelhead = page.haveyoueverownedyourownlabelmethod1();
			String haveyoueverownedyourownlabelexcel = Excelreader.getData(0, 98, 5);
			if (haveyoueverownedyourownlabelhead.equals(haveyoueverownedyourownlabelexcel)) {
				test.pass("TC:31 THE LABEL 'HAVE YOU EVER OWNED YOUR OWN BUSINESS... ' IS ROLLED UP ");
			} else {
				test.fail("TC:31 THE LABEL 'HAVE YOU EVER OWNED YOUR OWN BUSINESS...' IS NOT ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'HAVE YOU EVER OWNED YOUR OWN BUSINESS...' IS NOT ROLLED UP");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send all values on have you ever owned your own business
		try {
			String haveyoueverownedyourownsendedvalexcel = Excelreader.getData(0, 99, 5);
			String haveyoueverownedyourownsendedvalhead = page
					.haveyoueverownedyourownsendedvalmethod(haveyoueverownedyourownsendedvalexcel);
			if (haveyoueverownedyourownsendedvalhead.equals(haveyoueverownedyourownsendedvalexcel)) {
				test.pass(
						"TC:31 USER SHOULD BE SEND  ALL CHARACTERS IN 'HAVE YOU EVER OWNED YOUR OWN BUSINESS.... ' FUNCTION");
			} else {
				test.fail(
						"TC:31 USER SHOULD BE SEND  ALL CHARACTERS IN 'HAVE YOU EVER OWNED YOUR OWN BUSINESS....' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND ALL CHARACTERS IN 'HAVE YOU EVER OWNED YOUR OWN BUSINESS....' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send MORET THAN 512 all values on have you ever owned your own business
		try {
			String haveyoueverownedyourownsendedvalexcel = Excelreader.getData(0, 100, 5);
			String haveyoueverownedyourownsendedvalhead = page
					.haveyoueverownedyourownsendedvalmethod(haveyoueverownedyourownsendedvalexcel);
			if (haveyoueverownedyourownsendedvalhead.equals(haveyoueverownedyourownsendedvalexcel)) {
				test.pass(
						"TC:31 USER SHOULD BE SEND MORE THAN 512 ALL CHARACTERS IN 'HAVE YOU EVER OWNED YOUR OWN BUSINESS.... ' FUNCTION");
				String haveyoueverownedyourownerrormessagehead = page.haveyoueverownedyourownerrormessagemethod();
				String haveyoueverownedyourownerrormessageexcel = Excelreader.getData(0, 101, 5);
				if (haveyoueverownedyourownerrormessagehead.equals(haveyoueverownedyourownerrormessageexcel)) {
					test.pass(
							"TC:31 AFTER SEND MORE THAN 512 HAVE YOU EVER OWNED YOUR OWN BUSINESS.... 'ERROR MESSAGE DISPLAYED' -->"
									+ "'" + haveyoueverownedyourownerrormessagehead + "'");
				} else {
					test.fail(
							"TC:31 AFTER SEND MORE THAN 512 HAVE YOU EVER OWNED YOUR OWN BUSINESS....' ERROR MESSAGE IS NOT DISPLAYED");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "HAVE YOU EVER OWNED YOUR OWN BUSINESS.... ERROR MESSAGE IS NOT DISPLAYED");
				}
			} else {
				test.fail(
						"TC:31 USER SHOULD BE SEND MORE THAN 512 ALL CHARACTERS IN 'HAVE YOU EVER OWNED YOUR OWN BUSINESS....' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND ALL CHARACTERS IN 'HAVE YOU EVER OWNED YOUR OWN BUSINESS....' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE
		try {
			String haveyoueverownedyourownerrormessagehead = page.haveyoueverownedyourownerrormessagemethod1();
			String haveyoueverownedyourownerrormessageexcel = Excelreader.getData(0, 101, 6);
			if (haveyoueverownedyourownerrormessagehead.equals(haveyoueverownedyourownerrormessageexcel)) {
				test.pass("TC:31 HAVE YOU EVER OWNED YOUR OWN BUSINESS.... 'ERROR MESSAGE DISPLAYED' -->" + "'"
						+ haveyoueverownedyourownerrormessagehead + "'");
			} else {
				test.fail("TC:31 HAVE YOU EVER OWNED YOUR OWN BUSINESS....' ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "HAVE YOU EVER OWNED YOUR OWN BUSINESS.... ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 22)
	public void Have_you_ever_Had_Business() { //
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Have_you_ever_Had_Business");

		// *Have you ever had a business failure? (0/512 characters)
		try {
			String haveyoueverhadbusinesslabelhead = page.haveyoueverhadbusinesslabelmethod();
			String haveyoueverhadbusinesslabelexcel = Excelreader.getData(0, 102, 5);
			if (haveyoueverhadbusinesslabelhead.equals(haveyoueverhadbusinesslabelexcel)) {
				test.pass("TC:32 THE LABEL 'HAVE YOU EVER HAD A BUSINESS FAILURE... ' IS DISPLAYED ");
			} else {
				test.fail("TC:32 THE LABEL 'HAVE YOU EVER HAD A BUSINESS FAILURE...' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'HAVE YOU EVER HAD A BUSINESS FAILURE...' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTE CLICK *Have you ever had a business failure? (0/512 characters)
		try {
			String haveyoueverhadbusinesslabelhead = page.haveyoueverhadbusinesslabelmethod1();
			String haveyoueverhadbusinesslabelexcel = Excelreader.getData(0, 102, 5);
			if (haveyoueverhadbusinesslabelhead.equals(haveyoueverhadbusinesslabelexcel)) {
				test.pass("TC:32 THE LABEL 'HAVE YOU EVER HAD A BUSINESS FAILURE... ' IS ROLLED UP ");
			} else {
				test.fail("TC:32 THE LABEL 'HAVE YOU EVER HAD A BUSINESS FAILURE...' IS NOT ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'HAVE YOU EVER HAD A BUSINESS FAILURE...' IS NOT ROLLED UP");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send all values on Have you ever had a business failure
		try {
			String haveyoueverhadbusinesssendedvalexcel = Excelreader.getData(0, 103, 5);
			String haveyoueverhadbusinesssendedvalhead = page
					.haveyoueverhadbusinesssendedvalmethod(haveyoueverhadbusinesssendedvalexcel);
			if (haveyoueverhadbusinesssendedvalhead.equals(haveyoueverhadbusinesssendedvalexcel)) {
				test.pass(
						"TC:32 USER SHOULD BE SEND  ALL CHARACTERS IN 'HAVE YOU EVER HAD A BUSINESS FAILURE.. ' FUNCTION");
			} else {
				test.fail(
						"TC:32 USER SHOULD BE SEND  ALL CHARACTERS IN 'HAVE YOU EVER HAD A BUSINESS FAILURE.. ..' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND ALL CHARACTERS IN 'HAVE YOU EVER HAD A BUSINESS FAILURE.. ' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send MORE THAN 512 all values on Have you ever had a business failure
		try {
			String haveyoueverhadbusinesssendedvalexcel = Excelreader.getData(0, 104, 5);
			String haveyoueverhadbusinesssendedvalhead = page
					.haveyoueverhadbusinesssendedvalmethod(haveyoueverhadbusinesssendedvalexcel);
			if (haveyoueverhadbusinesssendedvalhead.equals(haveyoueverhadbusinesssendedvalexcel)) {
				test.pass(
						"TC:32 USER SHOULD BE SEND MORE THAN 512 ALL CHARACTERS IN 'HAVE YOU EVER HAD A BUSINESS FAILURE.. ' FUNCTION");
				String haveyoueverhadbusinesserrormessagehead = page.haveyoueverhadbusinesserrormessagemethod();
				String haveyoueverhadbusinesserrormessageexcel = Excelreader.getData(0, 105, 5);
				if (haveyoueverhadbusinesserrormessagehead.equals(haveyoueverhadbusinesserrormessageexcel)) {
					test.pass("TC:32 HAVE YOU EVER HAD A BUSINESS FAILURE.. 'ERROR MESSAGE DISPLAYED' -->" + "'"
							+ haveyoueverhadbusinesserrormessagehead + "'");
				} else {
					test.fail("TC:32 HAVE YOU EVER HAD A BUSINESS FAILURE...' ERROR MESSAGE IS NOT DISPLAYED");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "HAVE YOU EVER OWNED YOUR OWN BUSINESS.... ERROR MESSAGE IS NOT DISPLAYED");
				}
			} else {
				test.fail(
						"TC:32 USER SHOULD BE SEND MORE THAN 512 ALL CHARACTERS IN 'HAVE YOU EVER HAD A BUSINESS FAILURE.. ..' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND MORE THAN 512 ALL CHARACTERS IN 'HAVE YOU EVER HAD A BUSINESS FAILURE.. ' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE
		try {
			String haveyoueverhadbusinesserrormessagehead = page.haveyoueverhadbusinesserrormessagemethod1();
			String haveyoueverhadbusinesserrormessageexcel = Excelreader.getData(0, 105, 6);
			if (haveyoueverhadbusinesserrormessagehead.equals(haveyoueverhadbusinesserrormessageexcel)) {
				test.pass("TC:32 HAVE YOU EVER HAD A BUSINESS FAILURE.. 'ERROR MESSAGE DISPLAYED' -->" + "'"
						+ haveyoueverhadbusinesserrormessagehead + "'");
			} else {
				test.fail("TC:32 HAVE YOU EVER HAD A BUSINESS FAILURE...' ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "HAVE YOU EVER OWNED YOUR OWN BUSINESS.... ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 23)
	public void Total_Assets_InUS() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Total_Assets_InUS");
		
		/*try {
			driver.get(Basepage.readProperty("urlF"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equalsIgnoreCase(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");
			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "URL IS NOT OPENED");
				extent.flush();
				driver.close();
				throw new SkipException("Skipping - ");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
			extent.flush();
			driver.close();
			throw new SkipException("Skipping - ");

		}*/

		// *Total assets (in US $)
		try {
			String totalassetslabelhead = page.totalassetslabelmethod();
			String totalassetslabelexcel = Excelreader.getData(0, 106, 5);
			if (totalassetslabelhead.equals(totalassetslabelexcel)) {
				test.pass("TC:33 THE LABEL 'TOTAL ASSETS (IN US $) ' IS DISPLAYED ");
			} else {
				test.fail("TC:33 THE LABEL 'TOTAL ASSETS (IN US $)' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'TOTAL ASSETS (IN US $)' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK *Total assets (in US $)
		try {
			String totalassetslabelhead = page.totalassetslabelmethod1();
			String totalassetslabelexcel = Excelreader.getData(0, 106, 5);
			if (totalassetslabelhead.equals(totalassetslabelexcel)) {
				test.pass("TC:33 THE LABEL 'TOTAL ASSETS (IN US $) ' IS ROLLED UP ");
			} else {
				test.fail("TC:33 THE LABEL 'TOTAL ASSETS (IN US $)' IS NOT ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'TOTAL ASSETS (IN US $)' IS NOT ROLLED UP");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// SEND NUMARICAL ON TOTAL ASSETS
		try {
			String tatalassetssendedvalueexcel = Excelreader.getData(0, 107, 5);
			String tatalassetssendedvaluehead = page.tatalassetssendedvaluemethod(tatalassetssendedvalueexcel);
			if (tatalassetssendedvaluehead.equals(tatalassetssendedvalueexcel)) {
				test.pass("TC:33 USER SHOULD BE SEND  NUMARICAL IN 'TOTAL ASSETS (IN US $)' FUNCTION");
			} else {
				test.fail("TC:33 USER SHOULD BE SEND NUMARICAL IN 'TOTAL ASSETS (IN US $)' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND NUMARICAL IN 'TOTAL ASSETS (IN US $) ' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// SEND MORE THAN 15 NUMARICAL ON TOTAL ASSETS
		try {
			String tatalassetssendedvalueexcel = Excelreader.getData(0, 108, 5);
			String tatalassetssendedvaluehead = page.tatalassetssendedvaluemethod(tatalassetssendedvalueexcel);
			if (!tatalassetssendedvaluehead.equals(tatalassetssendedvalueexcel)) {
				test.pass("TC:33 USER SHOULD NOT SEND MORE THAN 15 NUMARICAL IN 'TOTAL ASSETS (IN US $)' FUNCTION");
			} else {
				test.fail("TC:33 USER SHOULD NOT SEND MORE THAN 15 NUMARICAL IN 'TOTAL ASSETS (IN US $)' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD NOT SEND MORE THAN 15 NUMARICAL IN 'TOTAL ASSETS (IN US $) ' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// SEND CHARACTERS AND SPECIAL CHARACTERS ON TOTAL ASSETS
		try {
			String tatalassetssendedvalueexcel = Excelreader.getData(0, 109, 5);
			String tatalassetssendedvaluehead = page.tatalassetssendedvaluemethod(tatalassetssendedvalueexcel);
			if (!tatalassetssendedvaluehead.equals(tatalassetssendedvalueexcel)) {
				test.pass(
						"TC:33 USER SHOULD NOT SEND CHARACTERS AND SPECIAL CHARACTERS IN 'TOTAL ASSETS (IN US $)' FUNCTION");
			} else {
				test.fail(
						"TC:33 USER SHOULD NOT SEND CHARACTERS AND SPECIAL CHARACTERS IN 'TOTAL ASSETS (IN US $)' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD NOT SEND MCHARACTERS AND SPECIAL CHARACTERS IN 'TOTAL ASSETS (IN US $) ' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE
		try {
			String totalassetserrormessagehead = page.totalassetserrormessagemethod();
			String totalassetserrormessageexcel = Excelreader.getData(0, 110, 5);
			if (totalassetserrormessagehead.equals(totalassetserrormessageexcel)) {
				test.pass("TC:33 TOTAL ASSETS (IN US $).. 'ERROR MESSAGE DISPLAYED' -->" + "'"
						+ totalassetserrormessagehead + "'");
			} else {
				test.fail("TC:33 TOTAL ASSETS (IN US $)' ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "TOTAL ASSETS (IN US $). ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 24)
	public void Total_Debt_InUS() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Total_Debt_InUS");
		
		/*try {
			driver.get(Basepage.readProperty("urlF"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equalsIgnoreCase(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");
			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "URL IS NOT OPENED");
				extent.flush();
				driver.close();
				throw new SkipException("Skipping - ");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
			extent.flush();
			driver.close();
			throw new SkipException("Skipping - ");

		}*/

		// *Total debt (in US $) LABEL
		try {
			String totaldebtlabelhead = page.totaldebtlabelmethod();
			String totaldebtlabelexcel = Excelreader.getData(0, 111, 5);
			if (totaldebtlabelhead.equals(totaldebtlabelexcel)) {
				test.pass("TC:34 THE LABEL 'TOTAL DEBT (IN US $) ' IS DISPLAYED ");
			} else {
				test.fail("TC:34 THE LABEL 'TOTAL DEBT (IN US $)' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'TOTAL DEBT (IN US $)' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK *Total debt (in US $) LABEL
		try {
			String totaldebtlabelhead = page.totaldebtlabelmethod1();
			String totaldebtlabelexcel = Excelreader.getData(0, 111, 5);
			if (totaldebtlabelhead.equals(totaldebtlabelexcel)) {
				test.pass("TC:34 THE LABEL 'TOTAL DEBT (IN US $) ' IS ROLLED UP ");
			} else {
				test.fail("TC:34 THE LABEL 'TOTAL DEBT (IN US $)' IS NOT ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'TOTAL DEBT (IN US $)' IS NOT ROLLED UP");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// SEND NUMARICAL ON TOTAL debt
		try {
			String totaldebtsendedvalueexcel = Excelreader.getData(0, 112, 5);
			String totaldebtsendedvaluehead = page.totaldebtsendedvaluemethod(totaldebtsendedvalueexcel);
			if (totaldebtsendedvaluehead.equals(totaldebtsendedvalueexcel)) {
				test.pass("TC:34 USER SHOULD BE SEND  NUMARICAL IN 'TOTAL DEBT (IN US $) ' FUNCTION");
			} else {
				test.fail("TC:34 USER SHOULD BE SEND NUMARICAL IN 'TOTAL DEBT (IN US $) ' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND NUMARICAL IN 'TOTAL DEBT (IN US $) ' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// SEND MORE THAN 15 NUMARICAL ON TOTAL debt
		try {
			String totaldebtsendedvalueexcel = Excelreader.getData(0, 113, 5);
			String totaldebtsendedvaluehead = page.totaldebtsendedvaluemethod(totaldebtsendedvalueexcel);
			if (!totaldebtsendedvaluehead.equals(totaldebtsendedvalueexcel)) {
				test.pass("TC:34 USER SHOULD NOT SEND MORE THAN 15 NUMARICAL IN 'TOTAL DEBT (IN US $) ' FUNCTION");
			} else {
				test.fail("TC:34 USER SHOULD NOT SEND MORE THAN 15 NUMARICAL IN 'TOTAL DEBT (IN US $) ' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD NOT SEND MORE THAN 15 NUMARICAL IN 'TOTAL DEBT (IN US $) ' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		//// SEND CHARACTERS AND SPECIAL CHARACTERS ON TOTAL debt
		try {
			String totaldebtsendedvalueexcel = Excelreader.getData(0, 114, 5);
			String totaldebtsendedvaluehead = page.totaldebtsendedvaluemethod(totaldebtsendedvalueexcel);
			if (!totaldebtsendedvaluehead.equals(totaldebtsendedvalueexcel)) {
				test.pass(
						"TC:34 USER SHOULD NOT SEND CHARACTERS AND SPECIAL CHARACTERS IN 'TOTAL DEBT (IN US $) ' FUNCTION");
			} else {
				test.fail(
						"TC:34 USER SHOULD NOT SEND CHARACTERS AND SPECIAL CHARACTERS IN 'TOTAL DEBT (IN US $) ' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD NOT SEND CHARACTERS AND SPECIAL CHARACTERS IN 'TOTAL DEBT (IN US $) ' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE
		try {
			String totaldebterrormessagehead = page.totaldebterrormessagemethod();
			String totaldebterrormessageexcel = Excelreader.getData(0, 115, 5);
			if (totaldebterrormessagehead.equals(totaldebterrormessageexcel)) {
				test.pass("TC:34 TOTAL DEBT (IN US $).. 'ERROR MESSAGE DISPLAYED' -->" + "'" + totaldebterrormessagehead
						+ "'");
			} else {
				test.fail("TC:33 TOTAL DEBT (IN US $)' ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "TOTAL DEBT (IN US $).. ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 25)
	public void Net_Worth_Assets_Minus_Debt() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Net_Worth_Assets_Minus_Debt");

		// *Net worth (assets minus debt) (in US $)
		try {
			String networthlabelhead = page.networthlabelmethod1();
			String networthlabelexcel = Excelreader.getData(0, 116, 5);
			if (networthlabelhead.equals(networthlabelexcel)) {
				test.pass("TC:35 THE LABEL 'NET WORTH (ASSETS MINUS DEBT) (IN US $) ' IS DISPLAYED ");
			} else {
				test.fail("TC:35 THE LABEL 'NET WORTH (ASSETS MINUS DEBT) (IN US $)' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'NET WORTH (ASSETS MINUS DEBT) (IN US $)' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// CHECK ASSETS MINUS DEBT
		try {
			String tatalassetssendedvalueexcel = Excelreader.getData(0, 107, 5);
			String tatalassetssendedvaluehead = page.tatalassetssendedvaluemethod(tatalassetssendedvalueexcel);
			if (tatalassetssendedvaluehead.equals(tatalassetssendedvalueexcel)) {
				test.pass("TC:33 USER SHOULD BE SEND  NUMARICAL IN 'TOTAL ASSETS (IN US $)' FUNCTION");
				// SEND NUMARICAL ON TOTAL debt
				String totaldebtsendedvalueexcel = Excelreader.getData(0, 112, 5);
				String totaldebtsendedvaluehead = page.totaldebtsendedvaluemethod(totaldebtsendedvalueexcel);
				if (totaldebtsendedvaluehead.equals(totaldebtsendedvalueexcel)) {
					test.pass("TC:34 USER SHOULD BE SEND  NUMARICAL IN 'TOTAL DEBT (IN US $) ' FUNCTION");
					// NET WORTH (ASSETS MINUS DEBT) (IN US $)
					String networthvalueexcel = Excelreader.getData(0, 117, 5);
					String networthvaluehead = page.networthvaluemethod();
					if (networthvaluehead.equals(networthvalueexcel)) {
						test.pass(
								"TC:35 USER SHOULD BE ASSETS MINUS DEBT NUMARICAL IN 'NET WORTH (ASSETS MINUS DEBT) (IN US $) ' FUNCTION");
					} else {
						test.fail(
								"TC:35 USER SHOULD BE ASSETS MINUS DEBT NUMARICAL IN 'NET WORTH (ASSETS MINUS DEBT) (IN US $) ' FUNCTION");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
								+ "USER SHOULD BE ASSETS MINUS DEBT NUMARICAL IN 'NET WORTH (ASSETS MINUS DEBT) (IN US $) ' FUNCTION");
					}
					//
					String networthlabelhead = page.networthlabelmethod();
					String networthlabelexcel = Excelreader.getData(0, 116, 5);
					if (networthlabelhead.equals(networthlabelexcel)) {
						test.pass("TC:35 THE LABEL 'NET WORTH (ASSETS MINUS DEBT) (IN US $) ' IS ROLLED UP ");
					} else {
						test.fail("TC:35 THE LABEL 'NET WORTH (ASSETS MINUS DEBT) (IN US $)' IS NOT ROLLED UP");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
								+ "THE LABEL 'NET WORTH (ASSETS MINUS DEBT) (IN US $)' IS NOT ROLLED UP");
					}
				} else {
					test.fail("TC:34 USER SHOULD BE SEND NUMARICAL IN 'TOTAL DEBT (IN US $) ' FUNCTION");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "USER SHOULD BE SEND NUMARICAL IN 'TOTAL DEBT (IN US $) ' FUNCTION");
				}
			} else {
				test.fail("TC:33 USER SHOULD BE SEND NUMARICAL IN 'TOTAL ASSETS (IN US $)' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND NUMARICAL IN 'TOTAL ASSETS (IN US $) ' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE
		try {
			String networtherrormessagehead = page.networtherrormessagemethod();
			String networtherrormessageexcel = Excelreader.getData(0, 118, 5);
			if (networtherrormessagehead.equals(networtherrormessageexcel)) {
				test.pass("TC:34 NET WORTH (ASSETS MINUS DEBT) (IN US $).. 'ERROR MESSAGE DISPLAYED' -->" + "'"
						+ networtherrormessagehead + "'");
			} else {
				test.fail("TC:33 NET WORTH (ASSETS MINUS DEBT) (IN US $)' ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "NET WORTH (ASSETS MINUS DEBT) (IN US $). ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 26)
	public void Total_Non_Borrowed_Funds_Available() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Total_Non_Borrowed_Funds_Available");

		// *Total non-borrowed funds available to invest
		try {
			String totalnonborrowedlabelhead = page.totalnonborrowedlabelmethod();
			String totalnonborrowedlabelexcel = Excelreader.getData(0, 119, 5);
			if (totalnonborrowedlabelhead.equals(totalnonborrowedlabelexcel)) {
				test.pass("TC:36 THE LABEL 'TOTAL NON-BORROWED FUNDS AVAILABLE TO INVEST ' IS DISPLAYED ");
			} else {
				test.fail("TC:36 THE LABEL 'TOTAL NON-BORROWED FUNDS AVAILABLE TO INVEST' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'TOTAL NON-BORROWED FUNDS AVAILABLE TO INVEST' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// select drop down value *Total non-borrowed funds available to invest
		try {
			String totalnonborroweddropdownvaluehead = page.totalnonborroweddropdownvaluemethod();
			String totalnonborroweddropdownvalueexcel = Excelreader.getData(0, 120, 5);
			if (totalnonborroweddropdownvaluehead.equals(totalnonborroweddropdownvalueexcel)) {
				test.pass("TC:36 USER SHOULD BE CLICKABLE OF 'TOTAL NON-BORROWED FUNDS AVAILABLE TO INVEST' ");
				// TOTAL NON-BORROWED FUNDS AVAILABLE ROLLED UP
				String totalnonborrowedlabelhead = page.totalnonborrowedlabelmethod1();
				String totalnonborrowedlabelexcel = Excelreader.getData(0, 119, 5);
				if (totalnonborrowedlabelhead.equals(totalnonborrowedlabelexcel)) {
					test.pass("TC:36 THE LABEL 'TOTAL NON-BORROWED FUNDS AVAILABLE TO INVEST ' IS ROLLED UP ");
				} else {
					test.fail("TC:36 THE LABEL 'TOTAL NON-BORROWED FUNDS AVAILABLE TO INVEST' IS NOT ROLLED UP");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "THE LABEL 'TOTAL NON-BORROWED FUNDS AVAILABLE TO INVEST' IS NOT ROLLED UP");
				}
				// select drop down value
				String totalnonborroweddropdownvaluehead1 = page.totalnonborroweddropdownvaluemethod1();
				String totalnonborroweddropdownvalueexcel1 = Excelreader.getData(0, 120, 5);
				if (totalnonborroweddropdownvaluehead1.equals(totalnonborroweddropdownvalueexcel1)) {
					test.pass(
							"TC:36 USER SHOULD BE SELECT DROP DOWN VALUE ON 'TOTAL NON-BORROWED FUNDS AVAILABLE TO INVEST' FUNCTION");
				} else {
					test.fail(
							"TC:36 USER SHOULD BE SELECT DROP DOWN VALUE ON 'TOTAL NON-BORROWED FUNDS AVAILABLE TO INVEST' FUNCTION");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "USER SHOULD BE SELECT DROP DOWN VALUE ON TOTAL NON-BORROWED FUNDS AVAILABLE TO INVEST FUNCTION");
				}
			} else {
				test.fail("TC:36 USER SHOULD BE CLICKABLE OF 'TOTAL NON-BORROWED FUNDS AVAILABLE TO INVEST'");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE CLICKABLE OF 'TOTAL NON-BORROWED FUNDS AVAILABLE TO INVEST'");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE
		try {
			String totalnonborrowederrormessagehead = page.totalnonborrowederrormessagemethod();
			System.out.println(totalnonborrowederrormessagehead);
			String totalnonborrowederrormessageexcel = Excelreader.getData(0, 121, 5);
			if (totalnonborrowederrormessagehead.equals(totalnonborrowederrormessageexcel)) {
				test.pass("TC:36 TOTAL NON-BORROWED FUNDS AVAILABLE TO INVEST.. 'ERROR MESSAGE DISPLAYED' -->" + "'"
						+ totalnonborrowederrormessagehead + "'");
			} else {
				test.fail("TC:36 TOTAL NON-BORROWED FUNDS AVAILABLE TO INVEST' ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "TOTAL NON-BORROWED FUNDS AVAILABLE TO INVEST. ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 27)
	public void Are_You_Related_By_Blood_Marriage_To_Any_Officer() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Are_You_Related_By_Blood_Marriage_To_Any_Officer");
		// *Are you related by blood or marriage to any officer of McDonald's USA, LLC?
		try {
			String relationwithmcdofficerlbllabelhead = page.relationwithmcdofficerlbllabelmethod();
			String relationwithmcdofficerlbllabelexcel = Excelreader.getData(0, 122, 5);
			if (relationwithmcdofficerlbllabelhead.equals(relationwithmcdofficerlbllabelexcel)) {
				test.pass(
						"TC:37 THE LABEL 'ARE YOU LELATED BY BLOOD OR MARRIAGE TO ANY OFFICER OF McDONALD'S USA, LLC ' IS DISPLAYED ");
			} else {
				test.fail(
						"TC:37 THE LABEL 'ARE YOU LELATED BY BLOOD OR MARRIAGE TO ANY OFFICER OF McDONALD'S USA, LLC' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'ARE YOU LELATED BY BLOOD OR MARRIAGE TO ANY OFFICER OF McDONALD'S USA, LLC' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// YES
		try {
			String yesrelationwithmcdofficerlbllabelhead = page.yesrelationwithmcdofficerlbllabelmethod();
			String yesrelationwithmcdofficerlbllabelexcel = Excelreader.getData(0, 123, 5);
			if (yesrelationwithmcdofficerlbllabelhead.equals(yesrelationwithmcdofficerlbllabelexcel)) {
				test.pass(
						"TC:37 THE LABEL 'YES OF ARE YOU LELATED BY BLOOD OR MARRIAGE TO ANY OFFICER OF McDONALD'S USA, LLC ' IS DISPLAYED ");
			} else {
				test.fail(
						"TC:37 THE LABEL 'YES OF YOU LELATED BY BLOOD OR MARRIAGE TO ANY OFFICER OF McDONALD'S USA, LLC' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'YES OF ARE YOU LELATED BY BLOOD OR MARRIAGE TO ANY OFFICER OF McDONALD'S USA, LLC' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// NO
		try {
			String norelationwithmcdofficerlbllabelhead = page.norelationwithmcdofficerlbllabelmethod();
			String norelationwithmcdofficerlbllabelexcel = Excelreader.getData(0, 124, 5);
			if (norelationwithmcdofficerlbllabelhead.equals(norelationwithmcdofficerlbllabelexcel)) {
				test.pass(
						"TC:37 THE LABEL 'NO OF ARE YOU LELATED BY BLOOD OR MARRIAGE TO ANY OFFICER OF McDONALD'S USA, LLC ' IS DISPLAYED ");
			} else {
				test.fail(
						"TC:37 THE LABEL 'NO OF YOU LELATED BY BLOOD OR MARRIAGE TO ANY OFFICER OF McDONALD'S USA, LLC' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'NO OF ARE YOU LELATED BY BLOOD OR MARRIAGE TO ANY OFFICER OF McDONALD'S USA, LLC' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// yes radio button
		try {
			String yesrelationwithmcdofficerlblradiobuttonhead = page.yesrelationwithmcdofficerlblradiobuttonmethod();
			if (!yesrelationwithmcdofficerlblradiobuttonhead.equals("true")) {
				test.pass(
						"TC:37 YES RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON ARE YOU LELATED BY BLOOD OR MARRIAGE TO ANY OFFICER OF McDONALD'S USA, LLC");
			} else {
				test.fail(
						"TC:37 YES RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON ARE YOU LELATED BY BLOOD OR MARRIAGE TO ANY OFFICER OF McDONALD'S USA, LLC");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "YES RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON ARE YOU LELATED BY BLOOD OR MARRIAGE TO ANY OFFICER OF McDONALD'S USA, LLC");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// no radio button
		try {
			String norelationwithmcdofficerlblradiobuttonhead = page.norelationwithmcdofficerlblradiobuttonmethod();
			if (!norelationwithmcdofficerlblradiobuttonhead.equals("true")) {
				test.pass(
						"TC:37 NO RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON ARE YOU LELATED BY BLOOD OR MARRIAGE TO ANY OFFICER OF McDONALD'S USA, LLC");
			} else {
				test.fail(
						"TC:37 NO RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON ARE YOU LELATED BY BLOOD OR MARRIAGE TO ANY OFFICER OF McDONALD'S USA, LLC");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "NO RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON ARE YOU LELATED BY BLOOD OR MARRIAGE TO ANY OFFICER OF McDONALD'S USA, LLC");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// CLICK yes radio button
		try {
			String yesrelationwithmcdofficerlblradiobuttonhead1 = page
					.yesrelationwithmcdofficerlblradiobuttonclickmethod();
			if (yesrelationwithmcdofficerlblradiobuttonhead1.equals("true")) {
				test.pass(
						"TC:37 YES RADIO BUTTON SHOULD BE CLICKABLE ON ARE YOU LELATED BY BLOOD OR MARRIAGE TO ANY OFFICER OF McDONALD'S USA, LLC");
			} else {
				test.fail(
						"TC:37 YES RADIO BUTTON SHOULD BE CLICKABLE ON ARE YOU LELATED BY BLOOD OR MARRIAGE TO ANY OFFICER OF McDONALD'S USA, LLC");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "YES RADIO BUTTON SHOULD BE CLICKABLE ON ARE YOU LELATED BY BLOOD OR MARRIAGE TO ANY OFFICER OF McDONALD'S USA, LLC");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// CLICK NO radio button
		try {
			String norelationwithmcdofficerlblradiobuttonclickhead = page
					.norelationwithmcdofficerlblradiobuttonclickmethod();
			if (norelationwithmcdofficerlblradiobuttonclickhead.equals("true")) {
				test.pass(
						"TC:37 NO RADIO BUTTON SHOULD BE CLICKABLE ON ARE YOU LELATED BY BLOOD OR MARRIAGE TO ANY OFFICER OF McDONALD'S USA, LLC");
				// YES BUTTON CHECK AFTER SELECT NO RAIDO BUTTON
				String yesrelationwithmcdofficerlblradiobuttonhead = page
						.yesrelationwithmcdofficerlblradiobuttonmethod();
				if (!yesrelationwithmcdofficerlblradiobuttonhead.equals("true")) {
					test.pass(
							"TC:37 USER SHOULD NOT SELECT BOTH YES AND NO RADIO BUTTON ON ARE YOU LELATED BY BLOOD OR MARRIAGE TO ANY OFFICER OF McDONALD'S USA, LLC");
				} else {
					test.fail(
							"TC:37 USER SHOULD NOT SELECT BOTH YES AND NO RADIO BUTTON ON ARE YOU LELATED BY BLOOD OR MARRIAGE TO ANY OFFICER OF McDONALD'S USA, LLC");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "USER SHOULD NOT SELECT BOTH YES AND NO RADIO BUTTON ON ARE YOU LELATED BY BLOOD OR MARRIAGE TO ANY OFFICER OF McDONALD'S USA, LLC");
				}
			} else {
				test.fail(
						"TC:37 NO RADIO BUTTON SHOULD BE CLICKABLE ON ARE YOU LELATED BY BLOOD OR MARRIAGE TO ANY OFFICER OF McDONALD'S USA, LLC");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "NO RADIO BUTTON SHOULD BE CLICKABLE ON ARE YOU LELATED BY BLOOD OR MARRIAGE TO ANY OFFICER OF McDONALD'S USA, LLC");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE
		try {
			String relationwithmcdofficerlblerromessagehead = page.relationwithmcdofficerlblerromessagemethod();
			String relationwithmcdofficerlblerromessageexcel = Excelreader.getData(0, 125, 5);
			if (relationwithmcdofficerlblerromessagehead.equals(relationwithmcdofficerlblerromessageexcel)) {
				test.pass(
						"TC:37 NO OF ARE YOU LELATED BY BLOOD OR MARRIAGE TO ANY OFFICER OF McDONALD'S USA, LLC.. 'ERROR MESSAGE DISPLAYED' -->"
								+ "'" + relationwithmcdofficerlblerromessagehead + "'");
			} else {
				test.fail(
						"TC:37 NO OF ARE YOU LELATED BY BLOOD OR MARRIAGE TO ANY OFFICER OF McDONALD'S USA, LLC' ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "NO OF ARE YOU LELATED BY BLOOD OR MARRIAGE TO ANY OFFICER OF McDONALD'S USA, LLC. ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 28)
	public void Relation_First_Name_Of_Marriage_To_AnyOfficer() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Relation_First_Name_Of_Marriage_To_AnyOfficer");

		// Relation's First Name
		try {
			String relationfirstnamemarriageofficerlabelhead = page.relationfirstnamemarriageofficerlabelmethod();
			String relationfirstnamemarriageofficerlabelexcel = Excelreader.getData(0, 126, 5);
			if (relationfirstnamemarriageofficerlabelhead.equals(relationfirstnamemarriageofficerlabelexcel)) {
				test.pass(
						"TC:38 THE LABEL 'RELATION'S FIRST NAME OF ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OFFICER.. ' IS DISPLAYED ");
			} else {
				test.fail(
						"TC:38 THE LABEL 'RELATION'S FIRST NAME OF ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OFFICER.. ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'RELATION'S FIRST NAME OF ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OFFICER.. IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// CLCIK Relation's First Name
		try {
			String relationfirstnamemarriageofficerlabelhead = page.relationfirstnamemarriageofficerlabelmethod1();
			String relationfirstnamemarriageofficerlabelexcel = Excelreader.getData(0, 126, 5);
			if (relationfirstnamemarriageofficerlabelhead.equals(relationfirstnamemarriageofficerlabelexcel)) {
				test.pass(
						"TC:38 THE LABEL 'RELATION'S FIRST NAME OF ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OFFICER.. ' IS ROLLED UP ");
			} else {
				test.fail(
						"TC:38 THE LABEL 'RELATION'S FIRST NAME OF ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OFFICER.. ' IS NOT ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'RELATION'S FIRST NAME OF ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OFFICER.. IS NOT ROLLED UP");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send all values SPECIAL
		try {
			String relationfirstnamemarriageofficerexcel = Excelreader.getData(0, 127, 5);
			String relationfirstnamemarriageofficerhead = page
					.relationfirstnamemarriageofficermethod(relationfirstnamemarriageofficerexcel);
			if (relationfirstnamemarriageofficerhead.equals(relationfirstnamemarriageofficerexcel)) {
				test.pass(
						"TC:38 USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATION FIRST NAME' FUNCTION");
			} else {
				test.fail(
						"TC:38 USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATION FIRST NAME' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATION FIRST NAME' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send MORE THAN 20 all values SPECIAL
		try {
			String relationfirstnamemarriageofficerexcel = Excelreader.getData(0, 128, 5);
			String relationfirstnamemarriageofficerhead = page
					.relationfirstnamemarriageofficermethod(relationfirstnamemarriageofficerexcel);
			if (!relationfirstnamemarriageofficerhead.equals(relationfirstnamemarriageofficerexcel)) {
				test.pass(
						"TC:38 USER SHOULD NOT SEND MORE THAN 20 ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATION FIRST NAME' FUNCTION");
			} else {
				test.fail(
						"TC:38 USER SHOULD NOT SEND MORE THAN 20 ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATION FIRST NAME' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD NOT SEND MORE THAN 20 ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATION FIRST NAME' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 29)
	public void Relation_Last_Name_Of_Marriage_To_AnyOfficer() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Relation_Last_Name_Of_Marriage_To_AnyOfficer");

		// Relation's last Name
		try {
			String relationlastnamemarriageofficerlabelhead = page.relationlastnamemarriageofficerlabelmethod();
			String relationlastnamemarriageofficerlabelexcel = Excelreader.getData(0, 129, 5);
			if (relationlastnamemarriageofficerlabelhead.equals(relationlastnamemarriageofficerlabelexcel)) {
				test.pass(
						"TC:39 THE LABEL 'RELATION'S LAST NAME OF ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OFFICER.. ' IS DISPLAYED ");
			} else {
				test.fail(
						"TC:39 THE LABEL 'RELATION'S LAST NAME OF ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OFFICER.. ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'RELATION'S LAST NAME OF ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OFFICER.. IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK Relation's last Name
		try {
			String relationlastnamemarriageofficerlabelhead = page.relationlastnamemarriageofficerlabelmethod1();
			String relationlastnamemarriageofficerlabelexcel = Excelreader.getData(0, 129, 5);
			if (relationlastnamemarriageofficerlabelhead.equals(relationlastnamemarriageofficerlabelexcel)) {
				test.pass(
						"TC:39 THE LABEL 'RELATION'S LAST NAME OF ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OFFICER.. ' IS ROLLED UP ");
			} else {
				test.fail(
						"TC:39 THE LABEL 'RELATION'S LAST NAME OF ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OFFICER.. ' IS NOT ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'RELATION'S LAST NAME OF ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OFFICER.. IS NOT ROLLED UP");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send all values SPECIAL
		try {
			String relationlastnamemarriageofficerexcel = Excelreader.getData(0, 130, 5);
			String relationlastnamemarriageofficerhead = page
					.relationlastnamemarriageofficermethod(relationlastnamemarriageofficerexcel);
			if (relationlastnamemarriageofficerhead.equals(relationlastnamemarriageofficerexcel)) {
				test.pass(
						"TC:39 USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATION LAST NAME' FUNCTION");
			} else {
				test.fail(
						"TC:39 USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATION LAST NAME' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATION LAST NAME' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send MORE THAN 20 all values SPECIAL
		try {
			String relationlastnamemarriageofficerexcel = Excelreader.getData(0, 131, 5);
			String relationlastnamemarriageofficerhead = page
					.relationlastnamemarriageofficermethod(relationlastnamemarriageofficerexcel);
			if (!relationlastnamemarriageofficerhead.equals(relationlastnamemarriageofficerexcel)) {
				test.pass(
						"TC:39 USER SHOULD NOT SEND MORE THAN 20 ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATION LAST NAME' FUNCTION");
			} else {
				test.fail(
						"TC:39 USER SHOULD NOT SEND MORE THAN 20 ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATION LAST NAME' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD NOT SEND MORE THAN 20 ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATION LAST NAME' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 30)
	public void Relationship_Of_Marriage_To_AnyOfficer() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Relationship_Of_Marriage_To_AnyOfficer");

		// Relationship label
		try {
			String relationshipmarriageofficerlabelhead = page.relationshipmarriageofficerlabelmethod();
			String relationshipmarriageofficerlabelexcel = Excelreader.getData(0, 132, 5);
			if (relationshipmarriageofficerlabelhead.equals(relationshipmarriageofficerlabelexcel)) {
				test.pass(
						"TC:40 THE LABEL 'RELATIONSHIP OF ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OFFICER.. ' IS DISPLAYED ");
			} else {
				test.fail(
						"TC:40 THE LABEL 'RELATIONSHIP OF ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OFFICER.. ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'RELATIONSHIP OF ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OFFICER.. IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// after click Relationship label
		try {
			String relationshipmarriageofficerlabelhead = page.relationshipmarriageofficerlabelmethod1();
			String relationshipmarriageofficerlabelexcel = Excelreader.getData(0, 132, 5);
			if (relationshipmarriageofficerlabelhead.equals(relationshipmarriageofficerlabelexcel)) {
				test.pass(
						"TC:40 THE LABEL 'RELATIONSHIP OF ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OFFICER.. ' IS ROLLED UP ");
			} else {
				test.fail(
						"TC:40 THE LABEL 'RELATIONSHIP OF ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OFFICER.. ' IS NOT ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'RELATIONSHIP OF ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OFFICER.. IS NOT ROLLED UP");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send all values SPECIAL
		try {
			String relationshipmarriageofficerexcel = Excelreader.getData(0, 133, 5);
			String relationshipmarriageofficerhead = page
					.relationshipmarriageofficermethod(relationshipmarriageofficerexcel);
			if (relationshipmarriageofficerhead.equals(relationshipmarriageofficerexcel)) {
				test.pass(
						"TC:40 USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATIONSHIP' FUNCTION");
			} else {
				test.fail(
						"TC:40 USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATIONSHIP' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATIONSHIP' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send MORET THAN 20 all values SPECIAL
		try {
			String relationshipmarriageofficerexcel = Excelreader.getData(0, 134, 5);
			String relationshipmarriageofficerhead = page
					.relationshipmarriageofficermethod(relationshipmarriageofficerexcel);
			if (!relationshipmarriageofficerhead.equals(relationshipmarriageofficerexcel)) {
				test.pass(
						"TC:40 USER SHOULD NOT SEND MORE THAN 20 ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATIONSHIP' FUNCTION");
			} else {
				test.fail(
						"TC:40 USER SHOULD NOT SEND MORE THAN 20 ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATIONSHIP' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD NOT SEND MORE THAN 20 ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATIONSHIP' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 31)
	public void Are_You_Related_By_Marriage_To_Any_Owner() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Are_You_Related_By_Marriage_To_Any_Owner");

		// *Are you related by blood or marriage to any owner of a McDonald's franchise?
		try {
			String franchiserelatedmarriageownerhead = page.franchiserelatedmarriageownermethod();
			String franchiserelatedmarriageownerexcel = Excelreader.getData(0, 135, 5);
			if (franchiserelatedmarriageownerhead.equals(franchiserelatedmarriageownerexcel)) {
				test.pass(
						"TC:41 THE LABEL 'ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.. ' IS DISPLAYED ");
			} else {
				test.fail(
						"TC:41 THE LABEL 'ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.. ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE... IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// yes label of *Are you related by blood or marriage to any owner of a
		// McDonald's franchise?
		try {
			String yesfranchiserelatedmarriageownerhead = page.yesfranchiserelatedmarriageownermethod();
			String yesfranchiserelatedmarriageownerexcel = Excelreader.getData(0, 136, 5);
			if (yesfranchiserelatedmarriageownerhead.equals(yesfranchiserelatedmarriageownerexcel)) {
				test.pass(
						"TC:41 THE LABEL 'YES OF ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.. ' IS DISPLAYED ");
			} else {
				test.fail(
						"TC:41 THE LABEL 'YES OF ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.. ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'YES OF ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE... IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// no label of *Are you related by blood or marriage to any owner of a
		// McDonald's franchise?
		try {
			String nofranchiserelatedmarriageownerhead = page.nofranchiserelatedmarriageownermethod();
			String nofranchiserelatedmarriageownerexcel = Excelreader.getData(0, 137, 5);
			if (nofranchiserelatedmarriageownerhead.equals(nofranchiserelatedmarriageownerexcel)) {
				test.pass(
						"TC:41 THE LABEL 'NO OF ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.. ' IS DISPLAYED ");
			} else {
				test.fail(
						"TC:41 THE LABEL 'NO OF ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.. ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'NO OF ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE... IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// yes radio button
		try {
			String yesfranchiserelatedmarriageownerradiobuttonhead = page
					.yesfranchiserelatedmarriageownerradiobuttonmethod();
			if (!yesfranchiserelatedmarriageownerradiobuttonhead.equals("true")) {
				test.pass(
						"TC:41 YES RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.");
			} else {
				test.fail(
						"TC:41 YES RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "YES RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// no radio button
		try {
			String nofranchiserelatedmarriageownerradiobuttonhead = page
					.nofranchiserelatedmarriageownerradiobuttonmethod();
			if (!nofranchiserelatedmarriageownerradiobuttonhead.equals("true")) {
				test.pass(
						"TC:41 NO RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.");
			} else {
				test.fail(
						"TC:41 NO RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "NO RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// click yes radio button
		try {
			String yesfranchiserelatedmarriageownerradiobuttonhead = page
					.yesfranchiserelatedmarriageownerradiobuttonmethod1();
			if (yesfranchiserelatedmarriageownerradiobuttonhead.equals("true")) {
				test.pass(
						"TC:41 YES RADIO BUTTON SHOULD BE CLICKABLE ON ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.");
			} else {
				test.fail(
						"TC:41 YES RADIO BUTTON SHOULD BE CLICKABLE ON ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "YES RADIO BUTTON SHOULD BE CLICKABLE ON ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// no radio button
		try {
			String nofranchiserelatedmarriageownerradiobuttonhead = page
					.nofranchiserelatedmarriageownerradiobuttonmethod1();
			if (nofranchiserelatedmarriageownerradiobuttonhead.equals("true")) {
				test.pass(
						"TC:41 NO RADIO BUTTON SHOULD BE CLICKABLE ON ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.");
				// YES BUTTON CHECK AFTER SELECT NO RAIDO BUTTON
				String yesfranchiserelatedmarriageownerradiobuttonhead = page
						.yesfranchiserelatedmarriageownerradiobuttonmethod();
				if (!yesfranchiserelatedmarriageownerradiobuttonhead.equals("true")) {
					test.pass(
							"TC:41 USER SHOULD NOT SELECT BOTH YES AND NO RADIO BUTTON ON ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.");
				} else {
					test.fail(
							"TC:41 USER SHOULD NOT SELECT BOTH YES AND NO RADIO BUTTON ON ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "USER SHOULD NOT SELECT BOTH YES AND NO RADIO BUTTON ON ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.");
				}
			} else {
				test.fail(
						"TC:41 NO RADIO BUTTON SHOULD BE CLICKABL ON ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "NO RADIO BUTTON SHOULD BE CLICKABL ON ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// ERROR MESSAGE
		try {
			String franchiserelatedmarriageownererrormessagehead = page
					.franchiserelatedmarriageownererrormessagemethod();
			String franchiserelatedmarriageownererrormessageexcel = Excelreader.getData(0, 138, 5);
			if (franchiserelatedmarriageownererrormessagehead.equals(franchiserelatedmarriageownererrormessageexcel)) {
				test.pass(
						"TC:41 ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE... 'ERROR MESSAGE DISPLAYED' -->"
								+ "'" + franchiserelatedmarriageownererrormessagehead + "'");
			} else {
				test.fail(
						"TC:41 ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.' ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE... ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 32)
	public void Relation_First_Name_Of_Marriage_To_AnyOwner() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Relation_First_Name_Of_Marriage_To_AnyOwner");
		// Relation first name label
		try {
			String firstnamefranchiserelatedmarriageownerhead = page.firstnamefranchiserelatedmarriageownermethod();
			String firstnamefranchiserelatedmarriageownerexcel = Excelreader.getData(0, 139, 5);
			if (firstnamefranchiserelatedmarriageownerhead.equals(firstnamefranchiserelatedmarriageownerexcel)) {
				test.pass(
						"TC:41 THE LABEL 'RELATION FIRST NAME OF ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.. ' IS DISPLAYED ");
			} else {
				test.fail(
						"TC:41 THE  LABEL 'RELATION FIRST NAME OF LABEL 'ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.. ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'RELATION FIRST NAME OF 'ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE... IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK Relation first name label
		try {
			String firstnamefranchiserelatedmarriageownerhead = page.firstnamefranchiserelatedmarriageownermethod1();
			String firstnamefranchiserelatedmarriageownerexcel = Excelreader.getData(0, 139, 5);
			if (firstnamefranchiserelatedmarriageownerhead.equals(firstnamefranchiserelatedmarriageownerexcel)) {
				test.pass(
						"TC:41 THE LABEL 'RELATION FIRST NAME OF ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.. ' IS ROLLED UP ");
			} else {
				test.fail(
						"TC:41 THE  LABEL 'RELATION FIRST NAME OF LABEL 'ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.. ' IS NOT ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'RELATION FIRST NAME OF 'ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE... IS NOT ROLLED UP");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send all values SPECIAL
		try {
			String firstnamefranchiserelatedmarriageownersendedexcel = Excelreader.getData(0, 140, 5);
			String firstnamefranchiserelatedmarriageownersendedhead = page
					.firstnamefranchiserelatedmarriageownersendedmethod(
							firstnamefranchiserelatedmarriageownersendedexcel);
			if (firstnamefranchiserelatedmarriageownersendedhead
					.equals(firstnamefranchiserelatedmarriageownersendedexcel)) {
				test.pass(
						"TC:41 USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATION FIRST NAME' FUNCTION");
			} else {
				test.fail(
						"TC:41 USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATION FIRST NAME' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATION FIRST NAME' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send moret than 20 all values SPECIAL
		try {
			String firstnamefranchiserelatedmarriageownersendedexcel = Excelreader.getData(0, 141, 5);
			String firstnamefranchiserelatedmarriageownersendedhead = page
					.firstnamefranchiserelatedmarriageownersendedmethod(
							firstnamefranchiserelatedmarriageownersendedexcel);
			if (!firstnamefranchiserelatedmarriageownersendedhead
					.equals(firstnamefranchiserelatedmarriageownersendedexcel)) {
				test.pass(
						"TC:41 USER SHOULD NOT SEND MORET THAN 20 ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATION FIRST NAME' FUNCTION");
			} else {
				test.fail(
						"TC:41 USER SHOULD NOT SEND MORET THAN 20 ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATION FIRST NAME' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD NOT SEND MORET THAN 20 ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATION FIRST NAME' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 33)
	public void Relation_Last_Name_Of_Marriage_To_AnyOwner() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Relation_Last_Name_Of_Marriage_To_AnyOwner");

		// Relation last name label
		try {
			String lastnamefranchiserelatedmarriageownerhead = page.lastnamefranchiserelatedmarriageownermethod();
			String lastnamefranchiserelatedmarriageownerexcel = Excelreader.getData(0, 142, 5);
			if (lastnamefranchiserelatedmarriageownerhead.equals(lastnamefranchiserelatedmarriageownerexcel)) {
				test.pass(
						"TC:41 THE LABEL 'RELATION LAST NAME OF ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.. ' IS DISPLAYED ");
			} else {
				test.fail(
						"TC:41 THE  LABEL 'RELATION LAST NAME OF LABEL 'ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.. ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'RELATION LAST NAME OF 'ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE... IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK Relation last name label
		try {
			String lastnamefranchiserelatedmarriageownerhead = page.lastnamefranchiserelatedmarriageownermethod1();
			String lastnamefranchiserelatedmarriageownerexcel = Excelreader.getData(0, 142, 5);
			if (lastnamefranchiserelatedmarriageownerhead.equals(lastnamefranchiserelatedmarriageownerexcel)) {
				test.pass(
						"TC:41 THE LABEL 'RELATION LAST NAME OF ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.. ' IS ROLLED UP ");
			} else {
				test.fail(
						"TC:41 THE  LABEL 'RELATION LAST NAME OF LABEL 'ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.. ' IS NOT ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'RELATION LAST NAME OF 'ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE... IS NOT ROLLED UP");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send all values SPECIAL
		try {
			String lastnamefranchiserelatedmarriageownersendedexcel = Excelreader.getData(0, 143, 5);
			String lastnamefranchiserelatedmarriageownersendedhead = page
					.lastnamefranchiserelatedmarriageownersendedmethod(
							lastnamefranchiserelatedmarriageownersendedexcel);
			if (lastnamefranchiserelatedmarriageownersendedhead
					.equals(lastnamefranchiserelatedmarriageownersendedexcel)) {
				test.pass(
						"TC:41 USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATION LAST NAME' FUNCTION");
			} else {
				test.fail(
						"TC:41 USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATION LAST NAME' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATION LAST NAME' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send MORE THAN 20 all values SPECIAL
		try {
			String lastnamefranchiserelatedmarriageownersendedexcel = Excelreader.getData(0, 144, 5);
			String lastnamefranchiserelatedmarriageownersendedhead = page
					.lastnamefranchiserelatedmarriageownersendedmethod(
							lastnamefranchiserelatedmarriageownersendedexcel);
			if (!lastnamefranchiserelatedmarriageownersendedhead
					.equals(lastnamefranchiserelatedmarriageownersendedexcel)) {
				test.pass(
						"TC:41 USER SHOULD NOT SEND MORE THAN 20 ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATION LAST NAME' FUNCTION");
			} else {
				test.fail(
						"TC:41 USER SHOULD NOT SEND MORE THAN 20 ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATION LAST NAME' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD NOT SEND MORE THAN 20 ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATION LAST NAME' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 34)
	public void Relationship_Of_Marriage_To_AnyOwner() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Relationship_Of_Marriage_To_AnyOwner");

		// Relationship label
		try {
			String relationshipfranchiserelatedmarriageownerhead = page
					.relationshipfranchiserelatedmarriageownermethod();
			String relationshipfranchiserelatedmarriageownerexcel = Excelreader.getData(0, 145, 5);
			if (relationshipfranchiserelatedmarriageownerhead.equals(relationshipfranchiserelatedmarriageownerexcel)) {
				test.pass(
						"TC:41 THE LABEL 'RELATIONSHIP OF ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.. ' IS DISPLAYED ");
			} else {
				test.fail(
						"TC:41 THE  LABEL 'RELATIONSHIP OF LABEL 'ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.. ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'RELATIONSHIP OF 'ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE... IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK Relationship label
		try {
			String relationshipfranchiserelatedmarriageownerhead = page
					.relationshipfranchiserelatedmarriageownermethod1();
			String relationshipfranchiserelatedmarriageownerexcel = Excelreader.getData(0, 145, 5);
			if (relationshipfranchiserelatedmarriageownerhead.equals(relationshipfranchiserelatedmarriageownerexcel)) {
				test.pass(
						"TC:41 THE LABEL 'RELATIONSHIP OF ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.. ' IS ROLLED UP ");
			} else {
				test.fail(
						"TC:41 THE  LABEL 'RELATIONSHIP OF LABEL 'ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.. ' IS NOT ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'RELATIONSHIP OF 'ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE... IS NOT ROLLED UP");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send all values SPECIAL
		try {
			String relationshipfranchiserelatedmarriageownersendedexcel = Excelreader.getData(0, 146, 5);
			String relationshipfranchiserelatedmarriageownersendedhead = page
					.relationsipfranchiserelatedmarriageownersendedmethod(
							relationshipfranchiserelatedmarriageownersendedexcel);
			if (relationshipfranchiserelatedmarriageownersendedhead
					.equals(relationshipfranchiserelatedmarriageownersendedexcel)) {
				test.pass(
						"TC:41 USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATIONSHIP' FUNCTION");
			} else {
				test.fail(
						"TC:41 USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATIONSHIP' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATIONSHIP' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send more than 20 all values SPECIAL
		try {
			String relationshipfranchiserelatedmarriageownersendedexcel = Excelreader.getData(0, 147, 5);
			String relationshipfranchiserelatedmarriageownersendedhead = page
					.relationsipfranchiserelatedmarriageownersendedmethod(
							relationshipfranchiserelatedmarriageownersendedexcel);
			if (!relationshipfranchiserelatedmarriageownersendedhead
					.equals(relationshipfranchiserelatedmarriageownersendedexcel)) {
				test.pass(
						"TC:41 USER SHOULD NOT SEND MORE THAN 20 ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATIONSHIP' FUNCTION");
			} else {
				test.fail(
						"TC:41 USER SHOULD NOT SEND MORE THAN 20 ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATIONSHIP' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD NOT SEND MORE THAN 20 ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'RELATIONSHIP' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 35)
	public void Your_Employer_Providing_Products() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Your_Employer_Providing_Products");

		// *Are you or your employer providing products, goods or services to McDonald's
		// or franchisees of McDonald's?
		try {
			String areprovidingproductsladbelhead = page.areprovidingproductsladbelmethod();
			String areprovidingproductsladbelexcel = Excelreader.getData(0, 148, 5);
			if (areprovidingproductsladbelhead.equals(areprovidingproductsladbelexcel)) {
				test.pass(
						"TC:41 THE LABEL 'ARE YOU OR YOUR EMPLOYER PROVIDING PRODUCTS, GOODS OR SERVICES TO McDONALD'S OR FRANCHISEES.. ' IS DISPLAYED ");
			} else {
				test.fail(
						"TC:41 THE  LABEL 'ARE YOU OR YOUR EMPLOYER PROVIDING PRODUCTS, GOODS OR SERVICES TO McDONALD'S OR FRANCHISEES.. ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'ARE YOU OR YOUR EMPLOYER PROVIDING PRODUCTS, GOODS OR SERVICES TO McDONALD'S OR FRANCHISEES... IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// yes label
		try {
			String yesareprovidingproductsladbelhead = page.yesareprovidingproductsladbelmethod();
			String yesareprovidingproductsladbelexcel = Excelreader.getData(0, 149, 5);
			if (yesareprovidingproductsladbelhead.equals(yesareprovidingproductsladbelexcel)) {
				test.pass(
						"TC:41 THE LABEL 'YES OF ARE YOU OR YOUR EMPLOYER PROVIDING PRODUCTS, GOODS OR SERVICES TO McDONALD'S OR FRANCHISEES.. ' IS DISPLAYED ");
			} else {
				test.fail(
						"TC:41 THE  LABEL 'YES OF ARE YOU OR YOUR EMPLOYER PROVIDING PRODUCTS, GOODS OR SERVICES TO McDONALD'S OR FRANCHISEES.. ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'YES OF ARE YOU OR YOUR EMPLOYER PROVIDING PRODUCTS, GOODS OR SERVICES TO McDONALD'S OR FRANCHISEES... IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// NO label
		try {
			String noareprovidingproductsladbelhead = page.noareprovidingproductsladbelmethod();
			String noareprovidingproductsladbelexcel = Excelreader.getData(0, 150, 5);
			if (noareprovidingproductsladbelhead.equals(noareprovidingproductsladbelexcel)) {
				test.pass(
						"TC:41 THE LABEL 'NO OF ARE YOU OR YOUR EMPLOYER PROVIDING PRODUCTS, GOODS OR SERVICES TO McDONALD'S OR FRANCHISEES.. ' IS DISPLAYED ");
			} else {
				test.fail(
						"TC:41 THE  LABEL 'NO OF ARE YOU OR YOUR EMPLOYER PROVIDING PRODUCTS, GOODS OR SERVICES TO McDONALD'S OR FRANCHISEES.. ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'NO OF ARE YOU OR YOUR EMPLOYER PROVIDING PRODUCTS, GOODS OR SERVICES TO McDONALD'S OR FRANCHISEES... IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// yes radio button
		try {
			String yesareprovidingproductsradiobuttonhead = page.yesareprovidingproductsradiobuttonmethod();
			if (!yesareprovidingproductsradiobuttonhead.equals("true")) {
				test.pass(
						"TC:41 YES RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON ARE YOU OR YOUR EMPLOYER PROVIDING PRODUCTS, GOODS OR SERVICES TO McDONALD'S OR FRANCHISEES.");
			} else {
				test.fail(
						"TC:41 YES RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON ARE YOU OR YOUR EMPLOYER PROVIDING PRODUCTS, GOODS OR SERVICES TO McDONALD'S OR FRANCHISEES.");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "YES RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON ARE YOU OR YOUR EMPLOYER PROVIDING PRODUCTS, GOODS OR SERVICES TO McDONALD'S OR FRANCHISEES.");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// no radio button
		try {
			String noareprovidingproductsradiobuttonhead = page.noareprovidingproductsradiobuttonmethod();
			if (!noareprovidingproductsradiobuttonhead.equals("true")) {
				test.pass(
						"TC:41 NO RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON ARE YOU OR YOUR EMPLOYER PROVIDING PRODUCTS, GOODS OR SERVICES TO McDONALD'S OR FRANCHISEES.");
			} else {
				test.fail(
						"TC:41 NO RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON ARE YOU OR YOUR EMPLOYER PROVIDING PRODUCTS, GOODS OR SERVICES TO McDONALD'S OR FRANCHISEES.");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "NO RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON ARE YOU OR YOUR EMPLOYER PROVIDING PRODUCTS, GOODS OR SERVICES TO McDONALD'S OR FRANCHISEES.");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// yes radio button CLICK
		try {
			String yesareprovidingproductsradiobuttonhead = page.yesareprovidingproductsradiobuttonmethod1();
			if (yesareprovidingproductsradiobuttonhead.equals("true")) {
				test.pass(
						"TC:41 YES RADIO BUTTON SHOULD BE CLICKABLE ON ARE YOU OR YOUR EMPLOYER PROVIDING PRODUCTS, GOODS OR SERVICES TO McDONALD'S OR FRANCHISEES.");
			} else {
				test.fail(
						"TC:41 YES RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON ARE YOU OR YOUR EMPLOYER PROVIDING PRODUCTS, GOODS OR SERVICES TO McDONALD'S OR FRANCHISEES.");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "YES RADIO BUTTON SHOULD BE CLICKABLE ON ARE YOU OR YOUR EMPLOYER PROVIDING PRODUCTS, GOODS OR SERVICES TO McDONALD'S OR FRANCHISEES.");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// no radio button CLICK
		try {
			String noareprovidingproductsradiobuttonhead = page.noareprovidingproductsradiobuttonmethod1();
			if (noareprovidingproductsradiobuttonhead.equals("true")) {
				test.pass(
						"TC:41 NO RADIO BUTTON SHOULD BE CLICKABLE ON ARE YOU OR YOUR EMPLOYER PROVIDING PRODUCTS, GOODS OR SERVICES TO McDONALD'S OR FRANCHISEES.");
				// YES RADIO BUTTON
				String yesareprovidingproductsradiobuttonhead = page.yesareprovidingproductsradiobuttonmethod();
				if (!yesareprovidingproductsradiobuttonhead.equals("true")) {
					test.pass(
							"TC:41 USER SHOULD NOT SELECT BOTH OF YES AND NO RADIO BUTTONS ON ARE YOU OR YOUR EMPLOYER PROVIDING PRODUCTS, GOODS OR SERVICES TO McDONALD'S OR FRANCHISEES.");
				} else {
					test.fail(
							"TC:41 USER SHOULD NOT SELECT BOTH OF YES AND NO RADIO BUTTONS ON ARE YOU OR YOUR EMPLOYER PROVIDING PRODUCTS, GOODS OR SERVICES TO McDONALD'S OR FRANCHISEES.");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "USER SHOULD NOT SELECT BOTH OF YES AND NO RADIO BUTTONS ON ARE YOU OR YOUR EMPLOYER PROVIDING PRODUCTS, GOODS OR SERVICES TO McDONALD'S OR FRANCHISEES.");
				}
			} else {
				test.fail(
						"TC:41 NO RADIO BUTTON SHOULD BE CLICKABLE ON ARE YOU OR YOUR EMPLOYER PROVIDING PRODUCTS, GOODS OR SERVICES TO McDONALD'S OR FRANCHISEES.");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "NO RADIO BUTTON SHOULD BE CLICKABLE ON ARE YOU OR YOUR EMPLOYER PROVIDING PRODUCTS, GOODS OR SERVICES TO McDONALD'S OR FRANCHISEES.");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// ERROR MESSAGE
		try {
			String areprovidingproductsradiobuttonerrormessagehead = page
					.areprovidingproductsradiobuttonerrormessagemethod();
			String areprovidingproductsradiobuttonerrormessageexcel = Excelreader.getData(0, 151, 5);
			if (areprovidingproductsradiobuttonerrormessagehead
					.equals(areprovidingproductsradiobuttonerrormessageexcel)) {
				test.pass(
						"TC:41 ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE... 'ERROR MESSAGE DISPLAYED' -->"
								+ "'" + areprovidingproductsradiobuttonerrormessagehead + "'");
			} else {
				test.fail(
						"TC:41 ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.' ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE... ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 36)
	public void How_Much_Time_Will_You_Devote_To_This_Business() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("How_Much_Time_Will_You_Devote_To_This_Business");
		// *How much time will you devote to this business?
		try {
			String howmuchtimewillyoudevotetothishead = page.howmuchtimewillyoudevotetothismethod();
			String howmuchtimewillyoudevotetothisexcel = Excelreader.getData(0, 152, 5);
			if (howmuchtimewillyoudevotetothishead.equals(howmuchtimewillyoudevotetothisexcel)) {
				test.pass("TC:42 THE LABEL 'HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS.. ' IS DISPLAYED ");
			} else {
				test.fail("TC:42 THE  LABEL 'HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS... ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS.. IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// full time
		try {
			String fulltimelabelhead = page.fulltimelabelmethod();
			String fulltimelabelexcel = Excelreader.getData(0, 153, 5);
			if (fulltimelabelhead.equals(fulltimelabelexcel)) {
				test.pass("TC:42 THE LABEL 'FULLL TIME.. ' IS DISPLAYED ");
			} else {
				test.fail("TC:42 THE  LABEL 'FULLL TIME.. ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'FULLL TIME.... IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// PART TIME
		try {
			String parttimelabelhead = page.parttimelabelmethod();
			String parttimelabelexcel = Excelreader.getData(0, 154, 5);
			if (parttimelabelhead.equals(parttimelabelexcel)) {
				test.pass("TC:42 THE LABEL 'PART TIME.. ' IS DISPLAYED ");
			} else {
				test.fail("TC:42 THE  LABEL 'PART TIME.. ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'FULLL TIME.... IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// PASSIVE INVESTOR
		try {
			String passiveinvestorlabelhead = page.passiveinvestorlabelmethod();
			String passiveinvestorlabelexcel = Excelreader.getData(0, 155, 5);
			if (passiveinvestorlabelhead.equals(passiveinvestorlabelexcel)) {
				test.pass("TC:42 THE LABEL 'PASSIVE INVESTOR.. ' IS DISPLAYED ");
			} else {
				test.fail("TC:42 THE  LABEL 'PASSIVE INVESTOR.. ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'PASSIVE INVESTOR.... IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// FULL TIME radio button
		try {
			String fulltimeradiobuttonhead = page.fulltimeradiobuttonmethod();
			if (!fulltimeradiobuttonhead.equals("true")) {
				test.pass(
						"TC:42 FULL TIME RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS..");
			} else {
				test.fail(
						"TC:42 FULL TIME RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS..");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "FULL TIME RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS..");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// part time radio button
		try {
			String parttimeradiobuttonhead = page.parttimeradiobuttonmethod();
			if (!parttimeradiobuttonhead.equals("true")) {
				test.pass(
						"TC:42 PART TIME RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS..");
			} else {
				test.fail(
						"TC:42 PART TIME RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS..");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "PART TIME RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS..");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// passive investor
		try {
			String passiveinvestorradiobuttonhead = page.passiveinvestorradiobuttonmethod();
			if (!passiveinvestorradiobuttonhead.equals("true")) {
				test.pass(
						"TC:42 PASSIVE INVESTOR RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS..");
			} else {
				test.fail(
						"TC:42 PASSIVE INVESTOR RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS..");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "PASSIVE INVESTOR RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS..");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// FULL TIME radio button CLICK
		try {
			String fulltimeradiobuttonhead = page.fulltimeradiobuttonmethod1();
			if (fulltimeradiobuttonhead.equals("true")) {
				test.pass(
						"TC:42 FULL TIME RADIO BUTTON SHOULD BE CLICKABLE ON HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS..");
			} else {
				test.fail(
						"TC:42 FULL TIME RADIO BUTTON SHOULD BE CLICKABLE ON HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS..");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "FULL TIME RADIO BUTTON SHOULD BE CLICKABLE ON HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS..");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// part time radio button CLICK
		try {
			String parttimeradiobuttonhead = page.parttimeradiobuttonmethod1();
			if (parttimeradiobuttonhead.equals("true")) {
				test.pass(
						"TC:42 PART TIME RADIO BUTTON SHOULD BE CLICKABLE ON HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS..");
			} else {
				test.fail(
						"TC:42 PART TIME RADIO BUTTON SHOULD SHOULD BE CLICKABLE ON HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS..");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "PART TIME RADIO BUTTON SHOULD SHOULD BE CLICKABLE ON HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS..");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// passive investor radio button click
		try {
			String passiveinvestorradiobuttonhead = page.passiveinvestorradiobuttonmethod1();
			if (passiveinvestorradiobuttonhead.equals("true")) {
				test.pass(
						"TC:42 PASSIVE INVESTOR RADIO BUTTON SHOULD BE CLICKABLE ON HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS..");
				// FULL TIME radio button

				String fulltimeradiobuttonhead = page.fulltimeradiobuttonmethod();
				if (!fulltimeradiobuttonhead.equals("true")) {
					test.pass(
							"TC:42 USER SHOULD NOT SELECT ALL FULL AND PART TIME RADIO BUTTONS ON HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS..");
				} else {
					test.fail(
							"TC:42 USER SHOULD NOT SELECT ALL FULL AND PART TIME RADIO BUTTONS ON HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS..");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "USER SHOULD NOT SELECT ALL FULL AND PART TIME RADIO BUTTONS ON HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS..");
				}
				// part time radio button

				String parttimeradiobuttonhead = page.parttimeradiobuttonmethod();
				if (!parttimeradiobuttonhead.equals("true")) {
					test.pass(
							"TC:42 USER SHOULD NOT SELECT ALL FULL AND PART TIME RADIO BUTTONS ON HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS..");
				} else {
					test.fail(
							"TC:42 USER SHOULD NOT SELECT ALL FULL AND PART TIME RADIO BUTTONS ON HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS..");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "USER SHOULD NOT SELECT ALL FULL AND PART TIME RADIO BUTTONS ON HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS..");
				}
			} else {
				test.fail(
						"TC:42 PASSIVE INVESTOR RADIO BUTTON SHOULD BE CLICKABLE ON HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS..");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "PASSIVE INVESTOR RADIO BUTTON SHOULD BE CLICKABLE ON HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS..");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// ERROR MESSAGE
		try {
			String howmutchtimewillyouerrormessagehead = page.howmutchtimewillyouerrormessagemethod();
			String howmutchtimewillyouerrormessageexcel = Excelreader.getData(0, 156, 5);
			if (howmutchtimewillyouerrormessagehead.equals(howmutchtimewillyouerrormessageexcel)) {
				test.pass("TC:42 HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS... 'ERROR MESSAGE DISPLAYED' -->" + "'"
						+ howmutchtimewillyouerrormessagehead + "'");
			} else {
				test.fail("TC:42 HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS' ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS.. ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 37)
	public void Would_You_Be_Willing_To_Relocate_For_Restaurant() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Would_You_Be_Willing_To_Relocate_For_Restaurant");
		// *Would you be willing to relocate for a restaurant opportunity?
		try {
			String wouldyoubewillingtoralocatelabelhead = page.wouldyoubewillingtoralocatelabelmethod();
			String wouldyoubewillingtoralocatelabelexcel = Excelreader.getData(0, 157, 5);
			if (wouldyoubewillingtoralocatelabelhead.equals(wouldyoubewillingtoralocatelabelexcel)) {
				test.pass(
						"TC:43 THE LABEL 'WOULD YOU BE WILLING TO RELOCATE FOR A RESTAURANT OPPORTUNITY. ' IS DISPLAYED ");
			} else {
				test.fail(
						"TC:43 THE  LABEL 'WOULD YOU BE WILLING TO RELOCATE FOR A RESTAURANT OPPORTUNITY.. ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'WOULD YOU BE WILLING TO RELOCATE FOR A RESTAURANT OPPORTUNITY.. IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// yes of *Would you be willing to relocate for a restaurant opportunity?
		try {
			String yeswouldyoubewillingtoralocatelabelhead = page.yeswouldyoubewillingtoralocatelabelmethod();
			String yeswouldyoubewillingtoralocatelabelexcel = Excelreader.getData(0, 158, 5);
			if (yeswouldyoubewillingtoralocatelabelhead.equals(yeswouldyoubewillingtoralocatelabelexcel)) {
				test.pass(
						"TC:43 THE LABEL 'YES OF WOULD YOU BE WILLING TO RELOCATE FOR A RESTAURANT OPPORTUNITY. ' IS DISPLAYED ");
			} else {
				test.fail(
						"TC:43 THE  LABEL 'YES OF WOULD YOU BE WILLING TO RELOCATE FOR A RESTAURANT OPPORTUNITY.. ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'YES OF WOULD YOU BE WILLING TO RELOCATE FOR A RESTAURANT OPPORTUNITY.. IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// NO of *Would you be willing to relocate for a restaurant opportunity?
		try {
			String nowouldyoubewillingtoralocatelabelhead = page.nowouldyoubewillingtoralocatelabelmethod();
			String nowouldyoubewillingtoralocatelabelexcel = Excelreader.getData(0, 159, 5);
			if (nowouldyoubewillingtoralocatelabelhead.equals(nowouldyoubewillingtoralocatelabelexcel)) {
				test.pass(
						"TC:43 THE LABEL 'NO OF WOULD YOU BE WILLING TO RELOCATE FOR A RESTAURANT OPPORTUNITY. ' IS DISPLAYED ");
			} else {
				test.fail(
						"TC:43 THE  LABEL 'NO OF WOULD YOU BE WILLING TO RELOCATE FOR A RESTAURANT OPPORTUNITY.. ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'NO OF WOULD YOU BE WILLING TO RELOCATE FOR A RESTAURANT OPPORTUNITY.. IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// yes radio button
		try {
			String yeswouldyoubewillingtoralocateradiobuttonhead = page
					.yeswouldyoubewillingtoralocateradiobuttonmethod();
			if (!yeswouldyoubewillingtoralocateradiobuttonhead.equals("true")) {
				test.pass(
						"TC:43 YES RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON WOULD YOU BE WILLING TO RELOCATE FOR A RESTAURANT OPPORTUNITY?.");
			} else {
				test.fail(
						"TC:43 YES RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON WOULD YOU BE WILLING TO RELOCATE FOR A RESTAURANT OPPORTUNITY?..");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "YES RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON WOULD YOU BE WILLING TO RELOCATE FOR A RESTAURANT OPPORTUNITY?.");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// no radio button
		try {
			String nowouldyoubewillingtoralocateradiobuttonhead = page.nowouldyoubewillingtoralocateradiobuttonmethod();
			if (!nowouldyoubewillingtoralocateradiobuttonhead.equals("true")) {
				test.pass(
						"TC:43 NO RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON WOULD YOU BE WILLING TO RELOCATE FOR A RESTAURANT OPPORTUNITY?..");
			} else {
				test.fail(
						"TC:43 NO RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON WOULD YOU BE WILLING TO RELOCATE FOR A RESTAURANT OPPORTUNITY?..");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "NO RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON WOULD YOU BE WILLING TO RELOCATE FOR A RESTAURANT OPPORTUNITY?..");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// yes radio button CLICK
		try {
			String yeswouldyoubewillingtoralocateradiobuttonhead = page
					.yeswouldyoubewillingtoralocateradiobuttonmethod1();
			if (yeswouldyoubewillingtoralocateradiobuttonhead.equals("true")) {
				test.pass(
						"TC:43 YES RADIO BUTTON SHOULD BE CLICKABLE ON WOULD YOU BE WILLING TO RELOCATE FOR A RESTAURANT OPPORTUNITY?..");
			} else {
				test.fail(
						"TC:43 YES RADIO BUTTON SHOULD BE CLICKABLE ON WOULD YOU BE WILLING TO RELOCATE FOR A RESTAURANT OPPORTUNITY?.");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "YES RADIO BUTTON SHOULD BE CLICKABLE ON WOULD YOU BE WILLING TO RELOCATE FOR A RESTAURANT OPPORTUNITY?.");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// no radio button click
		try {
			String nowouldyoubewillingtoralocateradiobuttonhead = page
					.nowouldyoubewillingtoralocateradiobuttonmethod1();
			if (nowouldyoubewillingtoralocateradiobuttonhead.equals("true")) {
				test.pass(
						"TC:43 NO RADIO BUTTON SHOULD BE CLICKABLE ON WOULD YOU BE WILLING TO RELOCATE FOR A RESTAURANT OPPORTUNITY?..");
				// YES
				String yeswouldyoubewillingtoralocateradiobuttonhead = page
						.yeswouldyoubewillingtoralocateradiobuttonmethod();
				if (!yeswouldyoubewillingtoralocateradiobuttonhead.equals("true")) {
					test.pass(
							"TC:43 YES RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON WOULD YOU BE WILLING TO RELOCATE FOR A RESTAURANT OPPORTUNITY?..");
				} else {
					test.fail(
							"TC:43 YES RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON WOULD YOU BE WILLING TO RELOCATE FOR A RESTAURANT OPPORTUNITY?..");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "YES RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON WOULD YOU BE WILLING TO RELOCATE FOR A RESTAURANT OPPORTUNITY?..");
				}
			} else {
				test.fail(
						"TC:43 NO RADIO BUTTON SHOULD BE CLICKABLE ON WOULD YOU BE WILLING TO RELOCATE FOR A RESTAURANT OPPORTUNITY?..");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "NO RADIO BUTTON SHOULD BE CLICKABLE ON WOULD YOU BE WILLING TO RELOCATE FOR A RESTAURANT OPPORTUNITY?..");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// ERROR MESSAGE
		try {
			String wouldyoubewillingtoralocateerrormessagehead = page.wouldyoubewillingtoralocateerrormessagemethod();
			String wouldyoubewillingtoralocateerrormessageexcel = Excelreader.getData(0, 160, 5);
			if (wouldyoubewillingtoralocateerrormessagehead.equals(wouldyoubewillingtoralocateerrormessageexcel)) {
				test.pass(
						"TC:43 WOULD YOU BE WILLING TO RELOCATE FOR A RESTAURANT OPPORTUNITY?... 'ERROR MESSAGE DISPLAYED' -->"
								+ "'" + wouldyoubewillingtoralocateerrormessagehead + "'");
			} else {
				test.fail(
						"TC:43 WOULD YOU BE WILLING TO RELOCATE FOR A RESTAURANT OPPORTUNITY?' ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "WOULD YOU BE WILLING TO RELOCATE FOR A RESTAURANT OPPORTUNITY?.. ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 38)
	public void Select_Geography_Type() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Select_Geography_Type");
		// *Select geography type (select all that apply)
		try {
			String selectgeographytypelabelhead = page.selectgeographytypelabelmethod();
			String selectgeographytypelabelexcel = Excelreader.getData(0, 161, 5);
			if (selectgeographytypelabelhead.equals(selectgeographytypelabelexcel)) {
				test.pass("TC:44 THE LABEL 'SELECT GEOGRAPHY TYPE (SELECT ALL APPLY).. ' IS DISPLAYED ");
			} else {
				test.fail("TC:44 THE  LABEL 'SELECT GEOGRAPHY TYPE (SELECT ALL APPLY).... ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'SELECT GEOGRAPHY TYPE (SELECT ALL APPLY).... IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// Rural (Population 0 - 2,500)
		try {
			String ruralheadlabelhead = page.ruralheadlabelmethod();
			String ruralheadlabelexcel = Excelreader.getData(0, 162, 5);
			if (ruralheadlabelhead.equals(ruralheadlabelexcel)) {
				test.pass("TC:44 THE LABEL 'RURAL (POPULATION 0-2,500).. ' IS DISPLAYED ");
			} else {
				test.fail("TC:44 THE  LABEL 'RURAL (POPULATION 0-2,500).... ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'RURAL (POPULATION 0-2,500)... IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// Small Town (Population 2,500-50,000)
		try {
			String smalltownlabelhead = page.smalltownlabelmethod();
			String smalltownlabelexcel = Excelreader.getData(0, 163, 5);
			if (smalltownlabelhead.equals(smalltownlabelexcel)) {
				test.pass("TC:44 THE LABEL 'SMALL TOWN (POPULATION 2,500-50,000).. ' IS DISPLAYED ");
			} else {
				test.fail("TC:44 THE  LABEL 'SMALL TOWN (POPULATION 2,500-50,000).. ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'SMALL TOWN (POPULATION 2,500-50,000)... IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// Suburban (Outside of City or Town, Population 50,000+)
		try {
			String suburbanheadlabelhead = page.suburbanheadlabelmethod();
			String suburbanheadlabelexcel = Excelreader.getData(0, 164, 5);
			if (suburbanheadlabelhead.equals(suburbanheadlabelexcel)) {
				test.pass("TC:44 THE LABEL 'SUBURBAN (OUTSIDE OF CITY OR TOWN, POPULATION 50,000+).. ' IS DISPLAYED ");
			} else {
				test.fail(
						"TC:44 THE  LABEL 'SUBURBAN (OUTSIDE OF CITY OR TOWN, POPULATION 50,000+) ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'SUBURBAN (OUTSIDE OF CITY OR TOWN, POPULATION 50,000+)... IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// Urban (City or Town, Population 50,000+)
		try {
			String urbanheadlabelhead = page.urbanheadlabelmethod();
			String urbanheadlabelexcel = Excelreader.getData(0, 165, 5);
			if (urbanheadlabelhead.equals(urbanheadlabelexcel)) {
				test.pass("TC:44 THE LABEL 'URBAN (CITY OR TOWN, POPULATION 50,000+).. ' IS DISPLAYED ");
			} else {
				test.fail("TC:44 THE  LABEL 'URBAN (CITY OR TOWN, POPULATION 50,000+) ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'URBAN (CITY OR TOWN, POPULATION 50,000+)... IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// geoGraphy type inner city
		try {
			String geopraphytypeinnercitylabelhead = page.geopraphytypeinnercitylabelmethod();
			String geopraphytypeinnercitylabelexcel = Excelreader.getData(0, 166, 5);
			if (geopraphytypeinnercitylabelhead.equals(geopraphytypeinnercitylabelexcel)) {
				test.pass("TC:44 THE LABEL 'GEOGRAPHY TYPE INNER CITY.. ' IS DISPLAYED ");
			} else {
				test.fail("TC:44 THE  LABEL 'GEOGRAPHY TYPE INNER CITY... ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'GEOGRAPHY TYPE INNER CITY... IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// rural check box
		try {
			String ruralcheckboxhead = page.ruralcheckboxmethod();
			if (!ruralcheckboxhead.equals("true")) {
				test.pass("TC:44 CHECK BOX SHOULD NOT SELECTED BY DEFAULT IN RURAL (POPULATION 0-2,500)");
			} else {
				test.fail("TC:44 CHECK BOX SHOULD NOT SELECTED BY DEFAULT IN RURAL (POPULATION 0-2,500)");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "CHECK BOX SHOULD NOT SELECTED BY DEFAULT IN RURAL (POPULATION 0-2,500)");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// CHECK BOX Small Town (Population 2,500-50,000)
		try {
			String smalltowncheckboxhead = page.smalltowncheckboxmethod();
			if (!smalltowncheckboxhead.equals("true")) {
				test.pass("TC:44 CHECK BOX SHOULD NOT SELECTED BY DEFAULT IN SMALL TOWN (POPULATION 2,500-50,000)..");
			} else {
				test.fail("TC:44 CHECK BOX SHOULD NOT SELECTED BY DEFAULT IN SMALL TOWN (POPULATION 2,500-50,000)..");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "CHECK BOX SHOULD NOT SELECTED BY DEFAULT IN SMALL TOWN (POPULATION 2,500-50,000)..");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// CHECK BOX Suburban (Outside of City or Town, Population 50,000+)
		try {
			String suburbancheckboxhead = page.suburbancheckboxmethod();
			if (!suburbancheckboxhead.equals("true")) {
				test.pass(
						"TC:44 CHECK BOX SHOULD NOT SELECTED BY DEFAULT IN SUBURBAN (OUTSIDE OF CITY OR TOWN, POPULATION 50,000+)....");
			} else {
				test.fail(
						"TC:44 CHECK BOX SHOULD NOT SELECTED BY DEFAULT IN SUBURBAN (OUTSIDE OF CITY OR TOWN, POPULATION 50,000+)....");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "CHECK BOX SHOULD NOT SELECTED BY DEFAULT IN SUBURBAN (OUTSIDE OF CITY OR TOWN, POPULATION 50,000+)....");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// CHECK BOX URBAN (CITY OR TOWN, POPULATION 50,000+)
		try {
			String urbancheckboxhead = page.urbancheckboxmethod();
			if (!urbancheckboxhead.equals("true")) {
				test.pass(
						"TC:44 CHECK BOX SHOULD NOT SELECTED BY DEFAULT IN URBAN (CITY OR TOWN, POPULATION 50,000+)....");
			} else {
				test.fail(
						"TC:44 CHECK BOX SHOULD NOT SELECTED BY DEFAULT IN URBAN (CITY OR TOWN, POPULATION 50,000+)....");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "CHECK BOX SHOULD NOT SELECTED BY DEFAULT IN URBAN (CITY OR TOWN, POPULATION 50,000+)....");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// CHECK BOX GEOGRAPHY TYPE INNER (CITY OR TOWN, POPULATION 50,000+)
		try {
			String geographytypecheckboxhead = page.geographytypecheckboxmethod();
			if (!geographytypecheckboxhead.equals("true")) {
				test.pass("TC:44 CHECK BOX SHOULD NOT SELECTED BY DEFAULT IN GEOGRAPHY TYPE INNER CITY.....");
			} else {
				test.fail("TC:44 CHECK BOX SHOULD NOT SELECTED BY DEFAULT IN GEOGRAPHY TYPE INNER CITY......");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "CHECK BOX SHOULD NOT SELECTED BY DEFAULT IN GEOGRAPHY TYPE INNER CITY......");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// rural check box click
		try {
			String ruralcheckboxhead = page.ruralcheckboxmethod1();
			if (ruralcheckboxhead.equals("true")) {
				test.pass("TC:44 CHECK BOX SHOULD BE CLICKABLE  IN RURAL (POPULATION 0-2,500)");
			} else {
				test.fail("TC:44 CHECK BOX SHOULD BE CLICKABLE IN RURAL (POPULATION 0-2,500)");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "CHECK BOX SHOULD BE CLICKABLE IN RURAL (POPULATION 0-2,500)");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// CHECK BOX Small Town (Population 2,500-50,000)
		try {
			String smalltowncheckboxhead = page.smalltowncheckboxmethod1();
			if (smalltowncheckboxhead.equals("true")) {
				test.pass("TC:44 CHECK BOX SHOULD BE CLICKABLE IN SMALL TOWN (POPULATION 2,500-50,000)..");
			} else {
				test.fail("TC:44 CHECK BOX SHOULD BE CLICKABLE IN SMALL TOWN (POPULATION 2,500-50,000)..");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "CHECK BOX SHOULD BE CLICKABLE IN SMALL TOWN (POPULATION 2,500-50,000)..");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// CHECK BOX Suburban (Outside of City or Town, Population 50,000+)
		try {
			String suburbancheckboxhead = page.suburbancheckboxmethod1();
			if (suburbancheckboxhead.equals("true")) {
				test.pass(
						"TC:44 CHECK BOX SHOULD BE CLICKABLE IN SUBURBAN (OUTSIDE OF CITY OR TOWN, POPULATION 50,000+)....");
			} else {
				test.fail(
						"TC:44 CHECK BOX SHOULD BE CLICKABLE IN SUBURBAN (OUTSIDE OF CITY OR TOWN, POPULATION 50,000+)....");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "CHECK BOX SHOULD BE CLICKABLE IN SUBURBAN (OUTSIDE OF CITY OR TOWN, POPULATION 50,000+)....");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// CHECK BOX URBAN (CITY OR TOWN, POPULATION 50,000+)
		try {
			String urbancheckboxhead = page.urbancheckboxmethod1();
			if (urbancheckboxhead.equals("true")) {
				test.pass("TC:44 CHECK BOX SHOULD BE CLICKABLE IN URBAN (CITY OR TOWN, POPULATION 50,000+)....");
			} else {
				test.fail("TC:44 CHECK BOX SHOULD BE CLICKABLE IN URBAN (CITY OR TOWN, POPULATION 50,000+)....");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "CHECK BOX SHOULD BE CLICKABLE IN URBAN (CITY OR TOWN, POPULATION 50,000+)....");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// CHECK BOX GEOGRAPHY TYPE INNER (CITY OR TOWN, POPULATION 50,000+)
		try {
			String geographytypecheckboxhead = page.geographytypecheckboxmethod1();
			if (geographytypecheckboxhead.equals("true")) {
				test.pass("TC:44 CHECK BOX SHOULD BE CLICKABLE IN GEOGRAPHY TYPE INNER CITY.....");
				// rural check box click
				String ruralcheckboxhead = page.ruralcheckboxmethod();
				if (ruralcheckboxhead.equals("true")) {
					test.pass(
							"TC:44 USER ABEL TO SELECT ALL CHECKBOX OF SELECT GEOGRAPHY TYPE IN RURAL (POPULATION 0-2,500)");
				} else {
					test.fail(
							"TC:44 USER ABEL TO SELECT ALL CHECKBOX OF SELECT GEOGRAPHY TYPE IN RURAL (POPULATION 0-2,500)");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "USER ABEL TO SELECT ALL CHECKBOX OF SELECT GEOGRAPHY TYPE IN RURAL (POPULATION 0-2,500)");
				}
				// CHECK BOX Small Town (Population 2,500-50,000)
				String smalltowncheckboxhead = page.smalltowncheckboxmethod();
				if (smalltowncheckboxhead.equals("true")) {
					test.pass(
							"TC:44 USER ABEL TO SELECT ALL CHECKBOX OF SELECT GEOGRAPHY TYPE IN SMALL TOWN (POPULATION 2,500-50,000)..");
				} else {
					test.fail(
							"TC:44 USER ABEL TO SELECT ALL CHECKBOX OF SELECT GEOGRAPHY TYPE IN SMALL TOWN (POPULATION 2,500-50,000)..");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "USER ABEL TO SELECT ALL CHECKBOX OF SELECT GEOGRAPHY TYPE IN SMALL TOWN (POPULATION 2,500-50,000)..");
				}
				// CHECK BOX Suburban (Outside of City or Town, Population 50,000+)
				String suburbancheckboxhead = page.suburbancheckboxmethod();
				if (suburbancheckboxhead.equals("true")) {
					test.pass(
							"TC:44 USER ABEL TO SELECT ALL CHECKBOX OF SELECT GEOGRAPHY TYPE IN SUBURBAN (OUTSIDE OF CITY OR TOWN, POPULATION 50,000+)....");
				} else {
					test.fail(
							"TC:44 USER ABEL TO SELECT ALL CHECKBOX OF SELECT GEOGRAPHY TYPE IN SUBURBAN (OUTSIDE OF CITY OR TOWN, POPULATION 50,000+)....");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "USER ABEL TO SELECT ALL CHECKBOX OF SELECT GEOGRAPHY TYPE IN SUBURBAN (OUTSIDE OF CITY OR TOWN, POPULATION 50,000+)....");
				}
				// CHECK BOX URBAN (CITY OR TOWN, POPULATION 50,000+)
				String urbancheckboxhead = page.urbancheckboxmethod();
				if (urbancheckboxhead.equals("true")) {
					test.pass(
							"TC:44 USER ABEL TO SELECT ALL CHECKBOX OF SELECT GEOGRAPHY TYPE IN URBAN (CITY OR TOWN, POPULATION 50,000+)....");
				} else {
					test.fail(
							"TC:44 USER ABEL TO SELECT ALL CHECKBOX OF SELECT GEOGRAPHY TYPE IN URBAN (CITY OR TOWN, POPULATION 50,000+)....");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "USER ABEL TO SELECT ALL CHECKBOX OF SELECT GEOGRAPHY TYPE IN URBAN (CITY OR TOWN, POPULATION 50,000+)....");
				}
			} else {
				test.fail("TC:44 CHECK BOX SHOULD BE CLICKABLE IN GEOGRAPHY TYPE INNER CITY......");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "CHECK BOX SHOULD BE CLICKABLE IN GEOGRAPHY TYPE INNER CITY......");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// ERROR MESSAGE
		try {
			String geographytypeerrormessagehead = page.geographytypeerrormessagemethod();
			String geographytypeerrormessageexcel = Excelreader.getData(0, 167, 5);
			if (geographytypeerrormessagehead.equals(geographytypeerrormessageexcel)) {
				test.pass("TC:44 SELECT GEOGRAPHY TYPE (SELECT ALL THAT APPLY)... 'ERROR MESSAGE DISPLAYED' -->" + "'"
						+ geographytypeerrormessagehead + "'");
			} else {
				test.fail("TC:44 SELECT GEOGRAPHY TYPE (SELECT ALL THAT APPLY)' ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "SELECT GEOGRAPHY TYPE (SELECT ALL THAT APPLY).. ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 39)
	public void Enter_Preferred_Region() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Enter_Preferred_Region");
		// *Enter preferred region (Northeast, Southeast, Midwest, Northwest or
		// Southwest) (0/512 characters)
		try {
			String enterpreferredregionlabelhead = page.enterpreferredregionlabelmethod();
			String enterpreferredregionlabelexcel = Excelreader.getData(0, 168, 5);
			if (enterpreferredregionlabelhead.equals(enterpreferredregionlabelexcel)) {
				test.pass(
						"TC:45 THE LABEL 'ENTER PREFERRED REGION (NORTHEAST, SOUTHEAST, MIDWEST, NORTHWEST OR SOUTHEWST) (0/512 CHARACTERS).. ' IS DISPLAYED ");
			} else {
				test.fail(
						"TC:45 THE  LABEL 'ENTER PREFERRED REGION (NORTHEAST, SOUTHEAST, MIDWEST, NORTHWEST OR SOUTHEWST) (0/512 CHARACTERS)..... ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'ENTER PREFERRED REGION (NORTHEAST, SOUTHEAST, MIDWEST, NORTHWEST OR SOUTHEWST) (0/512 CHARACTERS)... IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// after click *Enter preferred region (Northeast, Southeast, Midwest, Northwest
		// or Southwest) (0/512 characters)
		try {
			String enterpreferredregionlabelhead = page.enterpreferredregionlabelmethod1();
			String enterpreferredregionlabelexcel = Excelreader.getData(0, 168, 5);
			if (enterpreferredregionlabelhead.equals(enterpreferredregionlabelexcel)) {
				test.pass(
						"TC:45 THE LABEL 'ENTER PREFERRED REGION (NORTHEAST, SOUTHEAST, MIDWEST, NORTHWEST OR SOUTHEWST) (0/512 CHARACTERS).. ' IS ROOLED UP ");
			} else {
				test.fail(
						"TC:45 THE  LABEL 'ENTER PREFERRED REGION (NORTHEAST, SOUTHEAST, MIDWEST, NORTHWEST OR SOUTHEWST) (0/512 CHARACTERS)..... ' IS NOT ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'ENTER PREFERRED REGION (NORTHEAST, SOUTHEAST, MIDWEST, NORTHWEST OR SOUTHEWST) (0/512 CHARACTERS)... IS NOT ROLLED UP");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send all LETTERS
		try {
			String enterpreferredregionsendedvalueexcel = Excelreader.getData(0, 169, 5);
			String enterpreferredregionsendedvaluehead = page
					.enterpreferredregionsendedvaluemethod(enterpreferredregionsendedvalueexcel);
			if (enterpreferredregionsendedvaluehead.equals(enterpreferredregionsendedvalueexcel)) {
				test.pass(
						"TC:45 USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'ENTER PREFERRED REGION ' FUNCTION");
			} else {
				test.fail(
						"TC:45 USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'ENTER PREFERRED REGION' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'ENTER PREFERRED REGION' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send MORE THAN 512 all LETTERS
		try {
			String enterpreferredregionsendedvalueexcel = Excelreader.getData(0, 170, 5);
			String enterpreferredregionsendedvaluehead = page
					.enterpreferredregionsendedvaluemethod(enterpreferredregionsendedvalueexcel);
			if (enterpreferredregionsendedvaluehead.equals(enterpreferredregionsendedvalueexcel)) {
				test.pass(
						"TC:45 USER SHOULD BE SEND MORE THAN 512 ALL LETTERS IN 'ENTER PREFERRED REGION.. ' FUNCTION");
				String enterpreferredregionerrormessagehead1 = page.enterpreferredregionerrormessagemethod1();
				String enterpreferredregionerrormessageexcel1 = Excelreader.getData(0, 171, 5);
				if (enterpreferredregionerrormessagehead1.equals(enterpreferredregionerrormessageexcel1)) {
					test.pass(
							"TC:45 AFTER SEND MORE THAN 512 LETTERS IN ENTER PREFERRED REGION.. 'ERROR MESSAGE DISPLAYED' -->"
									+ "'" + enterpreferredregionerrormessagehead1 + "'");
				} else {
					test.fail(
							"TC:45 AFTER SEND MORE THAN 512 LETTERS ENTER PREFERRED REGION...' ERROR MESSAGE IS NOT DISPLAYED");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "AFTER SEND MORE THAN 512 LETTERS ENTER PREFERRED REGION.... ERROR MESSAGE IS NOT DISPLAYED");
				}
			} else {
				test.fail(
						"TC:45 USER SHOULD BE SEND MORE THAN 512 ALL CHARACTERS IN 'ENTER PREFERRED REGION.. ..' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND MORE THAN 512 ALL CHARACTERS IN 'ENTER PREFERRED REGION.. ' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE
		try {
			String enterpreferredregionerrormessagehead1 = page.enterpreferredregionerrormessagemethod();
			String enterpreferredregionerrormessageexcel1 = Excelreader.getData(0, 171, 6);
			if (enterpreferredregionerrormessagehead1.equals(enterpreferredregionerrormessageexcel1)) {
				test.pass("TC:45 ENTER PREFERRED REGION.. 'ERROR MESSAGE DISPLAYED' -->" + "'"
						+ enterpreferredregionerrormessagehead1 + "'");
			} else {
				test.fail("TC:45 ENTER PREFERRED REGION...' ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "ENTER PREFERRED REGION.... ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 40)
	public void Have_You_Ever_Applied_For_AMcDonalds() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Have_You_Ever_Applied_For_AMcDonalds");

		// *Have you ever applied for a McDonald's franchise? If so, where and when?
		// (0/512 characters)
		try {
			String haveyoueverappliedforaMcDonaldlabelhead = page.haveyoueverappliedforaMcDonaldlabelmethod();
			String haveyoueverappliedforaMcDonaldlabelexcel = Excelreader.getData(0, 172, 5);
			if (haveyoueverappliedforaMcDonaldlabelhead.equals(haveyoueverappliedforaMcDonaldlabelexcel)) {
				test.pass(
						"TC:46 THE LABEL 'HAVE YOU EVER APPLIED FOR A McDONALD'S FRANCHISE? IF SO, WHERE AND WHEN.. ' IS DISPLAYED ");
			} else {
				test.fail(
						"TC:46 THE  LABEL 'HAVE YOU EVER APPLIED FOR A McDONALD'S FRANCHISE? IF SO, WHERE AND WHEN..... ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'HAVE YOU EVER APPLIED FOR A McDONALD'S FRANCHISE? IF SO, WHERE AND WHEN.... IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK *Have you ever applied for a McDonald's franchise? If so, where
		// and when? (0/512 characters)
		try {
			String haveyoueverappliedforaMcDonaldlabelhead = page.haveyoueverappliedforaMcDonaldlabelmethod1();
			String haveyoueverappliedforaMcDonaldlabelexcel = Excelreader.getData(0, 172, 5);
			if (haveyoueverappliedforaMcDonaldlabelhead.equals(haveyoueverappliedforaMcDonaldlabelexcel)) {
				test.pass(
						"TC:46 THE LABEL 'HAVE YOU EVER APPLIED FOR A McDONALD'S FRANCHISE? IF SO, WHERE AND WHEN.. ' IS ROLLED UP ");
			} else {
				test.fail(
						"TC:46 THE  LABEL 'HAVE YOU EVER APPLIED FOR A McDONALD'S FRANCHISE? IF SO, WHERE AND WHEN..... ' IS NOT ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'HAVE YOU EVER APPLIED FOR A McDONALD'S FRANCHISE? IF SO, WHERE AND WHEN.... IS NOT ROLLED UP");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send all LETTERS
		try {
			String haveyoueverappliedforaMcDonaldsendedvalueexcel = Excelreader.getData(0, 173, 5);
			String haveyoueverappliedforaMcDonaldsendedvaluehead = page
					.haveyoueverappliedforaMcDonaldsendedvaluemethod(haveyoueverappliedforaMcDonaldsendedvalueexcel);
			if (haveyoueverappliedforaMcDonaldsendedvaluehead.equals(haveyoueverappliedforaMcDonaldsendedvalueexcel)) {
				test.pass(
						"TC:46 USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'HAVE YOU EVER APPLIED FOR A McDONALD'S FRANCHISE...' FUNCTION");
			} else {
				test.fail(
						"TC:46 USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'HAVE YOU EVER APPLIED FOR A McDONALD'S FRANCHISE....' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'HAVE YOU EVER APPLIED FOR A McDONALD'S FRANCHISE....' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send more than 512 all LETTERS
		try {
			String haveyoueverappliedforaMcDonaldsendedvalueexcel = Excelreader.getData(0, 174, 5);
			String haveyoueverappliedforaMcDonaldsendedvaluehead = page
					.haveyoueverappliedforaMcDonaldsendedvaluemethod(haveyoueverappliedforaMcDonaldsendedvalueexcel);
			if (haveyoueverappliedforaMcDonaldsendedvaluehead.equals(haveyoueverappliedforaMcDonaldsendedvalueexcel)) {
				test.pass(
						"TC:46 USER SHOULD BE SEND MORE THAN 512 ALL LETTERS IN 'HAVE YOU EVER APPLIED FOR A McDONALD'S FRANCHISE...' FUNCTION");
				// error message afet enter 512 letters
				String haveyoueverappliedforaMcDonalderrormessagehead = page
						.haveyoueverappliedforaMcDonalderrormessagemethod1();
				String haveyoueverappliedforaMcDonalderrormessageexcel = Excelreader.getData(0, 175, 5);
				if (haveyoueverappliedforaMcDonalderrormessagehead
						.equals(haveyoueverappliedforaMcDonalderrormessageexcel)) {
					test.pass(
							"TC:46 AFTER ENTER MORE THAN 512 LETTERS IN HAVE YOU EVER APPLIED FOR A McDONALD'S FRANCHISE.... 'ERROR MESSAGE DISPLAYED' -->"
									+ "'" + haveyoueverappliedforaMcDonalderrormessagehead + "'");
				} else {
					test.fail(
							"TC:46 AFTER ENTER MORE THAN 512 LETTERS HAVE YOU EVER APPLIED FOR A McDONALD'S FRANCHISE.....' ERROR MESSAGE IS NOT DISPLAYED");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "AFTER ENTER MORE THAN 512 LETTERS HAVE YOU EVER APPLIED FOR A McDONALD'S FRANCHISE...... ERROR MESSAGE IS NOT DISPLAYED");
				}
			} else {
				test.fail(
						"TC:46 USER SHOULD BE SEND MORE THAN 512 ALL LETTERS IN 'HAVE YOU EVER APPLIED FOR A McDONALD'S FRANCHISE....' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND MORE THAN 512 ALL LETTERS IN 'HAVE YOU EVER APPLIED FOR A McDONALD'S FRANCHISE....' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// ERROR MESSAGE
		try {
			String haveyoueverappliedforaMcDonalderrormessagehead = page
					.haveyoueverappliedforaMcDonalderrormessagemethod();
			String haveyoueverappliedforaMcDonalderrormessageexcel = Excelreader.getData(0, 175, 6);
			if (haveyoueverappliedforaMcDonalderrormessagehead
					.equals(haveyoueverappliedforaMcDonalderrormessageexcel)) {
				test.pass("TC:46 HAVE YOU EVER APPLIED FOR A McDONALD'S FRANCHISE.... 'ERROR MESSAGE DISPLAYED' -->"
						+ "'" + haveyoueverappliedforaMcDonalderrormessagehead + "'");
			} else {
				test.fail(
						"TC:46 HAVE YOU EVER APPLIED FOR A McDONALD'S FRANCHISE.....' ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "HAVE YOU EVER APPLIED FOR A McDONALD'S FRANCHISE...... ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 41)
	public void How_Did_You_Learn_Of_McDonalds_Franchise() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("How_Did_You_Learn_Of_McDonalds_Franchise");

		// *How did you learn of McDonald’s franchise opportunities?
		try {
			String howdidyoulearnoffranchiseopportunitieslabelhead = page
					.howdidyoulearnoffranchiseopportunitieslabelmethod();
			String howdidyoulearnoffranchiseopportunitieslabelexcel = Excelreader.getData(0, 176, 5);
			if (howdidyoulearnoffranchiseopportunitieslabelhead
					.equals(howdidyoulearnoffranchiseopportunitieslabelexcel)) {
				test.pass("TC:47 THE LABEL 'HOW DID YOU LEARN OF McDONALD'S FRANCHISE OPPORTUNITIES.. ' IS DISPLAYED ");
			} else {
				test.fail(
						"TC:47 THE  LABEL 'HOW DID YOU LEARN OF McDONALD'S FRANCHISE OPPORTUNITIES.... ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'HOW DID YOU LEARN OF McDONALD'S FRANCHISE OPPORTUNITIES.... IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// Online/Website
		try {
			String onlinewebsitehowdidyoulearnoffranchiseopportunitieshead = page
					.onlinewebsitehowdidyoulearnoffranchiseopportunitiesmethod();
			String onlinewebsitehowdidyoulearnoffranchiseopportunitiesexcel = Excelreader.getData(0, 177, 5);
			if (onlinewebsitehowdidyoulearnoffranchiseopportunitieshead
					.equals(onlinewebsitehowdidyoulearnoffranchiseopportunitiesexcel)) {
				test.pass(
						"TC:47 THE LABEL 'ONLINE/WEBSITE IN HOW DID YOU LEARN OF McDONALD'S FRANCHISE OPPORTUNITIES.. ' IS DISPLAYED ");
			} else {
				test.fail(
						"TC:47 THE  LABEL 'ONLINE/WEBSITE IN HOW DID YOU LEARN OF McDONALD'S FRANCHISE OPPORTUNITIES.... ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'ONLINE/WEBSITE IN HOW DID YOU LEARN OF McDONALD'S FRANCHISE OPPORTUNITIES.... IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// McDonald's Employee
		try {
			String mcdonaldemployeehowdidyoulearnoffranchiseopportunitieshead = page
					.mcdonaldemployeehowdidyoulearnoffranchiseopportunitiesmethod();
			String mcdonaldemployeehowdidyoulearnoffranchiseopportunitiesexcel = Excelreader.getData(0, 178, 5);
			if (mcdonaldemployeehowdidyoulearnoffranchiseopportunitieshead
					.equals(mcdonaldemployeehowdidyoulearnoffranchiseopportunitiesexcel)) {
				test.pass(
						"TC:47 THE LABEL 'McDONALD'S EMPLOYEE IN HOW DID YOU LEARN OF McDONALD'S FRANCHISE OPPORTUNITIES.. ' IS DISPLAYED ");
			} else {
				test.fail(
						"TC:47 THE  LABEL 'McDONALD'S EMPLOYEE IN HOW DID YOU LEARN OF McDONALD'S FRANCHISE OPPORTUNITIES.... ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'McDONALD'S EMPLOYEE IN HOW DID YOU LEARN OF McDONALD'S FRANCHISE OPPORTUNITIES.... IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// McDonald's Franchisee
		try {
			String mcdonaldfranchiseehowdidyoulearnoffranchiseopportunitieshead = page
					.mcdonaldfranchiseehowdidyoulearnoffranchiseopportunitiesmethod();
			String mcdonaldfranchiseehowdidyoulearnoffranchiseopportunitiesexcel = Excelreader.getData(0, 181, 5);
			if (mcdonaldfranchiseehowdidyoulearnoffranchiseopportunitieshead
					.equals(mcdonaldfranchiseehowdidyoulearnoffranchiseopportunitiesexcel)) {
				test.pass(
						"TC:47 THE LABEL 'McDONALD'S FRANCHISEE IN HOW DID YOU LEARN OF McDONALD'S FRANCHISE OPPORTUNITIES.. ' IS DISPLAYED ");
			} else {
				test.fail(
						"TC:47 THE  LABEL 'McDONALD'S FRANCHISEE IN HOW DID YOU LEARN OF McDONALD'S FRANCHISE OPPORTUNITIES.... ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'McDONALD'S FRANCHISEE IN HOW DID YOU LEARN OF McDONALD'S FRANCHISE OPPORTUNITIES.... IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// Other
		try {
			String otherhowdidyoulearnoffranchiseopportunitieshead = page
					.otherhowdidyoulearnoffranchiseopportunitiesmethod();
			String otherhowdidyoulearnoffranchiseopportunitiesexcel = Excelreader.getData(0, 184, 5);
			if (otherhowdidyoulearnoffranchiseopportunitieshead
					.equals(otherhowdidyoulearnoffranchiseopportunitiesexcel)) {
				test.pass(
						"TC:47 THE LABEL 'OTHER IN HOW DID YOU LEARN OF McDONALD'S FRANCHISE OPPORTUNITIES.. ' IS DISPLAYED ");
			} else {
				test.fail(
						"TC:47 THE  LABEL 'OTHER IN HOW DID YOU LEARN OF McDONALD'S FRANCHISE OPPORTUNITIES.... ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'OTHER IN HOW DID YOU LEARN OF McDONALD'S FRANCHISE OPPORTUNITIES.... IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// Online/Website RADIO BUTTON
		try {
			String onlinewebsiteradiobuttonhead = page.onlinewebsiteradiobuttonmethod();
			if (!onlinewebsiteradiobuttonhead.equals("true")) {
				test.pass("TC:47 RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT IN ONLINE/WEBSITE FUNCTION");
			} else {
				test.fail("TC:47 RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT IN ONLINE/WEBSITE FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT IN ONLINE/WEBSITE FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}

		// McDonald's Employee
		try {
			String mcdonaldemployeeradiobuttonhead = page.mcdonaldemployeeradiobuttonmethod();
			if (!mcdonaldemployeeradiobuttonhead.equals("true")) {
				test.pass("TC:47 RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT IN McDONALD'S EMPLOYEE FUNCTION");
			} else {
				test.fail("TC:47 RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT IN McDONALD'S EMPLOYEE FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT IN McDONALD'S EMPLOYEE FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// McDonald's franchisee
		try {
			String mcdonaldfranchiseeradiobuttonhead = page.mcdonaldfranchiseeradiobuttonmethod();
			if (!mcdonaldfranchiseeradiobuttonhead.equals("true")) {
				test.pass("TC:47 RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT IN McDONALD'S FRANCHISEE FUNCTION");
			} else {
				test.fail("TC:47 RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT IN McDONALD'S FRANCHISEE FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT IN McDONALD'S FRANCHISEE FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}

		// other
		try {
			String otherradiobuttonhead = page.otherradiobuttonmethod();
			if (!otherradiobuttonhead.equals("true")) {
				test.pass("TC:47 RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT IN OTHER FUNCTION");
			} else {
				test.fail("TC:47 RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT IN OTHER FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT IN OTHER FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// Online/Website RADIO BUTTON CLICK
		try {
			String onlinewebsiteradiobuttonhead = page.onlinewebsiteradiobuttonmethod1();
			if (onlinewebsiteradiobuttonhead.equals("true")) {
				test.pass("TC:47 RADIO BUTTON SHOULD BE CLICKABLE IN ONLINE/WEBSITE FUNCTION");
			} else {
				test.fail("TC:47 RADIO BUTTON SHOULD BE CLICKABLE IN ONLINE/WEBSITE FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "RADIO BUTTON SHOULD BE CLICKABLE IN ONLINE/WEBSITE FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}

		// McDonald's Employee
		try {
			String mcdonaldemployeeradiobuttonhead = page.mcdonaldemployeeradiobuttonmethod1();
			if (mcdonaldemployeeradiobuttonhead.equals("true")) {
				test.pass("TC:47 RADIO BUTTON SHOULD SHOULD BE CLICKABLE IN McDONALD'S EMPLOYEE FUNCTION");
				// employee name & position
				try {
					String employeenamepositionlabelhead = page.employeenamepositionlabelmethod();
					String employeenamepositionlabelexcel = Excelreader.getData(0, 179, 5);
					if (employeenamepositionlabelhead.equals(employeenamepositionlabelexcel)) {
						test.pass(
								"TC:47 THE LABEL 'EMPLOYEE NAME & POSITION ' IS DISPLAYED AFTER SELECT RADIOBUTTON OF McDONALD'S EMPLOYEE");
					} else {
						test.fail(
								"TC:47 THE LABEL 'EMPLOYEE NAME & POSITION ' IS NOT DISPLAYED AFTER SELECT RADIOBUTTON OF McDONALD'S EMPLOYEE");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
								+ "THE LABEL 'EMPLOYEE NAME & POSITION ' IS NOT DISPLAYED AFTER SELECT RADIOBUTTON OF McDONALD'S EMPLOYEE");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// employee name & position
				try {
					String employeenamepositionlabelhead = page.employeenamepositionlabelmethod1();
					String employeenamepositionlabelexcel = Excelreader.getData(0, 179, 5);
					if (employeenamepositionlabelhead.equals(employeenamepositionlabelexcel)) {
						test.pass(
								"TC:47 THE LABEL 'EMPLOYEE NAME & POSITION ' IS ROLLED UP AFTER SELECT RADIOBUTTON OF McDONALD'S EMPLOYEE");
					} else {
						test.fail(
								"TC:47 THE LABEL 'EMPLOYEE NAME & POSITION ' IS NOT ROLLED UP AFTER SELECT RADIOBUTTON OF McDONALD'S EMPLOYEE");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
								+ "THE LABEL 'EMPLOYEE NAME & POSITION ' IS NOT ROLLED UP AFTER SELECT RADIOBUTTON OF McDONALD'S EMPLOYEE");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// SEND ALL LETTERS
				try {
					String employeenamepositionsendedvalueexcel = Excelreader.getData(0, 180, 5);
					String employeenamepositionsendedvaluehead = page
							.employeenamepositionsendedvaluemethod(employeenamepositionsendedvalueexcel);
					if (employeenamepositionsendedvaluehead.equals(employeenamepositionsendedvalueexcel)) {
						test.pass(
								"TC:47 USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'EMPLOYEE NAME & POSITION ' FUNCTION AFTER SELECT RADIO BUTTON OF McDONALD'S EMPLOYEE");
					} else {
						test.fail(
								"TC:47 USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'EMPLOYEE NAME & POSITION ...' FUNCTION AFTER SELECT RADIO BUTTON OF McDONALD'S EMPLOYEE");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
								+ "USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'EMPLOYEE NAME & POSITION ...' FUNCTION AFTER SELECT RADIO BUTTON OF McDONALD'S EMPLOYEE");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
			} else {
				test.fail("TC:47 RADIO BUTTON SHOULD BE CLICKABLE IN McDONALD'S EMPLOYEE FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "RADIO BUTTON SHOULD BE CLICKABLE IN McDONALD'S EMPLOYEE FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// McDonald's franchisee
		try {
			String mcdonaldfranchiseeradiobuttonhead = page.mcdonaldfranchiseeradiobuttonmethod1();
			if (mcdonaldfranchiseeradiobuttonhead.equals("true")) {
				test.pass("TC:47 RADIO BUTTON SHOULD BE CLICKABLE IN McDONALD'S FRANCHISEE FUNCTION");
				// McDonald's Franchisee Name
				try {
					String mcdonaldsfranchiseenamelabelhead = page.mcdonaldsfranchiseenamelabelmethod();
					String mcdonaldsfranchiseenamelabelexcel = Excelreader.getData(0, 182, 5);
					if (mcdonaldsfranchiseenamelabelhead.equals(mcdonaldsfranchiseenamelabelexcel)) {
						test.pass(
								"TC:47 THE LABEL 'McDONALD'S FRANCHISEE NAME' IS DISPLAYED AFTER SELECT RADIOBUTTON OF McDONALD'S FRANCHISEE");
					} else {
						test.fail(
								"TC:47 THE LABEL 'McDONALD'S FRANCHISEE NAME ' IS NOT DISPLAYED AFTER SELECT RADIOBUTTON OF McDONALD'S FRANCHISEE");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
								+ "THE LABEL 'McDONALD'S FRANCHISEE NAME ' IS NOT DISPLAYED AFTER SELECT RADIOBUTTON OF McDONALD'S FRANCHISEE");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// McDonald's Franchisee Name afte click
				try {
					String mcdonaldsfranchiseenamelabelhead = page.mcdonaldsfranchiseenamelabelmethod();
					String mcdonaldsfranchiseenamelabelexcel = Excelreader.getData(0, 182, 5);
					if (mcdonaldsfranchiseenamelabelhead.equals(mcdonaldsfranchiseenamelabelexcel)) {
						test.pass(
								"TC:47 THE LABEL 'McDONALD'S FRANCHISEE NAME' IS ROLLED UP AFTER SELECT RADIOBUTTON OF McDONALD'S FRANCHISEE");
					} else {
						test.fail(
								"TC:47 THE LABEL 'McDONALD'S FRANCHISEE NAME ' IS NOT ROLLED UP AFTER SELECT RADIOBUTTON OF McDONALD'S FRANCHISEE");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
								+ "THE LABEL 'McDONALD'S FRANCHISEE NAME ' IS NOT ROLLED UP AFTER SELECT RADIOBUTTON OF McDONALD'S FRANCHISEE");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}

				// SEND ALL LETTERS
				try {
					String mcdonaldsfranchiseenamesendedvalueexcel = Excelreader.getData(0, 183, 5);
					String mcdonaldsfranchiseenamesendedvaluehead = page
							.mcdonaldsfranchiseenamesendedvaluemethod(mcdonaldsfranchiseenamesendedvalueexcel);
					if (mcdonaldsfranchiseenamesendedvaluehead.equals(mcdonaldsfranchiseenamesendedvalueexcel)) {
						test.pass(
								"TC:47 USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'McDONALD'S FRANCHISEE NAME ' FUNCTION AFTER SELECT RADIO BUTTON OF McDONALD'S FRANCHISEE");
					} else {
						test.fail(
								"TC:47 USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'McDONALD'S FRANCHISEE NAME.' FUNCTION AFTER SELECT RADIO BUTTON OF McDONALD'S FRANCHISEE");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
								+ "USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'McDONALD'S FRANCHISEE NAME.' FUNCTION AFTER SELECT RADIO BUTTON OF McDONALD'S FRANCHISEE");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
			} else {
				test.fail("TC:47 RADIO BUTTON SHOULD BE CLICKABLE IN McDONALD'S FRANCHISEE FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "RADIO BUTTON SHOULD BE CLICKABLE IN McDONALD'S FRANCHISEE FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}

		// other click
		try {
			String otherradiobuttonhead = page.otherradiobuttonmethod1();
			if (otherradiobuttonhead.equals("true")) {
				test.pass("TC:47 RADIO BUTTON SSHOULD BE CLICKABLE IN OTHER FUNCTION");
				// ENTER YOUR COMMENTS label

				String enteryourcommentslabelhead = page.enteryourcommentslabelmethod();
				String enteryourcommentslabelexcel = Excelreader.getData(0, 185, 5);
				if (enteryourcommentslabelhead.equals(enteryourcommentslabelexcel)) {
					test.pass(
							"TC:47 THE LABEL 'ENTER YOUR COMMENTS (0/512 CHARACTERS)' IS DISPLAYED AFTER SELECT RADIOBUTTON OF OTHER");
				} else {
					test.fail(
							"TC:47 THE LABEL 'ENTER YOUR COMMENTS (0/512 CHARACTERS) ' IS NOT DISPLAYED AFTER SELECT RADIOBUTTON OF OTHER");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "THE LABEL 'ENTER YOUR COMMENTS (0/512 CHARACTERS) ' IS NOT DISPLAYED AFTER SELECT RADIOBUTTON OF OTHER");
				}
				// after click ENTER YOUR COMMENTS label

				String enteryourcommentslabelhead1 = page.enteryourcommentslabelmethod1();
				String enteryourcommentslabelexcel1 = Excelreader.getData(0, 185, 5);
				if (enteryourcommentslabelhead1.equals(enteryourcommentslabelexcel1)) {
					test.pass(
							"TC:47 THE LABEL 'ENTER YOUR COMMENTS (0/512 CHARACTERS)' IS ROLLED UP AFTER SELECT RADIOBUTTON OF OTHER");
				} else {
					test.fail(
							"TC:47 THE LABEL 'ENTER YOUR COMMENTS (0/512 CHARACTERS) ' IS NOT ROLLER UP AFTER SELECT RADIOBUTTON OF OTHER");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "THE LABEL 'ENTER YOUR COMMENTS (0/512 CHARACTERS) ' IS NOT ROLLED UP AFTER SELECT RADIOBUTTON OF OTHER");
				}

				// SEND ALL LETTERS

				String enteryourcommentsclickexcel = Excelreader.getData(0, 186, 5);
				String enteryourcommentsclickhead = page.enteryourcommentsclickmethod(enteryourcommentsclickexcel);
				if (enteryourcommentsclickhead.equals(enteryourcommentsclickexcel)) {
					test.pass(
							"TC:47 USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'ENTER YOUR COMMENTS (0/512 CHARACTERS) ' FUNCTION AFTER SELECT RADIO BUTTON OF OTHER");
				} else {
					test.fail(
							"TC:47 USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'ENTER YOUR COMMENTS (0/512 CHARACTERS)' FUNCTION AFTER SELECT RADIO BUTTON OF OTHER");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'ENTER YOUR COMMENTS (0/512 CHARACTERS)' FUNCTION AFTER SELECT RADIO BUTTON OF OTHER");
				}
				// SEND MORE THAN 512 ALL LETTERS

				String enteryourcommentsclickexcel1 = Excelreader.getData(0, 187, 5);
				String enteryourcommentsclickhead1 = page.enteryourcommentsclickmethod(enteryourcommentsclickexcel);
				if (!enteryourcommentsclickhead1.equals(enteryourcommentsclickexcel1)) {
					test.pass(
							"TC:47 USER SHOULD NOT SEND MORE THAN 512 ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'ENTER YOUR COMMENTS (0/512 CHARACTERS) ' FUNCTION AFTER SELECT RADIO BUTTON OF OTHER");
				} else {
					test.fail(
							"TC:47 USER SHOULD NOT SEND MORE THAN 512 ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'ENTER YOUR COMMENTS (0/512 CHARACTERS)' FUNCTION AFTER SELECT RADIO BUTTON OF OTHER");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "USER SHOULD NOT SEND MORE THAN 512 ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'ENTER YOUR COMMENTS (0/512 CHARACTERS)' FUNCTION AFTER SELECT RADIO BUTTON OF OTHER");
				}
				// Online/Website RADIO BUTTON
				String onlinewebsiteradiobuttonhead = page.onlinewebsiteradiobuttonmethod();
				if (!onlinewebsiteradiobuttonhead.equals("true")) {
					test.pass(
							"TC:47 USER SHOULD NOT SELECT ALL RADIO BUTTONS IN ONLINE/WEBSITE OF HOW DID YOU LEARN OF McDONALD'S FRANCHISE OPPORTUNITIES FUNCTION");
				} else {
					test.fail(
							"TC:47 RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT IN ONLINE/WEBSITE OF HOW DID YOU LEARN OF McDONALD'S FRANCHISE OPPORTUNITIES FUNCTION");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT IN ONLINE/WEBSITE OF HOW DID YOU LEARN OF McDONALD'S FRANCHISE OPPORTUNITIES FUNCTION");
				}
				// McDonald's Employee
				String mcdonaldemployeeradiobuttonhead = page.mcdonaldemployeeradiobuttonmethod();
				if (!mcdonaldemployeeradiobuttonhead.equals("true")) {
					test.pass(
							"TC:47  USER SHOULD NOT SELECT ALL RADIO BUTTONS IN McDONALD'S EMPLOYEE OF HOW DID YOU LEARN OF McDONALD'S FRANCHISE OPPORTUNITIES FUNCTION");
				} else {
					test.fail(
							"TC:47 USER SHOULD NOT SELECT ALL RADIO BUTTONS IN McDONALD'S EMPLOYEE OF HOW DID YOU LEARN OF McDONALD'S FRANCHISE OPPORTUNITIES FUNCTION");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "USER SHOULD NOT SELECT ALL RADIO BUTTONS IN McDONALD'S EMPLOYEE OF HOW DID YOU LEARN OF McDONALD'S FRANCHISE OPPORTUNITIES FUNCTION");
				}
				// McDonald's franchisee
				String mcdonaldfranchiseeradiobuttonhead = page.mcdonaldfranchiseeradiobuttonmethod();
				if (!mcdonaldfranchiseeradiobuttonhead.equals("true")) {
					test.pass(
							"TC:47 USER SHOULD NOT SELECT ALL RADIO BUTTONS IN McDONALD'S FRANCHISEE OF HOW DID YOU LEARN OF McDONALD'S FRANCHISE OPPORTUNITIES FUNCTION");
				} else {
					test.fail(
							"TC:47 USER SHOULD NOT SELECT ALL RADIO BUTTONS IN McDONALD'S FRANCHISEE OF HOW DID YOU LEARN OF McDONALD'S FRANCHISE OPPORTUNITIES FUNCTION");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "USER SHOULD NOT SELECT ALL RADIO BUTTONS IN McDONALD'S FRANCHISEE OF HOW DID YOU LEARN OF McDONALD'S FRANCHISE OPPORTUNITIES FUNCTION");
				}
			} else {
				test.fail("TC:47 RADIO BUTTON SHOULD BE CLICKABLE IN OTHER FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "RADIO BUTTON SHOULD BE CLICKABLE IN OTHER FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// ERROR MESSAGE *How did you learn of McDonald’s franchise opportunities?
		try {
			String howdidyoulearnofmcdonalderrormessagelabelhead = page
					.howdidyoulearnofmcdonalderrormessagelabelmethod();
			String howdidyoulearnofmcdonalderrormessagelabelexcel = Excelreader.getData(0, 188, 5);
			if (howdidyoulearnofmcdonalderrormessagelabelhead.equals(howdidyoulearnofmcdonalderrormessagelabelexcel)) {
				test.pass(
						"TC:46 HOW DID YOU LEARN OF McDONALD'S FRANCHISE OPPORTUNITIES.... 'ERROR MESSAGE DISPLAYED' -->"
								+ "'" + howdidyoulearnofmcdonalderrormessagelabelhead + "'");
			} else {
				test.fail(
						"TC:46 HOW DID YOU LEARN OF McDONALD'S FRANCHISE OPPORTUNITIES...' ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "HOW DID YOU LEARN OF McDONALD'S FRANCHISE OPPORTUNITIES..... ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 42)
	public void Terms_And_Conditions() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Terms_And_Conditions");
		// *Terms and Conditions
		try {
			String termsandconditionlablehead = page.termsandconditionlablemethod();
			String termsandconditionlableexcel = Excelreader.getData(0, 189, 5);
			if (termsandconditionlablehead.equals(termsandconditionlableexcel)) {
				test.pass("TC:48 THE LABEL 'TERMS AND CONDITIONS. ' IS DISPLAYED ");
			} else {
				test.fail("TC:48 THE  LABEL 'TERMS AND CONDITIONS.... ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'TERMS AND CONDITIONS.... IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// I AGREE LABEL
		try {
			String iagreelabelhead = page.iagreelabelmethod();
			String iagreelabelexcel = Excelreader.getData(0, 190, 5);
			if (iagreelabelhead.equals(iagreelabelexcel)) {
				test.pass("TC:48 THE LABEL 'I AGREE ' IS DISPLAYED ");
			} else {
				test.fail("TC:48 THE  LABEL 'I AGREE. ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL  LABEL 'I AGREE. IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// I AGREE CHECK BOX
		try {
			String iagreecheckboxhead = page.iagreecheckboxmethod();
			if (!iagreecheckboxhead.equals("true")) {
				test.pass("TC:48 CHECK BOX SHOULD NOT SELECTED BY DEFAULT IN 'I AGREE' FUNCTION");
			} else {
				test.fail("TC:48 CHECK BOX SHOULD NOT SELECTED BY DEFAULT IN 'I AGREE' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "CHECK BOX SHOULD NOT SELECTED BY DEFAULT IN 'I AGREE' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// I AGREE CHECK BOX CLICK
		try {
			String iagreecheckboxhead = page.iagreecheckboxmethod1();
			if (iagreecheckboxhead.equals("true")) {
				test.pass("TC:48 CHECK BOX SHOULD BE CLICKABLE IN 'I AGREE' FUNCTION");
			} else {
				test.fail("TC:48 CHECK BOX SHOULD BE CLICKABLE IN 'I AGREE' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "CHECK BOX SHOULD BE CLICKABLE IN 'I AGREE' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// ERROR MESSAGE
		try {
			String iagreecheckboxerrormessagehead = page.iagreecheckboxerrormessagemethod();
			String iagreecheckboxerrormessageexcel = Excelreader.getData(0, 191, 5);
			if (iagreecheckboxerrormessagehead.equals(iagreecheckboxerrormessageexcel)) {
				test.pass("TC:48 TERMS AND CONDITIONS.... 'ERROR MESSAGE DISPLAYED' -->" + "'"
						+ iagreecheckboxerrormessagehead + "'");
			} else {
				test.fail("TC:48 TERMS AND CONDITIONS...' ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "TERMS AND CONDITIONS.... ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 43)
	public void GLOBAL_ERROR_MESSAGE_AND_RESET_BUTTON() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("GLOBAL_ERROR_MESSAGE_AND_RESET_BUTTON");
		try {
			// Global error message
			String globalerrormessagehead = page.globalerrormessagemethod();
			String globalerrormessageexcel = Excelreader.getData(0, 192, 5);
			if (globalerrormessagehead.equals(globalerrormessageexcel)) {
				test.pass("TC:48 GLOBAL ERROR MESSAGE IS DIPLAYED ");
			} else {
				test.fail("TC:48 GLOBAL ERROR MESSAGE IS DIPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "GLOBAL ERROR MESSAGE IS DIPLAYED");
			}
			// RESET BUTTON
			String resetbuttonhead = page.resetbuttonmethod();
			String resetbuttonexcel = Excelreader.getData(0, 192, 5);
			if (!resetbuttonhead.equals(resetbuttonexcel)) {
				test.pass("TC:48 RESET BUTTON IS  WORKING ");
			} else {
				test.fail("TC:48 RESET BUTTON IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "RESET BUTTON IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	/*@Test(priority = 44)
	public void Positive_Scenario_Franchising() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Positive_Scenario_Franchising");

		try {
			driver.get(Basepage.readProperty("urlF"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");
			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "URL IS NOT OPENED");
				extent.flush();
				driver.close();
				throw new SkipException("Skipping - ");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
			extent.flush();
			driver.close();
			throw new SkipException("Skipping - ");

		}
		// CHARACTERS VALUES IN FIRST NAME FUNCTION
		try {
			String firstnamesendvalexcel = Excelreader.getData(0, 9, 5);
			String sendedvalhead = page.firstnamesendedvaluemethod1(firstnamesendvalexcel);
			if (sendedvalhead.equals(firstnamesendvalexcel)) {
				test.pass("TC:9  USE SHOULD  BE SEND CHARACTERS  IN FIRSTNAME FUNCTION");
			} else {
				test.fail("TC:9  USE SHOULD BE SEND CHARACTERS IN FIRSTNAME FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USE SHOULD  BE SEND CHARACTERS IN FIRSTNAME FUNCTION");
			}
		} catch (Exception e) {

			test.fail("Error:" + e.getMessage());
		}
		// CHARACTERS IN LAST NAME FUNCTION
		try {
			String LNSPECIALCHARACTER = Excelreader.getData(0, 15, 5);
			String LAscvalue = page.LNsendvaluemethod(LNSPECIALCHARACTER);
			if (LAscvalue.equals(LNSPECIALCHARACTER)) {
				test.pass("TC:10 USER SHOULD BE SEND CHARACTERS IN LASTNAME FUNCTION");
			} else {
				test.fail("TC:10 USER SHOULD BE SEND CHARACTERS IN LASTNAME FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD  BE SEND CHARACTERS IN LASTNAME FUNCTION");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ENTER 10 NUMERICAL
		try {
			String phonecharacterhead = Excelreader.getData(0, 23, 5);
			String phonenumCenteredval = page.phonenumbersendmethod(phonecharacterhead);
			if (phonenumCenteredval.equals(phonecharacterhead)) {
				test.pass("TC:11 USER SHOULD  SEND 10 NUMERICAL IN PHONE NUMBER FUNCTION ");
			} else {
				test.fail("TC:11 USER SHOULD  SEND 10 NUMERICAL IN PHONE NUMBER FUNCTION ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD SEND 10 NUMERICAL IN PHONE NUMBER FUNCTION ");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// SEND WITH MAIL FORMAT
		try {
			String emailsendid = Excelreader.getData(0, 194, 5);
			String emailvlue = page.mailsendmethod(emailsendid);
			if (emailvlue.equals(emailsendid)) {
				test.pass("TC:12  USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
			} else {
				test.fail("TC:12 USER SHOULD SEND MAIL WITH FORMAT IN MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD SEND MAIL WITH FORMAT IN MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// NUMARICAL AND CHARACTERS SEND IN ADDRESS US(ONLY)
		try {
			String addressspecharacterhead = Excelreader.getData(0, 32, 5);
			String adsccnvalue = page.addresssendedvaluemethod(addressspecharacterhead);
			if (adsccnvalue.equals(addressspecharacterhead)) {
				test.pass("TC:13 USER SHOULD  SEND NUMARICAL AND CHARACTERS IN ADDRESS FUNCTION");
			} else {
				test.fail("TC:13 USER SHOULD SEND NUMARICAL AND CHARACTERS IN ADDRESS FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD  SEND NUMARICAL AND CHARACTERS IN ADDRESS FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// CHARACTERS city
		try {
			String citycharactersexcel = Excelreader.getData(0, 38, 5);
			String citySCenteredvalue = page.citysendedvaluemethod(citycharactersexcel);
			if (citySCenteredvalue.equals(citycharactersexcel)) {
				test.pass("TC:14 USER SHOULD  SEND CHARACTERS IN CITY FUNCTION");
			} else {
				test.fail("TC:14 USER SHOULD SEND CHARACTERS IN CITY FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD SEND CHARACTERS IN CITY FUNCTION");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK ON STATE AND LABEL IS ROLLED UP OR NOT
		try {
			String statelabelhead = page.statelabelmethod1();
			String staelabelexcel = Excelreader.getData(0, 41, 5);
			if (statelabelhead.equals(staelabelexcel)) {
				test.pass("TC:15 THE LABEL 'STATE' IS ROLLED UP AFTER CLICK ON STATE FUNCTION ");
				// select drop down values of state function
				String statedropdownvaluehead = page.stateselecteddropdownvalmethod();
				String statedropdownvalueEXCEL = Excelreader.getData(0, 43, 5);
				if (statedropdownvaluehead.equals(statedropdownvalueEXCEL)) {
					test.pass("TC:15 USER SHOULD BE SELECTED STATE DROP DOWN VALUE");
				} else {
					test.fail("TC:15 USER SHOULD BE SELECTED STATE DROP DOWN VALUE");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
							+ "USER SHOULD BE SELECTED STATE DROP DOWN VALUE");
				}
			} else {
				test.fail("TC:15 THE LABEL 'STATE' IS ROLLED UP AFTER CLICK ON STATE FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THE LABEL 'STATE' IS ROLLED UP AFTER CLICK ON STATE FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// NUMERICAL in zip
		try {
			String zipsendedvaluesexcel = Excelreader.getData(0, 47, 5);
			String zipsendedvalueshead = page.zipsendedvaluermethod(zipsendedvaluesexcel);
			if (zipsendedvalueshead.equals(zipsendedvaluesexcel)) {
				test.pass("TC:16 USER SHOULD ENTERD NUMERICAL IN ZIP TEXTBOX");
			} else {

				test.fail("TC:16 USER SHOULD ENTERD NUMERICAL IN ZIP TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD ENTERD NUMERICAL IN ZIP TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send CHARECTERS AND SPECIAL CHARECTER AND NUMARICAL
		try {
			String haveyoubeeneversendedvalueexcel = Excelreader.getData(0, 53, 5);
			String haveyoubeeneversendedvaluehead = page
					.haveyoubeeneversendedvaluemethod(haveyoubeeneversendedvalueexcel);
			if (haveyoubeeneversendedvaluehead.equals(haveyoubeeneversendedvalueexcel)) {
				test.pass(
						"TC:17 USER SHOULD BE ENTERD CHARECTERS, SPECEAL CHARECTERS, NUMERICAL AND SPACE ALSO IN HAVE YOU EVER BEEN.. FUNCTION");
			} else {

				test.fail(
						"TC:17 USER SHOULD BE ENTERD CHARACTERS, SPECEAL CHARECTERS, NUMERICAL AND SPACE ALSO IN HAVE YOU EVER BEEN.. FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE ENTERD CHARACTERS, SPECEAL CHARECTERS, NUMERICAL AND SPACE ALSO IN HAVE YOU EVER BEEN.. FUNCTION");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send CHARECTERS AND SPECIAL CHARECTER AND NUMARICAL
		try {
			String haveyouoryourspousesendedvalueexcel = Excelreader.getData(0, 57, 5);
			String haveyouoryourspousesendedvaluehead = page
					.haveyouoryourspousesendedvaluemethod(haveyouoryourspousesendedvalueexcel);
			if (haveyouoryourspousesendedvaluehead.equals(haveyouoryourspousesendedvalueexcel)) {
				test.pass(
						"TC:18 USER SHOULD BE ENTERD CHARECTERS, SPECEAL CHARECTERS, NUMERICAL AND SPACE ALSO IN HAVE YOU OR YOUR.. FUNCTION");
			} else {

				test.fail(
						"TC:18 USER SHOULD BE ENTERD CHARACTERS, SPECEAL CHARECTERS, NUMERICAL AND SPACE ALSO IN HAVE YOU OR YOUR.. FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE ENTERD CHARACTERS, SPECEAL CHARECTERS, NUMERICAL AND SPACE ALSO IN HAVE YOU OR YOUR.. FUNCTION");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// after click yes radio button
		try {
			String yesadiobuttonbydefaultselectedhead = page.yesadiobuttonbydefaultselectedmethod1();
			if (yesadiobuttonbydefaultselectedhead.equals("true")) {
				test.pass("TC:19 YES RADIO BUTTON SHOULD BE CLICKABLE");
			} else {
				test.fail("TC:19 YES RADIO BUTTON SHOULD  BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "YES RADIO BUTTON SHOULD BE CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// after click No radio button
		try {
			String noradiodefaultbuttonlanguagehead = page.noradiodefaultbuttonlanguagemethod1();
			if (noradiodefaultbuttonlanguagehead.equals("true")) {
				test.pass("TC:20 NO RADIO BUTTON SHOULD BE CLICKABLE");
			} else {
				test.fail("TC:20 NO RADIO BUTTON SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "NO RADIO BUTTON SHOULD BE CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// after click *Last year of schooling completed
		try {
			String lastyearofschoolingdropdownvaluehead = page.lastyearofschoolingdropdownvaluemethod1();
			String lastyearofschoolingdropdownvalueexcel = Excelreader.getData(0, 73, 5);
			if (lastyearofschoolingdropdownvaluehead.equals(lastyearofschoolingdropdownvalueexcel)) {
				test.pass("TC:23 USER SHOULD BE SELECT DROP DOWN VALUE ON 'LAST YEAT OF SCHOOLING COMPLETED' FUNCTION");
			} else {
				test.fail("TC:23 USER SHOULD BE SELECT DROP DOWN VALUE ON 'LAST YEAT OF SCHOOLING COMPLETED' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SELECT DROP DOWN VALUE ON LAST YEAT OF SCHOOLING COMPLETED FUNCTION");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// send numerical and special character in occupation
		try {
			String occupationsendedvalueexcel = Excelreader.getData(0, 82, 5);
			String occupationsendedvaluehead = page.occupationsendedvaluemethod(occupationsendedvalueexcel);
			if (occupationsendedvaluehead.equals(occupationsendedvalueexcel)) {
				test.pass("TC:26 USER SHOULD BE SEND ALL CHARACTERS IN 'OCCUPATIONAL FIELD ' FUNCTION");
			} else {
				test.fail("TC:26 USER SHOULD BE SEND ALL CHARACTERS IN 'OCCUPATIONAL FIELD' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND ALL CHARACTERS IN 'OCCUPATIONAL FIELD' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send numerical and special character in POSITION HELP
		try {
			String positionheldsendedvalueexcel = Excelreader.getData(0, 86, 5);
			String positionheldsendedvaluehead = page.positionheldsendedvaluemethod(positionheldsendedvalueexcel);
			if (positionheldsendedvaluehead.equals(positionheldsendedvalueexcel)) {
				test.pass("TC:27 USER SHOULD BE SEND  ALL CHARACTERS IN 'POSITION HELP ' FUNCTION");
			} else {
				test.fail("TC:27 USER SHOULD BE SEND  ALL CHARACTERS IN 'POSITION HELP' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND ALL CHARACTERS IN 'POSITION HELP' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send numerical and special character in company name
		try {
			String companynamesendedvalueexcel = Excelreader.getData(0, 90, 5);
			String companynamesendedvaluehead = page.companynamesendedvaluemethod(companynamesendedvalueexcel);
			if (companynamesendedvaluehead.equals(companynamesendedvalueexcel)) {
				test.pass("TC:28 USER SHOULD BE SEND  ALL CHARACTERS IN 'COMPANY NAME ' FUNCTION");
			} else {
				test.fail("TC:28 USER SHOULD BE SEND  ALL CHARACTERS IN 'COMPANY NAME' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND  ALL CHARACTERS IN 'COMPANY NAME' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send numerical and special character in describe deties, number of employee
		try {
			String describedutiesnumbersendedexcel = Excelreader.getData(0, 94, 5);
			String describedutiesnumbersendedhead = page
					.describedutiesnumbersendedmethod(describedutiesnumbersendedexcel);
			if (describedutiesnumbersendedhead.equals(describedutiesnumbersendedexcel)) {
				test.pass(
						"TC:29 USER SHOULD BE SEND  ALL CHARACTERS IN 'DESCRIBE DETIES, NUMBER OF EMPLOYEES.... ' FUNCTION");
			} else {
				test.fail(
						"TC:29 USER SHOULD BE SEND  ALL CHARACTERS IN 'DESCRIBE DETIES, NUMBER OF EMPLOYEES....' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND ALL CHARACTERS IN 'DESCRIBE DETIES, NUMBER OF EMPLOYEES....' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send all values on have you ever owned your own business
		try {
			String haveyoueverownedyourownsendedvalexcel = Excelreader.getData(0, 99, 5);
			String haveyoueverownedyourownsendedvalhead = page
					.haveyoueverownedyourownsendedvalmethod1(haveyoueverownedyourownsendedvalexcel);
			if (haveyoueverownedyourownsendedvalhead.equals(haveyoueverownedyourownsendedvalexcel)) {
				test.pass(
						"TC:31 USER SHOULD BE SEND  ALL CHARACTERS IN 'HAVE YOU EVER OWNED YOUR OWN BUSINESS.... ' FUNCTION");
			} else {
				test.fail(
						"TC:31 USER SHOULD BE SEND  ALL CHARACTERS IN 'HAVE YOU EVER OWNED YOUR OWN BUSINESS....' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND ALL CHARACTERS IN 'HAVE YOU EVER OWNED YOUR OWN BUSINESS....' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send all values on Have you ever had a business failure
		try {
			String haveyoueverhadbusinesssendedvalexcel = Excelreader.getData(0, 103, 5);
			String haveyoueverhadbusinesssendedvalhead = page
					.haveyoueverhadbusinesssendedvalmethod1(haveyoueverhadbusinesssendedvalexcel);
			if (haveyoueverhadbusinesssendedvalhead.equals(haveyoueverhadbusinesssendedvalexcel)) {
				test.pass(
						"TC:32 USER SHOULD BE SEND  ALL CHARACTERS IN 'HAVE YOU EVER HAD A BUSINESS FAILURE.. ' FUNCTION");
			} else {
				test.fail(
						"TC:32 USER SHOULD BE SEND  ALL CHARACTERS IN 'HAVE YOU EVER HAD A BUSINESS FAILURE.. ..' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND ALL CHARACTERS IN 'HAVE YOU EVER HAD A BUSINESS FAILURE.. ' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// SEND NUMARICAL ON TOTAL ASSETS
		try {
			String tatalassetssendedvalueexcel = Excelreader.getData(0, 107, 5);
			String tatalassetssendedvaluehead = page.tatalassetssendedvaluemethod(tatalassetssendedvalueexcel);
			if (tatalassetssendedvaluehead.equals(tatalassetssendedvalueexcel)) {
				test.pass("TC:33 USER SHOULD BE SEND  NUMARICAL IN 'TOTAL ASSETS (IN US $)' FUNCTION");
			} else {
				test.fail("TC:33 USER SHOULD BE SEND NUMARICAL IN 'TOTAL ASSETS (IN US $)' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND NUMARICAL IN 'TOTAL ASSETS (IN US $) ' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// SEND NUMARICAL ON TOTAL debt
		try {
			String totaldebtsendedvalueexcel = Excelreader.getData(0, 112, 5);
			String totaldebtsendedvaluehead = page.totaldebtsendedvaluemethod(totaldebtsendedvalueexcel);
			if (totaldebtsendedvaluehead.equals(totaldebtsendedvalueexcel)) {
				test.pass("TC:34 USER SHOULD BE SEND  NUMARICAL IN 'TOTAL DEBT (IN US $) ' FUNCTION");
			} else {
				test.fail("TC:34 USER SHOULD BE SEND NUMARICAL IN 'TOTAL DEBT (IN US $) ' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND NUMARICAL IN 'TOTAL DEBT (IN US $) ' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// select drop down value *Total non-borrowed funds available to invest
		try {
			String totalnonborroweddropdownvaluehead1 = page.totalnonborroweddropdownvaluemethod1p();
			String totalnonborroweddropdownvalueexcel1 = Excelreader.getData(0, 120, 5);
			if (totalnonborroweddropdownvaluehead1.equals(totalnonborroweddropdownvalueexcel1)) {
				test.pass(
						"TC:36 USER SHOULD BE SELECT DROP DOWN VALUE ON 'TOTAL NON-BORROWED FUNDS AVAILABLE TO INVEST' FUNCTION");
			} else {
				test.fail(
						"TC:36 USER SHOULD BE SELECT DROP DOWN VALUE ON 'TOTAL NON-BORROWED FUNDS AVAILABLE TO INVEST' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SELECT DROP DOWN VALUE ON TOTAL NON-BORROWED FUNDS AVAILABLE TO INVEST FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// CLICK yes radio button
		try {
			String yesrelationwithmcdofficerlblradiobuttonhead1 = page
					.yesrelationwithmcdofficerlblradiobuttonclickmethod();
			if (yesrelationwithmcdofficerlblradiobuttonhead1.equals("true")) {
				test.pass(
						"TC:37 YES RADIO BUTTON SHOULD BE CLICKABLE ON ARE YOU LELATED BY BLOOD OR MARRIAGE TO ANY OFFICER OF McDONALD'S USA, LLC");
			} else {
				test.fail(
						"TC:37 YES RADIO BUTTON SHOULD BE CLICKABLE ON ARE YOU LELATED BY BLOOD OR MARRIAGE TO ANY OFFICER OF McDONALD'S USA, LLC");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "YES RADIO BUTTON SHOULD BE CLICKABLE ON ARE YOU LELATED BY BLOOD OR MARRIAGE TO ANY OFFICER OF McDONALD'S USA, LLC");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// click yes radio button
		try {
			String yesfranchiserelatedmarriageownerradiobuttonhead = page
					.yesfranchiserelatedmarriageownerradiobuttonmethod1();
			if (yesfranchiserelatedmarriageownerradiobuttonhead.equals("true")) {
				test.pass(
						"TC:41 YES RADIO BUTTON SHOULD BE CLICKABLE ON ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.");
			} else {
				test.fail(
						"TC:41 YES RADIO BUTTON SHOULD BE CLICKABLE ON ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "YES RADIO BUTTON SHOULD BE CLICKABLE ON ARE YOU RELATED BY BLOOD OR MARRIAGE TO ANY OWNER OF A McDONALD'S FRANCHISE.");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// yes radio button CLICK
		try {
			String yesareprovidingproductsradiobuttonhead = page.yesareprovidingproductsradiobuttonmethod1();
			if (yesareprovidingproductsradiobuttonhead.equals("true")) {
				test.pass(
						"TC:41 YES RADIO BUTTON SHOULD BE CLICKABLE ON ARE YOU OR YOUR EMPLOYER PROVIDING PRODUCTS, GOODS OR SERVICES TO McDONALD'S OR FRANCHISEES.");
			} else {
				test.fail(
						"TC:41 YES RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT ON ARE YOU OR YOUR EMPLOYER PROVIDING PRODUCTS, GOODS OR SERVICES TO McDONALD'S OR FRANCHISEES.");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "YES RADIO BUTTON SHOULD BE CLICKABLE ON ARE YOU OR YOUR EMPLOYER PROVIDING PRODUCTS, GOODS OR SERVICES TO McDONALD'S OR FRANCHISEES.");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// FULL TIME radio button CLICK
		try {
			String fulltimeradiobuttonhead = page.fulltimeradiobuttonmethod1();
			if (fulltimeradiobuttonhead.equals("true")) {
				test.pass(
						"TC:42 FULL TIME RADIO BUTTON SHOULD BE CLICKABLE ON HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS..");
			} else {
				test.fail(
						"TC:42 FULL TIME RADIO BUTTON SHOULD BE CLICKABLE ON HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS..");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "FULL TIME RADIO BUTTON SHOULD BE CLICKABLE ON HOW MUCH TIME WILL YOU DEVOTE TO THIS BUSINESS..");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// yes radio button CLICK
		try {
			String yeswouldyoubewillingtoralocateradiobuttonhead = page
					.yeswouldyoubewillingtoralocateradiobuttonmethod1();
			if (yeswouldyoubewillingtoralocateradiobuttonhead.equals("true")) {
				test.pass(
						"TC:43 YES RADIO BUTTON SHOULD BE CLICKABLE ON WOULD YOU BE WILLING TO RELOCATE FOR A RESTAURANT OPPORTUNITY?..");
			} else {
				test.fail(
						"TC:43 YES RADIO BUTTON SHOULD BE CLICKABLE ON WOULD YOU BE WILLING TO RELOCATE FOR A RESTAURANT OPPORTUNITY?.");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "YES RADIO BUTTON SHOULD BE CLICKABLE ON WOULD YOU BE WILLING TO RELOCATE FOR A RESTAURANT OPPORTUNITY?.");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// rural check box click
		try {
			String ruralcheckboxhead = page.ruralcheckboxmethod1();
			if (ruralcheckboxhead.equals("true")) {
				test.pass("TC:44 CHECK BOX SHOULD BE CLICKABLE  IN RURAL (POPULATION 0-2,500)");
			} else {
				test.fail("TC:44 CHECK BOX SHOULD BE CLICKABLE IN RURAL (POPULATION 0-2,500)");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "CHECK BOX SHOULD BE CLICKABLE IN RURAL (POPULATION 0-2,500)");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// send all LETTERS
		try {
			String enterpreferredregionsendedvalueexcel = Excelreader.getData(0, 169, 5);
			String enterpreferredregionsendedvaluehead = page
					.enterpreferredregionsendedvaluemethod(enterpreferredregionsendedvalueexcel);
			if (enterpreferredregionsendedvaluehead.equals(enterpreferredregionsendedvalueexcel)) {
				test.pass(
						"TC:45 USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'ENTER PREFERRED REGION ' FUNCTION");
			} else {
				test.fail(
						"TC:45 USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'ENTER PREFERRED REGION' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'ENTER PREFERRED REGION' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send all LETTERS
		try {
			String haveyoueverappliedforaMcDonaldsendedvalueexcel = Excelreader.getData(0, 173, 5);
			String haveyoueverappliedforaMcDonaldsendedvaluehead = page
					.haveyoueverappliedforaMcDonaldsendedvaluemethod(haveyoueverappliedforaMcDonaldsendedvalueexcel);
			if (haveyoueverappliedforaMcDonaldsendedvaluehead.equals(haveyoueverappliedforaMcDonaldsendedvalueexcel)) {
				test.pass(
						"TC:46 USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'HAVE YOU EVER APPLIED FOR A McDONALD'S FRANCHISE...' FUNCTION");
			} else {
				test.fail(
						"TC:46 USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'HAVE YOU EVER APPLIED FOR A McDONALD'S FRANCHISE....' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "USER SHOULD BE SEND ALL CHARACTERS, SPECIAL CHARACTERS AND NUMARICAL IN 'HAVE YOU EVER APPLIED FOR A McDONALD'S FRANCHISE....' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// Online/Website RADIO BUTTON CLICK
		try {
			String onlinewebsiteradiobuttonhead = page.onlinewebsiteradiobuttonmethod1();
			if (onlinewebsiteradiobuttonhead.equals("true")) {
				test.pass("TC:47 RADIO BUTTON SHOULD BE CLICKABLE IN ONLINE/WEBSITE FUNCTION");
			} else {
				test.fail("TC:47 RADIO BUTTON SHOULD BE CLICKABLE IN ONLINE/WEBSITE FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "RADIO BUTTON SHOULD BE CLICKABLE IN ONLINE/WEBSITE FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// I AGREE CHECK BOX CLICK
		try {
			String iagreecheckboxhead = page.iagreecheckboxmethod1();
			if (iagreecheckboxhead.equals("true")) {
				test.pass("TC:48 CHECK BOX SHOULD BE CLICKABLE IN 'I AGREE' FUNCTION");
			} else {
				test.fail("TC:48 CHECK BOX SHOULD BE CLICKABLE IN 'I AGREE' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "CHECK BOX SHOULD BE CLICKABLE IN 'I AGREE' FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// submit
		try {
			String titlepage = page.generallgetpagetitlemethod1();
			String titlepageexcel = Excelreader.getData(0, 193, 5);
			if (titlepage.equals(titlepageexcel)) {
				test.pass("TC:48 THANKS TEST PAGE OF FRANCHISIING FORM IS WORKING ");
			} else {
				test.fail("TC:48 THANKS TEST PAGE OF FRANCHISIING FORM IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Franchising_Form"))
						+ "THANKS TEST PAGE OF FRANCHISIING FORM IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}
*/
}

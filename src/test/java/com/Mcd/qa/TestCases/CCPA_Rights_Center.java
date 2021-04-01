package com.Mcd.qa.TestCases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.McD.qa.Base.BaseTest;
import com.McD.qa.Extentreport.Extentreport;
import com.McD.qa.Pages.Basepage;
import com.McD.qa.Pages.CCPA_Rights_Center_Page;
import com.McD.qa.Utility.TestUtil;

import kotlin.random.URandomKt;

public class CCPA_Rights_Center extends BaseTest {

	String excelpath = System.getProperty("user.dir");
	TestUtil Excelreader = new TestUtil(excelpath + "/src/main/java/com/McD/qa/TestData/CCPA_Rights_Center.xls");

	@Test(priority = 1)
	public void Open_URL_CCPA() {
		CCPA_Rights_Center_Page page = new CCPA_Rights_Center_Page(driver);
		test = extent.createTest("Open_URL_CCPA");

		try {
			driver.get(Basepage.readProperty("urlccpa"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL OF CCPA IS OPENED");
			} else {
				test.fail("TC:1 URL OF CCPA IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "URL OF CCPA IS NOT OPENED");
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
	public void CCPA_Rights_Center_heading() {
		CCPA_Rights_Center_Page page = new CCPA_Rights_Center_Page(driver);
		test = extent.createTest("CCPA_Rights_Center_heading");
		// ccpa right center label
		try {
			String ccparightscenterhead = page.ccparightscenterheading();
			String ccparightscenterexcel = Excelreader.getData(0, 2, 5);
			if (ccparightscenterexcel.equals(ccparightscenterhead)) {
				test.pass("TC:2 LABEL OF CCPA RIGHTS CENTER IS DISPLAYED");
			} else {
				test.fail("TC:2 LABEL OF CCPA RIGHTS CENTER IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "LABEL OF CCPA RIGHTS CENTER IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// if you are a California label
		try {
			String ifyouareacaliforniaheainghead = page.ifyouareacaliforniaheaingmethod();
			String ifyouareacaliforniaheaingexcel = Excelreader.getData(0, 3, 5);
			if (ifyouareacaliforniaheaingexcel.equals(ifyouareacaliforniaheainghead)) {
				test.pass("TC:3 LABEL OF IF YOU ARE A CALIFORNIA....... IS  DISPLAYED");
			} else {
				test.fail("TC:3 LABEL OF IF YOU ARE A CALIFORNIA....... IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "LABEL OF IF YOU ARE A CALIFORNIA....... IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// if you are interested label
		try {
			String ifyouareinterestedheadinghead = page.ifyouareinterestedheadingmethod();
			String ifyouareinterestedheadingexcel = Excelreader.getData(0, 4, 5);
			if (ifyouareinterestedheadingexcel.equals(ifyouareinterestedheadinghead)) {
				test.pass("TC:4 LABEL OF IF YOU ARE INTERESTED IN McDONALD'S....... IS DISPLAYED");
			} else {
				test.fail("TC:4 LABEL OF IF YOU ARE INTERESTED IN McDONALD'S....... IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "LABEL OF IF YOU ARE INTERESTED IN McDONALD'S....... IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// if you are user with disability label
		try {
			String ifyorareuserwithdisabilityheadinghead = page.ifyorareuserwithdisabilityheadingmethod();
			String ifyorareuserwithdisabilityheadingexcel = Excelreader.getData(0, 5, 5);
			if (ifyorareuserwithdisabilityheadingexcel.equals(ifyorareuserwithdisabilityheadinghead)) {
				test.pass("TC:5 LABEL OF IF YOU ARE USER WITH DISABILITY..... IS DISPLAYED");
			} else {
				test.fail("TC:5 LABEL OF IF YOU ARE USER WITH DISABILITY..... IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "LABEL OF IF YOU ARE USER WITH DISABILITY..... IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// * Indicates required fields
		try {
			String indicaterequiredfieldsheadinghead = page.indicaterequiredfieldsheadingmethod();
			String indicaterequiredfieldsheadingexcel = Excelreader.getData(0, 6, 5);
			if (indicaterequiredfieldsheadingexcel.equals(indicaterequiredfieldsheadinghead)) {
				test.pass("TC:6 LABEL OF INDICATES REQUIRED FIELDS  IS DISPLAYED");
			} else {
				test.fail("TC:6 LABEL OF INDICATES REQUIRED FIELDS IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "LABEL OF IF INDICATES REQUIRED FIELDS IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 3)
	public void Frist_Name_CCPA() {
		test = extent.createTest("Frist_Name_CCPA");
		CCPA_Rights_Center_Page page = new CCPA_Rights_Center_Page(driver);

		// label of first name
		try {
			String firstnamelabelccpahead = page.firstnamelabelccpamethod();
			String firstnamelabelccpaexcel = Excelreader.getData(0, 7, 5);
			if (firstnamelabelccpahead.equals(firstnamelabelccpaexcel)) {
				test.pass("TC:7 THE LABEL 'FIRST NAME' IS DISPLAYED");
			} else {
				test.fail("TC:7 THE LABEL 'FIRST NAME' IS NOT DISPLAYED ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "THE LABEL 'FIRST NAME' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// after click first name label
		try {
			String firstnamelabehead = page.firstnamelabelccpamethod1();
			String firstnamelabelexcel = Excelreader.getData(0, 7, 5);
			if (firstnamelabehead.equals(firstnamelabelexcel)) {
				test.pass("TC:7.1 THE LABEL '*FIRST NAME' IS ROLLED UP IN THE SAME PAGE");
			} else {
				test.fail("TC:7.1 THE LABEL '*FIRST NAME' IS NOT ROLLED UP IN THE SAME PAGE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "THE LABEL '*FIRST NAME' IS NOT ROLLED UP IN THE SAME PAGE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// enter numerical ON FIRST NAME TEXT
		try {
			String FIRSTNAMENUMERICAL = Excelreader.getData(0, 8, 5);
			String valn = page.finameEnteredvalue(FIRSTNAMENUMERICAL);
			if (!valn.equals(FIRSTNAMENUMERICAL)) {
				test.pass("TC:7.2  NUMERICAL VALUE SHOULD NOT ENTERED IN FIRST NAME TEXTBOX");
			} else {
				test.fail("TC:7.2  NUMERICAL VALUE SHOULD NOT ENTERED IN FIRST NAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "NUMERICAL VALUE SHOULD NOT ENTERED IN FIRST NAME TEXTBOX");
			}
		} catch (Exception e) {

			test.fail("Error:" + e.getMessage());
		}
		// SPECIAL CHARACTERS
		try {
			String FNSPECIALCHARACTER = Excelreader.getData(0, 9, 5);
			String valsc = page.finameEnteredvalue(FNSPECIALCHARACTER);
			if (!valsc.equals(FNSPECIALCHARACTER)) {
				test.pass("TC:7.3  SPECIAL CHARACTERS VALUE SHOULD NOT ENTERED IN FIRSTNAME TEXTBOX");
			} else {
				test.fail("TC:7.3  SPECIAL CHARACTERS VALUE SHOULD NOT ENTERED IN FIRSTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "SPECIAL CHARACTERS VALUE SHOULD NOT ENTERED IN FIRSTNAME TEXTBOX");
			}
		} catch (Exception e) {

			test.fail("Error:" + e.getMessage());
		}
		// CHARACTER
		try {
			String FNCHARACTER = Excelreader.getData(0, 10, 5);
			String valc = page.finameEnteredvalue(FNCHARACTER);
			if (valc.equals(FNCHARACTER)) {
				test.pass("TC:7.4  CHARACTERS VALUE SHOULD  ENTERED IN FIRSTNAME TEXTBOX");
			} else {
				test.fail("TC:7.4  CHARACTERS VALUE SHOULD  ENTERED IN FIRSTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "CHARACTERS VALUE SHOULD  ENTERED IN FIRSTNAME TEXTBOX");
			}
		} catch (Exception e) {

			test.fail("Error:" + e.getMessage());
		}

		// more than 25 characters
		try {
			String FNMORETHAN25 = Excelreader.getData(0, 11, 5);
			String valc = page.finameEnteredvalue(FNMORETHAN25);
			if (!valc.equals(FNMORETHAN25)) {
				test.pass("TC:7.5  MORE THAN 25 CHARACTER SHOULD NOT ENTERED IN FIRSTNAME TEXTBOX");
			} else {
				test.fail("TC:7.5  MORE THAN 25 CHARACTER SHOULD NOT ENTERED IN FIRSTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "MORE THAN 25 CHARACTER SHOULD NOT ENTERED IN FIRSTNAME TEXTBOX");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// click on submit and catch error message
		try {
			String finameeror1 = page.firstnameerror();
			String exfinamerror2 = Excelreader.getData(0, 12, 5);
			if (finameeror1.equals(exfinamerror2)) {
				test.pass("TC:7.6 'ERROR MESSAGE DISPLAYED' -->" + "'" + finameeror1 + "'");
			} else {
				test.fail("TC:7.6 FIRST NAME FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
						+ "FIRST NAME FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 4)
	public void Last_Name_CCPA() {
		test = extent.createTest("Last_Name_CCPA");
		CCPA_Rights_Center_Page page = new CCPA_Rights_Center_Page(driver);
		// LAST NAME LABEL
		try {
			String LNlabelhead = page.lastnamelabelccpamethod();
			String LNlabelexcel = Excelreader.getData(0, 13, 5);
			if (LNlabelhead.equals(LNlabelexcel)) {
				test.pass("TC:8 THE LABEL 'LAST NAME' IS DISPLAYED");
			} else {
				test.fail("TC:8 THE LABEL 'LAST NAME' IS NOT DISPLAYED ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "THE LABEL 'LAST NAME' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// CLICK AND ROLLED UP THE LAST NAME LABEL

		try {
			String LNlabelhead = page.lastnamelabelccpamethod1();
			String LNlabelexcel = Excelreader.getData(0, 13, 5);
			if (LNlabelhead.equals(LNlabelexcel)) {
				test.pass("TC:8.1 THE LABEL 'LAST NAME' IS ROLLED UP ");
			} else {
				test.fail("TC:8.1 THE LABEL 'LAST NAME' IS NOT ROLLED UP ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "THE LABEL 'LAST NAME' IS NOT ROLLED UP ");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// LAST NAME NUMARICAL
		try {
			String LNnumarical = Excelreader.getData(0, 14, 5);
			String LAvalue = page.lastnameenterdvalue(LNnumarical);
			if (!LAvalue.equals(LNnumarical)) {
				test.pass("TC:8.2 NUMERICAL VALUE SHOULD NOT ENTERED IN LASTNAME TEXTBOX ");
			} else {
				test.fail("TC:8.2 NUMERICAL VALUE SHOULD NOT ENTERED IN LASTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "NUMERICAL VALUE SHOULD NOT ENTERED IN LASTNAME TEXTBOX");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// SPECIAL CHARACTERS
		try {
			String LNSPECIALCHARACTER = Excelreader.getData(0, 15, 5);
			String LAscvalue = page.lastnameenterdvalue(LNSPECIALCHARACTER);
			if (!LAscvalue.equals(LNSPECIALCHARACTER)) {
				test.pass("TC:8.3 SPECIAL CHARACTERS VALUE SHOULD NOT ENTERED IN LASTNAME TEXTBOX ");
			} else {
				test.fail("TC:8.3 SPECIAL CHARACTERS VALUE SHOULD NOT ENTERED IN LASTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "SPECIAL CHARACTERS VALUE SHOULD NOT ENTERED IN LASTNAME TEXTBOX");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// CHARACTER of last name
		try {
			String LNcharacter = Excelreader.getData(0, 16, 5);
			String LAcvalue = page.lastnameenterdvalue(LNcharacter);
			if (LAcvalue.equals(LNcharacter)) {
				test.pass("TC:8.4 CHARACTERS VALUE SHOULD ENTERED IN LASTNAME TEXTBOX");
			} else {
				test.fail("TC:8.4 CHARACTERS VALUE SHOULD ENTERED IN LASTNAME TEXTBOX ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "CHARACTERS VALUE SHOULD ENTERED IN LASTNAME TEXTBOX");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// more than 25 characters
		try {
			String LNmoretahan25 = Excelreader.getData(0, 17, 5);
			String LA25value = page.lastnameenterdvalue(LNmoretahan25);
			if (!LA25value.equals(LNmoretahan25)) {
				test.pass("TC:8.5 MORE THAN 25 CHARACTERS SHOULD NOT ENTERED IN LASTNAME TEXTBOX ");
			} else {
				test.fail("TC:8.5 MORE THAN 25 CHARACTERS SHOULD NOT ENTERED IN LASTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "MORE THAN 25 CHARACTERS SHOULD NOT ENTERED IN LASTNAME TEXTBOX");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// click on submit and catch error message of last name
		try {
			String LNerrormess = page.lastnameerrormesmethod();
			String LNerrormesexcel = Excelreader.getData(0, 18, 5);
			if (LNerrormess.equals(LNerrormesexcel)) {
				test.pass("TC:8.6 LAST NAME FUNCTION ERROR MESSAGE IS DISPLAYED AND SUBMIT ALSO IS WORKING---->" + "'"
						+ LNerrormess + "'");
			} else {
				test.fail("TC:8.6 LAST NAME FUNCTION ERROR MESSAGE IS NOT DISPLAYED AND SUBMIT IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "LAST NAME FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 5)
	public void Email_CCPA() {
		test = extent.createTest("Email_CCPA");
		CCPA_Rights_Center_Page page = new CCPA_Rights_Center_Page(driver);
		// label of mail
		try {
			String emaillabelhead = page.emaillabelmethod();
			String emaillabelexcel = Excelreader.getData(0, 19, 5);
			if (emaillabelhead.equals(emaillabelexcel)) {
				test.pass("TC:9 THE LABEL 'EMAIL' IS DISPLAYED ");
			} else {
				test.fail("TC:9 THE LABEL 'EMAIL' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "THE LABEL 'EMAIL' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK ON mail AND LABEL IS ROLLED UP OR NOT
		try {
			String emaillabelhead = page.emaillabelmethod1();
			String emaillabelexcel = Excelreader.getData(0, 19, 5);
			if (emaillabelhead.equals(emaillabelexcel)) {
				test.pass("TC:9.1 THE LABEL 'EMAIL' IS ROLLED UP AFTER CLICK ON EMAIL FUNCTION");
			} else {
				test.fail("TC:9.1 THE LABEL 'EMAIL' IS NOT ROLLED UP AFTER CLICK ON EMAIL FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "THE LABEL 'EMAIL' IS NOT DISPLAYED AFTER CLICK ON EMAIL FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// WITH OUT .COM FORMAT
		try {
			String emailsendid = Excelreader.getData(0, 22, 5);
			String emailvlue = page.mailsendmethod(emailsendid);
			if (emailvlue.equals(emailsendid)) {
				test.pass("TC:9.2  USER ABEL TO SEND MAIL WITH OUR FORMAT(.COM) IN MAIL TEXTBOX");
				String mailerrormessageexcel = Excelreader.getData(0, 21, 5);
				String mailerrormessagehead = page.emailerrormessagemethod();
				
				if (mailerrormessagehead.equals(mailerrormessageexcel)) {
					test.pass("TC:9.2 WITH OUR FORMAT(.COM) 'ERROR MESSAGE DISPLAYED' -->" + "'" + mailerrormessagehead
							+ "'");
				} else {
					test.fail("TC:9.2  WITH OUR FORMAT(.COM) MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
							+ "WITH OUR FORMAT(.COM) MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				}
			} else {
				test.fail("TC:9.2 USER ABEL TO SEND MAIL WITH OUR FORMAT(.COM) IN MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "USER ABEL TO SEND MAIL WITH OUR FORMAT(.COM) IN MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// WITH OUT @GAMIL

		try {
			String emailsendid = Excelreader.getData(0, 23, 5);
			String emailvlue = page.mailsendmethod(emailsendid);
			if (emailvlue.equals(emailsendid)) {
				test.pass("TC:9.3  USER ABEL TO SEND  WITH OUR FORMAT(@GAMIL) IN MAIL TEXTBOX");
				String mailerrormessagehead = page.emailerrormessagemethod();
				String mailerrormessageexcel = Excelreader.getData(0, 21, 5);
				if (mailerrormessagehead.equals(mailerrormessageexcel)) {
					test.pass("TC:9.3 WITH OUR FORMAT(@GAMIL) 'ERROR MESSAGE DISPLAYED' -->" + "'"
							+ mailerrormessagehead + "'");
				} else {
					test.fail("TC:9.3  WITH OUR FORMAT(@GAMIL) MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
							+ "WITH OUR FORMAT(@GAMIL) MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				}
			} else {
				test.fail("TC:9.3 USER ABEL TO SEND MAIL WITH OUR FORMAT(@GAMIL) IN MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "USER ABEL TO SEND MAIL WITH OUR FORMAT(@GAMIL) IN MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// enter mail format on email
		try {
			String emailsendid = Excelreader.getData(0, 20, 5);
			String emailvlue = page.mailsendmethod(emailsendid);
			if (emailvlue.equals(emailsendid)) {
				test.pass("TC:9.4 USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
				String mailerrormessagehead = page.emailerrormessagemethod();
				String mailerrormessageexcel = Excelreader.getData(0, 21, 5);
				if (!mailerrormessagehead.equals(mailerrormessageexcel)) {
					test.pass("TC:9.4 WITH FORMAT 'ERROR MESSAGE IS NOT DISPLAYED'");
				} else {
					test.fail("TC:9.4  WITH FORMAT MAIL FUNCTION ERROR MESSAGE  DISPLAYED--->" + "'"
							+ mailerrormessagehead + "'");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
							+ "WITH FORMAT MAIL FUNCTION ERROR MESSAGE  DISPLAYED");
				}
			} else {
				test.fail("TC:9.4 USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// click on submit and catch error message of mail
		try {
			String mailerrormessagehead = page.emailerrormessagemethod1();
			String mailerrormessageexcel = Excelreader.getData(0, 21, 5);
			if (mailerrormessagehead.equals(mailerrormessageexcel)) {
				test.pass("TC:9.4 MAIL 'ERROR MESSAGE DISPLAYED' -->" + "'" + mailerrormessagehead + "'");
			} else {
				test.fail("TC:9.4  MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 6)
	public void Confirm_Email_CCPA() {
		test = extent.createTest("Confirm_Email_CCPA");
		CCPA_Rights_Center_Page page = new CCPA_Rights_Center_Page(driver);
		// label of confirm_email
		try {
			String conmaillabelhead = page.confirmmaillabelmethod();
			String conmaillabelexcel = Excelreader.getData(0, 24, 5);
			if (conmaillabelhead.equals(conmaillabelexcel)) {
				test.pass("TC:10 THE LABEL 'CONFIRM EMAIL' IS DISPLAYED ");
			} else {
				test.fail("TC:10 THE LABEL 'CONFIRM EMAIL' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "THE LABEL 'CONFIRM EMAIL' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK ON confirm_email AND LABEL IS ROLLED UP OR NOT
		try {
			String conmaillabelhead = page.confirmmaillabelmethod1();
			String conmaillabelexcel = Excelreader.getData(0, 24, 5);
			if (conmaillabelhead.equals(conmaillabelexcel)) {
				test.pass("TC:10.1 THE LABEL 'CONFIRM EMAIL' IS ROLLED UP AFTER CLICK ON CONFIRM EMAIL FUNCTION");
			} else {
				test.fail("TC:10.1 THE LABEL 'CONFIRM EMAIL' IS NOT ROLLED UP AFTER CLICK ON CONFIRM EMAIL FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "THE LABEL 'CONFIRM EMAIL' IS NOT ROLLED UP AFTER CLICK ON CONFIRM EMAIL FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send DIFFERENT IDS IN mail AND CONFIRM function
		try {
			String emailsendid = Excelreader.getData(0, 20, 5);
			page.mailsendmethod1(emailsendid);
			String confirmmailsend = Excelreader.getData(0, 27, 5);
			String conmailsendvalue = page.confirmmailsendidmethod(confirmmailsend);
			if (conmailsendvalue.equals(confirmmailsend)) {
				test.pass("TC:10.2  USER SHOULD SEND MAIL IN CONFIRM MAIL TEXTBOX");
				String confirmmailerrormesshead = page.confirmmailerrormessmethod1();
				String confirmmailerrormessexcel = Excelreader.getData(0, 26, 5);
				if (confirmmailerrormesshead.equals(confirmmailerrormessexcel)) {
					test.pass("TC:10.3 USER SEND DIFFERENT IDS IN MAIL AND CONFIRM MAIL 'ERROR MESSAGE DISPLAYED' -->"
							+ "'" + confirmmailerrormesshead + "'");
				} else {
					test.fail("TC:10.3 USER SEND DIFFERENT IDS IN MAIL AND CONFIRM MAIL");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
							+ "USER SEND DIFFERENT IDS IN MAIL AND CONFIRM MAIL");
				}

			} else {
				test.fail("TC:10.2 USER SHOULD SEND MAIL IN CONFIRM MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "USER SHOULD SEND MAIL IN CONFIRM MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// enter mail FORMAT on confirm mail
		try {
			String confirmmailsend = Excelreader.getData(0, 25, 5);
			String conmailsendvalue = page.confirmmailsendidmethod(confirmmailsend);
			if (conmailsendvalue.equals(confirmmailsend)) {
				test.pass("TC:10.4  MAIL ID IS SEND ON CONFIRM MAIL TEXTBOX");
				String confirmmailerrormesshead = page.confirmmailerrormessmethod1();
				String confirmmailerrormessexcel = Excelreader.getData(0, 26, 5);
				if (!confirmmailerrormesshead.equals(confirmmailerrormessexcel)) {
					test.pass("TC:10.4 USER SEND SAME IDS IN MAIL AND CONFIRM MAIL 'ERROR MESSAGE DISPLAYED' -->" + "'"
							+ confirmmailerrormesshead + "'");
				} else {
					test.fail("TC:10.4 USER SEND SAME IDS IN MAIL AND CONFIRM MAIL");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
							+ "USER SEND SAME IDS IN MAIL AND CONFIRM MAIL");
				}
			} else {
				test.fail("TC:10.4 MAIL ID IS NOT SEND ON CONFIRM MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "MAIL ID IS NOT SEND ON CONFIRM MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// click on submit and catch error message of confirm mail
		try {
			String confirmmailerrormesshead = page.confirmmailerrormessmethod();
			String confirmmailerrormessexcel = Excelreader.getData(0, 26, 5);
			if (confirmmailerrormesshead.equals(confirmmailerrormessexcel)) {
				test.pass("TC:10.4 CONFIRM MAIL 'ERROR MESSAGE DISPLAYED' -->" + "'" + confirmmailerrormesshead + "'");
			} else {
				test.fail("TC:10.4 CONFIRM MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "CONFIRM MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 7)
	public void State_CCPA() {
		test = extent.createTest("State_CCPA");
		CCPA_Rights_Center_Page page = new CCPA_Rights_Center_Page(driver);

		// label of State
		try {
			String statelabelhead = page.statelabelmethod();
			String staelabelexcel = Excelreader.getData(0, 28, 5);
			if (statelabelhead.equals(staelabelexcel)) {
				test.pass("TC:11 THE LABEL OF 'STATE' IS DISPLAYED ");
			} else {
				test.fail("TC:11 THE LABEL OF 'STATE' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "THE LABEL OF  'STATE' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK ON STATE AND LABEL IS ROLLED UP OR NOT
		try {
			String statelabelhead = page.statelabelmethod1();
			String staelabelexcel = Excelreader.getData(0, 28, 5);
			if (statelabelhead.equals(staelabelexcel)) {
				test.pass("TC:11.1 THE LABEL 'STATE' IS ROLLED UP ");
			} else {
				test.fail("TC:11.1 THE LABEL 'STATE' IS ROLLED UP ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "THE LABEL 'STATE' IS ROLLED UP ");
			}
			// STATE DROP DOWN IS CLICKABLE OR NOT
			String statedropdownvaluehead = page.statedropdownvaluemethod();
			String statedropdownvalueexcel = Excelreader.getData(0, 29, 5);
			if (statedropdownvaluehead.equals(statedropdownvalueexcel)) {
				test.pass("TC:11.2 STATE DROPDOWN IS WORKING ");
				// select drop down value
				String stateselectedvaluehead = page.stateselectedvaluemethod();
				String stateselectedvalueexcel = Excelreader.getData(0, 29, 5);
				if (stateselectedvaluehead.equals(stateselectedvalueexcel)) {
					test.pass("TC:11.3 USER SHOULD BE SELECT DROP DOWN VALUE ON STATE FUNCTION");
				} else {
					test.fail("TC:11.3 USER SHOULD BE SELECT DROP DOWN VALUE ON STATE FUNCTION");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
							+ "USER SHOULD BE SELECT DROP DOWN VALUE ON STATE FUNCTION");
				}

			} else {
				test.fail("TC:11.2 STATE DROPDOWN IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "STATE FUNCTION IS CLICKABLE");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// click on submit and catch error message of state
		try {
			String stateerrormessahead = page.stateerrormessagemethod();
			String stateerrormessexcel = Excelreader.getData(0, 30, 5);
			if (stateerrormessahead.equals(stateerrormessexcel)) {
				test.pass("TC:11.4 'ERROR MESSAGE DISPLAYED' -->" + "'" + stateerrormessahead + "'");
			} else {
				test.fail("TC:11.4 STATE FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "STATE FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 8)
	public void Phone_number_CCPA() {
		test = extent.createTest("Phone_number_CCPA");
		CCPA_Rights_Center_Page page = new CCPA_Rights_Center_Page(driver);
		// label of phone number
		try {
			String phonenumberlabelhead = page.phonenumberlabelmethod();
			String phonenumberlabelexcel = Excelreader.getData(0, 31, 5);
			if (phonenumberlabelhead.equals(phonenumberlabelexcel)) {
				test.pass("TC:12 THE LABEL 'PHONE NUMBER' IS DISPLAYED ");
			} else {
				test.fail("TC:12 THE LABEL 'PHONE NUMBER' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "THE LABEL 'PHONE NUMBER' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK ON phone number AND LABEL IS ROLLED UP OR NOT
		try {
			String phonenumberlabelhead = page.phonenumberlabelmethod1();
			String phonenumberlabelexcel = Excelreader.getData(0, 31, 5);
			if (phonenumberlabelhead.equals(phonenumberlabelexcel)) {
				test.pass("TC:12.1 THE LABEL 'PHONE NUMBER' IS ROLLED UP ");
			} else {
				test.fail("TC:12.1 THE LABEL 'PHONE NUMBER' IS NOT ROLLED UP ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "THE LABEL 'PHONE NUMBER' IS NOT ROLLED UP ");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send numerical in phone number function
		try {
			String phonenumaricalhead = Excelreader.getData(0, 32, 5);
			String phonenumenteredval = page.phonenumbersendedvaluemethod(phonenumaricalhead);
			if (phonenumenteredval.equals(phonenumaricalhead)) {
				test.pass("TC:12.2 USER SHOUND BE SEND NUMERICAL VALUE IN PHONE NUMBER TEXTBOX");
			} else {
				test.fail("TC:12.2 USER SHOUND BE SEND NUMERICAL VALUE IN PHONE NUMBER TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "NUMERICAL VALUE IS NOT ENTERED IN PHONE NUMBER TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// special characters
		try {
			String phonespecialcharachead = Excelreader.getData(0, 33, 5);
			String phonenumSCenteredval = page.phonenumbersendedvaluemethod(phonespecialcharachead);
			if (!phonenumSCenteredval.equals(phonespecialcharachead)) {
				test.pass("TC:12.3 SPECIAL CHARACTER VALUE NOT ABLE TO ENTERED IN PHONE NUMBER TEXTBOX");
			} else {
				test.fail("TC:12.3 SPECIAL CHARACTER VALUE IS ENTERED IN PHONE NUMBER TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "SPECIAL CHARACTER VALUE IS ENTERED IN PHONE NUMBER TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// characters
		try {
			String phonecharacterhead = Excelreader.getData(0, 34, 5);
			String phonenumCenteredval = page.phonenumbersendedvaluemethod(phonecharacterhead);
			if (!phonenumCenteredval.equals(phonecharacterhead)) {
				test.pass("TC:12.4 CHARACTER VALUE NOT ABLE TO ENTERED IN PHONE NUMBER TEXTBOX");
			} else {
				test.fail("TC:12.4 CHARACTER VALUE IS ENTERED IN PHONE NUMBER TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "CHARACTER VALUE IS ENTERED IN PHONE NUMBER TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// more than 10 number
		try {
			String phonenumaricalhead = Excelreader.getData(0, 35, 5);
			String phonenumenteredval = page.phonenumbersendedvaluemethod(phonenumaricalhead);
			if (!phonenumenteredval.equals(phonenumaricalhead)) {
				test.pass("TC:12.5 USER NOT ABLE TO SEND MORE THAN 10 NUMBER IN PHONE NUMBER TEXTBOX");
			} else {
				test.fail("TC:12.5 USER NOT ABLE TO SEND MORE THAN 10 NUMBER IN PHONE NUMBER TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "USER NOT ABLE TO SEND MORE THAN 10 NUMBER IN PHONE NUMBER TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// less than 10 number
		try {
			String phonenumaricalhead = Excelreader.getData(0, 36, 5);
			String phonenumenteredval = page.phonenumbersendedvaluemethod(phonenumaricalhead);
			if (phonenumenteredval.equals(phonenumaricalhead)) {
				test.pass("TC:12.6 USER ABLE TO SEND LESS THAN 10 NUMBERS IN PHONE NUMBER TEXTBOX");
				String phonenumbererrormessagehead = page.phonenumbererrormessagemethod();
				String phonenumbererrormessageexcel = Excelreader.getData(0, 37, 5);
				if (phonenumbererrormessagehead.equals(phonenumbererrormessageexcel)) {
					test.pass("TC:12.6 PHONE NUMBER 'ERROR MESSAGE DISPLAYED' AFTER ENTERED LESS THAN 10 NUMBERS -->"
							+ "'" + phonenumbererrormessagehead + "'");
				} else {
					test.fail("TC:12.6 PHONE NUMBER 'ERROR MESSAGE DISPLAYED' AFTER ENTERED LESS THAN 10 NUMBERS");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
							+ "PHONE NUMBER 'ERROR MESSAGE DISPLAYED' AFTER ENTERED LESS THAN 10 NUMBERS");
				}
			} else {
				test.fail("TC:12.6 USER ABLE TO SEND LESS THAN 10 NUMBERS IN PHONE NUMBER TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "USER ABLE TO SEND LESS THAN 10 NUMBERS IN PHONE NUMBER TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 9)
	public void Please_specify_request_CCPA() {
		test = extent.createTest("Please_specify_request_CCPA");
		CCPA_Rights_Center_Page page = new CCPA_Rights_Center_Page(driver);
		
		try {
			driver.get(Basepage.readProperty("urlccpa"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL OF CCPA IS OPENED");
			} else {
				test.fail("TC:1 URL OF CCPA IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "URL OF CCPA IS NOT OPENED");
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

		// *Please specify your request
		try {
			String pleasespecifyourrequiestlabelexcel = Excelreader.getData(0, 38, 5);
			String pleasespecifyourrequiestlabelhead = page.pleasespecifyourrequiestlabelmethod();
			if (pleasespecifyourrequiestlabelhead.equals(pleasespecifyourrequiestlabelexcel)) {
				test.pass("TC:13 THE LABEL 'PLEASE SPECIFY YOUR REQUEST' IS DISPLAYED");
			} else {
				test.fail("TC:13 THE LABEL 'PLEASE SPECIFY YOUR REQUEST' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "THE LABEL 'PLEASE SPECIFY YOUR REQUEST' IS DISPLAYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// MCDONALD'S MAY NOT SELL RADIO BUTTON label
		try {
			String mcdonaldsmaynotselllabelexcel = Excelreader.getData(0, 39, 5);
			String mcdonaldsmaynotselllabelhead = page.mcdonaldsmaynotselllabelmethod();
			if (mcdonaldsmaynotselllabelhead.equals(mcdonaldsmaynotselllabelexcel)) {
				test.pass("TC:13.1 THE LABEL 'McDONALD'S MAY NOT SELL MY ...' IS DISPLAYED");
			} else {
				test.fail("TC:13.1 THE LABEL 'McDONALD'S MAY NOT SELL MY ...' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "THE LABEL 'McDONALD'S MAY NOT SELL MY ...' IS DISPLAYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// MCDONALD'S MAY NOT SELL RADIO BUTTON radio button
		try {
			String mcdonaldsmaynotsellradiobuttonhead = page.mcdonaldsmaynotsellradiobuttonmethod();
			if (!mcdonaldsmaynotsellradiobuttonhead.equals("true")) {
				test.pass("TC:13.2 McDONALD'S MAY NOT SELL.. RADIO BUTTON SHOULD  NOT CLICK BY DEFAULT");
			} else {
				test.fail("TC:13.2 McDONALD'S MAY NOT SELL.. RADIO BUTTON SHOULD  NOT CLICK BY DEFAULT");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "McDONALD'S MAY NOT SELL.. RADIO BUTTON SHOULD BE NOT CLICK BY DEFAULT");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// Access - Provide my personal data that has been collected LABEL
		try {
			String accessprovidemypersonalexcel = Excelreader.getData(0, 40, 5);
			String accessprovidemypersonalhead = page.accessprovidemypersonalmethod();
			if (accessprovidemypersonalhead.equals(accessprovidemypersonalexcel)) {
				test.pass("TC:13.3 THE LABEL 'ACCESS - PROVIDE MY PERSONAL DATA THAT HAS BEEN' IS DISPLAYED");
			} else {
				test.fail("TC:13.3 THE LABEL 'ACCESS - PROVIDE MY PERSONAL DATA THAT HAS BEEN' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "THE LABEL 'ACCESS - PROVIDE MY PERSONAL DATA THAT HAS BEEN' IS DISPLAYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// Access - Provide my personal data that has been collected RADIO BUTTON
		try {
			String accessprovidemypersonalradiobuttonhead = page.accessprovidemypersonalradiobuttonmethod();
			if (!accessprovidemypersonalradiobuttonhead.equals("true")) {
				test.pass("TC:13.4 ACCESS - PROVIDE MY PERSONAL.. RADIO BUTTON SHOULD  NOT CLICK BY DEFAULT");
			} else {
				test.fail("TC:13.4 ACCESS - PROVIDE MY PERSONAL.. RADIO BUTTON SHOULD  NOT CLICK BY DEFAULT");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "ACCESS - PROVIDE MY PERSONAL.. RADIO BUTTON SHOULD BE NOT CLICK BY DEFAULT");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// Deletion - Delete my personal data that has been collected LABEL
		try {
			String deletiondeletemypersonallabelexcel = Excelreader.getData(0, 41, 5);
			String deletiondeletemypersonallabelhead = page.deletiondeletemypersonallabelmethod();
			if (deletiondeletemypersonallabelhead.equals(deletiondeletemypersonallabelexcel)) {
				test.pass("TC:13.5 THE LABEL 'DELETION - DELETE MY PERSONAL DATA THAT HAS BEEN ..' IS DISPLAYED");
			} else {
				test.fail("TC:13.5 THE LABEL 'DELETION - DELETE MY PERSONAL DATA THAT HAS BEEN ..' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "THE LABEL 'DELETION - DELETE MY PERSONAL DATA THAT HAS BEEN ..' IS DISPLAYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// Deletion - Delete my personal data that has been collected radio button
		try {
			String deletiondeletemypersonalradiobuttonhead = page.deletiondeletemypersonalradiobuttonmethod();
			if (!deletiondeletemypersonalradiobuttonhead.equals("true")) {
				test.pass(
						"TC:13.6 DELETION - DELETE MY PERSONAL DATA THAT ... RADIO BUTTON SHOULD  NOT CLICK BY DEFAULT");
			} else {
				test.fail(
						"TC:13.6 DELETION - DELETE MY PERSONAL DATA THAT.. RADIO BUTTON SHOULD  NOT CLICK BY DEFAULT");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "DELETION - DELETE MY PERSONAL DATA THAT.. RADIO BUTTON SHOULD BE NOT CLICK BY DEFAULT");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// select MCDONALD'S MAY NOT SELL RADIO BUTTON radio button
		try {
			String mcdonaldsmaynotsellradiobuttonhead = page.mcdonaldsmaynotsellradiobuttonmethod1();
			if (mcdonaldsmaynotsellradiobuttonhead.equals("true")) {
				test.pass("TC:13.7 McDONALD'S MAY NOT SELL.. RADIO BUTTON SHOULD BE CLICKABLE");
			} else {
				test.fail("TC:13.7 McDONALD'S MAY NOT SELL.. RADIO BUTTON SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "McDONALD'S MAY NOT SELL.. RADIO BUTTON SHOULD BE CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// select Access - Provide my personal data that has been collected RADIO BUTTON
		try {
			String accessprovidemypersonalradiobuttonhead = page.accessprovidemypersonalradiobuttonmethod1();
			if (accessprovidemypersonalradiobuttonhead.equals("true")) {
				test.pass("TC:13.8 ACCESS - PROVIDE MY PERSONAL.. RADIO BUTTON SHOULD BE CLICKABLE ");
			} else {
				test.fail("TC:13.8 ACCESS - PROVIDE MY PERSONAL.. RADIO BUTTON SHOULD BE CLICKABEL");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "ACCESS - PROVIDE MY PERSONAL.. RADIO BUTTON SHOULD BE  CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// SELECT Deletion - Delete my personal data that has been collected radio
		// button
		try {
			String deletiondeletemypersonalradiobuttonhead = page.deletiondeletemypersonalradiobuttonmethod1();
			if (deletiondeletemypersonalradiobuttonhead.equals("true")) {
				test.pass("TC:13.9 DELETION - DELETE MY PERSONAL DATA THAT ... RADIO BUTTON SHOULD BE CLICKABLE");
				// MCDONALD'S MAY NOT SELL RADIO BUTTON radio button
				try {
					String mcdonaldsmaynotsellradiobuttonhead = page.mcdonaldsmaynotsellradiobuttonmethod();
					if (!mcdonaldsmaynotsellradiobuttonhead.equals("true")) {
						test.pass("TC:13.10 USER SHOUL NOT SELECT MULTIPUL RADIO BUTTON");
					} else {
						test.fail("TC:13.10 USER SHOUL NOT SELECT MULTIPUL RADIO BUTTON");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
										+ "USER SHOUL NOT SELECT MULTIPUL RADIO BUTTON");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());

				}
				// Access - Provide my personal data that has been collected RADIO BUTTON
				String accessprovidemypersonalradiobuttonhead = page.accessprovidemypersonalradiobuttonmethod();
				if (!accessprovidemypersonalradiobuttonhead.equals("true")) {
					test.pass("TC:13.11 USER SHOUL NOT SELECT MULTIPUL RADIO BUTTON ");
				} else {
					test.fail("TC:13.11 USER SHOUL NOT SELECT MULTIPUL RADIO BUTTON");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
							+ "USER SHOUL NOT SELECT MULTIPUL RADIO BUTTON");
				}
			} else {
				test.fail("TC:13.9 DELETION - DELETE MY PERSONAL DATA THAT.. RADIO BUTTON SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "DELETION - DELETE MY PERSONAL DATA THAT.. RADIO BUTTON SHOULD BE  CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// PLEASE SPECIFY REQUEST error message

		try {
			String pleasespecifyrequesterrormessagehead = page.pleasespecifyrequesterrormessagemethod();
			String pleasespecifyrequesterrormessageexcel = Excelreader.getData(0, 46, 5);
			if (pleasespecifyrequesterrormessagehead.equals(pleasespecifyrequesterrormessageexcel)) {
				test.pass("TC:13.12 PLEASE SPECIFY YOUR REQUEST 'ERRORMESSAGE IS DISPLAYED----->" + "'"
						+ pleasespecifyrequesterrormessagehead + "'");
			} else {
				test.fail("TC:13.12 PLEASE SPECIFY YOUR REQUEST 'ERRORMESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "PLEASE SPECIFY YOUR REQUEST 'ERRORMESSAGE IS NOT DISPLAYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 10)
	public void By_Selecting_Submit_GLOBAL_ERROR_MESSAGE_CCPA() {
		test = extent.createTest("By_Selecting_Submit_GLOBAL_ERROR_MESSAGE_CCPA");
		CCPA_Rights_Center_Page page = new CCPA_Rights_Center_Page(driver);
		
		try {
			driver.get(Basepage.readProperty("urlccpa"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL OF CCPA IS OPENED");
			} else {
				test.fail("TC:1 URL OF CCPA IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "URL OF CCPA IS NOT OPENED");
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
		
		// BY SELECTING SUBMIT... LABEL
		try {
			String byselectingsubmitlabelhead = page.byselectingsubmitlabelmethod();
			String byselectingsubmitlabelexcel = Excelreader.getData(0, 42, 5);
			if (byselectingsubmitlabelhead.equals(byselectingsubmitlabelexcel)) {
				test.pass("TC:14 VERIF LABEL 'MY SELECTING SUBMIT....' IS DISPLAYED");
			} else {
				test.fail("TC:14 VERIF LABEL 'MY SELECTING SUBMIT....' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "VERIF LABEL 'MY SELECTING SUBMIT....' IS NOT DISPLAYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// 7 global error message
		try {
			String totalerrohead = page.globalerrormessagelabelmethod();
			String totalerroexcel = Excelreader.getData(0, 43, 5);
			if (totalerrohead.equals(totalerroexcel)) {
				test.pass("'15 GLOBAL ERROR MESSAGE DISPLAYED' -->" + "'" + totalerrohead + "'");
			} else {
				test.fail("TC: 15 GLOBAL ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ " GLOBAL ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// privacypolicy
		try {
			page.privacypolicylinkmethod();
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 45, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:18 PRIVACY POLICY LINK IS WORKING FINE");
			} else {
				test.fail("TC:18 PRIVACY POLICY LINK IS NOT WORKING FINE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "PRIVACY POLICY LINK IS WORKING FINE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}
 
	@Test(priority = 11)
 	public void RESET_BUTTON_CCPA() {
		test = extent.createTest("RESET_BUTTON_CCPA");
		CCPA_Rights_Center_Page page = new CCPA_Rights_Center_Page(driver);	
	
		try {
			driver.get(Basepage.readProperty("urlccpa"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL OF CCPA IS OPENED");
			} else {
				test.fail("TC:1 URL OF CCPA IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "URL OF CCPA IS NOT OPENED");
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
		
		// reset button
		try {
			String resetlinklabelhead = page.resetlinklabelmethod();
			String resetlinklabelexcel = Excelreader.getData(0, 44, 5);
			if (resetlinklabelhead.equals(resetlinklabelexcel)) {
				test.pass("'16 RESET LABEL LINK IS DISPLAYED'");
			} else {
				test.fail("TC: 16 RESET LABEL LINK IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ " RESET LABEL LINK IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// CLICK RESET BUTTON
		try {
			String resetlinkclickhead = page.resetlinkclickmethod();
			String resetlinkclickexcel = Excelreader.getData(0, 43, 5);
			if (!resetlinkclickhead.equals(resetlinkclickexcel)) {
				test.pass("'17 RESET LABEL LINK IS WORKING FINE'");

			} else {
				test.fail("TC: 17 RESET LABEL LINK IS NOT WORKING FINE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ " RESET LABEL LINK IS WORKING FINE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		
		
		
	}	

	@Test(priority = 12)
	public void positive_scenario_Mcdonald_May_CCPA() {
		test = extent.createTest("positive_scenario_Mcdonald_May_CCPA");
		CCPA_Rights_Center_Page page = new CCPA_Rights_Center_Page(driver);

		try {
			driver.get(Basepage.readProperty("urlccpa"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL OF CCPA IS OPENED");
			} else {
				test.fail("TC:1 URL OF CCPA IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "URL OF CCPA IS NOT OPENED");
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
		// first name CHARACTER
		try {
			String FNCHARACTER = Excelreader.getData(0, 10, 5);
			String valc = page.finameEnteredvalue1(FNCHARACTER);
			if (valc.equals(FNCHARACTER)) {
				test.pass("TC:7.4  CHARACTERS VALUE SHOULD  ENTERED IN FIRSTNAME TEXTBOX");
			} else {
				test.fail("TC:7.4  CHARACTERS VALUE SHOULD  ENTERED IN FIRSTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "CHARACTERS VALUE SHOULD  ENTERED IN FIRSTNAME TEXTBOX");
			}
		} catch (Exception e) {

			test.fail("Error:" + e.getMessage());
		}

		// CHARACTER of last name
		try {
			String LNcharacter = Excelreader.getData(0, 16, 5);
			String LAcvalue = page.lastnameenterdvalue(LNcharacter);
			if (LAcvalue.equals(LNcharacter)) {
				test.pass("TC:8.4 CHARACTERS VALUE SHOULD ENTERED IN LASTNAME TEXTBOX");
			} else {
				test.fail("TC:8.4 CHARACTERS VALUE SHOULD ENTERED IN LASTNAME TEXTBOX ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "CHARACTERS VALUE SHOULD ENTERED IN LASTNAME TEXTBOX");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// enter mail format on email
		try {
			String emailsendid = Excelreader.getData(0, 20, 5);
			String emailvlue = page.mailsendmethod(emailsendid);
			if (emailvlue.equals(emailsendid)) {
				test.pass("TC:9.4 USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
			} else {
				test.fail("TC:9.4 USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// enter mail FORMAT on confirm mail
		try {
			String confirmmailsend = Excelreader.getData(0, 25, 5);
			String conmailsendvalue = page.confirmmailsendidmethod(confirmmailsend);
			if (conmailsendvalue.equals(confirmmailsend)) {
				test.pass("TC:10.4  MAIL ID IS SEND ON CONFIRM MAIL TEXTBOX");
			} else {
				test.fail("TC:10.4 MAIL ID IS NOT SEND ON CONFIRM MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "MAIL ID IS NOT SEND ON CONFIRM MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		try {

			// STATE DROP DOWN IS CLICKABLE OR NOT
			String statedropdownvaluehead = page.statedropdownvaluemethod1();
			String statedropdownvalueexcel = Excelreader.getData(0, 29, 5);
			if (statedropdownvaluehead.equals(statedropdownvalueexcel)) {
				test.pass("TC:11.2 STATE DROPDOWN IS WORKING ");
			} else {
				test.fail("TC:11.2 STATE DROPDOWN IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "STATE FUNCTION IS CLICKABLE");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// send numerical in phone number function
		try {
			String phonenumaricalhead = Excelreader.getData(0, 32, 5);
			String phonenumenteredval = page.phonenumbersendedvaluemethod(phonenumaricalhead);
			if (phonenumenteredval.equals(phonenumaricalhead)) {
				test.pass("TC:12.2 USER SHOUND BE SEND NUMERICAL VALUE IN PHONE NUMBER TEXTBOX");
			} else {
				test.fail("TC:12.2 USER SHOUND BE SEND NUMERICAL VALUE IN PHONE NUMBER TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "NUMERICAL VALUE IS NOT ENTERED IN PHONE NUMBER TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// select MCDONALD'S MAY NOT SELL RADIO BUTTON radio button
		try {
			String mcdonaldsmaynotsellradiobuttonhead = page.mcdonaldsmaynotsellradiobuttonmethod1();
			if (mcdonaldsmaynotsellradiobuttonhead.equals("true")) {
				test.pass("TC:13.7 McDONALD'S MAY NOT SELL.. RADIO BUTTON SHOULD BE CLICKABLE");
			} else {
				test.fail("TC:13.7 McDONALD'S MAY NOT SELL.. RADIO BUTTON SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "McDONALD'S MAY NOT SELL.. RADIO BUTTON SHOULD BE CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// click on submit
		try {
			page.submitGEQ();// click submit button
			Thread.sleep(50000);
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 49, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC: CCPA FORM IS SUBMITTED SUCCESSFULLY AND THANKS YOU PAGE IS DISPLAYED ");
			} else {
				test.fail("TC:  CCPA FORM IS NOT SUBMITTED SUCCESSFULLY AND THANKS YOU PAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ " CCPA FORM IS NOT SUBMITTED SUCCESSFULLY THANKS YOU PAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 13)
	public void positive_scenario_Access_Provide_CCPA() {
		test = extent.createTest("positive_scenario_Access_Provide_CCPA");
		CCPA_Rights_Center_Page page = new CCPA_Rights_Center_Page(driver);

		try {
			driver.get(Basepage.readProperty("urlccpa"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL OF CCPA IS OPENED");
			} else {
				test.fail("TC:1 URL OF CCPA IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "URL OF CCPA IS NOT OPENED");
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
		// first name CHARACTER
		try {
			String FNCHARACTER = Excelreader.getData(0, 10, 5);
			String valc = page.finameEnteredvalue1(FNCHARACTER);
			if (valc.equals(FNCHARACTER)) {
				test.pass("TC:7.4  CHARACTERS VALUE SHOULD  ENTERED IN FIRSTNAME TEXTBOX");
			} else {
				test.fail("TC:7.4  CHARACTERS VALUE SHOULD  ENTERED IN FIRSTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "CHARACTERS VALUE SHOULD  ENTERED IN FIRSTNAME TEXTBOX");
			}
		} catch (Exception e) {

			test.fail("Error:" + e.getMessage());
		}

		// CHARACTER of last name
		try {
			String LNcharacter = Excelreader.getData(0, 16, 5);
			String LAcvalue = page.lastnameenterdvalue(LNcharacter);
			if (LAcvalue.equals(LNcharacter)) {
				test.pass("TC:8.4 CHARACTERS VALUE SHOULD ENTERED IN LASTNAME TEXTBOX");
			} else {
				test.fail("TC:8.4 CHARACTERS VALUE SHOULD ENTERED IN LASTNAME TEXTBOX ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "CHARACTERS VALUE SHOULD ENTERED IN LASTNAME TEXTBOX");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// enter mail format on email
		try {
			String emailsendid = Excelreader.getData(0, 20, 5);
			String emailvlue = page.mailsendmethod(emailsendid);
			if (emailvlue.equals(emailsendid)) {
				test.pass("TC:9.4 USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
			} else {
				test.fail("TC:9.4 USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// enter mail FORMAT on confirm mail
		try {
			String confirmmailsend = Excelreader.getData(0, 25, 5);
			String conmailsendvalue = page.confirmmailsendidmethod(confirmmailsend);
			if (conmailsendvalue.equals(confirmmailsend)) {
				test.pass("TC:10.4  MAIL ID IS SEND ON CONFIRM MAIL TEXTBOX");
			} else {
				test.fail("TC:10.4 MAIL ID IS NOT SEND ON CONFIRM MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "MAIL ID IS NOT SEND ON CONFIRM MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		try {

			// STATE DROP DOWN IS CLICKABLE OR NOT
			String statedropdownvaluehead = page.statedropdownvaluemethod1();
			String statedropdownvalueexcel = Excelreader.getData(0, 29, 5);
			if (statedropdownvaluehead.equals(statedropdownvalueexcel)) {
				test.pass("TC:11.2 STATE DROPDOWN IS WORKING ");
			} else {
				test.fail("TC:11.2 STATE DROPDOWN IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "STATE FUNCTION IS CLICKABLE");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// send numerical in phone number function
		try {
			String phonenumaricalhead = Excelreader.getData(0, 32, 5);
			String phonenumenteredval = page.phonenumbersendedvaluemethod(phonenumaricalhead);
			if (phonenumenteredval.equals(phonenumaricalhead)) {
				test.pass("TC:12.2 USER SHOUND BE SEND NUMERICAL VALUE IN PHONE NUMBER TEXTBOX");
			} else {
				test.fail("TC:12.2 USER SHOUND BE SEND NUMERICAL VALUE IN PHONE NUMBER TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "NUMERICAL VALUE IS NOT ENTERED IN PHONE NUMBER TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// select Access - Provide my personal data that has been collected RADIO BUTTON
		try {
			String accessprovidemypersonalradiobuttonhead = page.accessprovidemypersonalradiobuttonmethod1();
			if (accessprovidemypersonalradiobuttonhead.equals("true")) {
				test.pass("TC:13.8 ACCESS - PROVIDE MY PERSONAL.. RADIO BUTTON SHOULD BE CLICKABLE ");
			} else {
				test.fail("TC:13.8 ACCESS - PROVIDE MY PERSONAL.. RADIO BUTTON SHOULD BE CLICKABEL");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "ACCESS - PROVIDE MY PERSONAL.. RADIO BUTTON SHOULD BE  CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// click on submit
		try {
			page.submitGEQ();// click submit button
			Thread.sleep(25000);
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 47, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC: THANK PAGE OF CCPA FORM IS  SUCCESSFULLY ");
			} else {
				test.fail("TC:THANK PAGE OF  CCPA FORM IS NOT  SUCCESSFULLY");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "THANK PAGE OF CCPA FORM IS NOT SUCCESSFULLY");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 14)
	public void positive_scenario_Deletion_Dlete_CCPA() {
		test = extent.createTest("positive_scenario_Deletion_Dlete_CCPA");
		CCPA_Rights_Center_Page page = new CCPA_Rights_Center_Page(driver);
		
		try {
			driver.get(Basepage.readProperty("urlccpa"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL OF CCPA IS OPENED");
			} else {
				test.fail("TC:1 URL OF CCPA IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "URL OF CCPA IS NOT OPENED");
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
		// first name CHARACTER
		try {
			String FNCHARACTER = Excelreader.getData(0, 10, 5);
			String valc = page.finameEnteredvalue1(FNCHARACTER);
			if (valc.equals(FNCHARACTER)) {
				test.pass("TC:7.4  CHARACTERS VALUE SHOULD  ENTERED IN FIRSTNAME TEXTBOX");
			} else {
				test.fail("TC:7.4  CHARACTERS VALUE SHOULD  ENTERED IN FIRSTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "CHARACTERS VALUE SHOULD  ENTERED IN FIRSTNAME TEXTBOX");
			}
		} catch (Exception e) {

			test.fail("Error:" + e.getMessage());
		}

		// CHARACTER of last name
		try {
			String LNcharacter = Excelreader.getData(0, 16, 5);
			String LAcvalue = page.lastnameenterdvalue(LNcharacter);
			if (LAcvalue.equals(LNcharacter)) {
				test.pass("TC:8.4 CHARACTERS VALUE SHOULD ENTERED IN LASTNAME TEXTBOX");
			} else {
				test.fail("TC:8.4 CHARACTERS VALUE SHOULD ENTERED IN LASTNAME TEXTBOX ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "CHARACTERS VALUE SHOULD ENTERED IN LASTNAME TEXTBOX");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// enter mail format on email
		try {
			String emailsendid = Excelreader.getData(0, 20, 5);
			String emailvlue = page.mailsendmethod(emailsendid);
			if (emailvlue.equals(emailsendid)) {
				test.pass("TC:9.4 USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
			} else {
				test.fail("TC:9.4 USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// enter mail FORMAT on confirm mail
		try {
			String confirmmailsend = Excelreader.getData(0, 25, 5);
			String conmailsendvalue = page.confirmmailsendidmethod(confirmmailsend);
			if (conmailsendvalue.equals(confirmmailsend)) {
				test.pass("TC:10.4  MAIL ID IS SEND ON CONFIRM MAIL TEXTBOX");
			} else {
				test.fail("TC:10.4 MAIL ID IS NOT SEND ON CONFIRM MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "MAIL ID IS NOT SEND ON CONFIRM MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		try {

			// STATE DROP DOWN IS CLICKABLE OR NOT
			String statedropdownvaluehead = page.statedropdownvaluemethod1();
			String statedropdownvalueexcel = Excelreader.getData(0, 29, 5);
			if (statedropdownvaluehead.equals(statedropdownvalueexcel)) {
				test.pass("TC:11.2 STATE DROPDOWN IS WORKING ");
			} else {
				test.fail("TC:11.2 STATE DROPDOWN IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "STATE FUNCTION IS CLICKABLE");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// send numerical in phone number function
		try {
			String phonenumaricalhead = Excelreader.getData(0, 32, 5);
			String phonenumenteredval = page.phonenumbersendedvaluemethod(phonenumaricalhead);
			if (phonenumenteredval.equals(phonenumaricalhead)) {
				test.pass("TC:12.2 USER SHOUND BE SEND NUMERICAL VALUE IN PHONE NUMBER TEXTBOX");
			} else {
				test.fail("TC:12.2 USER SHOUND BE SEND NUMERICAL VALUE IN PHONE NUMBER TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "NUMERICAL VALUE IS NOT ENTERED IN PHONE NUMBER TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// SELECT Deletion - Delete my personal data that has been collected radio
		// button
		try {
			String deletiondeletemypersonalradiobuttonhead = page.deletiondeletemypersonalradiobuttonmethod1();
			if (deletiondeletemypersonalradiobuttonhead.equals("true")) {
				test.pass("TC:13.9 DELETION - DELETE MY PERSONAL DATA THAT ... RADIO BUTTON SHOULD BE CLICKABLE");
			} else {
				test.fail("TC:13.9 DELETION - DELETE MY PERSONAL DATA THAT.. RADIO BUTTON SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "DELETION - DELETE MY PERSONAL DATA THAT.. RADIO BUTTON SHOULD BE  CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// click on submit
		try {
			page.submitGEQ();// click submit button
			Thread.sleep(20000);
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 47, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC: THANK PAGE OF CCPA FORM IS  WORKING ");
			} else {
				test.fail("TC: THANK PAGE OF CCPA FORM IS NOT  WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ " THANK PAGE OF CCPA FORM IS NOT  WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 15)
	public void Privacy_Statement_CCPA() {
		CCPA_Rights_Center_Page page = new CCPA_Rights_Center_Page(driver);
		test = extent.createTest("Privacy_Statement_CCPA");

		// privacy statement
		try {
			driver.get(Basepage.readProperty("urlccpa"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL OF CCPA IS OPENED");
			} else {
				test.fail("TC:1 URL OF CCPA IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "URL OF CCPA IS NOT OPENED");
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
		// privacy statement
		try {

			String gettitle = page.privacystatementclickmethod();
			String gettitleexcel = Excelreader.getData(0, 45, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 PRIVACY STATEMENT LINK IS WORKING FINE");
			} else {
				test.fail("TC:1 PRIVACY STATEMENT LINK IS NOT WORKING FINE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "PRIVACY STATEMENT LINK IS NOT WORKING FINE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 16)
	public void Contactprivacy_Link_CCPA() {
		CCPA_Rights_Center_Page page = new CCPA_Rights_Center_Page(driver);
		test = extent.createTest("Contactprivacy_Link_CCPA");

		//  
		try {
			driver.get(Basepage.readProperty("urlccpa"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL OF CCPA IS OPENED");
			} else {
				test.fail("TC:1 URL OF CCPA IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "URL OF CCPA IS NOT OPENED");
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
		// contact privacy
		try {

			String gettitle = page.contactprivacylinkmethod();
			String gettitleexcel = Excelreader.getData(0, 48, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 CONTACTPRIVACY@US.MCD.COM LINK IS WORKING FINE");
			} else {
				test.fail("TC:1 CONTACTPRIVACY@US.MCD.COM LINK IS NOT WORKING FINE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "CONTACTPRIVACY@US.MCD.COM LINK IS NOT WORKING FINE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 17)
	public void Accessibility_Link_CCPA() {
		CCPA_Rights_Center_Page page = new CCPA_Rights_Center_Page(driver);
		test = extent.createTest("Accessibility_Link_CCPA");
		try {
			driver.get(Basepage.readProperty("urlccpa"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL OF CCPA IS OPENED");
			} else {
				test.fail("TC:1 URL OF CCPA IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "URL OF CCPA IS NOT OPENED");
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
	
		// contact privacy
		try {

			String gettitle = page.accessibilitylinkcickmethod();
			String gettitleexcel = Excelreader.getData(0, 48, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 CONTACTPRIVACY@US.MCD.COM LINK IS WORKING FINE");
			} else {
				test.fail("TC:1 CONTACTPRIVACY@US.MCD.COM LINK IS NOT WORKING FINE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "CCPA_Rights_Center"))
						+ "CONTACTPRIVACY@US.MCD.COM LINK IS NOT WORKING FINE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

}

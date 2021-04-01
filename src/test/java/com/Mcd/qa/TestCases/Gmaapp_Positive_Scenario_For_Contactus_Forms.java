package com.Mcd.qa.TestCases;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.McD.qa.Base.BaseTest;
import com.McD.qa.Extentreport.Extentreport;
import com.McD.qa.Pages.Basepage;
import com.McD.qa.Pages.CCPA_Rights_Center_Page;
import com.McD.qa.Pages.Core_General_Inquiry_Page;
import com.McD.qa.Pages.Core_Trademark_Permission_page;
import com.McD.qa.Pages.Franchising_Form_page;
import com.McD.qa.Pages.General_Inqure_Page;
import com.McD.qa.Pages.Mobile_App_Feedback_Page;
import com.McD.qa.Pages.Restaurant_feedback_page;
import com.McD.qa.Pages.Resturant_Feedback_page1;
import com.McD.qa.Pages.Trademark_permission_Page;
import com.McD.qa.Utility.TestUtil;

public class Gmaapp_Positive_Scenario_For_Contactus_Forms extends BaseTest {
	
	
	@Test(priority = 1)
	public void Gmaapp_Restaurant_Feedback_Positive_scenario() throws IOException {
		Resturant_Feedback_page1 page = new Resturant_Feedback_page1(driver);
		test = extent.createTest(" Restaurant_Feedback_Positive_scenario");
		String excelptha = System.getProperty("user.dir");
		TestUtil Excelreader = new TestUtil(excelptha + "/src/main/java/com/McD/qa/TestData/restaurant_feedback.xls");

		try {
			driver.get(Basepage.readProperty("urlRG"));

			String gettitle = page.generallgetpagetitlemethod1();
			String gettitleexcel = Excelreader.getData(0, 1, 6);
			if (gettitle.equalsIgnoreCase(gettitleexcel)) {
				test.pass("TC:1 RESTAURANT URL IS OPENED");
			} else {
				test.fail("TC:1 RESTAURANT URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
       		
//Restaurant locator		
		try {
			String zipcityhead = page.zipcitymethod();
			String zipcityexcel = Excelreader.getData(0, 7, 6);
			if (!zipcityhead.equalsIgnoreCase("")) {
				test.pass("TC:8 RESTAURANT LOCATER BUTTON IS WORKING");
				// SEND ZIP CODE
				try {
					String zipvalexcel = Excelreader.getData(0, 9, 6);
					String zipvalhead = page.zipenteredvalmethod(zipvalexcel);
					if (zipvalhead.equalsIgnoreCase(zipvalexcel)) {
						test.pass("TC:11  USER ABLE TO SEND ZIP CODE");
						// CLICK ON SEARCH
						try {
							String readd335 = page.restaurantaddressmethod();
							if (!readd335.equalsIgnoreCase("")) {
								test.pass("TC:12 SEARCH BUTTON IS WORKING AND RESTAURANT LOCATION ALSO IS DISPLAYED");

								
								// click on select restaurant button
								try {
									String restaurantbuttonclickhead = page.restaurantbuttonclickmethod();
									String restaurantbuttonclickexcel = Excelreader.getData(0, 11, 6);
									if (restaurantbuttonclickhead.equalsIgnoreCase("")) {
										test.pass("TC:14 THE 'SELECT RESTAURANT' BUTTON IS WORKING");
									} else {
										test.fail("TC:14 THE 'SELECT RESTAURANT' BUTTON IS WORKING");
										test.fail(test.addScreenCaptureFromPath(
												Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
												+ "THE 'SELECT RESTAURANT' BUTTON IS WORKING");
									}
								} catch (Exception e) {
									test.fail("Error:" + e.getMessage());
								}
							} else {
								test.fail(
										"TC:12 SEARCH BUTTON IS NOT WORKING AND RESTAURANT LOCATION ALSO IS NOT DISPLAYED");
								test.fail(test.addScreenCaptureFromPath(
										Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
										+ "SEARCH BUTTON IS NOT WORKING  AND RESTAURANT LOCATION ALSO IS NOT DISPLAYED");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}

					} else {
						test.fail("TC:11 USER NOT ABLE TO SEND ZIP CODE");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
										+ "USER NOT ABLE TO SEND ZIP CODE");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
			} else if (zipcityhead.equalsIgnoreCase(zipcityexcel)) {

				test.fail("TC:8 RESTAURANT LOCATER BUTTON IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "RESTAURANT LOCATER BUTTON IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// VISIT DATE ENTER values NUMERICAL
		try {
			String visitdatelabelexcel = Excelreader.getData(0, 19, 7);
			String visitdatelabelhead = page.visitdatesendmethod1(visitdatelabelexcel);
			if (visitdatelabelhead.equals(visitdatelabelexcel)) {
				test.pass("TC:24.2 USERS  ABLE TO ENTER NUMERICALS AND DATE");
			} else {
				test.fail("TC:24.2 USERS NOT ABLE TO ENTER NUMERICALS AND DATE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "USERS NOT ABLE TO ENTER NUMERICALS");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// VISIT time ENTER CHARACTERS AND NUMERICALS
		try {
			String visittimelabelexcel = Excelreader.getData(0, 23, 7);
			String visittimelabelhead = page.visittimesendmethod1(visittimelabelexcel);
			if (visittimelabelhead.equals(visittimelabelexcel)) {
				test.pass("TC:25.3 USERS ABLE TO  ENTER CHARACTERS AND NUMERICALS");
			} else {
				test.fail("TC:24.3 USERS NOT ABLE TO  ENTER CHARACTERS AND NUMERICALS");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "USERS NOT ABLE TO  ENTER CHARACTERS AND NUMERICALS");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// click drop down am value
		try {
		//String amtextdisplayedexcel = Excelreader.getData(0, 105, 6);
		String amtextdisplayedhead = page.pmvaluedisplayedmethod1();
		//if (amtextdisplayedhead.equals(amtextdisplayedexcel)) {
		if (!amtextdisplayedhead.equals("")){
		test.pass("TC:25.4 USER ABLE TO SELECT DROP DOWN VALUE OF AM/PM FUNCTION");
		} else {
		test.fail("TC:24.4 USER NOT ABLE TO SELECT DROP DOWN VALUE OF AM/PM FUNCTION");
		test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
		+ "USER NOT ABLE TO SELECT DROP DOWN VALUE OF AM/PM FUNCTION");
		}
		} catch (Exception e) {
		test.fail("Error:" + e.getMessage());
		}

		// how did you place your order label DROP DOWN
		try {
			String howdidyouplaceyourorderlabelhead = page.howdidyouplaceyourorderdropdownmethod1();
			if (!howdidyouplaceyourorderlabelhead.equals("")) {
				test.pass("TC:26.3 'HOW DID YOU PLACE YOUR ORDER' DROP DOWN IS WORKING");
			} else {
				test.fail("TC:26.3 'HOW DID YOU PLACE YOUR ORDER' DROP DOWN IS WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "'HOW DID YOU PLACE YOUR ORDER' DROP DOWN IS WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// how did you pick your order label DROP DOWN

		try {
			String howdidyoupickyourorderdropdownhead = page.howdidyoupickyourorderdropdownmethod();
			if (!howdidyoupickyourorderdropdownhead.equals("")) {
				test.pass("TC:27.3 'HOW DID YOU PICK YOUR ORDER' DROP DOWN IS WORKING");
			} else {
				test.fail("TC:27.3 'HOW DID YOU PICK YOUR ORDER' DROP DOWN IS WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "'HOW DID YOU PLACE YOUR ORDER' DROP DOWN IS WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// enter NUMARICAL AND characters on comments
		try {
			String commetspecialcharacterhexcel = Excelreader.getData(0, 31, 6);
			String commscenteredvalue = page.commententeredvalue(commetspecialcharacterhexcel);
			if (commscenteredvalue.equals(commetspecialcharacterhexcel)) {
				test.pass("TC:29.4 USE SHOUL BE SEND  NUMARICAL AND  CHARACTER IN COMMENT TEXT");
			} else {
				test.fail("TC:29.4 USE SHOUL BE SEND NUMARICAL AND CHARACTER IN COMMENT TEXT");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "USE SHOUL BE SEND NUMARICAL AND CHARACTER IN COMMENT TEXT");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// CHARACTERS VALUES IN FIRST NAME FUNCTION
		try {
			String firstnamesendvalexcel = Excelreader.getData(0, 38, 6);
			String sendedvalhead = page.finameEnteredvalue(firstnamesendvalexcel);
			if (sendedvalhead.equals(firstnamesendvalexcel)) {
				test.pass("TC:31.5  USE SHOULD  BE SEND CHARACTERS  IN FIRSTNAME TEXTBOX");
			} else {
				test.fail("TC:31.5  USE SHOULD BE SEND CHARACTERS IN FIRSTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "USE SHOULD  BE SEND CHARACTERS IN FIRSTNAME TEXTBOX");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// CHARACTERS IN LAST NAME FUNCTION
		try {
			String LNSPECIALCHARACTER = Excelreader.getData(0, 43, 6);
			String LAscvalue = page.lastnameenterdvalue(LNSPECIALCHARACTER);
			if (LAscvalue.equals(LNSPECIALCHARACTER)) {
				test.pass("TC:32.5 USER SHOULD  SEND CHARACTERS IN LASTNAME SECTION");
			} else {
				test.fail("TC:32.5 USER SHOULD  SEND CHARACTERS IN LASTNAME SECTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "USER SHOULD  BE SEND CHARACTERS IN LASTNAME SECTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// SEND WITH MAIL FORMAT
		try {
			String emailsendid = Excelreader.getData(0, 48, 6);
			String emailvlue = page.emailenteredvalue(emailsendid);
			if (emailvlue.equalsIgnoreCase(emailsendid)) {
				test.pass("TC:33.5  USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
			} else {
				test.fail("TC:33.5 USER SHOULD SEND MAIL WITH FORMAT IN MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "USER SHOULD SEND MAIL WITH FORMAT IN MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// send same mail ids check error message
		try {
			String confirmmailsend = Excelreader.getData(0, 52, 6);
			String conmailsendvalue = page.confirmmailenteredvalue(confirmmailsend);
			if (conmailsendvalue.equals(confirmmailsend)) {
				test.pass("TC:34.4  USER ABLE TO SEND MAIL IN CONFIRM MAIL SECTION");
			} else {
				test.fail("TC:34.4 USER NOT ABLE TO SEND MAIL IN CONFIRM MAIL SECTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "USER NOT ABLE TO SEND MAIL IN CONFIRM MAIL SECTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ENTER 10 NUMERICAL on phone field 
		try {
			String phonecharacterhead = Excelreader.getData(0, 58, 6);
			String phonenumCenteredval = page.phonenumberenteredvalue1(phonecharacterhead);
			if (phonenumCenteredval.equals(phonecharacterhead)) {
				test.pass("TC:35.6 USER SHOULD  SEND 10 NUMERICAL ONLY IN PHONE NUMBER SECTION ");
			} else {
				test.fail("TC:35.6 USER SHOULD  SEND 10 NUMERICAL ONLY IN PHONE NUMBER SECTION ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "USER SHOULD SEND 10 NUMERICAL ONLY IN PHONE NUMBER SECTION ");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// CLICK NO radio button
		try {
			boolean noradiobuttonclickhead = page.noradiobuttonclickmethod1();
			if (noradiobuttonclickhead == true) {
				test.pass("TC:38.3 USER ABLE TO SELECT 'NO' RADIO BUTTON");
			} else {
				test.fail("TC:38.3 USER NOT ABLE TO SELECT 'NO' RADIO BUTTON");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "USER NOT ABLE TO SELECT 'NO' RADIO BUTTON");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}

		// click on submit AND thanks you! test
		try {
			String gettitle = page.generallgetpagetitlemethod2();
			String gettitleexcel = Excelreader.getData(0, 101, 6);
			if (gettitle.equalsIgnoreCase(gettitleexcel)) {
				test.pass("TC: RESTAURANT FEEDBACK FORM IS SUBMITTED SUCCESSFULLY  ");
			} else {
				test.fail("TC:1 RESTAURANT FEEDBACK FORM IS NOT SUBMITTED SUCCESSFULLY");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "RESTAURANT FEEDBACK FORM IS NOT SUBMITTED SUCCESSFULLY");
			}
		} catch (Exception e) {
			test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
					+ "SUBMIT BUTTON IS NOT WORKING FINE AND ENABEL");
		}

	}	

	@Test(priority = 2)
	public void Gmaapp_General_Enquire_Positive_scenario() throws Exception {
		test = extent.createTest("General_Enquire_Positive_scenario");
		Core_General_Inquiry_Page page = new Core_General_Inquiry_Page(driver);
		String excelptha = System.getProperty("user.dir");
		TestUtil Excelreader = new TestUtil(excelptha + "/src/main/java/com/McD/qa/TestData/Core_General_Inquiry.xlsx");		
			try {
				driver.get(Basepage.readProperty("urlGG"));
				String gettitle = page.generallgetpagetitlemethod();
				String gettitleexcel = Excelreader.getData(0, 1, 2);
				if (gettitle.equals(gettitleexcel)) {
					test.pass("TC:1 URL IS OPENED");
				} else {
					test.fail("TC:1 URL IS NOT OPENED");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
							+ "URL IS NOT OPENED");
					extent.flush();
					driver.close();
					throw new SkipException("Skipping - ");
				}
			} catch (Exception e) {
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "LABEL OF GENERAL ENQUIRE IS NOT DISPLAYED");
				extent.flush();
				driver.close();
				throw new SkipException("Skipping - ");
			}
			// CLICK ON 'PLEASE SELECT ANY ONE OPTION'
			try {
				String selectoptionhead = page.selecoptionclickmethod();
				String selectoptionexcel = Excelreader.getData(0, 17, 2);
				if (selectoptionhead.equals(selectoptionexcel)) {
					test.pass("TC:16.1 THE TEXT 'PLEASE SELECT ANY ONE OPTION' DROP DOWN IS WORKING");
					
				} else {
					test.fail("TC:16.1 THE TEXT 'PLEASE SELECT ANY ONE OPTION' DROP DOWN IS WORKING");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
							+ "THE TEXT 'PLEASE SELECT ANY ONE OPTION' DROP DOWN IS WORKING");
				}
			} catch (Exception e) {
				test.fail("Error:" + e.getMessage());
			}
			// enter numerical and characters on commets funtion
			try {
				String commetnumericalexcel = Excelreader.getData(0, 21, 1);
				String commscenteredvalue = page.commentspecialchaructermethod(commetnumericalexcel);
				if (commscenteredvalue.equals(commetnumericalexcel)) {
					test.pass("TC:18 USE ABLE TO SEND NUMERICAL IN COMMENT TEXT");
				} else {
					test.fail("TC:18 USE NOT ABLE TO SEND NUMARICAL IN COMMENT TEXT");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
							+ "USE NOT ABLE TO SEND NUMARICAL IN COMMENT TEXT");
				}

			} catch (Exception e) {
				test.fail("Error:" + e.getMessage());
			}
			// CHARACTER of first name
			try {
				String FNCHARACTER = Excelreader.getData(0, 29, 1);
				String valc = page.finameEnteredvalue(FNCHARACTER);
				if (valc.equals(FNCHARACTER)) {
					test.pass("TC:20  CHARACTERS VALUE IS ENTERED IN FIRSTNAME TEXTBOX");
				} else {
					test.fail("TC:20  CHARACTERS VALUE IS NOT ENTERED IN FIRSTNAME TEXTBOX");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
							+ "CHARACTERS VALUE IS NOT ENTERED IN FIRSTNAME TEXTBOX");
				}
			} catch (Exception e) {

				test.fail("Error:" + e.getMessage());
			}

			// CHARACTER of last name
			try {
				String LNcharacter = Excelreader.getData(0, 35, 1);
				String LAcvalue = page.lastnameenterdvalue(LNcharacter);
				if (LAcvalue.equals(LNcharacter)) {
					test.pass("TC:21 CHARACTERS VALUE IS ENTERED IN LASTNAME TEXTBOX");
				} else {
					test.fail("TC:21 CHARACTERS VALUE IS NOT ENTERED IN LASTNAME TEXTBOX ");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
							+ "CHARACTERS VALUE IS NOT ENTERED IN LASTNAME TEXTBOX");
				}
			} catch (Exception e) {
				test.fail("Error:" + e.getMessage());
			}
			// characters of addresss
			try {
				String addresscharactershead = Excelreader.getData(0, 41, 1);
				String addCvalue = page.addresssendedvaluemethod(addresscharactershead);
				if (addCvalue.equals(addresscharactershead)) {
					test.pass("TC:22 CHARACTERS VALUE IS ENTERED IN ADDRESS TEXTBOX");
				} else {
					test.fail("TC:22 CHARACTERS VALUE IS NOT ENTERED IN ADDRESS TEXTBOX");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
							+ "CHARACTERS VALUE IS NOT ENTERED IN ADDRESS TEXTBOX");
				}
			} catch (Exception e) {
				test.fail("Error:" + e.getMessage());
			}
			// characters and numerical of apisuite function
			try {
				String apisuitecharandnumari = Excelreader.getData(0, 46, 1);
				String suitesh = page.aptsuitsendedvaluemethod(apisuitecharandnumari);
				if (suitesh.equals(apisuitecharandnumari)) {
					test.pass("TC:23 CHARACTERS AND NUMERICAL ABLE TO ENTERED IN APT/SUITE TEXTBOX");
				} else {
					test.fail("TC:23 CHARACTERS AND NUMERICAL NOT ABLE TO ENTERED IN APT/SUITE TEXTBOX");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
							+ "CHARACTERS AND NUMERICAL NOT ABLE TO ENTERED IN APT/SUITE TEXTBOX");
				}

			} catch (Exception e) {
				test.fail("Error:" + e.getMessage());
			}

			// CHARACTERS city
			try {
				String citycharecter = Excelreader.getData(0, 51, 1);
				String cityCenteredvalue = page.citysendedvaluemethod(citycharecter);
				if (cityCenteredvalue.equals(citycharecter)) {
					test.pass("TC:24 CHARACTER VALUE IS ENTERED IN CITY TEXTBOX");
				} else {
					test.fail("TC:24 CHARACTER VALUE NOT ABLE TO ENTERED IN CITY TEXTBOX");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
							+ "CHARACTER VALUE NOT ABLE TO ENTERED IN CITY TEXTBOX");
				}

			} catch (Exception e) {
				test.fail("Error:" + e.getMessage());
			}
			// select drop down values of state function
			// AFTER CLICK ON STATE AND LABEL IS ROLLED UP OR NOT
			// STATE DROP DOWN IS CLICKABLE OR NOT
			try {
						String statedropdownvaluehead = page.statedropdownvaluemethod();
						String statedropdownvalueexcel = Excelreader.getData(0, 54, 2);
						if (statedropdownvaluehead.equals(statedropdownvalueexcel)) {
							test.pass("TC:25 STEATE DROP DOWN  IS WORKING");
						} else {
							test.fail("TC:25 STEATE DROP DOWN  IS WORKING");
							test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
									+ "STATE DROP DOWN VALUE IS NOT WORKING");
						}

					} catch (Exception e) {
						test.fail("Error:" + e.getMessage());
					}
			// enter numerical of zip function
			try {
				String zipnumerical = Excelreader.getData(0, 57, 1);
				String zipnenterdvalue = page.zipsendedvaluemethod(zipnumerical);
				if (zipnenterdvalue.equals(zipnumerical)) {
					test.pass("TC:26  USER SHOULD BE SEND 5 NUMBERS ONLY ON ZIP FUNCTION");
				} else {
					test.fail("TC:26  USER SHOULD BE SEND 5 NUMBERS ONLY ON ZIP FUNCTION");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
							+ "USER SHOULD BE SEND 5 NUMBERS ONLY ON ZIP FUNCTION");
				}

			} catch (Exception e) {
				test.fail("Error:" + e.getMessage());
			}
			// enter mail format on email
			try {
				String emailsendid = Excelreader.getData(0, 63, 1);
				String emailvlue = page.mailsendmethod(emailsendid);
				if (emailvlue.equals(emailsendid)) {
					test.pass("TC:27 USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
					
				} else {
					test.fail("TC:27 USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
							+ "USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
				}

			} catch (Exception e) {
				test.fail("Error:" + e.getMessage());
			}
			// enter mail FORMAT on confirm mail
			try {
				String confirmmailsend = Excelreader.getData(0, 66, 1);
				String conmailsendvalue = page.confirmmailsendidmethod(confirmmailsend);
				if (conmailsendvalue.equals(confirmmailsend)) {
					test.pass("TC:28  MAIL ID IS SEND IN CONFIRM MAIL TEXTBOX");
				} else {
					test.fail("TC:28 MAIL ID IS NOT SEND IN CONFIRM MAIL TEXTBOX");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
							+ "MAIL ID IS NOT SEND IN CONFIRM MAIL TEXTBOX");
				}

			} catch (Exception e) {
				test.fail("Error:" + e.getMessage());
			}

			// send numerical in phone number function
			try {
				String phonenumaricalhead = Excelreader.getData(0, 69, 1);
				String phonenumenteredval = page.phonenumbersendedvaluemethod(phonenumaricalhead);
				if (phonenumenteredval.equals(phonenumaricalhead)) {
					test.pass("TC:29 USER SHOUND BE SEND NUMERICAL VALUE IN PHONE NUMBER TEXTBOX");
				} else {
					test.fail("TC:29 USER SHOUND BE SEND NUMERICAL VALUE IN PHONE NUMBER TEXTBOX");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
							+ "NUMERICAL VALUE IS NOT ENTERED IN PHONE NUMBER TEXTBOX");
				}

			} catch (Exception e) {
				test.fail("Error:" + e.getMessage());
			}
			// click on submit
			try {
				String gettitle = page.generallgetpagetitlemethod1();
				String gettitleexcel = Excelreader.getData(0, 77, 1);
				if (gettitle.equals(gettitleexcel)) {
					test.pass("TC: SUBMIT BUTTON IS WORKING FINE AND ENABEL");
					test.pass("TC: GENERAL ENQUIRE FORM IS SUBMITTED SUCCESSFULLY ");
				} else {
					test.fail("TC:  GENERAL ENQUIRE FORM IS NOT SUBMITTED SUCCESSFULLY");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
							+ " GENERAL ENQUIRE FORM IS NOT SUBMITTED SUCCESSFULLY");
				}
			} catch (Exception e) {
				test.fail("Error:" + e.getMessage());
			}
		}

	@Test(priority = 3)
	public void Gmaapp_Mobile_App_Feedback_Positive_scenario() {
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		test = extent.createTest("Mobile_App_Feedback_Positive_scenario");
		String excelptha = System.getProperty("user.dir");
		TestUtil Excelreader = new TestUtil(excelptha + "/src/main/java/com/McD/qa/TestData/Mobile_App_Feedback.xls");
		try {
			driver.get(Basepage.readProperty("urlBG"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("------ MOBILE APP FEEDBACK POSITIVE SCENARIOS-----");
				test.pass("TC:1 URL IS OPENED");
			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
		// mobile device type clickable
		try {
			String mobiledevicetypdropdownvalhead = page.mobiledevicetypeclickable();
			String mobiledevicetypdropdownvalexcel = Excelreader.getData(0, 19, 5);
			if (mobiledevicetypdropdownvalhead.equals(mobiledevicetypdropdownvalexcel)) {
				test.pass("TC:16 MOBILE DEVICE TYPE SHOULD BE DROP DOWN AND CLICKABLE");
			} else {
				test.fail("TC:16  MOBILE DEVICE TYPE SHOULD BE DROP DOWN");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "MOBILE DEVICE TYPE SHOULD BE DROP DOWN");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// mobile operation system clickable
		try {
			String mobileoperationsytemdropdownvalhead = page.googleandroiddropdownvaluemethod1();
			String mobileoperationsytemdropdownvalexcel = Excelreader.getData(0, 22, 5);
			if (mobileoperationsytemdropdownvalhead.equals(mobileoperationsytemdropdownvalexcel)) {
				test.pass("TC:17 MOBILE OPERATION SYSTEM SHOULD BE DROP DOWN AND CLICKABLE");
				
			} else {
				test.fail("TC:17  MOBILE OPERATION SYSTEM SHOULD BE DROP DOWN");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "MOBILE OPERATION SYSTEM SHOULD BE DROP DOWN");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send character and numerical in mobile app version
		try {
			String mobileappversioncharnumaeriexcel = Excelreader.getData(0, 26, 5);
			String mobileversendedvalhead = page.mobileversionsendedvaluemethod(mobileappversioncharnumaeriexcel);
			if (mobileversendedvalhead.equals(mobileappversioncharnumaeriexcel)) {
				test.pass("TC:18 USER SHOULD  BE SEND NUMERICAL AND CHARACTER");

			} else {
				test.fail("TC:18 USER SHOULD  BE SEND NUMERICAL AND CHARACTER");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "USER SHOULD  BE SEND NUMERICAL AND CHARACTER");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// SEND CHARACTER AND NUMERICAL in enter you comments function
		try {
			String entercommentcharnumericalexcel = Excelreader.getData(0, 31, 5);
			String entercommentcharnumericalhead = page.entercommentsendedvaluemethod(entercommentcharnumericalexcel);
			if (entercommentcharnumericalhead.equals(entercommentcharnumericalexcel)) {
				test.pass("TC:19 USER SHOULD  BE SEND NUMERICAL AND CHARACTER");

			} else {
				test.fail("TC:19 USER SHOULD  BE SEND NUMERICAL AND CHARACTER");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "USER SHOULD  BE SEND NUMERICAL AND CHARACTER");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		/*// send characters and numerical in restaurant address function
		try {
			String restaurantaddspchanumarexcel = Excelreader.getData(0, 49, 5);
			String restaurantaddspchanumahead = page.resraurantaddvaluemethod1(restaurantaddspchanumarexcel);
			if (restaurantaddspchanumahead.equals(restaurantaddspchanumarexcel)) {
				test.pass("TC:29 USER SHOULD BE SEND NUMERICAL AND CHARACTERS");
			} else {
				test.fail("TC:29 USER SHOULD BE SEND NUMERICAL AND CHARACTERS");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "USER SHOULD BE SEND NUMERICAL AND CHARACTERS");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// characters in city cont find
		try {
			String citycantfindcharaexcel = Excelreader.getData(0, 55, 5);
			String citycontfindsendcharhead = page.cityvaluemethod1(citycantfindcharaexcel);
			if (citycontfindsendcharhead.equals(citycantfindcharaexcel)) {
				test.pass("TC:30 USER SHOULD BE SEND CHARACTERS");
			} else {
				test.fail("TC:30 USER SHOULD BE SEND CHARACTERS");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "USER SHOULD BE SEND CHARACTERS");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// select drop down value in state
		try {
			String statecontfindlabelhead = page.statecontfindlabelmethod3();
			String statecontfindselectedvalexcel1 = Excelreader.getData(0, 59, 5);
			if (statecontfindlabelhead.equals(statecontfindselectedvalexcel1)) {
				test.pass("TC:31 STATE FUNCTION SHOULD BE CLICKABLE ");
				String statecontfindselectedvalhead = page.statecontfindsendedvaluemethod();
				String statecontfindselectedvalexcel = Excelreader.getData(0, 59, 5);
				if (statecontfindselectedvalhead.equals(statecontfindselectedvalexcel)) {
					test.pass("TC:31 USER SHOULD BE SELECT DROP DOWN VALUE");
				} else {
					test.fail("TC:31 USER SHOULD BE SELECT DROP DOWN VALUE");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
							+ "USER SHOULD BE SELECT DROP DOWN VALUE");
				}
			} else {
				test.fail("TC:31 STATE FUNCTION SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "STATE FUNCTION SHOULD BE CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// CHARACTERS IN POPULAR LAND MARK
		try {
			String popularlandmarksendCHARexcel = Excelreader.getData(0, 63, 5);
			String popularlandmarksendCHARhead = page.popularlandmarksendatttmethod1(popularlandmarksendCHARexcel);
			if (popularlandmarksendCHARhead.equals(popularlandmarksendCHARexcel)) {
				test.pass("TC:19 USER SHOULD NOT BE SEND CHARACTERS IN POPULAR LAND MARK...TEXT");
			} else {
				test.fail("TC:19 USER SHOULD NOT BE SEND CHARACTERS IN POPULAR LAND MARK...TEXT");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "USER SHOULD NOT BE SEND CHARACTERS IN POPULAR LAND MARK...TEXT");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// select drop down value IN MONTH FUNCTION
		try {
			String visitdatemothsendvalue1head = page.visitdatemothsendvaluemethod1();
			String visitdatemothsendvalexcel1 = Excelreader.getData(0, 67, 5);
			if (visitdatemothsendvalue1head.equals(visitdatemothsendvalexcel1)) {
				test.pass("TC:21 MONTH FUNCTION SHOULD BE CLICKABLE");
				String visitdatemothsendvalhead = page.visitdatemothsendvaluemethod();
				String visitdatemothsendvalexcel = Excelreader.getData(0, 67, 5);
				if (visitdatemothsendvalhead.equals(visitdatemothsendvalexcel)) {
					test.pass("TC:21 USER SHOULD BE SELECT DROP DOWN VALUE IN MONT FUNTION");
				} else {
					test.fail("TC:21 USER SHOULD BE SELECT DROP DOWN VALUE IN MONT FUNTION");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
							+ "21 USER SHOULD BE SELECT DROP DOWN VALUE IN MONT FUNTION");
				}
			} else {
				test.fail("TC:21 MONTH FUNCTION SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "MONTH FUNCTION SHOULD BE CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// select day after select month
		try {

			String daysendedvaluehead = page.daysendedvaluemethodafter1();
			String daysendedvalueexcel = Excelreader.getData(0, 70, 5);
			if (daysendedvaluehead.equals(daysendedvalueexcel)) {
				test.pass("TC:35 DAY DROP DOWN FUNCTION SHOULD BE CLICKABLE");
				String daysendedvaluehead1 = page.daysendedvaluemethodafter2();
				String daysendedvalueexcel1 = Excelreader.getData(0, 70, 5);
				if (daysendedvaluehead1.equals(daysendedvalueexcel1)) {
					test.pass("TC:35 USER SHOULD BE SELECT DROPW DOWN VALUE IN DAY FUNCTION");
				} else {
					test.fail("TC:35 USER SHOULD BE SELECT DROPW DOWN VALUE IN DAY FUNCTION");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
							+ "USER SHOULD BE SELECT DROPW DOWN VALUE IN DAY FUNCTION");
				}

			} else {
				test.fail("TC:35 DAY DROP DOWN FUNCTION SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "DAY DROP DOWN FUNCTION SHOULD BE CLICKABLE");
			}
		} catch (Exception e1) {
			test.fail("Error:" + e1.getMessage());
		}
		// SELECT YEAT AFTER SELECT MONTH
		try {
			String yearsendedvaluemethodafterhead = page.yearsendedvaluemethodafter();
			String yearsendedvaluemethodafterexcel = Excelreader.getData(0, 71, 5);
			if (yearsendedvaluemethodafterhead.equals(yearsendedvaluemethodafterexcel)) {
				test.pass("TC:35 YEAR DROP DOWN FUNCTION SHOULD BE CLICKABLE");
				String yearsendedvaluemethodafter1head = page.yearsendedvaluemethodafter1();
				String yearsendedvaluemethodafter1excel = Excelreader.getData(0, 71, 5);
				if (yearsendedvaluemethodafter1head.equals(yearsendedvaluemethodafter1excel)) {
					test.pass("TC:35 USER SHOULD BE SELECT DROPW DOWN VALUE IN YEAR FUNCTION");
				} else {
					test.fail("TC:35 USER SHOULD BE SELECT DROPW DOWN VALUE IN YEAR FUNCTION");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
							+ "USER SHOULD BE SELECT DROPW DOWN VALUE IN YEAR FUNCTION");
				}

			} else {
				test.fail("TC:35 YEAR DROP DOWN FUNCTION SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "YEAR DROP DOWN FUNCTION SHOULD BE CLICKABLE");
			}
		} catch (Exception e1) {
			test.fail("Error:" + e1.getMessage());
		}

		// click and select the time
		try {
			String timedropdown1215head = page.timedropdown1215method();
			String timedropdown1215excel = Excelreader.getData(0, 75, 5);
			if (timedropdown1215head.equals(timedropdown1215excel)) {
				test.pass("TC:39 TIME FUNCTION SHOULD BE CLICKABLE");
				String timeselect12displayedhead = page.timetext12displayedmethod4();
				String timeselect12displayedexcel = Excelreader.getData(0, 75, 5);
				if (timeselect12displayedhead.equals(timeselect12displayedexcel)) {
					test.pass("TC:39 USER SHOULD BE SELECT TIME OF DROP DOWN VALUE");
				} else {
					test.fail("TC:39 USER SHOULD BE SELECT TIME OF DROP DOWN VALUE");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
							+ "USER SHOULD BE SELECT TIME OF DROP DOWN VALUE");
				}

			} else {
				test.fail("TC:39 TIME FUNCTION SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "TIME FUNCTION SHOULD BE CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// click drop down am value
		try {
			String AMdropdownvaluhead = page.AMdropdownvalumethod();
			String AMdropdownvaluexcel = Excelreader.getData(0, 78, 5);
			if (AMdropdownvaluhead.equals(AMdropdownvaluexcel)) {
				test.pass("TC:40 AM/PM FUNCTION SHOULD BE CLICKABLE");
				String amtextdisplayedhead = page.pmvaluedisplayedmethod();
				String amtextdisplayedexcel = Excelreader.getData(0, 78, 5);
				if (amtextdisplayedhead.equals(amtextdisplayedexcel)) {
					test.pass("TC:40 USER ABLE TO SELECT DROP DOWN VALUE OF AM/PM FUNCTION");
				} else {
					test.fail("TC:40 USER NOT ABLE TO SELECT DROP DOWN VALUE OF AM/PM FUNCTION");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
							+ "USER NOT ABLE TO SELECT DROP DOWN VALUE OF AM/PM FUNCTION");
				}
			} else {
				test.fail("TC:40 AM/PM FUNCTION SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "AM/PM FUNCTION SHOULD BE CLICKABLE");
			}
		} catch (Exception e) {

		}*/
		/*// DRIVE thru radio button after selected
		try {
			String drivethruradiobuttonisselectedheadd = page.driveradiobuttonselectedmethod();
			if (drivethruradiobuttonisselectedheadd.equals("true")) {
				test.pass("TC:41 DRIVE THRU TADIO BUTTON SHOULD BE CLICKABLE");
			} else {
				test.fail("TC:41 DRIVE THRU TADIO BUTTON SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "DRIVE THRU TADIO BUTTON SHOULD BE CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}*/
		
		//Restaurant locator		
				try {
					String zipcityhead = page.zipcitymethod();
					String zipcityexcel = Excelreader.getData(0, 34, 5);
					if (!zipcityhead.equalsIgnoreCase("")) {
						test.pass("TC:8 RESTAURANT LOCATER BUTTON IS WORKING");
						// SEND ZIP CODE
						try {
							String zipvalexcel = Excelreader.getData(0, 39, 5);
							String zipvalhead = page.zipenteredvalmethod(zipvalexcel);
							if (zipvalhead.equalsIgnoreCase(zipvalexcel)) {
								test.pass("TC:11  USER ABLE TO SEND ZIP CODE");
								// CLICK ON SEARCH
								try {
									String readd335 = page.restaurantaddressmethod();
									if (!readd335.equalsIgnoreCase("")) {
										test.pass("TC:12 SEARCH BUTTON IS WORKING AND RESTAURANT LOCATION ALSO IS DISPLAYED");

										
										// click on select restaurant button
										try {
											String restaurantbuttonclickhead = page.restaurantbuttonclickmethod();
											String restaurantbuttonclickexcel = Excelreader.getData(0, 35, 6);
											if (restaurantbuttonclickhead.equalsIgnoreCase("")) {
												test.pass("TC:14 THE 'SELECT RESTAURANT' BUTTON IS WORKING");
											} else {
												test.fail("TC:14 THE 'SELECT RESTAURANT' BUTTON IS WORKING");
												test.fail(test.addScreenCaptureFromPath(
														Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
														+ "THE 'SELECT RESTAURANT' BUTTON IS WORKING");
											}
										} catch (Exception e) {
											test.fail("Error:" + e.getMessage());
										}
									} else {
										test.fail(
												"TC:12 SEARCH BUTTON IS NOT WORKING AND RESTAURANT LOCATION ALSO IS NOT DISPLAYED");
										test.fail(test.addScreenCaptureFromPath(
												Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
												+ "SEARCH BUTTON IS NOT WORKING  AND RESTAURANT LOCATION ALSO IS NOT DISPLAYED");
									}
								} catch (Exception e) {
									test.fail("Error:" + e.getMessage());
								}

							} else {
								test.fail("TC:11 USER NOT ABLE TO SEND ZIP CODE");
								test.fail(
										test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
												+ "USER NOT ABLE TO SEND ZIP CODE");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}
					} else if (zipcityhead.equalsIgnoreCase(zipcityexcel)) {

						test.fail("TC:8 RESTAURANT LOCATER BUTTON IS NOT WORKING");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
								+ "RESTAURANT LOCATER BUTTON IS NOT WORKING");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// CHARACTERS IN POPULAR LAND MARK
				try {
					String popularlandmarksendCHARexcel = Excelreader.getData(0, 63, 5);
					String popularlandmarksendCHARhead = page.popularlandmarksendatttmethod1(popularlandmarksendCHARexcel);
					if (popularlandmarksendCHARhead.equals(popularlandmarksendCHARexcel)) {
						test.pass("TC:19 USER SHOULD NOT BE SEND CHARACTERS IN POPULAR LAND MARK...TEXT");
					} else {
						test.fail("TC:19 USER SHOULD NOT BE SEND CHARACTERS IN POPULAR LAND MARK...TEXT");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
								+ "USER SHOULD NOT BE SEND CHARACTERS IN POPULAR LAND MARK...TEXT");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				/*// select drop down value IN MONTH FUNCTION
				try {
					String visitdatemothsendvalue1head = page.visitdatemothsendvaluemethod1();
					String visitdatemothsendvalexcel1 = Excelreader.getData(0, 67, 5);
					if (visitdatemothsendvalue1head.equals(visitdatemothsendvalexcel1)) {
						test.pass("TC:21 MONTH FUNCTION SHOULD BE CLICKABLE");
						String visitdatemothsendvalhead = page.visitdatemothsendvaluemethod();
						String visitdatemothsendvalexcel = Excelreader.getData(0, 67, 5);
						if (visitdatemothsendvalhead.equals(visitdatemothsendvalexcel)) {
							test.pass("TC:21 USER SHOULD BE SELECT DROP DOWN VALUE IN MONT FUNTION");
						} else {
							test.fail("TC:21 USER SHOULD BE SELECT DROP DOWN VALUE IN MONT FUNTION");
							test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
									+ "21 USER SHOULD BE SELECT DROP DOWN VALUE IN MONT FUNTION");
						}
					} else {
						test.fail("TC:21 MONTH FUNCTION SHOULD BE CLICKABLE");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
								+ "MONTH FUNCTION SHOULD BE CLICKABLE");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// select day after select month
				try {

					String daysendedvaluehead = page.daysendedvaluemethodafter1();
					String daysendedvalueexcel = Excelreader.getData(0, 70, 5);
					if (daysendedvaluehead.equals(daysendedvalueexcel)) {
						test.pass("TC:35 DAY DROP DOWN FUNCTION SHOULD BE CLICKABLE");
						String daysendedvaluehead1 = page.daysendedvaluemethodafter2();
						String daysendedvalueexcel1 = Excelreader.getData(0, 70, 5);
						if (daysendedvaluehead1.equals(daysendedvalueexcel1)) {
							test.pass("TC:35 USER SHOULD BE SELECT DROPW DOWN VALUE IN DAY FUNCTION");
						} else {
							test.fail("TC:35 USER SHOULD BE SELECT DROPW DOWN VALUE IN DAY FUNCTION");
							test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
									+ "USER SHOULD BE SELECT DROPW DOWN VALUE IN DAY FUNCTION");
						}

					} else {
						test.fail("TC:35 DAY DROP DOWN FUNCTION SHOULD BE CLICKABLE");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
								+ "DAY DROP DOWN FUNCTION SHOULD BE CLICKABLE");
					}
				} catch (Exception e1) {
					test.fail("Error:" + e1.getMessage());
				}
				// SELECT YEAT AFTER SELECT MONTH
				try {
					String yearsendedvaluemethodafterhead = page.yearsendedvaluemethodafter();
					String yearsendedvaluemethodafterexcel = Excelreader.getData(0, 71, 5);
					if (yearsendedvaluemethodafterhead.equals(yearsendedvaluemethodafterexcel)) {
						test.pass("TC:35 YEAR DROP DOWN FUNCTION SHOULD BE CLICKABLE");
						String yearsendedvaluemethodafter1head = page.yearsendedvaluemethodafter1();
						String yearsendedvaluemethodafter1excel = Excelreader.getData(0, 71, 5);
						if (yearsendedvaluemethodafter1head.equals(yearsendedvaluemethodafter1excel)) {
							test.pass("TC:35 USER SHOULD BE SELECT DROPW DOWN VALUE IN YEAR FUNCTION");
						} else {
							test.fail("TC:35 USER SHOULD BE SELECT DROPW DOWN VALUE IN YEAR FUNCTION");
							test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
									+ "USER SHOULD BE SELECT DROPW DOWN VALUE IN YEAR FUNCTION");
						}

					} else {
						test.fail("TC:35 YEAR DROP DOWN FUNCTION SHOULD BE CLICKABLE");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
								+ "YEAR DROP DOWN FUNCTION SHOULD BE CLICKABLE");
					}
				} catch (Exception e1) {
					test.fail("Error:" + e1.getMessage());
				}*/

				/*// click and select the time
				try {
					String timedropdown1215head = page.timedropdown1215method();
					String timedropdown1215excel = Excelreader.getData(0, 75, 5);
					if (timedropdown1215head.equals(timedropdown1215excel)) {
						test.pass("TC:39 TIME FUNCTION SHOULD BE CLICKABLE");
						String timeselect12displayedhead = page.timetext12displayedmethod4();
						String timeselect12displayedexcel = Excelreader.getData(0, 75, 5);
						if (timeselect12displayedhead.equals(timeselect12displayedexcel)) {
							test.pass("TC:39 USER SHOULD BE SELECT TIME OF DROP DOWN VALUE");
						} else {
							test.fail("TC:39 USER SHOULD BE SELECT TIME OF DROP DOWN VALUE");
							test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
									+ "USER SHOULD BE SELECT TIME OF DROP DOWN VALUE");
						}

					} else {
						test.fail("TC:39 TIME FUNCTION SHOULD BE CLICKABLE");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
								+ "TIME FUNCTION SHOULD BE CLICKABLE");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// click drop down am value
				try {
					String AMdropdownvaluhead = page.AMdropdownvalumethod();
					String AMdropdownvaluexcel = Excelreader.getData(0, 78, 5);
					if (AMdropdownvaluhead.equals(AMdropdownvaluexcel)) {
						test.pass("TC:40 AM/PM FUNCTION SHOULD BE CLICKABLE");
						String amtextdisplayedhead = page.pmvaluedisplayedmethod();
						String amtextdisplayedexcel = Excelreader.getData(0, 78, 5);
						if (amtextdisplayedhead.equals(amtextdisplayedexcel)) {
							test.pass("TC:40 USER ABLE TO SELECT DROP DOWN VALUE OF AM/PM FUNCTION");
						} else {
							test.fail("TC:40 USER NOT ABLE TO SELECT DROP DOWN VALUE OF AM/PM FUNCTION");
							test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
									+ "USER NOT ABLE TO SELECT DROP DOWN VALUE OF AM/PM FUNCTION");
						}
					} else {
						test.fail("TC:40 AM/PM FUNCTION SHOULD BE CLICKABLE");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
								+ "AM/PM FUNCTION SHOULD BE CLICKABLE");
					}
				} catch (Exception e) {

				}*/
				// DRIVE thru radio button after selected
				try {
					String drivethruradiobuttonisselectedheadd = page.driveradiobuttonselectedmethod();
					if (drivethruradiobuttonisselectedheadd.equals("true")) {
						test.pass("TC:41 DRIVE THRU TADIO BUTTON SHOULD BE CLICKABLE");
					} else {
						test.fail("TC:41 DRIVE THRU TADIO BUTTON SHOULD BE CLICKABLE");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
								+ "DRIVE THRU TADIO BUTTON SHOULD BE CLICKABLE");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());

				}

				
		// CHARACTERS VALUES IN FIRST NAME FUNCTION
		try {
			String firstnamesendvalexcel = Excelreader.getData(0, 86, 5);
			String sendedvalhead = page.finameEnteredvalue1(firstnamesendvalexcel);
			if (sendedvalhead.equals(firstnamesendvalexcel)) {
				test.pass("TC:46  USE SHOULD  BE SEND CHARACTERS  IN FIRSTNAME TEXTBOX");
			} else {
				test.fail("TC:46  USE SHOULD BE SEND CHARACTERS IN FIRSTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "USE SHOULD  BE SEND CHARACTERS IN FIRSTNAME TEXTBOX");
			}
		} catch (Exception e) {

			test.fail("Error:" + e.getMessage());
		}

		// CHARACTERS IN LAST NAME FUNCTION

		try {
			String LNSPECIALCHARACTER = Excelreader.getData(0, 92, 5);
			String LAscvalue = page.lastnameenterdvalue1(LNSPECIALCHARACTER);
			if (LAscvalue.equals(LNSPECIALCHARACTER)) {
				test.pass("TC:47 USER SHOULD BE SEND CHARACTERS IN LASTNAME TEXTBOX");
			} else {
				test.fail("TC:47 USER SHOULD BE SEND CHARACTERS IN LASTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "USER SHOULD  BE SEND CHARACTERS IN LASTNAME TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// SEND WITH MAIL FORMAT
		try {
			String emailsendid = Excelreader.getData(0, 98, 5);
			String emailvlue = page.emailenteredvalue(emailsendid);
			if (emailvlue.equalsIgnoreCase(emailsendid)) {
				test.pass("TC:33.5  USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
			} else {
				test.fail("TC:33.5 USER SHOULD SEND MAIL WITH FORMAT IN MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "USER SHOULD SEND MAIL WITH FORMAT IN MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send DIFFERENT IDS IN mail AND CONFIRM
		try {
			String confirmmailsend = Excelreader.getData(0, 102, 5);
			String conmailsendvalue = page.confirmmailenteredvalue(confirmmailsend);
			if (conmailsendvalue.equals(confirmmailsend)) {
				test.pass("TC:55  USER SHOULD SEND MAIL IN CONFIRM MAIL TEXTBOX");
			} else {
				test.fail("TC:55 USER SHOULD SEND MAIL IN CONFIRM MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "USER SHOULD SEND MAIL IN CONFIRM MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ENTER 10 NUMERICAL
		try {
			String phonecharacterhead = Excelreader.getData(0, 109, 5);
			String phonenumCenteredval = page.phonenumberenteredvalue(phonecharacterhead);
			if (phonenumCenteredval.equals(phonecharacterhead)) {
				test.pass("TC:56 USER SHOULD  SEND 10 NUMERICAL IN PHONE NUMBER TEXTBOX ");
			} else {
				test.fail("TC:56 USER SHOULD  SEND 10 NUMERICAL IN PHONE NUMBER TEXTBOX ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "USER SHOULD SEND 10 NUMERICAL IN PHONE NUMBER TEXTBOX ");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// click on submit
		try {
			String gettitle = page.generallgetpagetitlemethodpage();
			String gettitleexcel = Excelreader.getData(0, 124, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC: SUBMIT BUTTON IS WORKING FINE AND ENABEL");
				test.pass("TC: MOBILE APP FEEDBACK FORM IS SUBMITTED SUCCESSFULLY ");
			} else {
				test.fail("TC:  MOBILE APP FEEDBACK FORM IS NOT SUBMITTED SUCCESSFULLY");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ " MOBILE APP FEEDBACK FORM IS NOT SUBMITTED SUCCESSFULLY");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}	
	
	@Test(priority = 4)
	public void Gmaapp_Franchising_Positive_Scenario() {
		Franchising_Form_page page = new Franchising_Form_page(driver);
		test = extent.createTest("Franchising_Positive_Scenario");
		String excelpath = System.getProperty("user.dir");
		TestUtil Excelreader = new TestUtil(excelpath + "/src/main/java/com/McD/qa/TestData/Franchising_Form.xls");
		try {
			driver.get(Basepage.readProperty("urlFG"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("------- FRANCHISING FORM POSITIVE SCENARIOS--------");
				test.pass("TC:1 URL IS OPENED");
			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
							+ "USER SHOULD BE SELECTED STATE DROP DOWN VALUE");
				}
			} else {
				test.fail("TC:15 THE LABEL 'STATE' IS ROLLED UP AFTER CLICK ON STATE FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "YES RADIO BUTTON SHOULD BE CLICKABLE ON WOULD YOU BE WILLING TO RELOCATE FOR A RESTAURANT OPPORTUNITY?.");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// rural check box click
		try {
			String ruralcheckboxhead = page.ruralcheckboxmethod1();
			
			if (!ruralcheckboxhead.equals("")) {
				test.pass("TC:44 CHECK BOX SHOULD BE CLICKABLE  IN RURAL (POPULATION 0-2,500)");
			} else {
				test.fail("TC:44 CHECK BOX SHOULD BE CLICKABLE IN RURAL (POPULATION 0-2,500)");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "RADIO BUTTON SHOULD BE CLICKABLE IN ONLINE/WEBSITE FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// I AGREE CHECK BOX CLICK
		try {
			String iagreecheckboxhead = page.iagreecheckboxmethod1();
			if (!iagreecheckboxhead.equals("")) {
				test.pass("TC:48 CHECK BOX SHOULD BE CLICKABLE IN 'I AGREE' FUNCTION");
			} else {
				test.fail("TC:48 CHECK BOX SHOULD BE CLICKABLE IN 'I AGREE' FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "THANKS TEST PAGE OF FRANCHISIING FORM IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}	

	@Test(priority = 5)
	public void Gmaapp_Trademark_Permission_Positive_scenario() {
		Core_Trademark_Permission_page page = new Core_Trademark_Permission_page(driver);
		test = extent.createTest("Trademark_Permission_Positive_scenario");
		String excelptha = System.getProperty("user.dir");
		TestUtil Excelreader = new TestUtil(excelptha + "/src/main/java/com/McD/qa/TestData/Core_Trademark_permission.xlsx");
		try {
			driver.get(Basepage.readProperty("urlTG"));

			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 6);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");
			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
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
		// please select any drop down value
		try {
			String pleaseselectdropdownvaluehead = page.pleaseselectdropdownvaluemethod12p();
			String pleaseselectdropdownvalueexcel = Excelreader.getData(0, 19, 5);
			if (pleaseselectdropdownvaluehead.equals(pleaseselectdropdownvalueexcel)) {
				test.pass("TC:15 PLEASE SELECT ANY ONE OPTION DROP DOWN FUNCTION IS CLICKABLE");
			} else {
				test.fail("TC:15 PLEASE SELECT ANY ONE OPTION DROP DOWN FUNCTION IS NOT CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "PLEASE SELECT ANY ONE OPTION DROP DOWN FUNCTION IS NOT CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// SEND CHARACTER AND NUMERICAL ON FUNCTION OF ENTER YOU COMMENTS
		try {
			String entercommentcharnumericalexcel = Excelreader.getData(0, 23, 5);
			String entercommentcharnumericalhead = page.entercommentsendedvaluemethod(entercommentcharnumericalexcel);
			if (entercommentcharnumericalhead.equals(entercommentcharnumericalexcel)) {
				test.pass("TC:17 USER SHOULD  BE SEND NUMERICAL AND CHARACTER ON FUNCTION OF ENTER YOU COMMENTS");

			} else {
				test.fail("TC:17 USER SHOULD  BE SEND NUMERICAL AND CHARACTER ON FUNCTION OF ENTER YOU COMMENTS");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD  BE SEND NUMERICAL AND CHARACTER ON FUNCTION OF ENTER YOU COMMENTS");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send character, special character and numerical ON FUNCTION OF HOW WILL IT BE
		// USED
		try {
			String howwillitbesendvalueexcel = Excelreader.getData(0, 27, 5);
			String howwillitbesendvaluehead = page.howwillitbesendedvaluemethod1(howwillitbesendvalueexcel);
			if (howwillitbesendvaluehead.equals(howwillitbesendvalueexcel)) {
				test.pass(
						"TC:18 USER SHOULD BE SEND SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON HOW WILL IT BE USED FUNCTION");

			} else {
				test.fail(
						"TC:18 USER SHOULD BE SEND SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON HOW WILL IT BE USED FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD BE SEND SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON HOW WILL IT BE USED FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send character, special character and numerical ON WHATIS THE INTENTED
		// AUDIENCE FUNCTION
		try {
			String whatisintentedsendedexcel = Excelreader.getData(0, 31, 5);
			String whatisintentedsendedhead = page.whatisintentedsendedvaluemethod1(whatisintentedsendedexcel);
			if (whatisintentedsendedhead.equals(whatisintentedsendedexcel)) {
				test.pass(
						"TC:19 USER SHOULD BE SEND SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON WHAT IS INTENTED AUDIENCE");

			} else {
				test.fail(
						"TC:19 USER SHOULD BE SEND SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON WHAT IS INTENTED AUDIENCE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD BE SEND SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON WHAT IS INTENTED AUDIENCE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send character, special character and numerical ON HOW LONG WILL IT BE USED
		try {
			String howlongwillsendedvalueexcel = Excelreader.getData(0, 35, 5);
			String howlongwillsendedvaluehead = page.howlongwillsendedvaluemethod1(howlongwillsendedvalueexcel);
			if (howlongwillsendedvaluehead.equals(howlongwillsendedvalueexcel)) {
				test.pass(
						"TC:20 USER SHOULD BE SEND SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON HOW LONG WILL IT BE USED");

			} else {
				test.fail(
						"TC:20 USER SHOULD BE SEND SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON HOW LONG WILL IT BE USED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD BE SEND SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON HOW LONG WILL IT BE USED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// yes radio button after click ON HAVE YOU PREVIOUSLY REQUESTED FUNCTION
		try {
			boolean yesadiobuttonbydefaultselectedhead = page.yesadiobuttonbydefaultselectedmethod1();
		 if (yesadiobuttonbydefaultselectedhead == true) { 
				test.pass("TC:21 YES TADIO BUTTON SHOULD BE CLICKABLE");
			} else {
				test.fail("TC:21 YES TADIO BUTTON SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "YES TADIO BUTTON SHOULD BE CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// select day after select month daydropdownvalumethod2
		try {
			String visitdatemothsendvalue1head = page.whenwasmonthlabelmethod21();
			String visitdatemothsendvalexcel1 = Excelreader.getData(0, 44, 5);
			if (visitdatemothsendvalue1head.equals(visitdatemothsendvalexcel1)) {
				test.pass("TC:23 USER SHOULD BE SELECT DROP DOWN VALUE IN MONT FUNTION");
			} else {
				test.fail("TC:23 USER SHOULD BE SELECT DROP DOWN VALUE IN MONT FUNTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD BE SELECT DROP DOWN VALUE IN MONT FUNTION");
			}}catch (Exception e) {
				test.fail("Error:" + e.getMessage());
			}
				// day function
				try {
				String daydropdownvaluhead = page.daydropdownvalumethod12();
				String daydropdownvaluexcel = Excelreader.getData(0, 48, 5);
				if (daydropdownvaluhead.equals(daydropdownvaluexcel)) {
					test.pass("TC:24 DAY FUNCTION IS CLICKABLE");
				} else {
					test.fail("TC:24 DAY FUNCTION IS NOT CLICKABLE");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
							+ "DAY FUNCTION IS NOT CLICKABLE");
				}}catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// year function
				try {
				String yeardropdownvalhead = page.yeardropdownvalmethod1();
				String yeardropdownvalexcel = Excelreader.getData(0, 49, 5);
				if (yeardropdownvalhead.equals(yeardropdownvalexcel)) {
					test.pass("TC:25 YEAR FUNCTION IS CLICKABLE");
				} else {
					test.fail("TC:25 YEAR FUNCTION IS NOT CLICKABLE");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
							+ "YEAR FUNCTION IS NOT CLICKABLE");
				}
			
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// click granted RADIO BUTTON on what was the out come function
		try {
			String grantedradiobuttonhead = page.clcikgrantedradiobuttonmethod();
			if (grantedradiobuttonhead.equals("true")) {
				test.pass("TC:26 GRANTED RADIO BUTTON SHOULD BE CLICKABLE");
			} else {
				test.fail("TC:26  GRANTED RADIO BUTTON SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ " GRANTED RADIO BUTTON SHOULD BE CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// SEND CHARACTERS, SPECIAL CHARACTERS AND NUMERICAL on author book publication
		// function
		try {
			String authorsendvalueexcel = Excelreader.getData(0, 59, 5);
			String authorsendvaluehead = page.authorsendvaluemethod(authorsendvalueexcel);
			if (authorsendvaluehead.equals(authorsendvalueexcel)) {
				test.pass("TC:28 USER SHOULD BE SEND SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON AUTHOR FUNCTION");

			} else {
				test.fail("TC:28 USER SHOULD BE SEND SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON AUTHOR FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD BE SEND SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON AUTHOR FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// SEND CHARACTERS, SPECIAL CHARACTERS AND NUMERICAL on publisher book
		// publication function
		try {
			String publishersendedvalueexcel = Excelreader.getData(0, 63, 5);
			String publishersendedvaluehead = page.publishersendvaluemethod(publishersendedvalueexcel);
			if (publishersendedvaluehead.equals(publishersendedvalueexcel)) {
				test.pass("TC:29 USER SHOULD BE SEND SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON PUBLISHER FUNCTION");

			} else {
				test.fail("TC:29 USER SHOULD BE SEND SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON PUBLISHER FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD BE SEND SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON PUBLISHER FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// SEND CHARACTERS, SPECIAL CHARACTERS AND NUMERICAL on publication function
		try {
			String publicationsendedvalhead = Excelreader.getData(0, 67, 5);
			String publicationsendedvalexcel = page.publicationsendedvalmethod(publicationsendedvalhead);
			if (publicationsendedvalhead.equals(publicationsendedvalexcel)) {
				test.pass(
						"TC:30 USER SHOULD BE SEND SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON PUBLICATION FUNCTION");

			} else {
				test.fail(
						"TC:30 USER SHOULD BE SEND SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON PUBLICATION FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD BE SEND SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON PUBLICATION FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// CHARACTERS VALUES IN FIRST NAME FUNCTION
		try {
			String firstnamesendvalexcel = Excelreader.getData(0, 80, 5);
			String sendedvalhead = page.firstnamesendedvaluemethod(firstnamesendvalexcel);
			if (sendedvalhead.equals(firstnamesendvalexcel)) {
				test.pass("TC:40  USE SHOULD  BE SEND CHARACTERS  IN FIRSTNAME TEXTBOX");
			} else {
				test.fail("TC:40  USE SHOULD BE SEND CHARACTERS IN FIRSTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USE SHOULD  BE SEND CHARACTERS IN FIRSTNAME TEXTBOX");
			}
		} catch (Exception e) {

			test.fail("Error:" + e.getMessage());
		}
		// CHARACTERS IN LAST NAME FUNCTION

		try {
			String LNSPECIALCHARACTER = Excelreader.getData(0, 86, 5);
			String LAscvalue = page.LNsendvaluemethod(LNSPECIALCHARACTER);
			if (LAscvalue.equals(LNSPECIALCHARACTER)) {
				test.pass("TC:41 USER SHOULD BE SEND CHARACTERS IN LASTNAME TEXTBOX");
			} else {
				test.fail("TC:41 USER SHOULD BE SEND CHARACTERS IN LASTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD  BE SEND CHARACTERS IN LASTNAME TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// NUMARICAL AND CHARACTERS SEND IN ADDRESS US(ONLY) function

		try {
			String addressspecharacterhead = Excelreader.getData(0, 91, 5);
			String adsccnvalue = page.addresssendedvaluemethod(addressspecharacterhead);
			if (adsccnvalue.equals(addressspecharacterhead)) {
				test.pass("TC:42 USER SHOULD  SEND NUMARICAL AND CHARACTERS IN ADDRESS TEXTBOX");
			} else {
				test.fail("TC:42 USER SHOULD SEND NUMARICAL AND CHARACTERS IN ADDRESS TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD  SEND NUMARICAL AND CHARACTERS IN ADDRESS TEXTBOX");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// NUMARICAL AND CHARACTERS IN APT SUITE
		try {
			String apisuitespecialcharecter = Excelreader.getData(0, 96, 5);
			String suitesh = page.aptsuitesendedvaluermethod(apisuitespecialcharecter);
			if (suitesh.equals(apisuitespecialcharecter)) {
				test.pass("TC:43 USER SHOULD SEND NUMARICAL AND CHARACTERS IN APT/SUITE TEXTBOX");
			} else {
				test.fail("TC:43 USER SHOULD  SEND NUMARICAL AND CHARACTERS IN APT/SUITE TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD  SEND NUMARICAL AND CHARACTERS IN APT/SUITE TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// CHARACTERS on city function
		try {
			String citycharactersexcel = Excelreader.getData(0, 101, 5);
			String citySCenteredvalue = page.citysendedvaluemethod(citycharactersexcel);
			if (citySCenteredvalue.equals(citycharactersexcel)) {
				test.pass("TC:44 USER SHOULD  SEND CHARACTERS IN CITY TEXTBOX");
			} else {
				test.fail("TC:44 USER SHOULD SEND CHARACTERS IN CITY TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD SEND CHARACTERS IN CITY TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK ON STATE AND LABEL IS ROLLED UP OR NOT
		try {
				// select drop down values of state function
				String statedropdownvaluehead = page.stateselecteddropdownvalmethod1();
				String statedropdownvalueEXCEL = Excelreader.getData(0, 106, 5);
				if (statedropdownvaluehead.equals(statedropdownvalueEXCEL)) {
					test.pass("TC:45 USER SHOULD BE SELECTED STATE DROP DOWN VALUE");
				} else {
					test.fail("TC:45 USER SHOULD BE SELECTED STATE DROP DOWN VALUE");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
							+ "USER SHOULD BE SELECTED STATE DROP DOWN VALUE");
				}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// NUMERICAL on zip code function

		try {
			String zipsendedvaluesexcel = Excelreader.getData(0, 110, 5);
			String zipsendedvalueshead = page.zipsendedvaluermethod(zipsendedvaluesexcel);
			if (zipsendedvalueshead.equals(zipsendedvaluesexcel)) {
				test.pass("TC:46 USER SHOULD ENTERD NUMERICAL IN ZIP TEXTBOX");
			} else {

				test.fail("TC:46 USER SHOULD ENTERD NUMERICAL IN ZIP TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD ENTERD NUMERICAL IN ZIP TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// SEND WITH MAIL FORMAT

		try {
			String emailsendid = Excelreader.getData(0, 117, 5);
			String emailvlue = page.mailsendmethod(emailsendid);
			if (emailvlue.equals(emailsendid)) {
				test.pass("TC:47  USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
			} else {
				test.fail("TC:47 USER SHOULD SEND MAIL WITH FORMAT IN MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD SEND MAIL WITH FORMAT IN MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send DIFFERENT IDS IN mail AND CONFIRM function
		try {
			String confirmmailsend = Excelreader.getData(0, 121, 5);
			String conmailsendvalue = page.confirmmailsendidmethod(confirmmailsend);
			if (conmailsendvalue.equals(confirmmailsend)) {
				test.pass("TC:48  USER SHOULD SEND MAIL IN CONFIRM MAIL TEXTBOX");
			} else {
				test.fail("TC:48 USER SHOULD SEND MAIL IN CONFIRM MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD SEND MAIL IN CONFIRM MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ENTER 10 NUMERICAL
		try {
			String phonecharacterhead = Excelreader.getData(0, 128, 5);
			String phonenumCenteredval = page.phonenumbersendmethod1(phonecharacterhead);
			if (phonenumCenteredval.equals(phonecharacterhead)) {
				test.pass("TC:49 USER SHOULD  SEND 10 NUMERICAL IN PHONE NUMBER TEXTBOX ");
			} else {
				test.fail("TC:49 USER SHOULD  SEND 10 NUMERICAL IN PHONE NUMBER TEXTBOX ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD SEND 10 NUMERICAL IN PHONE NUMBER TEXTBOX ");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// click on submit
		try {
			page.clickonsubmitmethod();// click submit button
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 152, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC: SUBMIT BUTTON IS WORKING FINE AND ENABEL");
				test.pass("TC: MOBILE APP FEEDBACK FORM IS SUBMITTED SUCCESSFULLY ");
			} else {
				test.fail("TC:  MOBILE APP FEEDBACK FORM IS NOT SUBMITTED SUCCESSFULLY");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ " MOBILE APP FEEDBACK FORM IS NOT SUBMITTED SUCCESSFULLY");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}
		

	@Test(priority = 6)
	public void Gmaapp_CCPA_Mcdonald_May_positive_scenario() {
		test = extent.createTest("CCPA_Mcdonald_May_positive_scenario");
		CCPA_Rights_Center_Page page = new CCPA_Rights_Center_Page(driver);
		String excelpath = System.getProperty("user.dir");
		TestUtil Excelreader = new TestUtil(excelpath + "/src/main/java/com/McD/qa/TestData/CCPA_Rights_Center.xls");
		try {
			driver.get(Basepage.readProperty("urlccpaG"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("----- CCPA McDONALD MAY NOT SELL POSITIVE SCENARIOS------");
				test.pass("TC:1 URL OF CCPA IS OPENED");
			} else {
				test.fail("TC:1 URL OF CCPA IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "NUMERICAL VALUE IS NOT ENTERED IN PHONE NUMBER TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// select MCDONALD'S MAY NOT SELL RADIO BUTTON radio button
		try {
			String mcdonaldsmaynotsellradiobuttonhead = page.mcdonaldsmaynotsellradiobuttonmethod1();
			if (mcdonaldsmaynotsellradiobuttonhead.equals("true")) {
				test.pass("TC:13.7 'McDONALD'S MAY NOT SELL..'  RADIO BUTTON SHOULD BE CLICKABLE");
			} else {
				test.fail("TC:13.7 'McDONALD'S MAY NOT SELL..' RADIO BUTTON SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ "McDONALD'S MAY NOT SELL.. RADIO BUTTON SHOULD BE CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// click on submit
		try {
			page.submitGEQ();// click submit button
			Thread.sleep(30000);
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 49, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC: CCPA FORM IS SUBMITTED SUCCESSFULLY ");
			} else {
				test.fail("TC:  CCPA FORM IS NOT SUBMITTED SUCCESSFULLY");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
						+ " CCPA FORM IS NOT SUBMITTED SUCCESSFULLY");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}
	
	@Test(priority = 7)
	public void Gmaapp_old_Restaurant_Feedback_Form_Positive_scenario() throws IOException {
		test = extent.createTest(" old_Restaurant_Feedback_Form_Positive_scenario");
		Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
		String excelpath = System.getProperty("user.dir");
		TestUtil Excelreader = new TestUtil(excelpath + "/src/main/java/com/McD/qa/TestData/old_restaurant_feedback.xls");
	
	try {
	driver.get(Basepage.readProperty("urlORG"));

	String gettitle = page.generallgetpagetitlemethod();
	String gettitleexcel = Excelreader.getData(0, 1, 6);
	if (gettitle.equals(gettitleexcel)) {
	test.pass("TC:1 URL IS OPENED");
	} else {
	test.fail("TC:1 URL IS NOT OPENED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
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
	//Restaurant locator		
			try {
				String zipcityhead = page.zipcitymethod();
				String zipcityexcel = Excelreader.getData(0, 12, 6);
				if (!zipcityhead.equalsIgnoreCase("")) {
					test.pass("TC:8 RESTAURANT LOCATER BUTTON IS WORKING");
					// SEND ZIP CODE
					try {
						String zipvalexcel = Excelreader.getData(0, 15, 6);
						String zipvalhead = page.zipenteredvalmethod(zipvalexcel);
						if (zipvalhead.equalsIgnoreCase(zipvalexcel)) {
							test.pass("TC:11  USER ABLE TO SEND ZIP CODE");
							// CLICK ON SEARCH
							try {
								String readd335 = page.restaurantaddressmethod();
								if (!readd335.equalsIgnoreCase("")) {
									test.pass("TC:12 SEARCH BUTTON IS WORKING AND RESTAURANT LOCATION ALSO IS DISPLAYED");

									
									// click on select restaurant button
									try {
										String restaurantbuttonclickhead = page.restaurantbuttonclickmethod();
										String restaurantbuttonclickexcel = Excelreader.getData(0, 14, 6);
										if (restaurantbuttonclickhead.equalsIgnoreCase("")) {
											test.pass("TC:14 THE 'SELECT RESTAURANT' BUTTON IS WORKING");
										} else {
											test.fail("TC:14 THE 'SELECT RESTAURANT' BUTTON IS WORKING");
											test.fail(test.addScreenCaptureFromPath(
													Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
													+ "THE 'SELECT RESTAURANT' BUTTON IS WORKING");
										}
									} catch (Exception e) {
										test.fail("Error:" + e.getMessage());
									}
								} else {
									test.fail(
											"TC:12 SEARCH BUTTON IS NOT WORKING AND RESTAURANT LOCATION ALSO IS NOT DISPLAYED");
									test.fail(test.addScreenCaptureFromPath(
											Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
											+ "SEARCH BUTTON IS NOT WORKING  AND RESTAURANT LOCATION ALSO IS NOT DISPLAYED");
								}
							} catch (Exception e) {
								test.fail("Error:" + e.getMessage());
							}

						} else {
							test.fail("TC:11 USER NOT ABLE TO SEND ZIP CODE");
							test.fail(
									test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
											+ "USER NOT ABLE TO SEND ZIP CODE");
						}
					} catch (Exception e) {
						test.fail("Error:" + e.getMessage());
					}
				} else if (zipcityhead.equalsIgnoreCase(zipcityexcel)) {

					test.fail("TC:8 RESTAURANT LOCATER BUTTON IS NOT WORKING");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
							+ "RESTAURANT LOCATER BUTTON IS NOT WORKING");
				}
			} catch (Exception e) {
				test.fail("Error:" + e.getMessage());
			}
	
	
	// CHARACTERS of popular land mark
	try {
	String popularlandmarksendCHARexcel = Excelreader.getData(0, 39, 6);
	String popularlandmarksendCHARhead = page.popularlandmarksendatttmethod(popularlandmarksendCHARexcel);
	if (popularlandmarksendCHARhead.equals(popularlandmarksendCHARexcel)) {
	test.pass("TC:19 USER SHOULD NOT BE SEND CHARACTERS IN POPULAR LAND MARK...TEXT");
	} else {
	test.fail("TC:19 USER SHOULD NOT BE SEND CHARACTERS IN POPULAR LAND MARK...TEXT");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
	+ "USER SHOULD NOT BE SEND CHARACTERS IN POPULAR LAND MARK...TEXT");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// select drop down value of visit month function
	try {
	String visitdatemothsendvalhead = page.visitdatemothsendvaluemethod1();
	String visitdatemothsendvalexcel = Excelreader.getData(0, 43, 6);
	if (visitdatemothsendvalhead.equals(visitdatemothsendvalexcel)) {
	test.pass("TC:21 USER SHOULD BE SELECT DROP DOWN VALUE IN MONT FUNTION");
	} else {
	test.fail("TC:21 USER SHOULD BE SELECT DROP DOWN VALUE IN MONT FUNTION");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
	+ "21 USER SHOULD BE SELECT DROP DOWN VALUE IN MONT FUNTION");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// selecct day drop down values

	try {
	String daysendedvaluehead = page.daysendedvaluemethod();
	String daysendedvalueexcel = Excelreader.getData(0, 47, 6);
	if (daysendedvaluehead.equals(daysendedvalueexcel)) {
	test.pass("TC:22 USE SHOULD BE SELECT 'DAY' AFTER SELECT MONTH");
	} else {
	test.fail("TC:22 USE SHOULD BE SELECT 'DAY' AFTER SELECT MONTH");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
	+ "USE SHOULD BE SELECT DAY AFTER SELECT MONTH");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// SELECT YEAT AFTER SELECT MONTH
	try {
	String yearsendedvaluehead = page.yearsendedvaluemethod();
	String yearsendedvalueexcel = Excelreader.getData(0, 48, 6);
	if (yearsendedvaluehead.equals(yearsendedvalueexcel)) {
	test.pass("TC:23 USE SHOULD BE SELECT 'YEAR' AFTER SELECT MONTH");
	} else {
	test.fail("TC:23 USE SHOULD BE SELECT 'YEAR' AFTER SELECT MONTH");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
	+ "USE SHOULD BE SELECT 'YEAR' AFTER SELECT MONTH");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// click and select the time

	try {
	String timeselect12displayedhead = page.timetext12displayedmethod1();
	String timeselect12displayedexcel = Excelreader.getData(0, 54, 6);
	if (timeselect12displayedhead.equals(timeselect12displayedexcel)) {
	test.pass("TC:26 USER SHOULD BE SELECT TIME OF DROP DOWN VALUE");
	} else {
	test.fail("TC:26 USER SHOULD BE SELECT TIME OF DROP DOWN VALUE");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
	+ "USER SHOULD BE SELECT TIME OF DROP DOWN VALUE");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// click drop down am value
	try {
	String amtextdisplayedhead = page.pmvaluedisplayedmethod1();
	String amtextdisplayedexcel = Excelreader.getData(0, 57, 6);
	if (amtextdisplayedhead.equals(amtextdisplayedexcel)) {
	test.pass("TC:27 USER ABLE TO SELECT DROP DOWN VALUE OF AM/PM FUNCTION");
	} else {
	test.fail("TC:27 USER NOT ABLE TO SELECT DROP DOWN VALUE OF AM/PM FUNCTION");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
	+ "USER NOT ABLE TO SELECT DROP DOWN VALUE OF AM/PM FUNCTION");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// DRIVE thru radio button after selected
	try {
	String drivethruradiobuttonisselectedheadd = page.driveradiobuttonselectedmethod();
	if (drivethruradiobuttonisselectedheadd.equals("true")) {
	test.pass("TC:28 DRIVE THRU TADIO BUTTON SHOULD BE CLICKABLE");
	} else {
	test.fail("TC:28 DRIVE THRU TADIO BUTTON SHOULD BE CLICKABLE");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
	+ "DRIVE THRU TADIO BUTTON SHOULD BE CLICKABLE");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());

	}
	// enter NUMARICAL AND characters on comments
	try {
	String commetspecialcharacterhexcel = Excelreader.getData(0, 63, 6);
	String commscenteredvalue = page.commententeredvalue(commetspecialcharacterhexcel);
	if (commscenteredvalue.equals(commetspecialcharacterhexcel)) {
	test.pass("TC:31 USE SHOUL BE SEND  NUMARICAL AND  CHARACTER IN COMMENT TEXT");
	} else {
	test.fail("TC:31 USE SHOUL BE SEND NUMARICAL AND CHARACTER IN COMMENT TEXT");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
	+ "USE SHOUL BE SEND NUMARICAL AND CHARACTER IN COMMENT TEXT");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// CHARACTERS VALUES IN FIRST NAME FUNCTION
	try {
	String firstnamesendvalexcel = Excelreader.getData(0, 70, 6);
	String sendedvalhead = page.finameEnteredvalue(firstnamesendvalexcel);
	if (sendedvalhead.equals(firstnamesendvalexcel)) {
	test.pass("TC:33  USE SHOULD  BE SEND CHARACTERS  IN FIRSTNAME TEXTBOX");
	} else {
	test.fail("TC:33  USE SHOULD BE SEND CHARACTERS IN FIRSTNAME TEXTBOX");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
	+ "USE SHOULD  BE SEND CHARACTERS IN FIRSTNAME TEXTBOX");
	}
	} catch (Exception e) {

	test.fail("Error:" + e.getMessage());
	}
	// CHARACTERS IN LAST NAME FUNCTION

	try {
	String LNSPECIALCHARACTER = Excelreader.getData(0, 76, 6);
	String LAscvalue = page.lastnameenterdvalue(LNSPECIALCHARACTER);
	if (LAscvalue.equals(LNSPECIALCHARACTER)) {
	test.pass("TC:34 USER SHOULD BE SEND CHARACTERS IN LASTNAME TEXTBOX");
	} else {
	test.fail("TC:34 USER SHOULD BE SEND CHARACTERS IN LASTNAME TEXTBOX");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
	+ "USER SHOULD  BE SEND CHARACTERS IN LASTNAME TEXTBOX");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// NUMARICAL AND CHARACTERS SEND IN ADDRESS US(ONLY)

	try {
	String addressspecharacterhead = Excelreader.getData(0, 81, 6);
	String adsccnvalue = page.addressenterdlabel(addressspecharacterhead);
	if (adsccnvalue.equals(addressspecharacterhead)) {
	test.pass("TC:35 USER SHOULD  SEND NUMARICAL AND CHARACTERS IN ADDRESS TEXTBOX");
	} else {
	test.fail("TC:35 USER SHOULD SEND NUMARICAL AND CHARACTERS IN ADDRESS TEXTBOX");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
	+ "USER SHOULD  SEND NUMARICAL AND CHARACTERS IN ADDRESS TEXTBOX");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// NUMARICAL AND CHARACTERS IN APT SUITE
	try {
	String apisuitespecialcharecter = Excelreader.getData(0, 86, 6);
	String suitesh = page.apisuiteenteredvalue(apisuitespecialcharecter);
	if (suitesh.equals(apisuitespecialcharecter)) {
	test.pass("TC:36 USER SHOULD SEND NUMARICAL AND CHARACTERS IN APT/SUITE TEXTBOX");
	} else {
	test.fail("TC:36 USER SHOULD  SEND NUMARICAL AND CHARACTERS IN APT/SUITE TEXTBOX");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
	+ "USER SHOULD  SEND NUMARICAL AND CHARACTERS IN APT/SUITE TEXTBOX");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// CHARACTERS of city
	try {
	String citycharactersexcel = Excelreader.getData(0, 91, 6);
	String citycharactershead = page.cityenteredvalue(citycharactersexcel);
	if (citycharactershead.equals(citycharactersexcel)) {
	test.pass("TC:37 USER SHOULD  SEND CHARACTERS IN CITY TEXTBOX");
	} else {
	test.fail("TC:37 USER SHOULD SEND CHARACTERS IN CITY TEXTBOX");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
	+ "USER SHOULD SEND CHARACTERS IN CITY TEXTBOX");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// select drop down values of state function
	try {
	String statedropdownvaluehead = page.stateselecteddropdownvalmethod1();
	String statedropdownvalueEXCEL = Excelreader.getData(0, 96, 6);
	if (statedropdownvaluehead.equals(statedropdownvalueEXCEL)) {
	test.pass("TC:38 STEATE DROP DOWN VALUE IS SELECTED");
	} else {
	test.fail("TC:38 STEATE DROP DOWN VALUE IS NOT SELECTED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
	+ "STEATE DROP DOWN VALUE IS NOT SELECTED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// NUMERICAL of zip
	try {
	String zipsendedvaluesexcel = Excelreader.getData(0, 100, 6);
	String zipsendedvalueshead = page.zipenteredvalue(zipsendedvaluesexcel);
	if (zipsendedvalueshead.equals(zipsendedvaluesexcel)) {
	test.pass("TC:39 USER SHOULD ENTERD NUMERICAL IN ZIP TEXTBOX");
	} else {

	test.fail("TC:39 USER SHOULD ENTERD NUMERICAL IN ZIP TEXTBOX");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
	+ "USER SHOULD ENTERD NUMERICAL IN ZIP TEXTBOX");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// yes radio button after select
	try {
	String yesradiobuttonisselectedheadd = page.Yesradiobuttonselectmethod();
	if (yesradiobuttonisselectedheadd.equals("true")) {
	test.pass("TC:28 YES RADIO BUTTON SHOULD BE  CLICKABLE");
	} else {
	test.fail("TC:28 YES RADIO BUTTON SHOULD BE CLICKABLE");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
	+ "YES RADIO BUTTON SHOULD BE CLICKABLE");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());

	}

	// SEND WITH MAIL FORMAT

	try {
	String emailsendid = Excelreader.getData(0, 111, 6);
	String emailvlue = page.emailenteredvalue(emailsendid);
	if (emailvlue.equals(emailsendid)) {
	test.pass("TC:41  USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
	} else {
	test.fail("TC:41 USER SHOULD SEND MAIL WITH FORMAT IN MAIL TEXTBOX");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
	+ "USER SHOULD SEND MAIL WITH FORMAT IN MAIL TEXTBOX");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// send IDS IN CONFIRM
	try {
	String confirmmailsend = Excelreader.getData(0, 115, 6);
	String conmailsendvalue = page.confirmmailenteredvalue(confirmmailsend);
	if (conmailsendvalue.equals(confirmmailsend)) {
	test.pass("TC:42  USER SHOULD SEND MAIL IN CONFIRM MAIL TEXTBOX");
	} else {
	test.fail("TC:42 USER SHOULD SEND MAIL IN CONFIRM MAIL TEXTBOX");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
	+ "USER SHOULD SEND MAIL IN CONFIRM MAIL TEXTBOX");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// ENTER 10 NUMERICAL
	try {
	String phonecharacterhead = Excelreader.getData(0, 122, 6);
	String phonenumCenteredval = page.phonenumberenteredvalue(phonecharacterhead);
	if (phonenumCenteredval.equals(phonecharacterhead)) {
	test.pass("TC:43 USER SHOULD  SEND 10 NUMERICAL IN PHONE NUMBER TEXTBOX ");
	} else {
	test.fail("TC:43 USER SHOULD  SEND 10 NUMERICAL IN PHONE NUMBER TEXTBOX ");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
	+ "USER SHOULD SEND 10 NUMERICAL IN PHONE NUMBER TEXTBOX ");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// click on submit AND thanks you! test
	try {
	String gettitle = page.generallgetpagetitlemethod2();
	String gettitleexcel = Excelreader.getData(0, 146, 6);
	if (gettitle.equals(gettitleexcel)) {
	test.pass("TC: RESTAURANT FEEDBACK FORM IS SUBMITTED SUCCESSFULLY  ");
	} else {
	test.fail("TC:1 RESTAURANT FEEDBACK FORM IS NOT SUBMITTED SUCCESSFULLY");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
	+ "RESTAURANT FEEDBACK FORM IS NOT SUBMITTED SUCCESSFULLY");
	}
	} catch (Exception e) {
	test.fail("TC: SUBMIT BUTTON IS NOT WORKING FINE AND ENABEL");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Positive_Scenarios_All_Forms"))
	+ "SUBMIT BUTTON IS NOT WORKING FINE AND ENABEL");
	}

	}
}

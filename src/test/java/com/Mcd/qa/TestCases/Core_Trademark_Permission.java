package com.Mcd.qa.TestCases;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.McD.qa.Base.BaseTest;
import com.McD.qa.Extentreport.Extentreport;
import com.McD.qa.Pages.Basepage;
import com.McD.qa.Pages.CCPA_Rights_Center_Page;
import com.McD.qa.Pages.Core_Trademark_Permission_page;
import com.McD.qa.Pages.Resturant_Feedback_page1;
import com.McD.qa.Utility.TestUtil;

public class Core_Trademark_Permission extends BaseTest {

	String excelptha = System.getProperty("user.dir");
	TestUtil Excelreader = new TestUtil(excelptha + "/src/main/java/com/McD/qa/TestData/Core_Trademark_Permission.xlsx");

	@Test(priority = 1)
	public void Open_urlT() {
		Core_Trademark_Permission_page page = new Core_Trademark_Permission_page(driver);
		test = extent.createTest("Open_urlT");

		try {
			driver.get(Basepage.readProperty("urlT"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 6);
			if (gettitle.equalsIgnoreCase(gettitleexcel)) {
				test.pass("TC:1 RESTAURANT URL IS OPENED");
			} else {
				test.fail("TC:1 RESTAURANT URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_Trademark_Permission"))
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
	public void Trademark_Permission_Heading() {
		Core_Trademark_Permission_page page = new Core_Trademark_Permission_page(driver);
		test = extent.createTest("Trademark_Permission_Heading");
		// trademark permission label
		try {
			String trademarkpermissionhead = page.trademarkpermissionmethod();
			String trademarkpermissionexcel = Excelreader.getData(0, 2, 5);
			if (trademarkpermissionhead.equals(trademarkpermissionexcel)) {
				test.pass("TC:3 VERIFY LABEL 'TRADEMARK PERMISSION' IS DISPLAYED");

			} else {
				test.fail("TC:3 VERIFY LABEL 'TRADEMARK PERMISSION' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_Trademark_Permission"))
						+ "VERIFY LABEL 'TRADEMARK PERMISSION' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// interested in using our label
		try {
			String interestedusinglabelhead = page.interestedusinglabelmethod();
			String interestedusinglabelexcel = Excelreader.getData(0, 3, 5);
			if (interestedusinglabelhead.equals(interestedusinglabelexcel)) {
				test.pass("TC:3 VERIFY LABEL 'INTERESTED IN USING OUR......' IS DISPLAYED");

			} else {
				test.fail("TC:3 VERIFY LABEL 'INTERESTED IN USING OUR......' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_Trademark_Permission"))
						+ "VERIFY LABEL 'INTERESTED IN USING OUR......' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// PICK A DIFFERENT TOPIC LABEL
		try {
			String pickdifferenttopiclabehead = page.pickdifferenttopiclabemethod();
			String pickdifferenttopiclabexcel = Excelreader.getData(0, 4, 5);
			if (pickdifferenttopiclabehead.equals(pickdifferenttopiclabexcel)) {
				test.pass("TC:3 VERIFY LABEL 'PICK A DIFFERENT TOPIC' IS DISPLAYED");

			} else {
				test.fail("TC:3 VERIFY LABEL 'PICK A DIFFERENT TOPIC' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_Trademark_Permission"))
						+ "VERIFY LABEL 'INTERESTED IN USING OUR......' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 3)
	public void Pick_Different_Topic() throws IOException {
		Core_Trademark_Permission_page page = new Core_Trademark_Permission_page(driver);
		test = extent.createTest("Pick_Different_TopicT");

		// GO BUTTON is enable or not
		try {
			page.Gobuttonena();
			test.pass("TC:6 GO BUTTON IS ENABLE AND DISPLAYED");
			// General inquiry
			try {
				String generealdropdownhead = page.Generaldropdownvalmethod(); // click and drop down value is display
																				// or not
				String generealdropdownexcel = Excelreader.getData(0, 5, 5);
				if (generealdropdownhead.equals(generealdropdownexcel)) {
					test.pass("TC: THE DROPDWON 'PICK A DIFFERENT TOPIC' SHOULD BE CLICKABLE");
						String gettitle = page.generallgetpagetitlemethod1();
						String gettitleexcel = Excelreader.getData(0, 6, 5);
						if (gettitle.equals(gettitleexcel)) {
							test.pass(
									"TC: THE PAGE 'GENERAL INQUIRY' PAGE IS TRIGGERED AND DISPLAYED IN THE SAME PAGE");
							driver.navigate().back();
						} else {
							test.fail(
									"TC: THE PAGE 'GENERAL INQUIRY' PAGE IS NOT TRIGGERED AND DISPLAYED IN THE SAME PAGE");
							test.fail(test.addScreenCaptureFromPath(
									Extentreport.getScreenshot(driver, "Core_Trademark_Permission"))
									+ "HEADING 'GENERAL INQUIRY' IS NOT TRIGGERED");
							driver.navigate().back();
						}

					} else {
						test.fail("TC: USER SHOULD BE SELECT 'GENERAL INQUIRY' OPTION");
						test.fail(test
								.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_Trademark_Permission"))
								+ "USER SHOULD BE SELECT 'GENERAL INQUIRY' OPTION");
					}
			} catch (Exception e) {
				test.fail("Error:" + e.getMessage());
			}
			// Restaurant feedback

			try {
				String restaurantdropdownhead = page.restarentdropdownlabelmethod(); // click and drop down value is
																						// display or not
				String restaurantdropdownexcel = Excelreader.getData(0, 7, 5);
				if (restaurantdropdownhead.equals(restaurantdropdownexcel)) {
					test.pass("TC: THE DROPDWON 'PICK A DIFFERENT TOPIC' SHOULD BE CLICKABLE");
					
						String gettitle = page.generallgetpagetitlemethod1();
						String gettitleexcel = Excelreader.getData(0, 8, 5);
						if (gettitle.equals(gettitleexcel)) {
							test.pass(
									"TC: THE PAGE 'RESTAURANT FEEDBACK' PAGE IS TRIGGERED AND DISPLAYED IN THE SAME PAGE");
							test.pass("TC: USER ABLE TO CLICK ON 'GO' BUTTON");
							driver.navigate().back();
						} else {
							test.fail(
									"TC: THE PAGE 'RESTAURANT FEEDBACK' PAGE IS NOT TRIGGERED AND DISPLAYED IN THE SAME PAGE");
							test.fail(test.addScreenCaptureFromPath(
									Extentreport.getScreenshot(driver, "Trademark_Permission"))
									+ "HEADING 'RESTAURANT FEEDBACK' IS NOT TRIGGERED");
							driver.navigate().back();
						}
					} else {
						test.fail("TC: USER SHOULD BE SELECT 'RESTAURANT FEEDBACK' OPTION");
						test.fail(test
								.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
								+ "USER SHOULD BE SELECT 'RESTAURANT FEEDBACK' OPTION");
					}
				
			} catch (Exception e) {
				test.fail("Error:" + e.getMessage());
			}
			// mobile app feedback
			try {
				String mobilefeeddropdownlabelhead = page.mobilefeeddropdownlabelmethod(); // click and drop down value
																							// is display or not
				String mobilefeeddropdownlabelexcel = Excelreader.getData(0, 9, 5);
				if (mobilefeeddropdownlabelhead.equals(mobilefeeddropdownlabelexcel)) {
					test.pass("TC: THE DROPDWON 'PICK A DIFFERENT TOPIC' SHOULD BE CLICKABLE");
						String gettitle = page.generallgetpagetitlemethod1();
						String gettitleexcel = Excelreader.getData(0, 10, 5);
						if (gettitle.equals(gettitleexcel)) {
							test.pass(
									"TC: THE PAGE 'MOBILE APP FEEDBACK' PAGE IS TRIGGERED AND DISPLAYED IN THE SAME PAGE");
							driver.navigate().back();
						} else {
							test.fail(
									"TC: THE PAGE 'MOBILE APP FEEDBACK' PAGE IS NOT TRIGGERED AND DISPLAYED IN THE SAME PAGE");
							test.fail(test.addScreenCaptureFromPath(
									Extentreport.getScreenshot(driver, "Trademark_Permission"))
									+ "HEADING 'MOBILE APP FEEDBACK' IS NOT TRIGGERED");
							driver.navigate().back();
						}

					} else {
						test.fail("TC: USER SHOULD BE SELECT 'MOBILE APP FEEDBACK' OPTION");
						test.fail(test
								.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
								+ "USER SHOULD BE SELECT 'MOBILE APP FEEDBACK' OPTION");
					}
			} catch (Exception e) {
				test.fail("Error:" + e.getMessage());
			}
			// contact us
			try {
				String contactusdropdownhead = page.contactusdropdownlabelmethod(); // click and drop down value is
																					// display or not
				String contactusdropdownexcel = Excelreader.getData(0, 11, 5);
				if (contactusdropdownhead.equals(contactusdropdownexcel)) {
					test.pass("TC: THE DROPDWON 'PICK A DIFFERENT TOPIC' SHOULD BE CLICKABLE");
						String gettitle = page.generallgetpagetitlemethod1();
						String gettitleexcel = Excelreader.getData(0, 12, 5);
						if (gettitle.equals(gettitleexcel)) {
							test.pass(
									"TC: THE PAGE 'CONTACT US + FAQs' PAGE IS TRIGGERED AND DISPLAYED IN THE SAME PAGE");
							driver.navigate().back();
						} else {
							test.fail(
									"TC: THE PAGE 'CONTACT US + FAQs' PAGE IS NOT TRIGGERED AND DISPLAYED IN THE SAME PAGE");
							test.fail(test.addScreenCaptureFromPath(
									Extentreport.getScreenshot(driver, "Trademark_Permission"))
									+ "HEADING 'CONTACT US + FAQs' IS NOT TRIGGERED");
							driver.navigate().back();
						}
					} else {
						test.fail("TC: USER SHOULD BE SELECT 'CONTACT US + FAQs' OPTION");
						test.fail(test
								.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
								+ "USER SHOULD BE SELECT 'CONTACT US + FAQs' OPTION");
					}
				
			} catch (Exception e) {
				test.fail("Error:" + e.getMessage());
			}
		} catch (Exception e) {
			test.fail("TC:6 GO BUTTON IS NOT ENABLE AND DISPLAYED");
			test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
					+ "GO BUTTON IS NOT ENABLE AND DISPLAYED");
		}
	}

	@Test(priority = 4)
	public void How_Can_We_Help_you() {
		Core_Trademark_Permission_page page = new Core_Trademark_Permission_page(driver);
		test = extent.createTest("How_Can_We_Help_you");
		// how can we help you
		try {
			String howcanwehelpyoulabelhead = page.howcanwehelpyoulabelmethod();
			String howcanwehelpyoulabelexcel = Excelreader.getData(0, 13, 5);
			if (howcanwehelpyoulabelhead.equals(howcanwehelpyoulabelexcel)) {
				test.pass("TC:11 VERIFY LABEL 'HOW CAN WE HELP YOU' IS DISPLAYED");

			} else {
				test.fail("TC:11 VERIFY LABEL 'HOW CAN WE HELP YOU' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'HOW CAN WE HELP YOU' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// WE SPENT OVER LABEL
		try {
			String wespentoverlabelhead = page.wespentoverlabelmethod();
			String wespentoverlabelexcel = Excelreader.getData(0, 14, 5);
			if (wespentoverlabelhead.equals(wespentoverlabelexcel)) {
				test.pass("TC:12 VERIFY LABEL 'We’ve spent over fifty years developing......' IS DISPLAYED");

			} else {
				test.fail("TC:12 VERIFY LABEL 'We’ve spent over fifty years developing...' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'We’ve spent over fifty years developing....' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// IF YOU HAVE HEARD FROM LABE
		try {
			String ifyouhavelabelhead = page.ifyouhavelabelmethod();
			String ifyouhavelabelexcel = Excelreader.getData(0, 15, 5);
			if (ifyouhavelabelhead.equals(ifyouhavelabelexcel)) {
				test.pass("TC:12 VERIFY LABEL 'IF YOU HEARD FROM A.....' IS DISPLAYED");

			} else {
				test.fail("TC:12 VERIFY LABEL 'IF YOU HEARD FROM A.....' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'IF YOU HEARD FROM A.....' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// Indicates a required field
		try {
			String indicatesarequiredlabelhead = page.indicatesarequiredlabelmethod();
			String indicatesarequiredlabelexcel = Excelreader.getData(0, 16, 5);
			if (indicatesarequiredlabelhead.equals(indicatesarequiredlabelexcel)) {
				test.pass("TC:13 VERIFY LABEL 'INDICATES A REQUIRED FIELD.' IS DISPLAYED");

			} else {
				test.fail("TC:13 VERIFY LABEL 'INDICATES A REQUIRED FIELD.' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'INDICATES A REQUIRED FIELD.' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 5)
	public void Reason_For_You_Request() {
		Core_Trademark_Permission_page page = new Core_Trademark_Permission_page(driver);
		test = extent.createTest("Reason_For_You_Request");
		// REASON FOR YOU REQUEST
		try {
			String reasonforyoulabelhead = page.reasonforyoulabelmethod();
			String reasonforyoulabelexcel = Excelreader.getData(0, 17, 5);
			if (reasonforyoulabelhead.equals(reasonforyoulabelexcel)) {
				test.pass("TC:14 VERIFY LABEL 'REASON FOR YOU REQUEST' IS DISPLAYED");

			} else {
				test.fail("TC:14 VERIFY LABEL 'HOW CAN WE HELP YOU' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'HOW CAN WE HELP YOU' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// PLEASE SELECT ANY ONE OPTION
		try {
			String pleaseselectlabelhead = page.pleaseselectlabelmethod();
			String pleaseselectlabelexcel = Excelreader.getData(0, 18, 5);
			if (pleaseselectlabelhead.equals(pleaseselectlabelexcel)) {
				test.pass("TC:15 VERIFY LABEL 'PLEASE SELECT ANY ONE OPTION' IS DISPLAYED");

			} else {
				test.fail("TC:15 VERIFY LABEL 'PLEASE SELECT ANY ONE OPTION' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'PLEASE SELECT ANY ONE OPTION' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK PLEASE SELECT ANY ONE OPTION
		try {
			String pleaseselectlabelhead = page.pleaseselectlabelmethod1();
			String pleaseselectlabelexcel = Excelreader.getData(0, 18, 5);
			if (pleaseselectlabelhead.equals(pleaseselectlabelexcel)) {
				test.pass("TC:15 VERIFY LABEL 'PLEASE SELECT ANY ONE OPTION' IS DISPLAYED");

			} else {
				test.fail("TC:15 VERIFY LABEL 'PLEASE SELECT ANY ONE OPTION' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'PLEASE SELECT ANY ONE OPTION' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// please select any drop down value
		try {
			String pleaseselectdropdownvaluehead = page.pleaseselectdropdownvaluemethod();
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

	}

	@Test(priority = 6)
	public void Tell_Us_About_Your_Request() {
		Core_Trademark_Permission_page page = new Core_Trademark_Permission_page(driver);
		test = extent.createTest("Tell_Us_About_Your_RequestT");

		// tell us about your request label
		try {
			String tellusaboutlabelhead = page.tellusaboutlabelmethod();
			String tellusaboutlabelexcel = Excelreader.getData(0, 20, 5);
			if (tellusaboutlabelhead.equals(tellusaboutlabelexcel)) {
				test.pass("TC:16 VERIFY LABEL 'TELL US ABOUT YOUR REQUEST' IS DISPLAYED");

			} else {
				test.fail("TC:16 VERIFY LABEL 'TELL US ABOUT YOUR REQUEST' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'TELL US ABOUT YOUR REQUEST' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// enter your comments label

		try {
			String entercommentslabelhead = page.entercommentslabelmethod();
			String entercommentslabelexcel = Excelreader.getData(0, 21, 5);
			if (entercommentslabelhead.equals(entercommentslabelexcel)) {
				test.pass("TC:17  VERIFY LABEL 'ENTER YOUR COMMENTS REGARDING......' IS DISPLAYED");

			} else {
				test.fail("TC:17  VERIFY LABEL 'ENTER YOUR COMMENTS REGARDING......' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'ENTER YOUR COMMENTS REGARDING......' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// after click enter your comments label
		try {
			String entercommentslabelhead = page.clcikentercommentslabelmethod();
			String entercommentslabelexcel = Excelreader.getData(0, 21, 5);
			if (entercommentslabelhead.equals(entercommentslabelexcel)) {
				test.pass("TC:17  VERIFY LABEL 'ENTER YOUR COMMENTS REGARDING......' IS ROLLED UP");

			} else {
				test.fail("TC:17  VERIFY LABEL 'ENTER YOUR COMMENTS REGARDING......' IS ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'ENTER YOUR COMMENTS REGARDING......' IS ROLLED UP");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// SEND SPECIAL CHARECTER
		try {
			String entercommentspecialchaexcel = Excelreader.getData(0, 22, 5);
			String entercommentspecialchahead = page.entercommentsendedvaluemethod(entercommentspecialchaexcel);
			if (!entercommentspecialchahead.equals(entercommentspecialchaexcel)) {
				test.pass("TC:17 USER SHOULD NOT BE SEND SPECIAL CHARACTER");

			} else {
				test.fail("TC:17 USER SHOULD  NOT BE SEND SPECIAL CHARACTER");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD  NOT BE SEND SPECIAL CHARACTER");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// SEND CHARACTER AND NUMERICAL
		try {
			String entercommentcharnumericalexcel = Excelreader.getData(0, 23, 5);
			String entercommentcharnumericalhead = page.entercommentsendedvaluemethod(entercommentcharnumericalexcel);
			if (entercommentcharnumericalhead.equals(entercommentcharnumericalexcel)) {
				test.pass("TC:17 USER SHOULD  BE SEND NUMERICAL AND CHARACTER");

			} else {
				test.fail("TC:17 USER SHOULD  BE SEND NUMERICAL AND CHARACTER");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD  BE SEND NUMERICAL AND CHARACTER");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// more than 1200 character and numerical
		try {
			String entercommentmorethan1200excel = Excelreader.getData(0, 24, 5);
			String entercommentmorethan1200head = page.entercommentsendedvaluemethod(entercommentmorethan1200excel);
			if (entercommentmorethan1200head.equals(entercommentmorethan1200excel)) {
				test.pass("TC:17 USER SHOULD  BE SEND MORE THAN 1200 NUMERICAL AND CHARACTER");
				String commeterrormessagehead = page.commeterrormessagemethod();
				String commeterrormessageexcel = Excelreader.getData(0, 25, 5);
				if (commeterrormessagehead.equals(commeterrormessageexcel)) {
					test.pass("TC:17 ENTER MORE THAN 1200 IN ENTER YOUR COMMENTS.... 'ERROR MESSAGE DISPLAYED' -->"
							+ "'" + commeterrormessagehead + "'");

				} else {
					test.fail("TC:17 ENTER MORE THAN 1200 IN  ENTER YOUR COMMENTS.... ERROR MESSAGE IS NOT DISPLAYED");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
							+ "ENTER YOUR COMMENTS.... ERROR MESSAGE IS NOT DISPLAYED");
				}

			} else {
				test.fail("TC:17 USER SHOULD  BE SEND MORE THAN 1200 NUMERICAL AND CHARACTER");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD  BE SEND MORE THAN 1200 NUMERICAL AND CHARACTER");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE
		try {
			String commeterrormessagehead = page.commeterrormessagemethod1();
			String commeterrormessageexcel = Excelreader.getData(0, 25, 6);
			if (commeterrormessagehead.equals(commeterrormessageexcel)) {
				test.pass("TC:17 ENTER YOUR COMMENTS.... 'ERROR MESSAGE DISPLAYED' -->" + "'" + commeterrormessagehead
						+ "'");

			} else {
				test.fail("TC:17 ENTER YOUR COMMENTS.... ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "ENTER YOUR COMMENTS.... ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 7)
	public void How_It_Will_Be_Used() {
		Core_Trademark_Permission_page page = new Core_Trademark_Permission_page(driver);
		test = extent.createTest("How_It_Will_Be_Used");
		// how it will be used label

		try {
			String howwillitbelabehead = page.howwillitbelabelmethod();
			String howwillitbelabeexcel = Excelreader.getData(0, 26, 5);
			if (howwillitbelabehead.equals(howwillitbelabeexcel)) {
				test.pass("TC:18 VERIFY LABEL 'HOW IT WILL BE USED ' IS DISPLAYED");

			} else {
				test.fail("TC:18 VERIFY LABEL 'HOW IT WILL BE USED' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'HOW IT WILL BE USED' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// after click on how it will be used label

		try {
			String howwillitbelabehead = page.howwillitbelabelmethod1();
			String howwillitbelabeexcel = Excelreader.getData(0, 26, 5);
			if (howwillitbelabehead.equals(howwillitbelabeexcel)) {
				test.pass("TC:18 VERIFY LABEL 'HOW IT WILL BE USED ' IS DISPLAYED");

			} else {
				test.fail("TC:18 VERIFY LABEL 'HOW IT WILL BE USED' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'HOW IT WILL BE USED' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send character, special character and numerical
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

		// send more than 100
		try {
			String howwillitbesendvalueexcel = Excelreader.getData(0, 28, 5);
			String howwillitbesendvaluehead = page.howwillitbesendedvaluemethod1(howwillitbesendvalueexcel);
			if (!howwillitbesendvaluehead.equals(howwillitbesendvalueexcel)) {
				test.pass(
						"TC:18 USER SHOULD NOT BE SEND MORE THAN 100 SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON HOW WILL IT BE USED FUNCTION");

			} else {
				test.fail(
						"TC:18 USER SHOULD  NOT BE SEND MORE THAN 100 SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON HOW WILL IT BE USED FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD NOT BE SEND MORE THAN 100 SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON HOW WILL IT BE USED FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERRO MESSAGE
		try {
			String howwillitbeerrormessagehead = page.howwillitbeerrormessagemethod();
			String howwillitbeerrormessageexcel = Excelreader.getData(0, 29, 5);
			if (howwillitbeerrormessagehead.equals(howwillitbeerrormessageexcel)) {
				test.pass("TC:18 HOW WILL IT BE USED FUNCTION - 'ERROR MESSAGE DISPLAYED' -->" + "'"
						+ howwillitbeerrormessagehead + "'");

			} else {
				test.fail("TC:18 HOW WILL IT BE USED FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "HOW WILL IT BE USED ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 8)
	public void What_Is_The_Intended_Audience() {
		Core_Trademark_Permission_page page = new Core_Trademark_Permission_page(driver);
		test = extent.createTest("What_Is_The_Intended_Audience");

		// *What is the intended audience/distribution?
		try {
			String whatisintentedlabelhead = page.whatisintentedlabelmethod();
			String whatisintentedlabelexcel = Excelreader.getData(0, 30, 5);
			if (whatisintentedlabelhead.equals(whatisintentedlabelexcel)) {
				test.pass("TC:19 VERIFY LABEL 'WHAT IS THE INTENDED AUDIENCE ' IS DISPLAYED");

			} else {
				test.fail("TC:19 VERIFY LABEL 'WHAT IS THE INTENDED AUDIENCE' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'WHAT IS THE INTENDED AUDIENCE' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK ON *What is the intended audience/distribution?
		try {
			String whatisintentedlabelhead = page.whatisintentedlabelmethod1();
			String whatisintentedlabelexcel = Excelreader.getData(0, 30, 5);
			if (whatisintentedlabelhead.equals(whatisintentedlabelexcel)) {
				test.pass("TC:19 VERIFY LABEL 'WHAT IS THE INTENDED AUDIENCE ' IS DISPLAYED");

			} else {
				test.fail("TC:19 VERIFY LABEL 'WHAT IS THE INTENDED AUDIENCE' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'WHAT IS THE INTENDED AUDIENCE' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send character, special character and numerical
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

		// send more than 100

		try {
			String whatisintentedsendedexcel = Excelreader.getData(0, 32, 5);
			String whatisintentedsendedhead = page.whatisintentedsendedvaluemethod1(whatisintentedsendedexcel);
			if (!whatisintentedsendedhead.equals(whatisintentedsendedexcel)) {
				test.pass(
						"TC:19 USER SHOULD NOT BE SEND MORE THAN 100 SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON WHAT IS INTENTED AUDIENCE");

			} else {
				test.fail(
						"TC:19 USER SHOULD NOT BE SEND MORE THAN 100 SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON WHAT IS INTENTED AUDIENCE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD NOT BE SEND MORE THAN 100 SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON WHAT IS INTENTED AUDIENCE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERRO MESSAGE
		try {
			String whatisintentederrormessagehead = page.whatisintentederrormessagemethod();
			String whatisintentederrormessageexcel = Excelreader.getData(0, 33, 5);
			if (whatisintentederrormessagehead.equals(whatisintentederrormessageexcel)) {
				test.pass("TC:19 WHAT IS INTENTED AUDIENCE FUNCTION - 'ERROR MESSAGE DISPLAYED' -->" + "'"
						+ whatisintentederrormessagehead + "'");

			} else {
				test.fail("TC:19 WHAT IS INTENTED AUDIENCE FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "WHAT IS INTENTED AUDIENCE ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 9)
	public void How_Long_Will_It_Be_Used() {
		Core_Trademark_Permission_page page = new Core_Trademark_Permission_page(driver);
		test = extent.createTest("How_Long_Will_It_Be_Used");

		// How long will it be used?
		try {
			String howlongwillitlabelhead = page.howlongwillitlabelmethod();
			String howlongwillitlabelexcel = Excelreader.getData(0, 34, 5);
			if (howlongwillitlabelhead.equals(howlongwillitlabelexcel)) {
				test.pass("TC:20 VERIFY LABEL 'HOW LONG WILL IT BE USED' IS DISPLAYED");

			} else {
				test.fail("TC:20 VERIFY LABEL 'HOW LONG WILL IT BE USED' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'HOW LONG WILL IT BE USED' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// after click How long will it be used?
		try {
			String howlongwillitlabelhead = page.howlongwillitlabelmethod1();
			String howlongwillitlabelexcel = Excelreader.getData(0, 34, 5);
			if (howlongwillitlabelhead.equals(howlongwillitlabelexcel)) {
				test.pass("TC:20 VERIFY LABEL 'HOW LONG WILL IT BE USED' IS DISPLAYED");

			} else {
				test.fail("TC:20 VERIFY LABEL 'HOW LONG WILL IT BE USED' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'HOW LONG WILL IT BE USED' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// send character, special character and numerical
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

		// more than 100s

		try {
			String howlongwillsendedvalueexcel = Excelreader.getData(0, 36, 5);
			String howlongwillsendedvaluehead = page.howlongwillsendedvaluemethod1(howlongwillsendedvalueexcel);
			if (!howlongwillsendedvaluehead.equals(howlongwillsendedvalueexcel)) {
				test.pass(
						"TC:20 USER SHOULD NOT BE SEND MORE THAN 100 SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON HOW LONG WILL IT BE USED");

			} else {
				test.fail(
						"TC:20 USER SHOULD NOT BE SEND SEND MORE THAN 100 SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON HOW LONG WILL IT BE USED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD NOT BE SEND SEND MORE THAN 100 SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON HOW LONG WILL IT BE USED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERRO MESSAGE
		try {
			String errormessagehowlongwillithead = page.errormessagehowlongwillitlabelmethod();
			String errormessagehowlongwillitexcel = Excelreader.getData(0, 37, 5);
			if (errormessagehowlongwillithead.equals(errormessagehowlongwillitexcel)) {
				test.pass("TC:20 HOW LONG WILL IT BE USED FUNCTION - 'ERROR MESSAGE DISPLAYED' -->" + "'"
						+ errormessagehowlongwillithead + "'");

			} else {
				test.fail("TC:20 HOW LONG WILL IT BE USED FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "HOW LONG WILL IT BE USED ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 10)
	public void Have_you_previously_Requested_Permission() {
		Core_Trademark_Permission_page page = new Core_Trademark_Permission_page(driver);
		test = extent.createTest("Have_you_previously_Requested_Permission");

		// Have you previously requested permission for this use?

		try {
			String haveyoupreviouslylabelhead = page.haveyoupreviouslylabelmethod();
			String haveyoupreviouslylabelexcel = Excelreader.getData(0, 38, 5);
			if (haveyoupreviouslylabelhead.equals(haveyoupreviouslylabelexcel)) {
				test.pass("TC:21 VERIFY LABEL 'HAVE YOU PREVIOUSLY REQUESTED....' IS DISPLAYED");

			} else {
				test.fail("TC:21 VERIFY LABEL 'HAVE YOU PREVIOUSLY REQUESTED....' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'HAVE YOU PREVIOUSLY REQUESTED....' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		
		
		
		// yes label

		try {
			String yesradiobuttonlabelhead = page.yesradiobuttonlabelmethod();
			String yesradiobuttonlabelexcel = Excelreader.getData(0, 39, 5);
			if (yesradiobuttonlabelhead.equals(yesradiobuttonlabelexcel)) {
				test.pass("TC:21 VERIFY LABEL 'YES RADIO BUTTON LABEL ' IS DISPLAYED");

			} else {
				test.fail("TC:21 VERIFY LABEL 'YES RADIO BUTTON LABEL' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'YES RADIO BUTTON LABEL' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// yes radio button label
				try {
					String yesradiobuttonlabelhead = page.yesradiobuttonlabelmethod();
					String yesradiobuttonlabelexcel = Excelreader.getData(0, 39, 5);
					if (yesradiobuttonlabelhead.equalsIgnoreCase(yesradiobuttonlabelexcel)) {
						test.pass("TC:37 THE 'YES' RADIO BUTTON LABEL IS DISPLAYED ");
					} else {
						test.fail("TC:37 THE 'YES' RADIO BUTTON LABEL IS NOT DISPLAYED");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
								+ "THE 'YES' RADIO BUTTON LABEL IS NOT DISPLAYED");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
		
		// NO label

		try {
			String noradiobuttonlabelhead = page.noradiobuttonlabelmethod();
			String noradiobuttonlabelexcel = Excelreader.getData(0, 40, 5);
			if (noradiobuttonlabelhead.equals(noradiobuttonlabelexcel)) {
				test.pass("TC:21 VERIFY LABEL 'NO RADIO BUTTON LABEL ' IS DISPLAYED");

			} else {
				test.fail("TC:21 VERIFY LABEL 'NO RADIO BUTTON LABEL' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'NO RADIO BUTTON LABEL' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// yes radio button
		try {
			String yesadiobuttonbydefaultselectedhead = page.yesadiobuttonbydefaultselectedmethod();
			if (!yesadiobuttonbydefaultselectedhead.equals("true")) {
				test.pass("TC:21 YES RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
			} else {
				test.fail("TC:21 YES RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "YES RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		
		/*// yes radio button
				try {
					boolean yesradiobuttonclickhead = page.yesradiobuttonclickmethod();
					if (yesradiobuttonclickhead == false) {
						test.pass("TC:37.2 YES RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
					} else {
						test.fail("TC:37.2 YES RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
								+ "YES RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());

				}*/
		
		// NO radio button
		try {
			String noadiobuttonbydefaultselectedhead = page.noradiobuttonbydefaultselectedmethod();
			if (!noadiobuttonbydefaultselectedhead.equals("true")) {
				test.pass("TC:21 NO RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
			} else {
				test.fail("TC:21 NO RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "NO RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}

		// yes radio button after click
		try {
			boolean yesadiobuttonbydefaultselectedhead = page.yesadiobuttonbydefaultselectedmethod1();
			if (yesadiobuttonbydefaultselectedhead ==true) {
				test.pass("TC:21 YES RADIO BUTTON SHOULD BE CLICKABLE");
			} else {
				test.fail("TC:21 YES RADIO BUTTON SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "YES TADIO BUTTON SHOULD BE CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// NO radio button click
		try {
			String noadiobuttonbydefaultselectedhead = page.noradiobuttonbydefaultselectedmethod1();
			if (noadiobuttonbydefaultselectedhead.equals("true")) {
				test.pass("TC:21 NO RADIO BUTTON SHOULD BE CLICKABLE");
				// yes radio button
				String yesadiobuttonbydefaultselectedhead = page.yesadiobuttonbydefaultselectedmethod();
				if (!yesadiobuttonbydefaultselectedhead.equals("true")) {
					test.pass("TC:21 USER SHOULD NOT SELECT BOTH YES AND NO RADIO BUTTON");
				} else {
					test.fail("TC:21 USER SHOULD NOT SELECT BOTH YES AND NO RADIO BUTTON");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
							+ "USER SHOULD NOT SELECT BOTH YES AND NO RADIO BUTTON");
				}
			} else {
				test.fail("TC:21 NO RADIO BUTTON SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "NO RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERRO MESSAGE
		try {
			String errormessageradiobuttonhead = page.errormessageradiobuttonmethod();
			String errormessageradiobuttonexcel = Excelreader.getData(0, 41, 5);
			if (errormessageradiobuttonhead.equals(errormessageradiobuttonexcel)) {
				test.pass("TC:21  HAVE YOU PREVIOUSLY REQUESTED FUNCTION - 'ERROR MESSAGE DISPLAYED' -->" + "'"
						+ errormessageradiobuttonhead + "'");

			} else {
				test.fail("TC:21 HAVE YOU PREVIOUSLY REQUESTED FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "HAVE YOU PREVIOUSLY REQUESTED.. ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 11)
	public void When_Was_the_Request_Submitted() {
		Core_Trademark_Permission_page page = new Core_Trademark_Permission_page(driver);
		test = extent.createTest("When_Was_the_Request_Submitted");

		// When was the request submitted?
		try {
			String whenwastherequestedlabelhead = page.whenwastherequestedlabelmethod();
			String whenwastherequestedlabelexcel = Excelreader.getData(0, 42, 5);
			if (whenwastherequestedlabelhead.equals(whenwastherequestedlabelexcel)) {
				test.pass("TC:22 VERIFY LABEL 'WHEN WAS THE REQUEST SUBMITTED ' IS DISPLAYED");

			} else {
				test.fail("TC:22 VERIFY LABEL 'WHEN WAS THE REQUEST SUBMITTED ' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'WHEN WAS THE REQUEST SUBMITTED ' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// visit date month label
		try {
			String whenwasemonthlabelhead = page.whenwasemonthlabelmethod();
			String whenwasemonthlabelexcel = Excelreader.getData(0, 43, 5);
			if (whenwasemonthlabelhead.equals(whenwasemonthlabelexcel)) {
				test.pass("TC:23 VERIFY LABEL WHEN WAS THETEQUEST SUBMITTED 'MONTH' IS DISPLAYED");
			} else {
				test.fail("TC:23 VERIFY LABEL WHEN WAS THETEQUEST SUBMITTED 'MONTH' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL WHEN WAS THETEQUEST SUBMITTED 'MONTH' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// After click month label
		try {
			String whenwasemonthlabelhead = page.whenwasemonthlabelmethod1();
			String whenwasemonthlabelexcel = Excelreader.getData(0, 43, 5);
			if (whenwasemonthlabelhead.equals(whenwasemonthlabelexcel)) {
				test.pass("TC:23 VERIFY LABEL WHEN WAS THETEQUEST SUBMITTED 'MONTH' IS ROLLED UP");
			} else {
				test.fail("TC:23 VERIFY LABEL WHEN WAS THETEQUEST SUBMITTED 'MONTH' IS NOT ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL WHEN WAS THETEQUEST SUBMITTED 'MONTH' IS NOT ROLLED UP");
			}
			// SELECT MONTH DROP DOWN VALUE
			String visitdatemothsendvalue1head = page.whenwasmonthlabelmethod2();
			String visitdatemothsendvalexcel1 = Excelreader.getData(0, 44, 5);
			if (visitdatemothsendvalue1head.equals(visitdatemothsendvalexcel1)) {
				test.pass("TC:23 MONTH FUNCTION SHOULD BE CLICKABLE");
			} else {
				test.fail("TC:23 MONTH FUNCTION SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "MONTH FUNCTION SHOULD BE CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// error message with out select yes radio button
		try {
			String montherrormessagehead = page.montherrormessagemethod();
			String montherrormessageexcel = Excelreader.getData(0, 45, 5);
			if (!montherrormessagehead.equals(montherrormessageexcel)) {
				test.pass("TC:23  MONTH ERROR MESSAGE SHOULD NOT BE DISPLAYED WITH OUT SELECT YES RADIO BUTTON -->"
						+ "'" + montherrormessagehead + "'");

			} else {
				test.fail("TC:23 MONTH ERROR MESSAGE SHOULD NOT BE DISPLAYED WITH OUT SELECT YES RADIO BUTTON");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "MONTH ERROR MESSAGE SHOULD NOT BE DISPLAYED WITH OUT SELECT YES RADIO BUTTON");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// error message with select yes radio button
		try {
			String montherrormessagehead = page.montherrormessagemethod1();
			String montherrormessageexcel = Excelreader.getData(0, 45, 5);
			if (montherrormessagehead.equals(montherrormessageexcel)) {
				test.pass("TC:23  MONTH ERROR MESSAGE SHOULD BE DISPLAYED AFTER SELECT YES RADIO BUTTON' -->" + "'"
						+ montherrormessagehead + "'");

			} else {
				test.fail("TC:23 MONTH ERROR MESSAGE SHOULD BE DISPLAYED AFTER SELECT YES RADIO BUTTON");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "MONTH ERROR MESSAGE SHOULD BE DISPLAYED AFTER SELECT YES RADIO BUTTON");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 12)
	public void Day_Year() {
		Core_Trademark_Permission_page page = new Core_Trademark_Permission_page(driver);
		test = extent.createTest("Day_Year");
		// day label
		try {
			String daycontfindlabelhead = page.daycontfindlabelmethod();
			String daycontfindlabelexcel = Excelreader.getData(0, 46, 5);
			if (daycontfindlabelhead.equals(daycontfindlabelexcel)) {
				test.pass("TC:24 VERIFY LABEL 'DAY' IS DISPLAYYED");
			} else {
				test.fail("TC:24 VERIFY LABEL 'DAY' IS NOT DISPLAYYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'DAY' IS DISPLAYYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// after click day label
		try {
			String daycontfindlabelhead = page.daycontfindlabelmethod1();
			String daycontfindlabelexcel = Excelreader.getData(0, 46, 5);
			if (daycontfindlabelhead.equals(daycontfindlabelexcel)) {
				test.pass("TC:24 VERIFY LABEL 'DAY' IS ROLLED UP");
			} else {
				test.fail("TC:24 VERIFY LABEL 'DAY' IS NOT ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'DAY' IS ROLLED UP");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// after click on day select drop down
		try {
			String daycontfindcdropdownvalhead = page.daycontfindcdropdownvalmethod1();
			if (daycontfindcdropdownvalhead.equals("")) {
				test.pass("TC:24 WITH OUT SELECT MONTH USER CON'T SELECT DATE");
			} else {
				test.fail("TC:24 WITH OUT SELECT MONTH USER CON'T SELECT DATE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "WITH OUT SELECT MONTH USER CON'T SELECT DATE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// check year label
		try {
			String yearcontfindlabelhead = page.yearcontfindlabelmethod();
			String yearcontfindlabelexcel = Excelreader.getData(0, 47, 5);
			if (yearcontfindlabelhead.equals(yearcontfindlabelexcel)) {
				test.pass("TC:25 VERIFY LABEL 'YEAR' IS DISPLAYYED");
			} else {
				test.fail("TC:25 VERIFY LABEL 'YEAR' IS NOT DISPLAYYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'YEAR' IS DISPLAYYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// after click check year label
		try {
			String yearcontfindlabelhead = page.yearcontfindlabelmethod1();
			String yearcontfindlabelexcel = Excelreader.getData(0, 47, 5);
			if (yearcontfindlabelhead.equals(yearcontfindlabelexcel)) {
				test.pass("TC:25 VERIFY LABEL 'YEAR' IS ROLLED UP");
			} else {
				test.fail("TC:25 VERIFY LABEL 'YEAR' IS NOT ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'YEAR' IS DISPLAYYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// select year drop down value WITH OUR SELECT MONTH
		try {
			String yearcontfindcdropdownvalhead = page.yearcontfindcdropdownvalmethod1();
			if (yearcontfindcdropdownvalhead.equals("")) {
				test.pass("TC:25 WITH OUT SELECT MONTH USER CON'T SELECT YEAR");
			} else {
				test.fail("TC:25 WITH OUT SELECT MONTH USER CON'T SELECT YEAR");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "WITH OUT SELECT MONTH USER CON'T SELECT YEAR");
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
				// day function
				String daydropdownvaluhead = page.daydropdownvalumethod12();
				String daydropdownvaluexcel = Excelreader.getData(0, 48, 5);
				if (daydropdownvaluhead.equals(daydropdownvaluexcel)) {
					test.pass("TC:24 DAY FUNCTION IS CLICKABLE");
					/*String daydropdownvaluhead2 = page.daydropdownvalumethod2();
					String daydropdownvaluexcel2 = Excelreader.getData(0, 48, 5);
					if (daydropdownvaluhead2.equals(daydropdownvaluexcel2)) {
						test.pass("TC:24 USER SHOULD BE SELECT DROP DOWN VALUE OF DAY FUNCTION AFTER SELECT MONTH ");
					} else {
						test.fail("TC:24 USER SHOULD BE SELECT DROP DOWN VALUE OF DAY FUNCTION AFTER SELECT MONTH");
						test.fail(test
								.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
								+ "USER SHOULD BE SELECT DROP DOWN VALUE OF DAY FUNCTION");
					}*/
				} else {
					test.fail("TC:24 DAY FUNCTION IS NOT CLICKABLE");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
							+ "DAY FUNCTION IS NOT CLICKABLE");
				}
				// year function
				String yeardropdownvalhead = page.yeardropdownvalmethod1();
				String yeardropdownvalexcel = Excelreader.getData(0, 49, 5);
				if (yeardropdownvalhead.equals(yeardropdownvalexcel)) {
					test.pass("TC:25 YEAR FUNCTION IS CLICKABLE");
					/*String yeardropdownvalhead2 = page.yeardropdownvalmethod2();
					String yeardropdownvalexcel2 = Excelreader.getData(0, 49, 5);
					if (yeardropdownvalhead2.equals(yeardropdownvalexcel2)) {
						test.pass("TC:25 USER SHOULD BE SELECT DROP DOWN VALUE OF YEAR FUNCTION AFTER SELECT MONTH ");
					} else {
						test.fail("TC:25 USER SHOULD BE SELECT DROP DOWN VALUE OF YEAR FUNCTION AFTER SELECT MONTH");
						test.fail(test
								.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
								+ "USER SHOULD BE SELECT DROP DOWN VALUE OF DAY FUNCTION");
					}*/
				} else {
					test.fail("TC:25 YEAR FUNCTION IS NOT CLICKABLE");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
							+ "YEAR FUNCTION IS NOT CLICKABLE");
				}
			} else {
				test.fail("TC:23 USER SHOULD BE SELECT DROP DOWN VALUE IN MONT FUNTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD BE SELECT DROP DOWN VALUE IN MONT FUNTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// day error message with out select yes radio button
		try {
			String dayerrormessagehead = page.dayerrormessagemethod();
			String dayerrormessageexcel = Excelreader.getData(0, 50, 5);
			if (!dayerrormessagehead.equals(dayerrormessageexcel)) {
				test.pass("TC:23  DAY ERROR MESSAGE SHOULD NOT BE DISPLAYED WITH OUT SELECT YES RADIO BUTTON -->" + "'"
						+ dayerrormessagehead + "'");

			} else {
				test.fail("TC:23 DAY ERROR MESSAGE SHOULD NOT BE DISPLAYED WITH OUT SELECT YES RADIO BUTTON");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "DAY ERROR MESSAGE SHOULD NOT BE DISPLAYED WITH OUT SELECT YES RADIO BUTTON");
			}
			// YEAR
			String yearerrormessagehead = page.yearerrormessagemethod();
			String yearerrormessageexcel = Excelreader.getData(0, 51, 5);
			if (!yearerrormessagehead.equals(yearerrormessageexcel)) {
				test.pass("TC:23  YEAR ERROR MESSAGE SHOULD NOT BE DISPLAYED WITH OUT SELECT YES RADIO BUTTON -->" + "'"
						+ yearerrormessagehead + "'");

			} else {
				test.fail("TC:23 YEAR ERROR MESSAGE SHOULD NOT BE DISPLAYED WITH OUT SELECT YES RADIO BUTTON");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "YEAR ERROR MESSAGE SHOULD NOT BE DISPLAYED WITH OUT SELECT YES RADIO BUTTON");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// day error message AFTER select yes radio button
		try {
			String dayerrormessagehead = page.dayerrormessagemethod1();
			String dayerrormessageexcel = Excelreader.getData(0, 50, 5);
			if (dayerrormessagehead.equals(dayerrormessageexcel)) {
				test.pass("TC:23  DAY ERROR MESSAGE SHOULD NOT BE DISPLAYED WITH OUT SELECT YES RADIO BUTTON -->" + "'"
						+ dayerrormessagehead + "'");

			} else {
				test.fail("TC:23 DAY ERROR MESSAGE SHOULD NOT BE DISPLAYED WITH OUT SELECT YES RADIO BUTTON");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "DAY ERROR MESSAGE SHOULD NOT BE DISPLAYED WITH OUT SELECT YES RADIO BUTTON");
			}
			// YEAR
			String yearerrormessagehead = page.yearerrormessagemethod();
			String yearerrormessageexcel = Excelreader.getData(0, 51, 5);
			if (yearerrormessagehead.equals(yearerrormessageexcel)) {
				test.pass("TC:23  YEAR ERROR MESSAGE SHOULD NOT BE DISPLAYED WITH OUT SELECT YES RADIO BUTTON -->" + "'"
						+ yearerrormessagehead + "'");

			} else {
				test.fail("TC:23 YEAR ERROR MESSAGE SHOULD NOT BE DISPLAYED WITH OUT SELECT YES RADIO BUTTON");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "YEAR ERROR MESSAGE SHOULD NOT BE DISPLAYED WITH OUT SELECT YES RADIO BUTTON");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 13)
	public void What_Was_The_Outcome() {
		Core_Trademark_Permission_page page = new Core_Trademark_Permission_page(driver);
		test = extent.createTest("What_Was_The_Outcome");
		
		// *What was the outcome? label
		try {
			String whatwastheoutcomelabelhead = page.whatwastheoutcomelabelmethod();
			String whatwastheoutcomelabelexcel = Excelreader.getData(0, 52, 5);
			if (whatwastheoutcomelabelhead.equals(whatwastheoutcomelabelexcel)) {
				test.pass("TC:26 VERIFY LABEL 'WHAT WAS THE OUTCOME' IS DISPLAYYED");
			} else {
				test.fail("TC:26 VERIFY LABEL 'WHAT WAS THE OUTCOME' IS NOT DISPLAYYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'WHAT WAS THE OUTCOME' IS DISPLAYYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// GRANTED
		try {
			String grantedlabelhead = page.grantedlabelmethod();
			String grantedlabelexcel = Excelreader.getData(0, 53, 5);
			if (grantedlabelhead.equals(grantedlabelexcel)) {
				test.pass("TC:26 VERIFY LABEL 'GRANTED' IS DISPLAYYED");
			} else {
				test.fail("TC:26 VERIFY LABEL 'GRANTED' IS NOT DISPLAYYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'GRANTED' IS DISPLAYYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// DENIED
		try {
			String deniedlabelhead = page.deniedlabelmethod();
			String deniedlabelexcel = Excelreader.getData(0, 54, 5);
			if (deniedlabelhead.equals(deniedlabelexcel)) {
				test.pass("TC:26 VERIFY LABEL 'DENIED' IS DISPLAYYED");
			} else {
				test.fail("TC:26 VERIFY LABEL 'DENIED' IS NOT DISPLAYYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'DENIED' IS DISPLAYYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// unknown
		try {
			String unknownlabelhead = page.unknownlabelmethod();
			String unknownlabelexcel = Excelreader.getData(0, 55, 5);
			if (unknownlabelhead.equals(unknownlabelexcel)) {
				test.pass("TC:26 VERIFY LABEL 'UNKNOWN' IS DISPLAYYED");
			} else {
				test.fail("TC:26 VERIFY LABEL 'UNKNOWN' IS NOT DISPLAYYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'UNKNOWN' IS DISPLAYYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// granted RADIO BUTTON
		try {
			String grantedradiobuttonhead = page.grantedradiobuttonmethod();
			if (!grantedradiobuttonhead.equals("true")) {
				test.pass("TC:26 GRANTED RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
			} else {
				test.fail("TC:26 GRANTED RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "GRANTED RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// DENIED RADIO BUTTON
		try {
			String deniedradiobuttonhead = page.deniedradiobuttonmethod();
			if (!deniedradiobuttonhead.equals("true")) {
				test.pass("TC:26 DENIED RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
			} else {
				test.fail("TC:26 DENIED RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "DENIED RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// unknown RADIO BUTTON
		try {
			String unknownradiobuttonhead = page.unknownradiobuttonmethod();
			if (!unknownradiobuttonhead.equals("true")) {
				test.pass("TC:26 UNKNOW RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
			} else {
				test.fail("TC:26 UNKNOW RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "UNKNOW RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// click granted RADIO BUTTON
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
		// CLICK DENIED RADIO BUTTON
		try {
			String deniedradiobuttonhead = page.clickdeniedradiobuttonmethod();
			if (deniedradiobuttonhead.equals("true")) {
				test.pass("TC:26  DENIED RADIO BUTTON SHOULD BE CLICKABLE");
			} else {
				test.fail("TC:26 DENIED RADIO BUTTON SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "DENIED RADIO BUTTON SHOULD BE CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// CLICK unknown RADIO BUTTON
		try {
			String unknownradiobuttonhead = page.clickunknownradiobuttonmethod();
			if (unknownradiobuttonhead.equals("true")) {
				test.pass("TC:26 UNKNOWN RADIO BUTTON SHOULD BE CLICKABLE");
				// GRANTED RADIO BUTTON AFTER SELECT UNKNOW RADIO BUTTON
				String grantedradiobuttonhead = page.grantedradiobuttonmethod();
				if (!grantedradiobuttonhead.equals("true")) {
					test.pass("TC:26 USER SHOULD BE SELECT ONE RADIO BUTTON ONLY ON WHAT WAS THE OUT COME FUNCTION");
				} else {
					test.fail("TC:26 USER SHOULD BE SELECT ONE RADIO BUTTON ONLY ON WHAT WAS THE OUT COME FUNCTION");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
							+ "USER SHOULD BE SELECT ONE RADIO BUTTON ONLY ON WHAT WAS THE OUT COME FUNCTION");
				}
				// DENIED AFTER SELECT UNKNOW RADIO BUTTON
				String deniedradiobuttonhead = page.deniedradiobuttonmethod();
				if (!deniedradiobuttonhead.equals("true")) {
					test.pass("TC:26 USER SHOULD BE SELECT ONE RADIO BUTTON ONLY ON WHAT WAS THE OUT COME FUNCTION");
				} else {
					test.fail("TC:26 USER SHOULD BE SELECT ONE RADIO BUTTON ONLY ON WHAT WAS THE OUT COME FUNCTION");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
							+ "USER SHOULD BE SELECT ONE RADIO BUTTON ONLY ON WHAT WAS THE OUT COME FUNCTION");
				}
			} else {
				test.fail("TC:26 UNKNOWN RADIO BUTTON SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "UNKNOWN RADIO BUTTON SHOULD BE CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}

		// ERROR MESSAGE WITH OUT SELECT YES RADIO BUTTON

		try {
			String erromessgewhatwasoutcomehead = page.erromessgewhatwasoutcomemethod();
			String erromessgewhatwasoutcomeexcel = Excelreader.getData(0, 56, 5);
			if (!erromessgewhatwasoutcomehead.equals(erromessgewhatwasoutcomeexcel)) {
				test.pass(
						"TC:26 WHAT WAS THE OUT COME ERROR MESSAGE SHOULD NOT DISPLAYED WITH OUT SELECT YES RADIO BUTTON  -->"
								+ "'" + erromessgewhatwasoutcomehead + "'");
			} else {
				test.fail(
						"TC:26 WHAT WAS THE OUT COME ERROR MESSAGE SHOULD NOT DISPLAYED WITH OUT SELECT YES RADIO BUTTON");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "WHAT WAS THE OUT COME ERROR MESSAGE SHOULD NOT DISPLAYED WITH OUT SELECT YES RADIO BUTTON");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE AFTER SELECT YES RADIO BUTTION
		try {
			String erromessgewhatwasoutcomehead1 = page.erromessgewhatwasoutcomemethod1();
			String erromessgewhatwasoutcomeexcel = Excelreader.getData(0, 56, 5);
			if (erromessgewhatwasoutcomehead1.equals(erromessgewhatwasoutcomeexcel)) {
				test.pass(
						"TC:26 WHAT WAS THE OUT COME ERROR MESSAGE SHOULD BE DISPLAYED AFTER SELECT YES RADIO BUTTON -->"
								+ "'" + erromessgewhatwasoutcomehead1 + "'");
			} else {
				test.fail(
						"TC:26 WHAT WAS THE OUT COME ERROR MESSAGE SHOULD BE DISPLAYED AFTER SELECT YES RADIO BUTTON");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "WHAT WAS THE OUT COME ERROR MESSAGE SHOULD BE DISPLAYED AFTER SELECT YES RADIO BUTTON");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 14)
	public void Book_Publications_Author() {
		Core_Trademark_Permission_page page = new Core_Trademark_Permission_page(driver);
		test = extent.createTest("Book_Publications_Author");

		// Book Publications
		try {
			String bookpublicationlabelhead = page.bookpublicationlabelmethod();
			String bookpublicationlabelexcel = Excelreader.getData(0, 57, 5);
			if (bookpublicationlabelhead.equals(bookpublicationlabelexcel)) {
				test.pass("TC:27 VERIFY LABEL 'BOOK PUBLICATIONS AUTHOR' IS DISPLAYYED");
			} else {
				test.fail("TC:27 VERIFY LABEL 'BOOK PUBLICATIONS AUTHOR' IS NOT DISPLAYYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'BOOK PUBLICATIONS AUTHOR' IS DISPLAYYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// Author label
		try {
			String authorlabelhead = page.authorlabelmethod();
			String authorlabelexcel = Excelreader.getData(0, 58, 5);
			if (authorlabelhead.equals(authorlabelexcel)) {
				test.pass("TC:28 VERIFY LABEL 'AUTHOR' IS DISPLAYYED");
			} else {
				test.fail("TC:28 VERIFY LABEL 'AUTHOR' IS NOT DISPLAYYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'AUTHOR' IS DISPLAYYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// after click on author function
		try {
			String authorclickhead = page.authorclickmethod1();
			String authorclickexcel = Excelreader.getData(0, 58, 5);
			if (authorclickhead.equals(authorclickexcel)) {
				test.pass("TC:28 VERIFY LABEL 'AUTHOR' IS ROLLED UP");
			} else {
				test.fail("TC:28 VERIFY LABEL 'AUTHOR' IS NOT ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'AUTHOR' IS DISPLAYYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// SEND CHARACTERS, SPECIAL CHARACTERS AND NUMERICAL
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
		// SEND MORE THAN 100 CHARACTERS, SPECIAL CHARACTERS AND NUMERICAL
		try {
			String authorsendvalueexcel = Excelreader.getData(0, 60, 5);
			String authorsendvaluehead = page.authorsendvaluemethod(authorsendvalueexcel);
			if (!authorsendvaluehead.equals(authorsendvalueexcel)) {
				test.pass(
						"TC:28 USER SHOULD NOT BE SEND MORE THAN 100 SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON AUTHOR FUNCTION");

			} else {
				test.fail(
						"TC:28 USER SHOULD NOT BE SEND MORE THAN 100 SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON AUTHOR FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD NOT BE SEND MORE THAN 100 SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON AUTHOR FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE of author
		try {
			String authorerrormessagehead = page.authorerrormessagemethod();
			String authorerrormessageexcel = Excelreader.getData(0, 61, 5);
			if (authorerrormessagehead.equals(authorerrormessageexcel)) {
				test.pass("TC:28 AUTHOR ERROR MESSAGE SHOULD BE DISPLAYED  -->" + "'" + authorerrormessagehead + "'");
			} else {
				test.fail("TC:28 AUTHOR ERROR MESSAGE SHOULD BE DISPLAYED ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "AUTHOR ERROR MESSAGE SHOULD BE DISPLAYED ");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 15)
	public void Publisher_Publication_Title() {
		Core_Trademark_Permission_page page = new Core_Trademark_Permission_page(driver);
		test = extent.createTest("Publisher_Publication_Title");
		// publisher label
		try {
			String publisherlabelhead = page.publisherlabelmethod();
			String publisherlabelexcel = Excelreader.getData(0, 62, 5);
			if (publisherlabelhead.equals(publisherlabelexcel)) {
				test.pass("TC:29 VERIFY LABEL 'PUBLISHER' IS DISPLAYYED");
			} else {
				test.fail("TC:29 VERIFY LABEL 'PUBLISHER' IS NOT DISPLAYYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'PUBLISHER' IS NOT DISPLAYYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// publisher label after click
		try {
			String publisherlabelhead = page.publisherlabelmethod1();
			String publisherlabelexcel = Excelreader.getData(0, 62, 5);
			if (publisherlabelhead.equals(publisherlabelexcel)) {
				test.pass("TC:29 VERIFY LABEL 'PUBLISHER' IS ROLLDE UP");
			} else {
				test.fail("TC:29 VERIFY LABEL 'PUBLISHER' IS NOT ROLLDE UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'PUBLISHER' IS NOT ROLLDE UP");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// SEND CHARACTERS, SPECIAL CHARACTERS AND NUMERICAL
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
		// SEND more than 100 CHARACTERS, SPECIAL CHARACTERS AND NUMERICAL
		try {
			String publishersendedvalueexcel = Excelreader.getData(0, 64, 5);
			String publishersendedvaluehead = page.publishersendvaluemethod(publishersendedvalueexcel);
			if (!publishersendedvaluehead.equals(publishersendedvalueexcel)) {
				test.pass(
						"TC:29 USER SHOULD NOT BE SEND MORE THAN 100 SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON PUBLISHER FUNCTION");

			} else {
				test.fail(
						"TC:29 USER SHOULD NOT BE SEND MORE THAN 100 SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON PUBLISHER FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD NOT BE SEND MORE THAN 100 SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON PUBLISHER FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// PUBLICATION TITLE LABEL
		try {
			String publicationlabelhead = page.publicationlabelmethod();
			String publicationlabelexcel = Excelreader.getData(0, 66, 5);
			if (publicationlabelhead.equals(publicationlabelexcel)) {
				test.pass("TC:30 VERIFY LABEL 'PUBLICATION TITLE & EDITION' IS DISPLAYYED");
			} else {
				test.fail("TC:30 VERIFY LABEL 'PUBLICATION TITLE & EDITION' IS NOT DISPLAYYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'PUBLICATION TITLE & EDITION' IS NOT DISPLAYYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// PUBLICATION TITLE LABEL
		try {
			String publicationlabelhead = page.publicationlabelmethod1();
			String publicationlabelexcel = Excelreader.getData(0, 66, 5);
			if (publicationlabelhead.equals(publicationlabelexcel)) {
				test.pass("TC:30 VERIFY LABEL 'PUBLICATION TITLE & EDITION' IS ROLLED UP");
			} else {
				test.fail("TC:30 VERIFY LABEL 'PUBLICATION TITLE & EDITION' IS NOT ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'PUBLICATION TITLE & EDITION' IS NOT ROLLED UP");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// SEND CHARACTERS, SPECIAL CHARACTERS AND NUMERICAL
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

		// SEND MORE THAN 100 CHARACTERS, SPECIAL CHARACTERS AND NUMERICAL
		try {
			String publicationsendedvalhead = Excelreader.getData(0, 68, 5);
			String publicationsendedvalexcel = page.publicationsendedvalmethod(publicationsendedvalhead);
			if (!publicationsendedvalhead.equals(publicationsendedvalexcel)) {
				test.pass(
						"TC:30 USER SHOULD NOT BE MORE THAN 100 SEND SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON PUBLICATION FUNCTION");

			} else {
				test.fail(
						"TC:30 USER SHOULD NOT BE MORE THAN 100 SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON PUBLICATION FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD NOT BE MORE THAN 100 SPECIAL CHARACTER, CHARACTER AND NUMERICAL ON PUBLICATION FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE of PUBLISHER
		try {
			String publishererrormessagehead = page.publishererrormessagemethod();
			String publishererrormessageexcel = Excelreader.getData(0, 65, 5);
			if (publishererrormessagehead.equals(publishererrormessageexcel)) {
				test.pass("TC:29 PUBLISHER ERROR MESSAGE SHOULD BE DISPLAYED  -->" + "'" + publishererrormessagehead
						+ "'");
			} else {
				test.fail("TC:29 PUBLISHER ERROR MESSAGE SHOULD BE DISPLAYED ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "AUTHOR ERROR MESSAGE SHOULD BE DISPLAYED ");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE of PUBLICATION
		try {
			String publicationrerrormessagehead = page.publicationrerrormessagemethod();
			String publicationrerrormessageexcel = Excelreader.getData(0, 69, 5);
			if (publicationrerrormessagehead.equals(publicationrerrormessageexcel)) {
				test.pass("TC:30 PUBLICATION ERROR MESSAGE SHOULD BE DISPLAYED  -->" + "'"
						+ publicationrerrormessagehead + "'");
			} else {
				test.fail("TC:30 PUBLICATION ERROR MESSAGE SHOULD BE DISPLAYED ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "PUBLICATION ERROR MESSAGE SHOULD BE DISPLAYED ");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 16)
	public void Supporting_Attachments() {
		Core_Trademark_Permission_page page = new Core_Trademark_Permission_page(driver);
		test = extent.createTest("Supporting_Attachments");

		// Supporting Attachments
		try {
			String supportingattachmentlabelhead = page.supportingattachmentlabelmethod();
			String supportingattachmentlabelexcel = Excelreader.getData(0, 70, 5);
			if (supportingattachmentlabelhead.equalsIgnoreCase(supportingattachmentlabelexcel)) {
				test.pass("TC:31 VERIFY LABEL 'SUPPORTING ATTACHMENTS' IS DISPLAYYED");
			} else {
				test.fail("TC:31 VERIFY LABEL 'SUPPORTING ATTACHMENTS' IS NOT DISPLAYYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'SUPPORTING ATTACHMENTS' IS NOT DISPLAYYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// PLEASE UPLOAD DOCUMENTS AND IMAGES.... LABEL
		try {
			String pleaseuploaddocumentslabelhead = page.pleaseuploaddocumentslabelmethod();
			String pleaseuploaddocumentslabelexcel = Excelreader.getData(0, 71, 5);
			if (pleaseuploaddocumentslabelhead.equals(pleaseuploaddocumentslabelexcel)) {
				test.pass("TC:31 VERIFY LABEL 'PLEASE UPLOAD DOCUMETND OR IMAGES....' IS DISPLAYYED");
			} else {
				test.fail("TC:31 VERIFY LABEL 'PLEASE UPLOAD DOCUMETND OR IMAGES....' IS NOT DISPLAYYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'PLEASE UPLOAD DOCUMETND OR IMAGES....' IS NOT DISPLAYYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// file 1 label
		try {
			String fileonelabelhead = page.fileonelabelmethod();
			String fileonelabelexcel = Excelreader.getData(0, 72, 5);
			if (fileonelabelhead.equals(fileonelabelexcel)) {
				test.pass("TC:33 VERIFY LABEL 'FILE 1' IS DISPLAYYED");
			} else {
				test.fail("TC:33 VERIFY LABEL 'FILE 1' IS NOT DISPLAYYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'FILE 1' IS NOT DISPLAYYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		/*// Upload file
		try {
			String fileonelabelhead = page.fileonelabelmethod1();			
			if (!fileonelabelhead.equals("")) {
				test.pass("TC:33 VERIFY  'FILE 1' IS uploaded");
			} else {
				test.fail("TC:33 VERIFY  'FILE 1' IS NOT UPLOADED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'FILE 1' IS NOT DISPLAYYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}*/
		
		// clear file button
				try {
					String fileoneclearfilehead= page.fileoneclearfilemethod1();
					String fileoneclearfileexcel = Excelreader.getData(0, 75, 5);
					if (fileoneclearfilehead.equals(fileoneclearfileexcel)) {
						test.pass("TC:33 VERIFY  ' CLEAR FILE BUTTON IS WORKING' ");
					} else {
						test.fail("TC:33 VERIFY  ' CLEAR FILE BUTTON IS WORKING'");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
								+ "VERIFY LABEL ' CLEAR FILE BUTTON IS WORKING'");
					}

				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
		
		
		// upload file error msg
				try {
					String fileoneerrorhead = page.fileoneerrormethod();
					String fileoneerrorexcel = Excelreader.getData(0, 75, 6);
					if (fileoneerrorhead.equals(fileoneerrorexcel)) {
						test.pass("TC:33 VERIFY Error MESSAGE  IS DISPLAYYED");
					} else {
						test.fail("TC:33 VERIFY ERROR MESSAGE IS NOT DISPLAYYED");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
								+ "VERIFY ERROR MESSAGE IS NOT DISPLAYYED");
					}

				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
		
		
		
		/*
		 * try { Runtime.getRuntime().exec("C:\\QA\\Mcd\\Files\\fileuploadone.exe");
		 * }catch (Exception e) {
		 * 
		 * }
		 */
		// file 2 label
		try {
			String filetwolabelhead = page.filetwolabelmethod();
			String filetwolabelexcel = Excelreader.getData(0, 73, 5);
			if (filetwolabelhead.equals(filetwolabelexcel)) {
				test.pass("TC:35 VERIFY LABEL 'FILE 2' IS DISPLAYYED");
			} else {
				test.fail("TC:35 VERIFY LABEL 'FILE 2' IS NOT DISPLAYYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'FILE 2' IS NOT DISPLAYYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		
		/*// Upload file
				try {
					String fileonelabelhead = page.fileonelabelmethod2();
					//String expectedfile = driver.findElement(By.xpath("//*[@id='describeFile1-one-file']")).getAttribute("value");
					
					if (!fileonelabelhead.equals("")) {
						test.pass("TC:33 VERIFY LABEL 'FILE 1' IS DISPLAYYED");
					} else {
						test.fail("TC:33 VERIFY LABEL 'FILE 1' IS NOT DISPLAYYED");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
								+ "VERIFY LABEL 'FILE 1' IS NOT DISPLAYYED");
					}

				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}*/
		// file 3 label
		try {
			String filethreelabelhead = page.filethreelabelmethod();
			String filethreelabelexcel = Excelreader.getData(0, 74, 5);
			if (filethreelabelhead.equals(filethreelabelexcel)) {
				test.pass("TC:37 VERIFY LABEL 'FILE 3' IS DISPLAYYED");
			} else {
				test.fail("TC:37 VERIFY LABEL 'FILE 3' IS NOT DISPLAYYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'FILE 3' IS NOT DISPLAYYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	
	
	// Upload file
			/*try {
				String fileonelabelhead = page.fileonelabelmethod3();
				//String expectedfile = driver.findElement(By.xpath("//*[@id='describeFile1-one-file']")).getAttribute("value");
				
				if (!fileonelabelhead.equals("")) {
					test.pass("TC:33 VERIFY LABEL 'FILE 1' IS DISPLAYYED");
				} else {
					test.fail("TC:33 VERIFY LABEL 'FILE 1' IS NOT DISPLAYYED");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
							+ "VERIFY LABEL 'FILE 1' IS NOT DISPLAYYED");
				}

			} catch (Exception e) {
				test.fail("Error:" + e.getMessage());
			}*/
	}

	@Test(priority = 17)
	public void First_Name() {
		Core_Trademark_Permission_page page = new Core_Trademark_Permission_page(driver);
		test = extent.createTest("First_Name");

		// TELL US ABOUT YOURSELF
		try {
			String tellusabouthead = page.teluraboutmethod();
			String tellusaboutexcel = Excelreader.getData(0, 76, 5);
			if (tellusabouthead.equals(tellusaboutexcel)) {
				test.pass("TC:39 THE LABEL 'TELL US ABOUT YOURSELF' IS DISPLAYED");
			} else {
				test.fail("TC:39 THE LABEL 'TELL US ABOUT YOURSELF' IS NOT DISPLAYED ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "THE LABEL 'TELL US ABOUT YOURSELF' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// label of first name
		try {
			String firstnamelabehead = page.firstnamelabelmethod();
			String firstnamelabelexcel = Excelreader.getData(0, 77, 5);
			if (firstnamelabehead.equals(firstnamelabelexcel)) {
				test.pass("TC:40 THE TEXT '*FIRST NAME' IS DISPLAYED");
			} else {
				test.fail("TC:40 THE TEXT '*FIRST NAME' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "THE TEXT '*FIRST NAME' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// after click first name label
		try {
			String firstnamelabehead = page.firstnamelabelmethod1();
			String firstnamelabelexcel = Excelreader.getData(0, 77, 5);
			if (firstnamelabehead.equals(firstnamelabelexcel)) {
				test.pass("TC:40 THE TEXT '*FIRST NAME' IS ROLLED UP IN THE SAME PAGE");
			} else {
				test.fail("TC:40 THE TEXT '*FIRST NAME' IS NOT ROLLED UP IN THE SAME PAGE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "THE TEXT '*FIRST NAME' IS NOT ROLLED UP IN THE SAME PAGE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// SPECIAL CHARACTERS
		try {
			String firstnamesendvalexcel = Excelreader.getData(0, 78, 5);
			String sendedvalhead = page.firstnamesendedvaluemethod(firstnamesendvalexcel);
			if (!sendedvalhead.equals(firstnamesendvalexcel)) {
				test.pass("TC:40  USE SHOULD NOT BE SEND SPECIAL CHARACTERS IN FIRSTNAME TEXTBOX");
			} else {
				test.fail("TC:40  USE SHOULD NOT BE SEND SPECIAL CHARACTERS IN FIRSTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USE SHOULD NOT BE SEND SPECIAL CHARACTERS IN FIRSTNAME TEXTBOX");
			}
		} catch (Exception e) {

			test.fail("Error:" + e.getMessage());
		}
		// NUMARICAL VALUES IN FIRST NAME FUNCTION
		try {
			String firstnamesendvalexcel = Excelreader.getData(0, 79, 5);
			String sendedvalhead = page.firstnamesendedvaluemethod(firstnamesendvalexcel);
			if (!sendedvalhead.equals(firstnamesendvalexcel)) {
				test.pass("TC:40  USE SHOULD NOT BE SEND NUMARICAL VALUE IN FIRSTNAME TEXTBOX");
			} else {
				test.fail("TC:40  USE SHOULD NOT BE SEND NUMARICAL VALUE IN FIRSTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USE SHOULD NOT BE SEND NUMARICAL VALUE IN FIRSTNAME TEXTBOX");
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

		// MORE THAN 25 CHARACTERS IN FIRST NAME FUNCTION
		try {
			String firstnamesendvalexcel = Excelreader.getData(0, 81, 5);
			String sendedvalhead = page.firstnamesendedvaluemethod(firstnamesendvalexcel);
			if (!sendedvalhead.equals(firstnamesendvalexcel)) {
				test.pass("TC:46  USE SHOULD NOT BE SEND MORE THAN 25 CHARACTERS  IN FIRSTNAME TEXTBOX");
			} else {
				test.fail("TC:46  USE SHOULD NOT BE SEND MORE THAN 25 CHARACTERS IN FIRSTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USE SHOULD  NOT BE SEND MORE THAN 25 CHARACTERS IN FIRSTNAME TEXTBOX");
			}
		} catch (Exception e) {

			test.fail("Error:" + e.getMessage());
		}

		// ERROR MESSAGE OF FIRST NAME
		try {
			String finameerorhead1 = page.firstnameerror();
			String finamerrorexcel = Excelreader.getData(0, 82, 5);
			if (finameerorhead1.equals(finamerrorexcel)) {
				test.pass("TC:46 'ERROR MESSAGE DISPLAYED' -->" + "'" + finameerorhead1 + "'");
			} else {
				test.fail("TC:46 FIRST NAME FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "FIRST NAME FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 18)
	public void Last_Name() {
		Core_Trademark_Permission_page page = new Core_Trademark_Permission_page(driver);
		test = extent.createTest("Last_Name");

		// LAST NAME LABEL
		try {
			String LNlabelhead = page.lastnamelabelmethod();
			String LNlabelexcel = Excelreader.getData(0, 83, 5);
			if (LNlabelhead.equals(LNlabelexcel)) {
				test.pass("TC:41 THE LABEL 'LAST NAME' IS DISPLAYED");
			} else {
				test.fail("TC:41 THE LABEL 'LAST NAME' IS NOT DISPLAYED ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "THE LABEL 'LAST NAME' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// CLICK AND ROLLED UP THE LAST NAME LABEL

		try {
			String LNlabelhead = page.lastnamelabelmethod1();
			String LNlabelexcel = Excelreader.getData(0, 83, 5);
			if (LNlabelhead.equals(LNlabelexcel)) {
				test.pass("TC:41 THE LABEL 'LAST NAME' IS ROLLED UP  ON LAST NAME FUNCTION");
			} else {
				test.fail("TC:41 THE LABEL 'LAST NAME' IS NOT ROLLED UP ON LAST NAME FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "THE LABEL 'LAST NAME' IS NOT ROLLED UP ON LAST NAME FUNCTION");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// SPECIAL CHARACTERS
		try {
			String LNSPECIALCHARACTER = Excelreader.getData(0, 84, 5);
			String LAscvalue = page.LNsendvaluemethod(LNSPECIALCHARACTER);
			if (!LAscvalue.equals(LNSPECIALCHARACTER)) {
				test.pass("TC:41 USER SHOULD NOT BE SEND SPECIAL CHARACTERS IN LASTNAME TEXTBOX");
			} else {
				test.fail("TC:41 USER SHOULD NOT BE SEND SPECIAL CHARACTERS IN LASTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD NOT BE SEND SPECIAL CHARACTERS IN LASTNAME TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// NUMARICAL IN LAST NAME FUNCTION
		try {
			String LNSPECIALCHARACTER = Excelreader.getData(0, 85, 5);
			String LAscvalue = page.LNsendvaluemethod(LNSPECIALCHARACTER);
			if (!LAscvalue.equals(LNSPECIALCHARACTER)) {
				test.pass("TC:41 USER SHOULD NOT BE SEND NUMARICAL IN LASTNAME TEXTBOX");
			} else {
				test.fail("TC:41 USER SHOULD NOT BE SEND NUMARICAL IN LASTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD NOT BE SEND NUMARICAL IN LASTNAME TEXTBOX");
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

		// MORE THAN 25 CHARACTER IN LAST NAME FUNCTION
		try {
			String LNSPECIALCHARACTER = Excelreader.getData(0, 87, 5);
			String LAscvalue = page.LNsendvaluemethod(LNSPECIALCHARACTER);
			if (!LAscvalue.equals(LNSPECIALCHARACTER)) {
				test.pass("TC:41 USER SHOULD NOT SEND MORE THAN 25 CHARACTERS IN LASTNAME TEXTBOX");
			} else {
				test.fail("TC:41 USER SHOULD NOT SEND MORE THAN 25 CHARACTERS IN LASTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD NOT BE SEND MORE THAN 25 CHARACTERS IN LASTNAME TEXTBOX");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// LAST NAME ERROR MESSAGE
		try {
			String LNerrormess = page.lastnameerrormesmethod();
			String LNerrormesexcel = Excelreader.getData(0, 88, 5);
			if (LNerrormess.equals(LNerrormesexcel)) {
				test.pass("TC:41 'ERROR MESSAGE DISPLAYED' -->" + "'" + LNerrormess + "'");
			} else {
				test.fail("TC:41 LAST NAME FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "LAST NAME FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 19)
	public void Address_Usonly() {
		Core_Trademark_Permission_page page = new Core_Trademark_Permission_page(driver);
		test = extent.createTest("Address_Usonly");

		// ADDRESS(US ONLY)
		try {
			String addresslabelhead = page.addresslabelmethod();
			String addresslabelexcel = Excelreader.getData(0, 89, 5);
			if (addresslabelhead.equals(addresslabelexcel)) {
				test.pass("TC:42 THE LABEL 'ADDRESS(US ONLY)' IS DISPLAYED");
			} else {
				test.fail("TC:42 THE LABEL 'ADDRESS(US ONLY)' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "THE LABEL 'ADDRESS(US ONLY)' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// CLICK ON ADDRESS(US ONLY) AND CHECK LABES rolled up or not
		try {
			String addresslabelhead = page.addresslabelmethod1();
			String addresslabelexcel = Excelreader.getData(0, 89, 5);
			if (addresslabelhead.equals(addresslabelexcel)) {
				test.pass("TC:42 THE LABEL 'ADDRESS(US ONLY)' IS ROLLED UP AFTE CLICK ON ADDRESS TEXT");
			} else {
				test.fail("TC:42 THE LABEL 'ADDRESS(US ONLY)' IS NOT ROLLED UP AFTE CLICK ON ADDRESS TEXT");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "THE LABEL 'ADDRESS(US ONLY)' IS NOT ROLLED UP AFTE CLICK ON ADDRESS TEXT");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// special characters
		try {
			String addressspecharacterhead = Excelreader.getData(0, 90, 5);
			String adsccnvalue = page.addresssendedvaluemethod(addressspecharacterhead);
			if (!adsccnvalue.equals(addressspecharacterhead)) {
				test.pass("TC:42 USER SHOULD NOT SEND SPECIAL CHARACTERS IN ADDRESS TEXTBOX");
			} else {
				test.fail("TC:42 USER SHOULD NOT SEND SPECIAL CHARACTERS IN ADDRESS TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD NOT SEND SPECIAL CHARACTERS IN ADDRESS TEXTBOX");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// NUMARICAL AND CHARACTERS SEND IN ADDRESS US(ONLY)

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
		// MORE THAN 40 CHARACTERS IN ADDRESS US

		try {
			String addressspecharacterhead = Excelreader.getData(0, 92, 5);
			String adsccnvalue = page.addresssendedvaluemethod(addressspecharacterhead);
			if (!adsccnvalue.equals(addressspecharacterhead)) {
				test.pass("TC:42 USER SHOULD NOT SEND MORE THAN 40 NUMARICAL AND CHARACTERS IN ADDRESS TEXTBOX");
			} else {
				test.fail("TC:42 USER SHOULD NOT SEND MORE THAN 40 NUMARICAL AND CHARACTERS IN ADDRESS TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD NOT SEND MORE THAN 40 NUMARICAL AND CHARACTERS IN ADDRESS TEXTBOX");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE OF ADDRESSS US(ONLY)
		try {
			String addresserrormessage = page.addresserrormessagemethod();
			String addresserrormessexcel = Excelreader.getData(0, 93, 5);
			if (addresserrormessage.equals(addresserrormessexcel)) {
				test.pass("ADDRESS(US ONLY) FUNCTION 'ERROR MESSAGE DISPLAYED' -->" + "'" + addresserrormessage + "'");
			} else {
				test.fail("ADDRESS(US ONLY) FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "ADDRESS(US ONLY) FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 20)
	public void Apt_Suite() {
		Core_Trademark_Permission_page page = new Core_Trademark_Permission_page(driver);
		test = extent.createTest("Apt_Suite");
		// LABEL OF APT/SUITE
		try {
			String aptsuitelabelhead = page.apisitelabelmethod();
			String aptsuitelabelexcel = Excelreader.getData(0, 94, 5);
			if (aptsuitelabelhead.equals(aptsuitelabelexcel)) {
				test.pass("TC:43 THE LABEL 'APT/SUITE' IS DISPLAYED ");
			} else {
				test.fail("TC:43 THE LABEL 'APT/SUITE' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "THE LABEL 'APT/SUITE' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// CLICK ON APT/SUITE AND ROLLED UP THE LABEL

		try {
			String aptsuitelabelhead = page.apisitelabelmethod1();
			String aptsuitelabelexcel = Excelreader.getData(0, 94, 5);
			if (aptsuitelabelhead.equals(aptsuitelabelexcel)) {
				test.pass("TC:43 THE LABEL 'APT/SUITE' IS ROLLED UP AFTER CLICK");
			} else {
				test.fail("TC:43 THE LABEL 'APT/SUITE' IS NOT ROLLED UP AFTER CLICK");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "THE LABEL 'APT/SUITE' IS NOT ROLLED UP AFTER CLICK");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// SPECIAL CHARACTER IN APT SUITE
		try {
			String apisuitespecialcharecter = Excelreader.getData(0, 95, 5);
			String suitesh = page.aptsuitesendedvaluermethod(apisuitespecialcharecter);
			if (!suitesh.equals(apisuitespecialcharecter)) {
				test.pass("TC:43 USER SHOULD NOT SEND SPECIAL CHARACTERS IN APT/SUITE TEXTBOX");
			} else {
				test.fail("TC:43 USER SHOULD NOT SEND SPECIAL CHARACTERS IN APT/SUITE TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD NOT SEND SPECIAL CHARACTERS IN APT/SUITE TEXTBOX");
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

		// MORE THAN 40 CHARACTERS IN APT SUITE

		try {
			String apisuitespecialcharecter = Excelreader.getData(0, 97, 5);
			String suitesh = page.aptsuitesendedvaluermethod(apisuitespecialcharecter);
			if (!suitesh.equals(apisuitespecialcharecter)) {
				test.pass("TC:43 USER SHOULD NOT SEND MORE THAN 40 NUMARICAL AND CHARACTERS IN APT/SUITE TEXTBOX");
			} else {
				test.fail("TC:43 USER SHOULD NOT SEND MORE THAN 40 NUMARICAL AND CHARACTERS IN APT/SUITE TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD NOT SEND MORE THAN NUMARICAL AND CHARACTERS IN APT/SUITE TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 21)
	public void City() {
		Core_Trademark_Permission_page page = new Core_Trademark_Permission_page(driver);
		test = extent.createTest("City");
		// label of citys
		try {
			String citylabelhead = page.citylabelmethod();
			String citylabelexcel = Excelreader.getData(0, 98, 5);
			if (citylabelhead.equals(citylabelexcel)) {
				test.pass("TC:44 THE LABEL 'CITY' IS DISPLAYED ");
			} else {
				test.fail("TC:44 THE LABEL 'CITY' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "THE LABEL 'CITY' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// after click on city text and rolled up label

		try {
			String citylabelhead = page.citylabelmethod1();
			String citylabelexcel = Excelreader.getData(0, 98, 5);
			if (citylabelhead.equals(citylabelexcel)) {
				test.pass("TC:44 THE LABEL 'CITY' IS ROLLED UP AFTER CLICK ON CLITY TEXT ");
			} else {
				test.fail("TC:44 THE LABEL 'CITY' IS NOT ROLLED UP AFTER CLICK ON CLITY TEXT");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "THE LABEL 'CITY' IS NOT ROLLED UP AFTER CLICK ON CLITY TEXT");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// special characters
		try {
			String cityspecialcharcters = Excelreader.getData(0, 99, 5);
			String citySCenteredvalue = page.citysendedvaluemethod(cityspecialcharcters);
			if (!citySCenteredvalue.equals(cityspecialcharcters)) {
				test.pass("TC:44 USER SHOULD NOT SEND SPECIAL CHARACTERS IN CITY TEXTBOX");
			} else {
				test.fail("TC:44 USER SHOULD NOT SEND SPECIAL CHARACTERS IN CITY TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD NOT SEND SPECIAL CHARACTERS IN CITY TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// numerical
		try {
			String citynumaricalexcel = Excelreader.getData(0, 100, 5);
			String citySCenteredvalue = page.citysendedvaluemethod(citynumaricalexcel);
			if (!citySCenteredvalue.equals(citynumaricalexcel)) {
				test.pass("TC:44 USER SHOULD NOT SEND NUMERICAL IN CITY TEXTBOX");
			} else {
				test.fail("TC:44 USER SHOULD NOT SEND NUMERICAL IN CITY TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD NOT SEND NUMERICAL IN CITY TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// CHARACTERS
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

		// MORE THAN 30 CHARACTERS

		try {
			String citymorethan30excel = Excelreader.getData(0, 102, 5);
			String citySCenteredvalue = page.citysendedvaluemethod(citymorethan30excel);
			if (!citySCenteredvalue.equals(citymorethan30excel)) {
				test.pass("TC:44 USER SHOULD  SEND MORE THAN 30 CHARACTERS IN CITY TEXTBOX");
			} else {
				test.fail("TC:44 USER SHOULD SEND MORE THAN 30 CHARACTERS IN CITY TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD SEND MORE THAN 30 CHARACTERS IN CITY TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// error message of city

		try {
			String cityerrormessagehead = page.cityerromessagemethod();
			String cityerrormessageexcel = Excelreader.getData(0, 103, 5);
			if (cityerrormessagehead.equals(cityerrormessageexcel)) {
				test.pass("TC:44  CITY 'ERROR MESSAGE DISPLAYED' -->" + "'" + cityerrormessagehead + "'");
			} else {
				test.fail("TC:44  CITY FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "CITY FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 22)
	public void State() {
		Core_Trademark_Permission_page page = new Core_Trademark_Permission_page(driver);
		test = extent.createTest("State");

		// label of State
		try {
			String statelabelhead = page.statelabelmethod();
			String staelabelexcel = Excelreader.getData(0, 104, 5);
			if (statelabelhead.equals(staelabelexcel)) {
				test.pass("TC:45 THE LABEL 'STATE' IS DISPLAYED ");
			} else {
				test.fail("TC:45 THE LABEL 'STATE' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "THE LABEL 'STATE' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK ON STATE AND LABEL IS ROLLED UP OR NOT
		try {
			String statelabelhead = page.statelabelmethod1();
			String staelabelexcel = Excelreader.getData(0, 104, 5);
			if (statelabelhead.equals(staelabelexcel)) {
				test.pass("TC:45 THE LABEL 'STATE' IS ROLLED UP AFTER CLICK ON STATE FUNCTION ");
				// select drop down values of state function
				String statedropdownvaluehead = page.stateselecteddropdownvalmethod();
				String statedropdownvalueEXCEL = Excelreader.getData(0, 106, 5);
				if (statedropdownvaluehead.equals(statedropdownvalueEXCEL)) {
					test.pass("TC:45 USER SHOULD BE SELECTED STATE DROP DOWN VALUE");
				} else {
					test.fail("TC:45 USER SHOULD BE SELECTED STATE DROP DOWN VALUE");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
							+ "USER SHOULD BE SELECTED STATE DROP DOWN VALUE");
				}
			} else {
				test.fail("TC:45 THE LABEL 'STATE' IS ROLLED UP AFTER CLICK ON STATE FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "THE LABEL 'STATE' IS ROLLED UP AFTER CLICK ON STATE FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// click on submit and catch error message of state
		try {
			String stateerrormessahead = page.stateerrormessagemethod();
			String stateerrormessexcel = Excelreader.getData(0, 105, 5);
			if (stateerrormessahead.equals(stateerrormessexcel)) {
				test.pass("TC:45 STATE 'ERROR MESSAGE DISPLAYED' -->" + "'" + stateerrormessahead + "'");
			} else {
				test.fail("TC:45 STATE FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "STATE FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 23)
	public void Zip() {
		Core_Trademark_Permission_page page = new Core_Trademark_Permission_page(driver);
		test = extent.createTest("Zip");

		// label of Zip
		try {
			String ziplabelhead = page.ziplabelmethod();
			String ziplabelexcel = Excelreader.getData(0, 107, 5);
			if (ziplabelhead.equals(ziplabelexcel)) {
				test.pass("TC:46 THE LABEL 'ZIP' IS DISPLAYED ");
			} else {
				test.fail("TC:46 THE LABEL 'ZIP' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "THE LABEL 'ZIP' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK ON zip AND LABEL IS ROLLED UP OR NOT
		try {
			String ziplabelhead = page.ziplabelmethod1();
			String ziplabelexcel = Excelreader.getData(0, 107, 5);
			if (ziplabelhead.equals(ziplabelexcel)) {
				test.pass("TC:46 THE LABEL 'ZIP' IS ROLLED UP AFTER CLICK ON ZIP FUNCTION");
			} else {
				test.fail("TC:46 THE LABEL 'ZIP' IS NOT ROLLED UP AFTER CLICK ON ZIP FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "THE LABEL 'ZIP' IS NOT ROLLED UP AFTER CLICK ON ZIP FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// CHARACTER
		try {
			String zipsendedvaluesexcel = Excelreader.getData(0, 108, 5);
			String zipsendedvalueshead = page.zipsendedvaluermethod(zipsendedvaluesexcel);
			if (!zipsendedvalueshead.equals(zipsendedvaluesexcel)) {
				test.pass("TC:46 USER SHOULD NOT ENTERD CHARACTERS IN ZIP TEXTBOX");
			} else {

				test.fail("TC:46 USER SHOULD NOT ENTERD CHARACTERS IN ZIP TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD NOT ENTERD CHARACTERS IN ZIP TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// SPECIAL CHARACTERS
		try {
			String zipsendedvaluesexcel = Excelreader.getData(0, 109, 5);
			String zipsendedvalueshead = page.zipsendedvaluermethod(zipsendedvaluesexcel);
			if (!zipsendedvalueshead.equals(zipsendedvaluesexcel)) {
				test.pass("TC:46 USER SHOULD NOT ENTERD SPECIAL CHARACTERS IN ZIP TEXTBOX");
			} else {

				test.fail("TC:46 USER SHOULD NOT ENTERD SPECIAL CHARACTERS IN ZIP TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD NOT ENTERD SPECIAL CHARACTERS IN ZIP TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// NUMERICAL

		try {
			String zipsendedvaluesexcel = Excelreader.getData(0, 110, 5);
			String zipsendedvalueshead = page.zipsendedvaluermethod(zipsendedvaluesexcel);
			if (zipsendedvalueshead.equals(zipsendedvaluesexcel)) {
				test.pass("TC:46 USER SHOULD ENTERD 5 NUMERICAL IN ZIP TEXTBOX");
			} else {
				test.fail("TC:46 USER SHOULD ENTERD 5 NUMERICAL IN ZIP TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD ENTERD 5 NUMERICAL IN ZIP TEXTBOX");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// MORE THAN 5 NUMERICAL
		try {
			String zipsendedvaluesexcel = Excelreader.getData(0, 111, 5);
			String zipsendedvalueshead = page.zipsendedvaluermethod(zipsendedvaluesexcel);
			if (!zipsendedvalueshead.equals(zipsendedvaluesexcel)) {
				test.pass("TC:46 USER SHOULD NOT ENTERD MORE THAN 5 NUMERICAL IN ZIP TEXTBOX");
			} else {

				test.fail("TC:46 USER SHOULD NOT ENTERD MORE THAN 5 NUMERICAL IN ZIP TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD NOT ENTERD MORE THAN 5 NUMERICAL IN ZIP TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// LESS THAN 5 NUMERICAL
		try {
			String zipsendedvaluesexcel = Excelreader.getData(0, 112, 5);
			page.zipcharactermethod(zipsendedvaluesexcel);
			String ziperrormessagehead = page.ziperrormessagemethod1();
			String ziperrormessageexcel = Excelreader.getData(0, 113, 5);
			if (ziperrormessagehead.equals(ziperrormessageexcel)) {
				test.pass("TC:46  ENTER LESS THAN 5 NUMERICAL AND SUBMIT 'ERROR MESSAGE DISPLAYED' -->" + "'"
						+ ziperrormessagehead + "'");
			} else {
				test.fail("TC:46  ENTER LESS THAN 5 NUMERICAL AND SUBMIT 'ERROR MESSAGE SHOULD DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "ENTER LESS THAN 5 NUMERICAL AND SUBMIT 'ERROR MESSAGE SHOULD DISPLAYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// ERROR MESSAGE
		try {
			String ziperrormessagehead = page.ziperrormessagemethod();
			String ziperrormessageexcel = Excelreader.getData(0, 113, 5);
			if (ziperrormessagehead.equals(ziperrormessageexcel)) {
				test.pass("TC:46 'ERROR MESSAGE DISPLAYED' -->" + "'" + ziperrormessagehead + "'");
			} else {
				test.fail("TC:46 ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "ERROR MESSAGE IS NOT DISPLAYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 24)
	public void Email() {
		Core_Trademark_Permission_page page = new Core_Trademark_Permission_page(driver);
		test = extent.createTest("Email");

		// label of mail
		try {
			String emaillabelhead = page.emaillabelmethod();
			String emaillabelexcel = Excelreader.getData(0, 114, 5);
			if (emaillabelhead.equals(emaillabelexcel)) {
				test.pass("TC:47 THE LABEL 'EMAIL' IS DISPLAYED ");
			} else {
				test.fail("TC:47 THE LABEL 'EMAIL' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "THE LABEL 'EMAIL' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK ON mail AND LABEL IS ROLLED UP OR NOT
		try {
			String emaillabelhead = page.emaillabelmethod1();
			String emaillabelexcel = Excelreader.getData(0, 114, 5);
			if (emaillabelhead.equals(emaillabelexcel)) {
				test.pass("TC:47 THE LABEL 'EMAIL' IS ROLLED UP AFTER CLICK ON EMAIL FUNCTION");
			} else {
				test.fail("TC:47 THE LABEL 'EMAIL' IS NOT ROLLED UP AFTER CLICK ON EMAIL FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "THE LABEL 'EMAIL' IS NOT ROLLED UP AFTER CLICK ON EMAIL FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// WITH OUT .COM FORMAT
		try {
			String emailsendid = Excelreader.getData(0, 115, 5);
			String emailvlue = page.mailsendmethod(emailsendid);
			if (emailvlue.equals(emailsendid)) {
				test.pass("TC:47  USER ABEL TO SEND MAIL WITH OUR FORMAT(.COM) IN MAIL TEXTBOX");
				String mailerrormessagehead = page.emailerrormessagemethod();
				String mailerrormessageexcel = Excelreader.getData(0, 118, 5);
				if (mailerrormessagehead.equals(mailerrormessageexcel)) {
					test.pass("TC:47 WITH OUR FORMAT(.COM) 'ERROR MESSAGE DISPLAYED' -->" + "'" + mailerrormessagehead
							+ "'");
				} else {
					test.fail("TC:47  WITH OUR FORMAT(.COM) MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
							+ "WITH OUR FORMAT(.COM) MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				}
			} else {
				test.fail("TC:47 USER ABEL TO SEND MAIL WITH OUR FORMAT(.COM) IN MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER ABEL TO SEND MAIL WITH OUR FORMAT(.COM) IN MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// WITH OUT @GAMIL

		try {
			String emailsendid = Excelreader.getData(0, 116, 5);
			String emailvlue = page.mailsendmethod(emailsendid);
			if (emailvlue.equals(emailsendid)) {
				test.pass("TC:47  USER ABEL TO SEND MAIL WITH OUR FORMAT(@GAMIL) IN MAIL TEXTBOX");
				String mailerrormessagehead = page.emailerrormessagemethod();
				String mailerrormessageexcel = Excelreader.getData(0, 118, 5);
				if (mailerrormessagehead.equals(mailerrormessageexcel)) {
					test.pass("TC:47 WITH OUR FORMAT(@GAMIL) 'ERROR MESSAGE DISPLAYED' -->" + "'" + mailerrormessagehead
							+ "'");
				} else {
					test.fail("TC:47  WITH OUR FORMAT(@GAMIL) MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
							+ "WITH OUR FORMAT(@GAMIL) MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				}
			} else {
				test.fail("TC:47 USER ABEL TO SEND MAIL WITH OUR FORMAT(@GAMIL) IN MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER ABEL TO SEND MAIL WITH OUR FORMAT(@GAMIL) IN MAIL TEXTBOX");
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
				String mailerrormessagehead = page.emailerrormessagemethod();
				String mailerrormessageexcel = Excelreader.getData(0, 118, 5);
				if (!mailerrormessagehead.equals(mailerrormessageexcel)) {
					test.pass("TC:47 WITH FORMAT 'ERROR MESSAGE IS NOT DISPLAYED'");
				} else {
					test.fail("TC:47  WITH FORMAT MAIL FUNCTION ERROR MESSAGE  DISPLAYED--->" + "'"
							+ mailerrormessagehead + "'");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
							+ "WITH FORMAT MAIL FUNCTION ERROR MESSAGE  DISPLAYED");
				}
			} else {
				test.fail("TC:47 USER SHOULD SEND MAIL WITH FORMAT IN MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD SEND MAIL WITH FORMAT IN MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE
		try {
			String mailerrormessagehead = page.emailerrormessagemethod1();
			String mailerrormessageexcel = Excelreader.getData(0, 118, 5);
			if (mailerrormessagehead.equals(mailerrormessageexcel)) {
				test.pass("TC:47 'ERROR MESSAGE DISPLAYED' -->" + "'" + mailerrormessagehead + "'");
			} else {
				test.fail("TC:47  MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 25)
	public void Confirm_Email() {
		Core_Trademark_Permission_page page = new Core_Trademark_Permission_page(driver);
		test = extent.createTest("Confirm Email");
		// label of confirm_email
		try {
			String conmaillabelhead = page.confirmmaillabelmethod();
			String conmaillabelexcel = Excelreader.getData(0, 119, 5);
			if (conmaillabelhead.equals(conmaillabelexcel)) {
				test.pass("TC:48 THE LABEL 'CONFIRM EMAIL' IS DISPLAYED ");
			} else {
				test.fail("TC:48 THE LABEL 'CONFIRM EMAIL' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "THE LABEL 'CONFIRM EMAIL' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK ON confirm_email AND LABEL IS ROLLED UP OR NOT
		try {
			String conmaillabelhead = page.confirmmaillabelmethod1();
			String conmaillabelexcel = Excelreader.getData(0, 119, 5);
			if (conmaillabelhead.equals(conmaillabelexcel)) {
				test.pass("TC:48 THE LABEL 'CONFIRM EMAIL' IS ROLLED UP AFTER CLICK ON CONFIRM EMAIL FUNCTION");
			} else {
				test.fail("TC:48 THE LABEL 'CONFIRM EMAIL' IS NOT ROLLED UP AFTER CLICK ON CONFIRM EMAIL FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "THE LABEL 'CONFIRM EMAIL' IS NOT ROLLED UP AFTER CLICK ON CONFIRM EMAIL FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send DIFFERENT IDS IN mail AND CONFIRM function
		try {
			String emailsendid = Excelreader.getData(0, 117, 5);
			page.mailsendmethod1(emailsendid);
			String confirmmailsend = Excelreader.getData(0, 120, 5);
			String conmailsendvalue = page.confirmmailsendidmethod(confirmmailsend);
			if (conmailsendvalue.equals(confirmmailsend)) {
				test.pass("TC:48  USER SHOULD SEND MAIL IN CONFIRM MAIL TEXTBOX");
				String confirmmailerrormesshead = page.confirmmailerrormessmethod();
				String confirmmailerrormessexcel = Excelreader.getData(0, 122, 5);
				if (confirmmailerrormesshead.equals(confirmmailerrormessexcel)) {
					test.pass("TC:48 USER SHOULD SEND SAME IDS IN MAIL AND CONFIRM MAIL 'ERROR MESSAGE DISPLAYED' -->"
							+ "'" + confirmmailerrormesshead + "'");
				} else {
					test.fail("TC:48 USER SHOULD SEND SAME IDS IN MAIL AND CONFIRM MAIL");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
							+ "USER SHOULD SEND SAME IDS IN MAIL AND CONFIRM MAIL");
				}

			} else {
				test.fail("TC:48 USER SHOULD SEND MAIL IN CONFIRM MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD SEND MAIL IN CONFIRM MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// ERROR MESSAGE WITH BLANK
		try {
			String confirmmailerrormesshead = page.confirmmailerrormessmethod1();
			String confirmmailerrormessexcel = Excelreader.getData(0, 122, 5);
			if (confirmmailerrormesshead.equals(confirmmailerrormessexcel)) {
				test.pass("TC:48 'ERROR MESSAGE DISPLAYED' -->" + "'" + confirmmailerrormesshead + "'");
			} else {
				test.fail("TC:48 CONFIRM MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "CONFIRM MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 26)
	public void Phone_Number() {
		Core_Trademark_Permission_page page = new Core_Trademark_Permission_page(driver);
		test = extent.createTest("Phone_Number");

		// phone number label
		try {
			String phonenumberlabelhead = page.phonenumberlabelmethod();
			String phonenumberlabelexcel = Excelreader.getData(0, 123, 5);
			if (phonenumberlabelhead.equals(phonenumberlabelexcel)) {
				test.pass("TC:49 THE LABEL 'PHONE NUMBER' IS DISPLAYED ");
			} else {
				test.fail("TC:49 THE LABEL 'PHONE NUMBER' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "THE LABEL 'PHONE NUMBER' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK ON phone number AND LABEL IS ROLLED UP OR NOT
		try {
			String phonenumberlabelhead = page.phonenumberlabelmethod1();
			String phonenumberlabelexcel = Excelreader.getData(0, 123, 5);
			if (phonenumberlabelhead.equals(phonenumberlabelexcel)) {
				test.pass("TC:49 THE LABEL 'PHONE NUMBER' IS ROLLED UP AFTER CLICK ON PHONE NUMBER FUNCTION");
			} else {
				test.fail("TC:49 THE LABEL 'PHONE NUMBER' IS NOT ROLLED UP AFTER CLICK ON PHONE NUMBER FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "THE LABEL 'PHONE NUMBER' IS NOT ROLLED UP AFTER CLICK ON PHONE NUMBER FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// characters
		try {
			String phonecharacterhead = Excelreader.getData(0, 124, 5);
			String phonenumCenteredval = page.phonenumbersendmethod(phonecharacterhead);
			if (!phonenumCenteredval.equals(phonecharacterhead)) {
				test.pass("TC:49 USER SHOULD NOT SEND CHARACTER IN PHONE NUMBER TEXTBOX ");
			} else {
				test.fail("TC:49 USER SHOULD NOT SEND CHARACTER IN PHONE NUMBER TEXTBOX ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD NOT SEND CHARACTER IN PHONE NUMBER TEXTBOX ");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// SPECIAL CHARECTER
		try {
			String phonecharacterhead = Excelreader.getData(0, 125, 5);
			String phonenumCenteredval = page.phonenumbersendmethod(phonecharacterhead);
			if (!phonenumCenteredval.equals(phonecharacterhead)) {
				test.pass("TC:49 USER SHOULD NOT SEND SPECIAL CHARACTER IN PHONE NUMBER TEXTBOX ");
			} else {
				test.fail("TC:49 USER SHOULD NOT SEND SPECIAL CHARACTER IN PHONE NUMBER TEXTBOX ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD NOT SEND SPECIAL CHARACTER IN PHONE NUMBER TEXTBOX ");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// more than 10 numerical
		try {
			String phonecharacterhead = Excelreader.getData(0, 127, 5);
			String phonenumCenteredval = page.phonenumbersendmethod(phonecharacterhead);
			if (!phonenumCenteredval.equals(phonecharacterhead)) {
				test.pass("TC:49 USER SHOULD NOT SEND MORE THAN 10 NUMERICAL IN PHONE NUMBER TEXTBOX ");
			} else {
				test.fail("TC:49 USER SHOULD NOT SEND MORE THAN 10 NUMERICAL IN PHONE NUMBER TEXTBOX ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "USER SHOULD NOT SEND MORE THAN 10 IN PHONE NUMBER TEXTBOX ");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ENTER 10 NUMERICAL
		try {
			String phonecharacterhead = Excelreader.getData(0, 128, 5);
			String phonenumCenteredval = page.phonenumbersendmethod(phonecharacterhead);
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

		// LESS THAN 10 NUMERICAL
		try {
			String phonecharacterhead = Excelreader.getData(0, 126, 5);
			String phonenumbererrormessagehead = page.phonenumbererrormessagemethod(phonecharacterhead);
			String phonenumbererrormessageexcel = Excelreader.getData(0, 129, 5);
			if (phonenumbererrormessagehead.equals(phonenumbererrormessageexcel)) {
				test.pass("TC:49 AFTER LESS THAN 10 NUMERICAL  'ERROR MESSAGE DISPLAYED' -->" + "'"
						+ phonenumbererrormessagehead + "'");
			} else {
				test.fail("TC:49 PHONE NUMBER FUNCTION ERROR MESSAGE IS NOT DISPLAYED AFTER LESS THAN 10 NUMERICAL ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "PHONE NUMBER FUNCTION ERROR MESSAGE IS NOT DISPLAYED AFTER LESS THAN 10 NUMERICAL");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE
		try {
			String phonenumbererrormessagehead = page.phonenumbererrormessagemethod1();
			String phonenumbererrormessageexcel = Excelreader.getData(0, 129, 5);
			if (phonenumbererrormessagehead.equals(phonenumbererrormessageexcel)) {
				test.pass("TC:49 PHONE NUMBER 'ERROR MESSAGE DISPLAYED' -->" + "'" + phonenumbererrormessagehead + "'");
			} else {
				test.fail("TC:49 PHONE NUMBER FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "PHONE NUMBER FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}
	
	@Test(priority = 27)
	public void Global_Error_Message_TMP() {
		Core_Trademark_Permission_page page = new Core_Trademark_Permission_page(driver);
		test = extent.createTest("Global_Error_Message_TMP");
		
		// 18 global error message
		try {
			String totalerrohead = page.totalerromessagemethod();
			String totalerroexcel = Excelreader.getData(0, 134, 5);
			if (totalerrohead.equals(totalerroexcel)) {
				test.pass("'17 GLOBAL ERROR MESSAGE DISPLAYED' -->" + "'" + totalerrohead + "'");
			} else {
				test.fail("TC: 17 GLOBAL ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "17 GLOBAL ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 28)
	public void By_Selecting_Submit() {
		Core_Trademark_Permission_page page = new Core_Trademark_Permission_page(driver);
		test = extent.createTest("By_Selecting_Submit");

		// BY SELECTING SUBMIT... LABEL
		try {
			String byselectsubmithead = page.byselectingsubmitmethod();
			String buselectsubmitexcel = Excelreader.getData(0, 130, 5);
			if (!byselectsubmithead.equals(buselectsubmitexcel)) {
				test.pass("TC:51 VERIF LABEL 'MY SELECTING SUBMIT....' IS DISPLAYED");
			} else {
				test.fail("TC:51 VERIF LABEL 'MY SELECTING SUBMIT....' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIF LABEL 'MY SELECTING SUBMIT....' IS NOT DISPLAYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// WE MAY CONTACT LABEL
		try {
			String wemaycontacthead = page.wemaycontactlabelmethod();
			String wemaycontactexcel = Excelreader.getData(0, 131, 5);
			if (wemaycontacthead.equals(wemaycontactexcel)) {
				test.pass("TC:52 VERIFY LABEL 'WE MAY CONTACT ...' IS DISPLAYED");
			} else {
				test.fail("TC:52 VERIFY LABEL 'WE MAY CONTACT....' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "VERIFY LABEL 'WE MAY CONTACT....' IS NOT DISPLAYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// privacypolicy

		try {
			page.privacypolicyclickmethod();
			page.windowhandles();
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 132, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC: PRIVACY POLICY LINK IS WORKING FINE");
			} else {
				test.fail("TC: PRIVACY POLICY LINK IS NOT WORKING FINE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Trademark_Permission"))
						+ "PRIVACY POLICY LINK IS WORKING FINE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	

	

	/*@Test(priority = 29)
	public void Positive_scenario_Trademark_Permission() {
		Core_Trademark_Permission_page page = new Core_Trademark_Permission_page(driver);
		test = extent.createTest("Positive_scenario_Trademark_Permission");
		try {
			driver.get(Basepage.readProperty("urlT"));

			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
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
			}*/

}

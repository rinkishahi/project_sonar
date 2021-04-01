package com.Mcd.qa.TestCases;

import java.io.File;
import java.io.IOException;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.McD.qa.Base.BaseTest;
import com.McD.qa.Extentreport.Extentreport;
import com.McD.qa.Pages.Basepage;
import com.McD.qa.Pages.General_Inqure_Page;
import com.McD.qa.Pages.Restaurant_feedback_page;
import com.McD.qa.Pages.Mobile_App_Feedback_Page;
import com.McD.qa.Utility.TestUtil;

public class Mobile_App_Feedback extends BaseTest {

	String excelptha = System.getProperty("user.dir");
	TestUtil Excelreader = new TestUtil(excelptha + "/src/main/java/com/McD/qa/TestData/Mobile_App_Feedback.xls");

	@Test(priority = 1)
	public void Open_URLB() {
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		test = extent.createTest("Open_URLB");

		try {
			driver.get(Basepage.readProperty("urlB"));
			// Thread.sleep(3000);
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");

			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
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
	public void Mobile_App_Feedback_Label() {
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		test = extent.createTest("Mobile_App_Feedback_Label");

		// Mobile App Feedback LABEL
		try {
			String restaurantlabelhead = page.Restaurantlabelmethod();
			String restaurantlabelexcel = Excelreader.getData(0, 2, 5);
			if (restaurantlabelhead.equals(restaurantlabelexcel)) {
				test.pass("TC:3 VERIFY LABEL 'MOBILE APP FEEDBACK' IS DISPLAYED");

			} else {
				test.fail("TC:3 VERIFY LABEL 'MOBILE APP FEEDBACK' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "VERIFY LABEL 'MOBILE APP FEEDBACK' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// tell us about your mobile and select restaurant feedback labels
		try {
			String tellusaboutlabelhead = page.tellusaboutlabelmethod();
			String tellusaboutlabelexcel = Excelreader.getData(0, 3, 5);
			if (tellusaboutlabelhead.equals(tellusaboutlabelexcel)) {
				test.pass("TC:4 VERIFY LABEL 'TELL US ABOUT YOUR MOBILE.......' IS DISPLAYED");

			} else {
				test.fail("TC:4 VERIFY LABEL 'TELL US ABOUT YOUR MOBILE.......' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "VERIFY LABEL 'TELL US ABOUT YOUR MOBILE.......' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// restaurant feedback labels
		try {
			String selectrestaurantlabelhead = page.selectrestaurantlabelmethod();
			String selectrestaurantlabelexcel = Excelreader.getData(0, 4, 5);
			if (selectrestaurantlabelhead.equals(selectrestaurantlabelexcel)) {
				test.pass("TC:4 VERIFY LABEL 'SELECT RESTAURANT FEEDBACK.......' IS DISPLAYED");

			} else {
				test.fail("TC:4 VERIFY LABEL 'SELECT RESTAURANT FEEDBACK.......' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "VERIFY LABEL 'SELECT RESTAURANT FEEDBACK.......' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 3)
	public void Pick_Different_topic_Dropdown() throws Exception {
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		test = extent.createTest("MPick_Different_topic_Dropdown");

		// GO BUTTON is enable or not
		try {
			page.Gobuttonena();
			test.pass("TC:6 GO BUTTON IS ENABLE AND DISPLAYED");

			// General inquiry
			try {
				String generealdropdownhead = page.Generaldropdownvalmethod(); // click and drop down value is display
																				// or
				String generealdropdownexcel = Excelreader.getData(0, 5, 5);
				if (generealdropdownhead.equals(generealdropdownexcel)) {
					test.pass("TC: THE DROPDWON 'PICK A DIFFERENT TOPIC' SHOULD BE CLICKABLE");
					/*// page.generaldropdownselectmethod();
					String generealdropdownhead1 = page.GeneralgetAtrributeValuemethod();
					String generealdropdownexcel1 = Excelreader.getData(0, 5, 5);
					if (generealdropdownhead1.equals(generealdropdownexcel1)) {
						test.pass("TC: USER SHOULD BE SELECT 'GENERAL INQUIRY' OPTION");*/
						String gettitle = page.generallgetpagetitlemethod1();
						String gettitleexcel = Excelreader.getData(0, 6, 5);
						if (gettitle.equals(gettitleexcel)) {
							test.pass(
									"TC: THE PAGE 'GENERAL INQUIRY' PAGE IS TRIGGERED AND DISPLAYED IN THE SAME PAGE");
							test.pass("TC: USER ABLE TO CLICK ON 'GO' BUTTON");
							driver.navigate().back();
						} else {
							test.fail(
									"TC: THE PAGE 'GENERAL INQUIRY' PAGE IS NOT TRIGGERED AND DISPLAYED IN THE SAME PAGE");
							test.fail(test
									.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
									+ "HEADING 'GENERAL INQUIRY' IS NOT TRIGGERED");
							driver.navigate().back();
						}

					/*} else {
						test.fail("TC: USER SHOULD BE SELECT 'GENERAL INQUIRY' OPTION");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "USER SHOULD BE SELECT 'GENERAL INQUIRY' OPTION");
					}*/
				} else {
					test.fail("TC: THE DROPDWON 'PICK A DIFFERENT TOPIC' SHOULD BE CLICKABLE");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
							+ "DROPDOWN FIELD 'GENERAL INQUIRY' IS NOT CLICKABLE");
				}
			} catch (Exception e) {
				test.fail("Error:" + e.getMessage());
			}

			// Restaurant feedback

			try {
				String restaurantdropdownhead = page.restarentdropdownlabelmethod(); // click and drop down value is
																						// display
				String restaurantdropdownexcel = Excelreader.getData(0, 7, 5);
				if (restaurantdropdownhead.equals(restaurantdropdownexcel)) {
					test.pass("TC: THE DROPDWON 'PICK A DIFFERENT TOPIC' SHOULD BE CLICKABLE");
					/*// page.generaldropdownselectmethod();
					String restaurantdropdownhead1 = page.restaurantgetAtrributeValuemethod();
					String restaurantdropdownexcel1 = Excelreader.getData(0, 7, 5);
					if (restaurantdropdownhead1.equals(restaurantdropdownexcel1)) {
						test.pass("TC: USER SHOULD BE SELECT 'RESTAURANT FEEDBACK' OPTION");*/
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
							test.fail(test
									.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
									+ "HEADING 'RESTAURANT FEEDBACK' IS NOT TRIGGERED");
							driver.navigate().back();
						}

					/*} else {
						test.fail("TC: USER SHOULD BE SELECT 'RESTAURANT FEEDBACK' OPTION");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "USER SHOULD BE SELECT 'RESTAURANT FEEDBACK' OPTION");
					}*/
				} else {
					test.fail("TC: THE DROPDWON 'PICK A DIFFERENT TOPIC' SHOULD BE CLICKABLE");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
							+ "DROPDOWN FIELD 'RESTAURANT FEEDBACK' IS NOT CLICKABLE");
				}
			} catch (Exception e) {
				test.fail("Error:" + e.getMessage());
			}
			// Trade mark permission
			try {
				String trademarkdropdownhead = page.trademarkdropdownlabelmethod(); // click and drop down value is
																					// display
				String trademarkdropdownexcel = Excelreader.getData(0, 9, 5);
				if (trademarkdropdownhead.equals(trademarkdropdownexcel)) {
					test.pass("TC: THE DROPDWON 'PICK A DIFFERENT TOPIC' SHOULD BE CLICKABLE");
					/*String trademarkdropdownhead1 = page.trademarkgetAtrributeValuemethod();
					String trademarkdropdownexcel1 = Excelreader.getData(0, 9, 5);
					if (trademarkdropdownhead1.equals(trademarkdropdownexcel1)) {
						test.pass("TC: USER SHOULD BE SELECT 'TRADEMARK PERMISSION' OPTION");*/
						String gettitle = page.trademarkgetpagetitlemethod1();
						String gettitleexcel = Excelreader.getData(0, 10, 5);
						if (gettitle.equals(gettitleexcel)) {
							test.pass(
									"TC: THE PAGE 'TRADEMARK PERMISSION' PAGE IS TRIGGERED AND DISPLAYED IN THE SAME PAGE");
							driver.navigate().back();
						} else {
							test.fail(
									"TC: THE PAGE 'TRADEMARK PERMISSION' PAGE IS NOT TRIGGERED AND DISPLAYED IN THE SAME PAGE");
							test.fail(test
									.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
									+ "HEADING 'TRADEMARK PERMISSION' IS NOT TRIGGERED");
							driver.navigate().back();
						}

					/*} else {
						test.fail("TC: USER SHOULD BE SELECT 'TRADEMARK PERMISSION' OPTION");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "USER SHOULD BE SELECT 'TRADEMARK PERMISSION' OPTION");
					}*/
				} else {
					test.fail("TC: THE DROPDWON 'PICK A DIFFERENT TOPIC' SHOULD BE CLICKABLE");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
							+ "DROPDOWN FIELD 'TRADEMARK PERMISSION' IS NOT CLICKABLE");
				}
			} catch (Exception e) {
				test.fail("Error:" + e.getMessage());
			}

			// contact us
			try {
				String contactusdropdownhead = page.contactusdropdownlabelmethod(); // click and drop down value is
																					// display
				String contactusdropdownexcel = Excelreader.getData(0, 11, 5);
				if (contactusdropdownhead.equals(contactusdropdownexcel)) {
					test.pass("TC: THE DROPDWON 'PICK A DIFFERENT TOPIC' SHOULD BE CLICKABLE");
					/*String contactusdropdownhead1 = page.contactusgetAtrributeValuemethod();
					String contactusdropdownexcel1 = Excelreader.getData(0, 11, 5);
					if (contactusdropdownhead1.equals(contactusdropdownexcel1)) {
						test.pass("TC: USER SHOULD BE SELECT 'CONTACT US + FAQs' OPTION");*/
						String gettitle = page.contactusgetpagetitlemethod1();
						String gettitleexcel = Excelreader.getData(0, 12, 5);
						if (gettitle.equals(gettitleexcel)) {
							test.pass(
									"TC: THE PAGE 'CONTACT US + FAQs' PAGE IS TRIGGERED AND DISPLAYED IN THE SAME PAGE");
							driver.navigate().back();
						} else {
							test.fail(
									"TC: THE PAGE 'CONTACT US + FAQs' PAGE IS NOT TRIGGERED AND DISPLAYED IN THE SAME PAGE");
							test.fail(test
									.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
									+ "HEADING 'CONTACT US + FAQs' IS NOT TRIGGERED");
							driver.navigate().back();

						}

					} else {
						test.fail("TC: USER SHOULD BE SELECT 'CONTACT US + FAQs' OPTION");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "USER SHOULD BE SELECT 'CONTACT US + FAQs' OPTION");
					}
				/*} else {
					test.fail("TC: THE DROPDWON 'PICK A DIFFERENT TOPIC' SHOULD BE CLICKABLE");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
							+ "DROPDOWN FIELD 'CONTACT US + FAQs' IS NOT CLICKABLE");
				}*/
			} catch (Exception e) {
				test.fail("Error:" + e.getMessage());
			}
		} catch (Exception e) {
			test.fail("TC:6 GO BUTTON IS NOT ENABLE AND DISPLAYED");
			test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
					+ "GO BUTTON IS NOT ENABLE AND DISPLAYED");
		}

	}

	@Test(priority = 4)
	public void How_can_we_help_you() {
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		test = extent.createTest("How_can_we_help_you");
		// how can we help label
		try {
			String howcanwehelplabelhead = page.howcanwehelplabelmethod();
			String howcanwehelplabelexcel = Excelreader.getData(0, 13, 5);
			if (howcanwehelplabelhead.equals(howcanwehelplabelexcel)) {
				test.pass("TC:11 VERIFY LABEL 'HOW CAN WE HELP YOU?' IS DISPLAYED");

			} else {
				test.fail("TC:11 VERIFY LABEL 'HOW CAN WE HELP YOU?' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "VERIFY LABEL 'HOW CAN WE HELP YOU?' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// We want every customer to have
		try {
			String wewatneveryhead = page.wewanteverylabelmethod();
			String wewatneveryexcel = Excelreader.getData(0, 14, 5);
			if (wewatneveryhead.equals(wewatneveryexcel)) {
				test.pass("TC:12 VERIFY LABEL 'WE WANT EVERY CUSTOMER TO HAVE------' IS DISPLAYED");

			} else {
				test.fail("TC:12 VERIFY LABEL 'WE WANT EVERY CUSTOMER TO HAVE------' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "VERIFY LABEL 'WE WANT EVERY CUSTOMER TO HAVE------' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// Indicates a required field
		try {
			String indecatesarequirehead = page.indicatesrequiredlabelmethod();
			String indecatesarequireexcel = Excelreader.getData(0, 15, 5);
			if (indecatesarequirehead.equals(indecatesarequireexcel)) {
				test.pass("TC:13 VERIFY LABEL 'INDICATES A REQUIRED FIELD' IS DISPLAYED");

			} else {
				test.fail("TC:13 VERIFY LABEL 'INDICATES A REQUIRED FIELD' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "VERIFY LABEL 'INDICATES A REQUIRED FIELD' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 5)
	public void TELL_US_ABOUT_IT() {
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		test = extent.createTest("TELL_US_ABOUT_IT");
		// TELL US ABOUT IT LABEL

		try {
			String tellusaboutithead = page.tellusaboutitlabelmethod();
			String tellusaboutitexcel = Excelreader.getData(0, 16, 5);
			if (tellusaboutithead.equals(tellusaboutitexcel)) {
				test.pass("TC:14 VERIFY LABEL 'TELL US ABOUT IT' IS DISPLAYED");

			} else {
				test.fail("TC:14 VERIFY LABEL 'TELL US ABOUT IT' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "VERIFY LABEL 'TELL US ABOUT IT' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// Provide more information label
		try {
			String providemorelabelhead = page.providemoreinformationlabelmethod();
			String providemorelabelexcel = Excelreader.getData(0, 17, 5);
			if (providemorelabelhead.equals(providemorelabelexcel)) {
				test.pass("TC:15 VERIFY LABEL 'PROVIDE MORE INFORMATIONL.......' IS DISPLAYED");

			} else {
				test.fail("TC:15 VERIFY LABEL 'PROVIDE MORE INFORMATIONL.......' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "VERIFY LABEL 'PROVIDE MORE INFORMATIONL.......' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// MOBILE DEVICE TYPE label
		try {
			String mobiledevicetyplabelhead = page.mobiledevicetypelabelmethod();
			String mobiledevicetyplabelexcel = Excelreader.getData(0, 18, 5);
			if (mobiledevicetyplabelhead.equals(mobiledevicetyplabelexcel)) {
				test.pass("TC:16 VERIFY LABEL 'MOBILE DEVICE TYPE' IS DISPLAYED");

			} else {
				test.fail("TC:16 VERIFY LABEL 'MOBILE DEVICE TYPE' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "VERIFY LABEL 'MOBILE DEVICE TYPE' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// after click mobile device type label

		try {
			String mobiledevicetyplabelhead = page.clickmobiledevicetypelabelmethod();
			String mobiledevicetyplabelexcel = Excelreader.getData(0, 18, 5);
			if (mobiledevicetyplabelhead.equals(mobiledevicetyplabelexcel)) {
				test.pass("TC:16.4  VERIFY LABEL 'MOBILE DEVICE TYPE' IS ROLLED UP");

			} else {
				test.fail("TC:16.4  VERIFY LABEL 'MOBILE DEVICE TYPE' IS NOT ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "VERIFY LABEL 'MOBILE DEVICE TYPE' IS NOT ROLLED UP");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// mobile device type error message
		try {
			String mobieldeviceerrormessagehead = page.mobieldeviceerrormessagemethod();
			String mobieldeviceerrormessageexcel = Excelreader.getData(0, 20, 5);
			if (mobieldeviceerrormessagehead.equals(mobieldeviceerrormessageexcel)) {
				test.pass(
						"MOBILE DEVICE TYPE 'ERROR MESSAGE DISPLAYED' -->" + "'" + mobieldeviceerrormessagehead + "'");

			} else {
				test.fail("TC:16.4  MOBILE DEVICE TYPE ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "MOBILE DEVICE TYPE ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// mobile device type clickable
		try {
			String mobiledevicetypdropdownvalhead = page.mobiledevicetypeclickable();
			String mobiledevicetypdropdownvalexcel = Excelreader.getData(0, 19, 5);
			if (mobiledevicetypdropdownvalhead.equals(mobiledevicetypdropdownvalexcel)) {
				test.pass("TC:16 MOBILE DEVICE TYPE SHOULD BE DROP DOWN AND CLICKABLE");
			} else {
				test.fail("TC:16  MOBILE DEVICE TYPE SHOULD BE DROP DOWN");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "MOBILE DEVICE TYPE SHOULD BE DROP DOWN");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 6)
	public void Mobile_Operating_System() {
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		test = extent.createTest("Mobile_Operating_System");

		// mobile operation system label

		try {
			String mobileoperationlabelhead = page.mobileoperationlabelmethod();
			String mobileoperationlabelexcel = Excelreader.getData(0, 21, 5);
			if (mobileoperationlabelhead.equals(mobileoperationlabelexcel)) {
				test.pass("TC:17  VERIFY LABEL 'MOBILE OPERATION SYSTEM' IS DISPLAYED ");

			} else {
				test.fail("TC:17  VERIFY LABEL 'MOBILE OPERATION SYSTEM' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "VERIFY LABEL 'MOBILE OPERATION SYSTEM' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// AFTER CLICK MOBILE OPERATION SYSTEM LABEL
		try {
			String mobileoperationlabelhead = page.clcikmobileoperationmethod();
			String mobileoperationlabelexcel = Excelreader.getData(0, 21, 5);
			if (mobileoperationlabelhead.equals(mobileoperationlabelexcel)) {
				test.pass("TC:17  VERIFY LABEL 'MOBILE OPERATION SYSTEM' IS ROLLED UP ");

			} else {
				test.fail("TC:17  VERIFY LABEL 'MOBILE OPERATION SYSTEM' IS NOT ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "VERIFY LABEL 'MOBILE OPERATION SYSTEM' IS NOT ROLLED UP");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// MOBILE OPERATION SYSTEM error message
		try {
			String mobileoperationerrormessagehead = page.mobileoperationerrormessagemethod();
			String mobileoperationerrormessageexcel = Excelreader.getData(0, 23, 5);
			if (!mobileoperationerrormessagehead.equals(mobileoperationerrormessageexcel)) {
				test.pass("TC:17  MOBILE OPERATION SYSTEM 'ERROR MESSAGE DISPLAYED' -->" + "'"
						+ mobileoperationerrormessagehead + "'");

			} else {
				test.fail("TC:17  MOBILE OPERATION SYSTEM ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "MOBILE OPERATION SYSTEM ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// mobile operation system clickable
		try {
			String mobileoperationsytemdropdownvalhead = page.googleandroiddropdownvaluemethod();
			String mobileoperationsytemdropdownvalexcel = Excelreader.getData(0, 22, 5);
			if (mobileoperationsytemdropdownvalhead.equals(mobileoperationsytemdropdownvalexcel)) {
				test.pass("TC:17 MOBILE OPERATION SYSTEM SHOULD BE DROP DOWN AND CLICKABLE");
				
			} else {
				test.fail("TC:17  MOBILE OPERATION SYSTEM SHOULD BE DROP DOWN");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "MOBILE OPERATION SYSTEM SHOULD BE DROP DOWN");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 7)
	public void Mobile_App_Version() {
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		test = extent.createTest("Mobile_App_Version");

		// Mobile app version LABEL
		try {
			String mobileappversionlabelhead = page.mobileappversionlabelmethod();
			String mobileappversionlabelexcel = Excelreader.getData(0, 24, 5);
			if (mobileappversionlabelhead.equals(mobileappversionlabelexcel)) {
				test.pass("TC:18 VERIFY LABEL 'MOBILE APP VERSION' IS DISPLAYED");

			} else {
				test.fail("TC:18 VERIFY LABEL 'MOBILE APP VERSION' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "VERIFY LABEL 'MOBILE APP VERSION' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// after click Mobile app version LABEL
		try {
			String mobileappversionlabelhead = page.mobileappversionclciklabelmethod();
			String mobileappversionlabelexcel = Excelreader.getData(0, 24, 5);
			if (mobileappversionlabelhead.equals(mobileappversionlabelexcel)) {
				test.pass("TC:18 VERIFY LABEL 'MOBILE APP VERSION' IS DISPLAYED");

			} else {
				test.fail("TC:18 VERIFY LABEL 'MOBILE APP VERSION' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "VERIFY LABEL 'MOBILE APP VERSION' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// send special character
		try {
			String mobileappversionspecialcharexcel = Excelreader.getData(0, 25, 5);
			String mobileversendedvalhead = page.mobileversionsendedvaluemethod(mobileappversionspecialcharexcel);
			if (!mobileversendedvalhead.equals(mobileappversionspecialcharexcel)) {
				test.pass("TC:18 USER SHOULD NOT BE SEND SPECIAL CHARACTER");

			} else {
				test.fail("TC:18 USER SHOULD NOT BE SEND SPECIAL CHARACTER");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "USER SHOULD NOT BE SEND SPECIAL CHARACTER");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send character and numerical
		try {
			String mobileappversioncharnumaeriexcel = Excelreader.getData(0, 26, 5);
			String mobileversendedvalhead = page.mobileversionsendedvaluemethod(mobileappversioncharnumaeriexcel);
			if (mobileversendedvalhead.equals(mobileappversioncharnumaeriexcel)) {
				test.pass("TC:18 USER SHOULD  BE SEND NUMERICAL AND CHARACTER");

			} else {
				test.fail("TC:18 USER SHOULD  BE SEND NUMERICAL AND CHARACTER");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "USER SHOULD  BE SEND NUMERICAL AND CHARACTER");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send MORE THANE 12 CHARECTER AND NUMERICAL
		try {
			String mobileappversionmorethan12excel = Excelreader.getData(0, 27, 5);
			String mobileversendedvalhead = page.mobileversionsendedvaluemethod(mobileappversionmorethan12excel);
			if (!mobileversendedvalhead.equals(mobileappversionmorethan12excel)) {
				test.pass("TC:18 USER SHOULD NOT BE SEND MORE THAN 12 NUMERICAL AND CHARACTER");

			} else {
				test.fail("TC:18 USER SHOULD  NOT BE SEND MORE THAN 12 NUMERICAL AND CHARACTER");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "USER SHOULD  NOT BE SEND MORE THAN 12 NUMERICAL AND CHARACTER");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE
		try {
			String mobileappversionerrormesshead = page.mobileverionerrormessagemethod();
			String mobileappversionerrormessexcel = Excelreader.getData(0, 28, 5);
			if (mobileappversionerrormesshead.equals(mobileappversionerrormessexcel)) {
				test.pass(
						"MOBILE APP VERSION 'ERROR MESSAGE DISPLAYED' -->" + "'" + mobileappversionerrormesshead + "'");

			} else {
				test.fail("TC:18 MOBILE APP VERSION ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "MOBILE APP VERSION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 8)
	public void Enter_Your_Comments() {
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		test = extent.createTest("Enter_Your_Comments");

		// enter your comments label

		try {
			String entercommentslabelhead = page.entercommentslabelmethod();
			String entercommentslabelexcel = Excelreader.getData(0, 29, 5);
			if (entercommentslabelhead.equals(entercommentslabelexcel)) {
				test.pass("TC:19  VERIFY LABEL 'ENTER YOUR COMMENTS REGARDING......' IS DISPLAYED");

			} else {
				test.fail("TC:19  VERIFY LABEL 'ENTER YOUR COMMENTS REGARDING......' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "VERIFY LABEL 'ENTER YOUR COMMENTS REGARDING......' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// after click enter your comments label

		try {
			String entercommentslabelhead = page.clcikentercommentslabelmethod();
			String entercommentslabelexcel = Excelreader.getData(0, 29, 5);
			if (entercommentslabelhead.equals(entercommentslabelexcel)) {
				test.pass("TC:19  VERIFY LABEL 'ENTER YOUR COMMENTS REGARDING......' IS ROLLED UP");

			} else {
				test.fail("TC:19  VERIFY LABEL 'ENTER YOUR COMMENTS REGARDING......' IS ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "VERIFY LABEL 'ENTER YOUR COMMENTS REGARDING......' IS ROLLED UP");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// SEND SPECIAL CHARECTER
		try {
			String entercommentspecialchaexcel = Excelreader.getData(0, 30, 5);
			String entercommentspecialchahead = page.entercommentsendedvaluemethod(entercommentspecialchaexcel);
			if (!entercommentspecialchahead.equals(entercommentspecialchaexcel)) {
				test.pass("TC:19 USER SHOULD NOT BE SEND SPECIAL CHARACTER");

			} else {
				test.fail("TC:19 USER SHOULD  NOT BE SEND SPECIAL CHARACTER");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "USER SHOULD  NOT BE SEND SPECIAL CHARACTER");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// SEND CHARACTER AND NUMERICAL
		try {
			String entercommentcharnumericalexcel = Excelreader.getData(0, 31, 5);
			String entercommentcharnumericalhead = page.entercommentsendedvaluemethod(entercommentcharnumericalexcel);
			if (entercommentcharnumericalhead.equals(entercommentcharnumericalexcel)) {
				test.pass("TC:19 USER SHOULD  BE SEND NUMERICAL AND CHARACTER");

			} else {
				test.fail("TC:19 USER SHOULD  BE SEND NUMERICAL AND CHARACTER");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "USER SHOULD  BE SEND NUMERICAL AND CHARACTER");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// more than 1200 character and numerical
		try {
			String entercommentmorethan1200excel = Excelreader.getData(0, 32, 5);
			String entercommentmorethan1200head = page.entercommentsendedvaluemethod(entercommentmorethan1200excel);
			if (entercommentmorethan1200head.equals(entercommentmorethan1200excel)) {
				test.pass("TC:19 USER SHOULD  BE SEND MORE THAN 1200 NUMERICAL AND CHARACTER");
				String commeterrormessagehead = page.commeterrormessagemethod();
				String commeterrormessageexcel = Excelreader.getData(0, 33, 6);
				if (commeterrormessagehead.equals(commeterrormessageexcel)) {
					test.pass("TC: ENTER MORE THAN 1200 IN ENTER YOUR COMMENTS.... 'ERROR MESSAGE DISPLAYED' -->" + "'"
							+ commeterrormessagehead + "'");

				} else {
					test.fail("TC:18 ENTER MORE THAN 1200 IN  ENTER YOUR COMMENTS.... ERROR MESSAGE IS NOT DISPLAYED");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
							+ "ENTER YOUR COMMENTS.... ERROR MESSAGE IS NOT DISPLAYED");
				}

			} else {
				test.fail("TC:19 USER SHOULD  BE SEND MORE THAN 1200 NUMERICAL AND CHARACTER");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "USER SHOULD  BE SEND MORE THAN 1200 NUMERICAL AND CHARACTER");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE
		try {
			String commeterrormessagehead = page.commeterrormessagemethod1();
			String commeterrormessageexcel = Excelreader.getData(0, 33, 5);
			if (commeterrormessagehead.equals(commeterrormessageexcel)) {
				test.pass("TC: ENTER YOUR COMMENTS.... 'ERROR MESSAGE DISPLAYED' -->" + "'" + commeterrormessagehead
						+ "'");

			} else {
				test.fail("TC:18 ENTER YOUR COMMENTS.... ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "ENTER YOUR COMMENTS.... ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 9)
	public void If_Appropriate_Label() {
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		test = extent.createTest("If_Appropriate_Label");

		// if appropriate label
		try {
			String ifappropriatelabelhead = page.ifappropriatelabelmethod();
			String ifappropriatelabelexcel = Excelreader.getData(0, 34, 5);
			if (ifappropriatelabelhead.equals(ifappropriatelabelexcel)) {
				test.pass("TC:20  VERIFY LABEL 'IF APPROPRIATE , PLEASE......' IS DISPLAYED");

			} else {
				test.fail("TC:20  VERIFY LABEL 'IF APPROPRIATE , PLEASE......' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "VERIFY LABEL 'IF APPROPRIATE , PLEASE......' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// Restaurant locater label
		try {
			String restaurantlocatorlabelhead = page.restaurantlocatorlabelmethod();
			String restaurantlocatorlabelexcel = Excelreader.getData(0, 35, 5);
			if (restaurantlocatorlabelhead.equals(restaurantlocatorlabelexcel)) {
				test.pass("TC:21  VERIFY LABEL 'RESTAURANT LOCATER' IS DISPLAYED");

			} else {
				test.fail("TC:21  VERIFY LABEL 'RESTAURANT LOCATER' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "VERIFY LABEL 'RESTAURANT LOCATER' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// OR label
		try {
			String orlabelhead = page.orlabelmethod();
			String orlabelexcel = Excelreader.getData(0, 36, 5);
			if (orlabelhead.equals(orlabelexcel)) {
				test.pass("TC:24  VERIFY LABEL 'OR' IS DISPLAYED");

			} else {
				test.fail("TC:24  VERIFY LABEL 'OR' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "VERIFY LABEL 'OR' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// LOCATE ME label
		try {
			String locatemelabelhead = page.locatemelabelmethod();
			String locatemelabelexcel = Excelreader.getData(0, 37, 5);
			if (locatemelabelhead.equals(locatemelabelexcel)) {
				test.pass("TC:25  VERIFY LABEL 'LOCATE ME' IS DISPLAYED");

			} else {
				test.fail("TC:25  VERIFY LABEL 'LOCATE ME' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "VERIFY LABEL 'LOCATE ME' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 10)
	public void Restaurant_Locater() {
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		test = extent.createTest("Restaurant_Locater");

		// RESTAURANT BUTTON, POP UP AND ZIP,CITY

		try {
			String zipcityhead = page.zipcitymethod();
			String zipcityexcel = Excelreader.getData(0, 38, 5);
			if (!zipcityhead.equals("")) {
				test.pass("TC:22  RESTAURANT BUTTON IS WORKING, POP UP AND ZIP, CITY, STATE LABEL IS DISPLAYED");
				// X close button is working or not
				String zipcityclosehead = page.zipcitymethod1();
				String zipcitycloseexcel = Excelreader.getData(0, 38, 5);
				if (!zipcityclosehead.equals(zipcitycloseexcel)) {
					test.pass("TC:23  CLOSE BUTTON IS WORKING ");
				} else {
					test.fail("TC:23 CLOSE BUTTON IS NOT WORKING");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
							+ "CLOSE BUTTON IS NOT WORKING");
				}
			} else {
				test.fail("TC:22 RESTAURANT BUTTON IS NOT WORKING, POP UP AND ZIP, CITY, STATE LABEL IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "RESTAURANT BUTTON IS NOT WORKING, POP UP AND ZIP, CITY, STATE LABEL IS NOT DISPLAYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// SEND ZIP CODE
		try {
			String zipcityhead = page.zipcitymethod();
			String zipcityexcel = Excelreader.getData(0, 38, 5);
			if (!zipcityhead.equals("")) {
				test.pass("TC:22  RESTAURANT BUTTON IS WORKING, POP UP AND ZIP, CITY, STATE LABEL IS DISPLAYED");
				String zipvalexcel = Excelreader.getData(0, 39, 5);
				String zipvalhead = page.zipenteredvalmethod(zipvalexcel);
				if (zipvalhead.equals(zipvalexcel)) {
					test.pass("TC:22  USER ABLE TO SEND ZIP CODE");
					// CLICK ON SEARCH
					String mappinnumberhead = page.mappinnumbermethod();
					String mappinnumberexcel = Excelreader.getData(0, 140, 5);
					if (mappinnumberhead.equalsIgnoreCase(mappinnumberexcel)) {
						test.pass("TC:22  SEARCH BUTTON IS WORKING IN POP UP AND McD ADDRESS ALSO IS DISPLAYED");
						
							// CLICK ON SELECT RESTAURANT
							String restaurantaddlabelhead = page.restaurantaddrlabelmethod33();
							String restaurantaddlabelexcel = Excelreader.getData(0, 42, 5);
							if (restaurantaddlabelhead.equalsIgnoreCase(restaurantaddlabelexcel)) {
								test.pass("TC:22 SELECT RESTAURANT BUTTON IS CLICKABLE");

								// restaurant address
								String restatexthead = page.resraurantaddvaluemethod1();
								if (!restatexthead.equals("")) {
									test.pass("TC:22  RESTAURANT ADDRESS FIELD WITH ADDRESS IS DISPLAYED");
								} else {
									test.fail("TC:22  RESTAURANT ADDRESS FIELD WITH ADDRESS IS NOT DISPLAYED");
									test.fail(test.addScreenCaptureFromPath(
											Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
											+ "RESTAURANT ADDRESS FIELD WITH ADDRESS IS NOT DISPLAYED");
								}

								// city
								String citytexthead = page.cityvaluemethod();
								if (!citytexthead.equals("")) {
									test.pass("TC:22  CITY FIELD WITH ADDRESS IS DISPLAYED");

								} else {
									test.fail("TC:22  CITY FIELD WITH ADDRESS IS NOT DISPLAYED");
									test.fail(test.addScreenCaptureFromPath(
											Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
											+ "CITY FIELD WITH ADDRESS IS NOT DISPLAYED");
								}

								// state
								String statetexthead = page.statevaluemethod();
								if (!statetexthead.equals("")) {
									test.pass("TC:22  STATE FIELD WITH ADDRESS IS DISPLAYED");
								} else {
									test.fail("TC:22  STATE FIELD WITH ADDRESS IS NOT DISPLAYED");
									test.fail(test.addScreenCaptureFromPath(
											Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
											+ "STATE FIELD WITH ADDRESS IS NOT DISPLAYED");
								}
							} else {
								test.fail("TC:22 SELECT RESTAURANT BUTTON IS NOT CLICKABLE");
								test.fail(test.addScreenCaptureFromPath(
										Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "SELECT RESTAURANT BUTTON IS NOT clickable");
							}
						
					} else {
						test.fail("TC:22 SEARCH BUTTON IS NOT WORKING IN POP UP AND McD ADDRESS ALSO IS NOT DISPLAYED");
						test.fail(test
								.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
								+ "SEARCH BUTTON IS NOT WORKING IN POP UP AND McD ADDRESS ALSO IS NOT DISPLAYED");
					}
				} else {
					test.fail("TC:22 USER NOT ABLE TO SEND ZIP CODE");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
							+ "USER NOT ABLE TO SEND ZIP CODE");
				}
			} else {
				test.fail("TC:22 RESTAURANT BUTTON IS NOT WORKING, POP UP AND ZIP, CITY, STATE LABEL IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "RESTAURANT BUTTON IS NOT WORKING, POP UP AND ZIP, CITY, STATE LABEL IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	/*@Test(priority = 11)
	public void List_View() {
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		test = extent.createTest("List_View");
		try {
			driver.get(Basepage.readProperty("urlB"));
			// Thread.sleep(3000);
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");

			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
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
	

		try {
			String zipcityhead = page.zipcitymethod();
			String zipcityexcel = Excelreader.getData(0, 38, 5);
			if (!zipcityhead.equals("")) {
				test.pass("TC:22  RESTAURANT BUTTON IS WORKING, POP UP AND ZIP, CITY, STATE LABEL IS DISPLAYED");
				String zipvalexcel = Excelreader.getData(0, 39, 5);
				String zipvalhead = page.zipenteredvalmethod(zipvalexcel);
				if (zipvalhead.equals(zipvalexcel)) {
					test.pass("TC:22  USER ABLE TO SEND ZIP CODE");
					// CLICK ON SEARCH
					String mappinnumberhead = page.mappinnumbermethod();
					String mappinnumberexcel = Excelreader.getData(0, 140, 5);
					if (mappinnumberhead.equals(mappinnumberexcel)) {
						test.pass("TC:22  SEARCH BUTTON IS WORKING IN POP UP AND McD ADDRESS ALSO IS DISPLAYED");
						// list view label
						String listviewlabehead = page.listviewlabelmethod();
						String listviewlabeexcel = Excelreader.getData(0, 43, 5);
						if (!listviewlabehead.equals("")) {
							test.pass("TC: LABEL OF 'LIST VIEW' IS DISPLAYED");
						} else {
							test.fail("TC: LABEL OF 'LIST VIEW' IS NOT DISPLAYED");
							test.fail(test
									.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
									+ "LABEL OF 'LIST VIEW' IS NOT DISPLAYED");
						}
						// click on list view
						String loadmorelabehead = page.loadmorelabelmethod();
						String loadmorelabeexcel = Excelreader.getData(0, 44, 5);
						if (!loadmorelabehead.equals("")) {
							test.pass("TC: LIST VIEW BUTTON IS CLICKABLE");
							// click on load more button
							String loademorebuttonworkinghead = page.lodemorebuttonworkingmethod();
							String loademorebuttonworkingexcel = Excelreader.getData(0, 45, 5);
							if (loademorebuttonworkinghead.equals(loademorebuttonworkingexcel)) {
								test.pass("TC: LODE MORE BUTTON IS CLICKABLE");
								// click on select restaurant button
								// CLICK ON SELECT RESTAURANT
								String restaurantaddlabelhead = page.restaurantaddrlabelmethod11();
								String restaurantaddlabelexcel = Excelreader.getData(0, 42, 5);
								if (restaurantaddlabelhead.equals(restaurantaddlabelexcel)) {
									test.pass("TC:22 SELECT RESTAURANT BUTTON IS CLICKABLE");

									// restaurant address
									String restatexthead = page.resraurantaddvaluemethod1();
									if (!restatexthead.equals("")) {
										test.pass("TC:22  RESTAURANT ADDRESS FIELD WITH ADDRESS IS DISPLAYED");
									} else {
										test.fail("TC:22  RESTAURANT ADDRESS FIELD WITH ADDRESS IS NOT DISPLAYED");
										test.fail(test.addScreenCaptureFromPath(
												Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
												+ "RESTAURANT ADDRESS FIELD WITH ADDRESS IS NOT DISPLAYED");
									}

									// city
									String citytexthead = page.cityvaluemethod();
									if (!citytexthead.equals("")) {
										test.pass("TC:22  CITY FIELD WITH ADDRESS IS DISPLAYED");

									} else {
										test.fail("TC:22  CITY FIELD WITH ADDRESS IS NOT DISPLAYED");
										test.fail(test.addScreenCaptureFromPath(
												Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
												+ "CITY FIELD WITH ADDRESS IS NOT DISPLAYED");
									}

									// state
									String statetexthead = page.statevaluemethod();
									if (!statetexthead.equals("")) {
										test.pass("TC:22  STATE FIELD WITH ADDRESS IS DISPLAYED");
									} else {
										test.fail("TC:22  STATE FIELD WITH ADDRESS IS NOT DISPLAYED");
										test.fail(test.addScreenCaptureFromPath(
												Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
												+ "STATE FIELD WITH ADDRESS IS NOT DISPLAYED");
									}
								} else {
									test.fail("TC:22 SELECT RESTAURANT BUTTON IS NOT CLICKABLE");
									test.fail(test.addScreenCaptureFromPath(
											Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
											+ "SELECT RESTAURANT BUTTON IS NOT clickable");
								}

							} else {
								test.fail("TC: LODE MORE BUTTON IS NOT CLICKABLE");
								test.fail(test.addScreenCaptureFromPath(
										Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "LODE MORE BUTTON IS NOT CLICKABLE");
							}
						} else {
							test.fail("TC: LIST VIEW BUTTON IS NOT CLICKABLE");
							test.fail(test
									.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
									+ "LIST VIEW BUTTON IS NOT CLICKABLE");
						}
					} else {
						test.fail("TC:22 SEARCH BUTTON IS NOT WORKING IN POP UP AND McD ADDRESS ALSO IS NOT DISPLAYED");
						test.fail(test
								.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
								+ "SEARCH BUTTON IS NOT WORKING IN POP UP AND McD ADDRESS ALSO IS NOT DISPLAYED");
					}
				} else {
					test.fail("TC:22 USER NOT ABLE TO SEND ZIP CODE");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
							+ "USER NOT ABLE TO SEND ZIP CODE");
				}
			} else {
				test.fail("TC:22 RESTAURANT BUTTON IS NOT WORKING, POP UP AND ZIP, CITY, STATE LABEL IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "RESTAURANT BUTTON IS NOT WORKING, POP UP AND ZIP, CITY, STATE LABEL IS NOT DISPLAYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}*/

	@Test(priority = 12)
	public void Cont_find_Location_Mobile() {
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		test = extent.createTest("Cont_find_Location_Mobile");

		// con't find the location you're looking for label
		try {
			String contfindlocationlabelhead = page.contfindlocationlabelmethod();
			String contfindlocationlabelexcel = Excelreader.getData(0, 46, 5);
			if (contfindlocationlabelhead.equals(contfindlocationlabelexcel)) {
				test.pass("TC:27 LABEL OF 'CON'T FIND THE LOCATION YOU'RE LOOKING FOR' IS DISPLAYED ");
			} else {
				test.fail("TC:27 LABEL OF 'CON'T FIND THE LOCATION YOU'RE LOOKING FOR' IS NOT DISPLAYED  ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "LABEL OF CON'T FIND THE LOCATION YOU'RE LOOKING FOR IS NOT DISPLAYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 13)
	public void Restaurant_Addrress_Mobile() {
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		test = extent.createTest("Restaurant_Addrress_Mobile");
		// click on con't find location link
		try {
			String restaurantaddlabelhead = page.restaurantaddrlabelmethod();
			String restaurantaddlabelexcel = Excelreader.getData(0, 42, 5);
			if (restaurantaddlabelhead.equals(restaurantaddlabelexcel)) {
				test.pass("TC:28 CAN'T  FIND THE LOCATION LINK IS CLICKABLE");
				// Restaurant address label
				try {
					String restaurantaddlabelhead1 = page.restaurantaddrlabelmethod2();
					String restaurantaddlabelexcel1 = Excelreader.getData(0, 47, 5);
					if (restaurantaddlabelhead1.equals(restaurantaddlabelexcel1)) {
						test.pass("TC:29 RESTAURANT ADDRESS LABEL IS DISPLAYED");
					} else {
						test.fail("TC:29 RESTAURANT ADDRESS LABEL IS NOT DISPLAYED ");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "RESTAURANT ADDRESS LABEL IS NOT DISPLAYED ");
					}

				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}

				// RESTAURANT ADDRESS LABEL AFTER CLICK ON RESTARNAT ADDRESS
				try {
					String restaurantaddlabelhead2 = page.restaurantaddrlabelmethod3();
					String restaurantaddlabelexcel2 = Excelreader.getData(0, 47, 5);
					if (restaurantaddlabelhead2.equals(restaurantaddlabelexcel2)) {
						test.pass("TC:29 RESTAURANT ADDRESS LABEL IS ROLLED UP");
					} else {
						test.fail("TC:29 RESTAURANT ADDRESS LABEL IS NOT ROLLED UP ");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "RESTAURANT ADDRESS LABEL IS NOT DISPLAYED ");
					}

				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}

				// SEND SPECIAL CHARACTERS
				try {

					String restaurantaddspchaexcel = Excelreader.getData(0, 48, 5);
					String restaurantaddspchahead = page.resraurantaddvaluemethod(restaurantaddspchaexcel);
					if (!restaurantaddspchahead.equals(restaurantaddspchaexcel)) {
						test.pass("TC:29 USER SHOULD NOT SEND SPECIAL CHARACTERS");
					} else {
						test.fail("TC:29 USER SHOULD NOT SEND SPECIAL CHARACTERS");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "RESTAURANT ADDRESS LABEL IS NOT DISPLAYED ");
					}

				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}

				// send characters and numerical
				try {
					String restaurantaddspchanumarexcel = Excelreader.getData(0, 49, 5);
					String restaurantaddspchanumahead = page.resraurantaddvaluemethod(restaurantaddspchanumarexcel);
					if (restaurantaddspchanumahead.equals(restaurantaddspchanumarexcel)) {
						test.pass("TC:29 USER SHOULD BE SEND NUMERICAL AND CHARACTERS");
					} else {
						test.fail("TC:29 USER SHOULD BE SEND NUMERICAL AND CHARACTERS");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "USER SHOULD BE SEND NUMERICAL AND CHARACTERS");
					}

				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}

				// send more than 40 characters or numerical
				try {
					String restaurantaddmorethan40excel = Excelreader.getData(0, 50, 5);
					String restaurantaddmorethan40head = page.resraurantaddvaluemethod(restaurantaddmorethan40excel);
					if (!restaurantaddmorethan40head.equals(restaurantaddmorethan40excel)) {
						test.pass("TC:29 USER NOT ABLE TO SEND MORE THAN 40 NUMERICAL OR CHARACTERS");
					} else {
						test.fail("TC:29 USER NOT ABLE TO SEND MORE THAN 40 NUMERICAL OR CHARACTERS");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "USER NOT ABLE TO SEND MORE THAN 40 NUMERICAL OR CHARACTERS");
					}

				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
			} else {
				test.fail("TC:28 CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 14)
	public void City_Mobile() {
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		test = extent.createTest("City_Mobile");
		// click on con't find location link
		try {
			String restaurantaddlabelhead = page.restaurantaddrlabelmethod();
			String restaurantaddlabelexcel = Excelreader.getData(0, 42, 5);
			if (restaurantaddlabelhead.equals(restaurantaddlabelexcel)) {
				test.pass("TC:28 CAN'T  FIND THE LOCATION LINK IS CLICKABLE");

				// city label
				try {
					String citycantfindlabelhead = page.cityconatfindlabelmethod();
					String citycantfindlabelexcel = Excelreader.getData(0, 52, 5);
					if (citycantfindlabelhead.equals(citycantfindlabelexcel)) {
						test.pass("TC:30 LABEL OF 'CITY' IS DIPLYED");
					} else {
						test.fail("TC:30 LABEL OF 'CITY' IS NOT DIPLYED");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "LABEL OF 'CITY' IS NOT DIPLYED");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// AFTER CLICK CITY LABEL

				try {
					String citycantfindlabelhead = page.cityconatfindlabelmethod1();
					String citycantfindlabelexcel = Excelreader.getData(0, 52, 5);
					if (citycantfindlabelhead.equals(citycantfindlabelexcel)) {
						test.pass("TC:30 LABEL OF 'CITY' IS ROLLED UP");
					} else {
						test.fail("TC:30 LABEL OF 'CITY' IS NOT ROLLED UP");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "LABEL OF 'CITY' IS NOT ROLLED UP");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// SPECIAL CHARACTER IN CITY CONT FIND
				try {
					String citycantfindexcel = Excelreader.getData(0, 53, 5);
					String citycontfindsendhead = page.cityvaluemethod1(citycantfindexcel);
					if (!citycontfindsendhead.equals(citycantfindexcel)) {
						test.pass("TC:30 USER SHOULD NOT SEND SPECIAL CHARACTERS");
					} else {
						test.fail("TC:30 USER SHOULD NOT SEND SPECIAL CHARACTERS");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "USER SHOULD NOT SEND SPECIAL CHARACTERS");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}

				// NUMERICAL IN CITY CONT FIND
				try {
					String citycantfindnumaexcel = Excelreader.getData(0, 54, 5);
					String citycontfindsendnuhead = page.cityvaluemethod1(citycantfindnumaexcel);
					if (!citycontfindsendnuhead.equals(citycantfindnumaexcel)) {
						test.pass("TC:30 USER SHOULD NOT SEND NUMERICAL");
					} else {
						test.fail("TC:30 USER SHOULD NOT SEND NUMERICAL");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "USER SHOULD NOT SEND NUMERICAL");
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
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "USER SHOULD BE SEND CHARACTERS");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// MORE THAN 30 CHARACTERS IN CITY CONT FIND

				try {
					String citycantfindmorethan30excel = Excelreader.getData(0, 56, 5);
					String citycontfindsendmorethan30head = page.cityvaluemethod1(citycantfindmorethan30excel);
					if (!citycontfindsendmorethan30head.equals(citycantfindmorethan30excel)) {
						test.pass("TC:30 USER SHOULD NOT SEND MORE THAN 30 CHARACTER");
					} else {
						test.fail("TC:30 USER SHOULD NOT SEND MORE THAN 30 CHARACTER");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "USER SHOULD NOT SEND MORE THAN 30 CHARACTER");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
			} else {
				test.fail("TC:28 CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 15)
	public void State_Mobile() {
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		test = extent.createTest("State_Mobile");
		// click on con't find location link
		try {
			String restaurantaddlabelhead = page.restaurantaddrlabelmethod();
			String restaurantaddlabelexcel = Excelreader.getData(0, 42, 5);
			if (restaurantaddlabelhead.equals(restaurantaddlabelexcel)) {
				test.pass("TC:28 CAN'T  FIND THE LOCATION LINK IS CLICKABLE");
				// state cont find label
				try {
					String statecontlabelhead = page.statecontfindlabelmethod();
					String statecontlabelexcel = Excelreader.getData(0, 58, 5);
					if (statecontlabelhead.equals(statecontlabelexcel)) {
						test.pass("TC:31 STATE LABEL IS DISPLAYED");
					} else {
						test.fail("TC:31 STATE LABEL IS NOT DISPLAYED");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "STATE LABEL IS NOT DISPLAYED");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// after click state cont find label
				try {
					String statecontlabelhead = page.statecontfindlabelmethod1();
					String statecontlabelexcel = Excelreader.getData(0, 58, 5);
					if (statecontlabelhead.equals(statecontlabelexcel)) {
						test.pass("TC:31 STATE LABEL IS ROLLED UP AFTER CLICK");
					} else {
						test.fail("TC:31 STATE LABEL IS NOT ROLLED AFTER CLICK");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "STATE LABEL IS NOT ROLLED AFTER CLICK");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// select drop down value in state
				try {
					String statecontfindlabelhead = page.statecontfindlabelmethod2();
					String statecontfindselectedvalexcel1 = Excelreader.getData(0, 59, 5);
					if (statecontfindlabelhead.equals(statecontfindselectedvalexcel1)) {
						test.pass("TC:31 STATE FUNCTION SHOULD BE CLICKABLE ");
						/*String statecontfindselectedvalhead = page.statecontfindsendedvaluemethod();
						String statecontfindselectedvalexcel = Excelreader.getData(0, 59, 5);
						if (statecontfindselectedvalhead.equals(statecontfindselectedvalexcel)) {
							test.pass("TC:31 USER SHOULD BE SELECT DROP DOWN VALUE");
						} else {
							test.fail("TC:31 USER SHOULD BE SELECT DROP DOWN VALUE");
							test.fail(test
									.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
									+ "USER SHOULD BE SELECT DROP DOWN VALUE");
						}*/
					} else {
						test.fail("TC:31 STATE FUNCTION SHOULD BE CLICKABLE");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "STATE FUNCTION SHOULD BE CLICKABLE");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
			} else {
				test.fail("TC:28 CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 16)
	public void Landmark_Mobile() {
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		test = extent.createTest("LandmarkB");
		// click on con't find location link
		try {
			String restaurantaddlabelhead = page.restaurantaddrlabelmethod();
			String restaurantaddlabelexcel = Excelreader.getData(0, 42, 5);
			if (restaurantaddlabelhead.equals(restaurantaddlabelexcel)) {
				test.pass("TC:28 CAN'T  FIND THE LOCATION LINK IS CLICKABLE");
				// POPULAR LAND MARK LABEL
				try {
					String popularlandmarklabelhead = page.landmarklabemethod();
					String popularlandmarklabelexcel = Excelreader.getData(0, 60, 6);
					if (popularlandmarklabelhead.equals(popularlandmarklabelexcel)) {
						test.pass("TC:32 VERIFY LABEL 'Landmark (describe location)' IS DISPLAYED");
					} else {
						test.fail("TC:32 VERIFY LABEL 'Landmark (describe location)' IS NOT DISPLAYED");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "VERIFY LABEL 'Landmark (describe location)' IS NOT DISPLAYED");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// AFTER CLICK POPULAR LAND MARK LABEL ROOL UP
				try {
					String popularlandmarklabelhead = page.landmarklabemethod1();
					String popularlandmarklabelexcel = Excelreader.getData(0, 60, 6);
					if (popularlandmarklabelhead.equals(popularlandmarklabelexcel)) {
						test.pass("TC:32 VERIFY LABEL 'Landmark (describe location)' IS ROLLED UP");
					} else {
						test.fail("TC:32 VERIFY LABEL 'Landmark (describe location)' IS NOT ROLLED UP");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
										+ "VERIFY LABEL 'Landmark (describe location)' IS NOT ROLLED UP");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// special characters in popular land mark
				try {
					String popularlandmarksendSPEexcel = Excelreader.getData(0, 61, 5);
					String popularlandmarksendSPEhead = page
							.popularlandmarksendatttmethod1(popularlandmarksendSPEexcel);
					if (!popularlandmarksendSPEhead.equals(popularlandmarksendSPEexcel)) {
						test.pass("TC:19 USER SHOULD NOT BE SEND SPECIAL CHARACTERS IN POPULAR LAND MARK...TEXT");
					} else {
						test.fail("TC:19 USER SHOULD NOT BE SEND SPECIAL CHARACTERS IN POPULAR LAND MARK...TEXT");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
										+ "USER SHOULD NOT BE SEND SPECIAL CHARACTERS IN POPULAR LAND MARK...TEXT");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}

				// NUMERICAL
				try {
					String popularlandmarksendNUMAexcel = Excelreader.getData(0, 62, 5);
					String popularlandmarksendNUMAhead = page
							.popularlandmarksendatttmethod1(popularlandmarksendNUMAexcel);
					if (!popularlandmarksendNUMAhead.equals(popularlandmarksendNUMAexcel)) {
						test.pass("TC:19 USER SHOULD BE SEND NUMERICAL IN POPULAR LAND MARK...TEXT");
					} else {
						test.fail("TC:19 USER SHOULD BE SEND NUMERICAL IN POPULAR LAND MARK...TEXT");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
										+ "USER SHOULD BE SEND NUMERICAL IN POPULAR LAND MARK...TEXT");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// CHARACTERS
				try {
					String popularlandmarksendCHARexcel = Excelreader.getData(0, 63, 5);
					String popularlandmarksendCHARhead = page
							.popularlandmarksendatttmethod1(popularlandmarksendCHARexcel);
					if (popularlandmarksendCHARhead.equals(popularlandmarksendCHARexcel)) {
						test.pass("TC:19 USER SHOULD NOT BE SEND CHARACTERS IN POPULAR LAND MARK...TEXT");
					} else {
						test.fail("TC:19 USER SHOULD NOT BE SEND CHARACTERS IN POPULAR LAND MARK...TEXT");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
										+ "USER SHOULD NOT BE SEND CHARACTERS IN POPULAR LAND MARK...TEXT");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// MORE THAN 80 CHARACTERS ONLY
				try {
					String popularlandmarksendMORE80excel = Excelreader.getData(0, 64, 5);
					String popularlandmarksendMORE80head = page
							.popularlandmarksendatttmethod1(popularlandmarksendMORE80excel);
					if (!popularlandmarksendMORE80head.equals(popularlandmarksendMORE80excel)) {
						test.pass("TC:19 USER NOT ABEL TO SEND MORE THAN 80 CHARACTERS IN POPULAR LAND MARK...TEXT");
					} else {
						test.fail("TC:19 USER NOT ABEL TO SEND MORE THAN 80 CHARACTERS IN POPULAR LAND MARK...TEXT");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
										+ "USER NOT ABEL TO SEND MORE THAN 80 CHARACTERS IN POPULAR LAND MARK...TEXT");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
			} else {
				test.fail("TC:28 CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}}
	

	@Test(priority = 17)
	public void Visit_Date_Mobile() {
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		test = extent.createTest("Visit_Date_Mobile");
		// click on con't find location link
		try {
			String restaurantaddlabelhead = page.restaurantaddrlabelmethod();
			String restaurantaddlabelexcel = Excelreader.getData(0, 42, 5);
			if (restaurantaddlabelhead.equals(restaurantaddlabelexcel)) {
				test.pass("TC:28 CAN'T  FIND THE LOCATION LINK IS CLICKABLE");
				// visit date label
				try {
					String visitdatelabehaed = page.visitdatelabelmethod();
					String visitdatelabeexcel = Excelreader.getData(0, 65, 5);
					if (visitdatelabehaed.equals(visitdatelabeexcel)) {
						test.pass("TC:20 VERIFY LABEL 'VISIT DATE' IS DISPLAYED");
					} else {
						test.fail("TC:20 VERIFY LABEL 'VISIT DATE' IS NOT DISPLAYED");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "20 VERIFY LABEL 'VISIT DATE' IS NOT DISPLAYED");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}

				// visit date month label
				try {
					String visitdatemonthlabehaed = page.visitdatemonthlabelmethod();
					String visitdatemonthlabeexcel = Excelreader.getData(0, 66, 5);
					if (visitdatemonthlabehaed.equals(visitdatemonthlabeexcel)) {
						test.pass("TC:21 VERIFY LABEL VISIT DATE 'MONTH' IS DISPLAYED");
					} else {
						test.fail("TC:21 VERIFY LABEL VISIT DATE 'MONTH' IS NOT DISPLAYED");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "21 VERIFY LABEL VISIT DATE 'MONTH' IS NOT DISPLAYED");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}

				// After click month label

				try {
					String visitdatemonthlabehaed = page.visitdatemonthlabelmethod1();
					String visitdatemonthlabeexcel = Excelreader.getData(0, 66, 5);
					if (visitdatemonthlabehaed.equals(visitdatemonthlabeexcel)) {
						test.pass("TC:21 VERIFY LABEL VISIT DATE 'MONTH' IS ROLLED UP");
					} else {
						test.fail("TC:21 VERIFY LABEL VISIT DATE 'MONTH' IS NOT ROLLED UP");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "21 VERIFY LABEL VISIT DATE 'MONTH' IS NOT DISPLAYED");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}

				try {
					String visitdatemothsendvalue1head = page.visitdatemonthlabelmethod2();
					String visitdatemothsendvalexcel1 = Excelreader.getData(0, 67, 5);
					if (visitdatemothsendvalue1head.equals(visitdatemothsendvalexcel1)) {
						test.pass("TC:21 MONTH FUNCTION SHOULD BE CLICKABLE");
						/*String visitdatemothsendvalhead = page.visitdatemothsendvaluemethod();
						String visitdatemothsendvalexcel = Excelreader.getData(0, 67, 5);
						if (visitdatemothsendvalhead.equals(visitdatemothsendvalexcel)) {
							test.pass("TC:21 USER SHOULD BE SELECT DROP DOWN VALUE IN MONT FUNTION");
						} else {
							test.fail("TC:21 USER SHOULD BE SELECT DROP DOWN VALUE IN MONT FUNTION");
							test.fail(test
									.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
									+ "21 USER SHOULD BE SELECT DROP DOWN VALUE IN MONT FUNTION");
						}*/
					} else {
						test.fail("TC:21 MONTH FUNCTION SHOULD BE CLICKABLE");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "MONTH FUNCTION SHOULD BE CLICKABLE");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
			} else {
				test.fail("TC:28 CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 18)
	public void Day_and_year_Mobile() {
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		test = extent.createTest("Day_and_year_Mobile");
		// click on con't find location link
		try {
			String restaurantaddlabelhead = page.restaurantaddrlabelmethod();
			String restaurantaddlabelexcel = Excelreader.getData(0, 42, 5);
			if (restaurantaddlabelhead.equals(restaurantaddlabelexcel)) {
				test.pass("TC:28 CAN'T  FIND THE LOCATION LINK IS CLICKABLE");
				// day label
				try {
					String daycontfindlabelhead = page.daycontfindlabelmethod();
					String daycontfindlabelexcel = Excelreader.getData(0, 68, 5);
					if (daycontfindlabelhead.equals(daycontfindlabelexcel)) {
						test.pass("TC:35 VERIFY LABEL 'DAY' IS DISPLAYYED");
					} else {
						test.fail("TC:35 VERIFY LABEL 'DAY' IS NOT DISPLAYYED");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "VERIFY LABEL 'DAY' IS DISPLAYYED");
					}

				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}

				// after click day label

				try {
					String daycontfindlabelhead = page.daycontfindlabelmethod1();
					String daycontfindlabelexcel = Excelreader.getData(0, 68, 5);
					if (daycontfindlabelhead.equals(daycontfindlabelexcel)) {
						test.pass("TC:35 VERIFY LABEL 'DAY' IS ROLLED UP");
					} else {
						test.fail("TC:35 VERIFY LABEL 'DAY' IS NOT ROLLED UP");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "VERIFY LABEL 'DAY' IS ROLLED UP");
					}

				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}

				// after click on day select drop down
				try {
					String daycontfindcdropdownvalhead = page.daycontfindcdropdownvalmethod();
					if (daycontfindcdropdownvalhead.equals("")) {
						test.pass("TC:22 WITH OUT SELECT MONTH USER CON'T SELECT DATE");
					} else {
						test.fail("TC:22 WITH OUT SELECT MONTH USER CON'T SELECT DATE");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "WITH OUT SELECT MONTH USER CON'T SELECT DATE");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}

				// check year label
				try {
					String yearcontfindlabelhead = page.yearcontfindlabelmethod();
					String yearcontfindlabelexcel = Excelreader.getData(0, 69, 5);
					if (yearcontfindlabelhead.equals(yearcontfindlabelexcel)) {
						test.pass("TC:35 VERIFY LABEL 'YEAR' IS DISPLAYYED");
					} else {
						test.fail("TC:35 VERIFY LABEL 'YEAR' IS NOT DISPLAYYED");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "VERIFY LABEL 'YEAR' IS DISPLAYYED");
					}

				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}

				// after click check year label
				try {
					String yearcontfindlabelhead = page.yearcontfindlabelmethod1();
					String yearcontfindlabelexcel = Excelreader.getData(0, 69, 5);
					if (yearcontfindlabelhead.equals(yearcontfindlabelexcel)) {
						test.pass("TC:35 VERIFY LABEL 'YEAR' IS ROLLED UP");
					} else {
						test.fail("TC:35 VERIFY LABEL 'YEAR' IS NOT ROLLED UP");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "VERIFY LABEL 'YEAR' IS DISPLAYYED");
					}

				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// select year drop down value WITH OUR SELECT MONTH
				try {
					String yearcontfindcdropdownvalhead = page.yearcontfindcdropdownvalmethod();
					if (yearcontfindcdropdownvalhead.equals("")) {
						test.pass("TC:23 WITH OUT SELECT MONTH USER CON'T SELECT YEAR");
					} else {
						test.fail("TC:23 WITH OUT SELECT MONTH USER CON'T SELECT YEAR");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "WITH OUT SELECT MONTH USER CON'T SELECT YEAR");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// select day after select month

				try {
					String visitdatemothsendvalue1head = page.visitdatemothsendvaluemethod1();
					String visitdatemothsendvalexcel1 = Excelreader.getData(0, 67, 5);
					if (visitdatemothsendvalue1head.equals(visitdatemothsendvalexcel1)) {
						test.pass("TC:21 MONTH FUNCTION SHOULD BE CLICKABLE");
						/*String visitdatemothsendvalhead = page.visitdatemothsendvaluemethod();
						String visitdatemothsendvalexcel = Excelreader.getData(0, 67, 5);
						if (visitdatemothsendvalhead.equals(visitdatemothsendvalexcel)) {
							test.pass("TC:21 USER SHOULD BE SELECT DROP DOWN VALUE IN MONT FUNTION");*/
							// select day after select month
							String daysendedvaluehead = page.daysendedvaluemethodafter1();
							String daysendedvalueexcel = Excelreader.getData(0, 70, 5);
							if (daysendedvaluehead.equals(daysendedvalueexcel)) {
								test.pass("TC:35 DAY DROP DOWN FUNCTION SHOULD BE CLICKABLE");
								/*String daysendedvaluehead1 = page.daysendedvaluemethodafter2();
								String daysendedvalueexcel1 = Excelreader.getData(0, 70, 5);
								if (daysendedvaluehead1.equals(daysendedvalueexcel1)) {
									test.pass("TC:35 USER SHOULD BE SELECT DROPW DOWN VALUE IN DAY FUNCTION");
								} else {
									test.fail("TC:35 USER SHOULD BE SELECT DROPW DOWN VALUE IN DAY FUNCTION");
									test.fail(test.addScreenCaptureFromPath(
											Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
											+ "USER SHOULD BE SELECT DROPW DOWN VALUE IN DAY FUNCTION");
								}

							*/ }else {
								test.fail("TC:35 DAY DROP DOWN FUNCTION SHOULD BE CLICKABLE");
								test.fail(test.addScreenCaptureFromPath(
										Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "DAY DROP DOWN FUNCTION SHOULD BE CLICKABLE");
							}
							// select the year after select month
							String yearsendedvaluemethodafterhead = page.yearsendedvaluemethodafter();
							String yearsendedvaluemethodafterexcel = Excelreader.getData(0, 71, 5);
							if (yearsendedvaluemethodafterhead.equals(yearsendedvaluemethodafterexcel)) {
								test.pass("TC:35 YEAR DROP DOWN FUNCTION SHOULD BE CLICKABLE");
								/*String yearsendedvaluemethodafter1head = page.yearsendedvaluemethodafter1();
								String yearsendedvaluemethodafter1excel = Excelreader.getData(0, 71, 5);
								if (yearsendedvaluemethodafter1head.equals(yearsendedvaluemethodafter1excel)) {
									test.pass("TC:35 USER SHOULD BE SELECT DROPW DOWN VALUE IN YEAR FUNCTION");
								} else {
									test.fail("TC:35 USER SHOULD BE SELECT DROPW DOWN VALUE IN YEAR FUNCTION");
									test.fail(test.addScreenCaptureFromPath(
											Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
											+ "USER SHOULD BE SELECT DROPW DOWN VALUE IN YEAR FUNCTION");
								}*/

							} else {
								test.fail("TC:35 YEAR DROP DOWN FUNCTION SHOULD BE CLICKABLE");
								test.fail(test.addScreenCaptureFromPath(
										Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "YEAR DROP DOWN FUNCTION SHOULD BE CLICKABLE");
							}
						} /*else {
							test.fail("TC:21 USER SHOULD BE SELECT DROP DOWN VALUE IN MONT FUNTION");
							test.fail(test
									.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
									+ "21 USER SHOULD BE SELECT DROP DOWN VALUE IN MONT FUNTION");
						}
				
					}*/ else {
						test.fail("TC:21 MONTH FUNCTION SHOULD BE CLICKABLE");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "MONTH FUNCTION SHOULD BE CLICKABLE");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}

			} else {
				test.fail("TC:28 CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 19)
	public void Visit_Time_AM_PM_Mobile() {
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		test = extent.createTest("Visit_Time_AM_PM_Mobile");
		// click on con't find location link
		try {
			String restaurantaddlabelhead = page.restaurantaddrlabelmethod();
			String restaurantaddlabelexcel = Excelreader.getData(0, 42, 5);
			if (restaurantaddlabelhead.equals(restaurantaddlabelexcel)) {
				test.pass("TC:28 CAN'T  FIND THE LOCATION LINK IS CLICKABLE");
				// 'visit TIME' label
				try {
					String visittimelabelhead = page.visittimelabelmethod();
					String visittimelabelexcel = Excelreader.getData(0, 72, 5);
					if (!visittimelabelhead.equals(visittimelabelexcel)) {
						test.pass("TC:37 VERIFY LABEL 'VISIT TIME' IS DISPLAYED");
					} else {
						test.fail("TC:37 VERIFY LABEL 'VISIT TIME' IS NOT DISPLAYED");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "VERIFY LABEL 'VISIT TIME' IS NOT DISPLAYED");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// time label

				try {

					String timelabelhead = page.timelabelmethod();
					String timelabelexcel = Excelreader.getData(0, 73, 5);
					if (timelabelhead.equals(timelabelexcel)) {
						test.pass("TC:38 VERIFY LABEL 'TIME' IS DISPLAYED");
					} else {
						test.fail("TC:38 VERIFY LABEL 'TIME' IS NOT DISPLAYED");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "VERIFY LABEL 'TIME' IS NOT DISPLAYED");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}

				// check time(12) text
				try {
					String timetext12displayedhead = page.timetext12displayedmethod();
					String timetext12displayedexcel = Excelreader.getData(0, 74, 5);
					if (timetext12displayedhead.equals(timetext12displayedexcel)) {
						test.pass("TC:39 VERIFY TEXT '12:00' IS DISPLAYED DEFAULT IN TIME FUNCTION");
					} else {
						test.fail("TC:39 VERIFY TEXT '12:00' IS NOT DISPLAYED IN TIME FUNCTION");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "VERIFY TEXT '12:00' IS NOT DISPLAYED IN TIME FUNCTION");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}

				// click and select the time
				try {
					String timedropdown1215head = page.timedropdown1215method();
					String timedropdown1215excel = Excelreader.getData(0, 75, 5);
					if (timedropdown1215head.equals(timedropdown1215excel)) {
						test.pass("TC:39 TIME FUNCTION SHOULD BE CLICKABLE");
						/*String timeselect12displayedhead = page.timetext12displayedmethod1();
						String timeselect12displayedexcel = Excelreader.getData(0, 75, 5);
						if (timeselect12displayedhead.equals(timeselect12displayedexcel)) {
							test.pass("TC:39 USER SHOULD BE SELECT TIME OF DROP DOWN VALUE");
						} else {
							test.fail("TC:39 USER SHOULD BE SELECT TIME OF DROP DOWN VALUE");
							test.fail(test
									.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
									+ "USER SHOULD BE SELECT TIME OF DROP DOWN VALUE");
						}*/

					} else {
						test.fail("TC:39 TIME FUNCTION SHOULD BE CLICKABLE");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "TIME FUNCTION SHOULD BE CLICKABLE");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}

				// LABEL OF AM-PM

				try {
					String ampmlabelhead = page.ampmlabelmethod();
					String ampmlabelexcel = Excelreader.getData(0, 76, 5);
					if (ampmlabelhead.equals(ampmlabelexcel)) {
						test.pass("TC:40 VERIFY LABEL 'AM/PM' IS DIPLAYED");
					} else {
						test.fail("TC:40 VERIFY LABEL 'AM/PM' IS NOT DIPLAYED");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "VERIFY LABEL 'AM/PM' IS NOT DIPLAYED");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// check AM text
				try {
					String AMtextdisplayedhead = page.AMvaluedisplayedmethod();
					String AMtextdisplayedexcel = Excelreader.getData(0, 77, 5);
					if (AMtextdisplayedhead.equals(AMtextdisplayedexcel)) {
						test.pass("TC:40 VERIFY TEXT 'AM' IS DISPLAYED");
					} else {
						test.fail("TC:40 VERIFY TEXT 'AM' IS NOT DISPLAYED");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "VERIFY TEXT 'AM' IS NOT DISPLAYED");
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
						/*String amtextdisplayedhead = page.pmvaluedisplayedmethod();
						String amtextdisplayedexcel = Excelreader.getData(0, 78, 5);
						if (amtextdisplayedhead.equals(amtextdisplayedexcel)) {
							test.pass("TC:40 USER ABLE TO SELECT DROP DOWN VALUE OF AM/PM FUNCTION");
						} else {
							test.fail("TC:40 USER NOT ABLE TO SELECT DROP DOWN VALUE OF AM/PM FUNCTION");
							test.fail(test
									.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
									+ "USER NOT ABLE TO SELECT DROP DOWN VALUE OF AM/PM FUNCTION");
						}*/
					} else {
						test.fail("TC:40 AM/PM FUNCTION SHOULD BE CLICKABLE");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "AM/PM FUNCTION SHOULD BE CLICKABLE");
					}
				} catch (Exception e) {

				}
			} else {
				test.fail("TC:28 CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 20)
	public void What_was_your_takeway_Mobile() {
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		test = extent.createTest("What_was_your_takeway_Mobile");
		// click on con't find location link
		try {
			String restaurantaddlabelhead = page.restaurantaddrlabelmethod();
			String restaurantaddlabelexcel = Excelreader.getData(0, 42, 5);
			if (restaurantaddlabelhead.equals(restaurantaddlabelexcel)) {
				test.pass("TC:28 CAN'T  FIND THE LOCATION LINK IS CLICKABLE");
				// what was your takeway label
				try {
					String whatwasyourtakeawaylabelhead = page.whatwasyourtakeawaylabelmethod();
					String whatwasyourtakeawaylabelexcel = Excelreader.getData(0, 79, 5);
					if (whatwasyourtakeawaylabelhead.equals(whatwasyourtakeawaylabelexcel)) {
						test.pass("TC:41 VERIFY LABEL '*What was your takeaway preference' IS DISPLAYED");
					} else {
						test.fail("TC:41 VERIFY LABEL '*What was your takeaway preference' IS NOT DISPLAYED");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "VERIFY LABEL '*What was your takeaway preference' IS NOT DISPLAYED");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// drive thru radio button LABEL
				try {
					String drivethruhead = page.drivethrumethod();
					String drivethruexcel = Excelreader.getData(0, 80, 5);
					if (drivethruhead.equals(drivethruexcel)) {
						test.pass("TC:41 VERIFY LABEL 'DRIVE THRU' IS DISPLAYED");
					} else {
						test.fail("TC:41 VERIFY LABEL 'DRIVE THRU' IS NOT DISPLAYED");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "VERIFY LABEL 'DRIVE THRU' IS NOT DISPLAYED");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}

				// IN-STORE LABEL
				try {
					String instorehead = page.instoremethod();
					String instoreexcel = Excelreader.getData(0, 81, 5);
					if (instorehead.equals(instoreexcel)) {
						test.pass("TC:41 VERIFY LABEL 'IN-STORE' IS DISPLAYED");
					} else {
						test.fail("TC:41 VERIFY LABEL 'IN-STORE' IS NOT DISPLAYED");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "VERIFY LABEL 'IN-STORE' IS NOT DISPLAYED");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}

				// DRIVE thru radio button
				try {
					String drivethruradiobuttonisselectedheadd = page.driveradiobuttonbydefaultselectedmethod();
					if (!drivethruradiobuttonisselectedheadd.equals("true")) {
						test.pass("TC:41 DRIVE THRU RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
					} else {
						test.fail("TC:41 DRIVE THRU RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "DRIVE THRU RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());

				}
				// IN-STORE RADIO BUTTON
				try {
					String instoreradiobuttonisselectedheadd = page.instoreradiobuttonbydefaultselectedmethod();
					if (!instoreradiobuttonisselectedheadd.equals("true")) {
						test.pass("TC:41 IN-STORE RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
					} else {
						test.fail("TC:41 IN-STORE RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "IN-STORE RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());

				}
				// DRIVE thru radio button after selected
				try {
					String drivethruradiobuttonisselectedheadd = page.driveradiobuttonselectedmethod();
					if (drivethruradiobuttonisselectedheadd.equals("true")) {
						test.pass("TC:41 DRIVE THRU TADIO BUTTON SHOULD BE CLICKABLE");
					} else {
						test.fail("TC:41 DRIVE THRU TADIO BUTTON SHOULD BE CLICKABLE");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "DRIVE THRU TADIO BUTTON SHOULD BE CLICKABLE");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());

				}

				// IN-STORE RADIO BUTTON after selected
				try {
					String instoreradiobuttonisselectedheadd = page.instoreradiobuttonselectedmethod();
					if (instoreradiobuttonisselectedheadd.equals("true")) {
						test.pass("TC:41 IN-STORE RADIO BUTTON SHOULD BE CLICKABLE");
					} else {
						test.fail("TC:41 IN-STORE RADIO BUTTON SHOULD BE CLICKABLE");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "IN-STORE RADIO BUTTON SHOULD BE CLICKABLE");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());

				}
				// DRIVE thru radio button
				try {
					String drivethruradiobuttonisselectedheadd = page.driveradiobuttonbydefaultselectedmethod();
					if (!drivethruradiobuttonisselectedheadd.equals("true")) {
						test.pass("TC:41 DRIVE THRU AND IN-STORE RADIO BUTTONS SHOULD NOT SELECTED BOTH");
					} else {
						test.fail("TC:41 DRIVE THRU AND IN-STORE RADIO BUTTONS SHOULD NOT SELECTED BOTH");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "DRIVE THRU AND IN-STORE RADIO BUTTONS SHOULD NOT SELECTED BOTH");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());

				}
			} else {
				test.fail("TC:28 CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 21)
	public void First_Name_Mobile() {
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		test = extent.createTest("First_Name_Mobile");

		// TELL US ABOUT YOURSELF
		try {
			String tellusabouthead = page.teluraboutmethod();
			String tellusaboutexcel = Excelreader.getData(0, 82, 5);
			if (tellusabouthead.equals(tellusaboutexcel)) {
				test.pass("TC:43 THE LABEL 'TELL US ABOUT YOURSELF' IS DISPLAYED");
			} else {
				test.fail("TC:43 THE LABEL 'TELL US ABOUT YOURSELF' IS NOT DISPLAYED ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "THE LABEL 'TELL US ABOUT YOURSELF' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// label of first name
		try {
			String firstnamelabehead = page.firstnamelabelmethod();
			String firstnamelabelexcel = Excelreader.getData(0, 83, 5);
			if (firstnamelabehead.equals(firstnamelabelexcel)) {
				test.pass("TC:46 THE TEXT '*FIRST NAME' IS DISPLAYED");
			} else {
				test.fail("TC:46 THE TEXT '*FIRST NAME' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "THE TEXT '*FIRST NAME' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// after click first name label
		try {
			String firstnamelabehead = page.firstnamelabelmethod1();
			String firstnamelabelexcel = Excelreader.getData(0, 83, 5);
			if (firstnamelabehead.equals(firstnamelabelexcel)) {
				test.pass("TC:46 THE TEXT '*FIRST NAME' IS ROLLED UP IN THE SAME PAGE");
			} else {
				test.fail("TC:46 THE TEXT '*FIRST NAME' IS NOT ROLLED UP IN THE SAME PAGE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "THE TEXT '*FIRST NAME' IS NOT ROLLED UP IN THE SAME PAGE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// SPECIAL CHARACTERS
		try {
			String firstnamesendvalexcel = Excelreader.getData(0, 84, 5);
			String sendedvalhead = page.finameEnteredvalue(firstnamesendvalexcel);
			if (!sendedvalhead.equals(firstnamesendvalexcel)) {
				test.pass("TC:46  USE SHOULD NOT BE SEND SPECIAL CHARACTERS IN FIRSTNAME TEXTBOX");
			} else {
				test.fail("TC:46  USE SHOULD NOT BE SEND SPECIAL CHARACTERS IN FIRSTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "USE SHOULD NOT BE SEND SPECIAL CHARACTERS IN FIRSTNAME TEXTBOX");
			}
		} catch (Exception e) {

			test.fail("Error:" + e.getMessage());
		}
		// NUMARICAL VALUES IN FIRST NAME FUNCTION
		try {
			String firstnamesendvalexcel = Excelreader.getData(0, 85, 5);
			String sendedvalhead = page.finameEnteredvalue(firstnamesendvalexcel);
			if (!sendedvalhead.equals(firstnamesendvalexcel)) {
				test.pass("TC:46  USE SHOULD NOT BE SEND NUMARICAL VALUE IN FIRSTNAME TEXTBOX");
			} else {
				test.fail("TC:46  USE SHOULD NOT BE SEND NUMARICAL VALUE IN FIRSTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "USE SHOULD NOT BE SEND NUMARICAL VALUE IN FIRSTNAME TEXTBOX");
			}
		} catch (Exception e) {

			test.fail("Error:" + e.getMessage());
		}
		// CHARACTERS VALUES IN FIRST NAME FUNCTION
		try {
			String firstnamesendvalexcel = Excelreader.getData(0, 86, 5);
			String sendedvalhead = page.finameEnteredvalue(firstnamesendvalexcel);
			if (sendedvalhead.equals(firstnamesendvalexcel)) {
				test.pass("TC:46  USE SHOULD  BE SEND CHARACTERS  IN FIRSTNAME TEXTBOX");
			} else {
				test.fail("TC:46  USE SHOULD BE SEND CHARACTERS IN FIRSTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "USE SHOULD  BE SEND CHARACTERS IN FIRSTNAME TEXTBOX");
			}
		} catch (Exception e) {

			test.fail("Error:" + e.getMessage());
		}

		// MORE THAN 25 CHARACTERS IN FIRST NAME FUNCTION
		try {
			String firstnamesendvalexcel = Excelreader.getData(0, 87, 5);
			String sendedvalhead = page.finameEnteredvalue(firstnamesendvalexcel);
			if (!sendedvalhead.equals(firstnamesendvalexcel)) {
				test.pass("TC:46  USE SHOULD NOT BE SEND MORE THAN 25 CHARACTERS  IN FIRSTNAME TEXTBOX");
			} else {
				test.fail("TC:46  USE SHOULD NOT BE SEND MORE THAN 25 CHARACTERS IN FIRSTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "USE SHOULD  NOT BE SEND MORE THAN 25 CHARACTERS IN FIRSTNAME TEXTBOX");
			}
		} catch (Exception e) {

			test.fail("Error:" + e.getMessage());
		}

		// ERROR MESSAGE OF FIRST NAME
		try {
			String finameerorhead1 = page.firstnameerror();
			String finamerrorexcel2 = Excelreader.getData(0, 88, 5);
			if (finameerorhead1.equals(finamerrorexcel2)) {
				test.pass("TC:46 'ERROR MESSAGE DISPLAYED' -->" + "'" + finameerorhead1 + "'");
			} else {
				test.fail("TC:46 FIRST NAME FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "FIRST NAME FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 21)
	public void Last_Name_Mobile() {
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		test = extent.createTest("Last_Name_Mobile");

		// LAST NAME LABEL
		try {
			String LNlabelhead = page.lastnamelabelmethod();
			String LNlabelexcel = Excelreader.getData(0, 89, 5);
			if (LNlabelhead.equals(LNlabelexcel)) {
				test.pass("TC:47 THE LABEL 'LAST NAME' IS DISPLAYED");
			} else {
				test.fail("TC:47 THE LABEL 'LAST NAME' IS NOT DISPLAYED ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "THE LABEL 'LAST NAME' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// CLICK AND ROLLED UP THE LAST NAME LABEL

		try {
			String LNlabelhead = page.lastnamelabelmethod1();
			String LNlabelexcel = Excelreader.getData(0, 89, 5);
			if (LNlabelhead.equals(LNlabelexcel)) {
				test.pass("TC:47 THE LABEL 'LAST NAME' IS ROLLED UP AFTER CLICK ON LAST NAME");
			} else {
				test.fail("TC:47 THE LABEL 'LAST NAME' IS NOT ROLLED UP AFTER CLICK ON LAST NAME");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "THE LABEL 'LAST NAME' IS NOT ROLLED UP AFTER CLICK ON LAST NAME");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// SPECIAL CHARACTERS
		try {
			String LNSPECIALCHARACTER = Excelreader.getData(0, 90, 5);
			String LAscvalue = page.lastnameenterdvalue(LNSPECIALCHARACTER);
			if (!LAscvalue.equals(LNSPECIALCHARACTER)) {
				test.pass("TC:47 USER SHOULD NOT BE SEND SPECIAL CHARACTERS IN LASTNAME TEXTBOX");
			} else {
				test.fail("TC:47 USER SHOULD NOT BE SEND SPECIAL CHARACTERS IN LASTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "USER SHOULD NOT BE SEND SPECIAL CHARACTERS IN LASTNAME TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// NUMARICAL IN LAST NAME FUNCTION

		try {
			String LNSPECIALCHARACTER = Excelreader.getData(0, 91, 5);
			String LAscvalue = page.lastnameenterdvalue(LNSPECIALCHARACTER);
			if (!LAscvalue.equals(LNSPECIALCHARACTER)) {
				test.pass("TC:47 USER SHOULD NOT BE SEND NUMARICAL IN LASTNAME TEXTBOX");
			} else {
				test.fail("TC:47 USER SHOULD NOT BE SEND NUMARICAL IN LASTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "USER SHOULD NOT BE SEND NUMARICAL IN LASTNAME TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// CHARACTERS IN LAST NAME FUNCTION

		try {
			String LNSPECIALCHARACTER = Excelreader.getData(0, 92, 5);
			String LAscvalue = page.lastnameenterdvalue(LNSPECIALCHARACTER);
			if (LAscvalue.equals(LNSPECIALCHARACTER)) {
				test.pass("TC:47 USER SHOULD BE SEND CHARACTERS IN LASTNAME TEXTBOX");
			} else {
				test.fail("TC:47 USER SHOULD BE SEND CHARACTERS IN LASTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "USER SHOULD  BE SEND CHARACTERS IN LASTNAME TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// MORE THAN 25 CHARACTER IN LAST NAME FUNCTION
		try {
			String LNSPECIALCHARACTER = Excelreader.getData(0, 93, 5);
			String LAscvalue = page.lastnameenterdvalue(LNSPECIALCHARACTER);
			if (!LAscvalue.equals(LNSPECIALCHARACTER)) {
				test.pass("TC:47 USER SHOULD NOT SEND MORE THAN 25 CHARACTERS IN LASTNAME TEXTBOX");
			} else {
				test.fail("TC:47 USER SHOULD NOT SEND MORE THAN 25 CHARACTERS IN LASTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "USER SHOULD NOT BE SEND MORE THAN 25 CHARACTERS IN LASTNAME TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// LAST NAME ERROR MESSAGE
		try {
			String LNerrormess = page.lastnameerrormesmethod();
			String LNerrormesexcel = Excelreader.getData(0, 94, 5);
			if (LNerrormess.equals(LNerrormesexcel)) {
				test.pass("TC:47 'ERROR MESSAGE DISPLAYED' -->" + "'" + LNerrormess + "'");
			} else {
				test.fail("TC:47 LAST NAME FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "LAST NAME FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 22)
	public void Email_Mobile() {
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		test = extent.createTest("Email_Mobile");

		// label of mail
		try {
			String emaillabelhead = page.emaillabelmethod();
			String emaillabelexcel = Excelreader.getData(0, 95, 5);
			if (emaillabelhead.equals(emaillabelexcel)) {
				test.pass("TC:54 THE LABEL 'EMAIL' IS DISPLAYED ");
			} else {
				test.fail("TC:54 THE LABEL 'EMAIL' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "THE LABEL 'EMAIL' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK ON mail AND LABEL IS ROLLED UP OR NOT
		try {
			String emaillabelhead = page.emaillabelmethod1();
			String emaillabelexcel = Excelreader.getData(0, 95, 5);
			if (emaillabelhead.equals(emaillabelexcel)) {
				test.pass("TC:54 THE LABEL 'EMAIL' IS ROLLED UP AFTER CLICK ON EMAIL FUNCTION");
			} else {
				test.fail("TC:54 THE LABEL 'EMAIL' IS NOT ROLLED UP AFTER CLICK ON EMAIL FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "THE LABEL 'EMAIL' IS NOT ROLLED UP AFTER CLICK ON EMAIL FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// WITH OUT .COM FORMAT
		try {
			String emailsendid = Excelreader.getData(0, 96, 5);
			String emailvlue = page.emailenteredvalue(emailsendid);
			if (emailvlue.equals(emailsendid)) {
				test.pass("TC:54  USER ABEL TO SEND MAIL WITH OUR FORMAT(.COM) IN MAIL TEXTBOX");
				String mailerrormessagehead = page.emailerrormessagemethod();
				String mailerrormessageexcel = Excelreader.getData(0, 99, 5);
				if (mailerrormessagehead.equals(mailerrormessageexcel)) {
					test.pass("TC:54 WITH OUR FORMAT(.COM) 'ERROR MESSAGE DISPLAYED' -->" + "'" + mailerrormessagehead
							+ "'");
				} else {
					test.fail("TC:54  WITH OUR FORMAT(.COM) MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
							+ "WITH OUR FORMAT(.COM) MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				}
			} else {
				test.fail("TC:54 USER ABEL TO SEND MAIL WITH OUR FORMAT(.COM) IN MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "USER ABEL TO SEND MAIL WITH OUR FORMAT(.COM) IN MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// WITH OUT @GAMIL

		try {
			page.emailclearmethod();
			String emailsendid = Excelreader.getData(0, 97, 5);
			String emailvlue = page.emailenteredvalue(emailsendid);
			if (emailvlue.equals(emailsendid)) {
				test.pass("TC:54  USER ABEL TO SEND MAIL WITH OUR FORMAT(@GAMIL) IN MAIL TEXTBOX");
				String mailerrormessagehead = page.emailerrormessagemethod();
				String mailerrormessageexcel = Excelreader.getData(0, 99, 5);
				if (mailerrormessagehead.equals(mailerrormessageexcel)) {
					test.pass("TC:54 WITH OUR FORMAT(@GAMIL) 'ERROR MESSAGE DISPLAYED' -->" + "'" + mailerrormessagehead
							+ "'");
				} else {
					test.fail("TC:54  WITH OUR FORMAT(@GAMIL) MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
							+ "WITH OUR FORMAT(@GAMIL) MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				}
			} else {
				test.fail("TC:54 USER ABEL TO SEND MAIL WITH OUR FORMAT(@GAMIL) IN MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "USER ABEL TO SEND MAIL WITH OUR FORMAT(@GAMIL) IN MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// SEND WITH MAIL FORMAT

		try {
			String emailsendid = Excelreader.getData(0, 98, 5);
			String emailvlue = page.emailenteredvalue(emailsendid);
			if (emailvlue.equals(emailsendid)) {
				test.pass("TC:54  USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
				String mailerrormessagehead = page.emailerrormessagemethod();
				String mailerrormessageexcel = Excelreader.getData(0, 99, 5);
				if (!mailerrormessagehead.equals(mailerrormessageexcel)) {
					test.pass("TC:54 WITH FORMAT 'ERROR MESSAGE IS NOT DISPLAYED'");
				} else {
					test.fail("TC:54  WITH FORMAT MAIL FUNCTION ERROR MESSAGE  DISPLAYED--->" + "'"
							+ mailerrormessagehead + "'");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
							+ "WITH FORMAT MAIL FUNCTION ERROR MESSAGE  DISPLAYED");
				}
			} else {
				test.fail("TC:54 USER SHOULD SEND MAIL WITH FORMAT IN MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "USER SHOULD SEND MAIL WITH FORMAT IN MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE
		try {
			String mailerrormessagehead = page.emailerrormessagemethod1();
			String mailerrormessageexcel = Excelreader.getData(0, 99, 5);
			if (mailerrormessagehead.equals(mailerrormessageexcel)) {
				test.pass("TC:54 MAIL 'ERROR MESSAGE DISPLAYED' -->" + "'" + mailerrormessagehead + "'");
			} else {
				test.fail("TC:54 MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 23)
	public void Confirm_Email_Mobile() {
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		test = extent.createTest("Confirm_Email_Mobile");

		// label of confirm_email
		try {
			String conmaillabelhead = page.confirmmaillabelmethod();
			String conmaillabelexcel = Excelreader.getData(0, 100, 5);
			if (conmaillabelhead.equals(conmaillabelexcel)) {
				test.pass("TC:55 THE LABEL 'CONFIRM EMAIL' IS DISPLAYED ");
			} else {
				test.fail("TC:55 THE LABEL 'CONFIRM EMAIL' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "THE LABEL 'CONFIRM EMAIL' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK ON confirm_email AND LABEL IS ROLLED UP OR NOT
		try {
			String conmaillabelhead = page.confirmmaillabelmethod1();
			String conmaillabelexcel = Excelreader.getData(0, 100, 5);
			if (conmaillabelhead.equals(conmaillabelexcel)) {
				test.pass("TC:55 THE LABEL 'CONFIRM EMAIL' IS ROLLED UP AFTER CLICK ON CONFIRM EMAIL FUNCTION");
			} else {
				test.fail("TC:55 THE LABEL 'CONFIRM EMAIL' IS NOT ROLLED UP AFTER CLICK ON CONFIRM EMAIL FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "THE LABEL 'CONFIRM EMAIL' IS NOT ROLLED UP AFTER CLICK ON CONFIRM EMAIL FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send DIFFERENT IDS IN mail AND CONFIRM
		try {
			String emailsendid = Excelreader.getData(0, 98, 5);
			page.mailsendmethod(emailsendid);
			String confirmmailsend = Excelreader.getData(0, 101, 5);
			String conmailsendvalue = page.confirmmailenteredvalue(confirmmailsend);
			if (conmailsendvalue.equals(confirmmailsend)) {
				test.pass("TC:55  USER SHOULD SEND MAIL IN CONFIRM MAIL TEXTBOX");
				String confirmmailerrormesshead = page.confirmmailerrormessmethod1();
				String confirmmailerrormessexcel = Excelreader.getData(0, 103, 5);
				if (confirmmailerrormesshead.equals(confirmmailerrormessexcel)) {
					test.pass("TC:55 USER SHOULD SEND SAME IDS IN MAIL AND CONFIRM MAIL 'ERROR MESSAGE DISPLAYED' -->"
							+ "'" + confirmmailerrormesshead + "'");
				} else {
					test.fail("TC:55 USER SHOULD SEND SAME IDS IN MAIL AND CONFIRM MAIL");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
							+ "USER SHOULD SEND SAME IDS IN MAIL AND CONFIRM MAIL");
				}
			} else {
				test.fail("TC:55 USER SHOULD SEND MAIL IN CONFIRM MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "USER SHOULD SEND MAIL IN CONFIRM MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE WITH BLANK
		try {
			String confirmmailerrormesshead = page.confirmmailerrormessmethod();
			String confirmmailerrormessexcel = Excelreader.getData(0, 103, 5);
			if (confirmmailerrormesshead.equals(confirmmailerrormessexcel)) {
				test.pass("TC:55 'ERROR MESSAGE DISPLAYED' -->" + "'" + confirmmailerrormesshead + "'");
			} else {
				test.fail("TC:55 CONFIRM MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "CONFIRM MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 24)
	public void Phone_number_Mobile() {
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		test = extent.createTest("Phone_number_Mobile");

		// phone label
		try {
			String phonenumberlabelhead = page.phonenumberlabelmethod();
			String phonenumberlabelexcel = Excelreader.getData(0, 104, 5);
			if (phonenumberlabelhead.equals(phonenumberlabelexcel)) {
				test.pass("TC:56 THE LABEL 'PHONE NUMBER' IS DISPLAYED ");
			} else {
				test.fail("TC:56 THE LABEL 'PHONE NUMBER' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "THE LABEL 'PHONE NUMBER' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK ON phone number AND LABEL IS ROLLED UP OR NOT
		try {
			String phonenumberlabelhead = page.phonenumberlabelmethod1();
			String phonenumberlabelexcel = Excelreader.getData(0, 104, 5);
			if (phonenumberlabelhead.equals(phonenumberlabelexcel)) {
				test.pass("TC:56 THE LABEL 'PHONE NUMBER' IS ROLLED UP AFTER CLICK ");
			} else {
				test.fail("TC:56 THE LABEL 'PHONE NUMBER' IS NOT ROLLED UP AFTER CLICK ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "THE LABEL 'PHONE NUMBER' IS NOT ROLLED UP AFTER CLICK ");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// characters
		try {
			String phonecharacterhead = Excelreader.getData(0, 105, 5);
			String phonenumCenteredval = page.phonenumberenteredvalue(phonecharacterhead);
			if (!phonenumCenteredval.equals(phonecharacterhead)) {
				test.pass("TC:56 USER SHOULD NOT SEND CHARACTER IN PHONE NUMBER TEXTBOX ");
			} else {
				test.fail("TC:56 USER SHOULD NOT SEND CHARACTER IN PHONE NUMBER TEXTBOX ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "USER SHOULD NOT SEND CHARACTER IN PHONE NUMBER TEXTBOX ");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// SPECIAL CHARECTER
		try {
			String phonecharacterhead = Excelreader.getData(0, 106, 5);
			String phonenumCenteredval = page.phonenumberenteredvalue(phonecharacterhead);
			if (!phonenumCenteredval.equals(phonecharacterhead)) {
				test.pass("TC:56 USER SHOULD NOT SEND SPECIAL CHARACTER IN PHONE NUMBER TEXTBOX ");
			} else {
				test.fail("TC:56 USER SHOULD NOT SEND SPECIAL CHARACTER IN PHONE NUMBER TEXTBOX ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "USER SHOULD NOT SEND SPECIAL CHARACTER IN PHONE NUMBER TEXTBOX ");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// more than 10 numerical
		try {
			String phonecharacterhead = Excelreader.getData(0, 108, 5);
			String phonenumCenteredval = page.phonenumberenteredvalue1(phonecharacterhead);
			if (!phonenumCenteredval.equals(phonecharacterhead)) {
				test.pass("TC:56 USER SHOULD NOT SEND MORE THAN 10 NUMERICAL IN PHONE NUMBER TEXTBOX ");
			} else {
				test.fail("TC:56 USER SHOULD NOT SEND MORE THAN 10 NUMERICAL IN PHONE NUMBER TEXTBOX ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "USER SHOULD NOT SEND MORE THAN 10 IN PHONE NUMBER TEXTBOX ");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ENTER 10 NUMERICAL
		try {
			String phonecharacterhead = Excelreader.getData(0, 109, 5);
			String phonenumCenteredval = page.phonenumberenteredvalue1(phonecharacterhead);
			if (phonenumCenteredval.equals(phonecharacterhead)) {
				test.pass("TC:56 USER SHOULD  SEND 10 NUMERICAL IN PHONE NUMBER TEXTBOX ");
			} else {
				test.fail("TC:56 USER SHOULD  SEND 10 NUMERICAL IN PHONE NUMBER TEXTBOX ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "USER SHOULD SEND 10 NUMERICAL IN PHONE NUMBER TEXTBOX ");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// LESS THAN 10 NUMERICAL
		try {
			String phonecharacterhead = Excelreader.getData(0, 107, 5);
			String phonenumbererrormessagehead = page.phonenumbererrormessagemethod(phonecharacterhead);
			String phonenumbererrormessageexcel = Excelreader.getData(0, 110, 5);
			if (phonenumbererrormessagehead.equals(phonenumbererrormessageexcel)) {
				test.pass("TC:56 AFTER LESS THAN 10 NUMERICAL  'ERROR MESSAGE DISPLAYED' -->" + "'"
						+ phonenumbererrormessagehead + "'");
			} else {
				test.fail("TC:56 PHONE NUMBER FUNCTION ERROR MESSAGE IS NOT DISPLAYED AFTER LESS THAN 10 NUMERICAL ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "PHONE NUMBER FUNCTION ERROR MESSAGE IS NOT DISPLAYED AFTER LESS THAN 10 NUMERICAL");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ERROR MESSAGE
		try {
			String phonenumbererrormessagehead = page.phonenumbererrormessagemethod1();
			String phonenumbererrormessageexcel = Excelreader.getData(0, 110, 5);
			if (phonenumbererrormessagehead.equals(phonenumbererrormessageexcel)) {
				test.pass("TC:56 'ERROR MESSAGE DISPLAYED' -->" + "'" + phonenumbererrormessagehead + "'");
			} else {
				test.fail("TC:56 PHONE NUMBER FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "PHONE NUMBER FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 25)
	public void By_Selecting_Submit_Mobile() {
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		test = extent.createTest("By_Selecting_Submit_Mobile");
		
		try {
			driver.get(Basepage.readProperty("urlB"));
			// Thread.sleep(3000);
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");

			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
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

		// BY SELECTING SUBMIT... LABEL
		try {
			String byselectsubmithead = page.byselectingsubmitmethod();
			String buselectsubmitexcel = Excelreader.getData(0, 111, 5);
			if (byselectsubmithead.equals(buselectsubmitexcel)) {
				test.pass("TC:58 VERIF LABEL 'MY SELECTING SUBMIT....' IS DISPLAYED");
			} else {
				test.fail("TC:58 VERIF LABEL 'MY SELECTING SUBMIT....' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "VERIF LABEL 'MY SELECTING SUBMIT....' IS NOT DISPLAYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// WE MAY CONTACT LABEL
		try {
			String wemaycontacthead = page.wemaycontactlabelmethod();
			String wemaycontactexcel = Excelreader.getData(0, 112, 5);
			if (wemaycontacthead.equals(wemaycontactexcel)) {
				test.pass("TC:59 VERIFY LABEL 'WE MAY CONTACT ...' IS DISPLAYED");
			} else {
				test.fail("TC:59 VERIFY LABEL 'WE MAY CONTACT....' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
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
			String gettitleexcel = Excelreader.getData(0, 113, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:60 PRIVACY POLICY LINK IS WORKING FINE");

			} else {
				test.fail("TC:60 PRIVACY POLICY LINK IS NOT WORKING FINE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "PRIVACY POLICY LINK IS WORKING FINE");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 26)
	public void Global_Error_Message_Mobile() {
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		test = extent.createTest("Global_Error_Message_Mobile");
		// 9 global error message
		try {
			driver.get(Basepage.readProperty("urlB"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");

			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
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
		try {
			String totalerrohead = page.totalerromessagemethod();
			String totalerroexcel = Excelreader.getData(0, 114, 5);
			if (totalerrohead.equals(totalerroexcel)) {
				test.pass("'9-ERROR MESSAGE DISPLAYED' -->" + "'" + totalerrohead + "'");
			} else {
				test.fail("TC: 9 GLOBAL ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "9 GLOBAL ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 27)
	public void Open_Close_Webstatus_Mobile_App() {
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		test = extent.createTest("Open_Close_Webstatus_Mobile_App");

		try {
			driver.get(Basepage.readProperty("urlB"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");
			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
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

		// RESTAURANT BUTTON, POP UP AND ZIP,CITY
		try {
			String zipcityhead = page.openclosewebmethod();
			String zipcityexcel = Excelreader.getData(0, 38, 5);
			if (!zipcityhead.equals("")) {
				test.pass("TC:22  RESTAURANT BUTTON IS WORKING");
				try {
					String zipvalexcel = Excelreader.getData(0, 39, 5);
					String zipvalhead = page.zipenteredvalmethod(zipvalexcel);
					if (zipvalhead.equals(zipvalexcel)) {
						test.pass("TC:22  USER ABLE TO SEND ZIP CODE");
						try {
							// CLICK ON SEARCH
							String mappinnumberhead = page.mappinnumbermethod();
							String mappinnumberexcel = Excelreader.getData(0, 140, 5);
							if (mappinnumberhead.equals(mappinnumberexcel)) {
								test.pass(
										"TC:22  SEARCH BUTTON IS WORKING IN POP UP AND NEAR RESTAURANT ADDRESS ALSO IS DISPLAYED");
								// web status open and close
								try {
									String openwebstatusexcel = Excelreader.getData(0, 140, 5);
									String closewebstatusexcel = Excelreader.getData(0, 141, 5);
									String openorclosehead = page.webstatusopencloselabelmethod();
									// OPEN WEB STATUS
									if (openwebstatusexcel.equalsIgnoreCase(openorclosehead)) {
										test.pass("TC: OPEN OF WEB STATUS IS DISPLAYED");
										// CLOSE WEB STATUS
									} else if (closewebstatusexcel.equalsIgnoreCase(openorclosehead)) {
										test.pass("TC: CLOSE OF WEB STATUS IS DISPLAYED");
										// NULL WEB STATUS
									} else if (openorclosehead.equalsIgnoreCase("")) {
										test.fail("TC: NULL OF WEB STATUS IS DISPLAYED");
									}
								} catch (Exception e) {
									test.fail("TC: WEB STATUS IS NOT DISPLAYED");
									test.fail("Error:" + e.getMessage());
								}
							} else {
								test.fail(
										"TC:22 SEARCH BUTTON IS NOT WORKING IN POP UP AND McD ADDRESS ALSO IS NOT DISPLAYED");
								test.fail(test.addScreenCaptureFromPath(
										Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "SEARCH BUTTON IS NOT WORKING IN POP UP AND McD ADDRESS ALSO IS NOT DISPLAYED");
							}
						} catch (Exception e) {
							test.fail(
									"TC:22 SEARCH BUTTON IS NOT WORKING IN POP UP AND McD ADDRESS ALSO IS NOT DISPLAYED");
							test.fail("Error:" + e.getMessage());
						}
					} else {
						test.fail("TC:22 USER NOT ABLE TO SEND ZIP CODE");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
										+ "USER NOT ABLE TO SEND ZIP CODE");
					}
				} catch (Exception e) {
					test.fail("TC:22 USER NOT ABLE TO SEND ZIP CODE");
					test.fail("Error:" + e.getMessage());
				}
			} else {
				test.fail("TC:22 RESTAURANT BUTTON IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "RESTAURANT BUTTON IS NOT WORKING");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	/*@Test(priority = 27)
	public void Positive_scenario_Mobileapp() {
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		test = extent.createTest("Positive_scenario_Mobileapp");
		try {
			driver.get(Basepage.readProperty("urlB"));
			// Thread.sleep(3000);
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");

			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
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
				String mobiledevicetypegetattributehead = page.mobiledevicetypegetattribute();
				String mobiledevicetypegetattributeexcel = Excelreader.getData(0, 19, 5);
				if (mobiledevicetypegetattributehead.equals(mobiledevicetypegetattributeexcel)) {
					test.pass("TC:16  MOBILE DEVICE TYPE DROP DOWN VALUE SHOUD BE SELECT");

				} else {
					test.fail("TC:16  MOBILE DEVICE TYPE DROP DOWN VALUE SHOUD BE SELECT");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
							+ " MOBILE DEVICE TYPE DROP DOWN VALUE SHOUD BE SELECT");
				}
			} else {
				test.fail("TC:16  MOBILE DEVICE TYPE SHOULD BE DROP DOWN");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "MOBILE DEVICE TYPE SHOULD BE DROP DOWN");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// mobile operation system clickable
		try {
			String mobileoperationsytemdropdownvalhead = page.googleandroiddropdownvaluemethod();
			String mobileoperationsytemdropdownvalexcel = Excelreader.getData(0, 22, 5);
			if (mobileoperationsytemdropdownvalhead.equals(mobileoperationsytemdropdownvalexcel)) {
				test.pass("TC:17 MOBILE OPERATION SYSTEM SHOULD BE DROP DOWN AND CLICKABLE");
				String mobileoperationsysgetarrributehead = page.mobileopersysgetattribute();
				String mobileoperationsysgetarrributeexcel = Excelreader.getData(0, 22, 5);
				if (mobileoperationsysgetarrributehead.equals(mobileoperationsysgetarrributeexcel)) {
					test.pass("TC:17  MOBILE OPERATION SYSTEM DROP DOWN VALUE SHOUD BE SELECT");

				} else {
					test.fail("TC:17  MOBILE OPERATION SYSTEM DROP DOWN VALUE SHOUD BE SELECT");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
							+ " MOBILE OPERATION SYSTEM DROP DOWN VALUE SHOUD BE SELECT");
				}
			} else {
				test.fail("TC:17  MOBILE OPERATION SYSTEM SHOULD BE DROP DOWN");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "USER SHOULD  BE SEND NUMERICAL AND CHARACTER");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send characters and numerical in restaurant address function
		try {
			String restaurantaddspchanumarexcel = Excelreader.getData(0, 49, 5);
			String restaurantaddspchanumahead = page.resraurantaddvaluemethod1(restaurantaddspchanumarexcel);
			if (restaurantaddspchanumahead.equals(restaurantaddspchanumarexcel)) {
				test.pass("TC:29 USER SHOULD BE SEND NUMERICAL AND CHARACTERS");
			} else {
				test.fail("TC:29 USER SHOULD BE SEND NUMERICAL AND CHARACTERS");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
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
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
							+ "USER SHOULD BE SELECT DROP DOWN VALUE");
				}
			} else {
				test.fail("TC:31 STATE FUNCTION SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
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
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
							+ "21 USER SHOULD BE SELECT DROP DOWN VALUE IN MONT FUNTION");
				}
			} else {
				test.fail("TC:21 MONTH FUNCTION SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
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
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
							+ "USER SHOULD BE SELECT DROPW DOWN VALUE IN DAY FUNCTION");
				}

			} else {
				test.fail("TC:35 DAY DROP DOWN FUNCTION SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
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
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
							+ "USER SHOULD BE SELECT DROPW DOWN VALUE IN YEAR FUNCTION");
				}

			} else {
				test.fail("TC:35 YEAR DROP DOWN FUNCTION SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
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
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
							+ "USER SHOULD BE SELECT TIME OF DROP DOWN VALUE");
				}

			} else {
				test.fail("TC:39 TIME FUNCTION SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
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
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
							+ "USER NOT ABLE TO SELECT DROP DOWN VALUE OF AM/PM FUNCTION");
				}
			} else {
				test.fail("TC:40 AM/PM FUNCTION SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "AM/PM FUNCTION SHOULD BE CLICKABLE");
			}
		} catch (Exception e) {

		}
		// DRIVE thru radio button after selected
		try {
			String drivethruradiobuttonisselectedheadd = page.driveradiobuttonselectedmethod();
			if (drivethruradiobuttonisselectedheadd.equals("true")) {
				test.pass("TC:41 DRIVE THRU TADIO BUTTON SHOULD BE CLICKABLE");
			} else {
				test.fail("TC:41 DRIVE THRU TADIO BUTTON SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "DRIVE THRU TADIO BUTTON SHOULD BE CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// CHARACTERS VALUES IN FIRST NAME FUNCTION
		try {
			String firstnamesendvalexcel = Excelreader.getData(0, 86, 5);
			String sendedvalhead = page.finameEnteredvalue(firstnamesendvalexcel);
			if (sendedvalhead.equals(firstnamesendvalexcel)) {
				test.pass("TC:46  USE SHOULD  BE SEND CHARACTERS  IN FIRSTNAME TEXTBOX");
			} else {
				test.fail("TC:46  USE SHOULD BE SEND CHARACTERS IN FIRSTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "USE SHOULD  BE SEND CHARACTERS IN FIRSTNAME TEXTBOX");
			}
		} catch (Exception e) {

			test.fail("Error:" + e.getMessage());
		}

		// CHARACTERS IN LAST NAME FUNCTION

		try {
			String LNSPECIALCHARACTER = Excelreader.getData(0, 92, 5);
			String LAscvalue = page.lastnameenterdvalue(LNSPECIALCHARACTER);
			if (LAscvalue.equals(LNSPECIALCHARACTER)) {
				test.pass("TC:47 USER SHOULD BE SEND CHARACTERS IN LASTNAME TEXTBOX");
			} else {
				test.fail("TC:47 USER SHOULD BE SEND CHARACTERS IN LASTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "USER SHOULD  BE SEND CHARACTERS IN LASTNAME TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// SEND WITH MAIL FORMAT
		try {
			String emailsendid = Excelreader.getData(0, 98, 5);
			String emailvlue = page.emailenteredvalue(emailsendid);
			if (emailvlue.equals(emailsendid)) {
				test.pass("TC:54  USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
				String mailerrormessagehead = page.emailerrormessagemethod();
				String mailerrormessageexcel = Excelreader.getData(0, 99, 5);
				if (!mailerrormessagehead.equals(mailerrormessageexcel)) {
					test.pass("TC:54 WITH FORMAT 'ERROR MESSAGE IS NOT DISPLAYED'");
				} else {
					test.fail("TC:54  WITH FORMAT MAIL FUNCTION ERROR MESSAGE  DISPLAYED--->" + "'"
							+ mailerrormessagehead + "'");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
							+ "WITH FORMAT MAIL FUNCTION ERROR MESSAGE  DISPLAYED");
				}
			} else {
				test.fail("TC:54 USER SHOULD SEND MAIL WITH FORMAT IN MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ " MOBILE APP FEEDBACK FORM IS NOT SUBMITTED SUCCESSFULLY");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}*/

	/*@Test(priority = 28)
	public void Header_CareersMAP() {
		test = extent.createTest("Header_CareersMAP");
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		try {
			driver.get(Basepage.readProperty("urlB"));
			// Thread.sleep(3000);
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");

			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
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
		// label of header careers
		try {
			String headercareerslabelhead = page.headercareerslabelmethod();
			String headercareerslabelexcel = Excelreader.getData(0, 125, 5);
			if (headercareerslabelhead.equals(headercareerslabelexcel)) {
				test.pass("TC: THE LABEL 'HEADER CAREERS' IS DISPLAYED ");
			} else {
				test.fail("TC: THE LABEL 'HEADER CAREERS' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "THE LABEL 'HEADER CAREERS' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		
		 * // click on careers try { String headercareersclickhead =
		 * page.headercareersclickmethod(); String headercareersclickexcel =
		 * Excelreader.getData(0, 126, 5); if
		 * (headercareersclickhead.equals(headercareersclickexcel)) {
		 * test.pass("TC: THE LEGAL BUMPER OF HEADER CAREERS IS WORKING FINE "); String
		 * leavingcancelbuttonhead = page.leavingcancelbuttonmethod(); String
		 * leavingcancelbuttonexcel = Excelreader.getData(0, 126, 5); if
		 * (!leavingcancelbuttonhead.equals(leavingcancelbuttonexcel)) {
		 * test.pass("TC: THE CANCEL BUTTON OF'HEADER CAREERS' IS WORKING"); } else {
		 * test.fail("TC:THE CANCEL BUTTON OF'HEADER CAREERS' IS NOT WORKING");
		 * test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
		 * "Mobile_App_Feedback")) +
		 * "THE CANCEL BUTTON OF'HEADER CAREERS' IS NOT WORKING"); } } else {
		 * test.fail("TC:THE 'LEGAL BUMPER' OF HEADER CAREERS IS NOT WORKING");
		 * test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
		 * "Mobile_App_Feedback")) + "THE 'LEGAL BUMPER' IS NOT WORKING"); } } catch
		 * (Exception e) { test.fail("Error:" + e.getMessage()); }
		 
		// CAREERS BUTTON
		try {
			String headercareersclickhead = page.headercareersclickmethod1();
			String headercareersclickexcel = Excelreader.getData(0, 127, 5);
			if (headercareersclickhead.equals(headercareersclickexcel)) {
				test.pass("TC: THE LANDING PAGE OF HEADER CAREERS IS WORKING ");
			} else {
				test.fail("TC:THE LANDING PAGE OF 'HEADER CAREERS' IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "THE LANDING PAGE OF 'HEADER CAREERS' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 29)
	public void Footer_CareersMAP() {
		test = extent.createTest("Footer_CareersMAP");
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		try {
			driver.get(Basepage.readProperty("urlB"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");

			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
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
		// label of footer careers
		try {
			String Footercareerslabelhead = page.Footercareerslabelmethod();
			String Footercareerslabelexcel = Excelreader.getData(0, 125, 5);
			if (Footercareerslabelhead.equals(Footercareerslabelexcel)) {
				test.pass("TC: THE LABEL 'FOOTER CAREERS' IS DISPLAYED ");
			} else {
				test.fail("TC: THE LABEL 'FOOTER CAREERS' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "THE LABEL 'FOOTER CAREERS' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		
		 *//** // FOOTER CAREERS OF LEAGER BUMPER AND CALCEL BUTTON try { String
		 * Footercareersclickhead = page.Footercareersclickmethod(); String
		 * Footercareersclickexcel = Excelreader.getData(0, 126, 5); if
		 * (Footercareersclickhead.equals(Footercareersclickexcel)) {
		 * test.pass("TC: THE LEGAL BUMPER OF FOOTER CAREERS IS WORKING FINE "); String
		 * leavingcancelbuttonfooterhead = page.leavingcancelbuttonfootermethod();
		 * String leavingcancelbuttonfooterexcel = Excelreader.getData(0, 126, 5); if
		 * (!leavingcancelbuttonfooterhead.equals(leavingcancelbuttonfooterexcel)) {
		 * test.pass("TC: THE CANCEL BUTTON OF'FOOTER CAREERS' IS WORKING"); } else {
		 * test.fail("TC:THE CANCEL BUTTON OF'FOOTER CAREERS' IS NOT WORKING");
		 * test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
		 * "Mobile_App_Feedback")) +
		 * "THE CANCEL BUTTON OF'FOOTER CAREERS' IS NOT WORKING"); } } else {
		 * test.fail("TC:THE 'LEGAL BUMPER' OF FOOTER CAREERS IS NOT WORKING");
		 * test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
		 * "Mobile_App_Feedback")) + "THE 'LEGAL BUMPER' IS NOT WORKING"); } } catch
		 * (Exception e) { test.fail("Error:" + e.getMessage()); }
		 *//*

		// CAREERS BUTTON
		try {
			String footercareersclickhead1 = page.footercareersclickmethod1();
			String footercareersclickexcel1 = Excelreader.getData(0, 127, 5);
			if (footercareersclickhead1.equals(footercareersclickexcel1)) {
				test.pass("TC: THE LANDING PAGE OF FOOTER CAREERS IS WORKING ");
			} else {
				test.fail("TC:THE LANDING PAGE OF 'FOOTER CAREERS' IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "THE LANDING PAGE OF 'FOOTER CAREERS' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 30)
	public void Footer_Education_Opportunities_MAP() {
		test = extent.createTest("Footer_Education_Opportunities_MAP");
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		try {
			driver.get(Basepage.readProperty("urlB"));
			// Thread.sleep(3000);
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");

			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
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
		// label of footer education opportunities
		try {
			String Footereducationlabelhead = page.Footereducationlabelmethod();
			String Footereducationlabelexcel = Excelreader.getData(0, 128, 5);
			if (Footereducationlabelhead.equals(Footereducationlabelexcel)) {
				test.pass("TC: THE LABEL 'FOOTER EDUCATION OPPORTUNITIES' IS DISPLAYED ");
			} else {
				test.fail("TC: THE LABEL 'FOOTER EDUCATION OPPORTUNITIES' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "THE LABEL 'FOOTER EDUCATION OPPORTUNITIES' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		
		 *//** // FOOTER education OF LEGal BUMPER AND CALCEL BUTTON try { String
		 * Footereducationclickhead = page.Footereducationclickmethod(); String
		 * Footereducationclickexcel = Excelreader.getData(0, 126, 5); if
		 * (Footereducationclickhead.equals(Footereducationclickexcel)) { test.
		 * pass("TC: THE LEGAL BUMPER OF FOOTER 'EDUCATION OPPORTUNITIES'  IS WORKING FINE "
		 * ); String leavingcancelbuttonfooterhead =
		 * page.leavingcancelbuttoneducationmethod(); String
		 * leavingcancelbuttonfooterexcel = Excelreader.getData(0, 126, 5); if
		 * (!leavingcancelbuttonfooterhead.equals(leavingcancelbuttonfooterexcel)) {
		 * test.
		 * pass("TC: THE CANCEL BUTTON OF FOOTER 'EDUCATION OPPORTUNITIES' IS WORKING");
		 * } else { test.
		 * fail("TC:THE CANCEL BUTTON OF FOOTER 'EDUCATION OPPORTUNITIES' IS NOT WORKING"
		 * ); test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
		 * "Mobile_App_Feedback")) +
		 * "THE CANCEL BUTTON OF FOOTER 'EDUCATION OPPORTUNITIES' IS NOT WORKING"); } }
		 * else { test.
		 * fail("TC:THE 'LEGAL BUMPER' OF FOOTER 'EDUCATION OPPORTUNITIES' IS NOT WORKING"
		 * ); test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
		 * "Mobile_App_Feedback")) +
		 * "THE LEGAL BUMPER OF 'EDUCATION OPPORTUNITIES' IS NOT WORKING"); } } catch
		 * (Exception e) { test.fail("Error:" + e.getMessage()); }*//* 
		
		 
		// landing page of education opportunities link
		try {
			String footereducationclickhead1 = page.footereducationclickmethod1();
			String footereducationopporclickexcel = Excelreader.getData(0, 129, 5);
			if (footereducationclickhead1.equals(footereducationopporclickexcel)) {
				test.pass("TC: THE LANDING PAGE OF 'EDUCATION OPPORTUNITIES' IS WORKING ");
			} else {
				test.fail("TC:THE LANDING PAGE OF 'EDUCATION OPPORTUNITIES' IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "THE LANDING PAGE OF 'EDUCATION OPPORTUNITIES' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 31)
	public void Footer_Employee_Perks_MAP() {
		test = extent.createTest("Footer_Employee_Perks_MAP");
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		try {
			driver.get(Basepage.readProperty("urlB"));
			// Thread.sleep(3000);
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");

			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
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
		// label of footer education opportunities
		try {
			String Footeremployeelabelhead = page.Footeremployeelabelmethod();
			String Footeremployeelabelexcel = Excelreader.getData(0, 130, 5);
			if (Footeremployeelabelhead.equals(Footeremployeelabelexcel)) {
				test.pass("TC: THE LABEL 'FOOTER EMPLOYEE PERKS' IS DISPLAYED ");
			} else {
				test.fail("TC: THE LABEL 'FOOTER EMPLOYEE PERKS' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "THE LABEL 'FOOTER EMPLOYEE PERKS' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		
		 * // FOOTER CAREERS OF LEAGER BUMPER AND CALCEL BUTTON try { String
		 * Footercareersclickhead = page.Footeremployeeclickmethod(); String
		 * Footercareersclickexcel = Excelreader.getData(0, 126, 5); if
		 * (Footercareersclickhead.equals(Footercareersclickexcel)) {
		 * test.pass("TC: THE LEGAL BUMPER OF FOOTER EMPLOYEE PERKS IS WORKING FINE ");
		 * String leavingcancelbuttonfooterhead =
		 * page.leavingcancelbuttonemployeemethod(); String
		 * leavingcancelbuttonfooterexcel = Excelreader.getData(0, 126, 5); if
		 * (!leavingcancelbuttonfooterhead.equals(leavingcancelbuttonfooterexcel)) {
		 * test.pass("TC: THE CANCEL BUTTON OF'FOOTER EMPLOYEE PERKS' IS WORKING"); }
		 * else {
		 * test.fail("TC:THE CANCEL BUTTON OF'FOOTER EMPLOYEE PERKS' IS NOT WORKING");
		 * test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
		 * "Mobile_App_Feedback")) +
		 * "THE CANCEL BUTTON OF'FOOTER EMPLOYEE PERKS' IS NOT WORKING"); } } else {
		 * test.fail("TC:THE 'LEGAL BUMPER' OF FOOTER EMPLOYEE PERKS IS NOT WORKING");
		 * test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
		 * "Mobile_App_Feedback")) + "THE 'LEGAL BUMPER' IS NOT WORKING"); } } catch
		 * (Exception e) { test.fail("Error:" + e.getMessage()); }
		 

		// CAREERS BUTTON
		try {
			String footeremployeesclickhead1 = page.footeremployeeclickmethod1();
			String footeremployeeclickexcel1 = Excelreader.getData(0, 131, 5);
			if (footeremployeesclickhead1.equals(footeremployeeclickexcel1)) {
				test.pass("TC: THE LANDING PAGE OF FOOTER EMPLOYEE PERKS IS WORKING ");
			} else {
				test.fail("TC:THE LANDING PAGE OF 'FOOTER EMPLOYEE PERKS' IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "THE LANDING PAGE OF 'FOOTER EMPLOYEE PERKS' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 32)
	public void Footer_MEET_Our_People_MAP() {
		test = extent.createTest("Footer_MEET_Our_People_MAP");
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);
		try {
			driver.get(Basepage.readProperty("urlB"));
			// Thread.sleep(3000);
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");

			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
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
		// label of footer education opportunities
		try {
			String Footeremeetourpeoplelabelhead = page.Footeremeetourpeoplelabelmethod();
			String Footeremeetourpeoplelabeexcel = Excelreader.getData(0, 132, 5);
			if (Footeremeetourpeoplelabelhead.equals(Footeremeetourpeoplelabeexcel)) {
				test.pass("TC: THE LABEL 'FOOTER MEET OUR PEOPLE' IS DISPLAYED ");
			} else {
				test.fail("TC: THE LABEL 'FOOTER MEET OUR PEOPLE' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "THE LABEL 'FOOTER MEET OUR PEOPLE' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		
		 * // FOOTER CAREERS OF LEAGER BUMPER AND CALCEL BUTTON try { String
		 * Footermeetourpeopleclickhead = page.Footermeetourpeopleclickmethod(); String
		 * Footermeetourpeopleclickexcel = Excelreader.getData(0, 126, 5); if
		 * (Footermeetourpeopleclickhead.equals(Footermeetourpeopleclickexcel)) {
		 * test.pass("TC: THE LEGAL BUMPER OF FOOTER MEET OUR PEOPLE IS WORKING FINE ");
		 * String leavingcancelbuttonmeetourpeoplehead =
		 * page.leavingcancelbuttonmeetourpeoplemethod(); String
		 * leavingcancelbuttonmeetourpeopleexcel = Excelreader.getData(0, 126, 5); if
		 * (!leavingcancelbuttonmeetourpeoplehead.equals(
		 * leavingcancelbuttonmeetourpeopleexcel)) {
		 * test.pass("TC: THE CANCEL BUTTON OF'FOOTER MEET OUR PEOPLE' IS WORKING"); }
		 * else {
		 * test.fail("TC:THE CANCEL BUTTON OF'FOOTER MEET OUR PEOPLE' IS NOT WORKING");
		 * test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
		 * "Mobile_App_Feedback")) +
		 * "THE CANCEL BUTTON OF'FOOTER MEET OUR PEOPLE' IS NOT WORKING"); } } else {
		 * test.fail("TC:THE 'LEGAL BUMPER' OF FOOTER EMPLOYEE PERKS IS NOT WORKING");
		 * test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
		 * "Mobile_App_Feedback")) + "THE 'LEGAL BUMPER' IS NOT WORKING"); } } catch
		 * (Exception e) { test.fail("Error:" + e.getMessage()); }
		 

		// CAREERS BUTTON
		try {
			String footeremeetourpeopleclickhead1 = page.footermeetourpeopleclickmethod1();
			String footermeetourpeopleclickexcel1 = Excelreader.getData(0, 133, 5);
			if (footeremeetourpeopleclickhead1.equals(footermeetourpeopleclickexcel1)) {
				test.pass("TC: THE LANDING PAGE OF FOOTER MEET OUR PEOPLE IS WORKING ");
			} else {
				test.fail("TC:THE LANDING PAGE OF 'FOOTER MEET OUR PEOPLE' IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "THE LANDING PAGE OF 'FOOTER MEET OUR PEOPLE' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 33)
	public void Footer_For_Our_Veterans_MAP() {
		test = extent.createTest("Footer_For_Our_Veterans_MAP");
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);

		try {
			driver.get(Basepage.readProperty("urlB"));
			// Thread.sleep(3000);
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");

			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
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
		// label of footer for our veterans
		try {
			String Footeremeetourpeoplelabelhead = page.Footerforourveteranslabelmethod();
			String Footeremeetourpeoplelabeexcel = Excelreader.getData(0, 134, 5);
			if (Footeremeetourpeoplelabelhead.equals(Footeremeetourpeoplelabeexcel)) {
				test.pass("TC: THE LABEL 'FOOTER FOR OUR VETERANS ' IS DISPLAYED ");
			} else {
				test.fail("TC: THE LABEL 'FOOTER FOR OUR VETERANS' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "THE LABEL 'FOOTER FOR OUR VETERANS' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		
		 * // FOOTER CAREERS OF LEAGER BUMPER AND CALCEL BUTTON try { String
		 * Footermeetourpeopleclickhead = page.Footerforourveteransclickmethod(); String
		 * Footermeetourpeopleclickexcel = Excelreader.getData(0, 126, 5); if
		 * (Footermeetourpeopleclickhead.equals(Footermeetourpeopleclickexcel)) {
		 * test.pass("TC: THE LEGAL BUMPER OF FOOTER FOR OUR VETERANS IS WORKING FINE "
		 * ); String leavingcancelbuttonmeetourpeoplehead =
		 * page.leavingcancelbuttonforourveteransmethod(); String
		 * leavingcancelbuttonmeetourpeopleexcel = Excelreader.getData(0, 126, 5); if
		 * (!leavingcancelbuttonmeetourpeoplehead.equals(
		 * leavingcancelbuttonmeetourpeopleexcel)) {
		 * test.pass("TC: THE CANCEL BUTTON OF'FOOTER FOR OUR VETERANS' IS WORKING"); }
		 * else {
		 * test.fail("TC:THE CANCEL BUTTON OF'FOOTER FOR OUR VETERANS' IS NOT WORKING");
		 * test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
		 * "Mobile_App_Feedback")) +
		 * "THE CANCEL BUTTON OF'FOOTER FOR OUR VETERANS' IS NOT WORKING"); } } else {
		 * test.fail("TC:THE 'LEGAL BUMPER' OF FOOTER FOR OUR VETERANS IS NOT WORKING");
		 * test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
		 * "Mobile_App_Feedback")) + "THE 'LEGAL BUMPER' IS NOT WORKING"); } } catch
		 * (Exception e) { test.fail("Error:" + e.getMessage()); }
		 

		// CAREERS BUTTON
		try {
			String footeremeetourpeopleclickhead1 = page.footerforourveteransclickmethod1();
			String footermeetourpeopleclickexcel1 = Excelreader.getData(0, 135, 5);
			if (footeremeetourpeopleclickhead1.equals(footermeetourpeopleclickexcel1)) {
				test.pass("TC: THE LANDING PAGE OF FOOTER FOR OUR VETERANS IS WORKING ");
			} else {
				test.fail("TC:THE LANDING PAGE OF 'FOOTER FOR OUR VETERANS' IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "THE LANDING PAGE OF 'FOOTER FOR OUR VETERANS' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 34)
	public void Footer_Working_With_Us_MAP() {
		test = extent.createTest("Footer_Working_With_Us_MAP");
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);

		try {
			driver.get(Basepage.readProperty("urlB"));
			// Thread.sleep(3000);
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");

			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
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
		// label of footer for our veterans
		try {
			String Footeremeetourpeoplelabelhead = page.Footerworkingwithuslabelmethod();
			String Footeremeetourpeoplelabeexcel = Excelreader.getData(0, 136, 5);
			if (Footeremeetourpeoplelabelhead.equals(Footeremeetourpeoplelabeexcel)) {
				test.pass("TC: THE LABEL 'FOOTER WORKING WITH US ' IS DISPLAYED ");
			} else {
				test.fail("TC: THE LABEL 'FOOTER WORKING WITH US' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "THE LABEL 'FOOTER WORKING WITH US' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		
		 * // FOOTER CAREERS OF LEAGER BUMPER AND CALCEL BUTTON try { String
		 * Footermeetourpeopleclickhead = page.Footerworkingwithusclickmethod(); String
		 * Footermeetourpeopleclickexcel = Excelreader.getData(0, 126, 5); if
		 * (Footermeetourpeopleclickhead.equals(Footermeetourpeopleclickexcel)) {
		 * test.pass("TC: THE LEGAL BUMPER OF FOOTER WORKING WITH US IS WORKING FINE ");
		 * String leavingcancelbuttonmeetourpeoplehead =
		 * page.leavingcancelbuttonworkingwithusmethod(); String
		 * leavingcancelbuttonmeetourpeopleexcel = Excelreader.getData(0, 126, 5); if
		 * (!leavingcancelbuttonmeetourpeoplehead.equals(
		 * leavingcancelbuttonmeetourpeopleexcel)) {
		 * test.pass("TC: THE CANCEL BUTTON OF'FOOTER WORKING WITH US' IS WORKING"); }
		 * else {
		 * test.fail("TC:THE CANCEL BUTTON OF'FOOTER WORKING WITH US' IS NOT WORKING");
		 * test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
		 * "Mobile_App_Feedback")) +
		 * "THE CANCEL BUTTON OF'FOOTER WORKING WITH US' IS NOT WORKING"); } } else {
		 * test.fail("TC:THE 'LEGAL BUMPER' OF FOOTER WORKING WITH US IS NOT WORKING");
		 * test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
		 * "Mobile_App_Feedback")) + "THE 'LEGAL BUMPER' IS NOT WORKING"); } } catch
		 * (Exception e) { test.fail("Error:" + e.getMessage()); }
		 
		// CAREERS BUTTON
		try {
			String footeremeetourpeopleclickhead1 = page.footerworkingwithusclickmethod1();
			String footermeetourpeopleclickexcel1 = Excelreader.getData(0, 137, 5);
			if (footeremeetourpeopleclickhead1.equals(footermeetourpeopleclickexcel1)) {
				test.pass("TC: THE LANDING PAGE OF FOOTER WORKING WITH US IS WORKING ");
			} else {
				test.fail("TC:THE LANDING PAGE OF 'FOOTER WORKING WITH US' IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "THE LANDING PAGE OF 'FOOTER WORKING WITH US' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 35)
	public void Footer_Apply_Now_MAP() {
		test = extent.createTest("Footer_Apply_Now_MAP");
		Mobile_App_Feedback_Page page = new Mobile_App_Feedback_Page(driver);

		try {
			driver.get(Basepage.readProperty("urlB"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");

			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
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
		// label of footer APPLY NOW
		try {
			String Footeremeetourpeoplelabelhead = page.Footerapplynowlabelmethod();
			String Footeremeetourpeoplelabeexcel = Excelreader.getData(0, 138, 5);
			if (Footeremeetourpeoplelabelhead.equals(Footeremeetourpeoplelabeexcel)) {
				test.pass("TC: THE LABEL 'FOOTER APPLY NOW ' IS DISPLAYED ");
			} else {
				test.fail("TC: THE LABEL 'FOOTER APPLY NOW' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "THE LABEL 'FOOTER APPLY NOW' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		
		 * // FOOTER OF LEAGER BUMPER AND CALCEL BUTTON try { String
		 * Footermeetourpeopleclickhead = page.Footerapplynowclickmethod(); String
		 * Footermeetourpeopleclickexcel = Excelreader.getData(0, 126, 5); if
		 * (Footermeetourpeopleclickhead.equals(Footermeetourpeopleclickexcel)) {
		 * test.pass("TC: THE LEGAL BUMPER OF FOOTER 'APPLY NOW' IS WORKING FINE ");
		 * String leavingcancelbuttonmeetourpeoplehead =
		 * page.leavingcancelbuttonapplynowmethod(); String
		 * leavingcancelbuttonmeetourpeopleexcel = Excelreader.getData(0, 126, 5); if
		 * (!leavingcancelbuttonmeetourpeoplehead.equals(
		 * leavingcancelbuttonmeetourpeopleexcel)) {
		 * test.pass("TC: THE CANCEL BUTTON OF'FOOTER APPLY NOW' IS WORKING"); } else {
		 * test.fail("TC:THE CANCEL BUTTON OF'FOOTER APPLY NOW' IS NOT WORKING");
		 * test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
		 * "Mobile_App_Feedback")) +
		 * "THE CANCEL BUTTON OF'FOOTER APPLY NOW' IS NOT WORKING"); } } else {
		 * test.fail("TC:THE 'LEGAL BUMPER' OF FOOTER APPLY NOW IS NOT WORKING");
		 * test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
		 * "Mobile_App_Feedback")) + "THE 'LEGAL BUMPER' IS NOT WORKING"); } } catch
		 * (Exception e) { test.fail("Error:" + e.getMessage()); }
		 
		// CAREERS BUTTON
		try {
			String footeremeetourpeopleclickhead1 = page.footerapplynowclickmethod1();
			String footermeetourpeopleclickexcel1 = Excelreader.getData(0, 139, 5);
			if (footeremeetourpeopleclickhead1.equals(footermeetourpeopleclickexcel1)) {
				test.pass("TC: THE LANDING PAGE OF FOOTER APPLY NOW IS WORKING ");
			} else {
				test.fail("TC:THE LANDING PAGE OF 'FOOTER APPLY NOW' IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mobile_App_Feedback"))
						+ "THE LANDING PAGE OF 'FOOTER APPLY NOW' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}*/
}

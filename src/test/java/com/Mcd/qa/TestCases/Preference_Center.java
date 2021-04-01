package com.Mcd.qa.TestCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.McD.qa.Base.BaseTest;
import com.McD.qa.Extentreport.Extentreport;
import com.McD.qa.Pages.Basepage;
import com.McD.qa.Pages.Preference_Center_Page;
import com.McD.qa.Utility.TestUtil;

public class Preference_Center extends BaseTest {

	String excelpath = System.getProperty("user.dir");
	TestUtil Excelreader = new TestUtil(excelpath + "/src/main/java/com/McD/qa/TestData/Preference_Center.xls");

	@Test(priority = 1)
	public void Open_URL_PC() {
		Preference_Center_Page page = new Preference_Center_Page(driver);
		test = extent.createTest("Open_URL_PC");

		try {
			driver.get(Basepage.readProperty("urlPC"));

			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 PREFERENCE CENTER URL IS OPENED");
			} else {
				test.fail("TC:1 PREFERENCE CENTER URL IS OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Preference_Center"))
						+ "PREFERENCE CENTER URL IS OPENED");
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
	public void Email_Zipcode() {
		Preference_Center_Page page = new Preference_Center_Page(driver);
		test = extent.createTest("Email_Zipcode");

		// JOIN US label
		try {
			String joinusmethodsphead = page.joinusmethodsp();
			String joinusmethodspexcel = Excelreader.getData(0, 2, 5);
			if (joinusmethodsphead.equalsIgnoreCase(joinusmethodspexcel)) {
				test.pass("TC:1 VERIFY LABEL 'PREFERENCE CENTER' IS DISPLAYED");
			} else {
				test.fail("TC:1 VERIFY LABEL 'PREFERENCE CENTER' IS NOT DISPLAYED"
						+ test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Preference_Center")));
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// CLICK JOIN US
		try {
			String joinuslinkhead = page.joinuslinkmethod();
			String joinuslinkexcel = Excelreader.getData(0, 3, 5);
			if (joinuslinkhead.equalsIgnoreCase(joinuslinkexcel)) {
				test.pass("TC:2 JOIN US LINK IS WORKING");
				// sing up to receive emails label
				try {
					String singuptolabelhead = page.singuptolabelmethod();
					String singuptolabelexcel = Excelreader.getData(0, 3, 5);
					if (singuptolabelhead.equalsIgnoreCase(singuptolabelexcel)) {
						test.pass("TC:3 VERIFY LABEL 'SING UP TO RECEIVE EMAILS FROM McDONALD's' IS DISPLAYED");

					} else {
						test.fail("TC:3 VERIFY LABEL 'SING UP TO RECEIVE EMAILS FROM McDONALD's' IS NOT DISPLAYED"
								+ test.addScreenCaptureFromPath(
										Extentreport.getScreenshot(driver, "Preference_Center")));
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// GET DEALS INFORMATION ON .... label
				try {
					String getdealsinformationhead = page.getdealsinformationmethod();
					String getdealsinformationexcel = Excelreader.getData(0, 4, 5);
					if (getdealsinformationhead.equalsIgnoreCase(getdealsinformationexcel)) {
						test.pass(
								"TC:4 VERIFY LABEL 'GET DEALS, INFORMATION ON UPCOMING PROMOTIONS AND MORE' IS DISPLAYED");

					} else {
						test.fail(
								"TC:4 VERIFY LABEL 'GET DEALS, INFORMATION ON UPCOMING PROMOTIONS AND MORE' IS NOT DISPLAYED"
										+ test.addScreenCaptureFromPath(
												Extentreport.getScreenshot(driver, "Preference_Center")));
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// indicate required .... label
				try {
					String indicatesarequiredlabelhead = page.indicatesarequiredlabelmethod();
					String indicatesarequiredlabelexcel = Excelreader.getData(0, 5, 5);
					if (indicatesarequiredlabelhead.equalsIgnoreCase(indicatesarequiredlabelexcel)) {
						test.pass("TC:4 VERIFY LABEL 'INDICATES A REQUIRED FIELD' IS DISPLAYED");

					} else {
						test.fail("TC:4 VERIFY LABEL 'INDICATES A REQUIRED FIELD' IS NOT DISPLAYED" + test
								.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Preference_Center")));
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// email label
				try {
					String emaillabelhead = page.emaillabelmethod();
					String emaillabelexcel = Excelreader.getData(0, 6, 5);
					if (emaillabelhead.equalsIgnoreCase(emaillabelexcel)) {
						test.pass("TC:5 VERIFY LABEL 'EMAIL' IS DISPLAYED");

					} else {
						test.fail("TC:5 VERIFY LABEL 'EMAIL' IS NOT DISPLAYED" + test
								.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Preference_Center")));
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// after click email label
				try {
					String emaillabelhead = page.emaillabelmethod1();
					String emaillabelexcel = Excelreader.getData(0, 6, 5);
					if (emaillabelhead.equalsIgnoreCase(emaillabelexcel)) {
						test.pass("TC:6 VERIFY LABEL 'EMAIL' IS ROLLED UP");

					} else {
						test.fail("TC:6 VERIFY LABEL 'EMAIL' IS NOT ROLLED UP" + test
								.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Preference_Center")));
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// zipcode label
				try {
					String zipcodelabelhead = page.zipcodelabelmethod();
					String zipcodelabelexcel = Excelreader.getData(0, 7, 5);
					if (zipcodelabelhead.equalsIgnoreCase(zipcodelabelexcel)) {
						test.pass("TC:7 VERIFY LABEL 'ZIP CODE' IS DISPLAYED");

					} else {
						test.fail("TC:7 VERIFY LABEL 'ZIP CODE' IS NOT DISPLAYED" + test
								.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Preference_Center")));
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// after click zipcode label
				try {
					String zipcodelabelhead = page.zipcodelabelmethod1();
					String zipcodelabelexcel = Excelreader.getData(0, 7, 5);
					if (zipcodelabelhead.equalsIgnoreCase(zipcodelabelexcel)) {
						test.pass("TC:7 VERIFY LABEL 'ZIP CODE' IS ROLLED UP");

					} else {
						test.fail("TC:7 VERIFY LABEL 'ZIP CODE' IS NOT ROLLED UP" + test
								.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Preference_Center")));
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// SIGN UP BUTTON IS ENABLE OR NOT
				try {
					page.signupbuttonmethod();
					test.pass("TC:8 SIGN UP BUTTON IS ENABLE AND DISPLAYED");
					// global error message and sign up button
					try {
						String globalerrorhead = page.globalerrormethod();
						String globalerrorexcel = Excelreader.getData(0, 8, 5);
						if (globalerrorhead.equalsIgnoreCase(globalerrorexcel)) {
							test.pass("TC:9 GLOBAL ERROR MESSAGE IS DISPLAYED AND SIGN UP BUTTON IS WORKING --"
									+ globalerrorhead + "---");

						} else {
							test.fail("TC:9 GLOBAL ERROR MESSAGE IS NOT DISPLAYED OR SIGN UP BUTTON IS NOT WORKING--"
									+ globalerrorhead + "---" + test.addScreenCaptureFromPath(
											Extentreport.getScreenshot(driver, "Preference_Center")));
						}
					} catch (Exception e) {
						test.fail("Error:" + e.getMessage());
					}
					// Email error message required
					try {
						String emailerrormsghead = page.emailerrormsgmethod();
						String emailerrormsgexcel = Excelreader.getData(0, 9, 5);
						if (emailerrormsghead.equalsIgnoreCase(emailerrormsgexcel)) {
							test.pass("TC:10 EMAIL IS REQUIRED OF ERROR MESSAGE  IS DISPLAYED  --" + emailerrormsghead
									+ "---");
						} else {
							test.fail("TC:10 EMAIL IS REQUIRED OF ERROR MESSAGE IS NOT DISPLAYED  --"
									+ emailerrormsghead + "---" + test.addScreenCaptureFromPath(
											Extentreport.getScreenshot(driver, "Preference_Center")));
						}
					} catch (Exception e) {
						test.fail("Error:" + e.getMessage());
					}
					// zip code error message required
					try {
						String zipcodeerrormsghead = page.zipcodeerrormsgmethod();
						String zipcodeerrormsgexcel = Excelreader.getData(0, 10, 5);
						if (zipcodeerrormsghead.equalsIgnoreCase(zipcodeerrormsgexcel)) {
							test.pass("TC:11 ZIP CODE IS REQUIRED OF ERROR MESSAGE IS DISPLAYED  --"
									+ zipcodeerrormsghead + "---");
						} else {
							test.fail("TC:11 ZIP CODE IS REQUIRED OF ERROR MESSAGE IS NOT DISPLAYED  --"
									+ zipcodeerrormsghead + "---" + test.addScreenCaptureFromPath(
											Extentreport.getScreenshot(driver, "Preference_Center")));
						}
					} catch (Exception e) {
						test.fail("Error:" + e.getMessage());
					}
					// send data and check Email error message required
					try {
						String emailerrormsgexcel1 = Excelreader.getData(0, 11, 5);
						String emailerrormsgexcel12 = Excelreader.getData(0, 12, 5);
						String emailerrormsghead1 = page.emailerrormsgmethod1(emailerrormsgexcel1);
						if (emailerrormsghead1.equalsIgnoreCase(emailerrormsgexcel12)) {
							test.pass("TC:12 INVALID EMAIL OF ERROR MESSAGE  IS DISPLAYED  --" + emailerrormsghead1
									+ "---");

						} else {
							test.fail("TC:12 INVALID EMAIL OF ERROR MESSAGE IS NOT DISPLAYED  --" + emailerrormsghead1
									+ "---" + test.addScreenCaptureFromPath(
											Extentreport.getScreenshot(driver, "Preference_Center")));
						}
					} catch (Exception e) {
						test.fail("Error:" + e.getMessage());
					}
					// SEND DATA AND CLICK zip code error message required
					try {
						String zipcodeerrormsghead1 = page.zipcodeerrormsgmethod1();
						String zipcodeerrormsgexcel1 = Excelreader.getData(0, 13, 5);
						if (zipcodeerrormsghead1.equalsIgnoreCase(zipcodeerrormsgexcel1)) {
							test.pass("TC:13 INVALID ZIP CODE OF ERROR MESSAGE IS DISPLAYED  --" + zipcodeerrormsghead1
									+ "---");

						} else {
							test.fail("TC:13 INVALID ZIP CODE OF ERROR MESSAGE IS NOT DISPLAYED  --"
									+ zipcodeerrormsghead1 + "---" + test.addScreenCaptureFromPath(
											Extentreport.getScreenshot(driver, "Preference_Center")));
						}
					} catch (Exception e) {
						test.fail("Error:" + e.getMessage());
					}
					// email already registered error message
					try {
						String emailregisterederrormsgexcel = Excelreader.getData(0, 14, 5);
						String emailregisterederrormsghead = page.emailregisterederrormsgmethod(emailregisterederrormsgexcel);
						if (emailregisterederrormsghead.equals(emailregisterederrormsgexcel)) {
							test.pass("TC:14 USER ABLE TO SEND MAIL FORMAT IN EMAIL FUNCTION");
							// SEND ZIP NUMARICAL
							String emailregisterederrormsgexcel1 = Excelreader.getData(0, 15, 5);
							String emailregisterederrormsghead1 = page
									.emailregisterederrormsgmethod1(emailregisterederrormsgexcel1);
							String emailregisterederrormsgexcel12 = Excelreader.getData(0, 16, 5);
							if (emailregisterederrormsghead1.equalsIgnoreCase(emailregisterederrormsgexcel12)) {
								test.pass("TC:15 EMAIL REGISTERED ERROR MESSAGE IS DISPLAYED  --"
										+ emailregisterederrormsghead1 + "---");

							} else {
								test.fail("TC:15 EMAIL REGISTERED ERROR MESSAGE IS NOT DISPLAYED  --"
										+ emailregisterederrormsghead1 + "---" + test.addScreenCaptureFromPath(
												Extentreport.getScreenshot(driver, "Preference_Center")));
							}
						} else {
							test.fail("TC:14 USER NOT ABLE TO SEND MAIL FORMAT IN EMAIL FUNCTION " + test
									.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Preference_Center")));
						}
					} catch (Exception e) {
						test.fail("Error:" + e.getMessage());
					}
					// enter all characters in mail
					try {
						String emailsendcharatersexcel = Excelreader.getData(0, 17, 5);
						String emailsendcharatershead = page.emailsendcharatersmethod(emailsendcharatersexcel);
						if (emailsendcharatershead.equals(emailsendcharatersexcel)) {
							test.pass("TC:16 USER ABLE TO SEND ALL CHARACTERS  IN EMAIL FUNCTION");
						} else {
							test.fail("TC:16 USER NOT ABLE TO SEND ALL CHARACTERS IN EMAIL FUNCTION " + test
									.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Preference_Center")));
						}
					} catch (Exception e) {
						test.fail("Error:" + e.getMessage());
					}
					// more than 80 enter all characters in mail
					try {
						String emailsendcharatersexcel = Excelreader.getData(0, 18, 5);
						String emailsendcharatershead = page.emailsendcharatersmethod1(emailsendcharatersexcel);
						if (!emailsendcharatershead.equals(emailsendcharatersexcel)) {
							test.pass("TC:17 USER SHOULD NOT SEND MORE THAN 80 ALL CHARACTERS  IN EMAIL FUNCTION");
						} else {
							test.fail("TC:17 USER SHOULD NOT SEND MORE THAN 80 ALL CHARACTERS  IN EMAIL FUNCTION "
									+ test.addScreenCaptureFromPath(
											Extentreport.getScreenshot(driver, "Preference_Center")));
						}
					} catch (Exception e) {
						test.fail("Error:" + e.getMessage());
					}
					// send zip special characters
					try {
						String zipsendedvaluexcel = Excelreader.getData(0, 19, 5);
						String zipsendedvaluhead = page.zipsendedvalumethod(zipsendedvaluexcel);
						if (!zipsendedvaluhead.equals(zipsendedvaluexcel)) {
							test.pass("TC:18 USER SHOULD NOT SEND SPECIAL CHARACTERS IN ZIP CODE FUNCTION");

						} else {
							test.fail("TC:18 USER SHOULD NOT SEND SPECIAL CHARACTERS IN ZIP CODE FUNCTION" + test
									.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Preference_Center")));
						}
					} catch (Exception e) {
						test.fail("Error:" + e.getMessage());
					}
					// send zip characters
					try {
						String zipsendedvaluexcel = Excelreader.getData(0, 20, 5);
						String zipsendedvaluhead = page.zipsendedvalumethod(zipsendedvaluexcel);
						if (!zipsendedvaluhead.equals(zipsendedvaluexcel)) {
							test.pass("TC:19 USER SHOULD NOT SEND CHARACTERS IN ZIP CODE FUNCTION");

						} else {
							test.fail("TC:19 USER SHOULD NOT SEND CHARACTERS IN ZIP CODE FUNCTION" + test
									.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Preference_Center")));
						}
					} catch (Exception e) {
						test.fail("Error:" + e.getMessage());
					}
					// send more than 5 numerical
					try {
						String zipsendedvaluexcel = Excelreader.getData(0, 21, 5);
						String zipsendedvaluhead = page.zipsendedvalumethod(zipsendedvaluexcel);
						if (!zipsendedvaluhead.equals(zipsendedvaluexcel)) {
							test.pass("TC:19 USER SHOULD NOT SEND MORE THAN 5 NUMERICAL IN ZIP CODE FUNCTION");

						} else {
							test.fail("TC:19 USER SHOULD NOT SEND MORE THAN 5 NUMERICAL IN ZIP CODE FUNCTION" + test
									.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Preference_Center")));
						}
					} catch (Exception e) {
						test.fail("Error:" + e.getMessage());
					}
					// send 5 numerical
					try {
						String zipsendedvaluexcel = Excelreader.getData(0, 22, 5);
						String zipsendedvaluhead = page.zipsendedvalumethod(zipsendedvaluexcel);
						if (zipsendedvaluhead.equals(zipsendedvaluexcel)) {
							test.pass("TC:19 USER SHOULD  SEND 5 NUMERICAL IN ZIP CODE FUNCTION");

						} else {
							test.fail("TC:19 USER SHOULD  SEND 5 NUMERICAL IN ZIP CODE FUNCTION" + test
									.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Preference_Center")));
						}
					} catch (Exception e) {
						test.fail("Error:" + e.getMessage());
					}
					// send LESS THAN 5 numerical
					try {
						String zipsendedvaluexcel = Excelreader.getData(0, 23, 5);
						String zipsendedvaluexcel1 = Excelreader.getData(0, 13, 5);
						String zipsendedvaluhead = page.zipsendedvalumethod1(zipsendedvaluexcel);
						if (zipsendedvaluhead.equals(zipsendedvaluexcel1)) {
							test.pass("TC:19 USER SHOULD NOT SEND LESS THAN 5 NUMERICAL IN ZIP CODE FUNCTION");

						} else {
							test.fail("TC:19 USER SHOULD NOT SEND LESS THAN 5 NUMERICAL IN ZIP CODE FUNCTION" + test
									.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Preference_Center")));
						}
					} catch (Exception e) {
						test.fail("Error:" + e.getMessage());
					}
			// email send data for thanks
					try {
						String emailsendthanksexcel = Excelreader.getData(0, 24, 5);
						String emailsendthankshead = page.emailsendthanksmethod(emailsendthanksexcel);
						if (emailsendthankshead.equals(emailsendthanksexcel)) {
							test.pass("TC:20 USER ABLE TO SEND MAIL FORMAT IN EMAIL FUNCTION");
							// send 5 numerical
								String zipsendedvaluexcel = Excelreader.getData(0, 22, 5);
								String thanksyouexcel = Excelreader.getData(0, 25, 5);
								String zipsendedvaluhead = page.zipsendedvaluthanksmethod(zipsendedvaluexcel);
								if (zipsendedvaluhead.equals(thanksyouexcel)) {
									test.pass("TC:21 USER ABLE TO LOGIN FOR THANKS FOR SUBSCRIBING");
								} else {
									test.fail("TC:21 USER ABLE TO LOGIN FOR THANKS FOR SUBSCRIBING" + test
											.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Preference_Center")));
								}
						} else {
							test.fail("TC:20 USER NOT ABLE TO SEND MAIL FORMAT IN EMAIL FUNCTION" + test
									.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Preference_Center")));
						}
					} catch (Exception e) {
						test.fail("Error:" + e.getMessage());
					}			
				} catch (Exception e) {
					test.fail("TC:7 SIGN UP BUTTON IS ENABLE AND DISPLAYED"
							+ test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Preference_Center")));
					test.fail("Error:" + e.getMessage());
				}
			} else {
				test.fail("TC:2 JOIN US LINK IS WORKING--"
						+ test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Preference_Center")));

			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 3)
	public void Privacy_Policy() {
		Preference_Center_Page page = new Preference_Center_Page(driver);
		test = extent.createTest("Privacy_Policy");

		try {
			driver.get(Basepage.readProperty("urlPC"));

			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 PREFERENCE CENTER URL IS OPENED");
			} else {
				test.fail("TC:1 PREFERENCE CENTER URL IS OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Preference_Center"))
						+ "PREFERENCE CENTER URL IS OPENED");
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
		
		// CLICK JOIN US
				try {
					String joinuslinkhead = page.joinuslinkmethod1();
					String joinuslinkexcel = Excelreader.getData(0, 3, 5);
					if (joinuslinkhead.equals(joinuslinkexcel)) {
						test.pass("TC:2 JOIN US LINK IS WORKING");
			// by selecting sign up label
						try {
							String byselectingsignuphead = page.byselectingsignupmethod();
							String byselectingsignupexcel = Excelreader.getData(0, 26, 5);
							if (byselectingsignuphead.equals(byselectingsignupexcel)) {
								test.pass("TC:22 VERIFY LABEL 'BY SELECTING SIGN UP YOU AGREE.......' IS DISPLAYED");
							} else {
								test.fail("TC:22 VERIFY LABEL 'BY SELECTING SIGN UP YOU AGREE.......' IS NOT DISPLAYED"
										+ test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Preference_Center")));
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}
			// privacy policy link 
						try {
							String privacypolicyhead = page.privacypolicymethod();
							String privacypolicyexcel = Excelreader.getData(0, 27, 5);
							if (privacypolicyhead.equals(privacypolicyexcel)) {
								test.pass("TC:23 PRIVACY POLICY LINK IS WORKING ");
							} else {
								test.fail("TC:23 PRIVACY POLICY LINK IS WORKING"
										+ test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Preference_Center")));
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}			
					} else {
						test.fail("TC:2 JOIN US LINK IS WORKING--"
								+ test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Preference_Center")));

					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
	}

	@Test(priority = 4)
	public void Terms_Conditions() {
		Preference_Center_Page page = new Preference_Center_Page(driver);
		test = extent.createTest("Terms_Conditions");

		try {
			driver.get(Basepage.readProperty("urlPC"));

			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 PREFERENCE CENTER URL IS OPENED");
			} else {
				test.fail("TC:1 PREFERENCE CENTER URL IS OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Preference_Center"))
						+ "PREFERENCE CENTER URL IS OPENED");
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
		
		// CLICK JOIN US
				try {
					String joinuslinkhead = page.joinuslinkmethod1();
					String joinuslinkexcel = Excelreader.getData(0, 3, 5);
					if (joinuslinkhead.equals(joinuslinkexcel)) {
						test.pass("TC:2 JOIN US LINK IS WORKING");
			//terms and conditions
						String termsandconditionhead = page.termsandconditionmethod();
						String termsandconditionexcel = Excelreader.getData(0, 28, 5);
						if (termsandconditionhead.equals(termsandconditionexcel)) {
							test.pass("TC:24 TERMS AND CONDITIONS LINK IS WORKING");
						} else {
							test.fail("TC:24 TERMS AND CONDITIONS LINK IS WORKING"
									+ test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Preference_Center")));
						}
					} else {
						test.fail("TC:2 JOIN US LINK IS WORKING--"
								+ test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Preference_Center")));
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
	}
	
	@Test(priority = 5)
	public void wifiinstore1786() {
		Preference_Center_Page page = new Preference_Center_Page(driver);
		test = extent.createTest("wifiinstore1786");	
		try {
			driver.get(Basepage.readProperty("URLWIFI"));

			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 29, 5);
			if (gettitle.equalsIgnoreCase(gettitleexcel)) {
				test.pass("TC:1 WIFI IN-SROTE URL IS OPENED");
			} else {
				test.fail("TC:1 WIFI IN-SROTE URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Preference_Center"))
						+ "WIFI IN-SROTE URL IS NOT OPENED");
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
		
		// you're  connected 
				try {
					String yourconnectedlabelhead = page.yourconnectedlabelmethod();
					String yourconnectedlabelexcel = Excelreader.getData(0, 30, 5);
					if (yourconnectedlabelhead.equalsIgnoreCase(yourconnectedlabelexcel)) {
						test.pass("TC:25 VERIFY LABEL 'YOU'RE CONNECTED' IS DISPLAYED");
					} else {
						test.fail("TC:25 VERIFY LABEL 'YOU'RE CONNECTED' IS NOT DISPLAYED"
								+ test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Preference_Center")));
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}	
		// get great deals on ours 
		try {
			String getgreatdealsonlabelhead = page.getgreatdealsonlabelmethod();
			String getgreatdealsonlabelexcel = Excelreader.getData(0, 31, 5);
			if (getgreatdealsonlabelhead.equalsIgnoreCase(getgreatdealsonlabelexcel)) {
				test.pass("TC:26 VERIFY LABEL 'GET GREAT DEALS ON OUR....' IS DISPLAYED");
			} else {
				test.fail("TC:26 VERIFY LABEL 'GET GREAT DEALS ON OUR....' IS NOT DISPLAYED"
						+ test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Preference_Center")));
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}	
			// want the latest scoop label
				try {
					String wantthelatestscooplabelhead = page.wantthelatestscooplabelmethod();
					String wantthelatestscooplabelexcel = Excelreader.getData(0, 32, 5);
					if (wantthelatestscooplabelhead.equalsIgnoreCase(wantthelatestscooplabelexcel)) {
						test.pass("TC:27 VERIFY LABEL 'WANT THE LATEST SCOOP....' IS DISPLAYED");
					} else {
						test.fail("TC:27 VERIFY LABEL 'WANT THE LATEST SCOOP.....' IS NOT DISPLAYED"
								+ test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Preference_Center")));
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
		//join our email list
		try {
			String joinouremaillisthead = page.joinouremaillistmethod();
			String joinouremaillistexcel = Excelreader.getData(0, 33, 5);
			if (joinouremaillisthead.equalsIgnoreCase(joinouremaillistexcel)) {
				test.pass("TC:28 VERIFY LABEL 'JOIN OUR EMAIL LIST' IS DISPLAYED");
			} else {
				test.fail("TC:28 VERIFY LABEL 'JOIN OUR EMAIL LIST' IS NOT DISPLAYED"
						+ test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Preference_Center")));
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		
	}
	
}

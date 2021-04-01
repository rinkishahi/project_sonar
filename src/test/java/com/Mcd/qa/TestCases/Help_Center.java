package com.Mcd.qa.TestCases;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.McD.qa.Base.BaseTest;
import com.McD.qa.Extentreport.Extentreport;
import com.McD.qa.Pages.Basepage;
import com.McD.qa.Pages.Help_Center_Page;
import com.McD.qa.Utility.TestUtil;

public class Help_Center extends BaseTest {
	
	String excelpath = System.getProperty("user.dir");
	TestUtil Excelreader = new TestUtil(excelpath + "/src/main/java/com/McD/qa/TestData/Help_Center.xls");
	
	@Test(priority = 1)
	public void Open_URL_Helpcenter() {
		Help_Center_Page page = new Help_Center_Page(driver);
		test = extent.createTest("Open_URL_Helpcenter");

		try {
			driver.get(Basepage.readProperty("urlhelp"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL OF HELP CENTER IS OPENED");
			} else {
				test.fail("TC:1 URL OF HELP CENTER IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Help_Center"))
						+ "URL OF HELP CENTER IS NOT OPENED");
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
	public void Help_Center_Headings() {
		Help_Center_Page page = new Help_Center_Page(driver);
		test = extent.createTest("Help_Center_Headings");
	
	//help center heading 	
		try {
			String helpcenterheadinghead = page.helpcenterheadingmethod();
			String helpcenterheadingexcel = Excelreader.getData(0, 2, 5);
			if (!helpcenterheadinghead.equals(helpcenterheadingexcel)) {
				test.pass("TC:2  LABEL OF HELP CENTER IS  DISPLAYED");
			} else {
				test.fail("TC:2 LABEL OF HELP CENTER IS NOT  DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Help_Center"))
						+ "LABEL OF HELP CENTER IS NOT  DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("TC:2 LABEL OF HELP CENTER IS NOT  DISPLAYED");
			test.fail("Error:" + e.getMessage());
		}
		//find answers to you question 	
				try {
					String findanswerlabelhead = page.findanswerlabelmethod();
					String findanswerlabelexcel = Excelreader.getData(0, 3, 5);
					if (findanswerlabelhead.equals(findanswerlabelexcel)) {
						test.pass("TC:3  LABEL OF FIND ANSWERS TO YOUR QUESTION.... IS  DISPLAYED");
					} else {
						test.fail("TC:3 LABEL OF FIND ANSWERS TO YOUR QUESTION.... IS NOT  DISPLAYED");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Help_Center"))
								+ "LABEL OF FIND ANSWERS TO YOUR QUESTION.... IS NOT  DISPLAYED");
					}
				} catch (Exception e) {
					test.fail("TC:3 LABEL OF FIND ANSWERS TO YOUR QUESTION.... IS NOT  DISPLAYED");
					test.fail("Error:" + e.getMessage());
				}		
	//looking for something heading
				try {
					String lookingforsomthinglabelhead = page.lookingforsomthinglabelmethod();
					String lookingforsomthinglabelexcel = Excelreader.getData(0, 4, 5);
					if (lookingforsomthinglabelhead.equals(lookingforsomthinglabelexcel)) {
						test.pass("TC:4  LABEL OF LOOKING FOR SOMETHING  IS  DISPLAYED");
					} else {
						test.fail("TC:4 LABEL OF LOOKING FOR SOMETHING IS NOT  DISPLAYED");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Help_Center"))
								+ "LABEL OF LOOKING FOR SOMETHING IS NOT  DISPLAYED");
					}
				} catch (Exception e) {
					test.fail("TC:4 LABEL OF LOOKING FOR SOMETHING IS NOT  DISPLAYED");
					test.fail("Error:" + e.getMessage());
				}	
	}	
	
	@Test(priority = 3)
	public void Help_Center_Searchbutton() throws Exception {
		Help_Center_Page page = new Help_Center_Page(driver);
		test = extent.createTest("Help_Center_Searchbutton");	
	
	//enter all characters 
		try {
			String searchinputexcel = Excelreader.getData(0, 5, 5);
			String searchinputhead = page.searchinputmethod(searchinputexcel);
			if (searchinputhead.equalsIgnoreCase(searchinputexcel)) {
				test.pass("TC:5 USER ABLE TO ENTER ALL CHARACTERS IN SEARCH SECTION");
			} else {
				test.fail("TC:5 USER NOT ABLE TO ENTER ALL CHARACTERS IN SEARCH SECTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Help_Center"))
						+ "USER NOT ABLE TO ENTER ALL CHARACTERS IN SEARCH SECTION");
			}
		} catch (Exception e) {
			test.fail("TC:5 USER NOT ABLE TO ENTER ALL CHARACTERS IN SEARCH SECTION");
			test.fail("Error:" + e.getMessage());
		}		
	//click on search button	
	try {
		page.searchbuttonmethod();
		test.pass("TC:6 SEARCH BUTTON IS ENABLE AND DISPLAYED");
		
		try {
			String searchinputexcel = Excelreader.getData(0, 6, 5);
			String searchinputhead = page.searchinputmethod1(searchinputexcel);
			if (!searchinputhead.equalsIgnoreCase("")) {
				test.pass("TC:5 SEARCH BUTTON IS WORKING AND SEARCH RESULTS ALSO DISPLAYED");
			/*//load more button label 
				try {
					String loadmorelabelexcel = Excelreader.getData(0, 12, 5);
					String loadmorelabelhead = page.loadmorelabelmethod();
					if (loadmorelabelhead.equalsIgnoreCase(loadmorelabelexcel)) {
						test.pass("TC:9 LABEL OF LOAD MORE BUTTON LABEL IS DISPLAYED");
					} else {
						test.fail("TC:9 LABEL OF LOAD MORE BUTTON LABEL IS NOT DISPLAYED");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Help_Center"))
								+ "LABEL OF LOAD MORE BUTTON LABEL IS NOT DISPLAYED");
					}} catch (Exception e) {
						test.fail("TC:9 LABEL OF LOAD MORE BUTTON LABEL IS NOT DISPLAYED");
						test.fail("Error:" + e.getMessage());
					}*/
			//read more link label 	
				try {
					String readmorelabelexcel = Excelreader.getData(0, 10, 5);
					String readmorelabelhead = page.readmorelabelmethod();
					if (readmorelabelhead.equalsIgnoreCase(readmorelabelexcel)) {
						test.pass("TC:7 LABEL OF READ MORE IS DISPLAYED");
				//read more link click
						try {
						String readmoreclickexcel = Excelreader.getData(0, 11, 5);
						String readmoreclickhead = page.readmoreclickmethod();
						if (readmoreclickhead.equalsIgnoreCase(readmoreclickexcel)) {
							test.pass("TC:8 READ MORE LINK IS WORKING FINE");
						} else {
							test.fail("TC:8 READ MORE LINK IS NOT WORKING FINE");
							test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Help_Center"))
									+ "READ MORE LINK IS NOT WORKING FINE");
						}} catch (Exception e) {
							test.fail("TC:8 READ MORE LINK IS NOT WORKING FINE");
							test.fail("Error:" + e.getMessage());
						}
						
					} else {
						test.fail("TC:7 LABEL OF READ MORE IS NOT DISPLAYED");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Help_Center"))
								+ "LABEL OF READ MORE IS NOT DISPLAYED");
					}
				} catch (Exception e) {
					test.fail("TC:7 LABEL OF READ MORE IS NOT DISPLAYED");
					test.fail("Error:" + e.getMessage());
				}
				
			} else {
				test.fail("TC:5 SEARCH BUTTON IS WORKING AND SEARCH RESULTS ALSO NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Help_Center"))
						+ "SEARCH BUTTON IS WORKING FINE");
			}
		} catch (Exception e) {
			test.fail("TC:5 SEARCH BUTTON IS WORKING FINE");
			test.fail("Error:" + e.getMessage());
		}	
	}catch (Exception e) {
		test.fail("TC:6 SEARCH BUTTON IS NOT ENABLE AND DISPLAYED");
		test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Help_Center"))
				+ "SEARCH BUTTON IS NOT ENABLE AND DISPLAYED");
		test.fail("Error:" + e.getMessage());
	}
	}	
	
	@Test(priority = 4)
	public void Help_Center_Account()  {
		Help_Center_Page page = new Help_Center_Page(driver);
		test = extent.createTest("Help_Center_Account");	
	
		try {
			driver.get(Basepage.readProperty("urlhelp"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equalsIgnoreCase(gettitleexcel)) {
				test.pass("TC:1 URL OF HELP CENTER IS OPENED");
			} else {
				test.fail("TC:1 URL OF HELP CENTER IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Help_Center"))
						+ "URL OF HELP CENTER IS NOT OPENED");
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
		
	//TOPIC SECTION LABEL
		try {
			String topicslabelexcel = Excelreader.getData(0, 7, 5);
			String topicslabelhead = page.topicslabelmethod();
			if (topicslabelhead.equalsIgnoreCase(topicslabelexcel)) {
				test.pass("TC:10 LABEL OF TOPIC(SECTION) IS  DISPLAYED");
			} else {
				test.fail("TC:10 LABEL OF TOPIC(SECTION) IS NOT  DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Help_Center"))
						+ "LABEL OF TOPIC(SECTION) IS NOT  DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("TC:10 LABEL OF TOPIC(SECTION) IS NOT DISPLAYED");
			test.fail("Error:" + e.getMessage());
		}	
//Account link label	
		try {
			String accountlableexcel = Excelreader.getData(0, 8, 5);
			String accountlablehead = page.accountlablemethod();
			if (accountlablehead.equalsIgnoreCase(accountlableexcel)) {
				test.pass("TC:11 LABEL OF ACCOUNT IS  DISPLAYED");
			} else {
				test.fail("TC:11 LABEL OF ACCOUNT IS NOT  DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Help_Center"))
						+ "LABEL OF ACCOUNT IS NOT  DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("TC:11 LABEL OF ACCOUNT IS NOT DISPLAYED");
			test.fail("Error:" + e.getMessage());
		}	
		//Account link click 	
				try {
					String accountclickexcel = Excelreader.getData(0, 9, 5);
					String accountclickhead = page.accountclickmethod();
					if (accountclickhead.equalsIgnoreCase(accountclickexcel)) {
						test.pass("TC:12 'ACCOUNT' LINK IS WORKING ON TOPIC SECTION");
					} else {
						test.fail("TC:12 'ACCOUNT' LINK IS NOT WORKING ON TOPIC SECTION");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Help_Center"))
								+ "'ACCOUNT' LINK IS NOT WORKING ON TOPIC SECTION");
					}
				} catch (Exception e) {
					test.fail("TC:12 'ACCOUNT' LINK IS NOT WORKING ON TOPIC SECTION");
					test.fail("Error:" + e.getMessage());
				}	

	}

	@Test(priority = 5)
	public void Help_Center_Common_Questions()  {
		Help_Center_Page page = new Help_Center_Page(driver);
		test = extent.createTest("Help_Center_Common_Questions");	
	
		try {
			driver.get(Basepage.readProperty("urlhelp"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equalsIgnoreCase(gettitleexcel)) {
				test.pass("TC:1 URL OF HELP CENTER IS OPENED");
			} else {
				test.fail("TC:1 URL OF HELP CENTER IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Help_Center"))
						+ "URL OF HELP CENTER IS NOT OPENED");
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
		
//common question link label	
		try {
			String commonquestionexcel = Excelreader.getData(0, 13, 5);
			String commonquestionhead = page.commonquestionmethod();
			if (commonquestionhead.equalsIgnoreCase(commonquestionexcel)) {
				test.pass("TC:13 LABEL OF COMMON QUESTION IS  DISPLAYED");
			} else {
				test.fail("TC:13 LABEL OF COMMON QUESTION IS NOT  DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Help_Center"))
						+ "LABEL OF COMMON QUESTION IS NOT  DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("TC:13 LABEL OF COMMON QUESTION IS NOT DISPLAYED");
			test.fail("Error:" + e.getMessage());
		}	
		//COMMON QUESTION link click 	
				try {
					String commonquestionclickexcel = Excelreader.getData(0, 14, 5);
					String commonquestionclickhead = page.commonquestionclickmethod();
					if (commonquestionclickhead.equalsIgnoreCase(commonquestionclickexcel)) {
						test.pass("TC:14 'COMMON QUESTION' LINK IS WORKING ON TOPIC SECTION");
					} else {
						test.fail("TC:14 'COMMON QUESTION' LINK IS NOT WORKING ON TOPIC SECTION");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Help_Center"))
								+ "'COMMON QUESTION' LINK IS NOT WORKING ON TOPIC SECTION");
					}
				} catch (Exception e) {
					test.fail("TC:14 'COMMON QUESTION' LINK IS NOT WORKING ON TOPIC SECTION");
					test.fail("Error:" + e.getMessage());
				}	
		
	}

	@Test(priority = 6)
	public void Help_Center_Mobile_Ordering()  {
		Help_Center_Page page = new Help_Center_Page(driver);
		test = extent.createTest("Help_Center_Mobile_Ordering");	
	
		try {
			driver.get(Basepage.readProperty("urlhelp"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equalsIgnoreCase(gettitleexcel)) {
				test.pass("TC:1 URL OF HELP CENTER IS OPENED");
			} else {
				test.fail("TC:1 URL OF HELP CENTER IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Help_Center"))
						+ "URL OF HELP CENTER IS NOT OPENED");
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
		
//mobile ordering link label	
		try {
			String mobileordinglabelexcel = Excelreader.getData(0, 15, 5);
			String mobileordinglabelhead = page.mobileordinglabelmethod();
			if (mobileordinglabelhead.equalsIgnoreCase(mobileordinglabelexcel)) {
				test.pass("TC:15 LABEL OF MOBILE ORDERING IS  DISPLAYED");
			} else {
				test.fail("TC:15 LABEL OF MOBILE ORDERING IS NOT  DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Help_Center"))
						+ "LABEL OF MOBILE ORDERING IS NOT  DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("TC:15 LABEL OF MOBILE ORDERING IS NOT DISPLAYED");
			test.fail("Error:" + e.getMessage());
		}	
		//mobile ordering link click 	
				try {
					String mobileordingclickexcel = Excelreader.getData(0, 16, 5);
					String mobileordingclickhead = page.mobileordingclickmethod();
					if (mobileordingclickhead.equalsIgnoreCase(mobileordingclickexcel)) {
						test.pass("TC:16 'MOBILE ORDERING' LINK IS WORKING ON TOPIC SECTION");
					} else {
						test.fail("TC:16 'MOBILE ORDERING' LINK IS NOT WORKING ON TOPIC SECTION");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Help_Center"))
								+ "'MOBILE ORDERING' LINK IS NOT WORKING ON TOPIC SECTION");
					}
				} catch (Exception e) {
					test.fail("TC:16 'MOBILE ORDERING' LINK IS NOT WORKING ON TOPIC SECTION");
					test.fail("Error:" + e.getMessage());
				}	
	}


	@Test(priority = 7)
	public void Help_Center_Payment()  {
		Help_Center_Page page = new Help_Center_Page(driver);
		test = extent.createTest("Help_Center_Mobile_Ordering");	
	
		try {
			driver.get(Basepage.readProperty("urlhelp"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equalsIgnoreCase(gettitleexcel)) {
				test.pass("TC:1 URL OF HELP CENTER IS OPENED");
			} else {
				test.fail("TC:1 URL OF HELP CENTER IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Help_Center"))
						+ "URL OF HELP CENTER IS NOT OPENED");
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
		
//payment link label	
		try {
			String paymentlabelexcel = Excelreader.getData(0, 17, 5);
			String paymentlabelhead = page.paymentlabelmethod();
			if (paymentlabelhead.equalsIgnoreCase(paymentlabelexcel)) {
				test.pass("TC:17 LABEL OF PAYMENT IS  DISPLAYED");
			} else {
				test.fail("TC:17 LABEL OF PAYMENT IS NOT  DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Help_Center"))
						+ "LABEL OF PAYMENT IS NOT  DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("TC:17 LABEL OF PAYMENT IS NOT DISPLAYED");
			test.fail("Error:" + e.getMessage());
		}	
		//payment link click 	
				try {
					String paymentclickexcel = Excelreader.getData(0, 18, 5);
					String paymentclickhead = page.paymentclickmethod();
					if (paymentclickhead.equalsIgnoreCase(paymentclickexcel)) {
						test.pass("TC:18 'PAYMENT' LINK IS WORKING ON TOPIC SECTION");
					} else {
						test.fail("TC:18 'PAYMENT' LINK IS NOT WORKING ON TOPIC SECTION");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Help_Center"))
								+ "'PAYMENT' LINK IS NOT WORKING ON TOPIC SECTION");
					}
				} catch (Exception e) {
					test.fail("TC:18 'PAYMENT' LINK IS NOT WORKING ON TOPIC SECTION");
					test.fail("Error:" + e.getMessage());
				}	
	}

	@Test(priority = 8)
	public void Help_Center_Restaurant()  {
		Help_Center_Page page = new Help_Center_Page(driver);
		test = extent.createTest("Help_Center_Restaurant");	

		try {
			driver.get(Basepage.readProperty("urlhelp"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equalsIgnoreCase(gettitleexcel)) {
				test.pass("TC:1 URL OF HELP CENTER IS OPENED");
			} else {
				test.fail("TC:1 URL OF HELP CENTER IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Help_Center"))
						+ "URL OF HELP CENTER IS NOT OPENED");
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
		
//RESTAURANT link label	
		try {
			String restaurantlabelexcel = Excelreader.getData(0, 19, 5);
			String restaurantlabelhead = page.restaurantlabelmethod();
			if (restaurantlabelhead.equalsIgnoreCase(restaurantlabelexcel)) {
				test.pass("TC:19 LABEL OF RESTAURANT IS  DISPLAYED");
			} else {
				test.fail("TC:19 LABEL OF RESTAURANT IS NOT  DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Help_Center"))
						+ "LABEL OF PAYMENT IS NOT  DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("TC:17 LABEL OF RESTAURANT IS NOT DISPLAYED");
			test.fail("Error:" + e.getMessage());
		}	
		//mobile ordering link click 	
				try {
					String restaurantclickexcel = Excelreader.getData(0, 20, 5);
					String restaurantclickhead = page.restaurantclickmethod();
					if (restaurantclickhead.equalsIgnoreCase(restaurantclickexcel)) {
						test.pass("TC:20 'RESTAURANT' LINK IS WORKING ON TOPIC SECTION");
					} else {
						test.fail("TC:20 'RESTAURANT' LINK IS NOT WORKING ON TOPIC SECTION");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Help_Center"))
								+ "'RESTAURANT' LINK IS NOT WORKING ON TOPIC SECTION");
					}
				} catch (Exception e) {
					test.fail("TC:18 'RESTAURANT' LINK IS NOT WORKING ON TOPIC SECTION");
					test.fail("Error:" + e.getMessage());
				}	
	}

}

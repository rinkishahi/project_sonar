package com.Mcd.qa.TestCases;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.McD.qa.Base.BaseTest;
import com.McD.qa.Extentreport.Extentreport;
import com.McD.qa.Pages.Basepage;
import com.McD.qa.Pages.General_Inqure_Page;
import com.McD.qa.Pages.Restaurant_feedback_page;
import com.McD.qa.Pages.Resturant_Feedback_page1;
import com.McD.qa.Utility.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;


public class old_restaurant_feedback extends BaseTest {

	String excelptha = System.getProperty("user.dir");
	TestUtil Excelreader = new TestUtil(excelptha + "/src/main/java/com/McD/qa/TestData/old_restaurant_feedback.xls");

	@Test(priority = 1)
	public void Open_URLR() {
	Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
	test = extent.createTest("Open_URLR");

	try {
	driver.get(Basepage.readProperty("urlOR"));

	String gettitle = page.generallgetpagetitlemethod1();
	String gettitleexcel = Excelreader.getData(0, 1, 6);
	if (gettitle.equals(gettitleexcel)) {
	test.pass("TC:1 RESTAURANT URL IS OPENED");
	} else {
	test.fail("TC:1 RESTAURANT URL IS NOT OPENED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
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
	public void Restaurantlabel_image() throws IOException {
	Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
	test = extent.createTest("Restaurantlabel_image");
	
	try {
		driver.get(Basepage.readProperty("urlOR"));

		String gettitle = page.generallgetpagetitlemethod1();
		String gettitleexcel = Excelreader.getData(0, 1, 6);
		if (gettitle.equalsIgnoreCase(gettitleexcel)) {
			test.pass("TC:1 RESTAURANT URL IS OPENED");
		} else {
			test.fail("TC:1 RESTAURANT URL IS NOT OPENED");
			test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
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
	// Restaurant feedback heading
	try {
	String restarentheadtext = page.Restaurantheadform();
	String restarentexcel = Excelreader.getData(0, 2, 6);
	if (restarentheadtext.equals(restarentexcel)) {
	test.pass("TC:3 THE PAGE 'RESTAURANT FEEDBACK' PAGE IS DISPLAYED ");
	} else {
	test.fail("TC:3 THE PAGE 'RESTAURANT FEEDBACK' PAGE IS NOT DISPLAYED");
	test.fail(
	test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_feedback"))
	+ "THE PAGE 'RESTAURANT FEEDBACK' PAGE IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	/*// image
	try {
	Boolean re= page.restatentimage();
	if(re.equals(true)) {
	test.pass("TC:3 TEH 'RESTAURANT FEEDBACK' IMAGE IS DISPLAYED");
	} else {
	test.fail("TC:3 TEH 'RESTAURANT FEEDBACK' IMAGE IS NOT DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_feedback"))+ 
	"TEH 'RESTAURANT FEEDBACK' IMAGE IS NOT DISPLAYED");
	}}
	catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}*/

	 /*//image of McDelivery 
	try {
	String restatentimagehead= page.restatentimage();
	String restatentimageexcel=Excelreader.getData(0, 3, 6);
	if(restatentimagehead.equals(restatentimageexcel)) {
	test.pass("TC:3 TEH 'RESTAURANT FEEDBACK' IMAGE IS DISPLAYED");
	}
	else {
	test.fail("TC:3 TEH 'RESTAURANT FEEDBACK' IMAGE IS NOT DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_feedback"))+ 
	"TEH 'RESTAURANT FEEDBACK' IMAGE IS NOT DISPLAYED");
	} 

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}*/



	// Have some restaurant label
	try {
	String havesomeheadtext = page.havesomerestarentmethod();
	String havesomeexcel = Excelreader.getData(0, 2, 7);
	if (havesomeheadtext.equals(havesomeexcel)) {
	test.pass("TC:4 THE HAVE SOME RESTAUTANT ..... LABEL IS DISPLAYED ");
	} else {
	test.fail("TC:4 THE HAVE SOME RESTAUTANT ..... LABEL IS NOT DISPLAYED");
	test.fail(
	test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_feedback"))
	+ "THE HAVE SOME RESTAUTANT ..... LABEL IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	}

	@Test(priority = 3)
	public void Pick_Different_topic_Dropdown() throws IOException {
	Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
	test = extent.createTest("Pick_Different_topic_Dropdown");
	
	// Label of pick a different topic
	try {
		String picklab = page.labepickdiftopic();
		String picklabexcel = Excelreader.getData(0, 8, 7);
		if (picklab.equals(picklabexcel)) {
			test.pass("TC:5 LABEL OF PICK A DIFFERENT TOPIC IS DISPLAYED");
		} else {
			test.fail("TC:5 LABEL OF PICK A DIFFERENT TOPIC IS NOT DISPLAYED");
			test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
					+ "LABEL OF PICK A DIFFERENT TOPIC IS NOT DISPLAYED");
		}
	} catch (Exception e) {
		test.fail("Error:" + e.getMessage());
	}			
				
				
				// after click on pick different topic
		try {
			String afterpicklab = page.labepickdiftopic1();
			String afterpicklabexcel = Excelreader.getData(0, 8, 7);
			if (afterpicklab.equals(afterpicklabexcel)) {
				test.pass("TC:5 'LABEL OF PICK A DIFFERENT TOPIC' IS ROLLED UP IN THE SAME FIELD ");
			} else {
				test.fail("TC:5 LABEL OF PICK A DIFFERENT TOPIC IS NOT ROLLED UP IN THE SAME FIELD ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "LABEL OF PICK A DIFFERENT TOPIC IS NOT ROLLED UP");
			}} catch (Exception e) {
				test.fail("Error:" + e.getMessage());
			}							
				try {
					// contact us
					String contactusdropdownhead = page.seletUSFAQs(); // click and drop down value is display or not		
					String contactusdropdownexcel = Excelreader.getData(0, 4, 6);
					if (contactusdropdownhead.equals(contactusdropdownexcel)) {
						test.pass("TC:7 THE DROPDWON 'PICK A DIFFERENT TOPIC' SHOULD BE CLICKABLE");
						
							String gettitle = page.generallgetpagetitlemethod();
							String gettitleexcel = Excelreader.getData(0, 4, 7);
							if (gettitle.equals(gettitleexcel)) {
								test.pass("TC:7 THE PAGE 'CONTACT US + FAQs' PAGE IS TRIGGERED AND DISPLAYED IN THE SAME PAGE");
								driver.navigate().back();
							} else {
								test.fail(
										"TC:7 THE PAGE 'CONTACT US + FAQs' PAGE IS NOT TRIGGERED AND DISPLAYED IN THE SAME PAGE");
								test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
										+ "HEADING 'CONTACT US + FAQs' IS NOT TRIGGERED");
								driver.navigate().back();

							}
					} else {
						test.fail("TC:7 THE DROPDWON 'PICK A DIFFERENT TOPIC' SHOULD BE CLICKABLE");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
								+ "DROPDOWN FIELD 'CONTACT US + FAQs' IS NOT CLICKABLE");

					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}			
	
	// MOBILE APP FEEDBACK
	try {
	// select mobile app feedback
	String clickmobiledropdownhead1 = page.clickmobiledropdownmethod1();
	String clickmobiledropdownexcel1 = Excelreader.getData(0, 5, 6);
	if (clickmobiledropdownhead1.equals(clickmobiledropdownexcel1)) {
	test.pass("TC: USER SHOULD BE SELECT 'MOBILE APP FEEDBACK' DROP DOWN OPTION");
	// click on go button AND page of MOBILE APP FEEDBACK should BE triggered
	String gettitle = page.generallgetpagetitlemethod();
	String gettitleexcel = Excelreader.getData(0, 5, 7);
	if (gettitle.equals(gettitleexcel)) {
	test.pass("TC: USER ABLE TO CLICK ON 'GO' BUTTON");
	test.pass(
	"TC: THE PAGE 'MOBILE APP FEED BACK' PAGE IS TRIGGERED AND DISPLAYED IN THE SAME PAGE");
	driver.navigate().back();
	} else {
	test.fail(
	"TC: THE PAGE 'MOBILE APP FEED BACK' PAGE IS NOT TRIGGERED AND DISPLAYED IN THE SAME PAGE");
	test.fail(
	test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_feedback"))
	+ "HEADING 'MOBILE APP FEED BACK' IS NOT TRIGGERED");
	driver.navigate().back();
	}
	} else {
	test.fail("TC: USER SHOULD BE SELECT 'MOBILE APP FEED BACK' DROP DOWN OPTION");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_feedback"))
	+ "USER SHOULD BE SELECT 'MOBILE APP FEED BACK' OPTION");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// TRADEMARK PERMISION
	try {
	// select trademark permision feedback
	String trademarkdropdownhead1 = page.trademarkdropdownmethod1();
	String trademarkdropdownexcel1 = Excelreader.getData(0, 6, 6);
	if (trademarkdropdownhead1.equals(trademarkdropdownexcel1)) {
	test.pass("TC: USER SHOULD BE SELECT 'TRADEMARK PERMISION' OPTION");
	// click on go button AND page of MOBILE APP FEEDBACK should BE triggered
	String gettitle = page.generallgetpagetitlemethod();
	String gettitleexcel = Excelreader.getData(0, 6, 7);
	if (gettitle.equals(gettitleexcel)) {
	test.pass("TC: USER ABLE TO CLICK ON 'GO' BUTTON");
	test.pass(
	"TC: THE PAGE 'TRADEMARK PERMISION' PAGE IS TRIGGERED AND DISPLAYED IN THE SAME PAGE");
	driver.navigate().back();
	} else {
	test.fail(
	"TC: THE PAGE 'TRADEMARK PERMISION' PAGE IS NOT TRIGGERED AND DISPLAYED IN THE SAME PAGE");
	test.fail(
	test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_feedback"))
	+ "HEADING 'TRADEMARK PERMISION' IS NOT TRIGGERED");
	driver.navigate().back();
	}
	} else {
	test.fail("TC: USER SHOULD BE SELECT 'TRADEMARK PERMISION' OPTION");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_feedback"))
	+ "USER SHOULD BE SELECT 'TRADEMARK PERMISION' OPTION");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// General inquiry
	try {

	String generealdropdownhead = page.Generaldropdownvalmethod();
	String generealdropdownexcel = Excelreader.getData(0, 7, 6);
	if (generealdropdownhead.equals(generealdropdownexcel)) {
	test.pass("TC: THE DROPDWON 'PICK A DIFFERENT TOPIC' SHOULD BE CLICKABLE");
	String gettitle = page.generallgetpagetitlemethod();
	String gettitleexcel = Excelreader.getData(0, 7, 7);
	if (gettitle.equals(gettitleexcel)) {
	test.pass("TC: THE PAGE 'GENERAL INQUIRY' PAGE IS TRIGGERED AND DISPLAYED IN THE SAME PAGE");
	driver.navigate().back();
	} else {
	test.fail(
	"TC: THE PAGE 'GENERAL INQUIRY' PAGE IS NOT TRIGGERED AND DISPLAYED IN THE SAME PAGE");
	test.fail(
	test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_feedback"))
	+ "HEADING 'GENERAL INQUIRY' IS NOT TRIGGERED");
	driver.navigate().back();
	}
	} else {
	test.fail("TC: THE DROPDWON 'PICK A DIFFERENT TOPIC' SHOULD BE CLICKABLE");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_feedback"))
	+ "TC: THE DROPDWON 'PICK A DIFFERENT TOPIC' SHOULD BE CLICKABLE");
	}
	}  catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	}
	
	

	@Test(priority = 4)
	public void Indicate_Pleaseselect_Searchlabels() {
	Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
	test = extent.createTest("Indicate_Pleaseselect_Searchlabels");
	// INDICATE A REQUIRED FIELDS LABEL
	try {
	String indecatehead = page.Indicatesfieldmethod();
	String indecateexcel = Excelreader.getData(0, 8, 6);
	if (indecatehead.equals(indecateexcel)) {
	test.pass("TC:5  LABEL 'INDICATE A REQUIRED FIELDS' IS DIPLAYED");
	} else {
	test.fail("TC:5 LABEL 'INDICATE A REQUIRED FIELDS' IS NOT DIPLAYED");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// PLEASE SELECT THE RESTAURANT LABEL

	try {
	String Pleaseselethead = page.pleaseselectmethod();
	String pleaseselectexcel = Excelreader.getData(0, 9, 6);
	if (Pleaseselethead.equals(pleaseselectexcel)) {
	test.pass("TC:6  LABEL 'PLEASE SELECT THE RESTAURANT' IS DIPLAYED");
	} else {
	test.fail("TC:6 LABEL 'PLEASE SELECT THE RESTAURANT' IS NOT DIPLAYED");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// search for restaurant label
	try {
	String searchforhead = page.searchformethod();
	String searchforexcel = Excelreader.getData(0, 10, 6);
	if (searchforhead.equals(searchforexcel)) {
	test.pass("TC:7  LABEL 'SEARCH FOR RESTAURANT' IS DIPLAYED");
	} else {
	test.fail("TC:7 LABEL 'SEARCH FOR RESTAURANT' IS NOT DIPLAYED");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	}

	@Test(priority = 5)
	public void Restaurant_Locator() {
	Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
	test = extent.createTest("Restaurant_Locator");
	// restaurant locater label
	try {
	String restauranthead = page.restaurantlocatermethod();
	String restaurantexcel = Excelreader.getData(0, 11, 6);
	if (restauranthead.equals(restaurantexcel)) {
	test.pass("TC:8  LABEL 'RESTAURANT LOCATER' IS DIPLAYED");
	} else {
	test.fail("TC:8 LABEL 'RESTAURANT LOCATER' IS NOT DIPLAYED");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	
	// OR text is there or not
		try {
		String ORhead = page.ORlabelmethod();
		String ORexcle = Excelreader.getData(0, 13, 6);
		if (ORhead.equals(ORexcle)) {
		test.pass("TC:11  THE TEXT 'OR' IS DISPLAYED");
		} else {
		test.fail("TC:11 THE TEXT 'OR' IS NOT DISPLAYED");
		test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
		+ "THE TEXT 'OR' IS NOT DISPLAYED");
		}
		} catch (Exception e) {
		test.fail("Error:" + e.getMessage());
		}
		// locate me
		try {
		String locatemehead = page.Locatemelabelmethod();
		String locatemeexel = Excelreader.getData(0, 12, 7);
		if (locatemehead.equals(locatemeexel)) {
		test.pass("TC:12  THE BUTTON 'LOCATE ME' IS DISPLAYED");
		} else {
		test.fail("TC:12 THE BUTTON 'LOCATE ME' IS NOT DISPLAYED");
		test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
		+ "THE BUTTON 'LOCATE ME' IS NOT DISPLAYED");

		}
		} catch (Exception e) {
		test.fail("Error:" + e.getMessage());
		}
			// RESTAURANT BUTTON, POP UP AND ZIP,CITY

	try {
		String zipcityhead = page.zipcitymethod();
		String zipcityexcel = Excelreader.getData(0, 8, 6);
		if (!zipcityhead.equalsIgnoreCase("")) {
			test.pass("TC:8 RESTAURANT LOCATER BUTTON IS WORKING");
			// ZIP, CITY, STATRE LABEL
			try {
				String zipcitystatelabelhead = page.zipcitylabelmethod();
				String zipcitystatelabelexcel = Excelreader.getData(0, 12, 6);
				if (zipcitystatelabelhead.equalsIgnoreCase(zipcitystatelabelexcel)) {
					test.pass("TC:9 THE LABEL OF ZIP, CITY, STATE IS DISPLAYED ");
				} else {
					test.fail("TC:9 THE LABEL OF ZIP, CITY, STATE IS NOT DISPLAYED");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
							+ "THE LABEL OF ZIP, CITY, STATE IS NOT DISPLAYED");
				}
			} catch (Exception e) {
				test.fail("Error:" + e.getMessage());
			}
			// X close
			String zipcityclosehead = page.zipcitymethod1();
			String zipcitycloseexcel = Excelreader.getData(0, 8, 6);
			if (zipcityclosehead.equalsIgnoreCase("")) {
				test.pass("TC:10  CLOSE BUTTON IS WORKING ");
			} else {
				test.fail("TC:10 CLOSE BUTTON IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "CLOSE BUTTON IS NOT WORKING");
			}

		} else if (zipcityhead.equalsIgnoreCase("")) {

			test.fail("TC:8 RESTAURANT LOCATER BUTTON IS NOT WORKING");
			test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
					+ "RESTAURANT LOCATER BUTTON IS NOT WORKING");

		}
	} catch (Exception e) {
		test.fail("Error:" + e.getMessage());
	}

}			
	@Test(priority = 6)
	public void search_Button_Select_Restaurant() {
		Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
		test = extent.createTest("search_Button_Select_Restaurant");

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

								// select restaurant button label
								try {
									String restaurantaddlabelhead = page.restaurantbuttonlabelmethod();
									String restaurantaddlabelexcel = Excelreader.getData(0, 14, 6);
									if (restaurantaddlabelhead.equalsIgnoreCase(restaurantaddlabelexcel)) {
										test.pass(
												"TC:13 THE LABEL OF 'SELECT RESTAURANT' BUTTON IS DISPLAYED BELOW RESTAURANT LOCATION");

									} else {
										test.fail(
												"TC:13 THE LABEL OF 'SELECT RESTAURANT' BUTTON IS NOT DISPLAYED BELOW RESTAURANT LOCATION");
										test.fail(test.addScreenCaptureFromPath(
												Extentreport.getScreenshot(driver, "Resraurant_feedback"))
												+ "THE LABEL OF 'SELECT RESTAURANT' IS NOT DISPLAYED BELOW RESTAURANT LOCATION");
									}

								} catch (Exception e) {
									test.fail("Error:" + e.getMessage());
								}
								// click on select restaurant button
								try {
									String restaurantbuttonclickhead = page.restaurantbuttonclickmethod();
									String restaurantbuttonclickexcel = Excelreader.getData(0, 12, 6);
									if (restaurantbuttonclickhead.equalsIgnoreCase("")) {
										test.pass("TC:14 THE 'SELECT RESTAURANT' BUTTON IS WORKING");
										// SELECTED RESTAURANT label ,
										try {
											String Pleaseselethead = page.pleaseselectmethod();
											String pleaseselectexcel = Excelreader.getData(0, 9, 6);
											if (Pleaseselethead.equalsIgnoreCase(pleaseselectexcel)) {
												test.pass(
														"TC:15 ONCE A RESTAURANT IS SELECTED THE MAIN TITLE SHOULD DYNAMICALLY CHANGE LIKE 'SELECTED RESTAURANT'");
											} else {
												test.fail(
														"TC:15 ONCE A RESTAURANT IS SELECTED THE MAIN TITLE SHOULD DYNAMICALLY CHANGE LIKE 'SELECTED RESTAURANT'");
												test.fail(test.addScreenCaptureFromPath(
														Extentreport.getScreenshot(driver, "Resraurant_feedback"))
														+ "ONCE A RESTAURANT IS SELECTED THE MAIN TITLE SHOULD DYNAMICALLY CHANGE LIKE 'SELECTED RESTAURANT'");
											}

										} catch (Exception e) {
											test.fail("Error:" + e.getMessage());
										}

										/*// selected restaurant address
										try {
											String selectedrestaurantaddresshead = page
													.selectedrestaurantaddressmethod();
											if (!selectedrestaurantaddresshead.equalsIgnoreCase("")) {
												test.pass(
														"TC:16 ONCE A RESTAURANT IS SELECTED, RESTAURANT LOCATION IS DISPLAYED");
											} else {
												test.fail(
														"TC:16 ONCE A RESTAURANT IS SELECTED, RESTAURANT LOCATION IS DISPLAYED");
												test.fail(test.addScreenCaptureFromPath(
														Extentreport.getScreenshot(driver, "Resraurant_feedback"))
														+ "ONCE A RESTAURANT IS SELECTED,  RESTAURANT LOCATION IS DISPLAYED");
											}

										} catch (Exception e) {
											test.fail("Error:" + e.getMessage());
										}*/
										// change restaurant
										try {
											String restauranthead = page.changerestaurantmethod();
											String restaurantexcel = Excelreader.getData(0, 11, 6);
											if (restauranthead.equalsIgnoreCase(restaurantexcel)) {
												test.pass(
														"TC:17  ONCE A RESTAURANT IS SELECTED, THE BUTTON WILL DYNAMICALLY CHANGE LIKE 'CHANGE RESTAURANT'");
											} else {
												test.fail(
														"TC:17  ONCE A RESTAURANT IS SELECTED, THE BUTTON WILL DYNAMICALLY CHANGE LIKE 'CHANGE RESTAURANT'");
												test.fail(test.addScreenCaptureFromPath(
														Extentreport.getScreenshot(driver, "Resraurant_feedback"))
														+ "ONCE A RESTAURANT IS SELECTED, THE BUTTON WILL DYNAMICALLY CHANGE LIKE 'CHANGE RESTAURANT'");
											}

										} catch (Exception e) {
											test.fail("Error:" + e.getMessage());
										}

										/*// search AND SELECT A restaurant label
										try {
											String searchforhead = page.searchformethod();
											if (searchforhead.equalsIgnoreCase("")) {
												test.pass(
														"TC:18 ONCE A RESTAURANT IS SELECTED,  SUB TITLE OF 'SEARCH AND SELECT A RESTAURANT' SHOULD NOT DIPLAYED");
											} else {
												test.fail(
														"TC:18  ONCE A RESTAURANT IS SELECTED,  SUB TITLE OF 'SEARCH AND SELECT A RESTAURANT' SHOULD NOT DIPLAYED");
												test.fail(test.addScreenCaptureFromPath(
														Extentreport.getScreenshot(driver, "Resraurant_feedback"))
														+ "ONCE A RESTAURANT IS SELECTED,  SUB TITLE OF 'SEARCH AND SELECT A RESTAURANT' SHOULD NOT DIPLAYED'");
											}

										} catch (Exception e) {
											test.fail("Error:" + e.getMessage());
										}*/
										// select 'Change Restaurant' to select a different restaurant location.
										try {
											String zipcityhead1 = page.zipcitychangedmethod();
											String zipcityexcel1 = Excelreader.getData(0, 12, 6);
											if (!zipcityhead.equalsIgnoreCase("")) {
												test.pass("TC:18.1 USERS SHOULD BE ABLE TO SELECT 'CHANGE RESTAURANT'");
											} else if (zipcityhead1.equalsIgnoreCase(zipcityexcel1)) {

												test.fail("TC:18.1 USERS SHOULD BE ABLE TO SELECT 'CHANGE RESTAURANT'");
												test.fail(test.addScreenCaptureFromPath(
														Extentreport.getScreenshot(driver, "Resraurant_feedback"))
														+ "USERS SHOULD BE ABLE TO SELECT 'CHANGE RESTAURANT'");
											}
										} catch (Exception e) {
											test.fail("Error:" + e.getMessage());
										}
									} else {
										test.fail("TC:14 THE 'SELECT RESTAURANT' BUTTON IS WORKING");
										test.fail(test.addScreenCaptureFromPath(
												Extentreport.getScreenshot(driver, "Resraurant_feedback"))
												+ "THE 'SELECT RESTAURANT' BUTTON IS WORKING");
									}
								} catch (Exception e) {
									test.fail("Error:" + e.getMessage());
								}
							} else {
								test.fail(
										"TC:12 SEARCH BUTTON IS NOT WORKING AND RESTAURANT LOCATION ALSO IS NOT DISPLAYED");
								test.fail(test.addScreenCaptureFromPath(
										Extentreport.getScreenshot(driver, "Resraurant_feedback"))
										+ "SEARCH BUTTON IS NOT WORKING  AND RESTAURANT LOCATION ALSO IS NOT DISPLAYED");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}

					} else {
						test.fail("TC:11 USER NOT ABLE TO SEND ZIP CODE");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
										+ "USER NOT ABLE TO SEND ZIP CODE");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
			} else if (zipcityhead.equalsIgnoreCase(zipcityexcel)) {

				test.fail("TC:8 RESTAURANT LOCATER BUTTON IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "RESTAURANT LOCATER BUTTON IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}
	
	@Test(priority = 7)
	public void cant_find_the_location() {
	Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
	test = extent.createTest("cant_find_the_location");

	// con't find the location you're looking for label
	try {
	String contfindlocationlabelhead = page.contfindlocationlabelmethod();
	String contfindlocationlabelexcel = Excelreader.getData(0, 21, 6);
	if (contfindlocationlabelhead.equals(contfindlocationlabelexcel)) {
	test.pass("TC: LABEL OF 'CON'T FIND THE LOCATION YOU'RE LOOKING FOR' IS DISPLAYED ");
	} else {
	test.fail("TC: LABEL OF 'CON'T FIND THE LOCATION YOU'RE LOOKING FOR' IS NOT DISPLAYED  ");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "LABEL OF CON'T FIND THE LOCATION YOU'RE LOOKING FOR IS NOT DISPLAYED");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	}

	@Test(priority = 8)
	public void Restaurant_address() {
	Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
	test = extent.createTest("Restaurant_address");

	// click on con't find location link
	try {
	String restaurantaddlabelhead = page.restaurantaddrlabelmethods();
	String restaurantaddlabelexcel = Excelreader.getData(0, 22, 6);
	if (restaurantaddlabelhead.equals(restaurantaddlabelexcel)) {
	test.pass("TC: CAN'T  FIND THE LOCATION LINK IS CLICKABLE");
	// Restaurant address labelcontfindlocationclickmethod1
	try {
	String restaurantaddlabelhead1 = page.restaurantaddrlabelmethodsp();
	String restaurantaddlabelexcel1 = Excelreader.getData(0, 22, 6);
	if (restaurantaddlabelhead1.equals(restaurantaddlabelexcel1)) {
	test.pass("TC:16 RESTAURANT ADDRESS LABEL IS DISPLAYED");
	} else {
	test.fail("TC:16 RESTAURANT ADDRESS LABEL IS NOT DISPLAYED ");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "RESTAURANT ADDRESS LABEL IS NOT DISPLAYED ");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// RESTAURANT ADDRESS LABEL AFTER CLICK ON RESTARNAT ADDRESS
	try {
	String restaurantaddlabelhead2 = page.Restaurantaddressclickmethod();
	String restaurantaddlabelexcel2 = Excelreader.getData(0, 22, 6);
	if (restaurantaddlabelhead2.equals(restaurantaddlabelexcel2)) {
	test.pass("TC:16 RESTAURANT ADDRESS LABEL IS ROLLED UP");
	} else {
	test.fail("TC:16 RESTAURANT ADDRESS LABEL IS NOT ROLLED UP ");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "RESTAURANT ADDRESS LABEL IS NOT DISPLAYED ");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// SEND SPECIAL CHARACTERS
	try {

	String restaurantaddspchaexcel = Excelreader.getData(0, 23, 6);
	String restaurantaddspchahead = page.resraurantaddvaluemethod(restaurantaddspchaexcel);
	if (!restaurantaddspchahead.equals(restaurantaddspchaexcel)) {
	test.pass("TC:16 USER SHOULD NOT SEND SPECIAL CHARACTERS");
	} else {
	test.fail("TC:16 USER SHOULD NOT SEND SPECIAL CHARACTERS");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "RESTAURANT ADDRESS LABEL IS NOT DISPLAYED ");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// send characters and numerical
	try {

	String restaurantaddspchanumarexcel = Excelreader.getData(0, 24, 6);
	String restaurantaddspchanumahead = page.resraurantaddvaluemethod(restaurantaddspchanumarexcel);
	if (restaurantaddspchanumahead.equals(restaurantaddspchanumarexcel)) {
	test.pass("TC:16 USER SHOULD BE SEND NUMERICAL AND CHARACTERS");
	} else {
	test.fail("TC:16 USER SHOULD BE SEND NUMERICAL AND CHARACTERS");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD BE SEND NUMERICAL AND CHARACTERS");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// send more than 40 characters or numerical
	try {

	String restaurantaddmorethan40excel = Excelreader.getData(0, 25, 6);
	String restaurantaddmorethan40head = page.resraurantaddvaluemethod(restaurantaddmorethan40excel);
	if (!restaurantaddmorethan40head.equals(restaurantaddmorethan40excel)) {
	test.pass("TC:16 USER NOT ABLE TO SEND MORE THAN 40 NUMERICAL OR CHARACTERS");
	} else {
	test.fail("TC:16 USER NOT ABLE TO SEND MORE THAN 40 NUMERICAL OR CHARACTERS");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER NOT ABLE TO SEND MORE THAN 40 NUMERICAL OR CHARACTERS");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// click on submit button Restaurant address error message

	try {
	String restaurantadderrormesshead = page.restaurantadderrormessmethod();
	String restaurantadderrormessexcel = Excelreader.getData(0, 26, 6);
	if (restaurantadderrormesshead.equals(restaurantadderrormessexcel)) {
	test.pass("'ERROR MESSAGE DISPLAYED' -->" + "'" + restaurantadderrormesshead + "'");
	} else {
	test.fail("TC:16 RESTAURANT ADDRESS ERROR MESSAGE IS DIPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "RESTAURANT ADDRESS ERROR MESSAGE IS DIPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	} else {
	test.fail("TC: CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	}

	@Test(priority = 9)
	public void City_cont_find_location() {
	Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
	test = extent.createTest("City_cont_find_location");
	// click on con't find location link
	try {
	String restaurantaddlabelhead = page.restaurantaddrlabelmethods();
	String restaurantaddlabelexcel = Excelreader.getData(0, 22, 6);
	if (restaurantaddlabelhead.equals(restaurantaddlabelexcel)) {
	test.pass("TC: CAN'T  FIND THE LOCATION LINK IS CLICKABLE");
	// city label
	try {
	String citycantfindlabelhead = page.cityconatfindlabelmethod();
	String citycantfindlabelexcel = Excelreader.getData(0, 27, 6);
	if (citycantfindlabelhead.equals(citycantfindlabelexcel)) {
	test.pass("TC:17 LABEL OF 'CITY' IS DIPLYED");
	} else {
	test.fail("TC:17 LABEL OF 'CITY' IS NOT DIPLYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "LABEL OF 'CITY' IS NOT DIPLYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// AFTER CLICK CITY LABEL
	try {
	String citycantfindlabelhead = page.cityconatfindlabelmethod1();
	String citycantfindlabelexcel = Excelreader.getData(0, 27, 6);
	if (citycantfindlabelhead.equals(citycantfindlabelexcel)) {
	test.pass("TC:17 LABEL OF 'CITY' IS ROLLED UP");
	} else {
	test.fail("TC:17 LABEL OF 'CITY' IS NOT ROLLED UP");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "LABEL OF 'CITY' IS NOT ROLLED UP");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// SPECIAL CHARACTER IN CITY CONT FIND
	try {
	String citycantfindexcel = Excelreader.getData(0, 28, 6);
	String citycontfindsendhead = page.cityvaluemethod(citycantfindexcel);
	if (!citycontfindsendhead.equals(citycantfindexcel)) {
	test.pass("TC:17 USER SHOULD NOT SEND SPECIAL CHARACTERS");
	} else {
	test.fail("TC:17 USER SHOULD NOT SEND SPECIAL CHARACTERS");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD NOT SEND SPECIAL CHARACTERS");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// NUMERICAL IN CITY CONT FIND
	try {
	String citycantfindnumaexcel = Excelreader.getData(0, 29, 6);
	String citycontfindsendnuhead = page.cityvaluemethod(citycantfindnumaexcel);
	if (!citycontfindsendnuhead.equals(citycantfindnumaexcel)) {
	test.pass("TC:17 USER SHOULD NOT SEND NUMERICAL");
	} else {
	test.fail("TC:17 USER SHOULD NOT SEND NUMERICAL");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD NOT SEND NUMERICAL");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// characters in city cont find
	try {
	String citycantfindcharaexcel = Excelreader.getData(0, 30, 6);
	String citycontfindsendcharhead = page.cityvaluemethod(citycantfindcharaexcel);
	if (citycontfindsendcharhead.equals(citycantfindcharaexcel)) {
	test.pass("TC:17 USER SHOULD BE SEND CHARACTERS");
	} else {
	test.fail("TC:17 USER SHOULD BE SEND CHARACTERS");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD BE SEND CHARACTERS");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// MORE THAN 30 CHARACTERS IN CITY CONT FIND
	try {
	String citycantfindmorethan30excel = Excelreader.getData(0, 31, 6);
	String citycontfindsendmorethan30head = page.cityvaluemethod(citycantfindmorethan30excel);
	if (!citycontfindsendmorethan30head.equals(citycantfindmorethan30excel)) {
	test.pass("TC:17 USER SHOULD NOT SEND MORE THAN 30 CHARACTER");
	} else {
	test.fail("TC:17 USER SHOULD NOT SEND MORE THAN 30 CHARACTER");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD NOT SEND MORE THAN 30 CHARACTER");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// city cont find error message
	try {
	String cityerrormessaggehead = page.cityerrormessagemethod();
	String cityerrormessaggeexcel = Excelreader.getData(0, 32, 6);
	if (cityerrormessaggehead.equals(cityerrormessaggeexcel)) {
	test.pass("'ERROR MESSAGE DISPLAYED' -->" + "'" + cityerrormessaggehead + "'");
	} else {
	test.fail("TC:17 CITY ERROR MESSAGE IS NOT DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "CITY ERROR MESSAGE IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	} else {
	test.fail("TC: CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	}

	@Test(priority = 10)
	public void State_cont_find() {
	Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
	test = extent.createTest("State_cont_find");
	// click on con't find location link
	try {
	String restaurantaddlabelhead = page.restaurantaddrlabelmethods();
	String restaurantaddlabelexcel = Excelreader.getData(0, 22, 6);
	if (restaurantaddlabelhead.equals(restaurantaddlabelexcel)) {
	test.pass("TC: CAN'T  FIND THE LOCATION LINK IS CLICKABLE");
	// state cont find label
	try {
	String statecontlabelhead = page.statecontfindlabelmethod();
	String statecontlabelexcel = Excelreader.getData(0, 33, 6);
	if (statecontlabelhead.equals(statecontlabelexcel)) {
	test.pass("TC:18 STATE LABEL IS DISPLAYED");
	} else {
	test.fail("TC:18 STATE LABEL IS NOT DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "STATE LABEL IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// after click state cont find label
	try {
	String statecontlabelhead = page.statecontfindlabelmethod1();
	String statecontlabelexcel = Excelreader.getData(0, 33, 6);
	if (statecontlabelhead.equals(statecontlabelexcel)) {
	test.pass("TC:18 STATE LABEL IS ROLLED UP AFTER CLICK");
	} else {
	test.fail("TC:18 STATE LABEL IS NOT ROLLED AFTER CLICK");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "STATE LABEL IS NOT ROLLED AFTER CLICK");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// select drop down value
	try {
	String statecontfindselectedvalhead = page.statecontfindsendedvaluemethod();
	String statecontfindselectedvalexcel = Excelreader.getData(0, 34, 6);
	if (statecontfindselectedvalhead.equals(statecontfindselectedvalexcel)) {
	test.pass("TC:18 USER SHOULD BE SELECT DROP DOWN VALUE");
	} else {
	test.fail("TC:18 USER SHOULD BE SELECT DROP DOWN VALUE");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD BE SELECT DROP DOWN VALUE");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// cant find state error message
	try {
	String statecontfinderrormesshead = page.statecontfinderrormessmethod();
	String statecontfinderrormessexcel = Excelreader.getData(0, 35, 6);
	if (statecontfinderrormesshead.equals(statecontfinderrormessexcel)) {
	test.pass("'ERROR MESSAGE DISPLAYED' -->" + "'" + statecontfinderrormesshead + "'");
	} else {
	test.fail("TC:18 STATE ERROR MESSAGE IS NOT DIPLAYED IN CONT FIND LINK");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "STATE ERROR MESSAGE IS NOT DIPLAYED IN CONT FIND LINK");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	} else {
	test.fail("TC: CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	}

	@Test(priority = 11)
	public void Popular_landmark_near_therestaurant() {
	Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
	test = extent.createTest("Popular_landmark_near_therestaurant");
	// click on con't find location link
	try {
	String restaurantaddlabelhead = page.restaurantaddrlabelmethods();
	String restaurantaddlabelexcel = Excelreader.getData(0, 22, 6);
	if (restaurantaddlabelhead.equals(restaurantaddlabelexcel)) {
	test.pass("TC: CAN'T  FIND THE LOCATION LINK IS CLICKABLE");
	// POPULAR LAND MARK LABEL
	try {
	String popularlandmarklabelhead = page.popularlandmarklabemethod();
	String popularlandmarklabelexcel = Excelreader.getData(0, 36, 6);
	if (popularlandmarklabelhead.equals(popularlandmarklabelexcel)) {
	test.pass("TC:19 VERIFY LABEL 'POPULAR LANDMARK NEAR THE RESTAURANT' IS DISPLAYED");
	} else {
	test.fail("TC:19 VERIFY LABEL 'POPULAR LANDMARK NEAR THE RESTAURANT' IS NOT DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "VERIFY LABEL 'POPULAR LANDMARK NEAR THE RESTAURANT' IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// AFTER CLICK POPULAR LAND MARK LABEL ROOL UP
	try {
	String popularlandmarklabelhead = page.popularlandmarklabemethod1();
	String popularlandmarklabelexcel = Excelreader.getData(0, 36, 6);
	if (popularlandmarklabelhead.equals(popularlandmarklabelexcel)) {
	test.pass("TC:19 VERIFY LABEL 'POPULAR LANDMARK NEAR THE RESTAURANT' IS ROLLED UP");
	} else {
	test.fail("TC:19 VERIFY LABEL 'POPULAR LANDMARK NEAR THE RESTAURANT' IS NOT ROLLED UP");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "VERIFY LABEL 'POPULAR LANDMARK NEAR THE RESTAURANT' IS NOT ROLLED UP");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// special characters in popular land mark
	try {
	String popularlandmarksendSPEexcel = Excelreader.getData(0, 37, 6);
	String popularlandmarksendSPEhead = page.popularlandmarksendatttmethod1(popularlandmarksendSPEexcel);
	if (!popularlandmarksendSPEhead.equals(popularlandmarksendSPEexcel)) {
	test.pass("TC:19 USER SHOULD NOT BE SEND SPECIAL CHARACTERS IN POPULAR LAND MARK...TEXT");
	} else {
	test.fail("TC:19 USER SHOULD NOT BE SEND SPECIAL CHARACTERS IN POPULAR LAND MARK...TEXT");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD NOT BE SEND SPECIAL CHARACTERS IN POPULAR LAND MARK...TEXT");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// NUMERICAL
	try {
	String popularlandmarksendNUMAexcel = Excelreader.getData(0, 38, 6);
	String popularlandmarksendNUMAhead = page.popularlandmarksendatttmethod1(popularlandmarksendNUMAexcel);
	if (!popularlandmarksendNUMAhead.equals(popularlandmarksendNUMAexcel)) {
	test.pass("TC:19 USER SHOULD NOT BE SEND NUMERICAL IN POPULAR LAND MARK...TEXT");
	} else {
	test.fail("TC:19 USER SHOULD NOT BE SEND NUMERICAL IN POPULAR LAND MARK...TEXT");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD BE SEND NUMERICAL IN POPULAR LAND MARK...TEXT");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// CHARACTERS
	try {
	String popularlandmarksendCHARexcel = Excelreader.getData(0, 39, 6);
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
	// MORE THAN 80 CHARACTERS ONLY
	try {
	String popularlandmarksendMORE80excel = Excelreader.getData(0, 40, 6);
	String popularlandmarksendMORE80head = page.popularlandmarksendatttmethod1(popularlandmarksendMORE80excel);
	if (!popularlandmarksendMORE80head.equals(popularlandmarksendMORE80excel)) {
	test.pass("TC:19 USER NOT ABEL TO SEND MORE THAN 80 CHARACTERS IN POPULAR LAND MARK...TEXT");
	} else {
	test.fail("TC:19 USER NOT ABEL TO SEND MORE THAN 80 CHARACTERS IN POPULAR LAND MARK...TEXT");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER NOT ABEL TO SEND MORE THAN 80 CHARACTERS IN POPULAR LAND MARK...TEXT");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	} else {
	test.fail("TC: CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}}
	

	@Test(priority = 12)
	public void Vist_date_month() {
	Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
	test = extent.createTest("Vist_date_month");
	// click on con't find location link
	try {
	String restaurantaddlabelhead = page.restaurantaddrlabelmethods();
	String restaurantaddlabelexcel = Excelreader.getData(0, 22, 6);
	if (restaurantaddlabelhead.equals(restaurantaddlabelexcel)) {
	test.pass("TC: CAN'T  FIND THE LOCATION LINK IS CLICKABLE");
	// visit date label
	try {
	String visitdatelabehaed = page.visitdatelabelmethod();
	String visitdatelabeexcel = Excelreader.getData(0, 41, 6);
	if (visitdatelabehaed.equals(visitdatelabeexcel)) {
	test.pass("TC:20 VERIFY LABEL 'VISIT DATE' IS DISPLAYED");
	} else {
	test.fail("TC:20 VERIFY LABEL 'VISIT DATE' IS NOT DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "20 VERIFY LABEL 'VISIT DATE' IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// visit date month label
	try {
	String visitdatemonthlabehaed = page.visitdatemonthlabelmethod();
	String visitdatemonthlabeexcel = Excelreader.getData(0, 42, 6);
	if (visitdatemonthlabehaed.equals(visitdatemonthlabeexcel)) {
	test.pass("TC:21 VERIFY LABEL VISIT DATE 'MONTH' IS DISPLAYED");
	} else {
	test.fail("TC:21 VERIFY LABEL VISIT DATE 'MONTH' IS NOT DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "21 VERIFY LABEL VISIT DATE 'MONTH' IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// After click month label

	try {
	String visitdatemonthlabehaed = page.visitdatemonthlabelmethod1();
	String visitdatemonthlabeexcel = Excelreader.getData(0, 42, 6);
	if (visitdatemonthlabehaed.equals(visitdatemonthlabeexcel)) {
	test.pass("TC:21 VERIFY LABEL VISIT DATE 'MONTH' IS ROLLED UP");
	} else {
	test.fail("TC:21 VERIFY LABEL VISIT DATE 'MONTH' IS NOT ROLLED UP");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "21 VERIFY LABEL VISIT DATE 'MONTH' IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// select drop down value
	try {
	String visitdatemothsendvalhead = page.visitdatemothsendvaluemethod1();
	String visitdatemothsendvalexcel = Excelreader.getData(0, 43, 6);
	if (visitdatemothsendvalhead.equals(visitdatemothsendvalexcel)) {
	test.pass("TC:21 USER SHOULD BE SELECT DROP DOWN VALUE IN MONT FUNTION");
	} else {
	test.fail("TC:21 USER SHOULD BE SELECT DROP DOWN VALUE IN MONT FUNTION");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "21 USER SHOULD BE SELECT DROP DOWN VALUE IN MONT FUNTION");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// MONTH ERROR MESSAGE
	try {
	String montherrormessagehead = page.montherrormessagemethod();
	String montherrormessageexcel = Excelreader.getData(0, 44, 6);
	if (montherrormessagehead.equals(montherrormessageexcel)) {
	test.pass("TC:21 MONTH 'ERROR MESSAGE DISPLAYED' -->" + "'" + montherrormessagehead + "'");
	} else {
	test.fail("TC:21 MONTH ERROR MESSAGE IS NOT DIPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "MONTH ERROR MESSAGE IS NOT DIPLAYED");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}} else {
	test.fail("TC: CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	}

	@Test(priority = 13)
	public void Day_and_Year()  {
	Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
	test = extent.createTest("Day_and_Year");
	// click on con't find location link
	try {
	String restaurantaddlabelhead = page.restaurantaddrlabelmethods();
	String restaurantaddlabelexcel = Excelreader.getData(0, 22, 6);
	if (restaurantaddlabelhead.equals(restaurantaddlabelexcel)) {
	test.pass("TC: CAN'T  FIND THE LOCATION LINK IS CLICKABLE");
	// day label
	try {
	String daycontfindlabelhead = page.daycontfindlabelmethod();
	String daycontfindlabelexcel = Excelreader.getData(0, 45, 6);
	if (daycontfindlabelhead.equals(daycontfindlabelexcel)) {
	test.pass("TC:22 VERIFY LABEL 'DAY' IS DISPLAYYED");
	} else {
	test.fail("TC:22 VERIFY LABEL 'DAY' IS NOT DISPLAYYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "VERIFY LABEL 'DAY' IS DISPLAYYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// after click day label
	try {
	String daycontfindlabelhead = page.daycontfindlabelmethod1();
	String daycontfindlabelexcel = Excelreader.getData(0, 45, 6);
	if (daycontfindlabelhead.equals(daycontfindlabelexcel)) {
	test.pass("TC:22 VERIFY LABEL 'DAY' IS ROLLED UP");
	} else {
	test.fail("TC:22 VERIFY LABEL 'DAY' IS NOT ROLLED UP");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "VERIFY LABEL 'DAY' IS ROLLED UP");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// after click on day select drop down
	try {
	String daycontfindcdropdownvalhead= page.daycontfindcdropdownvalmethod();
	if(daycontfindcdropdownvalhead.equals("")) {
	test.pass("TC:22 WITH OUT SELECT MONTH USER CON'T SELECT DATE");
	}else {
	test.fail("TC:22 WITH OUT SELECT MONTH USER CON'T SELECT DATE");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "WITH OUT SELECT MONTH USER CON'T SELECT DATE");
	} 
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// check year label
	try {
	String yearcontfindlabelhead = page.yearcontfindlabelmethod();
	String yearcontfindlabelexcel = Excelreader.getData(0, 46, 6);
	if (yearcontfindlabelhead.equals(yearcontfindlabelexcel)) {
	test.pass("TC:23 VERIFY LABEL 'YEAR' IS DISPLAYYED");
	} else {
	test.fail("TC:23 VERIFY LABEL 'YEAR' IS NOT DISPLAYYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "VERIFY LABEL 'YEAR' IS DISPLAYYED");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// after click check year label
	try {
	String yearcontfindlabelhead = page.yearcontfindlabelmethod1();
	String yearcontfindlabelexcel = Excelreader.getData(0, 46, 6);
	if (yearcontfindlabelhead.equals(yearcontfindlabelexcel)) {
	test.pass("TC:23 VERIFY LABEL 'YEAR' IS ROLLED UP");
	} else {
	test.fail("TC:23 VERIFY LABEL 'YEAR' IS NOT ROLLED UP");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "VERIFY LABEL 'YEAR' IS DISPLAYYED");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// select year drop down value WITH OUR SELECT MONTH
	try {
	String yearcontfindcdropdownvalhead=page.yearcontfindcdropdownvalmethod();
	if(yearcontfindcdropdownvalhead.equals("")) {
	test.pass("TC:23 WITH OUT SELECT MONTH USER CON'T SELECT YEAR");
	}else {
	test.fail("TC:23 WITH OUT SELECT MONTH USER CON'T SELECT YEAR");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "WITH OUT SELECT MONTH USER CON'T SELECT YEAR");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// select day after select month
	try {
	String daysendedvaluehead = page.daysendedvaluemethod();
	String daysendedvalueexcel = Excelreader.getData(0, 47, 6);
	if (daysendedvaluehead.equals(daysendedvalueexcel)) {
	test.pass("TC:22 USE SHOULD BE SELECT 'DAY' AFTER SELECT MONTH");
	} else {
	test.fail("TC:22 USE SHOULD BE SELECT 'DAY' AFTER SELECT MONTH");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
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
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USE SHOULD BE SELECT 'YEAR' AFTER SELECT MONTH");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// day error message
	try {
	String dayerrormessagehead = page.dayerrormessagelabelmethod();
	String dayerrormessageexcel = Excelreader.getData(0, 49, 6);
	if (dayerrormessagehead.equals(dayerrormessageexcel)) {
	test.pass("TC:22 DAY 'ERROR MESSAGE DISPLAYED' -->" + "'" + dayerrormessagehead + "'");
	} else {
	test.fail("TC:22 DAY ERROR MESSAGE IS NOT DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "DAY ERROR MESSAGE IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// year error message
	try {
	String yearerrormessagehead = page.yearerrormessagelabelmethod();
	String yearerrormessageexcel = Excelreader.getData(0, 50, 6);
	if (yearerrormessagehead.equals(yearerrormessageexcel)) {
	test.pass("TC:22 DAY 'ERROR MESSAGE DISPLAYED' -->" + "'" + yearerrormessagehead + "'");
	} else {
	test.fail("TC:23 YEAR ERROR MESSAGE IS NOT DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "YEAR ERROR MESSAGE IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}} else {
	test.fail("TC: CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	}

	@Test(priority = 14)
	public void visit_time_AM_PM() {
	Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
	test = extent.createTest("visit_time_AM_PM");
	// click on con't find location link
	try {
	String restaurantaddlabelhead = page.restaurantaddrlabelmethods();
	String restaurantaddlabelexcel = Excelreader.getData(0, 22, 6);
	if (restaurantaddlabelhead.equals(restaurantaddlabelexcel)) {
	test.pass("TC: CAN'T  FIND THE LOCATION LINK IS CLICKABLE");
	// 'visit TIME' label
	try {
	String visittimelabelhead = page.visittimelabelmethod();
	String visittimelabelexcel = Excelreader.getData(0, 51, 6);
	if (visittimelabelhead.equals(visittimelabelexcel)) {
	test.pass("TC:24 VERIFY LABEL 'VISIT TIME' IS DISPLAYED");
	} else {
	test.fail("TC:24 VERIFY LABEL 'VISIT TIME' IS NOT DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "VERIFY LABEL 'VISIT TIME' IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// time label
	try {

	String timelabelhead = page.timelabelmethod();
	String timelabelexcel = Excelreader.getData(0, 52, 6);
	if (timelabelhead.equals(timelabelexcel)) {
	test.pass("TC:25 VERIFY LABEL 'TIME' IS DISPLAYED");
	} else {
	test.fail("TC:25 VERIFY LABEL 'TIME' IS NOT DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "VERIFY LABEL 'TIME' IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// check time(12) text
	try {
	String timetext12displayedhead = page.timetext12displayedmethod();
	String timetext12displayedexcel = Excelreader.getData(0, 53, 6);
	if (timetext12displayedhead.equals(timetext12displayedexcel)) {
	test.pass("TC:26 VERIFY TEXT '12:00' IS DISPLAYED DEFAULT IN TIME FUNCTION");
	} else {
	test.fail("TC:26 VERIFY TEXT '12:00' IS NOT DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "VERIFY TEXT '12:00' IS NOT DISPLAYED");
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
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD BE SELECT TIME OF DROP DOWN VALUE");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// LABEL OF AM-PM

	try {
	String ampmlabelhead = page.ampmlabelmethod();
	String ampmlabelexcel = Excelreader.getData(0, 55, 6);
	if (ampmlabelhead.equals(ampmlabelexcel)) {
	test.pass("TC:27 VERIFY LABEL 'AM/PM' IS DIPLAYED");
	} else {
	test.fail("TC:27 VERIFY LABEL 'AM/PM' IS NOT DIPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "VERIFY LABEL 'AM/PM' IS NOT DIPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// check AM text
	try {
	String pmtextdisplayedhead = page.pmvaluedisplayedmethod();
	String pmtextdisplayedexcel = Excelreader.getData(0, 56, 6);
	if (!pmtextdisplayedhead.equals(pmtextdisplayedexcel)) {
	test.pass("TC:27 VERIFY TEXT 'PM' IS DISPLAYED");
	} else {
	test.fail("TC:27 VERIFY TEXT 'PM' IS NOT DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "VERIFY TEXT 'PM' IS NOT DISPLAYED");
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
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER NOT ABLE TO SELECT DROP DOWN VALUE OF AM/PM FUNCTION");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}} else {
	test.fail("TC: CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	}

	@Test(priority = 15)
	public void what_was_you_takeaway_preference()  {
	Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
	test = extent.createTest("what_was_you_takeaway_preference");
	// click on con't find location link
	try {
	String restaurantaddlabelhead = page.restaurantaddrlabelmethods();
	String restaurantaddlabelexcel = Excelreader.getData(0, 22, 6);
	if (restaurantaddlabelhead.equals(restaurantaddlabelexcel)) {
	test.pass("TC: CAN'T  FIND THE LOCATION LINK IS CLICKABLE");
	// what was your takeway label
	try {
	String whatwasyourtakeawaylabelhead = page.whatwasyourtakeawaylabelmethod();
	String whatwasyourtakeawaylabelexcel = Excelreader.getData(0, 58, 6);
	if (whatwasyourtakeawaylabelhead.equals(whatwasyourtakeawaylabelexcel)) {
	test.pass("TC:28 VERIFY LABEL '*What was your takeaway preference' IS DISPLAYED");
	} else {
	test.fail("TC:28 VERIFY LABEL '*What was your takeaway preference' IS NOT DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "VERIFY LABEL '*What was your takeaway preference' IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// drive thru radio button LABEL
	try {
	String drivethruhead = page.drivethrumethod();
	String drivethruexcel = Excelreader.getData(0, 59, 6);
	if (drivethruhead.equals(drivethruexcel)) {
	test.pass("TC:28 VERIFY LABEL 'DRIVE THRU' IS DISPLAYED");
	} else {
	test.fail("TC:28 VERIFY LABEL 'DRIVE THRU' IS NOT DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "VERIFY LABEL 'DRIVE THRU' IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// IN-STORE LABEL
	try {
	String instorehead = page.instoremethod();
	String instoreexcel = Excelreader.getData(0, 59, 7);
	if (instorehead.equals(instoreexcel)) {
	test.pass("TC:28 VERIFY LABEL 'IN-STORE' IS DISPLAYED");
	} else {
	test.fail("TC:28 VERIFY LABEL 'IN-STORE' IS NOT DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "VERIFY LABEL 'IN-STORE' IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// DRIVE thru radio button
	try {
	String drivethruradiobuttonisselectedheadd = page.driveradiobuttonbydefaultselectedmethod();
	if (!drivethruradiobuttonisselectedheadd.equals("true")) {
	test.pass("TC:28 DRIVE THRU RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
	} else {
	test.fail("TC:28 DRIVE THRU RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "DRIVE THRU RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());

	}
	// IN-STORE RADIO BUTTON
	try {
	String instoreradiobuttonisselectedheadd = page.instoreradiobuttonbydefaultselectedmethod();
	if (!instoreradiobuttonisselectedheadd.equals("true")) {
	test.pass("TC:28 IN-STORE RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
	} else {
	test.fail("TC:28 IN-STORE RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "IN-STORE RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
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
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "DRIVE THRU TADIO BUTTON SHOULD BE CLICKABLE");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());

	}

	// IN-STORE RADIO BUTTON after selected
	try {
	String instoreradiobuttonisselectedheadd = page.instoreradiobuttonselectedmethod();
	if (instoreradiobuttonisselectedheadd.equals("true")) {
	test.pass("TC:28 IN-STORE RADIO BUTTON SHOULD BE CLICKABLE");
	String drivethruradiobuttonisselectedheadd = page.driveradiobuttonbydefaultselectedmethod();
	if (!drivethruradiobuttonisselectedheadd.equals("true")) {
	test.pass("TC:28 DRIVE THRU AND IN-STORE RADIO BUTTONS SHOULD NOT SELECTED BOTH");
	} else {
	test.fail("TC:28 DRIVE THRU AND IN-STORE RADIO BUTTONS SHOULD NOT SELECTED BOTH");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "DRIVE THRU AND IN-STORE RADIO BUTTONS SHOULD NOT SELECTED BOTH");
	}
	} else {
	test.fail("TC:28 IN-STORE RADIO BUTTON SHOULD BE CLICKABLE");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "IN-STORE RADIO BUTTON SHOULD BE CLICKABLE");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());

	}
	// ERROR MESSAGE
	try {
	String whatwaserrormesshead = page.whatwaserrormessagemethod();
	String whatwaserrormessexcel = Excelreader.getData(0, 58, 7);
	if (whatwaserrormesshead.equals(whatwaserrormessexcel)) {
	test.pass("TC:40 'ERROR MESSAGE DISPLAYED' -->" + "'" + whatwaserrormesshead + "'");
	} else {
	test.fail("TC:40  WHAT WAS YOUR TAKEN ERROR MESSAGE  IS NOT DIPLAYED ");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "WHAT WAS YOUR TAKEN ERROR MESSAGE IS NOT DIPLAYED ");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}} else {
	test.fail("TC: CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "CAN'T  FIND THE LOCATION LINK IS NOT CLICKABLE");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	}

	@Test(priority = 16)
	public void Give_us_your_feedback() {
	Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
	test = extent.createTest("Give_us_your_feedback");

	try {
	String givefeedbacklabelhead = page.giveusfeedbacklabelmethod();
	String givefeedbacklabelexcel = Excelreader.getData(0, 60, 6);
	if (givefeedbacklabelhead.equals(givefeedbacklabelexcel)) {
	test.pass("TC:30 VERIFY LABEL 'GIVE US YOUR FEEDBACK' IS DISPLAYED");
	} else {
	test.fail("TC:30 VERIFY LABEL 'GIVE US YOUR FEEDBACK' IS DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "VERIFY LABEL 'GIVE US YOUR FEEDBACK' IS DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// LABEL OF enter your comments(0/1200 characters)
	try {
	String Entercommentlabel = page.entercommentsmethod();
	String Entercommentexcel = Excelreader.getData(0, 61, 6);
	if (Entercommentlabel.equals(Entercommentexcel)) {
	test.pass("TC:31  THE LABEL'ENTER YOUR COMMENTS(0/1200 characters)' IS DISPLAYED");
	} else {
	test.fail("TC:31 THE LABEL'ENTER YOUR COMMENTS(0/1200 characters)' IS NOT DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "THE LABEL'ENTER YOUR COMMENTS(0/1200 characters)' IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// LABEL OF ENTER YOUR COMMENTS IS ROLLED UP

	try {
	String Entercommentrolledlabel = page.entercommentsmethod1();
	String Entercommentexcel = Excelreader.getData(0, 61, 6);
	if (Entercommentrolledlabel.equals(Entercommentexcel)) {
	test.pass("TC:31  THE LABEL'ENTER YOUR COMMENTS(0/1200 characters)' IS ROLLED UP");
	} else {
	test.fail("TC:31 THE LABEL'ENTER YOUR COMMENTS(0/1200 characters)' IS NOT ROLLED UP");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "THE LABEL'ENTER YOUR COMMENTS(0/1200 characters)' IS NOT ROLLED UP");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// enter special characters on comments
	try {
	String commetspecialcharacterhexcel = Excelreader.getData(0, 62, 6);
	String commscenteredvalue = page.commententeredvalue(commetspecialcharacterhexcel);
	if (!commscenteredvalue.equals(commetspecialcharacterhexcel)) {
	test.pass("TC:31 USE SHOUL NOT  SEND SPECIAL CHARACTER IN COMMENT TEXT");
	} else {
	test.fail("TC:31 USE SHOUL NOT SEND SPECIAL CHARACTER IN COMMENT TEXT");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USE SHOUL NOT SEND SPECIAL CHARACTER IN COMMENT TEXT");
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
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USE SHOUL BE SEND NUMARICAL AND CHARACTER IN COMMENT TEXT");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// Enter MORE THAN 1200 characters and error message
	try {
	String commetcharacterexcel = Excelreader.getData(0, 64, 6);
	String commmorethan1200 = page.commententeredvalue(commetcharacterexcel);
	if (commmorethan1200.equals(commetcharacterexcel)) {
	test.pass("TC:31 USE SHOULD SEND MORE THAN 1200 IN COMMENT TEXT");
	String commmeterromesshead = page.commenterrormessagmethod();
	String commentserrormessexcel = Excelreader.getData(0, 65, 6);
	if (commmeterromesshead.equals(commentserrormessexcel)) {
	test.pass(
	"TC:31 ENTER YOUR COMMETN OF ERROR MESSAGE IS DISPLAYED AFTER ENTER MORE THAN 1200 CHARACTERS");

	} else {
	test.fail(
	"TC:31 ENTER YOUR COMMETN OF ERROR MESSAGE IS NOT DISPLAYED AFTER ENTER MORE THAN 1200 CHARACTERS");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "ENTER YOUR COMMETN OF ERROR MESSAGE IS NOT DISPLAYED AFTER ENTER MORE THAN 1200 CHARACTERS");
	}
	} else {
	test.fail("TC:31 USE SHOULD SEND MORE THAN 1200 IN COMMENT TEXT");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USE SHOULD NOT SEND MORE THAN 1200 IN COMMENT TEXT");

	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// error message after click on submit
	try {
	String commmeterromesshead = page.commenterrormessagmethod1();
	String commentserrormessexcel = Excelreader.getData(0, 65, 7);
	if (commmeterromesshead.equals(commentserrormessexcel)) {
	test.pass("TC:31 ENTER YOUR COMMETN OF ERROR MESSAGE IS DISPLAYED AFTER SUBMIT WITH OUT VALUE");

	} else {
	test.fail("TC:31 ENTER YOUR COMMETN OF ERROR MESSAGE IS NOT DISPLAYED AFTER SUBMIT WITH OUT VALUE");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "ENTER YOUR COMMETN OF ERROR MESSAGE IS NOT DISPLAYED AFTER SUBMIT WITH OUT VALUE");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	}

	@Test(priority = 17)
	public void First_name() {
	Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
	test = extent.createTest("First_name");
	// TELL US ABOUT YOURSELF
	try {
	String tellusabouthead = page.teluraboutmethod();
	String tellusaboutexcel = Excelreader.getData(0, 66, 6);
	if (tellusabouthead.equals(tellusaboutexcel)) {
	test.pass("TC:32 THE LABEL 'TELL US ABOUT YOURSELF' IS DISPLAYED");
	} else {
	test.fail("TC:32 THE LABEL 'TELL US ABOUT YOURSELF' IS NOT DISPLAYED ");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "THE LABEL 'TELL US ABOUT YOURSELF' IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// label of first name
	try {
	String firstnamelabehead = page.firstnamelabelmethod();
	String firstnamelabelexcel = Excelreader.getData(0, 67, 6);
	if (firstnamelabehead.equals(firstnamelabelexcel)) {
	test.pass("TC:33 THE TEXT '*FIRST NAME' IS DISPLAYED");
	} else {
	test.fail("TC:33 THE TEXT '*FIRST NAME' IS DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "THE TEXT '*FIRST NAME' IS DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// after click first name label
	try {
	String firstnamelabehead = page.firstnamelabelmethod1();
	String firstnamelabelexcel = Excelreader.getData(0, 67, 6);
	if (firstnamelabehead.equals(firstnamelabelexcel)) {
	test.pass("TC:33 THE TEXT '*FIRST NAME' IS ROLLED UP IN THE SAME PAGE");
	} else {
	test.fail("TC:33 THE TEXT '*FIRST NAME' IS NOT ROLLED UP IN THE SAME PAGE");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "THE TEXT '*FIRST NAME' IS NOT ROLLED UP IN THE SAME PAGE");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// SPECIAL CHARACTERS
	try {
	String firstnamesendvalexcel = Excelreader.getData(0, 68, 6);
	String sendedvalhead = page.finameEnteredvalue(firstnamesendvalexcel);
	if (!sendedvalhead.equals(firstnamesendvalexcel)) {
	test.pass("TC:33  USE SHOULD NOT BE SEND SPECIAL CHARACTERS IN FIRSTNAME TEXTBOX");
	} else {
	test.fail("TC:33  USE SHOULD NOT BE SEND SPECIAL CHARACTERS IN FIRSTNAME TEXTBOX");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USE SHOULD NOT BE SEND SPECIAL CHARACTERS IN FIRSTNAME TEXTBOX");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// NUMARICAL VALUES IN FIRST NAME FUNCTION
	try {
	String firstnamesendvalexcel = Excelreader.getData(0, 69, 6);
	String sendedvalhead = page.finameEnteredvalue(firstnamesendvalexcel);
	if (!sendedvalhead.equals(firstnamesendvalexcel)) {
	test.pass("TC:33  USE SHOULD NOT BE SEND NUMARICAL VALUE IN FIRSTNAME TEXTBOX");
	} else {
	test.fail("TC:33  USE SHOULD NOT BE SEND NUMARICAL VALUE IN FIRSTNAME TEXTBOX");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USE SHOULD NOT BE SEND NUMARICAL VALUE IN FIRSTNAME TEXTBOX");
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
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USE SHOULD  BE SEND CHARACTERS IN FIRSTNAME TEXTBOX");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// MORE THAN 25 CHARACTERS IN FIRST NAME FUNCTION
	try {
	String firstnamesendvalexcel = Excelreader.getData(0, 71, 6);
	String sendedvalhead = page.finameEnteredvalue(firstnamesendvalexcel);
	if (!sendedvalhead.equals(firstnamesendvalexcel)) {
	test.pass("TC:33  USE SHOULD NOT BE SEND MORE THAN 25 CHARACTERS  IN FIRSTNAME TEXTBOX");
	} else {
	test.fail("TC:33  USE SHOULD NOT BE SEND MORE THAN 25 CHARACTERS IN FIRSTNAME TEXTBOX");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USE SHOULD  NOT BE SEND MORE THAN 25 CHARACTERS IN FIRSTNAME TEXTBOX");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	/*// ERROR MESSAGE OF FIRST NAME
	try {
	String finameerorhead1 = page.firstnameerror();
	String finamerrorexcel2 = Excelreader.getData(0, 72, 6);
	if (finameerorhead1.equals(finamerrorexcel2)) {
	test.pass("FIRST NAME FUNCTION ERROR MESSAGE IS DISPLAYED");
	} else {
	test.fail("FIRST NAME FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "FIRST NAME FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}*/
	}

	@Test(priority = 18)
	public void Last_Name() {
	Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
	test = extent.createTest("Last_Name");

	// LAST NAME LABEL
	try {
	String LNlabelhead = page.lastnamelabelmethod();
	String LNlabelexcel = Excelreader.getData(0, 73, 6);
	if (LNlabelhead.equals(LNlabelexcel)) {
	test.pass("TC:34 THE LABEL 'LAST NAME' IS DISPLAYED");
	} else {
	test.fail("TC:34 THE LABEL 'LAST NAME' IS NOT DISPLAYED ");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "THE LABEL 'LAST NAME' IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// CLICK AND ROLLED UP THE LAST NAME LABEL
	try {
	String LNlabelhead = page.lastnamelabelmethod1();
	String LNlabelexcel = Excelreader.getData(0, 73, 6);
	if (LNlabelhead.equals(LNlabelexcel)) {
	test.pass("TC:34 THE LABEL 'LAST NAME' IS ROLLED UP AFTER CLICK ON LAST NAME");
	} else {
	test.fail("TC:34 THE LABEL 'LAST NAME' IS NOT ROLLED UP AFTER CLICK ON LAST NAME");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "THE LABEL 'LAST NAME' IS NOT ROLLED UP AFTER CLICK ON LAST NAME");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// SPECIAL CHARACTERS
	try {
	String LNSPECIALCHARACTER = Excelreader.getData(0, 74, 6);
	String LAscvalue = page.lastnameenterdvalue(LNSPECIALCHARACTER);
	if (!LAscvalue.equals(LNSPECIALCHARACTER)) {
	test.pass("TC:34 USER SHOULD NOT BE SEND SPECIAL CHARACTERS IN LASTNAME TEXTBOX");
	} else {
	test.fail("TC:34 USER SHOULD NOT BE SEND SPECIAL CHARACTERS IN LASTNAME TEXTBOX");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD NOT BE SEND SPECIAL CHARACTERS IN LASTNAME TEXTBOX");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// NUMARICAL IN LAST NAME FUNCTION

	try {
	String LNSPECIALCHARACTER = Excelreader.getData(0, 75, 6);
	String LAscvalue = page.lastnameenterdvalue(LNSPECIALCHARACTER);
	if (!LAscvalue.equals(LNSPECIALCHARACTER)) {
	test.pass("TC:34 USER SHOULD NOT BE SEND NUMARICAL IN LASTNAME TEXTBOX");
	} else {
	test.fail("TC:34 USER SHOULD NOT BE SEND NUMARICAL IN LASTNAME TEXTBOX");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD NOT BE SEND NUMARICAL IN LASTNAME TEXTBOX");
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
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD  BE SEND CHARACTERS IN LASTNAME TEXTBOX");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// MORE THAN 25 CHARACTER IN LAST NAME FUNCTION
	try {
	String LNSPECIALCHARACTER = Excelreader.getData(0, 77, 6);
	String LAscvalue = page.lastnameenterdvalue(LNSPECIALCHARACTER);
	if (!LAscvalue.equals(LNSPECIALCHARACTER)) {
	test.pass("TC:34 USER SHOULD NOT SEND MORE THAN 25 CHARACTERS IN LASTNAME TEXTBOX");
	} else {
	test.fail("TC:34 USER SHOULD NOT SEND MORE THAN 25 CHARACTERS IN LASTNAME TEXTBOX");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD NOT BE SEND MORE THAN 25 CHARACTERS IN LASTNAME TEXTBOX");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// LAST NAME ERROR MESSAGE
	try {
	try {
	String LNerrormess = page.lastnameerrormesmethod();
	String LNerrormesexcel = Excelreader.getData(0, 78, 6);
	if (LNerrormess.equals(LNerrormesexcel)) {
	test.pass("LAST NAME FUNCTION ERROR MESSAGE IS DISPLAYED");
	} else {
	test.fail("LAST NAME FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "LAST NAME FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	} catch (Exception e) {
	test.fail("Submit button is not working fine and enable");
	}
	}

	@Test(priority = 19)
	public void Address_USonly() {
	Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
	test = extent.createTest("Address_USonly");

	// ADDRESS(US ONLY)
	try {
	String addresslabelhead = page.addresslabelmethod();
	String addresslabelexcel = Excelreader.getData(0, 79, 6);
	if (addresslabelhead.equals(addresslabelexcel)) {
	test.pass("TC:35 THE LABEL 'ADDRESS(US ONLY)' IS DISPLAYED");
	} else {
	test.fail("TC:35 THE LABEL 'ADDRESS(US ONLY)' IS NOT DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "THE LABEL 'ADDRESS(US ONLY)' IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// CLICK ON ADDRESS(US ONLY) AND CHECK LABES rolled up or not
	try {
	String addresslabelhead = page.addresslabelmethod1();
	String addresslabelexcel = Excelreader.getData(0, 79, 6);
	if (addresslabelhead.equals(addresslabelexcel)) {
	test.pass("TC:35 THE LABEL 'ADDRESS(US ONLY)' IS ROLLED UP AFTE CLICK ON ADDRESS TEXT");
	} else {
	test.fail("TC:35 THE LABEL 'ADDRESS(US ONLY)' IS NOT ROLLED UP AFTE CLICK ON ADDRESS TEXT");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "THE LABEL 'ADDRESS(US ONLY)' IS NOT ROLLED UP AFTE CLICK ON ADDRESS TEXT");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// special characters
	try {
	String addressspecharacterhead = Excelreader.getData(0, 80, 6);
	String adsccnvalue = page.addressenterdlabel1(addressspecharacterhead);
	if (!adsccnvalue.equals(addressspecharacterhead)) {
	test.pass("TC:35 USER SHOULD NOT SEND SPECIAL CHARACTERS IN ADDRESS TEXTBOX");
	} else {
	test.fail("TC:35 USER SHOULD NOT SEND SPECIAL CHARACTERS IN ADDRESS TEXTBOX");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD NOT SEND SPECIAL CHARACTERS IN ADDRESS TEXTBOX");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// NUMARICAL AND CHARACTERS SEND IN ADDRESS US(ONLY)

	try {
	String addressspecharacterhead = Excelreader.getData(0, 81, 6);
	String adsccnvalue = page.addressenterdlabel1(addressspecharacterhead);
	if (adsccnvalue.equals(addressspecharacterhead)) {
	test.pass("TC:35 USER SHOULD  SEND NUMARICAL AND CHARACTERS IN ADDRESS TEXTBOX");
	} else {
	test.fail("TC:35 USER SHOULD SEND NUMARICAL AND CHARACTERS IN ADDRESS TEXTBOX");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD  SEND NUMARICAL AND CHARACTERS IN ADDRESS TEXTBOX");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// MORE THAN 40 CHARACTERS IN ADDRESS US

	try {
	String addressspecharacterhead = Excelreader.getData(0, 82, 6);
	String adsccnvalue = page.addressenterdlabel1(addressspecharacterhead);
	if (!adsccnvalue.equals(addressspecharacterhead)) {
	test.pass("TC:35 USER SHOULD NOT SEND MORE THAN 40 NUMARICAL AND CHARACTERS IN ADDRESS TEXTBOX");
	} else {
	test.fail("TC:35 USER SHOULD NOT SEND MORE THAN 40 NUMARICAL AND CHARACTERS IN ADDRESS TEXTBOX");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD NOT SEND MORE THAN 40 NUMARICAL AND CHARACTERS IN ADDRESS TEXTBOX");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// ERROR MESSAGE OF ADDRESSS US(ONLY)

	try {
	try {
	String addresserrormessage = page.addresserrormessagemethod();
	String addresserrormessexcel = Excelreader.getData(0, 83, 6);
	if (addresserrormessage.equals(addresserrormessexcel)) {
	test.pass("ADDRESS(US ONLY) FUNCTION ERROR MESSAGE IS DISPLAYED");
	} else {
	test.fail("ADDRESS(US ONLY) FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "ADDRESS(US ONLY) FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	} catch (Exception e) {
	test.fail("Submit button is not working fine and enable");
	}
	}

	@Test(priority = 20)
	public void Apt_Suite() {
	Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
	test = extent.createTest("Apt_Suite");

	// LABEL OF APT/SUITE
	try {
	String aptsuitelabelhead = page.apisitelabelmethod();
	String aptsuitelabelexcel = Excelreader.getData(0, 84, 6);
	if (aptsuitelabelhead.equals(aptsuitelabelexcel)) {
	test.pass("TC:36 THE LABEL 'APT/SUITE' IS DISPLAYED ");
	} else {
	test.fail("TC:36 THE LABEL 'APT/SUITE' IS DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "THE LABEL 'APT/SUITE' IS DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// CLICK ON APT/SUITE AND ROLLED UP THE LABEL

	try {
	String aptsuitelabelhead = page.apisitelabelmethod1();
	String aptsuitelabelexcel = Excelreader.getData(0, 84, 6);
	if (aptsuitelabelhead.equals(aptsuitelabelexcel)) {
	test.pass("TC:36 THE LABEL 'APT/SUITE' IS ROLLED UP AFTER CLICK");
	} else {
	test.fail("TC:36 THE LABEL 'APT/SUITE' IS NOT ROLLED UP AFTER CLICK");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "THE LABEL 'APT/SUITE' IS NOT ROLLED UP AFTER CLICK");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// SPECIAL CHARACTER IN APT SUITE
	try {
	String apisuitespecialcharecter = Excelreader.getData(0, 85, 6);
	String suitesh = page.apisuiteenteredvalue(apisuitespecialcharecter);
	if (!suitesh.equals(apisuitespecialcharecter)) {
	test.pass("TC:36 USER SHOULD NOT SEND SPECIAL CHARACTERS IN APT/SUITE TEXTBOX");
	} else {
	test.fail("TC:36 USER SHOULD NOT SEND SPECIAL CHARACTERS IN APT/SUITE TEXTBOX");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD NOT SEND SPECIAL CHARACTERS IN APT/SUITE TEXTBOX");
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
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD  SEND NUMARICAL AND CHARACTERS IN APT/SUITE TEXTBOX");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// MORE THAN 40 CHARACTERS IN APT SUITE
	try {
	String apisuitespecialcharecter = Excelreader.getData(0, 87, 6);
	String suitesh = page.apisuiteenteredvalue(apisuitespecialcharecter);
	if (!suitesh.equals(apisuitespecialcharecter)) {
	test.pass("TC:36 USER SHOULD NOT SEND MORE THAN 40 NUMARICAL AND CHARACTERS IN APT/SUITE TEXTBOX");
	} else {
	test.fail("TC:36 USER SHOULD NOT SEND MORE THAN 40 NUMARICAL AND CHARACTERS IN APT/SUITE TEXTBOX");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD NOT SEND MORE THAN NUMARICAL AND CHARACTERS IN APT/SUITE TEXTBOX");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	}

	@Test(priority = 21)
	public void City() {
	Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
	test = extent.createTest("City");
	// label of citys
	try {
	String citylabelhead = page.citylabelmethod();
	String citylabelexcel = Excelreader.getData(0, 88, 6);
	if (citylabelhead.equals(citylabelexcel)) {
	test.pass("TC:37 THE LABEL 'CITY' IS DISPLAYED ");
	} else {
	test.fail("TC:37 THE LABEL 'CITY' IS NOT DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "THE LABEL 'CITY' IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// after click on city text and rolled up label

	try {
	String citylabelhead = page.citylabelmethod1();
	String citylabelexcel = Excelreader.getData(0, 88, 6);
	if (citylabelhead.equals(citylabelexcel)) {
	test.pass("TC:37 THE LABEL 'CITY' IS ROLLED UP AFTER CLICK ON CLITY TEXT ");
	} else {
	test.fail("TC:37 THE LABEL 'CITY' IS NOT ROLLED UP AFTER CLICK ON CLITY TEXT");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "THE LABEL 'CITY' IS NOT ROLLED UP AFTER CLICK ON CLITY TEXT");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// special characters
	try {
	String cityspecialcharcters = Excelreader.getData(0, 89, 6);
	String citySCenteredvalue = page.cityenteredvalue(cityspecialcharcters);
	if (!citySCenteredvalue.equals(cityspecialcharcters)) {
	test.pass("TC:37 USER SHOULD NOT SEND SPECIAL CHARACTERS IN CITY TEXTBOX");
	} else {
	test.fail("TC:37 USER SHOULD NOT SEND SPECIAL CHARACTERS IN CITY TEXTBOX");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD NOT SEND SPECIAL CHARACTERS IN CITY TEXTBOX");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// numerical
	try {
	String citynumaricalexcel = Excelreader.getData(0, 90, 6);
	String citynumaricalhead = page.cityenteredvalue(citynumaricalexcel);
	if (!citynumaricalhead.equals(citynumaricalexcel)) {
	test.pass("TC:37 USER SHOULD NOT SEND NUMERICAL IN CITY TEXTBOX");
	} else {
	test.fail("TC:37 USER SHOULD NOT SEND NUMERICAL IN CITY TEXTBOX");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD NOT SEND NUMERICAL IN CITY TEXTBOX");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// CHARACTERS
	try {
	String citycharactersexcel = Excelreader.getData(0, 91, 6);
	String citycharactershead = page.cityenteredvalue(citycharactersexcel);
	if (citycharactershead.equals(citycharactersexcel)) {
	test.pass("TC:37 USER SHOULD  SEND CHARACTERS IN CITY TEXTBOX");
	} else {
	test.fail("TC:37 USER SHOULD SEND CHARACTERS IN CITY TEXTBOX");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD SEND CHARACTERS IN CITY TEXTBOX");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// MORE THAN 30 CHARACTERS

	try {
	String citymorethan30excel = Excelreader.getData(0, 92, 6);
	String citymorethan30head = page.cityenteredvalue(citymorethan30excel);
	if (!citymorethan30head.equals(citymorethan30excel)) {
	test.pass("TC:37 USER SHOULD  SEND MORE THAN 30 CHARACTERS IN CITY TEXTBOX");
	} else {
	test.fail("TC:37 USER SHOULD SEND MORE THAN 30 CHARACTERS IN CITY TEXTBOX");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD SEND MORE THAN 30 CHARACTERS IN CITY TEXTBOX");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// error message of city
	try {
	String cityerrormessagehead = page.cityerromessagemethod();
	String cityerrormessageexcel = Excelreader.getData(0, 93, 6);
	if (cityerrormessagehead.equals(cityerrormessageexcel)) {
	test.pass("'ERROR MESSAGE DISPLAYED' -->" + "'" + cityerrormessagehead + "'");
	} else {
	test.fail(" CITY FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "CITY FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	}

	@Test(priority = 22)
	public void State() {
	Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
	test = extent.createTest("State");

	// label of State
	try {
	String statelabelhead = page.statelabelmethod();
	String staelabelexcel = Excelreader.getData(0, 94, 6);
	if (statelabelhead.equals(staelabelexcel)) {
	test.pass("TC:38 THE LABEL 'STATE' IS DISPLAYED ");
	} else {
	test.fail("TC:38 THE LABEL 'STATE' IS DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "THE LABEL 'STATE' IS DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// AFTER CLICK ON STATE AND LABEL IS ROLLED UP OR NOT
	try {
	String statelabelhead = page.statelabelmethod1();
	String staelabelexcel = Excelreader.getData(0, 94, 6);
	if (statelabelhead.equals(staelabelexcel)) {
	test.pass("TC:38 THE LABEL 'STATE' IS ROLLED UP AFTER CLICK ON STATE FUNCTION ");
	} else {
	test.fail("TC:38 THE LABEL 'STATE' IS ROLLED UP AFTER CLICK ON STATE FUNCTION");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "THE LABEL 'STATE' IS ROLLED UP AFTER CLICK ON STATE FUNCTION");
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
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "STEATE DROP DOWN VALUE IS NOT SELECTED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// click on submit and catch error message of state
	try {
	String stateerrormessahead = page.stateerrormessagemethod();
	String stateerrormessexcel = Excelreader.getData(0, 95, 6);
	if (stateerrormessahead.equals(stateerrormessexcel)) {
	test.pass("'ERROR MESSAGE DISPLAYED' -->" + "'" + stateerrormessahead + "'");
	} else {
	test.fail(" STATE FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "STATE FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	}

	@Test(priority = 23)
	public void Zip() {
	Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
	test = extent.createTest("Zip");

	try {
		driver.get(Basepage.readProperty("urlOR"));

		String gettitle = page.generallgetpagetitlemethod();
		String gettitleexcel = Excelreader.getData(0, 1, 6);
		if (gettitle.equals(gettitleexcel)) {
		test.pass("TC:1 RESTAURANT URL IS OPENED");
		} else {
		test.fail("TC:1 RESTAURANT URL IS NOT OPENED");
		test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
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
	// label of Zip
	try {
	String ziplabelhead = page.ziplabelmethod();
	String ziplabelexcel = Excelreader.getData(0, 97, 6);
	if (ziplabelhead.equals(ziplabelexcel)) {
	test.pass("TC:39 THE LABEL 'ZIP' IS DISPLAYED ");
	} else {
	test.fail("TC:39 THE LABEL 'ZIP' IS DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "THE LABEL 'ZIP' IS DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// AFTER CLICK ON zip AND LABEL IS ROLLED UP OR NOT
	try {
	String ziplabelhead = page.ziplabelmethod1();
	String ziplabelexcel = Excelreader.getData(0, 97, 6);
	if (ziplabelhead.equals(ziplabelexcel)) {
	test.pass("TC:39 THE LABEL 'ZIP' IS ROLLED UP AFTER CLICK ON ZIP FUNCTION");
	} else {
	test.fail("TC:39 THE LABEL 'ZIP' IS NOT ROLLED UP AFTER CLICK ON ZIP FUNCTION");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "THE LABEL 'ZIP' IS NOT ROLLED UP AFTER CLICK ON ZIP FUNCTION");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// CHARACTER
	try {
	String zipsendedvaluesexcel = Excelreader.getData(0, 98, 6);
	String zipsendedvalueshead = page.zipenteredvalue(zipsendedvaluesexcel);
	if (!zipsendedvalueshead.equals(zipsendedvaluesexcel)) {
	test.pass("TC:39 USER SHOULD NOT ENTERD CHARACTERS IN ZIP TEXTBOX");
	} else {

	test.fail("TC:39 USER SHOULD NOT ENTERD CHARACTERS IN ZIP TEXTBOX");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD NOT ENTERD CHARACTERS IN ZIP TEXTBOX");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// SPECIAL CHARACTERS
	try {
	String zipsendedvaluesexcel = Excelreader.getData(0, 99, 6);
	String zipsendedvalueshead = page.zipenteredvalue(zipsendedvaluesexcel);
	if (!zipsendedvalueshead.equals(zipsendedvaluesexcel)) {
	test.pass("TC:39 USER SHOULD NOT ENTERD SPECIAL CHARACTERS IN ZIP TEXTBOX");
	} else {

	test.fail("TC:39 USER SHOULD NOT ENTERD SPECIAL CHARACTERS IN ZIP TEXTBOX");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD NOT ENTERD SPECIAL CHARACTERS IN ZIP TEXTBOX");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// NUMERICAL

	try {
	String zipsendedvaluesexcel = Excelreader.getData(0, 100, 6);
	String zipsendedvalueshead = page.zipenteredvalue(zipsendedvaluesexcel);
	if (zipsendedvalueshead.equals(zipsendedvaluesexcel)) {
	test.pass("TC:39 USER SHOULD ENTERD NUMERICAL IN ZIP TEXTBOX");
	} else {

	test.fail("TC:39 USER SHOULD ENTERD NUMERICAL IN ZIP TEXTBOX");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD ENTERD NUMERICAL IN ZIP TEXTBOX");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// MORE THAN 5 NUMERICAL
	try {
	String zipsendedvaluesexcel = Excelreader.getData(0, 101, 6);
	String zipsendedvalueshead = page.zipenteredvalue(zipsendedvaluesexcel);
	if (!zipsendedvalueshead.equals(zipsendedvaluesexcel)) {
	test.pass("TC:39 USER SHOULD NOT ENTERD MORE THAN 5 NUMERICAL IN ZIP TEXTBOX");
	} else {

	test.fail("TC:39 USER SHOULD NOT ENTERD MORE THAN 5 NUMERICAL IN ZIP TEXTBOX");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD NOT ENTERD MORE THAN 5 NUMERICAL IN ZIP TEXTBOX");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// LESS THAN 5 NUMERICAL
	try {
	// driver.findElement(By.xpath("//*[@name='zip']")).clear();
	String zipsendedvaluesexcel = Excelreader.getData(0, 102, 6);
	String ziperrormessagehead = page.ziperrormessagemethod(zipsendedvaluesexcel);
	String ziperrormessageexcel = Excelreader.getData(0, 103, 6);
	if (ziperrormessagehead.equals(ziperrormessageexcel)) {
	test.pass("ENTER LESS THAN 5 NUMERICAL AND SUBMIT 'ERROR MESSAGE DISPLAYED' -->" + "'"
	+ ziperrormessagehead + "'");
	} else {
	test.fail(" ENTER LESS THAN 5 NUMERICAL AND SUBMIT 'ERROR MESSAGE SHOULD DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "ENTER LESS THAN 5 NUMERICAL AND SUBMIT 'ERROR MESSAGE SHOULD DISPLAYED");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// ERROR MESSAGE
	try {
	//driver.findElement(By.xpath("//*[@name='zip']")).clear();
	String ziperrormessagehead = page.ziperrormessagemethod1();
	String ziperrormessageexcel = Excelreader.getData(0, 103, 6);
	if (ziperrormessagehead.equals(ziperrormessageexcel)) {
	test.pass("'ERROR MESSAGE DISPLAYED' -->" + "'" + ziperrormessagehead + "'");
	} else {
	test.fail("ERROR MESSAGE IS NOT DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "ERROR MESSAGE IS NOT DISPLAYED");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	}

	@Test(priority = 24)
	public void Please_Indicate_Whether_You()  {
	Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
	test = extent.createTest("Please_Indicate_Whether_You");
	// PLEASE INDICATE WHETHER LABEL......
	try {
	String pleaseindicatehead = page.pleaseindicatelabelmethod();
	String pleaseindicateexcel = Excelreader.getData(0, 104, 7);
	if (pleaseindicatehead.equals(pleaseindicateexcel)) {
	test.pass("TC:40  VERIFY THE LABEL '*Please indicate whether you would like ...' IS DIPLAYED ");
	} else {
	test.fail("TC:40  VERIFY THE LABEL '*Please indicate whether you would like ...' IS NOT DIPLAYED ");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "VERIFY THE LABEL '*Please indicate whether you would like ...' IS NOT DIPLAYED ");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// YES RADIO BUTTON LABEL
	try {
	String yesradiobuttonlabelhead = page.yesradiobuttonlabemethod();
	String yesradiobuttonlabelexcel = Excelreader.getData(0, 106, 6);
	if (yesradiobuttonlabelhead.equals(yesradiobuttonlabelexcel)) {
	test.pass("TC:40  VERIFY THE LABEL 'YES' IS DIPLAYED ");
	} else {
	test.fail("TC:40  VERIFY THE LABEL 'YES' IS NOT DIPLAYED ");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "VERIFY THE LABEL 'YES' IS NOT DIPLAYED ");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// NO RADIO BUTTON LABEL
	try {
	String NOradiobuttonlabelhead = page.noradiobuttonlabemethod();
	String NOradiobuttonlabelexcel = Excelreader.getData(0, 107, 6);
	if (NOradiobuttonlabelhead.equals(NOradiobuttonlabelexcel)) {
	test.pass("TC:40  VERIFY THE LABEL 'NO' IS DIPLAYED ");
	} else {
	test.fail("TC:40  VERIFY THE LABEL 'NO' IS NOT DIPLAYED ");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "VERIFY THE LABEL 'NO' IS NOT DIPLAYED ");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// yes radio button
	try {
	String yesradiobuttonisselectedheadd = page.Yesradiobuttonbydefaultselectmethod();
	if (!yesradiobuttonisselectedheadd.equals("true")) {
	test.pass("TC:28 YES RADIO BUTTON SHOULD BE NOT CLICK BY DEFAULT");
	} else {
	test.fail("TC:28 YES RADIO BUTTON SHOULD BE NOT CLICK BY DEFAULT");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "YES RADIO BUTTON SHOULD BE NOT CLICK BY DEFAULT");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());

	}

	// no radio button
	try {
	String noradiobuttonisselectedheadd = page.Noradiobuttonbydefaultselectmethod();
	if (!noradiobuttonisselectedheadd.equals("true")) {
	test.pass("TC:28 NO RADIO BUTTON SHOULD BE NOT CLICK BY DEFAULT");
	} else {
	test.fail("TC:28 NO RADIO BUTTON SHOULD BE NOT CLICK BY DEFAULT");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "NO RADIO BUTTON SHOULD BE NOT CLICK BY DEFAULT");
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
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "YES RADIO BUTTON SHOULD BE CLICKABLE");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());

	}
	// no radio button AFTER SELECT
	try {
	String noradiobuttonisselectedheadd = page.Noradiobuttonselectmethod();
	if (noradiobuttonisselectedheadd.equals("true")) {
	test.pass("TC:28 NO RADIO BUTTON SHOULD BE CLICKABLE");
	String yesradiobuttonisselectedheadd = page.Yesradiobuttonbydefaultselectmethod();
	if (!yesradiobuttonisselectedheadd.equals("true")) {
	test.pass("TC:28 YES AND NO RADIO BUTTONS SHOULD NOT CLICK BOTH");
	} else {
	test.fail("TC:28 YES RADIO BUTTON SHOULD NOT CLICK BOTH");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "YES RADIO BUTTON SHOULD NOT CLICK BOTH");
	}
	} else {
	test.fail("TC:28 NO RADIO BUTTON SHOULD BE CLICKABLE");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "NO RADIO BUTTON SHOULD BE CLICKABLE");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());

	}
	// ERROR MESSAGE
	try {
	String pleaseerrormesshead = page.pleaseerrormessagemethod();
	String pleaseerrormessexcel = Excelreader.getData(0, 105, 6);
	if (pleaseerrormesshead.equals(pleaseerrormessexcel)) {
	test.pass("TC:40 'ERROR MESSAGE DISPLAYED' -->" + "'" + pleaseerrormesshead + "'");
	} else {
	test.fail("TC:40  VERIFY THE LABEL '*Please indicate whether you would like ...' IS NOT DIPLAYED ");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "VERIFY THE LABEL '*Please indicate whether you would like ...' IS NOT DIPLAYED ");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	}

	@Test(priority = 25)
	public void Email() {
	Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
	test = extent.createTest("Email");

	// label of mail
	try {
	String emaillabelhead = page.emaillabelmethod();
	String emaillabelexcel = Excelreader.getData(0, 108, 6);
	if (emaillabelhead.equals(emaillabelexcel)) {
	test.pass("TC:41 THE LABEL 'EMAIL' IS DISPLAYED ");
	} else {
	test.fail("TC:41 THE LABEL 'EMAIL' IS NOT DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "THE LABEL 'EMAIL' IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// AFTER CLICK ON mail AND LABEL IS ROLLED UP OR NOT
	try {
	String emaillabelhead = page.emaillabelmethod1();
	String emaillabelexcel = Excelreader.getData(0, 108, 6);
	if (emaillabelhead.equals(emaillabelexcel)) {
	test.pass("TC:41 THE LABEL 'EMAIL' IS ROLLED UP AFTER CLICK ON EMAIL FUNCTION");
	} else {
	test.fail("TC:41 THE LABEL 'EMAIL' IS NOT ROLLED UP AFTER CLICK ON EMAIL FUNCTION");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "THE LABEL 'EMAIL' IS NOT ROLLED UP AFTER CLICK ON EMAIL FUNCTION");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// WITH OUT .COM FORMAT
	try {
	String emailsendid = Excelreader.getData(0, 109, 6);
	String emailvlue = page.emailenteredvalue(emailsendid);
	if (emailvlue.equals(emailsendid)) {
	test.pass("TC:41  USER ABEL TO SEND MAIL WITH OUT FORMAT(.COM) IN MAIL TEXTBOX");
	String mailerrormessagehead = page.emailerrormessagemethod();
	String mailerrormessageexcel = Excelreader.getData(0, 112, 6);
	if (mailerrormessagehead.equals(mailerrormessageexcel)) {
	test.pass("TC:41 WITH OUT FORMAT(.COM) 'ERROR MESSAGE DISPLAYED' -->" + "'" + mailerrormessagehead
	+ "'");
	} else {
	test.fail("TC:41  WITH OUT FORMAT(.COM) MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "WITH OUT FORMAT(.COM) MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
	}
	} else {
	test.fail("TC:41 USER ABEL TO SEND MAIL WITH OUT FORMAT(.COM) IN MAIL TEXTBOX");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER ABEL TO SEND MAIL WITH OUT FORMAT(.COM) IN MAIL TEXTBOX");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// WITH OUT @GAMIL

	try {
	String emailsendid = Excelreader.getData(0, 110, 6);
	String emailvlue = page.emailenteredvalue(emailsendid);
	if (emailvlue.equals(emailsendid)) {
	test.pass("TC:41  USER ABEL TO SEND MAIL WITH OUT FORMAT(@GAMIL) IN MAIL TEXTBOX");
	String mailerrormessagehead = page.emailerrormessagemethod();
	String mailerrormessageexcel = Excelreader.getData(0, 112, 6);
	if (mailerrormessagehead.equals(mailerrormessageexcel)) {
	test.pass("TC:41 WITH OUT FORMAT(@GAMIL) 'ERROR MESSAGE DISPLAYED' -->" + "'" + mailerrormessagehead
	+ "'");
	} else {
	test.fail("TC:41  WITH OUT FORMAT(@GAMIL) MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "WITH OUR FORMAT(@GAMIL) MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
	}
	} else {
	test.fail("TC:41 USER ABEL TO SEND MAIL WITH OUT FORMAT(@GAMIL) IN MAIL TEXTBOX");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER ABEL TO SEND MAIL WITH OUT FORMAT(@GAMIL) IN MAIL TEXTBOX");
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
	String mailerrormessagehead = page.emailerrormessagemethod();
	String mailerrormessageexcel = Excelreader.getData(0, 112, 6);
	if (!mailerrormessagehead.equals(mailerrormessageexcel)) {
	test.pass("TC:41 WITH FORMAT 'ERROR MESSAGE IS NOT DISPLAYED'");
	} else {
	test.fail("TC:41  WITH FORMAT MAIL FUNCTION ERROR MESSAGE  DISPLAYED--->" + "'"
	+ mailerrormessagehead + "'");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "WITH FORMAT MAIL FUNCTION ERROR MESSAGE  DISPLAYED");
	}
	} else {
	test.fail("TC:41 USER SHOULD SEND MAIL WITH FORMAT IN MAIL TEXTBOX");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD SEND MAIL WITH FORMAT IN MAIL TEXTBOX");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// ERROR MESSAGE
	try {
	String mailerrormessagehead = page.emailerrormessagemethod1();
	String mailerrormessageexcel = Excelreader.getData(0, 112, 6);
	if (mailerrormessagehead.equals(mailerrormessageexcel)) {
	test.pass("'ERROR MESSAGE DISPLAYED' -->" + "'" + mailerrormessagehead + "'");
	} else {
	test.fail(" MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	}

	@Test(priority = 26)
	public void Confirm_Email() {
	Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
	test = extent.createTest("Confirm_Email");
	
	try {
		driver.get(Basepage.readProperty("urlOR"));

		String gettitle = page.generallgetpagetitlemethod();
		String gettitleexcel = Excelreader.getData(0, 1, 6);
		if (gettitle.equals(gettitleexcel)) {
		test.pass("TC:1 RESTAURANT URL IS OPENED");
		} else {
		test.fail("TC:1 RESTAURANT URL IS NOT OPENED");
		test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
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

	// label of confirm_email
	try {
	String conmaillabelhead = page.confirmmaillabelmethod();
	String conmaillabelexcel = Excelreader.getData(0, 113, 6);
	if (conmaillabelhead.equals(conmaillabelexcel)) {
	test.pass("TC:42 THE LABEL 'CONFIRM EMAIL' IS DISPLAYED ");
	} else {
	test.fail("TC:42 THE LABEL 'CONFIRM EMAIL' IS NOT DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "THE LABEL 'CONFIRM EMAIL' IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// AFTER CLICK ON confirm_email AND LABEL IS ROLLED UP OR NOT
	try {
	String conmaillabelhead = page.confirmmaillabelmethod1();
	String conmaillabelexcel = Excelreader.getData(0, 113, 6);
	if (conmaillabelhead.equals(conmaillabelexcel)) {
	test.pass("TC:42 THE LABEL 'CONFIRM EMAIL' IS ROLLED UP AFTER CLICK ON CONFIRM EMAIL FUNCTION");
	} else {
	test.fail("TC:42 THE LABEL 'CONFIRM EMAIL' IS NOT ROLLED UP AFTER CLICK ON CONFIRM EMAIL FUNCTION");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "THE LABEL 'CONFIRM EMAIL' IS NOT ROLLED UP AFTER CLICK ON CONFIRM EMAIL FUNCTION");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// send DIFFERENT IDS IN mail AND CONFIRM
	try {
	String emailsendid = Excelreader.getData(0, 111, 6);
	page.mailsendmethod(emailsendid);
	String confirmmailsend = Excelreader.getData(0, 114, 6);
	String conmailsendvalue = page.confirmmailenteredvalue(confirmmailsend);
	if (conmailsendvalue.equals(confirmmailsend)) {
	test.pass("TC:42  USER SHOULD SEND MAIL IN CONFIRM MAIL TEXTBOX");
	String confirmmailerrormesshead = page.confirmmailerrormessmethod();
	String confirmmailerrormessexcel = Excelreader.getData(0, 116, 6);
	if (confirmmailerrormesshead.equals(confirmmailerrormessexcel)) {
	test.pass("USER SHOULD SEND SAME IDS IN MAIL AND CONFIRM MAIL 'ERROR MESSAGE DISPLAYED' -->" + "'"
	+ confirmmailerrormesshead + "'");
	} else {
	test.fail(" USER SHOULD SEND SAME IDS IN MAIL AND CONFIRM MAIL");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD SEND SAME IDS IN MAIL AND CONFIRM MAIL");
	}

	} else {
	test.fail("TC:42 USER SHOULD SEND MAIL IN CONFIRM MAIL TEXTBOX");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD SEND MAIL IN CONFIRM MAIL TEXTBOX");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// ERROR MESSAGE WITH BLANK
	try {
	String confirmmailerrormesshead = page.confirmmailerrormessmethod1();
	String confirmmailerrormessexcel = Excelreader.getData(0, 116, 6);
	if (confirmmailerrormesshead.equals(confirmmailerrormessexcel)) {
	test.pass("'ERROR MESSAGE DISPLAYED' -->" + "'" + confirmmailerrormesshead + "'");
	} else {
	test.fail("CONFIRM MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "CONFIRM MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	}

	@Test(priority = 27)
	public void Phone_Number() {
	Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
	test = extent.createTest("Phone_Number");

	// phone number label
	try {
	String phonenumberlabelhead = page.phonenumberlabelmethod();
	String phonenumberlabelexcel = Excelreader.getData(0, 117, 6);
	if (phonenumberlabelhead.equals(phonenumberlabelexcel)) {
	test.pass("TC:43 THE LABEL 'PHONE NUMBER' IS DISPLAYED ");
	} else {
	test.fail("TC:43 THE LABEL 'PHONE NUMBER' IS NOT DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "THE LABEL 'PHONE NUMBER' IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// AFTER CLICK ON phone number AND LABEL IS ROLLED UP OR NOT
	try {
	String phonenumberlabelhead = page.phonenumberlabelmethod1();
	String phonenumberlabelexcel = Excelreader.getData(0, 117, 6);
	if (phonenumberlabelhead.equals(phonenumberlabelexcel)) {
	test.pass("TC:43 THE LABEL 'PHONE NUMBER' IS ROLLED UP AFTER CLICK ON PHONE NUMBER FUNCTION");
	} else {
	test.fail("TC:43 THE LABEL 'PHONE NUMBER' IS NOT ROLLED UP AFTER CLICK ON PHONE NUMBER FUNCTION");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "THE LABEL 'PHONE NUMBER' IS NOT ROLLED UP AFTER CLICK ON PHONE NUMBER FUNCTION");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// characters
	try {
	String phonecharacterhead = Excelreader.getData(0, 118, 6);
	String phonenumCenteredval = page.phonenumberenteredvalue(phonecharacterhead);
	if (!phonenumCenteredval.equals(phonecharacterhead)) {
	test.pass("TC:43 USER SHOULD NOT SEND CHARACTER IN PHONE NUMBER TEXTBOX ");
	} else {
	test.fail("TC:43 USER SHOULD NOT SEND CHARACTER IN PHONE NUMBER TEXTBOX ");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD NOT SEND CHARACTER IN PHONE NUMBER TEXTBOX ");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// SPECIAL CHARECTER
	try {
	String phonecharacterhead = Excelreader.getData(0, 119, 6);
	String phonenumCenteredval = page.phonenumberenteredvalue(phonecharacterhead);
	if (!phonenumCenteredval.equals(phonecharacterhead)) {
	test.pass("TC:43 USER SHOULD NOT SEND SPECIAL CHARACTER IN PHONE NUMBER TEXTBOX ");
	} else {
	test.fail("TC:43 USER SHOULD NOT SEND SPECIAL CHARACTER IN PHONE NUMBER TEXTBOX ");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD NOT SEND SPECIAL CHARACTER IN PHONE NUMBER TEXTBOX ");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	// more than 10 numerical
	try {
	String phonecharacterhead = Excelreader.getData(0, 121, 6);
	String phonenumCenteredval = page.phonenumberenteredvalue(phonecharacterhead);
	if (!phonenumCenteredval.equals(phonecharacterhead)) {
	test.pass("TC:43 USER SHOULD NOT SEND MORE THAN 10 NUMERICAL IN PHONE NUMBER TEXTBOX ");
	} else {
	test.fail("TC:43 USER SHOULD NOT SEND MORE THAN 10 NUMERICAL IN PHONE NUMBER TEXTBOX ");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD NOT SEND MORE THAN 10 IN PHONE NUMBER TEXTBOX ");
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
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "USER SHOULD SEND 10 NUMERICAL IN PHONE NUMBER TEXTBOX ");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// LESS THAN 10 NUMERICAL
	try {
	String phonecharacterhead = Excelreader.getData(0, 120, 6);
	String phonenumbererrormessagehead = page.phonenumbererrormessagemethod(phonecharacterhead);
	String phonenumbererrormessageexcel = Excelreader.getData(0, 123, 6);
	if (phonenumbererrormessagehead.equals(phonenumbererrormessageexcel)) {
	test.pass("AFTER LESS THAN 10 NUMERICAL  'ERROR MESSAGE DISPLAYED' -->" + "'"
	+ phonenumbererrormessagehead + "'");
	} else {
	test.fail("PHONE NUMBER FUNCTION ERROR MESSAGE IS NOT DISPLAYED AFTER LESS THAN 10 NUMERICAL ");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "PHONE NUMBER FUNCTION ERROR MESSAGE IS NOT DISPLAYED AFTER LESS THAN 10 NUMERICAL");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	/*// ERROR MESSAGE
	try {
	String phonenumbererrormessagehead = page.phonenumbererrormessagemethod1();
	String phonenumbererrormessageexcel = Excelreader.getData(0, 123, 6);
	if (phonenumbererrormessagehead.equals(phonenumbererrormessageexcel)) {
	test.pass("'ERROR MESSAGE DISPLAYED' -->" + "'" + phonenumbererrormessagehead + "'");
	} else {
	test.fail("PHONE NUMBER FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "PHONE NUMBER FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}*/
	}

	@Test(priority = 28)
	public void Global_Error_Message() {
	Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
	test = extent.createTest(" Global_Error_Message");
	
	// 18 global error message
	try {
	String totalerrohead = page.totalerromessagemethod();
	String totalerroexcel = Excelreader.getData(0, 127, 6);
	if (totalerrohead.equals(totalerroexcel)) {
	test.pass("'18-ERROR MESSAGE DISPLAYED' -->" + "'" + totalerrohead + "'");
	} else {
	test.fail("TC: 18 GLOBAL ERROR MESSAGE IS NOT DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "18 GLOBAL ERROR MESSAGE IS NOT DISPLAYED");
	}
	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	} 

	@Test(priority = 29)
	public void By_Selecting_Submit() {
	Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
	test = extent.createTest("By_Selecting_Submit");
	// BY SELECTING SUBMIT... LABEL
	try {
	String byselectsubmithead = page.byselectingsubmitmethod();
	String buselectsubmitexcel = Excelreader.getData(0, 124, 6);
	if (byselectsubmithead.equals(buselectsubmitexcel)) {
	test.pass("TC:45 VERIF LABEL 'MY SELECTING SUBMIT....' IS DISPLAYED");
	} else {
	test.fail("TC:45 VERIF LABEL 'MY SELECTING SUBMIT....' IS NOT DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "VERIF LABEL 'MY SELECTING SUBMIT....' IS NOT DISPLAYED");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// WE MAY CONTACT LABEL
	try {
	String wemaycontacthead = page.wemaycontactlabelmethod();
	String wemaycontactexcel = Excelreader.getData(0, 125, 6);
	if (wemaycontacthead.equals(wemaycontactexcel)) {
	test.pass("TC:46 VERIFY LABEL 'WE MAY CONTACT ...' IS DISPLAYED");
	} else {
	test.fail("TC:46 VERIFY LABEL 'WE MAY CONTACT....' IS NOT DISPLAYED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
	+ "VERIFY LABEL 'WE MAY CONTACT....' IS NOT DISPLAYED");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}

	// privacypolicy
	try {
	page.privacypolicyclickmethod();
	page.windowhandles();
	String gettitle = page.generallgetpagetitlemethod1();
	String gettitleexcel = Excelreader.getData(0, 126, 6);
	if (gettitle.equals(gettitleexcel)) {
	test.pass("TC: PRIVACY POLICY LINK IS WORKING FINE");
	} else {
	test.fail("TC: PRIVACY POLICY LINK IS NOT WORKING FINE");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_feedback"))
	+ "PRIVACY POLICY LINK IS WORKING FINE");
	}

	} catch (Exception e) {
	test.fail("Error:" + e.getMessage());
	}
	}

	@Test(priority = 30)
	public void Open_Close_webstatus () {
	Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
	test = extent.createTest("Open_Close_webstatus");

	try {
	driver.get(Basepage.readProperty("urlOR"));
	String gettitle = page.generallgetpagetitlemethod();
	String gettitleexcel = Excelreader.getData(0, 1, 6);
	if (gettitle.equals(gettitleexcel)) {
	test.pass("TC:1 RESTAURANT URL IS OPENED");
	} else {
	test.fail("TC:1 RESTAURANT URL IS NOT OPENED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
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
							// web status open and close
							try {
								String openwebstatusexcel = Excelreader.getData(0, 162, 6);
								String closewebstatusexcel = Excelreader.getData(0, 163, 6);
								String openorclosehead = page.webstatuslabelmethod();
								// OPEN WEB STATUS
								if (openwebstatusexcel.equalsIgnoreCase(openorclosehead)) {
									test.pass("TC:46 OPEN OF WEB STATUS IS DISPLAYED");
									// CLOSE WEB STATUS
								} else if (closewebstatusexcel.equalsIgnoreCase(openorclosehead)) {
									test.pass("TC:46.2 CLOSE OF WEB STATUS IS DISPLAYED");
									// NULL WEB STATUS
								} else if (openorclosehead.equalsIgnoreCase("")) {
									test.fail("TC:46.3 NULL OF WEB STATUS IS DISPLAYED");
								}
							} catch (Exception e) {
								test.fail("TC:46.4 WEB STATUS IS NOT DISPLAYED");
								test.fail("Error:" + e.getMessage());
							}
						} else {
							test.fail(
									"TC:12 SEARCH BUTTON IS NOT WORKING AND RESTAURANT LOCATION ALSO IS NOT DISPLAYED");
							test.fail(test.addScreenCaptureFromPath(
									Extentreport.getScreenshot(driver, "Resraurant_feedback"))
									+ "SEARCH BUTTON IS NOT WORKING  AND RESTAURANT LOCATION ALSO IS NOT DISPLAYED");
						}
					} catch (Exception e) {
						test.fail("Error:" + e.getMessage());
					}

				} else {
					test.fail("TC:11 USER NOT ABLE TO SEND ZIP CODE");
					test.fail(
							test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
									+ "USER NOT ABLE TO SEND ZIP CODE");
				}
			} catch (Exception e) {
				test.fail("Error:" + e.getMessage());
			}
		} else if (zipcityhead.equalsIgnoreCase(zipcityexcel)) {

			test.fail("TC:8 RESTAURANT LOCATER BUTTON IS NOT WORKING");
			test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
					+ "RESTAURANT LOCATER BUTTON IS NOT WORKING");
		}
	} catch (Exception e) {
		test.fail("Error:" + e.getMessage());
	}
}
	/*@Test(priority = 31)
	public void Positive_scenario() throws IOException {
	Restaurant_feedback_page page = new Restaurant_feedback_page(driver);
	test = extent.createTest(" Positive_scenario");

	try {
	driver.get(Basepage.readProperty("urlOR"));

	String gettitle = page.generallgetpagetitlemethod();
	String gettitleexcel = Excelreader.getData(0, 1, 6);
	if (gettitle.equals(gettitleexcel)) {
	test.pass("TC:1 URL IS OPENED");
	} else {
	test.fail("TC:1 URL IS NOT OPENED");
	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
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

}*/



	}


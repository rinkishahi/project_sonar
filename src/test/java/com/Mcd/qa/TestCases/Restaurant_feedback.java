package com.Mcd.qa.TestCases;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.McD.qa.Base.BaseTest;
import com.McD.qa.Extentreport.Extentreport;
import com.McD.qa.Pages.Basepage;
import com.McD.qa.Pages.Resturant_Feedback_page1;
import com.McD.qa.Utility.TestUtil;


public class Restaurant_feedback extends BaseTest {

	String excelptha = System.getProperty("user.dir");
	TestUtil Excelreader = new TestUtil(excelptha + "/src/main/java/com/McD/qa/TestData/restaurant_feedback.xls");

	@Test(priority = 1)
	public void Open_URLR() {
		Resturant_Feedback_page1 page = new Resturant_Feedback_page1(driver);
		test = extent.createTest("Open_URLR");

		try {
			driver.get(Basepage.readProperty("urlR"));
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
	}

	@Test(priority = 2)
	public void Restaurant_headings() {
		Resturant_Feedback_page1 page = new Resturant_Feedback_page1(driver);
		test = extent.createTest("Restaurant_headings");
		
		try {
			driver.get(Basepage.readProperty("urlR"));

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
			if (restarentheadtext.equalsIgnoreCase(restarentexcel)) {
				test.pass("TC:2 THE TITLE OF 'RESTAURANT FEEDBACK'  IS DISPLAYED ");
			} else {
				test.fail("TC:2 THE TITLE OF 'RESTAURANT FEEDBACK'  IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_feedback"))
						+ "THE TITLE OF 'RESTAURANT FEEDBACK'  IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// Have some restaurant label
		try {
			String havesomeheadtext = page.havesomerestarentmethod();
			String havesomeexcel = Excelreader.getData(0, 3, 6);
			if (havesomeheadtext.equalsIgnoreCase(havesomeexcel)) {
				test.pass("TC:3 THE HAVE SOME RESTAUTANT ..... LABEL IS DISPLAYED ");
			} else {
				test.fail("TC:3 THE HAVE SOME RESTAUTANT ..... LABEL IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_feedback"))
						+ "THE HAVE SOME RESTAUTANT ..... LABEL IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// INDICATE A REQUIRED FIELDS LABEL
		try {
			String indecatehead = page.Indicatesfieldmethod();
			String indecateexcel = Excelreader.getData(0, 4, 6);
			if (indecatehead.equalsIgnoreCase(indecateexcel)) {
				test.pass("TC:4  LABEL 'INDICATE A REQUIRED FIELDS' IS DIPLAYED");
			} else {
				test.fail("TC:4 LABEL 'INDICATE A REQUIRED FIELDS' IS NOT DIPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_feedback"))
						+ "LABEL 'INDICATE A REQUIRED FIELDS' IS NOT DIPLAYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// PLEASE SELECT THE RESTAURANT LABEL
		try {
			String Pleaseselethead = page.pleaseselectmethod();
			String pleaseselectexcel = Excelreader.getData(0, 5, 6);
			if (Pleaseselethead.equalsIgnoreCase(pleaseselectexcel)) {
				test.pass("TC:5 FEEDBACK MAIN TITLE OF 'PLEASE SELECT THE RESTAURANT' IS DIPLAYED");
			} else {
				test.fail("TC:5 FEEDBACK MAIN TITLE OF 'PLEASE SELECT THE RESTAURANT' IS NOT DIPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_feedback"))
						+ "FEEDBACK MAIN TITLE OF 'PLEASE SELECT THE RESTAURANT' IS NOT DIPLAYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// search AND SELECT A restaurant label
		try {
			String searchforhead = page.searchformethod();
			String searchforexcel = Excelreader.getData(0, 6, 6);
			if (searchforhead.equalsIgnoreCase(searchforexcel)) {
				test.pass("TC:6  FEEDBACK SUB TITLE OF 'SEARCH FOR RESTAURANT' IS DIPLAYED");
			} else {
				test.fail("TC:6  FEEDBACK SUB TITLE OF 'SEARCH FOR RESTAURANT' IS NOT DIPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_feedback"))
						+ "FEEDBACK SUB TITLE OF 'SEARCH FOR RESTAURANT' IS NOT DIPLAYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 3)
	public void Restaurant_Locator() {
		Resturant_Feedback_page1 page = new Resturant_Feedback_page1(driver);
		test = extent.createTest("Restaurant_Locator");

		
		try {
			driver.get(Basepage.readProperty("urlR"));

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
		// restaurant locater label
		try {
			String restauranthead = page.restaurantlocatermethod();
			String restaurantexcel = Excelreader.getData(0, 7, 6);
			if (restauranthead.equalsIgnoreCase(restaurantexcel)) {
				test.pass("TC:7  SEARCH RESTAURANT LOCATER BUTTON LABEL OF  IS DIPLAYED");
			} else {
				test.fail("TC:7 SEARCH RESTAURANT LOCATER BUTTON LABEL OF  IS NOT DIPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "SEARCH RESTAURANT LOCATER BUTTON LABEL OF  IS NOT DIPLAYED");
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
					String zipcitystatelabelexcel = Excelreader.getData(0, 8, 6);
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

	@Test(priority = 4)
	public void search_Button_Select_Restaurant() {
		Resturant_Feedback_page1 page = new Resturant_Feedback_page1(driver);
		test = extent.createTest("search_Button_Select_Restaurant");

		try {
			driver.get(Basepage.readProperty("urlR"));
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

								// select restaurant button label
								try {
									String restaurantaddlabelhead = page.restaurantbuttonlabelmethod();
									String restaurantaddlabelexcel = Excelreader.getData(0, 10, 6);
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
									String restaurantbuttonclickexcel = Excelreader.getData(0, 11, 6);
									if (restaurantbuttonclickhead.equalsIgnoreCase("")) {
										test.pass("TC:14 THE 'SELECT RESTAURANT' BUTTON IS WORKING");
										// SELECTED RESTAURANT label ,
										try {
											String Pleaseselethead = page.pleaseselectmethod();
											String pleaseselectexcel = Excelreader.getData(0, 12, 6);
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

										// selected restaurant address
										try {
											String selectedrestaurantaddresshead = page.selectedrestaurantaddressmethod();
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
										}
										// change restaurant
										try {
											String restauranthead = page.changerestaurantmethod();
											String restaurantexcel = Excelreader.getData(0, 13, 6);
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

										// search AND SELECT A restaurant label
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
										}
										// select 'Change Restaurant' to select a different restaurant location.
										try {
											String zipcityhead1 = page.zipcitychangedmethod();
											String zipcityexcel1 = Excelreader.getData(0, 13, 6);
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

	/*@Test(priority = 5)
	public void List_view() {
		Resturant_Feedback_page1 page = new Resturant_Feedback_page1(driver);
		test = extent.createTest("List_view");

		try {
			driver.get(Basepage.readProperty("urlR"));
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
								// list view label
								String listviewlabehead = page.listviewlabelmethod();
								String listviewlabeexcel = Excelreader.getData(0, 14, 6);
								if (listviewlabehead.equalsIgnoreCase(listviewlabeexcel)) {
									test.pass("TC:19 LABEL OF 'LIST VIEW' IS DISPLAYED");
								} else {
									test.fail("TC:19 LABEL OF 'LIST VIEW' IS NOT DISPLAYED");
									test.fail(test.addScreenCaptureFromPath(
											Extentreport.getScreenshot(driver, "Resraurant_feedback"))
											+ "LABEL OF 'LIST VIEW' IS NOT DISPLAYED");
								}
								// CLICK ON LIST VIEW
								String loadmorelabehead = page.loadmorelabelmethod();
								String loadmorelabeexcel = Excelreader.getData(0, 15, 6);
								if (loadmorelabehead.equalsIgnoreCase(loadmorelabeexcel)) {
									test.pass("TC:20 LIST VIEW BUTTON IS CLICKABLE");
									// click on load more button
									String loademorebuttonworkinghead = page.lodemorebuttonworkingmethod();
									String loademorebuttonworkingexcel = Excelreader.getData(0, 16, 6);
									if (loademorebuttonworkinghead.equalsIgnoreCase(loademorebuttonworkingexcel)) {
										test.pass("TC:21 LODE MORE BUTTON IS CLICKABLE");
										// CLICK ON SELECT RESTAURANT IN LIST VIEW
										String restaurantaddlabelhead = page.restaurantaddrlabelmethod1();
										String restaurantaddlabelexcel = Excelreader.getData(0, 11, 6);
										if (restaurantaddlabelhead.equalsIgnoreCase("")) {
											test.pass("TC:22 SELECT RESTAURANT BUTTON IS WORKING ON LIST VIEW");

											// SELECTED RESTAURANT label ,
											try {
												String Pleaseselethead = page.pleaseselectmethod();
												String pleaseselectexcel = Excelreader.getData(0, 12, 6);
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

											// selected restaurant address
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
											}
											// change restaurant
											try {
												String restauranthead = page.changerestaurantmethod();
												String restaurantexcel = Excelreader.getData(0, 13, 6);
												if (restauranthead.equalsIgnoreCase(restaurantexcel)) {
													test.pass(
															"TC:17  ONCE A RESTAURANT IS SELECTED, THE BUTTON WILL DYNAMICALLY CHANGE LIKE 'CHANGE RESTAURANT'");
												} else {
													test.fail(
															"TC:17  ONCE A RESTAURANT IS SELECTED, THE BUTTON WILL DYNAMICALLY CHANGE LIKE 'CHANGE RESTAURANT'");
												}

											} catch (Exception e) {
												test.fail("Error:" + e.getMessage());
											}

											// search AND SELECT A restaurant label
											try {
												String searchforhead = page.searchformethod();
												if (searchforhead.equalsIgnoreCase("")) {
													test.pass(
															"TC:18 ONCE A RESTAURANT IS SELECTED,  SUB TITLE OF 'SEARCH FOR RESTAURANT' SHOULD NOT DIPLAYED");
												} else {
													test.fail(
															"TC:18  ONCE A RESTAURANT IS SELECTED,  SUB TITLE OF 'SEARCH FOR RESTAURANT' SHOULD NOT DIPLAYED");
												}

											} catch (Exception e) {
												test.fail("Error:" + e.getMessage());
											}
										} else {
											test.fail("TC:22 SELECT RESTAURANT BUTTON IS NOT WORKING ON LIST VIEW");
											test.fail(test.addScreenCaptureFromPath(
													Extentreport.getScreenshot(driver, "Resraurant_feedback"))
													+ "SELECT RESTAURANT BUTTON IS NOT clickable");
										}
									} else {
										test.fail("TC:21 LODE MORE BUTTON IS NOT CLICKABLE");
										test.fail(test.addScreenCaptureFromPath(
												Extentreport.getScreenshot(driver, "Resraurant_feedback"))
												+ "LODE MORE BUTTON IS NOT CLICKABLE");
									}
								} else {
									test.fail("TC:20 LIST VIEW BUTTON IS NOT CLICKABLE");
									test.fail(test.addScreenCaptureFromPath(
											Extentreport.getScreenshot(driver, "Resraurant_feedback"))
											+ "LIST VIEW BUTTON IS NOT CLICKABLE");
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
	}*/

	@Test(priority = 6)
	public void Visit_Date() {
		Resturant_Feedback_page1 page = new Resturant_Feedback_page1(driver);
		test = extent.createTest("Visit_Date");

		try {
			driver.get(Basepage.readProperty("urlR"));

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

		// TELL US ABOUT YOUR VISIT

		try {
			String tellusaboutyourvisitlabelhead = page.tellusaboutyourvisitlabelmethod();
			String tellusaboutyourvisitlabelexcel = Excelreader.getData(0, 17, 6);
			if (tellusaboutyourvisitlabelhead.equalsIgnoreCase(tellusaboutyourvisitlabelexcel)) {
				test.pass("TC:23 THE HEADING OF 'TELL US ABOUT YOUR VISIT' IS DISPLAYED BELOW 'RESTAURANT LOCATOR'");
			} else {
				test.fail(
						"TC:23 THE HEADING OF 'TELL US ABOUT YOUR VISIT' IS NOT DISPLAYED BELOW 'RESTAURANT LOCATOR'");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "THE HEADING OF 'TELL US ABOUT YOUR VISIT' IS NOT DISPLAYED BELOW 'RESTAURANT LOCATOR'");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// visit date label 
		try {
			String visitdatelabelhead = page.visitdatelabelmethod();
			String visitdatelabelexcel = Excelreader.getData(0, 18, 6);
			if (visitdatelabelhead.equalsIgnoreCase(visitdatelabelexcel)) {
				test.pass("TC:24 THE LABEL OF 'VISIT DATE' IS DISPLAYED");
			} else {
				test.fail("TC:24 THE LABEL OF 'VISIT DATE' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "THE LABEL OF 'VISIT DATE' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// VISIT DATE ROLL UP
		try {
			String visitdatelabelhead = page.visitdatelabelmethod1();
			String visitdatelabelexcel = Excelreader.getData(0, 18, 6);
			if (visitdatelabelhead.equalsIgnoreCase(visitdatelabelexcel)) {
				test.pass("TC:24.1 THE LABEL OF 'VISIT DATE' IS ROLLE UP ");
			} else {
				test.fail("TC:24.1 THE LABEL OF 'VISIT DATE' IS NOT ROLLE UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "THE LABEL OF 'VISIT DATE' IS NOT ROLLE UP");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// VISIT DATE ENTER values NUMERICAL
				try {
					String visitdatelabelexcel = Excelreader.getData(0, 19, 7);
					String visitdatelabelhead = page.visitdatesendmethod(visitdatelabelexcel);
					if (visitdatelabelhead.equalsIgnoreCase(visitdatelabelexcel)) {
						test.pass("TC:24.2 USERS  ABLE TO ENTER NUMERICALS AND DATE");
						// visit date error msg
						String visitdateerrormsghead = page.visitdateerrormsgmethod();
						String visitdateerrormsgexcel = Excelreader.getData(0, 88, 6);
						if (visitdateerrormsghead.equalsIgnoreCase("")) {
							test.pass("TC:24.5 AFTER VALID ENTERED DATE, VISIT DATE ERROR MESSAGE SHOULD NOT DISPLAYED " + "'" + visitdateerrormsghead + "'");
						} else {
							test.fail("TC:24.5 AFTER VALID ENTERED DATE, VISIT DATE ERROR MESSAGE SHOULD NOT DISPLAYED");
							test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
									+ "VISIT DATE ERROR MESSAGE SHOULD NOT DISPLAYED");
						}
					} else {
						test.fail("TC:24.2 USERS NOT ABLE TO ENTER NUMERICALS AND DATE");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
								+ "USERS NOT ABLE TO ENTER NUMERICALS");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());

				}
		// VISIT DATE ENTER values NUMERICAL
		try {
			String visitdatelabelexcel = Excelreader.getData(0, 19, 6);
			String visitdatelabelhead = page.visitdatesendmethod(visitdatelabelexcel);
			if (visitdatelabelhead.equalsIgnoreCase(visitdatelabelexcel)) {
				test.pass("TC:24.2 USERS  ABLE TO ENTER NUMERICALS AND DATE");
				// visit date error msg
					String visitdateerrormsghead = page.visitdateerrormsgmethod();
					String visitdateerrormsgexcel = Excelreader.getData(0, 88, 6);
					if (visitdateerrormsghead.equalsIgnoreCase(visitdateerrormsgexcel)) {
						test.pass("TC:24.5 AFTER INVALID ENTERED DATE, VISIT DATE ERROR MESSAGE IS DISPLAYED " + "'" + visitdateerrormsghead + "'");
					} else {
						test.fail("TC:24.5 AFTER INVALID ENTERED DATE, VISIT DATE ERROR MESSAGE IS NOT DISPLAYED");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
								+ "VISIT DATE ERROR MESSAGE IS NOT DISPLAYED");
					}
			} else {
				test.fail("TC:24.2 USERS NOT ABLE TO ENTER NUMERICALS AND DATE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USERS NOT ABLE TO ENTER NUMERICALS");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}

		// VISIT DATE ENTER values
		try {
			String visitdatelabelexcel = Excelreader.getData(0, 20, 6);
			String visitdatelabelhead = page.visitdatesendmethod(visitdatelabelexcel);
			if (visitdatelabelhead.equalsIgnoreCase("")) {
				test.pass("TC:24.3 USERS SHOULD NOT  ENTER SPECIAL CHARACTERS AND CHARACTERS");
			} else {
				test.fail("TC:24.3 USERS SHOULD NOT  ENTER SPECIAL CHARACTERS AND CHARACTERS");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USERS SHOULD NOT ENTER SPECIAL CHARACTERS AND CHARACTERS");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// VISIT DATE ENTER MORE THAN 8 CHARACTERS
		try {
			String visitdatelabelexcel = Excelreader.getData(0, 21, 6);
			String visitdatelabelhead = page.visitdatesendmethod(visitdatelabelexcel);
			if (!visitdatelabelhead.equalsIgnoreCase(visitdatelabelexcel)) {
				test.pass("TC:24.4 USERS SHOULD NOT ENTER MORE THAN 8 NUMERICALS");
			} else {
				test.fail("TC:24.4 USERS SHOULD NOT ENTER MORE THAN 8 NUMERICALS");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USERS SHOULD NOT ENTER MORE THAN 8 NUMERICALS");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
	}

	@Test(priority = 7)
	public void Visit_Time() {
		Resturant_Feedback_page1 page = new Resturant_Feedback_page1(driver);
		test = extent.createTest("Visit_Time");

		try {
			driver.get(Basepage.readProperty("urlR"));

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

		// visit time label
		try {
			String visittimelabelhead = page.visittimelabelmethod();
			String visittimelabelexcel = Excelreader.getData(0, 22, 6);
			if (visittimelabelhead.equalsIgnoreCase(visittimelabelexcel)) {
				test.pass("TC:25 THE LABEL OF 'VISIT TIME' IS DISPLAYED");
			} else {
				test.fail("TC:25 THE LABEL OF 'VISIT TIME' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "THE LABEL OF 'VISIT TIME' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// VISIT time ROLL UP
		try {
			String visittimelabelhead = page.visittimelabelmethod1();
			String visittimelabelexcel = Excelreader.getData(0, 22, 6);
			if (visittimelabelhead.equalsIgnoreCase(visittimelabelexcel)) {
				test.pass("TC:25.2 THE LABEL OF 'VISIT TIME' IS ROLLED UP");
			} else {
				test.fail("TC:25.2 THE LABEL OF 'VISIT TIME' IS NOT ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "THE LABEL OF 'VISIT TIME' IS NOT ROLLED UP");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// VISIT time ENTER CHARACTERS AND NUMERICALS
				try {
					String visittimelabelexcel = Excelreader.getData(0, 23, 6);
					String visittimelabelhead = page.visittimesendmethod(visittimelabelexcel);
					if (visittimelabelhead.equalsIgnoreCase(visittimelabelexcel)) {
						test.pass("TC:25.3 USERS ABLE TO  ENTER CHARACTERS AND NUMERICALS");
						/// visit time error msg
							String visittimeerrormsghead = page.visittimeerrormsgmethod();
							String visittimeerrormsgexcel = Excelreader.getData(0, 89, 7);
							if (!visittimeerrormsghead.equalsIgnoreCase("")) {
								test.pass("TC:25.6 AFTER ENTER VALID TIME, VISIT TIME ERROR MESSAGE SHOULD NOT DISPLAYED " + "'" + visittimeerrormsghead + "'");
							} else {
								test.fail("TC:25.6 AFTER ENTER VALID TIME, VISIT TIME ERROR MESSAGE SHOULD NOT DISPLAYED");
								test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
										+ "AFTER ENTER VALID TIME, VISIT TIME ERROR MESSAGE SHOULD NOT DISPLAYED");
							}
					} else {
						test.fail("TC:24.3 USERS NOT ABLE TO  ENTER CHARACTERS AND NUMERICALS");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
								+ "USERS NOT ABLE TO  ENTER CHARACTERS AND NUMERICALS");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());

				}

		// VISIT time ENTER CHARACTERS AND NUMERICALS
		try {
			String visittimelabelexcel = Excelreader.getData(0, 23, 6);
			String visittimelabelhead = page.visittimesendmethod(visittimelabelexcel);
			if (visittimelabelhead.equalsIgnoreCase(visittimelabelexcel)) {
				test.pass("TC:25.3 USERS ABLE TO  ENTER CHARACTERS AND NUMERICALS");
				String visittimeerrormsghead = page.visittimeerrormsgmethod();
				String visittimeerrormsgexcel = Excelreader.getData(0, 89, 7);
				if (visittimeerrormsghead.equalsIgnoreCase(visittimeerrormsgexcel)) {
					test.pass("TC:25.6 AFTER ENTER INVALID TIME, VISIT TIME ERROR MESSAGE SHOULD  DISPLAYED " + "'" + visittimeerrormsghead + "'");
				} else {
					test.fail("TC:25.6 AFTER ENTER INVALID TIME, VISIT TIME ERROR MESSAGE SHOULD  DISPLAYED");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
							+ "AFTER ENTER INVALID TIME, VISIT TIME ERROR MESSAGE SHOULD  DISPLAYED");
				}
			} else {
				test.fail("TC:24.3 USERS NOT ABLE TO  ENTER CHARACTERS AND NUMERICALS");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USERS NOT ABLE TO  ENTER CHARACTERS AND NUMERICALS");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// VISIT time ENTER SPECIAL CHARACTERS
		try {
			String visittimelabelexcel = Excelreader.getData(0, 24, 6);
			String visittimelabelhead = page.visittimesendmethod(visittimelabelexcel);
			if (visittimelabelhead.equalsIgnoreCase("")) {
				test.pass("TC:25.4 USERS SHOULD NOT  ENTER SPECIAL CHARACTERS");
			} else {
				test.fail("TC:24.4 USERS SHOULD NOT  ENTER SPECIAL CHARACTERS");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USERS SHOULD NOT  ENTER SPECIAL CHARACTERS");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// visit time more than 8 characters
		try {
			String visittimelabelexcel = Excelreader.getData(0, 25, 6);
			String visittimelabelhead = page.visittimesendmethod(visittimelabelexcel);
			if (!visittimelabelhead.equalsIgnoreCase(visittimelabelexcel)) {
				test.pass("TC:25.5 USERS SHOULD NOT  ENTER MORE THAN 8 CHARACTERS");
			} else {
				test.fail("TC:25.5 USERS SHOULD NOT  ENTER MORE THAN 8 CHARACTERS");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USERS SHOULD NOT  ENTER MORE THAN 8 CHARACTERS");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		
		// visit AM/PM label
				try {
					String visitampmlabelhead = page.visitampmlabelmethod();
					String visitampmlabelexcel = Excelreader.getData(0, 22, 7);
					if (visitampmlabelhead.equalsIgnoreCase(visitampmlabelexcel)) {
						test.pass("TC:25 THE LABEL OF 'VISIT AM/PM' IS DISPLAYED");
					} else {
						test.fail("TC:25 THE LABEL OF 'VISIT AM/PM' IS NOT DISPLAYED");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
								+ "THE LABEL OF 'VISIT TIME' IS NOT DISPLAYED");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());

				}
				// VISIT AM/PM ROLL UP
				try {
					String visitampmlabelhead = page.visitampmlabelmethod1();
					String visitampmlabelexcel = Excelreader.getData(0, 22, 7);
					if (visitampmlabelhead.equalsIgnoreCase(visitampmlabelexcel)) {
						test.pass("TC:25.2 THE LABEL OF 'VISIT AM/PM' IS ROLLED UP");
					} else {
						test.fail("TC:25.2 THE LABEL OF 'VISIT AM/PM' IS NOT ROLLED UP");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
								+ "THE LABEL OF 'VISIT TIME' IS NOT ROLLED UP");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());

				}
				
				// click drop down am value
				try {
				
				String amtextdisplayedhead = page.pmvaluedisplayedmethod1();
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
	}

	@Test(priority = 8)
	public void How_did_you_Place_your_order() {
		Resturant_Feedback_page1 page = new Resturant_Feedback_page1(driver);
		test = extent.createTest("How_did_you_Place_your_order");

		try {
			driver.get(Basepage.readProperty("urlR"));
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

		// how did you place your order label
		try {
			String howdidyouplaceyourorderlabelhead = page.howdidyouplaceyourorderlabelmethod();
			String howdidyouplaceyourorderlabelexcel = Excelreader.getData(0, 26, 6);
			if (howdidyouplaceyourorderlabelhead.equalsIgnoreCase(howdidyouplaceyourorderlabelexcel)) {
				test.pass("TC:26 LABEL OF 'HOW DID YOU PLACE YOUR ORDER' IS DIPLYED");
			} else {
				test.fail("TC:26 LABEL OF 'HOW DID YOU PLACE YOUR ORDER' IS NOT DIPLYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "LABEL OF 'HOW DID YOU PLACE YOUR ORDER' IS NOT DIPLYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// how did you place your order label rolled up
		try {
			String howdidyouplaceyourorderlabelhead = page.howdidyouplaceyourorderclickmethod();
			String howdidyouplaceyourorderlabelexcel = Excelreader.getData(0, 26, 6);
			if (howdidyouplaceyourorderlabelhead.equalsIgnoreCase(howdidyouplaceyourorderlabelexcel)) {
				test.pass("TC:26.2 LABEL OF 'HOW DID YOU PLACE YOUR ORDER' IS ROLLED UP");
			} else {
				test.fail("TC:26.2 LABEL OF 'HOW DID YOU PLACE YOUR ORDER' IS NOT ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "LABEL OF 'HOW DID YOU PLACE YOUR ORDER' IS NOT ROLLED UP");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// how did you place your order label DROP DOWN
		try {
			String howdidyouplaceyourorderlabelhead = page.howdidyouplaceyourorderdropdownmethod();
			if (!howdidyouplaceyourorderlabelhead.equalsIgnoreCase("")) {
				test.pass("TC:26.3 'HOW DID YOU PLACE YOUR ORDER' DROP DOWN IS WORKING");
			} else {
				test.fail("TC:26.3 'HOW DID YOU PLACE YOUR ORDER' DROP DOWN IS WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "'HOW DID YOU PLACE YOUR ORDER' DROP DOWN IS WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 9)
	public void How_did_you_Pick_your_order() {
		Resturant_Feedback_page1 page = new Resturant_Feedback_page1(driver);
		test = extent.createTest("How_did_you_Pick_your_order");

		try {
			driver.get(Basepage.readProperty("urlR"));
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

		// how did you pick your order label
		try {
			String howdidyoupickeyourorderlabelhead = page.howdidyoupickeyourorderlabelmethod();
			String howdidyoupickeyourorderlabelexcel = Excelreader.getData(0, 27, 6);
			if (howdidyoupickeyourorderlabelhead.equalsIgnoreCase(howdidyoupickeyourorderlabelexcel)) {
				test.pass("TC:27 LABEL OF 'HOW DID YOU PICK YOUR ORDER' IS DIPLYED");
			} else {
				test.fail("TC:27 LABEL OF 'HOW DID YOU PICK YOUR ORDER' IS NOT DIPLYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "LABEL OF 'HOW DID YOU PICK YOUR ORDER' IS NOT DIPLYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// how did you pick your order label
		try {
			String howdidyoupickeyourorderlabelhead = page.howdidyoupickyourorderclickmethod();
			String howdidyoupickeyourorderlabelexcel = Excelreader.getData(0, 27, 6);
			if (howdidyoupickeyourorderlabelhead.equalsIgnoreCase(howdidyoupickeyourorderlabelexcel)) {
				test.pass("TC:27.2 LABEL OF 'HOW DID YOU PICK YOUR ORDER' IS DIPLYED");
			} else {
				test.fail("TC:27.2 LABEL OF 'HOW DID YOU PICK YOUR ORDER' IS NOT DIPLYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "LABEL OF 'HOW DID YOU PICK YOUR ORDER' IS NOT DIPLYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// how did you pick your order label DROP DOWN
		try {
			String howdidyouplaceyourorderlabelhead = page.howdidyouplaceyourorderdropdownmethod();
			if (!howdidyouplaceyourorderlabelhead.equalsIgnoreCase("")) {
				test.pass("TC:26.3 'HOW DID YOU PLACE YOUR ORDER' DROP DOWN IS WORKING");

				String howdidyoupickyourorderdropdownhead = page.howdidyoupickyourorderdropdownmethod();
				if (!howdidyoupickyourorderdropdownhead.equalsIgnoreCase("")) {
					test.pass("TC:27.3 'HOW DID YOU PICK YOUR ORDER' DROP DOWN IS WORKING");
				} else {
					test.fail("TC:27.3 'HOW DID YOU PICK YOUR ORDER' DROP DOWN IS WORKING");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
							+ "'HOW DID YOU PLACE YOUR ORDER' DROP DOWN IS WORKING");
				}
			} else {
				test.fail("TC:26.3 'HOW DID YOU PLACE YOUR ORDER' DROP DOWN IS WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "'HOW DID YOU PLACE YOUR ORDER' DROP DOWN IS WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 10)
	public void Give_us_your_feedback_AND_Comments() {
		Resturant_Feedback_page1 page = new Resturant_Feedback_page1(driver);
		test = extent.createTest("Give_us_your_feedback_AND_Comments");

		try {
			driver.get(Basepage.readProperty("urlR"));
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
//GIVE US YOUR FEEDBACK TITLE
		try {
			String givefeedbacklabelhead = page.giveusfeedbacktitlemethod();
			String givefeedbacklabelexcel = Excelreader.getData(0, 28, 6);
			if (givefeedbacklabelhead.equalsIgnoreCase(givefeedbacklabelexcel)) {
				test.pass("TC:28 VERIFY TITLE 'GIVE US YOUR FEEDBACK' IS DISPLAYED");
			} else {
				test.fail("TC:28 VERIFY TITLE 'GIVE US YOUR FEEDBACK' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "VERIFY TITLE 'GIVE US YOUR FEEDBACK' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// LABEL OF enter your comments(0/1200 characters)
		try {
			String Entercommentlabel = page.entercommentsmethod();
			String Entercommentexcel = Excelreader.getData(0, 29, 6);
			if (Entercommentlabel.equalsIgnoreCase(Entercommentexcel)) {
				test.pass("TC:29  THE LABEL'ENTER YOUR COMMENTS(0/1200 characters)' IS DISPLAYED");
			} else {
				test.fail("TC:29 THE LABEL'ENTER YOUR COMMENTS(0/1200 characters)' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "THE LABEL'ENTER YOUR COMMENTS(0/1200 characters)' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// LABEL OF ENTER YOUR COMMENTS IS ROLLED UP

		try {
			String Entercommentrolledlabel = page.entercommentsmethod1();
			String Entercommentexcel = Excelreader.getData(0, 29, 6);
			if (Entercommentrolledlabel.equalsIgnoreCase(Entercommentexcel)) {
				test.pass("TC:29.2  THE LABEL'ENTER YOUR COMMENTS(0/1200 characters)' IS ROLLED UP");
			} else {
				test.fail("TC:29.2 THE LABEL'ENTER YOUR COMMENTS(0/1200 characters)' IS NOT ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "THE LABEL'ENTER YOUR COMMENTS(0/1200 characters)' IS NOT ROLLED UP");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// enter special characters on comments
		try {
			String commetspecialcharacterhexcel = Excelreader.getData(0, 30, 6);
			String commscenteredvalue = page.commententeredvalue(commetspecialcharacterhexcel);
			if (commscenteredvalue.equalsIgnoreCase("")) {
				test.pass("TC:29.3 USE SHOUL NOT  SEND SPECIAL CHARACTER IN COMMENT TEXT");
			} else {
				test.fail("TC:29.3 USE SHOUL NOT SEND SPECIAL CHARACTER IN COMMENT TEXT");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USE SHOUL NOT SEND SPECIAL CHARACTER IN COMMENT TEXT");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// enter NUMARICAL AND characters on comments
		try {
			String commetspecialcharacterhexcel = Excelreader.getData(0, 31, 6);
			String commscenteredvalue = page.commententeredvalue(commetspecialcharacterhexcel);
			if (commscenteredvalue.equalsIgnoreCase(commetspecialcharacterhexcel)) {
				test.pass("TC:29.4 USE SHOUL BE SEND  NUMARICAL AND  CHARACTER IN COMMENT TEXT");
			} else {
				test.fail("TC:29.4 USE SHOUL BE SEND NUMARICAL AND CHARACTER IN COMMENT TEXT");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USE SHOUL BE SEND NUMARICAL AND CHARACTER IN COMMENT TEXT");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// Enter MORE THAN 1200 characters and error message
		try {
			String commetcharacterexcel = Excelreader.getData(0, 32, 6);
			String commmorethan1200 = page.commententeredvalue(commetcharacterexcel);
			if (commmorethan1200.equalsIgnoreCase(commetcharacterexcel)) {
				test.pass("TC:29.5 USE SHOULD SEND MORE THAN 1200 IN COMMENT TEXT");
				String commmeterromesshead = page.commenterrormessagmethod();
				String commentserrormessexcel = Excelreader.getData(0, 33, 7);
				if (commmeterromesshead.equalsIgnoreCase(commentserrormessexcel)) {
					test.pass(
							"TC:29.6 ENTER YOUR COMMETN OF ERROR MESSAGE IS DISPLAYED AFTER ENTER MORE THAN 1200 CHARACTERS");

				} else {
					test.fail(
							"TC:29.6 ENTER YOUR COMMETN OF ERROR MESSAGE IS NOT DISPLAYED AFTER ENTER MORE THAN 1200 CHARACTERS");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
							+ "ENTER YOUR COMMETN OF ERROR MESSAGE IS NOT DISPLAYED AFTER ENTER MORE THAN 1200 CHARACTERS");
				}
			} else {
				test.fail("TC:29.5 USE SHOULD SEND MORE THAN 1200 IN COMMENT TEXT");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USE SHOULD NOT SEND MORE THAN 1200 IN COMMENT TEXT");

			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 11)
	public void First_name() {
		Resturant_Feedback_page1 page = new Resturant_Feedback_page1(driver);
		test = extent.createTest("First_name");

		try {
			driver.get(Basepage.readProperty("urlR"));

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

		// TELL US ABOUT YOURSELF
		try {
			String tellusabouthead = page.teluraboutmethod();
			String tellusaboutexcel = Excelreader.getData(0, 34, 6);
			if (tellusabouthead.equalsIgnoreCase(tellusaboutexcel)) {
				test.pass("TC:30 THE LABEL 'TELL US ABOUT YOURSELF' IS DISPLAYED");
			} else {
				test.fail("TC:30 THE LABEL 'TELL US ABOUT YOURSELF' IS NOT DISPLAYED ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "THE LABEL 'TELL US ABOUT YOURSELF' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// label of first name
		try {
			String firstnamelabehead = page.firstnamelabelmethod();
			String firstnamelabelexcel = Excelreader.getData(0, 35, 6);
			if (firstnamelabehead.equalsIgnoreCase(firstnamelabelexcel)) {
				test.pass("TC:31 THE LABEL '*FIRST NAME' IS DISPLAYED");
			} else {
				test.fail("TC:31 THE LABEL '*FIRST NAME' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "THE TEXT '*FIRST NAME' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// after click first name label
		try {
			String firstnamelabehead = page.firstnamelabelmethod1();
			String firstnamelabelexcel = Excelreader.getData(0, 35, 6);
			if (firstnamelabehead.equalsIgnoreCase(firstnamelabelexcel)) {
				test.pass("TC:31.2 THE LABEL '*FIRST NAME' IS ROLLED UP ");
			} else {
				test.fail("TC:31.2 THE LABEL '*FIRST NAME' IS NOT ROLLED UP ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "THE TEXT '*FIRST NAME' IS NOT ROLLED UP ");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// SPECIAL CHARACTERS AND NUMARICAL 
		try {
			String firstnamesendvalexcel = Excelreader.getData(0, 36, 6);
			String sendedvalhead = page.finameEnteredvalue(firstnamesendvalexcel);
			if (sendedvalhead.equalsIgnoreCase("")) {
				test.pass("TC:31.3  USE SHOULD NOT  SEND SPECIAL CHARACTERS AND NUMARICAL IN FIRSTNAME TEXTBOX");
			} else {
				test.fail("TC:31.3  USE SHOULD NOT  SEND SPECIAL CHARACTERS IN FIRSTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USE SHOULD NOT BE SEND SPECIAL CHARACTERS IN FIRSTNAME TEXTBOX");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// CHARACTERS VALUES IN FIRST NAME FUNCTION
		try {
			String firstnamesendvalexcel = Excelreader.getData(0, 38, 6);
			String sendedvalhead = page.finameEnteredvalue(firstnamesendvalexcel);
			if (sendedvalhead.equalsIgnoreCase(firstnamesendvalexcel)) {
				test.pass("TC:31.4  USE SHOULD  BE SEND CHARACTERS  IN FIRSTNAME TEXTBOX");
			} else {
				test.fail("TC:31.4  USE SHOULD BE SEND CHARACTERS IN FIRSTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USE SHOULD  BE SEND CHARACTERS IN FIRSTNAME TEXTBOX");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// MORE THAN 25 CHARACTERS IN FIRST NAME FUNCTION
		try {
			String firstnamesendvalexcel = Excelreader.getData(0, 39, 6);
			String sendedvalhead = page.finameEnteredvalue(firstnamesendvalexcel);
			if (!sendedvalhead.equalsIgnoreCase(firstnamesendvalexcel)) {
				test.pass("TC:31.5  USE SHOULD NOT BE SEND MORE THAN 25 CHARACTERS  IN FIRSTNAME TEXTBOX");
			} else {
				test.fail("TC:31.5  USE SHOULD NOT BE SEND MORE THAN 25 CHARACTERS IN FIRSTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USE SHOULD  NOT BE SEND MORE THAN 25 CHARACTERS IN FIRSTNAME TEXTBOX");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 12)
	public void Last_Name() {
		Resturant_Feedback_page1 page = new Resturant_Feedback_page1(driver);
		test = extent.createTest("Last_Name");

		try {
			driver.get(Basepage.readProperty("urlR"));
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
		// LAST NAME LABEL
		try {
			String LNlabelhead = page.lastnamelabelmethod();
			String LNlabelexcel = Excelreader.getData(0, 40, 6);
			if (LNlabelhead.equalsIgnoreCase(LNlabelexcel)) {
				test.pass("TC:32 THE LABEL 'LAST NAME' IS DISPLAYED");
			} else {
				test.fail("TC:32 THE LABEL 'LAST NAME' IS NOT DISPLAYED ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "THE LABEL 'LAST NAME' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// CLICK AND ROLLED UP THE LAST NAME LABEL
		try {
			String LNlabelhead = page.lastnamelabelmethod1();
			String LNlabelexcel = Excelreader.getData(0, 40, 6);
			if (LNlabelhead.equalsIgnoreCase(LNlabelexcel)) {
				test.pass("TC:32.2 THE LABEL 'LAST NAME' IS ROLLED UP ");
			} else {
				test.fail("TC:32.2 THE LABEL 'LAST NAME' IS NOT ROLLED UP ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "THE LABEL 'LAST NAME' IS NOT ROLLED UP");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// SPECIAL CHARACTERS and NUMARICALS
		try {
			String LNSPECIALCHARACTER = Excelreader.getData(0, 41, 6);
			String LAscvalue = page.lastnameenterdvalue(LNSPECIALCHARACTER);
			if (LAscvalue.equalsIgnoreCase("")) {
				test.pass("TC:32.3 USER SHOULD NOT SEND SPECIAL CHARACTERS AND NUMARICALS IN LASTNAME SECTION");
			} else {
				test.fail("TC:32.3 USER SHOULD NOT SEND SPECIAL CHARACTERS AND NUMARICALS IN LASTNAME SECTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USER SHOULD NOT BE SEND SPECIAL CHARACTERS AND NUMARICALS IN LASTNAME SECTION");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// CHARACTERS IN LAST NAME FUNCTION
		try {
			String LNSPECIALCHARACTER = Excelreader.getData(0, 43, 6);
			String LAscvalue = page.lastnameenterdvalue(LNSPECIALCHARACTER);
			if (LAscvalue.equalsIgnoreCase(LNSPECIALCHARACTER)) {
				test.pass("TC:32.4 USER SHOULD  SEND CHARACTERS IN LASTNAME SECTION");
			} else {
				test.fail("TC:32.4 USER SHOULD  SEND CHARACTERS IN LASTNAME SECTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USER SHOULD  BE SEND CHARACTERS IN LASTNAME SECTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// MORE THAN 25 CHARACTER IN LAST NAME FUNCTION
		try {
			String LNSPECIALCHARACTER = Excelreader.getData(0, 44, 6);
			String LAscvalue = page.lastnameenterdvalue(LNSPECIALCHARACTER);
			if (!LAscvalue.equalsIgnoreCase(LNSPECIALCHARACTER)) {
				test.pass("TC:32.5 USER SHOULD NOT SEND MORE THAN 25 CHARACTERS IN LASTNAME SECTION");
			} else {
				test.fail("TC:32.5 USER SHOULD NOT SEND MORE THAN 25 CHARACTERS IN LASTNAME SECTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USER SHOULD NOT BE SEND MORE THAN 25 CHARACTERS IN LASTNAME SECTION");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 13)
	public void Email() {
		Resturant_Feedback_page1 page = new Resturant_Feedback_page1(driver);
		test = extent.createTest("Email");
		try {
			driver.get(Basepage.readProperty("urlR"));
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
		// label of mail
		try {
			String emaillabelhead = page.emaillabelmethod();
			String emaillabelexcel = Excelreader.getData(0, 45, 6);
			if (emaillabelhead.equalsIgnoreCase(emaillabelexcel)) {
				test.pass("TC:33 THE LABEL 'EMAIL' IS DISPLAYED ");
			} else {
				test.fail("TC:33 THE LABEL 'EMAIL' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "THE LABEL 'EMAIL' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK ON mail AND LABEL IS ROLLED UP OR NOT
		try {
			String emaillabelhead = page.emaillabelmethod1();
			String emaillabelexcel = Excelreader.getData(0, 45, 6);
			if (emaillabelhead.equalsIgnoreCase(emaillabelexcel)) {
				test.pass("TC:33.2 THE LABEL 'EMAIL' IS ROLLED UP AFTER CLICK ON EMAIL SECTION");
			} else {
				test.fail("TC:33.2 THE LABEL 'EMAIL' IS NOT ROLLED UP AFTER CLICK ON EMAIL SECTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "THE LABEL 'EMAIL' IS NOT ROLLED UP AFTER CLICK ON EMAIL SECTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// WITH OUT .COM FORMAT
		try {
			String emailsendid = Excelreader.getData(0, 46, 6);
			String emailvlue = page.emailenteredvalue(emailsendid);
			if (emailvlue.equalsIgnoreCase(emailsendid)) {
				test.pass("TC:33.3  USER ABEL TO SEND MAIL WITH OUT FORMAT(.COM) IN MAIL FIELD");
				String mailerrormessagehead = page.emailerrormessagemethod();
				String mailerrormessageexcel = Excelreader.getData(0, 49, 6);
				if (mailerrormessagehead.equalsIgnoreCase(mailerrormessageexcel)) {
					test.pass("TC:33.3 WITH OUT FORMAT(.COM) 'ERROR MESSAGE DISPLAYED' -->" + "'" + mailerrormessagehead
							+ "'");
				} else {
					test.fail("TC:33.3  WITH OUT FORMAT(.COM) MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
							+ "WITH OUT FORMAT(.COM) MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				}
			} else {
				test.fail("TC:33.3 USER ABEL TO SEND MAIL WITH OUT FORMAT(.COM) IN MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USER ABEL TO SEND MAIL WITH OUT FORMAT(.COM) IN MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// WITH OUT @GAMIL

		try {
			String emailsendid = Excelreader.getData(0, 47, 6);
			String emailvlue = page.emailenteredvalue(emailsendid);
			if (emailvlue.equalsIgnoreCase(emailsendid)) {
				test.pass("TC:33.4  USER ABEL TO SEND MAIL WITH OUT FORMAT(@GAMIL) IN MAIL TEXTBOX");
				String mailerrormessagehead = page.emailerrormessagemethod();
				String mailerrormessageexcel = Excelreader.getData(0, 49, 6);
				if (mailerrormessagehead.equalsIgnoreCase(mailerrormessageexcel)) {
					test.pass("TC:33.4 WITH OUT FORMAT(@GAMIL) 'ERROR MESSAGE DISPLAYED' -->" + "'"
							+ mailerrormessagehead + "'");
				} else {
					test.fail("TC:33.4  WITH OUT FORMAT(@GAMIL) MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
							+ "WITH OUR FORMAT(@GAMIL) MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				}
			} else {
				test.fail("TC:33.4 USER ABEL TO SEND MAIL WITH OUT FORMAT(@GAMIL) IN MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USER ABEL TO SEND MAIL WITH OUT FORMAT(@GAMIL) IN MAIL TEXTBOX");
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
				String mailerrormessagehead = page.emailerrormessagemethod1();
				String mailerrormessageexcel = Excelreader.getData(0, 49, 6);
				if (mailerrormessagehead.equalsIgnoreCase("")) {
					test.pass("TC:33.5 WITH FORMAT OF MAIL,  'ERROR MESSAGE SHOULD NOT DISPLAYED'");
				} else {
					test.fail("TC:33.5  WITH FORMAT OF MAIL,  ERROR MESSAGE SHOULD NOT DISPLAYED--->" + "'"
							+ mailerrormessagehead + "'");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
							+ "WITH FORMAT OF MAIL,  ERROR MESSAGE SHOULD NOT  DISPLAYED");
				}
			} else {
				test.fail("TC:33.5 USER SHOULD SEND MAIL WITH FORMAT IN MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USER SHOULD SEND MAIL WITH FORMAT IN MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 14)
	public void Confirm_Email() {
		Resturant_Feedback_page1 page = new Resturant_Feedback_page1(driver);
		test = extent.createTest("Confirm_Email");

		try {
			driver.get(Basepage.readProperty("urlR"));
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
		// label of confirm_email
		try {
			String conmaillabelhead = page.confirmmaillabelmethod();
			String conmaillabelexcel = Excelreader.getData(0, 50, 6);
			if (conmaillabelhead.equalsIgnoreCase(conmaillabelexcel)) {
				test.pass("TC:34 THE LABEL 'CONFIRM EMAIL' IS DISPLAYED ");
			} else {
				test.fail("TC:34 THE LABEL 'CONFIRM EMAIL' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "THE LABEL 'CONFIRM EMAIL' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK ON confirm_email AND LABEL IS ROLLED UP OR NOT
		try {
			String conmaillabelhead = page.confirmmaillabelmethod1();
			String conmaillabelexcel = Excelreader.getData(0, 50, 6);
			if (conmaillabelhead.equalsIgnoreCase(conmaillabelexcel)) {
				test.pass("TC:34.2 THE LABEL 'CONFIRM EMAIL' IS ROLLED UP AFTER CLICK ON CONFIRM EMAIL FUNCTION");
			} else {
				test.fail("TC:34.2 THE LABEL 'CONFIRM EMAIL' IS NOT ROLLED UP AFTER CLICK ON CONFIRM EMAIL FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "THE LABEL 'CONFIRM EMAIL' IS NOT ROLLED UP AFTER CLICK ON CONFIRM EMAIL FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send DIFFERENT IDS IN mail AND CONFIRM
		try {
			String emailsendid = Excelreader.getData(0, 51, 6);
			page.mailsendmethod(emailsendid);
			String confirmmailsend = Excelreader.getData(0, 52, 6);
			String conmailsendvalue = page.confirmmailenteredvalue(confirmmailsend);
			if (conmailsendvalue.equalsIgnoreCase(confirmmailsend)) {
				test.pass("TC:34.3  USER ABLE TO SEND MAIL IN CONFIRM MAIL SECTION");
				String confirmmailerrormesshead = page.confirmmailerrormessmethod();
				String confirmmailerrormessexcel = Excelreader.getData(0, 53, 6);
				if (confirmmailerrormesshead.equalsIgnoreCase(confirmmailerrormessexcel)) {
					test.pass(
							"TC:34.3 USER SEND DIFFERENT IDS IN MAIL AND CONFIRM MAIL SECTION 'ERROR MESSAGE SHOULD BE DISPLAYED' -->"
									+ "'" + confirmmailerrormesshead + "'");
				} else {
					test.fail(
							"TC:34.3 USER SEND DIFFERENT IDS IN MAIL AND CONFIRM MAIL SECTION 'ERROR MESSAGE SHOULD BE DISPLAYED'");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
							+ "USER SEND DIFFERENT IDS IN MAIL AND CONFIRM MAIL");
				}

			} else {
				test.fail("TC:34.3 USER NOT ABLE TO SEND MAIL IN CONFIRM MAIL SECTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USER NOT ABLE TO SEND MAIL IN CONFIRM MAIL SECTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// send same mail ids check error message
		try {
			String emailsendid = Excelreader.getData(0, 52, 6);
			page.mailsendmethod1(emailsendid);
			String confirmmailsend = Excelreader.getData(0, 52, 6);
			String conmailsendvalue = page.confirmmailenteredvalue(confirmmailsend);
			if (conmailsendvalue.equalsIgnoreCase(confirmmailsend)) {
				test.pass("TC:34.4  USER ABLE TO SEND MAIL IN CONFIRM MAIL SECTION");
				String confirmmailerrormesshead = page.confirmmailerrormessmethod();
				if (confirmmailerrormesshead.equalsIgnoreCase("")) {
					test.pass(
							"TC:34.4 USER SEND SAME IDS IN MAIL AND CONFIRM MAIL SECTION 'ERROR MESSAGE SHOULD NOT DISPLAYED' -->"
									+ "'" + confirmmailerrormesshead + "'");
				} else {
					test.fail(
							"TC:34.4 USER SEND SAME IDS IN MAIL AND CONFIRM MAIL SECTION 'ERROR MESSAGE SHOULD NOT DISPLAYED'");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
							+ "USER SHOULD SEND SAME IDS IN MAIL AND CONFIRM MAIL");
				}
			} else {
				test.fail("TC:34.4 USER NOT ABLE TO SEND MAIL IN CONFIRM MAIL SECTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USER NOT ABLE TO SEND MAIL IN CONFIRM MAIL SECTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 15)
	public void Phone_Number() {
		Resturant_Feedback_page1 page = new Resturant_Feedback_page1(driver);
		test = extent.createTest("Phone_Number");

		try {
			driver.get(Basepage.readProperty("urlR"));
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

		// phone number label
		try {
			String phonenumberlabelhead = page.phonenumberlabelmethod();
			String phonenumberlabelexcel = Excelreader.getData(0, 54, 6);
			if (phonenumberlabelhead.equalsIgnoreCase(phonenumberlabelexcel)) {
				test.pass("TC:35 THE LABEL 'PHONE NUMBER' IS DISPLAYED ");
			} else {
				test.fail("TC:35 THE LABEL 'PHONE NUMBER' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "THE LABEL 'PHONE NUMBER' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK ON phone number AND LABEL IS ROLLED UP OR NOT
		try {
			String phonenumberlabelhead = page.phonenumberlabelmethod1();
			String phonenumberlabelexcel = Excelreader.getData(0, 54, 6);
			if (phonenumberlabelhead.equalsIgnoreCase(phonenumberlabelexcel)) {
				test.pass("TC:35.2 THE LABEL 'PHONE NUMBER' IS ROLLED UP AFTER CLICK ");
			} else {
				test.fail("TC:35.2 THE LABEL 'PHONE NUMBER' IS NOT ROLLED UP AFTER CLICK ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "THE LABEL 'PHONE NUMBER' IS NOT ROLLED UP AFTER CLICK ");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// characters
		try {
			String phonecharacterhead = Excelreader.getData(0, 55, 6);
			String phonenumCenteredval = page.phonenumberenteredvalue(phonecharacterhead);
			if (!phonenumCenteredval.equalsIgnoreCase(phonecharacterhead)) {
				test.pass("TC:35.3 USER SHOULD NOT SEND CHARACTER IN PHONE NUMBER SECTION ");
			} else {
				test.fail("TC:35.3 USER SHOULD NOT SEND CHARACTER IN PHONE NUMBER SECTION ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USER SHOULD NOT SEND CHARACTER IN PHONE NUMBER SECTION ");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// SPECIAL CHARECTER
		try {
			String phonecharacterhead = Excelreader.getData(0, 56, 6);
			String phonenumCenteredval = page.phonenumberenteredvalue(phonecharacterhead);
			if (!phonenumCenteredval.equalsIgnoreCase(phonecharacterhead)) {
				test.pass("TC:35.4 USER SHOULD NOT SEND SPECIAL CHARACTER IN PHONE NUMBER SECTION ");
			} else {
				test.fail("TC:35.4 USER SHOULD NOT SEND SPECIAL CHARACTER IN PHONE NUMBER SECTION ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USER SHOULD NOT SEND SPECIAL CHARACTER IN PHONE NUMBER SECTION ");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// more than 10 numerical
		try {
			String phonecharacterhead = Excelreader.getData(0, 57, 6);
			String phonenumCenteredval = page.phonenumberenteredvalue(phonecharacterhead);
			if (!phonenumCenteredval.equalsIgnoreCase(phonecharacterhead)) {
				test.pass("TC:35.5 USER SHOULD NOT SEND MORE THAN 10 NUMERICAL IN PHONE NUMBER SECTION ");
			} else {
				test.fail("TC:35.5 USER SHOULD NOT SEND MORE THAN 10 NUMERICAL IN PHONE NUMBER SECTION ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USER SHOULD NOT SEND MORE THAN 10 IN PHONE NUMBER SECTION ");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ENTER 10 NUMERICAL
		try {
			String phonecharacterhead = Excelreader.getData(0, 58, 6);
			String phonenumCenteredval = page.phonenumberenteredvalue(phonecharacterhead);
			if (phonenumCenteredval.equalsIgnoreCase(phonecharacterhead)) {
				test.pass("TC:35.6 USER SHOULD  SEND 10 NUMERICAL ONLY IN PHONE NUMBER SECTION ");
			} else {
				test.fail("TC:35.6 USER SHOULD  SEND 10 NUMERICAL ONLY IN PHONE NUMBER SECTION ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USER SHOULD SEND 10 NUMERICAL ONLY IN PHONE NUMBER SECTION ");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		/*// LESS THAN 10 NUMERICAL
		try {
			String phonecharacterhead = Excelreader.getData(0, 59, 6);
			String phonenumbererrormessagehead = page.phonenumbererrormessagemethod(phonecharacterhead);
			String phonenumbererrormessageexcel = Excelreader.getData(0, 60, 6);
			if (phonenumbererrormessagehead.equalsIgnoreCase(phonenumbererrormessageexcel)) {
				test.pass("TC:35.7 AFTER LESS THAN 10 NUMERICAL  'ERROR MESSAGE DISPLAYED' -->" + "'"
						+ phonenumbererrormessagehead + "'");
			} else {
				test.fail("TC:35.7 PHONE NUMBER FUNCTION ERROR MESSAGE IS NOT DISPLAYED AFTER LESS THAN 10 NUMERICAL ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "PHONE NUMBER FUNCTION ERROR MESSAGE IS NOT DISPLAYED AFTER LESS THAN 10 NUMERICAL");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}*/
	}

	@Test(priority = 16)
	public void Do_You_Want_The_Owners_Organization() {
		Resturant_Feedback_page1 page = new Resturant_Feedback_page1(driver);
		test = extent.createTest("Do_You_Want_The_Owners_Organization");

		try {
			driver.get(Basepage.readProperty("urlR"));
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

		// do you want the owner organization to contact you?
		try {
			String doyouwantownerorganizationlabelhead = page.doyouwantownerorganizationlabelmethod();
			String doyouwantownerorganizationlabelexcel = Excelreader.getData(0, 61, 6);
			if (doyouwantownerorganizationlabelhead.equalsIgnoreCase(doyouwantownerorganizationlabelexcel)) {
				test.pass(
						"TC:36 THE RADIO LABEL HEADING OF 'DO YOU WANT THE OWNER ORGANIZATION TO CONTACT YOU?' IS DISPLAYED ");
			} else {
				test.fail(
						"TC:36 THE RADIO LABEL HEADING OF 'DO YOU WANT THE OWNER ORGANIZATION TO CONTACT YOU?' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "THE RADIO LABEL HEADING OF 'DO YOU WANT THE OWNER ORGANIZATION TO CONTACT YOU?' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// yes radio button label
		try {
			String yesradiobuttonlabelhead = page.yesradiobuttonlabelmethod();
			String yesradiobuttonlabelexcel = Excelreader.getData(0, 62, 6);
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
		// yes radio button
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

		}
		// CLICK yes radio button
		try {
			boolean yesradiobuttonclickhead = page.yesradiobuttonclickmethod1();
			if (yesradiobuttonclickhead == true) {
				test.pass("TC:37.3 USER ABLE TO SELECT 'YES' RADIO BUTTON");
				// extra fields should be appear
				String addressline1labelhead = page.addressline1labelmethod();
				String addressline1labelexcel = Excelreader.getData(0, 63, 6);
				if (addressline1labelhead.equalsIgnoreCase(addressline1labelexcel)) {
					test.pass("TC:37.4 IF THE USER ANSWE 'YES',  THEN EXTRA FIELDS SHOULD APPEAR ");
				} else {
					test.fail("TC:37.4 IF THE USER ANSWE 'YES',  THEN EXTRA FIELDS SHOULD APPEAR");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
							+ "IF THE USER ANSWE 'YES',  THEN EXTRA FIELDS SHOULD APPEAR");
				}
			} else {
				test.fail("TC:37.3 USER NOT ABLE TO SELECT 'YES' RADIO BUTTON");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USER NOT ABLE TO SELECT 'YES' RADIO BUTTON");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// no radio button label
		try {
			String noradiobuttonlabelhead = page.noradiobuttonlabelmethod();
			String noradiobuttonlabelexcel = Excelreader.getData(0, 64, 6);
			if (noradiobuttonlabelhead.equalsIgnoreCase(noradiobuttonlabelexcel)) {
				test.pass(
						"TC:38 THE RADIO LABEL HEADING OF 'DO YOU WANT THE OWNER ORGANIZATION TO CONTACT YOU?' IS DISPLAYED ");
			} else {
				test.fail(
						"TC:38 THE RADIO LABEL HEADING OF 'DO YOU WANT THE OWNER ORGANIZATION TO CONTACT YOU?' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "THE RADIO LABEL HEADING OF 'DO YOU WANT THE OWNER ORGANIZATION TO CONTACT YOU?' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// NO radio button
		try {
			boolean noradiobuttonclickhead = page.noradiobuttonclickmethod();
			if (noradiobuttonclickhead == false) {
				test.pass("TC:38.2 'NO' RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
			} else {
				test.fail("TC:38.2 'NO' RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "YES RADIO BUTTON SHOULD NOT SELECTED BY DEFAULT");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// CLICK NO radio button
		try {
			boolean noradiobuttonclickhead = page.noradiobuttonclickmethod1();
			if (noradiobuttonclickhead == true) {
				test.pass("TC:38.3 USER ABLE TO SELECT 'NO' RADIO BUTTON");
				// yes radio button
				try {
					boolean yesradiobuttonclickhead = page.yesradiobuttonclickmethod();
					if (yesradiobuttonclickhead == false) {
						test.pass("TC:38.4 USER SHOUL NOT SELECT MULTIPLE RADIO BUTTONS AFTER SELECT NO RADIO BUTTON");
					} else {
						test.fail("TC:38.4 USER SHOUL NOT SELECT MULTIPLE RADIO BUTTONS AFTER SELECT NO RADIO BUTTON");
						test.fail(
								test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
										+ "USER SHOUL NOT SELECT MULTIPLE RADIO BUTTONS AFTER SELECT NO RADIO BUTTON");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());

				}
				// extra fields should be appear
				String addressline1labelhead = page.addressline1labelmethod();
				if (!addressline1labelhead.equalsIgnoreCase("")) {
					test.pass("TC:38.5 IF THE USER ANSWE 'NO',  THEN EXTRA FIELDS SHOULD NOT APPEAR ");
				} else {
					test.fail("TC:38.5 IF THE USER ANSWE 'NO',  THEN EXTRA FIELDS SHOULD NOT APPEAR");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
							+ "IF THE USER ANSWE 'NO',  THEN EXTRA FIELDS SHOULD NOT APPEAR");
				}
			} else {
				test.fail("TC:38.3 USER NOT ABLE TO SELECT 'NO' RADIO BUTTON");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USER NOT ABLE TO SELECT 'NO' RADIO BUTTON");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
	}

	@Test(priority = 17)
	public void Address_Line_one() {
		Resturant_Feedback_page1 page = new Resturant_Feedback_page1(driver);
		test = extent.createTest("Address_Line_one");

		try {
			driver.get(Basepage.readProperty("urlR"));
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

		// ADDRESS LINE 1 LABEL
		try {
			String addressline1labelhead = page.addressline1labelmethod();
			String addressline1labelexcel = Excelreader.getData(0, 65, 6);
			if (addressline1labelhead.equalsIgnoreCase(addressline1labelexcel)) {
				test.pass("TC:39 THE LABEL 'ADDRESS LINE 1' IS DISPLAYED");
			} else {
				test.fail("TC:39 THE LABEL 'ADDRESS LINE 1' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "THE LABEL 'ADDRESS LINE 1' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// CLICK ON ADDRESS(US ONLY) AND CHECK LABES rolled up or not
		try {
			String addressline1labelhead = page.addressline1labelmethod1();
			String addressline1labelexcel = Excelreader.getData(0, 65, 6);
			if (addressline1labelhead.equalsIgnoreCase(addressline1labelexcel)) {
				test.pass("TC:39.2 THE LABEL 'ADDRESS LINE 1' IS ROLLED UP AFTE CLICK ON ADDRESS LINE 1");
			} else {
				test.fail("TC:39.2 THE LABEL 'ADDRESS LINE 1' IS NOT ROLLED UP AFTE CLICK ON ADDRESS LINE 1");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "THE LABEL 'ADDRESS LINE 1' IS NOT ROLLED UP AFTE CLICK ON ADDRESS LINE 1");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// special characters
		try {
			String addressspecharacterhead = Excelreader.getData(0, 66, 6);
			String adsccnvalue = page.addresslinesendvaluesmethod(addressspecharacterhead);
			if (adsccnvalue.equals("")) {
				test.pass("TC:39.3 USER SHOULD NOT SEND SPECIAL CHARACTERS IN ADDRESS LINE 1");
			} else {
				test.fail("TC:39.3 USER SHOULD NOT SEND SPECIAL CHARACTERS IN ADDRESS LINE 1");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USER SHOULD NOT SEND SPECIAL CHARACTERS IN ADDRESS LINE 1");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// NUMARICAL AND CHARACTERS SEND IN ADDRESS US(ONLY)

		try {
			String addressspecharacterhead = Excelreader.getData(0, 67, 6);
			String adsccnvalue = page.addresslinesendvaluesmethod(addressspecharacterhead);
			if (adsccnvalue.equals(addressspecharacterhead)) {
				test.pass("TC:39.4 USER SHOULD  SEND NUMARICAL AND CHARACTERS IN ADDRESS LINE 1");
			} else {
				test.fail("TC:39.4 USER SHOULD SEND NUMARICAL AND CHARACTERS IN ADDRESS LINE 1");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USER SHOULD  SEND NUMARICAL AND CHARACTERS IN ADDRESS LINE 1");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// MORE THAN 40 CHARACTERS IN ADDRESS US

		try {
			String addressspecharacterhead = Excelreader.getData(0, 68, 6);
			String adsccnvalue = page.addresslinesendvaluesmethod(addressspecharacterhead);
			if (!adsccnvalue.equals(addressspecharacterhead)) {
				test.pass("TC:39.5 USER SHOULD NOT SEND MORE THAN 40 NUMARICAL AND CHARACTERS IN ADDRESS LINE 1");
			} else {
				test.fail("TC:39.5 USER SHOULD NOT SEND MORE THAN 40 NUMARICAL AND CHARACTERS IN ADDRESS LINE 1");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USER SHOULD NOT SEND MORE THAN 40 NUMARICAL AND CHARACTERS IN ADDRESS LINE 1");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 18)
	public void Address_Line_two() {
		Resturant_Feedback_page1 page = new Resturant_Feedback_page1(driver);
		test = extent.createTest("Address_Line_two");

		try {
			driver.get(Basepage.readProperty("urlR"));
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
		// ADDRESS LINE 1 LABEL
		try {
			String addressline2labelhead = page.addressline2labelmethod();
			String addressline2labelexcel = Excelreader.getData(0, 69, 6);
			if (addressline2labelhead.equalsIgnoreCase(addressline2labelexcel)) {
				test.pass("TC:40 THE LABEL 'ADDRESS LINE 2' IS DISPLAYED");
			} else {
				test.fail("TC:40 THE LABEL 'ADDRESS LINE 2' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "THE LABEL 'ADDRESS LINE 2' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// CLICK ON ADDRESS(US ONLY) AND CHECK LABES rolled up
		try {
			String addressline1labelhead = page.addressline2labelmethod1();
			String addressline1labelexcel = Excelreader.getData(0, 69, 6);
			if (addressline1labelhead.equalsIgnoreCase(addressline1labelexcel)) {
				test.pass("TC:40.2 THE LABEL 'ADDRESS LINE 2' IS ROLLED UP AFTE CLICK ON ADDRESS LINE 2");
			} else {
				test.fail("TC:40.2 THE LABEL 'ADDRESS LINE 2' IS NOT ROLLED UP AFTE CLICK ON ADDRESS LINE 2");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "THE LABEL 'ADDRESS LINE 2' IS NOT ROLLED UP AFTE CLICK ON ADDRESS LINE 2");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// special characters
		try {
			String addressspecharacterhead = Excelreader.getData(0, 70, 6);
			String adsccnvalue = page.addressline2sendvaluesmethod(addressspecharacterhead);
			if (adsccnvalue.equals("")) {
				test.pass("TC:40.3 USER SHOULD NOT SEND SPECIAL CHARACTERS IN ADDRESS LINE 2 ");
			} else {
				test.fail("TC:40.3 USER SHOULD NOT SEND SPECIAL CHARACTERS IN ADDRESS LINE 2");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USER SHOULD NOT SEND SPECIAL CHARACTERS IN ADDRESS LINE 2");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// NUMARICAL AND CHARACTERS SEND IN ADDRESS US(ONLY)

		try {
			String addressspecharacterhead = Excelreader.getData(0, 71, 6);
			String adsccnvalue = page.addressline2sendvaluesmethod(addressspecharacterhead);
			if (adsccnvalue.equals(addressspecharacterhead)) {
				test.pass("TC:40.4 USER SHOULD  SEND NUMARICAL AND CHARACTERS IN ADDRESS LINE 2");
			} else {
				test.fail("TC:40.4 USER SHOULD SEND NUMARICAL AND CHARACTERS IN ADDRESS LINE 2");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USER SHOULD  SEND NUMARICAL AND CHARACTERS IN ADDRESS LINE 2");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// MORE THAN 40 CHARACTERS IN ADDRESS US

		try {
			String addressspecharacterhead = Excelreader.getData(0, 72, 6);
			String adsccnvalue = page.addressline2sendvaluesmethod(addressspecharacterhead);
			if (!adsccnvalue.equals(addressspecharacterhead)) {
				test.pass("TC:40.5 USER SHOULD NOT SEND MORE THAN 40 NUMARICAL AND CHARACTERS IN ADDRESS LINE 2");
			} else {
				test.fail("TC:40.5 USER SHOULD NOT SEND MORE THAN 40 NUMARICAL AND CHARACTERS IN ADDRESS LINE 2");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USER SHOULD NOT SEND MORE THAN 40 NUMARICAL AND CHARACTERS IN ADDRESS LINE 2");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 19)
	public void City() {
		Resturant_Feedback_page1 page = new Resturant_Feedback_page1(driver);
		test = extent.createTest("City");

		try {
			driver.get(Basepage.readProperty("urlR"));
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
		// label of citys
		try {
			String citylabelhead = page.citylabelmethod();
			String citylabelexcel = Excelreader.getData(0, 73, 6);
			if (citylabelhead.equalsIgnoreCase(citylabelexcel)) {
				test.pass("TC:41 THE LABEL 'CITY' IS DISPLAYED ");
			} else {
				test.fail("TC:41 THE LABEL 'CITY' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "THE LABEL 'CITY' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// after click on city text and rolled up label

		try {
			String citylabelhead = page.citylabelmethod1();
			String citylabelexcel = Excelreader.getData(0, 73, 6);
			if (citylabelhead.equalsIgnoreCase(citylabelexcel)) {
				test.pass("TC:41.2 THE LABEL 'CITY' IS ROLLED UP AFTER CLICK ON CLITY  ");
			} else {
				test.fail("TC:41.2 THE LABEL 'CITY' IS NOT ROLLED UP AFTER CLICK ON CLITY ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "THE LABEL 'CITY' IS NOT ROLLED UP AFTER CLICK ON CLITY ");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// special characters and numerical
		try {
			String cityspecialcharcters = Excelreader.getData(0, 74, 6);
			String citySCenteredvalue = page.citysendvaluemethod(cityspecialcharcters);
			if (!citySCenteredvalue.equals(cityspecialcharcters)) {
				test.pass("TC:41.3 USER SHOULD NOT SEND SPECIAL CHARACTERS AND NUMERICAL IN CITY SECTION");
			} else {
				test.fail("TC:41.3 USER SHOULD NOT SEND SPECIAL CHARACTERS AND NUMERICAL IN CITY SECTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USER SHOULD NOT SEND SPECIAL CHARACTERS AND NUMERICAL IN CITY SECTION");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// CHARACTERSS
		try {
			String citycharactersexcel = Excelreader.getData(0, 75, 6);
			String citycharactershead = page.citysendvaluemethod(citycharactersexcel);
			if (citycharactershead.equals(citycharactersexcel)) {
				test.pass("TC:41.4 USER SHOULD  SEND CHARACTERS IN CITY SECTION");
			} else {
				test.fail("TC:41.4 USER SHOULD SEND CHARACTERS IN CITY SECTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USER SHOULD SEND CHARACTERS IN CITY SECTION");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// MORE THAN 30 CHARACTERS

		try {
			String citymorethan30excel = Excelreader.getData(0, 76, 6);
			String citymorethan30head = page.citysendvaluemethod(citymorethan30excel);
			if (!citymorethan30head.equals(citymorethan30excel)) {
				test.pass("TC:41.5 USER SHOULD  SEND MORE THAN 30 CHARACTERS IN CITY TEXTBOX");
			} else {
				test.fail("TC:41.5 USER SHOULD SEND MORE THAN 30 CHARACTERS IN CITY TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USER SHOULD SEND MORE THAN 30 CHARACTERS IN CITY TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 20)
	public void State() {
		Resturant_Feedback_page1 page = new Resturant_Feedback_page1(driver);
		test = extent.createTest("State");

		try {
			driver.get(Basepage.readProperty("urlR"));
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

		// label of State
		try {
			String statelabelhead = page.statelabelmethod();
			String staelabelexcel = Excelreader.getData(0, 77, 6);
			if (statelabelhead.equalsIgnoreCase(staelabelexcel)) {
				test.pass("TC:42 THE LABEL 'STATE' IS DISPLAYED ");
			} else {
				test.fail("TC:42 THE LABEL 'STATE' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "THE LABEL 'STATE' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK ON STATE AND LABEL IS ROLLED UP OR NOT
		try {
			String statelabelhead = page.statelabelmethod1();
			String staelabelexcel = Excelreader.getData(0, 77, 6);
			if (statelabelhead.equalsIgnoreCase(staelabelexcel)) {
				test.pass("TC:42.2 THE LABEL 'STATE' IS ROLLED UP AFTER CLICK ON STATE FUNCTION ");
			} else {
				test.fail("TC:42.2 THE LABEL 'STATE' IS ROLLED UP AFTER CLICK ON STATE FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "THE LABEL 'STATE' IS ROLLED UP AFTER CLICK ON STATE FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// select drop down values of state function
		try {
			String statedropdownvaluehead = page.stateselecteddropdownvalmethod1();
			String staelabelexcel = Excelreader.getData(0, 78, 6);
			if (statedropdownvaluehead.equalsIgnoreCase(staelabelexcel)) {
				test.pass("TC:43.3 STEATE DROP DOWN  IS WORKING");
			} else {
				test.fail("TC:43.3 STEATE DROP DOWN  IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "STEATE DROP DOWN VALUE IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 21)
	public void Zip() {
		Resturant_Feedback_page1 page = new Resturant_Feedback_page1(driver);
		test = extent.createTest("Zip");

		try {
			driver.get(Basepage.readProperty("urlR"));
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

		// label of Zip
		try {
			String ziplabelhead = page.ziplabelmethod();
			String ziplabelexcel = Excelreader.getData(0, 79, 6);
			if (ziplabelhead.equalsIgnoreCase(ziplabelexcel)) {
				test.pass("TC:44 THE LABEL 'ZIP' IS DISPLAYED ");
			} else {
				test.fail("TC:44 THE LABEL 'ZIP' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "THE LABEL 'ZIP' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK ON zip AND LABEL IS ROLLED UP OR NOT
		try {
			String ziplabelhead = page.ziplabelmethod1();
			String ziplabelexcel = Excelreader.getData(0, 79, 6);
			if (ziplabelhead.equalsIgnoreCase(ziplabelexcel)) {
				test.pass("TC:44.2 THE LABEL 'ZIP' IS ROLLED UP AFTER CLICK ON ZIP FUNCTION");
			} else {
				test.fail("TC:44.2 THE LABEL 'ZIP' IS NOT ROLLED UP AFTER CLICK ON ZIP FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "THE LABEL 'ZIP' IS NOT ROLLED UP AFTER CLICK ON ZIP FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// CHARACTER and special characters
		try {
			String zipsendedvaluesexcel = Excelreader.getData(0, 80, 6);
			String zipsendedvalueshead = page.zipenteredvalue(zipsendedvaluesexcel);
			if (zipsendedvalueshead.equals("")) {
				test.pass("TC:44.3 USER SHOULD NOT ENTERD CHARACTERS AND SPECIAL CHARACTERS IN ZIP TEXTBOX");
			} else {

				test.fail("TC:44.3 USER SHOULD NOT ENTERD CHARACTERS AND SPECIAL CHARACTERS IN ZIP TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USER SHOULD NOT ENTERD CHARACTERS IN ZIP AND SPECIAL CHARACTERS TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// NUMERICAL 5 DIGITS

		try {
			String zipsendedvaluesexcel = Excelreader.getData(0, 81, 6);
			String zipsendedvalueshead = page.zipenteredvalue(zipsendedvaluesexcel);
			if (zipsendedvalueshead.equals(zipsendedvaluesexcel)) {
				test.pass("TC:44.4 USER SHOULD ENTERD NUMERICAL IN ZIP TEXTBOX");
			} else {

				test.fail("TC:44.4 USER SHOULD ENTERD NUMERICAL IN ZIP TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USER SHOULD ENTERD NUMERICAL IN ZIP TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// MORE THAN 5 NUMERICAL
		try {
			String zipsendedvaluesexcel = Excelreader.getData(0, 82, 6);
			String zipsendedvalueshead = page.zipenteredvalue(zipsendedvaluesexcel);
			if (!zipsendedvalueshead.equals(zipsendedvaluesexcel)) {
				test.pass("TC:44.5 USER SHOULD NOT ENTERD MORE THAN 5 NUMERICAL IN ZIP TEXTBOX");
			} else {

				test.fail("TC:44.5 USER SHOULD NOT ENTERD MORE THAN 5 NUMERICAL IN ZIP TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USER SHOULD NOT ENTERD MORE THAN 5 NUMERICAL IN ZIP TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// LESS THAN 5 NUMERICAL
		try {
			// driver.findElement(By.xpath("//*[@name='zip']")).clear();
			String zipsendedvaluesexcel = Excelreader.getData(0, 83, 6);
			String ziperrormessagehead = page.ziperrormessagemethod(zipsendedvaluesexcel);
			String ziperrormessageexcel = Excelreader.getData(0, 84, 6);
			if (ziperrormessagehead.equals(ziperrormessageexcel)) {
				test.pass("TC:44.6 ENTER LESS THAN 5 NUMERICAL AND SUBMIT 'ERROR MESSAGE DISPLAYED' -->" + "'"
						+ ziperrormessagehead + "'");
			} else {
				test.fail("TC:44.6  ENTER LESS THAN 5 NUMERICAL AND SUBMIT 'ERROR MESSAGE SHOULD DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "ENTER LESS THAN 5 NUMERICAL AND SUBMIT 'ERROR MESSAGE SHOULD DISPLAYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 22)
	public void By_Selecting_Submit_Title() {
		Resturant_Feedback_page1 page = new Resturant_Feedback_page1(driver);
		test = extent.createTest("By_Selecting_Submit");

		try {
			driver.get(Basepage.readProperty("urlR"));
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
		// BY SELECTING SUBMIT... LABEL
		try {
			String byselectsubmithead = page.byselectsubmittitlemethod();
			String buselectsubmitexcel = Excelreader.getData(0, 85, 6);
			if (byselectsubmithead.equalsIgnoreCase(buselectsubmitexcel)) {
				test.pass("TC:45 VERIF TITLE OF  'MY SELECTING SUBMIT....' IS DISPLAYED");
			} else {
				test.fail("TC:45 VERIF TITLE OF  'MY SELECTING SUBMIT....' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "VERIF TITLE OF  'MY SELECTING SUBMIT....' IS NOT DISPLAYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 23)
	public void Global_and_Functional_Error_Message() {
		Resturant_Feedback_page1 page = new Resturant_Feedback_page1(driver);
		test = extent.createTest(" Global_and_Functional_Error_Message");

		try {
			driver.get(Basepage.readProperty("urlR"));
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
		// 12 global error message
		try {
			String globalerrormsghead = page.globalerrormsgmethod();
			String globalerrormsgexcel = Excelreader.getData(0, 86, 6);
			if (globalerrormsghead.equalsIgnoreCase(globalerrormsgexcel)) {
				test.pass("TC:46 '12-GLOBAL ERROR MESSAGE DISPLAYED' -->" + "'" + globalerrormsghead + "'");
			} else {
				test.fail("TC:46  12 GLOBAL ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "12 GLOBAL ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// select restaurant error message
		try {
			String selectrestauranterrormsghead = page.selectrestauranterrormsgmethod();
			String selectrestauranterrormsgexcel = Excelreader.getData(0, 87, 6);
			if (selectrestauranterrormsghead.equalsIgnoreCase(selectrestauranterrormsgexcel)) {
				test.pass("TC:7.2 SELECT RESTAURANT ERROR MESSAGE IS DISPLAYED " + "'" + selectrestauranterrormsghead
						+ "'");
			} else {
				test.fail("TC:7.2 SELECT RESTAURANT ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "SELECT RESTAURANT ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// visit date error msg
		try {
			String visitdateerrormsghead = page.visitdateerrormsgmethod1();
			String visitdateerrormsgexcel = Excelreader.getData(0, 88, 6);
			if (visitdateerrormsghead.equalsIgnoreCase(visitdateerrormsgexcel)) {
				test.pass("TC:24.5 VISIT DATE ERROR MESSAGE IS DISPLAYED " + "'" + visitdateerrormsghead + "'");
			} else {
				test.fail("TC:24.5 VISIT DATE ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "VISIT DATE ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		/// visit time error msg
		try {
			String visittimeerrormsghead = page.visittimeerrormsgmethod1();
			String visittimeerrormsgexcel = Excelreader.getData(0, 89, 6);
			if (visittimeerrormsghead.equals(visittimeerrormsgexcel)) {
				test.pass("TC:25.6 VISIT TIME ERROR MESSAGE IS DISPLAYED " + "'" + visittimeerrormsghead + "'");
			} else {
				test.fail("TC:25.6 VISIT TIME ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "VISIT TIME ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// how did you place your order error msg
		try {
			String youplaceordererrormsghead = page.youplaceordererrormsgmethod();
			String youplaceordererrormsgexcel = Excelreader.getData(0, 90, 6);
			if (youplaceordererrormsghead.equalsIgnoreCase(youplaceordererrormsgexcel)) {
				test.pass("TC:26.4 FUNCTION OF 'HOW DID YOU PLACE YOUR ORDER' ERROR MSG IS DISPLAYED " + "'"
						+ youplaceordererrormsghead + "'");
			} else {
				test.fail("TC:26.4 FUNCTION OF 'HOW DID YOU PLACE YOUR ORDER' ERROR MSG IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "FUNCTION OF 'HOW DID YOU PLACE YOUR ORDER' ERROR MSG IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// how did you pick your order
		try {
			String youpickordererrormsghead = page.youpickordererrormsgmethod();
			String youpickordererrormsgexcel = Excelreader.getData(0, 91, 6);
			if (youpickordererrormsghead.equalsIgnoreCase(youpickordererrormsgexcel)) {
				test.pass("TC:27.4 FUNCTION OF 'HOW DID YOU PICK YOUR ORDER' ERROR MSG IS DISPLAYED " + "'"
						+ youpickordererrormsghead + "'");
			} else {
				test.fail("TC:27.4 FUNCTION OF 'HOW DID YOU PICK YOUR ORDER' ERROR MSG IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "FUNCTION OF 'HOW DID YOU PICK YOUR ORDER' ERROR MSG IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ENTER YOUR COMMENTS ERROR MSG
		try {
			String enteryourcommenterrormsghead = page.enteryourcommenterrormsgmethod1();
			String enteryourcommenterrormsgexcel = Excelreader.getData(0, 92, 7);
			if (enteryourcommenterrormsghead.equalsIgnoreCase(enteryourcommenterrormsgexcel)) {
				test.pass("TC:29.7  'ENTER YOUR COMMENTS' ERROR MSG IS DISPLAYED " + "'" + enteryourcommenterrormsghead
						+ "'");
			} else {
				test.fail("TC:29.7  'ENTER YOUR COMMENTS' ERROR MSG IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ " 'ENTER YOUR COMMENTS' ERROR MSG IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// first name error msg
		try {
			String firstnameerrormsghead = page.firstnameerrormsgmethod();
			String firstnameerrormsgexcel = Excelreader.getData(0, 93, 6);
			if (firstnameerrormsghead.equalsIgnoreCase(firstnameerrormsgexcel)) {
				test.pass("TC:31.7  'FIRST NAME' ERROR MSG IS DISPLAYED " + "'" + firstnameerrormsghead + "'");
			} else {
				test.fail("TC:31.7  'FIRST NAME' ERROR MSG IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ " 'FIRST NAME' ERROR MSG IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// last name error msg
		try {
			String lastnameerrormsghead = page.lastnameerrormsgmethod();
			String lastnameerrormsgexcel = Excelreader.getData(0, 94, 6);
			if (lastnameerrormsghead.equalsIgnoreCase(lastnameerrormsgexcel)) {
				test.pass("TC:32.7  'LAST NAME' ERROR MSG IS DISPLAYED " + "'" + lastnameerrormsghead + "'");
			} else {
				test.fail("TC:32.7  'LAST NAME' ERROR MSG IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ " 'FIRST NAME' ERROR MSG IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// EMAIL ERROR MSG
		try {
			String emailerrormsghead = page.emailerrormsgmethod();
			String emailerrormsgexcel = Excelreader.getData(0, 95, 6);
			if (emailerrormsghead.equalsIgnoreCase(emailerrormsgexcel)) {
				test.pass("TC:33.6  'EMAIL' ERROR MSG IS DISPLAYED " + "'" + emailerrormsghead + "'");
			} else {
				test.fail("TC:33.6  'EMAIL' ERROR MSG IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ " 'EMAIL' ERROR MSG IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// confirm mail error msg
		try {
			String confirmemailerrormsghead = page.confirmemailerrormsgmethod();
			String confirmemailerrormsgexcel = Excelreader.getData(0, 96, 6);
			if (confirmemailerrormsghead.equalsIgnoreCase(confirmemailerrormsgexcel)) {
				test.pass("TC:34.5  'CONFIRM EMAIL' ERROR MSG IS DISPLAYED " + "'" + confirmemailerrormsghead + "'");
			} else {
				test.fail("TC:34.5  'CONFIRM EMAIL' ERROR MSG IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ " 'CONFIRM EMAIL' ERROR MSG IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// phone error msg
		try {
			String phonenumbererrormsghead = page.phonenumbererrormsgmethod();
			String phonenumbererrormsgexcel = Excelreader.getData(0, 97, 6);
			if (phonenumbererrormsghead.equalsIgnoreCase(phonenumbererrormsgexcel)) {
				test.pass("TC:35.8  'PHONE NUMBER' ERROR MSG IS DISPLAYED " + "'" + phonenumbererrormsghead + "'");
			} else {
				test.fail("TC:35.8  'PHONE NUMBER' ERROR MSG IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ " 'PHONE NUMBER' ERROR MSG IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// radio button error msg
		try {
			String radiobuttonerrormsghead = page.radiobuttonerrormsgmethod();
			String radiobuttonerrormsgexcel = Excelreader.getData(0, 98, 6);
			if (radiobuttonerrormsghead.equalsIgnoreCase(radiobuttonerrormsgexcel)) {
				test.pass("TC:38.6  'RADIO BUTTON' ERROR MSG IS DISPLAYED " + "'" + radiobuttonerrormsghead + "'");
			} else {
				test.fail("TC:38.6  'RADIO BUTTON' ERROR MSG IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ " 'RADIO BUTTON' ERROR MSG IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 24)
	public void Open_Close_webstatus() {
		Resturant_Feedback_page1 page = new Resturant_Feedback_page1(driver);
		test = extent.createTest("Open_Close_webstatus");

		try {
			driver.get(Basepage.readProperty("urlR"));
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

		try {
			String zipcityhead = page.zipcitymethod();
			String zipcityexcel = Excelreader.getData(0, 7, 6);
			if (zipcityhead.equalsIgnoreCase("")) {
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
								// web status open and close
								try {
									String openwebstatusexcel = Excelreader.getData(0, 99, 6);
									String closewebstatusexcel = Excelreader.getData(0, 100, 6);
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

	@Test(priority = 25)
	public void Submit_and_Reset_buttons() throws IOException {
		Resturant_Feedback_page1 page = new Resturant_Feedback_page1(driver);
		test = extent.createTest(" Positive_scenario");
		try {
			driver.get(Basepage.readProperty("urlR"));

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
		// submit resetbuttonmethod
		try {
			page.submitbutton();
			test.pass("TC:47 SUBMIT BUTTON IS ENABLE AND DISPLAYED");

			try {
				String submitbuttonclickhead = page.submitbuttonclick();
				String submitbuttonclickexcel = Excelreader.getData(0, 86, 6);
				if (submitbuttonclickhead.equalsIgnoreCase(submitbuttonclickexcel)) {
					test.pass("TC:47.2 SUBMIT BUTTON IS WORKING ");
					// reset button
					try {
						String resetbuttonhead = page.resetbuttonmethod();
						String resetbuttonexcel = Excelreader.getData(0, 86, 6);
						if (resetbuttonhead.equalsIgnoreCase(resetbuttonhead)) {
							test.pass("TC:48  USER ABLE TO CLICK ON RESET BUTTON ");
							// are you sure you want to reset title
							try {
								String areyousureyouwanttoresethead = page.areyousureyouwanttoresetlabel();
								String areyousureyouwanttoresetexcel = Excelreader.getData(0, 104, 6);
								if (areyousureyouwanttoresethead.equalsIgnoreCase(areyousureyouwanttoresetexcel)) {
									test.pass("TC:48.2  TITLE OF 'ARE YOU SURE YOU WANT TO RESET' IS DISPLAYED");
								} else {
									test.fail("TC:48.2  TITLE OF 'ARE YOU SURE YOU WANT TO RESET' IS DISPLAYED");
									test.fail(test.addScreenCaptureFromPath(
											Extentreport.getScreenshot(driver, "Resraurant_feedback"))
											+ "USER NOT ABLE TO CLICK ON RESET BUTTON");
								}
							} catch (Exception e) {
								test.fail("Error:" + e.getMessage());

							}
							// If you click on 'Yes', all of your filled data will be lost
							try {
								String ifyouclickonyessubtitlehead = page.ifyouclickonyessubtitlemethod();
								String ifyouclickonyessubtitleexcel = Excelreader.getData(0, 102, 6);
								if (ifyouclickonyessubtitlehead.equalsIgnoreCase(ifyouclickonyessubtitleexcel)) {
									test.pass(
											"TC:48.3  SUB TITLE OF 'IF YOU CLICK ON 'YES' , ALL OF YOU FILED DATE WILL BE LOST' IS DISPLAYED");
								} else {
									test.fail(
											"TC:48.3  SUB TITLE OF 'IF YOU CLICK ON 'YES' , ALL OF YOU FILED DATE WILL BE LOST' IS NOT DISPLAYED");
									test.fail(test.addScreenCaptureFromPath(
											Extentreport.getScreenshot(driver, "Resraurant_feedback"))
											+ "SUB TITLE OF 'IF YOU CLICK ON 'YES' , ALL OF YOU FILED DATE WILL BE LOST' IS NOT DISPLAYED");
								}
							} catch (Exception e) {
								test.fail("Error:" + e.getMessage());

							}
							// CLICK ON CANCLE BUTTON
							try {
								String nobuttonclickhead = page.nobuttonclickmethod();
								String nobuttonclickexcel = Excelreader.getData(0, 102, 6);
								if (nobuttonclickhead.equalsIgnoreCase("")) {
									test.pass("TC:48.4  RESET 'NO' BUTTON IS WORKING ");
								} else {
									test.fail("TC:48.4  RESET 'NO' BUTTON IS NOT WORKING");
									test.fail(test.addScreenCaptureFromPath(
											Extentreport.getScreenshot(driver, "Resraurant_feedback"))
											+ "RESET 'NO' BUTTON IS NOT WORKING");
								}
							} catch (Exception e) {
								test.fail("Error:" + e.getMessage());

							}
						} else {
							test.fail("TC:48  USER NOT ABLE TO CLICK ON RESET BUTTON ");
							test.fail(test
									.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
									+ "USER NOT ABLE TO CLICK ON RESET BUTTON");
						}
					} catch (Exception e) {
						test.fail("Error:" + e.getMessage());

					}
				} else {
					test.fail("TC:47.2 SUBMIT BUTTON IS NOT WORKING");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
							+ "SUBMIT BUTTON IS NOT WORKING");
				}
			} catch (Exception e) {
				test.fail("Error:" + e.getMessage());

			}
			// reset button working or not
			try {
				String yesresetbuttonhead = page.yesresetbuttonmethod();
				String nobuttonclickexcel = Excelreader.getData(0, 102, 6);
				if (yesresetbuttonhead.equalsIgnoreCase("")) {
					test.pass("TC:48.5  RESET BUTTON IS WORKING ");
				} else {
					test.fail("TC:48.5  RESET BUTTON IS NOT WORKING");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
							+ "RESET BUTTON IS NOT WORKING");
				}
			} catch (Exception e) {
				test.fail("Error:" + e.getMessage());
			}
		} catch (Exception e) {
			test.fail("TC:47 SUBMIT BUTTON IS NOT ENABLE AND DISPLAYED");

		}

	}

	/*@Test(priority = 26)
	public void Positive_scenario_Restaurant_Feedback() throws IOException {
		Resturant_Feedback_page1 page = new Resturant_Feedback_page1(driver);
		test = extent.createTest(" Positive_scenario_Restaurant_Feedback");

		try {
			driver.get(Basepage.readProperty("urlR"));

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
		// VISIT DATE ENTER values NUMERICAL
		try {
			String visitdatelabelexcel = Excelreader.getData(0, 19, 7);
			String visitdatelabelhead = page.visitdatesendmethod(visitdatelabelexcel);
			if (visitdatelabelhead.equals(visitdatelabelexcel)) {
				test.pass("TC:24.2 USERS  ABLE TO ENTER NUMERICALS AND DATE");
			} else {
				test.fail("TC:24.2 USERS NOT ABLE TO ENTER NUMERICALS AND DATE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USERS NOT ABLE TO ENTER NUMERICALS");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}
		// VISIT time ENTER CHARACTERS AND NUMERICALS
		try {
			String visittimelabelexcel = Excelreader.getData(0, 23, 7);
			String visittimelabelhead = page.visittimesendmethod(visittimelabelexcel);
			if (visittimelabelhead.equals(visittimelabelexcel)) {
				test.pass("TC:25.3 USERS ABLE TO  ENTER CHARACTERS AND NUMERICALS");
			} else {
				test.fail("TC:24.3 USERS NOT ABLE TO  ENTER CHARACTERS AND NUMERICALS");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USERS NOT ABLE TO  ENTER CHARACTERS AND NUMERICALS");
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "USER NOT ABLE TO SEND MAIL IN CONFIRM MAIL SECTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// ENTER 10 NUMERICAL on phone field 
		try {
			String phonecharacterhead = Excelreader.getData(0, 58, 6);
			String phonenumCenteredval = page.phonenumberenteredvalue(phonecharacterhead);
			if (phonenumCenteredval.equals(phonecharacterhead)) {
				test.pass("TC:35.6 USER SHOULD  SEND 10 NUMERICAL ONLY IN PHONE NUMBER SECTION ");
			} else {
				test.fail("TC:35.6 USER SHOULD  SEND 10 NUMERICAL ONLY IN PHONE NUMBER SECTION ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
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
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
						+ "RESTAURANT FEEDBACK FORM IS NOT SUBMITTED SUCCESSFULLY");
			}
		} catch (Exception e) {
			test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Resraurant_feedback"))
					+ "SUBMIT BUTTON IS NOT WORKING FINE AND ENABEL");
		}

	}
*/
}


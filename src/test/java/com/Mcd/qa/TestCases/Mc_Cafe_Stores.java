package com.Mcd.qa.TestCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.McD.qa.Base.BaseTest;
import com.McD.qa.Extentreport.Extentreport;
import com.McD.qa.Pages.Basepage;
import com.McD.qa.Pages.Mc_Cafe_Store_Page;
import com.McD.qa.Utility.TestUtil;

public class Mc_Cafe_Stores extends BaseTest {

	String excelpath = System.getProperty("user.dir");
	TestUtil Excelreader = new TestUtil(excelpath + "/src/main/java/com/McD/qa/TestData/Mc_Cafe_Store.xls");

	@Test(priority = 1)
	public void Open_URL_Mc_Cafe_Stores() {
		Mc_Cafe_Store_Page page = new Mc_Cafe_Store_Page(driver);
		test = extent.createTest("Open_URL_Mc_Cafe_Stores");

		try {
			driver.get(Basepage.readProperty("urlmccs"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 Mc_Cafe_Stores URL IS OPENED");
			} else {
				test.fail("TC:1 Mc_Cafe_Stores URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
						+ "Mc_Cafe_Stores URL IS NOT OPENED");
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
	public void Mc_Cafe_Address() {
		Mc_Cafe_Store_Page page = new Mc_Cafe_Store_Page(driver);
		test = extent.createTest("Mc_Cafe_Address");
		// Locateme
		try {
			String locatemelabelhead = page.locatemelabelmethod();
			String locatemelabelexcel = Excelreader.getData(0, 2, 5);
			if (locatemelabelhead.equals(locatemelabelexcel)) {
				test.pass("TC:2 VERIFY LABEL 'LOCATE ME' IS DISPLAYED");
			} else {
				test.fail("TC:2 VERIFY LABEL 'LOCATE ME' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
						+ "VERIFY LABEL 'LOCATE ME' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// zip, city, State label
		try {
			String zipcitystatelabelhead = page.zipcitystatelabelmethod();
			String zipcitystatelabelexcel = Excelreader.getData(0, 3, 5);
			if (zipcitystatelabelhead.equals(zipcitystatelabelexcel)) {
				test.pass("TC:3 VERIFY LABEL 'ZIP, CITY & STATE' IS DISPLAYED");

			} else {
				test.fail("TC:3 VERIFY LABEL 'ZIP, CITY & STATE' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
						+ "VERIFY LABEL 'ZIP, CITY & STATE' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// zip, city, State label rolled up
		try {
			String zipcitystatelabelhead = page.zipcitystatelabelmethod1();
			String zipcitystatelabelexcel = Excelreader.getData(0, 3, 5);
			if (zipcitystatelabelhead.equals(zipcitystatelabelexcel)) {
				test.pass("TC:3 VERIFY LABEL 'ZIP, CITY & STATE' IS ROLLED UP");

			} else {
				test.fail("TC:3 VERIFY LABEL 'ZIP, CITY & STATE' IS NOT ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
						+ "VERIFY LABEL 'ZIP, CITY & STATE' IS ROLLED UP");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// send city or state
		try {
			String citystatesendedvaluexcel = Excelreader.getData(0, 4, 5);
			String citystatesendedvaluhead = page.zipsendedvalumethod(citystatesendedvaluexcel);
			if (citystatesendedvaluhead.equals(citystatesendedvaluexcel)) {
				test.pass("TC:4 USER SHOULD BE ENTER CITY AND STATE");
				// search button
				try {
					String searchbuttonhead = page.searchbuttonmethod1();
					if (!searchbuttonhead.equals("")) {
						test.pass("TC:5 SEARCH BUTTON IS WORKING FINE");
						try {
							// CLICK ON SEARCH AND DEIPLAY OR NOT NEAR ADDRESS to us
							String addressdisplayedexcel = Excelreader.getData(0, 5, 5);
							String addressdisplayedhead = page.nearaddressone();
							if (addressdisplayedhead.equals(addressdisplayedexcel)) {
								test.pass("TC:6 ADDRESS SHOULD BE DISPLAYED AS NEAR TO OUR LOCATION");
								/*// SELECT ADDRESS ON MAP
								String selectaddressonmapexcel = Excelreader.getData(0, 6, 5);
								String selectaddressonmaphead = page.selectaddressonmapmethod();
								if (selectaddressonmaphead.equals(selectaddressonmapexcel)) {
									test.pass("TC:7 USER SHOULD BE SELECT THE ADDRESS ON MAP");
								} else {
									test.fail("TC:7 USER SHOULD BE SELECT THE ADDRESS ON MAP");
									test.fail(test.addScreenCaptureFromPath(
											Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
											+ "USER SHOULD BE SELECT THE ADDRESS ON MAP");
								}*/
							} else {
								test.fail("TC:6 ADDRESS SHOULD BE DISPLAYED AS NEAR TO OUR LOCATION");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ "ADDRESS SHOULD BE DISPLAYED AS NEAR TO OUR LOCATION");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}

						// mcd result filter headings
						try {
							String filterheadinghead = page.filterheadingmethod();
							if (!filterheadinghead.equals("")) {
								test.pass("TC:8 McD FILTER HEADING IS DISPLAYED");
							} else {
								test.fail("TC:8 McD FILTER HEADING IS DISPLAYED");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ "McD FILTER HEADING IS DISPLAYED");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}
						// GET DIRECTION label
						try {
							String getdirectionlabelexcel = Excelreader.getData(0, 7, 5);
							String getdirectionlabelhead = page.getdirectionlabelmethod();
							if (getdirectionlabelhead.equals(getdirectionlabelexcel)) {
								test.pass("TC:9 VERIFY LABEL 'GET DIRECTION' IS DISPLAYED");
							} else {
								test.fail("TC:9 VERIFY LABEL 'GET DIRECTION' IS DISPLAYED");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ "VERIFY LABEL 'GET DIRECTION' IS DISPLAYED");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}

						try {
							// GET DIRECTIONN BUTTON IS CLICKABLE OR NOT AND CANCLE BUTTON
							String getdirectionexcel = Excelreader.getData(0, 8, 5);
							String getdirectionhead = page.getdirectionclickmethod1();
							if (getdirectionhead.equals(getdirectionexcel)) {
								test.pass("TC:9 'GET DIRECTION' LINK IS CLICKABLE ON MAP VIEW");
								// cancel button
								String ordermcdeliverylabelexcel1 = Excelreader.getData(0, 7, 5);
								String ordermcdeliverylabelhead1 = page.cancelbuttonmethod1();
								if (ordermcdeliverylabelhead1.equals(ordermcdeliverylabelexcel1)) {
									test.pass(
											"TC:9 CANCEL BUTTON IS WORKING FINE AFTER CLICK ON 'GET DIRECTION' ON MAP VIEW ");
								} else {
									test.fail(
											"TC:9 CANCEL BUTTON IS NOT WORKING FINE AFTER CLICK ON 'GET DIRECTION' ON MAP VIEW");
									test.fail(test.addScreenCaptureFromPath(
											Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
											+ " CANCEL BUTTON IS NOT WORKING FINE AFTER CLICK ON 'GET DIRECTION' ON MAP VIEW");
								}
							} else {
								test.fail("TC:9 'GET DIRECTION' LINK IS CLICKABLE ON MAP VIEW");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ " 'GET DIRECTION' LINK IS CLICKABLE ON MAP VIEW");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}
					} else {
						test.fail("TC:5 SEARCH BUTTON IS NOT WORKING FINE");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
								+ "SEARCH BUTTON IS NOT WORKING FINE");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
			} else {
				test.fail("TC:4 USER SHOULD BE SEND CITY AND STATE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
						+ "USER SHOULD BE SEND CITY AND STATE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// GET DIRECTION IS WORKING OR NOT

		// send city or state
		try {
			String citystatesendedvaluexcel = Excelreader.getData(0, 4, 5);
			String citystatesendedvaluhead = page.zipsendedvalumethod1(citystatesendedvaluexcel);
			if (citystatesendedvaluhead.equals(citystatesendedvaluexcel)) {
				test.pass("TC:4 USER SHOULD BE ENTER CITY AND STATE");
				// search button
				String searchbuttonhead = page.searchbuttonmethod1();
				if (!searchbuttonhead.equals("")) {
					test.pass("TC:5 SEARCH BUTTON IS WORKING FINE");
					try {
						// CLICK ON SEARCH AND DEIPLAY OR NOT NEAR ADDRESS to us
						String addressdisplayedexcel = Excelreader.getData(0, 5, 5);
						String addressdisplayedhead = page.nearaddressone();
						if (addressdisplayedhead.equals(addressdisplayedexcel)) {
							test.pass("TC:6 ADDRESS SHOULD BE DISPLAYED AS NEAR TO OUR LOCATION");
							// GET DIRECTION LINK OPEN OR NOT
							String getdirectiongettitleexcel = Excelreader.getData(0, 9, 5);
							String getdirectiongettitlehead = page.ubereatmethods1();
							if (getdirectiongettitlehead.equals(getdirectiongettitleexcel)) {
								test.pass("TC:9 GET DIRECTION LINK IS OPEN ON MAP VIEW ");
							} else {
								test.fail("TC:9 GET DIRECTION LINK IS OPEN ON MAP VIEW");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ " GET DIRECTION LINK IS OPEN ON MAP VIEW");
							}
						} else {
							test.fail("TC:6 ADDRESS SHOULD BE DISPLAYED AS NEAR TO OUR LOCATION");
							test.fail(
									test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
											+ "ADDRESS SHOULD BE DISPLAYED AS NEAR TO OUR LOCATION");
						}
					} catch (Exception e) {
						test.fail("Error:" + e.getMessage());
					}
				} else {
					test.fail("TC:5 SEARCH BUTTON IS NOT WORKING FINE");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
							+ "SEARCH BUTTON IS NOT WORKING FINE");
				}
			} else {
				test.fail("TC:4 USER SHOULD BE SEND CITY AND STATE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
						+ "USER SHOULD BE SEND CITY AND STATE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 3)
	public void Filters_Mc_Cafe_Store() {
		Mc_Cafe_Store_Page page = new Mc_Cafe_Store_Page(driver);
		test = extent.createTest("Filters_Mc_Cafe_Store");
		try {
			driver.get(Basepage.readProperty("urlmccs"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 Mc_Cafe_Stores URL IS OPENED");
			} else {
				test.fail("TC:1 Mc_Cafe_Stores URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
						+ "Mc_Cafe_Stores URL IS NOT OPENED");
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
			// search button
			String citystatesendedvaluexcel = Excelreader.getData(0, 4, 5);
			String searchbuttonhead = page.searchbuttonmethod(citystatesendedvaluexcel);
			if (!searchbuttonhead.equals("")) {
				test.pass("TC:5 SEARCH BUTTON IS WORKING FINE");
				// filter labels
				try {
					String filterlabelexcel = Excelreader.getData(0, 10, 5);
					String filterlabelhead = page.filterlabelmethod();
					if (filterlabelhead.equals(filterlabelexcel)) {
						test.pass("TC:10 VERIFY LABEL 'FILTER' IS DISPLAYED");
					} else {
						test.fail("TC:10 VERIFY LABEL 'FILTER' IS DISPLAYED");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
								+ "VERIFY LABEL 'FILTER' IS DISPLAYED");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// CLICK ON FILTER
				try {
					String filterlabelexcel = Excelreader.getData(0, 11, 5);
					String filterlabelhead = page.clickonfilter();
					if (filterlabelhead.equals(filterlabelexcel)) {
						test.pass("TC:11 FILTER IS WORKING ON Mc CAFE STORES");
						// ALL LABEL
						try {
							String alllabelexcel = Excelreader.getData(0, 11, 5);
							String alllabelhead = page.ALLlabelmethod();
							if (alllabelhead.equals(alllabelexcel)) {
								test.pass("TC:12 VERIFY LABEL 'ALL' IS DISPLAYED");
							} else {
								test.fail("TC:12 VERIFY LABEL 'ALL' IS DISPLAYED");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ "VERIFY LABEL 'ALL' IS DISPLAYED");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}
						// all check box
						try {
							String allcheckboxhead = page.allcheckboxmethod();
							if (allcheckboxhead.equals("true")) {
								test.pass("TC:12 ALL CHECK BOX SHOULD BE SELECTED BY DEFAULT");
							} else {
								test.fail("TC:12 ALL CHECK BOX SHOULD BE SELECTED BY DEFAULT");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ "ALL CHECK BOX SHOULD BE SELECTED BY DEFAULT");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());

						}
						// Mocha LABEL
						try {
							String mochalabelexcel = Excelreader.getData(0, 12, 5);
							String mochalabelhead = page.mochalabelmethod();
							if (mochalabelhead.equals(mochalabelexcel)) {
								test.pass("TC:13 VERIFY LABEL 'MOCHA' IS DISPLAYED");
							} else {
								test.fail("TC:13 VERIFY LABEL 'MOCHA' IS DISPLAYED");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ "VERIFY LABEL 'MOCHA' IS DISPLAYED");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}
						// mocha check box
						try {
							String mochacheckboxhead = page.mochacheckboxmethod();
							if (mochacheckboxhead.equals("true")) {
								test.pass("TC:13 MOCHA CHECK BOX SHOULD BE SELECTED BY DEFAULT");
							} else {
								test.fail("TC:13 MOCHA CHECK BOX SHOULD BE SELECTED BY DEFAULT");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ "MOCHA CHECK BOX SHOULD BE SELECTED BY DEFAULT");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());

						}
						// CARAMEL LABEL
						try {
							String caramellabelexcel = Excelreader.getData(0, 13, 5);
							String caramellabelhead = page.caramellabelmethod();
							if (caramellabelhead.equals(caramellabelexcel)) {
								test.pass("TC:14 VERIFY LABEL 'CARAMEL' IS DISPLAYED");
							} else {
								test.fail("TC:14 VERIFY LABEL 'CARAMEL' IS DISPLAYED");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ "VERIFY LABEL 'CARAMEL' IS DISPLAYED");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}
						// CARAMEL check box
						try {
							String caramelcheckboxhead = page.caramelcheckboxmethod();
							if (caramelcheckboxhead.equals("true")) {
								test.pass("TC:14 CARAMEL CHECK BOX SHOULD BE SELECTED BY DEFAULT");
							} else {
								test.fail("TC:14 CARAMEL CHECK BOX SHOULD BE SELECTED BY DEFAULT");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ "CARAMEL CHECK BOX SHOULD BE SELECTED BY DEFAULT");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());

						}
						// vanilla label
						try {
							String vanillalabelecel = Excelreader.getData(0, 14, 5);
							String vanillalabelhead = page.vanillalabelmethod();
							if (vanillalabelhead.equals(vanillalabelecel)) {
								test.pass("TC:15 VERIFY LABEL 'VANILLA' IS DISPLAYED");
							} else {
								test.fail("TC:15 VERIFY LABEL 'VANILLA' IS DISPLAYED");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ "VERIFY LABEL 'CARAMEL' IS DISPLAYED");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}
						// vanilla check box
						try {
							String venillacheckboxhead = page.venillacheckboxmethod();
							if (venillacheckboxhead.equals("true")) {
								test.pass("TC:15 CARAMEL CHECK BOX SHOULD BE SELECTED BY DEFAULT");
							} else {
								test.fail("TC:15 CARAMEL CHECK BOX SHOULD BE SELECTED BY DEFAULT");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ "CARAMEL CHECK BOX SHOULD BE SELECTED BY DEFAULT");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());

						}
						// un select all check box
						try {
							String allcheckboxhead = page.allcheckboxmethod1();
							if (!allcheckboxhead.equals("true")) {
								test.pass("TC:16 ALL CHECK BOX SHOULD BE UNSELECT");
								// mocha check box
								try {
									String mochacheckboxhead = page.mochacheckboxmethod();
									if (!mochacheckboxhead.equals("true")) {
										test.pass(
												"TC:16 ALL CHECKBOX IS WORKING, 'MOCHA CHECKBOX' SHOULD BE UNSELECTED AFTER UNSELECT 'ALL CHECKBOX'");
									} else {
										test.fail(
												"TC:16 ALL CHECKBOX IS NOT WORKING, MOCHA CHECKBOX SHOULD BE UNSELECTED AFTER UNSELECT 'ALL CHECKBOX'");
										test.fail(test.addScreenCaptureFromPath(
												Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
												+ "ALL CHECKBOX IS NOT WORKING, MOCHA CHECKBOX SHOULD BE UNSELECTED AFTER UNSELECT 'ALL CHECKBOX'");
									}
								} catch (Exception e) {
									test.fail("Error:" + e.getMessage());
								}
								// CARAMEL check box
								try {
									String caramelcheckboxhead = page.caramelcheckboxmethod();
									if (!caramelcheckboxhead.equals("true")) {
										test.pass(
												"TC:16 ALL CHECKBOX IS NOT WORKING, CARMEL CHECKBOX SHOULD BE UNSELECTED AFTER UNSELECT 'ALL CHECKBOX'");
									} else {
										test.fail(
												"TC:16 ALL CHECKBOX IS NOT WORKING, CARMEL CHECKBOX SHOULD BE UNSELECTED AFTER UNSELECT 'ALL CHECKBOX'");
										test.fail(test.addScreenCaptureFromPath(
												Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
												+ "ALL CHECKBOX IS NOT WORKING, CARMEL CHECKBOX SHOULD BE UNSELECTED AFTER UNSELECT 'ALL CHECKBOX'");
									}
								} catch (Exception e) {
									test.fail("Error:" + e.getMessage());

								}
								// vanilla check box
								try {
									String venillacheckboxhead = page.venillacheckboxmethod();
									if (!venillacheckboxhead.equals("true")) {
										test.pass(
												"TC:16 ALL CHECKBOX IS NOT WORKING, VANILLA CHECKBOX SHOULD BE UNSELECTED AFTER UNSELECT 'ALL CHECKBOX'");
									} else {
										test.fail(
												"TC:16 ALL CHECKBOX IS NOT WORKING, VANILLA CHECKBOX SHOULD BE UNSELECTED AFTER UNSELECT 'ALL CHECKBOX'");
										test.fail(test.addScreenCaptureFromPath(
												Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
												+ "ALL CHECKBOX IS NOT WORKING, VANILLA CHECKBOX SHOULD BE UNSELECTED AFTER UNSELECT 'ALL CHECKBOX'");
									}
								} catch (Exception e) {
									test.fail("Error:" + e.getMessage());

								}
							} else {
								test.fail("TC:16 ALL CHECK BOX SHOULD BE UNSELECT");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ "ALL CHECK BOX SHOULD BE UNSELECT");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());

						}
						// select all check box
						try {
							String allcheckboxhead = page.allcheckboxmethod1();
							if (allcheckboxhead.equals("true")) {
								test.pass("TC:17 ALL CHECK BOX SHOULD BE SELECTED");
								// mocha check box
								try {
									String mochacheckboxhead = page.mochacheckboxmethod();
									if (mochacheckboxhead.equals("true")) {
										test.pass(
												"TC:17 ALL CHECKBOX IS WORKING, MOCHA CHECKBOX SHOULD BE SELECTED AFTER SELECT 'ALL CHECKBOX'");
									} else {
										test.fail(
												"TC:17 ALL CHECKBOX IS NOT WORKING, MOCHA CHECKBOX SHOULD BE SELECTED AFTER SELECT 'ALL CHECKBOX'");
										test.fail(test.addScreenCaptureFromPath(
												Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
												+ "ALL CHECKBOX IS NOT WORKING, MOCHA CHECKBOX SHOULD BE SELECTED AFTER SELECT 'ALL CHECKBOX'");
									}
								} catch (Exception e) {
									test.fail("Error:" + e.getMessage());
								}
								// CARAMEL check box
								try {
									String caramelcheckboxhead = page.caramelcheckboxmethod();
									if (caramelcheckboxhead.equals("true")) {
										test.pass(
												"TC:17 ALL CHECKBOX IS WORKING, CARMEL CHECKBOX SHOULD BE SELECTED AFTER SELECT 'ALL CHECKBOX'");
									} else {
										test.fail(
												"TC:17 ALL CHECKBOX IS NOT WORKING, CARMEL CHECKBOX SHOULD BE SELECTED AFTER SELECT 'ALL CHECKBOX'");
										test.fail(test.addScreenCaptureFromPath(
												Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
												+ "ALL CHECKBOX IS NOT WORKING, CARMEL CHECKBOX SHOULD BE SELECTED AFTER UNSELECT 'ALL CHECKBOX'");
									}
								} catch (Exception e) {
									test.fail("Error:" + e.getMessage());

								}
								// vanilla check box
								try {
									String venillacheckboxhead = page.venillacheckboxmethod();
									if (venillacheckboxhead.equals("true")) {
										test.pass(
												"TC:17 ALL CHECKBOX IS WORKING, VANILLA CHECKBOX SHOULD BE SELECTED AFTER SELECT 'ALL CHECKBOX'");
									} else {
										test.fail(
												"TC:17 ALL CHECKBOX IS NOT WORKING, VANILLA CHECKBOX SHOULD BE SELECTED AFTER SELECT 'ALL CHECKBOX'");
										test.fail(test.addScreenCaptureFromPath(
												Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
												+ "ALL CHECKBOX IS NOT WORKING, VANILLA CHECKBOX SHOULD BE SELECTED AFTER SELECT 'ALL CHECKBOX'");
									}
								} catch (Exception e) {
									test.fail("Error:" + e.getMessage());
								}
							} else {
								test.fail("TC:17 ALL CHECK BOX SHOULD BE SELECTED");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ "ALL CHECK BOX SHOULD BE SELECTED");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());

						}
						// please enter location label
						try {
							String pleaseenterlocationexcel = Excelreader.getData(0, 15, 5);
							String pleaseenterlocationhead = page.pleaseenterlocationmethod();
							if (pleaseenterlocationhead.equals(pleaseenterlocationexcel)) {
								test.pass("TC:18 VERIFY LABEL 'PLEASE ENTER LOCATION (MILES)' IS DISPLAYED");
							} else {
								test.fail("TC:18 VERIFY LABEL 'PLEASE ENTER LOCATION (MILES)' IS DISPLAYED");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ "VERIFY LABEL 'PLEASE ENTER LOCATION (MILES)' IS DISPLAYED");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}
						// radio button 5

						try {
							boolean radiobutton5cockhead = page.radiobutton5cockmethod();
							if (!radiobutton5cockhead == (true)) {
								test.pass(
										"TC:19 '5 MILES RADIO BUTTON' SHOULD NOT SELECTED BY DEFAULT IN 'Mc CAFE STORES'");
							} else {
								test.fail(
										"TC:19 '5 MILES RADIO BUTTON' SHOULD NOT SELECTED BY DEFAULT IN 'Mc CAFE STORES'");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ "'5 MILES RADIO BUTTON' SHOULD NOT SELECTED BY DEFAULT IN 'Mc CAFE STORES'");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}
						// radio button 10

						try {
							boolean radiobutton10cockhead = page.radiobutton10cockmethod();
							if (!radiobutton10cockhead == (true)) {
								test.pass(
										"TC:20 '10 MILES RADIO BUTTON' SHOULD NOT SELECTED BY DEFAULT IN 'Mc CAFE STORES'");
							} else {
								test.fail(
										"TC:20 '10 MILES RADIO BUTTON' SHOULD NOT SELECTED BY DEFAULT IN 'Mc CAFE STORES'");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ "'10 MILES RADIO BUTTON' SHOULD NOT SELECTED BY DEFAULT IN 'Mc CAFE STORES'");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}
						// radio button 20

						try {
							boolean radiobutton20cockhead = page.radiobutton20cockmethod();
							if (!radiobutton20cockhead == (true)) {
								test.pass(
										"TC:21 '20 MILES RADIO BUTTON' SHOULD NOT SELECTED BY DEFAULT IN 'Mc CAFE STORES'");
							} else {
								test.fail(
										"TC:21 '20 MILES RADIO BUTTON' SHOULD NOT SELECTED BY DEFAULT IN 'Mc CAFE STORES'");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ "'20 MILES RADIO BUTTON' SHOULD NOT SELECTED BY DEFAULT IN 'Mc CAFE STORES'");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}
						// radio button 50

						try {
							boolean radiobutton50cockhead = page.radiobutton50cockmethod();
							if (radiobutton50cockhead == (true)) {
								test.pass(
										"TC:22 '50 MILES RADIO BUTTON' SHOULD BE SELECTED BY DEFAULT IN 'Mc CAFE STORES'");
							} else {
								test.fail(
										"TC:22 '50 MILES RADIO BUTTON' SHOULD BE SELECTED BY DEFAULT IN 'Mc CAFE STORES'");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ "'50 MILES RADIO BUTTON' SHOULD BE SELECTED BY DEFAULT IN 'Mc CAFE STORES'");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}

						// CLICK radio button 5

						try {
							boolean radiobutton5cockhead = page.radiobutton5cockmethod1();
							if (radiobutton5cockhead == (true)) {
								test.pass("TC:23 '5 MILES RADIO BUTTON' SHOULD BE CLICKABLE IN 'Mc CAFE STORES'");
							} else {
								test.fail("TC:23 '5 MILES RADIO BUTTON' SHOULD BE CLICKABLE IN 'Mc CAFE STORES'");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ "'5 MILES RADIO BUTTON' SHOULD BE CLICKABLE IN 'Mc CAFE STORES'");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}
						// CLICK radio button 10

						try {
							boolean radiobutton10cockhead = page.radiobutton10cockmethod1();
							if (radiobutton10cockhead == (true)) {
								test.pass("TC:24 '10 MILES RADIO BUTTON' SHOULD BE CLICKABLE IN 'Mc CAFE STORES'");
							} else {
								test.fail("TC:24 '10 MILES RADIO BUTTON' SHOULD BE CLICKABLE IN 'Mc CAFE STORES'");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ "'10 MILES RADIO BUTTON' SHOULD BE CLICKABLE IN 'Mc CAFE STORES'");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}
						// CLICK radio button 20

						try {
							boolean radiobutton20cockhead = page.radiobutton20cockmethod1();
							if (radiobutton20cockhead == (true)) {
								test.pass("TC:25 '20 MILES RADIO BUTTON' SHOULD BE CLICKABLE IN 'Mc CAFE STORES'");
							} else {
								test.fail("TC:25 '20 MILES RADIO BUTTON' SHOULD BE CLICKABLE IN 'Mc CAFE STORES'");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ "'20 MILES RADIO BUTTON' SHOULD BE CLICKABLE IN 'Mc CAFE STORES'");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}
						// CLICK radio button 50

						try {
							boolean radiobutton50cockhead = page.radiobutton50cockmethod1();
							if (radiobutton50cockhead == (true)) {
								test.pass("TC:26 '50 MILES RADIO BUTTON' SHOULD BE CLICKABLE IN 'Mc CAFE STORES'");
								// check 20 miles radio buttoon
								boolean radiobutton20cockhead = page.radiobutton20cockmethod();
								if (!radiobutton20cockhead == (true)) {
									test.pass("TC: USER SHOULD NOT SELCT MULTIPLE RADIO BUTTONS");
								} else {
									test.fail("TC:25 USER SHOULD NOT SELCT MULTIPLE RADIO BUTTONS");
									test.fail(test.addScreenCaptureFromPath(
											Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
											+ "USER SHOULD NOT SELCT MULTIPLE RADIO BUTTONS");
								}
							} else {
								test.fail("TC:26 '50 MILES RADIO BUTTON' SHOULD BE CLICKABLE IN 'Mc CAFE STORES'");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ "'50 MILES RADIO BUTTON' SHOULD BE CLICKABLE IN 'Mc CAFE STORES'");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}
						// 5 RADIO BUTTON label
						try {
							String radiobutton5labelexcel = Excelreader.getData(0, 16, 5);
							String radiobutton5labelhead = page.radiobutton5labelmethod();
							if (radiobutton5labelhead.equals(radiobutton5labelexcel)) {
								test.pass("TC:27 VERIFY LABEL '5 RADIOBUTTON ' IS DISPLAYED");
							} else {
								test.fail("TC:27 VERIFY LABEL '5 RADIOBUTTON' IS DISPLAYED");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ "VERIFY LABEL '5 RADIOBUTTON' IS DISPLAYED");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}
						// 10 RADIO BUTTON label
						try {
							String radiobutton10labelexcel = Excelreader.getData(0, 17, 5);
							String radiobutton10labelhead = page.radiobutton10labelmethod();
							if (radiobutton10labelhead.equals(radiobutton10labelexcel)) {
								test.pass("TC:28 VERIFY LABEL '10 RADIOBUTTON ' IS DISPLAYED");
							} else {
								test.fail("TC:28 VERIFY LABEL '10 RADIOBUTTON' IS DISPLAYED");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ "VERIFY LABEL '10 RADIOBUTTON' IS DISPLAYED");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}
						// 20 RADIO BUTTON label
						try {
							String radiobutton20labelexcel = Excelreader.getData(0, 18, 5);
							String radiobutton20labelhead = page.radiobutton20labelmethod();
							if (radiobutton20labelhead.equals(radiobutton20labelexcel)) {
								test.pass("TC:29 VERIFY LABEL '20 RADIOBUTTON ' IS DISPLAYED");
							} else {
								test.fail("TC:29 VERIFY LABEL '20 RADIOBUTTON' IS DISPLAYED");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ "VERIFY LABEL '20 RADIOBUTTON' IS DISPLAYED");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}
						// 50 RADIO BUTTON label
						try {
							String radiobutton50labelexcel = Excelreader.getData(0, 19, 5);
							String radiobutton50labelhead = page.radiobutton50labelmethod();
							if (radiobutton50labelhead.equals(radiobutton50labelexcel)) {
								test.pass("TC:30 VERIFY LABEL '50 RADIOBUTTON ' IS DISPLAYED");
							} else {
								test.fail("TC:30 VERIFY LABEL '50 RADIOBUTTON' IS DISPLAYED");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ "VERIFY LABEL '50 RADIOBUTTON' IS DISPLAYED");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}
					} else {
						test.fail("TC:11 FILTER IS NOT WORKING ON COCK 'Mc CAFE STORES'");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
								+ "FILTER IS NOT WORKING ON 'Mc CAFE STORES'");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
			} else {
				test.fail("TC:5 SEARCH BUTTON IS NOT WORKING MAP VIEW");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
						+ "SEARCH BUTTON IS NOT WORKING FINE");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 4)
	public void List_view_Mc_Cafe_Stores() {
		Mc_Cafe_Store_Page page = new Mc_Cafe_Store_Page(driver);
		test = extent.createTest("List_view_Mc_Cafe_Stores");
		try {
			driver.get(Basepage.readProperty("urlmccs"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 5);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 Mc_Cafe_Stores URL IS OPENED");
			} else {
				test.fail("TC:1 Mc_Cafe_Stores URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
						+ "Mc_Cafe_Stores URL IS NOT OPENED");
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
			// search button
			String citystatesendedvaluexcel = Excelreader.getData(0, 4, 5);
			String searchbuttonhead = page.searchbuttonmethod(citystatesendedvaluexcel);
			if (!searchbuttonhead.equals("")) {
				test.pass("TC:5 SEARCH BUTTON IS WORKING FINE");
				// list view label
				try {
					String listviewlabelexcel = Excelreader.getData(0, 20, 5);
					String listviewlabelhead = page.listviewlabelmethod();
					if (listviewlabelhead.equals(listviewlabelexcel)) {
						test.pass("TC:31 VERIFY LABEL 'LIST VIEW' IS DISPLAYED");
					} else {
						test.fail("TC:31 VERIFY LABEL 'LIST VIEW' IS DISPLAYED");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
								+ "VERIFY LABEL 'LIST VIEW' IS DISPLAYED");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				// list view click
				try {
					String listviewclickexcel = Excelreader.getData(0, 21, 5);
					String listviewclickhead = page.listviewclickmethod();
					if (listviewclickhead.equals(listviewclickexcel)) {
						test.pass("TC:32 USER SHOULD BE CLICK ON LIST VIEW");
						// MAP VIEW LABEL
						try {
							String mapviewlabelexcel = Excelreader.getData(0, 22, 5);
							String mapviewlabelhead = page.mapviewlabelmethod();
							if (mapviewlabelhead.equals(mapviewlabelexcel)) {
								test.pass("TC:33 VERIFY LABEL 'MAP VIEW' IS DISPLAYED AFTER CLICK ON LIST VIEW");
							} else {
								test.fail("TC:33 VERIFY LABEL 'MAP VIEW' IS DISPLAYED AFTER CLICK ON LIST VIEW");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ "VERIFY LABEL 'MAP VIEW' IS DISPLAYED AFTER CLICK ON LIST VIEW");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}
						// LOAD MORE LABEL
						try {
							String loadmorelabelexcel = Excelreader.getData(0, 23, 5);
							String loadmorelabelhead = page.loadmorelabelmethod();
							if (loadmorelabelhead.equals(loadmorelabelexcel)) {
								test.pass("TC:34 VERIFY LABEL 'LOAD MORE' IS DISPLAYED ");
							} else {
								test.fail("TC:34 VERIFY LABEL ''LOAD MORE' IS DISPLAYED");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ "VERIFY LABEL ''LOAD MORE' IS DISPLAYED");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}
						// CLICK ON LOAD MORE
						try {
							String loadmoreclickexcel = Excelreader.getData(0, 24, 5);
							String loadmoreclickhead = page.loadmoreclickmethod();
							if (loadmoreclickhead.equals(loadmoreclickexcel)) {
								test.pass("TC:34 LOAD MORE MUTTON IS WORKING ON LIST VIEW");
							} else {
								test.fail("TC:34 LOAD MORE MUTTON IS NOT WORKING ON LIST VIEW");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ "LOAD MORE MUTTON IS NOT WORKING ON LIST VIEW");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}

						// GET DIRECTION label
						try {
							String getdirectionlabelexcel = Excelreader.getData(0, 7, 5);
							String getdirectionlabelhead = page.listviewgetdirectionlabelmethod();
							if (getdirectionlabelhead.equals(getdirectionlabelexcel)) {
								test.pass("TC:35 VERIFY LABEL 'GET DIRECTION' IS DISPLAYED");
							} else {
								test.fail("TC:35 VERIFY LABEL 'GET DIRECTION' IS DISPLAYED");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ "VERIFY LABEL 'GET DIRECTION' IS DISPLAYED");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}
						// GET DIRECTIONN BUTTON IS CLICKABLE OR NOT AND CANCLE BUTTON
						try {
							String getdirectionexcel = Excelreader.getData(0, 8, 5);
							String getdirectionhead = page.getdirectionclickmethod();
							if (getdirectionhead.equals(getdirectionexcel)) {
								test.pass("TC:35 'GET DIRECTION' LINK IS CLICKABLE ON LIST VIEW");
								// cancel button
								String ordermcdeliverylabelexcel1 = Excelreader.getData(0, 7, 5);
								String ordermcdeliverylabelhead1 = page.cancelbuttonmethod();
								if (ordermcdeliverylabelhead1.equals(ordermcdeliverylabelexcel1)) {
									test.pass(
											"TC:36 CANCEL BUTTON IS WORKING FINE AFTER CLICK ON 'GET DIRECTION' ON LIST VIEW ");
								} else {
									test.fail(
											"TC:36 CANCEL BUTTON IS NOT WORKING FINE AFTER CLICK ON 'GET DIRECTION' ON LIST VIEW");
									test.fail(test.addScreenCaptureFromPath(
											Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
											+ " CANCEL BUTTON IS NOT WORKING FINE AFTER CLICK ON 'GET DIRECTION' ON LIST VIEW");
								}
							} else {
								test.fail("TC:35 'GET DIRECTION' LINK IS NOT CLICKABLE ON LIST VIEW");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ " 'GET DIRECTION' LINK IS NOT CLICKABLE ON LIST VIEW");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}
					} else {
						test.fail("TC:32 USER SHOULD BE CLICK ON LIST VIEW");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
								+ "USER SHOULD BE CLICK ON LIST VIEW");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
			} else {
				test.fail("TC:5 SEARCH BUTTON IS NOT WORKING FINE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
						+ "SEARCH BUTTON IS NOT WORKING FINE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		///// get direction i working or not
		try {
			// search button
			String citystatesendedvaluexcel = Excelreader.getData(0, 4, 5);
			String searchbuttonhead = page.searchbuttonmethod1(citystatesendedvaluexcel);
			if (!searchbuttonhead.equals("")) {
				test.pass("TC:5 SEARCH BUTTON IS WORKING FINE");
				// list view click
				try {
					String listviewclickexcel = Excelreader.getData(0, 21, 5);
					String listviewclickhead = page.listviewclickmethod();
					if (listviewclickhead.equals(listviewclickexcel)) {
						test.pass("TC:32 USER SHOULD BE CLICK ON LIST VIEW");
						// GET DIRECTIONN BUTTON IS CLICKABLE OR NOT AND CANCLE BUTTON
						try {
							String getdirectionexcel = Excelreader.getData(0, 8, 5);
							String getdirectionhead = page.getdirectionclickmethod();
							if (getdirectionhead.equals(getdirectionexcel)) {
								test.pass("TC:35 'GET DIRECTION' LINK IS CLICKABLE ON LIST VIEW");
								// GET DIRECTION LINK WORKING OR NOT
								String getdirectiongettitleexcel = Excelreader.getData(0, 25, 5);
								String getdirectiongettitlehead = page.ubereatmethods();
								if (getdirectiongettitlehead.equals(getdirectiongettitleexcel)) {
									test.pass("TC:37 GET DIRECTION LINK IS OPEN ON LIST VIEW ");
								} else {
									test.fail("TC:37 GET DIRECTION LINK IS OPEN ON LIST VIEW");
									test.fail(test.addScreenCaptureFromPath(
											Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
											+ " GET DIRECTION LINK IS OPEN ON LIST VIEW");
								}
							} else {
								test.fail("TC:35 'GET DIRECTION' LINK IS NOT CLICKABLE ON LIST VIEW");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
										+ " 'GET DIRECTION' LINK IS NOT CLICKABLE ON LIST VIEW");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}
					} else {
						test.fail("TC:32 USER SHOULD BE CLICK ON LIST VIEW");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
								+ "USER SHOULD BE CLICK ON LIST VIEW");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
			} else {
				test.fail("TC:5 SEARCH BUTTON IS NOT WORKING FINE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Mc_Cafe_Stores"))
						+ "SEARCH BUTTON IS NOT WORKING FINE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());

		}

	}

}

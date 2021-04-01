package com.Mcd.qa.TestCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.McD.qa.Base.BaseTest;
import com.McD.qa.Extentreport.Extentreport;
import com.McD.qa.Pages.Basepage;
import com.McD.qa.Pages.Restaurant_Locator_Page;
import com.McD.qa.Utility.TestUtil;

import bsh.commands.dir;

public class Restaurant_Locator extends BaseTest {
	
	String excelpath=System.getProperty("user.dir");
    TestUtil Excelreader= new TestUtil(excelpath+ "/src/main/java/com/McD/qa/TestData/Restaurant_Locator.xls");	
	
    @Test(priority=1)
	public void Open_URL_Restautant_Locator() {
    	Restaurant_Locator_Page page= new Restaurant_Locator_Page(driver);
			 test=extent.createTest("Open_URL_Restautant_Locator");
			    
			    try {
			    	driver.get(Basepage.readProperty("urlRL"));
			    	String gettitle=page.generallgetpagetitlemethod();
					String gettitleexcel=Excelreader.getData(0, 1, 5);
					if(gettitle.equals(gettitleexcel)) {
				    	test.pass("TC:1 URL IS OPENED");
				    }else {
				    	test.fail("TC:1 URL IS NOT OPENED");
				    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
				    			"URL IS NOT OPENED");
				    	extent.flush();
						driver.close();
						throw new SkipException("Skipping - ");
				    }
					}catch (Exception e) {
						 test.fail("Error:"+ e.getMessage());
						 extent.flush();
						 driver.close();
						throw new SkipException("Skipping - ");
					}	    
 		}	
	
    @Test(priority=2)
   	public void Restautant_Address_Mapview() {
       	Restaurant_Locator_Page page= new Restaurant_Locator_Page(driver);
   			 test=extent.createTest("Restautant_Address_Mapview");
   //Locateme
   			 try {
					String locatemelabelhead=page.locatemelabelmethod(); 
					String locatemelabelexcel=Excelreader.getData(0, 3, 5);
					if(locatemelabelhead.equals(locatemelabelexcel)) {
				    	test.pass("TC:3 VERIFY LABEL 'LOCATE ME' IS DISPLAYED");
				    }else {
				    	test.fail("TC:3 VERIFY LABEL 'LOCATE ME' IS NOT DISPLAYED");
				    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
				    			"VERIFY LABEL 'LOCATE ME' IS DISPLAYED");
				    }
				 }catch (Exception e) {
					 test.fail("Error:"+ e.getMessage());
				}  
	

//send city or state
 try {
		String citystatesendedvaluexcel=Excelreader.getData(0, 6, 5);
	String citystatesendedvaluhead=	page.zipsendedvalumethod(citystatesendedvaluexcel);
		if(citystatesendedvaluhead.equals(citystatesendedvaluexcel)) {
	   	test.pass("TC:5 USER SHOULD BE ENTER CITY AND STATE");  
	   //ZIP, CITY, STATE label rolled up
	   	try {
	   	String zipcitystatelabelhead=page.zipcitystatelabelmethod1(); 
		String zipcitystatelabelexcel=Excelreader.getData(0, 2, 5);
		if(zipcitystatelabelhead.equals(zipcitystatelabelexcel)) {
	    	test.pass("TC:2 VERIFY LABEL 'ZIP, CITY, STATE' IS ROLLED UP");
	    }else {
	    	test.fail("TC:2 VERIFY LABEL 'ZIP, CITY, STATE' IS NOT ROLLED UP");
	    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	    			"VERIFY LABEL 'ZIP, CITY, STATE' IS NOT ROLLED UP");
	    } }catch (Exception e) {
			 test.fail("Error:"+ e.getMessage());
		} 
	// search button  
			String searchbuttonhead=page.searchbuttonmethod1();
				if(!searchbuttonhead.equals("")) {
			   	test.pass("TC:6 SEARCH BUTTON IS WORKING FINE");
			  //CLICK ON SEARCH AND DEIPLAY OR NOT NEAR ADDRESS MEANS ONE NUMBER ADDRESS
			   	try {
			   	String addressdisplayedexcel=Excelreader.getData(0, 8, 5);
				String addressdisplayedhead=page.addressdisplayed();
					if(addressdisplayedhead.equals(addressdisplayedexcel)) {
				   	test.pass("TC:7 ADDRESS SHOULD BE DISPLAYED NEAR BY TO OUR LOCATION"); 
					}else {
					   	test.fail("TC:7 ADDRESS SHOULD BE DISPLAYED NEAR BY TO OUR LOCATION");
					   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
					   			"ADDRESS SHOULD BE DISPLAYED NEAR BY TO ADDRESS");
					   } }catch (Exception e) {
							 test.fail("Error:"+ e.getMessage());
						} 
			//SELECT ADDRESS ON MAP
					try {
				   	String selectaddressonmapexcel=Excelreader.getData(0, 8, 5);
					String selectaddressonmaphead=page.selectaddressonmapmethod();
						if(selectaddressonmaphead.equals(selectaddressonmapexcel)) {
					   	test.pass("TC:8 USER SHOULD BE SELECT THE ADDRESS ON MAP");
						}else {
						   	test.fail("TC:8 USER SHOULD BE SELECT THE ADDRESS ON MAP");
						   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
						   			"USER SHOULD BE SELECT THE ADDRESS ON MAP");
						   }}catch (Exception e) {
							   test.fail("Error:"+ e.getMessage());	
						}
				/*//show hours label  
					try {
								String showhourslabelhead=page.showhourslabelmethod(); 
								String showhourslabelexcel=Excelreader.getData(0, 13, 5);
								if(showhourslabelhead.equals(showhourslabelexcel)) {
							    	test.pass("TC:13 VERIFY LABEL 'SHOW HOURS' IS DISPLAYED");
							    	
							    }else {
							    	test.fail("TC:13 VERIFY LABEL 'SHOW HOURS' IS NOT DISPLAYED");
							    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
							    			"VERIFY LABEL 'LOCATE ME' IS DISPLAYED");
							    } }catch (Exception e) {
									 test.fail("Error:"+ e.getMessage());
								} 
			   		// hours many vary on or around holidays label   
					try {
								String hoursmanyvaryonlabelhead=page.hoursmanyvaryonlabelmethod(); 
								String hoursmanyvaryonlabelexcel=Excelreader.getData(0, 14, 5);
								if(hoursmanyvaryonlabelhead.equals(hoursmanyvaryonlabelexcel)) {
							    	test.pass("TC:14 VERIFY LABEL 'HOURS MANY VARY ON OR AROUND HOLIDAYS' IS DISPLAYED");
							    	
							    }else {
							    	test.fail("TC:14 VERIFY LABEL 'HOURS MANY VARY ON OR AROUND HOLIDAYS' IS NOT DISPLAYED");
							    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
							    			"VERIFY LABEL 'HOURS MANY VARY ON OR AROUND HOLIDAYS ' IS DISPLAYED");
							    } }catch (Exception e) {
									 test.fail("Error:"+ e.getMessage());
								} */
			   /*	// After click on show hours and show hours label   
					try {
								String hidehourslabelhead=page.hidehourslabelmethod(); 
								String hidehourslabelexcel=Excelreader.getData(0, 15, 5);
								if(hidehourslabelhead.equals(hidehourslabelexcel)) {
							    	test.pass("TC:15 SHOW HOURS IS CLICKABLE AND VERIFY LABEL 'HIDE HOURS' IS DISPLAYED");
							//Restaurant lobby hours  
							    	try {
							    	String restaurantlobbyhourslabelhead=page.restaurantlobbyhourslabelmethod(); 
									String restaurantlobbyhourslabelexcel=Excelreader.getData(0, 16, 5);
									if(restaurantlobbyhourslabelhead.equals(restaurantlobbyhourslabelexcel)) {
								    	test.pass("TC:16  VERIFY LABEL 'RESTAURANT LOBBY HOURS' IS DISPLAYED");
								    	
								    }else {
								    	test.fail("TC:16  VERIFY LABEL 'RESTAURANT LOBBY HOURS' IS NOT DISPLAYED");
								    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
								    			" VERIFY LABEL 'RESTAURANT LOBBY HOURS' IS DISPLAYED");
								    } }catch (Exception e) {
										 test.fail("Error:"+ e.getMessage());
									} 
							//Monday and hours label
									try {
									String restaurantlobbymondayandhourslabelhead=page.restaurantlobbymondayandhourslabelmethod(); 
								//	String restaurantlobbymondayandhourslabelexcel=Excelreader.getData(0, 17, 5);
									if(!restaurantlobbymondayandhourslabelhead.equals("")) {
								    	test.pass("TC:17  VERIFY LABEL 'MONDAY AND OPEN 24 HOURS ON RESTAURANT LOBBY HOURS' IS DISPLAYED");
								    	
								    }else {
								    	test.fail("TC:17  VERIFY LABEL 'MONDAY AND OPEN 24 HOURS ON RESTAURANT LOBBY HOURS' IS NOT DISPLAYED");
								    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
								    			" VERIFY LABEL 'MONDAY AND OPEN 24 HOURS ON RESTAURANT LOBBY HOURS' IS DISPLAYED");
								    } }catch (Exception e) {
										 test.fail("Error:"+ e.getMessage());
									} 
					   //drive thru hours  
									try {
									String drivethruhourslabelhead=page.drivethruhourslabelmethod(); 
									String drivethruhourslabelexcel=Excelreader.getData(0, 18, 5);
									if(drivethruhourslabelhead.equals(drivethruhourslabelexcel)) {
								    	test.pass("TC:18  VERIFY LABEL 'DRIVE THRU HOURS' IS DISPLAYED");
								    	
								    }else {
								    	test.fail("TC:18  VERIFY LABEL 'DRIVE THRU HOURS' IS NOT DISPLAYED");
								    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
								    			" VERIFY LABEL 'DRIVE THRU HOURS' IS DISPLAYED");
								    }	
									 }catch (Exception e) {
										 test.fail("Error:"+ e.getMessage());
									} 
								}*/
									
						 /*//weeks and hours label on drive thru hours  
									try {
									String drivethruhoursmondayhourslabelhead=page.drivethruhoursmondayhourslabelmethod(); 
									if(!drivethruhoursmondayhourslabelhead.equals("")) {
								    	test.pass("TC:19  VERIFY LABEL 'WEEK AND HOURS ON DRIVE THRU HOURS' IS DISPLAYED");
								    	
								    }else {
								    	test.fail("TC:19  VERIFY LABEL 'WEEK AND HOURS ON DRIVE THRU HOURS' IS NOT DISPLAYED");
								    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
								    			" VERIFY LABEL 'WEEK AND HOURS ON DRIVE THRU HOURS' IS DISPLAYED");
								    }	   }catch (Exception e) {
										 test.fail("Error:"+ e.getMessage());
									}   	
							    }else {
							    	test.fail("TC:15 SHOW HOURS IS CLICKABLE AND VERIFY LABEL 'HIDE HOURS' IS NOT DISPLAYED");
							    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
							    			"SHOW HOURS IS CLICKABLE AND VERIFY LABEL 'HIDE HOURS' IS DISPLAYED");
							    } }catch (Exception e) {
									 test.fail("Error:"+ e.getMessage());
								} */
						
						/* //show services label
								try {
						   			String showserverlabelhead=page.showserverlabelmethod();
									String showserverlabelexcel=Excelreader.getData(0, 20, 5);
									if(showserverlabelhead.equals(showserverlabelexcel)) {
								    	test.pass("TC:20  VERIFY LABEL 'SHOW SERVICES' IS DISPLAYED");
								    	
								    }else {
								    	test.fail("TC:20  VERIFY LABEL 'SHOW SERVICES' IS NOT DISPLAYED");
								    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
								    			" VERIFY LABEL 'SHOW SERVICES' IS DISPLAYED");
								    } }catch (Exception e) {
										 test.fail("Error:"+ e.getMessage());
									} 
						  //hide services label    
						   		try {
						   			String hideserviceslabelhead=page.hideserviceslabelmethod(); 
									String hideserviceslabelexcel=Excelreader.getData(0, 21, 5);
									if(hideserviceslabelhead.equals(hideserviceslabelexcel)) {
								    	test.pass("TC:21  SHOW SERVICE IS CLICKABLE AND VERIFY LABEL 'HIDE SERVICES' IS DISPLAYED");
								    	
								    	//McDelivery label
								        try {
								        String McDeliveryonhideserviceslabelhead=page.McDeliveryonhideserviceslabelmethod(); 
								    String McDeliveryonhideserviceslabelexcel=Excelreader.getData(0, 22, 5);
								    if(McDeliveryonhideserviceslabelhead.equals(McDeliveryonhideserviceslabelexcel)) {
								        test.pass("TC:22  VERIFY LABEL 'McDELIVERY ON HIDE SERVICES' IS DISPLAYED");
								       }else {
								        test.fail("TC:22 VERIFY LABEL 'McDELIVERY ON HIDE SERVICES' IS NOT DISPLAYED");
								        test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
								        " VERIFY LABEL 'McDELIVERY ON HIDE SERVICES' IS DISPLAYED");
								       } }catch (Exception e) {
								    test.fail("Error:"+ e.getMessage());
								    } 
								    //image of McDelivery 
								    try {
								    String imageofmcdeliveryhead= page.imageofmcdeliverymethod();
								    String imageofmcdeliveryexcel=Excelreader.getData(0, 23, 5);
								    if(imageofmcdeliveryhead.equals(imageofmcdeliveryexcel)) {
								    test.pass("TC:23 McDELIVERY IMAGE IS DISPLAYED");
								    }
								    else {
								    test.fail("TC:23 McDELIVERY IMAGE IS DISPLAYED");
								    test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
								    "McDELIVERY IMAGE IS DISPLAYED");
								    } }catch (Exception e) {
								    test.fail("Error:"+ e.getMessage());
								    } 
	    	
							//wifi label
								    	try {
								    	String wifionhideserviceslabelhead=page.wifionhideserviceslabelmethod(); 
										String wifionhideserviceslabelexcel=Excelreader.getData(0, 24, 5);
										if(wifionhideserviceslabelhead.equals(wifionhideserviceslabelexcel)) {
									    	test.pass("TC:22  VERIFY LABEL 'WIFI ON HIDE SERVICES' IS DISPLAYED");
									    }else {
									    	test.fail("TC:22 VERIFY LABEL 'WIFI ON HIDE SERVICES' IS NOT DISPLAYED");
									    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
									    			" VERIFY LABEL 'WIFI ON HIDE SERVICES' IS DISPLAYED");
									    } }catch (Exception e) {
											 test.fail("Error:"+ e.getMessage());
										} 
							//image of Wifi
										try {
											String imageofwifihead= page.imageofwifimethod();
											String imageofwifiexcel=Excelreader.getData(0, 25, 5);
											if(imageofwifihead.equals(imageofwifiexcel)) {
											 		 test.pass("TC:23 WIFI IMAGE IS DISPLAYED");
											}
											else {
												test.fail("TC:23 WIFI IMAGE IS DISPLAYED");
											 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
											 				"WIFI IMAGE IS DISPLAYED");
											} }catch (Exception e) {
												 test.fail("Error:"+ e.getMessage());
											}*/ 
							/*//INDOOR DINING label
											try {
								    	String indoordiningonhideservicelabelhead=page.indoordiningonhideservicelabelmethod(); 
										String indoordiningonhideservicelabelexcel=Excelreader.getData(0, 24, 5);
										if(indoordiningonhideservicelabelhead.equals(indoordiningonhideservicelabelexcel)) {
									    	test.pass("TC:24  VERIFY LABEL 'INDOOR DINING ON HIDE SERVICES' IS DISPLAYED");
									    }else {
									    	test.fail("TC:24 VERIFY LABEL 'INDOOR DINING ON HIDE SERVICES' IS NOT DISPLAYED");
									    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
									    			" VERIFY LABEL 'INDOOR DINING ON HIDE SERVICES' IS DISPLAYED");
									    }	 }catch (Exception e) {
											 test.fail("Error:"+ e.getMessage());
										}     	
								    	
							//image of indoor dining 
										try {
										String imageofindoordininghead= page.imageofindoordiningmethod();
										String imageofindoordiningexcel=Excelreader.getData(0, 25, 5);
										if(imageofindoordininghead.equals(imageofindoordiningexcel)) {
										 		 test.pass("TC:25 INDOOR DINING IMAGE IS DISPLAYED");
										}
										else {
											test.fail("TC:25 INDOOR DINING IMAGE IS DISPLAYED");
										 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
										 				"INDOOR DINING IMAGE IS DISPLAYED");
										}	 }catch (Exception e) {
											 test.fail("Error:"+ e.getMessage());
										} 
							 //close button 
										String closebuttonexcel=Excelreader.getData(0, 6, 5);
										String closebuttonhead=	page.closebuttonmethod();
											if(!closebuttonhead.equals(closebuttonexcel)) {
										   	test.pass("TC:5 SEARCH CLOSE BUTTON IS WORKING FINE");
											 }else {
											    	test.fail("TC:2 SEARCH CLOSE BUTTON IS WORKING FINE");
											    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
											    			"SEARCH CLOSE BUTTON IS WORKING FINE");
											    }
								    }else {
								    	test.fail("TC:21 SHOW SERVICE IS CLICKABLE AND VERIFY LABEL 'HIDE SERVICES' IS NOT DISPLAYED");
								    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
								    			" SHOW SERVICE IS CLICKABLE AND VERIFY LABEL 'HIDE SERVICES' IS DISPLAYED");
								    } }catch (Exception e) {
										 test.fail("Error:"+ e.getMessage());
									} */
				}else {
				   	test.fail("TC:6 SEARCH BUTTON IS NOT WORKING FINE");
				   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
				   			"SEARCH BUTTON IS NOT WORKING FINE");
				   }
		  }else {
			   	test.fail("TC:5 USER SHOULD BE SEND CITY AND STATE");
			   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
			   			"USER SHOULD BE SEND CITY AND STATE");
			   }
	}catch (Exception e) {
		 test.fail("Error:"+ e.getMessage());
	}	
 
    }	

    @Test(priority=3)
   	public void Show_More_Restaurant_Locator() {  
       	Restaurant_Locator_Page page= new Restaurant_Locator_Page(driver);
   			 test=extent.createTest("Show_More_Restaurant_Locator");   
   		  try {
		    	driver.get(Basepage.readProperty("urlRL"));
		    	String gettitle=page.generallgetpagetitlemethod();
				String gettitleexcel=Excelreader.getData(0, 1, 5);
				if(gettitle.equals(gettitleexcel)) {
			    	test.pass("TC:1 URL IS OPENED");
			    }else {
			    	test.fail("TC:1 URL IS NOT OPENED");
			    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
			    			"URL IS NOT OPENED");
			    	extent.flush();
					driver.close();
					throw new SkipException("Skipping - ");
			    }
				}catch (Exception e) {
					 test.fail("Error:"+ e.getMessage());
					 extent.flush();
					 driver.close();
					throw new SkipException("Skipping - ");
				}	
   			 try {
 		    	// search button  
 					String searchbuttonexcel=Excelreader.getData(0, 6, 5);
 					String searchbuttonhead=page.searchbuttonmethod(searchbuttonexcel);
 						if(!searchbuttonhead.equals("")) {
 					   	test.pass("TC:6 SEARCH BUTTON IS WORKING FINE"); 
 					   	
 					 //show more label
 			   			try {
 							String showmorelabelhead=page.showmorelabelmethod(); 
 							String showmorelabelexcel=Excelreader.getData(0, 4, 5);
 							if(showmorelabelhead.equals(showmorelabelexcel)) {
 						    	test.pass("TC:4 VERIFY LABEL 'SHOW MORE' IS DISPLAYED");
 						    	
 						    }else {
 						    	test.fail("TC:4 VERIFY LABEL 'SHOW MORE' IS NOT DISPLAYED");
 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
 						    			"VERIFY LABEL 'SHOW MORE' IS DISPLAYED");
 						    }
 						 }catch (Exception e) {
 							 test.fail("Error:"+ e.getMessage());
 						} 					   	
   //	McDonald filter heading			   	
 			   		try {
							String mcdresultheadingfilterhead=page.mcdresultheadingfiltermethod(); 
							if(!mcdresultheadingfilterhead.equals("")) {
						    	test.pass("TC:36 VERIFY LABEL 'McDONALDS FILTE HEADING OR MESSAGE' IS DISPLAYED");
				//SHOW MORE FILTER 
						    	String showmorefilterhead=page.showmorefiltermethod(); 
	 							String showmorefilterexcel=Excelreader.getData(0, 31, 5);
	 							if(showmorefilterhead.equals(showmorefilterexcel)) {
	 						    	test.pass("TC:37 SHOW MORE FILTER IS WORKING");
	 			//McDelivery
	 						    	try {
	 						    	String mcdelivarylabelhead=page.mcdelivarylabelmethod(); 
	 	 							String mcdelivarylabelexcel=Excelreader.getData(0, 31, 5);
	 	 							if(mcdelivarylabelhead.equals(mcdelivarylabelexcel)) {
	 	 						    	test.pass("TC:38 VERIFY LABEL 'McDELIVERY' IS DISPLAYED");
	 	 						    }else {
	 	 						    	test.fail("TC:38 VERIFY LABEL 'McDELIVERY' IS NOT DISPLAYED");
	 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 						    			"VERIFY LABEL 'McDELIVERY' IS DISPLAYED");
	 	 						    }    }catch (Exception e) {
	 	 								test.fail("Error:"+ e.getMessage());
	 	 								
	 	 							}	
	 			//mcdelivery check box
	 	 							try {
	 	 								String mcdeliverycheckboxhead= page.mcdeliverycheckboxmethod();
	 	 								if(!mcdeliverycheckboxhead.equals("true")) {
	 	 								 		 test.pass("TC:38 McDELIVERY CHECK BOX SHOULD NOT SELECTED BY DEFAULT");
	 	 								}
	 	 								else {
	 	 									test.fail("TC:38 McDELIVERY CHECK BOX SHOULD NOT SELECTED BY DEFAULT");
	 	 								 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 								 				"McDELIVERY CHECK BOX SHOULD NOT SELECTED BY DEFAULT");
	 	 								}
	 	 							}catch (Exception e) {
	 	 								test.fail("Error:"+ e.getMessage());
	 	 								
	 	 							}		
	 	 		//SELECT mcdelivery check box  
	 	 							try {
	 	 								String mcdeliverycheckboxhead= page.mcdeliverycheckboxmethod1();
	 	 								if(mcdeliverycheckboxhead.equals("true")) {
	 	 								 		 test.pass("TC:38 McDELIVERY CHECK BOX SHOULD BE SELECT");
	 	 								 	//reset button displayed or not 
	 	 								 		String resetbuttonlabelhead=page.resetbuttonlabelmethod(); 
	 	 		 	 							String resetbuttonlabelexcel=Excelreader.getData(0, 32, 5);
	 	 		 	 							if(resetbuttonlabelhead.equals(resetbuttonlabelexcel)) {
	 	 		 	 						    	test.pass("TC:38 USER SHOULD BE FILTER SERVICES BY SELECT McDELIVERY CHECKBOX");
	 	 		 	 						    }else {
	 	 		 	 						    	test.fail("TC:38 USER SHOULD BE FILTER SERVICES BY SELECT McDELIVERY CHECKBOX");
	 	 		 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 		 	 						    			"USER SHOULD BE FILTER SERVICES BY SELECT McDELIVERY CHECKBOX");
	 	 		 	 						    } 
	 	 								}
	 	 								else {
	 	 									test.fail("TC:38 McDELIVERY CHECK BOX SHOULD BE SELECT");
	 	 								 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 								 				"McDELIVERY CHECK BOX SHOULD BE SELECT");
	 	 								}
	 	 							}catch (Exception e) {
	 	 								test.fail("Error:"+ e.getMessage());
	 	 								
	 	 							}			    	
	 						    	
	      //WIFI LABEL    
	 	 							try {
	 	 							String wififilterlabelhead=page.wififilterlabelmethod(); 
	 	 							String wififilterlabelexcel=Excelreader.getData(0, 33, 5);
	 	 							if(wififilterlabelhead.equals(wififilterlabelexcel)) {
	 	 						    	test.pass("TC:39 VERIFY LABEL 'WIFI' IS DISPLAYED");
	 	 						    }else {
	 	 						    	test.fail("TC:39 VERIFY LABEL 'WIFI' IS NOT DISPLAYED");
	 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 						    			"VERIFY LABEL 'WIFI' IS DISPLAYED");
	 	 						    }  }catch (Exception e) {
	 	 								test.fail("Error:"+ e.getMessage());
	 	 								
	 	 							}				
	 	 			//WIFI check box
	 	 							try {
	 	 								String wificheckboxhead= page.wificheckboxmethod();
	 	 								if(!wificheckboxhead.equals("true")) {
	 	 								 		 test.pass("TC:39 WIFI CHECK BOX SHOULD NOT SELECTED BY DEFAULT");
	 	 								}
	 	 								else {
	 	 									test.fail("TC:39 WIFI CHECK BOX SHOULD NOT SELECTED BY DEFAULT");
	 	 								 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 								 				"WIFI CHECK BOX SHOULD NOT SELECTED BY DEFAULT");
	 	 								}
	 	 							}catch (Exception e) {
	 	 								test.fail("Error:"+ e.getMessage());
	 	 								
	 	 							} 							
	 	 		//SELECT WIFI check box  
	 	 							try {
	 	 								String wificheckboxhead1= page.wificheckboxmethod1();
	 	 								if(wificheckboxhead1.equals("true")) {
	 	 								 		 test.pass("TC:39 WIFI CHECK BOX SHOULD BE SELECT");
	 	 								 	//reset button displayed or not 
	 	 								 		String resetbuttonlabelhead=page.resetbuttonlabelmethod(); 
	 	 		 	 							String resetbuttonlabelexcel=Excelreader.getData(0, 32, 5);
	 	 		 	 							if(resetbuttonlabelhead.equals(resetbuttonlabelexcel)) {
	 	 		 	 						    	test.pass("TC:39 USER SHOULD BE FILTER SERVICES BY SELECT WIFI CHECKBOX");
	 	 		 	 						    }else {
	 	 		 	 						    	test.fail("TC:39 USER SHOULD BE FILTER SERVICES BY SELECT WIFI CHECKBOX");
	 	 		 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 		 	 						    			"USER SHOULD BE FILTER SERVICES BY SELECT WIFI CHECKBOX");
	 	 		 	 						    } 
	 	 								}
	 	 								else {
	 	 									test.fail("TC:39 WIFI CHECK BOX SHOULD BE SELECT");
	 	 								 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 								 				"WIFI CHECK BOX SHOULD BE SELECT");
	 	 								}
	 	 							}catch (Exception e) {
	 	 								test.fail("Error:"+ e.getMessage());
	 	 								
	 	 							}	 							
	 	 							
	 	 		 //indoor dining  LABEL 
	 	 							try {
	 	 							String indoordiningsfilterlabelhead=page.indoordiningsfilterlabelmethod(); 
	 	 							String indoordiningsfilterlabelexcel=Excelreader.getData(0, 34, 5);
	 	 							if(indoordiningsfilterlabelhead.equals(indoordiningsfilterlabelexcel)) {
	 	 						    	test.pass("TC:40 VERIFY LABEL 'INDOOR DINING' IS DISPLAYED");
	 	 						    }else {
	 	 						    	test.fail("TC:40 VERIFY LABEL 'INDOOR DINING' IS NOT DISPLAYED");
	 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 						    			"VERIFY LABEL 'INDOOR DINING' IS DISPLAYED");
	 	 						    } 
	 	 							}catch (Exception e) {
	 	 								test.fail("Error:"+ e.getMessage());
	 	 								
	 	 							}
	 	 		//indoor dining check box
	 	 							try {
	 	 								String indoordiningcheckboxhead= page.indoordiningcheckboxmethod();
	 	 								if(!indoordiningcheckboxhead.equals("true")) {
	 	 								 		 test.pass("TC:40 INDOOR DINING CHECK BOX SHOULD NOT SELECTED BY DEFAULT");
	 	 								}
	 	 								else {
	 	 									test.fail("TC:40 INDOOR DINING CHECK BOX SHOULD NOT SELECTED BY DEFAULT");
	 	 								 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 								 				"INDOOR DINING CHECK BOX SHOULD NOT SELECTED BY DEFAULT");
	 	 								}
	 	 							}catch (Exception e) {
	 	 								test.fail("Error:"+ e.getMessage());
	 	 							}						
	 	 		//SELECT indoor dining check box  
	 	 							try {
	 	 								String indoordiningcheckboxhead1= page.indoordiningcheckboxmethod1();
	 	 								if(indoordiningcheckboxhead1.equals("true")) {
	 	 								 		 test.pass("TC:40 INDOOR DINING CHECK BOX SHOULD BE SELECT");
	 	 								 //FILTER THE Services BY SELECT INDOOR DINING CHECK BOX
	 	 								 		String mcdresultheadingfilterhead1=page.mcdresultheadingfiltermethod();
	 	 								 		String mcdresultheadingfilterexcel1=Excelreader.getData(0, 35, 5);
	 	 										if(!mcdresultheadingfilterhead1.equals(mcdresultheadingfilterexcel1)) {
	 	 									    	test.pass("TC:40 USER SHOULD BE FILTER SERVICES BY SELECT INDOOR DINING CHECKBOX");
	 	 		 	 						    }else {
	 	 		 	 						    	test.fail("TC:40 USER SHOULD BE FILTER SERVICES BY SELECT INDOOR DINING CHECKBOX");
	 	 		 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 		 	 						    			"USER SHOULD BE FILTER SERVICES BY SELECT INDOOR DINING CHECKBOX");
	 	 		 	 						    } 
	 	 								}
	 	 								else {
	 	 									test.fail("TC:40 INDOOR DINING CHECK BOX SHOULD BE SELECT");
	 	 								 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 								 				"INDOOR DINING CHECK BOX SHOULD BE SELECT");
	 	 								}
	 	 							}catch (Exception e) {
	 	 								test.fail("Error:"+ e.getMessage());
	 	 								
	 	 							}	 	 							
	 	 							
	 	 	//drive thru label					
	 	 							try {
		 	 							String drivethrufilterlabelhead=page.drivethrufilterlabelmethod(); 
		 	 							String drivethrufilterlabelexcel=Excelreader.getData(0, 36, 5);
		 	 							if(drivethrufilterlabelhead.equals(drivethrufilterlabelexcel)) {
		 	 						    	test.pass("TC:41 VERIFY LABEL 'DRIVE THRU' IS DISPLAYED");
		 	 						    }else {
		 	 						    	test.fail("TC:41 VERIFY LABEL 'DRIVE THRU' IS NOT DISPLAYED");
		 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
		 	 						    			"VERIFY LABEL 'DRIVE THRU' IS DISPLAYED");
		 	 						    } 
		 	 							}catch (Exception e) {
		 	 								test.fail("Error:"+ e.getMessage());
		 	 								
		 	 							}		    	
	 	 		//DRIVE THRU check box
	 	 							try {
	 	 								String drivethrucheckboxhead= page.drivethrucheckboxmethod();
	 	 								if(!drivethrucheckboxhead.equals("true")) {
	 	 								 		 test.pass("TC:41 DRIVE THRU CHECK BOX SHOULD NOT SELECTED BY DEFAULT");
	 	 								}
	 	 								else {
	 	 									test.fail("TC:41 DRIVE THRU CHECK BOX SHOULD NOT SELECTED BY DEFAULT");
	 	 								 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 								 				"DRIVE THRU CHECK BOX SHOULD NOT SELECTED BY DEFAULT");
	 	 								}
	 	 							}catch (Exception e) {
	 	 								test.fail("Error:"+ e.getMessage());
	 	 							}				    	
	 						    	
	 	 		//SELECT drive thru check box  
	 	 							try {
	 	 								String drivethrucheckboxhead1= page.drivethrucheckboxmethod1();
	 	 								if(drivethrucheckboxhead1.equals("true")) {
	 	 								 		 test.pass("TC:41 DRIVE THRU CHECK BOX SHOULD BE SELECT");
	 	 								 //FILTER THE Services BY SELECT INDOOR DINING CHECK BOX
	 	 								 		String mcdresultheadingfilterhead1=page.mcdresultheadingfiltermethod();
	 	 								 		String mcdresultheadingfilterexcel1=Excelreader.getData(0, 35, 5);
	 	 										if(!mcdresultheadingfilterhead1.equals(mcdresultheadingfilterexcel1)) {
	 	 									    	test.pass("TC:41 USER SHOULD BE FILTER SERVICES BY SELECT  DRIVE THRU CHECKBOX");
	 	 		 	 						    }else {
	 	 		 	 						    	test.fail("TC:41 USER SHOULD BE FILTER SERVICES BY SELECT  DRIVE THRU CHECKBOX");
	 	 		 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 		 	 						    			"USER SHOULD BE FILTER SERVICES BY SELECT  DRIVE THRU CHECKBOX");
	 	 		 	 						    } 
	 	 								}
	 	 								else {
	 	 									test.fail("TC:41 DRIVE THRU CHECK BOX SHOULD BE SELECT");
	 	 								 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 								 				"DRIVE THRU CHECK BOX SHOULD BE SELECT");
	 	 								}
	 	 							}catch (Exception e) {
	 	 								test.fail("Error:"+ e.getMessage());
	 	 								
	 	 							}				    	
	 	/*//DRIVE THRU COFFEE	label			    	
	 	 							try {
		 	 							String drivethrucoffeefilterlabelhead=page.drivethrucoffeefilterlabelmethod(); 
		 	 							String drivethrucoffeefilterlabelexcel=Excelreader.getData(0, 37, 5);
		 	 							if(drivethrucoffeefilterlabelhead.equals(drivethrucoffeefilterlabelexcel)) {
		 	 						    	test.pass("TC:42 VERIFY LABEL 'DRIVE THRU COFFEE' IS DISPLAYED");
		 	 						    }else {
		 	 						    	test.fail("TC:42 VERIFY LABEL 'DRIVE THRU COFFEE' IS NOT DISPLAYED");
		 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
		 	 						    			"VERIFY LABEL 'DRIVE THRU COFFEE' IS DISPLAYED");
		 	 						    } 
		 	 							}catch (Exception e) {
		 	 								test.fail("Error:"+ e.getMessage());
		 	 								
		 	 							}		    	
	 	 			//DRIVE THRU coffee check box
	 	 							try {
	 	 								String drivethrucoffeecheckboxhead= page.drivethrucoffeecheckboxmethod();
	 	 								if(!drivethrucoffeecheckboxhead.equals("true")) {
	 	 								 		 test.pass("TC:42 DRIVE THRU COFFEE CHECK BOX SHOULD NOT SELECTED BY DEFAULT");
	 	 								}
	 	 								else {
	 	 									test.fail("TC:42 DRIVE THRU COFFEE CHECK BOX SHOULD NOT SELECTED BY DEFAULT");
	 	 								 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 								 				"DRIVE THRU COFFEE CHECK BOX SHOULD NOT SELECTED BY DEFAULT");
	 	 								}
	 	 							}catch (Exception e) {
	 	 								test.fail("Error:"+ e.getMessage());
	 	 							}					    	
	 	 			//SELECT drive thru COFFEE check box  
	 	 							try {
	 	 								String drivethrucoffeecheckboxheae1= page.drivethrucoffeecheckboxmethod1();
	 	 								if(drivethrucoffeecheckboxheae1.equals("true")) {
	 	 								 		 test.pass("TC:42 DRIVE THRU COFFEE CHECK BOX SHOULD BE SELECT");
	 	 								 //FILTER THE Services BY SELECT INDOOR DINING CHECK BOX
	 	 								 		String mcdresultheadingfilterhead1=page.mcdresultheadingfiltermethod();
	 	 								 		String mcdresultheadingfilterexcel1=Excelreader.getData(0, 35, 5);
	 	 										if(!mcdresultheadingfilterhead1.equals(mcdresultheadingfilterexcel1)) {
	 	 									    	test.pass("TC:42 USER SHOULD BE FILTER SERVICES BY SELECT  DRIVE THRU COFFEE CHECKBOX");
	 	 		 	 						    }else {
	 	 		 	 						    	test.fail("TC:42 USER SHOULD BE FILTER SERVICES BY SELECT  DRIVE THRU COFFEE CHECKBOX");
	 	 		 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 		 	 						    			"USER SHOULD BE FILTER SERVICES BY SELECT  DRIVE THRU COFFEE CHECKBOX");
	 	 		 	 						    } 
	 	 								}
	 	 								else {
	 	 									test.fail("TC:42 DRIVE THRU COFFEE CHECK BOX SHOULD BE SELECT");
	 	 								 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 								 				"DRIVE THRU COFFEE CHECK BOX SHOULD BE SELECT");
	 	 								}
	 	 							}catch (Exception e) {
	 	 								test.fail("Error:"+ e.getMessage());
	 	 								
	 	 							}				    	*/
	 	//indoor playground label
	 	 							
	 	 							try {
		 	 							String indoorplaygroundfilterlabelhead=page.indoorplaygroundfilterlabelmethod(); 
		 	 							String indoorplaygroundfilterlabelexcel=Excelreader.getData(0, 38, 5);
		 	 							if(indoorplaygroundfilterlabelhead.equals(indoorplaygroundfilterlabelexcel)) {
		 	 						    	test.pass("TC:43 VERIFY LABEL 'INDOOR PLAYGROUND' IS DISPLAYED");
		 	 						    }else {
		 	 						    	test.fail("TC:43 VERIFY LABEL 'INDOOR PLAYGROUND' IS NOT DISPLAYED");
		 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
		 	 						    			"VERIFY LABEL 'INDOOR PLAYGROUND' IS DISPLAYED");
		 	 						    } 
		 	 							}catch (Exception e) {
		 	 								test.fail("Error:"+ e.getMessage());
		 	 								
		 	 							}	    	
	 						    	
	 	 	//indoor playground check box
	 	 							try {
	 	 								String indoorplaygroundcheckboxhead= page.indoorplaygroundcheckboxmethod();
	 	 								if(!indoorplaygroundcheckboxhead.equals("true")) {
	 	 								 		 test.pass("TC:43 INDOOR PLAYGROUND CHECK BOX SHOULD NOT SELECTED BY DEFAULT");
	 	 								}
	 	 								else {
	 	 									test.fail("TC:43 INDOOR PLAYGROUND CHECK BOX SHOULD NOT SELECTED BY DEFAULT");
	 	 								 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 								 				"INDOOR PLAYGROUND CHECK BOX SHOULD NOT SELECTED BY DEFAULT");
	 	 								}
	 	 							}catch (Exception e) {
	 	 								test.fail("Error:"+ e.getMessage());
	 	 							}					    	
	 						    	
	 	 			//SELECT INDOOR PLAYGROUND check box  
	 	 							try {
	 	 								String indoorplaygroundcheckboxhead1= page.indoorplaygroundcheckboxmethod1();
	 	 								if(indoorplaygroundcheckboxhead1.equals("true")) {
	 	 								 		 test.pass("TC:43 INDOOR PLAYGROUND CHECK BOX SHOULD BE SELECT");
	 	 								 //FILTER THE Services BY SELECT INDOOR DINING CHECK BOX
	 	 								 		String mcdresultheadingfilterhead1=page.mcdresultheadingfiltermethod();
	 	 								 		String mcdresultheadingfilterexcel1=Excelreader.getData(0, 35, 5);
	 	 										if(!mcdresultheadingfilterhead1.equals(mcdresultheadingfilterexcel1)) {
	 	 									    	test.pass("TC:43 USER SHOULD BE FILTER SERVICES BY SELECT INDOOR PLAYGROUND CHECKBOX");
	 	 		 	 						    }else {
	 	 		 	 						    	test.fail("TC:43 USER SHOULD BE FILTER SERVICES BY SELECT INDOOR PLAYGROUND CHECKBOX");
	 	 		 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 		 	 						    			"USER SHOULD BE FILTER SERVICES BY SELECT INDOOR PLAYGROUND CHECKBOX");
	 	 		 	 						    } 
	 	 								}
	 	 								else {
	 	 									test.fail("TC:43 INDOOR PLAYGROUND CHECK BOX SHOULD BE SELECT");
	 	 								 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 								 				"INDOOR PLAYGROUND CHECK BOX SHOULD BE SELECT");
	 	 								}
	 	 							}catch (Exception e) {
	 	 								test.fail("Error:"+ e.getMessage());
	 	 								
	 	 							}					    	
	 			//outdoor activity label
	 	 							try {
		 	 							String outdooractivityfilterlabelhead=page.outdooractivityfilterlabelmethod(); 
		 	 							String outdooractivityfilterlabelexcel=Excelreader.getData(0, 39, 5);
		 	 							if(outdooractivityfilterlabelhead.equals(outdooractivityfilterlabelexcel)) {
		 	 						    	test.pass("TC:44 VERIFY LABEL 'OUTDOOR ACTIVITY' IS DISPLAYED");
		 	 						    }else {
		 	 						    	test.fail("TC:44 VERIFY LABEL 'OUTDOOR ACTIVITY' IS NOT DISPLAYED");
		 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
		 	 						    			"VERIFY LABEL 'OUTDOOR ACTIVITY' IS DISPLAYED");
		 	 						    } 
		 	 							}catch (Exception e) {
		 	 								test.fail("Error:"+ e.getMessage());
		 	 								
		 	 							}						
	 	 		//outdoor activity check box
	 	 							try {
	 	 								String outdooractivitycheckboxhead= page.outdooractivitycheckboxmethod();
	 	 								if(!outdooractivitycheckboxhead.equals("true")) {
	 	 								 		 test.pass("TC:44 OUTDOOR ACTIVITY CHECK BOX SHOULD NOT SELECTED BY DEFAULT");
	 	 								}
	 	 								else {
	 	 									test.fail("TC:44 OUTDOOR ACTIVITY CHECK BOX SHOULD NOT SELECTED BY DEFAULT");
	 	 								 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 								 				"OUTDOOR ACTIVITY CHECK BOX SHOULD NOT SELECTED BY DEFAULT");
	 	 								}
	 	 							}catch (Exception e) {
	 	 								test.fail("Error:"+ e.getMessage());
	 	 							}					    	
	 	 		//SELECT outdoor activity check box  
	 	 							try {
	 	 								String outdooractivitycheckboxhead1= page.outdooractivitycheckboxmethod1();
	 	 								if(outdooractivitycheckboxhead1.equals("true")) {
	 	 								 		 test.pass("TC:44 OUTDOOR ACTIVITY CHECK BOX SHOULD BE SELECT");
	 	 								 //FILTER THE Services BY SELECT INDOOR DINING CHECK BOX
	 	 								 		String mcdresultheadingfilterhead1=page.mcdresultheadingfiltermethod();
	 	 								 		String mcdresultheadingfilterexcel1=Excelreader.getData(0, 35, 5);
	 	 										if(!mcdresultheadingfilterhead1.equals(mcdresultheadingfilterexcel1)) {
	 	 									    	test.pass("TC:44 USER SHOULD BE FILTER SERVICES BY SELECT OUTDOOR ACTIVITY CHECKBOX");
	 	 		 	 						    }else {
	 	 		 	 						    	test.fail("TC:44 USER SHOULD BE FILTER SERVICES BY SELECT OUTDOOR ACTIVITY CHECKBOX");
	 	 		 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 		 	 						    			"USER SHOULD BE FILTER SERVICES BY SELECT OUTDOOR ACTIVITY CHECKBOX");
	 	 		 	 						    } 
	 	 								}
	 	 								else {
	 	 									test.fail("TC:44 OUTDOOR ACTIVITY CHECK BOX SHOULD BE SELECT");
	 	 								 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 								 				"OUTDOOR ACTIVITY CHECK BOX SHOULD BE SELECT");
	 	 								}
	 	 							}catch (Exception e) {
	 	 								test.fail("Error:"+ e.getMessage());
	 	 								
	 	 							}	 						    	
	 		//Gift cards label
	 	 							try {
		 	 							String giftcardsfilterlabelhead=page.giftcardsfilterlabelmethod(); 
		 	 							String giftcardsfilterlabelexcel=Excelreader.getData(0, 40, 5);
		 	 							if(giftcardsfilterlabelhead.equals(giftcardsfilterlabelexcel)) {
		 	 						    	test.pass("TC:45 VERIFY LABEL 'GIFT CARDS' IS DISPLAYED");
		 	 						    }else {
		 	 						    	test.fail("TC:45 VERIFY LABEL 'GIFT CARDS' IS NOT DISPLAYED");
		 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
		 	 						    			"VERIFY LABEL 'GIFT CARDS' IS DISPLAYED");
		 	 						    } 
		 	 							}catch (Exception e) {
		 	 								test.fail("Error:"+ e.getMessage());
		 	 								
		 	 							}			
	 	 //Gift cards check box
	 	 							try {
	 	 								String giftcatdscheckboxhead= page.giftcatdscheckboxmethod();
	 	 								if(!giftcatdscheckboxhead.equals("true")) {
	 	 								 		 test.pass("TC:45 GIFT CARDS CHECK BOX SHOULD NOT SELECTED BY DEFAULT");
	 	 								}
	 	 								else {
	 	 									test.fail("TC:45 GIFT CARDS CHECK BOX SHOULD NOT SELECTED BY DEFAULT");
	 	 								 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 								 				"GIFT CARDS CHECK BOX SHOULD NOT SELECTED BY DEFAULT");
	 	 								}
	 	 							}catch (Exception e) {
	 	 								test.fail("Error:"+ e.getMessage());
	 	 							}	 	 							
	 	 							
	 	//select Gift cards check box 							
	 	 							try {
	 	 								String giftcatdscheckboxhead1= page.giftcatdscheckboxmethod1();
	 	 								if(giftcatdscheckboxhead1.equals("true")) {
	 	 								 		 test.pass("TC:45 GIFT CARDS CHECK BOX SHOULD BE SELECT");
	 	 								 	//reset button displayed or not 
	 	 								 		String resetbuttonlabelhead=page.resetbuttonlabelmethod(); 
	 	 		 	 							String resetbuttonlabelexcel=Excelreader.getData(0, 32, 5);
	 	 		 	 							if(resetbuttonlabelhead.equals(resetbuttonlabelexcel)) {
	 	 		 	 						    	test.pass("TC:45 USER SHOULD BE FILTER SERVICES BY SELECT GIFT CARDS CHECKBOX");
	 	 		 	 						    }else {
	 	 		 	 						    	test.fail("TC:45 USER SHOULD BE FILTER SERVICES BY SELECT GIFT CARDS CHECKBOX");
	 	 		 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 		 	 						    			"USER SHOULD BE FILTER SERVICES BY SELECT GIFT CARDS CHECKBOX");
	 	 		 	 						    } 
	 	 								}
	 	 								else {
	 	 									test.fail("TC:45 GIFT CARDS CHECK BOX SHOULD BE SELECT");
	 	 								 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 								 				"GIFT CARDS CHECK BOX SHOULD BE SELECT");
	 	 								}
	 	 							}catch (Exception e) {
	 	 								test.fail("Error:"+ e.getMessage());
	 	 								
	 	 							}	
	 	 //mobile offers label
	 	 							try {
		 	 							String mobileofferfilterlabelhead=page.mobileofferfilterlabelmethod(); 
		 	 							String mobileofferfilterlabelexcel=Excelreader.getData(0, 41, 5);
		 	 							if(mobileofferfilterlabelhead.equals(mobileofferfilterlabelexcel)) {
		 	 						    	test.pass("TC:46 VERIFY LABEL 'MOBILE OFFERS' IS DISPLAYED");
		 	 						    }else {
		 	 						    	test.fail("TC:46 VERIFY LABEL 'MOBILE OFFERS' IS NOT DISPLAYED");
		 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
		 	 						    			"VERIFY LABEL 'MOBILE OFFERS' IS DISPLAYED");
		 	 						    } 
		 	 							}catch (Exception e) {
		 	 								test.fail("Error:"+ e.getMessage());
		 	 								
		 	 							}				
	 	 		//mobile offers CHECK BOX							
	 	 							try {
	 	 								String mobileoffercheckboxhead= page.mobileoffercheckboxmethod();
	 	 								if(!mobileoffercheckboxhead.equals("true")) {
	 	 								 		 test.pass("TC:46 MOBILE OFFERS CHECK BOX SHOULD NOT SELECTED BY DEFAULT");
	 	 								}
	 	 								else {
	 	 									test.fail("TC:46 MOBILE OFFERS CHECK BOX SHOULD NOT SELECTED BY DEFAULT");
	 	 								 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 								 				"MOBILE OFFERS CHECK BOX SHOULD NOT SELECTED BY DEFAULT");
	 	 								}
	 	 							}catch (Exception e) {
	 	 								test.fail("Error:"+ e.getMessage());
	 	 							}			
	 	 		//select MOBILE OFFERS check box 							
	 	 							try {
	 	 								String mobileoffercheckboxhead1= page.mobileoffercheckboxmethod1();
	 	 								if(mobileoffercheckboxhead1.equals("true")) {
	 	 								 		 test.pass("TC:46 MOBILE OFFERS CHECK BOX SHOULD BE SELECT");
	 	 								 	//reset button displayed or not 
	 	 								 		String resetbuttonlabelhead=page.resetbuttonlabelmethod(); 
	 	 		 	 							String resetbuttonlabelexcel=Excelreader.getData(0, 32, 5);
	 	 		 	 							if(resetbuttonlabelhead.equals(resetbuttonlabelexcel)) {
	 	 		 	 						    	test.pass("TC:46 USER SHOULD BE FILTER SERVICES BY SELECT MOBILE OFFERS CHECKBOX");
	 	 		 	 						    }else {
	 	 		 	 						    	test.fail("TC:46 USER SHOULD BE FILTER SERVICES BY SELECT MOBILE OFFERS CHECKBOX");
	 	 		 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 		 	 						    			"USER SHOULD BE FILTER SERVICES BY SELECT MOBILE OFFERS CHECKBOX");
	 	 		 	 						    } 
	 	 								}
	 	 								else {
	 	 									test.fail("TC:46 MOBILE OFFERS CHECK BOX SHOULD BE SELECT");
	 	 								 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 								 				"MOBILE OFFERS CHECK BOX SHOULD BE SELECT");
	 	 								}
	 	 							}catch (Exception e) {
	 	 								test.fail("Error:"+ e.getMessage());
	 	 								
	 	 							} 	
	 	 							
	 	 							/* // Open 24/7 label
	 	 							try {
		 	 							String open247labelhead=page.open247labelmethod(); 
		 	 							String open247labelexcel=Excelreader.getData(0, 58, 5);
		 	 							if(open247labelhead.equals(open247labelexcel)) {
		 	 						    	test.pass("TC:46.1 VERIFY LABEL 'OPEN 24/7' IS DISPLAYED");
		 	 						    }else {
		 	 						    	test.fail("TC:46 VERIFY LABEL 'OPEN 24/7' IS NOT DISPLAYED");
		 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
		 	 						    			"VERIFY LABEL 'OPEN 24/7' IS DISPLAYED");
		 	 						    } 
		 	 							}catch (Exception e) {
		 	 								test.fail("Error:"+ e.getMessage());
		 	 								
		 	 							}						
	 	 						// open 24/7 CHECK BOX							
	 	 							try {
	 	 								String open247checkboxhead= page.open247checkboxmethod();
	 	 								if(!open247checkboxhead.equals("true")) {
	 	 								 		 test.pass("TC:46.1 OPEN 24/7 CHECK BOX SHOULD NOT SELECTED BY DEFAULT");
	 	 								}
	 	 								else {
	 	 									test.fail("TC:46.1 OPEN 24/7 CHECK BOX SHOULD NOT SELECTED BY DEFAULT");
	 	 								 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 								 				"OPEN 24/7 CHECK BOX SHOULD NOT SELECTED BY DEFAULT");
	 	 								}
	 	 							}catch (Exception e) {
	 	 								test.fail("Error:"+ e.getMessage());
	 	 							}			
	 	 						//select 24/7 check box 							
	 	 							try {
	 	 								String mobileoffercheckboxhead1= page.open247checkboxmethod1();
	 	 								if(mobileoffercheckboxhead1.equals("true")) {
	 	 								 		 test.pass("TC:46.1 OPEN 24/7 CHECK BOX SHOULD BE SELECT");
	 	 								 	//reset button displayed or not 
	 	 								 		String resetbuttonlabelhead=page.resetbuttonlabelmethod(); 
	 	 		 	 							String resetbuttonlabelexcel=Excelreader.getData(0, 32, 5);
	 	 		 	 							if(resetbuttonlabelhead.equals(resetbuttonlabelexcel)) {
	 	 		 	 						    	test.pass("TC:46 USER SHOULD BE FILTER SERVICES BY SELECT OPEN 24/7 CHECKBOX");
	 	 		 	 						    }else {
	 	 		 	 						    	test.fail("TC:46 USER SHOULD BE FILTER SERVICES BY SELECT OPEN 24/7 CHECKBOX");
	 	 		 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 		 	 						    			"USER SHOULD BE FILTER SERVICES BY SELECT MOBILE OFFERS CHECKBOX");
	 	 		 	 						    } 
	 	 								}
	 	 								else {
	 	 									test.fail("TC:46 OPEN 24/7 CHECK BOX SHOULD BE SELECT");
	 	 								 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 								 				"OPEN 24/7 CHECK BOX SHOULD BE SELECT");
	 	 								}
	 	 							}catch (Exception e) {
	 	 								test.fail("Error:"+ e.getMessage());
	 	 								
	 	 							}					*/
	 	 	//Aria distance (miles) label			
	 	 							try {
		 	 							String howfarwaymileslabelhead=page.howfarwaymileslabelmethod(); 
		 	 							String howfarwaymileslabelexcel=Excelreader.getData(0, 42, 5);
		 	 							if(howfarwaymileslabelhead.equals(howfarwaymileslabelexcel)) {
		 	 						    	test.pass("TC:47 VERIFY LABEL 'ARIA DISTANCE (MILES)' IS DISPLAYED");
		 	 						    }else {
		 	 						    	test.fail("TC:47 VERIFY LABEL 'ARIA DISTANCE (MILES)' IS NOT DISPLAYED");
		 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
		 	 						    			"VERIFY LABEL 'ARIA DISTANCE (MILES)' IS DISPLAYED");
		 	 						    } 
		 	 							}catch (Exception e) {
		 	 								test.fail("Error:"+ e.getMessage());
		 	 								
		 	 							}
	 	 		 //5 radio button label
	 	 	 			   			try {
	 	 	 							String radiobutton5labelhead=page.radiobutton5labelmethod(); 
	 	 	 							String radiobutton5labelexcel=Excelreader.getData(0, 50, 5);
	 	 	 							if(radiobutton5labelhead.equals(radiobutton5labelexcel)) {
	 	 	 						    	test.pass("TC:48 VERIFY LABEL '5 RADIO BUTTON' IS DISPLAYED");
	 	 	 						    	
	 	 	 						    }else {
	 	 	 						    	test.fail("TC:48 VERIFY LABEL '5 RADIO BUTTON' IS NOT DISPLAYED");
	 	 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 	 						    			"VERIFY LABEL '5 RADIO BUTTON' IS DISPLAYED");
	 	 	 						    }
	 	 	 						 }catch (Exception e) {
	 	 	 							 test.fail("Error:"+ e.getMessage());
	 	 	 						}
	 	 	//radio button	5			
	 	 							
	 	 							try {
		 	 							boolean radiobutton5head=page.radiobutton5method(); 
		 	 							if(radiobutton5head==(true)) {
		 	 						    	test.pass("TC:48 '5 MILES RADIO BUTTON' SHOULD BE SELECTED BY DEFAULT");
		 	 						    }else {
		 	 						    	test.fail("TC:48 '5 MILES RADIO BUTTON' SHOULD BE SELECTED BY DEFAULT");
		 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
		 	 						    			"'5 MILES RADIO BUTTON' SHOULD BE SELECTED BY DEFAULT");
		 	 						    } 
		 	 							}catch (Exception e) {
		 	 								test.fail("Error:"+ e.getMessage());
		 	 							}
	 	 		 //10 radio button label
	 	 	 			   			try {
	 	 	 							String radiobutton10labelhead=page.radiobutton10labelmethod(); 
	 	 	 							String radiobutton10labelexcel=Excelreader.getData(0, 51, 5);
	 	 	 							if(radiobutton10labelhead.equals(radiobutton10labelexcel)) {
	 	 	 						    	test.pass("TC:49 VERIFY LABEL '10 RADIO BUTTON' IS DISPLAYED");
	 	 	 						    	
	 	 	 						    }else {
	 	 	 						    	test.fail("TC:49 VERIFY LABEL '10 RADIO BUTTON' IS NOT DISPLAYED");
	 	 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 	 						    			"VERIFY LABEL '10 RADIO BUTTON' IS DISPLAYED");
	 	 	 						    }
	 	 	 						 }catch (Exception e) {
	 	 	 							 test.fail("Error:"+ e.getMessage());
	 	 	 						}
          //radio button 10			
	 	 							try {
		 	 							boolean radiobutton10head=page.radiobutton10method(); 
		 	 							if(!radiobutton10head==true) {
		 	 						    	test.pass("TC:49 '10 MILES RADIO BUTTON' SHOULD NOT SELECTED BY DEFAULT");
		 	 						    }else {
		 	 						    	test.fail("TC:49 '10 MILES RADIO BUTTON' SHOULD NOT SELECTED BY DEFAULT");
		 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
		 	 						    			"'10 MILES RADIO BUTTON' SHOULD NOT SELECTED BY DEFAULT");
		 	 						    } 
		 	 							}catch (Exception e) {
		 	 								test.fail("Error:"+ e.getMessage());
		 	 								
		 	 							}
	 	 		//20 radio button label
	 	 	 			   			try {
	 	 	 							String radiobutton20labelhead=page.radiobutton20labelmethod(); 
	 	 	 							String radiobutton20labelexcel=Excelreader.getData(0, 52, 5);
	 	 	 							if(radiobutton20labelhead.equals(radiobutton20labelexcel)) {
	 	 	 						    	test.pass("TC:50 VERIFY LABEL '20 RADIO BUTTON' IS DISPLAYED");
	 	 	 						    	
	 	 	 						    }else {
	 	 	 						    	test.fail("TC:50 VERIFY LABEL '20 RADIO BUTTON' IS NOT DISPLAYED");
	 	 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 	 						    			"VERIFY LABEL '20 RADIO BUTTON' IS DISPLAYED");
	 	 	 						    }
	 	 	 						 }catch (Exception e) {
	 	 	 							 test.fail("Error:"+ e.getMessage());
	 	 	 						}
	 	 			 //radio button 20			
	 	 							try {
		 	 							boolean radiobutton20head=page.radiobutton20method(); 
		 	 							if(!radiobutton20head==(true)) {
		 	 						    	test.pass("TC:50 '20 MILES RADIO BUTTON' SHOULD NOT SELECTED BY DEFAULT");
		 	 						    }else {
		 	 						    	test.fail("TC:50 '20 MILES RADIO BUTTON' SHOULD NOT SELECTED BY DEFAULT");
		 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
		 	 						    			"'20 MILES RADIO BUTTON' SHOULD NOT SELECTED BY DEFAULT");
		 	 						    } 
		 	 							}catch (Exception e) {
		 	 								test.fail("Error:"+ e.getMessage());
		 	 								
		 	 							}
	 	 		//50 radio button label
	 	 	 			   			try {
	 	 	 							String radiobutton50labelhead=page.radiobutton50labelmethod(); 
	 	 	 							String radiobutton50labelexcel=Excelreader.getData(0, 53, 5);
	 	 	 							if(radiobutton50labelhead.equals(radiobutton50labelexcel)) {
	 	 	 						    	test.pass("TC:51 VERIFY LABEL '50 RADIO BUTTON' IS DISPLAYED");
	 	 	 						    	
	 	 	 						    }else {
	 	 	 						    	test.fail("TC:51 VERIFY LABEL '50 RADIO BUTTON' IS NOT DISPLAYED");
	 	 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 	 	 						    			"VERIFY LABEL '20 RADIO BUTTON' IS DISPLAYED");
	 	 	 						    }
	 	 	 						 }catch (Exception e) {
	 	 	 							 test.fail("Error:"+ e.getMessage());
	 	 	 						}
	 	 				 //radio button 50			
	 	 							try {
		 	 							boolean radiobutton50head=page.radiobutton50method(); 
		 	 							if(!radiobutton50head==(true)) {
		 	 						    	test.pass("TC:51 '50 MILES RADIO BUTTON' SHOULD NOT SELECTED BY DEFAULT");
		 	 						    }else {
		 	 						    	test.fail("TC:51 '50 MILES RADIO BUTTON' SHOULD NOT SELECTED BY DEFAULT");
		 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
		 	 						    			"'50 MILES RADIO BUTTON' SHOULD NOT SELECTED BY DEFAULT");
		 	 						    } 
		 	 							}catch (Exception e) {
		 	 								test.fail("Error:"+ e.getMessage());
		 	 								
		 	 							}	
	 	 			 //Select radio button 10			
	 	 							try {
		 	 							boolean radiobutton10head1=page.radiobutton10method1(); 
		 	 							if(radiobutton10head1==true) {
		 	 						    	test.pass("TC:49 '10 MILES RADIO BUTTON' SHOULD BE SELECTED");
		 	 						//USER SHOULD NOT SELECT MULTY RADIO BUTTON 
		 	 						    	boolean radiobutton5head=page.radiobutton5method(); 
			 	 							if(!radiobutton5head==(true)) {
			 	 						    	test.pass("TC:48 'USER SHOULD NOT SELECT MULTY RADIO BUTTONS");
			 	 						    }else {
			 	 						    	test.fail("TC:48 'USER SHOULD NOT SELECT MULTY RADIO BUTTONS");
			 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
			 	 						    			"'USER SHOULD NOT SELECT MULTY RADIO BUTTONS");
			 	 						    }
		 	 						    //reset button displayed or not 
 	 								 		String resetbuttonlabelhead=page.resetbuttonlabelmethod(); 
 	 		 	 							String resetbuttonlabelexcel=Excelreader.getData(0, 32, 5);
 	 		 	 							if(resetbuttonlabelhead.equals(resetbuttonlabelexcel)) {
 	 		 	 						    	test.pass("TC:49 USER SHOULD BE FILTER SERVICES BY SELECT 10 MILES RADIO BUTTON");
 	 		 	 						    }else {
 	 		 	 						    	test.fail("TC:49 USER SHOULD BE FILTER SERVICES BY SELECT 10 MILES RADIO BUTTON");
 	 		 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
 	 		 	 						    			"USER SHOULD BE FILTER SERVICES BY SELECT 10 MILES RADIO BUTTON");
 	 		 	 						    } 
		 	 						    }else {
		 	 						    	test.fail("TC:49 '10 MILES RADIO BUTTON' SHOULD BE SELECTED ");
		 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
		 	 						    			"'10 MILES RADIO BUTTON' SHOULD BE SELECTED");
		 	 						    } 
		 	 							}catch (Exception e) {
		 	 								test.fail("Error:"+ e.getMessage());
		 	 								
		 	 							}						
	 	 			//SELECT radio button 20			
	 	 							try {
		 	 							boolean radiobutton20head=page.radiobutton20method1(); 
		 	 							if(radiobutton20head==(true)) {
		 	 						    	test.pass("TC:50 '20 MILES RADIO BUTTON' SHOULD BE SELECTED");
		 	 						    	 //reset button displayed or not 
 	 								 		String resetbuttonlabelhead=page.resetbuttonlabelmethod(); 
 	 		 	 							String resetbuttonlabelexcel=Excelreader.getData(0, 32, 5);
 	 		 	 							if(resetbuttonlabelhead.equals(resetbuttonlabelexcel)) {
 	 		 	 						    	test.pass("TC:50 USER SHOULD BE FILTER SERVICES BY SELECT 20 MILES RADIO BUTTON");
 	 		 	 						    }else {
 	 		 	 						    	test.fail("TC:50 USER SHOULD BE FILTER SERVICES BY SELECT 20 MILES RADIO BUTTON");
 	 		 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
 	 		 	 						    			"USER SHOULD BE FILTER SERVICES BY SELECT 20 MILES RADIO BUTTON");
 	 		 	 						    } 
		 	 						    }else {
		 	 						    	test.fail("TC:50 '20 MILES RADIO BUTTON' SHOULD BE SELECTED");
		 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
		 	 						    			"'20 MILES RADIO BUTTON' SHOULD BE SELECTED");
		 	 						    } 
		 	 							}catch (Exception e) {
		 	 								test.fail("Error:"+ e.getMessage());
		 	 								
		 	 							}					
	 	 				 //SELECT radio button 50			
	 	 							try {
		 	 							boolean radiobutton50head=page.radiobutton50method1(); 
		 	 							if(radiobutton50head==(true)) {
		 	 						    	test.pass("TC:51 '50 MILES RADIO BUTTON' SHOULD BE SELECTED ");
		 	 						    //reset button displayed or not 
 	 								 		String resetbuttonlabelhead=page.resetbuttonlabelmethod(); 
 	 		 	 							String resetbuttonlabelexcel=Excelreader.getData(0, 32, 5);
 	 		 	 							if(resetbuttonlabelhead.equals(resetbuttonlabelexcel)) {
 	 		 	 						    	test.pass("TC:51 USER SHOULD BE FILTER SERVICES BY SELECT 50 MILES RADIO BUTTON ");
 	 		 	 						    }else {
 	 		 	 						    	test.fail("TC:51 USER SHOULD BE FILTER SERVICES BY SELECT 50 MILES RADIO BUTTON");
 	 		 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
 	 		 	 						    			"USER SHOULD BE FILTER SERVICES BY SELECT 50 MILES RADIO BUTTON");
 	 		 	 						    } 
		 	 						    }else {
		 	 						    	test.fail("TC:51 '50 MILES RADIO BUTTON' SHOULD BE SELECTED");
		 	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
		 	 						    			"'50 MILES RADIO BUTTON' SHOULD BE SELECTED");
		 	 						    } 
		 	 							}catch (Exception e) {
		 	 								test.fail("Error:"+ e.getMessage());
		 	 								
		 	 							}						
	 						    }else {
	 						    	test.fail("TC:37 SHOW MORE FILTER IS NOT WORKING");
	 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 						    			"SHOW MORE FILTER IS NOT WORKING");
	 						    }
						    }else {
						    	test.fail("TC:36 VERIFY LABEL 'McDONALDS FILTE HEADING OR MESSAGE' IS NOT DISPLAYED");
						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
						    			"VERIFY LABEL 'McDONALDS FILTE HEADING OR MESSAGE' IS DISPLAYED");
						    }
						 }catch (Exception e) {
							 test.fail("Error:"+ e.getMessage());
						} 				   	
 						}else {
		 				   	test.fail("TC:6 SEARCH BUTTON IS NOT WORKING FINE");
		 				   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
		 				   			"SEARCH BUTTON IS NOT WORKING FINE");
		 				   }			
		    }catch (Exception e) {
				 test.fail("Error:"+ e.getMessage());
			}  
    }   
    
   /* @Test(priority=4)
   	public void List_View_Restaurant_Address() {  
       	Restaurant_Locator_Page page= new Restaurant_Locator_Page(driver);
   			 test=extent.createTest("List_View_Restaurant_Address");   
   		  try {
		    	driver.get(Basepage.readProperty("urlRL"));
		    	String gettitle=page.generallgetpagetitlemethod();
				String gettitleexcel=Excelreader.getData(0, 1, 5);
				if(gettitle.equals(gettitleexcel)) {
			    	test.pass("TC:1 URL IS OPENED");
			    }else {
			    	test.fail("TC:1 URL IS NOT OPENED");
			    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
			    			"URL IS NOT OPENED");
			    	extent.flush();
					driver.close();
					throw new SkipException("Skipping - ");
			    }
				}catch (Exception e) {
					 test.fail("Error:"+ e.getMessage());
					 extent.flush();
					 driver.close();
					throw new SkipException("Skipping - ");
				}	
   			 try {
 		    	// search button  
 					String searchbuttonexcel=Excelreader.getData(0, 5, 5);
 					String searchbuttonhead=page.searchbuttonmethod(searchbuttonexcel);
 						if(!searchbuttonhead.equals("")) {
 					   	test.pass("TC:6 SEARCH BUTTON IS WORKING FINE"); 
 		//list view label
 					   try {
 							String listviewlabelhead=page.listviewlabelmethod(); 
 							String listviewlabelexcel=Excelreader.getData(0, 43, 5);
 							if(listviewlabelhead.equals(listviewlabelexcel)) {
 						    	test.pass("TC:52 VERIFY LABEL 'LIST VIEW ' IS DISPLAYED");
 						    }else {
 						    	test.fail("TC:52 VERIFY LABEL 'LIST VIEW' IS NOT DISPLAYED");
 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
 						    			"VERIFY LABEL 'LIST VIEW' IS DISPLAYED");
 						    } 
 							}catch (Exception e) {
 								test.fail("Error:"+ e.getMessage());
 								
 							}
 					   	
 			//click on list view 		   	
 					  try {
							String listviewclickhead=page.listviewclickmethod(); 
							String listviewclickexcel=Excelreader.getData(0, 44, 5);
							if(listviewclickhead.equals(listviewclickexcel)) {
						    	test.pass("TC:53 USER SHOULD BE CLICK ON LIST VIEW");
					//map view label  
						    	try {
			 							String mapviewlabelhead=page.mapviewlabelmethod(); 
			 							String mapviewlabelexcel=Excelreader.getData(0, 45, 5);
			 							if(mapviewlabelhead.equals(mapviewlabelexcel)) {
			 						    	test.pass("TC:54 VERIFY LABEL 'MAP VIEW ' IS DISPLAYED");
			 						    }else {
			 						    	test.fail("TC:54 VERIFY LABEL 'MAP VIEW' IS NOT DISPLAYED");
			 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
			 						    			"VERIFY LABEL 'MAP VIEW' IS DISPLAYED");
			 						    } }catch (Exception e) {
		 	 								test.fail("Error:"+ e.getMessage());
		 	 								
		 	 							}
			 						
					//chevron down icon is working or not	 
						    	try {
			 							String chevrondowniconhead=page.chevrondowniconmethod(); 
			 							String chevrondowniconexcel=Excelreader.getData(0, 46, 5);
			 							if(chevrondowniconhead.equals(chevrondowniconexcel)) {
			 						    	test.pass("TC:55 CHEVRON DOWN ICON IS WORKING ON LIST VIEW");
			 				//HOURS MANY VARY ON OR AROUND HOLIDAYS LABEL	
			 						    	try {
			 								String hoursmanyvaryonlabelhead=page.hoursmanyvaryonlabelmethod1(); 
			 								String hoursmanyvaryonlabelexcel=Excelreader.getData(0, 14, 5);
			 								if(hoursmanyvaryonlabelhead.equals(hoursmanyvaryonlabelexcel)) {
			 							    	test.pass("TC:14 VERIFY LABEL 'HOURS MANY VARY ON OR AROUND HOLIDAYS' IS DISPLAYED");
			 							    	
			 							    }else {
			 							    	test.fail("TC:14 VERIFY LABEL 'HOURS MANY VARY ON OR AROUND HOLIDAYS' IS NOT DISPLAYED");
			 							    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
			 							    			"VERIFY LABEL 'HOURS MANY VARY ON OR AROUND HOLIDAYS ' IS DISPLAYED");
			 							    }	}catch (Exception e) {
			 	 								test.fail("Error:"+ e.getMessage());
			 	 								
			 	 							}
			 					//Restaurant lobby hours  
			 						    	try {
			 						    	String restaurantlobbyhourslabelhead=page.restaurantlobbyhourslabelmethod1(); 
			 								String restaurantlobbyhourslabelexcel=Excelreader.getData(0, 16, 5);
			 								if(restaurantlobbyhourslabelhead.equals(restaurantlobbyhourslabelexcel)) {
			 							    	test.pass("TC:16  VERIFY LABEL 'RESTAURANT LOBBY HOURS' IS DISPLAYED");
			 							    	
			 							    }else {
			 							    	test.fail("TC:16  VERIFY LABEL 'RESTAURANT LOBBY HOURS' IS NOT DISPLAYED");
			 							    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
			 							    			" VERIFY LABEL 'RESTAURANT LOBBY HOURS' IS DISPLAYED");
			 							    }}catch (Exception e) {
			 	 								test.fail("Error:"+ e.getMessage());
			 	 								
			 	 							}
			 						//Monday and hours label
			 						    	try {
			 								String restaurantlobbymondayandhourslabelhead=page.restaurantlobbymondayandhourslabelmethod1(); 
			 								String restaurantlobbymondayandhourslabelexcel=Excelreader.getData(0, 17, 6);
			 								if(restaurantlobbymondayandhourslabelhead.equals(restaurantlobbymondayandhourslabelexcel)) {
			 							    	test.pass("TC:17  VERIFY LABEL 'MONDAY AND OPEN 24 HOURS ON RESTAURANT LOBBY HOURS' IS DISPLAYED");
			 							    	
			 							    }else {
			 							    	test.fail("TC:17  VERIFY LABEL 'MONDAY AND OPEN 24 HOURS ON RESTAURANT LOBBY HOURS' IS NOT DISPLAYED");
			 							    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
			 							    			" VERIFY LABEL 'MONDAY AND OPEN 24 HOURS ON RESTAURANT LOBBY HOURS' IS DISPLAYED");
			 							    }}catch (Exception e) {
			 	 								test.fail("Error:"+ e.getMessage());
			 	 								
			 	 							}
			 				   //drive thru hours  
			 						    	try {
			 								String drivethruhourslabelhead=page.drivethruhourslabelmethod1(); 
			 								String drivethruhourslabelexcel=Excelreader.getData(0, 91, 5);
			 								if(drivethruhourslabelhead.equals(drivethruhourslabelexcel)) {
			 							    	test.pass("TC:18  VERIFY LABEL 'DRIVE THRU HOURS' IS DISPLAYED ON LIST VIEW");
			 							    	
			 							    }else {
			 							    	test.fail("TC:18  VERIFY LABEL 'DRIVE THRU HOURS' IS NOT DISPLAYED ON LIST VIEW");
			 							    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
			 							    			" VERIFY LABEL 'DRIVE THRU HOURS' IS DISPLAYED ON LIST VIEW");
			 							    }	}catch (Exception e) {
			 	 								test.fail("Error:"+ e.getMessage());
			 	 								
			 	 							}
			 					 //weeks and hours label on drive thru hours  
			 						    	try {
			 								String drivethruhoursmondayhourslabelhead=page.drivethruhoursmondayhourslabelmethod1(); 
			 								String drivethruhoursmondayhourslabelexcel=Excelreader.getData(0, 19, 5);
			 								if(drivethruhoursmondayhourslabelhead.equals(drivethruhoursmondayhourslabelexcel)) {
			 							    	test.pass("TC:19  VERIFY LABEL 'WEEK AND HOURS ON DRIVE THRU HOURS' IS DISPLAYED");
			 							    	
			 							    }else {
			 							    	test.fail("TC:19  VERIFY LABEL 'WEEK AND HOURS ON DRIVE THRU HOURS' IS NOT DISPLAYED");
			 							    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
			 							    			" VERIFY LABEL 'WEEK AND HOURS ON DRIVE THRU HOURS' IS DISPLAYED");
			 							    }	 }catch (Exception e) {
			 	 								test.fail("Error:"+ e.getMessage());
			 	 								
			 	 							} 
			 						//services label on list view 
			 						    	try {
									    	String serviceslabelonlistviewhead=page.serviceslabelonlistviewmethod(); 
											String serviceslabelonlistviewexcel=Excelreader.getData(0, 47, 5);
											if(serviceslabelonlistviewhead.equals(serviceslabelonlistviewexcel)) {
										    	test.pass("TC:20  VERIFY LABEL 'SERVICES' IS DISPLAYED ON LIST VIEW");
										    }else {
										    	test.fail("TC:20 VERIFY LABEL 'SERVICES' IS DISPLAYED ON LIST VIEW");
										    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
										    			" VERIFY LABEL 'SERVICES' IS DISPLAYED ON LIST VIEW");
										    }}catch (Exception e) {
			 	 								test.fail("Error:"+ e.getMessage());
			 	 								
			 	 							}
			 						
			 						    	
			 						    	
			 						    	try {
										    	String McDeliveryonhideserviceslabelhead=page.McDeliveryonhideserviceslabelmethod11(); 
												String McDeliveryonhideserviceslabelexcel=Excelreader.getData(0, 22, 5);
												
												System.out.println(McDeliveryonhideserviceslabelhead);
												if(McDeliveryonhideserviceslabelhead.equals(McDeliveryonhideserviceslabelhead)) {
											    	test.pass("TC:22  VERIFY LABEL 'McDELIVERY ON HIDE SERVICES' IS DISPLAYED ON LIST VIEW");
											    }else if(McDeliveryonhideserviceslabelhead.equals("Services")) {
											    	test.fail("TC:22 VERIFY LABEL 'McDELIVERY ON HIDE SERVICES' IS NOT DISPLAYED ON LIST VIEW");
											    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
											    			" VERIFY LABEL 'McDELIVERY ON HIDE SERVICES' IS DISPLAYED ON LIST VIEW");
											     }else if(McDeliveryonhideserviceslabelhead.equals("   WIFI	")){
											    	 System.err.println("wifi is displayed");
											    }else if(McDeliveryonhideserviceslabelhead.equals("WIFI")) {
											    	System.err.println("wifi is displayed");
											    }
												}catch (Exception e) {
				 	 								test.fail("Error:"+ e.getMessage());
				 	 								
				 	 							}			    	
			 					
			 						    	
			 						    	
			 						    	
			 						    	
			 						    	
			 						    	
			 						    	
			 						    	
			 						    	
			 						    	
			 						    	
			 						    	
			 						    	
			 						    	
			 					//McDelivery label ON LIST VIEW
			 						    	try {
									    	String McDeliveryonhideserviceslabelhead=page.McDeliveryonhideserviceslabelmethod1(); 
											String McDeliveryonhideserviceslabelexcel=Excelreader.getData(0, 87, 5);
											if(McDeliveryonhideserviceslabelhead.equals(McDeliveryonhideserviceslabelexcel)) {
										    	test.pass("TC:22  VERIFY LABEL 'McDELIVERY' ON HIDE SERVICES IS DISPLAYED ON LIST VIEW");
										    }else {
										    	test.fail("TC:22 VERIFY LABEL 'McDELIVERY' ON HIDE SERVICES IS NOT DISPLAYED ON LIST VIEW");
										    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
										    			" VERIFY LABEL 'McDELIVERY ON HIDE SERVICES' IS DISPLAYED ON LIST VIEW");
										    }}catch (Exception e) {
			 	 								test.fail("Error:"+ e.getMessage());
			 	 								
			 	 							}
								//image of McDelivery 
											try {
												Boolean imageofmcdeliveryhead= page.imageofmcdeliverymethod1();
											//	String imageofmcdeliveryexcel=Excelreader.getData(0, 23, 5);
												if(imageofmcdeliveryhead.equals(true)) {
												 		 test.pass("TC:23 McDELIVERY IMAGE IS DISPLAYED");
												}
												else {
													test.fail("TC:23 McDELIVERY IMAGE IS DISPLAYED");
												 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
												 				"McDELIVERY IMAGE IS DISPLAYED");
												}}catch (Exception e) {
				 	 								test.fail("Error:"+ e.getMessage());
				 	 								
				 	 							}
								//WIFI label
											try {
									    	String wifionhideservicelabelhead=page.wifionhideservicelabelmethod1(); 
											String wifionhideservicelabelexcel=Excelreader.getData(0, 89, 5);
											if(wifionhideservicelabelhead.equals(wifionhideservicelabelexcel)) {
										    	test.pass("TC:24  VERIFY LABEL 'WIFI' ON HIDE SERVICES IS DISPLAYED ON LIST VIEW");
										    }else {
										    	test.fail("TC:24 VERIFY LABEL 'WIFI' ON HIDE SERVICES IS NOT DISPLAYED ON LIST VIEW");
										    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
										    			" VERIFY LABEL 'WIFI ON HIDE SERVICES' IS DISPLAYED");
										    }	  }catch (Exception e) {
			 	 								test.fail("Error:"+ e.getMessage());
			 	 								
			 	 							}  	
									    	
								//image of WIFI 
											Boolean imageofwifihead= page.imageofwifimethod1();
										//	String imageofwifiexcel=Excelreader.getData(0, 25, 5);
											if(imageofwifihead.equals(true)) {
											 		 test.pass("TC:25 WIFI IMAGE IS DISPLAYED ON LIST VIEW");
											}
											else {
												test.fail("TC:25 WIFI IMAGE IS DISPLAYED ON LIST VIEW");
											 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
											 				"WIFI IMAGE IS DISPLAYED ON LIST VIEW");
											}		   		    	
			 						    }else {
			 						    	test.fail("TC:55 CHEVRON DOWN ICON IS WORKING ON LIST VIEW");
			 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
			 						    			"CHEVRON DOWN ICON IS WORKING ON LIST VIEW");
			 						    } }catch (Exception e) {
		 	 								test.fail("Error:"+ e.getMessage());
		 	 								
		 	 							}
						    }else {
						    	test.fail("TC:53 USER SHOULD BE CLICK ON LIST VIEW");
						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
						    			"USER SHOULD BE CLICK ON LIST VIEW");
						    } 
							}catch (Exception e) {
								test.fail("Error:"+ e.getMessage());
								
							} 	
 						}else {
		 				   	test.fail("TC:6 SEARCH BUTTON IS NOT WORKING FINE");
		 				   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
		 				   			"SEARCH BUTTON IS NOT WORKING FINE");
		 				   }			
		    }catch (Exception e) {
				 test.fail("Error:"+ e.getMessage());
			} 
    }   */
    
    /*@Test(priority=5)
   	public void Get_Directions_Mapview() {
       	Restaurant_Locator_Page page= new Restaurant_Locator_Page(driver);
   			 test=extent.createTest("Get_Directions_Mapview");
   			 try {
 		    	driver.get(Basepage.readProperty("urlRL"));
 		    	String gettitle=page.generallgetpagetitlemethod();
 				String gettitleexcel=Excelreader.getData(0, 1, 5);
 				if(gettitle.equals(gettitleexcel)) {
 			    	test.pass("TC:1 URL IS OPENED");
 			    }else {
 			    	test.fail("TC:1 URL IS NOT OPENED");
 			    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
 			    			"URL IS NOT OPENED");
 			    	extent.flush();
 					driver.close();
 					throw new SkipException("Skipping - ");
 			    }
 				}catch (Exception e) {
 					 test.fail("Error:"+ e.getMessage());
 					 extent.flush();
 					 driver.close();
 					throw new SkipException("Skipping - ");
 				}	
   		  try {
   	    	// search button  
   				String searchbuttonexcel=Excelreader.getData(0, 5, 5);
   				String searchbuttonhead=page.searchbuttonmethod(searchbuttonexcel);
   					if(!searchbuttonhead.equals("")) {
   				   	test.pass("TC:6 SEARCH BUTTON IS WORKING FINE");	 
   			 //get direaction label
   			 try {
					String locatemelabelhead=page.getdirectionlabelmethod(); 
					String locatemelabelexcel=Excelreader.getData(0, 54, 5);
					if(locatemelabelhead.equalsIgnoreCase(locatemelabelexcel)) {
				    	test.pass("TC: VERIFY LABEL 'GET DIRECTION' IS DISPLAYED");
				    }else {
				    	test.fail("TC: VERIFY LABEL 'GET DIRECTION' IS NOT DISPLAYED");
				    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
				    			"VERIFY LABEL 'GET DIRECTION' IS DISPLAYED");
				    }
				 }catch (Exception e) {
					 test.fail("Error:"+ e.getMessage());
				} 	
   		//legal bumber 
   			 try {
					String locatemelabelhead=page.getdirectionclickmethod(); 
					String locatemelabelexcel=Excelreader.getData(0, 55, 5);
					if(locatemelabelhead.equalsIgnoreCase(locatemelabelexcel)) {
				    	test.pass("TC: GET DIRECTION LINK AND LEGAL BUMBER IS WORKING ON MAP VIEW");
				    	String locatemelabelhead1=page.legalbumpercancelbuttonmethod(); 
						String locatemelabelexcel1=Excelreader.getData(0, 55, 5);
				    	if(locatemelabelhead1.equals("")) {
					    	test.pass("TC: CANCEL BUTTON OF GET DIRECTION LEGAL BUMBER IS WORKING ON MAP VIEW");
					  
					    }else {
					    	test.fail("TC: CANCEL BUTTON OF GET DIRECTION LEGAL BUMBER IS NOT WORKING ON MAP VIEW");
					    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
					    			"CANCEL BUTTON OF GET DIRECTION LEGAL BUMBER IS NOT WORKING ON MAP VIEW");
					    }
				    }else {
				    	test.fail("TC: GET DIRECTION LINK AND LEGAL BUMBER IS NOT WORKING ON MAP VIEW");
				    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
				    			"GET DIRECTION LINK AND LEGAL BUMBER IS NOT WORKING ON MAP VIEW");
				    }
				 }catch (Exception e) {
					 test.fail("Error:"+ e.getMessage());
				} 	 }else {
 				   	test.fail("TC:6 SEARCH BUTTON IS NOT WORKING FINE");
 				   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
 				   			"SEARCH BUTTON IS NOT WORKING FINE");
 				   }			
   }catch (Exception e) {
		 test.fail("Error:"+ e.getMessage());
	} 
   		//land page of legal bumper 
   		  
   		 try {
    	    	// search button  
    				String searchbuttonexcel=Excelreader.getData(0, 5, 5);
    				String searchbuttonhead=page.searchbuttonmethodD(searchbuttonexcel);
    					if(!searchbuttonhead.equals("")) {
    				   	test.pass("TC:6 SEARCH BUTTON IS WORKING FINE");
   			//GET PAGE 
					String locatemelabelhead=page.getdirectionclickmethod1(); 
					String locatemelabelexcel=Excelreader.getData(0, 59, 5);
					if(locatemelabelhead.equals(locatemelabelexcel)) {
				    	test.pass("TC: GET DIRECTION LANDING PAGE IS WORKING");
				  
				    }else {
				    	test.fail("TC: GET DIRECTION LANDING PAGE IS NOT WORKING");
				    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
				    			"GET DIRECTION LANDING PAGE IS NOT WORKING");
				    } }else {
	 				   	test.fail("TC:6 SEARCH BUTTON IS NOT WORKING FINE");
	 				   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	 				   			"SEARCH BUTTON IS NOT WORKING FINE");
	 				   }
				 }catch (Exception e) {
					 test.fail("Error:"+ e.getMessage());
				} 
    
    }
    */
    /*@Test(priority=6)
   	public void Get_Directions_Listview() {
       	Restaurant_Locator_Page page= new Restaurant_Locator_Page(driver);
   			 test=extent.createTest("Get_Directions_Listview");   
    
   			 try {
 		    	driver.get(Basepage.readProperty("urlRL"));
 		    	String gettitle=page.generallgetpagetitlemethod();
 				String gettitleexcel=Excelreader.getData(0, 1, 5);
 				if(gettitle.equals(gettitleexcel)) {
 			    	test.pass("TC:1 URL IS OPENED");
 			    }else {
 			    	test.fail("TC:1 URL IS NOT OPENED");
 			    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
 			    			"URL IS NOT OPENED");
 			    	extent.flush();
 					driver.close();
 					throw new SkipException("Skipping - ");
 			    }
 				}catch (Exception e) {
 					 test.fail("Error:"+ e.getMessage());
 					 extent.flush();
 					 driver.close();
 					throw new SkipException("Skipping - ");
 				}	
   			 try {
  		    	// search button  
  					String searchbuttonexcel=Excelreader.getData(0, 5, 5);
  					String searchbuttonhead=page.searchbuttonmethod(searchbuttonexcel);
  						if(!searchbuttonhead.equals("")) {
  					   	test.pass("TC:6 SEARCH BUTTON IS WORKING FINE"); 
  			//click on list view 		   	
  					  try {
 							String listviewclickhead=page.listviewclickmethod(); 
 							String listviewclickexcel=Excelreader.getData(0, 44, 5);
 							if(listviewclickhead.equals(listviewclickexcel)) {
 						    	test.pass("TC:53 USER SHOULD BE CLICK ON LIST VIEW");
 						    	 //get direaction label
 					   			 try {
 										String locatemelabelhead=page.getdirectionlabellistmethod(); 
 										String locatemelabelexcel=Excelreader.getData(0, 54, 5);
 										if(locatemelabelhead.equals(locatemelabelexcel)) {
 									    	test.pass("TC: VERIFY LABEL 'GET DIRECTION' IS DISPLAYED IN LIST VIEW");
 									    }else {
 									    	test.fail("TC: VERIFY LABEL 'GET DIRECTION' IS NOT DISPLAYED IN LIST VIEW");
 									    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
 									    			"VERIFY LABEL 'GET DIRECTION' IS DISPLAYED IN LIST VIEW");
 									    }
 									 }catch (Exception e) {
 										 test.fail("Error:"+ e.getMessage());
 									} 	
 					   		//legal bumber 
 					   			 try {
 										String locatemelabelhead=page.getdirectionclicklistmethod(); 
 										String locatemelabelexcel=Excelreader.getData(0, 55, 5);
 										if(locatemelabelhead.equals(locatemelabelexcel)) {
 									    	test.pass("TC: GET DIRECTION LINK AND LEGAL BUMBER IS WORKING ON MAP VIEW");
 									    	String locatemelabelhead1=page.legalbumpercancelbuttonlistmethod(); 
 											String locatemelabelexcel1=Excelreader.getData(0, 55, 5);
 									    	if(locatemelabelhead1.equals("")) {
 										    	test.pass("TC: CANCEL BUTTON OF GET DIRECTION LEGAL BUMBER IS WORKING ON LIST VIEW");
 										  
 										    }else {
 										    	test.fail("TC: CANCEL BUTTON OF GET DIRECTION LEGAL BUMBER IS NOT WORKING ON LIST VIEW");
 										    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
 										    			"CANCEL BUTTON OF GET DIRECTION LEGAL BUMBER IS NOT WORKING ON MAP VIEW");
 										    }
 									    }else {
 									    	test.fail("TC: GET DIRECTION LINK AND LEGAL BUMBER IS NOT WORKING ON MAP VIEW");
 									    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
 									    			"GET DIRECTION LINK AND LEGAL BUMBER IS NOT WORKING ON MAP VIEW");
 									    }
 									 }catch (Exception e) {
 										 test.fail("Error:"+ e.getMessage());
 									} 	    	
 							 }else {
 						    	test.fail("TC:53 USER SHOULD BE CLICK ON LIST VIEW");
 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
 						    			"USER SHOULD BE CLICK ON LIST VIEW");
 						    } 
 							}catch (Exception e) {
 								test.fail("Error:"+ e.getMessage());
 								
 							} 	
  						}else {
 		 				   	test.fail("TC:6 SEARCH BUTTON IS NOT WORKING FINE");
 		 				   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
 		 				   			"SEARCH BUTTON IS NOT WORKING FINE");
 		 				   }			
 		    }catch (Exception e) {
 				 test.fail("Error:"+ e.getMessage());
 			} 
   			 
   // search button
   			 try {
   					String searchbuttonexcel=Excelreader.getData(0, 5, 5);
   					String searchbuttonhead=page.searchbuttonmethodD(searchbuttonexcel);
   						if(!searchbuttonhead.equals("")) {
   					   	test.pass("TC:6 SEARCH BUTTON IS WORKING FINE"); 
   			//click on list view 		   	
   					  try {
  							String listviewclickhead=page.listviewclickmethod(); 
  							String listviewclickexcel=Excelreader.getData(0, 44, 5);
  							if(listviewclickhead.equals(listviewclickexcel)) {
  						    	test.pass("TC:53 USER SHOULD BE CLICK ON LIST VIEW");
  						   //GET DIRECTION LANDING PAGE
  						  	String locatemelabelhead=page.getdirectionclicklistmethod1(); 
  							String locatemelabelexcel=Excelreader.getData(0, 59, 5);
  							if(locatemelabelhead.equalsIgnoreCase(locatemelabelexcel)) {
  						    	test.pass("TC: GET DIRECTION LANDING PAGE IS WORKING LIST VIEW ");
  						  
  						    }else {
  						    	test.fail("TC: GET DIRECTION LANDING PAGE IS NOT WORKING LIST VIEW");
  						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
  						    			"GET DIRECTION LANDING PAGE IS NOT WORKING");
  						    } 	
  					   		    	
  							 }else {
  						    	test.fail("TC:53 USER SHOULD BE CLICK ON LIST VIEW");
  						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
  						    			"USER SHOULD BE CLICK ON LIST VIEW");
  						    } 
  							}catch (Exception e) {
  								test.fail("Error:"+ e.getMessage());
  								
  							} 	
   						}else {
  		 				   	test.fail("TC:6 SEARCH BUTTON IS NOT WORKING FINE");
  		 				   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
  		 				   			"SEARCH BUTTON IS NOT WORKING FINE");
  		 				   }			
  		    }catch (Exception e) {
  				 test.fail("Error:"+ e.getMessage());
  			} 
    }
    
    @Test(priority=7)
     public void Apply_For_Job_Link_Mapview() {
       	Restaurant_Locator_Page page= new Restaurant_Locator_Page(driver);
   			 test=extent.createTest("Apply_For_Job_Link_Mapview");   
    
   		  try {
		    	driver.get(Basepage.readProperty("urlRL"));
		    	String gettitle=page.generallgetpagetitlemethod();
				String gettitleexcel=Excelreader.getData(0, 1, 5);
				if(gettitle.equals(gettitleexcel)) {
			    	test.pass("TC:1 URL IS OPENED");
			    }else {
			    	test.fail("TC:1 URL IS NOT OPENED");
			    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
			    			"URL IS NOT OPENED");
			    	extent.flush();
					driver.close();
					throw new SkipException("Skipping - ");
			    }
				}catch (Exception e) {
					 test.fail("Error:"+ e.getMessage());
					 extent.flush();
					 driver.close();
					throw new SkipException("Skipping - ");
				}	
   			 try {
    		    	// search button  
    					String searchbuttonexcel=Excelreader.getData(0, 5, 5);
    					String searchbuttonhead=page.searchbuttonmethod(searchbuttonexcel);
    						if(!searchbuttonhead.equals("")) {
    					   	test.pass("TC:6 SEARCH BUTTON IS WORKING FINE"); 
    			//McDonald's Careers label
    					   	try {
    	   					 String mcdolandscareerslabelhead=page.mcdolandscareerslabelmethod(); 
    							String mcdolandscareerslabelexcel=Excelreader.getData(0, 29, 5);
    							if(mcdolandscareerslabelhead.equalsIgnoreCase(mcdolandscareerslabelexcel)) {
    						    	test.pass("TC:32  VERIFY LABEL 'McDONALD'S CAREERS ' IS DISPLAYED");
    						    }else {
    						    	test.fail("TC:32 VERIFY LABEL 'McDONALD'S CAREERS ' IS NOT DISPLAYED");
    						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
    						    			" VERIFY LABEL 'McDONALD'S CAREERS ' IS DISPLAYED");
    						    }   	}catch (Exception e) {
 	 								test.fail("Error:"+ e.getMessage());
 	 								
 	 							}				   	
    		//apply for jobs label
    					   	try {
       	   					 String applyforjoblabellinkhead=page.applyforjoblabellinkmethod(); 
       							String applyforjoblabellinkexcel=Excelreader.getData(0, 30, 5);
       							if(applyforjoblabellinkhead.equalsIgnoreCase(applyforjoblabellinkexcel)) {
       						    	test.pass("TC:33  VERIFY LABEL ' APPLY FOR JOB LINK' IS DISPLAYED");
       						   		   	
    	//click on apply for jobs link			   	
       						 //APPLY FOR JOB BUTTON IS CLICKABLE OR NOT AND CANCLE BUTTON
    					   	try {
							   	String applyforjoblinkclickexcel=Excelreader.getData(0, 92, 5);
								String applyforjoblinkclickhead=page.applyforjoblinkclickmethod();
								if(applyforjoblinkclickhead.equals(applyforjoblinkclickexcel)) {
								   	test.pass("TC:34 'APPLY FOR JOBS' LINK IS CLICKABLE AND LEGAL BUMPER ALSO IS WORKING ");
							//cancel button	   	
								   	try {
								   	String ordermcdeliverylabelexcel1=Excelreader.getData(0, 30, 5);
									String ordermcdeliverylabelhead1=page.cancelbuttonmethod3();
									if(ordermcdeliverylabelhead1.equalsIgnoreCase(ordermcdeliverylabelexcel1)) {
									   	test.pass("TC:35 CANCEL BUTTON IS WORKING FINE AFTER CLICK ON 'APPLY FOR JOBS LINK' "); 
					         //APPLY FOR JOB BUTTON AND OPEN UBER EAT
									   	String ubereatmethodsexcel=Excelreader.getData(0, 30, 6);
										String ubereatmethodshead=page.applyjoblinkmethods();
										if(ubereatmethodshead.equals(ubereatmethodsexcel)) {
										   	test.pass("TC:35 APPLY FOR JOB'  LINK IS WORKING ");
										}else {
										   	test.fail("TC:35 APPLY FOR JOB'  LINK IS WORKING '");
										   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
										   			" APPLY FOR JOB'  LINK IS WORKING'");
										   }
									}else {
									   	test.fail("TC:35 CANCEL BUTTON IS WORKING FINE AFTER CLICK ON 'APPLY FOR JOBS LINK'");
									   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
									   			" CANCEL BUTTON IS WORKING FINE AFTER CLICK ON 'APPLY FOR JOBS LINK'");
									   }}catch (Exception e) {
		 	 								test.fail("Error:"+ e.getMessage());
		 	 							}
								}else {
								   	test.fail("TC:34 'APPLY FOR JOBS'  LINK IS NOT CLICKABLE AND LEGAL BUMPER ALSO IS WORKING ");
								   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
								   			" 'APPLY FOR JOBS' LINK IS NOT CLICKABLE ");
								   }}catch (Exception e) {
	 	 								test.fail("Error:"+ e.getMessage());
	 	 							}	
       						 }else {
    						    	test.fail("TC:33 VERIFY LABEL ' APPLY FOR JOB LINK' IS NOT DISPLAYED");
    						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
    						    			" VERIFY LABEL ' APPLY FOR JOB LINK' IS DISPLAYED");
    						    }	}catch (Exception e) {
	 								test.fail("Error:"+ e.getMessage());
	 							}	
    						}else {
			 				   	test.fail("TC:6 SEARCH BUTTON IS NOT WORKING FINE");
			 				   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
			 				   			"SEARCH BUTTON IS NOT WORKING FINE");
			 				   }			
   		    }catch (Exception e) {
   				 test.fail("Error:"+ e.getMessage());
   			} 
    }

    @Test(priority=8)
   	public void Apply_For_Job_Link_List_View() {
       	Restaurant_Locator_Page page= new Restaurant_Locator_Page(driver);
   			 test=extent.createTest("Apply_For_Job_Link_List_View");   
   		  try {
		    	driver.get(Basepage.readProperty("urlRL"));
		    	String gettitle=page.generallgetpagetitlemethod();
				String gettitleexcel=Excelreader.getData(0, 1, 5);
				if(gettitle.equals(gettitleexcel)) {
			    	test.pass("TC:1 URL IS OPENED");
			    }else {
			    	test.fail("TC:1 URL IS NOT OPENED");
			    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
			    			"URL IS NOT OPENED");
			    	extent.flush();
					driver.close();
					throw new SkipException("Skipping - ");
			    }
				}catch (Exception e) {
					 test.fail("Error:"+ e.getMessage());
					 extent.flush();
					 driver.close();
					throw new SkipException("Skipping - ");
				}	
   			 try {
    		    	// search button 
    					String searchbuttonexcel=Excelreader.getData(0, 6, 5);
    					String searchbuttonhead=page.searchbuttonmethod(searchbuttonexcel);
    						if(!searchbuttonhead.equals("")) {
    					   	test.pass("TC:6 SEARCH BUTTON IS WORKING FINE"); 
    					  //click on list view 
    	   					try {
    	  							String listviewclickhead=page.listviewclickmethod(); 
    	  							String listviewclickexcel=Excelreader.getData(0, 44, 5);
    	  							if(listviewclickhead.equals(listviewclickexcel)) {
    	  						    	test.pass("TC:53 USER SHOULD BE CLICK ON LIST VIEW");  	
    	  				 //chevron down icon is working or not	    	
    		 							String chevrondowniconhead=page.chevrondowniconmethod(); 
    		 							String chevrondowniconexcel=Excelreader.getData(0, 14, 5);
    		 							if(chevrondowniconhead.equalsIgnoreCase(chevrondowniconexcel)) {
    		 						    	test.pass("TC:55 CHEVRON DOWN ICON IS WORKING ON LIST VIEW");			   	
    			//McDonald's Careers label
    		 						    	try {
    	   					 String mcdolandscareerslabelhead=page.mcdolandscareerslabelmethod1(); 
    							String mcdolandscareerslabelexcel=Excelreader.getData(0, 29, 5);
    							if(mcdolandscareerslabelhead.equalsIgnoreCase(mcdolandscareerslabelexcel)) {
    						    	test.pass("TC:32  VERIFY LABEL 'McDONALD'S CAREERS ' IS DISPLAYED ON LIST VIEW");
    						    }else {
    						    	test.fail("TC:32 VERIFY LABEL 'McDONALD'S CAREERS ' IS NOT DISPLAYED ON LIST VIEW");
    						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
    						    			" VERIFY LABEL 'McDONALD'S CAREERS ' IS DISPLAYED ON LIST VIEW");
    						    }   	}catch (Exception e) {
 	 								test.fail("Error:"+ e.getMessage());
 	 								
 	 							}				   	
    		//apply for jobs label
    		 						    	try {
       	   					 String applyforjoblabellinkhead=page.applyforjoblabellinkmethod1(); 
       							String applyforjoblabellinkexcel=Excelreader.getData(0, 30, 5);
       							if(applyforjoblabellinkhead.equalsIgnoreCase(applyforjoblabellinkexcel)) {
       						    	test.pass("TC:33  VERIFY LABEL ' APPLY FOR JOB LINK' IS DISPLAYED ON LIST VIEW");
       						   //click on apply for jobs link			   	
              						 //Apply job BUTTON IS CLICKABLE OR NOT AND CANCLE BUTTON
           		 						 try {
       							   	String applyforjoblinkclickexcel=Excelreader.getData(0, 92, 5);
       								String applyforjoblinkclickhead=page.applyforjoblinkclickmethod1();
       								if(applyforjoblinkclickhead.equalsIgnoreCase(applyforjoblinkclickexcel)) {
       								   	test.pass("TC:34 'APPLY FOR JOBS' LINK IS CLICKABLE ON LIST VIEW");
       							//cancel button	   	
       								   	String ordermcdeliverylabelexcel1=Excelreader.getData(0, 30, 5);
       									String ordermcdeliverylabelhead1=page.cancelbuttonmethod31();
       									if(ordermcdeliverylabelhead1.equalsIgnoreCase(ordermcdeliverylabelexcel1)) {
       									   	test.pass("TC:35 CANCEL BUTTON IS WORKING FINE AFTER CLICK ON 'APPLY FOR JOBS LINK' OF LIST VIEW "); 
       							   //ORDER McDELIVERY BUTTON AND OPEN UBER EAT
       									   	String ubereatmethodsexcel=Excelreader.getData(0, 30, 6);
       										String ubereatmethodshead=page.applyjoblinkmethods1();
       										if(ubereatmethodshead.equals(ubereatmethodsexcel)) {
       										   	test.pass("TC:35 APPLY FOR JOB'  LINK IS WORKING ON LIST VIEW");
       										}else {
       										   	test.fail("TC:35 APPLY FOR JOB'  LINK IS WORKING 'ON LIST VIEW");
       										   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
       										   			" APPLY FOR JOB'  LINK IS WORKING'ON LIST VIEW");
       										   }				   	
       									}else {
       									   	test.fail("TC:35 CANCEL BUTTON IS WORKING FINE AFTER CLICK ON 'APPLY FOR JOBS LINK' OF LIST VIEW");
       									   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
       									   			" CANCEL BUTTON IS WORKING FINE AFTER CLICK ON 'APPLY FOR JOBS LINK' OF LIST VIEW");
       									   }
       								}else {
       								   	test.fail("TC:34 'APPLY FOR JOBS'  LINK IS NOT CLICKABLE ");
       								   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
       								   			" 'APPLY FOR JOBS' LINK IS NOT CLICKABLE ");
       								   }}catch (Exception e) {
       	 	 								test.fail("Error:"+ e.getMessage());
       	 	 								
       	 	 							}     						    	
       						    }else {
       						    	test.fail("TC:33 VERIFY LABEL ' APPLY FOR JOB LINK' IS NOT DISPLAYED ON LIST VIEW");
       						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
       						    			" VERIFY LABEL ' APPLY FOR JOB LINK' IS DISPLAYED ON LIST VIEW");
       						    }	}catch (Exception e) {
 	 								test.fail("Error:"+ e.getMessage());
 	 								
 	 							}			   	
    	
    		 				 }else {
    			 		    	test.fail("TC:55 CHEVRON DOWN ICON IS WORKING ON LIST VIEW");
    					    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
    			 						    			"CHEVRON DOWN ICON IS WORKING ON LIST VIEW");
    						    } 
    	  					 }else {
    	 				    	test.fail("TC:53 USER SHOULD BE CLICK ON LIST VIEW");
    	 						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
    	 						    			"USER SHOULD BE CLICK ON LIST VIEW");
    	 						    } 
    	   					}catch (Exception e) {
    	   	   				 test.fail("Error:"+ e.getMessage());
    	   	   			}
    						}else {
			 				   	test.fail("TC:6 SEARCH BUTTON IS NOT WORKING FINE");
			 				   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
			 				   			"SEARCH BUTTON IS NOT WORKING FINE");
			 				   }			
   		    }catch (Exception e) {
   				 test.fail("Error:"+ e.getMessage());
   			}  }*/
  
    @Test(priority=9)
   	public void Order_McDelivery_Link_Mapview() {
       	Restaurant_Locator_Page page= new Restaurant_Locator_Page(driver);
   			 test=extent.createTest("Order_McDelivery_Link_Mapview"); 
   		  try {
		    	driver.get(Basepage.readProperty("urlRL"));
		    	String gettitle=page.generallgetpagetitlemethod();
				String gettitleexcel=Excelreader.getData(0, 1, 5);
				if(gettitle.equals(gettitleexcel)) {
			    	test.pass("TC:1 URL IS OPENED");
			    }else {
			    	test.fail("TC:1 URL IS NOT OPENED");
			    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
			    			"URL IS NOT OPENED");
			    	extent.flush();
					driver.close();
					throw new SkipException("Skipping - ");
			    }
				}catch (Exception e) {
					 test.fail("Error:"+ e.getMessage());
					 extent.flush();
					 driver.close();
					throw new SkipException("Skipping - ");
				}			 
    try {
    	// search button  
			String searchbuttonexcel=Excelreader.getData(0, 5, 5);
			String searchbuttonhead=page.searchbuttonmethod(searchbuttonexcel);
				if(!searchbuttonhead.equals("")) {
			   	test.pass("TC:6 SEARCH BUTTON IS WORKING FINE"); 
			   	
			  /*//order Mcdelivery label
		    	String ordermcdeliverymaplabelexcel=Excelreader.getData(0, 10, 7);
				String ordermcdeliverymaplabelhead=page.ordermcdeliverylabelmapmethod();
				if(ordermcdeliverymaplabelhead.equalsIgnoreCase(ordermcdeliverymaplabelexcel)) { */
					 //ORDER McDELIVERY LABEL
					try {
				   	String ordermcdeliverylabelexcel=Excelreader.getData(0, 10, 5);
					String ordermcdeliverylabelhead=page.ordermcdeliverylabelmethod();
					if(ordermcdeliverylabelhead.equalsIgnoreCase(ordermcdeliverylabelexcel)) {
					   	test.pass("TC:9 VERIFY LABEL 'ORDER McDELIVERY' IS DISPLAYED ");
					}else {
					   	test.fail("TC:9 VERIFY LABEL 'ORDER McDELIVERY' IS NOT DISPLAYED");
					   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
					   			" VERIFY LABEL 'ORDER McDELIVERY' IS DISPLAYED");
					   }
					}catch (Exception e) {
						 test.fail("Error:"+ e.getMessage());
					}
				    //ORDER McDELIVERY BUTTON IS CLICKABLE OR NOT AND CANCLE BUTTON
				   	
							String ordermcdeliveryclickhead=page.ordermcdeliveryclickmethod();
							String ordermcdeliveryclickexcel=Excelreader.getData(0, 11, 5);
							if(ordermcdeliveryclickhead.equals(ordermcdeliveryclickexcel)) {
							   	test.pass("TC:10 'ORDER McDELIVERY' BUTTON IS CLICKABLE ");
						//cancel button	   	
							   	String ordermcdeliverylabelexcel1=Excelreader.getData(0, 10, 5);
								String ordermcdeliverylabelhead1=page.cancelbuttonmethod();
								if(ordermcdeliverylabelhead1.equalsIgnoreCase(ordermcdeliverylabelexcel1)) {
								   	test.pass("TC:11 CANCEL BUTTON IS WORKING FINE ON LEGAL BUMPER OF 'ORDER McDELIVERY'"); 
								   //ORDER McDELIVERY BUTTON AND OPEN UBER EAT
								   	String ubereatmethodsexcel=Excelreader.getData(0, 48, 6);
									String ubereatmethodshead=page.ubereatmethods();
									if(ubereatmethodshead.equals(ubereatmethodsexcel)) {
									   	test.pass("TC:12 UBER EAT LINK IS OPEN ON 'ORDER McDELIVERY' ");
									}else {
									   	test.fail("TC:12 UBER EAT LINK IS NOT OPEN ON 'ORDER McDELIVERY'");
									   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
									   			" UBER EAT LINK NOT IS OPEN ON 'ORDER McDELIVERY'");
									   }
									
									
									/*//ORDER McDELIVERY BUTTON AND OPEN DoorDash
								   	String doordashmethodsexcel=Excelreader.getData(0, 68, 6);
									String doordashmethodshead=page.doordashmethods();
									if(doordashmethodshead.equals(doordashmethodsexcel)) {
									   	test.pass("TC:13 DOOR DASH LINK IS OPEN ON 'ORDER McDELIVERY' ");
									}else {
									   	test.fail("TC:13 DOOR DASH LINK IS NOT OPEN ON 'ORDER McDELIVERY'");
									   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
									   			" UBER EAT LINK NOT IS OPEN ON 'ORDER McDELIVERY'");
									   }*/
									
									/*//ORDER McDELIVERY BUTTON AND OPEN GrubHub
								   	String grubhubmethodsexcel=Excelreader.getData(0, 81, 6);
									String grubhubmethodshead=page.grubhubmethods();
									if(grubhubmethodshead.equals(grubhubmethodsexcel)) {
									   	test.pass("TC:14 GRUB HUB LINK IS OPEN ON 'ORDER McDELIVERY' ");
									}else {
									   	test.fail("TC:14 GRUB HUB LINK IS NOT OPEN ON 'ORDER McDELIVERY'");
									   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
									   			" UBER EAT LINK NOT IS OPEN ON 'ORDER McDELIVERY'");
									   }*/
									
									
									
								}else {
								   	test.fail("TC:11 CANCEL BUTTON IS WORKING FINE ON LEGAL BUMPER OF 'ORDER McDELIVERY'");
								   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
								   			" CANCEL BUTTON IS WORKING FINE ON LEGAL BUMPER OF 'ORDER McDELIVERY'");
								   }
							}else {
							   	test.fail("TC:10 'ORDER McDELIVERY' BUTTON IS NOT CLICKABLE ");
							   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
							   			" 'ORDER McDELIVERY' BUTTON IS NOT CLICKABLE ");
							   }	
				}/*else if (!ordermcdeliverymaplabelhead.equals("")){
				   	test.fail("TC:9 VERIFY LABEL 'ORDER McDELIVERY' IS NOT DISPLAYED ON LIST VIEW");
				   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
				   			" VERIFY LABEL 'ORDER McDELIVERY' IS NOT DISPLAYED ON LIST VIEW");
				   }*/
				else {
 				   	test.fail("TC:6 SEARCH BUTTON IS NOT WORKING FINE");
 				   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
 				   			"SEARCH BUTTON IS NOT WORKING FINE");
 				   }
    
    }catch (Exception e) {
		 test.fail("Error:"+ e.getMessage());
	}
    }
    
    
      /*@Test(priority=10)
   	public void Order_Now_Link_Mapview() {
       	Restaurant_Locator_Page page= new Restaurant_Locator_Page(driver);
   			 test=extent.createTest("Order_Now_Link_Mapview");   
    
   		  try {
		    	driver.get(Basepage.readProperty("urlRL"));
		    	String gettitle=page.generallgetpagetitlemethod();
				String gettitleexcel=Excelreader.getData(0, 1, 5);
				if(gettitle.equals(gettitleexcel)) {
			    	test.pass("TC:1 URL IS OPENED");
			    }else {
			    	test.fail("TC:1 URL IS NOT OPENED");
			    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
			    			"URL IS NOT OPENED");
			    	extent.flush();
					driver.close();
					throw new SkipException("Skipping - ");
			    }
				}catch (Exception e) {
					 test.fail("Error:"+ e.getMessage());
					 extent.flush();
					 driver.close();
					throw new SkipException("Skipping - ");
				}	
   			 try {
   		    	// search button  
   					String searchbuttonexcel=Excelreader.getData(0, 5, 5);
   					String searchbuttonhead=page.searchbuttonmethod(searchbuttonexcel);
   						if(!searchbuttonhead.equals("")) {
   					   	test.pass("TC:6 SEARCH BUTTON IS WORKING FINE");
   					   	try {
   			//McDelivery@ label
   					 String McDeliverylabelhead=page.McDeliverylabelmethod(); 
						String McDeliverylabelexcel=Excelreader.getData(0, 26, 5);
						if(McDeliverylabelhead.equalsIgnoreCase(McDeliverylabelexcel)) {
					    	test.pass("TC:26  VERIFY LABEL 'McDELIVERY@ OVER ORDER NOW LINK' IS DISPLAYED");
					    }else {
					    	test.fail("TC:26 VERIFY LABEL 'McDELIVERY@ OVER ORDER NOW LINK' IS NOT DISPLAYED");
					    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
					    			" VERIFY LABEL 'McDELIVERY@ OVER ORDER NOW LINK' IS DISPLAYED");
					    }}catch (Exception e) {
					    	test.fail("Error:"+ e.getMessage());
						}
			//McDelivery label
   					   	try {
	   					 String McDeliverylabelhead1=page.McDeliverylabel2method(); 
							String McDeliverylabelexcel1=Excelreader.getData(0, 27, 5);
							if(McDeliverylabelhead1.equalsIgnoreCase(McDeliverylabelexcel1)) {
						    	test.pass("TC:27  VERIFY LABEL 'McDELIVERY OVER ORDER NOW LINK' IS DISPLAYED");
						    }else {
						    	test.fail("TC:27 VERIFY LABEL 'McDELIVERY OVER ORDER NOW LINK' IS NOT DISPLAYED");
						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
						    			" VERIFY LABEL 'McDELIVERY OVER ORDER NOW LINK' IS DISPLAYED");
						    }	}catch (Exception e) {
						    	test.fail("Error:"+ e.getMessage());
							}		   	
   			//order now 
   					   	try {
							 String ordernowlabelhead=page.ordernowlabelmethod(); 
								String ordernowlabelexcel=Excelreader.getData(0, 28, 5);
								if(ordernowlabelhead.equals(ordernowlabelexcel)) {
							    	test.pass("TC:28  VERIFY LABEL 'ORDER NOW LINK' IS DISPLAYED");
							    		
   	//click on order now
						 //ORDER now BUTTON IS CLICKABLE OR NOT AND CANCLE BUTTON
							   	String ordernowlinkclickexcel=Excelreader.getData(0, 11, 5);
								String ordernowlinkclickhead=page.ordernowlinkclickmethod();
								if(ordernowlinkclickhead.equalsIgnoreCase(ordernowlinkclickexcel)) {
								   	test.pass("TC:29 'ORDER NOW' LINK IS CLICKABLE ");
							//cancel button	   	
								   	String ordermcdeliverylabelexcel1=Excelreader.getData(0, 28, 5);
									String ordermcdeliverylabelhead1=page.cancelbuttonmethod2();
									if(ordermcdeliverylabelhead1.equalsIgnoreCase(ordermcdeliverylabelexcel1)) {
									   	test.pass("TC:30 CANCEL BUTTON IS WORKING FINE AFTER CLICK ON 'ORDER NOW LINK' "); 
						  //ORDER McDELIVERY BUTTON AND OPEN UBER EAT
									   	String ubereatmethodsexcel=Excelreader.getData(0, 48, 6);
										String ubereatmethodshead=page.ubereatordernowmethods();
										if(ubereatmethodshead.equals(ubereatmethodsexcel)) {
										   	test.pass("TC:31 UBER EAT LINK IS OPEN ON 'ORDER NOW' ");
										}else {
										   	test.fail("TC:31 UBER EAT LINK IS NOT OPEN ON 'ORDER NOW '");
										   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
										   			" UBER EAT LINK NOT IS OPEN ON 'ORDER NOW'");
										   }
										
										//ORDER McDELIVERY BUTTON AND OPEN GrubHub
									   	String grubhubmethodsexcel=Excelreader.getData(0, 81, 6);
										String grubhubmethodshead=page.grubhubmethods();
										if(grubhubmethodshead.equals(grubhubmethodsexcel)) {
										   	test.pass("TC:32 GRUB HUB LINK IS OPEN ON 'ORDER McDELIVERY' ");
										}else {
										   	test.fail("TC:32 GRUB HUB LINK IS NOT OPEN ON 'ORDER McDELIVERY'");
										   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
										   			" UBER EAT LINK NOT IS OPEN ON 'ORDER McDELIVERY'");
										   }
										
										//ORDER McDELIVERY BUTTON AND OPEN DoorDash
									   	String doordashmethodsexcel=Excelreader.getData(0, 68, 6);
										String doordashmethodshead=page.doordashmethods();
										if(doordashmethodshead.equals(doordashmethodsexcel)) {
										   	test.pass("TC:33 DOOR DASH LINK IS OPEN ON 'ORDER McDELIVERY' ");
										}else {
										   	test.fail("TC:33 DOOR DASH LINK IS NOT OPEN ON 'ORDER McDELIVERY'");
										   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
										   			" UBER EAT LINK NOT IS OPEN ON 'ORDER McDELIVERY'");
										   }
									}else {
									   	test.fail("TC:30 CANCEL BUTTON IS WORKING FINE AFTER CLICK ON 'ORDER NOW LINK'");
									   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
									   			" CANCEL BUTTON IS WORKING FINE AFTER CLICK ON 'ORDER NOW LINK'");
									   }
								}else {
								   	test.fail("TC:29 'ORDER NOW'  LINK IS NOT CLICKABLE ");
								   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
								   			" 'ORDER NOW' LINK IS NOT CLICKABLE ");
								   }}else {
								    	test.fail("TC:28 VERIFY LABEL ' ORDER NOW LINK' IS NOT DISPLAYED");
								    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
								    			" VERIFY LABEL ' ORDER NOW LINK' IS DISPLAYED");
								    }	}catch (Exception e) {
								    	test.fail("Error:"+ e.getMessage());
									}
							
							}else {
			 				   	test.fail("TC:6 SEARCH BUTTON IS NOT WORKING FINE");
			 				   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
			 				   			"SEARCH BUTTON IS NOT WORKING FINE");
			 				   }			
   		    }catch (Exception e) {
   				 test.fail("Error:"+ e.getMessage());
   			} 
    } */
    
   /* @Test(priority=11)
   	public void Order_McDelivery_List_View() {
       	Restaurant_Locator_Page page= new Restaurant_Locator_Page(driver);
   			 test=extent.createTest("Order_McDelivery_List_View"); 
   		  try {
		    	driver.get(Basepage.readProperty("urlRL"));
		    	String gettitle=page.generallgetpagetitlemethod();
				String gettitleexcel=Excelreader.getData(0, 1, 5);
				if(gettitle.equals(gettitleexcel)) {
			    	test.pass("TC:1 URL IS OPENED");
			    }else {
			    	test.fail("TC:1 URL IS NOT OPENED");
			    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
			    			"URL IS NOT OPENED");
			    	extent.flush();
					driver.close();
					throw new SkipException("Skipping - ");
			    }
				}catch (Exception e) {
					 test.fail("Error:"+ e.getMessage());
					 extent.flush();
					 driver.close();
					throw new SkipException("Skipping - ");
				}		 
    try {
    	// search button  
			String searchbuttonexcel=Excelreader.getData(0, 5, 5);
			String searchbuttonhead=page.searchbuttonmethod(searchbuttonexcel);
				if(!searchbuttonhead.equals("")) {
			   	test.pass("TC:6 SEARCH BUTTON IS WORKING FINE"); 
		//click on list view
			   	String listviewclickhead=page.listviewclickmethod(); 
				String listviewclickexcel=Excelreader.getData(0, 44, 5);
				if(listviewclickhead.equals(listviewclickexcel)) {
			    	test.pass("TC:53 USER SHOULD BE CLICK ON LIST VIEW");
			//order Mcdelivery label
			    	String ordermcdeliverylabelexcel=Excelreader.getData(0, 10, 6);
			    	String ordermcdeliverylabelexcel12=Excelreader.getData(0, 11, 6);
					String ordermcdeliverylabelhead=page.ordermcdeliverylabelmethod1p();
					if(ordermcdeliverylabelhead.equals(ordermcdeliverylabelexcel)) {
						 //ORDER McDELIVERY LABEL
						try {
					   	String ordermcdeliverylabelexcelp=Excelreader.getData(0, 10, 5);
						String ordermcdeliverylabelheadp=page.ordermcdeliverylabelmethod1();
						if(ordermcdeliverylabelheadp.equalsIgnoreCase(ordermcdeliverylabelexcelp)) {
						   	test.pass("TC:9 VERIFY LABEL 'ORDER McDELIVERY' IS DISPLAYED ON LIST VIEW");
						}else {
						   	test.fail("TC:9 VERIFY LABEL 'ORDER McDELIVERY' IS NOT DISPLAYED ON LIST VIEW");
						   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
						   			" VERIFY LABEL 'ORDER McDELIVERY' IS NOT DISPLAYED ON LIST VIEW");
						   }  }catch (Exception e) {
								 test.fail("Error:"+ e.getMessage());
							} 
						
						  //ORDER McDELIVERY BUTTON IS CLICKABLE OR NOT AND CANCLE BUTTON
					   	String ordermcdeliveryclickexcel=Excelreader.getData(0, 11, 5);
						String ordermcdeliveryclickhead=page.ordermcdeliveryclickmethod1();
						if(ordermcdeliveryclickhead.equals(ordermcdeliveryclickexcel)) {
						   	test.pass("TC:10 'ORDER McDELIVERY' BUTTON IS CLICKABLE ON LIST VIEW");
					//cancel button	   	
						   	String ordermcdeliverylabelexcel1=Excelreader.getData(0, 10, 5);
							String ordermcdeliverylabelhead1=page.cancelbuttonmethod1();
							if(ordermcdeliverylabelhead1.equalsIgnoreCase(ordermcdeliverylabelexcel1)) {
							   	test.pass("TC:11 CANCEL BUTTON IS WORKING FINE AFTER CLICK ON 'ORDER McDELIVERY' ON LIST VIEW ");   	
							  //ORDER McDELIVERY BUTTON AND OPEN UBER EAT
							   	String ubereatmethodsexcel=Excelreader.getData(0, 48, 6);
								String ubereatmethodshead=page.ubereatmethods1();
								if(ubereatmethodshead.equals(ubereatmethodsexcel)) {
								   	test.pass("TC:12 UBER EAT LINK IS OPEN ON 'ORDER McDELIVERY' OF LIST VIEW");
								}else {
								   	test.fail("TC:12 UBER EAT LINK IS NOT OPEN ON 'ORDER McDELIVERY' OF LIST VIEW");
								   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
								   			" UBER EAT LINK NOT IS OPEN ON 'ORDER McDELIVERY' OF LIST VIEW");
								   }
							}else {
							   	test.fail("TC:11 CANCEL BUTTON IS WORKING FINE AFTER CLICK ON 'ORDER McDELIVERY' ON LIST VIEW");
							   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
							   			" CANCEL BUTTON IS WORKING FINE AFTER CLICK ON 'ORDER McDELIVERY' ON LIST VIEW");
							   }
						}else {
						   	test.fail("TC:10 'ORDER McDELIVERY' BUTTON IS NOT CLICKABLE ON LIST VIEW");
						   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
						   			" 'ORDER McDELIVERY' BUTTON IS NOT CLICKABLE ON LIST VIEW");
						   }
						
					}else if (ordermcdeliverylabelhead.equals(ordermcdeliverylabelexcel12)){
					   	test.fail("TC:9 VERIFY LABEL 'ORDER McDELIVERY' IS NOT DISPLAYED ON LIST VIEW");
					   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
					   			" VERIFY LABEL 'ORDER McDELIVERY' IS NOT DISPLAYED ON LIST VIEW");
					   }
				 }else {
				    	test.fail("TC:53 USER SHOULD BE CLICK ON LIST VIEW OF LIST VIEW");
				    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
				    			"USER SHOULD BE CLICK ON LIST VIEW OF LIST VIEW");
				    }
				}else {
 				   	test.fail("TC:6 SEARCH BUTTON IS NOT WORKING FINE OF LIST VIEW");
 				   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
 				   			"SEARCH BUTTON IS NOT WORKING FINE OF LIST VIEW");
 				   }
    
    }catch (Exception e) {
		 test.fail("Error:"+ e.getMessage());
	} 
    } */
    
      /*@Test(priority=12)
   	public void Order_Now_Link_List_view() {
       	Restaurant_Locator_Page page= new Restaurant_Locator_Page(driver);
   			 test=extent.createTest("Order_Now_Link_List_view");   
   		  try {
		    	driver.get(Basepage.readProperty("urlRL"));
		    	String gettitle=page.generallgetpagetitlemethod();
				String gettitleexcel=Excelreader.getData(0, 1, 5);
				if(gettitle.equals(gettitleexcel)) {
			    	test.pass("TC:1 URL IS OPENED");
			    }else {
			    	test.fail("TC:1 URL IS NOT OPENED");
			    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
			    			"URL IS NOT OPENED");
			    	extent.flush();
					driver.close();
					throw new SkipException("Skipping - ");
			    }
				}catch (Exception e) {
					 test.fail("Error:"+ e.getMessage());
					 extent.flush();
					 driver.close();
					throw new SkipException("Skipping - ");
				}	
   			 try {
   		   // search button 
   					String searchbuttonexcel=Excelreader.getData(0, 6, 5);
   					String searchbuttonhead=page.searchbuttonmethod(searchbuttonexcel);
   						if(!searchbuttonhead.equals("")) {
   					   	test.pass("TC:6 SEARCH BUTTON IS WORKING FINE");
   			//click on list view 
   					try {
  							String listviewclickhead=page.listviewclickmethod(); 
  							String listviewclickexcel=Excelreader.getData(0, 44, 5);
  							if(listviewclickhead.equals(listviewclickexcel)) {
  						    	test.pass("TC:53 USER SHOULD BE CLICK ON LIST VIEW");  	
  				 //chevron down icon is working or not	    	
	 							String chevrondowniconhead=page.chevrondowniconmethod(); 
	 							String chevrondowniconexcel=Excelreader.getData(0, 14, 5);
	 							if(chevrondowniconhead.equalsIgnoreCase(chevrondowniconexcel)) {
	 						    	test.pass("TC:55 CHEVRON DOWN ICON IS WORKING ON LIST VIEW");
   			//McDelivery@ label
	 						    	try {
   					 String McDeliverylabelhead=page.McDeliverylabelmethod1(); 
						String McDeliverylabelexcel=Excelreader.getData(0, 26, 5);
						if(McDeliverylabelhead.equalsIgnoreCase(McDeliverylabelexcel)) {
					    	test.pass("TC:26  VERIFY LABEL 'McDELIVERY@ OVER ORDER NOW LINK' IS DISPLAYED ON LIST VIEW");
					    }else {
					    	test.fail("TC:26 VERIFY LABEL 'McDELIVERY@ OVER ORDER NOW LINK' IS NOT DISPLAYED ON LIST VIEW");
					    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
					    			" VERIFY LABEL 'McDELIVERY@ OVER ORDER NOW LINK' IS DISPLAYED ON LIST VIEW");
					    }}catch (Exception e) {
							 test.fail("Error:"+ e.getMessage());
					    }
			//McDelivery label
						try {
	   					 String McDeliverylabelhead1=page.McDeliverylabel2method1(); 
							String McDeliverylabelexcel1=Excelreader.getData(0, 27, 5);
							if(McDeliverylabelhead1.equalsIgnoreCase(McDeliverylabelexcel1)) {
						    	test.pass("TC:27  VERIFY LABEL 'McDELIVERY OVER ORDER NOW LINK' IS DISPLAYED ON LIST VIEW");
						    }else {
						    	test.fail("TC:27 VERIFY LABEL 'McDELIVERY OVER ORDER NOW LINK' IS NOT DISPLAYED ON LIST VIEW");
						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
						    			" VERIFY LABEL 'McDELIVERY OVER ORDER NOW LINK' IS DISPLAYED ON LIST VIEW");
						    }	}catch (Exception e) {
								 test.fail("Error:"+ e.getMessage());
						    }		   	
   			//order now 
						try {
						String ordernowlabelhead=page.ordernowlabelmethod1(); 
								String ordernowlabelexcel=Excelreader.getData(0, 93, 5);
								if(ordernowlabelhead.equalsIgnoreCase(ordernowlabelexcel)) {
							    	test.pass("TC:28  VERIFY LABEL 'ORDER NOW LINK' IS DISPLAYED ON LIST VIEW");
							   
   	//click on order now
								 //ORDER McDELIVERY BUTTON IS CLICKABLE OR NOT AND CANCLE BUTTON
							   	String ordernowlinkclickexcel=Excelreader.getData(0, 11, 5);
								String ordernowlinkclickhead=page.ordernowlinkclickmethod1();
								if(ordernowlinkclickhead.equalsIgnoreCase(ordernowlinkclickexcel)) {
								   	test.pass("TC:29 'ORDER NOW' LINK IS CLICKABLE ON LIST VIEW ");
							//cancel button	   	
								   	String ordermcdeliverylabelexcel1=Excelreader.getData(0, 93, 5);
									String ordermcdeliverylabelhead1=page.cancelbuttonmethod21();
									if(ordermcdeliverylabelhead1.equals(ordermcdeliverylabelexcel1)) {
									   	test.pass("TC:30 CANCEL BUTTON IS WORKING FINE AFTER CLICK ON 'ORDER NOW LINK' OF LIST VIEW "); 
						  //ORDER McDELIVERY BUTTON AND OPEN UBER EAT
									   	String ubereatmethodsexcel=Excelreader.getData(0, 48, 6);
										String ubereatmethodshead=page.ubereatmethods2();
										if(ubereatmethodshead.equals(ubereatmethodsexcel)) {
										   	test.pass("TC:31 UBER EAT LINK IS OPEN ON 'ORDER NOW' ");
										}else {
										   	test.fail("TC:31 UBER EAT LINK IS NOT OPEN ON 'ORDER NOW '");
										   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
										   			" UBER EAT LINK NOT IS OPEN ON 'ORDER NOW'");
										   }
										
										
										//ORDER McDELIVERY BUTTON AND OPEN DoorDash
									   	String doordashmethodsexcel=Excelreader.getData(0, 68, 6);
										String doordashmethodshead=page.doordashmethods();
										if(doordashmethodshead.equals(doordashmethodsexcel)) {
										   	test.pass("TC:32 DOOR DASH LINK IS OPEN ON 'ORDER McDELIVERY' ");
										}else {
										   	test.fail("TC:32 DOOR DASH LINK IS NOT OPEN ON 'ORDER McDELIVERY'");
										   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
										   			" UBER EAT LINK NOT IS OPEN ON 'ORDER McDELIVERY'");
										   }
									}else {
									   	test.fail("TC:30 CANCEL BUTTON IS WORKING FINE AFTER CLICK ON 'ORDER NOW LINK' OF LIST VIEW");
									   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
									   			" CANCEL BUTTON IS WORKING FINE AFTER CLICK ON 'ORDER NOW LINK' OF LIST VIEW");
									   }
								}else {
								   	test.fail("TC:29 'ORDER NOW'  LINK IS NOT CLICKABLE ON LIST VIEW");
								   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
								   			" 'ORDER NOW' LINK IS NOT CLICKABLE ON LIST VIEW");
								   }
								 }else {
								    	test.fail("TC:28 VERIFY LABEL ' ORDER NOW LINK' IS NOT DISPLAYED ON LIST VIEW");
								    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
								    			" VERIFY LABEL ' ORDER NOW LINK' IS DISPLAYED ON LIST VIEW");
								    }	}catch (Exception e) {
										 test.fail("Error:"+ e.getMessage());
								    }
							
	 							 }else {
		 						    	test.fail("TC:55 CHEVRON DOWN ICON IS WORKING ON LIST VIEW");
		 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
		 						    			"CHEVRON DOWN ICON IS WORKING ON LIST VIEW");
		 						    } 
  							 }else {
 						    	test.fail("TC:53 USER SHOULD BE CLICK ON LIST VIEW");
 						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
 						    			"USER SHOULD BE CLICK ON LIST VIEW");
 						    } 
   					}catch (Exception e) {
   	   				 test.fail("Error:"+ e.getMessage());
   	   			}
							}else {
			 				   	test.fail("TC:6 SEARCH BUTTON IS NOT WORKING FINE");
			 				   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
			 				   			"SEARCH BUTTON IS NOT WORKING FINE");
			 				   }			
   		    }catch (Exception e) {
   				 test.fail("Error:"+ e.getMessage());
   			} 
    } 
*/
     @Test(priority=13)
   	public void Locate_me() {
         	Restaurant_Locator_Page page= new Restaurant_Locator_Page(driver);
     			 test=extent.createTest("Locate_me"); 
     			 try {
     		    	driver.get(Basepage.readProperty("urlRL"));
     		    	String gettitle=page.generallgetpagetitlemethod();
     				String gettitleexcel=Excelreader.getData(0, 1, 5);
     				if(gettitle.equals(gettitleexcel)) {
     			    	test.pass("TC:1 URL IS OPENED");
     			    }else {
     			    	test.fail("TC:1 URL IS NOT OPENED");
     			    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
     			    			"URL IS NOT OPENED");
     			    	extent.flush();
     					driver.close();
     					throw new SkipException("Skipping - ");
     			    }
     				}catch (Exception e) {
     					 test.fail("Error:"+ e.getMessage());
     					 extent.flush();
     					 driver.close();
     					throw new SkipException("Skipping - ");
     				}
     			 
     			try {
     	   		   // search button 
     	   					String searchbuttonexcel=Excelreader.getData(0, 6, 5);
     	   					String searchbuttonhead=page.searchbuttonmethod(searchbuttonexcel);
     	   						if(!searchbuttonhead.equals("")) {
     	   					   	test.pass("TC:6 SEARCH BUTTON IS WORKING FINE");
     			 
     	 // locate me 
     			 try {
					String locatemelabelexcel=Excelreader.getData(0, 3, 5);
					String locatemelabelhead=page.locatemelabelmethod();
						if(locatemelabelhead.equalsIgnoreCase(locatemelabelexcel)) {
					   	test.pass("TC:54 VERIFY LABEL 'LOCATE ME' IS DISPLAYED");   			 
     			 
						}else {
		 				   	test.fail("TC:54 VERIFY LABEL 'LOCATE ME' IS NOT DISPLAYED");
		 				   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
		 				   			"VERIFY LABEL 'LOCATE ME' IS DISPLAYED");
		 				   }			
		    }catch (Exception e) {
				 test.fail("Error:"+ e.getMessage());
			} 
      // CLICK locate me 
     			 try {
					String restarentfilterhedingexcel=Excelreader.getData(0, 3, 5);
					String restarentfilterhedinghead=page.restarentfilterhedingmethod();
						if(!restarentfilterhedinghead.equalsIgnoreCase("")) {
					   	test.pass("TC:55 LOCATE ME BUTTON IS WORKING");   			 
						}else {
		 				   	test.fail("TC:55 LOCATE ME BUTTON IS NOT WORKING");
		 				   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
		 				   			"LOCATE ME BUTTON IS NOT WORKING");
		 				   }			
		    }catch (Exception e) {
				 test.fail("Error:"+ e.getMessage());
		    }
     	}
			 else {
				   	test.fail("TC:6 SEARCH BUTTON IS NOT WORKING FINE");
				   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
				   			"SEARCH BUTTON IS NOT WORKING FINE");
				   }			
}catch (Exception e) {
	 test.fail("Error:"+ e.getMessage());
} 
     }


    @Test(priority=14)
    public void Open_Close_Webstatus() {
          	Restaurant_Locator_Page page= new Restaurant_Locator_Page(driver);
      			 test=extent.createTest("Open_Close_Webstatus"); 
      			 try {
      		    	driver.get(Basepage.readProperty("urlRL"));
      		    	String gettitle=page.generallgetpagetitlemethod();
      				String gettitleexcel=Excelreader.getData(0, 1, 5);
      				if(gettitle.equals(gettitleexcel)) {
      			    	test.pass("TC:1 URL IS OPENED");
      			    }else {
      			    	test.fail("TC:1 URL IS NOT OPENED");
      			    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
      			    			"URL IS NOT OPENED");
      			    	extent.flush();
      					driver.close();
      					throw new SkipException("Skipping - ");
      			    }
      				}catch (Exception e) {
      					 test.fail("Error:"+ e.getMessage());
      					 extent.flush();
      					 driver.close();
      					throw new SkipException("Skipping - ");
      				}	
      	
      		// search button	 
      			 try {
        					String searchbuttonexcel=Excelreader.getData(0, 5, 5);
        					String searchbuttonhead=page.searchbuttonmethod(searchbuttonexcel);
        						if(!searchbuttonhead.equals("")) {
        					   	test.pass("TC:6 SEARCH BUTTON IS WORKING FINE");
        					   	try {
        					   	String openwebstatusexcel=Excelreader.getData(0, 59, 5);
        					   	String closewebstatusexcel=Excelreader.getData(0, 60, 5);
        					   	String openorclosehead=page.webstatusopenlabelmethod();
        					   	//OPEN WEB STATUS
        					   if(openwebstatusexcel.equalsIgnoreCase(openorclosehead))	{
        						   test.pass("TC:55 OPEN OF WEB STATUS IS DISPLAYED"); 
        						   //ORDER McDELIVERY LABEL
        							try {
        						   	String ordermcdeliverylabelexcel=Excelreader.getData(0, 10, 5);
        							String ordermcdeliverylabelhead=page.ordermcdeliverylabelmethod();
        							if(ordermcdeliverylabelhead.equalsIgnoreCase(ordermcdeliverylabelexcel)) {
        							   	test.pass("TC:9 VERIFY LABEL 'ORDER McDELIVERY' IS DISPLAYED ");
        							}else {
        							   	test.fail("TC:9 VERIFY LABEL 'ORDER McDELIVERY' IS NOT DISPLAYED");
        							   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
        							   			" VERIFY LABEL 'ORDER McDELIVERY' IS DISPLAYED");
        							   }
        							}catch (Exception e) {
        								test.fail("TC:9 VERIFY LABEL 'ORDER McDELIVERY' PATH  IS NOT CORRECT");
        								 test.fail("Error:"+ e.getMessage());
        							}
        						//CLOSE WEB STATUS   
        					   }else if(closewebstatusexcel.equalsIgnoreCase(openorclosehead)) {
        						   test.pass("TC:56 CLOSE OF WEB STATUS IS DISPLAYED");
        						 //ORDER McDELIVERY LABEL
       							try {
       						   	String ordermcdeliverylabelexcel=Excelreader.getData(0, 10, 5);
       							String ordermcdeliverylabelhead=page.ordermcdeliverylabelmethod();
       							if(!ordermcdeliverylabelhead.equalsIgnoreCase(ordermcdeliverylabelexcel)) {
       							   	test.pass("TC:9 VERIFY LABEL 'ORDER McDELIVERY' SHOULD NOT  DISPLAYED IN CLOSE STATUS");
       							}else {
       							   	test.fail("TC:9 VERIFY LABEL 'ORDER McDELIVERY' SHOULD NOT DISPLAYED IN CLOSE STATUS");
       							   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
       							   			" VERIFY LABEL 'ORDER McDELIVERY' IS DISPLAYED");
       							   }
       							}catch (Exception e) {
       								test.fail("TC:9 VERIFY LABEL 'ORDER McDELIVERY' PATH  IS NOT CORRECT");
       								 test.fail("Error:"+ e.getMessage());
       							}
       						//NULL WEB STATUS
        					   }else if(openorclosehead.equalsIgnoreCase("")){
        						   test.fail("TC:57 NULL OF WEB STATUS IS DISPLAYED");
        					   } }catch (Exception e) {
        						     test.fail("TC:55 WEB STATUS IS NOT DISPLAYED");
        		       				 test.fail("Error:"+ e.getMessage());
        		       			}
        					   	}else {
    			 				   	test.fail("TC:6 SEARCH BUTTON IS NOT WORKING FINE");
    			 				   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
    			 				   			"SEARCH BUTTON IS NOT WORKING FINE");
    			 				   }			
       		    }catch (Exception e) {
       				 test.fail("Error:"+ e.getMessage());
       			} 
      			 
      			 
       }


    @Test(priority=15)
   	public void Load_More() {
         	Restaurant_Locator_Page page= new Restaurant_Locator_Page(driver);
     			 test=extent.createTest("Load_More"); 
     			 try {
     		    	driver.get(Basepage.readProperty("urlRL"));
     		    	String gettitle=page.generallgetpagetitlemethod();
     				String gettitleexcel=Excelreader.getData(0, 1, 5);
     				if(gettitle.equals(gettitleexcel)) {
     			    	test.pass("TC:1 URL IS OPENED");
     			    }else {
     			    	test.fail("TC:1 URL IS NOT OPENED");
     			    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
     			    			"URL IS NOT OPENED");
     			    	extent.flush();
     					driver.close();
     					throw new SkipException("Skipping - ");
     			    }
     				}catch (Exception e) {
     					 test.fail("Error:"+ e.getMessage());
     					 extent.flush();
     					 driver.close();
     					throw new SkipException("Skipping - ");
     				}
     			 
     			try {
     	   		   // search button 
     	   					String searchbuttonexcel=Excelreader.getData(0, 6, 5);
     	   					String searchbuttonhead=page.searchbuttonmethod(searchbuttonexcel);
     	   						if(!searchbuttonhead.equals("")) {
     	   					   	test.pass("TC:6 SEARCH BUTTON IS WORKING FINE");
     	   					// Load More 
     	   	     			 try {
     	   						String loadmorelabelexcel=Excelreader.getData(0, 94, 5);
     	   						String loadmorelabelhead=page.loadmorelabelmethod();
     	   							if(loadmorelabelhead.equalsIgnoreCase(loadmorelabelexcel)) {
     	   						   	test.pass("TC:54 VERIFY LABEL 'LOAD MORE' IS DISPLAYED");   			 
     	   	     			 
     	   							}else {
     	   			 				   	test.fail("TC:54 VERIFY LABEL 'LOAD MORE' IS NOT DISPLAYED");
     	   			 				   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
     	   			 				   			"VERIFY LABEL 'LOAD MORE' IS DISPLAYED");
     	   			 				   }			
     	   			    }catch (Exception e) {
     	   					 test.fail("Error:"+ e.getMessage());
     	   				} 
     	   	      // CLICK Load More
     	   	     			 try {
     	   						String loadmoreexcel=Excelreader.getData(0, 95, 5);
     	   						String loadmorehead=page.loadmoremethod();
     	   							if(loadmorehead.equalsIgnoreCase("")) {
     	   						   	test.pass("TC:55 LOAD MORE BUTTON IS WORKING");   			 
     	   							}else {
     	   			 				   	test.fail("TC:55 LOAD MORE BUTTON IS NOT WORKING");
     	   			 				   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
     	   			 				   			"LOAD MORE BUTTON IS NOT WORKING");
     	   			 				   }			
     	   			    }catch (Exception e) {
     	   					 test.fail("Error:"+ e.getMessage());
     	   			    }   	   					   	
     	   					   	
     	   					   	
     	   					   	
     	   					}else {
			 				   	test.fail("TC:6 SEARCH BUTTON IS NOT WORKING FINE");
			 				   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
			 				   			"SEARCH BUTTON IS NOT WORKING FINE");
			 				   }			
   		    }catch (Exception e) {
  				 test.fail("Error:"+ e.getMessage());

    }

}
    
    // Header order now button
    @Test(priority=16)
   	public void Order_McDelivery_Link_Header() {
       	Restaurant_Locator_Page page= new Restaurant_Locator_Page(driver);
   			 test=extent.createTest("Order_McDelivery_Link_Header"); 
   		  try {
		    	driver.get(Basepage.readProperty("urlRL"));
		    	String gettitle=page.generallgetpagetitlemethod();
				String gettitleexcel=Excelreader.getData(0, 1, 5);
				if(gettitle.equals(gettitleexcel)) {
			    	test.pass("TC:1 URL IS OPENED");
			    }else {
			    	test.fail("TC:1 URL IS NOT OPENED");
			    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
			    			"URL IS NOT OPENED");
			    	extent.flush();
					driver.close();
					throw new SkipException("Skipping - ");
			    }
				}catch (Exception e) {
					 test.fail("Error:"+ e.getMessage());
					 extent.flush();
					 driver.close();
					throw new SkipException("Skipping - ");
				}			 
    try {
    	
					 //ORDER McDELIVERY LABEL
					try {
				   	String ordermcdeliverylabelexcel=Excelreader.getData(0, 22, 5);
					String ordermcdeliverylabelhead=page.ordermcdeliverylabelmethod2();
					if(ordermcdeliverylabelhead.equalsIgnoreCase(ordermcdeliverylabelexcel)) {
					   	test.pass("TC:9 VERIFY LABEL 'ORDER McDELIVERY' IS DISPLAYED ");
					}else {
					   	test.fail("TC:9 VERIFY LABEL 'ORDER McDELIVERY' IS NOT DISPLAYED");
					   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
					   			" VERIFY LABEL 'ORDER McDELIVERY' IS DISPLAYED");
					   }
					}catch (Exception e) {
						 test.fail("Error:"+ e.getMessage());
					}
				    //ORDER McDELIVERY BUTTON IS CLICKABLE OR NOT AND CANCLE BUTTON
				   	
							String ordermcdeliveryclickhead=page.ordermcdeliveryclickmethod3();
							String ordermcdeliveryclickexcel=Excelreader.getData(0, 11, 5);
							if(ordermcdeliveryclickhead.equals(ordermcdeliveryclickexcel)) {
							   	test.pass("TC:10 'ORDER McDELIVERY' BUTTON IS CLICKABLE ");
						//cancel button	   	
							   	String ordermcdeliverylabelexcel1=Excelreader.getData(0, 22, 5);
								String ordermcdeliverylabelhead1=page.cancelbuttonmethod4();
								if(ordermcdeliverylabelhead1.equalsIgnoreCase(ordermcdeliverylabelexcel1)) {
								   	test.pass("TC:11 CANCEL BUTTON IS WORKING FINE ON LEGAL BUMPER OF 'ORDER McDELIVERY'"); 
								   //ORDER McDELIVERY BUTTON AND OPEN UBER EAT
								   	String ubereatmethodsexcel=Excelreader.getData(0, 48, 6);
									String ubereatmethodshead=page.ubereatmethods();
									if(ubereatmethodshead.equals(ubereatmethodsexcel)) {
									   	test.pass("TC:12 UBER EAT LINK IS OPEN ON 'ORDER McDELIVERY' ");
									}else {
									   	test.fail("TC:12 UBER EAT LINK IS NOT OPEN ON 'ORDER McDELIVERY'");
									   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
									   			" UBER EAT LINK NOT IS OPEN ON 'ORDER McDELIVERY'");
									   }
									
									
									//ORDER McDELIVERY BUTTON AND OPEN DoorDash
								   	String doordashmethodsexcel=Excelreader.getData(0, 96, 5);
									String doordashmethodshead=page.doordashmethods();
									if(doordashmethodshead.equals(doordashmethodsexcel)) {
									   	test.pass("TC:13 DOOR DASH LINK IS OPEN ON 'ORDER McDELIVERY' ");
									}else {
									   	test.fail("TC:13 DOOR DASH LINK IS NOT OPEN ON 'ORDER McDELIVERY'");
									   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
									   			" UBER EAT LINK NOT IS OPEN ON 'ORDER McDELIVERY'");
									   }
									
									/*//ORDER McDELIVERY BUTTON AND OPEN GrubHub
								   	String grubhubmethodsexcel=Excelreader.getData(0, 81, 6);
									String grubhubmethodshead=page.grubhubmethods();
									if(grubhubmethodshead.equals(grubhubmethodsexcel)) {
									   	test.pass("TC:14 GRUB HUB LINK IS OPEN ON 'ORDER McDELIVERY' ");
									}else {
									   	test.fail("TC:14 GRUB HUB LINK IS NOT OPEN ON 'ORDER McDELIVERY'");
									   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
									   			" UBER EAT LINK NOT IS OPEN ON 'ORDER McDELIVERY'");
									   }*/
									
									
									
								}else {
								   	test.fail("TC:11 CANCEL BUTTON IS WORKING FINE ON LEGAL BUMPER OF 'ORDER McDELIVERY'");
								   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
								   			" CANCEL BUTTON IS WORKING FINE ON LEGAL BUMPER OF 'ORDER McDELIVERY'");
								   }
							}else {
							   	test.fail("TC:10 'ORDER McDELIVERY' BUTTON IS NOT CLICKABLE ");
							   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
							   			" 'ORDER McDELIVERY' BUTTON IS NOT CLICKABLE ");
							   }
    
    }catch (Exception e) {
		 test.fail("Error:"+ e.getMessage());
	}
    }
    
}

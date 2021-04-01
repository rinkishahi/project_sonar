package com.Mcd.qa.TestCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.McD.qa.Base.BaseTest;
import com.McD.qa.Extentreport.Extentreport;
import com.McD.qa.Pages.Basepage;
import com.McD.qa.Pages.Local_Restaurant_Page;
import com.McD.qa.Pages.Restaurant_Locator_Page;
import com.McD.qa.Utility.TestUtil;

public class Local_Restaurant extends BaseTest {
	
	String excelpath=System.getProperty("user.dir");
    TestUtil Excelreader= new TestUtil(excelpath+ "/src/main/java/com/McD/qa/TestData/Local_Restaurant.xls");
		
	
    @Test(priority=1)
   	public void Open_URL_Local_Restaurant() {
    	Local_Restaurant_Page page= new Local_Restaurant_Page(driver);
   			 test=extent.createTest("Open_URL_Local_Restaurant");
   			    
   			    try {
   			    	driver.get(Basepage.readProperty("urlRL"));
   			    	String gettitle=page.generallgetpagetitlemethod();
   					String gettitleexcel=Excelreader.getData(0, 1, 5);
   					if(gettitle.equals(gettitleexcel)) {
   				    	test.pass("TC:1 URL IS OPENED");
   				    }else {
   				    	test.fail("TC:1 URL IS NOT OPENED");
   				    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
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
 	public void Restautant_Locater() {
    	Local_Restaurant_Page page= new Local_Restaurant_Page(driver);
   			 test=extent.createTest("Local_Restaurant");
  
   			String restaurantlobbyhourslabelhead="";	//	RESTAURANT LOBBY HOURS LABEL	 
	    	String restaurantlobbymondayandhourslabelhead="";  //Monday and hours label on restaurant lobby 
	    	String drivethruhourslabelhead="";  //drive thru hours label on hide hours
	    	String drivethruhoursmondayhourslabelhead=""; //SERVICE TIMINGS ON DRIVE THRU HOURS 
	      	String showserverlabelhead=""; //show services label
	        String hideserviceslabelhead=""; //hide service label
		    String McDeliveryonhideserviceslabelhead=""; //McDelivery label on service
		    String imageofmcdeliveryhead="";    //McDelivery img on service
		    String wifionhideservicelabelhead="";   //wifi label on service
		    String imageofwifihead="";     //wifi img on service
		    String McDeliverylabelhead="";  //McDelivery@ label
		    String McDeliverylabelhead1="";  //McDelivery label
		    String mcdolandscareerslabelhead="";  //McDonald's Careers
		    String ordernowlabelhead="";   //order now label
		    String applyforjoblabellinkhead=""; //apply for  job
 /*try {
	// search button  
		String sendedzipvaluexcel=Excelreader.getData(0, 2, 5);
			String searchbuttonhead=page.searchbuttonmethod1(sendedzipvaluexcel);
				if(!searchbuttonhead.equals("")) {
			   	test.pass("TC:2 SEARCH BUTTON IS WORKING FINE");*/
			  //address displayed total
			   String addressdisplayedtotalhead=null;
			   	try {
			   	addressdisplayedtotalhead=page.addressdisplayedtotalmethod();
			   	if(!addressdisplayedtotalhead.equals("")) {
			    	test.pass("TC:3 VERIFY 'TOTAL ADDRESS' IS DISPLAYED");
			    }else {
			    	test.fail("TC:3 VERIFY 'TOTAL ADDRESS' IS NOT DISPLAYED");
			    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
			    			"VERIFY 'TOTAL ADDRESS' IS NOT DISPLAYED");
			    }}catch (Exception e) {
						 test.fail("Error:"+ e.getMessage());
	   						
					}
     	   	//set preferred location
			   	String setpreferredlocationlabelmethodhead="";
			   	try {
				 setpreferredlocationlabelmethodhead=page.setpreferredlocationlabelmethod();
				String setpreferredlocationlabelmethodexcel=Excelreader.getData(0, 3, 5);
				if(setpreferredlocationlabelmethodhead.equals(setpreferredlocationlabelmethodexcel)) {
			    	test.pass("TC:3 VERIFY LABEL 'SET PREFERRED' IS DISPLAYED");
			    	
			    }else {
			    	test.fail("TC:3 VERIFY LABEL 'SET PREFERRED' IS DISPLAYED");
			    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
			    			"VERIFY LABEL 'SET PREFERRED' IS DISPLAYED");
			    }}catch (Exception e) {
						 test.fail("Error:"+ e.getMessage());
	   						
					}
				
				//show hours label   
			   	String showhourslabelhead="";
			   	try {
								 showhourslabelhead=page.showhourslabelmethod(); 
								String showhourslabelexcel=Excelreader.getData(0, 5, 5);
								if(showhourslabelhead.equals(showhourslabelexcel)) {
							    	test.pass("TC:5 VERIFY LABEL 'SHOW HOURS' IS DISPLAYED");
							    	
							    }else {
							    	test.fail("TC:5 VERIFY LABEL 'SHOW HOURS' IS NOT DISPLAYED");
							    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
							    			"VERIFY LABEL 'LOCATE ME' IS DISPLAYED");
							    }}catch (Exception e) {
			   						 test.fail("Error:"+ e.getMessage());
			    						
			   					}
			   		// hours many vary on or around holidays label 
			   	      String hoursmanyvaryonlabelhead="";
			   	try {
								 hoursmanyvaryonlabelhead=page.hoursmanyvaryonlabelmethod(); 
								String hoursmanyvaryonlabelexcel=Excelreader.getData(0, 6, 5);
								if(hoursmanyvaryonlabelhead.equals(hoursmanyvaryonlabelexcel)) {
							    	test.pass("TC:6 VERIFY LABEL 'HOURS MANY VARY ON OR AROUND HOLIDAYS' IS DISPLAYED");
							    	
							    }else {
							    	test.fail("TC:6 VERIFY LABEL 'HOURS MANY VARY ON OR AROUND HOLIDAYS' IS NOT DISPLAYED");
							    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
							    			"VERIFY LABEL 'HOURS MANY VARY ON OR AROUND HOLIDAYS ' IS DISPLAYED");
							    }}catch (Exception e) {
			   						 test.fail("Error:"+ e.getMessage());
			    						
			   					}
			   	// After click on show hours and show hours label  
			   	String hidehourslabelhead="";
			      	try {
								 hidehourslabelhead=page.hidehourslabelmethod(); 
								String hidehourslabelexcel=Excelreader.getData(0, 7, 5);
								if(hidehourslabelhead.equals(hidehourslabelexcel)) {
							    	test.pass("TC:7 SHOW HOURS IS CLICKABLE AND VERIFY LABEL 'HIDE HOURS' IS DISPLAYED");
							//Restaurant lobby hours  
							    	
							    	try {
							    	 restaurantlobbyhourslabelhead=page.restaurantlobbyhourslabelmethod(); 
									String restaurantlobbyhourslabelexcel=Excelreader.getData(0, 8, 5);
									if(restaurantlobbyhourslabelhead.equals(restaurantlobbyhourslabelexcel)) {
								    	test.pass("TC:8  VERIFY LABEL 'RESTAURANT LOBBY HOURS' IS DISPLAYED");
								    	
								    }else {
								    	test.fail("TC:8  VERIFY LABEL 'RESTAURANT LOBBY HOURS' IS NOT DISPLAYED");
								    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
								    			" VERIFY LABEL 'RESTAURANT LOBBY HOURS' IS DISPLAYED");
								    }}catch (Exception e) {
				   						 test.fail("Error:"+ e.getMessage());
				    						
				   					}
							//Monday and hours label
							    	try {
									 restaurantlobbymondayandhourslabelhead=page.restaurantlobbymondayandhourslabelmethod(); 
									String restaurantlobbymondayandhourslabelexcel=Excelreader.getData(0, 9, 5);
									if(!restaurantlobbymondayandhourslabelhead.equals("")) {
								    	test.pass("TC:9  VERIFY LABEL 'MONDAY AND OPEN 24 HOURS ON RESTAURANT LOBBY HOURS' IS DISPLAYED");
								    	
								    }else {
								    	test.fail("TC:9  VERIFY LABEL 'MONDAY AND OPEN 24 HOURS ON RESTAURANT LOBBY HOURS' IS NOT DISPLAYED");
								    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
								    			" VERIFY LABEL 'MONDAY AND OPEN 24 HOURS ON RESTAURANT LOBBY HOURS' IS DISPLAYED");
								    }}catch (Exception e) {
				   						 test.fail("Error:"+ e.getMessage());
				    						
				   					}
					   //drive thru hours  
							    	try {
									 drivethruhourslabelhead=page.drivethruhourslabelmethod(); 
									String drivethruhourslabelexcel=Excelreader.getData(0, 10, 5);
									if(drivethruhourslabelhead.equals(drivethruhourslabelexcel)) {
								    	test.pass("TC:10  VERIFY LABEL 'DRIVE THRU HOURS' IS DISPLAYED");
								    	
								    }else {
								    	test.fail("TC:10  VERIFY LABEL 'DRIVE THRU HOURS' IS NOT DISPLAYED");
								    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
								    			" VERIFY LABEL 'DRIVE THRU HOURS' IS DISPLAYED");
								    }	}catch (Exception e) {
				   						 test.fail("Error:"+ e.getMessage());
				    						
				   					}
						 //weeks and hours label on drive thru hours  
									drivethruhoursmondayhourslabelhead=page.drivethruhoursmondayhourslabelmethod(); 
									if(!drivethruhoursmondayhourslabelhead.equals("")) {
								    	test.pass("TC:11  VERIFY LABEL 'WEEK AND HOURS ON DRIVE THRU HOURS' IS DISPLAYED");
								    	
								    }else {
								    	test.fail("TC:11  VERIFY LABEL 'WEEK AND HOURS ON DRIVE THRU HOURS' IS NOT DISPLAYED");
								    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
								    			" VERIFY LABEL 'WEEK AND HOURS ON DRIVE THRU HOURS' IS DISPLAYED");
								    }	    	
							    }else {
							    	test.fail("TC:7 SHOW HOURS IS CLICKABLE AND VERIFY LABEL 'HIDE HOURS' IS NOT DISPLAYED");
							    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
							    			"SHOW HOURS IS CLICKABLE AND VERIFY LABEL 'HIDE HOURS' IS DISPLAYED");
							    }}catch (Exception e) {
			   						 test.fail("Error:"+ e.getMessage());
			    						
			   					}
						
		
						   		
						   		
						   		
				//local restaurant	
						   	     	try {
								   	 	String clickrestaurantlinkhead=page.clickrestaurantlinkmethod(); 
								   	 String clickrestaurantlinkexcel=Excelreader.getData(0, 23, 5);
								   	 if(clickrestaurantlinkexcel.equals(clickrestaurantlinkhead)) {
									   	 	test.pass("TC:21  RESTAURANT LINK IS WORKING FINE");
						   //NAME OF ADDRESS IS DISPLAYED OR NOT
						   		/*try {
						   	 	String restaurantnamehead=page.restaurantnamemethod();
						   	 	if(searchbuttonhead.equals(restaurantnamehead)) {
						   	 	test.pass("TC:21  ADDRESS SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
						   	 	}else {
						   	 	test.fail("TC:21  ADDRESS SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
   						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
   						    			"  ADDRESS SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
						   	 	}}catch (Exception e) {
	       	   						 test.fail("Error:"+ e.getMessage());
		       	   						
	       		   					}*/
						 //full address displayed
						   		try {
								String localaddressdistotlahead=page.localaddressdistotlamethod();					   		
								if(localaddressdistotlahead.equals(addressdisplayedtotalhead)) {
							   	 	test.pass("TC:22  TOTAL ADDRESS SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
							   	 	}else {
							   	 	test.fail("TC:22  TOTAL ADDRESS SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
	   						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
	   						    			"  ADDRESS SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
							   	 	}}catch (Exception e) {
		       	   						 test.fail("Error:"+ e.getMessage());
			       	   						
		       		   					}
						   //local set preferred location 
						   		try {
								String setaspreferredlocationhead1=page.setaspreferredlocationlabel();					   		
								if(setpreferredlocationlabelmethodhead.equals(setaspreferredlocationhead1)) {
							   	 	test.pass("TC:23  'SET AS PREFERRED LOCATION' SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
							   	 	}else {
							   	 	test.fail("TC:23  'SET AS PREFERRED LOCATION' SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
	   						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
	   						    			"'SET AS PREFERRED LOCATION' SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
							   	 	}}catch (Exception e) {
		       	   						 test.fail("Error:"+ e.getMessage());
			       	   						
		       		   					}	   		
						/* // local order Mcdelivery		
						   		try {
									String ordermcdeliverylabellocalhead=page.ordermcdeliverylabellocalmethod();					   		
									if(ordermcdeliverylabelhead.equals(ordermcdeliverylabellocalhead)) {
								   	 	test.pass("TC:24  'ORDER McDELIVERY' SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
								   	 	}else {
								   	 	test.fail("TC:24  'ORDER McDELIVERY' SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
		   						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
		   						    			"'ORDER McDELIVERY' SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
								   	 	}}catch (Exception e) {
			       	   						 test.fail("Error:"+ e.getMessage());
				       	   						
			       		   					}	*/	
					 // local show hours label		
						   		try {
									String showhourslabellocalhead=page.showhourslabellocalmethod();					   		
									if(showhourslabelhead.equals(showhourslabellocalhead)) {
								   	 	test.pass("TC:25 'SHOW HOURS' SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
								   	 	}else {
								   	 	test.fail("TC:25 'SHOW HOURS' SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
		   						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
		   						    			"'SHOW HOURS' SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
								   	 	}}catch (Exception e) {
			       	   						 test.fail("Error:"+ e.getMessage());
				       	   						
			       		   					}			   		
				 // Hours may vary on or around holidays label		 
						   		try {
									String hoursmayvaryonoraroudlabellocalhead=page.hoursmayvaryonoraroudlabellocalmethod();					   		
									if(hoursmanyvaryonlabelhead.equals(hoursmayvaryonoraroudlabellocalhead)) {
								   	 	test.pass("TC:26 'HOURS MAY VARY ON OR AROUND HOLIDAYS' SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
								   	 	}else {
								   	 	test.fail("TC:26 'HOURS MAY VARY ON OR AROUND HOLIDAYS' SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
		   						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
		   						    			"'HOURS MAY VARY ON OR AROUND HOLIDAYS' SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
								   	 	}}catch (Exception e) {
			       	   						 test.fail("Error:"+ e.getMessage());
				       	   						
			       		   					}				   		
			 // click on show hours and hide hours  label		 
						   		try {
									String clickshowhourslabellocalhead=page.clickshowhourslabellocalmethod();					   		
									if(hidehourslabelhead.equals(clickshowhourslabellocalhead)) {
								   	 	test.pass("TC:27 SHOW HOURS IS CLICKABEL AND 'HIDE HOURS' LABEL SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
					//	RESTAURANT LOBBY HOURS LABEL		   	 
								   		try {
											String restaurantlobbyhourslocallabelhead=page.restaurantlobbyhourslocallabelmethod();					   		
											if(restaurantlobbyhourslabelhead.equals(restaurantlobbyhourslocallabelhead)) {
										   	 	test.pass("TC:28 'RESTAURANT & LOBBY HOURS' SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
										   	 	}else {
										   	 	test.fail("TC:28 'RESTAURANT & LOBBY HOURS' SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
				   						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
				   						    			"'RESTAURANT & LOBBY HOURS' SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
										   	 	}}catch (Exception e) {
					       	   						 test.fail("Error:"+ e.getMessage());
						       	   						
					       		   					}
                    //services timing LABEL	on restaurant lobby	   	 
								   		try {
											String servicestimingslocallabelhead=page.servicestimingslocallabelmethod();					   		
											if(restaurantlobbymondayandhourslabelhead.equals(servicestimingslocallabelhead)) {
										   	 	test.pass("TC:29 'SERVICES TIMING OF MONDAY OPEN 24HOURS ON RESTAURANT LOBBY' SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
										   	 	}else {
										   	 	test.fail("TC:29 'SERVICES TIMING OF MONDAY OPEN 24HOURS ON RESTAURANT LOBBY' SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
				   						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
				   						    			"'SERVICES TIMING OF MONDAY OPEN 24HOURS ON RESTAURANT LOBBY' SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
										   	 	}}catch (Exception e) {
					       	   						 test.fail("Error:"+ e.getMessage());
					       		   				}			   	 	
				 //drive thru hours	   	 
								   		try {
											String drivethruhourslocallabelhead=page.drivethruhourslocallabelmethod();					   		
											if(drivethruhourslabelhead.equals(drivethruhourslocallabelhead)) {
										   	 	test.pass("TC:30 'DRIVE THRU HOURS ON HIDE HOURS' SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
										   	 	}else {
										   	 	test.fail("TC:30 'DRIVE THRU HOURS ON HIDE HOURS' SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
				   						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
				   						    			"'DRIVE THRU HOURS ON HIDE HOURS' SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
										   	 	}}catch (Exception e) {
					       	   						 test.fail("Error:"+ e.getMessage());
					       		   				}			   	 	
					//service timing on drive thru hours 			   	 	
								   		try {
											String servicetimingsdrivethurlocallabelhead=page.servicetimingsdrivethurlocallabelmethod();					   		
											if(drivethruhoursmondayhourslabelhead.equals(servicetimingsdrivethurlocallabelhead)) {
										   	 	test.pass("TC:31 'SERVICE TIMINGS ON DRIVE THRU HOURS' SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
										   	 	}else {
										   	 	test.fail("TC:31 'SERVICE TIMINGS ON DRIVE THRU HOURS' SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
				   						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
				   						    			"'SERVICE TIMINGS ON DRIVE THRU HOURS' SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
										   	 	}}catch (Exception e) {
					       	   						 test.fail("Error:"+ e.getMessage());
					       		   				}
									}else {
								   	 	test.fail("TC:27 SHOW HOURS IS CLICKABEL AND 'HIDE HOURS' LABEL SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
		   						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
		   						    			"SHOW HOURS IS CLICKABEL AND 'HIDE HOURS' LABEL SHOULD BE SAME ON LOCAL AND RESTAURANT PAGE");
								   	 	}}catch (Exception e) {
			       	   						 test.fail("Error:"+ e.getMessage());
								   	 	}
								   	
								   	 
				   	 
						   	     }else {
								   	 	test.fail("TC:21 RESTAURANT LINK IS WORKING FINE");
		   						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
		   						    			"RESTAURANT LINK IS WORKING FINE");   	 
						   	     }}catch (Exception e) {
	       	   						 test.fail("Error:"+ e.getMessage());
	       		   					}		   	 
				}
    
   
    /*@Test(priority=3)
   	public void Local_Restaurant_ApplyForJob() {
    	Local_Restaurant_Page page= new Local_Restaurant_Page(driver);
   			 test=extent.createTest("Local_Restaurant_ApplyForJob");   
    
   			 try {
			    	driver.get(Basepage.readProperty("urlLR"));
			    	String gettitle=page.generallgetpagetitlemethod();
					String gettitleexcel=Excelreader.getData(0, 1, 5);
					if(gettitle.equals(gettitleexcel)) {
				    	test.pass("TC:1 URL IS OPENED");
				    }else {
				    	test.fail("TC:1 URL IS NOT OPENED");
				    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
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
   					String sendedzipvaluexcel=Excelreader.getData(0, 2, 5);
   						String searchbuttonhead=page.searchbuttonmethod1(sendedzipvaluexcel);
   							if(!searchbuttonhead.equals("")) {
   						   	test.pass("TC:2 SEARCH BUTTON IS WORKING FINE");    
   						//local restaurant	
				   	     	try {
						   	 	String clickrestaurantlinkhead=page.clickrestaurantlinkmethod(); 
						   	 String clickrestaurantlinkexcel=Excelreader.getData(0, 23, 5);
						   	 if(clickrestaurantlinkexcel.equals(clickrestaurantlinkhead)) {
							   	 	test.pass("TC:21  LOCAL RESTAURANT LINK IS WORKING FINE"); 
							   	//click on apply for jobs link			   	
		       						 //APPLY FOR JOB BUTTON IS CLICKABLE OR NOT AND CANCLE BUTTON
									   	String applyforjoblinkclickexcel=Excelreader.getData(0, 24, 5);
										String applyforjoblinkclickhead=page.applyforjoblinkclickmethod();
										if(applyforjoblinkclickhead.equals(applyforjoblinkclickexcel)) {
										   	test.pass("TC:47 LEGAL BUMPER OF 'APPLY FOR JOB' BUTTON IS WORKING ");
									//cancel button	   	
										   	String ordermcdeliverylabelexcel1=Excelreader.getData(0, 22, 5);
											String ordermcdeliverylabelhead1=page.cancelbuttonmethod3();
											if(ordermcdeliverylabelhead1.equals(ordermcdeliverylabelexcel1)) {
											   	test.pass("TC:48 CANCEL BUTTON IS WORKING FINE  ON LEGAL BUMPER OF 'APPLY FOR JOBS ' "); 
							    //ORDER McDELIVERY BUTTON AND OPEN UBER EAT
											   	String ubereatmethodsexcel=Excelreader.getData(0, 26, 5);
												String ubereatmethodshead=page.applyjoblinkmethods();
												if(ubereatmethodshead.equals(ubereatmethodsexcel)) {
												   	test.pass("TC:49 APPLY FOR JOB'  LINK IS WORKING ");
												}else {
												   	test.fail("TC:49 APPLY FOR JOB'  LINK IS WORKING '");
												   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
												   			" APPLY FOR JOB'  LINK IS WORKING'");
												   }
											}else {
											   	test.fail("TC:48 CANCEL BUTTON IS WORKING FINE ON LEGAL BUMPER OF 'APPLY FOR JOBS '");
											   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
											   			" CANCEL BUTTON IS WORKING FINE ON LEGAL BUMPER OF 'APPLY FOR JOBS ''");
											   }
										}else {
										   	test.fail("TC:34 'APPLY FOR JOBS'  LINK IS NOT CLICKABLE ");
										   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
										   			" 'APPLY FOR JOBS' LINK IS NOT CLICKABLE ");
										   }		   		
							  
						   	 }else {
							   	 	test.fail("TC:21 RESTAURANT LINK IS WORKING FINE");
	   						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
	   						    			"RESTAURANT LINK IS WORKING FINE");   	 
					   	     }}catch (Exception e) {
 	   						 test.fail("Error:"+ e.getMessage());
 		   					}
							}else {
							   	test.fail("TC:2 SEARCH BUTTON IS NOT WORKING FINE");
							   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
							   			"SEARCH BUTTON IS NOT WORKING FINE");
							   }
				}catch (Exception e) {
					 test.fail("Error:"+ e.getMessage());
				}
    }         */
    
  
   /* @Test(priority=4)
   	public void Local_Restaurant_OrderMcDelivery() {
    	Local_Restaurant_Page page= new Local_Restaurant_Page(driver);
   			 test=extent.createTest("Local_Restaurant_OrderMcDelivery");   
    
   			 try {
			    	driver.get(Basepage.readProperty("urlLR"));
			    	String gettitle=page.generallgetpagetitlemethod();
					String gettitleexcel=Excelreader.getData(0, 1, 5);
					if(gettitle.equals(gettitleexcel)) {
				    	test.pass("TC:1 URL IS OPENED");
				    }else {
				    	test.fail("TC:1 URL IS NOT OPENED");
				    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
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
   					String sendedzipvaluexcel=Excelreader.getData(0, 2, 5);
   						String searchbuttonhead=page.searchbuttonmethod1(sendedzipvaluexcel);
   							if(!searchbuttonhead.equals("")) {
   						   	test.pass("TC:2 SEARCH BUTTON IS WORKING FINE");    
   						//local restaurant	
				   	     	try {
						   	 	String clickrestaurantlinkhead=page.clickrestaurantlinkmethod(); 
						   	 String clickrestaurantlinkexcel=Excelreader.getData(0, 23, 5);
						   	 if(clickrestaurantlinkexcel.equals(clickrestaurantlinkhead)) {
							   	 	test.pass("TC:21  RESTAURANT LINK IS WORKING FINE");
							   	//ORDER McDELIVERY BUTTON IS CLICKABLE OR NOT AND CANCLE BUTTON legal bumper 
									String ordermcdeliveryclickhead=page.ordermcdeliveryclickmethod();
									String ordermcdeliveryclickexcel=Excelreader.getData(0, 24, 5);
									if(ordermcdeliveryclickhead.equals(ordermcdeliveryclickexcel)) {
									   	test.pass("TC:41 LEGAL BUMPER OF 'ORDER McDELIVERY' BUTTON IS WORKING ");
								//cancel button	   	
									   	String ordermcdeliverylabelexcel1=Excelreader.getData(0, 4, 5);
										String ordermcdeliverylabelhead1=page.cancelbuttonmethod();
										if(ordermcdeliverylabelhead1.equals(ordermcdeliverylabelexcel1)) {
										   	test.pass("TC:42 CANCEL BUTTON IS WORKING FINE ON LEGAL BUMPER OF 'ORDER McDELIVERY'"); 
								 //ORDER McDELIVERY BUTTON AND OPEN UBER EAT
										   	String ubereatmethodsexcel=Excelreader.getData(0, 25, 5);
											String ubereatmethodshead=page.ubereatmethods();
											if(ubereatmethodshead.equals(ubereatmethodsexcel)) {
											   	test.pass("TC:43 UBER EAT LINK IS OPEN ON 'ORDER McDELIVERY' ");
											}else {
											   	test.fail("TC:43 UBER EAT LINK IS NOT OPEN ON 'ORDER McDELIVERY'");
											   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
											   			" UBER EAT LINK NOT IS OPEN ON 'ORDER McDELIVERY'");
											   } 
										   	
										}else {
										   	test.fail("TC:42 CANCEL BUTTON IS WORKING FINE ON LEGAL BUMPER OF 'ORDER McDELIVERY'");
										   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
										   			" CANCEL BUTTON IS WORKING FINE ON LEGAL BUMPER OF 'ORDER McDELIVERY'");
										   }
									}else {
									   	test.fail("TC:41 LEGAL BUMPER OF 'ORDER McDELIVERY' BUTTON IS WORKING");
									   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
									   			"LEGAL BUMPER OF 'ORDER McDELIVERY' BUTTON IS WORKING ");
									   }catch (Exception e) {
						   					 test.fail("Error:"+ e.getMessage());
						   				}
						   	 }

   			 else {
							   	 	test.fail("TC:21 RESTAURANT LINK IS WORKING FINE");
	   						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
	   						    			"RESTAURANT LINK IS WORKING FINE");   	 
					   	     }}catch (Exception e) {
    	   						 test.fail("Error:"+ e.getMessage());
					   	     }
   							
   			 
   							}else {
   							   	test.fail("TC:2 SEARCH BUTTON IS NOT WORKING FINE");
   							   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
   							   			"SEARCH BUTTON IS NOT WORKING FINE");
   							   }
   					 
   				}catch (Exception e) {
   					 test.fail("Error:"+ e.getMessage());
   				}*/
   							
   			 
    
    
    @Test(priority=5)
   	public void Local_Restaurant_OrderNow() {
    	Local_Restaurant_Page page= new Local_Restaurant_Page(driver);
   			 test=extent.createTest("Local_Restaurant_OrderNow");   
    
   			 try {
			    	driver.get(Basepage.readProperty("urlLR"));
			    	String gettitle=page.generallgetpagetitlemethod();
					String gettitleexcel=Excelreader.getData(0, 1, 5);
					if(gettitle.equals(gettitleexcel)) {
				    	test.pass("TC:1 URL IS OPENED");
				    }else {
				    	test.fail("TC:1 URL IS NOT OPENED");
				    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
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
   					String sendedzipvaluexcel=Excelreader.getData(0, 2, 5);
   						String searchbuttonhead=page.searchbuttonmethod1(sendedzipvaluexcel);
   							if(!searchbuttonhead.equals("")) {
   						   	test.pass("TC:2 SEARCH BUTTON IS WORKING FINE");    
   						//local restaurant	
				   	     	try {
						   	 	String clickrestaurantlinkhead=page.clickrestaurantlinkmethod(); 
						   	 String clickrestaurantlinkexcel=Excelreader.getData(0, 23, 5);
						   	 if(clickrestaurantlinkexcel.equals(clickrestaurantlinkhead)) {
							   	 	test.pass("TC:21  RESTAURANT LINK IS WORKING FINE"); 
							   		
							   //click on order now
									 //ORDER now BUTTON IS CLICKABLE OR NOT AND CANCLE BUTTON
										   	String ordernowlinkclickexcel=Excelreader.getData(0, 24, 5);
											String ordernowlinkclickhead=page.ordernowlinkclickmethod();
											if(ordernowlinkclickhead.equals(ordernowlinkclickexcel)) {
											   	test.pass("TC:44 LEGAL BUMPER OF 'ORDER NOW' BUTTON IS WORKING ");
										//cancel button	   	
											   	String ordermcdeliverylabelexcel1=Excelreader.getData(0, 20, 5);
												String ordermcdeliverylabelhead1=page.cancelbuttonmethod2();
												if(ordermcdeliverylabelhead1.equals(ordermcdeliverylabelexcel1)) {
												   	test.pass("TC:45 CANCEL BUTTON IS WORKING FINE ON LEGAL BUMPER OF 'ORDER NOW' "); 
									  //ORDER NOW BUTTON AND OPEN UBER EAT
												   	String ubereatmethodsexcel=Excelreader.getData(0, 25, 5);
													String ubereatmethodshead=page.ubereatordernowmethods();
													if(ubereatmethodshead.equals(ubereatmethodsexcel)) {
													   	test.pass("TC:46 UBER EAT LINK IS OPEN ON 'ORDER NOW' ");
													}else {
													   	test.fail("TC:46 UBER EAT LINK IS NOT OPEN ON 'ORDER NOW '");
													   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
													   			" UBER EAT LINK NOT IS OPEN ON 'ORDER NOW'");
													   }
												}else {
												   	test.fail("TC:45 CANCEL BUTTON IS WORKING FINE ON LEGAL BUMPER OF 'ORDER NOW'");
												   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
												   			" CANCEL BUTTON IS WORKING FINE ON LEGAL BUMPER OF 'ORDER NOW'");
												   }
											}else {
											   	test.fail("TC:44 LEGAL BUMPER OF 'ORDER NOW' BUTTON IS WORKING ");
											   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
											   			" LEGAL BUMPER OF 'ORDER NOW' BUTTON IS WORKING ");
											   }
						   	 }else {
							   	 	test.fail("TC:21 RESTAURANT LINK IS WORKING FINE");
	   						    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
	   						    			"RESTAURANT LINK IS WORKING FINE");   	 
					   	     }}catch (Exception e) {
 	   						 test.fail("Error:"+ e.getMessage());
 		   					}
							}else {
							   	test.fail("TC:2 SEARCH BUTTON IS NOT WORKING FINE");
							   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
							   			"SEARCH BUTTON IS NOT WORKING FINE");
							   }
				}catch (Exception e) {
					 test.fail("Error:"+ e.getMessage());
				}
    }
   			 
    

    
    @Test(priority=6)
   	public void Local_Restaurant_App_Promo() {
    	Local_Restaurant_Page page= new Local_Restaurant_Page(driver);
   			 test=extent.createTest("Local_Restaurant_App Promo");   
    
   			 try {
			    	driver.get(Basepage.readProperty("urlLR"));
			    	String gettitle=page.generallgetpagetitlemethod();
					String gettitleexcel=Excelreader.getData(0, 1, 5);
					if(gettitle.equals(gettitleexcel)) {
				    	test.pass("TC:1 URL IS OPENED");
				    }else {
				    	test.fail("TC:1 URL IS NOT OPENED");
				    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
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
							   		
   		// APP PROMO image
		   		try {
		   		Boolean re= page.apppromoimg();
		   		if(re.equals(true)) {
		   		test.pass("TC:3 TEH 'APP PROMO' IMAGE IS DISPLAYED");
		   		} else {
		   		test.fail("TC:3 TEH 'APP PROMO' IMAGE IS NOT DISPLAYED");
		   		test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_feedback"))+ 
		   		"TEH 'APP PROMO' IMAGE IS NOT DISPLAYED");
		   		}}
		   		catch (Exception e) {
		   		test.fail("Error:" + e.getMessage());
		   		}
		   	//	AppPROMO label
		   	 try {
	   			String apppromoheadtext=page.apppromotextmethod();
				String apppromoheadtextexcel=Excelreader.getData(0, 29, 5);
				if(apppromoheadtext.equals(apppromoheadtextexcel)) {
			    	test.pass("TC:12  VERIFY LABEL 'APP PROMO HEADING' IS DISPLAYED");
			    	
			    }else {
			    	test.fail("TC:12  VERIFY LABEL 'APP PROMO HEADING' IS NOT DISPLAYED");
			    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
			    			" VERIFY LABEL 'APP PROMO HEADING' IS DISPLAYED");
			    }}catch (Exception e) {
					 test.fail("Error:"+ e.getMessage());
						
				}
		   	 
		   	 
		   	 //App store
		   	try {
	   			String appstore=page.appstoremethod();
				String appstoreexcel=Excelreader.getData(0, 30, 5);
				if(appstore.equals(appstoreexcel)) {
			    	test.pass("TC:12  VERIFY LABEL 'APP Store' IS DISPLAYED");
			    	
			    }else {
			    	test.fail("TC:12  VERIFY LABEL 'APP Store' IS NOT DISPLAYED");
			    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
			    			" VERIFY LABEL 'APP Store' IS DISPLAYED");
			    }}catch (Exception e) {
					 test.fail("Error:"+ e.getMessage());
						
				}
		   	//Play Store
		   	try {
	   			String playstore=page.playstoremethod();
				String playstoreexcel=Excelreader.getData(0, 31, 5);
				if(playstore.equals(playstoreexcel)) {
			    	test.pass("TC:12  VERIFY LABEL 'Play Store' IS DISPLAYED");
			    	
			    }else {
			    	test.fail("TC:12  VERIFY LABEL 'Play Store' IS NOT DISPLAYED");
			    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
			    			" VERIFY LABEL 'Play Store' IS DISPLAYED");
			    }}catch (Exception e) {
					 test.fail("Error:"+ e.getMessage());
						
				}
		   		
	   	 }						   	

    @Test(priority=7)
	public void Local_Restaurant_Near_By_Stores() {
	Local_Restaurant_Page page= new Local_Restaurant_Page(driver);
	test=extent.createTest("Local_Restaurant_Near By Stores");   
    
		 try {
	    	driver.get(Basepage.readProperty("urlLR"));
	    	String gettitle=page.generallgetpagetitlemethod();
			String gettitleexcel=Excelreader.getData(0, 1, 5);
			if(gettitle.equals(gettitleexcel)) {
		    	test.pass("TC:1 URL IS OPENED");
		    }else {
		    	test.fail("TC:1 URL IS NOT OPENED");
		    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
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
		 
		 
		 //Near by stores label
		 try {
		  	 String Nearbystoreslabelhead = page.Nearbystoreslabelmethod(); 
				String Nearbystoreslabelexcel=Excelreader.getData(0, 46, 5);
				if(Nearbystoreslabelhead.equals(Nearbystoreslabelexcel)) {
			    	test.pass("TC:14  VERIFY LABEL 'NEAR BY STORES ' IS DISPLAYED");
			    }else {
			    	test.fail("TC:14 VERIFY LABEL 'NEAR BY STORES' IS NOT DISPLAYED");
			    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
			    			" VERIFY LABEL 'NEAR BY STORES' IS DISPLAYED");
			    }}catch (Exception e) {
						 test.fail("Error:"+ e.getMessage());
						
					}
		 
		 //Near by store 1st link
		 try {
		  	 String Nearbystoreslink1 = page.Nearbystoreslink1method(); 
				String Nearbystoreslink1excel=Excelreader.getData(0, 31, 5);
				if(Nearbystoreslink1.equals(Nearbystoreslink1excel)) {
			    	test.pass("TC:14  VERIFY LABEL 'NEAR BY STORES ' IS DISPLAYED");
			    }else {
			    	test.fail("TC:14 VERIFY LABEL 'NEAR BY STORES' IS NOT DISPLAYED");
			    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
			    			" VERIFY LABEL 'NEAR BY STORES' IS DISPLAYED");
			    }}catch (Exception e) {
						 test.fail("Error:"+ e.getMessage());
						
					}
		//Near by store 2nd link	
		 try {
		  	 String Nearbystoreslink2 = page.Nearbystoreslink2method(); 
				String Nearbystoreslink2excel=Excelreader.getData(0, 31, 5);
				if(Nearbystoreslink2.equals(Nearbystoreslink2excel)) {
			    	test.pass("TC:14  VERIFY LABEL 'NEAR BY STORES ' IS DISPLAYED");
			    }else {
			    	test.fail("TC:14 VERIFY LABEL 'NEAR BY STORES' IS NOT DISPLAYED");
			    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
			    			" VERIFY LABEL 'NEAR BY STORES' IS DISPLAYED");
			    }}catch (Exception e) {
						 test.fail("Error:"+ e.getMessage());
						
					}
		//Near by store 3rd link	
		 try {
		  	 String Nearbystoreslink3 = page.Nearbystoreslink3method(); 
				String Nearbystoreslink3excel=Excelreader.getData(0, 31, 5);
				if(Nearbystoreslink3.equals(Nearbystoreslink3excel)) {
			    	test.pass("TC:14  VERIFY LABEL 'NEAR BY STORES ' IS DISPLAYED");
			    }else {
			    	test.fail("TC:14 VERIFY LABEL 'NEAR BY STORES' IS NOT DISPLAYED");
			    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
			    			" VERIFY LABEL 'NEAR BY STORES' IS DISPLAYED");
			    }}catch (Exception e) {
						 test.fail("Error:"+ e.getMessage());
						
					}
	}
    
    @Test(priority=8)
	public void Local_Restaurant_welcome_Image() {
	Local_Restaurant_Page page= new Local_Restaurant_Page(driver);
    test=extent.createTest("Local_Restaurant_Find At This Store");  
    
      try {
	    	driver.get(Basepage.readProperty("urlLR"));
	    	String gettitle=page.generallgetpagetitlemethod();
			String gettitleexcel=Excelreader.getData(0, 1, 5);
			if(gettitle.equals(gettitleexcel)) {
		    	test.pass("TC:1 URL IS OPENED");
		    }else {
		    	test.fail("TC:1 URL IS NOT OPENED");
		    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
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
    //Find at this Location label 532
      try {
   	   			 String findatthislocationlabelhead = page.findatthislocationlabelmethod();
   				String findatthislocationlabelexcel=Excelreader.getData(0, 30, 5);
   				if(findatthislocationlabelhead.equals(findatthislocationlabelexcel)) {
   			    	test.pass("TC:12  VERIFY LABEL 'findatthislocation' IS DISPLAYED");
   			    	
   			    }else {
   			    	test.fail("TC:12  VERIFY LABEL 'findatthislocation' IS NOT DISPLAYED");
   			    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
   			    			" VERIFY LABEL 'findatthislocation' IS DISPLAYED");
   			    }}catch (Exception e) {
   					 test.fail("Error:"+ e.getMessage());
   						
   				}
      
    //MCDelivery label
  	try {
  	 String McDeliverylabelhead = page.McDeliverylabelmethod1(); 
		String McDeliverylabelexcel=Excelreader.getData(0, 31, 5);
		if(McDeliverylabelhead.equals(McDeliverylabelexcel)) {
	    	test.pass("TC:14  VERIFY LABEL 'McDELIVERY ' IS DISPLAYED");
	    }else {
	    	test.fail("TC:14 VERIFY LABEL 'McDELIVERY' IS NOT DISPLAYED");
	    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
	    			" VERIFY LABEL 'McDELIVERY' IS DISPLAYED");
	    }}catch (Exception e) {
				 test.fail("Error:"+ e.getMessage());
				
			}
//image of McDelivery 
		try {
			 String imageofmcdeliveryhead = page.imageofmcdeliverymethod1();
			String imageofmcdeliveryexcel=Excelreader.getData(0, 32, 5);
			if(imageofmcdeliveryhead.equals(imageofmcdeliveryexcel)) {
			 		 test.pass("TC:14 McDELIVERY IMAGE IS DISPLAYED");
			}
			else {
				test.fail("TC:14 McDELIVERY IMAGE IS DISPLAYED");
			 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
			 				"McDELIVERY IMAGE IS DISPLAYED");
			}}catch (Exception e) {
					 test.fail("Error:"+ e.getMessage());
					
				}
//WIFI label
		try {
  	 String wifilabelhead = page.wifilabelmethod(); 
		String wifilabelexcel=Excelreader.getData(0, 33, 5);
		if(wifilabelhead.equals(wifilabelexcel)) {
	    	test.pass("TC:15  VERIFY LABEL 'WIFI' IS DISPLAYED");
	    }else {
	    	test.fail("TC:15 VERIFY LABEL 'WIFI' IS NOT DISPLAYED");
	    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
	    			" VERIFY LABEL 'WIFI' IS DISPLAYED");
	    }	}catch (Exception e) {
				 test.fail("Error:"+ e.getMessage());
			}    	
  	
//image of WIFI 
		try {
		 String imageofwifihead = page.imageofwifimethod1();
		String imageofwifiexcel=Excelreader.getData(0, 34, 5);
		if(imageofwifihead.equals(imageofwifiexcel)) {
		 		 test.pass("TC:15 WIFI IMAGE IS DISPLAYED");
		}
		else {
			test.fail("TC:15 WIFI IMAGE IS DISPLAYED");
		 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
		 				"WIFI IMAGE IS DISPLAYED");
		}	}catch (Exception e) {
				 test.fail("Error:"+ e.getMessage());
				
			}
		
		//INDOOR DININGS label
				try {
		  	 String indoordiningslabelhead = page.indoordinngslabelmethod(); 
				String indoordinngslabelexcel=Excelreader.getData(0, 35, 5);
				if(indoordiningslabelhead.equals(indoordinngslabelexcel)) {
			    	test.pass("TC:15  VERIFY LABEL 'INDOOR DININGS' IS DISPLAYED");
			    }else {
			    	test.fail("TC:15 VERIFY LABEL 'INDOOR DININGS' IS NOT DISPLAYED");
			    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
			    			" VERIFY LABEL 'INDOOR DININGS' IS DISPLAYED");
			    }	}catch (Exception e) {
						 test.fail("Error:"+ e.getMessage());
					}    	
		  	
		//image of INDOOR DININGS
				try {
				 String imageofindoordingshead = page.imageofindoordiningsmethod();
				String imageofindoordiningsexcel=Excelreader.getData(0, 36, 5);
				if(imageofindoordingshead.equals(imageofindoordiningsexcel)) {
				 		 test.pass("TC:15 INDOOR DININGS IMAGE IS DISPLAYED");
				}
				else {
					test.fail("TC:15 INDOOR DININGS IMAGE IS DISPLAYED");
				 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
				 				"INDOOR DININGS IMAGE IS DISPLAYED");
				}	}catch (Exception e) {
						 test.fail("Error:"+ e.getMessage());
						
					}
      
				//DRIVE THRU label
				try {
		  	 String drivethrulabelhead = page.drivethrulabelmethod(); 
				String drivethrulabelexcel=Excelreader.getData(0, 37, 5);
				if(drivethrulabelhead.equals(drivethrulabelexcel)) {
			    	test.pass("TC:15  VERIFY LABEL 'DRIVE THRU' IS DISPLAYED");
			    }else {
			    	test.fail("TC:15 VERIFY LABEL 'DRIVE THRU' IS NOT DISPLAYED");
			    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
			    			" VERIFY LABEL 'DRIVE THRU' IS DISPLAYED");
			    }	}catch (Exception e) {
						 test.fail("Error:"+ e.getMessage());
					}    	
		  	
		//image of DRIVE THRU
				try {
				 String imageofdrivethruhead = page.imageofdrivethrumethod();
				String imageofdrivethruexcel=Excelreader.getData(0, 38, 5);
				if(imageofdrivethruhead.equals(imageofdrivethruexcel)) {
				 		 test.pass("TC:15 WIFI DRIVE THRU IS DISPLAYED");
				}
				else {
					test.fail("TC:15 DRIVE THRU IMAGE IS DISPLAYED");
				 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
				 				"DRIVE THRU IMAGE IS DISPLAYED");
				}	}catch (Exception e) {
						 test.fail("Error:"+ e.getMessage());
						
					}
      
				//GIFT CARDS label
				try {
		  	 String giftcardslabelhead = page.giftcardslabelmethod(); 
				String giftcardslabelexcel=Excelreader.getData(0, 39, 5);
				if(giftcardslabelhead.equals(giftcardslabelexcel)) {
			    	test.pass("TC:15  VERIFY LABEL 'GIFT CARDS' IS DISPLAYED");
			    }else {
			    	test.fail("TC:15 VERIFY LABEL 'GIFT CARDS' IS NOT DISPLAYED");
			    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
			    			" VERIFY LABEL 'GIFT CARDS' IS DISPLAYED");
			    }	}catch (Exception e) {
						 test.fail("Error:"+ e.getMessage());
					}    	
		  	
		//image of GIFT CARDS
				try {
				 String imageofgiftcardshead = page.imageofgiftcardsmethod();
				String imageofgiftcardsexcel=Excelreader.getData(0, 40, 5);
				if(imageofgiftcardshead.equals(imageofgiftcardsexcel)) {
				 		 test.pass("TC:15 GIFT CARDS IMAGE IS DISPLAYED");
				}
				else {
					test.fail("TC:15 GIFT CARDS IMAGE IS DISPLAYED");
				 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
				 				"GIFT CARDS IMAGE IS DISPLAYED");
				}	}catch (Exception e) {
						 test.fail("Error:"+ e.getMessage());
						
					}
				
				//DRIVE THRU COFFEE label
				try {
		  	 String drivethrucoffeelabelhead = page.drivethrucoffeelabelmethod(); 
				String drivethrucoffeelabelexcel=Excelreader.getData(0, 41, 5);
				if(drivethrucoffeelabelhead.equals(drivethrucoffeelabelexcel)) {
			    	test.pass("TC:15  VERIFY LABEL 'DRIVE THRU COFFEE' IS DISPLAYED");
			    }else {
			    	test.fail("TC:15 VERIFY LABEL 'DRIVE THRU COFFEE' IS NOT DISPLAYED");
			    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
			    			" VERIFY LABEL 'DRIVE THRU COFFEE' IS DISPLAYED");
			    }	}catch (Exception e) {
						 test.fail("Error:"+ e.getMessage());
					}    	
		  	
		//image of DRIVE THRU COFFEE
				try {
				 String imageofdrivethrucoffeehead = page.imageofdrivethrucoffeemethod();
				String imageofdrivethrucoffeeexcel=Excelreader.getData(0, 42, 5);
				if(imageofdrivethrucoffeehead.equals(imageofdrivethrucoffeeexcel)) {
				 		 test.pass("TC:15 DRIVE THRU COFFEE IMAGE IS DISPLAYED");
				}
				else {
					test.fail("TC:15 DRIVE THRU COFFEE IMAGE IS DISPLAYED");
				 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
				 				"DRIVE THRU COFFEE IMAGE IS DISPLAYED");
				}	}catch (Exception e) {
						 test.fail("Error:"+ e.getMessage());
						
					}
				
				//MOBILE OFFERS label
				try {
		  	 String mobileofferslabelhead = page.mobileofferslabelmethod(); 
				String mobileofferslabelexcel=Excelreader.getData(0, 43, 5);
				if(mobileofferslabelhead.equals(mobileofferslabelexcel)) {
			    	test.pass("TC:15  VERIFY LABEL 'MOBILE OFFERS' IS DISPLAYED");
			    }else {
			    	test.fail("TC:15 VERIFY LABEL 'MOBILE OFFERS' IS NOT DISPLAYED");
			    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
			    			" VERIFY LABEL 'MOBILE OFFERS' IS DISPLAYED");
			    }	}catch (Exception e) {
						 test.fail("Error:"+ e.getMessage());
					}    	
		  	
		//image of MOBILE OFFERS
				try {
				 String imageofmobileoffershead = page.imageofmobileoffersmethod();
				String imageofmobileoffersexcel=Excelreader.getData(0, 44, 5);
				if(imageofmobileoffershead.equals(imageofmobileoffersexcel)) {
				 		 test.pass("TC:15 MOBILE OFFERS IMAGE IS DISPLAYED");
				}
				else {
					test.fail("TC:15 MOBILE OFFERS IMAGE IS DISPLAYED");
				 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
				 				"MOBILE OFFERS IMAGE IS DISPLAYED");
				}	}catch (Exception e) {
						 test.fail("Error:"+ e.getMessage());
						
					}
    }
				
    @Test(priority=9)
	 public void Local_Restaurant_FAQ() {
			Local_Restaurant_Page page= new Local_Restaurant_Page(driver);
			test=extent.createTest("Local_Restaurant_FAQ");   
		    
				 try {
			    	driver.get(Basepage.readProperty("urlLR"));
			    	String gettitle=page.generallgetpagetitlemethod();
					String gettitleexcel=Excelreader.getData(0, 1, 5);
					if(gettitle.equals(gettitleexcel)) {
				    	test.pass("TC:1 URL IS OPENED");
				    }else {
				    	test.fail("TC:1 URL IS NOT OPENED");
				    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
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
				 /*try {
	    		    	// search button  
	    					String searchbuttonexcel=Excelreader.getData(0, 5, 5);
	    					String searchbuttonhead=page.searchbuttonmethod(searchbuttonexcel);
	    						if(!searchbuttonhead.equals("")) {  
	    					   	test.pass("TC:6 SEARCH BUTTON IS WORKING FINE");
	    					   	
	    					   	
	    						
	    						}else {
	    		 				   	test.fail("TC:6 SEARCH BUTTON IS NOT WORKING FINE");
	    		 				   	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Restaurant_Locator"))+ 
	    		 				   			"SEARCH BUTTON IS NOT WORKING FINE");
	    		 				   }			
	    	    }catch (Exception e) {
	    			 test.fail("Error:"+ e.getMessage());
	    		} */	
				//FAQ label(Question & Answers)
				 try {
					 String faqlabelhead=page.faqlabelmethod(); 
						String faqlabelexcel=Excelreader.getData(0, 29, 5);
						if(faqlabelhead.equalsIgnoreCase(faqlabelexcel)) {
					    	test.pass("TC:32  VERIFY LABEL 'FAQ LABEL ' IS DISPLAYED");
					    }else {
					    	test.fail("TC:32 VERIFY LABEL 'FAQ LABEL ' IS NOT DISPLAYED");
					    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
					    			" VERIFY LABEL 'FAQ LABEL ' IS DISPLAYED");
					    }   	}catch (Exception e) {
							test.fail("Error:"+ e.getMessage());
							
						}
				 //FAQ Question1(restaurant_locator_amenities_general_restaurant_questions)
				 try {
					 String faqlabelquestion1head=page.faqlabelquestion1method(); 
						String faqlabelquestion1excel=Excelreader.getData(0, 29, 5);
						if(faqlabelquestion1head.equalsIgnoreCase(faqlabelquestion1excel)) {
					    	test.pass("TC:33  VERIFY LABEL 'FAQ Question1 ' IS DISPLAYED");
					    	
					    	//(where can i found store hours)
							 try {
								 String wherecanifoundstorehourshead=page.wherecanifoundstorehoursmethod(); 
									String wherecanifoundstorehoursexcel=Excelreader.getData(0, 29, 5);
									if(wherecanifoundstorehourshead.equalsIgnoreCase(wherecanifoundstorehoursexcel)) {
								    	test.pass("TC:34  VERIFY LABEL 'WHERE CAN I FOUND STORE HOURS ' IS DISPLAYED");
								    	//(which locations have wifi)
										 try {
											 String whichlocationhavewifihead=page.whichlocationhavewifimethod(); 
												String whichlocationhavewifiexcel=Excelreader.getData(0, 29, 5);
												if(whichlocationhavewifihead.equalsIgnoreCase(whichlocationhavewifiexcel)) {
											    	test.pass("TC:34  VERIFY LABEL 'HOW DO I LOG IN TO WIFI ' IS DISPLAYED");
											    	try {
														 String howdoilogintowifihead=page.howdoilogintowifimethod(); 
															String howdoilogintowifiexcel=Excelreader.getData(0, 29, 5);
															if(howdoilogintowifihead.equalsIgnoreCase(howdoilogintowifiexcel)) {
														    	test.pass("TC:34  VERIFY LABEL 'WHICH LOCATION HAVE WIFI ' IS DISPLAYED");
														    	try {
																	 String whydontyoulistpricesonyourwebsitehead=page.whydontyoulistpricesonyourwebsitemethod(); 
																		String whydontyoulistpricesonyourwebsiteexcel=Excelreader.getData(0, 29, 5);
																		if(whydontyoulistpricesonyourwebsitehead.equalsIgnoreCase(whydontyoulistpricesonyourwebsiteexcel)) {
																	    	test.pass("TC:34  VERIFY LABEL 'whydontyoulistpricesonyourwebsite ' IS DISPLAYED");
																	    	
																	    	
																	    }else {
																	    	test.fail("TC:34 VERIFY LABEL 'whydontyoulistpricesonyourwebsite' IS NOT DISPLAYED");
																	    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
																	    			" VERIFY LABEL 'whydontyoulistpricesonyourwebsite ' IS DISPLAYED");
																	    }   	}catch (Exception e) {
																			test.fail("Error:"+ e.getMessage());
																			
																		}  	
														    	
														    	
														    }else {
														    	test.fail("TC:34 VERIFY LABEL 'WHICH LOCATION HAVE WIFI' IS NOT DISPLAYED");
														    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
														    			" VERIFY LABEL 'WHICH LOCATION HAVE WIFI ' IS DISPLAYED");
														    }   	}catch (Exception e) {
																test.fail("Error:"+ e.getMessage());
																
															}	    	
											    	
											    	
											    }else {
											    	test.fail("TC:34 VERIFY LABEL 'HOW DO I LOG IN TO WIFI ' IS NOT DISPLAYED");
											    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
											    			" VERIFY LABEL 'HOW DO I LOG IN TO WIFI ' IS DISPLAYED");
											    }   	}catch (Exception e) {
													test.fail("Error:"+ e.getMessage());
													
												}			    	
								    	
								    	
								    }else {
								    	test.fail("TC:34 VERIFY LABEL 'WHERE CAN I FOUND STORE HOURS ' IS NOT DISPLAYED");
								    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
								    			" VERIFY LABEL 'WHERE CAN I FOUND STORE HOURS ' IS DISPLAYED");
								    }   	}catch (Exception e) {
										test.fail("Error:"+ e.getMessage());
										
									}	
					    	
					    	
					    }else {
					    	test.fail("TC:33 VERIFY LABEL 'FAQ Question1 ' IS NOT DISPLAYED");
					    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
					    			" VERIFY LABEL 'FAQ Question1 ' IS DISPLAYED");
					    }   	}catch (Exception e) {
							test.fail("Error:"+ e.getMessage());
							
						}
				 //FAQ 
				 
				 }

	 @Test(priority=10)
	 public void Local_Restaurant_Mcdonalds_Carres() {
			Local_Restaurant_Page page= new Local_Restaurant_Page(driver);
			test=extent.createTest("Local_Restaurant_Near By Stores");   
		    
				 try {
			    	driver.get(Basepage.readProperty("urlLR"));
			    	String gettitle=page.generallgetpagetitlemethod();
					String gettitleexcel=Excelreader.getData(0, 1, 5);
					if(gettitle.equals(gettitleexcel)) {
				    	test.pass("TC:1 URL IS OPENED");
				    }else {
				    	test.fail("TC:1 URL IS NOT OPENED");
				    	test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Local_Restaurant"))+ 
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
				 
				 
				
    }
				   				 



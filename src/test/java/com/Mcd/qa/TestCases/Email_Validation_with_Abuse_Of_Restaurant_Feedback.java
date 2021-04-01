package com.Mcd.qa.TestCases;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.McD.qa.Base.BaseTest;
import com.McD.qa.Extentreport.Extentreport;
import com.McD.qa.Pages.Basepage;
import com.McD.qa.Pages.Email_Validation_With_Abuse_Of_Restaurant_Feedback_Page;
import com.McD.qa.Utility.TestUtil;

public class Email_Validation_with_Abuse_Of_Restaurant_Feedback extends BaseTest {

	String excelpath = System.getProperty("user.dir");
	TestUtil Excelreader = new TestUtil(
			excelpath + "/src/main/java/com/McD/qa/TestData/Email_validation_Restaurant_Feedback.xls");

	@Test(priority = 1)
	public void Open_URL_Email_Validation_GI() throws Exception {
		FileInputStream fis = new FileInputStream(
				excelpath + "\\src\\main\\java\\com\\McD\\qa\\TestData\\Email_validation_Restaurant_Feedback.xls");
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rowCount = sh.getLastRowNum() - sh.getFirstRowNum();
		for (int i = 1; i < rowCount + 1; i++) {
			Row row = sh.getRow(i);
			for (int j = 0; j <= 0; j++) {
				String RFKeyword = row.getCell(j).getStringCellValue();
				Thread.sleep(1000);
				Email_Validation_With_Abuse_Of_Restaurant_Feedback_Page page = new Email_Validation_With_Abuse_Of_Restaurant_Feedback_Page(
						driver);
				test = extent.createTest("Open_URL_Email_Validation_GI");
				try {
					driver.get(Basepage.readProperty("urlR"));
					driver.navigate().refresh();
					String gettitle = page.generallgetpagetitlemethod();
					String gettitleexcel = Excelreader.getData(0, 1, 1);
					if (gettitle.equals(gettitleexcel)) {
						test.pass("TC:1 URL OF RESTAURANT FEEDBACK IS OPENED");
					} else {
						test.fail("TC:1 URL OF RESTAURANT FEEDBACK IS NOT OPENED");
						test.fail(test
								.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
										"Email_Validation_With_Abuse_Of_Restaurant_Feedback_Page"))
								+ "URL OF RESTAURANT FEEDBACK IS NOT OPENED");
						extent.flush();
						driver.close();
						throw new SkipException("Skipping - ");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
				Thread.sleep(4000);
				try {
                driver.findElement(By.xpath("//html/body/div[1]/div[1]/div/button")).click();
				}catch (Exception e) {
					
				}
				try {
					String conrfindwriking = page.contfindlocationclickmethod();
					String conrfindwrikingexcel = Excelreader.getData(0, 2, 1);
					if (conrfindwriking.equals(conrfindwrikingexcel)) {
						test.pass("TC:2 CON'T FIND LOCATION... LINK IS WORKING");
						// Restaurant address
						try {
							String restaurantaddspchanumarexcel = Excelreader.getData(0, 3, 1);
							String restaurantaddspchanumahead = page
									.resraurantaddvaluemethod(restaurantaddspchanumarexcel);
							if (restaurantaddspchanumahead.equals(restaurantaddspchanumarexcel)) {
								test.pass("TC:3 USER SHOULD BE SEND NUMERICAL AND CHARACTERS ON RESTAURANT ADDRESS");
							} else {
								test.fail("TC:3 USER SHOULD BE SEND NUMERICAL AND CHARACTERS ON RESTAURANT ADDRESS");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
												"Email_Validation_With_Abuse_Of_Restaurant_Feedback_Page"))
										+ "USER SHOULD BE SEND NUMERICAL AND CHARACTERS ON RESTAURANT ADDRESS");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}

						// characters in city con't find
						try {
							String citycantfindcharaexcel = Excelreader.getData(0, 4, 1);
							String citycontfindsendcharhead = page.cityvaluemethod(citycantfindcharaexcel);
							if (citycontfindsendcharhead.equals(citycantfindcharaexcel)) {
								test.pass("TC:4 USER SHOULD BE SEND CHARACTERS ON CITY");
							} else {
								test.fail("TC:4 USER SHOULD BE SEND CHARACTERS ON CITY");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
												"Email_Validation_With_Abuse_Of_Restaurant_Feedback_Page"))
										+ "USER SHOULD BE SEND CHARACTERS ON CITY");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}

						// select drop down value of state
						try {
							String statecontfindselectedvalhead = page.statecontfindsendedvaluemethod();
							String statecontfindselectedvalexcel = Excelreader.getData(0, 5, 1);
							if (statecontfindselectedvalhead.equals(statecontfindselectedvalexcel)) {
								test.pass("TC:5 USER SHOULD BE SELECT STATE DROP DOWN VALUE");
							} else {
								test.fail("TC:5 USER SHOULD BE SELECT STATE DROP DOWN VALUE");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
												"Email_Validation_With_Abuse_Of_Restaurant_Feedback_Page"))
										+ "USER SHOULD BE SELECT STATE DROP DOWN VALUE");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}
						// select drop down value of visit month function
						try {
							String visitdatemothsendvalhead = page.visitdatemothsendvaluemethod();
							String visitdatemothsendvalexcel = Excelreader.getData(0, 6, 1);
							if (visitdatemothsendvalhead.equals(visitdatemothsendvalexcel)) {
								test.pass("TC:6 USER SHOULD BE SELECT DROP DOWN VALUE IN MONT FUNTION");
							} else {
								test.fail("TC:6 USER SHOULD BE SELECT DROP DOWN VALUE IN MONT FUNTION");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
												"Email_Validation_With_Abuse_Of_Restaurant_Feedback_Page"))
										+ " USER SHOULD BE SELECT DROP DOWN VALUE IN MONT FUNTION");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}
						// selecct day drop down values
						try {
							String daysendedvaluehead = page.daysendedvaluemethod();
							String daysendedvalueexcel = Excelreader.getData(0, 7, 1);
							if (daysendedvaluehead.equals(daysendedvalueexcel)) {
								test.pass("TC:7 USE SHOULD BE SELECT 'DAY' AFTER SELECT MONTH");
							} else {
								test.fail("TC:7 USE SHOULD BE SELECT 'DAY' AFTER SELECT MONTH");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
												"Email_Validation_With_Abuse_Of_Restaurant_Feedback_Page"))
										+ "USE SHOULD BE SELECT DAY AFTER SELECT MONTH");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}
						// SELECT YEAT AFTER SELECT MONTH
						try {
							String yearsendedvaluehead = page.yearsendedvaluemethod();
							String yearsendedvalueexcel = Excelreader.getData(0, 8, 1);
							if (yearsendedvaluehead.equals(yearsendedvalueexcel)) {
								test.pass("TC:8 USE SHOULD BE SELECT 'YEAR' AFTER SELECT MONTH");
							} else {
								test.fail("TC:8 USE SHOULD BE SELECT 'YEAR' AFTER SELECT MONTH");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
												"Email_Validation_With_Abuse_Of_Restaurant_Feedback_Page"))
										+ "USE SHOULD BE SELECT 'YEAR' AFTER SELECT MONTH");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());
						}

						// DRIVE thru radio button after selected
						try {
							String drivethruradiobuttonisselectedheadd = page.driveradiobuttonselectedmethod();
							if (drivethruradiobuttonisselectedheadd.equals("true")) {
								test.pass("TC:9 DRIVE THRU TADIO BUTTON SHOULD BE CLICKABLE");
							} else {
								test.fail("TC:9 DRIVE THRU TADIO BUTTON SHOULD BE CLICKABLE");
								test.fail(test
										.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
												"Email_Validation_With_Abuse_Of_Restaurant_Feedback_Page"))
										+ "DRIVE THRU TADIO BUTTON SHOULD BE CLICKABLE");
							}
						} catch (Exception e) {
							test.fail("Error:" + e.getMessage());

						}
					} else {
						test.fail("TC:2 CON'T FIND LOCATION... LINK IS WORKING");
						test.fail(test
								.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
										"Email_Validation_With_Abuse_Of_Restaurant_Feedback_Page"))
								+ "CON'T FIND LOCATION... LINK IS WORKING");
					}
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
		// Enter your comments
				try {
					page.commentspecialchaructermethod(RFKeyword);
				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
		//CHARACTERS VALUES IN FIRST NAME FUNCTION
				 try {
					 String firstnamesendvalexcel=Excelreader.getData(0, 9, 1);
					 String sendedvalhead = page.firstnameM(firstnamesendvalexcel);
						 if(sendedvalhead.equals(firstnamesendvalexcel)) {
						 test.pass("TC:10  USE SHOULD  BE SEND CHARACTERS  IN FIRSTNAME TEXTBOX");
						 }
						 else {
							 test.fail("TC:10  USE SHOULD BE SEND CHARACTERS IN FIRSTNAME TEXTBOX");
							 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Email_Validation_With_Abuse_Of_Restaurant_Feedback_Page"))+ 
										"USE SHOULD  BE SEND CHARACTERS IN FIRSTNAME TEXTBOX");
						 }
						 }catch (Exception e) {
							
							 test.fail("Error:"+ e.getMessage());
						}
		//CHARACTERS IN LAST NAME FUNCTION
					try {
						String LNSPECIALCHARACTER=Excelreader.getData(0, 10, 1);
						String LAscvalue=page.LNsendvaluemethod(LNSPECIALCHARACTER);
						if(LAscvalue.equals(LNSPECIALCHARACTER)) {
							test.pass("TC:11 USER SHOULD BE SEND CHARACTERS IN LASTNAME TEXTBOX");	
						}else {
							test.fail("TC:11 USER SHOULD BE SEND CHARACTERS IN LASTNAME TEXTBOX");
							test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Email_Validation_With_Abuse_Of_Restaurant_Feedback_Page"))+ 
									"USER SHOULD  BE SEND CHARACTERS IN LASTNAME TEXTBOX");
						}
						
					}catch (Exception e) {
						 test.fail("Error:"+ e.getMessage());	
					}			
		//NUMARICAL AND CHARACTERS SEND IN ADDRESS US(ONLY)			
					try {
						String addressspecharacterhead=Excelreader.getData(0, 11, 1);
						String adsccnvalue=page.addressenterdlabel(addressspecharacterhead);
						if(adsccnvalue.equals(addressspecharacterhead)) {
							test.pass("TC:12 USER SHOULD  SEND NUMARICAL AND CHARACTERS IN ADDRESS TEXTBOX");
						}else {
							test.fail("TC:12 USER SHOULD SEND NUMARICAL AND CHARACTERS IN ADDRESS TEXTBOX");
							test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Email_Validation_With_Abuse_Of_Restaurant_Feedback_Page"))+ 
									"USER SHOULD  SEND NUMARICAL AND CHARACTERS IN ADDRESS TEXTBOX");
						}
					}catch (Exception e) {
						test.fail("Error:"+ e.getMessage());
					}			
				
		//CHARACTERS of city
					try {
						String citycharactersexcel=Excelreader.getData(0, 12, 1);
						String citycharactershead=page.cityenteredvalue(citycharactersexcel);
						if(citycharactershead.equals(citycharactersexcel)) {
							test.pass("TC:13 USER SHOULD  SEND CHARACTERS IN CITY TEXTBOX");
						}else {
							test.fail("TC:13 USER SHOULD SEND CHARACTERS IN CITY TEXTBOX");
							test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Email_Validation_With_Abuse_Of_Restaurant_Feedback_Page"))+
									"USER SHOULD SEND CHARACTERS IN CITY TEXTBOX");
						}
						
					}catch (Exception e) {
						test.fail("Error:"+ e.getMessage());
					}			 
			//select drop down values  of state function 
					try {
						String statedropdownvaluehead=page.stateselecteddropdownvalmethod();
						String statedropdownvalueEXCEL=Excelreader.getData(0, 13, 1);
						if(statedropdownvaluehead.equals(statedropdownvalueEXCEL)) {
							test.pass("TC:14 STEATE DROP DOWN VALUE IS WORKING");
						}else {
							test.fail("TC:14 STEATE DROP DOWN VALUE IS NOT WORKING");
							test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Email_Validation_With_Abuse_Of_Restaurant_Feedback_Page"))+
									"STEATE DROP DOWN VALUE IS NOT WORKING");
						}
						}catch (Exception e) {
							 test.fail("Error:"+ e.getMessage());
						}			 
				//NUMERICAL of zip
					 try {
						 String zipsendedvaluesexcel=Excelreader.getData(0, 14, 1);
						 String zipsendedvalueshead=page.zipenteredvalue(zipsendedvaluesexcel);
						 if(zipsendedvalueshead.equals(zipsendedvaluesexcel)) {
							 test.pass("TC:15 USER SHOULD ENTERD NUMERICAL IN ZIP TEXTBOX");
						 }else {
							  
							 test.fail("TC:15 USER SHOULD ENTERD NUMERICAL IN ZIP TEXTBOX");
							 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Email_Validation_With_Abuse_Of_Restaurant_Feedback_Page"))+
										"USER SHOULD ENTERD NUMERICAL IN ZIP TEXTBOX");
						 }
						 
						 }catch (Exception e) {
							 test.fail("Error:"+ e.getMessage()); 
						}			 
			//yes radio button after select
						try {
							String yesradiobuttonisselectedheadd= page.Yesradiobuttonselectmethod();
							if(yesradiobuttonisselectedheadd.equals("true")) {
							 		 test.pass("TC:16 YES RADIO BUTTON SHOULD BE  CLICKABLE");
							}
							else {
								test.fail("TC:16 YES RADIO BUTTON SHOULD BE CLICKABLE");
							 	 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Email_Validation_With_Abuse_Of_Restaurant_Feedback_Page"))+ 
							 				"YES RADIO BUTTON SHOULD BE CLICKABLE");
							}
						}catch (Exception e) {
							test.fail("Error:"+ e.getMessage());
							
						}			 
			//SEND WITH MAIL FORMAT  
						 try {
							 String emailsendid=Excelreader.getData(0, 15, 1);
							 String emailvlue =page.mailsendmethod(emailsendid);
							 if(emailvlue.equals(emailsendid)) {
								 test.pass("TC:17  USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
							 }else {
								 test.fail("TC:17 USER SHOULD SEND MAIL WITH FORMAT IN MAIL TEXTBOX");
								 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Email_Validation_With_Abuse_Of_Restaurant_Feedback_Page"))+
											"USER SHOULD SEND MAIL WITH FORMAT IN MAIL TEXTBOX");
							 }
							 
							 }catch (Exception e) {
								 test.fail("Error:"+ e.getMessage());
							}	 
		// send  IDS IN CONFIRM  
						 try {
							 String confirmmailsend=Excelreader.getData(0, 16, 1);
							 String conmailsendvalue=page.confirmmailenteredvalue(confirmmailsend);
							 if(conmailsendvalue.equals(confirmmailsend)) {
								 test.pass("TC:18  USER SHOULD SEND MAIL IN CONFIRM MAIL TEXTBOX");
							 }else {
								 test.fail("TC:18 USER SHOULD SEND MAIL IN CONFIRM MAIL TEXTBOX");
								 test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Email_Validation_With_Abuse_Of_Restaurant_Feedback_Page"))+
											"USER SHOULD SEND MAIL IN CONFIRM MAIL TEXTBOX");
							 }
							 
							 }catch (Exception e) {
								 test.fail("Error:"+ e.getMessage());
							}		 
				
			//ENTER 10 NUMERICAL 
							try {
								String phonecharacterhead=Excelreader.getData(0, 17, 1);
								String phonenumCenteredval=page.phonenumberenteredvalue(phonecharacterhead);
								if(phonenumCenteredval.equals(phonecharacterhead)) {
									test.pass("TC:19 USER SHOULD  SEND 10 NUMERICAL IN PHONE NUMBER TEXTBOX ");
								}else {
									test.fail("TC:19 USER SHOULD  SEND 10 NUMERICAL IN PHONE NUMBER TEXTBOX ");
									test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Email_Validation_With_Abuse_Of_Restaurant_Feedback_Page"))+
											"USER SHOULD SEND 10 NUMERICAL IN PHONE NUMBER TEXTBOX ");
								}
								
							}catch (Exception e) {
								test.fail("Error:"+ e.getMessage());
							}		
				String gettitle1 = page.sumitmethod();
				String gettitleexcel1 = Excelreader.getData(0, 18, 1);
				if (gettitle1.equals(gettitleexcel1)) {
					test.pass("TC:20 SUBMITED IS SUCCESSFUL");
				} else {
					test.fail("TC:20 SUBMITED IS SUCCESSFUL");
					test.fail(test
							.addScreenCaptureFromPath(Extentreport.getScreenshot(driver,
									"Email_Validation_With_Abuse_Of_Restaurant_Feedback_Page"))
							+ "SUBMITED IS SUCCESSFUL");
				}
				/*driver.close();
				Thread.sleep(1000);
				driver = new ChromeDriver();
				Thread.sleep(1000);
				driver.manage().window().maximize();*/
			}
		}

	}

}


package com.Mcd.qa.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.McD.qa.Base.BaseTest;
import com.McD.qa.Extentreport.Extentreport;
import com.McD.qa.Pages.Basepage;
import com.McD.qa.Pages.Core_General_Inquiry_Page;
import com.McD.qa.Utility.TestUtil;

public class Core_General_Inquiry extends BaseTest {
	Core_General_Inquiry_Page page = new Core_General_Inquiry_Page(driver);
	String excelptha = System.getProperty("user.dir");
	TestUtil Excelreader = new TestUtil(excelptha + "/src/main/java/com/McD/qa/TestData/Core_General_Inquiry.xlsx");

	@Test(priority = 1)
	public void Open_URL() throws IOException {
		Core_General_Inquiry_Page page = new Core_General_Inquiry_Page(driver);
		test = extent.createTest("Open_URL");
		try {
			driver.get(Basepage.readProperty("urlG"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 2);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");
			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "URL IS NOT OPENED");
				extent.flush();
				driver.close();
				throw new SkipException("Skipping - ");
			}
		} catch (Exception e) {
			test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
					+ "LABEL OF GENERAL ENQUIRE IS NOT DISPLAYED");
			extent.flush();
			driver.close();
			throw new SkipException("Skipping - ");
		}
	}

	@Test(priority = 2)
	public void General_Inqury() throws IOException {
		test = extent.createTest("General_Inqury");
		Core_General_Inquiry_Page page = new Core_General_Inquiry_Page(driver);
		// General inquiry label
		try {
			String GE = page.getgeneralinquirylabel();
			String GEEXC = Excelreader.getData(0, 1, 1);
			if (GE.equals(GEEXC)) {
				test.pass("TC:3 LABEL OF GENERAL ENQUIRE IS DISPLAYED");
			} else {
				test.fail("TC:3 LABEL OF GENERAL ENQUIRE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "LABEL OF GENERAL ENQUIRE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
			;
		}
		// Have general question label
		try {
			String havela = page.havelabels();
			String haveexcel = Excelreader.getData(0, 2, 1);
			if (havela.equals(haveexcel)) {
				test.pass("TC:4 LABEL OF Have A GENERAL.... IS DISPLAYED");
			} else {
				test.fail("TC:4 LABEL OF Have A GENERAL.... IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "LABEL OF Have A GENERAL.... IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 3)
	public void Pick_Different_Topic() throws IOException {
		test = extent.createTest("Pick_Different_Topic");
		Core_General_Inquiry_Page page = new Core_General_Inquiry_Page(driver);
		
		try {
			driver.get(Basepage.readProperty("urlG"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 2);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");
			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "URL IS NOT OPENED");
				extent.flush();
				driver.close();
				throw new SkipException("Skipping - ");
			}
		} catch (Exception e) {
			test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
					+ "LABEL OF GENERAL ENQUIRE IS NOT DISPLAYED");
			extent.flush();
			driver.close();
			throw new SkipException("Skipping - ");
		}
		// Label of pick a different topic
		try {
			String picklab = page.labepickdiftopic();
			String picklabexcel = Excelreader.getData(0, 3, 1);
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
		// GO BUTTON is enable or not
		try {
			page.Gobuttonena();
			test.pass("TC:6 GO BUTTON IS ENABLE AND DISPLAYED");
		
		// after click on pick different topic
		try {
			String afterpicklab = page.labepickdiftopic1();
			String afterpicklabexcel = Excelreader.getData(0, 3, 1);
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
			String contactusdropdownexcel = Excelreader.getData(0, 8, 1);
			if (contactusdropdownhead.equals(contactusdropdownexcel)) {
				test.pass("TC:7 THE DROPDWON 'PICK A DIFFERENT TOPIC' SHOULD BE CLICKABLE");
				
					String gettitle = page.contactusgetpagetitlemethod1();
					String gettitleexcel = Excelreader.getData(0, 8, 2);
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

		// mobile app feedback
		try {
			String clickonmobilehead = page.clickonmobilemethod(); // click and drop down value is display or not
			String clickonmobileexcel = Excelreader.getData(0, 9, 1);
			if (clickonmobilehead.equals(clickonmobileexcel)) {
				test.pass("TC:8 THE DROPDWON 'PICK A DIFFERENT TOPIC' SHOULD BE CLICKABLE");
					String gettitle = page.contactusgetpagetitlemethod1();
					String gettitleexcel = Excelreader.getData(0, 9, 2);
					if (gettitle.equals(gettitleexcel)) {
						test.pass(
								"TC:8 THE PAGE 'MOBILE APP FEEDBACK' PAGE IS TRIGGERED AND DISPLAYED IN THE SAME PAGE");
						driver.navigate().back();
					} else {
						test.fail(
								"TC:8 THE PAGE 'MOBILE APP FEEDBACK' PAGE IS NOT TRIGGERED AND DISPLAYED IN THE SAME PAGE");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
								+ "HEADING 'MOBILE APP FEEDBACK' IS NOT TRIGGERED");
						driver.navigate().back();
					}
				
			} else {
				test.fail("TC:8 THE DROPDWON 'PICK A DIFFERENT TOPIC' SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE DROPDWON 'PICK A DIFFERENT TOPIC' SHOULD BE CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// RESTAURANT FEEDBACK

		try {
			String restaurantdropdownvlauehead = page.restaurantdropdownvlauemethod(); // click and drop down value is
			String restaurantdropdownvlaueexcel = Excelreader.getData(0, 10, 1);
			if (restaurantdropdownvlauehead.equals(restaurantdropdownvlaueexcel)) {
				test.pass("TC:9 THE DROPDWON 'PICK A DIFFERENT TOPIC' SHOULD BE CLICKABLE");
					String gettitle = page.contactusgetpagetitlemethod1();
					String gettitleexcel = Excelreader.getData(0, 10, 2);
					if (gettitle.equals(gettitleexcel)) {
						test.pass(
								"TC:9 THE PAGE 'RESTAURANT FEEDBACK' PAGE IS TRIGGERED AND DISPLAYED IN THE SAME PAGE");
						driver.navigate().back();
					} else {
						test.fail(
								"TC:9 THE PAGE 'RESTAURANT FEEDBACK' PAGE IS NOT TRIGGERED AND DISPLAYED IN THE SAME PAGE");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
								+ "HEADING 'RESTAURANT FEEDBACK' IS NOT TRIGGERED");
						driver.navigate().back();
					}
			} else {
				test.fail("TC:9 THE DROPDWON 'PICK A DIFFERENT TOPIC' SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE DROPDWON 'PICK A DIFFERENT TOPIC' SHOULD BE CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// TRADEMARK PERMISION

		try {
			String trademarkdropdownvaluehead = page.trademarkdropdownvaluemethod(); // click and drop down value is
			String trademarkdropdownvalueexcel = Excelreader.getData(0, 11, 1);
			if (trademarkdropdownvaluehead.equals(trademarkdropdownvalueexcel)) {
				test.pass("TC:10 THE DROPDWON 'PICK A DIFFERENT TOPIC' SHOULD BE CLICKABLE");
				
					test.pass("TC:10 USER SHOULD BE SELECT 'TRADEMARK PERMISION ' OPTION");
					String gettitle = page.contactusgetpagetitlemethod1();
					String gettitleexcel = Excelreader.getData(0, 11, 2);
					if (gettitle.equals(gettitleexcel)) {
						test.pass(
								"TC:10 THE PAGE 'TRADEMARK PERMISION' PAGE IS TRIGGERED AND DISPLAYED IN THE SAME PAGE");
						driver.navigate().back();
					} else {
						test.fail(
								"TC:10 THE PAGE 'TRADEMARK PERMISION' PAGE IS NOT TRIGGERED AND DISPLAYED IN THE SAME PAGE");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
								+ "HEADING 'TRADEMARK PERMISION' IS NOT TRIGGERED");
						driver.navigate().back();
					}
			} else {
				test.fail("TC:10 THE DROPDWON 'PICK A DIFFERENT TOPIC' SHOULD BE CLICKABLE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE DROPDWON 'PICK A DIFFERENT TOPIC' SHOULD BE CLICKABLE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		} catch (Exception e) {
			test.fail("TC:6 GO BUTTON IS NOT ENABLE AND DISPLAYED");
			test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
					+ "GO BUTTON IS NOT ENABLE AND DISPLAYED");
		}

	}

	@Test(priority = 4)
	public void We_Want_to_Hear_From_You() {
		// we want to hear from you labels
		test = extent.createTest("We_Want_to_Hear_From_You");
		Core_General_Inquiry_Page page = new Core_General_Inquiry_Page(driver);
		try {
			String WEWANTTOHEAD = page.wewanttohearlabel();
			String WEWANTTOEXCEL = Excelreader.getData(0, 12, 1);
			if (WEWANTTOHEAD.equals(WEWANTTOEXCEL)) {
				test.pass("TC:11 THE LABEL''WE WANT WANT TO HEAR FROM YOU!' IS DISPLAYED ");
			} else {
				test.fail("TC:11 THE LABEL''WE WANT WANT TO HEAR FROM YOU!' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE LABEL''WE WANT WANT TO HEAR FROM YOU!' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// PLEASE PROVIDE A FEW DETAILS BELOW
		try {
			String PLEASEPROVIDELABEL = page.pleaseprovidefewlabel();
			String PLEASEPROVIDEEXCEL = Excelreader.getData(0, 13, 1);
			if (PLEASEPROVIDELABEL.equals(PLEASEPROVIDEEXCEL)) {
				test.pass("TC:12 THE LABEL 'PLEASE PROVIDE A FEW DETAILS BELOW.' IS DISPLAYED");
			} else {
				test.fail("TC:12 THE LABEL 'PLEASE PROVIDE A FEW DETAILS BELOW.' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE LABEL 'PLEASE PROVIDE A FEW DETAILS BELOW.' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// INDICATES REQUIRED FIELDS LABEL
		try {
			String INDICATEREQUIRE = page.indicaterequiredmethod();
			String INDICATEREQUIREEXCEL = Excelreader.getData(0, 14, 1);
			if (INDICATEREQUIRE.equals(INDICATEREQUIREEXCEL)) {
				test.pass("TC:13 THE LABEL '*INDICATES REQUIRED FIELDS' IS DISPLAYED");
			} else {
				test.fail("TC:13 THE LABEL '*INDICATES REQUIRED FIELDS' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE LABEL '*INDICATES REQUIRED FIELDS' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 5)
	public void What_is_This_About() throws IOException {
		test = extent.createTest("What_is_This_About");
		Core_General_Inquiry_Page page = new Core_General_Inquiry_Page(driver);
		// What is this about?
		try {
			String WHATTHISABOUTLABE = page.Whatisaboutmethod();
			String WHATTHISABOUTEXCEL = Excelreader.getData(0, 15, 1);
			if (WHATTHISABOUTLABE.equals(WHATTHISABOUTEXCEL)) {
				test.pass("TC:14 THE LABEL 'WHAT IS THIS ABOUT'  IS DISPLAYED");
			} else {
				test.fail("TC:14 THE LABEL 'WHAT IS THIS ABOUT' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE LABEL 'WHAT IS THIS ABOUT' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// *Choose one of the following
		try {
			String CHOOOSEFOLLWHEAD = page.choosefollingmethod();
			String CHOOOSEFOLLWEXCEL = Excelreader.getData(0, 16, 1);
			if (CHOOOSEFOLLWHEAD.equals(CHOOOSEFOLLWEXCEL)) {
				test.pass("TC:15 THE LABEL 'CHOOSE ONE OF THE FOLLOWING'  IS DISPLAYED");
			} else {
				test.fail("TC:15 THE LABEL 'CHOOSE ONE OF THE FOLLOWING' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE LABEL 'CHOOSE ONE OF THE FOLLOWING' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// please select any one option label

		try {
			String seleoneoptionhead = page.selectoneoptionmethod();
			String seleconeoptionexcel = Excelreader.getData(0, 17, 1);
			if (seleoneoptionhead.equals(seleconeoptionexcel)) {
				test.pass("TC:16.2 THE TEXT 'PLEASE SELECT ANY ONE OPTION'  IS DISPLAYED");
			} else {
				test.fail("TC:16.2 THE TEXT 'PLEASE SELECT ANY ONE OPTION' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE TEXT 'PLEASE SELECT ANY ONE OPTION' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER SELECT DROPDOWN VALUE, LABEL IS Rolled UP
		try {
			String seleoneoptionhead = page.selectoneoptionmethod1();
			String seleconeoptionexcel = Excelreader.getData(0, 17, 1);
			if (seleoneoptionhead.equals(seleconeoptionexcel)) {
				test.pass("TC:16.4  THE TEXT 'PLEASE SELECT ANY ONE OPTION' IS ROLLED UP IN THE PAGE");
			} else {
				test.fail("TC:16.4 THE TEXT 'PLEASE SELECT ANY ONE OPTION' IS NOT ROLLED UP IN THE PAGE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE TEXT 'PLEASE SELECT ANY ONE OPTION' IS NOT ROLLED UP IN THE PAGE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// CLICK ON 'PLEASE SELECT ANY ONE OPTION'
		try {
			String selectoptionhead = page.selecoptionclickmethod();
			String selectoptionexcel = Excelreader.getData(0, 17, 2);
			if (selectoptionhead.equals(selectoptionexcel)) {
				test.pass("TC:16.1 THE TEXT 'PLEASE SELECT ANY ONE OPTION' DROP DOWN IS WORKING");
				
			} else {
				test.fail("TC:16.1 THE TEXT 'PLEASE SELECT ANY ONE OPTION' DROP DOWN IS WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE TEXT 'PLEASE SELECT ANY ONE OPTION' DROP DOWN IS WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 6)
	public void Tell_Us_About_It() {
		// tell us about it label
		test = extent.createTest("Tell_Us_About_It");
		Core_General_Inquiry_Page page = new Core_General_Inquiry_Page(driver);
		// LABEL OF TELL US ABOUT IT
		try {
			String tellusabouthead = page.tellusaboutmethod();
			String tellusaboutexcel = Excelreader.getData(0, 18, 1);
			if (tellusabouthead.equals(tellusaboutexcel)) {
				test.pass("TC:17  THE LABEL'TELL US ABOUT IT' IS DISPLAYED");
			} else {
				test.fail("TC:17 THE LABEL'TELL US ABOUT IT' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE LABEL'TELL US ABOUT IT' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// LABEL OF enter your comments(0/1200 characters)
		try {
			String Entercommentlabel = page.entercommentsmethod();
			String Entercommentexcel = Excelreader.getData(0, 19, 1);
			if (Entercommentlabel.equals(Entercommentexcel)) {
				test.pass("TC:18  THE LABEL'ENTER YOUR COMMENTS(0/1200 characters)' IS DISPLAYED");
			} else {
				test.fail("TC:18 THE LABEL'ENTER YOUR COMMENTS(0/1200 characters)' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE LABEL'ENTER YOUR COMMENTS(0/1200 characters)' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// LABEL OF ENTER YOUR COMMENTS IS ROLLED UP

		try {
			String Entercommentrolledlabel = page.entercommentsmethod1();
			String Entercommentrolledexcel = Excelreader.getData(0, 19, 1);
			if (Entercommentrolledlabel.equals(Entercommentrolledexcel)) {
				test.pass("TC:18.4  THE LABEL'ENTER YOUR COMMENTS(0/1200 characters)' IS ROLLED UP");
			} else {
				test.fail("TC:18.4 THE LABEL'ENTER YOUR COMMENTS(0/1200 characters)' IS NOT ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE LABEL'ENTER YOUR COMMENTS(0/1200 characters)' IS NOT NOT ROLLED UP");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// enter special characters on comments
		try {
			String commetspecialcharacterhexcel = Excelreader.getData(0, 20, 1);
			String commscenteredvalue = page.commentspecialchaructermethod(commetspecialcharacterhexcel);
			if (!commscenteredvalue.equals(commetspecialcharacterhexcel)) {
				test.pass("TC:18 USE NOT ABLE TO SEND SPECIAL CHARACTER IN COMMENT TEXT");
			} else {
				test.fail("TC:18 USE ABLE TO SEND SPECIAL CHARACTER IN COMMENT TEXT");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "USE ABLE TO SEND SPECIAL CHARACTER IN COMMENT TEXT");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// enter numerical
		try {
			String commetnumericalexcel = Excelreader.getData(0, 21, 1);
			String commscenteredvalue = page.commentspecialchaructermethod(commetnumericalexcel);
			if (commscenteredvalue.equals(commetnumericalexcel)) {
				test.pass("TC:18 USE ABLE TO SEND NUMERICAL IN COMMENT TEXT");
			} else {
				test.fail("TC:18 USE NOT ABLE TO SEND NUMARICAL IN COMMENT TEXT");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "USE NOT ABLE TO SEND NUMARICAL IN COMMENT TEXT");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// Enter MORE THAN 1200 characters and error message
		try {
			String commetcharacterexcel = Excelreader.getData(0, 22, 1);
			String commmorethan1200 = page.commentspecialchaructermethod(commetcharacterexcel);
			if (commmorethan1200.equals(commetcharacterexcel)) {
				test.pass("TC:18 USE ABLE TO SEND MORE THAN 1200 IN COMMENT TEXT");
				String commmeterromesshead = page.commenterrormessagmethod1();
				String commentserrormessexcel = Excelreader.getData(0, 23, 1);
				if (commmeterromesshead.equals(commentserrormessexcel)) {
					test.pass("'ERROR MESSAGE DISPLAYED FOR ENTERING MORE THAN 1200 CHARS' -->" + "'"
							+ commmeterromesshead + "'");

				} else {
					test.fail(
							"TC:18 ENTER YOUR COMMENT OF ERROR MESSAGE IS NOT DISPLAYED AFTER ENTERED MORE THAN 1200 CHARACTERS");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
							+ "ENTER YOUR COMMETN OF ERROR MESSAGE IS NOT DISPLAYED AFTER ENTERED MORE THAN 1200 CHARACTERS");
				}
			} else {
				test.fail("TC:18 USE NOT ABLE TO SEND MORE THAN 1200 IN COMMENT TEXT");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "USE NOT ABLE TO SEND MORE THAN 1200 IN COMMENT TEXT");

			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// error message after click on submit
		try {
			String commmeterromesshead = page.commenterrormessagmethod();
			String commentserrormessexcel = Excelreader.getData(0, 23, 2);
			if (commmeterromesshead.equals(commentserrormessexcel)) {
				test.pass("'ERROR MESSAGE DISPLAYED' -->" + "'" + commmeterromesshead + "'");

			} else {
				test.fail("TC:18 ENTER YOUR COMMETN OF ERROR MESSAGE IS NOT DISPLAYED AFTER SUBMIT");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "ENTER YOUR COMMETN OF ERROR MESSAGE IS NOT DISPLAYED AFTER SUBMIT");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 7)
	public void First_Name() {
		test = extent.createTest("Frist_Name");
		Core_General_Inquiry_Page page = new Core_General_Inquiry_Page(driver);
		// TELL US ABOUT YOURSELF
		try {
			String tellusabouthead = page.teluraboutmethod();
			String tellusaboutexcel = Excelreader.getData(0, 25, 1);
			if (tellusabouthead.equals(tellusaboutexcel)) {
				test.pass("TC:19 THE LABEL 'TELL US ABOUT YOURSELF' IS DISPLAYED");
			} else {
				test.fail("TC:19 THE LABEL 'TELL US ABOUT YOURSELF' IS NOT DISPLAYED ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE LABEL 'TELL US ABOUT YOURSELF' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// label of first name
		try {
			String firstnamelabehead = page.firstnamelabelmethod();
			String firstnamelabelexcel = Excelreader.getData(0, 26, 1);
			if (firstnamelabehead.equals(firstnamelabelexcel)) {
				test.pass("TC:20 THE LABEL 'FIRST NAME' IS DISPLAYED");
			} else {
				test.fail("TC:20 THE LABEL 'FIRST NAME' IS NOT DISPLAYED ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE LABEL 'FIRST NAME' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// after click first name label
		try {
			String firstnamelabehead = page.firstnamelabelmethod1();
			String firstnamelabelexcel = Excelreader.getData(0, 26, 1);
			if (firstnamelabehead.equals(firstnamelabelexcel)) {
				test.pass("TC:20 THE TEXT '*FIRST NAME' IS ROLLED UP IN THE SAME PAGE");
			} else {
				test.fail("TC:20 THE TEXT '*FIRST NAME' IS NOT ROLLED UP IN THE SAME PAGE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE TEXT '*FIRST NAME' IS NOT ROLLED UP IN THE SAME PAGE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// enter numerical
		try {
			String FIRSTNAMENUMERICAL = Excelreader.getData(0, 27, 1);
			String valn = page.finameEnteredvalue(FIRSTNAMENUMERICAL);
			if (!valn.equals(FIRSTNAMENUMERICAL)) {
				test.pass("TC:20  NUMERICAL VALUE IS NOT ENTERED IN FIRSTNAME TEXTBOX");
			} else {
				test.fail("TC:20  NUMERICAL VALUE IS ENTERED IN FIRSTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "NUMERICAL VALUE IS ENTERED IN FIRSTNAME TEXTBOX");
			}
		} catch (Exception e) {

			test.fail("Error:" + e.getMessage());
		}
		// SPECIAL CHARACTERS
		try {
			String FNSPECIALCHARACTER = Excelreader.getData(0, 28, 1);
			String valsc = page.finameEnteredvalue(FNSPECIALCHARACTER);
			if (!valsc.equals(FNSPECIALCHARACTER)) {
				test.pass("TC:20  SPECIAL CHARACTERS VALUE IS NOT ENTERED IN FIRSTNAME TEXTBOX");
			} else {
				test.fail("TC:20  SPECIAL CHARACTERS VALUE IS ENTERED IN FIRSTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "SPECIAL CHARACTERS VALUE IS ENTERED IN FIRSTNAME TEXTBOX");
			}
		} catch (Exception e) {

			test.fail("Error:" + e.getMessage());
		}
		// CHARACTER
		try {
			String FNCHARACTER = Excelreader.getData(0, 29, 1);
			String valc = page.finameEnteredvalue(FNCHARACTER);
			if (valc.equals(FNCHARACTER)) {
				test.pass("TC:20  CHARACTERS VALUE IS ENTERED IN FIRSTNAME TEXTBOX");
			} else {
				test.fail("TC:20  CHARACTERS VALUE IS NOT ENTERED IN FIRSTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "CHARACTERS VALUE IS NOT ENTERED IN FIRSTNAME TEXTBOX");
			}
		} catch (Exception e) {

			test.fail("Error:" + e.getMessage());
		}

		// more than 25 characters
		try {
			String FNMORETHAN25 = Excelreader.getData(0, 30, 1);
			String valc = page.finameEnteredvalue(FNMORETHAN25);
			if (!valc.equals(FNMORETHAN25)) {
				test.pass("TC:20  MORE THAN 25 CHARACTER IS NOT ENTERED IN FIRSTNAME TEXTBOX");
			} else {
				test.fail("TC:20  MORE THAN 25 CHARACTER IS ENTERED IN FIRSTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "MORE THAN 25 CHARACTER IS ENTERED IN FIRSTNAME TEXTBOX");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// click on submit and catch error message
		try {
			String finameeror1 = page.firstnameerror();
			String exfinamerror2 = Excelreader.getData(0, 31, 1);
			if (finameeror1.equals(exfinamerror2)) {
				test.pass("'ERROR MESSAGE DISPLAYED' -->" + "'" + finameeror1 + "'");
			} else {
				test.fail("FIRST NAME FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "FIRST NAME FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 8)
	public void Last_Name() {
		test = extent.createTest("Last_Name");
		Core_General_Inquiry_Page page = new Core_General_Inquiry_Page(driver);
		// LAST NAME LABEL
		try {
			String LNlabelhead = page.lastnamelabelmethod();
			String LNlabelexcel = Excelreader.getData(0, 32, 1);
			if (LNlabelhead.equals(LNlabelexcel)) {
				test.pass("TC:21 THE LABEL 'LAST NAME' IS DISPLAYED");
			} else {
				test.fail("TC:21 THE LABEL 'LAST NAME' IS NOT DISPLAYED ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE LABEL 'LAST NAME' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// CLICK AND ROLLED UP THE LAST NAME LABEL

		try {
			String LNlabelhead = page.lastnamelabelmethod1();
			String LNlabelexcel = Excelreader.getData(0, 32, 1);
			if (LNlabelhead.equals(LNlabelexcel)) {
				test.pass("TC:21 THE LABEL 'LAST NAME' IS ROLLED UP AFTER CLICK ON LAST NAME");
			} else {
				test.fail("TC:21 THE LABEL 'LAST NAME' IS NOT ROLLED UP AFTER CLICK ON LAST NAME");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE LABEL 'LAST NAME' IS NOT ROLLED UP AFTER CLICK ON LAST NAME");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// LAST NAME NUMARICAL
		try {
			String LNnumarical = Excelreader.getData(0, 33, 1);
			String LAvalue = page.lastnameenterdvalue(LNnumarical);
			if (!LAvalue.equals(LNnumarical)) {
				test.pass("TC:21 NUMERICAL VALUE IS NOT ENTERED IN LASTNAME TEXTBOX ");
			} else {
				test.fail("TC:21 NUMERICAL VALUE IS ENTERED IN LASTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "NUMERICAL VALUE IS ENTERED IN LASTNAME TEXTBOX");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// SPECIAL CHARACTERS
		try {
			String LNSPECIALCHARACTER = Excelreader.getData(0, 34, 1);
			String LAscvalue = page.lastnameenterdvalue(LNSPECIALCHARACTER);
			if (!LAscvalue.equals(LNSPECIALCHARACTER)) {
				test.pass("TC:21 SPECIAL CHARACTERS VALUE IS NOT ENTERED IN LASTNAME TEXTBOX ");
			} else {
				test.fail("TC:21 SPECIAL CHARACTERS VALUE IS ENTERED IN LASTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "SPECIAL CHARACTERS VALUE IS ENTERED IN LASTNAME TEXTBOX");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// CHARACTER of last name
		try {
			String LNcharacter = Excelreader.getData(0, 35, 1);
			String LAcvalue = page.lastnameenterdvalue(LNcharacter);
			if (LAcvalue.equals(LNcharacter)) {
				test.pass("TC:21 CHARACTERS VALUE IS ENTERED IN LASTNAME TEXTBOX");
			} else {
				test.fail("TC:21 CHARACTERS VALUE IS NOT ENTERED IN LASTNAME TEXTBOX ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "CHARACTERS VALUE IS NOT ENTERED IN LASTNAME TEXTBOX");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// more than 25 characters
		try {
			String LNmoretahan25 = Excelreader.getData(0, 36, 1);
			String LA25value = page.lastnameenterdvalue(LNmoretahan25);
			if (!LA25value.equals(LNmoretahan25)) {
				test.pass("TC:21 MORE THAN 25 CHARACTERS IS NOT ENTERED IN LASTNAME TEXTBOX ");
			} else {
				test.fail("TC:21 MORE THAN 25 CHARACTERS IS ENTERED IN LASTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "MORE THAN 25 CHARACTERS IS ENTERED IN LASTNAME TEXTBOX");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// click on submit and catch error message of last name
		try {
			String LNerrormess = page.lastnameerrormesmethod();
			String LNerrormesexcel = Excelreader.getData(0, 37, 1);
			if (LNerrormess.equals(LNerrormesexcel)) {
				test.pass("LAST NAME FUNCTION ERROR MESSAGE IS DISPLAYED");
				test.pass("'ERROR MESSAGE DISPLAYED' -->" + "'" + LNerrormess + "'");
			} else {
				test.fail("LAST NAME FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "LAST NAME FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 9)
	public void Address() {
		test = extent.createTest("Address");
		Core_General_Inquiry_Page page = new Core_General_Inquiry_Page(driver);
		// ADDRESS(US ONLY)
		try {
			String addresslabelhead = page.addresslabelmethod();
			String addresslabelexcel = Excelreader.getData(0, 38, 1);
			if (addresslabelhead.equals(addresslabelexcel)) {
				test.pass("TC:22 THE LABEL 'ADDRESS(US ONLY)' IS DISPLAYED");
			} else {
				test.fail("TC:22 THE LABEL 'ADDRESS(US ONLY)' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE LABEL 'ADDRESS(US ONLY)' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// CLICK ON ADDRESS(US ONLY) AND CHECK LABES rolled up or not
		try {
			String addresslabelhead = page.addresslabelmethod1();
			String addresslabelexcel = Excelreader.getData(0, 38, 1);
			if (addresslabelhead.equals(addresslabelexcel)) {
				test.pass("TC:22 THE LABEL 'ADDRESS(US ONLY)' IS ROLLED UP");
			} else {
				test.fail("TC:22 THE LABEL 'ADDRESS(US ONLY)' IS NOT ROLLED UP");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE LABEL 'ADDRESS(US ONLY)' IS NOT ROLLED UP");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send numarical
		try {
			String addressnumaricalhead = Excelreader.getData(0, 39, 1);
			String addnvalue = page.addresssendedvaluemethod(addressnumaricalhead);
			if (addnvalue.equals(addressnumaricalhead)) {
				test.pass("TC:22 NUMERICAL VALUE IS ENTERED IN ADDRESS TEXTBOX");
			} else {
				test.fail("TC:22 NUMERICAL VALUE IS NOT ENTERED IN ADDRESS TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "NUMERICAL VALUE IS NOT ENTERED IN ADDRESS TEXTBOX");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// special characters
		try {
			String addressspecharacterhead = Excelreader.getData(0, 40, 1);
			String adsccnvalue = page.addresssendedvaluemethod(addressspecharacterhead);
			if (!adsccnvalue.equals(addressspecharacterhead)) {
				test.pass("TC:22 SPECIAL CHARACTERS VALUE NOT ABLE TO ENTERED IN ADDRESS TEXTBOX");
			} else {
				test.fail("TC:22 SPECIAL CHARACTERS VALUE IS ENTERED IN ADDRESS TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "SPECIAL CHARACTERS VALUE IS ENTERED IN ADDRESS TEXTBOX");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// characters of addresss
		try {
			String addresscharactershead = Excelreader.getData(0, 41, 1);
			String addCvalue = page.addresssendedvaluemethod(addresscharactershead);
			if (addCvalue.equals(addresscharactershead)) {
				test.pass("TC:22 CHARACTERS VALUE IS ENTERED IN ADDRESS TEXTBOX");
			} else {
				test.fail("TC:22 CHARACTERS VALUE IS NOT ENTERED IN ADDRESS TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "CHARACTERS VALUE IS NOT ENTERED IN ADDRESS TEXTBOX");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// more than 40 characters in address
		try {
			String addmorethan40 = Excelreader.getData(0, 42, 1);
			String addCvalue = page.addresssendedvaluemethod(addmorethan40);
			if (!addCvalue.equals(addmorethan40)) {
				test.pass("TC:22 USER SHOULD NOT SEND MORE THAN 40 CHARACTERS AND NUMARICAL ON ADDRESS FUNCTION");
			} else {
				test.fail("TC:22 USER SHOULD NOT SEND MORE THAN 40 CHARACTERS AND NUMARICAL ON ADDRESS FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "USER SHOULD NOT SEND MORE THAN 40 CHARACTERS AND NUMARICAL ON ADDRESS FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// click on submit and catch error message of ADDRESS US
		try {
			String addresserrormessage = page.addresserrormessagemethod();
			String addresserrormessexcel = Excelreader.getData(0, 43, 1);
			if (addresserrormessage.equals(addresserrormessexcel)) {
				test.pass("ADDRESS(US ONLY) FUNCTION ERROR MESSAGE IS DISPLAYED");
				test.pass("'ERROR MESSAGE DISPLAYED' -->" + "'" + addresserrormessage + "'");
			} else {
				test.fail("ADDRESS(US ONLY) FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "ADDRESS(US ONLY) FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 10)
	public void AptSuite() {
		test = extent.createTest("AptSuite");
		Core_General_Inquiry_Page page = new Core_General_Inquiry_Page(driver);
		// LABEL OF APT/SUITE
		try {
			String aptsuitelabelhead = page.apisitelabelmethod();
			String aptsuitelabelexcel = Excelreader.getData(0, 44, 1);
			if (aptsuitelabelhead.equals(aptsuitelabelexcel)) {
				test.pass("TC:23 THE LABEL 'APT/SUITE' IS DISPLAYED ");
			} else {
				test.fail("TC:23 THE LABEL 'APT/SUITE' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE LABEL 'APT/SUITE' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// CLICK ON APT/SUITE AND ROLLED UP THE LABEL

		try {
			String aptsuitelabelhead = page.apisitelabelmethod1();
			String aptsuitelabelexcel = Excelreader.getData(0, 44, 1);
			if (aptsuitelabelhead.equals(aptsuitelabelexcel)) {
				test.pass("TC:23 THE LABEL 'APT/SUITE' IS ROLLED UP AFTER CLICK");
			} else {
				test.fail("TC:23 THE LABEL 'APT/SUITE' IS NOT ROLLED UP AFTER CLICK");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE LABEL 'APT/SUITE' IS NOT ROLLED UP AFTER CLICK");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// SPECIAL CHARACTER
		try {
			String apisuitespecialcharecter = Excelreader.getData(0, 45, 1);
			String suitesh = page.aptsuitsendedvaluemethod(apisuitespecialcharecter);
			if (!suitesh.equals(apisuitespecialcharecter)) {
				test.pass("TC:23 SPECIAL CHARACTERS VALUE NOT ABLE TO ENTERED IN APT/SUITE TEXTBOX");
			} else {
				test.fail("TC:23 SPECIAL CHARACTERS VALUE IS ENTERED IN APT/SUITE TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "SPECIAL CHARACTERS VALUE IS ENTERED IN APT/SUITE TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// characters and numerical of apisuite function
		try {
			String apisuitecharandnumari = Excelreader.getData(0, 46, 1);
			String suitesh = page.aptsuitsendedvaluemethod(apisuitecharandnumari);
			if (suitesh.equals(apisuitecharandnumari)) {
				test.pass("TC:23 CHARACTERS AND NUMERICAL ABLE TO ENTERED IN APT/SUITE TEXTBOX");
			} else {
				test.fail("TC:23 CHARACTERS AND NUMERICAL NOT ABLE TO ENTERED IN APT/SUITE TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "CHARACTERS AND NUMERICAL NOT ABLE TO ENTERED IN APT/SUITE TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// more than 40 characters and numerical
		try {
			String apisuitemorethan40 = Excelreader.getData(0, 47, 1);
			String suitemore40 = page.aptsuitsendedvaluemethod(apisuitemorethan40);
			if (!suitemore40.equals(apisuitemorethan40)) {
				test.pass("TC:23 MORE THAN 40 CHARACTER AND NUMARICAL VALUES SHOULD NOT ENTERED IN APT/SUITE TEXTBOX");
			} else {
				test.fail("TC:23 MORE THAN 40 CHARACTER AND NUMARICAL VALUES IS ENTERED IN APT/SUITE TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "MORE THAN 40 CHARACTER AND NUMARICAL VALUES IS ENTERED IN APT/SUITE TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 11)
	public void City() {
		test = extent.createTest("City");
		Core_General_Inquiry_Page page = new Core_General_Inquiry_Page(driver);
		// label of citys
		try {
			String citylabelhead = page.citylabelmethod();
			String citylabelexcel = Excelreader.getData(0, 48, 1);
			if (citylabelhead.equals(citylabelexcel)) {
				test.pass("TC:24 THE LABEL 'CITY' IS DISPLAYED ");
			} else {
				test.fail("TC:24 THE LABEL 'CITY' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE LABEL 'CITY' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// after click on city text and rolled up label

		try {
			String citylabelhead = page.citylabelmethod1();
			String citylabelexcel = Excelreader.getData(0, 48, 1);
			if (citylabelhead.equals(citylabelexcel)) {
				test.pass("TC:24 THE LABEL 'CITY' IS ROLLED UP AFTER CLICK ON CLITY TEXT ");
			} else {
				test.fail("TC:24 THE LABEL 'CITY' IS NOT ROLLED UP AFTER CLICK ON CLITY TEXT");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE LABEL 'CITY' IS NOT ROLLED UP AFTER CLICK ON CLITY TEXT");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// numarical
		try {
			String citynumarical = Excelreader.getData(0, 49, 1);
			String citynenteredvalue = page.citysendedvaluemethod(citynumarical);
			if ((!citynenteredvalue.equals(citynumarical))) {
				test.pass("TC:24 NUMARICAL VALUE NOT ABLE TO ENTERED IN CITY TEXTBOX");
			} else {
				test.fail("TC:24 NUMARICAL VALUE IS ENTERED IN CITY TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "NUMARICAL VALUE IS ENTERED IN CITY TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// special characters
		try {
			String cityspecialcharcters = Excelreader.getData(0, 50, 1);
			String citySCenteredvalue = page.citysendedvaluemethod(cityspecialcharcters);
			if ((!citySCenteredvalue.equals(cityspecialcharcters))) {
				test.pass("TC:24 SPECIAL CHARACTER VALUE NOT ABLE TO ENTERED IN CITY TEXTBOX");
			} else {
				test.fail("TC:24 SPECIAL CHARACTER VALUE IS ENTERED IN CITY TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "SPECIAL CHARACTER VALUE IS ENTERED IN CITY TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// CHARACTERS
		try {
			String citycharecter = Excelreader.getData(0, 51, 1);
			String cityCenteredvalue = page.citysendedvaluemethod(citycharecter);
			if (cityCenteredvalue.equals(citycharecter)) {
				test.pass("TC:24 CHARACTER VALUE IS ENTERED IN CITY TEXTBOX");
			} else {
				test.fail("TC:24 CHARACTER VALUE NOT ABLE TO ENTERED IN CITY TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "CHARACTER VALUE NOT ABLE TO ENTERED IN CITY TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// MORE THAN 30 CHARACTERS ONLY
		try {
			String citymorethan30 = Excelreader.getData(0, 52, 1);
			String citymore30 = page.citysendedvaluemethod(citymorethan30);
			if (!citymore30.equals(citymorethan30)) {
				test.pass("TC:24 MORE THAN 30 CHARACTER VALUE NOT ABLE TO ENTERED IN CITY TEXTBOX");
			} else {
				test.fail("TC:24 MORE THAN 30 CHARACTER VALUE IS ENTERED IN CITY TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "MORE THAN 30 CHARACTER VALUE IS ENTERED IN CITY TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// click on submit and catch error message of city
		try {
			String cityerrormessagehead = page.cityerrormessagemethod();
			String cityerrormessageexcel = Excelreader.getData(0, 53, 1);
			if (cityerrormessagehead.equals(cityerrormessageexcel)) {
				test.pass("CITY FUNCTION ERROR MESSAGE IS DISPLAYED");
				test.pass("'ERROR MESSAGE DISPLAYED' -->" + "'" + cityerrormessagehead + "'");
			} else {
				test.fail(" CITY FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "CITY FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 12)
	public void State() {
		test = extent.createTest("State");
		Core_General_Inquiry_Page page = new Core_General_Inquiry_Page(driver);

		// label of State
		try {
			String statelabelhead = page.statelabelmethod();
			String staelabelexcel = Excelreader.getData(0, 54, 1);
			if (statelabelhead.equals(staelabelexcel)) {
				test.pass("TC:25 THE LABEL 'STATE' IS DISPLAYED ");
			} else {
				test.fail("TC:25 THE LABEL 'STATE' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE LABEL 'STATE' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		
		// AFTER CLICK ON STATE AND LABEL IS ROLLED UP OR NOT
		try {
			String statelabelhead = page.statelabelmethod1();
			String staelabelexcel = Excelreader.getData(0, 54, 1);
			if (statelabelhead.equals(staelabelexcel)) {
				test.pass("TC:25 THE LABEL 'STATE' IS ROLLED UP AFTER CLICK ON STATE FUNCTION ");
			} else {
				test.fail("TC:25 THE LABEL 'STATE' IS ROLLED UP AFTER CLICK ON STATE FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE LABEL 'STATE' IS ROLLED UP AFTER CLICK ON STATE FUNCTION");
			}
			
			// STATE DROP DOWN IS CLICKABLE OR NOT
			String statedropdownvaluehead = page.statedropdownvaluemethod();
			String statedropdownvalueexcel = Excelreader.getData(0, 54, 2);
			if (statedropdownvaluehead.equals(statedropdownvalueexcel)) {
				test.pass("TC:25 STEATE DROP DOWN  IS WORKING");
			} else {
				test.fail("TC:25 STEATE DROP DOWN  IS WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "STATE DROP DOWN VALUE IS NOT WORKING");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		
		// click on submit and catch error message of stateF
		try {
			String stateerrormessahead = page.stateerrormessagemethod();
			String stateerrormessexcel = Excelreader.getData(0, 55, 1);
			if (stateerrormessahead.equals(stateerrormessexcel)) {
				test.pass("'ERROR MESSAGE DISPLAYED' -->" + "'" + stateerrormessahead + "'");
			} else {
				test.fail(" STATE FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "STATE FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}
	
	
	

	@Test(priority = 13)
	public void Zip() {
		test = extent.createTest("Zip");
		Core_General_Inquiry_Page page = new Core_General_Inquiry_Page(driver);
		// label of Zip
		try {
			String ziplabelhead = page.ziplabelmethod();
			String ziplabelexcel = Excelreader.getData(0, 56, 1);
			if (ziplabelhead.equals(ziplabelexcel)) {
				test.pass("TC:26 THE LABEL 'ZIP' IS DISPLAYED ");
			} else {
				test.fail("TC:26 THE LABEL 'ZIP' IS DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE LABEL 'ZIP' IS DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK ON zip AND LABEL IS ROLLED UP OR NOT
		try {
			String ziplabelhead = page.ziplabelmethod1();
			String ziplabelexcel = Excelreader.getData(0, 56, 1);
			if (ziplabelhead.equals(ziplabelexcel)) {
				test.pass("TC:26 THE LABEL 'ZIP' IS ROLLED UP AFTER CLICK ON ZIP FUNCTION");
			} else {
				test.fail("TC:26 THE LABEL 'ZIP' IS NOT ROLLED UP AFTER CLICK ON ZIP FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE LABEL 'ZIP' IS NOT DISPLAYED AFTER CLICK ON ZIP FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// enter numerical of zip function
		try {
			String zipnumerical = Excelreader.getData(0, 57, 1);
			String zipnenterdvalue = page.zipsendedvaluemethod(zipnumerical);
			if (zipnenterdvalue.equals(zipnumerical)) {
				test.pass("TC:26  USER SHOULD BE SEND 5 NUMBERS ONLY ON ZIP FUNCTION");
			} else {
				test.fail("TC:26  USER SHOULD BE SEND 5 NUMBERS ONLY ON ZIP FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "USER SHOULD BE SEND 5 NUMBERS ONLY ON ZIP FUNCTION");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// SPECIAL CHARACTERS
		try {
			String zipspecialcharacters = Excelreader.getData(0, 58, 1);
			// driver.findElement(By.xpath("//*[@id='zip']")).clear();
			String zipscenterdvalue = page.zipsendedvaluemethod(zipspecialcharacters);
			if (!zipscenterdvalue.equals(zipspecialcharacters)) {
				test.pass("TC:26  USER SHOULD NOT ENTER SPECIAL CHARACTERS ON ZIP FUNCTION");
			} else {
				test.fail("TC:26 USER SHOULD NOT ENTER SPECIAL CHARACTERS ON ZIP FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "USER SHOULD NOT ENTER SPECIAL CHARACTERS ON ZIP FUNCTION");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// CHARACTER
		try {
			String zipcharacter = Excelreader.getData(0, 59, 1);
			String zipchenterdvalue = page.zipsendedvaluemethod(zipcharacter);
			if (!zipchenterdvalue.equals(zipcharacter)) {
				test.pass("TC:26 USER SHOULD NOT ENTER CHARACTERS ON ZIP FUNTION");
			} else {
				test.fail("TC:26 USER SHOULD NOT ENTER CHARACTERS ON ZIP FUNTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "USER SHOULD NOT ENTER CHARACTERS ON ZIP FUNTION");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// MORE THAN 5 NUMARICAL

		try {
			String zipmorethan5numbr = Excelreader.getData(0, 60, 1);
			String zipmorethan5 = page.zipsendedvaluemethod(zipmorethan5numbr);
			if (!zipmorethan5.equals(zipmorethan5numbr)) {
				test.pass("TC:26  USER SHOULD NOT SEND MORE THAN 5 NUMARICAL ON ZIP FUNCTION");
			} else {
				test.fail("TC:26  USER SHOULD NOT SEND MORE THAN 5 NUMARICAL ON ZIP FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "USER SHOULD NOT SEND MORE THAN 5 NUMARICAL ON ZIP FUNCTION");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// less THAN 5 NUMARICAL

		try {
			String ziplessthan5numbr = Excelreader.getData(0, 57, 2);
			String ziplessthan5 = page.zipsendedvaluemethod(ziplessthan5numbr);
			if (ziplessthan5.equals(ziplessthan5numbr)) {
				test.pass("TC:26  USER SHOULD BE SEND LESS THAN 5 NUMARICAL ON ZIP FUNCTION");
				String ziperrormessagehead = page.ziperrormessagemethod1();
				String ziperrormessageexcel = Excelreader.getData(0, 61, 1);
				if (ziperrormessagehead.equals(ziperrormessageexcel)) {
					test.pass("LESS THAN 5 NUMARICAL ON ZIP 'ERROR MESSAGE DISPLAYED' -->" + "'" + ziperrormessagehead
							+ "'");
				} else {
					test.fail(" LESS THAN 5 NUMARICAL ON ZIP ERROR MESSAGE IS NOT DIPLAYED ");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
							+ "LESS THAN 5 NUMARICAL ON ZIP ERROR MESSAGE IS NOT DIPLAYED ");
				}
			} else {
				test.fail("TC:26    USER SHOULD BE SEND LESS THAN 5 NUMARICAL ON ZIP FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ " USER SHOULD BE SEND LESS THAN 5 NUMARICAL ON ZIP FUNCTION");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// click on submit and catch error message of zip
		try {
			String ziperrormessagehead = page.ziperrormessagemethod();
			String ziperrormessageexcel = Excelreader.getData(0, 61, 1);
			if (ziperrormessagehead.equals(ziperrormessageexcel)) {
				test.pass("'ERROR MESSAGE DISPLAYED' -->" + "'" + ziperrormessagehead + "'");
			} else {
				test.fail(" ZIP FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "ZIP FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 14)
	public void Email() {
		test = extent.createTest("Email");
		Core_General_Inquiry_Page page = new Core_General_Inquiry_Page(driver);
		// label of mail
		try {
			String emaillabelhead = page.emaillabelmethod();
			String emaillabelexcel = Excelreader.getData(0, 62, 1);
			if (emaillabelhead.equals(emaillabelexcel)) {
				test.pass("TC:27 THE LABEL 'EMAIL' IS DISPLAYED ");
			} else {
				test.fail("TC:27 THE LABEL 'EMAIL' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE LABEL 'EMAIL' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK ON mail AND LABEL IS ROLLED UP OR NOT
		try {
			String emaillabelhead = page.emaillabelmethod1();
			String emaillabelexcel = Excelreader.getData(0, 62, 1);
			if (emaillabelhead.equals(emaillabelexcel)) {
				test.pass("TC:27 THE LABEL 'EMAIL' IS ROLLED UP AFTER CLICK ON EMAIL FUNCTION");
			} else {
				test.fail("TC:27 THE LABEL 'EMAIL' IS NOT ROLLED UP AFTER CLICK ON EMAIL FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE LABEL 'EMAIL' IS NOT DISPLAYED AFTER CLICK ON EMAIL FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// WITH OUT .COM FORMAT
		try {
			String emailsendid = Excelreader.getData(0, 62, 2);
			String emailvlue = page.mailsendmethod(emailsendid);
			if (emailvlue.equals(emailsendid)) {
				test.pass("TC:27  USER ABEL TO SEND MAIL WITH OUR FORMAT(.COM) IN MAIL TEXTBOX");
				String mailerrormessagehead = page.emailerrormessagemethod();
				String mailerrormessageexcel = Excelreader.getData(0, 64, 1);
				if (mailerrormessagehead.equals(mailerrormessageexcel)) {
					test.pass("TC:27 WITH OUR FORMAT(.COM) 'ERROR MESSAGE DISPLAYED' -->" + "'" + mailerrormessagehead
							+ "'");
				} else {
					test.fail("TC:27  WITH OUR FORMAT(.COM) MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
							+ "WITH OUR FORMAT(.COM) MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				}
			} else {
				test.fail("TC:27 USER ABEL TO SEND MAIL WITH OUR FORMAT(.COM) IN MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "USER ABEL TO SEND MAIL WITH OUR FORMAT(.COM) IN MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// WITH OUT @GAMIL

		try {
			String emailsendid = Excelreader.getData(0, 63, 2);
			String emailvlue = page.mailsendmethod(emailsendid);
			if (emailvlue.equals(emailsendid)) {
				test.pass("TC:27  USER ABEL TO SEND  WITH OUR FORMAT(@GAMIL) IN MAIL TEXTBOX");
				String mailerrormessagehead = page.emailerrormessagemethod();
				String mailerrormessageexcel = Excelreader.getData(0, 64, 1);
				if (mailerrormessagehead.equals(mailerrormessageexcel)) {
					test.pass("TC:27 WITH OUR FORMAT(@GAMIL) 'ERROR MESSAGE DISPLAYED' -->" + "'" + mailerrormessagehead
							+ "'");
				} else {
					test.fail("TC:27  WITH OUR FORMAT(@GAMIL) MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
							+ "WITH OUR FORMAT(@GAMIL) MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				}
			} else {
				test.fail("TC:27 USER ABEL TO SEND MAIL WITH OUR FORMAT(@GAMIL) IN MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "USER ABEL TO SEND MAIL WITH OUR FORMAT(@GAMIL) IN MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// enter mail format on email
		try {
			String emailsendid = Excelreader.getData(0, 63, 1);
			String emailvlue = page.mailsendmethod(emailsendid);
			if (emailvlue.equals(emailsendid)) {
				test.pass("TC:27 USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
				String mailerrormessagehead = page.emailerrormessagemethod();
				String mailerrormessageexcel = Excelreader.getData(0, 64, 1);
				if (!mailerrormessagehead.equals(mailerrormessageexcel)) {
					test.pass("TC:27 WITH FORMAT 'ERROR MESSAGE IS NOT DISPLAYED'");
				} else {
					test.fail("TC:27  WITH FORMAT MAIL FUNCTION ERROR MESSAGE  DISPLAYED--->" + "'"
							+ mailerrormessagehead + "'");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
							+ "WITH FORMAT MAIL FUNCTION ERROR MESSAGE  DISPLAYED");
				}
			} else {
				test.fail("TC:27 USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// click on submit and catch error message of mail
		try {
			String mailerrormessagehead = page.emailerrormessagemethod1();
			String mailerrormessageexcel = Excelreader.getData(0, 64, 1);
			if (mailerrormessagehead.equals(mailerrormessageexcel)) {
				test.pass("'ERROR MESSAGE DISPLAYED' -->" + "'" + mailerrormessagehead + "'");
			} else {
				test.fail(" MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 15)
	public void Confirm_Email() {
		test = extent.createTest("Confirm_Email");
		Core_General_Inquiry_Page page = new Core_General_Inquiry_Page(driver);
		// label of confirm_email
		try {
			String conmaillabelhead = page.confirmmaillabelmethod();
			String conmaillabelexcel = Excelreader.getData(0, 65, 1);
			if (conmaillabelhead.equals(conmaillabelexcel)) {
				test.pass("TC:28 THE LABEL 'CONFIRM EMAIL' IS DISPLAYED ");
			} else {
				test.fail("TC:28 THE LABEL 'CONFIRM EMAIL' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE LABEL 'CONFIRM EMAIL' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK ON confirm_email AND LABEL IS ROLLED UP OR NOT
		try {
			String conmaillabelhead = page.confirmmaillabelmethod1();
			String conmaillabelexcel = Excelreader.getData(0, 65, 1);
			if (conmaillabelhead.equals(conmaillabelexcel)) {
				test.pass("TC:28 THE LABEL 'CONFIRM EMAIL' IS DISPLAYED AFTER CLICK ON CONFIRM EMAIL FUNCTION");
			} else {
				test.fail("TC:28 THE LABEL 'CONFIRM EMAIL' IS NOT DISPLAYED AFTER CLICK ON CONFIRM EMAIL FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE LABEL 'CONFIRM EMAIL' IS NOT DISPLAYED AFTER CLICK ON CONFIRM EMAIL FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// enter mail FORMAT on confirm mail
		try {
			String confirmmailsend = Excelreader.getData(0, 66, 1);
			String conmailsendvalue = page.confirmmailsendidmethod(confirmmailsend);
			if (conmailsendvalue.equals(confirmmailsend)) {
				test.pass("TC:28  MAIL ID IS SEND IN CONFIRM MAIL TEXTBOX");
			} else {
				test.fail("TC:28 MAIL ID IS NOT SEND IN CONFIRM MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "MAIL ID IS NOT SEND IN CONFIRM MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send DIFFERENT IDS IN mail AND CONFIRM function
		try {
			String emailsendid = Excelreader.getData(0, 63, 1);
			page.mailsendmethod1(emailsendid);
			String confirmmailsend = Excelreader.getData(0, 66, 2);
			String conmailsendvalue = page.confirmmailsendidmethod(confirmmailsend);
			if (conmailsendvalue.equals(confirmmailsend)) {
				test.pass("TC:28  USER SHOULD SEND MAIL IN CONFIRM MAIL TEXTBOX");
				String confirmmailerrormesshead = page.confirmmailerrormessmethod1();
				String confirmmailerrormessexcel = Excelreader.getData(0, 67, 1);
				if (confirmmailerrormesshead.equals(confirmmailerrormessexcel)) {
					test.pass(
							"TC:28 USER SHOULD BE SEND SAME IDS IN MAIL AND CONFIRM MAIL 'ERROR MESSAGE DISPLAYED' -->"
									+ "'" + confirmmailerrormesshead + "'");
				} else {
					test.fail("TC:28 USER SHOULD BE SEND SAME IDS IN MAIL AND CONFIRM MAIL");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
							+ "USER SHOULD BE SEND SAME IDS IN MAIL AND CONFIRM MAIL");
				}

			} else {
				test.fail("TC:28 USER SHOULD SEND MAIL IN CONFIRM MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "USER SHOULD SEND MAIL IN CONFIRM MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// click on submit and catch error message of confirm mail
		try {
			String confirmmailerrormesshead = page.confirmmailerrormessmethod();
			String confirmmailerrormessexcel = Excelreader.getData(0, 67, 1);
			if (confirmmailerrormesshead.equals(confirmmailerrormessexcel)) {
				test.pass("CONFIRM MAIL FUNCTION ERROR MESSAGE IS DISPLAYED ");
				test.pass("'ERROR MESSAGE DISPLAYED' -->" + "'" + confirmmailerrormesshead + "'");
			} else {
				test.fail("CONFIRM MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "CONFIRM MAIL FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 16)
	public void phone_number() {
		test = extent.createTest("phone_number");
		Core_General_Inquiry_Page page = new Core_General_Inquiry_Page(driver);
		// label of phone number
		try {
			String phonenumberlabelhead = page.phonenumberlabelmethod();
			String phonenumberlabelexcel = Excelreader.getData(0, 68, 1);
			if (phonenumberlabelhead.equals(phonenumberlabelexcel)) {
				test.pass("TC:29 THE LABEL 'PHONE NUMBER' IS DISPLAYED ");
			} else {
				test.fail("TC:29 THE LABEL 'PHONE NUMBER' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE LABEL 'PHONE NUMBER' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// AFTER CLICK ON phone number AND LABEL IS ROLLED UP OR NOT
		try {
			String phonenumberlabelhead = page.phonenumberlabelmethod1();
			String phonenumberlabelexcel = Excelreader.getData(0, 68, 1);
			if (phonenumberlabelhead.equals(phonenumberlabelexcel)) {
				test.pass("TC:29 THE LABEL 'PHONE NUMBER' IS ROLLED UP AFTER CLICK ON PHONE NUMBER FUNCTION");
			} else {
				test.fail("TC:29 THE LABEL 'PHONE NUMBER' IS NOT ROLLED UP AFTER CLICK ON PHONE NUMBER FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE LABEL 'PHONE NUMBER' IS NOT ROLLED UP AFTER CLICK ON PHONE NUMBER FUNCTION");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// send numerical in phone number function
		try {
			String phonenumaricalhead = Excelreader.getData(0, 69, 1);
			String phonenumenteredval = page.phonenumbersendedvaluemethod(phonenumaricalhead);
			if (phonenumenteredval.equals(phonenumaricalhead)) {
				test.pass("TC:29 USER SHOUND BE SEND NUMERICAL VALUE IN PHONE NUMBER TEXTBOX");
			} else {
				test.fail("TC:29 USER SHOUND BE SEND NUMERICAL VALUE IN PHONE NUMBER TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "NUMERICAL VALUE IS NOT ENTERED IN PHONE NUMBER TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// special characters
		try {
			String phonespecialcharachead = Excelreader.getData(0, 70, 1);
			String phonenumSCenteredval = page.phonenumbersendedvaluemethod(phonespecialcharachead);
			if (!phonenumSCenteredval.equals(phonespecialcharachead)) {
				test.pass("TC:29 SPECIAL CHARACTER VALUE NOT ABLE TO ENTERED IN PHONE NUMBER TEXTBOX");
			} else {
				test.fail("TC:29 SPECIAL CHARACTER VALUE IS ENTERED IN PHONE NUMBER TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "SPECIAL CHARACTER VALUE IS ENTERED IN PHONE NUMBER TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// characters
		try {
			String phonecharacterhead = Excelreader.getData(0, 71, 1);
			String phonenumCenteredval = page.phonenumbersendedvaluemethod(phonecharacterhead);
			if (!phonenumCenteredval.equals(phonecharacterhead)) {
				test.pass("TC:29 CHARACTER VALUE NOT ABLE TO ENTERED IN PHONE NUMBER TEXTBOX");
			} else {
				test.fail("TC:29 CHARACTER VALUE IS ENTERED IN PHONE NUMBER TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "CHARACTER VALUE IS ENTERED IN PHONE NUMBER TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// more than 10 number
		try {
			String phonenumaricalhead = Excelreader.getData(0, 72, 1);
			String phonenumenteredval = page.phonenumbersendedvaluemethod(phonenumaricalhead);
			if (!phonenumenteredval.equals(phonenumaricalhead)) {
				test.pass("TC:29 MORE THAN 10 NUMBER IS NOT ABLE TO ENTERED IN PHONE NUMBER TEXTBOX");
			} else {
				test.fail("TC:29 MORE THAN 10 NUMBER IS ENTERED IN PHONE NUMBER TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "MORE THAN 10 NUMBER IS ENTERED IN PHONE NUMBER TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// less than 10 number
		try {
			String phonenumaricalhead = Excelreader.getData(0, 73, 2);
			String phonenumenteredval = page.phonenumbersendedvaluemethod(phonenumaricalhead);
			if (phonenumenteredval.equals(phonenumaricalhead)) {
				test.pass("TC:29 MORE THAN 10 NUMBER IS NOT ABLE TO ENTERED IN PHONE NUMBER TEXTBOX");
				String phonenumbererrormessagehead = page.phonenumbererrormessagemethod();
				String phonenumbererrormessageexcel = Excelreader.getData(0, 73, 1);
				if (phonenumbererrormessagehead.equals(phonenumbererrormessageexcel)) {
					test.pass("PHONE NUMBER FUNCTION ERROR MESSAGE IS DISPLAYED ");
					test.pass("'ERROR MESSAGE DISPLAYED' -->" + "'" + phonenumbererrormessagehead + "'");
				} else {
					test.fail("PHONE NUMBER FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
							+ "PHONE NUMBER FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
				}
			} else {
				test.fail("TC:29 MORE THAN 10 NUMBER IS ENTERED IN PHONE NUMBER TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "MORE THAN 10 NUMBER IS ENTERED IN PHONE NUMBER TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// click on submit and catch error message of confirm mail
		try {
			String phonenumbererrormessagehead = page.phonenumbererrormessagemethod1();
			String phonenumbererrormessageexcel = Excelreader.getData(0, 73, 1);
			if (phonenumbererrormessagehead.equals(phonenumbererrormessageexcel)) {
				test.pass("PHONE NUMBER FUNCTION ERROR MESSAGE IS DISPLAYED ");
				test.pass("'ERROR MESSAGE DISPLAYED' -->" + "'" + phonenumbererrormessagehead + "'");
			} else {
				test.fail("PHONE NUMBER FUNCTION ERROR MESSAGE IS NOT DISPLAYED ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "PHONE NUMBER FUNCTION ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 17)
	public void By_Selecting_Submit() {
		test = extent.createTest("By_Selecting_Submit");
		Core_General_Inquiry_Page page = new Core_General_Inquiry_Page(driver);
		
		test = extent.createTest("Open_URL");
		try {
			driver.get(Basepage.readProperty("urlG"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 2);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");
			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "URL IS NOT OPENED");
				extent.flush();
				driver.close();
				throw new SkipException("Skipping - ");
			}
		} 
		catch (Exception e) {
			test.fail("Error:" + e.getMessage());
			extent.flush();
			driver.close();
			throw new SkipException("Skipping - ");

		}
/*catch (Exception e) {
			test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
					+ "LABEL OF GENERAL ENQUIRE IS NOT DISPLAYED");
			extent.flush();
			driver.close();
			throw new SkipException("Skipping - ");
		}*/
		// BY SELECTING SUBMIT... LABEL
		try {
			String byselectsubmithead = page.byselectingsubmitmethod();
			String buselectsubmitexcel = Excelreader.getData(0, 74, 1);
			if (byselectsubmithead.equals(buselectsubmitexcel)) {
				test.pass("TC:31 VERIF LABEL 'MY SELECTING SUBMIT....' IS DISPLAYED");
			} else {
				test.fail("TC:31 VERIF LABEL 'MY SELECTING SUBMIT....' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "VERIF LABEL 'MY SELECTING SUBMIT....' IS NOT DISPLAYED");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// WE MAY CONTACT LABEL
		try {
			String wemaycontacthead = page.wemaycontactlabelmethod();
			String wemaycontactexcel = Excelreader.getData(0, 75, 1);
			if (wemaycontacthead.equals(wemaycontactexcel)) {
				test.pass("TC:32 VERIFY LABEL 'WE MAY CONTACT ...' IS DISPLAYED");
			} else {
				test.fail("TC:32 VERIFY LABEL 'WE MAY CONTACT....' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "VERIFY LABEL 'WE MAY CONTACT....' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// 18 global error message
		try {
			String totalerrohead = page.totalerromessagemethod();
			String totalerroexcel = Excelreader.getData(0, 79, 1);
			if (totalerrohead.equals(totalerroexcel)) {
				test.pass("'18 GLOBAL ERROR MESSAGE DISPLAYED' -->" + "'" + totalerrohead + "'");
			} else {
				test.fail("TC: 18 GLOBAL ERROR MESSAGE IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "18 GLOBAL ERROR MESSAGE IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		
		
		// privacypolicy continue button
		try {
			String gettitle = page.privacypolicyclickmethod();
			String gettitleexcel = Excelreader.getData(0, 78, 1);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC: PRIVACY POLICY LINK IS WORKING FINE");
			} else {
				test.fail("TC: PRIVACY POLICY LINK IS NOT WORKING FINE");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "PRIVACY POLICY LINK IS WORKING FINE");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 18)
	public void Positive_scenario() throws Exception {
		test = extent.createTest("Positive_scenario");
		Core_General_Inquiry_Page page = new Core_General_Inquiry_Page(driver);
		try {
			driver.get(Basepage.readProperty("urlG"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 2);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");
			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "URL IS NOT OPENED");
				extent.flush();
				driver.close();
				throw new SkipException("Skipping - ");
			}
		} catch (Exception e) {
			test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
					+ "LABEL OF GENERAL ENQUIRE IS NOT DISPLAYED");
			extent.flush();
			driver.close();
			throw new SkipException("Skipping - ");
		}
		// CLICK ON 'PLEASE SELECT ANY ONE OPTION'
		try {
			String selectoptionhead = page.selecoptionclickmethod();
			String selectoptionexcel = Excelreader.getData(0, 17, 2);
			if (selectoptionhead.equals(selectoptionexcel)) {
				test.pass("TC:16.1 THE TEXT 'PLEASE SELECT ANY ONE OPTION' DROP DOWN IS WORKING");
				
			} else {
				test.fail("TC:16.1 THE TEXT 'PLEASE SELECT ANY ONE OPTION' DROP DOWN IS WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "THE TEXT 'PLEASE SELECT ANY ONE OPTION' DROP DOWN IS WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// enter numerical and characters on commets funtion
		try {
			String commetnumericalexcel = Excelreader.getData(0, 21, 1);
			String commscenteredvalue = page.commentspecialchaructermethod(commetnumericalexcel);
			if (commscenteredvalue.equals(commetnumericalexcel)) {
				test.pass("TC:18 USE ABLE TO SEND NUMERICAL IN COMMENT TEXT");
			} else {
				test.fail("TC:18 USE NOT ABLE TO SEND NUMARICAL IN COMMENT TEXT");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "USE NOT ABLE TO SEND NUMARICAL IN COMMENT TEXT");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// CHARACTER of first name
		try {
			String FNCHARACTER = Excelreader.getData(0, 29, 1);
			String valc = page.finameEnteredvalue(FNCHARACTER);
			if (valc.equals(FNCHARACTER)) {
				test.pass("TC:20  CHARACTERS VALUE IS ENTERED IN FIRSTNAME TEXTBOX");
			} else {
				test.fail("TC:20  CHARACTERS VALUE IS NOT ENTERED IN FIRSTNAME TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "CHARACTERS VALUE IS NOT ENTERED IN FIRSTNAME TEXTBOX");
			}
		} catch (Exception e) {

			test.fail("Error:" + e.getMessage());
		}

		// CHARACTER of last name
		try {
			String LNcharacter = Excelreader.getData(0, 35, 1);
			String LAcvalue = page.lastnameenterdvalue(LNcharacter);
			if (LAcvalue.equals(LNcharacter)) {
				test.pass("TC:21 CHARACTERS VALUE IS ENTERED IN LASTNAME TEXTBOX");
			} else {
				test.fail("TC:21 CHARACTERS VALUE IS NOT ENTERED IN LASTNAME TEXTBOX ");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "CHARACTERS VALUE IS NOT ENTERED IN LASTNAME TEXTBOX");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// characters of addresss
		try {
			String addresscharactershead = Excelreader.getData(0, 41, 1);
			String addCvalue = page.addresssendedvaluemethod(addresscharactershead);
			if (addCvalue.equals(addresscharactershead)) {
				test.pass("TC:22 CHARACTERS VALUE IS ENTERED IN ADDRESS TEXTBOX");
			} else {
				test.fail("TC:22 CHARACTERS VALUE IS NOT ENTERED IN ADDRESS TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "CHARACTERS VALUE IS NOT ENTERED IN ADDRESS TEXTBOX");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// characters and numerical of apisuite function
		try {
			String apisuitecharandnumari = Excelreader.getData(0, 46, 1);
			String suitesh = page.aptsuitsendedvaluemethod(apisuitecharandnumari);
			if (suitesh.equals(apisuitecharandnumari)) {
				test.pass("TC:23 CHARACTERS AND NUMERICAL ABLE TO ENTERED IN APT/SUITE TEXTBOX");
			} else {
				test.fail("TC:23 CHARACTERS AND NUMERICAL NOT ABLE TO ENTERED IN APT/SUITE TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "CHARACTERS AND NUMERICAL NOT ABLE TO ENTERED IN APT/SUITE TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// CHARACTERS city
		try {
			String citycharecter = Excelreader.getData(0, 51, 1);
			String cityCenteredvalue = page.citysendedvaluemethod(citycharecter);
			if (cityCenteredvalue.equals(citycharecter)) {
				test.pass("TC:24 CHARACTER VALUE IS ENTERED IN CITY TEXTBOX");
			} else {
				test.fail("TC:24 CHARACTER VALUE NOT ABLE TO ENTERED IN CITY TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "CHARACTER VALUE NOT ABLE TO ENTERED IN CITY TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// select drop down values of state function
		// AFTER CLICK ON STATE AND LABEL IS ROLLED UP OR NOT
		// STATE DROP DOWN IS CLICKABLE OR NOT
		try {
					String statedropdownvaluehead = page.statedropdownvaluemethod();
					String statedropdownvalueexcel = Excelreader.getData(0, 54, 2);
					if (statedropdownvaluehead.equals(statedropdownvalueexcel)) {
						test.pass("TC:25 STEATE DROP DOWN  IS WORKING");
					} else {
						test.fail("TC:25 STEATE DROP DOWN  IS WORKING");
						test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
								+ "STATE DROP DOWN VALUE IS NOT WORKING");
					}

				} catch (Exception e) {
					test.fail("Error:" + e.getMessage());
				}
		// enter numerical of zip function
		try {
			String zipnumerical = Excelreader.getData(0, 57, 1);
			String zipnenterdvalue = page.zipsendedvaluemethod(zipnumerical);
			if (zipnenterdvalue.equals(zipnumerical)) {
				test.pass("TC:26  USER SHOULD BE SEND 5 NUMBERS ONLY ON ZIP FUNCTION");
			} else {
				test.fail("TC:26  USER SHOULD BE SEND 5 NUMBERS ONLY ON ZIP FUNCTION");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "USER SHOULD BE SEND 5 NUMBERS ONLY ON ZIP FUNCTION");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// enter mail format on email
		try {
			String emailsendid = Excelreader.getData(0, 63, 1);
			String emailvlue = page.mailsendmethod(emailsendid);
			if (emailvlue.equals(emailsendid)) {
				test.pass("TC:27 USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
				String mailerrormessagehead = page.emailerrormessagemethod();
				String mailerrormessageexcel = Excelreader.getData(0, 64, 1);
				if (!mailerrormessagehead.equals(mailerrormessageexcel)) {
					test.pass("TC:27 WITH FORMAT 'ERROR MESSAGE IS NOT DISPLAYED'");
				} else {
					test.fail("TC:27  WITH FORMAT MAIL FUNCTION ERROR MESSAGE  DISPLAYED--->" + "'"
							+ mailerrormessagehead + "'");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
							+ "WITH FORMAT MAIL FUNCTION ERROR MESSAGE  DISPLAYED");
				}
			} else {
				test.fail("TC:27 USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "USER ABEL TO SEND MAIL FORMAT IN MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// enter mail FORMAT on confirm mail
		try {
			String confirmmailsend = Excelreader.getData(0, 66, 1);
			String conmailsendvalue = page.confirmmailsendidmethod(confirmmailsend);
			if (conmailsendvalue.equals(confirmmailsend)) {
				test.pass("TC:28  MAIL ID IS SEND IN CONFIRM MAIL TEXTBOX");
			} else {
				test.fail("TC:28 MAIL ID IS NOT SEND IN CONFIRM MAIL TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "MAIL ID IS NOT SEND IN CONFIRM MAIL TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// send numerical in phone number function
		try {
			String phonenumaricalhead = Excelreader.getData(0, 69, 1);
			String phonenumenteredval = page.phonenumbersendedvaluemethod(phonenumaricalhead);
			if (phonenumenteredval.equals(phonenumaricalhead)) {
				test.pass("TC:29 USER SHOUND BE SEND NUMERICAL VALUE IN PHONE NUMBER TEXTBOX");
			} else {
				test.fail("TC:29 USER SHOUND BE SEND NUMERICAL VALUE IN PHONE NUMBER TEXTBOX");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ "NUMERICAL VALUE IS NOT ENTERED IN PHONE NUMBER TEXTBOX");
			}

		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// click on submit
		try {
			String gettitle = page.generallgetpagetitlemethod1();
			String gettitleexcel = Excelreader.getData(0, 77, 1);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC: SUBMIT BUTTON IS WORKING FINE AND ENABEL");
				test.pass("TC: GENERAL ENQUIRE FORM IS SUBMITTED SUCCESSFULLY ");
			} else {
				test.fail("TC:  GENERAL ENQUIRE FORM IS NOT SUBMITTED SUCCESSFULLY");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Core_General_Inquiry"))
						+ " GENERAL ENQUIRE FORM IS NOT SUBMITTED SUCCESSFULLY");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}




}
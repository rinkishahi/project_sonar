package com.Mcd.qa.TestCases;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.McD.qa.Base.BaseTest;
import com.McD.qa.Extentreport.Extentreport;
import com.McD.qa.Pages.Basepage;
import com.McD.qa.Pages.Footer_Navigation_Page;
import com.McD.qa.Utility.TestUtil;

import bsh.commands.dir;

public class Footer_Navigation extends BaseTest {

	String excelpath=System.getProperty("user.dir");
    TestUtil Excelreader= new TestUtil(excelpath+ "/src/main/java/com/McD/qa/TestData/Footer_Navigation.xlsx");	
    
    @Test(priority = 1)
	public void Open_URL() throws IOException {
    	Footer_Navigation_Page page = new Footer_Navigation_Page(driver);
		test = extent.createTest("Open_URL");
		try {
			driver.get(Basepage.readProperty("urlG"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 2);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");
			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "URL IS NOT OPENED");
				extent.flush();
				driver.close();
				throw new SkipException("Skipping - ");
			}
		} catch (Exception e) {
			test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
					+ "LABEL OF FOOTER NAVIGATION IS NOT DISPLAYED");
			extent.flush();
			driver.close();
			throw new SkipException("Skipping - ");
		}
	}
    
    @Test(priority = 2)
	public void Footer_About_us() throws IOException {
		test = extent.createTest("Footer_About us");
		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);
		
		// label of About US
		try {
			String aboutuslabelhead = page.aboutuslabelmethod();
			String aboutuslabelexcel = Excelreader.getData(0, 3, 1);
			if (aboutuslabelhead.equals(aboutuslabelexcel)) {
				test.pass("TC2: THE LABEL 'ABOUT US' IS DISPLAYED ");
			} else {
				test.fail("TC2: THE LABEL 'ABOUT US' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "THE LABEL 'ABOUT US' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// About Us click
		try {
			String aboutusclickhead = page.aboutusclickmethod1();
			String aboutusclickexcel = Excelreader.getData(0, 4, 1);
			if (aboutusclickhead.equals(aboutusclickexcel)) {
				test.pass("TC3: THE LANDING PAGE OF 'ABOUT US' IS WORKING ");
			} else {
				test.fail("TC3:THE LANDING PAGE OF 'ABOUT US' IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "THE LANDING PAGE OF 'ABOUT US' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

   // Our History
    @Test(priority = 3)
	public void Footer_Our_History() throws IOException {
		test = extent.createTest("Footer_Our History");
		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);																							
		
		// label of Our History
		try {
			String ourhistorylabelhead = page.ourhistorylabelmethod();
			String ourhistorylabelexcel = Excelreader.getData(0, 5, 1);
			if (ourhistorylabelhead.equals(ourhistorylabelexcel)) {
				test.pass("TC4: THE LABEL 'OUR HISTORY' IS DISPLAYED ");
			} else {
				test.fail("TC4: THE LABEL 'OUR HISTORY' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "THE LABEL 'OUR HISTORY' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// Our History click
		try {
			String ourhistoryclickhead = page.ourhistoryclickmethod();
			String ourhistoryclickexcel = Excelreader.getData(0, 6, 1);
			if (ourhistoryclickhead.equals(ourhistoryclickexcel)) {
				test.pass("TC4: THE LANDING PAGE OF 'OUR HISTORY' IS WORKING ");
			} else {
				test.fail("TC4:THE LANDING PAGE OF 'OUR HISTORY' IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "THE LANDING PAGE OF 'OUR HISTORY' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}
    
    // Leadership Team
    @Test(priority = 4)
	public void Footer_Leadership_Team() throws IOException {
		test = extent.createTest("Footer_Leadership Team");
		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);																							
		
		// label of Leadership Team
		try {
			String leadershipteamlabelhead = page.leadershipteamlabelmethod();
			String leadershipteamlabelexcel = Excelreader.getData(0, 7, 1);
			if (leadershipteamlabelhead.equals(leadershipteamlabelexcel)) {
				test.pass("TC4: THE LABEL 'Leadership Team' IS DISPLAYED ");
			} else {
				test.fail("TC4: THE LABEL 'Leadership Team' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "THE LABEL 'Leadership Team' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// Leadership Team click
		try {
			String leadershipteamclickhead = page.leadershipteamclickmethod();
			String leadershipteamclickexcel = Excelreader.getData(0, 8, 1);
			if (leadershipteamclickhead.equals(leadershipteamclickexcel)) {
				test.pass("TC4: THE LANDING PAGE OF 'Leadership Team' IS WORKING ");
			} else {
				test.fail("TC4:THE LANDING PAGE OF 'Leadership Team' IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "THE LANDING PAGE OF 'Leadership Team' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}
    
    // Values In Action
    @Test(priority = 5)
	public void Footer_Values_In_Action() throws IOException {
		test = extent.createTest("Footer_Values In Action");
		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);																							
		
		// label of Values In Action
		try {
			String valuesinactionlabelhead = page.valuesinactionlabelmethod();
			String valuesinactionlabelexcel = Excelreader.getData(0, 9, 1);
			if (valuesinactionlabelhead.equals(valuesinactionlabelexcel)) {
				test.pass("TC4: THE LABEL 'Values In Action' IS DISPLAYED ");
			} else {
				test.fail("TC4: THE LABEL 'Values In Action' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "THE LABEL 'Values In Action' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// Values In Action click
		try {
			String valuesinactionclickhead = page.valuesinactionclickmethod();
			String valuesinactionclickexcel = Excelreader.getData(0, 10, 1);
			if (valuesinactionclickhead.equals(valuesinactionclickexcel)) {
				test.pass("TC4: THE LANDING PAGE OF 'Values In Action' IS WORKING ");
			} else {
				test.fail("TC4:THE LANDING PAGE OF 'Values In Action' IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "THE LANDING PAGE OF 'Values In Action' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}
    
    // Investor Relations
    @Test(priority = 6)
	public void Footer_Investor_Relations() throws IOException {
		test = extent.createTest("Footer_Investor Relations");
		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);																							
		
		// label ofInvestor Relations 
		try {
			String investorrelationslabelhead = page.investorrelationslabelmethod();
			String investorrelationslabelexcel = Excelreader.getData(0, 11, 1);
			if (investorrelationslabelhead.equals(investorrelationslabelexcel)) {
				test.pass("TC4: THE LABEL 'Investor Relations' IS DISPLAYED ");
			} else {
				test.fail("TC4: THE LABEL 'Investor Relations' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "THE LABEL 'Investor Relations' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// Investor Relations click
		try {
			String investorrelationsclickhead = page.investorrelationsclickmethod();
			String investorrelationsclickexcel = Excelreader.getData(0, 12, 1);
			if (investorrelationsclickhead.equals(investorrelationsclickexcel)) {
				test.pass("TC4: THE LANDING PAGE OF 'Investor Relations' IS WORKING ");
			} else {
				test.fail("TC4:THE LANDING PAGE OF 'Investor Relations' IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "THE LANDING PAGE OF 'Investor Relations' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}
    
    // News & Notifications
    @Test(priority = 7)
	public void Footer_News_Notifications() throws IOException {
		test = extent.createTest("Footer_News & Notifications");
		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);																							
		
		// label of newsandnotifications
		try {
			String newsandnotificationslabelhead = page.newsandnotificationslabelmethod();
			String newsandnotificationslabelexcel = Excelreader.getData(0, 13, 1);
			if (newsandnotificationslabelhead.equals(newsandnotificationslabelexcel)) {
				test.pass("TC4: THE LABEL 'News & Notifications' IS DISPLAYED ");
			} else {
				test.fail("TC4: THE LABEL 'News & Notifications' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "THE LABEL 'News & Notifications' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// newsandnotifications click
		try {
			String newsandnotificationsclickhead = page.newsandnotificationsclickmethod();
			String newsandnotificationsclickexcel = Excelreader.getData(0, 14, 1);
			if (newsandnotificationsclickhead.equals(newsandnotificationsclickexcel)) {
				test.pass("TC4: THE LANDING PAGE OF 'News & Notifications' IS WORKING ");
			} else {
				test.fail("TC4:THE LANDING PAGE OF 'News & Notifications' IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "THE LANDING PAGE OF 'News & Notifications' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}
    
    // Franchise Info
    @Test(priority = 8)
	public void Footer_Franchise_Info() throws IOException {
		test = extent.createTest("Footer_Franchise Info");
		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);																							
		
		// label of Franchise Info
		try {
			String franchiseinfolabelhead = page.franchiseinfolabelmethod();
			String franchiseinfolabelexcel = Excelreader.getData(0, 15, 1);
			if (franchiseinfolabelhead.equals(franchiseinfolabelexcel)) {
				test.pass("TC4: THE LABEL 'Franchise Info' IS DISPLAYED ");
			} else {
				test.fail("TC4: THE LABEL 'Franchise Info' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "THE LABEL 'Franchise Info' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// Franchise Info click
		try {
			String franchiseinfoclickhead = page.franchiseinfoclickmethod();
			String franchiseinfoclickexcel = Excelreader.getData(0, 16, 1);
			if (franchiseinfoclickhead.equals(franchiseinfoclickexcel)) {
				test.pass("TC4: THE LANDING PAGE OF 'Franchise Info' IS WORKING ");
			} else {
				test.fail("TC4:THE LANDING PAGE OF 'Franchise Info' IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "THE LANDING PAGE OF 'Franchise Info' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}
    
    // Real Estate
    @Test(priority = 9)
	public void Footer_Real_Estate() throws IOException {
		test = extent.createTest("Footer_Real Estate");
		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);																							
		
		// label of Real Estate
		try {
			String realestatelabelhead = page.realestatelabelmethod();
			String realestatelabelexcel = Excelreader.getData(0, 17, 1);
			if (realestatelabelhead.equals(realestatelabelexcel)) {
				test.pass("TC4: THE LABEL 'Real Estate' IS DISPLAYED ");
			} else {
				test.fail("TC4: THE LABEL 'Real Estate' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "THE LABEL 'Real Estate' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// click Real Estate
		try {
			String realestateclickhead = page.realestateclickmethod();
			String realestateclickexcel = Excelreader.getData(0, 18, 1);
			if (realestateclickhead.equals(realestateclickexcel)) {
				test.pass("TC4: THE LANDING PAGE OF 'Real Estate' IS WORKING ");
			} else {
				test.fail("TC4:THE LANDING PAGE OF 'Real Estate' IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "THE LANDING PAGE OF 'Real Estate' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}
    
    // Recalls & Alerts
    @Test(priority = 10)
	public void Footer_Recalls_Alerts() throws IOException {
		test = extent.createTest("Footer_Recalls & Alerts");
		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);																							
		
		// label of Recalls & Alerts
		try {
			String recallsalertlabelhead = page.recallsalertlabelmethod();
			String recallsalertlabelexcel = Excelreader.getData(0, 19, 1);
			if (recallsalertlabelhead.equals(recallsalertlabelexcel)) {
				test.pass("TC4: THE LABEL 'Recalls & Alerts' IS DISPLAYED ");
			} else {
				test.fail("TC4: THE LABEL 'Recalls & Alerts' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "THE LABEL 'Recalls & Alerts' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		//Recalls & Alerts click
		try {
			String recallsalertclickhead = page.recallsalertclickmethod();
			String recallsalertclickexcel = Excelreader.getData(0, 20, 1);
			if (recallsalertclickhead.equals(recallsalertclickexcel)) {
				test.pass("TC4: THE LANDING PAGE OF 'Recalls & Alerts' IS WORKING ");
			} else {
				test.fail("TC4:THE LANDING PAGE OF 'Recalls & Alerts' IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "THE LANDING PAGE OF 'Recalls & Alerts' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}
    
    // Digital Accessibility
    @Test(priority = 11)
	public void Footer_Digital_Accessibility() throws IOException {
		test = extent.createTest("Footer_Digital Accessibility");
		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);																							
		
		// label of Digital Accessibility
		try {
			String digitalaccessibilitylabelhead = page.digitalaccessibilitylabelmethod();
			String digitalaccessibilitylabelexcel = Excelreader.getData(0, 21, 1);
			if (digitalaccessibilitylabelhead.equals(digitalaccessibilitylabelexcel)) {
				test.pass("TC4: THE LABEL 'Digital Accessibility' IS DISPLAYED ");
			} else {
				test.fail("TC4: THE LABEL 'Digital Accessibility' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "THE LABEL 'Digital Accessibility' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// Digital Accessibility click
		try {
			String digitalaccessibilityclickhead = page.digitalaccessibilityclickmethod();
			String digitalaccessibilityclickexcel = Excelreader.getData(0, 22, 1);
			if (digitalaccessibilityclickhead.equals(digitalaccessibilityclickexcel)) {
				test.pass("TC4: THE LANDING PAGE OF 'Digital Accessibility' IS WORKING ");
			} else {
				test.fail("TC4:THE LANDING PAGE OF 'Digital Accessibility' IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "THE LANDING PAGE OF 'Digital Accessibility' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}
    
 //Standards of Business Conduct
    @Test(priority = 12)
	public void Footer_Standards_of_Business_Conduct() throws IOException {
		test = extent.createTest("Footer_Standards of Business Conduct");
		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);																							
		
		// label of Standards of Business Conduct
		try {
			String standardsofbussinesslabelhead = page.standardsofbussinesslabelmethod();
			String standardsofbussinesslabelexcel = Excelreader.getData(0, 23, 1);
			if (standardsofbussinesslabelhead.equals(standardsofbussinesslabelexcel)) {
				test.pass("TC4: THE LABEL 'Standards of Business Conduct' IS DISPLAYED ");
			} else {
				test.fail("TC4: THE LABEL 'Standards of Business Conduct' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "THE LABEL 'Standards of Business Conduct' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// Standards of Business Conduct click
		try {
			String standardsofbussinessclickhead = page.standardsofbussinessclickmethod();
			String standardsofbussinessclickexcel = Excelreader.getData(0, 24, 1);
			if (standardsofbussinessclickhead.equals(standardsofbussinessclickexcel)) {
				test.pass("TC4: THE LANDING PAGE OF 'Standards of Business Conduct' IS WORKING ");
			} else {
				test.fail("TC4:THE LANDING PAGE OF 'Standards of Business Conduct' IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "THE LANDING PAGE OF 'Standards of Business Conduct' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}
    
    
    
	@Test(priority = 13)
	public void Footer_CareersGI() throws Exception {
		test = extent.createTest("Footer_CareersGI");
		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);

		try {
			driver.get(Basepage.readProperty("urlG"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 2);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");
			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
						+ "URL IS NOT OPENED");
				extent.flush();
				driver.close();
				throw new SkipException("Skipping - ");
			}
		} catch (Exception e) {
			test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
					+ "LABEL OF GENERAL ENQUIRE IS NOT DISPLAYED");
			extent.flush();
			driver.close();
			throw new SkipException("Skipping - ");
		}
		// label of footer careers
		try {
			String Footercareerslabelhead = page.Footercareerslabelmethod();
			String Footercareerslabelexcel = Excelreader.getData(0, 25, 1);
			if (Footercareerslabelhead.equals(Footercareerslabelexcel)) {
				test.pass("TC: THE LABEL 'FOOTER CAREERS' IS DISPLAYED ");
			} else {
				test.fail("TC: THE LABEL 'FOOTER CAREERS' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
						+ "THE LABEL 'FOOTER CAREERS' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// FOOTER CAREERS OF LEAGER BUMPER AND CALCEL BUTTON
		try {
			String Footercareersclickhead = page.Footercareersclickmethod();
			String Footercareersclickexcel = Excelreader.getData(0, 26, 1);
			if (Footercareersclickhead.equals(Footercareersclickexcel)) {
				test.pass("TC: THE LEGAL BUMPER OF FOOTER CAREERS IS WORKING FINE ");
				String leavingcancelbuttonfooterhead = page.leavingcancelbuttonfootermethod();
				String leavingcancelbuttonfooterexcel = Excelreader.getData(0, 26, 1);
				if (!leavingcancelbuttonfooterhead.equals(leavingcancelbuttonfooterexcel)) {
					test.pass("TC: THE CANCEL BUTTON OF'FOOTER CAREERS' IS WORKING");
				} else {
					test.fail("TC:THE CANCEL BUTTON OF'FOOTER CAREERS' IS NOT WORKING");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
							+ "THE CANCEL BUTTON OF'FOOTER CAREERS' IS NOT WORKING");
				}
			} else {
				test.fail("TC:THE 'LEGAL BUMPER' OF FOOTER CAREERS IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
						+ "THE 'LEGAL BUMPER' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// CAREERS BUTTON
		try {
        	String footercareersclickhead1 = page.footercareersclickmethod1();
			String footercareersclickexcel1 = Excelreader.getData(0, 27, 1);
			if (footercareersclickhead1.equals(footercareersclickexcel1)) {
				test.pass("TC: THE LANDING PAGE OF FOOTER CAREERS IS WORKING ");
			} else {
				test.fail("TC:THE LANDING PAGE OF 'FOOTER CAREERS' IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
						+ "THE LANDING PAGE OF 'FOOTER CAREERS' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 14)
	public void Footer_Education_Opportunities_GI() throws Exception {
		test = extent.createTest("Footer_Education_Opportunities_GI");
		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);

		try {
			driver.get(Basepage.readProperty("urlG"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 2);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");
			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
						+ "URL IS NOT OPENED");
				extent.flush();
				driver.close();
				throw new SkipException("Skipping - ");
			}
		} catch (Exception e) {
			test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
					+ "LABEL OF GENERAL ENQUIRE IS NOT DISPLAYED");
			extent.flush();
			driver.close();
			throw new SkipException("Skipping - ");
		}
		// label of footer education opportunities
		try {
			String Footereducationlabelhead = page.Footereducationlabelmethod();
			String Footereducationlabelexcel = Excelreader.getData(0, 28, 1);
			if (Footereducationlabelhead.equals(Footereducationlabelexcel)) {
				test.pass("TC: THE LABEL 'FOOTER EDUCATION OPPORTUNITIES' IS DISPLAYED ");
			} else {
				test.fail("TC: THE LABEL 'FOOTER EDUCATION OPPORTUNITIES' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
						+ "THE LABEL 'FOOTER EDUCATION OPPORTUNITIES' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// FOOTER education OF LEGal BUMPER AND CALCEL BUTTON
		try {
			String Footereducationclickhead = page.Footereducationclickmethod();
			String Footereducationclickexcel = Excelreader.getData(0, 26, 1);
			if (Footereducationclickhead.equals(Footereducationclickexcel)) {
				test.pass("TC: THE LEGAL BUMPER OF FOOTER 'EDUCATION OPPORTUNITIES'  IS WORKING FINE ");
				String leavingcancelbuttonfooterhead = page.leavingcancelbuttoneducationmethod();
				String leavingcancelbuttonfooterexcel = Excelreader.getData(0, 26, 1);
				if (!leavingcancelbuttonfooterhead.equals(leavingcancelbuttonfooterexcel)) {
					test.pass("TC: THE CANCEL BUTTON OF FOOTER 'EDUCATION OPPORTUNITIES' IS WORKING");
				} else {
					test.fail("TC:THE CANCEL BUTTON OF FOOTER 'EDUCATION OPPORTUNITIES' IS NOT WORKING");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
							+ "THE CANCEL BUTTON OF FOOTER 'EDUCATION OPPORTUNITIES' IS NOT WORKING");
				}
			} else {
				test.fail("TC:THE 'LEGAL BUMPER' OF FOOTER 'EDUCATION OPPORTUNITIES' IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
						+ "THE LEGAL BUMPER OF 'EDUCATION OPPORTUNITIES' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// landing page of education opportunities link
		try {
			String footereducationclickhead1 = page.footereducationclickmethod1();
			String footereducationopporclickexcel = Excelreader.getData(0, 29, 1);
			if (footereducationclickhead1.equals(footereducationopporclickexcel)) {
				test.pass("TC: THE LANDING PAGE OF 'EDUCATION OPPORTUNITIES' IS WORKING ");
			} else {
				test.fail("TC:THE LANDING PAGE OF 'EDUCATION OPPORTUNITIES' IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
						+ "THE LANDING PAGE OF 'EDUCATION OPPORTUNITIES' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

	}

	@Test(priority = 15)
	public void Footer_Employee_Perks_GI() throws Exception {
		test = extent.createTest("Footer_Employee_Perks_GI");
		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);

		try {
			driver.get(Basepage.readProperty("urlG"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 2);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");
			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
						+ "URL IS NOT OPENED");
				extent.flush();
				driver.close();
				throw new SkipException("Skipping - ");
			}
		} catch (Exception e) {
			test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
					+ "LABEL OF GENERAL ENQUIRE IS NOT DISPLAYED");
			extent.flush();
			driver.close();
			throw new SkipException("Skipping - ");
		}
		// label of footer education opportunities
		try {
			String Footeremployeelabelhead = page.Footeremployeelabelmethod();
			String Footeremployeelabelexcel = Excelreader.getData(0, 30, 1);
			if (Footeremployeelabelhead.equals(Footeremployeelabelexcel)) {
				test.pass("TC: THE LABEL 'FOOTER EMPLOYEE PERKS' IS DISPLAYED ");
			} else {
				test.fail("TC: THE LABEL 'FOOTER EMPLOYEE PERKS' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
						+ "THE LABEL 'FOOTER EMPLOYEE PERKS' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// FOOTER CAREERS OF LEAGER BUMPER AND CALCEL BUTTON
		try {															
			String Footercareersclickhead = page.Footeremployeeclickmethod();
			String Footercareersclickexcel = Excelreader.getData(0, 26, 1);
			if (Footercareersclickhead.equals(Footercareersclickexcel)) {
				test.pass("TC: THE LEGAL BUMPER OF FOOTER EMPLOYEE PERKS IS WORKING FINE ");
				String leavingcancelbuttonfooterhead = page.leavingcancelbuttonemployeemethod();
				String leavingcancelbuttonfooterexcel = Excelreader.getData(0, 26, 1);
				if (!leavingcancelbuttonfooterhead.equals(leavingcancelbuttonfooterexcel)) {
					test.pass("TC: THE CANCEL BUTTON OF'FOOTER EMPLOYEE PERKS' IS WORKING");
				} else {
					test.fail("TC:THE CANCEL BUTTON OF'FOOTER EMPLOYEE PERKS' IS NOT WORKING");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
							+ "THE CANCEL BUTTON OF'FOOTER EMPLOYEE PERKS' IS NOT WORKING");
				}
			} else {
				test.fail("TC:THE 'LEGAL BUMPER' OF FOOTER EMPLOYEE PERKS IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
						+ "THE 'LEGAL BUMPER' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// CAREERS BUTTON
		try {
			String footeremployeesclickhead1 = page.footeremployeeclickmethod1();
			String footeremployeeclickexcel1 = Excelreader.getData(0, 31, 1);
			if (footeremployeesclickhead1.equals(footeremployeeclickexcel1)) {
				test.pass("TC: THE LANDING PAGE OF FOOTER EMPLOYEE PERKS IS WORKING ");
			} else {
				test.fail("TC:THE LANDING PAGE OF 'FOOTER EMPLOYEE PERKS' IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
						+ "THE LANDING PAGE OF 'FOOTER EMPLOYEE PERKS' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 16)
	public void Footer_MEET_Our_People_GI() throws Exception {
		test = extent.createTest("Footer_MEET_Our_People_GI");
		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);

		try {
			driver.get(Basepage.readProperty("urlG"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 2);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");
			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
						+ "URL IS NOT OPENED");
				extent.flush();
				driver.close();
				throw new SkipException("Skipping - ");
			}
		} catch (Exception e) {
			test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
					+ "LABEL OF GENERAL ENQUIRE IS NOT DISPLAYED");
			extent.flush();
			driver.close();
			throw new SkipException("Skipping - ");
		}
		// label of footer education opportunities
		try {
			String Footeremeetourpeoplelabelhead = page.Footeremeetourpeoplelabelmethod();
			String Footeremeetourpeoplelabeexcel = Excelreader.getData(0, 32, 1);
			if (Footeremeetourpeoplelabelhead.equals(Footeremeetourpeoplelabeexcel)) {
				test.pass("TC: THE LABEL 'FOOTER MEET OUR PEOPLE' IS DISPLAYED ");
			} else {
				test.fail("TC: THE LABEL 'FOOTER MEET OUR PEOPLE' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
						+ "THE LABEL 'FOOTER MEET OUR PEOPLE' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// FOOTER CAREERS OF LEAGER BUMPER AND CALCEL BUTTON
		try {
			String Footermeetourpeopleclickhead = page.Footermeetourpeopleclickmethod();
			String Footermeetourpeopleclickexcel = Excelreader.getData(0, 26, 1);
			if (Footermeetourpeopleclickhead.equals(Footermeetourpeopleclickexcel)) {
				test.pass("TC: THE LEGAL BUMPER OF FOOTER MEET OUR PEOPLE IS WORKING FINE ");
				String leavingcancelbuttonmeetourpeoplehead = page.leavingcancelbuttonmeetourpeoplemethod();
				String leavingcancelbuttonmeetourpeopleexcel = Excelreader.getData(0, 26, 1);
				if (!leavingcancelbuttonmeetourpeoplehead.equals(leavingcancelbuttonmeetourpeopleexcel)) {
					test.pass("TC: THE CANCEL BUTTON OF'FOOTER MEET OUR PEOPLE' IS WORKING");
				} else {
					test.fail("TC:THE CANCEL BUTTON OF'FOOTER MEET OUR PEOPLE' IS NOT WORKING");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
							+ "THE CANCEL BUTTON OF'FOOTER MEET OUR PEOPLE' IS NOT WORKING");
				}
			} else {
				test.fail("TC:THE 'LEGAL BUMPER' OF FOOTER EMPLOYEE PERKS IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
						+ "THE 'LEGAL BUMPER' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// CAREERS BUTTON
		try {
			String footeremeetourpeopleclickhead1 = page.footermeetourpeopleclickmethod1();
			String footermeetourpeopleclickexcel1 = Excelreader.getData(0, 33, 1);
			if (footeremeetourpeopleclickhead1.equals(footermeetourpeopleclickexcel1)) {
				test.pass("TC: THE LANDING PAGE OF FOOTER MEET OUR PEOPLE IS WORKING ");
			} else {
				test.fail("TC:THE LANDING PAGE OF 'FOOTER MEET OUR PEOPLE' IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
						+ "THE LANDING PAGE OF 'FOOTER MEET OUR PEOPLE' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 17)
	public void Footer_For_Our_Veterans_GI() throws Exception {
		test = extent.createTest("Footer_For_Our_Veterans_GI");
		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);

		try {
			driver.get(Basepage.readProperty("urlG"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 2);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");
			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
						+ "URL IS NOT OPENED");
				extent.flush();
				driver.close();
				throw new SkipException("Skipping - ");
			}
		} catch (Exception e) {
			test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
					+ "LABEL OF GENERAL ENQUIRE IS NOT DISPLAYED");
			extent.flush();
			driver.close();
			throw new SkipException("Skipping - ");
		}
		// label of footer for our veterans
		try {
			String Footeremeetourpeoplelabelhead = page.Footerforourveteranslabelmethod();
			String Footeremeetourpeoplelabeexcel = Excelreader.getData(0, 34, 1);
			if (Footeremeetourpeoplelabelhead.equals(Footeremeetourpeoplelabeexcel)) {
				test.pass("TC: THE LABEL 'FOOTER FOR OUR VETERANS ' IS DISPLAYED ");
			} else {
				test.fail("TC: THE LABEL 'FOOTER FOR OUR VETERANS' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
						+ "THE LABEL 'FOOTER FOR OUR VETERANS' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// FOOTER CAREERS OF LEAGER BUMPER AND CALCEL BUTTON
		try {
			String Footermeetourpeopleclickhead = page.Footerforourveteransclickmethod();
			String Footermeetourpeopleclickexcel = Excelreader.getData(0, 26, 1);
			if (Footermeetourpeopleclickhead.equals(Footermeetourpeopleclickexcel)) {
				test.pass("TC: THE LEGAL BUMPER OF FOOTER FOR OUR VETERANS IS WORKING FINE ");
				String leavingcancelbuttonmeetourpeoplehead = page.leavingcancelbuttonforourveteransmethod();
				String leavingcancelbuttonmeetourpeopleexcel = Excelreader.getData(0, 26, 1);
				if (!leavingcancelbuttonmeetourpeoplehead.equals(leavingcancelbuttonmeetourpeopleexcel)) {
					test.pass("TC: THE CANCEL BUTTON OF'FOOTER FOR OUR VETERANS' IS WORKING");
				} else {
					test.fail("TC:THE CANCEL BUTTON OF'FOOTER FOR OUR VETERANS' IS NOT WORKING");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
							+ "THE CANCEL BUTTON OF'FOOTER FOR OUR VETERANS' IS NOT WORKING");
				}
			} else {
				test.fail("TC:THE 'LEGAL BUMPER' OF FOOTER FOR OUR VETERANS IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
						+ "THE 'LEGAL BUMPER' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// CAREERS BUTTON
		try {
			String footeremeetourpeopleclickhead1 = page.footerforourveteransclickmethod1();
			String footermeetourpeopleclickexcel1 = Excelreader.getData(0, 35, 1);
			if (footeremeetourpeopleclickhead1.equals(footermeetourpeopleclickexcel1)) {
				test.pass("TC: THE LANDING PAGE OF FOOTER FOR OUR VETERANS IS WORKING ");
			} else {
				test.fail("TC:THE LANDING PAGE OF 'FOOTER FOR OUR VETERANS' IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
						+ "THE LANDING PAGE OF 'FOOTER FOR OUR VETERANS' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 18)
	public void Footer_Working_With_Us_GI() throws Exception {
		test = extent.createTest("Footer_Working_With_Us_GI");
		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);

		try {
			driver.get(Basepage.readProperty("urlG"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 2);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");
			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
						+ "URL IS NOT OPENED");
				extent.flush();
				driver.close();
				throw new SkipException("Skipping - ");
			}
		} catch (Exception e) {
			test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
					+ "LABEL OF GENERAL ENQUIRE IS NOT DISPLAYED");
			extent.flush();
			driver.close();
			throw new SkipException("Skipping - ");
		}
		// label of footer for our veterans
		try {
			String Footeremeetourpeoplelabelhead = page.Footerworkingwithuslabelmethod();
			String Footeremeetourpeoplelabeexcel = Excelreader.getData(0, 36, 1);
			if (Footeremeetourpeoplelabelhead.equals(Footeremeetourpeoplelabeexcel)) {
				test.pass("TC: THE LABEL 'FOOTER WORKING WITH US ' IS DISPLAYED ");
			} else {
				test.fail("TC: THE LABEL 'FOOTER WORKING WITH US' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
						+ "THE LABEL 'FOOTER WORKING WITH US' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// FOOTER CAREERS OF LEAGER BUMPER AND CALCEL BUTTON
		try {
			String Footermeetourpeopleclickhead = page.Footerworkingwithusclickmethod();
			String Footermeetourpeopleclickexcel = Excelreader.getData(0, 26, 1);
			if (Footermeetourpeopleclickhead.equals(Footermeetourpeopleclickexcel)) {
				test.pass("TC: THE LEGAL BUMPER OF FOOTER WORKING WITH US IS WORKING FINE ");
				String leavingcancelbuttonmeetourpeoplehead = page.leavingcancelbuttonworkingwithusmethod();
				String leavingcancelbuttonmeetourpeopleexcel = Excelreader.getData(0, 26, 1);
				if (!leavingcancelbuttonmeetourpeoplehead.equals(leavingcancelbuttonmeetourpeopleexcel)) {
					test.pass("TC: THE CANCEL BUTTON OF'FOOTER WORKING WITH US' IS WORKING");
				} else {
					test.fail("TC:THE CANCEL BUTTON OF'FOOTER WORKING WITH US' IS NOT WORKING");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
							+ "THE CANCEL BUTTON OF'FOOTER WORKING WITH US' IS NOT WORKING");
				}
			} else {
				test.fail("TC:THE 'LEGAL BUMPER' OF FOOTER WORKING WITH US IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
						+ "THE 'LEGAL BUMPER' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// CAREERS BUTTON
		try {
			String footeremeetourpeopleclickhead1 = page.footerworkingwithusclickmethod1();
			String footermeetourpeopleclickexcel1 = Excelreader.getData(0, 37, 1);
			if (footeremeetourpeopleclickhead1.equals(footermeetourpeopleclickexcel1)) {
				test.pass("TC: THE LANDING PAGE OF FOOTER WORKING WITH US IS WORKING ");
			} else {
				test.fail("TC:THE LANDING PAGE OF 'FOOTER WORKING WITH US' IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
						+ "THE LANDING PAGE OF 'FOOTER WORKING WITH US' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

	@Test(priority = 19)
	public void Footer_Apply_Now_GI() throws Exception {
		test = extent.createTest("Footer_Apply_Now_GI");
		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);

		try {
			driver.get(Basepage.readProperty("urlG"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 2);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");
			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
						+ "URL IS NOT OPENED");
				extent.flush();
				driver.close();
				throw new SkipException("Skipping - ");
			}
		} catch (Exception e) {
			test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
					+ "LABEL OF GENERAL ENQUIRE IS NOT DISPLAYED");
			extent.flush();
			driver.close();
			throw new SkipException("Skipping - ");
		}
		// label of footer APPLY NOW
		try {
			String Footeremeetourpeoplelabelhead = page.Footerapplynowlabelmethod();
			String Footeremeetourpeoplelabeexcel = Excelreader.getData(0, 38, 1);
			if (Footeremeetourpeoplelabelhead.equals(Footeremeetourpeoplelabeexcel)) {
				test.pass("TC: THE LABEL 'FOOTER APPLY NOW ' IS DISPLAYED ");
			} else {
				test.fail("TC: THE LABEL 'FOOTER APPLY NOW' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
						+ "THE LABEL 'FOOTER APPLY NOW' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
		// FOOTER OF LEAGER BUMPER AND CALCEL BUTTON
		try {
			String Footermeetourpeopleclickhead = page.Footerapplynowclickmethod();
			String Footermeetourpeopleclickexcel = Excelreader.getData(0, 26, 1);
			if (Footermeetourpeopleclickhead.equals(Footermeetourpeopleclickexcel)) {
				test.pass("TC: THE LEGAL BUMPER OF FOOTER 'APPLY NOW' IS WORKING FINE ");
				String leavingcancelbuttonmeetourpeoplehead = page.leavingcancelbuttonapplynowmethod();
				String leavingcancelbuttonmeetourpeopleexcel = Excelreader.getData(0, 26, 1);
				if (!leavingcancelbuttonmeetourpeoplehead.equals(leavingcancelbuttonmeetourpeopleexcel)) {
					test.pass("TC: THE CANCEL BUTTON OF'FOOTER APPLY NOW' IS WORKING");
				} else {
					test.fail("TC:THE CANCEL BUTTON OF'FOOTER APPLY NOW' IS NOT WORKING");
					test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
							+ "THE CANCEL BUTTON OF'FOOTER APPLY NOW' IS NOT WORKING");
				}
			} else {
				test.fail("TC:THE 'LEGAL BUMPER' OF FOOTER APPLY NOW IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
						+ "THE 'LEGAL BUMPER' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// CAREERS BUTTON
		try {
			String footeremeetourpeopleclickhead1 = page.footerapplynowclickmethod1();
			String footermeetourpeopleclickexcel1 = Excelreader.getData(0, 39, 1);
			if (footeremeetourpeopleclickhead1.equals(footermeetourpeopleclickexcel1)) {
				test.pass("TC: THE LANDING PAGE OF FOOTER APPLY NOW IS WORKING ");
			} else {
				test.fail("TC:THE LANDING PAGE OF 'FOOTER APPLY NOW' IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "General_EnquireP"))
						+ "THE LANDING PAGE OF 'FOOTER APPLY NOW' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}
	
	//Services
    
    @Test(priority = 20)
	public void Footer_Services() throws IOException {
		test = extent.createTest("Footer_Services");
		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);
		
		try {
			driver.get(Basepage.readProperty("urlG"));
			String gettitle = page.generallgetpagetitlemethod();
			String gettitleexcel = Excelreader.getData(0, 1, 2);
			if (gettitle.equals(gettitleexcel)) {
				test.pass("TC:1 URL IS OPENED");
			} else {
				test.fail("TC:1 URL IS NOT OPENED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "URL IS NOT OPENED");
				extent.flush();
				driver.close();
				throw new SkipException("Skipping - ");
			}
		} catch (Exception e) {
			test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
					+ "LABEL OF FOOTER NAVIGATION IS NOT DISPLAYED");
			extent.flush();
			driver.close();
			throw new SkipException("Skipping - ");
		}
    
	
		// label of services
		try {
			String serviceslabelhead = page.serviceslabelmethod();
			String serviceslabelexcel = Excelreader.getData(0, 41, 1);
			if (serviceslabelhead.equals(serviceslabelexcel)) {
				test.pass("TC2: THE LABEL 'SERVICES' IS DISPLAYED ");
			} else {
				test.fail("TC2: THE LABEL 'SERVICES' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "THE LABEL 'SERVICES' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// services click
		try {
			String servicesclickhead = page.servicesclickmethod1();
			String servicesclickexcel = Excelreader.getData(0, 42, 1);
			if (servicesclickhead.equals(servicesclickexcel)) {
				test.pass("TC3: THE LANDING PAGE OF 'SERVICES' IS WORKING ");
			} else {
				test.fail("TC3:THE LANDING PAGE OF 'SERVICES' IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "THE LANDING PAGE OF 'SERVICES' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}

   // WIFI
    @Test(priority = 21)
	public void Footer_Wifi() throws IOException {
		test = extent.createTest("Footer_Wifi");
		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);																							
		
		// label of Our History
		try {
			String wifilabelhead = page.wifilabelmethod();
			String wifilabelexcel = Excelreader.getData(0, 43, 1);
			if (wifilabelhead.equals(wifilabelexcel)) {
				test.pass("TC4: THE LABEL 'WIFI' IS DISPLAYED ");
			} else {
				test.fail("TC4: THE LABEL 'WIFI' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "THE LABEL 'WIFI' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// WIFI click
		try {
			String wificlickhead = page.wificlickmethod();
			String wificlickexcel = Excelreader.getData(0, 44, 1);
			if (wificlickhead.equals(wificlickexcel)) {
				test.pass("TC4: THE LANDING PAGE OF 'WIFI' IS WORKING ");
			} else {
				test.fail("TC4:THE LANDING PAGE OF 'WIFI' IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "THE LANDING PAGE OF 'WIFI' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}
    
    // Archcard
    @Test(priority = 22)
	public void Footer_Archcard() throws IOException {
		test = extent.createTest("Footer_Archcard");
		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);																							
		
		// label of Archcard
		try {
			String archcardlabelhead = page.archcardlabelmethod();
			String archcardlabelexcel = Excelreader.getData(0, 45, 1);
			if (archcardlabelhead.equals(archcardlabelexcel)) {
				test.pass("TC4: THE LABEL 'ARCH CARD' IS DISPLAYED ");
			} else {
				test.fail("TC4: THE LABEL 'ARCH CARD' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "THE LABEL 'ARCH CARD' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// Archcard click
		try {
			String archcardclickhead = page.archcardclickmethod();
			String archcardclickexcel = Excelreader.getData(0, 46, 1);
			if (archcardclickhead.equals(archcardclickexcel)) {
				test.pass("TC4: THE LANDING PAGE OF 'ARCH CARD' IS WORKING ");
			} else {
				test.fail("TC4:THE LANDING PAGE OF 'ARCH CARD' IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "THE LANDING PAGE OF 'ARCH CARD' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}
    
    // Play Places & Parties
    @Test(priority = 23)
	public void Footer_Play_Places_Parties() throws IOException {
		test = extent.createTest("Footer_Play Places & Parties");
		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);																							
		
		// label of Play Places & Parties
		try {
			String playplaceslabelhead = page.playplaceslabelmethod();
			String playplaceslabelexcel = Excelreader.getData(0, 47, 1);
			if (playplaceslabelhead.equals(playplaceslabelexcel)) {
				test.pass("TC4: THE LABEL 'playplaces' IS DISPLAYED ");
			} else {
				test.fail("TC4: THE LABEL 'playplaces' IS NOT DISPLAYED");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "THE LABEL 'playplaces' IS NOT DISPLAYED");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}

		// Play Places & Parties click
		try {
			String playplacesclickhead = page.playplacesclickmethod();
			String playplacesclickexcel = Excelreader.getData(0, 48, 1);
			if (playplacesclickhead.equals(playplacesclickexcel)) {
				test.pass("TC4: THE LANDING PAGE OF 'playplaces' IS WORKING ");
			} else {
				test.fail("TC4:THE LANDING PAGE OF 'playplaces' IS NOT WORKING");
				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
						+ "THE LANDING PAGE OF 'playplaces' IS NOT WORKING");
			}
		} catch (Exception e) {
			test.fail("Error:" + e.getMessage());
		}
	}
    
    
    //Community
    @Test(priority = 24)
   	public void Footer_Community() throws IOException {
   		test = extent.createTest("Footer_Community");
   		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);
   		
   		try {
   			driver.get(Basepage.readProperty("urlG"));
   			String gettitle = page.generallgetpagetitlemethod();
   			String gettitleexcel = Excelreader.getData(0, 1, 2);
   			if (gettitle.equals(gettitleexcel)) {
   				test.pass("TC:1 URL IS OPENED");
   			} else {
   				test.fail("TC:1 URL IS NOT OPENED");
   				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
   						+ "URL IS NOT OPENED");
   				extent.flush();
   				driver.close();
   				throw new SkipException("Skipping - ");
   			}
   		} catch (Exception e) {
   			test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
   					+ "LABEL OF FOOTER NAVIGATION IS NOT DISPLAYED");
   			extent.flush();
   			driver.close();
   			throw new SkipException("Skipping - ");
   		}
       
   	
   		// label of community
   		try {
   			String communitylabelhead = page.communitylabelmethod();
   			String communitylabelexcel = Excelreader.getData(0, 50, 1);
   			if (communitylabelhead.equals(communitylabelexcel)) {
   				test.pass("TC2: THE LABEL 'COMMUNITY' IS DISPLAYED ");
   			} else {
   				test.fail("TC2: THE LABEL 'COMMUNITY' IS NOT DISPLAYED");
   				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
   						+ "THE LABEL 'COMMUNITY' IS NOT DISPLAYED");
   			}
   		} catch (Exception e) {
   			test.fail("Error:" + e.getMessage());
   		}

   		// COMMUNITY click
   		try {
   			String communityclickhead = page.communityclickmethod1();
   			String communityclickexcel = Excelreader.getData(0, 51, 1);
   			if (communityclickhead.equals(communityclickexcel)) {
   				test.pass("TC3: THE LANDING PAGE OF 'COMMUNITY' IS WORKING ");
   			} else {
   				test.fail("TC3:THE LANDING PAGE OF 'COMMUNITY' IS NOT WORKING");
   				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
   						+ "THE LANDING PAGE OF 'COMMUNITY' IS NOT WORKING");
   			}
   		} catch (Exception e) {
   			test.fail("Error:" + e.getMessage());
   		}
   	}
    
    //RMHC
    @Test(priority = 25)
   	public void Footer_RMHC() throws IOException {
   		test = extent.createTest("Footer_RMHC");
   		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);
   	
   		// label of RHMC
   		try {
   			String rmhclabelhead = page.rmhclabelmethod();
   			String rmhclabelexcel = Excelreader.getData(0, 52, 1);
   			if (rmhclabelhead.equals(rmhclabelexcel)) {
   				test.pass("TC2: THE LABEL 'RMHC' IS DISPLAYED ");
   			} else {
   				test.fail("TC2: THE LABEL 'RMHC' IS NOT DISPLAYED");
   				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
   						+ "THE LABEL 'RMHC' IS NOT DISPLAYED");
   			}
   		} catch (Exception e) {
   			test.fail("Error:" + e.getMessage());
   		}

   		// RMHC click
   		try {
   			String rmhcclickhead = page.rmhcclickmethod1();
   			String rmhcclickexcel = Excelreader.getData(0, 53, 1);
   			if (rmhcclickhead.equals(rmhcclickexcel)) {
   				test.pass("TC3: THE LANDING PAGE OF 'RMHC' IS WORKING ");
   			} else {
   				test.fail("TC3:THE LANDING PAGE OF 'RMHC' IS NOT WORKING");
   				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
   						+ "THE LANDING PAGE OF 'RMHC' IS NOT WORKING");
   			}
   		} catch (Exception e) {
   			test.fail("Error:" + e.getMessage());
   		}
   	}
    
  //Black & Positively Golden
    @Test(priority = 26)
   	public void Footer_Black_Positively_Golden() throws IOException {
   		test = extent.createTest("Footer_Black & Positively Golden");
   		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);
   	
   		// label of Black & Positively Golden
   		try {
   			String blackandpositivelygoldenlabelhead = page.blackandpositivelygoldenlabelmethod();
   			String blackandpositivelygoldenlabelexcel = Excelreader.getData(0, 54, 1);
   			if (blackandpositivelygoldenlabelhead.equals(blackandpositivelygoldenlabelexcel)) {
   				test.pass("TC2: THE LABEL 'Black & Positively Golden' IS DISPLAYED ");
   			} else {
   				test.fail("TC2: THE LABEL 'Black & Positively Golden' IS NOT DISPLAYED");
   				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
   						+ "THE LABEL 'Black & Positively Golden' IS NOT DISPLAYED");
   			}
   		} catch (Exception e) {
   			test.fail("Error:" + e.getMessage());
   		}

   		// Black & Positively Golden click
   		try {
   			String blackandpositivelygoldenclickhead = page.blackandpositivelygoldenclickmethod1();
   			String blackandpositivelygoldenclickexcel = Excelreader.getData(0, 55, 1);
   			if (blackandpositivelygoldenclickhead.equals(blackandpositivelygoldenclickexcel)) {
   				test.pass("TC3: THE LANDING PAGE OF 'Black & Positively Golden' IS WORKING ");
   			} else {
   				test.fail("TC3:THE LANDING PAGE OF 'Black & Positively Golden' IS NOT WORKING");
   				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
   						+ "THE LANDING PAGE OF 'Black & Positively Golden' IS NOT WORKING");
   			}
   		} catch (Exception e) {
   			test.fail("Error:" + e.getMessage());
   		}
   	}
    
  //McDonald's APA
    @Test(priority = 27)
   	public void Footer_McDonalds_APA() throws IOException {
   		test = extent.createTest("Footer_McDonalds_APA");
   		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);
   	
   		// label of McDonald's APA
   		try {
   			String mcdonaldsapalabelhead = page.mcdonaldsapalabelmethod();
   			String mcdonaldsapalabelexcel = Excelreader.getData(0, 56, 1);
   			if (mcdonaldsapalabelhead.equals(mcdonaldsapalabelexcel)) {
   				test.pass("TC2: THE LABEL 'McDonald's APA' IS DISPLAYED ");
   			} else {
   				test.fail("TC2: THE LABEL 'McDonald's APA' IS NOT DISPLAYED");
   				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
   						+ "THE LABEL 'McDonald's APA' IS NOT DISPLAYED");
   			}
   		} catch (Exception e) {
   			test.fail("Error:" + e.getMessage());
   		}

   		// McDonald's APA click
   		try {
   			String mcdonaldsapaclickhead = page.mcdonaldsapaclickmethod1();
   			String mcdonaldsapaclickexcel = Excelreader.getData(0, 57, 1);
   			if (mcdonaldsapaclickhead.equals(mcdonaldsapaclickexcel)) {
   				test.pass("TC3: THE LANDING PAGE OF 'McDonald's APA' IS WORKING ");
   			} else {
   				test.fail("TC3:THE LANDING PAGE OF 'McDonald's APA' IS NOT WORKING");
   				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
   						+ "THE LANDING PAGE OF 'McDonald's APA' IS NOT WORKING");
   			}
   		} catch (Exception e) {
   			test.fail("Error:" + e.getMessage());
   		}
   	}  
    
  //McDonald's APA
    @Test(priority = 28)
   	public void Footer_McDonalds_APA1() throws IOException {
   		test = extent.createTest("Footer_McDonalds_APA1");
   		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);
   	
   		// label of McDonald's APA
   		try {
   			String mcdonaldsapalabelhead = page.mcdonaldsapalabelmethod1();
   			String mcdonaldsapalabelexcel = Excelreader.getData(0, 58, 1);
   			if (mcdonaldsapalabelhead.equals(mcdonaldsapalabelexcel)) {
   				test.pass("TC2: THE LABEL 'McDonald's APA1' IS DISPLAYED ");
   			} else {
   				test.fail("TC2: THE LABEL 'McDonald's APA1' IS NOT DISPLAYED");
   				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
   						+ "THE LABEL 'McDonald's APA' IS NOT DISPLAYED");
   			}
   		} catch (Exception e) {
   			test.fail("Error:" + e.getMessage());
   		}

   		// McDonald's APA click
   		try {
   			String mcdonaldsapaclickhead = page.mcdonaldsapaclickmethod2();
   			String mcdonaldsapaclickexcel = Excelreader.getData(0, 59, 1);
   			if (mcdonaldsapaclickhead.equals(mcdonaldsapaclickexcel)) {
   				test.pass("TC3: THE LANDING PAGE OF 'McDonald's APA1' IS WORKING ");
   			} else {
   				test.fail("TC3:THE LANDING PAGE OF 'McDonald's APA1' IS NOT WORKING");
   				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
   						+ "THE LANDING PAGE OF 'McDonald's APA' IS NOT WORKING");
   			}
   		} catch (Exception e) {
   			test.fail("Error:" + e.getMessage());
   		}
   	}  
    //McDonald’s International
    @Test(priority = 29)
   	public void Footer_McDonalds_International() throws IOException {
   		test = extent.createTest("Footer_McDonald’s International");
   		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);
   	
   		// label of McDonald’s International
   		try {
   			String mcDonaldsinternationallabelhead = page.mcDonaldsinternationallabelmethod();
   			String mcDonaldsinternationallabelexcel = Excelreader.getData(0, 60, 1);
   			if (mcDonaldsinternationallabelhead.equals(mcDonaldsinternationallabelexcel)) {
   				test.pass("TC2: THE LABEL 'McDonald’s International' IS DISPLAYED ");
   			} else {
   				test.fail("TC2: THE LABEL 'McDonald’s International' IS NOT DISPLAYED");
   				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
   						+ "THE LABEL 'McDonald’s International' IS NOT DISPLAYED");
   			}
   		} catch (Exception e) {
   			test.fail("Error:" + e.getMessage());
   		}

   		// McDonald’s International click
   		try {
   			String mcDonaldsinternationalclickhead = page.mcDonaldsinternationalclickmethod1();
   			String mcDonaldsinternationalclickexcel = Excelreader.getData(0, 61, 1);
   			if (mcDonaldsinternationalclickhead.equals(mcDonaldsinternationalclickexcel)) {
   				test.pass("TC3: THE LANDING PAGE OF 'McDonald’s International' IS WORKING ");
   			} else {
   				test.fail("TC3:THE LANDING PAGE OF 'McDonald’s International' IS NOT WORKING");
   				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
   						+ "THE LANDING PAGE OF 'McDonald’s International' IS NOT WORKING");
   			}
   		} catch (Exception e) {
   			test.fail("Error:" + e.getMessage());
   		}
   	} 
    
    //Black & Positively Golden1
      @Test(priority = 30)
     	public void Footer_Black_Positively_Golden1() throws IOException {
     		test = extent.createTest("Footer_Black & Positively Golden1");
     		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);
     	
     		// label of Black & Positively Golden1
     		try {
     			String blackandpositivelygoldenlabelhead = page.blackandpositivelygoldenlabelmethod1();
     			String blackandpositivelygoldenlabelexcel = Excelreader.getData(0, 62, 1);
     			if (blackandpositivelygoldenlabelhead.equals(blackandpositivelygoldenlabelexcel)) {
     				test.pass("TC2: THE LABEL 'Black & Positively Golden1' IS DISPLAYED ");
     			} else {
     				test.fail("TC2: THE LABEL 'Black & Positively Golden1' IS NOT DISPLAYED");
     				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
     						+ "THE LABEL 'Black & Positively Golden1' IS NOT DISPLAYED");
     			}
     		} catch (Exception e) {
     			test.fail("Error:" + e.getMessage());
     		}

     		// Black & Positively Golden1 click
     		try {
     			String blackandpositivelygoldenclickhead = page.blackandpositivelygoldenclickmethod2();
     			String blackandpositivelygoldenclickexcel = Excelreader.getData(0, 63, 1);
     			if (blackandpositivelygoldenclickhead.equals(blackandpositivelygoldenclickexcel)) {
     				test.pass("TC3: THE LANDING PAGE OF 'Black & Positively Golden1' IS WORKING ");
     			} else {
     				test.fail("TC3:THE LANDING PAGE OF 'Black & Positively Golden1' IS NOT WORKING");
     				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
     						+ "THE LANDING PAGE OF 'Black & Positively Golden1' IS NOT WORKING");
     			}
     		} catch (Exception e) {
     			test.fail("Error:" + e.getMessage());
     		}
     	}
      
      //Contact us
      @Test(priority = 31)
     	public void Footer_Contact_us() throws IOException {
     		test = extent.createTest("Footer_Contact_us");
     		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);
     		
     		try {
     			driver.get(Basepage.readProperty("urlG"));
     			String gettitle = page.generallgetpagetitlemethod();
     			String gettitleexcel = Excelreader.getData(0, 1, 2);
     			if (gettitle.equals(gettitleexcel)) {
     				test.pass("TC:1 URL IS OPENED");
     			} else {
     				test.fail("TC:1 URL IS NOT OPENED");
     				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
     						+ "URL IS NOT OPENED");
     				extent.flush();
     				driver.close();
     				throw new SkipException("Skipping - ");
     			}
     		} catch (Exception e) {
     			test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
     					+ "LABEL OF FOOTER NAVIGATION IS NOT DISPLAYED");
     			extent.flush();
     			driver.close();
     			throw new SkipException("Skipping - ");
     		}
         
     	
     		// label of Contact us
     		try {
     			String contactuslabelhead = page.contactuslabelmethod();
     			String contactuslabelexcel = Excelreader.getData(0, 65, 1);
     			if (contactuslabelhead.equals(contactuslabelexcel)) {
     				test.pass("TC2: THE LABEL 'CONTACT US' IS DISPLAYED ");
     			} else {
     				test.fail("TC2: THE LABEL 'CONTACT US' IS NOT DISPLAYED");
     				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
     						+ "THE LABEL 'CONTACT US' IS NOT DISPLAYED");
     			}
     		} catch (Exception e) {
     			test.fail("Error:" + e.getMessage());
     		}

     		// Contact us click
     		try {
     			String contactusclickhead = page.contactusclickmethod1();
     			String contactusclickexcel = Excelreader.getData(0, 66, 1);
     			if (contactusclickhead.equals(contactusclickexcel)) {
     				test.pass("TC3: THE LANDING PAGE OF 'CONTACT US' IS WORKING ");
     			} else {
     				test.fail("TC3:THE LANDING PAGE OF 'CONTACT US' IS NOT WORKING");
     				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
     						+ "THE LANDING PAGE OF 'CONTACT US' IS NOT WORKING");
     			}
     		} catch (Exception e) {
     			test.fail("Error:" + e.getMessage());
     		}
     	}
      
      
      // Page to Contact
      @Test(priority = 32)
  	public void Footer_Page_to_Contact() throws IOException {
  		test = extent.createTest("Footer_Page to Contact");
  		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);																							
  		
  		// label of Page to Contact
  		try {
  			String pagetocontactlabelhead = page.pagetocontactlabelmethod();
  			String pagetocontactlabelexcel = Excelreader.getData(0, 67, 1);
  			if (pagetocontactlabelhead.equals(pagetocontactlabelexcel)) {
  				test.pass("TC4: THE LABEL 'Page to Contact' IS DISPLAYED ");
  			} else {
  				test.fail("TC4: THE LABEL 'Page to Contact' IS NOT DISPLAYED");
  				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
  						+ "THE LABEL 'Page to Contact' IS NOT DISPLAYED");
  			}
  		} catch (Exception e) {
  			test.fail("Error:" + e.getMessage());
  		}

  		// Page to Contact click
  		try {
  			String pagetocontactclickhead = page.pagetocontactclickmethod();
  			String pagetocontactclickexcel = Excelreader.getData(0, 68, 1);
  			if (pagetocontactclickhead.equals(pagetocontactclickexcel)) {
  				test.pass("TC4: THE LANDING PAGE OF 'Page to Contact' IS WORKING ");
  			} else {
  				test.fail("TC4:THE LANDING PAGE OF 'Page to Contact' IS NOT WORKING");
  				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
  						+ "THE LANDING PAGE OF 'Page to Contact' IS NOT WORKING");
  			}
  		} catch (Exception e) {
  			test.fail("Error:" + e.getMessage());
  		}
  	}
      
      
      
      // akamai_test_refresh
      @Test(priority = 32)
  	public void Footer_akamai_test_refresh() throws IOException {
  		test = extent.createTest("Footer_akamai_test_refresh");
  		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);																							
  		
  		// label of akamai_test_refresh
  		try {
  			String akamilabelhead = page.akamilabelmethod();
  			String akamilabelexcel = Excelreader.getData(0, 69, 1);
  			if (akamilabelhead.equals(akamilabelexcel)) {
  				test.pass("TC4: THE LABEL 'akamai_test_refresh' IS DISPLAYED ");
  			} else {
  				test.fail("TC4: THE LABEL 'akamai_test_refresh' IS NOT DISPLAYED");
  				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
  						+ "THE LABEL 'akamai_test_refresh' IS NOT DISPLAYED");
  			}
  		} catch (Exception e) {
  			test.fail("Error:" + e.getMessage());
  		}

  		// akamai_test_refresh click
  		try {
  			String akamiclickhead = page.akamiclickmethod();
  			String akamiclickexcel = Excelreader.getData(0, 70, 1);
  			if (akamiclickhead.equals(akamiclickexcel)) {
  				test.pass("TC4: THE LANDING PAGE OF 'akamai_test_refresh' IS WORKING ");
  			} else {
  				test.fail("TC4:THE LANDING PAGE OF 'akamai_test_refresh' IS NOT WORKING");
  				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
  						+ "THE LANDING PAGE OF 'akamai_test_refresh' IS NOT WORKING");
  			}
  		} catch (Exception e) {
  			test.fail("Error:" + e.getMessage());
  		}
  	}
      
      
      // akamai000
      @Test(priority = 33)
  	public void Footer_akamai000() throws IOException {
  		test = extent.createTest("Footer_akamai000");
  		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);																							
  		
  		// label of akamai000
  		try {
  			String akami000labelhead = page.akami000labelmethod();
  			String akami000labelexcel = Excelreader.getData(0, 71, 1);
  			if (akami000labelhead.equals(akami000labelexcel)) {
  				test.pass("TC4: THE LABEL 'akamai000' IS DISPLAYED ");
  			} else {
  				test.fail("TC4: THE LABEL 'akamai000' IS NOT DISPLAYED");
  				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
  						+ "THE LABEL 'akamai000' IS NOT DISPLAYED");
  			}
  		} catch (Exception e) {
  			test.fail("Error:" + e.getMessage());
  		}

  		// akamai000 click
  		try {
  			String akami000clickhead = page.akami000clickmethod();
  			String akami000clickexcel = Excelreader.getData(0, 72, 1);
  			if (akami000clickhead.equals(akami000clickexcel)) {
  				test.pass("TC4: THE LANDING PAGE OF 'akamai000' IS WORKING ");
  			} else {
  				test.fail("TC4:THE LANDING PAGE OF 'akamai000' IS NOT WORKING");
  				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
  						+ "THE LANDING PAGE OF 'akamai000' IS NOT WORKING");
  			}
  		} catch (Exception e) {
  			test.fail("Error:" + e.getMessage());
  		}
  	}
      
      
      // Arch Card
      @Test(priority = 34)
  	public void Footer_ArchCard() throws IOException {
  		test = extent.createTest("Footer_Arch Card");
  		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);																							
  		
  		// label of Arch Card
  		try {
  			String archcardlabelhead = page.archcardlabelmethod1();
  			String archcardlabelexcel = Excelreader.getData(0, 73, 1);
  			if (archcardlabelhead.equals(archcardlabelexcel)) {
  				test.pass("TC4: THE LABEL 'Arch Card' IS DISPLAYED ");
  			} else {
  				test.fail("TC4: THE LABEL 'Arch Card' IS NOT DISPLAYED");
  				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
  						+ "THE LABEL 'Arch Card' IS NOT DISPLAYED");
  			}
  		} catch (Exception e) {
  			test.fail("Error:" + e.getMessage());
  		}

  		// Arch Card click
  		try {
  			String archcardclickhead = page.archcardclickmethod1();
  			String archcardclickexcel = Excelreader.getData(0, 74, 1);
  			if (archcardclickhead.equals(archcardclickexcel)) {
  				test.pass("TC4: THE LANDING PAGE OF 'Arch Card' IS WORKING ");
  			} else {
  				test.fail("TC4:THE LANDING PAGE OF 'Arch Card' IS NOT WORKING");
  				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
  						+ "THE LANDING PAGE OF 'Arch Card' IS NOT WORKING");
  			}
  		} catch (Exception e) {
  			test.fail("Error:" + e.getMessage());
  		}
  	}
      
      // Donations
      @Test(priority = 35)
  	public void Footer_Donations() throws IOException {
  		test = extent.createTest("Footer_Donations");
  		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);																							
  		
  		// label of Donations
  		try {
  			String donationslabelhead = page.donationslabelmethod();
  			String donationslabelexcel = Excelreader.getData(0, 75, 1);
  			if (donationslabelhead.equals(donationslabelexcel)) {
  				test.pass("TC4: THE LABEL 'Donations' IS DISPLAYED ");
  			} else {
  				test.fail("TC4: THE LABEL 'Donations' IS NOT DISPLAYED");
  				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
  						+ "THE LABEL 'Donations' IS NOT DISPLAYED");
  			}
  		} catch (Exception e) {
  			test.fail("Error:" + e.getMessage());
  		}

  		// Donations click
  		try {
  			String donationsclickhead = page.donationsclickmethod();
  			String donationsclickexcel = Excelreader.getData(0, 76, 1);
  			if (donationsclickhead.equals(donationsclickexcel)) {
  				test.pass("TC4: THE LANDING PAGE OF 'Donations' IS WORKING ");
  			} else {
  				test.fail("TC4:THE LANDING PAGE OF 'Donations' IS NOT WORKING");
  				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
  						+ "THE LANDING PAGE OF 'Donations' IS NOT WORKING");
  			}
  		} catch (Exception e) {
  			test.fail("Error:" + e.getMessage());
  		}
  	}
      
      
      // Employment
      @Test(priority = 36)
  	public void Footer_Employment() throws IOException {
  		test = extent.createTest("Footer_Employment");
  		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);																							
  		
  		// label of Employment
  		try {
  			String employmentlabelhead = page.employmentlabelmethod();
  			String employmentlabelexcel = Excelreader.getData(0, 77, 1);
  			if (employmentlabelhead.equals(employmentlabelexcel)) {
  				test.pass("TC4: THE LABEL 'Employment' IS DISPLAYED ");
  			} else {
  				test.fail("TC4: THE LABEL 'Employment' IS NOT DISPLAYED");
  				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
  						+ "THE LABEL 'Employment' IS NOT DISPLAYED");
  			}
  		} catch (Exception e) {
  			test.fail("Error:" + e.getMessage());
  		}

  		// Employment click
  		try {
  			String employmentclickhead = page.employmentclickmethod();
  			String employmentclickexcel = Excelreader.getData(0, 78, 1);
  			if (employmentclickhead.equals(employmentclickexcel)) {
  				test.pass("TC4: THE LANDING PAGE OF 'Employment' IS WORKING ");
  			} else {
  				test.fail("TC4:THE LANDING PAGE OF 'Employment' IS NOT WORKING");
  				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
  						+ "THE LANDING PAGE OF 'Employment' IS NOT WORKING");
  			}
  		} catch (Exception e) {
  			test.fail("Error:" + e.getMessage());
  		}
  	}
      
      
      
      // Mobile App
      @Test(priority = 37)
  	public void Footer_Mobile_App() throws IOException {
  		test = extent.createTest("Footer_Mobile App");
  		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);																							
  		
  		// label of Mobile App
  		try {
  			String mobileapplabelhead = page.mobileapplabelmethod();
  			String mobileapplabelexcel = Excelreader.getData(0, 79, 1);
  			if (mobileapplabelhead.equals(mobileapplabelexcel)) {
  				test.pass("TC4: THE LABEL 'Mobile App' IS DISPLAYED ");
  			} else {
  				test.fail("TC4: THE LABEL 'Mobile App' IS NOT DISPLAYED");
  				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
  						+ "THE LABEL 'Mobile App' IS NOT DISPLAYED");
  			}
  		} catch (Exception e) {
  			test.fail("Error:" + e.getMessage());
  		}

  		// Mobile App click
  		try {
  			String mobileappclickhead = page.mobileappclickmethod();
  			String mobileappclickexcel = Excelreader.getData(0, 80, 1);
  			if (mobileappclickhead.equals(mobileappclickexcel)) {
  				test.pass("TC4: THE LANDING PAGE OF 'Mobile App' IS WORKING ");
  			} else {
  				test.fail("TC4:THE LANDING PAGE OF 'Mobile App' IS NOT WORKING");
  				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
  						+ "THE LANDING PAGE OF 'Mobile App' IS NOT WORKING");
  			}
  		} catch (Exception e) {
  			test.fail("Error:" + e.getMessage());
  		}
  	}
      
      
      
      // Mobile App
     /* @Test(priority = 38)
  	public void Footer_MobileApp() throws IOException {
  		test = extent.createTest("Footer_MobileApp");
  		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);																							
  		
  		// label of Mobile App
  		try {
  			String mobileapp1labelhead = page.mobileapp1labelmethod();
  			String mobileapp1labelexcel = Excelreader.getData(0, 81, 1);
  			if (mobileapp1labelhead.equals(mobileapp1labelexcel)) {
  				test.pass("TC4: THE LABEL 'Mobile App' IS DISPLAYED ");
  			} else {
  				test.fail("TC4: THE LABEL 'Mobile App' IS NOT DISPLAYED");
  				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
  						+ "THE LABEL 'Mobile App' IS NOT DISPLAYED");
  			}
  		} catch (Exception e) {
  			test.fail("Error:" + e.getMessage());
  		}

  		// Mobile App click
  		try {
  			String mobileapp1clickhead = page.mobileapp1clickmethod();
  			String mobileapp1clickexcel = Excelreader.getData(0, 82, 1);
  			if (mobileapp1clickhead.equals(mobileapp1clickexcel)) {
  				test.pass("TC4: THE LANDING PAGE OF 'Mobile App' IS WORKING ");
  			} else {
  				test.fail("TC4:THE LANDING PAGE OF 'Mobile App' IS NOT WORKING");
  				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
  						+ "THE LANDING PAGE OF 'Mobile App' IS NOT WORKING");
  			}
  		} catch (Exception e) {
  			test.fail("Error:" + e.getMessage());
  		}
  	}*/
      
      
      
     /* // Restaurant Feedback
      @Test(priority = 39)
  	public void Footer_Restaurant_Feedback() throws IOException {
  		test = extent.createTest("Footer_Restaurant Feedback");
  		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);																							
  		
  		// label of Restaurant Feedback
  		try {
  			String restaurantfeedbacklabelhead = page.restaurantfeedbacklabelmethod();
  			String restaurantfeedbacklabelexcel = Excelreader.getData(0, 83, 1);
  			if (restaurantfeedbacklabelhead.equals(restaurantfeedbacklabelexcel)) {
  				test.pass("TC4: THE LABEL 'Restaurant Feedback' IS DISPLAYED ");
  			} else {
  				test.fail("TC4: THE LABEL 'Restaurant Feedback' IS NOT DISPLAYED");
  				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
  						+ "THE LABEL 'Restaurant Feedback' IS NOT DISPLAYED");
  			}
  		} catch (Exception e) {
  			test.fail("Error:" + e.getMessage());
  		}

  		// Restaurant Feedback click
  		try {
  			String restaurantfeedbackclickhead = page.restaurantfeedbackclickmethod();
  			String restaurantfeedbackclickexcel = Excelreader.getData(0, 84, 1);
  			if (restaurantfeedbackclickhead.equals(restaurantfeedbackclickexcel)) {
  				test.pass("TC4: THE LANDING PAGE OF 'Restaurant Feedback' IS WORKING ");
  			} else {
  				test.fail("TC4:THE LANDING PAGE OF 'Restaurant Feedback' IS NOT WORKING");
  				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
  						+ "THE LANDING PAGE OF 'Restaurant Feedback' IS NOT WORKING");
  			}
  		} catch (Exception e) {
  			test.fail("Error:" + e.getMessage());
  		}
  	}
      
      
      
      // Help Center | GMA application01
      @Test(priority = 40)
  	public void Footer_Help_Center_GMA_application01() throws IOException {
  		test = extent.createTest("Footer_Help Center | GMA application01");
  		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);																							
  		
  		// label of Help Center | GMA application01
  		try {
  			String helpcenterlabelhead = page.helpcenterlabelmethod();
  			String helpcenterlabelexcel = Excelreader.getData(0, 85, 1);
  			if (helpcenterlabelhead.equals(helpcenterlabelexcel)) {
  				test.pass("TC4: THE LABEL 'Help Center | GMA application01' IS DISPLAYED ");
  			} else {
  				test.fail("TC4: THE LABEL 'Help Center | GMA application01' IS NOT DISPLAYED");
  				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
  						+ "THE LABEL 'Help Center | GMA application01' IS NOT DISPLAYED");
  			}
  		} catch (Exception e) {
  			test.fail("Error:" + e.getMessage());
  		}

  		// Help Center | GMA application01 click
  		try {
  			String helpcenterclickhead = page.helpcenterclickmethod();
  			String helpcenterclickexcel = Excelreader.getData(0, 86, 1);
  			if (helpcenterclickhead.equals(helpcenterclickexcel)) {
  				test.pass("TC4: THE LANDING PAGE OF 'Help Center | GMA application01' IS WORKING ");
  			} else {
  				test.fail("TC4:THE LANDING PAGE OF 'Help Center | GMA application01' IS NOT WORKING");
  				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
  						+ "THE LANDING PAGE OF 'Help Center | GMA application01' IS NOT WORKING");
  			}
  		} catch (Exception e) {
  			test.fail("Error:" + e.getMessage());
  		}
  	}
      
      
      
      // Core Restaurant Feedback
      @Test(priority = 41)
  	public void Footer_Core_Restaurant_Feedback() throws IOException {
  		test = extent.createTest("Footer_Core Restaurant Feedback");
  		Footer_Navigation_Page page = new Footer_Navigation_Page(driver);																							
  		
  		// label of Core Restaurant Feedback
  		try {
  			String wifilabelhead = page.corerestaurantlabelmethod();
  			String wifilabelexcel = Excelreader.getData(0, 87, 1);
  			if (wifilabelhead.equals(wifilabelexcel)) {
  				test.pass("TC4: THE LABEL 'Core Restaurant Feedback' IS DISPLAYED ");
  			} else {
  				test.fail("TC4: THE LABEL 'Core Restaurant Feedback' IS NOT DISPLAYED");
  				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
  						+ "THE LABEL 'Core Restaurant Feedback' IS NOT DISPLAYED");
  			}
  		} catch (Exception e) {
  			test.fail("Error:" + e.getMessage());
  		}

  		// Core Restaurant Feedback click
  		try {
  			String corerestaurantclickhead = page.corerestaurantclickmethod();
  			String corerestaurantclickexcel = Excelreader.getData(0, 88, 1);
  			if (corerestaurantclickhead.equals(corerestaurantclickexcel)) {
  				test.pass("TC4: THE LANDING PAGE OF 'Core Restaurant Feedback' IS WORKING ");
  			} else {
  				test.fail("TC4:THE LANDING PAGE OF 'Core Restaurant Feedback' IS NOT WORKING");
  				test.fail(test.addScreenCaptureFromPath(Extentreport.getScreenshot(driver, "Footer_Navigation"))
  						+ "THE LANDING PAGE OF 'Core Restaurant Feedback' IS NOT WORKING");
  			}
  		} catch (Exception e) {
  			test.fail("Error:" + e.getMessage());
  		}
  	}     */
        				
      
}
    


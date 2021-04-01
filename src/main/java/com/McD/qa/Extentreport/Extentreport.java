
package com.McD.qa.Extentreport;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class Extentreport extends Formatter{
	
	public WebDriver driver;
	
	public  ExtentHtmlReporter htmlReporter;
	public  ExtentReports extent;
	public  ExtentTest test;
@BeforeTest
public void setExtent() throws IOException {	
	Formatter fmt = new Formatter();
	//htmlReporter =new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/My_Report.html");
	extent= new ExtentReports();
	htmlReporter = new ExtentHtmlReporter (System.getProperty("user.dir")+"/Reports/"+fmt.getDate()+"/" +"MCD-Report_"+fmt.getSystemDateTime()+".html");
	htmlReporter.config().setDocumentTitle("Automation Report");// Title of the report
	htmlReporter.config().setReportName("Regression testing");// Name of Report
	htmlReporter.config().setTheme(Theme.DARK);
	

	extent.attachReporter(htmlReporter);
	
	extent.setSystemInfo("Hostname", "LocalHost");
	extent.setSystemInfo("OS", "Window10");
	extent.setSystemInfo("Tester Name", "Chandana");
	extent.setSystemInfo("Browser", "Chrome");
     

	
}
@AfterTest
public void endreport() {
	extent.flush();
	//extent.close();
	
}
@AfterMethod
public void tearDown(ITestResult result)throws IOException {
	if (result.getStatus() == ITestResult.FAILURE) {
		test.log(Status.FAIL, "TEST CASE FAILED IS" +result.getName()); //TO ADD NAME IN EXTENT REPORT
		test.log(Status.FAIL, "TEST CASE FAILED IS" +result.getThrowable()); // TO ADD ERROR/EXCEPTION IN EXTENT REPORT
		
		String screenshotpath =Extentreport.getScreenshot(driver, result.getName());
		test.addScreenCaptureFromPath(screenshotpath);
		
	} else if (result.getStatus() == ITestResult.SKIP) {
		test.log(Status.SKIP,"Test Case SKIPPED IS " + result.getName());
	} else if(result.getStatus() == ITestResult.SUCCESS){
		test.log(Status.PASS,"Test Case PASSED IS " + result.getName());
		
	}
	
}

public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
	String dateName= new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source =ts.getScreenshotAs(OutputType.FILE);
	
	File destination = new File(System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateName + ".png");
	//File finalDestination = new  File(destination);
	FileUtils.copyFile(source, destination);
	return String.valueOf(destination);
	
}




		
	}




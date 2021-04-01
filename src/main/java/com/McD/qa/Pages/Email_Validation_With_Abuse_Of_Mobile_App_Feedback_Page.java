package com.McD.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Email_Validation_With_Abuse_Of_Mobile_App_Feedback_Page extends Basepage {
	
	public  Email_Validation_With_Abuse_Of_Mobile_App_Feedback_Page(WebDriver driver) { 
		super(driver);
	}
	@FindBy(xpath="//*[@id='mobile-device-type']")        //Mobile Device Type label path 
	WebElement clickmobiledevicetype;
	@FindBy(xpath="//*[@id='mobile-devicetype-1']")        //smart phone drop down value path  
	WebElement smartphonedropdownvalue;
	@FindBy(xpath="//*[@id='mobile-operating-system']")        // clcik MOBILE OPERATION SYSTEM path 
	WebElement clickmobileoperationsystem;
	@FindBy(xpath="//*[@id='mobile-operatingsystem-1']")        // clcik MOBILE OPERATION SYSTEM path   
	WebElement googleandroiddropdownvalue;
	@FindBy(xpath="//*[@id='mobile-app']")        //  click MOBILE  app version path 
	WebElement clickmobileappversion;
	@FindBy(xpath="//*[@id='enter_comments']")        //  click MOBILE  app version path 
	WebElement commetsclick;
	@FindBy(xpath="//*[@id='first_name']") //first name/
	WebElement firstnameclick;
	@FindBy(xpath="//*[@id='last_name']")
	WebElement lastnameclick;
	@FindBy(xpath="//*[@id='email']")  
	WebElement emailclick;
	@FindBy(xpath="//*[@id='confirm_email']") 
	WebElement confirmmailclick;
	@FindBy(xpath="//*[@name='phone']") 
	WebElement phonenumberclick;
	@FindBy(xpath="//*[@id='submit_form']") 
	WebElement submitclick;
	
	
	
	
	public String sumitmethod() { 
		this.click(submitclick);
		return this.getPageTitle();
	}
	public String phonenumberenteredvalue(String pnumber) {
		this.clearContent(phonenumberclick);
		this.sendKeys(this.phonenumberclick, pnumber);
		return this.getAtrributeValue(phonenumberclick);  
	}
	public String confirmmailenteredvalue(String entercomm) {
		this.clearContent(confirmmailclick);
		this.sendKeys(this.confirmmailclick, entercomm);
		return this.getAtrributeValue(confirmmailclick);  
	}
	public String emailenteredvalue(String entercomm) {
		this.clearContent(emailclick);
		this.sendKeys(this.emailclick, entercomm);
		return this.getAtrributeValue(emailclick);  
	}
	public String lastnameenterdvalue(String entercomm) {
		this.clearContent(lastnameclick);
		this.sendKeys(this.lastnameclick, entercomm);
		return this.getAtrributeValue(lastnameclick);  
	}
	public String finameEnteredvalue(String firname) {
		this.clearContent(firstnameclick);
		this.sendKeys(this.firstnameclick, firname);
		return this.getAtrributeValue(firstnameclick);  
	}
	public void commentspecialchaructermethod(String comment) { 
		this.clearContent(commetsclick);
		this.sendKeys(this.commetsclick, comment);
	}
	public String mobileversionsendmethod(String mobilever) { 
		this.clearContent(clickmobileappversion);
		this.sendKeys(this.clickmobileappversion, mobilever);
		return this.getAtrributeValue(clickmobileappversion);
	}
	public String googleandroiddropdownvaluemethod() {  
		this.click(clickmobileoperationsystem);
		this.click(googleandroiddropdownvalue);
		return this.getText(clickmobileoperationsystem); 
	}
	public String mobiledevicetypeclickable() {   
		this.click(clickmobiledevicetype);
		this.click(smartphonedropdownvalue);
		return this.getText(clickmobiledevicetype);  
	}
	public String generallgetpagetitlemethod() {  
		return this.getPageTitle();
	}
}

package com.McD.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Email_Validation_With_Abuse_Of_Restaurant_Feedback_Page extends Basepage {
	
	public  Email_Validation_With_Abuse_Of_Restaurant_Feedback_Page(WebDriver driver) { 
		super(driver);
	}
	@FindBy(xpath="//*[@id='submit_form']") 
	WebElement submitclick;
	@FindBy(xpath="//*[@id='enter_comments']") 
	WebElement commetsclick;
	@FindBy(xpath="//*[@id='can_not_find_location']")  // click on can_not_find_location path   
	WebElement contfindlocationclick;
	@FindBy(xpath="//*[@name='restAddress']")  // *Restaurant Address text path
	WebElement resraurantaddvalue;
	@FindBy(xpath="//*[@id='restAdd_label']")  // *Restaurant Address label path
	WebElement resraurantlabel;
	@FindBy(xpath="//*[@name='restCity']")  // CITY text path
	WebElement cityvalue;
	@FindBy(xpath="//*[@id='resturant_state']")  // state text path
	WebElement stateclick;
	@FindBy(xpath="//*[@id='restinfo-state-1']")  // state dropdown path
	WebElement stateclickdropdown;
	@FindBy(xpath="//*[@id='re-month']")      // visit date month 
	WebElement visitdatemothclick;
	@FindBy(xpath="//*[@id='March']")      // visit date month 
	WebElement monthdropdownclick;
	@FindBy(xpath="//*[@id='day']")      //  Day DROP DOWN 
	WebElement daycontfindclick;
	@FindBy(xpath="//*[@id='01']")      //  Day DROP DOWN value
	WebElement daycontfindcdropdownval;
	@FindBy(xpath="//*[@id='2019']")      //  year DROP DOWN value
	WebElement yearcontfinddropdownval;
	@FindBy(xpath="//*[@id='re-year']")      //  Day DROP DOWN 
	WebElement yearcontfindclick;
	@FindBy(xpath="//*[@id='radio-drive-trough-span']/preceding-sibling::input") // drive thru radio button path   
	WebElement drivethruradiobutton;
	@FindBy(xpath="//*[@id='first_name']") //first name
	WebElement firstnameclick;
	@FindBy(xpath="//*[@id='last_name']")
	WebElement lastnameclick;
	@FindBy(xpath="//*[@id='address']")
	WebElement addressclick;
	@FindBy(xpath="//*[@id='city']")   
	WebElement cityclick;
	@FindBy(xpath="//*[@id='state']")
	WebElement stateclick1;
	@FindBy(xpath="//*[@id='personalinfo-state-0']")
	WebElement statedropdownvalue;
	@FindBy(xpath="//*[@id='zip']")  
	WebElement zipclick;
	@FindBy(xpath="//*[@id='respTextYesSpan']/preceding-sibling::input")  //
	WebElement yesradiobuttonselect;
	@FindBy(xpath="//*[@id='email']")  
	WebElement emailclick;
	@FindBy(xpath="//*[@id='confirm_email']") 
	WebElement confirmmailclick;
	@FindBy(xpath="//*[@name='phone']") 
	WebElement phonenumberclick;
	
	
	
	
	
	
	public String phonenumberenteredvalue(String pnumber) {
		this.clearContent(phonenumberclick);
		this.sendKeys(this.phonenumberclick, pnumber);
		return this.getAtrributeValue(phonenumberclick);
	}
	public String confirmmailenteredvalue(String entercomm) { 
		this.click(confirmmailclick);
		this.sendKeys(this.confirmmailclick, entercomm);
		return this.getAtrributeValue(confirmmailclick);
	}
	public String mailsendmethod(String entercomm) { 
		this.click(emailclick);
		this.sendKeys(this.emailclick, entercomm);
		return this.getAtrributeValue(emailclick);
	}
	public String Yesradiobuttonselectmethod() {
		this.click(yesradiobuttonselect);
		return this.getAtrributeValue1(yesradiobuttonselect);  
	}
	public String zipenteredvalue(String entercomm) {
		this.clearContent(zipclick);
		this.sendKeys(this.zipclick, entercomm);
		return this.getAtrributeValue(zipclick);  
	}
	public String stateselecteddropdownvalmethod() {
		this.click(stateclick1);
		this.click(statedropdownvalue);
		return this.getText(stateclick1);  
	}
	public String cityenteredvalue(String entercomm) {
		this.clearContent(cityclick);
		this.sendKeys(this.cityclick, entercomm);
		return this.getAtrributeValue(cityclick);
	}
	public String addressenterdlabel(String entercomm) {
		this.clearContent(addressclick);
		this.sendKeys(this.addressclick, entercomm);
		return this.getAtrributeValue(addressclick);
	}
	public String LNsendvaluemethod(String entercomm) {
		this.clearContent(lastnameclick);
		this.sendKeys(this.lastnameclick, entercomm);
		return this.getAtrributeValue(lastnameclick);
	}
	public String firstnameM(String firname) {
		this.clearContent(firstnameclick);
		this.sendKeys(this.firstnameclick, firname);
		return this.getAtrributeValue(firstnameclick);
	}
	public String driveradiobuttonselectedmethod() {
		this.click(drivethruradiobutton);
		return this.getAtrributeValue1(drivethruradiobutton);  
	}
	public String yearsendedvaluemethod() {
		this.click(yearcontfindclick);
		this.click(yearcontfinddropdownval);
		return this.getText(yearcontfindclick);  
	}
	public void yearselectdropdownvaluemethod() {
		 this.click(yearcontfinddropdownval);  
	}
	public String daysendedvaluemethod() {  
		this.click(daycontfindclick);
		this.click(daycontfindcdropdownval);
		return this.getText(daycontfindclick);  
	}
	public String visitdatemothsendvaluemethod() {
		this.click(visitdatemothclick);
		this.click(monthdropdownclick);
		return this.getText(visitdatemothclick);  
	}
	public String statecontfindsendedvaluemethod() {
		this.click(stateclick);
		this.click(stateclickdropdown);
		return this.getText(stateclick);  
	}
	public String cityvaluemethod(String CITY) {
		this.clearContent(cityvalue);
		 this.sendKeys(this.cityvalue, CITY);
		return this.getAtrributeValue(cityvalue);  
	}
	public String resraurantaddvaluemethod(String rearaddress) {
		 this.clearContent(resraurantaddvalue);
		 this.sendKeys(this.resraurantaddvalue, rearaddress);
		return this.getAtrributeValue(resraurantaddvalue);  
	}
	public String contfindlocationclickmethod() {
		 this.click(contfindlocationclick);
		 return this.getText(resraurantlabel);
	}
	public void commentspecialchaructermethod(String comment) { 
		this.clearContent(commetsclick);
		this.sendKeys(this.commetsclick, comment);
	}
	public String sumitmethod() { 
		this.click(submitclick);
		return this.getPageTitle();
	}
	public String generallgetpagetitlemethod() {  
		return this.getPageTitle();
	}
}

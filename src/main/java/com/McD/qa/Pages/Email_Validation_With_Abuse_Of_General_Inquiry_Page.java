package com.McD.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Email_Validation_With_Abuse_Of_General_Inquiry_Page extends Basepage {
	
	public  Email_Validation_With_Abuse_Of_General_Inquiry_Page(WebDriver driver) { 
		super(driver);
	}
	@FindBy(xpath="//*[@name='about']")
	WebElement clickseleoneoption;
	@FindBy(xpath="//*[@name='about']/option[3]")  
	WebElement selemarketgame;
	@FindBy(xpath="//*[@name='formData1']")
	WebElement entercomspecharacter;
	@FindBy(xpath="//*[@name='firstName']") //first name
	WebElement firstname;
	@FindBy(xpath="//*[@name='lastName']")
	WebElement lastnameclick;
	@FindBy(xpath="//*[@name='custAddr1']")
	WebElement addressclick;
	@FindBy(xpath="//*[@name='apt']")
	WebElement aptsuiteclick;
	@FindBy(xpath="//*[@name='city']")   //span[contains(text(),'*State')]
	WebElement cityclick;
	@FindBy(xpath="//*[@name='state']")
	WebElement stateclick;
	@FindBy(xpath="//*[@name='state']/option[2]")
	WebElement statedropdownvalue;
	@FindBy(xpath="//*[@name='zip']")  
	WebElement zipclick;
	@FindBy(xpath="//*[@name='email']")  
	WebElement emailclick;
	@FindBy(xpath="//*[@name='confEmail']") 
	WebElement confirmmailclick;
	@FindBy(xpath="//*[@name='phone']") 
	WebElement phonenumberclick;
	
	public String phonenumbersendedvaluemethod(String pnumber) {
		this.clearContent(phonenumberclick);
		this.sendKeys(this.phonenumberclick, pnumber);
		return this.getAtrributeValue(phonenumberclick);
	}
	public String confirmmailsendidmethod(String entercomm) { 
		this.clearContent(confirmmailclick);
		this.sendKeys(this.confirmmailclick, entercomm);
		return this.getAtrributeValue(confirmmailclick);
	}
	public String mailsendmethod(String entercomm) { 
		 this.clearContent(emailclick);
		this.sendKeys(this.emailclick, entercomm);
		return this.getAtrributeValue(emailclick);
	}
	public String zipsendedvaluemethod(String entercomm) { 
		this.clearContent(zipclick);
		this.sendKeys(this.zipclick, entercomm);
		return this.getAtrributeValue(zipclick);
	}
	public String stateselectedvaluemethod() {
		 this.click(stateclick);
		this.click1(statedropdownvalue);
		return this.getText(stateclick);  
	}
		public String citysendedvaluemethod(String entercomm) {
		 this.clearContent(cityclick);
		this.sendKeys(this.cityclick, entercomm);
		return this.getAtrributeValue(cityclick);
	}
	public String aptsuitsendedvaluemethod(String entercomm) {
		this.clearContent(aptsuiteclick);
		this.sendKeys(this.aptsuiteclick, entercomm);
		return this.getAtrributeValue(aptsuiteclick);
	}
	public String addresssendedvaluemethod(String entercomm) {
		this.clearContent(addressclick);
		this.sendKeys(this.addressclick, entercomm);
		return this.getAtrributeValue(addressclick);
	}
	public String lastnameenterdvalue(String entercomm) {
		this.clearContent(lastnameclick);
		this.sendKeys(this.lastnameclick, entercomm);
		return this.getAtrributeValue(lastnameclick);
	}
	public String finameEnteredvalue(String firname) {
		this.clearContent(firstname);
		this.sendKeys(this.firstname, firname);
		return this.getAtrributeValue(firstname);
	}
	public String commentspecialchaructermethod(String entercomm) {
		this.clearContent(entercomspecharacter);
		this.sendKeys(this.entercomspecharacter, entercomm);
		return this.getAtrributeValue(entercomspecharacter);
	}
	public String selectmarketgeamemethod() {
		 this.click(selemarketgame);
		 return this.getText(clickseleoneoption);
	}
	
	
	public String selecoptionclickmethod12() {
		this.click(clickseleoneoption);
		this.click(selemarketgame);
		 return this.getText(clickseleoneoption);
	}
	public String generallgetpagetitlemethod() {  
		return this.getPageTitle();
	}	

}

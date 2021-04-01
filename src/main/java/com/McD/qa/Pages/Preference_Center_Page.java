package com.McD.qa.Pages;

import org.apache.log4j.or.ThreadGroupRenderer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Preference_Center_Page extends Basepage {
	
	public  Preference_Center_Page(WebDriver driver) { 
		super(driver);
	}
	@FindBy(xpath="//html/body/div[1]/div[1]/div/button") 
	WebElement cancelbutton;
	@FindBy(xpath="//div[@class='secondary__links']/div/ul/li[2]/a") 
	WebElement joinuslabel;
	@FindBy(xpath="//*[@id='header-join-us-modal']/div/h2") 
	WebElement signupto;
	@FindBy(xpath="//*[@id='header-join-us-modal']/div/p") 
	WebElement getdealsinformation;
	@FindBy(xpath="//*[@id='topnav-email-desktop']/p[1]") 
	WebElement indicatesarequiredlabel;
	@FindBy(xpath="//*[@id='subscribe_email_label']") 
	WebElement emaillabel;
	@FindBy(xpath="//*[@id='subscribe_zip_label']") 
	WebElement zipcodelabel;
	@FindBy(xpath="//*[@id='joinus_email']") 
	WebElement emailclick;
	@FindBy(xpath="//*[@id='zipcode']") 
	WebElement zipcodeclick;
	@FindBy(xpath="//*[@id='submit_form1']") 
	WebElement signupbutton;
	@FindBy(xpath="//*[@id='global_err_subscribe']") 
	WebElement globalerrormsg;
	@FindBy(xpath="//*[@class='topnaverr topnavemailerr']") 
	WebElement emailerrormsg;
	@FindBy(xpath="//*[@id='topnavziperr_joinus']") 
	WebElement zipcodeerrormsg;
	@FindBy(xpath="//*[@class='topnaverr topnavjoinerr']") 
	WebElement emailregisterederrormsg;
	@FindBy(xpath="//*[@id='joinus_thanks']/div/h2") 
	WebElement thanksforsubscribe;
	@FindBy(xpath="//*[@class='people-story popupInfo pc_txt_align']") 
	WebElement byselectingsignup;
	@FindBy(xpath="//*[@class='people-story popupInfo pc_txt_align']/a/u") 
	WebElement privacypolicy;
	@FindBy(xpath="//*[@class='people-story popupInfo pc_txt_align']/a[2]/u") 
	WebElement termsandcondition;
	@FindBy(xpath="//*[@class='mcd-publication__body']/div/div/h1") 
	WebElement yourconnectedlabel;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div/section/div/ul/li/div/div/div/div[2]/h2/span") 
	WebElement getgreatdealsonlabel;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div/section/div/ul/li/div/div/div/div[2]/P") 
	WebElement wantthelatestscooplabel;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div/section/div/ul/li/div/div/div/div[2]/a/span") 
	WebElement joinouremaillist;
	
	
	
	
	
	public String joinouremaillistmethod()  {
		return this.getText(joinouremaillist);
	}
	public String wantthelatestscooplabelmethod()  {
		return this.getText(wantthelatestscooplabel);
	}
	public String getgreatdealsonlabelmethod()  {
		return this.getText(getgreatdealsonlabel);
	}
	public String yourconnectedlabelmethod()  {
		return this.getText(yourconnectedlabel);
	}
	public String termsandconditionmethod() throws Exception {
		this.click(termsandcondition);
		this.windowhandles();
		return this.getPageTitle();
	}
	public String privacypolicymethod() throws Exception {
		this.click(privacypolicy);
		this.windowhandles();
		return this.getPageTitle();
	}
	public String byselectingsignupmethod() throws Exception {
		this.waitForElementToBeVisible1(byselectingsignup);
		return this.getText(byselectingsignup);
	}
	public String zipsendedvaluthanksmethod(String input) throws Exception {
		this.sendKeys(this.zipcodeclick, input);
		this.click(signupbutton);
		this.waitForElementToBeVisible1(thanksforsubscribe);
	    Thread.sleep(10000);
	    try {
		this.click(cancelbutton);
	    }catch (Exception e) {
			
		}
		return this.getText(thanksforsubscribe);
	}
	public String emailsendthanksmethod(String input) throws Exception {
		driver.navigate().refresh();
		Thread.sleep(10000);
		try {
		this.waitForElementToBeVisible1(cancelbutton);
		this.click(cancelbutton);
		}catch (Exception e) {
			
		}
		this.clearContent(emailclick);
		this.sendKeys(this.emailclick, input);
		return this.getAtrributeValue(emailclick);
	}
	public String zipsendedvalumethod1(String input) throws Exception {
		driver.navigate().refresh();
		Thread.sleep(10000);
		try {
		this.waitForElementToBeVisible1(cancelbutton);
		this.click(cancelbutton);
		}catch (Exception e) {
			
		}
		this.clearContent(zipcodeclick);
		this.sendKeys(this.zipcodeclick, input);
		this.click(signupbutton);
		return this.getText(zipcodeerrormsg);
	}
	public String zipsendedvalumethod(String input) throws Exception {
		this.clearContent(zipcodeclick);
		this.sendKeys(this.zipcodeclick, input);
		return this.getAtrributeValue(zipcodeclick);
	}
	public String emailsendcharatersmethod1(String input) throws Exception {
		this.clearContent(emailclick);
		this.sendKeys(this.emailclick, input);
		return this.getAtrributeValue(emailclick);
	}
	public String emailsendcharatersmethod(String input) throws Exception {
		driver.navigate().refresh();
		Thread.sleep(10000);
		try {
		this.waitForElementToBeVisible1(cancelbutton);
		this.click(cancelbutton);
		}catch (Exception e) {
			
		}
		this.clearContent(emailclick);
		this.sendKeys(this.emailclick, input);
		return this.getAtrributeValue(emailclick);
	}
	public String emailregisterederrormsgmethod1(String input) throws Exception {
		this.sendKeys(this.zipcodeclick, input);
		this.click(signupbutton);
		waitForElementToBeVisible1(emailregisterederrormsg);
		return this.getText(emailregisterederrormsg);
	}
	public String emailregisterederrormsgmethod(String input) throws Exception {
		driver.navigate().refresh();
		Thread.sleep(6000);
		try {
		this.waitForElementToBeVisible1(cancelbutton);
		this.click(cancelbutton);
		}catch (Exception e) {
			
		}
		this.sendKeys(this.emailclick, input);
		return this.getAtrributeValue(emailclick);
	}
	public String zipcodeerrormsgmethod1() {
		return this.getText(zipcodeerrormsg);
	}	
	public String emailerrormsgmethod1(String email) throws Exception {
		driver.navigate().refresh();
		Thread.sleep(6000);	
		try {
		this.click(cancelbutton);
		}catch (Exception e) {
			
		}
		this.sendKeys(this.emailclick, email);
		this.sendKeys(this.zipcodeclick, email);
		this.click(signupbutton);
		return this.getText(emailerrormsg);
	}
	public String zipcodeerrormsgmethod() {
		return this.getText(zipcodeerrormsg);
	}
	public String emailerrormsgmethod() {
		return this.getText(emailerrormsg);
	}
	public String globalerrormethod() throws Exception {
		this.click(signupbutton);
		Thread.sleep(3000);
		return this.getText(globalerrormsg);
	}
	public void signupbuttonmethod() {
		this.enablebuttons(signupbutton);
	}
	public String zipcodelabelmethod1() {
		this.click(zipcodeclick);
		return this.getText(zipcodelabel);
	}
	public String emaillabelmethod1() { 
		this.click(emailclick);
		return this.getText(emaillabel);
	}
	public String zipcodelabelmethod() { 
		return this.getText(zipcodelabel);
	}
	public String emaillabelmethod() { 
		return this.getText(emaillabel);
	}
	public String indicatesarequiredlabelmethod() { 
		return this.getText(indicatesarequiredlabel);
	}
	public String getdealsinformationmethod() { 
		return this.getText(getdealsinformation);
	}
	public String singuptolabelmethod() { 
		return this.getText(signupto);
	}
	public String joinuslinkmethod() throws Exception { 
		this.click(joinuslabel);
		Thread.sleep(3600);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(signupto);
	}
	public String joinuslinkmethod1() throws Exception { 
		Thread.sleep(3600);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		this.click(joinuslabel);
		Thread.sleep(3600);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(signupto);
	}
	public String joinusmethodsp() throws Exception { 
		Thread.sleep(3500);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(joinuslabel);  
	}
	public String generallgetpagetitlemethod() {  
		return this.getPageTitle();
	}
}

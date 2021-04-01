package com.McD.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class General_Inqure_Page extends Basepage {
	
	
	
	public  General_Inqure_Page(WebDriver driver) {
		super(driver);
//		PageFactory.initElements(driver, this);
	}
	//GENERAL INQUIRY PATH
	@FindBy(xpath="//*[@id='reset_focus']/h1")
	 WebElement generalinquirey;
	@FindBy(xpath="//*[@id='reset_focus']/p")
	 WebElement havalabbel;
	@FindBy(xpath="//*[@id='select_topic']") //click pick a different topic
	 WebElement clickPdt;
	@FindBy(xpath="//span[contains(text(),'Pick a different topic')]")//select lable name 
	 WebElement labelpickdift;
	@FindBy(xpath="//li[contains(text(),'Contact Us + FAQs')]")//select dropdown value 
	WebElement cintactuspaQ;
	
	@FindBy(xpath="//*[@id='topicgo']")//go button
	WebElement clickgobutton;
	@FindBy(xpath="//*[@id='first-name-error']")
	 WebElement finamerror;
	@FindBy(xpath="//*[@id='submit_form']")
	WebElement submitGE;
	/*@FindBys(xpath="//*[@class='custom_dropdown_list']") // drop down respective value 
	WebElement picvalue;*/
	@FindBys(@FindBy(xpath="//*[@class='custom_dropdown_list']"))
	WebElement picvalue;
	@FindBy(xpath="//h1[contains(text(),'Contact Us')]")
	WebElement contacthead;
	@FindBy(xpath="//li[contains(text(),'Mobile App Feedback')]") //mobile app feedback dropdown path
	WebElement mobileapppath;
	@FindBy(xpath="//h1[contains(text(),'Mobile App Feedback')]")	//mobile app feedback heading path	
	WebElement mobilehead;
	@FindBy(xpath="//li[contains(text(),'Restaurant Feedback')]") //Restaurant Feedback dropdown path
	WebElement Restaurentdropdown;
	@FindBy(xpath="//h1[contains(text(),'Restaurant Feedback')]")  //restaurant feedback heading path
	WebElement restaurenthead;
	@FindBy(xpath="//li[contains(text(),'Trademark Permission')]")  //trademark permision dropdown path
	WebElement trademarkdropdown;
	@FindBy(xpath="//h1[contains(text(),'Trademark Permission')]")  // trademark permision heading path
	WebElement trademarkhead;
	@FindBy(xpath="//*[@id='variation-comp']/div/div/h2") //we want to hear from you path
	WebElement wewanthearlabel;  
	@FindBy(xpath="//*[@id='variation-comp']/div/div/p") //plese provide a few details below path
	WebElement pleaseprovidelabel;
	@FindBy(xpath="//*[@id='contactus']/div[2]/div/p[1]") // indicates a required field label path
	WebElement indicaterequirelabel;
	@FindBy(xpath="//*[@id='wtaInfoHeading']") //what is this about path
	WebElement whatthisabout;  
	@FindBy(xpath="//*[@id='issue-type']/div[1]/div/h2[2]")  //choose one of the following path
	WebElement choosefollwing;
	@FindBy(xpath="//*[@id='select-option-label']")
	WebElement seleoneoption;
	@FindBy(xpath="//*[@id='select-option']")
	WebElement clickseleoneoption;
	@FindBy(xpath="//*[@id='issuetype-catdd-1']")  
	WebElement selemarketgame;
	@FindBy(xpath="//h2[contains(text(),'Tell us about it')]")
	WebElement tellusabout;
	@FindBy(xpath="//*[@id='enter_comments_label']") // enter your comments(0/1200) path
	WebElement entercomments;
	@FindBy(xpath="//*[@name='comments']")
	WebElement etercommentclick;
	@FindBy(xpath="//*[@name='comments']")
	WebElement entercomspecharacter;
	@FindBy(xpath="//*[@name='comments']")
	WebElement entercomnumarical;
	@FindBy(xpath="//*[@name='comments']")
	WebElement entercomcharecters;
	@FindBy(xpath="//*[@id='enter-comments-error']") // comment error message
	WebElement commenterromessage;
	@FindBy(xpath="//*[@id='personalinfoSecHeading']")
	WebElement telusabout;
    @FindBy(xpath="//*[@id='openContactusFormPopup']") //reset button
    WebElement resetbutton;
	@FindBy(xpath="//button[contains(text(),'Yes')]") //yes button 
	WebElement yespoppupbutton;
	@FindBy(xpath="//*[@id='globalError-form']")
	WebElement totalerromessage;  //
	@FindBy(xpath="//*[@id='first_name_label']") //FIRST NAME LABEL PATH 
	WebElement firstnamelabel;
	@FindBy(xpath="//*[@id='first_name']") //first name
	WebElement firstname;
	@FindBy(xpath="//*[@id='first_name']") //first name
	WebElement firstnameclick;
	@FindBy(xpath="//*[@id='last_name_label']") //last name
	WebElement lastnamelabel;
	@FindBy(xpath="//*[@id='last_name']")
	WebElement lastnameclick;
	@FindBy(xpath="//*[@id='last-name-error']")
	WebElement lastnameerrormess;  
	@FindBy(xpath="//*[@id='address-label']") //address label path  
	WebElement addresslabel; 
	@FindBy(xpath="//*[@id='address']")
	WebElement addressclick; 
	@FindBy(xpath="//*[@id='address-error']")
	WebElement addresserrormessage;
	@FindBy(xpath="//*[@id='apt_suit_label']")  //APT/SUITE PATH   
	WebElement aptsuitelabel;
	@FindBy(xpath="//*[@id='apt_suit']")
	WebElement aptsuiteclick;
	@FindBy(xpath="//*[@id='city_label']")  //city label path  
	WebElement citylabel;
	@FindBy(xpath="//*[@id='city']")   //span[contains(text(),'*State')]
	WebElement cityclick;  
	@FindBy(xpath="//*[@id='city-error']")
	WebElement cityerrormessage;
	@FindBy(xpath="//*[@id='state-label']") //state label path  
	WebElement statelabel;  
	@FindBy(xpath="//*[@id='state']")
	WebElement stateclick;
	@FindBy(xpath="//*[@id='personalinfo-state-0']")
	WebElement statedropdownvalue;
	@FindBy(xpath="//*[@id='state-error']")  
	WebElement stateerrormessage;
	@FindBy(xpath="//*[@id='zip-label']")  //zip label path 
	WebElement ziplabel;
	@FindBy(xpath="//*[@id='zip']")  
	WebElement zipclick;
	@FindBy(xpath="//*[@name='zip']")  
	WebElement zipclear;
	
	
	@FindBy(xpath="//*[@id='zip-error']")  
	WebElement ziperrormessage;
	@FindBy(xpath="//*[@id='email_label']")   //email label path   
	WebElement emaillabel;
	@FindBy(xpath="//*[@id='email']")  
	WebElement emailclick;
	@FindBy(xpath="//*[@id='email-error']")  
	WebElement emailerrormessage;
	@FindBy(xpath="//*[@id='confirm_email_label']")  //confirm mail label path
	WebElement confirmemaillabel;
	@FindBy(xpath="//*[@id='confirm_email']") 
	WebElement confirmmailclick;
	@FindBy(xpath="//*[@id='conf-email-error']") 
	WebElement confirmmailerrormessage;
	@FindBy(xpath="//*[@id='phone_label_personal']")  //phone number label path  
	WebElement phonenumberlabel;
	@FindBy(xpath="//*[@name='phone']") 
	WebElement phonenumberclick;
	@FindBy(xpath="//*[@name='phone']") 
	WebElement phonesend;
	@FindBy(xpath="//*[@id='phone-number-error']")  //*[@id="recaptcha-anchor"]
	WebElement phonenumbererrormessage;
	@FindBy(xpath="//*[@id='recaptcha-anchor']/div[1]") 
	WebElement recapcharcheckbox;
	@FindBy(xpath="//*[contains(text(),'Thank You!')]") 
	WebElement thankstest;
	@FindBy(xpath="//*[@id='contactus']/div[5]/div/div[1]/div/p[2]") 
	WebElement byselectingsubmit;
	@FindBy(xpath="//*[@id='contactus']/div[5]/div/div[1]/div/p[3]") 
	WebElement wemaycontactlabel;
	@FindBy(xpath="//*[@id='contactus']/div[5]/div/div[1]/div/p[2]/a") 
	WebElement privacypolicy;
	@FindBy(xpath="//h2[contains(text(),'Leaving McDonald')]") 
	WebElement privacypolicypopup;
	@FindBy(xpath="//*[@id='leavingCancel']") 
	WebElement canclebutton;
	@FindBy(xpath="//html/body/header/nav/div[2]/div/div[2]/div[1]/ul/li[3]/a") 
	WebElement headercareerslabel;
	@FindBy(xpath="//*[@id='mcd-legal-bumper-title-id']") 
	WebElement leavingmcdonaldsheading;
	@FindBy(xpath="//*[@id='leavingCancel']") 
	WebElement leavingcancelbutton;
	@FindBy(xpath="//*[@id='bumper-continue']") 
	WebElement leavingcontinuebutton;
	@FindBy(xpath="//*[@id='onetrust-close-btn-container']/button") 
	WebElement cancelbutton;
	@FindBy(xpath="//html/body/footer/nav/div/div[2]/h2/a") 
	WebElement footercareerslabel;
	@FindBy(xpath="//html/body/footer/nav[1]/div/div[2]/ul/li[1]/a") 
	WebElement footereducationlabel;
	@FindBy(xpath="//html/body/footer/nav[1]/div/div[2]/ul/li[2]/a") 
	WebElement Footeremployeelabel;
	@FindBy(xpath="//html/body/footer/nav[1]/div/div[2]/ul/li[3]/a") 
	WebElement Footermeetourpeoplelabel;
	@FindBy(xpath="//html/body/footer/nav[1]/div/div[2]/ul/li[4]/a") 
	WebElement Footerforourveteranslabel;
	@FindBy(xpath="//html/body/footer/nav[1]/div/div[2]/ul/li[5]/a") 
	WebElement Footerworkingwithuslabel;
	@FindBy(xpath="//html/body/footer/nav[1]/div/div[2]/ul/li[6]/a") 
	WebElement Footerapplynowlabel;
	
	
	
	
	
	
	
	public String footerapplynowclickmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
		this.click(cancelbutton);
		}catch (Exception e) {
			
		}
		waitForElementToBeVisible1(Footerapplynowlabel);
		this.click(Footerapplynowlabel);
		this.click(leavingcontinuebutton);
		return this.getPageTitle();
	}
	public String leavingcancelbuttonapplynowmethod() { 
		this.click(leavingcancelbutton);
		return this.getText(leavingmcdonaldsheading);
	}
	public String Footerapplynowclickmethod() { 
		this.click(Footerapplynowlabel);
		return this.getText(leavingmcdonaldsheading);
	}
	public String Footerapplynowlabelmethod() throws Exception {
		Thread.sleep(3400);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(Footerapplynowlabel);
	}	
	public String footerworkingwithusclickmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(Footerworkingwithuslabel);
		this.click(Footerworkingwithuslabel);
		this.click(leavingcontinuebutton);
		return this.getPageTitle();
	}
	public String leavingcancelbuttonworkingwithusmethod() { 
		this.click(leavingcancelbutton);
		return this.getText(leavingmcdonaldsheading);
	}
	public String Footerworkingwithusclickmethod() { 
		this.click(Footerworkingwithuslabel);
		return this.getText(leavingmcdonaldsheading);
	}
	public String Footerworkingwithuslabelmethod() throws Exception {
		Thread.sleep(3400);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(Footerworkingwithuslabel);
	}
	public String footerforourveteransclickmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(Footerforourveteranslabel);
		this.click(Footerforourveteranslabel);
		this.click(leavingcontinuebutton);
		return this.getPageTitle();
	}
	public String leavingcancelbuttonforourveteransmethod() { 
		this.click(leavingcancelbutton);
		return this.getText(leavingmcdonaldsheading);
	}
	public String Footerforourveteransclickmethod() { 
		this.click(Footerforourveteranslabel);
		return this.getText(leavingmcdonaldsheading);
	}
	public String Footerforourveteranslabelmethod() throws Exception {
		Thread.sleep(3400);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(Footerforourveteranslabel);
	}
	public String footermeetourpeopleclickmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(Footermeetourpeoplelabel);
		this.click(Footermeetourpeoplelabel);
		this.click(leavingcontinuebutton);
		return this.getPageTitle();
	}
	public String leavingcancelbuttonmeetourpeoplemethod() { 
		this.click(leavingcancelbutton);
		return this.getText(leavingmcdonaldsheading);
	}
	public String Footermeetourpeopleclickmethod() { 
		this.click(Footermeetourpeoplelabel);
		return this.getText(leavingmcdonaldsheading);
	}
	public String Footeremeetourpeoplelabelmethod() throws Exception {
		Thread.sleep(3400);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(Footermeetourpeoplelabel);
	}
	public String footeremployeeclickmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(Footeremployeelabel);
		this.click(Footeremployeelabel);
		this.click(leavingcontinuebutton);
		return this.getPageTitle();
	}
	public String leavingcancelbuttonemployeemethod() { 
		this.click(leavingcancelbutton);
		return this.getText(leavingmcdonaldsheading);
	}
	public String Footeremployeeclickmethod() { 
		this.click(Footeremployeelabel);
		return this.getText(leavingmcdonaldsheading);
	}
	public String Footeremployeelabelmethod() throws Exception {
		Thread.sleep(3400);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(Footeremployeelabel);
	}
	
	public String footereducationclickmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(footereducationlabel);
		this.click(footereducationlabel);
		this.click(leavingcontinuebutton);
		return this.getPageTitle();
	}
	public String leavingcancelbuttoneducationmethod() { 
		this.click(leavingcancelbutton);
		return this.getText(leavingmcdonaldsheading);
	}
	public String Footereducationclickmethod() { 
		this.click(footereducationlabel);
		return this.getText(leavingmcdonaldsheading);
	}
	public String Footereducationlabelmethod() throws Exception {
		Thread.sleep(3400);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(footereducationlabel);
	}
	public String footercareersclickmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(footercareerslabel);
		this.click(footercareerslabel);
		this.click(leavingcontinuebutton);
		return this.getPageTitle();
	}
	public String leavingcancelbuttonfootermethod() { 
		this.click(leavingcancelbutton);
		return this.getText(leavingmcdonaldsheading);
	}
	public String Footercareersclickmethod() { 
		this.click(footercareerslabel);
		return this.getText(leavingmcdonaldsheading);
	}
	public String Footercareerslabelmethod() throws Exception {
		Thread.sleep(3400);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(footercareerslabel);
	}
	public String headercareersclickmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		this.click(headercareerslabel);
		this.click(leavingcontinuebutton);
		return this.getPageTitle();
	}
	public String leavingcancelbuttonmethod() { 
		this.click(leavingcancelbutton);
		return this.getText(leavingmcdonaldsheading);
	}
	public String headercareersclickmethod() { 
		this.click(headercareerslabel);
		return this.getText(leavingmcdonaldsheading);
	}
	public String headercareerslabelmethod() throws Exception {
		Thread.sleep(3000);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(headercareerslabel);
	}
	public void canclebuttonmethod() {
		   this.click(canclebutton);
			}
	public String privacypolicypopupmethod() { 
		return this.getText(privacypolicypopup);
	}
	public String privacypolicyclickmethod() {
		   this.click(privacypolicy);
		   //this.click(leavingcontinuebutton);
		  // windowhandles();
		   return this.getPageTitle();
			}
	public String privacypolicyclickmethod1() {
		   this.click(privacypolicy);
		   //this.click(leavingmcdonaldsheading);
		  // windowhandles();
		   return this.getText(leavingmcdonaldsheading);
			}
	
	public String leavingcancelbuttonprivacyemethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(privacypolicy);
		this.click(privacypolicy);
		this.click(leavingcancelbutton);
		return this.getText(leavingmcdonaldsheading);
			}
	public String wemaycontactlabelmethod() { 
		return this.getText(wemaycontactlabel);
	}
	public String byselectingsubmitmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitGE);
		return this.getText(byselectingsubmit);
	}
	public String thankstestmethod() { 
		return this.getText(thankstest);
	}
	public void recapcharcheckboxmehod() {
		   this.click(recapcharcheckbox);
			}
	public String phonenumbererrormessagemethod() { 
		this.click(submitGE);
		return this.getText(phonenumbererrormessage);
	}
	public String phonenumbererrormessagemethod1() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitGE);
		this.click(submitGE);
		return this.getText(phonenumbererrormessage);
	}
	public String phonenumbersendedvaluemethod(String pnumber) {
		this.clearContent(phonenumberclick);
		this.sendKeys(this.phonesend, pnumber);
		return this.getAtrributeValue(phonenumberclick);
	}
	public void phonenumberclearmethod() {
		   this.clearContent(phonenumberclick);
			}
	public String phonenumberlabelmethod1() {
		 this.click(phonenumberclick);
		return this.getText(phonenumberlabel);
	}
	public String phonenumberlabelmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitGE);
		return this.getText(phonenumberlabel);
	}
	public String confirmmailerrormessmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitGE);
		this.clearContent(confirmmailclick);
		this.click(submitGE);
		return this.getText(confirmmailerrormessage);
	}
	public String confirmmailerrormessmethod1() throws Exception { 
		this.click(submitGE);
		return this.getText(confirmmailerrormessage);
	}
	public String confirmmailsendidmethod(String entercomm) { 
		this.clearContent(confirmmailclick);
		this.sendKeys(this.confirmmailclick, entercomm);
		return this.getAtrributeValue(confirmmailclick);
	}
	public String confirmmaillabelmethod1() { 
		this.click(confirmmailclick);
		return this.getText(confirmemaillabel);
	}
	public String confirmmaillabelmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitGE);
		return this.getText(confirmemaillabel);
	}
	public String emailerrormessagemethod() { 
		this.click(confirmmailclick);
		return this.getText(emailerrormessage);
	}
	public String emailerrormessagemethod1() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitGE);
		this.clearContent(emailclick);
		this.click(submitGE);
		return this.getText(emailerrormessage);
	}
	public void mailsendmethod1(String entercomm) { 
		 this.clearContent(emailclick);
		this.sendKeys(this.emailclick, entercomm);
	}
	public String mailsendmethod(String entercomm) { 
		 this.clearContent(emailclick);
		this.sendKeys(this.emailclick, entercomm);
		return this.getAtrributeValue(emailclick);
	}
	public String emaillabelmethod1() { 
		 this.click(emailclick);
		return this.getText(emaillabel);
	}
	public String emaillabelmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitGE);
		return this.getText(emaillabel);
	}
	public String ziperrormessagemethod1() throws Exception { 
		this.click(submitGE);
		this.scrollTo(firstname);
		return this.getText(ziperrormessage);
	}
	public String ziperrormessagemethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitGE);
		this.clearContent(zipclick);
		this.click(submitGE);
		this.scrollTo(firstname);
		return this.getText(ziperrormessage);
	}
	public String zipsendedvaluemethod(String entercomm) { 
		this.clearContent(zipclick);
		this.sendKeys(this.zipclick, entercomm);
		return this.getAtrributeValue(zipclick);
	}
	public void zipspecialcharactermethod(String entercomm) {
		this.sendKeys(this.zipclick, entercomm);
	}
	public void zipcharactermethod(String entercomm) {
		this.sendKeys(this.zipclick, entercomm);
	}
	public String ziplabelmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(ziplabel);
		return this.getText(ziplabel);
	}
	public String ziplabelmethod1() { 
		 this.click(zipclick);
		return this.getText(ziplabel);
	}
	public String stateerrormessagemethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitGE);
		this.click(submitGE);
		this.scrollTo(firstname);
		return this.getText(stateerrormessage);
	}
	public String statedropdownvaluemethod() {
		   return this.getText(statedropdownvalue);
		   
			}
	public String statedropdownvaluemethod1() {
		this.click(stateclick);
		   return this.getText(statedropdownvalue);
		   
			}
	public String stateselectedvaluemethod() {
		this.click(statedropdownvalue);
		return this.getText(stateclick);  
	}
	public String statelabelmethod1() { 
		 this.click(stateclick);
		return this.getText(statelabel);
	}
	public String statelabelmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitGE);
		return this.getText(statelabel);
	}
	public String cityerrormessagemethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitGE);
		this.click(submitGE);
		this.scrollTo(firstname);
		return this.getText(cityerrormessage);
	}
	public String citysendedvaluemethod(String entercomm) {
		 this.clearContent(cityclick);
		this.sendKeys(this.cityclick, entercomm);
		return this.getAtrributeValue(cityclick);
	}
	public void citycharactermethod(String entercomm) {
		this.sendKeys(this.cityclick, entercomm);
	}
	public void cityspecialcharmethod(String entercomm) {
		this.sendKeys(this.cityclick, entercomm);
	}
	public String citylabelmethod1() { 
		 this.click(cityclick);
		return this.getText(citylabel);
	}
	public String citylabelmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitGE);
		return this.getText(citylabel);
	}
	public String aptsuitsendedvaluemethod(String entercomm) {
		this.clearContent(aptsuiteclick);
		this.sendKeys(this.aptsuiteclick, entercomm);
		return this.getAtrributeValue(aptsuiteclick);
	}
	public String apisitelabelmethod1() {
		 this.click(aptsuiteclick);
		return this.getText(aptsuitelabel);
	}
	public String apisitelabelmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitGE);
		return this.getText(aptsuitelabel);
	}
	public String addresserrormessagemethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitGE);
		this.click(submitGE);
		this.scrollTo(firstname);
		return this.getText(addresserrormessage);
	}
	public void addresscharactermethod(String entercomm) {
		this.sendKeys(this.addressclick, entercomm);
	}
	public void addressspecialcharactermethod(String entercomm) {
		this.sendKeys(this.addressclick, entercomm);
	}
	public String addresssendedvaluemethod(String entercomm) {
		this.clearContent(addressclick);
		this.sendKeys(this.addressclick, entercomm);
		return this.getAtrributeValue(addressclick);
	}
	public String addresslabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitGE);
		return this.getText(addresslabel);
	}
	public String addresslabelmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitGE);
		this.click(addressclick);
		return this.getText(addresslabel);
	}
	public String lastnameerrormesmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		this.clearContent(lastnameclick);
		this.click(submitGE);
		this.scrollTo(firstname);
		return this.getText(lastnameerrormess);
	}
	public void LNcharachtermethod(String entercomm) {
		this.sendKeys(this.lastnameclick, entercomm);
	}
	public void LNspecialcharamethod(String entercomm) {
		this.sendKeys(this.lastnameclick, entercomm);
	}
	public String lastnameenterdvalue(String entercomm) {
		this.clearContent(lastnameclick);
		this.sendKeys(this.lastnameclick, entercomm);
		return this.getAtrributeValue(lastnameclick);
	}
	public String lastnamelabelmethod1() { 
		this.click(lastnameclick);
		return this.getText(lastnamelabel);
	}
	public String lastnamelabelmethod() throws Exception { 
		driver.navigate().refresh();
		waitForElementToBeVisible1(submitGE);
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(lastnamelabel);
	}
	public String firstnamelabelmethod1(){
		this.click(firstnameclick);
		return this.getText(firstnamelabel);
	}
	public String firstnamelabelmethod(){
		return this.getText(firstnamelabel);
	}
	public String totalerromessagemethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitGE);
		this.click(submitGE);
		return this.getText(totalerromessage);	
		}
	public void yespoppupbuttonmethod() {
		this.click(yespoppupbutton);
	}
    public void Resetbuttonmethod() {
		this.click(resetbutton);
	}
	public String teluraboutmethod() throws Exception {
		driver.navigate().refresh();
		waitForElementToBeVisible1(submitGE);
		Thread.sleep(3400);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(telusabout);	
		}
	public String commenterrormessagmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitGE);
		this.clearContent(entercomspecharacter);
		this.click(submitGE);
		return this.getText(commenterromessage);
	}
	public String commenterrormessagmethod1() throws Exception {
		this.click(firstname);
		return this.getText(commenterromessage);
	}
	public void commentnumaricalmethod(String entercomm) {
		this.sendKeys(this.entercomnumarical, entercomm);
	}
	public void commentcharectersmethod(String entercomm) {
		this.sendKeys(this.etercommentclick, entercomm);
	}
	
	public String commentspecialchaructermethod(String entercomm) {
		this.clearContent(entercomspecharacter);
		this.sendKeys(this.entercomspecharacter, entercomm);
		return this.getAtrributeValue(etercommentclick);
	}
	/*public void entercommentclickmethod() {
		this.click(etercommentclick);
	}*/
	public String entercommentsmethod1() {
		this.click(etercommentclick);
		return this.getText(entercomments);
	}
	public String entercommentsmethod() {
		return this.getText(entercomments);
	}
	public String tellusaboutmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(tellusabout);
		return this.getText(tellusabout);
	}
	public String selectmarketgeamemethod() {
		 this.click(selemarketgame);
		 return this.getText(clickseleoneoption);
	}
	public String selecoptionclickmethod() {
		 return this.getText(selemarketgame);
	}
	public String selecoptionclickmethod12() throws Exception {
		Thread.sleep(3500);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		this.click(clickseleoneoption);
		 return this.getText(selemarketgame);
	}
	public String selectoneoptionmethod1() {
		this.click(clickseleoneoption);
		return this.getText(seleoneoption);
	}
	public String selectoneoptionmethod() {
		return this.getText(seleoneoption);
	}
	public String choosefollingmethod() {
		return this.getText(choosefollwing);
	}
	public String Whatisaboutmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(whatthisabout);
	}
	public String indicaterequiredmethod() {
		return this.getText(indicaterequirelabel);
	}
	public String pleaseprovidefewlabel() {
		return this.getText(pleaseprovidelabel);
	}
	public String wewanttohearlabel() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(wewanthearlabel);
	}
	public String trademarkheading() {
		return this.getText(trademarkhead);
	}
	public void trademarkdropdownvalue() {
		this.click(trademarkdropdown);
	}
	public String trademarkdropdownvaluemethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(clickPdt);
		this.click(clickPdt);
		return this.getText(trademarkdropdown);
	}
	public String trademarkgetAtrributeValuemethod() {
		this.click(trademarkdropdown);
		return this.getText(clickPdt);
	}
	
	
	
	public String Restaurantheading() {
		return this.getText(restaurenthead);
	}
	public String restaurantdropdownvlauemethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(clickPdt);
		this.click(clickPdt);
		return this.getText(Restaurentdropdown);
	}
	public String restaurantgetAtrributeValuemethod() {
		this.click(Restaurentdropdown);
		return this.getText(clickPdt);
	}
	public String mobileheading() {
		return this.getText(mobilehead);
	}
	public String clickonmobilemethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(clickPdt);
		this.click(clickPdt);
		return this.getText(mobileapppath);
	}
	public String mobilegetAtrributeValuemethod() {
		this.click(mobileapppath);
		return this.getText(clickPdt);
	}
	public String contactushead() {
		return this.getText(contacthead);
	}
	
	public String getgeneralinquirylabel() throws Exception {
		Thread.sleep(3400);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(generalinquirey);  
	}
	public String havelabels() {
		return this.getText(havalabbel);  
	}
	public void clicktopick() {
		 this.click(clickPdt);
	}
	
	public String labepickdiftopic() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3400);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(labelpickdift); 
	}
	public String labepickdiftopic1() {
		 this.click(clickPdt);
		return this.getText(labelpickdift); 
	}
	public String finameEnteredvalue(String firname) {
		this.clearContent(firstname);
		this.sendKeys(this.firstname, firname);
		return this.getAtrributeValue(firstname);
	}
	
	public String finamevalue() {
		return this.getText(firstname);  
	}
	public String seletUSFAQs() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(clickPdt);
		this.click(clickPdt);
		return this.getText(cintactuspaQ);
	}
	public String contactusgetAtrributeValuemethod() {
		this.click(cintactuspaQ);
		return this.getText(clickPdt);
	}
	public String contactusgetpagetitlemethod1() { 
		this.click(clickgobutton); // GO BUTTON
		return this.getPageTitle();
	}
	public void gobutton() {
		this.click(clickgobutton); // GO BUTTON
	}
	public void Gobuttonena() {
		this.enablebuttons(clickgobutton); // Enable go button
	}
	
	public String firstnameerror() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3400);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitGE);
		this.clearContent(firstname);
		this.click(submitGE);
		this.scrollTo(firstname);
		return this.getText(finamerror);  
	}
	public void submitGEQ() {
		this.click(submitGE);
	}
	public void scrollto() {
		this.scrollTo(firstname);
	}
	public String generallgetpagetitlemethod1() throws Exception { 
		Thread.sleep(6000);
		this.click(submitGE);
		Thread.sleep(6000);
		return this.getPageTitle();
	}
	public String generallgetpagetitlemethod() {  
		return this.getPageTitle();
	}
	

}

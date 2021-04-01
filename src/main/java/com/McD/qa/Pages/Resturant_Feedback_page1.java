package com.McD.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Resturant_Feedback_page1 extends Basepage {

	public  Resturant_Feedback_page1(WebDriver driver) { 
		super(driver);
	}
	//@FindBy(xpath="//*[@id='cookieMessage']/div/div/div[2]/a") 
	@FindBy(xpath="//*[@id='onetrust-close-btn-container']/button")
	WebElement blackcookiesok;
	@FindBy(xpath="//html/body/div[1]/div[1]/div/button") 
	WebElement balckcancelbutton;
	@FindBy(xpath="//*[@id='submit_form_rf']")  // submit button path   
	WebElement submitbuttonclick;
	@FindBy(xpath="//*[@id='root']/div/header/div/span/span[1]/span[1]/input")  //restaurant feedback heading path
	WebElement moesifclick;
	@FindBy(xpath="//*[@id='new_form']/div[1]")  //restaurant feedback heading path
	WebElement restaurenthead;	
	@FindBy(xpath="//*[@id='new_form']/div[2]/p")    //have some restaurant label
	WebElement havesomerestarentlabel;
	@FindBy(xpath="//*[@id='new_form']/div[3]/div/p[1]")  // Indicates a required field label path
	WebElement incdicatelabel;
	@FindBy(xpath="//*[@id='resturant_address']/div[1]/div/h2")  // Please select the restaurant label path
	WebElement pleaseselectlabel;
	@FindBy(xpath="//*[@id='restFeedbackSubTitle']")  // Search for a restaurant: label path
	WebElement searchforlabel;
	@FindBy(xpath="//*[@id='openpopup']")  // Restaurant locater label path
	WebElement restaurantlocaterlabel;
	@FindBy(xpath="//*[@id='restaurant-top-div']/div/div[1]/div[1]/div/div/div/div/div[1]/div[1]/div/label")  // Zip, City, State label path
	WebElement zipcitylabel;
	@FindBy(xpath="//*[@id='go-search']/span")  //search button path
	WebElement searchbutton;
	@FindBy(xpath="//*[@id='restaurant_close_btn']")  // restaurant close button path
	WebElement restaurentclosebutton;
	@FindBy(xpath="//*[@id='search']")  // restaurant close button path
	WebElement sendzipval;
	@FindBy(xpath="//*[@id='rl-title-1']")  // 335 restaurant address path
	WebElement restaurantaddress;
	@FindBy(xpath="//*[@id='select-location']")  // SELECT RESTAURANT BUTTON path
	WebElement selectrestaurantbutton;
	@FindBy(xpath="//*[@id='new_form']/div[5]/h2")  // tell us about your visit path
	WebElement tellusaboutyourvisitlabel;
	@FindBy(xpath="//*[@id='selectedRestData']")  // tell us about your visit path
	WebElement selectedrestaurantaddress;
	@FindBy(xpath="//*[contains(text(),'List View')]")  // list view label path   
	WebElement listviewlabel;
	@FindBy(xpath="//*[contains(text(),'Load More')]")  // Load More label path   
	WebElement loadmorelabel;
	@FindBy(xpath="//*[@id='rlview-rl-listview']/ul/li[6]/div[2]/div[1]/span[2]")  // loadmore button is working or not path   
	WebElement lodemorebuttonworking;
	@FindBy(xpath="//*[@id='rlview-rl-listview']/ul/li[6]/button")  // click on select restarent in list view path   
	WebElement selectrestaurantlistviewclick;
	@FindBy(xpath="//*[@name='date']/../label")  // visit data label path   
	WebElement visidatelabel;
	@FindBy(xpath="//*[@name='date']")  // visit data click path   
	WebElement visitdateclick;
	@FindBy(xpath="//*[@name='time']/../label")  // visit time label path   
	WebElement visittimelabel;
	@FindBy(xpath="//*[@name='time']")  // visit time click path   
	WebElement visittimeclick;
	@FindBy(xpath="//*[@name='am-pm-field']")  // visit ampm click path   
	WebElement ampmclick;
	@FindBy(xpath="//*[@name='am-pm-field']/../label")      //  ampm label path 
	WebElement ampmlabel;
	@FindBy(xpath="//*[@name='am-pm-field']/option[3]")      //  AM label path 
	WebElement amdropdownvalueclick1;
	@FindBy(xpath="//*[@name='am-pm-field']")      // select am drop down value path 
	WebElement amdropdownvalueclick;
	
	@FindBy(xpath="//*[@name='place-order']/../label")  // how did you place your order label path   
	WebElement howdidyouplaceyourorderlabel;
	
	@FindBy(xpath="//*[@name='place-order']/option[2]")  // how did you place your order click path   
	WebElement howdidyouplaceyourorderclick1;
	
	@FindBy(xpath="//*[@name='place-order']")  // how did you place your order click path   
	WebElement howdidyouplaceyourorderclick;
	@FindBy(xpath="//*[@name='pick-order']/option[2]")  // how did you place your order drop down value path   
	WebElement howdidyouplaceyourorderdropdown;
	@FindBy(xpath="//*[@name='pick-order']/../label")  // how did you pick your order label value path   
	WebElement howdidyoupickyourorderlabel;
	@FindBy(xpath="//*[@name='pick-order']")  // how did you pick your order click value path   
	WebElement howdidyoupickyourorderclick;
	@FindBy(xpath="//*[@name='pick-order']/option[2]")  // how did you pick your order drop down value path   
	WebElement howdidyoupickyourorderdropdown;
	@FindBy(xpath="//*[@id='give_us']")      // give us your path  
	WebElement giveusfeedbacktitle;
	@FindBy(xpath="//*[@name='formData1']/../label") // enter your comments(0/1200) path  
	WebElement entercomments;
	@FindBy(xpath="//*[@name='formData1']")  
	WebElement etercommentclick;
	@FindBy(xpath="//*[@name='formData1']/../../span") // comment error message
	WebElement commenterromessage;
	@FindBy(xpath="//*[@id='about_yourself']")          //tell us about your self title
	WebElement telusabout;
	@FindBy(xpath="//*[@name='firstName']/../label") //FIRST NAME LABEL PATH 
	WebElement firstnamelabel;
	@FindBy(xpath="//*[@name='firstName']") //first name
	WebElement firstnameclick;
	@FindBy(xpath="//*[@name='lastName']/../label") //last name
	WebElement lastnamelabel;
	@FindBy(xpath="//*[@name='lastName']")
	WebElement lastnameclick;
	@FindBy(xpath="//*[@name='email']/../label")   //email label path   
	WebElement emaillabel;
	@FindBy(xpath="//*[@name='email']")  
	WebElement emailclick;
	@FindBy(xpath="//*[@name='email']/../../span")  
	WebElement emailerrormessage;
	@FindBy(xpath="//*[@name='confEmail']/../label")  //confirm mail label path
	WebElement confirmemaillabel;
	@FindBy(xpath="//*[@name='confEmail']") 
	WebElement confirmmailclick;
	@FindBy(xpath="//*[@name='confEmail']/../../span") 
	WebElement confirmmailerrormessage;
	@FindBy(xpath="//*[@name='phone']/../label")  //phone number label path  
	WebElement phonenumberlabel;
	@FindBy(xpath="//*[@name='phone']") 
	WebElement phonenumberclick;
	@FindBy(xpath="//*[@name='phone']/../../SPAN") 
	WebElement phonenumbererrormessage;
	@FindBy(xpath="//*[@name='respText']/../../../legend") 
	WebElement doyouwantownerorganizationlabel;
	@FindBy(xpath="(//*[@name='respText']/../../label)[1]")  //yes radio button label
	WebElement yesradiobuttonlabel;
	@FindBy(xpath="//*[@name='respText']") 
	WebElement yesradiobuttonclick;
	@FindBy(xpath="//*[@name='custAddr1']/../label")  //address line one label
	WebElement addressline1label;
	@FindBy(xpath="(//*[@name='respText']/../../label)[2]")  //no radio button label
	WebElement noradiobuttonlabel;
	@FindBy(xpath="(//*[@name='respText'])[2]") 
	WebElement noradiobuttonclick;
	@FindBy(xpath="(//*[@name='respText']/../input)[2]")
	WebElement noradiobuttonclick1;
	
	@FindBy(xpath="//*[@name='custAddr1']") 
	WebElement addressline1click;
	@FindBy(xpath="//*[@name='custAddr2']/../label")  //address line two label
	WebElement addressline2label;
	@FindBy(xpath="//*[@name='custAddr2']/../label")  //address line two click
	WebElement addressline2click1;
	@FindBy(xpath="//*[@name='custAddr2']")  //address line two click
	WebElement addressline2click;
	@FindBy(xpath="//*[@name='city']/../label")  //city label 
	WebElement citylabel;
	@FindBy(xpath="//*[@name='city']/../label")  //city click
	WebElement cityclick1;
	@FindBy(xpath="//*[@name='city']")  //city click
	WebElement cityclick;
	@FindBy(xpath="//*[@name='state']/../label")  //STATE LABEL 
	WebElement statelabel;
	@FindBy(xpath="//*[@name='state']")  //STATE click
	WebElement stateclick;
	@FindBy(xpath="//*[@name='state']/option[3]")  //STATE drop down 
	WebElement statedropdownvalue;
	@FindBy(xpath="//*[@name='zip']/../label")  //zip LABEL 
	WebElement ziplabel;
	@FindBy(xpath="//*[@name='zip']")  //zip click 
	WebElement zipclick;
	@FindBy(xpath="//*[@name='zip']/../../SPAN")  //zip click 
	WebElement ziperrormessage;
	@FindBy(xpath="//*[@id='new_form']/div[10]/h4")  //title of by select submit..... click 
	WebElement byselectsubmittitle;
	@FindBy(xpath="//*[@id='globalError-form']")  //global error msg  
	WebElement globalerrormsg;
	@FindBy(xpath="//*[@id='selectRestaurantError']")  //select restaurant error msg  
	WebElement selectrestauranterrormsg;
	@FindBy(xpath="//*[@name='date']/../../span")  //VISIT DATE error msg  
	WebElement visitdateerrormsg;
	@FindBy(xpath="//*[@name='time']/../../span")  //VISIT time error msg  
	WebElement visittimeerrormsg;
	@FindBy(xpath="//*[@name='place-order']/../../SPAN")  //YOU PLACE YOUR ORDER error msg  
	WebElement youplaceordererrormsg;
	@FindBy(xpath="//*[@name='pick-order']/../../span")  //YOU pick YOUR ORDER error msg  
	WebElement youpickordererrormsg;
	@FindBy(xpath="//*[@name='formData1']/../../span")  //enter your comment error msg  
	WebElement enteryourcommenterrormsg;
	@FindBy(xpath="//*[@name='firstName']/../../span")  // first name error msg  
	WebElement firstnameerrormsg;
	@FindBy(xpath="//*[@name='lastName']/../../span")  // last name error msg  
	WebElement lastnameerrormsg;
	@FindBy(xpath="//*[@name='email']/../../span")  // email error msg  
	WebElement emailerrormsg;
	@FindBy(xpath="//*[@name='confEmail']/../../span")  // confirm email error msg  
	WebElement confirmemailerrormsg;
	@FindBy(xpath="//*[@name='phone']/../../span")  // phone number error msg  
	WebElement phonenumbererrormsg;
	@FindBy(xpath="//*[@id='respText-error']")  // RADIO BUTTON error msg  
	WebElement radiobuttonerrormsg;
	@FindBy(xpath="//*[@class='rl-mapview__details']/div[2]") 
	WebElement webstatuslabel;
	@FindBy(xpath="//*[@id='openContactusFormPopup']") 
	WebElement resetbutton;
	@FindBy(xpath="//*[@id='myModal']/div/div/div[1]/h4")  // are you sure you want to reset
	WebElement areyousureyouwanttoresettitle;
	@FindBy(xpath="//*[@id='myModal']/div/div/div[2]/p")  // if you click ...... sub title 
	WebElement ifyouclickonyessubtitle;
	@FindBy(xpath="//*[@id='reset_no']")  // NO BUTTON 
	WebElement nobuttonclick;
	@FindBy(xpath="//*[@id='cancelID_RF']")  // NO BUTTON 
	WebElement yesbuttonclick;
	
	
	
	
	
	public String yesresetbuttonmethod() throws Exception {
		driver.navigate().refresh();
		waitForElementToBeVisible1(resetbutton);
		this.click(submitbuttonclick);
		this.click(resetbutton);
		waitForElementToBeVisible1(yesbuttonclick);
		this.click(yesbuttonclick);
		return this.getText(globalerrormsg);
	}
	public String nobuttonclickmethod() {
		this.click(nobuttonclick);
		return this.getText(ifyouclickonyessubtitle);
		
	}
	public String ifyouclickonyessubtitlemethod() {
		return this.getText(ifyouclickonyessubtitle);
		
	}
	public String areyousureyouwanttoresetlabel() {
		return this.getText(areyousureyouwanttoresettitle);
		
	}
	public String resetbuttonmethod() {
		this.click(resetbutton);
		return this.getText(globalerrormsg);
		
	}
	public String submitbuttonclick() {
		this.click(submitbuttonclick);
		return this.getText(globalerrormsg);
		
	}
	public void submitbutton() {
		this.enablebuttons(submitbuttonclick); // Enable submit button
	}
	public String generallgetpagetitlemethod2() throws Exception {  
		this.click(submitbuttonclick);
		Thread.sleep(8000);
		return this.getPageTitle();
	}
	public String webstatuslabelmethod() throws Exception {
		return this.getText(webstatuslabel);
	}
	public String radiobuttonerrormsgmethod()  {
		return this.getText(radiobuttonerrormsg);	
		}
	public String phonenumbererrormsgmethod()  {
		return this.getText(phonenumbererrormsg);	
		}
	public String confirmemailerrormsgmethod()  {
		return this.getText(confirmemailerrormsg);	
		}
	public String emailerrormsgmethod()  {
		return this.getText(emailerrormsg);	
		}
	public String lastnameerrormsgmethod()  {
		return this.getText(lastnameerrormsg);	
		}
	public String firstnameerrormsgmethod()  {
		return this.getText(firstnameerrormsg);	
		}
	public String enteryourcommenterrormsgmethod()  {
		this.click(firstnameclick);
		return this.getText(enteryourcommenterrormsg);	
		}
	public String enteryourcommenterrormsgmethod1()  {
		return this.getText(enteryourcommenterrormsg);	
		}
	public String youpickordererrormsgmethod()  {
		return this.getText(youpickordererrormsg);	
		}
	public String youplaceordererrormsgmethod()  {
		return this.getText(youplaceordererrormsg);	
		}
	public String visittimeerrormsgmethod()  {
		this.click(howdidyouplaceyourorderclick);
		return this.getText(visittimeerrormsg);	
		}
	public String visittimeerrormsgmethod1()  {
		return this.getText(visittimeerrormsg);	
		}
	public String visitdateerrormsgmethod()  {
		this.click(visittimeclick);
		return this.getText(visitdateerrormsg);	
		}
	public String visitdateerrormsgmethod1()  {
		return this.getText(visitdateerrormsg);	
		}
	public String selectrestauranterrormsgmethod()  {
		return this.getText(selectrestauranterrormsg);	
		}
	public String globalerrormsgmethod() throws Exception {
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitbuttonclick);
		 this.click(submitbuttonclick);
		return this.getText(globalerrormsg);	
		}
	public String byselectsubmittitlemethod() { 
		return this.getText(byselectsubmittitle);
	}
	public String ziperrormessagemethod(String entercomm) { 
		this.clearContent(zipclick);
		this.sendKeys(this.zipclick, entercomm);
		this.click(submitbuttonclick);
		return this.getText(ziperrormessage);
	}
	public String zipenteredvalue(String entercomm) {
		this.clearContent(zipclick);
		this.sendKeys(this.zipclick, entercomm);
		return this.getAtrributeValue(zipclick);  
	}
	public String ziplabelmethod1() { 
		this.click(zipclick);
		return this.getText(ziplabel);
	}
	public String ziplabelmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		this.click(yesradiobuttonclick);
		waitForElementToBeVisible1(ziplabel);
		return this.getText(ziplabel);
	}
	public String stateselecteddropdownvalmethod1() throws Exception {
		driver.navigate().refresh();
		this.click(yesradiobuttonclick);
		waitForElementToBeVisible1(stateclick);
		this.click(stateclick);
		this.click1(statedropdownvalue);
		return this.getText(statedropdownvalue);  
	}
	public String stateselecteddropdownvalmethod2() throws Exception {
		//driver.navigate().refresh();
		//this.click(yesradiobuttonclick);
		waitForElementToBeVisible1(stateclick);
		this.click(stateclick);
		this.click1(statedropdownvalue);
		return this.getText(statedropdownvalue);  
	}
	public String statelabelmethod1() {
		  this.click(stateclick);
		return this.getText(statelabel);
	}
	public String statelabelmethod() throws Exception {
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		this.click(yesradiobuttonclick);
		waitForElementToBeVisible1(statelabel);
		return this.getText(statelabel);
	}
	
	public String citysendvaluemethod(String entercomm) {
		this.clearContent(cityclick);
		this.sendKeys(this.cityclick, entercomm);
		return this.getAtrributeValue(cityclick);  
	}
	public String citylabelmethod1() throws Exception {
		this.click(cityclick1);
		return this.getText(cityclick1);
	}
	public String citylabelmethod() throws Exception {
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		this.click(yesradiobuttonclick);
		waitForElementToBeVisible1(citylabel);
		return this.getText(citylabel);
	}
	public String addressline2sendvaluesmethod(String entercomm) {
		this.clearContent(addressline2click);
		this.sendKeys(this.addressline2click, entercomm);
		return this.getAtrributeValue(addressline2click);  
	}
	public String addressline2labelmethod1() throws Exception {
		waitForElementToBeVisible1(addressline1label);
		this.click(addressline2click1);
		return this.getText(addressline2click1);
	}
	public String addressline2labelmethod() throws Exception {
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		this.click(yesradiobuttonclick);
		waitForElementToBeVisible1(addressline2label);
		return this.getText(addressline2label);
	}
	public String addresslinesendvaluesmethod(String entercomm) {
		this.clearContent(addressline1click);
		this.sendKeys(this.addressline1click, entercomm);
		return this.getAtrributeValue(addressline1click);  
	}
	public String addressline1labelmethod1() throws Exception {
		waitForElementToBeVisible1(addressline1label);
		this.click(addressline1click);
		return this.getText(addressline1label);
	}
		public boolean noradiobuttonclickmethod1() {
		this.click(noradiobuttonclick);
		return this.isselectedcheckbox(noradiobuttonclick1);  
	}
	public boolean noradiobuttonclickmethod() {
		return this.isselectedcheckbox(noradiobuttonclick);  
	}
	public String noradiobuttonlabelmethod() {
		return this.getText(noradiobuttonlabel);
	}
	public String addressline1labelmethod() throws Exception {
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		this.click(yesradiobuttonclick);
		waitForElementToBeVisible1(addressline1label);
		return this.getText(addressline1label);
	}
	public boolean yesradiobuttonclickmethod1() {
		this.click(yesradiobuttonclick);
		return this.isselectedcheckbox(yesradiobuttonclick);  
	}
	public boolean yesradiobuttonclickmethod() {
		return this.isselectedcheckbox(yesradiobuttonclick);  
	}
	public String yesradiobuttonlabelmethod() {
		return this.getText(yesradiobuttonlabel);
	}
	public String doyouwantownerorganizationlabelmethod() {
		return this.getText(doyouwantownerorganizationlabel);
	}
	public String phonenumbererrormessagemethod(String pnumber) {
		this.clearContent(phonenumberclick);
		this.sendKeys(this.phonenumberclick, pnumber);
		this.click(submitbuttonclick);
		return this.getText(phonenumbererrormessage);
	}
	public String phonenumberenteredvalue(String pnumber) {
		this.clearContent(phonenumberclick);
		this.sendKeys(this.phonenumberclick, pnumber);
		return this.getAtrributeValue(phonenumberclick);  
	}
	public String phonenumberenteredvalue1(String pnumber) {
		this.clearContent(phonenumberclick);
		this.sendKeys(this.phonenumberclick, pnumber);
		return this.getAtrributeValue(phonenumberclick);  
	}
	public String phonenumberlabelmethod1() throws Exception { 
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitbuttonclick);
		this.click(phonenumberclick);
		return this.getText(phonenumberlabel);
	}
	public String phonenumberlabelmethod() throws Exception { 
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		Thread.sleep(500);
		return this.getText(phonenumberlabel);
	}
	public String confirmmailerrormessmethod() { 
		this.click(submitbuttonclick);
		return this.getText(confirmmailerrormessage);
	}
	public String confirmmailenteredvalue(String entercomm) {
		 this.clearContent(confirmmailclick);
		this.sendKeys(this.confirmmailclick, entercomm);
		return this.getAtrributeValue(confirmmailclick);
	}
	public void mailsendmethod(String entercomm) {
		 this.clearContent(emailclick);
		this.sendKeys(this.emailclick, entercomm);
	}
	public void mailsendmethod1(String entercomm) throws Exception {
		driver.navigate().refresh();
		waitForElementToBeVisible1(emailclick);
		 this.clearContent(emailclick);
		this.sendKeys(this.emailclick, entercomm);
	}
	public String confirmmaillabelmethod1() { 
		   this.click(confirmmailclick);
		return this.getText(confirmemaillabel);
	}
	public String confirmmaillabelmethod() throws Exception { 
		driver.navigate().refresh();
		try {
			this.click(blackcookiesok);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(emaillabel);
		return this.getText(confirmemaillabel);
	}
	public String emailerrormessagemethod1() throws Exception {
		this.click(submitbuttonclick);
		return this.getText(emailerrormessage);
	}
	public String emailerrormessagemethod() throws Exception {
		this.click(confirmmailclick);
		return this.getText(emailerrormessage);
	}
	public String emailenteredvalue(String entercomm) {
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
		try {
			this.click(blackcookiesok);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(emaillabel);
		return this.getText(emaillabel);
	}
	public String lastnameenterdvalue(String entercomm) {
		this.clearContent(lastnameclick);
		this.sendKeys(this.lastnameclick, entercomm);
		return this.getAtrributeValue(lastnameclick);  
	}
	public String lastnamelabelmethod1()  { 
		this.click(lastnameclick);
		return this.getText(lastnamelabel);
	}
	public String lastnamelabelmethod() throws Exception { 
		driver.navigate().refresh();
		try {
			this.click(blackcookiesok);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(lastnamelabel);
		return this.getText(lastnamelabel);
	}
	public String finameEnteredvalue(String firname) {
		this.clearContent(firstnameclick);
		this.sendKeys(this.firstnameclick, firname);
		return this.getAtrributeValue(firstnameclick);
	}
	public String firstnamelabelmethod1(){
		this.click(firstnameclick);
		return this.getText(firstnamelabel);
	}
	public String firstnamelabelmethod(){
		return this.getText(firstnamelabel);
	}
	public String teluraboutmethod() throws Exception {
		driver.navigate().refresh();
		try {
			this.click(blackcookiesok);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(telusabout);
		return this.getText(telusabout);	
		}
	public String commenterrormessagmethod() throws Exception {
		this.click(firstnameclick);
		return this.getText(commenterromessage);
	}
	public String commententeredvalue(String entercomm) {
		this.clearContent(etercommentclick);
		this.sendKeys(this.etercommentclick, entercomm);
		return this.getAtrributeValue(etercommentclick);
	}
	public String entercommentsmethod1() {
		this.click(etercommentclick);
		return this.getText(entercomments);
	}
	public String entercommentsmethod() {
		return this.getText(entercomments);
	}
	public String giveusfeedbacktitlemethod() throws Exception { 
		driver.navigate().refresh();
		try {
			this.click(blackcookiesok);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(giveusfeedbacktitle);
		return this.getText(giveusfeedbacktitle);  
	}
	public String howdidyoupickyourorderdropdownmethod() { 
		this.click(howdidyoupickyourorderclick);
		this.click1(howdidyoupickyourorderdropdown);
		return this.getAtrributeValue(howdidyoupickyourorderclick);  
	}
	public String howdidyoupickyourorderclickmethod() { 
		this.click(howdidyoupickyourorderclick);
		return this.getText(howdidyoupickyourorderlabel);  
	}
	public String howdidyoupickeyourorderlabelmethod() {  
		driver.navigate().refresh();
		try {
			 this.click(blackcookiesok);
			}catch (Exception e) {
				
			}
		return this.getText(howdidyoupickyourorderlabel);  
	}
	public String howdidyouplaceyourorderdropdownmethod() throws Exception { 
		driver.navigate().refresh();
		waitForElementToBeVisible1(howdidyouplaceyourorderclick);
		this.click(howdidyouplaceyourorderclick);
		this.click1(howdidyouplaceyourorderclick1);
		return this.getAtrributeValue(howdidyouplaceyourorderclick);  
	}
	public String howdidyouplaceyourorderdropdownmethod1() throws Exception { 
		this.click(howdidyouplaceyourorderclick);
		this.click1(howdidyouplaceyourorderclick1);
		return this.getAtrributeValue(howdidyouplaceyourorderclick);  
	}
	public String howdidyouplaceyourorderclickmethod() { 
		this.click(howdidyouplaceyourorderclick);
		return this.getText(howdidyouplaceyourorderlabel);  
	}
	public String howdidyouplaceyourorderlabelmethod() {  
		driver.navigate().refresh();
		try {
			 this.click(blackcookiesok);
			}catch (Exception e) {
				
			}
		return this.getText(howdidyouplaceyourorderlabel);  
	}
	public String visittimesendmethod(String entercomm) throws Exception { 
		driver.navigate().refresh();
		waitForElementToBeVisible1(visittimeclick);
		//this.clearContent(visittimeclick);
		this.sendKeys(visittimeclick, entercomm);
		return this.getAtrributeValue(visittimeclick);  
	}
	public String visittimesendmethod1(String entercomm) throws Exception { 
		Thread.sleep(1500);
		//this.clearContent(visittimeclick);
		
		this.sendKeys(visittimeclick, entercomm);
		return this.getAtrributeValue(visittimeclick);  
	}
	public String visittimelabelmethod1() { 
		this.click(visittimeclick);
		return this.getText(visittimelabel);  
	}
	public String visittimelabelmethod() { 
		driver.navigate().refresh();
		try {
			 this.click(blackcookiesok);
			}catch (Exception e) {
				
			}
		return this.getText(visittimelabel); 
	}
	public String visitampmlabelmethod() {
		driver.navigate().refresh();
		try {
			 this.click(blackcookiesok);
			}catch (Exception e) {
				
			}
		return this.getText(ampmlabel);
		
	}
	public String visitampmlabelmethod1() {
		this.click(ampmclick);
		return this.getText(ampmlabel);
	}
	public String pmvaluedisplayedmethod1() {
		 //this.click(pmvaluedisplayed);
		//waitForElementToBeVisible1(ampmlabel);
		 this.click(amdropdownvalueclick);
		 this.click1(amdropdownvalueclick1);
		return this.getText(amdropdownvalueclick1);  
	}
	public String visitdatesendmethod(String entercomm) throws Exception { 
		driver.navigate().refresh();
		waitForElementToBeVisible1(visidatelabel);
		//this.clearContent(visitdateclick);
		this.sendKeys(visitdateclick, entercomm);
		return this.getAtrributeValue(visitdateclick);  
	}
	public String visitdatesendmethod1(String entercomm) throws Exception { 
		Thread.sleep(1500);
		//this.clearContent(visitdateclick);
		//System.out.println(entercomm);
		this.sendKeys(visitdateclick, entercomm);
		return this.getAtrributeValue(visitdateclick);  
	}
	public String visitdatelabelmethod1() { 
		this.click(visitdateclick);
		return this.getText(visidatelabel);  
	}
	public String visitdatelabelmethod() {      
		return this.getText(visidatelabel);  
	}
	public String tellusaboutyourvisitlabelmethod() { 
		driver.navigate().refresh();
		try {
			 this.click(blackcookiesok);
			}catch (Exception e) {
				
			}
		return this.getText(tellusaboutyourvisitlabel);  
	}
	public String restaurantaddrlabelmethod1() { 
		this.click(selectrestaurantlistviewclick);
		return this.getText(zipcitylabel); 
	}
	public String lodemorebuttonworkingmethod() throws Exception { 
		this.click(loadmorelabel);
		waitForElementToBeVisible1(lodemorebuttonworking);
		return this.getText(lodemorebuttonworking); 
	}
	public String loadmorelabelmethod() throws Exception { 
		this.click(listviewlabel);
		waitForElementToBeVisible1(loadmorelabel);
		return this.getText(loadmorelabel); 
	}
	public String listviewlabelmethod() {      
		return this.getText(listviewlabel);  
	}
	public String zipcitychangedmethod() throws Exception {
		try {
			 this.click(blackcookiesok);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(restaurantlocaterlabel);
		this.click(restaurantlocaterlabel);
		waitForElementToBeVisible1(searchbutton);
		return this.getText(zipcitylabel);
	}
	public String changerestaurantmethod() throws Exception { 
		
		waitForElementToBeVisible1(restaurantlocaterlabel);
		return this.getText(restaurantlocaterlabel);  
	}
	public String selectedrestaurantaddressmethod()  { 
		 return this.getText(selectedrestaurantaddress);
		 
	}
	public String restaurantbuttonclickmethod() throws Exception  { 
		 this.click(selectrestaurantbutton);
		 waitForElementToBeVisible1(tellusaboutyourvisitlabel);
		 return this.getText(zipcitylabel);
		 
	}
	public String restaurantbuttonlabelmethod()  { 
		return this.getText(selectrestaurantbutton); 
	}
	public String restaurantaddressmethod() throws Exception  {
		this.click(searchbutton);
		Thread.sleep(1500);
		this.click(searchbutton);
		waitForElementToBeVisible1(restaurantaddress);
		return this.getText(restaurantaddress);  
	}
	public String zipenteredvalmethod(String zip) throws Exception { 
		waitForElementToBeVisible1(searchbutton);
		this.sendKeys(this.sendzipval, zip);
		return this.getAtrributeValue(sendzipval);
	}
	public String zipcitylabelmethod() {   
		return this.getText(zipcitylabel);  
	}
	public String zipcitymethod1() throws Exception {
		 this.click(restaurentclosebutton);
		return this.getText(zipcitylabel);  
	}
	public String zipcitymethod() throws Exception {
		Thread.sleep(1500);
		driver.navigate().refresh();
		try {
			 this.click(blackcookiesok);
			}catch (Exception e) {
				
			}
		
		waitForElementToBeVisible1(restaurantlocaterlabel);
		this.click(restaurantlocaterlabel);
		waitForElementToBeVisible1(searchbutton);
		return this.getText(zipcitylabel);
	}
	/*public String moesifmethod() throws Exception {  
		this.click(moesifclick);
		Thread.sleep(8000);
		return this.getPageTitle();
	}*/
	
	public String restaurantlocatermethod() throws Exception { 
		try {
			 this.click(blackcookiesok);
			}catch (Exception e) {
				
			}
		driver.navigate().refresh();
		waitForElementToBeVisible1(restaurantlocaterlabel);
		return this.getText(restaurantlocaterlabel); 
	}
	
	public String searchformethod() {   
		return this.getText(searchforlabel);  
	}
	public String pleaseselectmethod() {   
		return this.getText(pleaseselectlabel);  
	}
	public String Indicatesfieldmethod() throws Exception {
		return this.getText(incdicatelabel);  
	}
	public String havesomerestarentmethod() {  
		return this.getText(havesomerestarentlabel);
	}
	public String Restaurantheadform() throws Exception { 
		try {
			 this.click(blackcookiesok);
			}catch (Exception e) {
				
			}
		driver.navigate().refresh();
		waitForElementToBeVisible1(restaurenthead);
		return this.getText(restaurenthead);  
	}
	
	
	public void blackcookiesokmethod()  {  
		try {
		 this.click(blackcookiesok);
		}catch (Exception e) {
			
		}
		  
	}

	
	public String generallgetpagetitlemethod1() {  
		return this.getPageTitle();
	}
	public String moesifmethod() {
		this.click(moesifclick);
		//this.click1(howdidyouplaceyourorderclick1);
		return this.getAtrributeValue(moesifclick);
		
		
		
	}
	
	
		
}

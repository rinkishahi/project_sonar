
package com.McD.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class Core_General_Inquiry_Page extends Basepage {
	
	
	
	public  Core_General_Inquiry_Page(WebDriver driver) {
		super(driver);
//		PageFactory.initElements(driver, this);
	}
	//GENERAL INQUIRY PATH
	@FindBy(xpath="//*[@id='reset_focus']/h1")
	 WebElement generalinquirey;
	@FindBy(xpath="//*[@id='maincontent']/div/div[1]/div/section/div[2]")
	 WebElement havalabbel;
	@FindBy(xpath="//*[@class='form-control form-navigation__select']") //click pick a different topic
	 WebElement clickPdt;
	@FindBy(xpath="//*[@id='maincontent']/div/div[1]/div/section/div[3]/div/div/div/div/label")//select lable name 
	 WebElement labelpickdift;
	@FindBy(xpath="//*[@class='form-control form-navigation__select']/option[2]")//select dropdown value 
	WebElement contactuspaq;
	
	@FindBy(xpath="//*[@id='maincontent']/div/div[1]/div/section/div[3]/div/div/div/button")//go button
	WebElement clickgobutton;
	@FindBy(xpath="//*[@name='firstName']/../../span")
	 WebElement finamerror;
	@FindBy(xpath="//*[@id='submit_form_rf']")
	WebElement submitGE;
	/*@FindBys(xpath="//*[@class='custom_dropdown_list']") // drop down respective value 
	WebElement picvalue;*/
	
	@FindBys(@FindBy(xpath="//*[@class='custom_dropdown_list']"))
	WebElement picvalue;
	@FindBy(xpath="//h1[contains(text(),'Contact Us')]")
	WebElement contacthead;
	@FindBy(xpath="//*[@class='form-control form-navigation__select']/option[5]") //mobile app feedback dropdown path
	WebElement mobileapppath;
	@FindBy(xpath="//h1[contains(text(),'Mobile App Feedback')]")	//mobile app feedback heading path	
	WebElement mobilehead;
	@FindBy(xpath="//*[@class='form-control form-navigation__select']/option[3]") //Restaurant Feedback dropdown path
	WebElement Restaurentdropdown;
	@FindBy(xpath="//h1[contains(text(),'Restaurant Feedback')]")  //restaurant feedback heading path
	WebElement restaurenthead;
	@FindBy(xpath="//*[@class='form-control form-navigation__select']/option[4]")  //trademark permision dropdown path
	WebElement trademarkdropdown;
	@FindBy(xpath="//h1[contains(text(),'Trademark Permission')]")  // trademark permision heading path
	WebElement trademarkhead;
	
	
	@FindBy(xpath="//*[@id='new_form']/div[1]/h2") //we want to hear from you path
	WebElement wewanthearlabel;  
	@FindBy(xpath="//*[@id='new_form']/div[2]/p") //plese provide a few details below path
	WebElement pleaseprovidelabel;
	@FindBy(xpath="//*[@id='new_form']/div[3]/div/p[1]") // indicates a required field label path
	WebElement indicaterequirelabel;
	@FindBy(xpath="//*[@id='new_form']/div[4]/div/section/div[1]/h2") //what is this about path
	WebElement whatthisabout;  
	@FindBy(xpath="//*[@id='new_form']/div[4]/div/section/div[2]/p")  //choose one of the following path
	WebElement choosefollwing;
	@FindBy(xpath="//*[@name='about']/../label")
	WebElement seleoneoption;
	@FindBy(xpath="//*[@name='about']")
	WebElement clickseleoneoption;
	@FindBy(xpath="//*[@name='about']/option[3]")  
	WebElement selemarketgame;
	@FindBy(xpath="//*[@id='new_form']/div[5]/div/section/div[1]/h2")
	WebElement tellusabout;
	@FindBy(xpath="//*[@name='formData1']/../label") // enter your comments(0/1200) path
	WebElement entercomments;
	@FindBy(xpath="//*[@name='formData1']")
	WebElement etercommentclick;
	@FindBy(xpath="//*[@name='formData1']")
	WebElement entercomspecharacter;
	@FindBy(xpath="//*[@name='formData1']")
	WebElement entercomnumarical;
	@FindBy(xpath="//*[@name='formData1']")
	WebElement entercomcharecters;
	@FindBy(xpath="//*[@name='formData1']/../../span") // comment error message
	WebElement commenterromessage;
	@FindBy(xpath="//*[@id='new_form']/div[6]/div/section/div[1]/h2")
	WebElement telusabout;
    @FindBy(xpath="//*[@id='openContactusFormPopup']") //reset button
    WebElement resetbutton;
	@FindBy(xpath="//*[@id='cancelID_RF']") //yes button 
	WebElement yespoppupbutton;
	@FindBy(xpath="//*[@id='globalError-form']")
	WebElement totalerromessage;  //
	
	@FindBy(xpath="//*[@name='firstName']/../label") //FIRST NAME LABEL PATH 
	WebElement firstnamelabel;
	@FindBy(xpath="//*[@name='firstName']") //first name
	WebElement firstname;
	@FindBy(xpath="//*[@name='firstName']") //first name
	WebElement firstnameclick;
	@FindBy(xpath="//*[@name='lastName']/../label") //last name
	WebElement lastnamelabel;
	@FindBy(xpath="//*[@name='lastName']")
	WebElement lastnameclick;
	@FindBy(xpath="//*[@name='lastName']/../../span")
	WebElement lastnameerrormess;  
	@FindBy(xpath="//*[@name='custAddr1']/../label") //address label path  
	WebElement addresslabel; 
	@FindBy(xpath="//*[@name='custAddr1']")
	WebElement addressclick; 
	@FindBy(xpath="//*[@name='custAddr1']/../../span")
	WebElement addresserrormessage;
	@FindBy(xpath="//*[@name='apt']/../label")  //APT/SUITE PATH   
	WebElement aptsuitelabel;
	@FindBy(xpath="//*[@name='apt']")
	WebElement aptsuiteclick;
	@FindBy(xpath="//*[@name='city']/../label")  //city label path  
	WebElement citylabel;
	@FindBy(xpath="//*[@name='city']")   //span[contains(text(),'*State')]
	WebElement cityclick;  
	@FindBy(xpath="//*[@name='city']/../../span")
	WebElement cityerrormessage;
	@FindBy(xpath="//*[@name='state']/../label") //state label path  
	WebElement statelabel;  
	@FindBy(xpath="//*[@name='state']")
	WebElement stateclick;
	@FindBy(xpath="//*[@name='state']/option[2]")
	WebElement statedropdownvalue;
	@FindBy(xpath="//*[@name='state']/../../span")  
	WebElement stateerrormessage;
	@FindBy(xpath="//*[@name='zip']/../label")  //zip label path 
	WebElement ziplabel;
	@FindBy(xpath="//*[@name='zip']")  
	WebElement zipclick;
	@FindBy(xpath="//*[@name='zip']")  
	WebElement zipclear;	
	@FindBy(xpath="//*[@name='zip']/../../span")  
	WebElement ziperrormessage;
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
	@FindBy(xpath="//*[@name='phone']") 
	WebElement phonesend;
	@FindBy(xpath="//*[@name='phone']/../../span")  //*[@id="recaptcha-anchor"]
	WebElement phonenumbererrormessage;
	
	@FindBy(xpath="//*[@id='recaptcha-anchor']/div[1]") 
	WebElement recapcharcheckbox;
	@FindBy(xpath="//*[contains(text(),'Thank You!')]") 
	WebElement thankstest;
	
	
	@FindBy(xpath="//*[@id='new_form']/div[8]/p[1]") 
	WebElement byselectingsubmit;
	@FindBy(xpath="//*[@id='new_form']/div[8]/p[2]") 
	WebElement wemaycontactlabel;
	@FindBy(xpath="//*[@id='new_form']/div[8]/p[1]/a/u") 
	WebElement privacypolicy;
	
	
	@FindBy(xpath="//*[@id='leavingCancel']") 
	WebElement canclebutton;
	
	@FindBy(xpath="//*[@id='mcd-legal-bumper-title-id']") 
	WebElement leavingmcdonaldsheading;
	@FindBy(xpath="//*[@id='leavingCancel']") 
	WebElement leavingcancelbutton;
	@FindBy(xpath="//*[@id='bumper-continue']") 
	WebElement leavingcontinuebutton;
	@FindBy(xpath="//*[@id='onetrust-close-btn-container']/button") 
	WebElement cancelbutton;
	
	
	
	
	
	
	
	
	
	public String leavingcancelbuttonapplynowmethod() { 
		this.click(leavingcancelbutton);
		return this.getText(leavingmcdonaldsheading);
	}
	
	public String leavingcancelbuttonworkingwithusmethod() { 
		this.click(leavingcancelbutton);
		return this.getText(leavingmcdonaldsheading);
	}
	
	public String leavingcancelbuttonforourveteransmethod() { 
		this.click(leavingcancelbutton);
		return this.getText(leavingmcdonaldsheading);
	}
	
	public String leavingcancelbuttonmeetourpeoplemethod() { 
		this.click(leavingcancelbutton);
		return this.getText(leavingmcdonaldsheading);
	}
	
	public String leavingcancelbuttonemployeemethod() { 
		this.click(leavingcancelbutton);
		return this.getText(leavingmcdonaldsheading);
	}
	
	
	public String leavingcancelbuttoneducationmethod() { 
		this.click(leavingcancelbutton);
		return this.getText(leavingmcdonaldsheading);
	}
	
	
	public String leavingcancelbuttonfootermethod() { 
		this.click(leavingcancelbutton);
		return this.getText(leavingmcdonaldsheading);
	}
	
	public String leavingcancelbuttonmethod() { 
		this.click(leavingcancelbutton);
		return this.getText(leavingmcdonaldsheading);
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
	public String statedropdownvaluemethod() throws Exception {
		
		waitForElementToBeVisible1(stateclick);
		this.click(stateclick);
		this.click1(statedropdownvalue);
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
		waitForElementToBeVisible1(statelabel);
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
		waitForElementToBeVisible1(tellusabout);
		return this.getText(tellusabout);
	}
	public String selectmarketgeamemethod() {
		 this.click(selemarketgame);
		 return this.getText(clickseleoneoption);
	}
	public String selecoptionclickmethod() throws Exception {
		
		 waitForElementToBeVisible1(clickseleoneoption);
			this.click(clickseleoneoption);
			this.click1(selemarketgame);
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
	public String selectoneoptionmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(seleoneoption);
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
		this.click1(trademarkdropdown);
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
		this.click1(Restaurentdropdown);
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
		this.click1(mobileapppath);
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
		this.click1(contactuspaq);
		return this.getText(contactuspaq);
	}
	public String contactusgetAtrributeValuemethod() throws Exception {
		
		waitForElementToBeVisible1(clickPdt);
		this.click(clickPdt);
		Thread.sleep(3300);
		this.click(clickPdt);
	this.click(contactuspaq);
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
	public String generallgetpagetitlemethod() throws InterruptedException {  
		Thread.sleep(3400);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		return this.getPageTitle();
	}
	

}

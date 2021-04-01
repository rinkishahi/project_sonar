package com.McD.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Restaurant_feedback_page extends Basepage {
	public  Restaurant_feedback_page(WebDriver driver) { 
		super(driver);
	}
	
	@FindBy(xpath="//*[@id='maincontent']/div/div[1]/div/section/div[1]/h1")  //restaurant feedback heading path
	WebElement restaurenthead;
	@FindBy(xpath="//html/body/main/div/div/div/section/div[2]/div/picture/img")  //restaurant image
	WebElement restarentimg;
	@FindBy(xpath="//*[@id='maincontent']/div/div[1]/div/section/div[2]/p")    //have some restaurant label
	WebElement havesomerestarentlabel;
	@FindBy(xpath="//*[@class='form-control form-navigation__select']")    //click pick a different topic
	 WebElement clickPdt;
	@FindBy(xpath="//*[@id='maincontent']/div/div[1]/div/section/div[4]/div/div/div/div/label")    //click pick a different topic
	 WebElement labelpickdift;
	
	@FindBy(xpath="//*[@class='form-control form-navigation__select']/option[2]") //mobile app feedback dropdown path
	WebElement contactuspaq;
	
	
	@FindBy(xpath="//*[@class='form-control form-navigation__select']/option[3]") //mobile app feedback dropdown path
	WebElement mobileapppath;
	@FindBy(xpath="//*[@type='button']")       //go button
	WebElement clickgobutton;
	@FindBy(xpath="//*[@class='form-control form-navigation__select']/option[4]")  //trademark permision dropdown path
	WebElement trademarkdropdown;  
	@FindBy(xpath="//*[@class='form-control form-navigation__select']/option[5]")  // General inquire dropdown path  
	WebElement generaldropdownval;
	@FindBy(xpath="//*[@id='new_form']/div[1]/div/p[1]")  // Indicates a required field label path
	WebElement incdicatelabel;
	@FindBy(xpath="//*[@id='restFeedbackMainTitle']")  // Please select the restaurant label path
	WebElement pleaseselstlabel;
	@FindBy(xpath="//*[@id='openpopup']")  // Restaurant locater click path
	WebElement restaurantlocaterclick;
	@FindBy(xpath="//*[@id='submit_form_rf']")  // submit button path   
	WebElement submitbuttonclick;
	
	@FindBy(xpath="//*[@id='resturant_address']/div[2]/span")  // restaurant close button path
	WebElement ORlabel;
	@FindBy(xpath="//*[@id='locateme']")  // locate me label path
	WebElement Locatemelabel;
	@FindBy(xpath="//*[@id='aaa']/a")  // click on can_not_find_location path   
	WebElement contfindlocationclick;
	@FindBy(xpath="//*[contains(text(),'find the location you')]")  // label of can_not_find_location path   
	WebElement contfindlocationlabel;
	@FindBy(xpath = "//*[@name='restAddress']/../../span") // restaurant address error message path
	WebElement restarentadderromessage;
	@FindBy(xpath="//*[@name='restAddress']/../label")  // *Restaurant Address label path
	WebElement resraurantaddlabel;
	@FindBy(xpath="//*[@name='restAddress']")  // *Restaurant Address text path
	WebElement resraurantaddvalue;
	
	@FindBy(xpath = "//*[@name='restCity']/../label") // city label path
	WebElement cityconatfindlabel;
	@FindBy(xpath = "//*[@name='restCity']/../../span") // city error message path
	WebElement cityerrormessage;
	@FindBy(xpath = "//*[@name='restCity']") // CITY text path
	WebElement cityvalue;
	@FindBy(xpath = "(//*[@name='state'])[1]/../label") // cont find state label
	WebElement statecontfindlabel;
	@FindBy(xpath = "(//*[@name='state'])[1]") // cont find state dropdown selected value
	WebElement statecontfindsendedvalue;
	@FindBy(xpath = "(//*[@name='state'])[1]/option[2]") // cont find state dropdown value
	WebElement statecontfinddropdown;
	@FindBy(xpath = "(//*[@name='state'])[1]/../../span") // cont find state error message
	WebElement statecontfinderrormess;
	
	
	@FindBy(xpath="(//*[@name='custAddr1'])[1]/../label")      // Popular landmark label 
	WebElement popularlandmarklabe;
	@FindBy(xpath="(//*[@name='custAddr1'])[1]")      // Popular landmark click
	WebElement popularlandmark;
	@FindBy(xpath="//*[@name='month']/../label")      // visitdate month label
	WebElement visitdatemonthlabel;
	@FindBy(xpath="//*[@id='restInfo']/div[5]/div/fieldset/legend")      // visit date  label
	WebElement visitdatelabe;
	@FindBy(xpath="//*[@name='month']")      // visit date month 
	WebElement visitdatemothclick;
	@FindBy(xpath="//*[@name='month']/option[3]")      // month dropdown value 
	WebElement monthdropdownvalue;
	@FindBy(xpath="//*[@name='month']/../../span")      // month error message  
	WebElement montherrormessage;
	@FindBy(xpath="//*[@name='day']/../label")      // contfind Day label 
	WebElement daycontfindlabel;
	@FindBy(xpath="//*[@name='day']")      //  Day DROP DOWN 
	WebElement daycontfindclick;
	@FindBy(xpath="//*[@name='day']/option[2]")      //  Day DROP DOWN value 
	WebElement daycontfindcdropdownval;
	
	@FindBy(xpath="//*[@name='year']/option[2]")      //  year DROP DOWN value
	WebElement yearcontfinddropdownval;
	@FindBy(xpath="//*[@name='year']/../label")      //  year label path
	WebElement yearcontfindlabel;
	@FindBy(xpath="//*[@name='year']")      //  Day DROP DOWN 
	WebElement yearcontfindclick;
	@FindBy(xpath="//*[@name='day']/../../span")      //  Day DROP DOWN 
	WebElement dayerrormessagelabel;
	@FindBy(xpath="//*[@name='year']/../../span")      //  Day DROP DOWN 
	WebElement yearerrormessagelabel;             
	@FindBy(xpath="//*[@id='restInfo']/div[6]/div/fieldset/legend")      //  visit time path 
	WebElement visittimelabel;
	@FindBy(xpath="//*[@name='time']/../label")      //  time path 
	WebElement timelabel;
	@FindBy(xpath="//*[@name='time']/option[2]")      //  time path 
	WebElement timetext12displayed1;
	@FindBy(xpath="//*[@name='time']")      //  time path 
	WebElement timetext12displayed;
	@FindBy(xpath="//*[@name='time']/option[3]")      //  time path 
	WebElement selecttime;
	@FindBy(xpath="//*[@name='am/pm']/../label")      //  ampm label path 
	WebElement ampmlabel;
	@FindBy(xpath="//*[@name='am/pm']")      //  AM label path 
	WebElement pmvaluedisplayed;
	@FindBy(xpath="//*[@name='am/pm']/option[1]")      //  AM label path 
	WebElement pmvaluedisplayed1;
	@FindBy(xpath="//*[@name='am/pm']/option[2]")      // select am drop down value path 
	WebElement amdropdownvalue; 

	@FindBy(xpath="(//*[@class='form__fields__options-radio-label-heading'])[1]")      //  what was your takeaway label path
	WebElement whatwasyourtakeawaylabel;
	@FindBy(xpath="//*[@id='give_us']")      // give us your path  
	WebElement giveusfeedbacklabel;
	@FindBy(xpath="(//*[@class='form__fields__options-radio-opt-txt'])[1]") // Drivethru path  
	WebElement drivethru;
	@FindBy(xpath="(//*[@class='form__fields__options-radio-opt-txt'])[2]") // in-store path 
	WebElement instore;
	@FindBy(xpath="(//*[@name='*What was your takeaway preference?'])[1]") // drive thru radio button path   //*[@id='radio-in-store-span']
	WebElement drivethruradiobutton;
	@FindBy(xpath="//*[@id='*What was your takeaway preference?-error']") // Drivethru path  
	WebElement whatwaserrormessage;
	@FindBy(xpath="(//*[@name='*What was your takeaway preference?'])[2]") // in-store redio button path
	WebElement instoreradiobutton;
	
	@FindBy(xpath="//*[@name='formData1']/../label") // enter your comments(0/1200) path  
	WebElement entercomments;
	@FindBy(xpath="//*[@name='formData1']")
	WebElement etercommentclick;
	@FindBy(xpath="//*[@name='formData1']/../../span") // comment error message
	WebElement commenterromessage;
	@FindBy(xpath="//*[@id='about_yourself']")
	WebElement telusabout;
	@FindBy(xpath="//*[@name='firstName']/../label") //FIRST NAME LABEL PATH 
	WebElement firstnamelabel;
	@FindBy(xpath="//*[@name='firstName']") //first name
	WebElement firstnameclick;
	@FindBy(xpath="//*[@name='firstName']/../../span")
	 WebElement finamerror;
	@FindBy(xpath="//*[@name='lastName']/../label") //last name
	WebElement lastnamelabel;
	@FindBy(xpath="//*[@name='lastName']")
	WebElement lastnameclick;
	@FindBy(xpath="//*[@name='lastName']/../../span")
	WebElement lastnameerrormess;
	@FindBy(xpath="(//*[@name='custAddr1'])[2]/../label") //address label path  
	WebElement addresslabel;
	@FindBy(xpath="(//*[@name='custAddr1'])[2]")
	WebElement addressclick;
	@FindBy(xpath="(//*[@name='custAddr1'])[2]/../../span")
	WebElement addresserrormessage;
	@FindBy(xpath="//*[@name='custAddr2']/../label")  //APT/SUITE PATH   
	WebElement aptsuitelabel;
	@FindBy(xpath="//*[@name='custAddr2']")
	WebElement aptsuiteclick;
	@FindBy(xpath="//*[@name='city']/../label")  //city label path  
	WebElement citylabel;
	@FindBy(xpath="//*[@name='city']")   
	WebElement cityclick;
	@FindBy(xpath="//*[@name='city']/../../span")   
	WebElement cityerromessage;
	@FindBy(xpath="(//*[@name='state'])[2]/../label") //state label path  
	WebElement statelabel;
	@FindBy(xpath="(//*[@name='state'])[2]")
	WebElement stateclick;
	@FindBy(xpath="(//*[@name='state'])[2]/../../span")  
	WebElement stateerrormessage;
	@FindBy(xpath="(//*[@name='state'])[2]/option[2]")
	WebElement statedropdownvalue;
	@FindBy(xpath="//*[@name='zip']/../label")  //zip label path 
	WebElement ziplabel;
	@FindBy(xpath="//*[@name='zip']")  
	WebElement zipclick;
	@FindBy(xpath="//*[@name='zip']/../../span")  
	WebElement ziperrormessage;
	@FindBy(xpath="(//*[@class='form__fields__options-radio-label-heading'])[2]")  //please indicate whether label 
	WebElement pleaseindicatelabel;
	@FindBy(xpath="(//*[@class='form__fields__options-radio-opt-txt'])[3]")    //*[@id="noRadio"]
	WebElement yesradiobuttonlabel;
	@FindBy(xpath="(//*[@class='form__fields__options-radio-opt-txt'])[4]")    
	WebElement noradiobuttonlabel;
	
	@FindBy(xpath="(//*[@name='respText'])[1]")  //  
	WebElement noradiobuttonselect;
	@FindBy(xpath="(//*[@name='respText'])[2]")  //
	WebElement yesradiobuttonselect;
	@FindBy(xpath="(//*[@class='form__fields__options-mcd-radio-btn'])[3]")  //  
	WebElement noradiobutton;
	@FindBy(xpath="(//*[@class='form__fields__options-mcd-radio-btn'])[4]")  // YES RADIO BUTTON CLICKABLE
	WebElement yesradiobutton;
	@FindBy(xpath="(//*[@class='form__fields__error_msg form__fields__error_msg-display'])[12]")  //
	WebElement pleaseerrormessage;
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
	@FindBy(xpath="//*[@name='phone']/../../span") 
	WebElement phonenumbererrormessage;
	
	@FindBy(xpath="//*[@id='new_form']/div[7]/p[1]") 
	WebElement byselectingsubmit;
	@FindBy(xpath="//*[@id='new_form']/div[7]/p[2]") 
	WebElement wemaycontactlabel;
	@FindBy(xpath="//*[@id='new_form']/div[7]/p[1]/a") 
	WebElement privacypolicy;
	@FindBy(xpath="//h2[contains(text(),'Leaving McDonald')]") 
	WebElement privacypolicypopup;
	@FindBy(xpath="//*[@id='leavingCancel']") 
	WebElement canclebutton;
	@FindBy(xpath="//*[@id='globalError-form']")
	WebElement totalerromessage;
	@FindBy(xpath="//*[contains(text(),'Thank You! Test')]") 
	WebElement thankstest;
	/*@FindBy(xpath="//html/body/div[1]/div[1]/div/button") 
	WebElement canclebutton1;*/
	@FindBy(xpath="//html/body/header/nav/div[2]/div/div[2]/div[1]/ul/li[3]/a") 
	WebElement headercareerslabel;
	@FindBy(xpath="//*[@id='mcd-legal-bumper-title-id']") 
	WebElement leavingmcdonaldsheading;
	@FindBy(xpath="//*[@id='leavingCancel']") 
	WebElement leavingcancelbutton;
	@FindBy(xpath="//*[@id='bumper-continue']") 
	WebElement leavingcontinuebutton;
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
	@FindBy(xpath="//*[@id='onetrust-close-btn-container']/button") 
	WebElement balckcancelbutton;
	@FindBy(xpath="//*[@class='rl-mapview__details']/div[2]") 
	WebElement webstatuslabel;
	
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
	@FindBy(xpath="//*[@id='tell_us']")  // tell us about your visit path
	WebElement tellusaboutyourvisitlabel;
	@FindBy(xpath="//*[@id='selectedRestData']")  
	WebElement selectedrestaurantaddress;
	
	
	
	
	
	public String webstatuszipenteredvalmethod(String zip) throws Exception { 
	waitForElementToBeVisible1(searchbutton);
	this.sendKeys(this.sendzipval, zip);
	return this.getAtrributeValue(sendzipval);
}
	public String webstatuslabelmethod() throws Exception {
		return this.getText(webstatuslabel);
	}
	public String restautantlocatorwebstatusmethod() throws Exception {
		Thread.sleep(3300);
		try {
		this.click(balckcancelbutton);
		}catch (Exception e) {
			
		}
		waitForElementToBeVisible1(restaurantlocaterclick);
		this.click(restaurantlocaterclick);
		waitForElementToBeVisible1(searchbutton);
		return this.getText(zipcitylabel);
	}
	public String footerapplynowclickmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
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
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(Footerapplynowlabel);
	}
	public String footerworkingwithusclickmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
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
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(Footerworkingwithuslabel);
	}
	
	public String footerforourveteransclickmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
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
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(Footerforourveteranslabel);
	}
	public String footermeetourpeopleclickmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
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
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(Footermeetourpeoplelabel);
	}
	public String footeremployeeclickmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
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
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(Footeremployeelabel);
	}
	public String footereducationclickmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
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
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(footereducationlabel);
	}
	public String footercareersclickmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
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
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(footercareerslabel);
	}
	public String headercareersclickmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
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
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(headercareerslabel);
	}	
	
	
	public String thankstestmethod() {   
		return this.getText(thankstest);
	}
	public String totalerromessagemethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitbuttonclick);
		 this.click(submitbuttonclick);
		return this.getText(totalerromessage);	
		}
	public String totalerromessagemethod1() {
		    this.click(drivethruradiobutton);
			 this.click(submitbuttonclick);
				return this.getText(totalerromessage);	
				}
	public String totalerromessagemethod2() {
		this.click(yesradiobuttonselect);
		 this.click(submitbuttonclick);
			return this.getText(totalerromessage);	
			}
	public void canclebuttonmethod() {
		   this.click(canclebutton);
			}
	public String privacypolicypopupmethod() { 
		return this.getText(privacypolicypopup);
	}
	public void privacypolicyclickmethod() {
		   this.click(privacypolicy);
			}
	public String wemaycontactlabelmethod() { 
		return this.getText(wemaycontactlabel);
	}
	public String byselectingsubmitmethod() { 
		return this.getText(byselectingsubmit);
	}
	public String phonenumbererrormessagemethod(String pnumber) {
		this.clearContent(phonenumberclick);
		this.sendKeys(this.phonenumberclick, pnumber);
		this.click(submitbuttonclick);
		return this.getText(phonenumbererrormessage);
	}
	public String phonenumbererrormessagemethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3500);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		this.clearContent(phonenumberclick);
		this.click(submitbuttonclick);
		return this.getText(phonenumbererrormessage);
	}
	public String phonenumberenteredvalue(String pnumber) {
		this.clearContent(phonenumberclick);
		this.sendKeys(this.phonenumberclick, pnumber);
		return this.getAtrributeValue(phonenumberclick);  
	}
	public String phonenumberlabelmethod1() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitbuttonclick);
		return this.getText(phonenumberlabel);
	}
	public String phonenumberlabelmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3500);
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
	public String confirmmailerrormessmethod1() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitbuttonclick);
		this.click(submitbuttonclick);
		return this.getText(confirmmailerrormessage);
	}
	public String confirmmailenteredvalue(String entercomm) {
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
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(emaillabel);
		return this.getText(confirmemaillabel);
	}
	public String emailerrormessagemethod() throws Exception {
		this.click(submitbuttonclick);
		return this.getText(emailerrormessage);
	}
	public String emailerrormessagemethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitbuttonclick);
		this.click(submitbuttonclick);
		return this.getText(emailerrormessage);
	}
	public void mailsendmethod(String entercomm) {
		 this.clearContent(emailclick);
		this.sendKeys(this.emailclick, entercomm);
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
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(emaillabel);
		return this.getText(emaillabel);
	}
	public String pleaseerrormessagemethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(pleaseindicatelabel);
		this.click(submitbuttonclick);
		return this.getText(pleaseerrormessage);   
	}
	/*public void yesradiobuttonclickmethod() { 
		 this.click(yesradiobutton);
	}*/
	public String pleaseindicatelabelmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(pleaseindicatelabel);
		return this.getText(pleaseindicatelabel); 
	}
	
	public String yesradiobuttonlabemethod() { 
		return this.getText(yesradiobuttonlabel);  
	}
	public String noradiobuttonlabemethod() { 
		return this.getText(noradiobuttonlabel);  
	}
	
	public String Yesradiobuttonbydefaultselectmethod() {
		return this.getAtrributeValue1(yesradiobutton);  
	}
	public String Noradiobuttonbydefaultselectmethod() {
		return this.getAtrributeValue1(noradiobutton);  
	}
	
	public String Yesradiobuttonselectmethod() {
		this.click(yesradiobuttonselect);
		return this.getAtrributeValue1(yesradiobuttonselect);  
	}
	public String Noradiobuttonselectmethod() {
		this.click(noradiobuttonselect);
		return this.getAtrributeValue1(noradiobuttonselect);  
	}
	public String ziperrormessagemethod(String entercomm) { 
		this.clearContent(zipclick);
		this.sendKeys(this.zipclick, entercomm);
		this.click(submitbuttonclick);
		return this.getText(ziperrormessage);
	}
	public String ziperrormessagemethod1() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(ziplabel);
		this.clearContent(zipclick);
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
		waitForElementToBeVisible1(ziplabel);
		return this.getText(ziplabel);
	}
	
	public String stateselecteddropdownvalmethod1() {
		 this.click(stateclick);
		this.click1(statedropdownvalue);
		return this.getText(statedropdownvalue);  
	}
	public String stateerrormessagemethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(statelabel);
		this.click(submitbuttonclick);
		return this.getText(stateerrormessage);
	}
	public String statelabelmethod1() {
		  this.click(stateclick);
		return this.getText(statelabel);
	}
	public String statelabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(statelabel);
		return this.getText(statelabel);
	}
	public String cityerromessagemethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(citylabel);
		this.clearContent(cityclick);
		this.click(submitbuttonclick);
		return this.getText(cityerromessage);
	}
	public String cityenteredvalue(String entercomm) {
		this.clearContent(cityclick);
		this.sendKeys(this.cityclick, entercomm);
		return this.getAtrributeValue(cityclick);  
	}
	public String citylabelmethod1() { 
		this.click(cityclick);
		return this.getText(citylabel);
	}
	public String citylabelmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(citylabel);
		return this.getText(citylabel);
	}
	public String apisuiteenteredvalue(String entercomm) {
		 this.clearContent(aptsuiteclick);
		this.sendKeys(this.aptsuiteclick, entercomm);
		return this.getAtrributeValue(aptsuiteclick);  
	}
	public String apisitelabelmethod1()  { 
		this.click(aptsuiteclick);
		return this.getText(aptsuitelabel);
	}
	public String apisitelabelmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(aptsuitelabel);
		return this.getText(aptsuitelabel);
	}
	public String addresserrormessagemethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3400);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitbuttonclick);
		this.click(submitbuttonclick);
		return this.getText(addresserrormessage);
	}
	public String addressenterdlabel(String entercomm) {
		//this.clearContent(addressclick);
		this.sendKeys(this.addressclick, entercomm);
		return this.getAtrributeValue(addressclick);  
	}
	public String addressenterdlabel1(String entercomm) {
		this.clearContent(addressclick);
		this.sendKeys(this.addressclick, entercomm);
		return this.getAtrributeValue(addressclick);  
	}
	public String addresslabelmethod1()  { 
		this.click(addressclick);
		return this.getText(addresslabel);
	}
	public String addresslabelmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(addresslabel);
		return this.getText(addresslabel);
	}
	public String lastnameerrormesmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3400);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitbuttonclick);
		this.click(submitbuttonclick);
		return this.getText(lastnameerrormess);
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
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(lastnamelabel);
		return this.getText(lastnamelabel);
	}
	public String firstnameerror() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitbuttonclick);
		this.click(submitbuttonclick);
		return this.getText(finamerror);  
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
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(telusabout);
		return this.getText(telusabout);	
		}
	public String commenterrormessagmethod() throws Exception {
		//driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		
		waitForElementToBeVisible1(etercommentclick);
		//this.clearContent(etercommentclick);
		this.click(submitbuttonclick);
		return this.getText(commenterromessage);
	}
	public String commenterrormessagmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(etercommentclick);
		this.clearContent(etercommentclick);
		this.click(submitbuttonclick);
		return this.getText(commenterromessage);
	}
	public String commententeredvalue(String entercomm) {
		this.clearContent(etercommentclick);
		this.sendKeys(this.etercommentclick, entercomm);
		return this.getAtrributeValue(etercommentclick);
	}
	public String entercommentsmethod() {
		return this.getText(entercomments);
	}
	public String entercommentsmethod1() {
		this.click(etercommentclick);
		return this.getText(entercomments);
	}
	public String giveusfeedbacklabelmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(giveusfeedbacklabel);
		return this.getText(giveusfeedbacklabel); 
	}
	public String whatwasyourtakeawaylabelmethod() {      
		return this.getText(whatwasyourtakeawaylabel);  
	}
	public String drivethrumethod() {      
		return this.getText(drivethru);  
	}
	public String instoremethod() {      
		return this.getText(instore);  
	}
	public String whatwaserrormessagemethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitbuttonclick);
		this.click(submitbuttonclick);
		return this.getText(whatwaserrormessage);
	}
	
	public String driveradiobuttonbydefaultselectedmethod() {
		return this.getAtrributeValue1(drivethruradiobutton);  
	}
	
	public String instoreradiobuttonbydefaultselectedmethod() {
		return this.getAtrributeValue1(instoreradiobutton);  
	}
	
	public String driveradiobuttonselectedmethod() {
		this.click(drivethru);
		return this.getAtrributeValue1(drivethruradiobutton);  
	}
	public String instoreradiobuttonselectedmethod() {
		this.click(instore);
		return this.getAtrributeValue1(instoreradiobutton);  
	}
	
	
	/*public boolean drivethruradiobuttonmethod() {   
		return this.isselectedcheckbox(drivethruradiobutton);  
	}
	public boolean instoreradiobuttonmethod() {   
		return this.isselectedcheckbox(instoreradiobutton);  
	}*/
	/*public void drivethruradiobuttonclickmethod() {    
		 this.click(drivethruradiobutton);  
	}
	public void instoreradiobuttonclickmethod() {    
		 this.click(instoreradiobutton);  
	}*/
	
	
	
	
	public String pmvaluedisplayedmethod() {
		return this.getText(pmvaluedisplayed);  
	}
	public String pmvaluedisplayedmethod1() {
		 this.click(pmvaluedisplayed);
		 this.click1(amdropdownvalue);
		return this.getText(amdropdownvalue);  
	}
	public String ampmlabelmethod() {      
		return this.getText(ampmlabel);  
	}
	public String timetext12displayedmethod() {
		return this.getText(timetext12displayed1);  
	}
	public String timetext12displayedmethod1() {
		this.click(timetext12displayed);
		this.click1(selecttime);
		return this.getText(selecttime);  
	}
	public String timelabelmethod() {      
		return this.getText(timelabel);  
	}
	public String visittimelabelmethod() {      
		return this.getText(visittimelabel);  
	}
	public String yearerrormessagelabelmethod() {      
		return this.getText(yearerrormessagelabel);  
	}
	public String dayerrormessagelabelmethod() throws Exception {  
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitbuttonclick);
		this.click(submitbuttonclick);
		return this.getText(dayerrormessagelabel);
	}
	public String yearsendedvaluemethod() {
		 this.click(yearcontfindclick);
		 this.click1(yearcontfinddropdownval);
		return this.getText(yearcontfinddropdownval); 
	}
	public String daysendedvaluemethod() { 
		this.click(visitdatemothclick);
		this.click1(monthdropdownvalue);
		this.click(daycontfindclick);
		this.click1(daycontfindcdropdownval);
		return this.getText(daycontfindcdropdownval);
	}
	public String daysendedvaluemethod1() { 
		this.click(daycontfindclick);
		this.click(daycontfindcdropdownval);
		return this.getText(daycontfindclick);
	}
	public String yearcontfindlabelmethod1() {
		this.click(yearcontfindclick);
		return this.getText(yearcontfindlabel);  
	}
	public String yearcontfindlabelmethod() {      
		return this.getText(yearcontfindlabel);  
	}
	public String yearcontfindcdropdownvalmethod() { 
		return this.getText(yearcontfinddropdownval);  
	}
	public String daycontfindcdropdownvalmethod() {   
		this.click(visitdatemothclick);
		 this.click1(daycontfindcdropdownval);
		return this.getText(daycontfindcdropdownval);
	}
	public String daycontfindlabelmethod1() {
		this.click(daycontfindclick);
		return this.getText(daycontfindlabel);  
	}
	public String daycontfindlabelmethod() {      
		return this.getText(daycontfindlabel);  
	}
	public String montherrormessagemethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitbuttonclick);
		this.click(submitbuttonclick);
		return this.getText(montherrormessage); 
	}
	
	public String visitdatemothsendvaluemethod1() {
		 this.click(visitdatemothclick);
		 this.click1(monthdropdownvalue);
		return this.getText(monthdropdownvalue);  
	}
	public String visitdatelabelmethod() {      
		return this.getText(visitdatelabe);  
	}
	public String visitdatemonthlabelmethod() {      
		return this.getText(visitdatemonthlabel);
	}
	public String visitdatemonthlabelmethod1() { 
		 this.click(visitdatemothclick);
		return this.getText(visitdatemonthlabel);
	}
	public String popularlandmarksendatttmethod(String landmark) {
		 //this.clearContent(popularlandmark);
			this.sendKeys(this.popularlandmark, landmark);
     		return this.getAtrributeValue(popularlandmark); 
	}
	
	public String popularlandmarksendatttmethod1(String landmark) {
		 this.clearContent(popularlandmark);
			this.sendKeys(this.popularlandmark, landmark);
    		return this.getAtrributeValue(popularlandmark); 
	}
	public String popularlandmarklabemethod1() {
		 this.click(popularlandmark);
		return this.getText(popularlandmarklabe);  
	}
	public String popularlandmarklabemethod() {      
		return this.getText(popularlandmarklabe);  
	}
	
	
	public void Submitbuttonclickmethod() {
		 this.click(submitbuttonclick);  
	}
	public String Locatemelabelmethod() {      
		return this.getText(Locatemelabel);  
	}
	public String ORlabelmethod() {      
		return this.getText(ORlabel);  
	}	
		public String zipenteredvalmethod(String zip) throws Exception { 
		waitForElementToBeVisible1(searchbutton);
		this.sendKeys(this.sendzipval, zip);
		return this.getAtrributeValue(sendzipval);
	}
		public String zipenteredvalmethod1(String zip) throws Exception {
			 this.clearContent(sendzipval);	
		this.sendKeys(this.sendzipval, zip);
		return this.getAtrributeValue(sendzipval);
	}
	public String zipcitymethod1() throws Exception {
		this.click(restaurentclosebutton);
		return this.getText(zipcitylabel);   
	}
	public String zipcitylabelmethod() {
		return this.getText(zipcitylabel);  
	}
	public String zipcitymethod() throws Exception {
		
		waitForElementToBeVisible1(restaurantlocaterlabel);
		this.click(restaurantlocaterlabel);
		waitForElementToBeVisible1(searchbutton);
		return this.getText(zipcitylabel);
	}
	public void clickrestaurantlocatermethod() {
		 this.click(restaurantlocaterclick);
	}
	public String restaurantlocatermethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
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
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(incdicatelabel);  
	}
	
	public String Generaldropdownvalmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(clickPdt);
		this.click(clickPdt);
		this.click1(generaldropdownval);
		return this.getText(generaldropdownval);  
	}
	public String generallgetpagetitlemethod2() throws Exception {  
		this.click(submitbuttonclick);
		Thread.sleep(8000);
		return this.getPageTitle();
	}
	public String generallgetpagetitlemethod() {  
		this.click(clickgobutton);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		return this.getPageTitle();
	}
	public String generallgetpagetitlemethod1() {  
		return this.getPageTitle();
	}
	
	public void generaldropdownselectmethod() {
		 this.click(generaldropdownval);
	}
	public String Restaurantheadform() throws Exception {  
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(restaurenthead);  
	}
	public String havesomerestarentmethod() {  
		return this.getText(havesomerestarentlabel);
	}
	public String clickmobiledropdownmethod1() {
		this.click(clickPdt);
		this.click1(mobileapppath);
		return this.getText(mobileapppath);
	}
	public String clickmobiledropdownmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3500);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		this.click(clickPdt);
		return this.getText(mobileapppath);
	}
	public void clickonmobile() {     //mobile feed back select
		this.click(mobileapppath);
	}
	
	public void gobutton() {
		this.click(clickgobutton); // GO BUTTON
	}
	public String trademarkdropdownmethod1() {
		this.click(clickPdt);
		this.click1(trademarkdropdown);
		return this.getText(trademarkdropdown);
	}
	public String trademarkdropdownmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(clickPdt);
		this.click(clickPdt);
		return this.getText(trademarkdropdown);
	}
	public void trademarkdropdownvalue() {   // select Trade mark drop down value   enablebuttons
		this.click(trademarkdropdown);
	}
	
	/*public void restatentimage() {
		this.enablebuttons(restarentimg); // image enable
	}*/
	
	public Boolean restatentimage() {
		return this.enablebuttons(restarentimg);
	}
	/*public String restatentimage() {
		return this.getimgs(restarentimg);  
	}*/	
	
	
	public String restaurantaddressmethod() throws Exception {
		this.click(searchbutton);
		Thread.sleep(1500);
		this.click(searchbutton);
		waitForElementToBeVisible1(restaurantaddress);
		return this.getText(restaurantaddress); 
	}
	public String restaurantbuttonlabelmethod() {
		return this.getText(selectrestaurantbutton); 
	}
	public String restaurantbuttonclickmethod() throws Exception {
		this.click(selectrestaurantbutton);
		 waitForElementToBeVisible1(tellusaboutyourvisitlabel);
		 return this.getText(zipcitylabel);
	}
	public String selectedrestaurantaddressmethod() {
		return this.getText(selectedrestaurantaddress);
	}
	public String changerestaurantmethod() throws Exception {
		waitForElementToBeVisible1(restaurantlocaterlabel);
		return this.getText(restaurantlocaterlabel);
	}
	public String zipcitychangedmethod() throws Exception {
		
		waitForElementToBeVisible1(restaurantlocaterlabel);
		this.click(restaurantlocaterlabel);
		waitForElementToBeVisible1(searchbutton);
		return this.getText(zipcitylabel);
	}
	public String labepickdiftopic() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(3400);
		return this.getText(labelpickdift);
	}
	public void Gobuttonena() {
		this.enablebuttons(clickgobutton); // Enable go button
		
	}
	public String labepickdiftopic1() {
		 this.click(clickPdt);
			return this.getText(labelpickdift);
	}
	public String seletUSFAQs() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		waitForElementToBeVisible1(clickPdt);
		this.click(clickPdt);
		this.click1(contactuspaq);
		return this.getText(contactuspaq);
	}
	public String cityvaluemethod(String citycont) {
		this.clearContent(cityvalue);
		this.sendKeys(this.cityvalue, citycont);
		return this.getAtrributeValue(cityvalue);
	}
	public String statecontfindsendedvaluemethod1() {
		this.click(statecontfindsendedvalue);
		this.click1(statecontfinddropdown);
		return this.getText(statecontfinddropdown);	}
	public String Restaurantaddressclickmethod() {
		 this.click(resraurantaddvalue);  
		 return this.getText(resraurantaddlabel);
	}
	public String contfindlocationlabelmethod() throws Exception {  
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(contfindlocationlabel);
		return this.getText(contfindlocationlabel);  
	}
	public String restaurantaddrlabelmethods() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3500);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(contfindlocationclick);
		this.click(contfindlocationclick);
		return this.getText(resraurantaddlabel); 
	}
	public String resraurantaddvaluemethod(String rearaddress) {
		 this.clearContent(resraurantaddvalue);
		this.sendKeys(this.resraurantaddvalue, rearaddress);
		return this.getAtrributeValue(resraurantaddvalue); 
	}
	public String restaurantaddrlabelmethodsp() throws Exception { 
		return this.getText(resraurantaddlabel); 
	}
	public String restaurantadderrormessmethod() { 
		 this.clearContent(resraurantaddvalue);
		this.click(submitbuttonclick);
		return this.getText(restarentadderromessage); 
	}
	public String cityerrormessagemethod() {  
		this.clearContent(cityvalue);
		this.click(submitbuttonclick);
		return this.getText(cityerrormessage);
	}
	public String cityconatfindlabelmethod1() { 
		this.click(cityvalue);
		return this.getText(cityconatfindlabel);  
	}
	public String cityconatfindlabelmethod() {      
		return this.getText(cityconatfindlabel);  
	}
	public String statecontfinderrormessmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3400);
		try {
			this.click(balckcancelbutton);
			}catch (Exception e) {
				
			}
		this.click(contfindlocationclick);
		this.click1(submitbuttonclick);
		return this.getText(statecontfinderrormess); 
	}
	public String statecontfindsendedvaluemethod() {
		 this.click(statecontfindsendedvalue);
		 this.click1(statecontfinddropdown);
		return this.getText(statecontfinddropdown); 
	}
	
	public String statecontfindlabelmethod1() { 
		this.click(statecontfindsendedvalue);
		return this.getText(statecontfindlabel);  
	}
	public String statecontfindlabelmethod() {      
		return this.getText(statecontfindlabel);  
	}


	

}




package com.McD.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mobile_App_Feedback_Page extends Basepage {

	public Mobile_App_Feedback_Page(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id='yes-text-radio-span']/preceding-sibling::input")
	WebElement restaurenthead;
	@FindBy(xpath = "//*[@id='reset_focus']/h1") // restaurant feedback heading path
	WebElement restaurentlabel;
	@FindBy(xpath = "//*[@id='maincontent']/div/div[1]/div/section/div[2]/p[1]")
	WebElement Tellusaboutlabel;
	@FindBy(xpath = "//*[@id='maincontent']/div/div[1]/div/section/div[2]/p[2]")
	WebElement selectrestaurantlabel;
	@FindBy(xpath = "//*[@class='form-control form-navigation__select']") // click pick a different topic
	WebElement clickPdt;
	@FindBy(xpath = "//*[@class='form-control form-navigation__select']/option[5]") // General inquire dropdown path
	WebElement generaldropdownval;
	@FindBy(xpath = "//*[@class='form-navigation__label']") // selectt
	WebElement selecttopickattribte;
	@FindBy(xpath = "//*[@id='reset_focus']/h1") // General inquire heading path
	WebElement generalhead;
	@FindBy(xpath = "//*[@id='maincontent']/div/div[1]/div/section/div[3]/div/div/div/button") // go button
	WebElement clickgobutton;
	@FindBy(xpath = "//*[@class='form-control form-navigation__select']/option[3]") // restaurant feedback drop down valuse
	WebElement restarentdropdownlabel;
	@FindBy(xpath = "//*[@class='form-control form-navigation__select']/option[4]") // TRADEMARK PERMISSION
	WebElement trademarkperlabel;
	@FindBy(xpath = "//*[@class='form-control form-navigation__select']/option[2]") // contact us label path
	WebElement contactuslabel;
	@FindBy(xpath = "//*[@id='new_form']/div[1]/h2") // how t=can we help you label
	WebElement howcanwehelplabel;
	@FindBy(xpath = "//*[@id='new_form']/div[2]/p")
	WebElement wewanteverylabel;
	@FindBy(xpath = "//*[@id='new_form']/div[3]/div/p[1]") // indeactes a required field label path
	WebElement indicatesrequiredlabel;
	@FindBy(xpath = "//*[@id='new_form']/div[4]/div/section/div[1]/h2") // TELL US ABOUT IT label path
	WebElement tellusaboutitlabel;
	@FindBy(xpath = "//*[@id='new_form']/div[4]/div/section/div[2]/p") // PROVIDE MORE INFORMATION.... label path
	WebElement providemoreinformationlabel;
	@FindBy(xpath = "//*[@name='device-type-mobile']/../label") // Mobile Device Type label path
	WebElement mobiledevicetypelabel;
	@FindBy(xpath = "//*[@name='device-type-mobile']") // Mobile Device Type click path
	WebElement clickmobiledevicetype;
	@FindBy(xpath = "//*[@name='device-type-mobile']/option[2]") // smart phone drop down value path
	WebElement smartphonedropdownvalue;
	@FindBy(xpath = "//*[@name='device-type-mobile']/../../span") // Mobile Device Type error message path
	WebElement mobieldeviceerrormessage;
	@FindBy(xpath = "//*[@id='submit_form_rf']") // submit click path
	WebElement clicksubmit;
	@FindBy(xpath = "//*[@name='mobile-operating-system']/../label") // MOBILE OPERATION SYSTEM label path
	WebElement mobileoperationlabel;
	@FindBy(xpath = "//*[@name='mobile-operating-system']") // clcik MOBILE OPERATION SYSTEM path
	WebElement clickmobileoperationsystem;
	
	@FindBy(xpath = "//*[@name='mobile-operating-system']/option[2]") // clcik MOBILE OPERATION SYSTEM path
	WebElement googleandroiddropdownvalue;
	@FindBy(xpath = "//*[@name='mobile-operating-system']/../../span") // MOBILE OPERATION SYSTEM error message path
	WebElement mobileoperationerrormessage;
	@FindBy(xpath = "//*[@name='appVersion']/../label") // MOBILE app version path
	WebElement mobileappversionlabel;
	@FindBy(xpath = "//*[@name='appVersion']") // click MOBILE app version path
	WebElement clickmobileappversion;
	@FindBy(xpath = "//*[@name='appVersion']/../../span") // MOBILE app version error message path
	WebElement mobileverionerrormessage;
	@FindBy(xpath = "//*[@name='comment']/../label") // enter comments label path
	WebElement entercommentslabel;
	@FindBy(xpath = "//*[@name='comment']") // CLICK enter comments path
	WebElement clcikentercommentslabel;
	@FindBy(xpath = "//*[@name='comment']/../../span") // CLICK enter comments path
	WebElement commeterrormessage;
	@FindBy(xpath = "//*[@id='restFeedbackMainTitle']") // if appropriate label path
	WebElement ifappropriatelabel;
	
	@FindBy(xpath = "//*[@id='openpopup']") // restaurantlocator label path
	WebElement restaurantlocatorlabel;
	
	@FindBy(xpath = "//*[@id='resturant_address']/div[2]/span") // OR label path
	WebElement orlabel;
	@FindBy(xpath = "//*[@id='locateme']") // locate me label path
	WebElement locatemelabel;
	@FindBy(xpath = "//*[@id='openpopup']") // Restaurant locater click path
	WebElement restaurantlocaterclick;
	@FindBy(xpath = "//*[@id='search']/../label") // Zip,// City,// State// label// path
	WebElement zipcitylabel;
	@FindBy(xpath = "//*[@id='restaurant_close_btn']") // restaurant close button path
	WebElement restaurentclosebutton;
	@FindBy(xpath = "//*[@id='search']") // restaurant close button path
	WebElement sendzipval;
	@FindBy(xpath = "//*[@id='go-search']/span") // search button path
	WebElement searchbutton;
	@FindBy(xpath = "/html/body/main/div/div/div/div[3]/div/div/div/div/div/div[2]/div[3]/div/div[2]/div/div/div/div/span[2]") // map
																																// pin
																																// number
																																// path
	WebElement mappinnumber;
	@FindBy(xpath = "/html/body/main/div/div/div/div[3]/div/div/div/div/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div[3]/div/div[3]/div[3]/div/span") // map
																																										// pin
																																										// number
																																										// 3
																																										// path
	WebElement mappinnumber3;
	@FindBy(xpath = "//*[@id='select-location']") // SELECT RESTAURANT BUTTON path
	WebElement selectrestaurantbutton;
	@FindBy(xpath = "//*[@id='rl-list-195500282459-en-us']/button") // SELECT RESTAURANT BUTTON 6 path
	WebElement selectrestaurantbutton1;
	@FindBy(xpath = "//*[@name='restAddress']/../label") // *Restaurant Address label path
	WebElement resraurantaddlabel;
	@FindBy(xpath = "//*[@name='restAddress']") // *Restaurant Address text path
	WebElement resraurantaddvalue;
	@FindBy(xpath = "//*[@name='restCity']") // CITY text path
	WebElement cityvalue;
	@FindBy(xpath = "//*[@name='resturant_state_dropdown']") // state text path
	WebElement statevalue;
	
	@FindBy(xpath = "//*[@id='btn_load_more']") // Load More label path
	WebElement loadmorelabel;
	@FindBy(xpath = "//*[@id='btn_load_more']") // Load More click path
	WebElement loadmoreclick;
	/*@FindBy(xpath = "//html/body/main/div/div/div/div[3]/div/div/div/div/div/div[2]/div[3]/div/div/ul/li[6]/div[2]/div/span[2]")*/ // loadmore
																																	// button
																																	// is
																																	// working
																																	// or
																																	// not
	@FindBy(xpath = "//*[@id='rl-list-195500281865-en-us']/div[2]/div[1]/span[2]")																																// path
	WebElement lodemorebuttonworking;
	@FindBy(xpath = "/html/body/main/div/div[3]/div/div[3]/div/div/div/div/div/div[2]/div[3]/div/div/ul/li[6]/button") // click
																														// on
																														// select
																														// restarent
																														// in
																														// list
																														// view
																														// path
	WebElement selectrestaurantlistviewclick;
	@FindBy(xpath = "//*[@id='new_form']/div[6]/div/a") // label of can_not_find_location path
	WebElement contfindlocationlabel;
	@FindBy(xpath = "//*[@id='new_form']/div[6]/div/a") // click on can_not_find_location path
	WebElement contfindlocationclick;
	@FindBy(xpath = "//*[@id='submit_form_rf']") // submit button path
	WebElement submitbuttonclick;
	@FindBy(xpath = "//*[contains(text(),'enter Restaurant Address')]") // restaurant address error message path
	WebElement restarentadderromessage;
	@FindBy(xpath = "//*[@name='restCity']/../label") // city label path
	WebElement cityconatfindlabel;
	@FindBy(xpath = "//*[@id='restaurant-city-two-error']") // city error message path
	WebElement cityerrormessage;
	@FindBy(xpath = "//*[@name='resturant_state_dropdown']/../label") // cont find state label
	WebElement statecontfindlabel;
	@FindBy(xpath = "//*[@name='resturant_state_dropdown']") // cont find state dropdown selected value
	WebElement statecontfindsendedvalue;
	@FindBy(xpath = "//*[@name='resturant_state_dropdown']/option[2]") // cont find state dropdown value
	WebElement statecontfinddropdown;
	@FindBy(xpath = "//*[@id='resturant-state-error']") // cont find state error message
	WebElement statecontfinderrormess;
	
	@FindBy(xpath = "//*[@name='landmark']/../label") // Popular landmark label
	WebElement landmarklabe;
	@FindBy(xpath = "(//*[@name='landmark'])") // Popular landmark click
	WebElement popularlandmark;
	@FindBy(xpath = "//*[@id='restInfo']/div[5]/div/fieldset/legend") // visit date label
	WebElement visitdatelabe;
	@FindBy(xpath = "//*[@name='month']/../label") // visitdate month label
	WebElement visitdatemonthlabel;
	@FindBy(xpath = "//*[@name='month']") // visit date month
	WebElement visitdatemothclick;
	@FindBy(xpath = "//*[@name='month']/option[3]") // month dropdown value
	WebElement monthdropdownvalue;
	@FindBy(xpath = "//*[@name='day']/../label") // contfind Day label
	WebElement daycontfindlabel;
	@FindBy(xpath = "//*[@name='day']") // Day DROP DOWN
	WebElement daycontfindclick;
	@FindBy(xpath = "//*[@name='day']/option[2]") // Day DROP DOWN value
	WebElement daycontfindcdropdownval;
	
	@FindBy(xpath = "//*[@id='day-ul']") // Day DROP DOWN value
	WebElement daycontfindcdropdownval1;
	
	@FindBy(xpath = "//*[@name='year']/../label") // year label path
	WebElement yearcontfindlabel;
	@FindBy(xpath = "//*[@name='year']") // Day DROP DOWN
	WebElement yearcontfindclick;
	@FindBy(xpath = "//*[@name='year']/option[2]") // year DROP DOWN value
	WebElement yearcontfinddropdownval;
	
	@FindBy(xpath = "//*[@id='restYearUl']") // year DROP DOWN value
	WebElement yearcontfinddropdownval1;
	
	@FindBy(xpath = "//*[@id='restInfo']/div[6]/div/fieldset/legend") // visit time path
	WebElement visittimelabel;
	@FindBy(xpath = "//*[@name='time']/../label") // time path
	WebElement timelabel;
	@FindBy(xpath = "//*[@name='time']") // time path
	WebElement timetext12displayed;
	@FindBy(xpath = "//*[@name='time']/option[2]") // time path
	WebElement timetext12displayed1;
	@FindBy(xpath = "//*[@name='time']/option[3]") // time path
	WebElement timedropdown1215;
	@FindBy(xpath = "//*[@name='ampm']/../label") // ampm label path
	WebElement ampmlabel;
	@FindBy(xpath = "//*[@name='ampm']") // AM label path
	WebElement AMvaluedisplayed;
	@FindBy(xpath = "//*[@name='ampm']/option[2]") // AM label path
	WebElement AMdropdownvalu;
	
	@FindBy(xpath = "//*[@class='form__fields__options-radio-label-heading']") // what was your takeaway label path
	WebElement whatwasyourtakeawaylabel;
	@FindBy(xpath = "(//*[@class='form__fields__options-mcd-radio-btn'])[1]") // Drivethru path
	WebElement drivethru;
	@FindBy(xpath = "(//*[@class='form__fields__options-mcd-radio-btn'])[2]") // in-store path
	WebElement instore;
	@FindBy(xpath = "(//*[@name='radio-drive-trough'])[1]") // drive thru radio button path
	WebElement drivethruradiobutton;
	@FindBy(xpath = "(//*[@name='radio-drive-trough'])[2]") // in-store redio button path
	WebElement instoreradiobutton;
	@FindBy(xpath = "(//*[@class='form__fields__options-radio-opt-txt'])[1]") // drive thru radio button path
	WebElement drivethruradiobutton1;
	@FindBy(xpath = "(//*[@class='form__fields__options-radio-opt-txt'])[2]") // drive thru radio button path
	WebElement instoreradiobutton1;
	
	
	@FindBy(xpath = "//*[@id='new_form']/div[8]/div/section/div[1]/h2")
	WebElement telusabout;
	@FindBy(xpath = "//*[@name='first-name']/../label") // FIRST NAME LABEL PATH
	WebElement firstnamelabel;
	@FindBy(xpath = "//*[@name='first-name']") // first name
	WebElement firstnameclick;
	@FindBy(xpath = "//*[@name='first-name']/../../span")
	WebElement finamerror;
	@FindBy(xpath = "//*[@name='lastName']/../label") // last name
	WebElement lastnamelabel;
	@FindBy(xpath = "(//*[@name='lastName'])")
	WebElement lastnameclick;
	@FindBy(xpath = "//*[@name='lastName']/../../span")
	WebElement lastnameerrormess;
	@FindBy(xpath = "//*[@name='email']/../label") // email label path
	WebElement emaillabel;
	@FindBy(xpath = "//*[@name='email']")
	WebElement emailclick;
	@FindBy(xpath = "//*[@name='email']/../../span")
	WebElement emailerrormessage;
	@FindBy(xpath = "//*[@name='confEmail']/../label") // confirm mail label path
	WebElement confirmemaillabel;
	@FindBy(xpath = "//*[@name='confEmail']")
	WebElement confirmmailclick;
	@FindBy(xpath = "//*[@name='confEmail']/../../span")
	WebElement confirmmailerrormessage;
	@FindBy(xpath = "//*[@name='Phone']/../label") // phone number label path
	WebElement phonenumberlabel;
	@FindBy(xpath = "//*[@name='Phone']")
	WebElement phonenumberclick;
	@FindBy(xpath = "//*[@name='Phone']/../../span")
	WebElement phonenumbererrormessage;
	@FindBy(xpath = "//*[@id='new_form']/div[9]/p[1]")
	WebElement byselectingsubmit;
	@FindBy(xpath = "//*[@id='new_form']/div[9]/p[2]")
	WebElement wemaycontactlabel;
	@FindBy(xpath = "//*[contains(text(),'Privacy Policy')]")
	WebElement privacypolicy;
	@FindBy(xpath = "//*[@id='globalError-form']")
	WebElement totalerromessage;
	@FindBy(xpath = "//*[@id='onetrust-close-btn-container']/button")
	WebElement cancleblabutton;
	
	@FindBy(xpath = "//html/body/div[1]/div[1]/div/button")
	WebElement cancelbutton;
	
	@FindBy(xpath = "//*[@class='rl-mapview__details']/div[2]")
	WebElement webstatusopencloselabel;
	
	@FindBy(xpath="//*[@id='restFeedbackSubTitle']")  // Search for a restaurant: label path
	WebElement searchforlabel;
	@FindBy(xpath="//*[@id='openpopup']")  // Restaurant locater label path
	WebElement restaurantlocaterlabel;
	/*@FindBy(xpath="//*[@id='restaurant-top-div']/div/div[1]/div[1]/div/div/div/div/div[1]/div[1]/div/label")  // Zip, City, State label path
	WebElement zipcitylabel;
	@FindBy(xpath="//*[@id='go-search']/span")  //search button path
	WebElement searchbutton;
	@FindBy(xpath="//*[@id='restaurant_close_btn']")  // restaurant close button path
	WebElement restaurentclosebutton;
	@FindBy(xpath="//*[@id='search']")  // restaurant close button path
	WebElement sendzipval;*/
	@FindBy(xpath="//*[@id='rl-title-1']")  // 335 restaurant address path
	WebElement restaurantaddress;
	/*@FindBy(xpath="//*[@id='select-location']")  // SELECT RESTAURANT BUTTON path
	WebElement selectrestaurantbutton;*/
	@FindBy(xpath="//*[@id='tell_us']")  // tell us about your visit path
	WebElement tellusaboutyourvisitlabel;
	@FindBy(xpath="//*[@id='selectedRestData']")  // tell us about your visit path
	WebElement selectedrestaurantaddress;

	public String webstatusopencloselabelmethod() throws Exception {
		return this.getText(webstatusopencloselabel);
	}

	public String openclosewebmethod() throws Exception {
		Thread.sleep(3500);
		try {
			this.click(cancleblabutton);
		} catch (Exception e) {

		}
		this.click(restaurantlocaterclick);
		waitForElementToBeVisible1(zipcitylabel);
		return this.getText(zipcitylabel);
	}


	public String daysendedvaluemethodafter2() {
		this.click(daycontfindcdropdownval);
		return this.getText(daycontfindclick);
	}

	public String daysendedvaluemethodafter1() {
		this.click(daycontfindclick);
		this.click1(daycontfindcdropdownval);
		return this.getText(daycontfindcdropdownval);
	}

	public void Restaurantaddresssendmethodpo(String rearaddress) {
		this.click(contfindlocationclick);
		this.clearContent(resraurantaddvalue);
		this.sendKeys(this.resraurantaddvalue, rearaddress);
	}

	public void Submitbuttonclickmethod() {
		this.click(submitbuttonclick);
	}

	public void googleandroiddropdownvaluemethoderror() {
		this.click(clickmobileoperationsystem);
		this.click(googleandroiddropdownvalue);
	}

	public void mobiledevicetypeclickableerror() {
		this.click(clickmobiledevicetype);
		this.click(smartphonedropdownvalue);
	}

	public String totalerromessagemethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancleblabutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(submitbuttonclick);
		this.click(submitbuttonclick);
		return this.getText(totalerromessage);
	}

	public void privacypolicyclickmethod() {
		this.click(privacypolicy);
	}

	public String wemaycontactlabelmethod() {
		return this.getText(wemaycontactlabel);
	}

	public String byselectingsubmitmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancleblabutton);
		} catch (Exception e) {

		}
		return this.getText(byselectingsubmit);
	}

	public String phonenumbererrormessagemethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancleblabutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(phonenumberlabel);
		this.click(submitbuttonclick);
		return this.getText(phonenumbererrormessage);
	}

	public String phonenumbererrormessagemethod(String pnumber) {
		this.clearContent(phonenumberclick);
		this.sendKeys(this.phonenumberclick, pnumber);
		this.click(submitbuttonclick);
		return this.getText(phonenumbererrormessage);
	}

	public String phonenumberenteredvalue(String pnumber) {
		//this.clearContent(phonenumberclick);
		this.sendKeys(this.phonenumberclick, pnumber);
		return this.getAtrributeValue(phonenumberclick);
	}
	public String phonenumberenteredvalue1(String pnumber) {
		this.clearContent(phonenumberclick);
		this.sendKeys(this.phonenumberclick, pnumber);
		return this.getAtrributeValue(phonenumberclick);
	}

	public String phonenumberlabelmethod1() {
		this.click(phonenumberclick);
		return this.getText(phonenumberlabel);
	}

	public String phonenumberlabelmethod() throws Exception {
		driver.navigate().refresh();
		waitForElementToBeVisible1(phonenumberlabel);
		return this.getText(phonenumberlabel);
	}

	public String confirmmailerrormessmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancleblabutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(submitbuttonclick);
		this.click(submitbuttonclick);
		return this.getText(confirmmailerrormessage);
	}

	public String confirmmailerrormessmethod1() throws Exception {
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

	public String confirmmaillabelmethod1() {
		this.click(confirmmailclick);
		return this.getText(confirmemaillabel);
	}

	public String confirmmaillabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancleblabutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(confirmemaillabel);
		return this.getText(confirmemaillabel);
	}

	public String emailerrormessagemethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancleblabutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(emaillabel);
		this.click(submitbuttonclick);
		return this.getText(emailerrormessage);
	}

	public void emailclearmethod() {
		this.clearContent(emailclick);
	}

	public String emailerrormessagemethod() {
		this.click(confirmemaillabel);
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
		Thread.sleep(3300);
		try {
			this.click(cancleblabutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(emaillabel);
		return this.getText(emaillabel);
	}

	public String lastnameerrormesmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancleblabutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(lastnamelabel);
		this.click(submitbuttonclick);
		return this.getText(lastnameerrormess);
	}

	public String lastnameenterdvalue(String entercomm) {
		this.clearContent(lastnameclick);
		this.sendKeys(this.lastnameclick, entercomm);
		return this.getAtrributeValue(lastnameclick);
	}
	public String lastnameenterdvalue1(String entercomm) {
		//this.clearContent(lastnameclick);
		this.sendKeys(this.lastnameclick, entercomm);
		return this.getAtrributeValue(lastnameclick);
	}


	public String lastnamelabelmethod1() {
		this.click(lastnameclick);
		return this.getText(lastnamelabel);
	}

	public String lastnamelabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancleblabutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(lastnamelabel);
		return this.getText(lastnamelabel);
	}

	public String firstnameerror() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancleblabutton);
		} catch (Exception e) {

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
	public String finameEnteredvalue1(String firname) {
		//this.clearContent(firstnameclick);
		this.sendKeys(this.firstnameclick, firname);
		return this.getAtrributeValue(firstnameclick);
	}

	public String firstnamelabelmethod1() {
		this.click(firstnameclick);
		return this.getText(firstnamelabel);
	}

	public String firstnamelabelmethod() {
		return this.getText(firstnamelabel);
	}

	public String teluraboutmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancleblabutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(telusabout);
		return this.getText(telusabout);
	}

	public String instoreradiobuttonselectedmethod() {
		this.click(instoreradiobutton);
		return this.getAtrributeValue1(instoreradiobutton);
	}

	public String driveradiobuttonselectedmethod() {
		this.click(drivethruradiobutton);
		return this.getAtrributeValue1(drivethruradiobutton);
	}

	public String instoreradiobuttonbydefaultselectedmethod() {
		return this.getAtrributeValue1(instoreradiobutton);
	}

	public String driveradiobuttonbydefaultselectedmethod() {
		return this.getAtrributeValue1(drivethruradiobutton);
	}

	public String instoremethod() {
		return this.getText(instoreradiobutton1);
	}

	public String drivethrumethod() {
		return this.getText(drivethruradiobutton1);
	}

	public String whatwasyourtakeawaylabelmethod() {
		return this.getText(whatwasyourtakeawaylabel);
	}

	public String pmvaluedisplayedmethod() {
		this.click(AMdropdownvalu);
		return this.getText(AMvaluedisplayed);
	}

	public String AMdropdownvalumethod() {
		this.click(AMvaluedisplayed);
		this.click1(AMdropdownvalu);
		return this.getText(AMdropdownvalu);
	}

	public String AMvaluedisplayedmethod() {
		return this.getText(AMdropdownvalu);
	}

	public String ampmlabelmethod() {
		return this.getText(ampmlabel);
	}

	public String timetext12displayedmethod1() {
		this.click(timedropdown1215);
		return this.getText(timetext12displayed);
	}

	public String timedropdown1215method() {
		this.click(timetext12displayed);
		this.click1(timedropdown1215);
		return this.getText(timedropdown1215);
	}

	public String timetext12displayedmethod4() {
		this.click(timedropdown1215);
		return this.getText(timetext12displayed);
	}

	public String timetext12displayedmethod() {
		// this.click(timedropdown1215);
		return this.getText(timetext12displayed1);
	}

	public String timelabelmethod() {
		return this.getText(timelabel);
	}

	public String visittimelabelmethod() {
		return this.getText(visittimelabel);
	}

	public String yearsendedvaluemethodafter1() {
		this.click(yearcontfinddropdownval);
		return this.getText(yearcontfindclick);
	}

	public String yearsendedvaluemethodafter() {
		this.click(yearcontfindclick);
		this.click1(yearcontfinddropdownval);
		return this.getText(yearcontfinddropdownval);
	}

	public String daysendedvaluemethodafter() {
		this.click(visitdatemothclick);
		this.click(monthdropdownvalue);
		this.click(daycontfindclick);
		this.click(daycontfindcdropdownval);
		return this.getText(daycontfindclick);
	}

	/*
	 * public void yearcontfindcdropdownvalmethod() {
	 * this.displayedtext(yearcontfinddropdownval); }
	 */
	public String yearcontfindcdropdownvalmethod() {
		return this.getText(yearcontfinddropdownval);
	}

	public String yearcontfindlabelmethod1() {
		this.click(yearcontfindclick);
		return this.getText(yearcontfindlabel);
	}

	public String yearcontfindlabelmethod() {
		return this.getText(yearcontfindlabel);
	}

	/*
	 * public void daycontfindcdropdownvalmethod() {
	 * this.displayedtext(daycontfindcdropdownval); }
	 */
	public String daycontfindcdropdownvalmethod() {
		return this.getText(daycontfindcdropdownval);
	}

	public String daycontfindlabelmethod1() {
		this.click(daycontfindclick);
		return this.getText(daycontfindlabel);
	}

	public String daycontfindlabelmethod() {
		return this.getText(daycontfindlabel);
	}

	public String visitdatemothsendvaluemethod1() {
		this.click(visitdatemothclick);
		this.click1(monthdropdownvalue);
		return this.getText(monthdropdownvalue);
	}

	public String visitdatemothsendvaluemethod() {
		this.click(monthdropdownvalue);
		return this.getText(visitdatemothclick);
	}

	public String visitdatemonthlabelmethod2() {
		this.click(visitdatemothclick);
		this.click1(monthdropdownvalue);
		return this.getText(monthdropdownvalue);
	}

	public String visitdatemonthlabelmethod1() {
		this.click(visitdatemothclick);
		return this.getText(visitdatemonthlabel);
	}

	public String visitdatemonthlabelmethod() {
		return this.getText(visitdatemonthlabel);
	}

	public String visitdatelabelmethod() {
		return this.getText(visitdatelabe);
	}

	public String popularlandmarksendatttmethod() {
		return this.getAtrributeValue(popularlandmark);
	}

	public String popularlandmarksendatttmethod1(String landmark) {
		//this.clearContent(popularlandmark);
		this.sendKeys(this.popularlandmark, landmark);
		return this.getAtrributeValue(popularlandmark);
	}

	public String landmarklabemethod1() {
		this.click(popularlandmark);
		return this.getText(landmarklabe);
	}

	public String landmarklabemethod() {
		return this.getText(landmarklabe);
	}

	public String statecontfinderrormessmethod() {
		this.click(submitbuttonclick);
		return this.getText(statecontfinderrormess);
	}

	public String statecontfindsendedvaluemethod() {
		this.click(statecontfindsendedvalue);
		this.click(statecontfinddropdown);
		return this.getText(statecontfinddropdown);
	}

	public String statecontfindlabelmethod3() {
		this.click(statecontfindsendedvalue);
		this.click1(statecontfinddropdown);
		return this.getText(statecontfinddropdown);
	}

	public String statecontfindlabelmethod2() {
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

	public String restaurantadderrormessmethod() {
		this.clearContent(resraurantaddvalue);
		this.click(submitbuttonclick);
		return this.getText(restarentadderromessage);
	}

	public String restaurantaddrlabelmethod3() {
		this.click(resraurantaddvalue);
		return this.getText(resraurantaddlabel);
	}

	public String restaurantaddrlabelmethod2() {
		return this.getText(resraurantaddlabel);
	}

	public String contfindlocationlabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancleblabutton);
		} catch (Exception e) {

		}
		return this.getText(contfindlocationlabel);
	}

	public String restaurantaddrlabelmethod1() {
		this.click(selectrestaurantlistviewclick);
		return this.getText(resraurantaddlabel);
	}

	public String lodemorebuttonworkingmethod() throws Exception {
		this.click(loadmoreclick);
		waitForElementToBeVisible1(lodemorebuttonworking);
		return this.getText(lodemorebuttonworking);
	}

	

	public String statevaluemethod() {
		return this.getText(statevalue);
	}

	public String cityvaluemethod1(String citycont) {
		this.clearContent(cityvalue);
		this.sendKeys(this.cityvalue, citycont);
		return this.getAtrributeValue(cityvalue);
	}

	public String cityvaluemethod() {
		return this.getAtrributeValue(cityvalue);
	}

	public String resraurantaddvaluemethod(String rearaddress) {
		this.clearContent(resraurantaddvalue);
		this.sendKeys(this.resraurantaddvalue, rearaddress);
		return this.getAtrributeValue(resraurantaddvalue);
	}

	public String resraurantaddvaluemethod1(String rearaddress) {
		this.click(contfindlocationclick);
		this.clearContent(resraurantaddvalue);
		this.sendKeys(this.resraurantaddvalue, rearaddress);
		return this.getAtrributeValue(resraurantaddvalue);
	}

	public String resraurantaddvaluemethod1() {
		return this.getAtrributeValue(resraurantaddvalue);
	}

	public String restaurantaddrlabelmethod33() throws Exception {
		this.click(selectrestaurantbutton);
		waitForElementToBeVisible1(resraurantaddlabel);
		return this.getText(resraurantaddlabel);
	}

	public String restaurantaddrlabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancleblabutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(submitbuttonclick);
		this.click(contfindlocationclick);
		waitForElementToBeVisible1(resraurantaddlabel);
		return this.getText(resraurantaddlabel);
	}

	public String restaurantaddrlabelmethod11() throws Exception {
		this.click(selectrestaurantbutton1);
		waitForElementToBeVisible1(resraurantaddlabel);
		return this.getText(resraurantaddlabel);
	}

	public String mappinnumber3method() throws Exception {
		this.click(mappinnumber3);
		waitForElementToBeVisible1(mappinnumber);
		return this.getText(mappinnumber);
	}

	public String mappinnumbermethod() throws Exception {
		this.click(searchbutton);
		waitForElementToBeVisible1(webstatusopencloselabel);
		return this.getText(webstatusopencloselabel);
	}

	public String zipenteredvalmethod(String zip) throws Exception {
		waitForElementToBeVisible1(searchbutton);
		this.sendKeys(this.sendzipval, zip);
		return this.getAtrributeValue(sendzipval);
	}

	public String zipcitymethod1() {
		this.click(restaurentclosebutton);
		return this.getText(zipcitylabel);
	}

	public String zipcitymethod() throws Exception {
		
		waitForElementToBeVisible1(restaurantlocaterlabel);
		this.click(restaurantlocaterlabel);
		waitForElementToBeVisible1(searchbutton);
		return this.getText(zipcitylabel);
	}

	public String locatemelabelmethod() {
		return this.getText(locatemelabel);
	}

	public String orlabelmethod() {
		return this.getText(orlabel);
	}

	public String restaurantlocatorlabelmethod() {
		return this.getText(restaurantlocatorlabel);
	}

	public String ifappropriatelabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancleblabutton);
		} catch (Exception e) {

		}
		return this.getText(ifappropriatelabel);
	}

	public String commeterrormessagemethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancleblabutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(clicksubmit);
		this.click(clicksubmit);
		return this.getText(commeterrormessage);
	}

	public String commeterrormessagemethod() {
		this.click(firstnameclick);
		return this.getText(commeterrormessage);
	}

	public String entercommentsendedvaluemethod(String comment) {
		this.clearContent(clcikentercommentslabel);
		this.sendKeys(this.clcikentercommentslabel, comment);
		return this.getAtrributeValue(clcikentercommentslabel);
	}

	public String clcikentercommentslabelmethod() {
		this.click(clcikentercommentslabel);
		return this.getText(entercommentslabel);
	}

	public String entercommentslabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancleblabutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(clickPdt);
		return this.getText(entercommentslabel);
	}

	public String mobileverionerrormessagemethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancleblabutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(clickPdt);
		this.click(clicksubmit);
		return this.getText(mobileverionerrormessage);
	}

	public String mobileversionsendedvaluemethod(String mobilever) {
		this.clearContent(clickmobileappversion);
		this.sendKeys(this.clickmobileappversion, mobilever);
		return this.getAtrributeValue(clickmobileappversion);
	}

	public String mobileappversionclciklabelmethod() {
		this.click(clickmobileappversion);
		return this.getText(mobileappversionlabel);
	}

	public String mobileappversionlabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancleblabutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(mobileappversionlabel);
		return this.getText(mobileappversionlabel);
	}

	public String mobileoperationerrormessagemethod() {
		this.click(clicksubmit);
		return this.getText(mobileoperationerrormessage);
	}

	public String mobieldeviceerrormessagemethod() {
		this.click(clicksubmit);
		return this.getText(mobieldeviceerrormessage);
	}

	public String mobileopersysgetattribute() {
		this.click(googleandroiddropdownvalue);
		return this.getText(clickmobileoperationsystem);
	}

	public String googleandroiddropdownvaluemethod() throws Exception {
		driver.navigate().refresh();
		waitForElementToBeVisible1(clickmobileoperationsystem);
		this.click(clickmobileoperationsystem);
		this.click1(googleandroiddropdownvalue);
		return this.getText(googleandroiddropdownvalue);
		
	}
	public String googleandroiddropdownvaluemethod1() throws Exception {
		//driver.navigate().refresh();
		waitForElementToBeVisible1(clickmobileoperationsystem);
		this.click(clickmobileoperationsystem);
		this.click1(googleandroiddropdownvalue);
		return this.getText(googleandroiddropdownvalue);
		
	}

	public String clcikmobileoperationmethod() {
		this.click(clickmobileoperationsystem);
		return this.getText(mobileoperationlabel);
	}

	public String mobileoperationlabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancleblabutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(mobileoperationlabel);
		return this.getText(mobileoperationlabel);
	}

	public String mobiledevicetypegetattribute() {
		this.click(smartphonedropdownvalue);
		return this.getText(clickmobiledevicetype);
	}

	public String mobiledevicetypeclickable() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancleblabutton);
		} catch (Exception e) {

		}
		 waitForElementToBeVisible1(clickmobiledevicetype);
			this.click(clickmobiledevicetype);
			this.click1(smartphonedropdownvalue);
			return this.getText(smartphonedropdownvalue);
	}

	public String clickmobiledevicetypelabelmethod() {
		this.click(clickmobiledevicetype);
		return this.getText(mobiledevicetypelabel);
	}

	public String mobiledevicetypelabelmethod() {
		return this.getText(mobiledevicetypelabel);
	}

	public String providemoreinformationlabelmethod() {
		return this.getText(providemoreinformationlabel);
	}

	public String tellusaboutitlabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancleblabutton);
		} catch (Exception e) {

		}
		return this.getText(tellusaboutitlabel);
	}

	public String indicatesrequiredlabelmethod() {
		return this.getText(indicatesrequiredlabel);
	}

	public String wewanteverylabelmethod() {
		return this.getText(wewanteverylabel);
	}

	public String howcanwehelplabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancleblabutton);
		} catch (Exception e) {

		}
		return this.getText(howcanwehelplabel);
	}

	public String contactusgetpagetitlemethod1() {
		this.click(clickgobutton); // GO BUTTON
		return this.getPageTitle();
	}

	public String contactusgetAtrributeValuemethod() {
		this.click(contactuslabel);
		return this.getText(selecttopickattribte);
	}

	public String contactusdropdownlabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancleblabutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(clickPdt);
		this.click(clickPdt);
		this.click1(contactuslabel);
		return this.getText(contactuslabel);
	}

	public String trademarkgetpagetitlemethod1() {
		this.click(clickgobutton); // GO BUTTON
		return this.getPageTitle();
	}

	public String trademarkgetAtrributeValuemethod() {
		this.click(trademarkperlabel);
		return this.getText(selecttopickattribte);
	}

	public String trademarkdropdownlabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancleblabutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(clickPdt);
		this.click(clickPdt);
		this.click1(trademarkperlabel);
		return this.getText(trademarkperlabel);
	}

	public String restaurantgetpagetitlemethod1() {
		this.click(clickgobutton); // GO BUTTON
		return this.getPageTitle();
	}

	public String restaurantgetAtrributeValuemethod() {
		this.click(restarentdropdownlabel);
		return this.getText(selecttopickattribte);
		
	}

	public String restarentdropdownlabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancleblabutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(clickPdt);
		this.click(clickPdt);
		this.click1(restarentdropdownlabel);
		return this.getText(restarentdropdownlabel);
		
	}

	public String generallgetpagetitlemethod1() {
		this.click(clickgobutton); // GO BUTTON
		return this.getPageTitle();
	}

	public String GeneralgetAtrributeValuemethod() {
		this.click(clickPdt);
		this.click1(generaldropdownval);
		return this.getText(selecttopickattribte);
	}

	public String Generaldropdownvalmethod() {
		this.click(clickPdt);
		this.click1(generaldropdownval);
		return this.getText(generaldropdownval);
	}

	public String selectrestaurantlabelmethod() {
		return this.getText(selectrestaurantlabel);
	}

	public String tellusaboutlabelmethod() {
		return this.getText(Tellusaboutlabel);
	}

	public String Restaurantlabelmethod() throws Exception {
		Thread.sleep(3300);
		try {
			this.click(cancleblabutton);
		} catch (Exception e) {

		}
		return this.getText(restaurentlabel);
	}

	public String generallgetpagetitlemethodpage() throws Exception {
		this.click(submitbuttonclick);
		Thread.sleep(10000);
		return this.getPageTitle();
	}

	public String generallgetpagetitlemethod() {
		try {
			this.click(cancleblabutton);
		} catch (Exception e) {

		}
		return this.getPageTitle();
	}

	public void Gobuttonena() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancleblabutton);
		} catch (Exception e) {

		}
		this.enablebuttons(clickgobutton); // Enable go button
	}

	public String restaurantaddressmethod() throws Exception  {
			this.click(searchbutton);
			Thread.sleep(1500);
			this.click(searchbutton);
			waitForElementToBeVisible1(restaurantaddress);
			return this.getText(restaurantaddress);  
		}

	public String restaurantbuttonclickmethod() throws Exception {
		this.click(selectrestaurantbutton);
		 waitForElementToBeVisible1(tellusaboutyourvisitlabel);
		 return this.getText(zipcitylabel);
	}
	}



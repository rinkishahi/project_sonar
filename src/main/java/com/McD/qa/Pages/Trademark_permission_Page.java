package com.McD.qa.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.support.FindBy;

public class Trademark_permission_Page extends Basepage {
	public Trademark_permission_Page(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id='reset_focus']/h1")
	WebElement trademarkpermissionlabel;
	@FindBy(xpath = "//html/body/main/div/div/div/div/div/p")
	WebElement interestedusinglabel;
	@FindBy(xpath = "//*[@id='dif-topic-label']")
	WebElement pickdifferenttopiclabe;
	@FindBy(xpath = "//*[@id='select_topic']") // click pick a different topic
	WebElement clickPdt;
	@FindBy(xpath = "//li[contains(text(),'General Inquiry')]") // General inquire dropdown path
	WebElement generaldropdownval;
	@FindBy(xpath = "//*[@id='select_topic']") // select
	WebElement selecttopickattribte;
	@FindBy(xpath = "//*[@id='topicgo']") // go button
	WebElement clickgobutton;
	@FindBy(xpath = "//*[@id='form-choose-topic-3']") // restaurant feedback drop down valuse
	WebElement restarentdropdownlabel;
	@FindBy(xpath = "//*[@id='form-choose-topic-2']") // restaurant feedback drop down valuse
	WebElement mobiledropdownlabel;
	@FindBy(xpath = "//*[@id='form-choose-topic-0']") // contact us label path
	WebElement contactuslabel;
	@FindBy(xpath = "//*[@id='variation-comp']/div/div/h2") // how can we help you us label path
	WebElement howcanwehelpyoulabel;
	@FindBy(xpath = "//*[@id='variation-comp']/div/div/p[1]") // we spent over fifty label path
	WebElement wespentoverlabel;
	@FindBy(xpath = "//*[@id='variation-comp']/div/div/p[2]") // if you have label path
	WebElement ifyouhavelabel;
	@FindBy(xpath = "//*[@id='contactus']/div[2]/div/p[1]") // indicates a required label path
	WebElement indicatesarequiredlabel;
	@FindBy(xpath = "//*[@id='personalinfoFranTrademark']") // REASON FOR YOU label path
	WebElement reasonforyoulabel;
	@FindBy(xpath = "//*[@id='select-option-label']") // please select any one option label path
	WebElement pleaseselectlabel;
	@FindBy(xpath = "//*[@id='select-option']") // clcick please select any one option label path
	WebElement clcikpleaseselectlabel;
	@FindBy(xpath = "//*[@id='trademark-chooseopt-2']") // drop down value path
	WebElement pleaseselectdropdownvalue;
	@FindBy(xpath = "//*[@id='personalinfoAbtYourReq']") // drop down value path
	WebElement tellusaboutlabel;
	@FindBy(xpath = "//*[@id='enter_comments_describe_req_lbl']") // enter comments label path
	WebElement entercommentslabel;
	@FindBy(xpath = "//*[@id='enter_comments_describe_req']") // CLICK enter comments path
	WebElement clcikentercommentslabel;
	@FindBy(xpath = "//*[@id='describe-req-comnts-error']") // error enter comments path
	WebElement commeterrormessage;
	@FindBy(xpath = "//*[@id='submit_form']") // submit click path
	WebElement clicksubmit;
	@FindBy(xpath = "//*[@id='how-will-it-used-lbl']") // how will it be used path
	WebElement howwillitbelabel;
	@FindBy(xpath = "//*[@id='how-will-it-used']") // clcik how will it be used path
	WebElement clcikhowwillitbelabel;
	@FindBy(xpath = "//*[@id='how-will-used']") // error message how will it be used path
	WebElement howwillitbeerrormessage;
	@FindBy(xpath = "//*[@id='audience-label']") // WHAT IS INTENTED LABEL PATH
	WebElement whatisintentedlabel;
	@FindBy(xpath = "//*[@id='audience']") // click what is intented PATH
	WebElement clcikwhatisintentedlabel;
	@FindBy(xpath = "//*[@id='audience-distribution-used']") // ERROR MESSAGE what is intented PATH
	WebElement whatisintentederrormessage;
	@FindBy(xpath = "//*[@id='how-long-label']") // HOW LONG WILL LABEL PATH
	WebElement howlongwillitlabel;
	@FindBy(xpath = "//*[@id='how-long']") // click HOW LONG WILL PATH
	WebElement clickhowlongwillitlabel;
	@FindBy(xpath = "//*[@id='how-long-used']") // error message HOW LONG WILL PATH
	WebElement errormessagehowlongwillitlabel;
	@FindBy(xpath = "//*[@id='personalinfoAbtYourReq1']") // have you previously labe PATH
	WebElement haveyoupreviouslylabel;
	@FindBy(xpath = "//*[@id='yesTradeRadio']") // YES labe PATH
	WebElement yesradiobuttonlabel;
	@FindBy(xpath = "//*[@id='noTradeRadio']") // no labe PATH
	WebElement noradiobuttonlabel;
	@FindBy(xpath = "//*[@id='yes-text-radio-span']/preceding-sibling::input") // yes radio button path
	WebElement yesradiobutton;
	@FindBy(xpath = "//*[@id='no-text-radio-span']/preceding-sibling::input") // no radio button path
	WebElement noradiobutton;
	@FindBy(xpath = "//*[@id='yes-text-radio-span']") // click yes radio button path
	WebElement clickyesradiobutton;
	@FindBy(xpath = "//*[@id='no-text-radio-span']") // click no radio button path
	WebElement clicknoradiobutton;
	@FindBy(xpath = "//*[@id='previous_requested']") // error message radio button path
	WebElement errormessageradiobutton;
	@FindBy(xpath = "//*[@id='reqSubmitlbl']") // when was the request submited label path
	WebElement whenwastherequestedlabel;
	@FindBy(xpath = "//*[@id='month-trade-label']") // when was the request month label
	WebElement whenwasemonthlabel;
	@FindBy(xpath = "//*[@id='month-trade']") // click when was the request month label
	WebElement whenwasemonthclick;
	@FindBy(xpath = "//*[@id='February']") // month dropdown value
	WebElement monthdropdownvalue;
	@FindBy(xpath = "//*[@id='month-error-trade']") // month error message value
	WebElement montherrormessage;
	@FindBy(xpath = "//*[@id='day-trade-label']") // contfind Day label
	WebElement daycontfindlabel;
	@FindBy(xpath = "//*[@id='day-trade']") // Day DROP DOWN
	WebElement daycontfindclick;
	@FindBy(xpath = "//*[@id='01']") // Day DROP DOWN value
	WebElement daycontfindcdropdownval;
	@FindBy(xpath = "//*[@id='tradeDayUl']") // Day DROP DOWN value
	WebElement daycontfindcdropdownval1;
	@FindBy(xpath = "//*[@id='year-trade-label']") // year label path
	WebElement yearcontfindlabel;
	@FindBy(xpath = "//*[@id='year-trade']") // Day DROP DOWN
	WebElement yearcontfindclick;
	@FindBy(xpath = "//*[@id='2020']") // year DROP DOWN value
	WebElement yearcontfinddropdownval;
	@FindBy(xpath = "//*[@id='yesrUl']") // year DROP DOWN value
	WebElement yearcontfinddropdownval1;
	@FindBy(xpath = "//*[@id='day-error-trade']") // day error message
	WebElement dayerrormessage;
	@FindBy(xpath = "//*[@id='year-error-trade']") // YEAR error message
	WebElement yearerrormessage;
	@FindBy(xpath = "//*[@id='grantedId']") // WHAT WAS THE OUTCOME LABEL PATH
	WebElement whatwastheoutcomelabel;
	@FindBy(xpath = "//*[@id='describe-req']/section[1]/fieldset[3]/div/div/label[1]/span[2]") // GRANTED LABEL PATH
	WebElement grantedlabel;
	@FindBy(xpath = "//*[@id='describe-req']/section[1]/fieldset[3]/div/div/label[2]/span[2]") // DENIED LABEL PATH
	WebElement deniedlabel;
	@FindBy(xpath = "//*[@id='describe-req']/section[1]/fieldset[3]/div/div/label[3]/span[2]") // UNKNOWN LABEL PATH
	WebElement unknownlabel;
	@FindBy(xpath = "//*[@id='outcome-0-span']/preceding-sibling::input") // GRANTED radio button LABEL PATH
	WebElement grantedradiobutton;
	@FindBy(xpath = "//*[@id='outcome-1-span']/preceding-sibling::input") // denied radio button LABEL PATH
	WebElement deniedradiobutton;
	@FindBy(xpath = "//*[@id='outcome-2-span']/preceding-sibling::input") // unknown radio button LABEL PATH
	WebElement unknownradiobutton;
	@FindBy(xpath = "//*[@id='outcome-0-span']") // click GRANTED radio button PATH
	WebElement clickgrantedradiobutton;
	@FindBy(xpath = "//*[@id='outcome-1-span']") // click denied radio button PATH
	WebElement clcikdeniedradiobutton;
	@FindBy(xpath = "//*[@id='outcome-2-span']") // click unknown radio button PATH
	WebElement clickunknownradiobutton;
	@FindBy(xpath = "//*[@id='out-come']") // click unknown radio button PATH
	WebElement erromessgewhatwasoutcome;
	@FindBy(xpath = "//*[@id='personalinfoFranBookPubl']") // BOOK PUBLICATION LABE PATH
	WebElement bookpublicationlabel;
	@FindBy(xpath = "//*[@id='author-id-label']") // author LABE PATH
	WebElement authorlabel;
	@FindBy(xpath = "//*[@id='author']") // click author PATH
	WebElement authorclick;
	@FindBy(xpath = "//*[@id='author-error']") // author error message PATH
	WebElement authorerrormessage;
	@FindBy(xpath = "//*[@id='publisher-label']") // publisher labe PATH
	WebElement publisherlabel;
	@FindBy(xpath = "//*[@id='publisher']") // publisher CLICK PATH
	WebElement publisherclick;
	@FindBy(xpath = "//*[@id='publication-and-edi-lbl']") // publication labe PATH
	WebElement publicationlabel;
	@FindBy(xpath = " //*[@id='publication-and-edition']") // publication CLICK PATH
	WebElement publicationclick;
	@FindBy(xpath = " //*[@id='publisher-error']") // PUBLISHER ERROR MESSAGE PATH
	WebElement publishererrormessage;
	@FindBy(xpath = " //*[@id='publication-and-edition-error']") // publication ERROR MESSAGE PATH
	WebElement publicationrerrormessage;
	@FindBy(xpath = "//*[@id='supportingAttachementHeader']") // supporting attachment PATH
	WebElement supportingattachmentlabel;
	@FindBy(xpath = "//*[@id='personalinfoSuprtAttcDesc']") // please upload file or images PATH
	WebElement pleaseuploaddocumentslabel;
	@FindBy(xpath = "//*[@id='fileOneText']") // file one label PATH
	WebElement fileonelabel;
	@FindBy(xpath = "//*[@id='browse-file-one-error']") // file one error PATH
	WebElement fileoneerrormsg;
	
	@FindBy(xpath = "//*[@id='fileTwoText']") // file two label PATH
	WebElement filetwolabel;
	@FindBy(xpath = "//*[@id='browse-file-two-error']") // file one error PATH
	WebElement filetwoerrormsg;
	
	@FindBy(xpath = "//*[@id='fileThreeText']") // file three label PATH
	WebElement filethreelabel;
	@FindBy(xpath = "//*[@id='browse-file-three-error']") // file one error PATH
	WebElement filethreeerrormsg;
	
	@FindBy(xpath = "//*[@id='personalinfoSecHeading']")
	WebElement telusabout;
	@FindBy(xpath = "//*[@id='first_name_label']") // FIRST NAME LABEL PATH
	WebElement firstnamelabel;
	@FindBy(xpath = "//*[@id='first_name']") // first name
	WebElement firstnameclick;
	@FindBy(xpath = "//*[@id='first-name-error']")
	WebElement finamerror;
	@FindBy(xpath = "//*[@id='last_name_label']") // last name
	WebElement lastnamelabel;
	@FindBy(xpath = "//*[@id='last_name']")
	WebElement lastnameclick;
	@FindBy(xpath = "//*[@id='last-name-error']")
	WebElement lastnameerrormess;
	@FindBy(xpath = "//*[@id='address-label']") // address label path
	WebElement addresslabel;
	@FindBy(xpath = "//*[@id='address']")
	WebElement addressclick;
	@FindBy(xpath = "//*[@id='address-error']")
	WebElement addresserrormessage;
	@FindBy(xpath = "//*[contains(text(),'Apt/Suite')]") // APT/SUITE PATH
	WebElement aptsuitelabel;
	@FindBy(xpath = "//*[@id='apt_suit']")
	WebElement aptsuiteclick;
	@FindBy(xpath = "//*[@id='city_label']") // city label path
	WebElement citylabel;
	@FindBy(xpath = "//*[@id='city']")
	WebElement cityclick;
	@FindBy(xpath = "//*[@id='city-error']")
	WebElement cityerromessage;
	@FindBy(xpath = "//*[@id='state-label']") // state label path
	WebElement statelabel;
	@FindBy(xpath = "//*[@id='state']")
	WebElement stateclick;
	@FindBy(xpath = "//*[@id='state-error']")
	WebElement stateerrormessage;
	@FindBy(xpath = "//*[@id='personalinfo-state-0']")
	WebElement statedropdownvalue;
	@FindBy(xpath = "//*[@id='zip-label']") // zip label path
	WebElement ziplabel;
	@FindBy(xpath = "//*[@id='zip']")
	WebElement zipclick;
	@FindBy(xpath = "//*[@id='zip-error']")
	WebElement ziperrormessage;
	@FindBy(xpath = "//*[@id='email_label']") // email label path
	WebElement emaillabel;
	@FindBy(xpath = "//*[@id='email']")
	WebElement emailclick;
	@FindBy(xpath = "//*[@id='email-error']")
	WebElement emailerrormessage;
	@FindBy(xpath = "//*[@id='confirm_email_label']") // confirm mail label path
	WebElement confirmemaillabel;
	@FindBy(xpath = "//*[@id='confirm_email']")
	WebElement confirmmailclick;
	@FindBy(xpath = "//*[@id='conf-email-error']")
	WebElement confirmmailerrormessage;
	@FindBy(xpath = "//*[@id='phone_label_personal']") // phone number label path
	WebElement phonenumberlabel;
	@FindBy(xpath = "//*[@name='phone']")
	WebElement phonenumberclick;
	@FindBy(xpath = "//*[@id='phone-number-error']")
	WebElement phonenumbererrormessage;
	@FindBy(xpath = "//*[@id='contactus']/div[5]/div/div[1]/div/p[2]")
	WebElement byselectingsubmit;
	@FindBy(xpath = "//*[@id='contactus']/div[5]/div/div[1]/div/p[3]")
	WebElement wemaycontactlabel;
	@FindBy(xpath = "//*[contains(text(),'Privacy Policy')]")
	WebElement privacypolicy;
	@FindBy(xpath = "//h2[contains(text(),'Leaving McDonald')]")
	WebElement privacypolicypopup;
	@FindBy(xpath = "//*[@id='leavingCancel']")
	WebElement canclebutton;
	@FindBy(xpath = "//*[@id='globalError-form']")
	WebElement totalerromessage;
	/*
	 * @FindBy(xpath="//html/body/div[1]/div[1]/div/button") WebElement
	 * cancleblabutton;
	 */
	@FindBy(xpath = "//html/body/header/nav/div[2]/div/div[2]/div[1]/ul/li[3]/a")
	WebElement headercareerslabel;
	@FindBy(xpath = "//*[@id='mcd-legal-bumper-title-id']")
	WebElement leavingmcdonaldsheading;
	@FindBy(xpath = "//*[@id='leavingCancel']")
	WebElement leavingcancelbutton;
	@FindBy(xpath = "//*[@id='bumper-continue']")
	WebElement leavingcontinuebutton;
	//@FindBy(xpath = "//html/body/div[1]/div[1]/div/button")
	@FindBy(xpath = "//*[@id='onetrust-close-btn-container']/button")
	WebElement cancelbutton;
	@FindBy(xpath = "//html/body/footer/nav/div/div[2]/h2/a")
	WebElement footercareerslabel;
	@FindBy(xpath = "//html/body/footer/nav[1]/div/div[2]/ul/li[1]/a")
	WebElement footereducationlabel;
	@FindBy(xpath = "//html/body/footer/nav[1]/div/div[2]/ul/li[2]/a")
	WebElement Footeremployeelabel;
	@FindBy(xpath = "//html/body/footer/nav[1]/div/div[2]/ul/li[3]/a")
	WebElement Footermeetourpeoplelabel;
	@FindBy(xpath = "//html/body/footer/nav[1]/div/div[2]/ul/li[4]/a")
	WebElement Footerforourveteranslabel;
	@FindBy(xpath = "//html/body/footer/nav[1]/div/div[2]/ul/li[5]/a")
	WebElement Footerworkingwithuslabel;
	@FindBy(xpath = "//html/body/footer/nav[1]/div/div[2]/ul/li[6]/a")
	WebElement Footerapplynowlabel;

	public String footerapplynowclickmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

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
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		return this.getText(Footerapplynowlabel);
	}

	public String footerworkingwithusclickmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

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
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		return this.getText(Footerworkingwithuslabel);
	}

	public String footerforourveteransclickmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

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
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		return this.getText(Footerforourveteranslabel);
	}

	public String footermeetourpeopleclickmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

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
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		return this.getText(Footermeetourpeoplelabel);
	}

	public String footeremployeeclickmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

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
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		return this.getText(Footeremployeelabel);
	}

	public String footereducationclickmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

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
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		return this.getText(footereducationlabel);
	}

	public String footercareersclickmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3400);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
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
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		return this.getText(footercareerslabel);
	}

	public String headercareersclickmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3500);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

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
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		return this.getText(headercareerslabel);
	}

	public String totalerromessagemethod() throws InterruptedException {
		Thread.sleep(3000);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		this.click(clicksubmit);
		return this.getText(totalerromessage);
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

	public String byselectingsubmitmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		return this.getText(byselectingsubmit);
	}

	public String phonenumbererrormessagemethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(clicksubmit);
		this.click(clicksubmit);
		return this.getText(phonenumbererrormessage);
	}

	public String phonenumbererrormessagemethod(String pnumber) {
		this.clearContent(phonenumberclick);
		this.sendKeys(this.phonenumberclick, pnumber);
		this.click(clicksubmit);
		return this.getText(phonenumbererrormessage);
	}

	public String phonenumbersendmethod(String pnumber) {
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
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		return this.getText(phonenumberlabel);
	}

	public void mailsendmethod1(String entercomm) {
		this.clearContent(emailclick);
		this.sendKeys(this.emailclick, entercomm);

	}

	public String confirmmailerrormessmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3500);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		this.click(clicksubmit);
		return this.getText(confirmmailerrormessage);
	}

	public String confirmmailerrormessmethod() {
		this.click(clicksubmit);
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
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(confirmemaillabel);
		return this.getText(confirmemaillabel);
	}

	public String emailerrormessagemethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(clicksubmit);
		this.click(clicksubmit);
		return this.getText(emailerrormessage);
	}

	public String emailerrormessagemethod() {
		this.click(confirmemaillabel);
		return this.getText(emailerrormessage);
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
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(emaillabel);
		return this.getText(emaillabel);
	}

	public String ziperrormessagemethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(clicksubmit);
		this.click(clicksubmit);
		return this.getText(ziperrormessage);
	}

	public String ziperrormessagemethod1() throws Exception {
		this.click(clicksubmit);
		return this.getText(ziperrormessage);
	}

	public void zipcharactermethod(String entercomm) {
		this.clearContent(zipclick);
		this.sendKeys(this.zipclick, entercomm);
	}

	public String zipsendedvaluermethod(String entercomm) {
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
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(ziplabel);
		return this.getText(ziplabel);
	}

	public String stateselecteddropdownvalmethod() {
		this.click(statedropdownvalue);
		return this.getText(stateclick);
	}

	public String stateselecteddropdownvalmethod1() {
		this.click(stateclick);
		this.click(statedropdownvalue);
		return this.getText(stateclick);
	}

	public String stateerrormessagemethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(clicksubmit);
		this.click(clicksubmit);
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
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(statelabel);
		return this.getText(statelabel);
	}

	public String cityerromessagemethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(clicksubmit);
		this.click(clicksubmit);
		return this.getText(cityerromessage);
	}

	public String citysendedvaluemethod(String entercomm) {
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
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(citylabel);
		return this.getText(citylabel);
	}

	public String aptsuitesendedvaluermethod(String entercomm) {
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
		} catch (Exception e) {

		}
		return this.getText(aptsuitelabel);
	}

	public String addresserrormessagemethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(clicksubmit);
		this.click(clicksubmit);
		return this.getText(addresserrormessage);
	}

	public String addresssendedvaluemethod(String entercomm) {
		this.clearContent(addressclick);
		this.sendKeys(this.addressclick, entercomm);
		return this.getAtrributeValue(addressclick);
	}

	public String addresslabelmethod1() {
		this.click(addressclick);
		return this.getText(addresslabel);
	}

	public String addresslabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		return this.getText(addresslabel);
	}

	public String lastnameerrormesmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(clicksubmit);
		this.click(clicksubmit);
		return this.getText(lastnameerrormess);
	}

	public String LNsendvaluemethod(String entercomm) {
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
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		return this.getText(lastnamelabel);
	}

	public String firstnameerror() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(clicksubmit);
		this.click(clicksubmit);
		return this.getText(finamerror);
	}

	public String firstnamesendedvaluemethod(String firname) {
		this.clearContent(firstnameclick);
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
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(telusabout);
		return this.getText(telusabout);
	}

	public String filethreelabelmethod() {
		return this.getText(filethreelabel);
	}
	
	public String fileonelabelmethod3() throws IOException, InterruptedException, AWTException {
		Robot robot = new Robot();
		robot.setAutoDelay(2000);
		
		WebElement element = driver.findElement(By.xpath("//*[@id='describeFile3-three-file']"));
	    element.click();
	    
	    StringSelection str = new StringSelection("C:\\QA\\Mcd\\Mcd\\Files\\fileone.pdf");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		     robot.keyPress(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_V);
		    robot.setAutoDelay(2000);
		    robot.keyRelease(KeyEvent.VK_CONTROL);
		    robot.keyRelease(KeyEvent.VK_V);
		    robot.setAutoDelay(2000);
		    robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);
			return this.getText(filethreelabel);

			
		  }

	public String filetwolabelmethod() {
		return this.getText(filetwolabel);
	}

	public String fileonelabelmethod2() throws IOException, InterruptedException, AWTException {
		Robot robot = new Robot();
		robot.setAutoDelay(2000);
		
		WebElement element = driver.findElement(By.xpath("//*[@id='describeFile2-two-file']"));
	    element.click();
	    
	    StringSelection str = new StringSelection("C:\\QA\\Mcd\\Mcd\\Files\\butterflyt8f6v5xc91rt.gif");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		     robot.keyPress(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_V);
		    robot.setAutoDelay(2000);
		    robot.keyRelease(KeyEvent.VK_CONTROL);
		    robot.keyRelease(KeyEvent.VK_V);
		    robot.setAutoDelay(2000);
		    robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);
			return this.getText(filetwolabel);

			
		  }
	
	public String fileonelabelmethod() {
		return this.getText(fileonelabel);
	}

	public String fileonelabelmethod1() throws IOException, InterruptedException, AWTException {
		Robot robot = new Robot();
		robot.setAutoDelay(2000);
		
		WebElement element = driver.findElement(By.xpath("//*[@id='describeFile1-one-file']"));
	    element.click();
	    
	    StringSelection str = new StringSelection("C:\\QA\\Mcd\\Mcd\\Files\\thankyouuv95eg5cxwzb.jpg");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		     robot.keyPress(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_V);
		    robot.setAutoDelay(2000);
		    robot.keyRelease(KeyEvent.VK_CONTROL);
		    robot.keyRelease(KeyEvent.VK_V);
		    robot.setAutoDelay(2000);
		    robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);
			return this.getText(fileonelabel);

			
		  }
	
	public String fileoneerrormethod() throws IOException, InterruptedException, AWTException {
		Robot robot = new Robot();
		robot.setAutoDelay(2000);
		
		WebElement element = driver.findElement(By.xpath("//*[@id='describeFile1-one-file']"));
	    element.click();
	    
	    StringSelection str = new StringSelection("C:\\Users\\chvennap\\Documents\\Chandana_148261.pptx");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		     robot.keyPress(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_V);
		    robot.setAutoDelay(2000);
		    robot.keyRelease(KeyEvent.VK_CONTROL);
		    robot.keyRelease(KeyEvent.VK_V);
		    robot.setAutoDelay(2000);
		    robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);
		    this.click(filetwolabel);
			return this.getText(fileoneerrormsg);
			//return null;

			
		  }
	
	
	public String pleaseuploaddocumentslabelmethod() {
		return this.getText(pleaseuploaddocumentslabel);
	}

	public String supportingattachmentlabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		return this.getText(supportingattachmentlabel);
	}

	public String publicationrerrormessagemethod() {
		return this.getText(publicationrerrormessage);
	}

	public String publishererrormessagemethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(clicksubmit);
		this.click(clicksubmit);
		return this.getText(publishererrormessage);
	}

	public String publicationsendedvalmethod(String comment) {
		this.clearContent(publicationclick);
		this.sendKeys(this.publicationclick, comment);
		return this.getAtrributeValue(publicationclick);
	}

	public String publicationlabelmethod1() {
		this.click(publicationclick);
		return this.getText(publicationlabel);
	}

	public String publicationlabelmethod() {
		return this.getText(publicationlabel);
	}

	public String publishersendvaluemethod(String comment) {
		this.clearContent(publisherclick);
		this.sendKeys(this.publisherclick, comment);
		return this.getAtrributeValue(publisherclick);
	}

	public String publisherlabelmethod1() {
		this.click(publisherclick);
		return this.getText(publisherlabel);
	}

	public String publisherlabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		return this.getText(publisherlabel);
	}

	public String authorerrormessagemethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(clicksubmit);
		this.click(clicksubmit);
		return this.getText(authorerrormessage);
	}

	public String authorsendvaluemethod(String comment) {
		this.clearContent(authorclick);
		this.sendKeys(this.authorclick, comment);
		return this.getAtrributeValue(authorclick);
	}

	public String authorclickmethod1() {
		this.click(authorclick);
		return this.getText(authorlabel);
	}

	public String authorlabelmethod() {
		return this.getText(authorlabel);
	}

	public String bookpublicationlabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		return this.getText(bookpublicationlabel);
	}

	public String erromessgewhatwasoutcomemethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(clicksubmit);
		this.click(clickyesradiobutton);
		this.click(clicksubmit);
		return this.getText(erromessgewhatwasoutcome);
	}

	public String erromessgewhatwasoutcomemethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(clicksubmit);
		this.click(clicksubmit);
		return this.getText(erromessgewhatwasoutcome);
	}

	public String clickunknownradiobuttonmethod() {
		this.click(clickunknownradiobutton);
		return this.getAtrributeValue1(unknownradiobutton);
	}

	public String clickdeniedradiobuttonmethod() {
		this.click(clcikdeniedradiobutton);
		return this.getAtrributeValue1(deniedradiobutton);
	}

	public String clcikgrantedradiobuttonmethod() {
		this.click(clickgrantedradiobutton);
		return this.getAtrributeValue1(grantedradiobutton);
	}

	public String unknownradiobuttonmethod() {
		return this.getAtrributeValue1(unknownradiobutton);
	}

	public String deniedradiobuttonmethod() {
		return this.getAtrributeValue1(deniedradiobutton);
	}

	public String grantedradiobuttonmethod() {
		return this.getAtrributeValue1(grantedradiobutton);
	}

	public String unknownlabelmethod() {
		return this.getText(unknownlabel);
	}

	public String deniedlabelmethod() {
		return this.getText(deniedlabel);
	}

	public String grantedlabelmethod() {
		return this.getText(grantedlabel);
	}

	public String whatwastheoutcomelabelmethod() throws Exception {
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(whatwastheoutcomelabel);
		return this.getText(whatwastheoutcomelabel);
	}

	public String dayerrormessagemethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(clicksubmit);
		this.click(clickyesradiobutton);
		this.click(clicksubmit);
		return this.getText(dayerrormessage);
	}

	public String yearerrormessagemethod() {
		return this.getText(yearerrormessage);
	}

	public String dayerrormessagemethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(clicksubmit);
		this.click(clicksubmit);
		return this.getText(dayerrormessage);
	}

	public String yeardropdownvalmethod2() {
		this.click(yearcontfinddropdownval);
		return this.getText(yearcontfindclick);
	}

	public String yeardropdownvalmethod1() {
		this.click(yearcontfindclick);
		return this.getText(yearcontfinddropdownval);
	}

	public String daydropdownvalumethod2() {
		this.click(daycontfindcdropdownval);
		return this.getText(daycontfindclick);
	}

	public String daydropdownvalumethod12() {
		this.click(daycontfindclick);
		return this.getText(daycontfindcdropdownval);
	}

	public void yearcontfindcdropdownvalmethod() {
		this.displayedtext(yearcontfinddropdownval);
	}

	public String yearcontfindcdropdownvalmethod1() {
		return this.getText(yearcontfinddropdownval1);
	}

	public String yearcontfindlabelmethod1() {
		this.click(yearcontfindclick);
		return this.getText(yearcontfindlabel);
	}

	public String yearcontfindlabelmethod() {
		return this.getText(yearcontfindlabel);
	}

	public void daycontfindcdropdownvalmethod() {
		this.displayedtext(daycontfindcdropdownval);
	}

	public String daycontfindcdropdownvalmethod1() {
		return this.getText(daycontfindcdropdownval1);
	}

	public String daycontfindlabelmethod1() {
		this.click(daycontfindclick);
		return this.getText(daycontfindlabel);
	}

	public String daycontfindlabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		return this.getText(daycontfindlabel);
	}

	public String montherrormessagemethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(clicksubmit);
		this.click(clickyesradiobutton);
		this.click(clicksubmit);
		return this.getText(montherrormessage);
	}

	public String montherrormessagemethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(clicksubmit);
		this.click(clicksubmit);
		return this.getText(montherrormessage);
	}

	public String whenwasmonthlabelmethod3() {
		this.click(monthdropdownvalue);
		return this.getText(whenwasemonthclick);
	}

	public String whenwasmonthlabelmethod21() {
		this.click(whenwasemonthclick);
		this.click(monthdropdownvalue);
		return this.getText(whenwasemonthclick);
	}

	public String whenwasmonthlabelmethod2() {
		return this.getText(monthdropdownvalue);
	}

	public String whenwasmonthlabelmethod23() {
		this.click(whenwasemonthclick);
		return this.getText(monthdropdownvalue);
	}

	public String whenwasemonthlabelmethod1() {
		this.click(whenwasemonthclick);
		return this.getText(whenwasemonthlabel);
	}

	public String whenwasemonthlabelmethod() {
		return this.getText(whenwasemonthlabel);
	}

	public String whenwastherequestedlabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		return this.getText(whenwastherequestedlabel);
	}

	public String errormessageradiobuttonmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(clicksubmit);
		this.click(clicksubmit);
		return this.getText(errormessageradiobutton);
	}

	public String noradiobuttonbydefaultselectedmethod1() {
		this.click(clicknoradiobutton);
		return this.getAtrributeValue1(noradiobutton);
	}

	public String yesadiobuttonbydefaultselectedmethod1() {
		this.click(clickyesradiobutton);
		return this.getAtrributeValue1(yesradiobutton);
	}

	public String noradiobuttonbydefaultselectedmethod() {
		return this.getAtrributeValue1(noradiobutton);
	}

	public String yesadiobuttonbydefaultselectedmethod() {
		return this.getAtrributeValue1(yesradiobutton);
	}

	public String noradiobuttonlabelmethod() {
		return this.getText(noradiobuttonlabel);
	}

	public String yesradiobuttonlabelmethod() {
		return this.getText(yesradiobuttonlabel);
	}

	public String haveyoupreviouslylabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		return this.getText(haveyoupreviouslylabel);
	}

	public String errormessagehowlongwillitlabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(clicksubmit);
		this.click(clicksubmit);
		return this.getText(errormessagehowlongwillitlabel);
	}

	public String howlongwillsendedvaluemethod1(String comment) {
		this.clearContent(clickhowlongwillitlabel);
		this.sendKeys(this.clickhowlongwillitlabel, comment);
		return this.getAtrributeValue(clickhowlongwillitlabel);
	}

	public String howlongwillitlabelmethod1() {
		this.click(clickhowlongwillitlabel);
		return this.getText(howlongwillitlabel);
	}

	public String howlongwillitlabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		return this.getText(howlongwillitlabel);
	}

	public String whatisintentederrormessagemethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(clicksubmit);
		this.click(clicksubmit);
		return this.getText(whatisintentederrormessage);
	}

	public String whatisintentedsendedvaluemethod1(String comment) {
		this.clearContent(clcikwhatisintentedlabel);
		this.sendKeys(this.clcikwhatisintentedlabel, comment);
		return this.getAtrributeValue(clcikwhatisintentedlabel);
	}

	public String whatisintentedlabelmethod1() {
		this.click(clcikwhatisintentedlabel);
		return this.getText(whatisintentedlabel);
	}

	public String whatisintentedlabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(whatisintentedlabel);
		return this.getText(whatisintentedlabel);
	}

	public String howwillitbeerrormessagemethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(clicksubmit);
		this.click(clicksubmit);
		return this.getText(howwillitbeerrormessage);
	}

	public String howwillitbesendedvaluemethod1(String comment) {
		this.clearContent(clcikhowwillitbelabel);
		this.sendKeys(this.clcikhowwillitbelabel, comment);
		return this.getAtrributeValue(clcikhowwillitbelabel);
	}

	public String howwillitbelabelmethod1() {
		this.click(clcikhowwillitbelabel);
		return this.getText(howwillitbelabel);
	}

	public String howwillitbelabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		return this.getText(howwillitbelabel);
	}

	public String commeterrormessagemethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(clicksubmit);
		this.click(clicksubmit);
		return this.getText(commeterrormessage);
	}

	public String commeterrormessagemethod() {
		this.click(firstnamelabel);
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

	public String entercommentslabelmethod() {
		return this.getText(entercommentslabel);
	}

	public String tellusaboutlabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(tellusaboutlabel);
		return this.getText(tellusaboutlabel);
	}

	public String pleaseselectdropdownvalueattributemethod() {
		this.click(pleaseselectdropdownvalue);
		return this.getText(clcikpleaseselectlabel);
	}

	public String pleaseselectdropdownvaluemethod() {
		return this.getText(pleaseselectdropdownvalue);
	}

	public String pleaseselectdropdownvaluemethod12() {
		this.click(clcikpleaseselectlabel);
		return this.getText(pleaseselectdropdownvalue);
	}

	public String pleaseselectdropdownvaluemethod12p() throws Exception {
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		this.click(clcikpleaseselectlabel);
		return this.getText(pleaseselectdropdownvalue);
	}

	public String pleaseselectlabelmethod1() {
		this.click(clcikpleaseselectlabel);
		return this.getText(pleaseselectlabel);
	}

	public String pleaseselectlabelmethod() {
		return this.getText(pleaseselectlabel);
	}

	public String reasonforyoulabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(reasonforyoulabel);
		return this.getText(reasonforyoulabel);
	}

	public String indicatesarequiredlabelmethod() {
		return this.getText(indicatesarequiredlabel);
	}

	public String ifyouhavelabelmethod() {
		return this.getText(ifyouhavelabel);
	}

	public String wespentoverlabelmethod() {
		return this.getText(wespentoverlabel);
	}

	public String howcanwehelpyoulabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		return this.getText(howcanwehelpyoulabel);
	}

	public String contactusgetAtrributeValuemethod() {
		this.click(contactuslabel);
		return this.getText(selecttopickattribte);
	}

	public String contactusdropdownlabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(clickPdt);
		this.click(clickPdt);
		return this.getText(contactuslabel);
	}

	public String mobilefeedgetAtrributeValuemethod() {
		this.click(mobiledropdownlabel);
		return this.getText(selecttopickattribte);
	}

	public String mobilefeeddropdownlabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(clickPdt);
		this.click(clickPdt);
		return this.getText(mobiledropdownlabel);
	}

	public String restaurantgetAtrributeValuemethod() { // *[@id='form-choose-topic-2']
		this.click(restarentdropdownlabel);
		return this.getText(selecttopickattribte);
	}

	public String restarentdropdownlabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(clickPdt);
		this.click(clickPdt);
		return this.getText(restarentdropdownlabel);
	}

	public String generallgetpagetitlemethod1() {
		this.click(clickgobutton); // GO BUTTON
		return this.getPageTitle();
	}

	public String GeneralgetAtrributeValuemethod() {
		this.click(generaldropdownval);
		return this.getText(selecttopickattribte);
	}

	public String Generaldropdownvalmethod() {
		this.click(clickPdt);
		return this.getText(generaldropdownval);
	}

	public String pickdifferenttopiclabemethod() {
		return this.getText(pickdifferenttopiclabe);
	}

	public String interestedusinglabelmethod() {
		return this.getText(interestedusinglabel);
	}

	public String trademarkpermissionmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		return this.getText(trademarkpermissionlabel);
	}

	public String generallgetpagetitlemethod() {
		return this.getPageTitle();
	}

	public void clickonsubmitmethod() throws InterruptedException {
		this.click(clicksubmit);
		Thread.sleep(10000);
	}

	public void Gobuttonena() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		this.enablebuttons(clickgobutton); // Enable go button
	}
}

package com.McD.qa.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Core_Trademark_Permission_page extends Basepage {

	public  Core_Trademark_Permission_page(WebDriver driver) { 
		super(driver);
	}


	@FindBy(xpath = "//*[@id='reset_focus']/h1")
	WebElement trademarkpermissionlabel;
	@FindBy(xpath = "(//*[@class='text parbase'])[1]")
	WebElement interestedusinglabel;
	@FindBy(xpath = "//*[@class='form-navigation__label']")
	WebElement pickdifferenttopiclabe;
	@FindBy(xpath = "//*[@class='form-control form-navigation__select']") // click pick a different topic
	WebElement clickPdt;
	@FindBy(xpath = "//*[@class='form-control form-navigation__select']/option[5]") // General inquire dropdown path
	WebElement generaldropdownval;
	@FindBy(xpath = "//*[@id='maincontent']/div/div[1]/div/section/div[3]/div/div/div/button") // go button
	WebElement clickgobutton;
	@FindBy(xpath = "//*[@class='form-control form-navigation__select']/option[3]") // restaurant feedback drop down valuse
	WebElement restarentdropdownlabel;
	@FindBy(xpath = "//*[@class='form-control form-navigation__select']/option[4]") // restaurant feedback drop down valuse
	WebElement mobiledropdownlabel;
	@FindBy(xpath = "//*[@class='form-control form-navigation__select']/option[2]") // contact us label path
	WebElement contactuslabel;
	@FindBy(xpath = "(//*[@class='title'])[2]") // how can we help you us label path
	WebElement howcanwehelpyoulabel;
	@FindBy(xpath = "//*[@id='new_form']/div[2]/p[1]") // we spent over fifty label path
	WebElement wespentoverlabel;
	@FindBy(xpath = "//*[@id='new_form']/div[2]/p[2]") // if you have label path
	WebElement ifyouhavelabel;
	@FindBy(xpath = "//*[@id='new_form']/div[3]/div/p[1]") // indicates a required label path
	WebElement indicatesarequiredlabel;
	@FindBy(xpath = "//*[@id='reason_request']") // REASON FOR YOU label path
	WebElement reasonforyoulabel;
	@FindBy(xpath = "//*[@name='request-reason']/../label") // please select any one option label path
	WebElement pleaseselectlabel;
	@FindBy(xpath = "//*[@name='request-reason']") // click please select any one option label path
	WebElement clcikpleaseselectlabel;
	@FindBy(xpath = "//*[@name='request-reason']/option[4]") // drop down value path
	WebElement pleaseselectdropdownvalue;
	@FindBy(xpath = "//*[@id='tell_us']") // drop down value path
	WebElement tellusaboutlabel;
	
	@FindBy(xpath = "//*[@name='comment']/../label") // enter comments label path
	WebElement entercommentslabel;
	@FindBy(xpath = "//*[@name='comment']") // CLICK enter comments path
	WebElement clcikentercommentslabel;
	@FindBy(xpath = "//*[@name='comment']/../../span") // error enter comments path
	WebElement commeterrormessage;
	@FindBy(xpath = "//*[@id='submit_form_rf']") // submit click path
	WebElement clicksubmit;
	@FindBy(xpath = "//*[@name='used']/../label") // how will it be used path
	WebElement howwillitbelabel;
	@FindBy(xpath = "//*[@name='used']") // clcik how will it be used path
	WebElement clcikhowwillitbelabel;
	@FindBy(xpath = "//*[@name='used']/../../span") // error message how will it be used path
	WebElement howwillitbeerrormessage;
	@FindBy(xpath = "//*[@name='audience']/../label") // WHAT IS INTENTED LABEL PATH
	WebElement whatisintentedlabel;
	@FindBy(xpath = "//*[@name='audience']") // click what is intented PATH
	WebElement clcikwhatisintentedlabel;
	@FindBy(xpath = "//*[@name='audience']/../../span") // ERROR MESSAGE what is intented PATH
	WebElement whatisintentederrormessage;
	@FindBy(xpath = "//*[@name='longused']/../label") // HOW LONG WILL LABEL PATH
	WebElement howlongwillitlabel;
	@FindBy(xpath = "//*[@name='longused']") // click HOW LONG WILL PATH
	WebElement clickhowlongwillitlabel;
	@FindBy(xpath = "//*[@name='longused']/../../span") // error message HOW LONG WILL PATH
	WebElement errormessagehowlongwillitlabel;
	@FindBy(xpath = "//*[contains(text(),'*Have you previously requested permission for this use?')]") // have you previously label PATH
	WebElement haveyoupreviouslylabel;
	@FindBy(xpath = "(//*[@class='form__fields__options-radio-opt-txt'])[1]") // YES label PATH-----
	WebElement yesradiobuttonlabel;
	@FindBy(xpath = "(//*[@class='form__fields__options-radio-opt-txt'])[2]") // no label PATH------
	WebElement noradiobuttonlabel;
	@FindBy(xpath = "(//*[@name='requestPermission'])[1]") // yes radio button path-----
	WebElement yesradiobutton;
	@FindBy(xpath = "(//*[@name='requestPermission'])[2]") // no radio button path---------
	WebElement noradiobutton;
	@FindBy(xpath = "(//*[@class='form__fields__options-mcd-radio-btn'])[1]") // click yes radio button path-----------
	WebElement clickyesradiobutton;
	@FindBy(xpath = "(//*[@class='form__fields__options-mcd-radio-btn'])[2]") // click no radio button path-------
	WebElement clicknoradiobutton;
	@FindBy(xpath = "//*[@id='requestPermission-error']") // error message radio button path
	WebElement errormessageradiobutton;
	@FindBy(xpath = "//*[@id='new_form']/div[5]/div/section/div[7]/div/fieldset/legend") // when was the request submitted label path
	WebElement whenwastherequestedlabel;
	@FindBy(xpath = "//*[@name='month']/../label") // when was the request month label
	WebElement whenwasemonthlabel;
	@FindBy(xpath = "//*[@name='month']") // click when was the request month label
	WebElement whenwasemonthclick;
	@FindBy(xpath = "//*[@name='month']/option[3]") // month dropdown value------
	WebElement monthdropdownvalue;
	@FindBy(xpath = "//*[@name='month']/../../span") // month error message value
	WebElement montherrormessage;
	@FindBy(xpath = "//*[@name='day']/../label") // contfind Day label
	WebElement daycontfindlabel;
	@FindBy(xpath = "//*[@name='day']") // Day DROP DOWN
	WebElement daycontfindclick;
	@FindBy(xpath = "//*[@name='day']/option[2]") // Day DROP DOWN value
	WebElement daycontfindcdropdownval;
	
	@FindBy(xpath = "//*[@name='year']/../label") // year label path
	WebElement yearcontfindlabel;
	@FindBy(xpath = "//*[@name='year']") // year DROP DOWN
	WebElement yearcontfindclick;
	@FindBy(xpath = "//*[@name='year']/option[2]") // year DROP DOWN value
	WebElement yearcontfinddropdownval;
	
	@FindBy(xpath = "//*[@name='day']/../../span") // day error message
	WebElement dayerrormessage;
	@FindBy(xpath = "//*[@name='year']/../../span") // YEAR error message--------
	WebElement yearerrormessage;
	@FindBy(xpath = "(//*[@class='form__fields__options-radio-label-heading'])[2]") // WHAT WAS THE OUTCOME LABEL PATH
	WebElement whatwastheoutcomelabel;
	@FindBy(xpath = "(//*[@class='form__fields__options-radio-opt-txt'])[3]") // GRANTED LABEL PATH
	WebElement grantedlabel;
	@FindBy(xpath = "(//*[@class='form__fields__options-radio-opt-txt'])[4]") // DENIED LABEL PATH
	WebElement deniedlabel;
	@FindBy(xpath = "(//*[@class='form__fields__options-radio-opt-txt'])[5]") // UNKNOWN LABEL PATH
	WebElement unknownlabel;
	@FindBy(xpath = "(//*[@name='outcomes'])[1]") // GRANTED radio button LABEL PATH
	WebElement grantedradiobutton;
	@FindBy(xpath = "(//*[@name='outcomes'])[2]") // denied radio button LABEL PATH
	WebElement deniedradiobutton;
	@FindBy(xpath = "(//*[@name='outcomes'])[3]") // unknown radio button LABEL PATH
	WebElement unknownradiobutton;
	@FindBy(xpath = "(//*[@class='form__fields__options-mcd-radio-btn'])[3]") // click GRANTED radio button PATH-------
	WebElement clickgrantedradiobutton;
	@FindBy(xpath = "(//*[@class='form__fields__options-mcd-radio-btn'])[4]") // click denied radio button PATH------
	WebElement clcikdeniedradiobutton;
	@FindBy(xpath = "(//*[@class='form__fields__options-mcd-radio-btn'])[5]") // click unknown radio button PATH----------
	WebElement clickunknownradiobutton;
	@FindBy(xpath = "(//*[@class='form__fields__error_msg form__fields__error_msg-display'])[8]") // error message what was the outcome
	WebElement erromessgewhatwasoutcome;
	@FindBy(xpath = "//*[@id='book_publi']") // BOOK PUBLICATION LABE PATH
	WebElement bookpublicationlabel;
	@FindBy(xpath = "//*[@name='author']/../label") // author LABEl PATH
	WebElement authorlabel;
	@FindBy(xpath = "//*[@name='author']") // click author PATH
	WebElement authorclick;
	@FindBy(xpath = "//*[@name='author']/../../span") // author error message PATH
	WebElement authorerrormessage;
	@FindBy(xpath = "//*[@name='publisher']/../label") // publisher label PATH
	WebElement publisherlabel;
	@FindBy(xpath = "//*[@name='publisher']") // publisher CLICK PATH
	WebElement publisherclick;
	@FindBy(xpath = "//*[@name='publication']/../label") // publication label PATH
	WebElement publicationlabel;
	@FindBy(xpath = "//*[@name='publication']") // publication CLICK PATH
	WebElement publicationclick;
	@FindBy(xpath = "//*[@name='publisher']/../../span") // PUBLISHER ERROR MESSAGE PATH
	WebElement publishererrormessage;
	@FindBy(xpath = "//*[@name='publication']/../../span") // publication ERROR MESSAGE PATH
	WebElement publicationrerrormessage;
	
	@FindBy(xpath = "//*[@id='supp_atta']") // supporting attachment PATH
	WebElement supportingattachmentlabel;
	@FindBy(xpath = "//*[@id='new_form']/div[7]/div/section/div[2]/div/fieldset/legend") // please upload file or images PATH
	WebElement pleaseuploaddocumentslabel;
	@FindBy(xpath = "//*[contains(text(),'File 1')]") // file one label PATH
	WebElement fileonelabel;
	@FindBy(xpath = "//*[@name='file1upload']") // file one rollup PATH
	WebElement fileonerollup;
	@FindBy(xpath = "//*[@name='file1upload']/../../span") // file one error PATH
	WebElement fileoneerrormsg;
	@FindBy(xpath = "(//*[contains(text(),'Browser')])[1]")
	WebElement fileonebrowser;
	@FindBy(xpath = "(//*[contains(text(),'Clear File')])[1]")
	WebElement fileoneclearcache;
	
	@FindBy(xpath = "//*[contains(text(),'File 2')]") // file two label PATH
	WebElement filetwolabel;
	@FindBy(xpath = "//*[@name='file2upload']") // file two rollup PATH
	WebElement filetworollup;
	@FindBy(xpath = "//*[@name='file2upload']/../../span") // file two error PATH
	WebElement filetwoerrormsg;
	@FindBy(xpath = "(//*[contains(text(),'Browser')])[2]")
	WebElement filetwobrowser;
	@FindBy(xpath = "(//*[contains(text(),'Clear File')])[2]")
	WebElement filetwoclearcache;
	
	@FindBy(xpath = "//*[contains(text(),'File 3')]") // file three label PATH
	WebElement filethreelabel;
	@FindBy(xpath = "//*[@name='file3upload']") // file three label PATH
	WebElement filethreerollup;
	@FindBy(xpath = "//*[@name='file3upload']/../../span") // file three error PATH
	WebElement filethreeerrormsg;
	@FindBy(xpath = "(//*[contains(text(),'Browser')])[3]")
	WebElement filethreebrowser;
	@FindBy(xpath = "(//*[contains(text(),'Clear File')])[3]")
	WebElement filethreeclearcache;
	
	@FindBy(xpath = "//*[@id='about_yourself']")
	WebElement telusabout;
	@FindBy(xpath = "//*[@name='firstName']/../label") // FIRST NAME LABEL PATH
	WebElement firstnamelabel;
	@FindBy(xpath = "//*[@name='firstName']") // first name
	WebElement firstnameclick;
	@FindBy(xpath = "//*[@name='firstName']/../../span") //firstname error
	WebElement finamerror;
	@FindBy(xpath = "//*[@name='lastName']/../label") // last name
	WebElement lastnamelabel;
	@FindBy(xpath = "//*[@name='lastName']")
	WebElement lastnameclick;
	@FindBy(xpath = "//*[@name='lastName']/../../span")
	WebElement lastnameerrormess;
	@FindBy(xpath = "//*[@name='custAddr1']/../label") // address label path
	WebElement addresslabel;
	@FindBy(xpath = "//*[@name='custAddr1']")
	WebElement addressclick;
	@FindBy(xpath = "//*[@name='custAddr1']/../../span")
	WebElement addresserrormessage;
	@FindBy(xpath = "//*[contains(text(),'Apt/Suite')]") // APT/SUITE PATH
	WebElement aptsuitelabel;
	@FindBy(xpath = "//*[@name='custAddr2']")
	WebElement aptsuiteclick;
	@FindBy(xpath = "//*[@name='city']/../label") // city label path
	WebElement citylabel;
	@FindBy(xpath = "//*[@name='city']")
	WebElement cityclick;
	@FindBy(xpath = "//*[@name='city']/../../span")
	WebElement cityerromessage;
	@FindBy(xpath = "//*[@name='state']/../label") // state label path
	WebElement statelabel;
	@FindBy(xpath = "//*[@name='state']")
	WebElement stateclick;
	@FindBy(xpath = "//*[@name='state']/../../span")
	WebElement stateerrormessage;
	@FindBy(xpath = "//*[@name='state']/option[2]")
	WebElement statedropdownvalue;
	@FindBy(xpath = "//*[@name='zip']/../label") // zip label path
	WebElement ziplabel;
	@FindBy(xpath = "//*[@name='zip']")
	WebElement zipclick;
	@FindBy(xpath = "//*[@name='zip']/../../span")
	WebElement ziperrormessage;
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
	@FindBy(xpath = "//*[@name='phone']/../label") // phone number label path
	WebElement phonenumberlabel;
	@FindBy(xpath = "//*[@name='phone']")
	WebElement phonenumberclick;
	@FindBy(xpath = "//*[@name='phone']/../../SPAN")
	WebElement phonenumbererrormessage;
	@FindBy(xpath = "//*[@id='new_form']/div[9]/p[1]")//by selecting submit
	WebElement byselectingsubmit;
	@FindBy(xpath = "//*[@id='new_form']/div[9]/p[2]")
	WebElement wemaycontactlabel;
	@FindBy(xpath = "//*[@id='new_form']/div[9]/p[1]/a")
	WebElement privacypolicy;
	
	@FindBy(xpath = "//*[@id='leavingCancel']")
	WebElement canclebutton;
	@FindBy(xpath = "//*[@id='globalError-form']")
	WebElement totalerromessage;
	/*
	 * @FindBy(xpath="//html/body/div[1]/div[1]/div/button") WebElement
	 * cancleblabutton;
	 */
	
	
	//@FindBy(xpath = "//html/body/div[1]/div[1]/div/button")
	@FindBy(xpath = "//*[@id='onetrust-close-btn-container']/button")
	WebElement cancelbutton;
	


	public String totalerromessagemethod() throws InterruptedException {
		Thread.sleep(3000);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		this.click(clicksubmit);
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
	public String phonenumbersendmethod1(String pnumber) {
		//this.clearContent(phonenumberclick);
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
		this.click(stateclick);
		this.click1(statedropdownvalue);
		return this.getText(statedropdownvalue);
	}

	public String stateselecteddropdownvalmethod1() throws Exception {
		waitForElementToBeVisible1(stateclick);
		this.click(stateclick);
		this.click1(statedropdownvalue);
		return this.getText(statedropdownvalue);
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

	public String filethreeerrormethod() throws IOException, InterruptedException, AWTException {
		driver.navigate().refresh();
		Robot robot = new Robot();
		robot.setAutoDelay(2000);
		
		/*WebElement element = driver.findElement(By.xpath("//*[@id='describeFile1-one-file']"));
	    element.click();*/
		 this.click(fileonebrowser);
	    
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
		    this.click(firstnameclick);
			return this.getText(filethreeerrormsg);	
		  }
	
	public String filethreeclearfilemethod1() throws IOException, InterruptedException, AWTException {
		driver.navigate().refresh();
		Robot robot = new Robot();
		robot.setAutoDelay(2000);
		
	/*	WebElement element = driver.findElement(By.xpath("(//*[contains(text(),'Browser')])[1]"));
	    element.click();*/
	    this.click(fileonebrowser);
	    
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
		    this.click1(filethreeclearcache);
			return this.getText(filethreebrowser);

			
		  }
	public String filethreelabelmethod() {
		return this.getText(filethreelabel);
	}
	public String filetwoerrormethod() throws IOException, InterruptedException, AWTException {
		driver.navigate().refresh();
		Robot robot = new Robot();
		robot.setAutoDelay(2000);
		
		/*WebElement element = driver.findElement(By.xpath("//*[@id='describeFile1-one-file']"));
	    element.click();*/
		 this.click(fileonebrowser);
	    
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
		    this.click(firstnameclick);
			return this.getText(filetwoerrormsg);
			

			
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
		driver.navigate().refresh();
		return this.getText(filetwolabel);
	}
	public String filetwoclearfilemethod1() throws IOException, InterruptedException, AWTException {
		driver.navigate().refresh();
		Robot robot = new Robot();
		robot.setAutoDelay(2000);
		
	/*	WebElement element = driver.findElement(By.xpath("(//*[contains(text(),'Browser')])[1]"));
	    element.click();*/
	    this.click(fileonebrowser);
	    
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
		    this.click1(fileoneclearcache);
			return this.getText(fileonebrowser);

			
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
		
	/*	WebElement element = driver.findElement(By.xpath("(//*[contains(text(),'Browser')])[1]"));
	    element.click();*/
	    this.click(fileonebrowser);
	    
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
	
	public String fileoneclearfilemethod1() throws IOException, InterruptedException, AWTException {
		driver.navigate().refresh();
		Robot robot = new Robot();
		robot.setAutoDelay(2000);
		
	/*	WebElement element = driver.findElement(By.xpath("(//*[contains(text(),'Browser')])[1]"));
	    element.click();*/
	    this.click(fileonebrowser);
	    
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
		    this.click1(fileoneclearcache);
			return this.getText(fileonebrowser);

			
		  }
	
	public String fileoneerrormethod() throws IOException, InterruptedException, AWTException {
		driver.navigate().refresh();
		Robot robot = new Robot();
		robot.setAutoDelay(2000);
		
		/*WebElement element = driver.findElement(By.xpath("//*[@id='describeFile1-one-file']"));
	    element.click();*/
		 this.click(fileonebrowser);
	    
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
		    this.click(firstnameclick);
			return this.getText(fileoneerrormsg);
			

			
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
		waitForElementToBeVisible1(clicksubmit);
		this.click(clicksubmit);
		return this.getText(dayerrormessage);
	}

	public String yeardropdownvalmethod2() {
		this.click(yearcontfinddropdownval);
		return this.getText(yearcontfindclick);
	}

	public String yeardropdownvalmethod1() throws Exception {
		this.waitForElementToBeVisible1(yearcontfindclick);
		this.click(yearcontfindclick);
		this.click1(yearcontfinddropdownval);
		return this.getText(yearcontfinddropdownval);
	}

	public String daydropdownvalumethod2() {
		this.click(daycontfindcdropdownval);
		return this.getText(daycontfindclick);
	}

	public String daydropdownvalumethod12() throws Exception {
		this.waitForElementToBeVisible1(daycontfindclick);
		this.click(daycontfindclick);
		this.click1(daycontfindcdropdownval);
		return this.getText(daycontfindcdropdownval);
	}

	public void yearcontfindcdropdownvalmethod() {
		this.displayedtext(yearcontfinddropdownval);
	}

	public String yearcontfindcdropdownvalmethod1() {
		return this.getText(yearcontfinddropdownval);
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
		return this.getText(daycontfindcdropdownval);
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
		this.click(clicknoradiobutton);
		this.click(clicksubmit);
		return this.getText(montherrormessage);
	}

	public String whenwasmonthlabelmethod3() {
		this.click(monthdropdownvalue);
		return this.getText(whenwasemonthclick);
	}

	public String whenwasmonthlabelmethod21() throws Exception {
		this.waitForElementToBeVisible1(whenwasemonthclick);
		this.click(whenwasemonthclick);
		this.click1(monthdropdownvalue);
		return this.getText(monthdropdownvalue);
	}

	public String whenwasmonthlabelmethod2() {
		this.click(whenwasemonthclick);
		this.click1(monthdropdownvalue);
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

	public boolean yesadiobuttonbydefaultselectedmethod1() {
		this.click(clickyesradiobutton);	
		return this.isselectedcheckbox(yesradiobutton);  
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
		this.click(howwillitbelabel);
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

	

	public String pleaseselectdropdownvaluemethod() {
		this.click(clcikpleaseselectlabel);
		this.click1(pleaseselectdropdownvalue);
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
		waitForElementToBeVisible1(clcikpleaseselectlabel);
		this.click(clcikpleaseselectlabel);
		this.click1(pleaseselectdropdownvalue);
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

	
	public String contactusdropdownlabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
		waitForElementToBeVisible1(clickPdt);
		this.click(clickPdt);
		this.click1(contactuslabel);
		return this.getText(contactuslabel);
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
		this.click1(mobiledropdownlabel);
		return this.getText(mobiledropdownlabel);
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
		this.click1(restarentdropdownlabel);
		return this.getText(restarentdropdownlabel);
	}

	public String generallgetpagetitlemethod1() {
		this.click(clickgobutton); // GO BUTTON
		return this.getPageTitle();
	}

	
	public String Generaldropdownvalmethod() {
		this.click(clickPdt);
		this.click1(generaldropdownval);
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
		try {
			this.click(cancelbutton);
		} catch (Exception e) {

		}
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


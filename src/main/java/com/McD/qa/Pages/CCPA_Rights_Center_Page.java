package com.McD.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CCPA_Rights_Center_Page extends Basepage {
	
	public  CCPA_Rights_Center_Page(WebDriver driver) { 
		super(driver);
	}	
	@FindBy(xpath="//*[@id='reset_focus']/h1")
	WebElement ccparightscenterheading;
	@FindBy(xpath="//*[@id='reset_focus']/p")
	WebElement ifyouareacaliforniaheaing;
	@FindBy(xpath="//*[@id='reset_focus']/p[2]")
	WebElement ifyouareinterestedheading;
	@FindBy(xpath="//*[@id='reset_focus']/p[3]")
	WebElement ifyorareuserwithdisabilityheading;	
	@FindBy(xpath="//*[@id='ccpaContactus']/div[3]/p[1]")
	WebElement indicaterequiredfieldsheading;
	@FindBy(xpath="//*[@id='ccpaFname-label']")
	WebElement firstnamelabelccpa;
	@FindBy(xpath="//*[@id='ccpaFname']")
	WebElement firstnamesendccpa;
	@FindBy(xpath="//*[@id='ccpaSubmit']")
	WebElement submitbutton;
	@FindBy(xpath="//*[@id='ccpaFname-error']")
	WebElement firstnameerrormessage;
	@FindBy(xpath="//*[@id='ccpaLname-label']")
	WebElement lastnamelabelccpa;
	@FindBy(xpath="//*[@id='ccpaLname']")
	WebElement lastnamesendccpa;
	@FindBy(xpath="//*[@id='ccpaLname-error']")
	WebElement lastnameerrormessageccpa;
	@FindBy(xpath="//*[@id='ccpaEmail-label']")   //email label path   
	WebElement emaillabelccpa;
	@FindBy(xpath="//*[@id='ccpaEmail']")   //email sended path   
	WebElement emailsendedccpa;
	@FindBy(xpath="//*[@id='ccpaEmail-error']")   //email sended path   
	WebElement emailerrormessageccpa;
	@FindBy(xpath="//*[@id='ccpaConfirmEmail-label']")  //confirm mail label path
	WebElement confirmemaillabel;
	@FindBy(xpath="//*[@id='ccpaConfirmEmail']")  //confirm mail label path
	WebElement confirmemailsendedccpa;
	@FindBy(xpath="//*[@id='ccpaConfirmEmail-error']")  //confirm mail label path
	WebElement confirmmailerrormessage;
	@FindBy(xpath="//*[@id='ccpaStateSelectDesktop-label']") //state label path  
	WebElement statelabel; 
	@FindBy(xpath="//*[@id='ccpaStateSelectDesktop']") //state click path  
	WebElement stateclick;
	@FindBy(xpath="//*[@id='ccpa-personalinfo-state-0']")
	WebElement statedropdownvalue;
	@FindBy(xpath="//*[@id='ccpaStateSelectDesktop-error']")
	WebElement stateerrormessage;
	@FindBy(xpath="//*[@id='ccpaPhoneNumber-label']")  //phone number label path  
	WebElement phonenumberlabel;
	@FindBy(xpath="//*[@id='ccpaPhoneNumber']")  //phone number sended path  
	WebElement phonenumbersendedccpa;
	@FindBy(xpath="//*[@id='ccpaPhoneNumber-error']")  //phone number ERROR MESSAGE path  
	WebElement phonenumbererrormessageccpa;
	@FindBy(xpath="//*[@id='reqPermission']/div/div[1]/label/span[2]")  // McDonalds my not sell radio button path  
	WebElement mcdonaldsmaynotsellradiobutton;
	@FindBy(xpath="//*[@name='reqPermission']")  // McDonalds my not sell radio button path  
	WebElement mcdonaldsmaynotsellradiobutton1;
	@FindBy(xpath="//*[@id='reqPermission-0']")  // McDonalds my not sell label button path  
	WebElement mcdonaldsmaynotselllabel;
	@FindBy(xpath="//*[@id='reqPermission-label']")  // PLEASE SPECIFY YOUR REQUEST label button path  
	WebElement pleasespecifyourrequiestlabel;
	@FindBy(xpath="//*[@id='reqPermission-1']")  // accessprovide my personal label button path  
	WebElement accessprovidemypersonal;
	@FindBy(xpath="//*[@id='reqPermission']/div/div[2]/label/span[2]")  // accessprovide my personal RADIO button path  
	WebElement accessprovidemypersonalradiobutton;
	@FindBy(xpath="//*[@id='reqPermission']/div/div[2]/label/input")  // accessprovide my personal RADIO button path  
	WebElement accessprovidemypersonalradiobutton1;
	@FindBy(xpath="//*[@id='reqPermission-2']")  // Deletion - Delete my personal data that has been collected  path  
	WebElement deletiondeletemypersonallabel;
	@FindBy(xpath="//*[@id='reqPermission']/div/div[3]/label/span[2]")  // Deletion - Delete my personal data that has been collected radio button path  
	WebElement deletiondeletemypersonalradiobutton;
	@FindBy(xpath="//*[@id='reqPermission']/div/div[3]/label/input")  // Deletion - Delete my personal data that has been collected radio button path  
	WebElement deletiondeletemypersonalradiobutton1;
	/*@FindBy(xpath="//*[@id='ccpaContactus']")  // by selecting submit path  
	WebElement byselectingsubmitlabel;*/
	@FindBy(xpath="//*[@id='ccpaContactus']/div[3]/div/div/div[8]/div/div/div/p[1]")  // by selecting submit path  
	WebElement byselectingsubmitlabel;
	@FindBy(xpath="//*[@id='globalError-form']")  // global errormessage path  
	WebElement globalerrormessagelabel;
	@FindBy(xpath="//*[@id='ccpaContactus']/div[3]/div/div/div[8]/div/div/div/p[1]/a/u")  // privacylink path  
	WebElement privacypolicylink;
	@FindBy(xpath="//*[@id='openContactusFormPopup']")  // reset label path  
	WebElement resetlinklabel;
	@FindBy(xpath="//*[@id='cancelID']")  // yes button path  
	WebElement yesbutton;
	@FindBy(xpath="//*[@id='reqPermission-error']")  // please specify your request path  
	WebElement pleasespecifyrequesterrormessage;
	@FindBy(xpath="//*[@id='reset_focus']/p[2]/a[1]")  // privacy statement path  
	WebElement privacystatementclick;
	@FindBy(xpath="//*[@id='reset_focus']/p[2]/a[2]")  //contact privacy  path  
	WebElement contactprivacylink;
	@FindBy(xpath="//*[@id='reset_focus']/p[3]/a")  //accessibility   path  
	WebElement accessibilitylinkcick;
	//@FindBy(xpath="//html/body/div[1]/div[1]/div/button")  //   path  
	@FindBy(xpath="//*[@id='onetrust-close-btn-container']/button")  //   path  
	WebElement cancelcookie;
	
	
	
	
	
	public String accessibilitylinkcickmethod() throws InterruptedException {
		Thread.sleep(3500);
		try {
		this.click(cancelcookie);
		}catch (Exception e) {
			
		}
		this.click(accessibilitylinkcick);
		Thread.sleep(4000);
		windowhandles();
		return this.getPageTitle();
	}
	public String contactprivacylinkmethod() throws InterruptedException {
		Thread.sleep(3500);
		try {
			this.click(cancelcookie);
			}catch (Exception e) {
				
			}
		this.click(contactprivacylink);
		Thread.sleep(4000);
		windowhandles();
		return this.getPageTitle();
	}
	public String privacystatementclickmethod() throws InterruptedException {
		Thread.sleep(3500);
		try {
			this.click(cancelcookie);
			}catch (Exception e) {
				
			}
		this.click(privacystatementclick);
		Thread.sleep(4000);
		return this.getPageTitle();
	}
	public void submitGEQ() {
		this.click(submitbutton);
	}
	public String pleasespecifyrequesterrormessagemethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3500);
		try {
			this.click(cancelcookie);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitbutton);
		this.click(submitbutton);
		return this.getText(pleasespecifyrequesterrormessage);
	}
	public String resetlinkclickmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3500);
		try {
			this.click(cancelcookie);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitbutton);
		this.click(submitbutton);
		this.click(resetlinklabel);
		this.click(yesbutton);
		return this.getText(globalerrormessagelabel);
	}
	public String resetlinklabelmethod() throws Exception { 
		Thread.sleep(3500);
		try {
			this.click(cancelcookie);
			}catch (Exception e) {
				
			}
		return this.getText(resetlinklabel);
	}
	public void privacypolicylinkmethod() { 
    this.click(privacypolicylink);
	}
	public String globalerrormessagelabelmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3500);
		try {
			this.click(cancelcookie);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitbutton);
		this.click(submitbutton);
		return this.getText(globalerrormessagelabel);
	}
	public String byselectingsubmitlabelmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3500);
		try {
			this.click(cancelcookie);
			}catch (Exception e) {
				
			}
		return this.getText(byselectingsubmitlabel);
	}
	public String deletiondeletemypersonalradiobuttonmethod1() {
		this.click(deletiondeletemypersonalradiobutton);
		return this.getAtrributeValue1(deletiondeletemypersonalradiobutton1);  
	}
	public String accessprovidemypersonalradiobuttonmethod1() {
		
		this.click(accessprovidemypersonalradiobutton);
		return this.getAtrributeValue1(accessprovidemypersonalradiobutton1);  
	}
	public String mcdonaldsmaynotsellradiobuttonmethod1() {
		this.click(mcdonaldsmaynotsellradiobutton);
		return this.getAtrributeValue1(mcdonaldsmaynotsellradiobutton1);  
		
	}
	public String deletiondeletemypersonalradiobuttonmethod() {
		return this.getAtrributeValue1(deletiondeletemypersonalradiobutton1);  
	}
	public String deletiondeletemypersonallabelmethod() { 
		return this.getText(deletiondeletemypersonallabel);
	}
	public String accessprovidemypersonalradiobuttonmethod() {
		return this.getAtrributeValue1(accessprovidemypersonalradiobutton1);  
	}
	public String accessprovidemypersonalmethod() { 
		return this.getText(accessprovidemypersonal);
	}
	public String pleasespecifyourrequiestlabelmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3500);
		try {
			this.click(cancelcookie);
			}catch (Exception e) {
				
			}
		return this.getText(pleasespecifyourrequiestlabel);
	}
	public String mcdonaldsmaynotselllabelmethod() { 
		return this.getText(mcdonaldsmaynotselllabel);
	}
	public String mcdonaldsmaynotsellradiobuttonmethod() {
		return this.getAtrributeValue1(mcdonaldsmaynotsellradiobutton1);  
	}
	public String phonenumbererrormessagemethod() { 
		this.click(submitbutton);
		return this.getText(phonenumbererrormessageccpa);
	}
	public String phonenumbersendedvaluemethod(String pnumber) {
		this.clearContent(phonenumbersendedccpa);
		this.sendKeys(this.phonenumbersendedccpa, pnumber);
		return this.getAtrributeValue(phonenumbersendedccpa);
	}
	public String phonenumberlabelmethod1() { 
		this.click(phonenumbersendedccpa);
		return this.getText(phonenumberlabel);
	}
	public String phonenumberlabelmethod() throws Exception  {
		driver.navigate().refresh();
		Thread.sleep(3500);
		try {
			this.click(cancelcookie);
			}catch (Exception e) {
				
			}
		return this.getText(phonenumberlabel);
	}
	public String stateerrormessagemethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3500);
		try {
			this.click(cancelcookie);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitbutton);
		this.click(submitbutton);
		return this.getText(stateerrormessage);
	}
	public String stateselectedvaluemethod() {
		this.click(statedropdownvalue);
		return this.getText(stateclick);  
	}
	public String statedropdownvaluemethod() {
		   return this.getText(statedropdownvalue);
		   
			}
	
	public String statedropdownvaluemethod1() {
		this.click(stateclick);
		this.click(statedropdownvalue);
		   return this.getText(stateclick);
		   
			}
	public String statelabelmethod1() { 
		this.click(stateclick);
		return this.getText(statelabel);
	}
	public String statelabelmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3500);
		try {
			this.click(cancelcookie);
			}catch (Exception e) {
				
			}
		return this.getText(statelabel);
	}
	public String confirmmailerrormessmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3500);
		try {
			this.click(cancelcookie);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitbutton);
		this.click(submitbutton);
		return this.getText(confirmmailerrormessage);
	}
	public String confirmmailerrormessmethod1() throws Exception { 
		this.click(submitbutton);
		return this.getText(confirmmailerrormessage);
	}
	public String confirmmailsendidmethod(String entercomm) { 
		this.clearContent(confirmemailsendedccpa);
		this.sendKeys(this.confirmemailsendedccpa, entercomm);
		return this.getAtrributeValue(confirmemailsendedccpa);
	}
	public void mailsendmethod1(String entercomm) { 
		 this.clearContent(emailsendedccpa);
		this.sendKeys(this.emailsendedccpa, entercomm);
	}
	public String confirmmaillabelmethod1() { 
		this.click(confirmemailsendedccpa);
		return this.getText(confirmemaillabel);
	}
	public String confirmmaillabelmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3500);
		try {
			this.click(cancelcookie);
			}catch (Exception e) {
				
			}
		return this.getText(confirmemaillabel);
	}
	public String emailerrormessagemethod1() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3500);
		try {
			this.click(cancelcookie);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitbutton);
		this.click(submitbutton);
		return this.getText(emailerrormessageccpa);
	}
	public String emailerrormessagemethod() throws InterruptedException { 
		this.click(confirmemailsendedccpa);
		return this.getText(emailerrormessageccpa);
	}
	public String mailsendmethod(String entercomm) { 
		 this.clearContent(emailsendedccpa);
		this.sendKeys(this.emailsendedccpa, entercomm);
		return this.getAtrributeValue(emailsendedccpa);
	}
	public String emaillabelmethod1() { 
		this.click(emailsendedccpa);
		return this.getText(emaillabelccpa);
	}
	public String emaillabelmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3500);
		try {
			this.click(cancelcookie);
			}catch (Exception e) {
				
			}
		return this.getText(emaillabelccpa);
	}
	public String lastnameerrormesmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3500);
		try {
			this.click(cancelcookie);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitbutton);
		this.click(submitbutton);
		this.scrollTo(firstnamelabelccpa);
		return this.getText(lastnameerrormessageccpa);
	}
	public String lastnameenterdvalue(String entercomm) {
		this.clearContent(lastnamesendccpa);
		this.sendKeys(this.lastnamesendccpa, entercomm);
		return this.getAtrributeValue(lastnamesendccpa);
	}
	public String lastnamelabelccpamethod1() { 
		this.click(lastnamesendccpa);
		return this.getText(lastnamelabelccpa);
	}
	public String lastnamelabelccpamethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3900);
		try {
			this.click(cancelcookie);
			}catch (Exception e) {
				
			}
		return this.getText(lastnamelabelccpa);
	}
	public String firstnameerror() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3500);
		try {
			this.click(cancelcookie);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(submitbutton);
		this.click(submitbutton);
		this.scrollTo(indicaterequiredfieldsheading);
		return this.getText(firstnameerrormessage);  
	}
	public String finameEnteredvalue(String firname) {
		this.clearContent(firstnamesendccpa);
		this.sendKeys(this.firstnamesendccpa, firname);
		return this.getAtrributeValue(firstnamesendccpa);
	}
	public String finameEnteredvalue1(String firname) throws Exception {
		Thread.sleep(3500);
		try {
			this.click(cancelcookie);
			}catch (Exception e) {
				
			}
		this.sendKeys(this.firstnamesendccpa, firname);
		return this.getAtrributeValue(firstnamesendccpa);
	}
	public String firstnamelabelccpamethod1() { 
		this.click(firstnamesendccpa);
		return this.getText(firstnamelabelccpa);  
	}
	public String firstnamelabelccpamethod() throws Exception {  
		driver.navigate().refresh();
		Thread.sleep(3500);
		try {
			this.click(cancelcookie);
			}catch (Exception e) {
				
			}
		return this.getText(firstnamelabelccpa);  
	}
	public String indicaterequiredfieldsheadingmethod() {
		return this.getText(indicaterequiredfieldsheading);  
	}
	public String ifyorareuserwithdisabilityheadingmethod() {
		return this.getText(ifyorareuserwithdisabilityheading);  
	}
	public String ifyouareinterestedheadingmethod() {
		return this.getText(ifyouareinterestedheading);  
	}
	public String ifyouareacaliforniaheaingmethod() {
		return this.getText(ifyouareacaliforniaheaing);  
	}
	public String ccparightscenterheading() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3500);
		try {
			this.click(cancelcookie);
			}catch (Exception e) {
				
			}
		return this.getText(ccparightscenterheading);  
	}
	public String generallgetpagetitlemethod() {  
		return this.getPageTitle();
	}

}

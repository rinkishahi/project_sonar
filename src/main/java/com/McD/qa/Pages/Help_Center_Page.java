package com.McD.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Help_Center_Page extends Basepage {
	
	
	public  Help_Center_Page(WebDriver driver) { 
		super(driver);
	}	
	
	//@FindBy(xpath="//*[@class='mcd-publication__text-description']/h2[1]/span")  // help center heading   
	@FindBy(xpath="//*[@id='publication-1509298483_mcd-publication']/div/div[2]/div[1]/div/h1/span")  // help center heading   
	WebElement helpcenterheading;
	@FindBy(xpath="//*[@class='mcd-publication__text-description']/p")  //find answers to your.... heading   
	WebElement findanswerlabel;
	//@FindBy(xpath="//*[@class='mcd-publication__text-description']/h2[2]/span")  //LOOKING FOR SOMTHING... heading  
	@FindBy(xpath="//*[@id='publication-1509298483_mcd-publication']/div/div[2]/div[1]/div/h2/span")  //LOOKING FOR SOMTHING... heading
	WebElement lookingforsomthinglabel;
	@FindBy(xpath="//*[@class='mcd-search__button']")  //search button   
	WebElement searchbutton;
	@FindBy(xpath="//*[@id='search']")  //search input   
	WebElement searchinput;
	@FindBy(xpath="//*[@class='mcd-search__button']")  //search click   
	WebElement searcbuttonclick;
	@FindBy(xpath="//*[@id='maincontent']/div[1]/div[3]/div/div/h3")  //topics click   
	WebElement topicslabel;
	@FindBy(xpath="//*[@class='helpcenterlanding_list']/li[1]/a")  //Account click   
	WebElement accountlable;
	@FindBy(xpath="//*[@class='mcd-search__result-section--container']/div[2]/p")  //search results click   
	WebElement searchresults;
	@FindBy(xpath="//*[@class='mcd-search__result-section--container']/div[2]/a/span")  //read more link label  
	WebElement readmorelabel;
	@FindBy(xpath="//*[@class='mcd-search--load-more']/button")  //load more  link label  
	WebElement loadmorelabel;
	@FindBy(xpath="//*[@class='helpcenterlanding_list']/li[2]/a")  //COMMON QUESTION  link label  
	WebElement commonquestionlabel;
	@FindBy(xpath="//*[@class='helpcenterlanding_list']/li[3]/a")  //MOBILE ORDING link label  
	WebElement mobileordinglabel;
	@FindBy(xpath="//*[@class='helpcenterlanding_list']/li[4]/a")  //PAYMENT link label  
	WebElement paymentlabel;
	@FindBy(xpath="//*[@class='helpcenterlanding_list']/li[5]/a")  //RESTAURANT link label  
	WebElement restaurantlabel;
	@FindBy(xpath="//*[@id='onetrust-close-btn-container']/button") // cookes cancel button path   
	WebElement cookescancelbutton;
	
	
	
	public String restaurantclickmethod() throws Exception  {
		this.click(restaurantlabel);
		Thread.sleep(2500);
		return this.getPageTitle();
	}
	public String restaurantlabelmethod() {
		return this.getText(restaurantlabel);
	}
	public String paymentclickmethod() throws Exception  {
		this.click(paymentlabel);
		Thread.sleep(2500);
		return this.getPageTitle();
	}
	public String paymentlabelmethod() {
		return this.getText(paymentlabel);
	}
	public String mobileordingclickmethod() throws Exception  {
		this.click(mobileordinglabel);
		Thread.sleep(2500);
		return this.getPageTitle();
	}
	public String mobileordinglabelmethod() {
		return this.getText(mobileordinglabel);
	}
	public String commonquestionclickmethod() throws Exception  {
		this.click(commonquestionlabel);
		Thread.sleep(2500);
		return this.getPageTitle();
	}
	public String commonquestionmethod() {
		return this.getText(commonquestionlabel);
	}
	public String loadmorelabelmethod() throws Exception {
		return this.getText(loadmorelabel);
	}
	public String readmoreclickmethod() throws Exception {
		this.click(readmorelabel);
		Thread.sleep(3000);
		return this.getPageTitle();
	}
	public String readmorelabelmethod() throws Exception {
		return this.getText(readmorelabel);
	}
	public String accountclickmethod() throws Exception {
		this.click(accountlable);
		Thread.sleep(4000);
		return this.getPageTitle();
	}
	public String accountlablemethod() {
		return this.getText(accountlable);
	}
	public String topicslabelmethod() {
		return this.getText(topicslabel);
	}
	public String searchinputmethod1(String search) {
		this.clearContent(searchinput);
		this.sendKeys(this.searchinput, search);
		this.click(searcbuttonclick);
		return this.getText(searchresults);
	}
	public String searchinputmethod(String search) {
		this.sendKeys(this.searchinput, search);
		return this.getAtrributeValue(searchinput);
	}
	public void searchbuttonmethod() {
		 this.enablebuttons(searchbutton);
	}
	public String lookingforsomthinglabelmethod() {
		return this.getText(lookingforsomthinglabel);
	}
	public String findanswerlabelmethod() {
		return this.getText(findanswerlabel);
	}
	public String helpcenterheadingmethod() {
		try {
			this.click(cookescancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(helpcenterheading);
	}
	public String generallgetpagetitlemethod() { 
		try {
			this.click(cookescancelbutton);
			}catch (Exception e) {
				
			}
		return this.getPageTitle();
	}	
	
}

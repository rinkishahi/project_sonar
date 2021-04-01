package com.McD.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mc_Cafe_Store_Page  extends Basepage{
	
	public  Mc_Cafe_Store_Page(WebDriver driver) { 
		super(driver);
	}	
	@FindBy(xpath="//*[@id='locateme']/span[2]")  
	WebElement locatemelabel;
	@FindBy(xpath="//html/body/main/div/div/div[4]/div/div/div/div/div/div/div/div/div/form/div/div/div/label")  
	WebElement zipcitystatelabel;
	@FindBy(xpath="//*[@id='cokestore_searchcontrol']")  
	WebElement sendzipcitystate;
	@FindBy(xpath="//html/body/main/div/div/div[4]/div/div/div/div/div/div/div/div/div/form/div/div[2]/button")  
	WebElement searchbutton;
	@FindBy(xpath="//*[@id='resltMsg']")  
	WebElement filterheading;	
	@FindBy(xpath="//*[@id='restaurant-location-map-0']/div[1]/span[2]")  
	WebElement addressmappincount1;
	@FindBy(xpath="//*[@id='restaurant-location-map-6']/div[1]/span[2]")  
	WebElement addressmappincount7;
	@FindBy(xpath="//*[@id='rl-mapView']/div/div/div[19]/div/div/div/div[1]/div[3]/div/div[3]/div[7]/div/span")  
	WebElement clickonmapaddress7;
	@FindBy(xpath="//*[@id='cokeLocatorLeavingCancel']")  
	WebElement getdirectionlabel;
	@FindBy(xpath="//*[@id='mcd-legal-bumper-title-id']")  
	WebElement leavingmcdwebsitelabe;
	@FindBy(xpath="//*[@id='leavingMcD']/div/div/div[3]/button")  
	WebElement cancelbutton;
	@FindBy(xpath="//*[@id='bumper-continue']")  
	WebElement continuebutton;
	@FindBy(xpath="//html/body/main/div/div/div[4]/div/div/div/div/div/div/div/div/div/form/div[3]/div/div/div[2]/button/span[2]")  
	WebElement filterlabel;
	@FindBy(xpath="//*[@id='mcd-rlresults-filter-section']/div[1]/div/label[1]/span")  
	WebElement alllabelinfilter;
	@FindBy(xpath="//*[@id='mcd-rlresults-filter-section']/div[1]/div/label[1]/input")  
	WebElement allcheckbox;
	@FindBy(xpath="//*[@id='mcd-rlresults-filter-section']/div[1]/div/label[2]/span")  
	WebElement mochalabel;
	@FindBy(xpath="//*[@id='mcd-rlresults-filter-section']/div[1]/div/label[2]/input")  
	WebElement mochacheckbox;
	@FindBy(xpath="//*[@id='mcd-rlresults-filter-section']/div[1]/div/label[3]/span")  
	WebElement caramellabel;
	@FindBy(xpath="//*[@id='mcd-rlresults-filter-section']/div[1]/div/label[3]/input")  
	WebElement caramelcheckbox;
	@FindBy(xpath="//*[@id='mcd-rlresults-filter-section']/div[1]/div/label[4]/span")  
	WebElement vanillalabel;
	@FindBy(xpath="//*[@id='mcd-rlresults-filter-section']/div[1]/div/label[4]/input")  
	WebElement venillacheckbox;
	@FindBy(xpath="//*[@id='filterTitleDesktop']")  
	WebElement pleaseenterlocation;
	@FindBy(xpath="//*[@id='radiusRes5']")  
	WebElement radiobutton5cock;
	@FindBy(xpath="//*[@id='radiusRes10']")  
	WebElement radiobutton10cock;
	@FindBy(xpath="//*[@id='radiusRes20']")  
	WebElement radiobutton20cock;
	@FindBy(xpath="//*[@id='radiusRes50']")  
	WebElement radiobutton50cock;
	@FindBy(xpath="//*[@id='mcd-rlresults-filter-section']/div[2]/div/div/fieldset/div/ul/li[1]/label")  
	WebElement radiobutton5label;
	@FindBy(xpath="//*[@id='mcd-rlresults-filter-section']/div[2]/div/div/fieldset/div/ul/li[2]/label")  
	WebElement radiobutton10label;
	@FindBy(xpath="//*[@id='mcd-rlresults-filter-section']/div[2]/div/div/fieldset/div/ul/li[3]/label")  
	WebElement radiobutton20label;
	@FindBy(xpath="//*[@id='mcd-rlresults-filter-section']/div[2]/div/div/fieldset/div/ul/li[4]/label")  
	WebElement radiobutton50label;
	@FindBy(xpath="//html/body/main/div/div/div[4]/div/div/div/div/div/div/div/div/div/form/div[3]/div/div/div/div/button/span")  
	WebElement listviewlabel;
	@FindBy(xpath="//*[@id='rl-list-1']/div[2]/div[1]/span[2]")  
	WebElement roolmappin2;
	@FindBy(xpath="//html/body/main/div/div/div[4]/div/div/div/div/div/div/div/div/div/form/div[3]/div/div/div/div[2]/button/span[2]")  
	WebElement mapviewlabel;
	@FindBy(xpath="//html/body/main/div/div/div[4]/div/div/div/div/div/div/div[2]/div/div/div/div/div/button")  
	WebElement loadmorelabel;
	@FindBy(xpath="//*[@id='rl-list-5']/div[2]/div[1]/span[2]")  
	WebElement rlmappin6;
	@FindBy(xpath="(//*[@id='cokeLocatorLeavingCancelList'])[2]")  
	WebElement listviewgetdirectionlabel;
	@FindBy(xpath="//html/body/div[1]/div[1]/div/button")  
	WebElement cookescancelbutton;
	
	
	
	
	
	public String ubereatmethods() throws Exception { 
		this.click(continuebutton);
		this.windowhandles();
		return this.getPageTitle();
	}
	public String cancelbuttonmethod() throws Exception { 
		this.click(cancelbutton);
		this.waitForElementToBeVisible1( listviewgetdirectionlabel);
		return this.getText(listviewgetdirectionlabel);
	}
	public String getdirectionclickmethod() throws Exception { 
		this.click(listviewgetdirectionlabel);
		this.waitForElementToBeVisible1(leavingmcdwebsitelabe);
		return this.getText(leavingmcdwebsitelabe);
	}
	public String listviewgetdirectionlabelmethod()  {  
		return this.getText(listviewgetdirectionlabel);  
	}
	public String loadmoreclickmethod() { 
		this.click(loadmorelabel);
		return this.getText(rlmappin6);
	}
	public String loadmorelabelmethod() { 
		return this.getText(loadmorelabel);
	}
	public String mapviewlabelmethod() { 
		return this.getText(mapviewlabel);
	}
	public String listviewclickmethod() throws Exception { 
		this.click(listviewlabel);
		this.waitForElementToBeVisible1(roolmappin2);
		return this.getText(roolmappin2);
	}
	public String listviewlabelmethod() { 
		return this.getText(listviewlabel);
	}
	public String radiobutton50labelmethod()  {  
		return this.getText(radiobutton50label);  
	}
	public String radiobutton20labelmethod()  {  
		return this.getText(radiobutton20label);  
	}
	public String radiobutton10labelmethod()  {  
		return this.getText(radiobutton10label);  
	}
	public String radiobutton5labelmethod()  {  
		return this.getText(radiobutton5label);  
	}
	public boolean radiobutton50cockmethod1() {
		this.click(radiobutton50cock);
		return this.isselectedcheckbox(radiobutton50cock);
	}
	public boolean radiobutton20cockmethod1() {
		this.click(radiobutton20cock);
		return this.isselectedcheckbox(radiobutton20cock);
	}
	public boolean radiobutton10cockmethod1() {
		this.click(radiobutton10cock);
		return this.isselectedcheckbox(radiobutton10cock);
	}
	public boolean radiobutton5cockmethod1() {
		this.click(radiobutton5cock);
		return this.isselectedcheckbox(radiobutton5cock);
	}
	public boolean radiobutton50cockmethod() {
		return this.isselectedcheckbox(radiobutton50cock);
	}
	public boolean radiobutton20cockmethod() {
		return this.isselectedcheckbox(radiobutton20cock);
	}
	public boolean radiobutton10cockmethod() {
		return this.isselectedcheckbox(radiobutton10cock);
	}
	public boolean radiobutton5cockmethod() {
		return this.isselectedcheckbox(radiobutton5cock);
	}
	public String pleaseenterlocationmethod()  {  
		return this.getText(pleaseenterlocation);  
	}
	public String allcheckboxmethod1() {
		this.click(allcheckbox);
		return this.getAtrributeValue1(allcheckbox);  
	}
	public String venillacheckboxmethod() {
		return this.getAtrributeValue1(venillacheckbox);  
	}
	public String vanillalabelmethod()  {  
		return this.getText(vanillalabel);  
	}
	public String caramelcheckboxmethod() {
		return this.getAtrributeValue1(caramelcheckbox);  
	}
	public String caramellabelmethod()  {  
		return this.getText(caramellabel);  
	}
	public String mochacheckboxmethod() {
		return this.getAtrributeValue1(mochacheckbox);  
	}
	public String mochalabelmethod()  {  
		return this.getText(mochalabel);  
	}
	public String allcheckboxmethod() {
		return this.getAtrributeValue1(allcheckbox);  
	}
	public String ALLlabelmethod()  {  
		return this.getText(alllabelinfilter);  
	}
	public String clickonfilter() throws Exception {  
		this.click(filterlabel);
		this.waitForElementToBeVisible1(alllabelinfilter);
		return this.getText(alllabelinfilter);  
	}
	public String filterlabelmethod() {  
		return this.getText(filterlabel);  
	}
	public String ubereatmethods1() throws Exception { 
		this.click(getdirectionlabel);
		this.waitForElementToBeVisible1(continuebutton);
		this.click(continuebutton);
		this.windowhandles();
		return this.getPageTitle();
	}
	public String cancelbuttonmethod1() throws Exception { 
		this.click(cancelbutton);
		this.waitForElementToBeVisible1( getdirectionlabel);
		return this.getText(getdirectionlabel);
	}
	public String getdirectionclickmethod1() throws Exception { 
		this.click(getdirectionlabel);
		this.waitForElementToBeVisible1(leavingmcdwebsitelabe);
		return this.getText(leavingmcdwebsitelabe);
	}
	public String getdirectionlabelmethod()  {  
		return this.getText(getdirectionlabel);  
	}
	public String filterheadingmethod() {  
		return this.getText(filterheading);  
	}
	public String selectaddressonmapmethod() throws Exception {   
        this.click(clickonmapaddress7);
        this.waitForElementToBeVisible1(addressmappincount7);
		return this.getText(addressmappincount7);
	}
	public String nearaddressone() throws Exception {   
        this.waitForElementToBeVisible1(addressmappincount1);
		return this.getText(addressmappincount1);
	}
	public String searchbuttonmethod(String sendval) throws Exception  { 
		Thread.sleep(3000);
		try {
		this.click(cookescancelbutton);
		}catch (Exception e) {
			
		}
		this.sendKeys(this.sendzipcitystate, sendval);
		this.waitForElementToBeVisible1(searchbutton);
		this.click(searchbutton);
		this.waitForElementToBeVisible1(filterheading);
		return this.getText(filterheading);
	}
	public String searchbuttonmethod1(String sendval) throws Exception  { 
		driver.navigate().refresh();
		waitForElementToBeVisible1(searchbutton);
		Thread.sleep(3000);
		try {
			this.click(cookescancelbutton);
			}catch (Exception e) {
				
			}
		this.sendKeys(this.sendzipcitystate, sendval);
		this.waitForElementToBeVisible1(searchbutton);
		this.click(searchbutton);
		this.waitForElementToBeVisible1(filterheading);
		return this.getText(filterheading);
	}
	public String searchbuttonmethod1() throws Exception  { 
		this.waitForElementToBeVisible1(searchbutton);
		this.click(searchbutton);
		this.waitForElementToBeVisible1(filterheading);
		return this.getText(filterheading);
	}
	public String zipsendedvalumethod(String sendval) { 
		this.clearContent(sendzipcitystate);
		this.sendKeys(this.sendzipcitystate, sendval);
		return this.getAtrributeValue(sendzipcitystate);
	}
	public String zipsendedvalumethod1(String sendval) throws Exception { 
		driver.navigate().refresh();
		waitForElementToBeVisible1(searchbutton);
		Thread.sleep(3000);
		try {
			this.click(cookescancelbutton);
			}catch (Exception e) {
				
			}
		this.clearContent(sendzipcitystate);
		this.sendKeys(this.sendzipcitystate, sendval);
		return this.getAtrributeValue(sendzipcitystate);
	}
	public String zipcitystatelabelmethod1() { 
		this.click(sendzipcitystate);
		return this.getText(zipcitystatelabel);  
	}
	public String zipcitystatelabelmethod() {  
		return this.getText(zipcitystatelabel);  
	}
	public String locatemelabelmethod() throws Exception {  
		Thread.sleep(3000);
		try {
			this.click(cookescancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(locatemelabel);  
	}
	public String generallgetpagetitlemethod() {  
		return this.getPageTitle();
	}
}

package com.McD.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Local_Restaurant_Page extends Basepage {
	
	public  Local_Restaurant_Page(WebDriver driver) { 
		super(driver);
	}
	@FindBy(xpath="//html/body/main/div/div/div/div/div/div/div/form/div/div[2]/button")  
	WebElement searchbutton;
	@FindBy(xpath="//*[@id='usRestLocatorResultContainer']/div[3]/div/div/div[1]/div/ul/li[2]/div[3]/div[1]/h2/a")  
	WebElement addressdisplay;
	
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/section/div/div/div/div/div[1]/div[5]/div/aside/div/div[1]/img")  //apppromoimg
	WebElement apppromoimg;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/section/div/div/div/div/div[1]/div[5]/div/aside/div/div[2]/h2")  //apppromoheading
	WebElement apppromolabel;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/section/div/div/div/div/div[1]/div[5]/div/aside/div/div[2]/div/ul/li[1]/a/img")  
	WebElement appstore;
	@FindBy(xpath="//*[@id='localnav']/div/div[2]/div[1]/a/span")  
	WebElement appstore1;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/section/div/div/div/div/div[1]/div[5]/div/aside/div/div[2]/div/ul/li[2]/a/img")  
	WebElement playstore;
	@FindBy(xpath="//*[@id='gbq1']/div/a/img")  
	WebElement playstore1;
	@FindBy(xpath="//*[@id='search']")  
	WebElement zipcitystatelabel;
	@FindBy(xpath="//html/body/main/div/div/div/div[2]/div[3]/div/div[2]/div/div/div/div/div/span[2]")  
	WebElement addressnumber;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/section/div/div[2]/div/div/div[1]/h2")  
	WebElement addressdisplayed2;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/div[1]/div/a")  
	WebElement searchforanotherrestaurantlabel;
	//@FindBy(xpath="//html/body/main/div/div/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[3]/div")
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/section/div/div/div/div/div[1]/h1")
	WebElement addressdisplayedtotal;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/section/div/div/div/div/div[1]/div[3]/div/label")  
	WebElement setpreferredlocationlabel;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/section/div/div[2]/div/div/div[1]/div[3]/div")  
	WebElement localaddressdistotla;
	@FindBy(xpath="//html/body/main/div/div/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[3]/div[2]/a")  
	WebElement ordermcdeliverylabel;
	@FindBy(xpath="//*[@id='res-hours']/span")  
	WebElement showhourslabel;
	@FindBy(xpath="//*[@id='res-hours']/span[3]")  
	WebElement hoursmanyvaryonlabel;
	@FindBy(xpath="//*[@id='showHours-Services']/div[1]/div[1]")  
	WebElement clickshowhours;
	@FindBy(xpath="//*[@id='res-hours']/span[2]")  
	WebElement hidehourslabel;
	@FindBy(xpath="//*[@id='show-hours']/div/div[1]/div")  
	WebElement restaurantlobbyhourslabel;
	@FindBy(xpath="//*[@id='show-hours']/div/div[1]/ul/li[1]/span[3]")  
	WebElement restaurantlobbymondayandhourslabel;
	@FindBy(xpath="//*[@id='show-hours']/div/div[2]/div")  
	WebElement drivethruhourslabel;
	@FindBy(xpath="//*[@id='show-hours']/div/div[2]/ul/li[1]/span[3]")  
	WebElement drivethruhoursmondayhourslabel;
	@FindBy(xpath="//*[@id='res-services']/h3")  
	WebElement showserverlabel;
	@FindBy(xpath="//*[@id='showHours-Services']/div[2]/div[1]")  
	WebElement clickshowservices;
	@FindBy(xpath="//*[@id='res-services']/h3[2]")  
	WebElement hideserviceslabel;
	@FindBy(xpath="//*[@id='show-services']/ul/li[1]/span")  
	WebElement McDeliveryonhideserviceslabel;
	@FindBy(xpath="//*[@id='show-services']/ul/li[1]/img") // mcdelivery image path   
	WebElement imageofmcdelivery;
	@FindBy(xpath="//*[@id='show-services']/ul/li[2]/span") // mcdelivery image path   
	WebElement wifionhideservicelabel;
	@FindBy(xpath="//*[@id='show-services']/ul/li[2]/img") // WIFI image path   
	WebElement imageofwifi;
	@FindBy(xpath="//html/body/main/div/div/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[6]/div/h3") // McDelivery@ label path   
	WebElement McDeliverylabel;
	@FindBy(xpath="//html/body/main/div/div/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[6]/div/div") // McDelivery label path   
	WebElement McDeliverylabel2;
	@FindBy(xpath="//html/body/main/div/div/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[6]/div/div[2]/div/a") // order now label path   
	WebElement ordernowlabel;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/div[6]/div/div/div[2]/div/div/h3") // mcdoland's careers  label path   
	WebElement mcdolandscareerslabel;
	@FindBy(xpath="//*[@id='applyJobLink']") // apply for job label path   
	WebElement applyforjoblabellink;
//local paths
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/section/div/div[2]/div/div/div[1]/div[4]/div/label") // set as preferred label path   
	WebElement setaspreferredlocationlabel;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/section/div/div/div/div/div[1]/div[2]/div[2]/a") // order mcdelivery label path   
	WebElement ordermcdeliverylabellocal;
	@FindBy(xpath="//*[@id='res-hours']/span[1]") // show hours label path   
	WebElement showhourslabellocal;
	@FindBy(xpath="//*[@id='res-hours']/span[3]") // hours may vary on or around label path   
	WebElement hoursmayvaryonoraroudlabellocal;
	@FindBy(xpath="//*[@id='showHours-Services']/div[1]/div[1]") // CLICK ON show hours label path   
	WebElement clickshowhourslabellocal;
	@FindBy(xpath="//*[@id='res-hours']/span[2]") // hide hours label path   
	WebElement hidehourslabellocal;
	@FindBy(xpath="//*[@id='show-hours']/div/div[1]/div/h3") // Restaurant lobby hours  label path   
	WebElement restaurantlobbyhourslocallabel;
	@FindBy(xpath="//*[@id='show-hours']/div/div[1]/ul/li[1]/span[3]") //services timings on restaurant lobby   label path   
	WebElement servicestimingslocallabel;
	@FindBy(xpath="//*[@id='show-hours']/div/div[2]/div/h3") //DRIVE THRU HOURS   label path   
	WebElement drivethruhourslocallabel;
	@FindBy(xpath="//*[@id='show-hours']/div/div[2]/ul/li[1]/span[3]") //service timing on DRIVE THRU HOURS   label path   
	WebElement servicetimingsdrivethurlocallabel;
	@FindBy(xpath="//*[@id='res-services']/h3") //show service  label path   
	WebElement showservicelocallabel;
	@FindBy(xpath="//*[@id='res-services']/h3[2]") //hide service label path   
	WebElement hideservicelocallabel;
	@FindBy(xpath="//*[@id='show-services']/ul/li[1]/span") //mcDelivery label path   
	WebElement mcdeliverylocallabel;
	@FindBy(xpath="//*[@id='show-services']/ul/li[1]/img") //mcDelivery img path   
	WebElement mcdeliverylocalimg;
	@FindBy(xpath="//*[@id='show-services']/ul/li[2]/span") //WIFI LABEL path   
	WebElement wifilocallabel;
	@FindBy(xpath="//*[@id='show-services']/ul/li[2]/img") //WIFI img path   
	WebElement wifilocalimg;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/section/div/div[2]/div/div/div[1]/div[8]/div[1]/h3") //Mcdelivery@ path   
	WebElement mcdeliveryordernowlocallabel;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/section/div/div[2]/div/div/div[1]/div[8]/div[1]/div[1]") //Mcdelivery path   
	WebElement mcdeliveryordernowlocallabel1;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/section/div/div[2]/div/div/div[1]/div[8]/div[1]/div[2]/div/a") //order now path   
	WebElement ordernowlocallabel;
	@FindBy(xpath="//*[@class='map-view-heading--bold ng-binding']") //McDonald's Careers path   
	WebElement mcdonaldscareerslocallabel;
	@FindBy(xpath="//*[@id='applyJobLink']") //apply for job local path   
	WebElement applyforjoblocallabel;
	@FindBy(xpath="//*[@id='mcd-del-partner-modal-title']")  
	WebElement leavingmcdwebsitelabe;
	@FindBy(xpath="//*[@id='mcdDeliveryPartnerModal']/div/div/div[2]/button")  
	WebElement cancelbutton;
	@FindBy(xpath="//*[@id='order-now-continue']")  
	WebElement continuebutton;
	@FindBy(xpath="//*[@id='rgDel0']")  
	WebElement selectubereats;
	//@FindBy(xpath="//html/body/div[1]/div[1]/div/button")  
	@FindBy(xpath="//*[@id='onetrust-close-btn-container']/button") 
	WebElement cookiecancelbutton;
	
	@FindBy(xpath="//*[@id='publication-1973525067_mcd-publication']/div/div[1]/h2") 
	WebElement findthislocationlabel;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/div[3]/div/div[2]/div[2]/ul/li[1]/span") 
	WebElement mcdeliverylabel1;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/div[3]/div/div[2]/div[2]/ul/li[1]/img") 
	WebElement imageofmcdelivery1;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/div[3]/div/div[2]/div[2]/ul/li[2]/span") 
	WebElement wifilabel;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/div[3]/div/div[2]/div[2]/ul/li[2]/img") 
	WebElement imageofwifi1;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/div[3]/div/div[2]/div[2]/ul/li[3]/span") 
	WebElement indoordiningslabel;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/div[3]/div/div[2]/div[2]/ul/li[3]/img") 
	WebElement imageofindoordinings;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/div[3]/div/div[2]/div[2]/ul/li[4]/span") 
	WebElement drivethrulabel;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/div[3]/div/div[2]/div[2]/ul/li[4]/img") 
	WebElement imageofdrivethru;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/div[3]/div/div[2]/div[2]/ul/li[5]/span") 
	WebElement giftcardslabel;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/div[3]/div/div[2]/div[2]/ul/li[5]/img") 
	WebElement imageofgiftcards;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/div[3]/div/div[2]/div[2]/ul/li[6]/span") 
	WebElement drivethrucoffeelabel;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/div[3]/div/div[2]/div[2]/ul/li[6]/img") 
	WebElement imageofdrivethrucoffee;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/div[3]/div/div[2]/div[2]/ul/li[7]/span") 
	WebElement mobileofferslabel;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/div[3]/div/div[2]/div[2]/ul/li[7]/img") 
	WebElement imageofmobileoffers;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/section/div/div/div/div/div[1]/div[7]/h2")  //near by stores
	WebElement nearbystoreslabel;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/section/div/div/div/div/div[1]/div[7]/ul/li[1]/a") //near by store link1
	WebElement nearbystoreslink1;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/section/div/div/div/div/div[1]/div[7]/ul/li[2]/a") //near by store link1
	WebElement nearbystoreslink2;
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/section/div/div/div/div/div[1]/div[7]/ul/li[3]/a") //near by store link1
	WebElement nearbystoreslink3;
	@FindBy(xpath="//*[@id='{model.id}']/div[1]/h1") //FAQ label
	WebElement faqlabel;
	@FindBy(xpath="//*[@id='heading_restaurant_locator_amenities_general_restaurant_questions']") //FAQ label question1
	WebElement question1label;
	@FindBy(xpath="//*[@id='question_1_1']") //where can i found store
	WebElement wherecanifoundstorehoureslabel;
	@FindBy(xpath="//*[@id='answer_1_1']/p/a") //where can i found store restaurant locator
	WebElement restaurantlocatorlabel;
	@FindBy(xpath="//*[@id='question_1_2']") //how do i login to wifi label
	WebElement howdoilogintowifilabel;
	@FindBy(xpath="//*[@id='answer_1_2']/p") //how do i login to wifi data
	WebElement howdoilogintowifidata;
	@FindBy(xpath="//*[@id='question_1_3']") //which location have wifi label
	WebElement whichlocationhavewifilabel;
	@FindBy(xpath="//*[@id='answer_1_3']/p/a") //which location have wifi label
	WebElement restaurantlocatorlabel1;
	@FindBy(xpath="//*[@id='question_1_4']") //why dont you list prices on your website label 
	WebElement whydontyoulistpricesonyourwebsitelabel;
	@FindBy(xpath="//*[@id='answer_1_4']/p") //why dont you list prices on your website data
	WebElement whydontyoulistpricesonyourwebsitedata;
	
	@FindBy(xpath="//*[@id='maincontent']/div[2]/div/div[1]/section/div/div/div/div/div[1]/div[2]/div[1]/span[2]/a") // get direction path   
	WebElement getdirection;
	@FindBy(xpath="//*[@id='mcd-legal-bumper-title-id']") // legal bumper path   
	WebElement legalbumper;
	@FindBy(xpath="//*[@id='leavingMcD']/div/div/div[3]/button") // legal bumper cancel button path   
	WebElement legalbumpercancelbutton;
	@FindBy(xpath="//*[@id='bumper-continue']") // legal bumper continue button path   
	WebElement legalbumpercontinuebutton;
	@FindBy(xpath="//*[@id='gb_70']") //  path   
	WebElement mapwindopage;
	
	
	public String applyjoblinkmethods() throws Exception { 
		this.click(applyforjoblocallabel);
		this.waitForElementToBeVisible1(legalbumpercontinuebutton);
		this.click(legalbumpercontinuebutton);
		//this.windowhandles();
		return this.getPageTitle();
	}
	public String cancelbuttonmethod3() throws Exception { 
		this.click(legalbumpercancelbutton);
		this.waitForElementToBeVisible1(applyforjoblocallabel);
		return this.getText(applyforjoblocallabel);
	}
	public String applyforjoblinkclickmethod() throws Exception { 
		try {
			this.click(cookiecancelbutton);
			}catch (Exception e) {
			
			}
		this.click(applyforjoblocallabel);
		this.waitForElementToBeVisible1(legalbumper);
		return this.getText(legalbumper);
	}
	public String ubereatordernowmethods() throws Exception { 
		this.click(ordernowlocallabel);
		this.waitForElementToBeVisible1(continuebutton);
		this.click(continuebutton);
		this.windowhandles();
		return this.getPageTitle();
	}
	public String cancelbuttonmethod2() throws Exception { 
		this.click(cancelbutton);
		this.waitForElementToBeVisible1(ordernowlocallabel);
		return this.getText(ordernowlocallabel);
	}
	public String ordernowlinkclickmethod() throws Exception { 
		this.click(ordernowlocallabel);
		this.waitForElementToBeVisible1(leavingmcdwebsitelabe);
		return this.getText(leavingmcdwebsitelabe);
	}
	public String ubereatmethods() throws Exception { 
		this.click(ordermcdeliverylabellocal);
		this.click(selectubereats);
		this.waitForElementToBeVisible1(continuebutton);
		this.click(continuebutton);
		this.windowhandles();
		return this.getPageTitle();
	}
	public String cancelbuttonmethod() throws Exception { 
		this.click(cancelbutton);
		this.waitForElementToBeVisible1( ordermcdeliverylabellocal);
		return this.getText(ordermcdeliverylabellocal);
	}
	public String ordermcdeliveryclickmethod() throws Exception { 
		try {
			this.click(cookiecancelbutton);
			}catch (Exception e) {
			
			}
		this.click(ordermcdeliverylabellocal);
		this.waitForElementToBeVisible1(leavingmcdwebsitelabe);
		return this.getText(leavingmcdwebsitelabe);
	}
	public String applyforjoblocallabelmethod() { 
		return this.getText(applyforjoblocallabel);
	}
	public String mcdonaldscareerslocallabelmethod() { 
		return this.getText(mcdonaldscareerslocallabel);
	}
	public String ordernowlocallabelmethod() { 
		return this.getText(ordernowlocallabel);
	}
	public String mcdeliveryordernowlocallabel1method() { 
		return this.getText(mcdeliveryordernowlocallabel1);
	}
	public String mcdeliveryordernowlocallabelmethod() { 
		return this.getText(mcdeliveryordernowlocallabel);
	}
	public String wifilocalimgmethod() {
		return this.getimgs(wifilocalimg);  
	}
	public String wifilocallabelmethod() { 
		return this.getText(wifilocallabel);
	}
	public String mcdeliverylocalimgmethod() {
		return this.getimgs(mcdeliverylocalimg);  
	}
	public String mcdeliverylocallabelmethod() { 
		return this.getText(mcdeliverylocallabel);
	}
	public String clickiconchevronlocallabelmethod() throws Exception { 
		this.click(showservicelocallabel);
		this.waitForElementToBeVisible1(hideservicelocallabel);
		return this.getText(hideservicelocallabel);
	}
	public String showservicelocallabelmethod() { 
		return this.getText(showservicelocallabel);
	}
	public String servicetimingsdrivethurlocallabelmethod() { 
		return this.getText(servicetimingsdrivethurlocallabel);
	}
	public String drivethruhourslocallabelmethod() { 
		return this.getText(drivethruhourslocallabel);
	}
	public String servicestimingslocallabelmethod() { 
		return this.getText(servicestimingslocallabel);
	}
	public String restaurantlobbyhourslocallabelmethod() { 
		return this.getText(restaurantlobbyhourslocallabel);
	}
	public String clickshowhourslabellocalmethod() { 
		this.click(clickshowhourslabellocal);
		return this.getText(hidehourslabellocal);
	}
	public String hoursmayvaryonoraroudlabellocalmethod() {  
		return this.getText(hoursmayvaryonoraroudlabellocal);
	}
	public String showhourslabellocalmethod() {  
		return this.getText(showhourslabellocal);
	}
	public String ordermcdeliverylabellocalmethod() {  
		return this.getText(ordermcdeliverylabellocal);
	}	
	public String setaspreferredlocationlabel() {  
		return this.getText(setaspreferredlocationlabel);
	}
	public String applyforjoblabellinkmethod() {  
		return this.getText(applyforjoblabellink);
	}
	public String mcdolandscareerslabelmethod() {  
		return this.getText(mcdolandscareerslabel);
	}
	public String ordernowlabelmethod() {  
		return this.getText(ordernowlabel);
	}
	public String McDeliverylabel2method() {  
		return this.getText(McDeliverylabel2);
	}
	public String McDeliverylabelmethod() {
		return this.getText(McDeliverylabel);
	}
	public String imageofwifimethod() {
		return this.getimgs(imageofwifi);  
	}
	public String wifionhideservicelabelmethod() {
		return this.getText(wifionhideservicelabel);
	}
	public String imageofmcdeliverymethod() {
		return this.getimgs(imageofmcdelivery);  
	}
	public String McDeliveryonhideserviceslabelmethod() {
		return this.getText(McDeliveryonhideserviceslabel);
	}
	public String hideserviceslabelmethod() {
		this.click(clickshowservices);
		return this.getText(hideserviceslabel);
	}
	public String showserverlabelmethod() { 
		return this.getText(showserverlabel);
	}
	public String drivethruhoursmondayhourslabelmethod() { 
		return this.getText(drivethruhoursmondayhourslabel);
	}
	public String drivethruhourslabelmethod() { 
		return this.getText(drivethruhourslabel);
	}
	public String restaurantlobbymondayandhourslabelmethod() { 
		return this.getText(restaurantlobbymondayandhourslabel);
	}
	public String restaurantlobbyhourslabelmethod() { 
		return this.getText(restaurantlobbyhourslabel);
	}
	public String hidehourslabelmethod() { 
		this.click(clickshowhours);
		return this.getText(hidehourslabel);
	}
	public String hoursmanyvaryonlabelmethod() {   
		return this.getText(hoursmanyvaryonlabel);
	}
	public String showhourslabelmethod() { 
		return this.getText(showhourslabel);
	}
	public String ordermcdeliverylabelmethod() {   
		return this.getText(ordermcdeliverylabel);
	}
	public String localaddressdistotlamethod() { 
		return this.getText(localaddressdistotla);
	}
	public String setpreferredlocationlabelmethod() { 
		return this.getText(setpreferredlocationlabel);
	}
	public String addressdisplayedtotalmethod() throws InterruptedException { 
		Thread.sleep(4000);
		try {
			this.click(cookiecancelbutton);
			}catch (Exception e) {
			
			}
		
		return this.getText(addressdisplayedtotal);
	}
	public String clickrestaurantlinkmethod() throws Exception  { 
		//this.waitForElementToBeVisible(addressdisplay);
		//this.click(addressdisplay);
		Thread.sleep(4000);
		this.click(addressdisplay);
		Thread.sleep(4000);
		 this.waitForElementToBeVisible1(searchforanotherrestaurantlabel);
		return this.getText(searchforanotherrestaurantlabel);
	}
	public String restaurantnamemethod() throws Exception  { 
		return this.getText(addressdisplayed2);
	}
	public String addressdisplayed() throws Exception {   
	        this.waitForElementToBeVisible1(addressnumber);
			return this.getText(addressnumber);
		}
	public String searchbuttonmethod1(String sendval) throws Exception  { 
		Thread.sleep(4000);
		try {
			this.click(cookiecancelbutton);
			}catch (Exception e) {
			
			}
		this.sendKeys(this.zipcitystatelabel, sendval);
		this.waitForElementToBeVisible1(searchbutton);
		this.click(searchbutton);
		//this.waitForElementToBeVisible1(addressdisplay);
		//return this.getText(addressdisplay);
		return sendval;
	}
	public String generallgetpagetitlemethod() {  
		return this.getPageTitle();
	}
	
	public Boolean apppromoimg() throws InterruptedException {
		Thread.sleep(4000);
		try {
			this.click(cookiecancelbutton);
			}catch (Exception e) {
			
			}
		return this.enablebuttons(apppromoimg);
	}
	
	
	public String apppromotextmethod() {
		try {
			this.click(cookiecancelbutton);
			}catch (Exception e) {
			
			}
		return this.getText(apppromolabel);
	}
	public String appstoremethod() throws InterruptedException {
		this.click(appstore);
		Thread.sleep(4000);
		return this.getPageTitle();
	
		
	}
	public String playstoremethod() {
		//this.windowhandles();
		this.click(playstore);
		
		return this.getPageTitle();
	}
	
	public String findatthislocationlabelmethod() {
		try {
			this.click(cookiecancelbutton);
			}catch (Exception e) {
			
			}
		return this.getText(findthislocationlabel);
	}
	
	public String McDeliverylabelmethod1() {
		return this.getText(mcdeliverylabel1);
	}
	public String imageofmcdeliverymethod1() {
		return this.getText(imageofmcdelivery1);
	}
	public String wifilabelmethod() {
		return this.getText(wifilabel);
	}
	public String imageofwifimethod1() {
		return this.getText(imageofwifi1);
	}
	public String indoordinngslabelmethod() {
		return this.getText(indoordiningslabel);
	}
	public String imageofindoordiningsmethod() {
		return this.getText(imageofindoordinings);
	}
	public String drivethrulabelmethod() {
		return this.getText(drivethrulabel);
	}
	public String imageofdrivethrumethod() {
		return this.getText(imageofdrivethru);
	}
	public String giftcardslabelmethod() {
		return this.getText(giftcardslabel);
	}
	public String imageofgiftcardsmethod() {
		return this.getText(imageofgiftcards);
	}
	public String drivethrucoffeelabelmethod() {
		return this.getText(drivethrucoffeelabel);
	}
	public String imageofdrivethrucoffeemethod() {
		return this.getText(imageofdrivethrucoffee);
	}
	public String mobileofferslabelmethod() {
		return this.getText(mobileofferslabel);
	}
	public String imageofmobileoffersmethod() {
		return this.getText(imageofmobileoffers);
	}
	public String Nearbystoreslabelmethod() throws InterruptedException {
		Thread.sleep(4000);
		try {
			this.click(cookiecancelbutton);
			}catch (Exception e) {
			
			}
		return this.getText(nearbystoreslabel);
	}
	public String Nearbystoreslink1method() {
		this.click(nearbystoreslink1);
		//return this.getText(nearbystoreslink1);
		return this.getPageTitle();
		
	}
	public String Nearbystoreslink2method() {
		driver.navigate().back();
		this.click(nearbystoreslink2);
		return this.getPageTitle();
		//driver.navigate().back();
	}
	public String Nearbystoreslink3method() {
		driver.navigate().back();
		this.click(nearbystoreslink3);
		return this.getPageTitle();
		//driver.navigate().back();
	}
	public String searchbuttonmethod(String sendval) throws Exception { 
			Thread.sleep(4000);
			try {
			//this.click(cookescancelbutton);
			}catch (Exception e) {
				
			}
			this.clearContent(zipcitystatelabel);
			this.sendKeys(this.zipcitystatelabel, sendval);
			this.waitForElementToBeVisible1(searchbutton);
			Thread.sleep(4000);
			this.click(searchbutton);
			//this.click(searchbutton);
			this.waitForElementToBeVisible1(addressdisplay);
			return this.getText(addressdisplay);
		}
	public String faqlabelmethod() {
		try {
			this.click(cookiecancelbutton);
			}catch (Exception e) {
			
			}
		return this.getText(faqlabel);
	}
	public String faqlabelquestion1method() throws Exception {
		this.click(question1label);
		return this.getText(question1label);
	}
	public String wherecanifoundstorehoursmethod() {
		this.click(wherecanifoundstorehoureslabel);
		this.click(restaurantlocatorlabel);
		return this.getPageTitle();
		//driver.navigate().back();
	}
	public String howdoilogintowifimethod() {
		driver.navigate().back();
		this.click(question1label);
		this.click(howdoilogintowifilabel);
		return this.getText(howdoilogintowifidata);
	}
	public String whichlocationhavewifimethod() {
		
		this.click(whichlocationhavewifilabel);
		this.click(restaurantlocatorlabel1);
		return this.getPageTitle();
	}
	public String whydontyoulistpricesonyourwebsitemethod() {
		driver.navigate().back();
		this.click(question1label);
		this.click(whydontyoulistpricesonyourwebsitelabel);
		return this.getText(whydontyoulistpricesonyourwebsitedata);
	}
	public String getdirectionlabelmethod() {
		try {
			this.click(cookiecancelbutton);
			}catch (Exception e) {
			
			}
		return this.getText(getdirection);
	}
	public String getdirectionclickmethod() {
		this.click(getdirection);
		return this.getText(legalbumper);
	}
	public String legalbumpercancelbuttonmethod() {
		this.click(legalbumpercancelbutton);
		return this.getText(legalbumper);
	}
	public String getdirectionclickmethod1() { 
		this.click(getdirection);
		this.click(legalbumpercontinuebutton);
		this.windowhandles();
		return this.getText(mapwindopage);
	}
	
	
	
	
	


}

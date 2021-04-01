package com.McD.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Restaurant_Locator_Page extends Basepage{
	public  Restaurant_Locator_Page(WebDriver driver) { 
		super(driver);
	}	
	
	@FindBy(xpath="//*[@id='search']")  
	WebElement zipcitystatelabel;
	@FindBy(xpath="//*[@id='searchLabel']")  
	WebElement zipcitystatelabel1;
	@FindBy(xpath="(//*[@data-ng-click='showRestaurantsForCurrentLocation()'])[1]")  
	WebElement locatemelabel;
	@FindBy(xpath="//*[@id='usRestLocatorResultContainer']/div[1]/div[1]/div[2]/div/button/span[2]")  
	WebElement showmorelabel;
	@FindBy(xpath="//html/body/main/div/div/div/div/div/div/div/form/div/div/a")  
	WebElement closebutton;
	@FindBy(xpath="//*[@id='rl-jcr:content-1526839399']/div/div/div/form/div[1]/div[2]/button")  
	WebElement searchbutton;
	//@FindBy(xpath="//html/body/main/div/div/div/div[2]/div[3]/div/div[2]/div/div/div/div/div/span[2]")  
	@FindBy(xpath="//*[@id='usRestLocatorResultContainer']/div[3]/div/div/div[1]/div/ul/li[1]/div[1]/span[2]") 
	WebElement addressnumber;
	@FindBy(xpath="//*[@id='usRestLocatorResultContainer']/div[3]/div/div[1]/div/ul/li[1]/div[3]/div[1]/h2/a")  
	WebElement addressdisplay;
	@FindBy(xpath="(//*[@class='mcd-rl-results__rl-name-link ng-binding'])[2]")
	
	WebElement addressdisplay1;
	//@FindBy(xpath="//html/body/main/div/div/div/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div/div/div/div[3]/div/div[3]/div[3]/div/span")
	@FindBy(xpath="//*[@id='map']/div/div/div[1]/div[3]/div/div[4]/div")
	WebElement clickonmapaddress;
	@FindBy(xpath="(//*[@class='button--yellow mcd-rl-results__rl-order-now-btn external-delivery ng-binding'])[1]")  
	WebElement ordermcdeliverylabel;
	@FindBy(xpath="//*[@id='usRestLocatorResultContainer']/div[3]/div/div[1]/div/ul/li[1]/div[3]/div[2]/div[2]/a")  
	WebElement ordermcdeliverymaplabel;
	@FindBy(xpath="//*[@id='rg1']/div/div[1]/div/span")  
	WebElement ubereatsradiobutton;
	@FindBy(xpath="//*[@id='mcd-legal-bumper-title-id']")  
	WebElement leavingmcdwebsitelabe;
	@FindBy(xpath="//*[@id='mcd-del-partner-modal-title']")  
	WebElement leavingmcdwebsitelabel;
	@FindBy(xpath="//*[@id='bumper-continue']")  
	WebElement continuebutton;
	@FindBy(xpath="//*[@id='order-now-continue']")  
	WebElement continuebutton1;
	@FindBy(xpath="//*[@class='active']/img")  
	WebElement ubereatimg;
	//@FindBy(xpath="//*[@id='mcdDeliveryPartnerModal']/div/div/div[2]/button")  
	@FindBy(xpath="//*[@id='mcdDeliveryPartnerModal']/div/div/div[2]/button") 
	WebElement cancelbutton1;
	//@FindBy(xpath="//*[@id='mcdDeliveryPartnerModal']/div/div/div[2]/button")  
	@FindBy(xpath="//*[@id='leavingMcD']/div/div/div[3]/button")
	WebElement cancelbutton;
	@FindBy(xpath="//*[@id='rg1']/div/div[2]/div/span")  
	WebElement doordashradiobutton;
	@FindBy(xpath="//*[@id='ConsumerApp']/div/div[1]/div/header/div[2]/a/div/div/svg")  
	WebElement doordashimg;
	@FindBy(xpath="//*[@id='rg1']/div/div[3]/div/span")  
	WebElement grubhubradiobutton;
	@FindBy(xpath="/html/head/script[13]")  
	WebElement grubhubimg;
	@FindBy(xpath="//*[@id='res-hours']/span")  
	WebElement showhourslabel;
	@FindBy(xpath="//*[@id='res-hours-desc']")  
	WebElement hoursmanyvaryonlabel;
	@FindBy(xpath="//*[@id='showHours-Services']/div[1]/div[1]")  
	WebElement clickshowhours;
	@FindBy(xpath="//*[@id='res-hours']/span[2]")  
	WebElement hidehourslabel;
	@FindBy(xpath="//*[@id='show-hours']/div/div[1]/div")  
	WebElement restaurantlobbyhourslabel;
	@FindBy(xpath="//*[@id='show-hours']/div/div[1]/ul/li[1]/span[3]")  
	WebElement restaurantlobbymondayandhourslabel;
	/*@FindBy(xpath="//*[@id='show-hours']/div/div[2]/div")  
	WebElement drivethruhourslabel;*/
	@FindBy(xpath="//*[@id='res-hours']")  
	WebElement drivethruhourslabel;
	@FindBy(xpath="//*[@id='show-hours']/div/div[2]/ul/li[1]/span[3]")  
	WebElement drivethruhoursmondayhourslabel;
	@FindBy(xpath="//*[@id='res-services']/h3")  
	WebElement showserverlabel;
	@FindBy(xpath="//*[@id='showHours-Services']/div[2]/div[1]")  
	WebElement clickshowservices;
	@FindBy(xpath="//*[@id='res-services']/h3[2]")  
	WebElement hideserviceslabel;
	@FindBy(xpath="//*[@id='show-services']/ul/li[1]/span")  //mcdelivery label
	WebElement McDeliveryonhideserviceslabel;
	@FindBy(xpath="//*[@id='show-services']/ul/li[1]/img") // mcdelivery image path   
	WebElement imageofmcdelivery;
	@FindBy(xpath="//*[@id='show-services']/ul/li[2]/span")  //wifi label
	WebElement wifionhideserviceslabel;
	@FindBy(xpath="//*[@id='show-services']/ul/li[2]/img") // wifi image path   
	WebElement imageofwifi;
	@FindBy(xpath="//*[@id='show-services']/ul/li[3]/span") // INDOOR DINING LABEL  
	WebElement indoordiningonhideservicelabel;
	@FindBy(xpath="//*[@id='show-services']/ul/li[3]/img") // indoor dining image path   
	WebElement imageofindoordining;
	@FindBy(xpath="//*[@id='restaurant-locator-195500284644-en-us']/div[6]/div[1]/h3") // McDelivery@ label path   
	WebElement McDeliverylabel;
	@FindBy(xpath="//*[@id='restaurant-locator-195500284644-en-us']/div[6]/div[1]/div[1]") // McDelivery label path   
	WebElement McDeliverylabel2;
	@FindBy(xpath="//*[@id='restaurant-locator-195500284644-en-us']/div[3]/div[2]/a") // order now label path   
	WebElement ordernowlabel;
	@FindBy(xpath="//*[@id='restaurant-locator-195500284644-en-us']/div[6]/div[2]/h3") // mcdoland's careers  label path   
	WebElement mcdolandscareerslabel;
	@FindBy(xpath="//*[@id='restaurant-locator-195500284644-en-us']/div[6]/div[2]/div[2]/div/a") // apply for job label path   
	WebElement applyforjoblabellink;
	@FindBy(xpath="//*[@id='maincontent']/div[1]/div/div[1]/div[2]/div[1]/div[1]/div[1]") // McDonald label path   
	WebElement mcdresultheadingfilter;
	@FindBy(xpath="//*[@id='filterItems0']") // mcdelevary filter label path   
	WebElement mcdelivaryfilterlabel;
	@FindBy(xpath="//*[@id='filterItemsInput0']") // 	mcdelivery check box  path   
	WebElement mcdeliverycheckbox;
	@FindBy(xpath="//*[@id='mcd-rlresults-filter-section']/div/div/button") // reset button label  path   
	WebElement resetbuttonlabel;
	@FindBy(xpath="//*[@id='filterItems1']") // WIFI filter label path   
	WebElement wififilterlabel;
	@FindBy(xpath="//*[@id='filterItemsInput1']") // 	wifi check box  path   
	WebElement wificheckbox;
	@FindBy(xpath="//*[@id='filterItems2']") // indoor dining  LABEL  path   
	WebElement indoordiningsfilterlabel;
	@FindBy(xpath="//*[@id='filterItemsInput2']") // 	INDOOR DINING check box  path   
	WebElement indoordiningcheckbox;
	@FindBy(xpath="//*[@id='filterItems3']") // drive thru  LABEL  path   
	WebElement drivethrufilterlabel;
	@FindBy(xpath="//*[@id='filterItemsInput3']") //drive thru check box  path   
	WebElement drivethrucheckbox;
	/*@FindBy(xpath="//*[@id='filterItems4']") // drive thru coffee LABEL  path   
	WebElement drivethrucoffeefilterlabel;
	@FindBy(xpath="//*[@id='filterItemsInput4']") //drive thru coffee check box  path   
	WebElement drivethrucoffeecheckbox;*/
	@FindBy(xpath="//*[@id='filterItems4']") // INDOOR PLAYGROUND LABEL  path   
	WebElement indoorplaygroundfilterlabel;
	@FindBy(xpath="//*[@id='filterItemsInput4']") //INDOOR PLAYGROUND check box  path   
	WebElement indoorplaygroundcheckbox;
	@FindBy(xpath="//*[@id='filterItems5']") // outDOOR activity LABEL  path   
	WebElement outdooractivityfilterlabel;
	@FindBy(xpath="//*[@id='filterItemsInput5']") //outDOOR activity check box  path   
	WebElement outdooractivitycheckbox;
	@FindBy(xpath="//*[@id='filterItems6']") // gift cards LABEL  path   
	WebElement giftcardsfilterlabel;
	@FindBy(xpath="//*[@id='filterItemsInput6']") //gift cards check box  path   
	WebElement giftcatdscheckbox;
	@FindBy(xpath="//*[@id='filterItems8']") // mobile offer LABEL  path   
	WebElement mobileofferfilterlabel;
	@FindBy(xpath="//*[@id='filterItemsInput8']") //mobile offer check box  path   
	WebElement mobileoffercheckbox;
	@FindBy(xpath="//*[@id='filterItems9']") //open 24/7 label  path   
	WebElement open247label;
	@FindBy(xpath="//*[@id='filterItemsInput9']") //open 24/7 check box  path   
	WebElement open247checkbox;
	
	
	
	
	@FindBy(xpath="//*[@id='filterTitleDesktop']") //how far away (miles)  path   
	WebElement howfarwaymileslabel;
	@FindBy(xpath="//*[@id='maincontent']/div[1]/div/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div/button/span[2]") //list view label  path   
	WebElement listviewlabel;
	@FindBy(xpath="//html/body/main/div/div/div/div[2]/div[3]/div/div/ul/li[2]/div/div/div/span[2]") //second address in list view  path   
	WebElement secondaddresslabel;
	@FindBy(xpath="//*[@id='maincontent']/div[1]/div/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div/button/span[2]") //MAP VIEW  path   
	WebElement mapviewlabel;
	@FindBy(xpath="//html/body/main/div/div/div/div[2]/div[3]/div/div/ul/li[2]/button/span/span") //chevron down  path   
	WebElement chevrondownicon;
	@FindBy(xpath="//*[@id='more-details-1']/div/div/div[3]/h3") // restaurant lobby hours   path   
	WebElement resaturantlobbyhourslabess;
	//@FindBy(xpath="//*[@class='rl-list__item row panel ng-scope'][2]/div[3]/div/div/div[2]") // Hours may vary on or around holidays   path   
	@FindBy(xpath="//html/body/main/div[1]/div/div[1]/div[2]/div[3]/div[1]/div[1]/ul/li[2]/div[3]/div/div/div[2]")
	WebElement hoursmayvaryonoraroundlabel1;
	
	@FindBy(xpath="//html/body/main/div[1]/div/div[1]/div[2]/div[3]/div[1]/div[1]/ul/li[2]/div[3]/div/div/div[2]") // Hours may vary on or around holidays   path   
	WebElement hoursmayvaryonoraroundlabel;
	@FindBy(xpath="//*[@id='more-details-1']/div/div/div[3]/ul/li[1]/span[3]")  
	WebElement restaurantlobbymondayandhourslabel1;
	@FindBy(xpath="//*[@id='more-details-1']/div/div/div[4]/h3")  
	WebElement drivethruhourslabel1;
	@FindBy(xpath="//*[@id='more-details-1']/div/div/div[4]/ul/li[1]/span[3]")  
	WebElement drivethruhoursmondayhourslabel1;
	@FindBy(xpath="//*[@id='more-details-1']/div/div/div[5]/h3")  
	WebElement serviceslabelonlistview;
	@FindBy(xpath="(//span[contains(text(),'McDelivery')])[2]")  
	WebElement McDeliveryonhideserviceslabel1;
	@FindBy(xpath="(//span[contains(text(),'McDelivery')])[2]/../img") // mcdelivery image path   
	WebElement imageofmcdelivery1;
	@FindBy(xpath="(//span[contains(text(),'WIFI')])[2]") // mcdelivery image path   
	WebElement wifionhideservicelabel1;
	@FindBy(xpath="(//span[contains(text(),'WIFI')])[2]/../img") // WIFI image path   
	WebElement imageofwifi1;
	@FindBy(xpath="//*[@id='rl-list-195500282855-en-us']/div[2]/a")  
	WebElement ordermcdeliverylabel1;
	//@FindBy(xpath="//*[@class='rl-list__item row panel ng-scope'][2]/div[2]")  
	@FindBy(xpath="//*[@id='rl-list-195500282855-en-us']/div[2]/a") 
	WebElement ordermcdeliverylabel1p;
	@FindBy(xpath="//*[@id='more-details-1']/div/div/div[6]/div/div[1]/h3") // McDelivery@ label path   
	WebElement McDeliverylabel1;
	@FindBy(xpath="//*[@id='more-details-1']/div/div/div[6]/div/div[1]/div[1]") // McDelivery label path   
	WebElement McDeliverylabel21;
	@FindBy(xpath="//*[@id='more-details-1']/div/div/div[6]/div/div[1]/div[2]/div/a") // order now label path   
	WebElement ordernowlabel1;
	@FindBy(xpath="//*[@id='more-details-1']/div/div/div[6]/div/div[2]/h3") // mcdoland's careers  label path   
	WebElement mcdolandscareerslabel1;
	@FindBy(xpath="//*[@id='more-details-1']/div/div/div[6]/div/div[2]/div[2]/div/a") // apply for job label path   
	WebElement applyforjoblabellink1;
	@FindBy(xpath="//*[@id='radiusRes0']") // 5 RADIO BUTTON path   
	WebElement radiobutton5;
	@FindBy(xpath="//*[@id='radiusRes1']") // 10 RADIO BUTTON path   
	WebElement radiobutton10;
	@FindBy(xpath="//*[@id='radiusRes2']") // 20 RADIO BUTTON path   
	WebElement radiobutton20;
	@FindBy(xpath="//*[@id='radiusRes3']") // 50 RADIO BUTTON path   
	WebElement radiobutton50;
	@FindBy(xpath="//*[@id='mcd-rlresults-filter-section']/div/fieldset/div/form/ul/li[1]/div/label") // 5 RADIO BUTTON label path   
	WebElement radiobutton5label;
	@FindBy(xpath="//*[@id='mcd-rlresults-filter-section']/div/fieldset/div/form/ul/li[2]/div/label") // 10 RADIO BUTTON label path   
	WebElement radiobutton10label;
	@FindBy(xpath="//*[@id='mcd-rlresults-filter-section']/div/fieldset/div/form/ul/li[3]/div/label") // 20 RADIO BUTTON label path   
	WebElement radiobutton20label;
	@FindBy(xpath="//*[@id='mcd-rlresults-filter-section']/div/fieldset/div/form/ul/li[4]/div/label") // 50 RADIO BUTTON label path   
	WebElement radiobutton50label;
	@FindBy(xpath="//*[@id='onetrust-close-btn-container']/button") // cookes cancel button path   
	WebElement cookescancelbutton;
	@FindBy(xpath="//html/body/main/div/div/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[3]/div/span[2]/p/a") // get direction path   
	WebElement getdirection;
	@FindBy(xpath="//*[@id='mcd-legal-bumper-title-id']") // legal bumper path   
	WebElement legalbumper;
	@FindBy(xpath="//*[@id='leavingMcD']/div/div/div[3]/button") // legal bumper cancel button path   
	WebElement legalbumpercancelbutton;
	@FindBy(xpath="//*[@id='bumper-continue']") // legal bumper continue button path   
	WebElement legalbumpercontinuebutton;
	@FindBy(xpath="//html/body/main/div/div/div/div[2]/div[3]/div/div/ul/li[2]/div/div/div[2]/div[2]/span[2]/a") // get direaction list view path   
	WebElement getdirectionlistview;
	@FindBy(xpath="//*[@id='more-details-1']/div/div/div[5]") // get direaction list view path   
	WebElement getdirectionlistview1;
	@FindBy(xpath="//*[@id='pane']/div/div[1]/div/div/div[4]/div[1]/div[2]/button") //  path   
	WebElement mapwindopage;
	//@FindBy(xpath="//*[@id='maincontent']/div[1]/div/div[1]/div[2]/div[1]/div[1]/div[1]") // locate me path   
	@FindBy(xpath="//*[@id='map']/div/div/div[1]/div[3]/div/div[4]/div/div/div/div/div/div/div/div[1]") // locate me path 
	WebElement restarentfilterheding;
	//(xpath="//*[@class='rl-mapview__details row']/div[2]")  //webstatus open path 
	@FindBy(xpath="(//*[@class='rl_status__text ng-binding'])[2]")  //webstatus open path  
	WebElement webstatusopenlabel;
	@FindBy(xpath="//*[@id='usRestLocatorResultContainer']/div[3]/div/div/div[1]/div/div/button")  //webstatus open path  
	WebElement loadmorelabel;
	@FindBy(xpath="//*[@id='usRestLocatorResultContainer']/div[3]/div/div/div[1]/div/ul/li[6]/div[2]/div[1]/h2/a")
	WebElement restaurantaddress1;
	@FindBy(xpath="//*[@id='header-jcr:content-1526839399']/nav/div[2]/div/div[2]/div[2]/ul/li[3]/a")
	WebElement ordermcdeliverylabel2;
	
	
	
	
	public String webstatusopenlabelmethod() {
		return this.getText(webstatusopenlabel);  
	}
	public String restarentfilterhedingmethod() throws Exception {
		this.click(locatemelabel);
        Thread.sleep(15000);
		return this.getText(restarentfilterheding);  
	}
	public String McDeliveryonhideserviceslabelmethod11() {
		return this.getText(getdirectionlistview1);
	}
	public String getdirectionclicklistmethod1() { 
		this.click(getdirectionlistview);
		this.click(legalbumpercontinuebutton);
		windowhandles();
		return this.getText(mapwindopage);
	}
	public String legalbumpercancelbuttonlistmethod () { 
		this.click(legalbumpercancelbutton);
		return this.getText(legalbumper);
	}
	public String getdirectionclicklistmethod () { 
		this.click(getdirectionlistview);
		return this.getText(legalbumper);
	}
	public String getdirectionlabellistmethod () { 
		return this.getText(getdirectionlistview);
	}
	public String getdirectionclickmethod1() { 
		this.click(getdirection);
		this.click(legalbumpercontinuebutton);
		this.windowhandles();
		return this.getText(mapwindopage);
	}
	public String legalbumpercancelbuttonmethod () { 
		this.click(legalbumpercancelbutton);
		return this.getText(legalbumper);
	}
	public String getdirectionclickmethod () { 
		this.click(getdirection);
		return this.getText(legalbumper);
	}
	public String getdirectionlabelmethod () { 
		return this.getText(getdirection);
	}
	public String radiobutton50labelmethod () { 
		return this.getText(radiobutton50label);
	}
	public String radiobutton20labelmethod () { 
		return this.getText(radiobutton20label);
	}
	public String radiobutton10labelmethod () { 
		return this.getText(radiobutton10label);
	}
	public String radiobutton5labelmethod () { 
		return this.getText(radiobutton5label);
	}
	public boolean radiobutton50method1() {
		this.click(radiobutton50);
		return this.isselectedcheckbox(radiobutton50);
	}
	public boolean radiobutton20method1() {
		this.click(radiobutton20);
		return this.isselectedcheckbox(radiobutton20);
	}
	public boolean radiobutton10method1() {
		this.click(radiobutton10);
		return this.isselectedcheckbox(radiobutton10);
	}
	public boolean radiobutton5method1() {
		this.click(radiobutton5);
		return this.isselectedcheckbox(radiobutton5);
	}
	public boolean radiobutton50method() {
		return this.isselectedcheckbox(radiobutton50);
	}
	public boolean radiobutton20method() {
		return this.isselectedcheckbox(radiobutton20);
	}
	public boolean radiobutton10method() {
		return this.isselectedcheckbox(radiobutton10);
	}
	public boolean radiobutton5method() {
		return this.isselectedcheckbox(radiobutton5);
	}
	public String applyjoblinkmethods1() throws Exception { 
		this.click(applyforjoblabellink1);
		
		this.waitForElementToBeVisible1(continuebutton);
		this.click(continuebutton);
		//this.waitForElementToBeVisible1();
		this.windowhandles();
		return this.getPageTitle();
	}
	public String cancelbuttonmethod31() throws Exception { 
		this.click(cancelbutton);
		this.waitForElementToBeVisible1(applyforjoblabellink1);
		return this.getText(applyforjoblabellink1);
	}
	public String applyforjoblinkclickmethod1() throws Exception { 
		this.click(applyforjoblabellink1);
		this.waitForElementToBeVisible1(leavingmcdwebsitelabe);
		return this.getText(leavingmcdwebsitelabe);
	}
	public String applyforjoblabellinkmethod1() {  
		return this.getText(applyforjoblabellink1);
	}
	public String mcdolandscareerslabelmethod1() {  
		return this.getText(mcdolandscareerslabel1);
	}
	public String ubereatmethods2() throws Exception { 
		this.click(ordernowlabel1);
		this.click(ubereatsradiobutton);
		this.waitForElementToBeVisible1(continuebutton1);
		this.click(continuebutton1);
		//this.waitForElementToBeVisible1();
		this.windowhandles();
		return this.getAttributeimg(ubereatimg);
	}
	public String cancelbuttonmethod21() throws Exception { 
		this.click(cancelbutton);
		this.waitForElementToBeVisible1(ordernowlabel1);
		return this.getText(ordernowlabel1);
	}
	public String ordernowlinkclickmethod1() throws Exception { 
		this.click(ordernowlabel1);
		this.waitForElementToBeVisible1(leavingmcdwebsitelabel);
		return this.getText(leavingmcdwebsitelabel);
	}
	public String ordernowlabelmethod1() {  
		return this.getText(ordernowlabel1);
	}
	public String McDeliverylabel2method1() {  
		return this.getText(McDeliverylabel21);
	}
	public String McDeliverylabelmethod1() {
		return this.getText(McDeliverylabel1);
	}
	public String ubereatmethods1() throws Exception { 
		this.click(ordermcdeliverylabel1);
		this.waitForElementToBeVisible1(continuebutton1);
		this.click(continuebutton1);
		//this.waitForElementToBeVisible1();
		this.windowhandles();
	   return this.getAttributeimg(ubereatimg);
	}
	public String cancelbuttonmethod1() throws Exception { 
		this.click(cancelbutton);
		this.waitForElementToBeVisible1( ordermcdeliverylabel1);
		return this.getText(ordermcdeliverylabel1);
	}
	public String ordermcdeliveryclickmethod1() throws Exception { 
		this.click(ordermcdeliverylabel1);
		this.waitForElementToBeVisible1(leavingmcdwebsitelabe);
		return this.getText(leavingmcdwebsitelabe);
	}
	public String ordermcdeliverylabelmethod1() {   
		return this.getText(ordermcdeliverylabel1);
	}
	public String ordermcdeliverylabelmethod1p() {   
		return this.getAtrributeclass(ordermcdeliverylabel1p);
	}
	/*public String imageofwifimethod1() {
		return this.getimgs(imageofwifi1);  
	}*/
	public Boolean imageofwifimethod1() {
		return this.enablebuttons(imageofwifi1);
	}
	public String wifionhideservicelabelmethod1() {
		return this.getText(wifionhideservicelabel1);
	}
	/*public String imageofmcdeliverymethod1() {
		return this.getimgs(imageofmcdelivery1);  
	}*/
	public Boolean imageofmcdeliverymethod1() {
		return this.enablebuttons(imageofmcdelivery1);
	}
	public String McDeliveryonhideserviceslabelmethod1() {
		return this.getText(McDeliveryonhideserviceslabel1);
	}
	public String serviceslabelonlistviewmethod() { 
		return this.getText(serviceslabelonlistview);
	}
	public String drivethruhoursmondayhourslabelmethod1() { 
		return this.getText(drivethruhoursmondayhourslabel1);
	}
	public String drivethruhourslabelmethod1() { 
		return this.getText(drivethruhourslabel1);
	}
	public String restaurantlobbymondayandhourslabelmethod1() { 
		return this.getText(restaurantlobbymondayandhourslabel1);
	}
	public String restaurantlobbyhourslabelmethod1() { 
		return this.getText(resaturantlobbyhourslabess);
	}
	public String hoursmanyvaryonlabelmethod1() {   
		return this.getText(hoursmayvaryonoraroundlabel);
	}
	public String chevrondowniconmethod() { 
		this.click(chevrondownicon);
		return this.getText(hoursmayvaryonoraroundlabel1);
	}
	public String mapviewlabelmethod() { 
		return this.getText(mapviewlabel);
	}
	public String listviewclickmethod() { 
		try {
			this.click(cookescancelbutton);
			}catch (Exception e) {
				
			}
		this.click(listviewlabel);
		return this.getText(secondaddresslabel);
	}
	public String listviewlabelmethod() { 
		return this.getText(listviewlabel);
	}
	public String howfarwaymileslabelmethod() { 
		this.click(mobileoffercheckbox);
		return this.getText(howfarwaymileslabel);
	}
	public String mobileoffercheckboxmethod1() {
		this.click(mobileoffercheckbox);
		return this.getAtrributeValue1(mobileoffercheckbox);  
	}
	public String mobileoffercheckboxmethod() {
		return this.getAtrributeValue1(mobileoffercheckbox);  
	}
	public String mobileofferfilterlabelmethod() { 
		this.click(giftcatdscheckbox);
		return this.getText(mobileofferfilterlabel);
	}
	public String open247labelmethod() { 
		this.click(mobileoffercheckbox);
		return this.getText(open247label);
	}
	public String open247checkboxmethod() {
		return this.getAtrributeValue1(open247checkbox);
	}
	public String open247checkboxmethod1() {
		this.click(open247checkbox);
		return this.getAtrributeValue1(open247checkbox); 
	}
	public String giftcatdscheckboxmethod1() {
		this.click(giftcatdscheckbox);
		return this.getAtrributeValue1(giftcatdscheckbox);  
	}
	public String giftcatdscheckboxmethod() {
		return this.getAtrributeValue1(giftcatdscheckbox);  
	}
	public String giftcardsfilterlabelmethod() { 
		this.click(outdooractivitycheckbox);
		return this.getText(giftcardsfilterlabel);
	}
	public String outdooractivitycheckboxmethod1() {
		this.click(outdooractivitycheckbox);
		return this.getAtrributeValue1(outdooractivitycheckbox);  
	}
	public String outdooractivitycheckboxmethod() {
		return this.getAtrributeValue1(outdooractivitycheckbox);  
	}
	public String outdooractivityfilterlabelmethod() { 
		this.click(indoorplaygroundcheckbox);
		return this.getText(outdooractivityfilterlabel);
	}
	public String indoorplaygroundcheckboxmethod1() {  
		this.click(indoorplaygroundcheckbox);
		return this.getAtrributeValue1(indoorplaygroundcheckbox);  
	}
	public String indoorplaygroundcheckboxmethod() {
		return this.getAtrributeValue1(indoorplaygroundcheckbox);  
	}
	public String indoorplaygroundfilterlabelmethod() { 
		//this.click(drivethrucoffeecheckbox);
		this.click(drivethrucheckbox);
		return this.getText(indoorplaygroundfilterlabel);
	}
	/*public String drivethrucoffeecheckboxmethod1() {
		this.click(drivethrucoffeecheckbox);
		return this.getAtrributeValue1(drivethrucoffeecheckbox);  
	}
	public String drivethrucoffeecheckboxmethod() {
		return this.getAtrributeValue1(drivethrucoffeecheckbox);  
	}
	public String drivethrucoffeefilterlabelmethod() { 
		this.click(drivethrucheckbox);
		return this.getText(drivethrucoffeefilterlabel);
	}*/
	public String drivethrucheckboxmethod1() {
		this.click(drivethrucheckbox);
		return this.getAtrributeValue1(drivethrucheckbox);  
	}
	public String drivethrucheckboxmethod() {
		return this.getAtrributeValue1(drivethrucheckbox);  
	}
	public String drivethrufilterlabelmethod() { 
		this.click(indoordiningcheckbox);
		return this.getText(drivethrufilterlabel);
	}
	public String indoordiningcheckboxmethod1() {
		this.click(indoordiningcheckbox);
		return this.getAtrributeValue1(indoordiningcheckbox);  
	}
	public String indoordiningcheckboxmethod() {
		return this.getAtrributeValue1(indoordiningcheckbox);  
	}
	public String indoordiningsfilterlabelmethod() { 
		this.click(wificheckbox);
		return this.getText(indoordiningsfilterlabel);
	}
	public String wificheckboxmethod1() {
		this.click(wificheckbox);
		return this.getAtrributeValue1(wificheckbox);  
	}
	public String wificheckboxmethod() {
		return this.getAtrributeValue1(wificheckbox);  
	}
	public String wififilterlabelmethod() { 
		this.click(mcdeliverycheckbox);
		return this.getText(wififilterlabel);
	}
	public String resetbuttonlabelmethod() { 
		return this.getText(resetbuttonlabel);
	}
	public String mcdeliverycheckboxmethod1() {
		this.click(mcdeliverycheckbox);
		return this.getAtrributeValue1(mcdeliverycheckbox);  
	}
	public String mcdeliverycheckboxmethod() {
		return this.getAtrributeValue1(mcdeliverycheckbox);  
	}
	public String mcdelivarylabelmethod() { 
		return this.getText(mcdelivaryfilterlabel);
	}
	public String showmorefiltermethod() { 
		this.click(showmorelabel);
		return this.getText(mcdelivaryfilterlabel);
	}
	public String mcdresultheadingfiltermethod() {  
		return this.getText(mcdresultheadingfilter);
	}
	public String cancelbuttonmethod3() throws Exception { 
		this.click(cancelbutton);
		this.waitForElementToBeVisible1(applyforjoblabellink);
		return this.getText(applyforjoblabellink);
	}
	public String applyforjoblinkclickmethod() throws Exception { 
		this.click(applyforjoblabellink);
		this.waitForElementToBeVisible1(leavingmcdwebsitelabe);
		return this.getText(leavingmcdwebsitelabe);
	}
	public String applyforjoblabellinkmethod() {  
		return this.getText(applyforjoblabellink);
	}
	public String mcdolandscareerslabelmethod() {  
		return this.getText(mcdolandscareerslabel);
	}
	public String ubereatordernowmethods() throws Exception { 
		this.click(ordernowlabel);
		this.click(ubereatsradiobutton);
		this.waitForElementToBeVisible1(continuebutton1);
		this.click(continuebutton1);
		//this.waitForElementToBeVisible1();
		this.windowhandles();
		return this.getAttributeimg(ubereatimg);
	}
	public String cancelbuttonmethod2() throws Exception { 
		this.click(cancelbutton);
		this.waitForElementToBeVisible1(ordernowlabel);
		return this.getText(ordernowlabel);
	}
	public String ordernowlinkclickmethod() throws Exception { 
		this.click(ordernowlabel);
		this.waitForElementToBeVisible1(leavingmcdwebsitelabel);
		return this.getText(leavingmcdwebsitelabel);
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
	public String indoordiningonhideservicelabelmethod() {
		return this.getText(indoordiningonhideservicelabel);
	}
	public String imageofindoordiningmethod() {
		return this.getimgs(imageofindoordining);  
	}
	public String wifionhideserviceslabelmethod() {
		return this.getText(wifionhideserviceslabel);
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
	public String ubereatmethods() throws Exception { 
		this.click(ordermcdeliverylabel2);
		this.click(ubereatsradiobutton);
		this.waitForElementToBeVisible1(continuebutton1);
		this.click(continuebutton1);
		//this.waitForElementToBeVisible1();
		this.windowhandles();
		 return this.getAttributeimg(ubereatimg);
		 //extent.flush();
		 //driver.close();
		 
	}
	public String doordashmethods() throws Exception { 
		//driver.close();
		windowhandles();
		Thread.sleep(4000);
		this.click(ordermcdeliverylabel2);
		this.click(doordashradiobutton);
		this.waitForElementToBeVisible1(continuebutton1);
		//driver.get("https://www.doordash.com/store/mcdonald-s-new-york-837231/en-US");
		this.click(continuebutton1);
		//this.waitForElementToBeVisible1();
		Thread.sleep(4000);
		//this.windowhandles();
		 //return this.getText(doordashimg);
		return this.getPageTitle();
	}
	public String grubhubmethods() throws Exception { 
		driver.close();
		windowhandles();
		this.click(ordermcdeliverylabel);
		this.click(grubhubradiobutton);
		this.waitForElementToBeVisible1(continuebutton1);
		this.click(continuebutton1);
		//this.waitForElementToBeVisible1();
		this.windowhandles();
		 return this.getAttributeimg(grubhubimg);
	}
	
	public String applyjoblinkmethods() throws Exception { 
		this.click(applyforjoblabellink);
		this.waitForElementToBeVisible1(continuebutton);
		this.click(continuebutton);
		//this.waitForElementToBeVisible1();
		this.windowhandles();
		return this.getPageTitle();
	}
	public String ordermcdeliveryclickmethod() throws Exception { 
		this.click(ordermcdeliverylabel);
		this.waitForElementToBeVisible1(leavingmcdwebsitelabel);
		return this.getText(leavingmcdwebsitelabel);
	}
	public String ordermcdeliveryclickmethod2() throws Exception { 
		this.click(ordermcdeliverylabel1);
		this.waitForElementToBeVisible1(leavingmcdwebsitelabel);
		return this.getText(leavingmcdwebsitelabel);
	}
	public String cancelbuttonmethod() throws Exception { 
		this.click(cancelbutton1);
		this.waitForElementToBeVisible1( ordermcdeliverylabel);
		return this.getText(ordermcdeliverylabel);
	}
	public String ordermcdeliverylabelmethod() {   
		return this.getText(ordermcdeliverylabel);
	}
	public String ordermcdeliverylabelmapmethod() {   
		return this.getAtrributeclass(ordermcdeliverymaplabel);
	}
	public String selectaddressonmapmethod() throws Exception {   
        this.click(clickonmapaddress);
        this.waitForElementToBeVisible1(addressnumber);
		return this.getText(addressnumber);
	}
	public String addressdisplayed() throws Exception {   
        this.click(searchbutton);
        this.click(searchbutton);
        this.waitForElementToBeVisible1(addressnumber);
		return this.getText(addressnumber);
	}
	public String closebuttonmethod() {  
        this.click(closebutton);
		return this.getAtrributeValue(zipcitystatelabel);
	}
	public String searchbuttonmethod1() throws Exception  { 
		this.waitForElementToBeVisible1(searchbutton);
		this.click(searchbutton);
		Thread.sleep(4000);
		this.click(searchbutton);
		this.waitForElementToBeVisible1(addressdisplay1);
		return this.getText(addressdisplay1);
	}
	public String searchbuttonmethod(String sendval) throws Exception { 
		Thread.sleep(4000);
		try {
		this.click(cookescancelbutton);
		}catch (Exception e) {
			
		}
		this.clearContent(zipcitystatelabel);
		this.sendKeys(this.zipcitystatelabel, sendval);
		this.waitForElementToBeVisible1(searchbutton);
		
		this.click(searchbutton);
		Thread.sleep(4000);
		this.click(searchbutton);
		Thread.sleep(4000);
		this.waitForElementToBeVisible1(addressdisplay1);
		return this.getText(addressdisplay1);
	}
	public String searchbuttonmethodD(String sendval) throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(4000);
		try {
			this.click(cookescancelbutton);
			}catch (Exception e) {
				
			}
		this.clearContent(zipcitystatelabel);
		this.sendKeys(this.zipcitystatelabel, sendval);
		this.waitForElementToBeVisible1(searchbutton);
		Thread.sleep(4000);
		this.click(searchbutton);
		Thread.sleep(4000);
		//this.click(searchbutton);
		this.waitForElementToBeVisible1(addressdisplay);
		return this.getText(addressdisplay);
	}
	public String zipsendedvalumethod(String sendval) { 
		this.clearContent(zipcitystatelabel);
		this.sendKeys(this.zipcitystatelabel, sendval);
		return this.getAtrributeValue(zipcitystatelabel);
	}
	public String showmorelabelmethod() {  
		return this.getText(showmorelabel);  
	}
	public String locatemelabelmethod() throws Exception {
		Thread.sleep(3500);
		try {
			this.click(cookescancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(locatemelabel);  
	}
	public String zipcitystatelabelmethod1() {
		return this.getText(zipcitystatelabel1);  
	}
	public String zipcitystatelabelmethod() {
		return this.getText(zipcitystatelabel);  
	}
	public String generallgetpagetitlemethod() {  
		return this.getPageTitle();
	}
	public String loadmorelabelmethod() throws InterruptedException {
		Thread.sleep(3500);
		try {
			this.click(cookescancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(loadmorelabel);
	}
	public String loadmoremethod() throws Exception {
		this.waitForElementToBeVisible1(loadmorelabel);
		this.click(loadmorelabel);
		return this.getText(restaurantaddress1);
	}
	
	//Header MC delivery
	public String ordermcdeliverylabelmethod2() {  
		try {
			this.click(cookescancelbutton);
			}catch (Exception e) {
				
			}
			return this.getText(ordermcdeliverylabel2);
		}
	public String ordermcdeliveryclickmethod3() throws Exception {
		this.click(ordermcdeliverylabel2);
		this.waitForElementToBeVisible1(leavingmcdwebsitelabel);
		return this.getText(leavingmcdwebsitelabel);
	}
	public String cancelbuttonmethod4() throws Exception {
		
			this.click(cancelbutton1);
			this.waitForElementToBeVisible1( ordermcdeliverylabel2);
			return this.getText(ordermcdeliverylabel2);
		
	}
	
	

}

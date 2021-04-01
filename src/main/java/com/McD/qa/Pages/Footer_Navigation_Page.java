package com.McD.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Footer_Navigation_Page extends Basepage {

	public Footer_Navigation_Page(WebDriver driver) {
		super(driver);
	}
	
	/*@FindBy(xpath="//*[@id='onetrust-close-btn-container']/button") 
	WebElement cancelbutton;*/
	@FindBy(xpath="//*[@id='footernav-1998202149']/div[1]/div[1]/h2/a") 
	WebElement aboutuslabel;
	@FindBy(xpath="//*[@id='footernav-links-0']/li[1]/a") 
	WebElement ourhistorylabel;
	@FindBy(xpath="//*[@id='footernav-links-0']/li[2]/a") 
	WebElement leadershiplabel;
	@FindBy(xpath="//*[@id='footernav-links-0']/li[3]/a") 
	WebElement valuesinactionlabel;
	@FindBy(xpath="//*[@id='footernav-links-0']/li[4]/a") 
	WebElement investorrelatioslabel;
	@FindBy(xpath="//*[@id='footernav-links-0']/li[5]/a") 
	WebElement newsandnotificationslabel;
	@FindBy(xpath="//*[@id='footernav-links-0']/li[6]/a") 
	WebElement franchiseinfolabel;
	@FindBy(xpath="//*[@id='footernav-links-0']/li[7]/a") 
	WebElement realestatelabel;
	@FindBy(xpath="//*[@id='footernav-links-0']/li[8]/a") 
	WebElement recallslabel;
	@FindBy(xpath="//*[@id='footernav-links-0']/li[9]/a") 
	WebElement digitalaccessibilitylabel;
	@FindBy(xpath="//*[@id='footernav-links-0']/li[10]/a") 
	WebElement standardslabel;
	
	
	@FindBy(xpath="//*[@id='mcd-legal-bumper-title-id']") 
	WebElement leavingmcdonaldsheading;
	@FindBy(xpath="//*[@id='leavingCancel']") 
	WebElement leavingcancelbutton;
	@FindBy(xpath="//*[@id='bumper-continue']") 
	WebElement leavingcontinuebutton;
	@FindBy(xpath="//*[@id='onetrust-close-btn-container']/button") 
	WebElement cancelbutton;
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
	
	
	@FindBy(xpath="//*[@id='footernav-1998202149']/div[1]/div[3]/h2/a") 
	WebElement serviceslabel;
	@FindBy(xpath="//*[@id='footernav-links-2']/li[1]/a") 
	WebElement wifilabel;
	@FindBy(xpath="//*[@id='footernav-links-2']/li[2]/a") 
	WebElement archcardlabel;
	@FindBy(xpath="//*[@id='footernav-links-2']/li[3]/a") 
	WebElement playplaceslabel;

	
	@FindBy(xpath="//*[@id='footernav-1998202149']/div[1]/div[5]/h2/a") 
	WebElement contactuslabel;
	@FindBy(xpath="//*[@id='footernav-links-4']/li[1]/a") 
	WebElement pagetocontactlabel;
	@FindBy(xpath="//*[@id='footernav-links-4']/li[2]/a") 
	WebElement akamilabel;
	@FindBy(xpath="//*[@id='footernav-links-4']/li[3]/a") 
	WebElement akami000label;
	@FindBy(xpath="//*[@id='footernav-links-4']/li[4]/a") 
	WebElement archcardlabel1;
	@FindBy(xpath="//*[@id='footernav-links-4']/li[5]/a") 
	WebElement donationslabel;
	@FindBy(xpath="//*[@id='footernav-links-4']/li[6]/a") 
	WebElement employmentlabel;
	@FindBy(xpath="//*[@id='footernav-links-4']/li[7]/a") 
	WebElement mobileapplabel;
	@FindBy(xpath="//*[@id='footernav-links-4']/li[8]/a") 
	WebElement mobileapp1label;
	@FindBy(xpath="//*[@id='footernav-links-4']/li[9]/a") 
	WebElement restaurantfeedbacklabel;
	@FindBy(xpath="//*[@id='footernav-links-4']/li[10]/a") 
	WebElement helpcenterlabel;
	@FindBy(xpath="//*[@id='footernav-links-4']/li[11]/a") 
	WebElement corerestaurantlabel;
	
	
	
	
	@FindBy(xpath="//*[@id='footernav-1998202149']/div[1]/div[4]/h2/a") 
	WebElement communitylabel;
	@FindBy(xpath="//*[@id='footernav-links-3']/li[1]/a") 
	WebElement rmhclabel;
	@FindBy(xpath="//*[@id='footernav-links-3']/li[2]/a") 
	WebElement blackandpositivelygoldenlabel;
	@FindBy(xpath="//*[@id='footernav-links-3']/li[3]/a") 
	WebElement mcdonaldsapalabel;
	@FindBy(xpath="//*[@id='footernav-links-3']/li[4]/a") 
	WebElement mcdonaldsapalabel1;
	@FindBy(xpath="//*[@id='footernav-links-3']/li[5]/a") 
	WebElement mcdonaldsinternatinallabel;
	@FindBy(xpath="//*[@id='footernav-links-3']/li[6]/a") 
	WebElement blackandpositivelygoldenlabel1;
	
	
	
	
	public String generallgetpagetitlemethod() {
		return this.getPageTitle();
	}

	public String aboutuslabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(aboutuslabel);
		return this.getText(aboutuslabel);
	}

	public String aboutusclickmethod1() {
		this.click(aboutuslabel);
		return this.getPageTitle();
	}

	public String ourhistorylabelmethod() throws Exception {
		driver.navigate().back();
		waitForElementToBeVisible1(ourhistorylabel);
		return this.getText(ourhistorylabel);
	}

	public String ourhistoryclickmethod() {
		this.click(ourhistorylabel);
		return this.getPageTitle();
	}

	public String leadershipteamlabelmethod() throws Exception {
		driver.navigate().back();
		waitForElementToBeVisible1(leadershiplabel);
		return this.getText(leadershiplabel);
	}

	public String leadershipteamclickmethod() {
		this.click(leadershiplabel);
		return this.getPageTitle();
	}

	public String valuesinactionlabelmethod() throws Exception {
		driver.navigate().back();
		waitForElementToBeVisible1(valuesinactionlabel);
		return this.getText(valuesinactionlabel);
	}

	public String valuesinactionclickmethod() {
		this.click(valuesinactionlabel);
		return this.getPageTitle();
	}

	public String investorrelationslabelmethod() throws Exception {
		driver.navigate().back();
		waitForElementToBeVisible1(investorrelatioslabel);
		return this.getText(investorrelatioslabel);
	}

	public String investorrelationsclickmethod() {
		this.click(investorrelatioslabel);
		return this.getPageTitle();
	}
	
	public String newsandnotificationslabelmethod() throws Exception {
		driver.navigate().back();
		waitForElementToBeVisible1(newsandnotificationslabel);
		return this.getText(newsandnotificationslabel);
	}

	public String newsandnotificationsclickmethod() {
		this.click(newsandnotificationslabel);
		return this.getPageTitle();
	}

	public String franchiseinfolabelmethod() throws Exception {
		driver.navigate().back();
		waitForElementToBeVisible1(franchiseinfolabel);
		return this.getText(franchiseinfolabel);
	}

	public String franchiseinfoclickmethod() {
		this.click(franchiseinfolabel);
		return this.getPageTitle();
	}

	public String realestatelabelmethod() throws Exception {
		driver.navigate().back();
		waitForElementToBeVisible1(realestatelabel);
		return this.getText(realestatelabel);
	}

	public String realestateclickmethod() {
		this.click(realestatelabel);
		return this.getPageTitle();
	}

	public String recallsalertlabelmethod() throws Exception {
		driver.navigate().back();
		waitForElementToBeVisible1(recallslabel);
		return this.getText(recallslabel);
	}

	public String recallsalertclickmethod() {
		this.click(recallslabel);
		return this.getPageTitle();
	}

	public String digitalaccessibilitylabelmethod() throws Exception {
		driver.navigate().back();
		waitForElementToBeVisible1(digitalaccessibilitylabel);
		return this.getText(digitalaccessibilitylabel);
	}

	public String digitalaccessibilityclickmethod() {
		this.click(digitalaccessibilitylabel);
		return this.getPageTitle();
	}

	public String standardsofbussinesslabelmethod() throws Exception {
		driver.navigate().back();
		waitForElementToBeVisible1(standardslabel);
		return this.getText(standardslabel);
	}

	public String standardsofbussinessclickmethod() {
		this.click(standardslabel);
		return this.getPageTitle();
	}

	public String footerapplynowclickmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
		this.click(cancelbutton);
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
		Thread.sleep(3400);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(Footerapplynowlabel);
	}	
	public String footerworkingwithusclickmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
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
		Thread.sleep(3400);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(Footerworkingwithuslabel);
	}
	public String footerforourveteransclickmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
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
		Thread.sleep(3400);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(Footerforourveteranslabel);
	}
	public String footermeetourpeopleclickmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
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
		Thread.sleep(3400);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(Footermeetourpeoplelabel);
	}
	public String footeremployeeclickmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
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
		Thread.sleep(3400);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(Footeremployeelabel);
	}
	
	public String footereducationclickmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
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
		Thread.sleep(3400);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(footereducationlabel);
	}
	public String footercareersclickmethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
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
		Thread.sleep(3400);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(footercareerslabel);
	}
	public String leavingcancelbuttonmethod() { 
		this.click(leavingcancelbutton);
		return this.getText(leavingmcdonaldsheading);
	}

	public String serviceslabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(serviceslabel);
		return this.getText(serviceslabel);
	}

	public String servicesclickmethod1() {
		this.click(serviceslabel);
		return this.getPageTitle();
	}

	public String wifilabelmethod() throws Exception {
		driver.navigate().back();
		waitForElementToBeVisible1(wifilabel);
		return this.getText(wifilabel);
	}

	public String wificlickmethod() {
		this.click(wifilabel);
		return this.getPageTitle();
	}

	public String archcardlabelmethod() throws Exception {
		driver.navigate().back();
		waitForElementToBeVisible1(archcardlabel);
		return this.getText(archcardlabel);
	}

	public String archcardclickmethod() {
		this.click(archcardlabel);
		return this.getPageTitle();
	}

	public String playplaceslabelmethod() throws Exception {
		driver.navigate().back();
		waitForElementToBeVisible1(playplaceslabel);
		return this.getText(playplaceslabel);
	}

	public String playplacesclickmethod() {
		this.click(playplaceslabel);
		return this.getPageTitle();
	}

	public String communitylabelmethod() throws Exception {
		
		waitForElementToBeVisible1(communitylabel);
		return this.getText(communitylabel);
	}

	public String communityclickmethod1() {
		this.click(communitylabel);
		return this.getPageTitle();
	}

	public String rmhclabelmethod() throws Exception {
		driver.navigate().back();
		waitForElementToBeVisible1(rmhclabel);
		return this.getText(rmhclabel);
	}

	public String rmhcclickmethod1() {
		this.click(rmhclabel);
		return this.getPageTitle();
	}

	public String blackandpositivelygoldenlabelmethod() throws Exception {
		driver.navigate().back();
		waitForElementToBeVisible1(blackandpositivelygoldenlabel);
		return this.getText(blackandpositivelygoldenlabel);
	}

	public String blackandpositivelygoldenclickmethod1() {
		this.click(blackandpositivelygoldenlabel);
		return this.getPageTitle();
	}

	public String mcdonaldsapalabelmethod() throws Exception {
		driver.navigate().back();
		waitForElementToBeVisible1(mcdonaldsapalabel);
		return this.getText(mcdonaldsapalabel);
	}

	public String mcdonaldsapaclickmethod1() {
		this.click(mcdonaldsapalabel);
		return this.getPageTitle();
	}

	public String mcdonaldsapalabelmethod1() throws Exception {
		driver.navigate().back();
		waitForElementToBeVisible1(mcdonaldsapalabel1);
		return this.getText(mcdonaldsapalabel1);
	}

	public String mcdonaldsapaclickmethod2() {
		this.click(mcdonaldsapalabel1);
		return this.getPageTitle();
	}

	public String mcDonaldsinternationallabelmethod() throws Exception {
		driver.navigate().back();
		waitForElementToBeVisible1(mcdonaldsinternatinallabel);
		return this.getText(mcdonaldsinternatinallabel);
	}

	public String mcDonaldsinternationalclickmethod1() {
		this.click(mcdonaldsinternatinallabel);
		return this.getPageTitle();
	}

	public String blackandpositivelygoldenlabelmethod1() throws Exception {
		driver.navigate().back();
		waitForElementToBeVisible1(blackandpositivelygoldenlabel1);
		return this.getText(blackandpositivelygoldenlabel1);
	}

	public String blackandpositivelygoldenclickmethod2() {
		this.click(blackandpositivelygoldenlabel1);
		return this.getPageTitle();
	}

	public String contactuslabelmethod() throws Exception {
		driver.navigate().refresh();;
		waitForElementToBeVisible1(contactuslabel);
		return this.getText(contactuslabel);
	}

	public String contactusclickmethod1() {
		this.click(contactuslabel);
		return this.getPageTitle();
	}

	public String pagetocontactlabelmethod() throws Exception {
		driver.navigate().back();
		waitForElementToBeVisible1(pagetocontactlabel);
		return this.getText(pagetocontactlabel);
	}

	public String pagetocontactclickmethod() {
		this.click(pagetocontactlabel);
		return this.getPageTitle();
	}

	public String akamilabelmethod() throws Exception {
		driver.navigate().back();
		waitForElementToBeVisible1(akamilabel);
		return this.getText(akamilabel);
	}

	public String akamiclickmethod() {
		this.click(akamilabel);
		return this.getPageTitle();
	}

	public String akami000labelmethod() throws Exception {
		driver.navigate().back();
		waitForElementToBeVisible1(akami000label);
		return this.getText(akami000label);
	}

	public String akami000clickmethod() {
		this.click(akami000label);
		return this.getPageTitle();
	}

	public String archcardlabelmethod1() throws Exception {
		driver.navigate().back();
		waitForElementToBeVisible1(archcardlabel1);
		return this.getText(archcardlabel1);
	}

	public String archcardclickmethod1() {
		this.click(archcardlabel1);
		return this.getPageTitle();
	}

	public String donationslabelmethod() throws Exception {
		driver.navigate().back();
		waitForElementToBeVisible1(donationslabel);
		return this.getText(donationslabel);
	}

	public String donationsclickmethod() {
		this.click(donationslabel);
		return this.getPageTitle();
	}

	public String employmentlabelmethod() throws Exception {
		driver.navigate().back();
		waitForElementToBeVisible1(employmentlabel);
		return this.getText(employmentlabel);
	}

	public String employmentclickmethod() {
		this.click(employmentlabel);
		return this.getPageTitle();
	}

	public String mobileapplabelmethod() throws Exception {
		driver.navigate().back();
		waitForElementToBeVisible1(mobileapplabel);
		return this.getText(mobileapplabel);
	}

	public String mobileappclickmethod() {
		this.click(mobileapplabel);
		return this.getPageTitle();
	}

	public String mobileapp1labelmethod() throws Exception {
		driver.navigate().back();
		waitForElementToBeVisible1(mobileapp1label);
		return this.getText(mobileapp1label);
	}

	public String mobileapp1clickmethod() {
		this.click(mobileapp1label);
		return this.getPageTitle();
	}

	public String restaurantfeedbacklabelmethod() throws Exception {
		driver.navigate().back();
		waitForElementToBeVisible1(restaurantfeedbacklabel);
		return this.getText(restaurantfeedbacklabel);
	}

	public String restaurantfeedbackclickmethod() {
		this.click(restaurantfeedbacklabel);
		return this.getPageTitle();
	}

	public String helpcenterlabelmethod() throws Exception {
		driver.navigate().back();
		waitForElementToBeVisible1(helpcenterlabel);
		return this.getText(helpcenterlabel);
	}

	public String helpcenterclickmethod() {
		this.click(helpcenterlabel);
		return this.getPageTitle();
	}

	public String corerestaurantlabelmethod() throws Exception {
		driver.navigate().back();
		waitForElementToBeVisible1(corerestaurantlabel);
		return this.getText(corerestaurantlabel);
	}

	public String corerestaurantclickmethod() {
		this.click(corerestaurantlabel);
		return this.getPageTitle();
	}

	

}

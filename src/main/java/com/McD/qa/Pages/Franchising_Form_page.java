package com.McD.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Franchising_Form_page extends Basepage{
	public  Franchising_Form_page(WebDriver driver) { 
		super(driver);
	}
	@FindBy(xpath="//*[@id='franchise_reset_focus']") 
	WebElement franchisseresetfocuslabel;
	@FindBy(xpath="//*[@id='maincontent']/div[1]/div[2]/div/section/div[1]/div/div/div/div/div/div/p[3]") 
	WebElement lookingstartlabel;
	@FindBy(xpath="//*[@id='franchise-form-box']/div[1]/div/p[1]") 
	WebElement indicatearequiredfieldlabel;
	@FindBy(xpath="//*[@id='personalinfoFrancHeading']") 
	WebElement tellusaboutyourselflabel;
	@FindBy(xpath="//*[@id='first_name_label']") //FIRST NAME LABEL PATH 
	WebElement firstnamelabel;
	@FindBy(xpath="//*[@id='first_name']") //first name
	WebElement firstnameclick;
	@FindBy(xpath="//*[@id='first-name-error']")
    WebElement finamerror;
	@FindBy(xpath="//*[@id='f_btn_submit']")
    WebElement fsubmitclick;
	@FindBy(xpath="//*[@id='last_name_label']") //last name
	WebElement lastnamelabel;
	@FindBy(xpath="//*[@id='last_name']")
	WebElement lastnameclick;
	@FindBy(xpath="//*[@id='last-name-error']")
	WebElement lastnameerrormess;
	@FindBy(xpath="//*[@id='phone_label']")  //phone number label path  
	WebElement phonenumberlabel;
	@FindBy(xpath="//*[@id='phone']") 
	WebElement phonenumberclick;
	@FindBy(xpath="//*[@id='phone-error']") 
	WebElement phonenumbererrormessage;
	@FindBy(xpath="//*[@id='email_label']")   //email label path   
	WebElement emaillabel;
	@FindBy(xpath="//*[@id='email']")  
	WebElement emailclick;
	@FindBy(xpath="//*[@id='email-error']")  
	WebElement emailerrormessage;
	@FindBy(xpath="//*[@id='address-label']") //address label path  
	WebElement addresslabel;
	@FindBy(xpath="//*[@id='address']")
	WebElement addressclick;
	@FindBy(xpath="//*[@id='address-error']")
	WebElement addresserrormessage;
	@FindBy(xpath="//*[@id='city-label']")  //city label path  
	WebElement citylabel;
	@FindBy(xpath="//*[@id='city']")   
	WebElement cityclick;
	@FindBy(xpath="//*[@id='city-error']")   
	WebElement cityerromessage;
	@FindBy(xpath="//*[@id='f-state-label']") //state label path  
	WebElement statelabel;
	@FindBy(xpath="//*[@id='f-state']")
	WebElement stateclick;
	@FindBy(xpath="//*[@id='f-state-error']")  
	WebElement stateerrormessage;
	@FindBy(xpath="//*[@id='AL_1']")
	WebElement statedropdownvalue;
	@FindBy(xpath="//*[@id='f_zip-label']")  //zip label path 
	WebElement ziplabel;
	@FindBy(xpath="//*[@id='f_zip']")  
	WebElement zipclick;
	@FindBy(xpath="//*[@id='zip-error']")  
	WebElement ziperrormessage;
	@FindBy(xpath="//*[@id='personalinfoFranLegHeading']")    //legal information label 
	WebElement legalinformationlabel;
	@FindBy(xpath="//*[@id='enter_comments_franchise_label']")    //have you been ever been  label 
	WebElement haveyoubeeneverlabel;
	@FindBy(xpath="//*[@id='enter_comments_franchise']")    //have you been ever been  CLICK 
	WebElement haveyoubeeneverclick;
	@FindBy(xpath="//*[@id='enter-comments-franchise-error']")    //have you been ever been  error message 
	WebElement haveyoubeenevererrormessage;
	@FindBy(xpath="//*[@id='enter_bank_comment_label']")    //*Have you or your spouse ever declared  LABEL
	WebElement haveyouoryourspouselabel;
	@FindBy(xpath="//*[@id='enter_bank_comment']")    //*Have you or your spouse ever declared  CLICK
	WebElement haveyouoryourspouseclick;
	@FindBy(xpath="//*[@id='enter-bank-error']")    //*Have you or your spouse ever declared  error message
	WebElement haveyouoryourspouseerrormessage;
	@FindBy(xpath="//*[@id='franchiseUSCitizenlbl']")    //are you a us citizen label
	WebElement areyouauscitizenlabel;
	@FindBy(xpath="//*[@id='ctspYes']/preceding-sibling::input") // yes radio button path   
	WebElement yesradiobutton;
	@FindBy(xpath="//*[@id='franchise-resident-label-yes']")        // YES labe  PATH
	WebElement yesradiobuttonlabel;
	@FindBy(xpath="//*[@id='franchise-resident-label-no']")        // no labe  PATH
	WebElement noradiobuttonlabel;
	@FindBy(xpath="//*[@id='ctspNo']/preceding-sibling::input") // no radio button path   
	WebElement noradiobutton;
	@FindBy(xpath="//*[@id='ctspYes']") // yes radio button click path   
	WebElement yesradiobuttonclick;
	@FindBy(xpath="//*[@id='ctspNo']") // NO radio button click path   
	WebElement noradiobuttonclick;
	@FindBy(xpath="//*[@id='textyes_no']") // NO radio button click path   
	WebElement errormessageareyouaus;
	@FindBy(xpath="//*[@id='franchiseLanguageAnslbl']") //  are you flouent another langaue path   
	WebElement areyouflouentinanotherlanglabel;
	@FindBy(xpath="//*[@id='franchise-language-label-yes']") // yes label are you flouent another langaue path   
	WebElement yesradiobuttonlanguagelabel;
	@FindBy(xpath="//*[@id='franchise-language-label-no']") // No label are you flouent another langaue path   
	WebElement noradiobuttonlanguagelabel;
	@FindBy(xpath="//*[@id='franchise-language-label-yes']/preceding-sibling::input") // yes button default path   
	WebElement yesradiodefaultbutton;
	@FindBy(xpath="//*[@id='franchise-language-label-no']/preceding-sibling::input") // No button default path   
	WebElement noradiodefaultbutton;
	@FindBy(xpath="//*[@id='f_languageYes']") // yes button click path   
	WebElement YESradiodefaultbuttonclick;
	@FindBy(xpath="//*[@id='franchise-owner-language-label']") // if yes which language LABEL path   
	WebElement ifyeslanguagelabel;
	@FindBy(xpath="//*[@id='franchise-owner-language-field']") // if yes which language CLICK path   
	WebElement ifyeslanguageclick;
	@FindBy(xpath="//*[@id='f_languageNo']") // No button click path   
	WebElement noradiodefaultbuttonclick;
	@FindBy(xpath="//*[@id='language-error-id']") // error message are you fluent in another language path   
	WebElement errormessageareyoufluentanotherlanguage;
	@FindBy(xpath="//*[@id='demographicHeading']") //Demographic Information path   
	WebElement demographicinformation;
	@FindBy(xpath="//*[@id='gender-label']") //Gender label path   
	WebElement genderlabel;
	@FindBy(xpath="//*[@id='gender']") //Gender click path   
	WebElement genderclick;
	@FindBy(xpath="//*[@id='franchise-dem-genderd-1']") //DROP DOWN GENDER click path   
	WebElement genderdropdown;
	@FindBy(xpath="//*[@id='race-ethnicity-label']") //Race/Ethnicity label path   
	WebElement racelabel;
	@FindBy(xpath="//*[@id='race-ethnicity']") //Race/Ethnicity click path   
	WebElement raceclick;
	@FindBy(xpath="//*[@id='franchise-ethinic-rase-0']") //DROP DOWN RACE/Ethnicity click path   
	WebElement racedropdown;
	@FindBy(xpath="//*[@id='personalinfoFranEdu']") //Education and occupation path   
	WebElement edducationoccupation;
	@FindBy(xpath="//*[@id='school-name-label']") //last year of schooling label path   
	WebElement lastyearofschoolinglabel;
	@FindBy(xpath="//*[@id='school-name']") //last year of schooling click path   
	WebElement lastyearofschoolingclick;
	@FindBy(xpath="//*[@id='franchise-edu-schooldd-2']") //DROP DOWN LAST YEAR... click path   
	WebElement lastyearofschoolingdropdown;
	@FindBy(xpath="//*[@id='school-college-name_label']") //NAME OF COLLEGE AND/OR.. LANBEL path   
	WebElement nameofcollegeandlabel;
	@FindBy(xpath="//*[@id='school-college-name']") //NAME OF COLLEGE AND/OR.. click path   
	WebElement nameofcollegeandclick;
	@FindBy(xpath="//*[@id='school-name-error']") // last year of schooling error message path   
	WebElement errormessagelastyear;
	@FindBy(xpath="//*[@id='degree-label']") // Degree label path   
	WebElement degreelabel;
	@FindBy(xpath="//*[@id='degree']") // Degree click path   
	WebElement degreeclcik;
	@FindBy(xpath="//*[@id='occupational-label']") // occupation label path   
	WebElement occupationallabel;
	@FindBy(xpath="//*[@id='occupational']") // occupation click path   
	WebElement occupationalclick;
	@FindBy(xpath="//*[@id='occupational-error']") // occupation ERROR MESSAGE path   
	WebElement errormessageoccupational;
	@FindBy(xpath="//*[@id='position-label']") // position label path   
	WebElement positionheldlabel;
	@FindBy(xpath="//*[@id='position']") // position click path   
	WebElement positionheldclick;
	@FindBy(xpath="//*[@id='position-error']") // position HELD ERROR MESSAGE path   
	WebElement positionhelderrormessage;
	@FindBy(xpath="//*[@id='company-label']") // company name path   
	WebElement companynamelabel;
	@FindBy(xpath="//*[@id='company']") // company name clcik path   
	WebElement companynameclick;
	@FindBy(xpath="//*[@id='company-error']") // company name ERROR MESSAGE path   
	WebElement companynameerrormessage;
	@FindBy(xpath="//*[@id='describe-duties-label']") // describe duties number of employees path   
	WebElement describedutiesnumberoflabel;
	@FindBy(xpath="//*[@id='describe-duties']") // describe duties number of employees path   
	WebElement describedutiesnumberofclick;
	@FindBy(xpath="//*[@id='describe-duties-error']") // describe duties number of employees error message path   
	WebElement describedutiesnumberoferrormessage;
	@FindBy(xpath="//*[@id='personalinfoFranBusInfo']") // business or franchise label path   
	WebElement businessorfranchiselabel;
	@FindBy(xpath="//*[@id='own-business-franchise-label']") // have you ever owned your own label path   
	WebElement haveyoueverownedyourownlabel;
	@FindBy(xpath="//*[@id='own-business-franchise']") // have you ever owned your own click path   
	WebElement haveyoueverownedyourownclick;
	@FindBy(xpath="//*[@id='own-business-franchise-error']") // have you ever owned your own click path   
	WebElement haveyoueverownedyourownerrormessage;
	@FindBy(xpath="//*[@id='business-failure-label']") // *Have you ever had a business failure? (0/512 characters) label path   
	WebElement haveyoueverhadbusinesslabel;
	@FindBy(xpath="//*[@id='business-failure']") // *Have you ever had a business failure? (0/512 characters) click path   
	WebElement haveyoueverhadbusinessclick;
	@FindBy(xpath="//*[@id='business-failure-error']") // *Have you ever had a business failure? (0/512 characters) error message path   
	WebElement haveyoueverhadbusinesserrormessage;
	@FindBy(xpath="//*[@name='tot_asst']/../label")    //total assets label path
	WebElement totalassetslabel;
	@FindBy(xpath="//*[@id='total-assets']")    //total assets click path
	WebElement totalassetsclick;
	@FindBy(xpath="//*[@id='total-assets-error']")    //total assets click path
	WebElement totalassetserrormessage;
	@FindBy(xpath="//*[@name='tot_liby']/../label")    //total debt label path
	WebElement totaldebtlabel;
	@FindBy(xpath="//*[@id='total-debt']")    //total debt click path
	WebElement totaldebtclick;
	@FindBy(xpath="//*[@id='total-debt-error']")    //total debt error message path
	WebElement totaldebterrormessage;
	@FindBy(xpath="//*[@id='total-net-worth-label']")    //net worth  path
	WebElement networthlabel;
	@FindBy(xpath="//*[@id='net-worth']")    //net worth value path
	WebElement networthvalue;
	@FindBy(xpath="//*[@id='net-worth-error']")    //net worth ERROR MESSAGE path
	WebElement networtherrormessage;
	@FindBy(xpath="//*[@id='total-non-borrowed-label']")    //total non borrowed label path
	WebElement totalnonborrowedlabel;
	@FindBy(xpath="//*[@id='total-non-borrowed']")    //total non borrowed click path
	WebElement totalnonborrowedclick;
	@FindBy(xpath="//*[@id='franchise-business-funds-1']")    //total non borrowed drop down value click path
	WebElement totalnonborroweddropdownclick;
	@FindBy(xpath="//*[@id='total-non-borrowed-error']")    //total non borrowed drop down value error message path
	WebElement totalnonborrowederrormessage;
	@FindBy(xpath="//*[@id='relationWithMcdOfficerlbl']/span")    //Are you related by blood or marriage to any officer of McDonald's USA, LLC label path
	WebElement relationwithmcdofficerlbllabel;
	@FindBy(xpath="//*[@id='franchise-related-mcd-officer-label-yes']")    //yes Are you related by blood or marriage to any officer of McDonald's USA, LLC label path
	WebElement yesrelationwithmcdofficerlbllabel;
	@FindBy(xpath="//*[@id='franchise-related-mcd-officer-label-no']")    //no of Are you related by blood or marriage to any officer of McDonald's USA, LLC label path
	WebElement norelationwithmcdofficerlbllabel;
	@FindBy(xpath="//*[@id='f_llc_yes']/preceding-sibling::input")    //yes radio button of Are you related by blood or marriage to any officer of McDonald's USA, LLC label path
	WebElement yesrelationwithmcdofficerlblradiobutton;
	@FindBy(xpath="//*[@id='f_llc_no']/preceding-sibling::input")    //no radio button of Are you related by blood or marriage to any officer of McDonald's USA, LLC label path
	WebElement norelationwithmcdofficerlblradiobutton;
	@FindBy(xpath="//*[@id='f_llc_yes']")    //YES radio button CLICK of Are you related by blood or marriage to any officer of McDonald's USA, LLC label path
	WebElement yesrelationwithmcdofficerlblradiobuttonclcik;
	@FindBy(xpath="//*[@id='f_llc_no']")    //no radio button CLICK of Are you related by blood or marriage to any officer of McDonald's USA, LLC label path
	WebElement norelationwithmcdofficerlblradiobuttonclcik;
	@FindBy(xpath="//*[@id='llc']")         // error message of are you related by blood or marriage to any officer of mcdonald's usa
	WebElement relationwithmcdofficerlblerromessage;
	@FindBy(xpath="//*[@id='relation-first-name-label']")         // Relation first name of are you related by blood or marriage to any officer of mcdonald's usa
	WebElement relationfirstnamemarriageofficerlabel;
	@FindBy(xpath="//*[@id='relation-first-name']")         // Relation first name of are you related by blood or marriage to any officer of mcdonald's usa
	WebElement relationfirstnamemarriageofficerclick;
	@FindBy(xpath="//*[@id='llc-relation-last-name-label']")         // Relation last name of are you related by blood or marriage to any officer of mcdonald's usa
	WebElement relationlastnamemarriageofficerlabel;
	@FindBy(xpath="//*[@id='llc-relation-last-name']")         // Relation last name of are you related by blood or marriage to any officer of mcdonald's usa
	WebElement relationlastnamemarriageofficerclick;
	@FindBy(xpath="//*[@id='relation-label']")         // Relationship label of are you related by blood or marriage to any officer of mcdonald's usa
	WebElement relationshipmarriageofficerlabel;
	@FindBy(xpath="//*[@id='relation']")         // Relationship label of are you related by blood or marriage to any officer of mcdonald's usa
	WebElement relationshipmarriageofficerclick;
	@FindBy(xpath="//*[@id='franchise-related-mcd-owner-option']/span")   //  are you related by blood or marriage to any owner of mcdonald's 
	WebElement franchiserelatedmarriageowner;
	@FindBy(xpath="//*[@id='franchise-related-mcd-owner-label-yes']")   //  yes label of are you related by blood or marriage to any owner of mcdonald's 
	WebElement yesfranchiserelatedmarriageowner;
	@FindBy(xpath="//*[@id='franchise-related-mcd-owner-label-no']")   //  no label of are you related by blood or marriage to any owner of mcdonald's 
	WebElement nofranchiserelatedmarriageowner;
	@FindBy(xpath="//*[@id='franchisees_Yes']/preceding-sibling::input")   //  yes radio button of are you related by blood or marriage to any owner of mcdonald's 
	WebElement yesfranchiserelatedmarriageownerradiobutton;
	@FindBy(xpath="//*[@id='franchisees_No']/preceding-sibling::input")   //  yes radio button of are you related by blood or marriage to any owner of mcdonald's 
	WebElement nofranchiserelatedmarriageownerradiobutton;
	@FindBy(xpath="//*[@id='franchisees_Yes']")   //  yes radio button click of are you related by blood or marriage to any owner of mcdonald's 
	WebElement YESfranchiserelatedmarriageownerradiobuttonclick;
	@FindBy(xpath="//*[@id='franchisees_No']")   //  no radio button click of are you related by blood or marriage to any owner of mcdonald's 
	WebElement nofranchiserelatedmarriageownerradiobuttonclick;
	@FindBy(xpath="//*[@id='llc_Owner']")   //  ERROR MESSAGE are you related by blood or marriage to any owner of mcdonald's 
	WebElement franchiserelatedmarriageownererrormessage;
	@FindBy(xpath="//*[@id='relation-owner-first-name-label']")   //  relation first name are you related by blood or marriage to any owner of mcdonald's 
	WebElement firstnamefranchiserelatedmarriageowner;
	@FindBy(xpath="//*[@id='relation-owner-first-name']")   //  relation first name click are you related by blood or marriage to any owner of mcdonald's 
	WebElement firstnamefranchiserelatedmarriageownerclick;
	@FindBy(xpath="//*[@id='relation-last-name-label']")   //  relation last name label are you related by blood or marriage to any owner of mcdonald's 
	WebElement lastnamefranchiserelatedmarriageowner;
	@FindBy(xpath="//*[@id='relation-last-name']")   //  relation last name click are you related by blood or marriage to any owner of mcdonald's 
	WebElement lastnamefranchiserelatedmarriageownerclick;
	@FindBy(xpath="//*[@id='owner-relation-label']")   //  relationship label are you related by blood or marriage to any owner of mcdonald's 
	WebElement relationshipfranchiserelatedmarriageowner;
	@FindBy(xpath="//*[@id='owner-relation']")   //  relationship click are you related by blood or marriage to any owner of mcdonald's 
	WebElement relationshipfranchiserelatedmarriageownerclick;
	@FindBy(xpath="//*[@id='franchise-employer-option']")   //  Are you or your employer providing products, goods or services to McDonald's or franchisees of McDonald's? 
	WebElement areprovidingproductsladbel;
	@FindBy(xpath="//*[@id='franchise-employer-label-yes']")   // yes of Are you or your employer providing products, goods or services to McDonald's or franchisees of McDonald's? 
	WebElement yesareprovidingproductsladbel;
	@FindBy(xpath="//*[@id='franchise-employer-label-no']")   // no of Are you or your employer providing products, goods or services to McDonald's or franchisees of McDonald's? 
	WebElement noareprovidingproductsladbel;
	@FindBy(xpath="//*[@id='franchise-employer-label-yes']/preceding-sibling::input")   // yes radio button of Are you or your employer providing products, goods or services to McDonald's or franchisees of McDonald's? 
	WebElement yesareprovidingproductsradiobutton;
	@FindBy(xpath="//*[@id='franchise-employer-label-no']/preceding-sibling::input")   // no radio button of Are you or your employer providing products, goods or services to McDonald's or franchisees of McDonald's? 
	WebElement noareprovidingproductsradiobutton;
	@FindBy(xpath="//*[@id='f_serviceYes']")   // yes radio button clik of Are you or your employer providing products, goods or services to McDonald's or franchisees of McDonald's? 
	WebElement yesareprovidingproductsradiobuttonclick;
	@FindBy(xpath="//*[@id='f_serviceNo']")   // no radio button click of Are you or your employer providing products, goods or services to McDonald's or franchisees of McDonald's? 
	WebElement noareprovidingproductsradiobuttonclick;
	@FindBy(xpath="//*[@id='are-you-emp']")   // ERROR MESSAGE Are you or your employer providing products, goods or services to McDonald's or franchisees of McDonald's? 
	WebElement areprovidingproductsradiobuttonerrormessage;
	@FindBy(xpath="//*[@id='franchise-devote-option']")   // how much time will you devote to this business?
	WebElement howmuchtimewillyoudevotetothis;
	@FindBy(xpath="//*[@id='franchise-devote-label-fulltime']")   // full time path 
	WebElement fulltimelabel;
	@FindBy(xpath="//*[@id='franchise-devote-label-parttime']")   // part time label path
	WebElement parttimelabel;
	@FindBy(xpath="//*[@id='franchise-devote-label-passive']")   // passive investor label path
	WebElement passiveinvestorlabel;
	@FindBy(xpath="//*[@id='f_fulltimeradio']/preceding-sibling::input")   // full time radio button 
	WebElement fulltimeradiobutton;
	@FindBy(xpath="//*[@id='f_parttimeradio']/preceding-sibling::input")   // part time radio button 
	WebElement parttimeradiobutton;
	@FindBy(xpath="//*[@id='f_passivetimeradio']/preceding-sibling::input")   // passive investor radio button 
	WebElement passiveinvestorradiobutton;
	@FindBy(xpath="//*[@id='f_fulltimeradio']")   // full time radio button  click
	WebElement fulltimeradiobuttonclick;
	@FindBy(xpath="//*[@id='f_parttimeradio']")   // part time radio button click
	WebElement parttimeradiobuttonclick;
	@FindBy(xpath="//*[@id='f_passivetimeradio']")   //passive investor radio button click
	WebElement passiveinvestorradiobuttonclick;
	@FindBy(xpath="//*[@id='how-much-time']")   //how much time will you error message 
	WebElement howmutchtimewillyouerrormessage;
	@FindBy(xpath="//*[@id='franchise-restaurant-relocate-option']")   //*Would you be willing to relocate for a restaurant opportunity?
	WebElement wouldyoubewillingtoralocatelabel;
	@FindBy(xpath="//*[@id='franchise-restaurant-relocate-label-yes']")   //yes of *Would you be willing to relocate for a restaurant opportunity?
	WebElement yeswouldyoubewillingtoralocatelabel;
	@FindBy(xpath="//*[@id='franchise-restaurant-relocate-label-no']")   //yes of *Would you be willing to relocate for a restaurant opportunity?
	WebElement nowouldyoubewillingtoralocatelabel;
	@FindBy(xpath="//*[@id='f_relocateYes']/preceding-sibling::input")   //  yes radio of *Would you be willing to relocate for a restaurant opportunity? 
	WebElement yeswouldyoubewillingtoralocateradiobutton;
	@FindBy(xpath="//*[@id='f_relocateNo']/preceding-sibling::input")   //  NO radio of *Would you be willing to relocate for a restaurant opportunity? 
	WebElement nowouldyoubewillingtoralocateradiobutton;
	@FindBy(xpath="//*[@id='f_relocateYes']")   //  yes radio CLICK of *Would you be willing to relocate for a restaurant opportunity? 
	WebElement yeswouldyoubewillingtoralocateradiobuttonclick;
	@FindBy(xpath="//*[@id='f_relocateNo']")   //  NO radio CLICK of *Would you be willing to relocate for a restaurant opportunity? 
	WebElement nowouldyoubewillingtoralocateradiobuttonclick;
	@FindBy(xpath="//*[@id='rlc']")   //  error message *Would you be willing to relocate for a restaurant opportunity? 
	WebElement wouldyoubewillingtoralocateerrormessage;
	@FindBy(xpath="//*[@id='franchise-geography-type']")   //  select geography type label? 
	WebElement selectgeographytypelabel;
	@FindBy(xpath="//*[@id='franchise-geography-type-rural-head']")   //  Rural label? 
	WebElement ruralheadlabel;
	@FindBy(xpath="//*[@id='franchise-geography-type-small-town-head']")   //  small town label? 
	WebElement smalltownlabel;
	@FindBy(xpath="//*[@id='franchise-geography-type-suburban-head']")   //  suburban label? 
	WebElement suburbanheadlabel;
	@FindBy(xpath="//*[@id='franchise-geography-type-urban-head']")   //  urban label? 
	WebElement urbanheadlabel;
	@FindBy(xpath="//*[@id='franchise-geography-type-inner-city-head']")   //  GEOPRAPHY TYPE INNER CITY label? 
	WebElement geopraphytypeinnercitylabel;
	@FindBy(xpath="//*[@id='chk_rural']/preceding-sibling::input") //  rural check box ? 
	//@FindBy(xpath="//*[@id='franchise-geography-type-rural']")
	WebElement ruralcheckbox;
	@FindBy(xpath="//*[@id='chk_smTwn']/preceding-sibling::input")   //  small town check box ? 
	WebElement smalltowncheckbox;
	@FindBy(xpath="//*[@id='chk_suburban']/preceding-sibling::input")   // suburban check box ? 
	WebElement suburbancheckbox;
	@FindBy(xpath="//*[@id='chk_urban']/preceding-sibling::input")   //urban check box ? 
	WebElement urbancheckbox;
	@FindBy(xpath="//*[@id='chk_innerCity']/preceding-sibling::input")   //GEOGRAPHY TYPE  check box ? 
	WebElement geographytypecheckbox;
	@FindBy(xpath="//*[@id='chk_rural']")   //  rural check box click ? 
	//@FindBy(xpath="//*[@id='franchise-geography-type-rural-head']")
	WebElement ruralcheckboxclick;
	@FindBy(xpath="//*[@id='chk_smTwn']")   //  small town check box click ? 
	WebElement smalltowncheckboxclick;
	@FindBy(xpath="//*[@id='chk_suburban']")   //  suburban check box click ? 
	WebElement suburbancheckboxclick;
	@FindBy(xpath="//*[@id='chk_urban']")   //  urban check box click ? 
	WebElement urbancheckboxclick;
	@FindBy(xpath="//*[@id='chk_innerCity']")   //  urban check box click ? 
	WebElement geographytypecheckboxclick;
	@FindBy(xpath="//*[@id='mychk']")   //  geography type error message 
	WebElement geographytypeerrormessage;
	@FindBy(xpath="//*[@id='preferred-region-label']")   //  enter preferred region label
	WebElement enterpreferredregionlabel;
	@FindBy(xpath="//*[@id='preferred-region']")   //  enter preferred region click
	WebElement enterpreferredregionclick;
	@FindBy(xpath="//*[@id='preferred-region-error']")   //  enter preferred region error message
	WebElement enterpreferredregionerrormessage;
	@FindBy(xpath="//*[@id='ever-applied-label']")   // *Have you ever applied for a McDonald's franchise? If so, where and when? (0/512 characters)
	WebElement haveyoueverappliedforaMcDonaldlabel;
	@FindBy(xpath="//*[@id='ever-applied']")   // cick *Have you ever applied for a McDonald's franchise? If so, where and when? (0/512 characters)
	WebElement haveyoueverappliedforaMcDonaldclick;
	@FindBy(xpath="//*[@id='ever-applied-error']")   // error message *Have you ever applied for a McDonald's franchise? If so, where and when? (0/512 characters)
	WebElement haveyoueverappliedforaMcDonalderrormessage;
	@FindBy(xpath="//*[@id='franchise-learn-about-mcd-option']/span")   // *How did you learn of McDonald’s franchise opportunities?
	WebElement howdidyoulearnoffranchiseopportunitieslabel;
	@FindBy(xpath="//*[@id='franchise-learn-about-mcd-label-online']")   // online website *How did you learn of McDonald’s franchise opportunities?
	WebElement onlinewebsitehowdidyoulearnoffranchiseopportunities;
	@FindBy(xpath="//*[@id='franchise-learn-about-mcd-label-employee']")   // McDonald's employee *How did you learn of McDonald’s franchise opportunities?
	WebElement mcdonaldemployeehowdidyoulearnoffranchiseopportunities;
	@FindBy(xpath="//*[@id='franchise-learn-about-mcd-label-franchisee']")   // McDonald's franchisee *How did you learn of McDonald’s franchise opportunities?
	WebElement mcdonaldfranchiseehowdidyoulearnoffranchiseopportunities;
	@FindBy(xpath="//*[@id='franchise-learn-about-mcd-label-other']")   // other  *How did you learn of McDonald’s franchise opportunities?
	WebElement otherhowdidyoulearnoffranchiseopportunities;
	@FindBy(xpath="//*[@id='f_onlineradio']/preceding-sibling::input")   //  online website RADIO BUTTON  
	WebElement onlinewebsiteradiobutton;
	@FindBy(xpath="//*[@id='f_employeeradio']/preceding-sibling::input")   //  McDonald's employee RADIO BUTTON  
	WebElement mcdonaldemployeeradiobutton;
	@FindBy(xpath="//*[@id='f_franchiseradio']/preceding-sibling::input")   //  McDonald's franchisee RADIO BUTTON  
	WebElement mcdonaldfranchiseeradiobutton;
	@FindBy(xpath="//*[@id='f_otherradio']/preceding-sibling::input")   //  other  RADIO BUTTON  
	WebElement otherradiobutton;
	@FindBy(xpath="//*[@id='f_onlineradio']")   //  online website click RADIO BUTTON  
	WebElement onlinewebsiteradiobuttonclick;
	@FindBy(xpath="//*[@id='f_employeeradio']")   //  MCDONALD employee click RADIO BUTTON  
	WebElement mcdonaldemployeeradiobuttonclick;
	@FindBy(xpath="//*[@id='f_franchiseradio']")   //  MCDONALD franchisee click RADIO BUTTON  
	WebElement mcdonaldfranchiseeradiobuttonclick;
	@FindBy(xpath="//*[@id='f_otherradio']")   //  other  click RADIO BUTTON  
	WebElement othersradiobuttonclick;
	@FindBy(xpath="//*[@id='optionalMcdEmp']/div/div/label")   //  Employee Name & Position  label
	WebElement employeenamepositionlabel;
	@FindBy(xpath="//*[@id='opt-mcd-emp']")   //  Employee Name & Position  click
	WebElement employeenamepositionclick;
	@FindBy(xpath="//*[@id='optionalMcdFran']/div/div/label")   //  McDonald's Franchisee Name
	WebElement mcdonaldsfranchiseenamelabel;
	@FindBy(xpath="//*[@id='opt-mcd-fra']")   //  McDonald's Franchisee Name click
	WebElement mcdonaldsfranchiseenameclick;
	@FindBy(xpath="//*[@id='optionalRow']/div/div/label")   //  Enter your comments (0/512 characters)
	WebElement enteryourcommentslabel;
	@FindBy(xpath="//*[@id='franchise-enter-comments-box']")   //  CLICK Enter your comments (0/512 characters)
	WebElement enteryourcommentsclick;
	@FindBy(xpath="//*[@id='howdodyou']")   //  ERROR MESSAGE *How did you learn of McDonald’s franchise opportunities?
	WebElement howdidyoulearnofmcdonalderrormessagelabel;
	@FindBy(xpath="//*[@id='termsAndConditionlbl']/span")   //  terms and condition label
	WebElement termsandconditionlable;
	@FindBy(xpath="//*[@id='franchise-tc-label-yes-read']")   //  i agree label
	WebElement iagreelabel;
	@FindBy(xpath="//*[@id='I_am_accepting']/preceding-sibling::input")   //   i agree check box 
	//@FindBy(xpath="//*[@id='franchise-tc-value-yes']")
	WebElement iagreecheckbox; 
	@FindBy(xpath="//*[@id='I_am_accepting']")   //   i agree check box  click
	WebElement iagreecheckboxclick;
	@FindBy(xpath="//*[@id='agree_error']")   //   i agree label error message  
	WebElement iagreecheckboxerrormessage;
	@FindBy(xpath="//*[@id='openFranchisePopup']")   //  reset button   
	WebElement resetbutton;
	@FindBy(xpath="//*[@id='myModal']/div/div/div[1]/h4")   //  are you sure you want to reset  
	WebElement areyousureyouwantroresets;
	@FindBy(xpath="//*[@id='f_btn_reset']")   //  are you sure you want to reset  
	WebElement yesresetbutton;
	@FindBy(xpath="//*[@id='globalError-form']")   //  global error message 
	WebElement globalerrormessage;
	@FindBy(xpath="//*[@id='onetrust-close-btn-container']/button")   //   
	WebElement cookiscancelbutton;
	
	
	
	
	
	public String generallgetpagetitlemethod1() throws Exception { 
		this.click(fsubmitclick);
		Thread.sleep(5000);
		return this.getPageTitle();
	}
	public String globalerrormessagemethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
		this.click(cookiscancelbutton);
		}catch (Exception e) {
			
		}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
		return this.getText(globalerrormessage);
	}
	public String resetbuttonmethod() { 
		this.click(resetbutton);
		this.click(yesresetbutton);
		return this.getText(globalerrormessage);
	}
	public String iagreecheckboxerrormessagemethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
		return this.getText(iagreecheckboxerrormessage);
	}
	public String iagreecheckboxmethod1() {
		this.click(iagreecheckboxclick);
		return this.getAtrributeValue1(iagreecheckbox);
	}
	public String iagreecheckboxmethod() {  
		return this.getAtrributeValue1(iagreecheckbox);
	}
	public String iagreelabelmethod() {  
		return this.getText(iagreelabel);
	}
	public String termsandconditionlablemethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(termsandconditionlable);
	}
	public String howdidyoulearnofmcdonalderrormessagelabelmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
		return this.getText(howdidyoulearnofmcdonalderrormessagelabel);
	}
	public String enteryourcommentsclickmethod(String entercomm) {   
		this.clearContent(enteryourcommentsclick);
		this.sendKeys(this.enteryourcommentsclick, entercomm);
		return this.getAtrributeValue(enteryourcommentsclick);
	}
	public String enteryourcommentslabelmethod1() { 
		this.click(enteryourcommentsclick);
		return this.getText(enteryourcommentslabel);
	}
	public String enteryourcommentslabelmethod() {  
		return this.getText(enteryourcommentslabel);
	}
	public String mcdonaldsfranchiseenamesendedvaluemethod(String entercomm) {   
		this.clearContent(mcdonaldsfranchiseenameclick);
		this.sendKeys(this.mcdonaldsfranchiseenameclick, entercomm);
		return this.getAtrributeValue(mcdonaldsfranchiseenameclick);
	}
	public String mcdonaldsfranchiseenamelabelmethod1() { 
		this.click(mcdonaldsfranchiseenameclick);
		return this.getText(mcdonaldsfranchiseenamelabel);
	}
	public String mcdonaldsfranchiseenamelabelmethod() {  
		return this.getText(mcdonaldsfranchiseenamelabel);
	}
	public String employeenamepositionsendedvaluemethod(String entercomm) {   
		this.clearContent(employeenamepositionclick);
		this.sendKeys(this.employeenamepositionclick, entercomm);
		return this.getAtrributeValue(employeenamepositionclick);
	}
	public String employeenamepositionlabelmethod1() { 
		this.click(employeenamepositionclick);
		return this.getText(employeenamepositionlabel);
	}
	public String employeenamepositionlabelmethod() {  
		return this.getText(employeenamepositionlabel);
	}
	public String otherradiobuttonmethod1() { 
		this.click(othersradiobuttonclick);
		return this.getAtrributeValue1(otherradiobutton);
	}
	public String mcdonaldfranchiseeradiobuttonmethod1() { 
		this.click(mcdonaldfranchiseeradiobuttonclick);
		return this.getAtrributeValue1(mcdonaldfranchiseeradiobutton);
	}
	public String mcdonaldemployeeradiobuttonmethod1() { 
		this.click(mcdonaldemployeeradiobuttonclick);
		return this.getAtrributeValue1(mcdonaldemployeeradiobutton);
	}
	public String onlinewebsiteradiobuttonmethod1() { 
		this.click(onlinewebsiteradiobuttonclick);
		return this.getAtrributeValue1(onlinewebsiteradiobutton);
	}
	public String otherradiobuttonmethod() {  
		return this.getAtrributeValue1(otherradiobutton);
	}
	public String mcdonaldfranchiseeradiobuttonmethod() {  
		return this.getAtrributeValue1(mcdonaldfranchiseeradiobutton);
	}
	public String mcdonaldemployeeradiobuttonmethod() {  
		return this.getAtrributeValue1(mcdonaldemployeeradiobutton);
	}
	public String onlinewebsiteradiobuttonmethod() {  
		return this.getAtrributeValue1(onlinewebsiteradiobutton);
	}
	public String otherhowdidyoulearnoffranchiseopportunitiesmethod() { 
		return this.getText(otherhowdidyoulearnoffranchiseopportunities);
	}
	public String mcdonaldfranchiseehowdidyoulearnoffranchiseopportunitiesmethod() { 
		return this.getText(mcdonaldfranchiseehowdidyoulearnoffranchiseopportunities);
	}
	public String mcdonaldemployeehowdidyoulearnoffranchiseopportunitiesmethod() { 
		return this.getText(mcdonaldemployeehowdidyoulearnoffranchiseopportunities);
	}
	public String onlinewebsitehowdidyoulearnoffranchiseopportunitiesmethod() { 
		return this.getText(onlinewebsitehowdidyoulearnoffranchiseopportunities);
	}
	public String howdidyoulearnoffranchiseopportunitieslabelmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(howdidyoulearnoffranchiseopportunitieslabel);
	}
	public String haveyoueverappliedforaMcDonalderrormessagemethod1() { 
		return this.getText(haveyoueverappliedforaMcDonalderrormessage);
	}
	public String haveyoueverappliedforaMcDonalderrormessagemethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
		return this.getText(haveyoueverappliedforaMcDonalderrormessage);
	}
	public String haveyoueverappliedforaMcDonaldsendedvaluemethod(String entercomm) {   
		this.clearContent(haveyoueverappliedforaMcDonaldclick);
		this.sendKeys(this.haveyoueverappliedforaMcDonaldclick, entercomm);
		return this.getAtrributeValue(haveyoueverappliedforaMcDonaldclick);
	}
	public String haveyoueverappliedforaMcDonaldlabelmethod1() { 
		this.click(haveyoueverappliedforaMcDonaldclick);
		return this.getText(haveyoueverappliedforaMcDonaldlabel);
	}
	public String haveyoueverappliedforaMcDonaldlabelmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		return this.getText(haveyoueverappliedforaMcDonaldlabel);
	}
	public String enterpreferredregionerrormessagemethod1() { 
		return this.getText(enterpreferredregionerrormessage);
	}
	public String enterpreferredregionerrormessagemethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
		return this.getText(enterpreferredregionerrormessage);
	}
	public String enterpreferredregionsendedvaluemethod(String entercomm) {   
		this.clearContent(enterpreferredregionclick);
		this.sendKeys(this.enterpreferredregionclick, entercomm);
		return this.getAtrributeValue(enterpreferredregionclick);
	}
	public String enterpreferredregionlabelmethod1() { 
		this.click(enterpreferredregionclick);
		return this.getText(enterpreferredregionlabel);
	}
	public String enterpreferredregionlabelmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		return this.getText(enterpreferredregionlabel);
	}
	public String geographytypeerrormessagemethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
		return this.getText(geographytypeerrormessage);
	}
	public String geographytypecheckboxmethod1() { 
		this.click(geographytypecheckboxclick);
		return this.getAtrributeValue1(geographytypecheckbox);
	}
	public String urbancheckboxmethod1() { 
		this.click(urbancheckboxclick);
		return this.getAtrributeValue1(urbancheckbox);
	}
	public String suburbancheckboxmethod1() { 
		this.click(suburbancheckboxclick);
		return this.getAtrributeValue1(suburbancheckbox);
	}
	public String smalltowncheckboxmethod1() {  
		this.click(smalltowncheckboxclick);
		return this.getAtrributeValue1(smalltowncheckbox);
	}
	public String ruralcheckboxmethod1() { 
		this.click(ruralcheckboxclick);
		return this.getAtrributeValue1(ruralcheckbox);
	}
	public String geographytypecheckboxmethod() {  
		return this.getAtrributeValue1(geographytypecheckbox);
	}
	public String urbancheckboxmethod() {  
		return this.getAtrributeValue1(urbancheckbox);
	}
	public String suburbancheckboxmethod() {  
		return this.getAtrributeValue1(suburbancheckbox);
	}
	public String smalltowncheckboxmethod() {  
		return this.getAtrributeValue1(smalltowncheckbox);
	}
	public String ruralcheckboxmethod() {  
		return this.getAtrributeValue1(ruralcheckbox);
	}
	public String geopraphytypeinnercitylabelmethod() { 
		return this.getText(geopraphytypeinnercitylabel);
	}
	public String urbanheadlabelmethod() { 
		return this.getText(urbanheadlabel);
	}
	public String suburbanheadlabelmethod() { 
		return this.getText(suburbanheadlabel);
	}
	public String smalltownlabelmethod() { 
		return this.getText(smalltownlabel);
	}
	public String ruralheadlabelmethod() { 
		return this.getText(ruralheadlabel);
	}
	public String selectgeographytypelabelmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(selectgeographytypelabel);
	}
	public String wouldyoubewillingtoralocateerrormessagemethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
		return this.getText(wouldyoubewillingtoralocateerrormessage);
	}
	public String nowouldyoubewillingtoralocateradiobuttonmethod1() { 
		this.click(nowouldyoubewillingtoralocateradiobuttonclick);
		return this.getAtrributeValue1(nowouldyoubewillingtoralocateradiobutton);
	}
	public String yeswouldyoubewillingtoralocateradiobuttonmethod1() {  
		this.click(yeswouldyoubewillingtoralocateradiobuttonclick);
		return this.getAtrributeValue1(yeswouldyoubewillingtoralocateradiobutton);
	}
	public String nowouldyoubewillingtoralocateradiobuttonmethod() {  
		return this.getAtrributeValue1(nowouldyoubewillingtoralocateradiobutton);
	}
	public String yeswouldyoubewillingtoralocateradiobuttonmethod() {  
		return this.getAtrributeValue1(yeswouldyoubewillingtoralocateradiobutton);
	}
	public String nowouldyoubewillingtoralocatelabelmethod() {  
		return this.getText(nowouldyoubewillingtoralocatelabel);
	}
	public String yeswouldyoubewillingtoralocatelabelmethod() {  
		return this.getText(yeswouldyoubewillingtoralocatelabel);
	}
	public String wouldyoubewillingtoralocatelabelmethod() throws Exception {  
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(wouldyoubewillingtoralocatelabel);
	}
	public String howmutchtimewillyouerrormessagemethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
		return this.getText(howmutchtimewillyouerrormessage);
	}
	public String passiveinvestorradiobuttonmethod1() {
		this.click(passiveinvestorradiobuttonclick);
		return this.getAtrributeValue1(passiveinvestorradiobutton);
	}
	public String parttimeradiobuttonmethod1() {
		this.click(parttimeradiobuttonclick);
		return this.getAtrributeValue1(parttimeradiobutton);
	}
	public String fulltimeradiobuttonmethod1() {
		this.click(fulltimeradiobuttonclick);
		return this.getAtrributeValue1(fulltimeradiobutton);
	}
	public String passiveinvestorradiobuttonmethod() {
		return this.getAtrributeValue1(passiveinvestorradiobutton);
	}
	public String parttimeradiobuttonmethod() {
		return this.getAtrributeValue1(parttimeradiobutton);
	}
	public String fulltimeradiobuttonmethod() {
		return this.getAtrributeValue1(fulltimeradiobutton);
	}
	public String passiveinvestorlabelmethod() {
		return this.getText(passiveinvestorlabel);
	}
	public String parttimelabelmethod() {
		return this.getText(parttimelabel);
	}
	public String fulltimelabelmethod() {
		return this.getText(fulltimelabel);
	}
	public String howmuchtimewillyoudevotetothismethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(howmuchtimewillyoudevotetothis);
	}
	public String areprovidingproductsradiobuttonerrormessagemethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
		return this.getText(areprovidingproductsradiobuttonerrormessage);
	}
	public String noareprovidingproductsradiobuttonmethod1() {
		this.click(noareprovidingproductsradiobuttonclick);
		return this.getAtrributeValue1(noareprovidingproductsradiobutton);
	}
	public String yesareprovidingproductsradiobuttonmethod1() {
		this.click(yesareprovidingproductsradiobuttonclick);
		return this.getAtrributeValue1(yesareprovidingproductsradiobutton);
	}
	public String noareprovidingproductsradiobuttonmethod() {
		return this.getAtrributeValue1(noareprovidingproductsradiobutton);
	}
	public String yesareprovidingproductsradiobuttonmethod() {
		return this.getAtrributeValue1(yesareprovidingproductsradiobutton);
	}
	public String noareprovidingproductsladbelmethod() {
		return this.getText(noareprovidingproductsladbel);
	}
	public String yesareprovidingproductsladbelmethod() {
		return this.getText(yesareprovidingproductsladbel);
	}
	public String areprovidingproductsladbelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(areprovidingproductsladbel);
	}
	public String relationsipfranchiserelatedmarriageownersendedmethod(String entercomm) {   
		this.clearContent(relationshipfranchiserelatedmarriageownerclick);
		this.sendKeys(this.relationshipfranchiserelatedmarriageownerclick, entercomm);
		return this.getAtrributeValue(relationshipfranchiserelatedmarriageownerclick);
	}
	public String relationshipfranchiserelatedmarriageownermethod1() {
		this.click(relationshipfranchiserelatedmarriageownerclick);
		return this.getText(relationshipfranchiserelatedmarriageowner);
	}
	public String relationshipfranchiserelatedmarriageownermethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(relationshipfranchiserelatedmarriageowner);
	}
	public String lastnamefranchiserelatedmarriageownersendedmethod(String entercomm) {   
		this.clearContent(lastnamefranchiserelatedmarriageownerclick);
		this.sendKeys(this.lastnamefranchiserelatedmarriageownerclick, entercomm);
		return this.getAtrributeValue(lastnamefranchiserelatedmarriageownerclick);
	}
	public String lastnamefranchiserelatedmarriageownermethod1() {
		this.click(lastnamefranchiserelatedmarriageownerclick);
		return this.getText(lastnamefranchiserelatedmarriageowner);
	}
	public String lastnamefranchiserelatedmarriageownermethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(lastnamefranchiserelatedmarriageowner);
	}
	public String firstnamefranchiserelatedmarriageownersendedmethod(String entercomm) {   
		this.clearContent(firstnamefranchiserelatedmarriageownerclick);
		this.sendKeys(this.firstnamefranchiserelatedmarriageownerclick, entercomm);
		return this.getAtrributeValue(firstnamefranchiserelatedmarriageownerclick);
	}
	public String firstnamefranchiserelatedmarriageownermethod1() {
		this.click(firstnamefranchiserelatedmarriageownerclick);
		return this.getText(firstnamefranchiserelatedmarriageowner);
	}
	public String firstnamefranchiserelatedmarriageownermethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(firstnamefranchiserelatedmarriageowner);
	}
	public String franchiserelatedmarriageownererrormessagemethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
		return this.getText(franchiserelatedmarriageownererrormessage);
	}
	public String nofranchiserelatedmarriageownerradiobuttonmethod1() {
		this.click(nofranchiserelatedmarriageownerradiobuttonclick);
		return this.getAtrributeValue1(nofranchiserelatedmarriageownerradiobutton);
	}
	public String yesfranchiserelatedmarriageownerradiobuttonmethod1() {
		this.click(YESfranchiserelatedmarriageownerradiobuttonclick);
		return this.getAtrributeValue1(yesfranchiserelatedmarriageownerradiobutton);
	}
	public String nofranchiserelatedmarriageownerradiobuttonmethod() {
		return this.getAtrributeValue1(nofranchiserelatedmarriageownerradiobutton);
	}
	public String yesfranchiserelatedmarriageownerradiobuttonmethod() {
		return this.getAtrributeValue1(yesfranchiserelatedmarriageownerradiobutton);
	}
	public String nofranchiserelatedmarriageownermethod() {   
		return this.getText(nofranchiserelatedmarriageowner);   
	}
	public String yesfranchiserelatedmarriageownermethod() {   
		return this.getText(yesfranchiserelatedmarriageowner);   
	}
	public String franchiserelatedmarriageownermethod() throws Exception {  
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(franchiserelatedmarriageowner);   
	}
	public String relationshipmarriageofficermethod(String entercomm) {   
		this.clearContent(relationshipmarriageofficerclick);
		this.sendKeys(this.relationshipmarriageofficerclick, entercomm);
		return this.getAtrributeValue(relationshipmarriageofficerclick);
	}
	public String relationshipmarriageofficerlabelmethod1() { 
		this.click(relationshipmarriageofficerclick);
		return this.getText(relationshipmarriageofficerlabel);   
	}
	public String relationshipmarriageofficerlabelmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(relationshipmarriageofficerlabel);   
	}
	public String relationlastnamemarriageofficermethod(String entercomm) {   
		this.clearContent(relationlastnamemarriageofficerclick);
		this.sendKeys(this.relationlastnamemarriageofficerclick, entercomm);
		return this.getAtrributeValue(relationlastnamemarriageofficerclick);
	}
	public String relationlastnamemarriageofficerlabelmethod1() { 
		this.click(relationlastnamemarriageofficerclick);
		return this.getText(relationlastnamemarriageofficerlabel);   
	}
	public String relationlastnamemarriageofficerlabelmethod() throws Exception {   
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(relationlastnamemarriageofficerlabel);   
	}
	public String relationfirstnamemarriageofficermethod(String entercomm) {   
		this.clearContent(relationfirstnamemarriageofficerclick);
		this.sendKeys(this.relationfirstnamemarriageofficerclick, entercomm);
		return this.getAtrributeValue(relationfirstnamemarriageofficerclick);
	}
	public String relationfirstnamemarriageofficerlabelmethod1() { 
		this.click(relationfirstnamemarriageofficerclick);
		return this.getText(relationfirstnamemarriageofficerlabel);   
	}
	public String relationfirstnamemarriageofficerlabelmethod() throws Exception {  
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(relationfirstnamemarriageofficerlabel);   
	}
	public String relationwithmcdofficerlblerromessagemethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
		return this.getText(relationwithmcdofficerlblerromessage);   
	}
	public String norelationwithmcdofficerlblradiobuttonclickmethod() { 
		this.click(norelationwithmcdofficerlblradiobuttonclcik);
		return this.getAtrributeValue1(norelationwithmcdofficerlblradiobutton);
	}
	public String yesrelationwithmcdofficerlblradiobuttonclickmethod() { 
		this.click(yesrelationwithmcdofficerlblradiobuttonclcik);
		return this.getAtrributeValue1(yesrelationwithmcdofficerlblradiobutton);
	}
	public String norelationwithmcdofficerlblradiobuttonmethod() {
		return this.getAtrributeValue1(norelationwithmcdofficerlblradiobutton);
	}
	public String yesrelationwithmcdofficerlblradiobuttonmethod() {
		return this.getAtrributeValue1(yesrelationwithmcdofficerlblradiobutton);
	}
	public String norelationwithmcdofficerlbllabelmethod() {  
		return this.getText(norelationwithmcdofficerlbllabel);   
	}
	public String yesrelationwithmcdofficerlbllabelmethod() {  
		return this.getText(yesrelationwithmcdofficerlbllabel);   
	}
	public String relationwithmcdofficerlbllabelmethod() throws Exception {  
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		return this.getText(relationwithmcdofficerlbllabel);   
	}
	public String totalnonborrowederrormessagemethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
		return this.getText(totalnonborrowederrormessage);   
	}
	public String totalnonborroweddropdownvaluemethod1() { 
		this.click(totalnonborroweddropdownclick);
		return this.getText(totalnonborrowedclick);   
	}
	public String totalnonborroweddropdownvaluemethod() { 
		this.click(totalnonborrowedclick);
		return this.getText(totalnonborroweddropdownclick);   
	}
	public String totalnonborroweddropdownvaluemethod1p() { 
		this.click(totalnonborrowedclick);
		this.click(totalnonborroweddropdownclick);
		return this.getText(totalnonborrowedclick);   
	}
	public String totalnonborrowedlabelmethod() throws Exception {  
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(totalnonborrowedlabel);
	}
	public String totalnonborrowedlabelmethod1() throws Exception {  
		return this.getText(totalnonborrowedlabel);
	}
	public String networtherrormessagemethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
		return this.getText(networtherrormessage);
	}
	public String networthvaluemethod() {     
		return this.getAtrributeValue(networthvalue);
	}
	public String networthlabelmethod() throws Exception { 
		return this.getText(networthlabel);
	}
	public String networthlabelmethod1() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(networthlabel);
	}
	public String totaldebterrormessagemethod() throws Exception {  
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
		return this.getText(totaldebterrormessage);
	}
	public String totaldebtsendedvaluemethod(String entercomm) {   
		this.clearContent(totaldebtclick);
		this.sendKeys(this.totaldebtclick, entercomm);
		return this.getAtrributeValue(totaldebtclick);
	}
	public String totaldebtlabelmethod1() { 
		this.click(totaldebtclick);
		return this.getText(totaldebtlabel);
	}
	public String totaldebtlabelmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(totaldebtlabel);
	}
	public String totalassetserrormessagemethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
		return this.getText(totalassetserrormessage);
	}
	public String tatalassetssendedvaluemethod(String entercomm) {   
		this.clearContent(totalassetsclick);
		this.sendKeys(this.totalassetsclick, entercomm);
		return this.getAtrributeValue(totalassetsclick);
	}
	public String totalassetslabelmethod1() { 
		this.click(totalassetsclick);
		return this.getText(totalassetslabel);
	}
	public String totalassetslabelmethod() throws Exception {  
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(totalassetslabel);
	}
	public String haveyoueverhadbusinesserrormessagemethod() {  
		return this.getText(haveyoueverhadbusinesserrormessage);
	}
	public String haveyoueverhadbusinesserrormessagemethod1() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
		return this.getText(haveyoueverhadbusinesserrormessage);
	}
	public String haveyoueverhadbusinesssendedvalmethod(String entercomm) throws Exception {   
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.sendKeys(this.haveyoueverhadbusinessclick, entercomm);
		return this.getAtrributeValue(haveyoueverhadbusinessclick);
	}
	public String haveyoueverhadbusinesssendedvalmethod1(String entercomm)  {   
		this.sendKeys(this.haveyoueverhadbusinessclick, entercomm);
		return this.getAtrributeValue(haveyoueverhadbusinessclick);
	}
	public String haveyoueverhadbusinesslabelmethod1() { 
		this.click(haveyoueverhadbusinessclick);
		return this.getText(haveyoueverhadbusinesslabel);
	}
	public String haveyoueverhadbusinesslabelmethod() throws Exception {  
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(haveyoueverhadbusinesslabel);
	}
	public String haveyoueverownedyourownerrormessagemethod1() throws Exception {  
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
		return this.getText(haveyoueverownedyourownerrormessage);
	}
	public String haveyoueverownedyourownerrormessagemethod() {     
		return this.getText(haveyoueverownedyourownerrormessage);
	}
	public String haveyoueverownedyourownsendedvalmethod(String entercomm) throws Exception {   
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.sendKeys(this.haveyoueverownedyourownclick, entercomm);
		return this.getAtrributeValue(haveyoueverownedyourownclick);
	}
	public String haveyoueverownedyourownsendedvalmethod1(String entercomm) throws Exception {   
		this.sendKeys(this.haveyoueverownedyourownclick, entercomm);
		return this.getAtrributeValue(haveyoueverownedyourownclick);
	}
	public String haveyoueverownedyourownlabelmethod1() { 
		this.click(haveyoueverownedyourownclick);
		return this.getText(haveyoueverownedyourownlabel);
	}
	public String haveyoueverownedyourownlabelmethod() {     
		return this.getText(haveyoueverownedyourownlabel);
	}
	public String businessorfranchisemethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(businessorfranchiselabel);
	}
	public String describedutiesnumberoferrormessagemethod1() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
		return this.getText(describedutiesnumberoferrormessage);
	}
	public String describedutiesnumberoferrormessagemethod() {
		return this.getText(describedutiesnumberoferrormessage);
	}
	public String describedutiesnumbersendedmethod1(String entercomm) throws Exception {  
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.clearContent(describedutiesnumberofclick);
		this.sendKeys(this.describedutiesnumberofclick, entercomm);
		return this.getAtrributeValue(describedutiesnumberofclick);
	}
	public String describedutiesnumbersendedmethod(String entercomm)  {  
		this.clearContent(describedutiesnumberofclick);
		this.sendKeys(this.describedutiesnumberofclick, entercomm);
		return this.getAtrributeValue(describedutiesnumberofclick);
	}
	public String describedutiesnumberoflabelmethod1() { 
		this.click(describedutiesnumberofclick);
		return this.getText(describedutiesnumberoflabel);
	}
	public String describedutiesnumberoflabelmethod() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(describedutiesnumberoflabel);
	}
	public String companynameerrormessage() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
		return this.getText(companynameerrormessage);
	}
	public String companynamesendedvaluemethod(String entercomm) {  
		this.clearContent(companynameclick);
		this.sendKeys(this.companynameclick, entercomm);
		return this.getAtrributeValue(companynameclick);
	}
	public String companynamelabelmethod1() {
		this.click(companynameclick);
		return this.getText(companynamelabel);
	}
	public String companynamelabelmethod() throws Exception {  
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(companynamelabel);
	}
	public String positionhelderrormessagemethod() throws Exception {   
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
		return this.getText(positionhelderrormessage);
	}
	public String positionheldsendedvaluemethod(String entercomm) {  
		this.clearContent(positionheldclick);
		this.sendKeys(this.positionheldclick, entercomm);
		return this.getAtrributeValue(positionheldclick);
	}
	public String positionheldlabelmethod1() { 
		this.click(positionheldclick);
		return this.getText(positionheldlabel);
	}
	public String positionheldlabelmethod() throws Exception {  
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(positionheldlabel);
	}
	public String errormessageoccupationalmethod() throws Exception {  
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
		return this.getText(errormessageoccupational);
	}
	public String occupationsendedvaluemethod(String entercomm) {  
		this.clearContent(occupationalclick);
		this.sendKeys(this.occupationalclick, entercomm);
		return this.getAtrributeValue(occupationalclick);
	}
	public String occupationallabelmethod1() { 
		this.click(occupationalclick);
		return this.getText(occupationallabel);
	}
	public String occupationallabelmethod() { 
		return this.getText(occupationallabel);
	}
	public String degreesendedvalumethod(String entercomm) {  
		this.clearContent(degreeclcik);
		this.sendKeys(this.degreeclcik, entercomm);
		return this.getAtrributeValue(degreeclcik);
	}
	public String degreelabelmethod1() { 
		this.click(degreeclcik);
		return this.getText(degreelabel);
	}
	public String degreelabelmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(degreelabel);
	}
	public String errormessagelastyearmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
		return this.getText(errormessagelastyear);
	}
	public String nameofcollegeorpostgraduatemethod(String entercomm) {
		this.clearContent(nameofcollegeandclick);
		this.sendKeys(this.nameofcollegeandclick, entercomm);
		return this.getAtrributeValue(nameofcollegeandclick);
	}
	public String nameofcollegeandlabelmethod1() { 
		this.click(nameofcollegeandclick);
		return this.getText(nameofcollegeandlabel);   
	}
	public String nameofcollegeandlabelmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		return this.getText(nameofcollegeandlabel);   
	}
	public String lastyearofschoolingdropdownvaluemethod() { 
		this.click(lastyearofschoolingdropdown);
		return this.getText(lastyearofschoolingclick);  
	}
	public String lastyearofschoolingdropdownvaluemethod1() { 
		this.click(lastyearofschoolingclick);
		this.click(lastyearofschoolingdropdown);
		return this.getText(lastyearofschoolingclick);
	}
	public String lastyearofschoolinglabelmethod1() { 
		this.click(lastyearofschoolingclick);
		return this.getText(lastyearofschoolinglabel);   
	}
	public String lastyearofschoolinglabelmethod() {    
		return this.getText(lastyearofschoolinglabel);   
	}
	public String edducationoccupationmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(edducationoccupation);   
	}
	public String racedropdownvaluemethod() { 
		this.click(racedropdown);
		return this.getText(raceclick);  
	}
	public String racelabelmethod1() { 
		this.click(raceclick);
		return this.getText(racelabel);   
	}
	public String racelabelmethod() {    
		return this.getText(racelabel);   
	}
	public String genderdropdownvaluemethod() { 
		this.click(genderdropdown);
		return this.getText(genderclick);  
	}
	public String genderlabelmethod1() { 
		this.click(genderclick);
		return this.getText(genderlabel);   
	}
	public String genderlabelmethod() {    
		return this.getText(genderlabel);   
	}
	public String demographicinformationmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(demographicinformation);   
	}
	public String errormessageareyoufluentanotherlanguagemethod() throws Exception {   
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
		return this.getText(errormessageareyoufluentanotherlanguage);   
	}
	public String noradiodefaultbuttonlanguagemethod1() {   
		this.click(noradiodefaultbuttonclick);
		return this.getAtrributeValue1(noradiodefaultbutton);   
	}
	public String ifyeslanguagesendvaluemethod(String entercomm) {   
		this.clearContent(ifyeslanguageclick);
		this.sendKeys(this.ifyeslanguageclick, entercomm);
		return this.getAtrributeValue(ifyeslanguageclick);
	}
	public String ifyeslanguagelabelmethod1() { 
		this.click(ifyeslanguageclick);
		return this.getText(ifyeslanguagelabel);   
	}
	public String ifyeslanguagelabelmethod() { 
		return this.getText(ifyeslanguagelabel);   
	}
	public String yesradiodefaultbuttonlanguagemethod1() { 
		this.click(YESradiodefaultbuttonclick);
		return this.getAtrributeValue1(yesradiodefaultbutton);   
	}
	public String noradiodefaultbuttonlanguagemethod() {             
		return this.getAtrributeValue1(noradiodefaultbutton);   
	}
	public String yesradiodefaultbuttonlanguagemethod() {             
		return this.getAtrributeValue1(yesradiodefaultbutton);   
	}
	public String noradiobuttonlanguagelabelmethod() {     
		return this.getText(noradiobuttonlanguagelabel);  
	}
	public String yesradiobuttonlanguagelabelmethod() {     
		return this.getText(yesradiobuttonlanguagelabel);  
	}
	public String areyouflouentinanotherlanglabelmethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(areyouflouentinanotherlanglabel);  
	}
	public String errormessageareyouausmethod() throws Exception {  
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
		return this.getText(errormessageareyouaus);  
	}
	public String noradiobuttonbydefaultselectedmethod1() {  
		this.click(noradiobuttonclick);
		return this.getAtrributeValue1(noradiobutton);  
	}
	public String yesadiobuttonbydefaultselectedmethod1() { 
		this.click(yesradiobuttonclick);
		return this.getAtrributeValue1(yesradiobutton);  
	}
	public String noradiobuttonbydefaultselectedmethod() {
		return this.getAtrributeValue1(noradiobutton);  
	}
	public String noradiobuttonlabelmethod() {   
		return this.getText(noradiobuttonlabel);  
	}
	public String yesradiobuttonlabelmethod() {   
		return this.getText(yesradiobuttonlabel);  
	}
	public String yesadiobuttonbydefaultselectedmethod() {
		return this.getAtrributeValue1(yesradiobutton);  
	}
	public String areyouauscitizenlabelmethod() throws Exception {            //are you a us citizen label 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(areyouauscitizenlabel); 
	}
	public String haveyouoryourspouseerrormessagemethod() throws Exception {            //*Have you or your spouse ever declared  error message  
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
		return this.getText(haveyouoryourspouseerrormessage); 
	}
	public String haveyouoryourspouseerrormessagemethod1() {            //*Have you or your spouse ever declared  error message  
		return this.getText(haveyouoryourspouseerrormessage); 
	}
	public String haveyouoryourspousesendedvaluemethod(String entercomm) {   
		this.clearContent(haveyouoryourspouseclick);
		this.sendKeys(this.haveyouoryourspouseclick, entercomm);
		return this.getAtrributeValue(haveyouoryourspouseclick);
	}
	public String haveyouoryourspouselabelmethod1() {            //have you or your spouse ever declared click 
		this.click(haveyouoryourspouseclick);
		return this.getText(haveyouoryourspouselabel); 
	}
	public String haveyouoryourspouselabelmethod() throws Exception {            //have you or your spouse ever declared label 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(haveyouoryourspouselabel); 
	}
	public String haveyoubeenevererrormessagemethod() throws Exception {            //have you been ever been.... error message  
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
		return this.getText(haveyoubeenevererrormessage); 
	}
	public String haveyoubeenevererrormessagemethod1() {            //have you been ever been.... error message  
		return this.getText(haveyoubeenevererrormessage); 
	}
	public String haveyoubeeneversendedvaluemethod(String entercomm) {  
		this.clearContent(haveyoubeeneverclick);
		this.sendKeys(this.haveyoubeeneverclick, entercomm);
		return this.getAtrributeValue(haveyoubeeneverclick);
	}
	
	public String haveyoubeeneverlabelmethod1() {            //have you been ever been.... label  
		this.click(haveyoubeeneverclick);
		return this.getText(haveyoubeeneverlabel);
	}
	public String haveyoubeeneverlabelmethod() {            //have you been ever been.... label  
		return this.getText(haveyoubeeneverlabel);
	}
	public String legalinformationlabelmethod() throws Exception {            //legal information label  
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(legalinformationlabel);
	}
	public String ziperrormessagemethod() throws Exception {            //ZIP
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
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
	public String ziplabelmethod() throws Exception {                    //ZIP
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		return this.getText(ziplabel);
	}
	
	public String stateselecteddropdownvalmethod() {      //state
		this.click(statedropdownvalue);
		return this.getText(stateclick);  
	}
	public String stateerrormessagemethod() throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
		return this.getText(stateerrormessage);
	}
	public String statelabelmethod1() { 
		this.click(stateclick);
		return this.getText(statelabel);
	}
	public String statelabelmethod() throws Exception {               //state
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		return this.getText(statelabel);
	}
	public String cityerromessagemethod() throws Exception {             //CITY 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
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
	public String citylabelmethod() throws Exception {                    //CITY 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(citylabel);
		return this.getText(citylabel);
	}
	
	public String addresserrormessagemethod() throws Exception {      //address US only
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
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
	public String addresslabelmethod() throws Exception {             //address US only
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(addresslabel);
	}
	public String emailerrormessagemethod1() throws Exception {    //email
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
		return this.getText(emailerrormessage);
	}
	public String emailerrormessagemethod() { 
		this.click(addresslabel);
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
	public String emaillabelmethod() throws Exception {          //email
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		return this.getText(emaillabel);
	}
	public String phonenumbererrormessagemethod1() throws Exception  {  //phone
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
		return this.getText(phonenumbererrormessage);
	}
	public String phonenumbererrormessagemethod(String pnumber) throws Exception { 
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.sendKeys(this.phonenumberclick, pnumber);
		this.click(fsubmitclick);
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
	public String phonenumberlabelmethod() throws Exception {            //phone
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(phonenumberlabel);
	}
	public String lastnameerrormesmethod() throws Exception {      //last name
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
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
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(lastnamelabel);       //last name
	}
	public String firstnameerror() throws Exception {                //first name
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
	    waitForElementToBeVisible1(fsubmitclick);
		this.click(fsubmitclick);
		return this.getText(finamerror);  
	}
	public String firstnamesendedvaluemethod(String firname) {
		this.clearContent(firstnameclick);
		this.sendKeys(this.firstnameclick, firname);
		return this.getAtrributeValue(firstnameclick);
	}
	public String firstnamesendedvaluemethod1(String firname) throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		this.clearContent(firstnameclick);
		this.sendKeys(this.firstnameclick, firname);
		return this.getAtrributeValue(firstnameclick);
	}
	public String firstnamelabelmethod1(){
		this.click(firstnameclick);
		return this.getText(firstnamelabel);
	}
	public String firstnamelabelmethod() throws Exception{             //first name
		driver.navigate().refresh();
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(firstnamelabel);
	}
	public String tellusaboutyourselflabelmethod() {  
		return this.getText(tellusaboutyourselflabel);  
	}
	public String indicatearequiredfieldlabelmethod() {  
		return this.getText(indicatearequiredfieldlabel);  
	}
	public String lookingstartlabelmethod() {  
		return this.getText(lookingstartlabel);  
	}
	public String franchisseresetfocuslabelmethod() throws Exception { 
		Thread.sleep(3300);
		try {
			this.click(cookiscancelbutton);
			}catch (Exception e) {
				
			}
		return this.getText(franchisseresetfocuslabel);  
	}
	public String generallgetpagetitlemethod() {  
		return this.getPageTitle();
	}

}

package com.McD.qa.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends Basepage {
	public  Loginpage(WebDriver driver) {
		super(driver);
//		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@id='login_jump'] | //a[@id='login_desktop']")
	WebElement signIn;

	@FindBy(xpath="//input[@id='LoginFormEmail' or @id='userid']")
	WebElement email;

	@FindBy(xpath="//input[@id='LoginFormPassword']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='pwd']")
	WebElement password2;

	@FindBy(xpath="//a[@id='LoginFormSubmit'] | //input[@id='signin_submit']")
	WebElement login;

	public void LoginPage(WebDriver driver) {
		//super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickSignIn() throws Exception  {
		this.waitForElementToBeVisible(signIn);
		this.click(signIn);
	}

	public void clickLogin() {
		this.click(login);
	}

	public void setEmail(String email) {
		this.sendKeys(this.email, email);
	}
	
	public void pressTabAfterSetEmail() {
		this.sendKeysTab(this.email);
	}

	public void setPassword(String password) {
		this.sendKeys(this.password, password);
	}
	
	public void setPassword2(String password) {
		this.sendKeys(this.password2, password);
	}

}

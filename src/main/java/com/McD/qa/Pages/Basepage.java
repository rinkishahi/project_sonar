package com.McD.qa.Pages;

import java.awt.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.sun.xml.bind.v2.schemagen.xmlschema.List;


public class Basepage {
	public WebDriver driver;
	//private By bySearchButton;

	public  Basepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//public static String readProperty(String key) throws Exception
	public static  String readProperty(String url) throws Exception
	{
		FileReader reader=new FileReader(System.getProperty("user.dir")+ "\\src\\main\\java\\com\\McD\\qa\\Config\\Config.Properties");  
	    Properties p=new Properties();  
	    p.load(reader);  
	    String value = p.getProperty(url);
	    return value;
	} 
	public void windowhandles(){     
		String mainwindowid=driver.getWindowHandle();
		Set<String> allwidowid=driver.getWindowHandles();
		for(String windowid:allwidowid) {
			if(!windowid.equals(mainwindowid)) {
				driver.switchTo().window(windowid);
			}
		}
		
	}
	
	
	
	public String getPageTitle(){     
		String title = driver.getTitle();
		waitFor(2);
		return title;
	}
	public String getText(WebElement we) {
		return we.getText();
	}
	public String getAtrributeValue(WebElement we) {
		return we.getAttribute("value");
	}
	public String getAtrributeValue1(WebElement we) {
		return we.getAttribute("aria-checked");
	}
	public String getAtrributeclass(WebElement we) {
		return we.getAttribute("class");
	}
	public String getimgs(WebElement we) {
		return we.getAttribute("ng-src");
	}
	public String getAttributeimg(WebElement we) {
		return we.getAttribute("src");
	}
	public void sendKeys(WebElement we, String input) {
		Actions actions = new Actions(driver);
		actions.moveToElement(we);
		actions.click();
		actions.sendKeys(input);
		actions.build().perform();
		waitFor(2);
	}
	public void clearContent(WebElement element){
		            element.sendKeys(Keys.CONTROL + "a");
					element.sendKeys(Keys.CONTROL + "x"); 
					element.clear();
		}
	
	
	public void selectByIndex(int index) {
		  getSelect().selectByIndex(index);
		}
	
	private Select getSelect() {
		// TODO Auto-generated method stub
		return null;
	}
	public void click(WebElement we) {
		Actions action = new Actions(this.driver);
		action.moveToElement(we).perform();
		action.click(we).build().perform();
		waitFor(2);
	}
	public void click1(WebElement we) {
		we.click();
		waitFor(1);
	}
	
	public void scrollTo(WebElement e)  {
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", e);
		
		} catch (Exception exc) {
			exc.printStackTrace();
			
		}

	} 
	
	public Boolean enablebuttons(WebElement enable) {
		return enable.isEnabled();
	}
	public Boolean displayedtext1(WebElement displayed) {
		return displayed.isDisplayed();
	}
	public void displayedtext(WebElement displayed) {
		displayed.isDisplayed();
	}
	public boolean isselectedcheckbox(WebElement selected) {
		 return selected.isSelected();
	}
	public void windowScrollDown(int pixel) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,"+pixel+")", "");
		waitFor(3);
	}
	
	public void windowScrollTop() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		waitFor(3);
	}
	
	public void sendKeysTab(WebElement we) {
		we.sendKeys(Keys.TAB);
		waitFor(1);
	}

	
	
	public void sendKeysWebDriver(WebElement we, String input) {
		we.sendKeys(input);
		waitFor(1);
	}
	
	public void sendKeysJavascriptExecutor(String id, String input) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('"+id+"').setAttribute('value', '"+input+"')");
		waitFor(1);
	}

	
	
	public WebDriver getDriver() {
		return driver;
	}

	public boolean waitForElementToBeVisible(WebElement element) throws  Exception {
		WebDriverWait wait = new WebDriverWait(this.driver, Long.parseLong(readProperty("implicitwait")));
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	public void waitForElementToBeVisible1(WebElement elementName) throws  Exception {
		try {
		WebDriverWait wait=new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOf(elementName));
		}catch (Exception e) {
			
		}
		
	}

	public void waitFor(int timeInSeconds) {
		try {
			Thread.sleep(timeInSeconds * 1000);
		} catch (InterruptedException e) {
		}
	}
	
	
	
	
	

}


package com.McD.qa.Base;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.McD.qa.Extentreport.Extentreport;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest extends Extentreport {
	//Logger log = Logger.getLogger(BaseTest.class);
	@BeforeClass
	@Parameters("browser")
	public void setup(String browser) {
  
      // Init chromedriver

System.setProperty("webdriver.chrome.driver", "C:/automation_us/dep/dep/Drivers/chromedriver.exe");
ChromeOptions options = new ChromeOptions();
            options.addArguments("enable-automation");
            options.addArguments("--incognito");
            options.addArguments("--headless");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-extensions");
            options.addArguments("--dns-prefetch-disable");
            options.addArguments("--disable-gpu");
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--verbose");
//WebDriver driver = new ChromeDriver(options);

           // DesiredCapabilities capabilities = new DesiredCapabilities ();
			//capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			driver = new ChromeDriver(options);
		//driver.get("https://www.google.com");
		/* if (browser.equalsIgnoreCase("firefox")) {
			try {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		else if (browser.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
			
			/* WebDriverManager.chromedriver().setup();		
			ChromeOptions options = new ChromeOptions ();
			options.addExtensions (new File("C:\\Users\\chvennap\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Extensions\\digfbfaphojjndkpccljibejjbppifbc/0.4.7_0.crx"));
			DesiredCapabilities capabilities = new DesiredCapabilities ();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			driver = new ChromeDriver(capabilities);*/
			
			/*System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//Drivers//chromedriver");
            driver = new ChromeDriver();*/
			
			/*chrome_options = Options();
					chrome_options.add_argument("--headless");
					chrome_options.add_argument("--no-sandbox");
					chrome_options.add_argument("--disable-dev-shm-usage");
					d = webdriver.Chrome("\\Drivers\\chromedriver.exe",chrome_options=chrome_options);*/
			//log.info("Chrome Opened");
			//ChromeOptions options = new ChromeOptions();
			//options.setHeadless(true);
			//options.addArguments("headless");
			/*options.addArguments("no-sandbox");
			options.addArguments("--whitelisted-ips");*/
			//options.addArguments("disable-infobars");
			//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
			//WebDriverManager.chromedriver().setup();
			//WebDriver driver = new ChromeDriver();
		
			//driver.get("http://www.google.com");
			
			/*final ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setBinary("/usr/bin/chromium-browser");
			chromeOptions.addArguments("--headless");
			desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
			WebDriver driver = new RemoteWebDriver(url, desiredCapabilities);*/
			
	        /*System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
            //driver = new ChromeDriver();
            //driver.get(TestUtils.property(file, "URL"));
            ChromeOptions options = new ChromeOptions();
            options.addArguments("enable-automation");
            options.addArguments("--incognito");
            options.addArguments("--headless");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-extensions");
            options.addArguments("--dns-prefetch-disable");
            options.addArguments("--disable-gpu");
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--verbose");
            
            DesiredCapabilities capabilities = new DesiredCapabilities ();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			driver = new ChromeDriver(capabilities); */
            
            /*
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
            options.addArguments("start-maximized");
            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
            driver=new ChromeDriver(capabilities);*/
			
			
			
		
	}

}

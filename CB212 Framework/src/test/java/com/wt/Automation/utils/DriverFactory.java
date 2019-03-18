package com.wt.Automation.utils;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DriverFactory {

  public static WebDriver driver = null;
  public static WebDriverWait waitVar = null;

  public static String baseURL;
  public static String systemPropFileName;
  public static Properties systemproperties;
  private final static String CHROME = "chrome";
  private final static String FIREFOX = "firefox";
  private final static String InternetExplorer = "iexplore";
  private final static String HTMLUNIT = "htmlunit";
  public DesiredCapabilities caps = null;

  /**
   *  This function is to invoke Selenium Webdriver
 * @return 
 * @throws Exception 
   * 
   * @throws MalformedURLException
   * @throws InterruptedException
   */
  public WebDriver createDriver() throws Exception  {
   	  
	  String BrowserType = getproperty("browserType");
	   if(BrowserType.equals("firefox")){
		   
		   DesiredCapabilities caps = DesiredCapabilities.firefox();

           FirefoxOptions ffOpts = new FirefoxOptions();
           FirefoxProfile ffProfile = new FirefoxProfile();
           ffProfile.setPreference("browser.autofocus", true);
           ffProfile.setPreference("browser.tabs.remote.autostart.2", false);
          caps.setCapability(FirefoxDriver.PROFILE, ffProfile);
           caps.setCapability("marionette", true);
		   System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
			driver=new FirefoxDriver(ffOpts.merge(caps));
			   
		}else if(BrowserType.equals("iexplore")){
			caps = DesiredCapabilities.internetExplorer();
            InternetExplorerOptions ieOpts = new InternetExplorerOptions();
            ieOpts.requireWindowFocus();
            ieOpts.merge(caps);
            caps.setCapability("requireWindowFocus", true);
			System.setProperty("webdriver.ie.driver", "src/test/resources/drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver(ieOpts.merge(caps));
			
		}else if(BrowserType.equals("Chrome")){
			DesiredCapabilities caps = DesiredCapabilities.chrome();
			ChromeOptions chOptions = new ChromeOptions();
            Map<String, Object> chromePrefs = new HashMap<String, Object>();

            chromePrefs.put("credentials_enable_service", false);

            chOptions.setExperimentalOption("prefs", chromePrefs);
            chOptions.addArguments("--disable-plugins", "--disable-extensions", "--disable-popup-blocking");
            chOptions.setExperimentalOption("useAutomationExtension", false);
            caps.setCapability(ChromeOptions.CAPABILITY, chOptions);
            caps.setCapability("applicationCacheEnabled", false);
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver(chOptions.merge(caps));
	}
    
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    baseURL = getproperty("targetURL");
    driver.get(baseURL);
    return driver;
  }
  
  /**
   *  This function will initialize wait object
   */
  public static void waitVar(){
	  waitVar = new WebDriverWait(driver, 15);
  }

  /**
   * This function is to close driver instance
   */
  public void teardown() {
    driver.quit();
  }
  
  /**
   * Return the drivers
   * @return
 * @throws Exception 
 * @throws InterruptedException 
 * @throws MalformedURLException 
   */
  public WebDriver getDriver() throws Exception  {
      if (driver == null) {
          driver = createDriver();
      }
     
      return driver;
  }
    
    public static String getproperty(String propertyName){
    	Properties syspro = new Properties();
    	try {
			syspro.load(new FileInputStream(System.getProperty("user.dir") + "/" + "system.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	String property = syspro.getProperty(propertyName);
    	return property;
    }
    
    
      
    
}

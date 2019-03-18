package com.wt.Automation.pages;

import java.io.IOException;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wt.Automation.utils.DriverFactory;

public class RWEHomePage {
	
	public RWEHomePage() {
		// TODO Auto-generated constructor stub
	}
		//WebDriver driver;
		private static Logger logger = Logger.getLogger(RWEHomePage.class);
	    public static WebDriver driver;
	    public CommonBase commonsteps;
	    
	    private static final String UserID = "//*[@id='mainBody']/div[1]/div[1]/nav/div/ul/li/a";    
	    @FindBy(xpath = UserID)
	    private WebElement userID;
	    
	   		
	    private static final String WTLOGO = "//img[@src='app/lzweb/images/wt.png']";
	    @FindBy(xpath=WTLOGO)
	    private WebElement WTLogo;
	    
	    public RWEHomePage(DriverFactory driverfactory) throws Exception {
	    	  driver = driverfactory.getDriver();
	    	  PageFactory.initElements(driver, this);
	    	 
	    }
	    
	   	    
	    public void loadPage(){
	    	
	    	driver.navigate().refresh();
	    }
	    
	    public String getRWETitlePage(){
	    	String title = driver.getTitle();
	    	return title;
	    }
	    
	    public void navigateToWTLogo(){
	    	CommonBase.waitForElementToLoad(WTLogo, driver);
			WTLogo.click();
	    }
	    
	    
	       
	    

}

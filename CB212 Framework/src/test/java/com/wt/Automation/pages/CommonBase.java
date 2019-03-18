package com.wt.Automation.pages;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wt.Automation.utils.DriverFactory;

public class CommonBase {

	public static WebDriver driver;
	public static String mainWindow;

	public CommonBase(DriverFactory driverfactory) throws Exception {
		driver = driverfactory.getDriver();
		PageFactory.initElements(driver, this);

	}

	/**
	 * waitForWebElement
	 * 
	 * @param webElement
	 * @return
	 */
	public static boolean waitForElementToLoad(WebElement webElement, WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(webElement));
			
			return true;
		} catch (TimeoutException e) {
			return false;
		}

	}

	public static void waitforsecond(int timeout) {
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	}
	
	public static void sleep(){
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	



}

package com.wt.Automation.pages;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wt.Automation.utils.DriverFactory;



public class RWELoginpage
{
	
	//WebDriver driver;
	private static Logger logger = Logger.getLogger(RWELoginpage.class);
    public static WebDriver driver;
    public CommonBase commonsteps;
    public RWEHomePage rwehomepage;
    
    private static final String USERNAME_ID = "userNameId_input";    
    @FindBy(id = USERNAME_ID)
    private WebElement username;

    private static final String PASSWORD_ID = "passwdId_input";    
    @FindBy(id = PASSWORD_ID)
    private WebElement password;

    private static final String SIGN_ID = "SignIn";    
    @FindBy(id = SIGN_ID)
    private WebElement sign;
    
    private static final String SECQUESTION = "challengeQuestionLabelId";
    @FindBy(id=SECQUESTION)
    private static WebElement secquestion;
    
    private static final String PAGEID="signInOptumID";
    @FindBy(id = PAGEID)
    private WebElement Title;
  
   private static final String SECURITYPASSWORD = "//*[@class='challengeSecurityUserAnswerInput']";
   @FindBy(xpath=SECURITYPASSWORD)
   static WebElement Securitypassword; 
   
   @FindBy(xpath="//*[@id='authQuesSubmitButton']")
   static WebElement NextButton;
	
	@FindBy(xpath=".//label[@id='challengeQuestionLabelId']")
	static WebElement question1; 
	
	private static String unrecognized_device = "Unrecognized Device - Optum ID";
	private static String  sports_team	= "Who is your favorite sports team?";
	private static String childhood_name	= "What is your childhood nickname? ?";
	private static String city = "What is the city and state of your birth? ?";
	
    public RWELoginpage(DriverFactory driverfactory) throws Exception {
  	  driver = driverfactory.getDriver();
  	  PageFactory.initElements(driver, this);
  	 
  	}
	
		
	public void typeUserName(String userName){
		CommonBase.waitForElementToLoad(username, driver);
		username.sendKeys(userName);
	}
	
	public void typePassword(String Password){
		CommonBase.waitForElementToLoad(password, driver);
		password.sendKeys(Password);
	}
	
	public void clickOnSignIn(){
		CommonBase.waitForElementToLoad(sign, driver);
		sign.click();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(driver.getTitle());
		if(driver.getTitle().equalsIgnoreCase("Unrecognized Device - Optum ID")){
			System.out.println("Moving to Security Page");
			isSecurityPageEnable();
		}
	}
	
	/***
	 * Login to RWE Application
	 */
    public void LoginToRWE(String user, String Pass){
    	typeUserName(user);
    	typePassword(Pass);
    	clickOnSignIn();
    	
    }
    
    public void verifyTitle(){
    	Assert.assertTrue(Title.getText().equalsIgnoreCase("Sign In With Your Optum ID"));
    }
    
    
    public static void isSecurityPageEnable(){
    	
    	
		
		String pagetitle = driver.getTitle().toString();
		
				
		if(pagetitle.equalsIgnoreCase(unrecognized_device))
		{
		   	
			String question = secquestion.getText();
			System.out.println(question);
			
					
			if(question.equals(sports_team))
			{
				Securitypassword.sendKeys("pakistan");
				driver.findElement(By.xpath("//*[@id='ac']")).click();
				NextButton.click();
			}
			
			if(question.equals(childhood_name))
			{
				Securitypassword.sendKeys("jammy");
				driver.findElement(By.xpath("//*[@id='ac']")).click();
				NextButton.click();
			}
			
			if(question.equals(city))
			{
				Securitypassword.sendKeys("trichy");
				driver.findElement(By.xpath("//*[@id='ac']")).click();
				NextButton.click();
			}
			
			
			
		}
	  
    	
    }
}


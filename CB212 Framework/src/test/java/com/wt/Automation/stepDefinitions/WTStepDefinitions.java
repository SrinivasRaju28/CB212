package com.wt.Automation.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.wt.Automation.pages.CommonBase;
import com.wt.Automation.pages.RWEHomePage;
import com.wt.Automation.pages.RWELoginpage;
import com.wt.Automation.pages.WeeklyTrackerHomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class WTStepDefinitions {
	
	
	private final RWELoginpage rweloginpage;
	private final RWEHomePage rwehomepage;
	private final WeeklyTrackerHomePage wthomepage;
	private final CommonBase commonbase;
	public static WebDriver driver;

    public WTStepDefinitions(RWELoginpage rweloginpage, RWEHomePage rwehomepage, WeeklyTrackerHomePage wthomepage, CommonBase commonbase) {
    	this.rweloginpage = rweloginpage;
    	this.rwehomepage = rwehomepage;
    	this.wthomepage = wthomepage;
    	this.commonbase = commonbase;
    }
	
	@Given("^CB As a CB user is in Cohort Builder login page$")
	public void CB_As_a_CB_user_is_in_Cohort_Builder_login_page()  {
	    
		rweloginpage.verifyTitle();
		
	}

	@When("^WT Enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void wt_Enter_username_as_and_password_as(String username, String password)  {
	   rweloginpage.typeUserName(username);
	   rweloginpage.typePassword(password);
	}

	@Then("^WT Click on Login button$")
	public void wt_Click_on_Login_button() throws Throwable {
		 rweloginpage.clickOnSignIn();
	}

	
	@Then("^WT User should able to login successfully with \"([^\"]*)\"$")
	public void wt_User_should_able_to_login_successfully_with(String msg) {
		rwehomepage.loadPage();
	    Assert.assertTrue(rwehomepage.getRWETitlePage().equalsIgnoreCase(msg));
	}

	@Then("^WT Logout$")
	public void wt_Logout() {
	    
	}


	
	@Then("^WT navigate to WT HomePage$")
	public void wt_navigate_to_WT_HomePage()  {
	  
		rwehomepage.navigateToWTLogo();
		wthomepage.switchToWTwindowPage();
		
	}
	
	@Given("^WT click on new report$")
	public void wt_click_on_new_report()  {
	    wthomepage.clickonNewReport();
	}

	@Given("^WT click on Create From New Cohort$")
	public void wt_click_on_Create_From_New_Cohort() {
		wthomepage.clickonNewCohort();
		
	}
	
	@Then("^ATF wait for (\\d+) seconds$")
	public void atf_wait_for_seconds(int timeout)  {
	    CommonBase.waitforsecond(timeout);
	}
	
	@Given("^WT enter Cohort title as \"([^\"]*)\"$")
	public void wt_enter_Cohort_title_as(String title)  {
	    wthomepage.enterTitle(title);
	}

	@Given("^WT enter Therapeutic Area as \"([^\"]*)\"$")
	public void wt_enter_Therapeutic_Area_as(String therapeutic)  {
	    wthomepage.enterTherapeuticArea(therapeutic);
	}

	@Given("^WT enter Descriiption as \"([^\"]*)\"$")
	public void wt_enter_Descriiption_as(String desc)  {
	    
		wthomepage.enterDescription(desc);
	   
	}

	@Given("^WT click on next button$")
	public void wt_click_on_next_button() {
	   wthomepage.clickOnNextButton();
	}
	
	@Given("^WT select DataSource$")
	public void wt_select_DataSource()  {
	    wthomepage.datasource();
	}

	@Given("^WT select Timeperiod$")
	public void wt_select_Timeperiod() {
		wthomepage.selectDate();
		CommonBase.sleep();
		wthomepage.selectDate();
	}
	
	@Given("^WT select CohortType$")
	public void wt_select_CohortType()  {
	    wthomepage.cohorttype();
	}
	
	@Given("^WT click on Cohort next button$")
	public void wt_click_on_Cohort_next_button()  {
		CommonBase.sleep();
	    wthomepage.cohertNextButton();
	}
	
	@Given("^WT select CoverageSelections$")
	public void wt_select_CoverageSelections()  {
		CommonBase.sleep();
	    wthomepage.CoverageSelections();
	}
	
	@Given("^WT select MedSelections$")
	public void wt_select_MedSelections()  {
		CommonBase.sleep();
	    wthomepage.MedSelections();
	}
	
	@Given("^WT select GenerateCohort$")
	public void wt_select_GenerateCohort()  {
		CommonBase.sleep();
	    wthomepage.GenerateCohort();;
	}



}

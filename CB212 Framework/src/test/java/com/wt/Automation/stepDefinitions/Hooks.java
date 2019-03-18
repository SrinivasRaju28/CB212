package com.wt.Automation.stepDefinitions;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import com.wt.Automation.utils.DriverFactory;

import cucumber.api.Scenario;



public class Hooks {

 DriverFactory df = new DriverFactory();

@Before
  public void beforeScenario() throws Exception{

  df.createDriver();
  }

@After
  public void afterScenario(Scenario scenario) throws WebDriverException, Exception{
	     if(scenario.isFailed()){
	     scenario.embed(((TakesScreenshot)df.getDriver()).getScreenshotAs(OutputType.BYTES), "image/png");
        }
  df.teardown();
  }



}
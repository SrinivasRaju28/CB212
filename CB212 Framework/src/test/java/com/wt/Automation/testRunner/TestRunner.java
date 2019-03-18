package com.wt.Automation.testRunner;


import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		strict = true,
	    dryRun = false,
	    monochrome = true,
	    snippets = SnippetType.CAMELCASE,
        features = "src/test/resources/features",
        format = {"html:target/site/cucumber-pretty","json:target/cucumber.json",
		"junit:target/junit/all_tests.xml" },
        glue = "com.wt.Automation.stepDefinitions",
        plugin = {"pretty","com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},
        tags={"@tag1"}				
		
) 
public class TestRunner {
	
	@AfterClass
    public static void setup() {
	
	        Reporter.loadXMLConfig(new File(System.getProperty("user.dir")+"/extent-config.xml"));
	        Reporter.setSystemInfo("user", System.getProperty("user.name"));
	        Reporter.setSystemInfo("os", "Windows");
	        Reporter.setSystemInfo("Browser Name", "Firefox");
	        Reporter.setTestRunnerOutput("Running Web ApplicationTestcases Test Executions");

	}  	

}

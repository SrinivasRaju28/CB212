$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("WTLoginTestcases.feature");
formatter.feature({
  "line": 2,
  "name": "Weekly Tracker Login Funcationality",
  "description": "I want to use this template to test Weekly Tracker Login Funcationlity",
  "id": "weekly-tracker-login-funcationality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@WT"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Login to Weekly Tracker Application",
  "description": "",
  "id": "weekly-tracker-login-funcationality;login-to-weekly-tracker-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "WT As a WT user is in Weekly Tracker login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "ATF wait for 5 seconds",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "WT Enter username as \"sraju15\" and password as \"Mar12345\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "WT Click on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "WT User should able to login successfully with \"Real World Evidence\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "ATF wait for 10 seconds",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "WT navigate to WT HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "ATF wait for 10 seconds",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "WT click on new report",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "WT click on Create From New Cohort",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "WT enter Cohort title as \"Testauto33\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "WT enter Therapeutic Area as \"Testauto12\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "WT enter Descriiption as \"TestAutomation\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "WT click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "WT select DataSource",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "WT select Timeperiod",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 23,
      "value": "#And WT select CohortType"
    }
  ],
  "line": 24,
  "name": "WT click on Cohort next button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "WT select CoverageSelections",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "WT select MedSelections",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "WT select GenerateCohort",
  "keyword": "And "
});
formatter.match({
  "location": "WTStepDefinitions.wt_As_a_WT_user_is_in_Weekly_Tracker_login_page()"
});
formatter.result({
  "duration": 21117664144,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 13
    }
  ],
  "location": "WTStepDefinitions.atf_wait_for_seconds(int)"
});
formatter.result({
  "duration": 7129295,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sraju15",
      "offset": 22
    },
    {
      "val": "Mar12345",
      "offset": 48
    }
  ],
  "location": "WTStepDefinitions.wt_Enter_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 325164879,
  "status": "passed"
});
formatter.match({
  "location": "WTStepDefinitions.wt_Click_on_Login_button()"
});
formatter.result({
  "duration": 10652660788,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Real World Evidence",
      "offset": 48
    }
  ],
  "location": "WTStepDefinitions.wt_User_should_able_to_login_successfully_with(String)"
});
formatter.result({
  "duration": 2658032991,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 13
    }
  ],
  "location": "WTStepDefinitions.atf_wait_for_seconds(int)"
});
formatter.result({
  "duration": 4919698,
  "status": "passed"
});
formatter.match({
  "location": "WTStepDefinitions.wt_navigate_to_WT_HomePage()"
});
formatter.result({
  "duration": 21902863451,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 13
    }
  ],
  "location": "WTStepDefinitions.atf_wait_for_seconds(int)"
});
formatter.result({
  "duration": 39332148,
  "status": "passed"
});
formatter.match({
  "location": "WTStepDefinitions.wt_click_on_new_report()"
});
formatter.result({
  "duration": 841655631,
  "status": "passed"
});
formatter.match({
  "location": "WTStepDefinitions.wt_click_on_Create_From_New_Cohort()"
});
formatter.result({
  "duration": 6869405649,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Testauto33",
      "offset": 26
    }
  ],
  "location": "WTStepDefinitions.wt_enter_Cohort_title_as(String)"
});
formatter.result({
  "duration": 1282639358,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Testauto12",
      "offset": 30
    }
  ],
  "location": "WTStepDefinitions.wt_enter_Therapeutic_Area_as(String)"
});
formatter.result({
  "duration": 200209391,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TestAutomation",
      "offset": 26
    }
  ],
  "location": "WTStepDefinitions.wt_enter_Descriiption_as(String)"
});
formatter.result({
  "duration": 218620925,
  "status": "passed"
});
formatter.match({
  "location": "WTStepDefinitions.wt_click_on_next_button()"
});
formatter.result({
  "duration": 125832189,
  "status": "passed"
});
formatter.match({
  "location": "WTStepDefinitions.wt_select_DataSource()"
});
formatter.result({
  "duration": 1797978953,
  "status": "passed"
});
formatter.match({
  "location": "WTStepDefinitions.wt_select_Timeperiod()"
});
formatter.result({
  "duration": 15204785710,
  "status": "passed"
});
formatter.match({
  "location": "WTStepDefinitions.wt_click_on_Cohort_next_button()"
});
formatter.result({
  "duration": 15114168829,
  "status": "passed"
});
formatter.match({
  "location": "WTStepDefinitions.wt_select_CoverageSelections()"
});
formatter.result({
  "duration": 183565789474,
  "status": "passed"
});
formatter.match({
  "location": "WTStepDefinitions.wt_select_MedSelections()"
});
formatter.result({
  "duration": 149748099730,
  "status": "passed"
});
formatter.match({
  "location": "WTStepDefinitions.wt_select_GenerateCohort()"
});
formatter.result({
  "duration": 513749649237,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for element to be clickable: Proxy element for: DefaultElementLocator \u0027By.xpath: //img[@src\u003d\u0027/wt/app/common/images/export.png\u0027]\u0027 (tried for 200 second(s) with 500 MILLISECONDS interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:82)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:231)\r\n\tat com.wt.Automation.pages.WeeklyTrackerHomePage.GenerateCohort(WeeklyTrackerHomePage.java:479)\r\n\tat com.wt.Automation.stepDefinitions.WTStepDefinitions.wt_select_GenerateCohort(WTStepDefinitions.java:148)\r\n\tat ✽.And WT select GenerateCohort(WTLoginTestcases.feature:27)\r\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//img[@src\u003d\u0027/wt/app/common/images/export.png\u0027]\"}\n  (Session info: chrome\u003d64.0.3282.186)\n  (Driver info: chromedriver\u003d2.35.528161 (5b82f2d2aae0ca24b877009200ced9065a772e73),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.7.1\u0027, revision: \u00278a0099a\u0027, time: \u00272017-11-06T21:01:39.354Z\u0027\nSystem info: host: \u0027LH7U05CG62521XW\u0027, ip: \u002710.198.53.154\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_91\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.35.528161 (5b82f2d2aae0ca..., userDataDir: C:\\Users\\sraju15\\AppData\\Lo...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 64.0.3282.186, webStorageEnabled: true}\nSession ID: cc71049826e13c288db1f7b72101e041\n*** Element info: {Using\u003dxpath, value\u003d//img[@src\u003d\u0027/wt/app/common/images/export.png\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:370)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:472)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.isDisplayed(Unknown Source)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.elementIfVisible(ExpectedConditions.java:301)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$100(ExpectedConditions.java:43)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:287)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:284)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$23.apply(ExpectedConditions.java:672)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$23.apply(ExpectedConditions.java:668)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:208)\r\n\tat com.wt.Automation.pages.WeeklyTrackerHomePage.GenerateCohort(WeeklyTrackerHomePage.java:479)\r\n\tat com.wt.Automation.stepDefinitions.WTStepDefinitions.wt_select_GenerateCohort(WTStepDefinitions.java:148)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:678)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)\r\n",
  "status": "failed"
});
});
@WT
Feature: Weekly Tracker Login Funcationality
  I want to use this template to test Weekly Tracker Login Funcationlity

  @tag1
  Scenario: Login to Weekly Tracker Application
    Given WT As a WT user is in Weekly Tracker login page
    Then ATF wait for 5 seconds
    When WT Enter username as "ajameeru" and password as "Welcome2011"
    Then WT Click on Login button
    Then WT User should able to login successfully with "Real World Evidence"
    Then ATF wait for 10 seconds
    Then WT navigate to WT HomePage
    Then ATF wait for 10 seconds
    And WT click on new report
    And WT click on Create From New Cohort
    And WT enter Cohort title as "Testauto0601"
    And WT enter Therapeutic Area as "Testauto12"
    And WT enter Descriiption as "TestAutomation"
    And WT click on next button
    And WT select DataSource
    And WT select Timeperiod
    #And WT select CohortType
    And WT click on Cohort next button
    And WT select CoverageSelections
    And WT select MedSelections
    And WT select GenerateCohort

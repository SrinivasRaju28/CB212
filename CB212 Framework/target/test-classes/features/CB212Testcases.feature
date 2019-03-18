@CB
Feature: CB 2.12 Test cases
  I want to use this template to test CB2.12 Funcationlity

  @tag1
  Scenario: Login to Cohort Builder Application
    Given CB As a CB user is in Cohort Builder login page
    Then ATF wait for 5 seconds
    When CB Enter username as "ajameeru" and password as "Welcome2011"
    Then CB Click on Login button
    Then CB User should able to login successfully with "Real World Evidence"
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
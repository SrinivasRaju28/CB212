@LoginToGit
Feature: login To Git Page
  In order to test login page
  As a Registered user
  I want to specify the login conditions

  Scenario: login without username and password
    Given user is on github homepage
    When user clicks on Sign in button
    Then user is displayed login screen
    When user clicks Sign in button
    Then user gets an error message "Incorrect username or password."
    
  Scenario: login without username and password
    Given user is on github homepage
    When user clicks on Sign in button
    Then user is displayed login screen
    When user clicks Sign in button
    Then user gets an error message "Incorrect username or password." 
    Then user gets an error message "(<p>|<p>|<p>|<p>|<p>|<p>|.*?)"
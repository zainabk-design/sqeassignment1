Feature: Test login functionality

  Scenario: Check login is successful with valid credentials
    Given browers is open
    And user is on login page
    When user enters username and password
    And user clicks in login
    Then user is navigated to the home page

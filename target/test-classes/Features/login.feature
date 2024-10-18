Feature: feature to test login functionality

  Scenario: Check login is succcessful with valid credentials
    Given user is on login page
    When user enters username and password
    And clisks on login button
    Then user is navigated to the home page

  #Scenario Outline: Check login is succcessful with valid credentials
    #Given user is on login page
    #When user enters <username> and <password>
    #And clisks on login button
    #Then user is navigated to the home page

    #Examples: 
      #| username | password |
      #| user1    | pass1    |
      #| user2    | pass2    |

Feature: Test Login functionality

  Scenario: check login is sucessful with valid credentials
    Given browser is open
    And user is on login page
    When user enters valid usename and password
    And user clicks on login
    Then user is navigated to home page

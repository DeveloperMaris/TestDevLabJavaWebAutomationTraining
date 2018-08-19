Feature: This feature is about logging into the system

  Scenario: Successful login
    Given I have created account
    When I navigate to Login page
        And I enter Email address in Login Page
        And I enter Password in Login Page
        And I select Remember me in Login Page
        And I select Login button in Login Page
    Then user account page is opened
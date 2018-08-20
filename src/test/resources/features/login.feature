Feature: This feature is about logging into the system

  Scenario: Successful login
    Given I have opened homepage
      And I am in Signup form
      And I have created new account
      And I select User Account button
      And I logout
    When I select My account menu
      And I select Login button in Landing page
      And I enter Email address in Login Page
      And I enter Password in Login Page
      And I select Login button in Login Page
    Then user account page is opened
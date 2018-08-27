Feature: This feature is about logging into the system

  Scenario: Successful login
    Given Landing page is opened
      And I am in Signup form
      And Sign Up page is opened
      And I have created new account
      And user account page is opened
      And I select User Account button
      And I logout
    When I select My Account button in Navigation bar
      And I select Login button in Landing page
      And Login page is opened
      And I enter Email address in Login Page
      And I enter Password in Login Page
      And I select Login button in Login Page
    Then user account page is opened
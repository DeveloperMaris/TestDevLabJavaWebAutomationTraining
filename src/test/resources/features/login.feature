Feature: This feature is about logging into the system

  Scenario: Successful login
    Given I have opened homepage
    When I select My account menu
    And I select Login button
    And I enter Email address
    And I enter Password
    And I select Remember me
    And I select Login button
    Then user account page is opened
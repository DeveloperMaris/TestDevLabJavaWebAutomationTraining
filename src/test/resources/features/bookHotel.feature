Feature: This feature is about booking a hotel

  Scenario: Successful hotel booking
    Given I have opened homepage
    And I am in Signup form
    And Sign Up page is opened
    And I have created new account
    And user account page is opened
    When I select Home button in Navigation bar
    # rename this step, like "landing page is opened"
    And I have opened homepage
    And I select book Hotels button
    And I enter Rendezvous Hotels hotel
    And Correct amount of hotels are found
    And I select hotel located in Singapore
    And I select 01.09.2018 as Check in date
    And I select 07.09.2018 as Check out date
    And I select 2 Adult and 2 Children
    And I select Search button
    And Hotel details page is opened
    And Hotel details are correct
    And I select Junior Suites room
    And Booking confirmation page is opened
    And Personal data are correct
    And I select “Confirm this booking” button
    Then Unpaid invoice page is opened

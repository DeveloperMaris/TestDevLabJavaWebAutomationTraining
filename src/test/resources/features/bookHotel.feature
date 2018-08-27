Feature: This feature is about booking a hotel

  # HOMEWORK 4
  @TEST
  Scenario: Successful hotel booking
    Given Landing page is opened
      And I select My Account button in Navigation bar
      And I select Sign Up button in Navigation bar
      And Sign Up page is opened
      And I have created new account
      And user account page is opened
    When I select Home button in Navigation bar
      And Landing page is opened
      And I select book Hotels button
      And I enter Rendezvous Hotels hotel
      And correct amount of hotels is found
      And I select hotel that is located in Singapore
      And I select 01.09.2019 as Check in date
      And I select 07.09.2019 as Check out date
      And I select 2 Adult and 2 Child
      And I select Search button
      And Hotel details page is opened
      And Hotel details are correct
      And I select Junior Suites room
      And Booking confirmation page is opened
      And Personal data is correct
      And Hotel data is correct
      And I select CONFIRM THIS BOOKING button
    Then Unpaid invoice page is opened
      And Hotel details are correct in Invoice page

@VehicleCosts
Feature: As a user, I want to manage filters on the Marketing page
  Background: User is already in the log in page
  Given User is on the login page

  #
@TCO1
  Scenario Outline:  As a user, I want to manage filters on the Marketing page
    Given The user logged in as "<userType>"
    When User hovers "Fleet" option
    And User clicks on "Vehicle costs" option
    Then User should see "TYPE, TOTAL PRICE, DATE"
      | Type          |
      | Total Price   |
      | Date          |


    Examples:
      | store Manager|
      | sales Manager|



  Scenario Outline: As a user, I want to verify that users can check the first checkbox to select "All vehicle cost"
  Given The user logged in as "<userType>"
  When User hovers "Fleet" option
  And User clicks on "Vehicle costs" option
  Then User should be able to check the first checkbox to select all vehicle costs.

  Examples:
      | store Manager|
      | sales Manager|







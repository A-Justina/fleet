@B33G10-76
Feature: Odometer functionalities

    Background: User is already in the log in page
      #@B33G10-72
    Given User is on the login page

      @B33G10-73
      Scenario Outline: Login as a Store Manager and Sales Manager and verify that do not have a  permit
        Given the user logged in as "<userType>"
        When User is Hover over the Fleet button
        And User clicks the Vehicle Odometer button
        Then User sees the error message "You do not have permission to perform this action."
        Examples:
          | userType      |
          | Store Manager |
          | Sales Manager |

  @B33G10-74
  Scenario: As a driver, I want to view car odometer info
    Given the user logged in as "driver"
    When User clicks driver Fleet Button
    And User clicks driver Vehicle Odometer button
    Then Verify that user sees page as one by default

  @B33G10-75
  Scenario: As a driver, I want to view car odometer info on the Vehicles Odometer
    Given the user logged in as "driver"
    When User clicks driver Fleet Button
    And User clicks driver Vehicle Odometer button
    Then Verify that View Per Page twenty five are by default









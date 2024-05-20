@VehicleCosts
Feature: As a user, I want to manage filters on the vehicle Cost page
  Background: User is already in the log in page
  Given User is on the login page


@TCO1
  Scenario Outline:  As a user, I want to manage filters on the vehicle Cost page
  Given the user logged in as "<userType>"
  When user hovers over "Fleet" option
    And User clicks on "Vehicle costs" option.
    Then User should see "3 modules".
      | Type          |
      | Total Price   |
      | Date          |


    Examples:
      | userType |
      | Store Manager |
      # | Sales Manager |

  Scenario Outline: As a user, I want to verify that users can check the first checkbox to select "All vehicle cost"
    Given the user logged in as "<userType>"
    When user hovers over "Fleet" option
  And User clicks on "Vehicle costs" option.
  Then User should be able to check the first checkbox to select all vehicle costs.

  Examples:
    | userType |
    # | Store Manager |
    | Sales Manager |




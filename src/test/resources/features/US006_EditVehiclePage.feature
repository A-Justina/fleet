@naila
Feature: As a user, I want to see edit car info icons on the Vehicles page.


  Background: User is already in the log in page
    Given the user is on the login page
  #  Given the user logged in with username as "User1" and password as "UserUser123"

  Scenario Outline: As a user, I want to see edit car info icons on the Vehicles page.
    Given the user logged in as "<userType>"
    When user hovers over "Fleet" option
    And user clicks on "Vehicles" option
    And user hovers over 3 dots
    Then user should see "View, Edit, Delete"
     # | options |
     # | view    |
     # | edit    |
     # | delete  |

    Examples:
      | userType      |
     # | store manager |
      | sales manager |


  Scenario: As a driver, I want to see edit car info icons on the Vehicles page.
    Given the user logged in as "driver"
    When driver hovers over "Fleet" option
    And driver clicks on "Vehicles" option
    And user hovers over 3 dots
    Then user should see "view, edit, delete"





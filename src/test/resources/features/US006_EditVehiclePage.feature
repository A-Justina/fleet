@naila
Feature: As a user, I want to see edit car info icons on the Vehicles page.


  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: As a user, I want to see edit car info icons on the Vehicles page.
    Given the user logged in as "<userType>"
    When user hovers over "Fleet" option
    And user clicks on "Vehicles" option
    And user hovers over 3 dots
    Then user should see "options"
      | View    |
      | Edit    |
      | Delete  |


    Examples:
      | userType      |
      | store manager |
   #   | sales manager |
   #   | driver        |








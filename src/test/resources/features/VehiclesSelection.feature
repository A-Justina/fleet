@US007
Feature: Vehicle selection functionalities

  Background: User is already in the log in page
    Given User is on the login page

  Scenario Outline: As a user (Sales and Store manager), I should be able to select any vehicle from the
  Vehicles page (web table)
    Given the user logged in as "<userType>"
    When the user clicks the Vehicles page
    Then the user can see all the checkboxes are unchecked by default
    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |


  Scenario Outline: As a user, I want to be able to select all vehicles with the first checkbox
    Given the user logged in as "<userType>"
    When the user clicks the Vehicles page
    When the user selects the first checkbox
    Then all of the checkboxes become selected
    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |


  Scenario Outline: As a user, I want to be able to select any vehicle with any checkbox
    Given the user logged in as "<userType>"
    When the user clicks the Vehicles page
    When the user selects any checkbox
    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |
   # Then the corresponding vehicle is selected



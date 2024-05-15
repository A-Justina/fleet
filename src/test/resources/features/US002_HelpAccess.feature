@US002
Feature: Users should be able to access help page

  User Story: As a user, I should access to the Oroinc Documentation page.

  Background: User is already in the log in page
    Given the user is on the login page
#    Given the user logged in with username as "salesmanager101" and password as "UserUser123"

  Scenario Outline: verify that managers can access Vehicle Contracts page
    Given the user logged in as "<userType>"
    When the user clicks on question mark symbol
    Then the user should be redirected to the Oroinc Documentation page
    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |
      | Driver        |

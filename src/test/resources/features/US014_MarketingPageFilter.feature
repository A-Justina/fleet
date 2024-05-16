@MPF
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario Outline: As a user, I want to manage filters on the Marketing page.
      Given the user logged in as "<userType>"
      When user hovers over marketing button and click on campaigns
      And user click on the Manage Filters
      Then user should see all the five boxes are checked by default
    Examples:
      | userType |
      | Store Manager |
      | Sales Manager |





@VehCont
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

   Scenario: As a user, I want to access to Vehicle contracts page
     When I click on the Fleet link
     Then I should be able to access the Vehicle contract link and click on it
     And I should be able to access the Vehicle contract page


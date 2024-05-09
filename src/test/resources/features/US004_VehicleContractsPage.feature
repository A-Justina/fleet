
@VehCont
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

   Scenario Outline: As a user, I should verify that Store managers and Sales managers can access the Vehicle Contracts
   page.
     When user logged in as "<userType>"
     Then the user should be able to see url as "http://https://qa2.vytrack.com/entity/Extend_Entity_VehicleContract"
     And the user should be able to see expectedtitle as "All - Vehicle Contract - Entities - System - Car - Entities - System"

     Examples:
       | userType |
       | Store Manager |
       | Sales Manager |


     Scenario: Verify that Drivers can NOT access the Vehicle Contracts page and the app
     displays “You do not have permission to perform this action.”
       Given the user is on the login page
       When user logged in as "Store Manager"
       Then the user should be able to see url as "http://https://qa2.vytrack.com/entity/Extend_Entity_VehicleContract"
       Then the user should be able to see message as "You do not have permission to perform this action"


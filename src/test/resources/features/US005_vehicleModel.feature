@Vehicle
Feature: Vehicle Model Page

  User story: As a user, I want to view columns on the Vehicles Model page.

  Background: User is already in the log in page
    Given the user is on the login page
    #Given the user logged in with username as "storemanager51" and password as "UserUser123"
    #Given the user logged in with username as "User1" and password as "UserUser123"

  Scenario Outline: Verify that the Store manager and Sales manager can see ten columns on the
  Vehicle Model page.
    Given the user logged in as "<userType>"
    When user hovers over Fleet and clicks Vehicles button
    Then user sees ten columns of "Vehicle Model" page
      | MODEL NAME               |
      | MAKE                     |
      | CAN BE REQUESTED         |
      | CVVI                     |
      | CO2 FEE (/MONTH)         |
      | COST (DEPRECIATED)       |
      | TOTAL COST (DEPRECIATED) |
      | CO2 EMISSIONS            |
      | FUEL TYPE                |
      | VENDORS                  |





    Examples:
      | userType      |
      | Store Manager |
      #| Sales Manager |

@Vehicle2
  Scenario: Verify that Drivers cannot access the Vehicle Model page and see "You do not have permission to perform this action"
  message on the screen.
    Given the user logged in as "driver"
    When   user hovers over Fleet and clicks Vehicle Model button
    Then  user sees "You do not have permission to perform this action" message on the screen



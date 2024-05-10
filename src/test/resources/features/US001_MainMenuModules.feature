@Mert
Feature: As a user, I should be accessing all the main modules of the app.

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: As a user, I should verify that Store managers and Sales managers can see all 8 modules of the app
    Given the user logged in as "<userType>"
    Then the user see "8 module names"
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |

  Scenario: As a user I should verify if driver sees 4 modules
    Given the user logged in as "driver"
    Then the user sees "4 main modules"

      | Fleet      |
      | Customers  |
      | Activities |
      | System     |














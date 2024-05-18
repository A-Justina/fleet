@AccountsUS12
  Feature: As a user, I want to filter customers’ info on the Accounts page.

    Background: User is already in the log in page
      Given User is on the login page

      Scenario Outline: As a user, I want to filter customers' info on the Accounts page
        Given the user logged in as "<userType>"
        When user hovers over "Customers" option.
        And user clicks on "Accounts" option.
        And user clicks filter button.
        Then user should see "Account Name, Contact Name, Contact Email, Contact Phone, Owner, Business Unit, Created At, Updated At".

        Examples:
          | userType |
          | Store Manager |
          | Sales Manager |
@B33G10-87
Feature: Default

  Background:
		#@B33G10-85
    Given the user is on the login page


  @B33G10-86
  Scenario Outline: Editing car info icons from the Vehicle page verification
    Given the user logged in as "<userType>"
    When user hovers over "Fleet" option
    And user clicks on "Vehicles" option
    And user hovers over 3 dots
    Then user should see "options"
      | View   |
      | Edit   |
      | Delete |


    Examples:
      | userType      |
      | store manager |
  #    | sales manager |
  #    | driver        |
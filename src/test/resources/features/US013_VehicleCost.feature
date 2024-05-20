@B33G10-93
Feature: Default

	Background:
		#@B33G10-88
		 Given User is on the login page

	@B33G10-90
	Scenario Outline: Verification of manage filters on vehicle cost page
		Given the user logged in as "<userType>"
		  When user hovers over "Fleet" option
		    And User clicks on "Vehicle costs" option.
		    Then User should see "3 modules".
		      | Type          |
		      | Total Price   |
		      | Date          |
		
		
		    Examples:
		      | userType |
		      | Store Manager |
		      | Sales Manager |	


	@B33G10-92
	Scenario Outline: Verification of manage filters on vehicle cost page
		Given the user logged in as "<userType>"
		    When user hovers over "Fleet" option
		  And User clicks on "Vehicle costs" option.
		  Then User should be able to check the first checkbox to select all vehicle costs.
		
		  Examples:
		    | userType |
		    | Store Manager |
		    | Sales Manager |
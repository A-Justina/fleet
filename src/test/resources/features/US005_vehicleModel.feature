@B33G10-97
Feature: Default

	Background:
		#@B33G10-94
		Given the user is on the login page
		


	@B33G10-95
	Scenario Outline: Verification of columns on the Vehicle Model page
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
		      | CVVI                     |
		
		
		
		
		    Examples:
		      | userType      |
		      | Store Manager |
		      | Sales Manager |	


	@B33G10-96
	Scenario: Verification of columns on the Vehicle Model page
		Given the user logged in as "driver"
		    When   user hovers over Fleet and clicks Vehicle Model button
		    Then  user sees "You do not have permission to perform this action" message on the screen
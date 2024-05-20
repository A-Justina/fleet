@B33G10-83
Feature: Default

	Background:
		#@B33G10-80
		Given the user is on the login page


	@B33G10-81
	Scenario Outline: Calendar Error Messages Verification
		Given the user logged in as "<userType>"
		When user hovers over Activities and clicks Calendar Events button
		And user clicks Create Calendar Event button
		And user clicks on Repeat button
		Then verify that users see error messages when enter 134


		Examples:
			| userType      |
			| Store Manager |
			| Sales Manager |


	@B33G10-82
	Scenario: Calendar Error Messages Verification
		Given the user logged in as "driver"
		When driver hovers over Activities and clicks Calendar Events button
		And user clicks Create Calendar Event button
		And user clicks on Repeat button
		Then verify that users see error messages when enter 134
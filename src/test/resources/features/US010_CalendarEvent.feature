@B33G10-64
Feature: Calendar functionality

	User story: As a user, I want to type into the “Description” when I create a calendar event.

	Background: User is already in the log in page
		Given the user is on the login page


	Scenario Outline: Verify that the user can type in the calendar description field
		Given the user logged in as "<userType>"
		    When user hovers over Activities and clicks Calendar Events button
		    And user clicks Create Calendar Event button
		    And user is able to type a message in to Description field
		    Then user sees expected description in calendar event
		Examples:
			| userType      |
			| Store Manager |
			| Sales Manager |

	Scenario: Verify that the driver can type in the calendar description field
		Given the user logged in as "driver"
		When driver hovers over Activities and clicks Calendar Events button
		And user clicks Create Calendar Event button
		And user is able to type a message in to Description field
		Then user sees expected description in calendar event

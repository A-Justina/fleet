@B33G10-64
Feature: Calendar functionality

	User story: As a user, I want to type into the “Description” when I create a calendar event.

	Background: User is already in the log in page
		Given the user is on the login page
		Given the user logged in with username as "storemanager51" and password as "UserUser123"


	Scenario: Verify that the user can type in the calendar description field
		Given user is on the main page
		    When user hovers over Activities and clicks Calendar Events button
		    And user clicks Create Calendar Event button
		    And user is able to type a message in to Description field
		    Then user sees expected description in calendar event
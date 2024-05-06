@B33G10-65
Feature: Default

	
	@B33G10-64
	Scenario: As a user, I want to type into the “Description” when I create a calendar event.
		Given user is logged in the home page
		    When user click on Activities and chooses Calender Events
		    And user clicks Create Calendar Event button
		    Then user is able to type a message in to Description field
		    Then user sees expected description in calendar event

	#@B33G10-66
		Feature: Users should be able to login
		
			Background: User is already in the log in page
				Given the user is on the login page
		

	
	@B33G10-64
	Scenario: As a user, I want to type into the “Description” when I create a calendar event.
		Given user is on the Calender Events
		    When user clicks Create Calendar Event button
		    And user is able to type a message in to Description field
		    Then user sees expected description in calendar event
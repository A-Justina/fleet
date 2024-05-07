@pinbar
Feature: Pinbar functionality

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario: As a user I should be able to learn how to use the pinbar

    When user clicks the learn how to use this page button
    Then user should see image from source "/bundles/oronavigation/images/pinbar-location.jpg"


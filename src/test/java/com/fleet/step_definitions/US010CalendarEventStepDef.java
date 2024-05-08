package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.CalendarPage;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class US010CalendarEventStepDef extends BasePage {

    CalendarPage calendarPage = new CalendarPage();

    @Given("user is on the Calender Events")
    public void userIsOnTheCalenderEvents() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(activitiesBtn).perform();
        calendarPage.calendarEventsBtn.click();
    }

    @When("user clicks Create Calendar Event button")
    public void userClicksCreateCalendarEventButton() {
        calendarPage.createEventBtn.click();

    }

    @And("user is able to type a message in to Description field")
    public void userIsAbleToTypeAMessageInToDescriptionField() {
    }

    @Then("user sees expected description in calendar event")
    public void userSeesExpectedDescriptionInCalendarEvent() {
    }
}

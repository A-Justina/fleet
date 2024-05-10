package com.fleet.step_definitions;

import com.fleet.pages.CalendarPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US010CalendarEventStepDef {

    CalendarPage calendarPage = new CalendarPage();

    @When("user hovers over Activities and clicks Calendar Events button")
    public void user_hovers_over_activities_and_clicks_calendar_events_button() {
        calendarPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.hover(calendarPage.activitiesBtnManager);
        calendarPage.calendarEventsManager.click();
        BrowserUtils.sleep(3);
    }
    @When("user clicks Create Calendar Event button")
    public void user_clicks_create_calendar_event_button() {
        calendarPage.createEventBtn.click();
        BrowserUtils.sleep(3);

    }
    @When("user is able to type a message in to Description field")
    public void user_is_able_to_type_a_message_in_to_description_field() {
        Driver.getDriver().switchTo().frame(calendarPage.iframe);
        calendarPage.calendarDescriptionInput.sendKeys("Scrum daily meeting");

    }
    @Then("user sees expected description in calendar event")
    public void user_sees_expected_description_in_calendar_event() {
        Assert.assertEquals(calendarPage.descriptionConfirmation.getText(), "Scrum daily meeting");
    }

    @When("driver hovers over Activities and clicks Calendar Events button")
    public void driverHoversOverActivitiesAndClicksCalendarEventsButton() {
        calendarPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.hover(calendarPage.activitiesBtnDriver);
        calendarPage.calendarEventsDriver.click();
        BrowserUtils.sleep(3);

    }
}

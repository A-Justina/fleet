package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.CalendarPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US010CalendarEventStepDef extends BasePage{

    CalendarPage calendarPage = new CalendarPage();

    @Given("user is on the main page")
    public void userIsOnTheCalenderEvents() {
        waitUntilLoaderScreenDisappear();
    }

    @When("user hovers over Activities and clicks Calendar Events button")
    public void userHoversOverActivitiesAndClicksCalendarEventsButton() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(activitiesBtnManager);
        actions.moveToElement(calendarPage.calendarEventsManager);
        actions.click().build().perform();

    }
    @And("user clicks Create Calendar Event button")
    public void userClicksCreateCalendarEventButton() {
        calendarPage.createEventBtn.click();
    }

    @And("user is able to type a message in to Description field")
    public void userIsAbleToTypeAMessageInToDescriptionField() {
        Driver.getDriver().switchTo().frame(calendarPage.iframe);
        calendarPage.calendarDescriptionInput.sendKeys("Scrum daily meeting");
    }

    @Then("user sees expected description in calendar event")
    public void userSeesExpectedDescriptionInCalendarEvent() {
        String actualDescription = calendarPage.descriptionConfirmation.getText();
        String expectedDescription = "Scrum daily meeting";
        Assert.assertEquals(expectedDescription, actualDescription);
    }

}

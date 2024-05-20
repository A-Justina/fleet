package com.fleet.step_definitions;

import com.fleet.pages.CalendarErrorMessagesPage;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class CalendarErrorMessageStepDefs {

    CalendarErrorMessagesPage calendarErrorMessagesPage = new CalendarErrorMessagesPage();

    @When("user clicks on Repeat button")
    public void user_clicks_on_repeat_button() {

        BrowserUtils.waitFor(4);

     //   BrowserUtils.selectCheckBox(calendarErrorMessagesPage.repeatBtn, !calendarErrorMessagesPage.repeatBtn.isSelected());

        calendarErrorMessagesPage.repeatBtn.click();

    }


    @Then("verify that users see error messages when enter {int}")
    public void verify_that_users_see_error_messages_when_enter(Integer invalidInput) {


        calendarErrorMessagesPage.inputBox.clear();

        BrowserUtils.waitFor(1);


        calendarErrorMessagesPage.inputBox.sendKeys("" + invalidInput);


        if (invalidInput >= 1 && invalidInput <= 99) {
            if (invalidInput < 1) {

                String expectedError = "The value have not to be less than 1.";
                String actualError = calendarErrorMessagesPage.lessThanOneError.getText();

                Assert.assertTrue(expectedError.equals(actualError));
            } else {

                String expectedError = "The value have not to be more than 99.";
                String actualError = calendarErrorMessagesPage.moreThanNinetyNineError.getText();

                Assert.assertTrue(expectedError.equals(actualError));

            }
        }



    }




}




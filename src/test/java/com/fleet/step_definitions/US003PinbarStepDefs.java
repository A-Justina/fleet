package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.LoginPage;
import com.fleet.pages.PinbarHelpPage;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US003PinbarStepDefs {


    PinbarHelpPage pinbarHelpPage = new PinbarHelpPage();


    @When("user clicks the learn how to use this page button")
    public void user_clicks_the_learn_how_to_use_this_page_button() {

        pinbarHelpPage.learnHowToUseThisSpace.click();

    }


    @Then("user should see image from source {string}")
    public void userShouldSeeImageFromSource(String expectedSrc) {
        String actual = pinbarHelpPage.helpImage.getAttribute("src");
        String expected = expectedSrc;

        Assert.assertEquals(expected, actual);

    }
}

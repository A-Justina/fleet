package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US002_HelpAccessStepDef extends BasePage {


    @When("the user clicks on question mark symbol")
    public void the_user_clicks_on_question_mark_symbol() {
        waitUntilLoaderScreenDisappear();
        String mainHandle = Driver.getDriver().getWindowHandle();
        helpButton.click();
    }

    @Then("the user should be redirected to the Oroinc Documentation page")
    public void the_user_should_be_redirected_to_the_oroinc_documentation_page() {
        BrowserUtils.switchToWindow("Welcome to Oro Documentation");
        String expectedUrl = "https://doc.oroinc.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();


        BrowserUtils.verifyURLContains(expectedUrl);

    }

}

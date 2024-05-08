package com.fleet.step_definitions;

import com.fleet.pages.MarketingPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US014_MarketingPageStepDef {

    MarketingPage marketingPage= new MarketingPage();


    @When("user click on the marketing button")
    public void user_click_on_the_marketing_button() {

        BrowserUtils.sleep(5);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(marketingPage.marketingDropdown).perform();


    }
    @When("click on campaigns")
    public void click_on_campaigns() {
        marketingPage.campaignButton.click();


    }
    @When("user click on the Manage Filters")
    public void user_click_on_the_manage_filters() {
        marketingPage.manageFiltersButton.click();

    }
    @Then("user should see all the five boxes are checked by default")
    public void user_should_see_all_the_five_boxes_are_checked_by_default() {

        for (WebElement each : marketingPage.filtersList) {
//            each.isSelected();
            Assert.assertTrue(each.isSelected());

        }


    }

}

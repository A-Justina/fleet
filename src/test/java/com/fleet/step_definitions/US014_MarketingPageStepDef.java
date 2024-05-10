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
import org.openqa.selenium.support.ui.Select;

import javax.imageio.plugins.tiff.BaselineTIFFTagSet;
import java.util.List;

public class US014_MarketingPageStepDef {

    MarketingPage marketingPage= new MarketingPage();

    @When("user hovers over marketing button and click on campaigns")
    public void user_hovers_over_marketing_button_and_click_on_campaigns() {
     marketingPage.waitUntilLoaderScreenDisappear();

     BrowserUtils.sleep(5);
     BrowserUtils.hover(marketingPage.marketingDropdown);


    marketingPage.campaignButton.click();

    }



    @When("user click on the Manage Filters")
    public void user_click_on_the_manage_filters() {

        BrowserUtils.sleep(5);

        marketingPage.filtersBarButton.click();

        BrowserUtils.sleep(3);
        marketingPage.manageFiltersButton.click();

    }

    @Then("user should see all the five boxes are checked by default")
    public void user_should_see_all_the_five_boxes_are_checked_by_default() {

        Select options = new Select(marketingPage.manageFiltersDropDown);
        //Storing all the ACTUAL options into a List of WebElements
        List<WebElement> actualOptions = options.getOptions();

        for (WebElement each : actualOptions) {
            if (each.isSelected()){
                Assert.assertTrue(each.isSelected());

            }


        }

//        for (String each : BrowserUtils.dropdownOptions_as_STRING(marketingPage.manageFiltersDropDown)) {

//        }


    }

    }



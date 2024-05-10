package com.fleet.step_definitions;

import com.fleet.pages.EditVehiclePage;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US006_EditVehicleStepDef {

    EditVehiclePage editVehiclePage = new EditVehiclePage();


    @When("user hovers over {string} option")
    public void user_hovers_over_option(String string) {
        editVehiclePage.waitUntilLoaderScreenDisappear();

        BrowserUtils.sleep(5);

        BrowserUtils.hover(editVehiclePage.fleetBtnManager);
    }
    @When("user clicks on {string} option")
    public void user_clicks_on_option(String string) {


        editVehiclePage.editVehicleManager.click();

        BrowserUtils.sleep(5);

    }
    @When("user hovers over {int} dots")
    public void user_hovers_over_dots(Integer int1) {

        BrowserUtils.sleep(5);

        BrowserUtils.hover(editVehiclePage.threeDots);

    }
    @Then("user should see {string}")
    public void user_should_see(String expected) {


        // EditVehiclePage.getElementsAttributes(editVehiclePage.threeDotsOptions);
//
//        String actualOptions = "";
//        String expectedOptions = "view, edit, delete";


//        for (WebElement each : editVehiclePage.threeDotsOptions) {
//
//            actualOptions += each.getAttribute("title") + ",";
//
//        }




//        Assert.assertEquals(actualOptions, expectedOptions);


        List<WebElement> actualOptions = editVehiclePage.threeDotsOptions;
        String actualOptionsString = "";

        for (WebElement each : actualOptions) {
            actualOptionsString += each.getAttribute("title") + ",";
        }



    //    Assert.assertEquals(actualOptionsString.substring(0, actualOptionsString.length() - 1), expected);

        Assert.assertEquals(actualOptionsString, expected);






    }


    @When("driver hovers over {string} option")
    public void driver_hovers_over_option(String string) {


        editVehiclePage.waitUntilLoaderScreenDisappear();

        BrowserUtils.sleep(5);

        BrowserUtils.hover(editVehiclePage.fleetBtnDriver);
    }
    @When("driver clicks on {string} option")
    public void driver_clicks_on_option(String string) {


        editVehiclePage.editVehicleDriver.click();

        BrowserUtils.sleep(5);
    }




}

package com.fleet.step_definitions;

import com.fleet.pages.VehiclesOdometerPage;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US011_OdometerStepDef {

    VehiclesOdometerPage vehiclesOdometerPage = new VehiclesOdometerPage();


    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        vehiclesOdometerPage.waitUntilLoaderScreenDisappear();
    }
    @When("User is Hover over the Fleet button")
    public void user_is_hover_over_the_fleet_button() {
        BrowserUtils.sleep(5);

        BrowserUtils.hover(vehiclesOdometerPage.fleetBtnManager);


    }
    @When("User clicks the Vehicle Odometer button")
    public void user_clicks_the_vehicle_odometer_button() {
        vehiclesOdometerPage.vehicleOdometerBtnManager.click();

        BrowserUtils.sleep(5);
    }
    @Then("User sees the error message {string}")
    public void user_sees_the_error_message(String string) {
        String expectedErrorMessage ="You do not have permission to perform this action.";
        String actualErrorMessage = vehiclesOdometerPage.driverErrorMessage.getText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }



    @When("User clicks driver Fleet Button")
    public void user_clicks_driver_fleet_button() {
        BrowserUtils.sleep(5);

        BrowserUtils.hover(vehiclesOdometerPage.fleetBtnDriver);
    }
    @When("User clicks driver Vehicle Odometer button")
    public void user_clicks_driver_vehicle_odometer_button() {
        vehiclesOdometerPage.vehicleOdometerBtnDriver.click();

        BrowserUtils.sleep(5);
    }
    @Then("Verify that user sees page as one by default")
    public void verify_that_user_sees_page_as_one_by_default() {
    String expectedPageNumber = "1";
    String actualPageNumber = vehiclesOdometerPage.defaultPageNumber.getText();

    Assert.assertEquals(expectedPageNumber, actualPageNumber);
    }




    @Then("Verify that View Per Page twenty five are by default")
    public void verify_that_view_per_page_twenty_five_are_by_default() {
        String expectedPerPageNumber = "25";
        String actualPerPageNumber = vehiclesOdometerPage.viewPerPageNumber.getText();

        Assert.assertEquals(expectedPerPageNumber, actualPerPageNumber);
    }

}

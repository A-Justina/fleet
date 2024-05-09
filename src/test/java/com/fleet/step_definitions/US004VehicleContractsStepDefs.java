package com.fleet.step_definitions;

import com.fleet.pages.VehicleContractsPage;
import com.fleet.pages.VehicleContractsPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US004VehicleContractsStepDefs {

     VehicleContractsPage vehicleContractsPage = new VehicleContractsPage();

    @When("I click on the Fleet link")
    public void i_click_on_the_fleet_link() {
        vehicleContractsPage.waitUntilLoaderScreenDisappear();


    }

    @When("user navigates to {string} and to {string}")
    public void user_navigates_to_and_to(String fleet, String vehicleContracts) {
        BrowserUtils.sleep(5);

        BrowserUtils.hover(vehicleContractsPage.fleetBtnManager);

        vehicleContractsPage.vehicleContractsBtnManager.click();

        BrowserUtils.sleep(5);



    }
    @When("the user should be able to see url as {string}")
    public void the_user_should_be_able_to_see_url_as(String string) {
        BrowserUtils.verifyURLContains("https://qa1.vytrack.com/entity/Extend_Entity_VehicleContract");

        BrowserUtils.sleep(3);

    }
    @Then("the user should be able to see expected title as {string}")
    public void the_user_should_be_able_to_see_expected_title_as(String string) {
        String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
        String actualTitle = Driver.getDriver().getTitle();
       //BrowserUtils.waitForTitleContains(expectedTitle);
        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @When("driver navigates to {string} and to {string}")
    public void driver_navigates_to_and_to(String string, String string2) {
        BrowserUtils.sleep(5);
        BrowserUtils.hover(vehicleContractsPage.fleetBtnDriver);
        vehicleContractsPage.vehicleContractsBtnDriver.click();
        BrowserUtils.sleep(3);


    }
    @Then("the user should be able to see message as {string}")
    public void the_user_should_be_able_to_see_message_as(String string) {
        String expectedErrorMessage ="You do not have permission to perform this action.";
        String actualErrorMessage = vehicleContractsPage.driverErrorMessage.getText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }


}

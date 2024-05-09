package com.fleet.step_definitions;

import com.fleet.pages.VehicleContractsPage;
import com.fleet.pages.VehicleContractsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US004VehicleContractsStepDefs {

     VehicleContractsPage vehicleContractsPage = new VehicleContractsPage();
    @When("I click on the Fleet link")
    public void i_click_on_the_fleet_link() {
        vehicleContractsPage.fleetBtnManager.click();

    }
    @Then("I should be able to access the Vehicle contract link")
    public void i_should_be_able_to_access_the_vehicle_contract_link() {


    }
    @Then("I should be able to access the Vehicle contract page")
    public void i_should_be_able_to_access_the_vehicle_contract_page() {

    }
}

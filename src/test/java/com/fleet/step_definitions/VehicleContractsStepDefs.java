package com.fleet.step_definitions;

import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class VehicleContractsStepDefs {

    @When("I click on the Fleet link")
    public void i_click_on_the_fleet_link() {
        BrowserUtils.clickWithTimeOut(Driver.getDriver().findElement(By.linkText("Fleet")), 10);


    }
    @Then("I should be able to access the Vehicle contract link and click on it")
    public void i_should_be_able_to_access_the_vehicle_contract_link_and_click_on_it() {
        



    }
    @Then("I should be able to access the Vehicle contract page")
    public void i_should_be_able_to_access_the_vehicle_contract_page() {

    }

}

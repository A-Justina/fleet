package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.LoginPage;
import com.fleet.pages.VehiclesPage;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US007_VehicleStepDefs extends BasePage {

    VehiclesPage vehiclesPage = new VehiclesPage();


    @When("the user clicks the Vehicles page")
    public void the_user_clicks_the_vehicles_page() {
        vehiclesPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.hover(vehiclesPage.fleetBtnManager);
        vehiclesPage.vehiclesBtn.click();
    }

    @Then("the user can see all the checkboxes are unchecked by default")
    public void the_user_can_see_all_the_checkboxes_are_unchecked_by_default() {

        for (WebElement checkbox : vehiclesPage.allCheckboxes) {
            Assert.assertFalse(checkbox.isSelected());
        }

    }

    @When("the user selects the first checkbox")
    public void theUserSelectsTheFirstCheckbox() {
        vehiclesPage.checkAll.click();
    }

    @Then("all of the checkboxes become selected")
    public void allOfTheCheckboxesBecomeSelected() {
        for (WebElement checkbox : vehiclesPage.allCheckboxes) {
            Assert.assertTrue(checkbox.isSelected());
        }
    }

    @When("the user selects any checkbox")
    public void theUserSelectsAnyCheckbox() {
        //create a loop that individually selects each checkbox and verify that it is selected
        for (WebElement checkbox : vehiclesPage.allCheckboxes) {
            checkbox.click();
            Assert.assertTrue(checkbox.isSelected());
        }

    }

  //  @Then("the corresponding vehicle is selected")
  //  public void theCorrespondingVehicleIsSelected() {
  //  }
}

package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.VehicleCostPage;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US013_VehicleCostStepDef {
VehicleCostPage vehicleCostPage = new VehicleCostPage();


    @And("User clicks on {string} option.")
    public void userClicksOnOption(String arg0) {
        BrowserUtils.sleep(5);
        BrowserUtils.hover(vehicleCostPage.vehicleCostBtn);
        BrowserUtils.sleep(5);
        vehicleCostPage.vehicleCostBtn.click();
        //Here I'm hover the fleet option, and then it finds vehicle cost btn and click on it.
    }

    @Then("User should see {string}.")
    public void userShouldSee(String str, List<String> expected) {
        List<String> expectedColumns = new ArrayList<>(expected);



        BrowserUtils.sleep(5);
        List<String> actualColumns = new ArrayList<>();
        for (String each : BrowserUtils.getElementsText(vehicleCostPage.vehicleCostColumn)) {
            if (each.isEmpty()) {
                continue;
            }
            actualColumns.add(each);
        }
        BrowserUtils.sleep(5);
        Assert.assertTrue(actualColumns.contains(expectedColumns));
    }


    @Then("User should be able to check the first checkbox to select all vehicle costs.")
    public void user_should_be_able_to_check_the_first_checkbox_to_select_all_vehicle_costs() {
        vehicleCostPage.checkboxBtn.click();
        Assert.assertTrue(vehicleCostPage.checkboxBtn.isSelected());

    }

}

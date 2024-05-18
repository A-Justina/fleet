package com.fleet.step_definitions;

import com.fleet.pages.VehicleCostPage;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US013_VehicleCostStepDef {
VehicleCostPage vehicleCostPage = new VehicleCostPage();


    @When("User clicks on {string} option")
    public void user_clicks_on_option(String string) {
        BrowserUtils.hover(vehicleCostPage.VehicleCostBtn);
        vehicleCostPage.VehicleCostBtn.click();

    }
    @Then("User should see {string}")
    public void user_should_see(List<String> expectedColumns) {
        ArrayList <String> expected = new ArrayList<>(expectedColumns);
        ArrayList <String> actualColumns = (ArrayList<String>) BrowserUtils.getElementsText((List<WebElement>) vehicleCostPage.VehicleCostColumn);
        ArrayList <String> actual = new ArrayList<>();
        for (String each: actualColumns){
            if (each.isEmpty()){
                continue;
            }
            actual.add(each);
        }
        Assert.assertEquals(expected,actual);


    }

    @Given("The user logged in as {string}")
    public void the_user_logged_in_as(String string) {

    }
    @When("User hovers {string} option")
    public void user_hovers_option(String string) {

    }

    @Then("User should be able to check the first checkbox to select all vehicle costs.")
    public void user_should_be_able_to_check_the_first_checkbox_to_select_all_vehicle_costs() {

    }


}

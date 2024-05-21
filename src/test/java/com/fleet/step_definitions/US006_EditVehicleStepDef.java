package com.fleet.step_definitions;

import com.fleet.pages.EditVehiclePage;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class US006_EditVehicleStepDef {

    EditVehiclePage editVehiclePage = new EditVehiclePage();


    @When("user hovers over {string} option")
    public void user_hovers_over_option(String userType) {
        editVehiclePage.waitUntilLoaderScreenDisappear();


        if(userType.equalsIgnoreCase("driver")){
            BrowserUtils.hover(editVehiclePage.fleetBtnDriver);
        }

        BrowserUtils.hover(editVehiclePage.fleetBtnManager);
    }
    @When("user clicks on {string} option")
    public void user_clicks_on_option(String userType) {

        if(userType.equalsIgnoreCase("driver")){
            editVehiclePage.editVehicleDriver.click();
        }


        editVehiclePage.editVehicleManager.click();


    }
    @When("user hovers over {int} dots")
    public void user_hovers_over_dots(Integer int1) {


        BrowserUtils.hover(editVehiclePage.threeDots);

    }


    @Then("user should see {string}")
    public void user_should_see(String str, List<String> expectedOpt) {



      List<String> actualOptions = new ArrayList<>();


     actualOptions.add(editVehiclePage.view.getAttribute("title"));
     actualOptions.add(editVehiclePage.edit.getAttribute("title"));
     actualOptions.add(editVehiclePage.delete.getAttribute("title"));



        Assert.assertEquals(expectedOpt,actualOptions);

    }



}

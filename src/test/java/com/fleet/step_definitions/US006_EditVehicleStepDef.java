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

        BrowserUtils.sleep(5);

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

        BrowserUtils.sleep(5);

    }
    @When("user hovers over {int} dots")
    public void user_hovers_over_dots(Integer int1) {

        BrowserUtils.sleep(5);

        BrowserUtils.hover(editVehiclePage.threeDots);

    }


    @Then("user should see {string}")
    public void user_should_see(String str, List<String> expectedOpt) {

       // List<String> expectedOptions = new ArrayList<>(expectedOpt);

        List<String> expectedOptions = new ArrayList<>();

        for (String opt : expectedOpt) {
            expectedOptions.add(opt);
        }

       // BrowserUtils.waitFor(4);

        BrowserUtils.sleep(5);


      List<String> actual =  (ArrayList<String>) editVehiclePage.getElementsAttributes(editVehiclePage.threeDotsOptions);

      List<String> actualOptions = new ArrayList<>();

        for (String each : actual) {
            if (each.isEmpty()){
                continue;
            }
            actualOptions.add(each);
        }
     //   List<String> actualOptions = BrowserUtils.getElementsText(editVehiclePage.threeDotsOptions);
        System.out.println(actualOptions);

        Assert.assertEquals(expectedOptions, actualOptions);
        BrowserUtils.waitFor(2);
        System.out.println("iconOptions = " + expectedOptions);
        System.out.println("actualOptions = " + actualOptions);
    }



}

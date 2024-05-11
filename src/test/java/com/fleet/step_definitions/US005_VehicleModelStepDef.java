package com.fleet.step_definitions;

import com.fleet.pages.VehicleModelPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US005_VehicleModelStepDef {

    VehicleModelPage vehicleModelPage = new VehicleModelPage();

    @When("user hovers over Fleet and clicks Vehicles button")
    public void user_hovers_over_fleet_and_clicks_vehicles_button() {
        vehicleModelPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.sleep(6);

        BrowserUtils.hover(vehicleModelPage.fleetBtnManager);

         BrowserUtils.sleep(6);
        vehicleModelPage.vehicleModelBtnManager.click();

        BrowserUtils.sleep(6);


    }
    @Then("user sees ten columns of {string} page")
    public void user_sees_ten_columns_of_page(String string, List<String> expectedColumns) {
        //BrowserUtils.getElementsText(vehicleModelPage.vehicleModelColumn);
      //String actualColumns = "";
        //for (String each : BrowserUtils.getElementsText(vehicleModelPage.vehicleModelColumn)) {
            //actualColumns += each;
       // }
        //BrowserUtils.sleep(5);
        //Assert.assertEquals(actualColumns,expectedColumns);

        //for (String each : BrowserUtils.dropdownOptions_as_STRING(vehicleModelPage.vehicleModelColumn)) {
            //actualColumns += each;

           // List<String> actualColumns_as_WEBELEMENT = BrowserUtils.getElementsText(vehicleModelPage.vehicleModelColumn);
        //List<String> actualColumns_as_STRING = new ArrayList<>();

        //for (String each : actualColumns_as_WEBELEMENT) {
            //actualColumns_as_STRING.add(each);
        //}

        //}

        //Assert.assertEquals(actualColumns_as_STRING,expectedColumns);

        BrowserUtils.getElementsText(vehicleModelPage.vehicleModelColumn);
        List<String> actualColumns = BrowserUtils.getElementsText(vehicleModelPage.vehicleModelColumn);

        BrowserUtils.sleep(10);

        Assert.assertEquals(expectedColumns,actualColumns);

        //Assert.assertTrue(expectedColumns.equals(actualColumns));

    }

    @When("user hovers over Fleet and clicks Vehicle Model button")
    public void user_hovers_over_fleet_and_clicks_vehicle_model_button() {

        vehicleModelPage.waitUntilLoaderScreenDisappear();
       // BrowserUtils.sleep(6);



        //BrowserUtils.hover(vehicleModelPage.fleetBtnDriver);

        //BrowserUtils.sleep(6);
        vehicleModelPage.vehicleModelBtnDriver.click();
        //Actions actions = new Actions(driver);
        //actions.moveToElement(vehicleModelPage.fleetBtnManager).perform();
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(25));
        wait.until(ExpectedConditions.elementToBeClickable(vehicleModelPage.vehicleModelBtnManager));
        vehicleModelPage.vehicleModelBtnDriver.click();



       // BrowserUtils.sleep(6);

    }

    @Then("user sees {string} message on the screen")
    public void user_sees_message_on_the_screen(String string) {

        String expectedErrorMessage ="You do not have permission to perform this action.";
        String actualErrorMessage = vehicleModelPage.driverErrorMessage.getText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

}

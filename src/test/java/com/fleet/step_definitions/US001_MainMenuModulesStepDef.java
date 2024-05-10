package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class US001_MainMenuModulesStepDef extends BasePage {

    @Then("the user see {string}")
    public void the_user_see(String string, List<String> expectedModulesManager) {
        waitUntilLoaderScreenDisappear();

        BrowserUtils.sleep(3);
        List<String> actualModulesManager = BrowserUtils.getElementsText(menuOptions);
        Assert.assertTrue(expectedModulesManager.equals(actualModulesManager));
    }

    @Then("the user sees {string}")
    public void the_user_sees(String string, List<String> expectedModulesDriver) {
        waitUntilLoaderScreenDisappear();

        BrowserUtils.sleep(3);
        List<String> actualModulesDriver = BrowserUtils.getElementsText(menuOptions);
        Assert.assertTrue(expectedModulesDriver.equals(actualModulesDriver));

    }

}

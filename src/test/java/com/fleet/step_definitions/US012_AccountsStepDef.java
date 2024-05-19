package com.fleet.step_definitions;

import com.fleet.pages.AccountsPage;
import com.fleet.pages.BasePage;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class US012_AccountsStepDef extends BasePage {

    AccountsPage accountsPage = new AccountsPage();

    @When("user hovers over {string} option.")
    public void user_hovers_over_option(String string) {
        accountsPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.hover(accountsPage.customerTab);
    }
    @When("user clicks on {string} option.")
    public void user_clicks_on_option(String string) {
        accountsPage.accountBtn.click();
    }

    @And("user clicks filter button.")
    public void userClicksFilterButton() {
        accountsPage.filterBtn.click();
    }
    @Then("user should see {string}.")
    public void user_should_see(List<String> expectedFilterList) {
        List<String> actual = accountsPage.filterRow
    }
}

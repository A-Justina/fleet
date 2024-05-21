package com.fleet.step_definitions;

import com.fleet.pages.AccountsPage;
import com.fleet.pages.BasePage;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
        BrowserUtils.sleep(4);
        accountsPage.accountBtn.click();
    }

    @And("user clicks filter button.")
    public void userClicksFilterButton() {
        BrowserUtils.sleep(4);
        accountsPage.filterBtn.click();
    }
    @Then("user should see {string}.")
    public void user_should_see(String str, List<String> expected) {
        List<String> expectedFilters = new ArrayList<>(expected);

        List<String> listOfFilters = BrowserUtils.getElementsText(accountsPage.filterRow);
       List <String> actualFilters = new ArrayList<>();
        for (String each : listOfFilters) {
            if(each.isEmpty()){
                continue;
            }
            actualFilters.add(each);
        }

       Assert.assertEquals(expectedFilters, actualFilters);



        }



    //btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value

        /*List<WebElement> sportsRadioButtons = driver.findElements(By.xpath("//input[@name='sport']"));

        for (WebElement each : sportsRadioButtons) {

            String actualId = each.getAttribute("id");
            System.out.println("actualId = " + actualId);

            //finding hockey and clicking it
            if(actualId.equalsIgnoreCase("hockey")){
                each.click();
                System.out.println(actualId +" isSelected() = " + each.isSelected());
                break;
            }
        } */
    }


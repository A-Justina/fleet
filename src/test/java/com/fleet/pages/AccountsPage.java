package com.fleet.pages;

import com.fleet.utilities.Driver;
import io.cucumber.java.bs.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v121.fedcm.model.Account;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountsPage extends BasePage {

    public AccountsPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//span[@class='filter-items']")
    public List<WebElement> filterRow;

    @FindBy (xpath = "//i[@class='fa-filter hide-text']")
    public WebElement filterBtn;
}

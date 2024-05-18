package com.fleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountsPage {

    @FindBy (xpath ="(//a[@href='/account'])[3]/span")
    public WebElement accountsBttn;

}

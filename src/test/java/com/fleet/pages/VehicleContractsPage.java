package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleContractsPage extends BasePage {



    public VehicleContractsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/a/span")
    public WebElement fleetBtnManager;

    @FindBy(xpath = "//*[@class=\"dropdown-menu-wrapper dropdown-menu-wrapper__scrollable\"]")
    public WebElement vehicleContractBtn;



}

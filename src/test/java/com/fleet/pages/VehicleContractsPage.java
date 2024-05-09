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

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[6]/a/span")
    public WebElement vehicleContractsBtnManager;

    @FindBy (xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement driverErrorMessage;

    @FindBy (xpath = "//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[6]/a/span")
    public WebElement vehicleContractsBtnDriver;


}

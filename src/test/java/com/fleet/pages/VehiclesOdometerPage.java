package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesOdometerPage extends BasePage {


    public VehiclesOdometerPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//div[@id='main-menu']/ul/li[2]//div/ul/li//span)[4]")
    public WebElement vehicleOdometerBtnManager;

    @FindBy(xpath = "//*[@id='main-menu']/ul/li[1]/div/div/ul/li[4]/a/span")
    public WebElement vehicleOdometerBtnDriver;

    @FindBy (xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement driverErrorMessage;

    @FindBy(xpath = "//input[@value='1']")
    public WebElement defaultPageNumber;

    @FindBy(xpath = "(//button[@data-toggle='dropdown'])[1]")
    public WebElement viewPerPageNumber;

}

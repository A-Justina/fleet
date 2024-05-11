package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehicleModelPage extends BasePage {

    @FindBy(xpath = "(//div[@id='main-menu']/ul/li[2]//div/ul/li//span)[9]")
    public WebElement vehicleModelBtnManager;

    @FindBy(xpath = "/html/body/div[2]/div[2]/header/div[2]/ul/li[1]/div/div/ul/li[9]/a/span")
    public WebElement vehicleModelBtnDriver;

    @FindBy(xpath = "//div[@class='grid-container']//table/thead")
    public List<WebElement> vehicleModelColumn;
    @FindBy (xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement driverErrorMessage;


}

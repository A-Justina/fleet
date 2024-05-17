package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleCostPage extends BasePage{

    public VehicleCostPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//a[@href='/entity/Extend_Entity_VehicleCosts']/span")
    public WebElement VehicleCostBtn;

    @FindBy (className = "grid-header-cell__link")
    public  WebElement VehicleCostColumn;


}

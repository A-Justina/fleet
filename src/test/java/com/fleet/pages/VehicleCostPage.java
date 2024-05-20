package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class VehicleCostPage extends BasePage{

    public VehicleCostPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    // This locator will find the vehicle cost Btn and is assigned to a web element called VehicleCostBtn.
    @FindBy (xpath = "//a[@href='/entity/Extend_Entity_VehicleCosts']/span")
    public WebElement vehicleCostBtn;


    @FindBy (xpath = "//thead[@class='grid-header']//th//a[@class='grid-header-cell__link']")
    public  List<WebElement> vehicleCostColumn;
    // This locator will find the TYPE, TOTAL PRICE AND DATE buttons,also being able to search three of them by index
    // assigned to a web element called VehicleCostColumns.




    // This finder will find out the checkbox web element
    @FindBy (xpath = "//button[@class='btn btn-default btn-small dropdown-toggle']/input")
    public WebElement checkboxBtn;





}

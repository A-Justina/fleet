package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class VehicleContracts {

    public VehicleContracts(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


}

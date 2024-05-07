package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public final class PinbarHelpPage extends BasePage {


    public PinbarHelpPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(tagName = "img")
    public WebElement helpImage;

}

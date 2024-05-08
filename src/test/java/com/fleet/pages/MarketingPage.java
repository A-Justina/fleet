package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class  MarketingPage extends BasePage {

    public MarketingPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "(//a[@href='javascript:void(0);'])[2]")
    public WebElement manageFiltersButton;


    @FindBy(xpath = "//ul[@class='ui-helper-reset']")
    public List <WebElement> filtersList;


}

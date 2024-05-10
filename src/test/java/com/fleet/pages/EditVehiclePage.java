package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class EditVehiclePage extends BasePage{



    @FindBy(xpath = "(//div[@id='main-menu']/ul/li[2]//div/ul/li//span)[3]")
    public WebElement editVehicleManager;


    @FindBy(xpath = "//div[@id='main-menu']/ul/li/div[1]")
    public WebElement editVehicleDriver;


    @FindBy(xpath = "(//div[@class='dropdown'])[1]")
    public WebElement threeDots;


    // @FindBy(xpath = "(//div[@class='dropdown'])[1]")

    @FindBy(xpath = "(//div[@class='dropdown'])[1]/ul/li/ul/li")

    public List<WebElement> threeDotsOptions;




    public static List<String> getElementsAttributes(List<WebElement> list) {
        List<String> elemAtt = new ArrayList<>();
        for (WebElement el : list) {
            elemAtt.add(el.getAttribute("title"));
        }
        return elemAtt;
    }



    @FindBy(xpath = "(//a[@title='View'])[1]")
    public WebElement view;


    @FindBy(xpath = "(//a[@title='Edit'])[1]")
    public WebElement edit;


    @FindBy(xpath = "(//a[@title='Delete'])[1]")
    public WebElement delete;







}

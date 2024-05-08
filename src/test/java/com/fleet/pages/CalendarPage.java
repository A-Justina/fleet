package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {

    public CalendarPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//span[text()='Calendar Events']")
    public WebElement calendarEventsBtn;

    @FindBy(xpath = "//a[contains(@title, 'Create Calendar')]")
    public WebElement createEventBtn;


}

package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage extends BasePage{

//    public CalendarPage() {
//        PageFactory.initElements(Driver.getDriver(), this);
//    }


    @FindBy(xpath = "//a[contains(@title, 'Create Calendar')]")
//    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div/div/div[2]/div/a")
    public WebElement createEventBtn;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[5]/div/div/ul/li[4]/a/span")
    public WebElement calendarEventsManager;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[3]/div/div/ul/li[3]/a/span")
    public WebElement calendarEventsDriver;

    @FindBy(name = "oro_calendar_event_form[title]")
    public WebElement calendarEventTitle;

    @FindBy(xpath = "//iframe[contains(@id, 'oro_calendar_event_form_description')]")
    public WebElement iframe;

    @FindBy(id = "tinymce")
    public WebElement calendarDescriptionInput;

    @FindBy(xpath = "//*[@id=\"tinymce\"]/p")
    public WebElement descriptionConfirmation;


    

}

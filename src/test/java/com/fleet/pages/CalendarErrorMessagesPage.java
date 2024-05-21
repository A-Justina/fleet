package com.fleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarErrorMessagesPage extends BasePage{


    @FindBy(xpath = "(//div//input[@type='checkbox'])[2]")
    public WebElement repeatBtn;

    @FindBy(xpath = "(//input[@type='text'])[10]")
    public WebElement inputBox;

    @FindBy(xpath = "//span[text()='The value have not to be less than 1.']")
    public WebElement lessThanOneError;


    @FindBy(xpath = "//span[text()='The value have not to be more than 99.']")
    public WebElement moreThanNinetyNineError;


    @FindBy(xpath = "//span[text()='Please enter a valid number.']")
    public WebElement invalidInput;



}

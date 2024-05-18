package com.fleet.pages;

import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.cert.X509Certificate;
import java.time.Duration;
import java.util.List;

public abstract class BasePage {

    @FindBy(css = "span.title-level-1")
    public List<WebElement> menuOptions;

    @FindBy(css = "div[class='loader-mask shown']")
    @CacheLookup
    protected WebElement loaderMask;

    @FindBy(css = "h1[class='oro-subtitle']")
    public WebElement pageSubTitle;

    @FindBy(css = "#user-menu > a")
    public WebElement userName;

    @FindBy(linkText = "Logout")
    public WebElement logOutLink;

    @FindBy(linkText = "My User")
    public WebElement myUser;

//    @FindBy (xpath = "(//li//a[@href='#']//span[@class='title title-level-1'])[6]")
    @FindBy(xpath = "(//li//a[@href='#']//span)[6]")
    public  WebElement marketingDropdown;

//    @FindBy(xpath = "//a[@href='/campaign/']")
    @FindBy(xpath = "(//div/div/ul//li//a[@href='/campaign/'])[3]")
    public WebElement campaignButton;

    @FindBy(linkText = "Learn how to use this space")
    public WebElement learnHowToUseThisSpace;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[3]/a/span")
    public WebElement activitiesBtnDriver;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[5]/a/span")
    public WebElement activitiesBtnManager;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/a/span")
    public WebElement fleetBtnManager; // this is for storeManager

    @FindBy(xpath = "(//div[@id='main-menu']/ul/li[@class='dropdown dropdown-level-1'])[1]")
    public WebElement fleetBtnDriver;

    @FindBy(xpath = "//i[@class='fa-question-circle']")
    public WebElement helpButton;

    @FindBy (xpath = "/html/body/div[2]/div[2]/header/div[2]/ul/li[3]/a/span")
    public WebElement customerTab;

    @FindBy (xpath = "/html/body/div[2]/div[2]/header/div[2]/ul/li[3]/div/div/ul/li[3]/a/span")
    public WebElement accountBtn;

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /**
     * @return page name, for example: Dashboard
     */
    public String getPageSubTitle() {
        //ant time we are verifying page name, or page subtitle, loader mask appears
        waitUntilLoaderScreenDisappear();
//        BrowserUtils.waitForStaleElement(pageSubTitle);
        return pageSubTitle.getText();
    }

    /**
     * Waits until loader screen present. If loader screen will not pop up at all,
     * NoSuchElementException will be handled  bu try/catch block
     * Thus, we can continue in any case.
     */
    public void waitUntilLoaderScreenDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * This method will navigate user to the specific module in vytrack application.
     * For example: if tab is equals to Activities, and module equals to Calls,
     * Then method will navigate user to this page: http://qa2.vytrack.com/call/
     *
     * @param tab
     * @param module
     */
    public void navigateToModule(String tab, String module) {
        String tabLocator = "//span[normalize-space()='" + tab + "' and contains(@class, 'title title-level-1')]";
        String moduleLocator = "//span[normalize-space()='" + module + "' and contains(@class, 'title title-level-2')]";
        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.getDriver().findElement(By.xpath(tabLocator));
            new Actions(Driver.getDriver()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
            BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath(moduleLocator)));
            Driver.getDriver().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
//            BrowserUtils.waitForStaleElement(Driver.get().findElement(By.xpath(moduleLocator)));
            BrowserUtils.clickWithTimeOut(Driver.getDriver().findElement(By.xpath(moduleLocator)),  5);
        }
    }
}

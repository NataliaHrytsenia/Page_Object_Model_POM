package org.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{


    public HomePage(WebDriver driver) {// constructor
        super(driver);
    }

    @FindBy(css = ".top-card:nth-child(6)")
    WebElement bookStore;

    public SidePanel getBookStore() {
        clickWithJSExecutor(bookStore, 0, 300);
        return new SidePanel(driver);
    }
    @FindBy(css = ".top-card:nth-child(1)")
    WebElement elements;
    public SidePanel getElements() {
        clickWithJSExecutor(elements, 0, 200);
        return new SidePanel(driver);
    }

    @FindBy(css = ".top-card:nth-child(3)")
    WebElement alertFramesWindows;

    public SidePanel getAlertsFramesWindows() {
        clickWithJSExecutor(alertFramesWindows,0, 300);
        return new SidePanel(driver);

    }

    @FindBy(css = ".top-card:nth-child(4)")
    WebElement widgets;

    public SidePanel getWidgets() {
        clickWithJSExecutor(widgets,0,200);
        return new SidePanel(driver);
    }

    @FindBy(css = ".top-card:nth-child(2)")
    WebElement forms;
    public SidePanel getForms() {
        clickWithJSExecutor(forms,0,200);
        return new SidePanel(driver);
    }
}

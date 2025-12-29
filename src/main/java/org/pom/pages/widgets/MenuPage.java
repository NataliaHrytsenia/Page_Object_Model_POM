package org.pom.pages.widgets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.pom.pages.BasePage;
import org.testng.Assert;

public class MenuPage extends BasePage {

    public MenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[.='Main Item 2']")
    WebElement mainItem2;

    @FindBy (xpath = "//a[.='SUB SUB LIST »']")
    WebElement subSubList;

    public MenuPage selectSubMenu() {
        new Actions(driver).moveToElement(mainItem2).perform();
        return this;
    }

    public MenuPage assertSubMenu() {
        Assert.assertTrue(subSubList.isDisplayed());
        return this;
    }
}

package org.pom.pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.pom.pages.BasePage;
import org.testng.Assert;

public class ButtonsPage extends BasePage {
    public ButtonsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "doubleClickBtn")
    WebElement doubleClickBtn;

    @FindBy (id = "doubleClickMessage")
    WebElement doubleClickMessage;

    public ButtonsPage doubleClick() {//двойной клик
        pause(500);
        Actions actions = new Actions(driver); //actions это рука человека
        actions.doubleClick(doubleClickBtn).perform();//perform сделай это прямо сейчас
        return this;
    }

    public ButtonsPage assertDoubleClick(String message) {
        Assert.assertTrue(shouldHaveText(doubleClickMessage, message,5));
        return this;
    }


    @FindBy (id = "rightClickBtn")
    WebElement rightClickBtn;

    @FindBy (id = "rightClickMessage")
    WebElement rightClickMessage;

    public ButtonsPage rightClick() {
        pause(300);
        new Actions(driver).contextClick(rightClickBtn).perform();
        return this;
    }

    public ButtonsPage assertRightClick(String message) {
        Assert.assertTrue(shouldHaveText(rightClickMessage,message,10));
        return this;
    }
}

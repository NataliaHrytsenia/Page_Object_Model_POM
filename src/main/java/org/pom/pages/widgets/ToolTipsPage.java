package org.pom.pages.widgets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.pom.pages.BasePage;
import org.testng.Assert;

public class ToolTipsPage extends BasePage {
    public ToolTipsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "toolTipTextField")
    WebElement toolTipTextField;

    @FindBy(css = "[aria-describedby]")
    WebElement attribute;

    public ToolTipsPage hoverToolTips() {
        pause(1000);
        new Actions(driver).moveToElement(toolTipTextField).perform();
        System.out.println(attribute.getText());
        return this;
    }

}

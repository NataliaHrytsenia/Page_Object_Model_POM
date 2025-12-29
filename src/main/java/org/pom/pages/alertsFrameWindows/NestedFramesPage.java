package org.pom.pages.alertsFrameWindows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pom.pages.BasePage;

import java.util.List;

public class NestedFramesPage extends BasePage {

    public NestedFramesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (tagName = "iframe")
    List<WebElement> iframes;
    @FindBy (tagName = "iframe")
    WebElement frame1;

    @FindBy (tagName = "body")
    WebElement body;
    public NestedFramesPage handleNestedIframes() {
        //return number of frames from main page
        System.out.println("The total numbers of iframes in the main page: " + iframes.size());
        //switch to parent iframe
        driver.switchTo().frame(frame1);
        //number of iframes from parent iframe
        System.out.println("The total numbers of iframes in the parent iframes: " + iframes.size());
        //get the text from parent iframe
        System.out.println("Iframe is " + body.getText());
        //switch to child iframe
        driver.switchTo().frame(0);
        //get the text from parent iframe
        System.out.println("Iframe is " + body.getText());
        //switch to parent iframe
        driver.switchTo().parentFrame();
        //switch to main Page
        driver.switchTo().defaultContent();
        return this;
    }
}

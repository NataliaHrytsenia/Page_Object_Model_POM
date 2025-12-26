package org.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ProfilePage extends BasePage{

    public ProfilePage(WebDriver driver) {//так как в главном классе есть конструктор, то и в дочернем классе нужен конструктор
        super(driver);
    }

    @FindBy(id = "userName-value") //локатор моего UserName
    WebElement user;

    public  ProfilePage verifyUserName(String userName){
        Assert.assertTrue(shouldHaveText(user,userName,10));
        return this;
    }

    public boolean shouldHaveText(WebElement element, String text, int time) {
        return new WebDriverWait(driver, Duration.ofSeconds(time))
                .until(ExpectedConditions.textToBePresentInElement(element,text));
    }

}

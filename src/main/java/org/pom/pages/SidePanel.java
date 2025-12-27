package org.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pom.pages.bookStore.BookStorePage;
import org.pom.pages.bookStore.LoginPage;
import org.pom.pages.bookStore.ProfilePage;
import org.pom.pages.elements.BrokenLinksImagesPage;
import org.pom.pages.elements.LinksPage;

public class SidePanel extends BasePage{

    public SidePanel(WebDriver driver) { //constructor
        super(driver);
    }

    @FindBy(css = ".show #item-0")
    WebElement login;

    public LoginPage selectLogin() {
        clickWithJSExecutor(login,0,600);
        return new LoginPage(driver);
    }

    @FindBy (xpath = "//span[.='Profile']")
    WebElement profile;

    public ProfilePage selectProfile() {
        clickWithJSExecutor(profile,0, 600);
        return new ProfilePage(driver);
    }
    @FindBy (xpath = "//span[.='Links']")
    WebElement links;
    public LinksPage selectLinks() {
        clickWithJSExecutor(links,0,300);
        return new LinksPage(driver);
    }
    @FindBy (xpath = "//span[.='Broken Links - Images']")
    WebElement brokenLinksImages;

    public BrokenLinksImagesPage selectBrokenLinksImages() {
        clickWithJSExecutor(brokenLinksImages,0,300);
        return  new BrokenLinksImagesPage(driver);
    }
}
